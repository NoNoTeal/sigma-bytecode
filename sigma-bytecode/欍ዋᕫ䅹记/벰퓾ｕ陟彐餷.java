public class \u6b0d\u12cb\u156b\u4179\u8bb0.\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<O, S> {
    public void \ubcb0\ud4fe\uff55\u965f\u5f50\u9937(java.util.function.Function<O, S> p0, O p1, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6c56\u6b0d\u927d\u99f7\u4e72\u7049<O, S> p2, java.util.Map<java.lang.String, \u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>> p3) {
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
    
    private static com.mojang.serialization.MapCodec<S> \ua562\ud171\u74b1\u4c04\u9a18\uc31c(com.mojang.serialization.MapCodec<S> p0, java.util.function.Supplier<S> p1, java.lang.String p2, \u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T> p3) {
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
    
    public com.google.common.collect.ImmutableList<S> \u4492\u8d98\uceb8\ubcb0\u6fb0\u183a() {
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
            return:ImmutableList<S>(getfield:ImmutableList<S>(\ubcb0\ud4fe\uff55\u965f\u5f50\u9937::\u8c8a\ub18d\uc84e\uc9f6\u5140\u8aa5, this:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<O, S>))
        }
        
        goto(Label_0006)
    }
    
    public S extends \u3bc9\u67e9\uc87f\u47c2\u5f50.\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S> \u5654\ub83f\u71f1\u7bad\ub1b9\u6b5f() {
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
            return:S extends \uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>(checkcast:\uc31c\u74b1\u8389\u494c\u88c5\u446c[expected:S extends \uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>](\u3bc9\u67e9\uc87f\u47c2\u5f50.\uc31c\u74b1\u8389\u494c\u88c5\u446c.class, invokevirtual:Object[expected:S extends \uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>](ImmutableList::get, getfield:ImmutableList<S>(\ubcb0\ud4fe\uff55\u965f\u5f50\u9937::\u8c8a\ub18d\uc84e\uc9f6\u5140\u8aa5, this:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<O, S>), and:int(ldc:int(5842), ldc:int(-5843)))))
        }
        
        goto(Label_0006)
    }
    
    public O \ub18d\u93a2\u56bd\u12b2\u93a2\u6fb0() {
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
            return:O(getfield:O(\ubcb0\ud4fe\uff55\u965f\u5f50\u9937::\ua562\ub32d\u5140\u446c\ucef1\u8d90, this:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<O, S>))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Collection<\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>> \u3711\u8aa5\u7af6\u4cd9\u9255\uc910() {
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
            return:Collection<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>(invokevirtual:ImmutableCollection[expected:Collection<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>](ImmutableSortedMap::values, getfield:ImmutableSortedMap<String, \u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>(\ubcb0\ud4fe\uff55\u965f\u5f50\u9937::\u946b\u8d98\u97b7\uceb8\u6b5f\u4c2b, this:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<O, S>)))
        }
        
        goto(Label_0006)
    }
    
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
            return:String(invokevirtual:String(MoreObjects$ToStringHelper::toString, invokevirtual:MoreObjects$ToStringHelper(MoreObjects$ToStringHelper::add, invokevirtual:MoreObjects$ToStringHelper(MoreObjects$ToStringHelper::add, invokestatic:MoreObjects$ToStringHelper(MoreObjects::toStringHelper, this:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<O, S>[expected:Object]), loadelement:String(getstatic:String[](\ubcb0\ud4fe\uff55\u965f\u5f50\u9937::\ud158\u97b7\u52d3\u92ee\u52d3\ufcaf), and:int(ldc:int(-26260), ldc:int(25219))), getfield:O[expected:Object](\ubcb0\ud4fe\uff55\u965f\u5f50\u9937::\ua562\ub32d\u5140\u446c\ucef1\u8d90, this:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<O, S>)), loadelement:String(getstatic:String[](\ubcb0\ud4fe\uff55\u965f\u5f50\u9937::\ud158\u97b7\u52d3\u92ee\u52d3\ufcaf), xor:int(ldc:int(2176), ldc:int(2177))), invokeinterface:List<Object>[expected:Object](Stream<Object>::collect, invokeinterface:Stream<Object>(Stream<Object>::map, invokevirtual:Stream(ImmutableCollection::stream, invokevirtual:ImmutableCollection(ImmutableSortedMap::values, getfield:ImmutableSortedMap<String, \u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>(\ubcb0\ud4fe\uff55\u965f\u5f50\u9937::\u946b\u8d98\u97b7\uceb8\u6b5f\u4c2b, this:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<O, S>))), invokedynamic:Function<? super Object, String>(apply:()Ljava/util/function/Function;)), invokestatic:Collector<? super Object, ?, List<? super Object>>(Collectors::toList)))))
        }
        
        goto(Label_0006)
    }
    
    public \u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?> \u8753\u927d\u51b2\ub102\u4ab3\u1833(java.lang.String p0) {
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
            return:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>(checkcast:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d.class, invokevirtual:Object[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>](ImmutableSortedMap::get, getfield:ImmutableSortedMap<String, \u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>(\ubcb0\ud4fe\uff55\u965f\u5f50\u9937::\u946b\u8d98\u97b7\uceb8\u6b5f\u4c2b, this:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<O, S>), p0:String[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.util.Pair lambda$\ud7e8\u4f4a\u40a9\u8258\ufcaf\ud4fe$6(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\uc31c\u74b1\u8389\u494c\u88c5\u446c p1) {
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
            return:Pair(invokestatic:Pair(Pair::of, p1:\uc31c\u74b1\u8389\u494c\u88c5\u446c[expected:Object], invokevirtual:\u40a9\u12cb\u62da\u836c\u92ee\u51fa[expected:Object](\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d::\u7043\ube23\u927d\ud4fe\u416d\u5d20, p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d, p1:\uc31c\u74b1\u8389\u494c\u88c5\u446c)))
        }
        
        goto(Label_0006)
    }
    
    private static \u3bc9\u67e9\uc87f\u47c2\u5f50.\uc31c\u74b1\u8389\u494c\u88c5\u446c lambda$\u8df4\u51b2\u494c\uff55\u4975\u4bc8$5(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d p0, com.mojang.datafixers.util.Pair p1) {
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
            return:\uc31c\u74b1\u8389\u494c\u88c5\u446c(checkcast:\uc31c\u74b1\u8389\u494c\u88c5\u446c(\u3bc9\u67e9\uc87f\u47c2\u5f50.\uc31c\u74b1\u8389\u494c\u88c5\u446c.class, invokevirtual:\uc31c\u74b1\u8389\u494c\u88c5\u446c(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \uc31c\u74b1\u8389\u494c\u88c5\u446c>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, checkcast:\uc31c\u74b1\u8389\u494c\u88c5\u446c(\u3bc9\u67e9\uc87f\u47c2\u5f50.\uc31c\u74b1\u8389\u494c\u88c5\u446c.class, invokevirtual:Object[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \uc31c\u74b1\u8389\u494c\u88c5\u446c>](Pair::getFirst, p1:Pair)), p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>, invokevirtual:Comparable(\u40a9\u12cb\u62da\u836c\u92ee\u51fa<Comparable>::\u5fe1\u6b5f\u5db4\ub6ab\u9a18\u74b1, checkcast:\u40a9\u12cb\u62da\u836c\u92ee\u51fa(\u47c2\u2dcc\u12cb\ud171\u8c8a.\u40a9\u12cb\u62da\u836c\u92ee\u51fa.class, invokevirtual:Object[expected:\u40a9\u12cb\u62da\u836c\u92ee\u51fa<Comparable>](Pair::getSecond, p1:Pair))))))
        }
        
        goto(Label_0006)
    }
    
    private static \u47c2\u2dcc\u12cb\ud171\u8c8a.\u40a9\u12cb\u62da\u836c\u92ee\u51fa lambda$\u99f7\u8df4\u4d85\ubefe\u3d4b\u8753$4(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d p0, java.util.function.Supplier p1) {
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
            return:\u40a9\u12cb\u62da\u836c\u92ee\u51fa(invokevirtual:\u40a9\u12cb\u62da\u836c\u92ee\u51fa(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d::\u7043\ube23\u927d\ud4fe\u416d\u5d20, p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d, checkcast:\uc31c\u74b1\u8389\u494c\u88c5\u446c(\u3bc9\u67e9\uc87f\u47c2\u5f50.\uc31c\u74b1\u8389\u494c\u88c5\u446c.class, invokeinterface:\uc31c\u74b1\u8389\u494c\u88c5\u446c(Supplier<\uc31c\u74b1\u8389\u494c\u88c5\u446c>::get, p1:Supplier<\uc31c\u74b1\u8389\u494c\u88c5\u446c>))))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ubb2b\u3c25\ub18d\u12cb\ub6ab\u34df$3(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6c56\u6b0d\u927d\u99f7\u4e72\u7049 p0, java.lang.Object p1, com.mojang.serialization.MapCodec p2, java.util.Map p3, java.util.List p4, java.util.List p5) {
        var_8_81 : ImmutableMap
        var_9_90 : \uc31c\u74b1\u8389\u494c\u88c5\u446c
        
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
            var_8_81 = checkcast:ImmutableMap(com.google.common.collect.ImmutableMap.class, invokeinterface:ImmutableMap(Stream<Object>::collect, invokeinterface:Stream<Object>(Collection<Object>::stream, p5:List<Object>[expected:Collection<Object>]), invokestatic:Collector(ImmutableMap::toImmutableMap, invokedynamic:Function<T, Object>(apply:()Ljava/util/function/Function;), invokedynamic:Function<T, Object>(apply:()Ljava/util/function/Function;))))
            var_9_90 = checkcast:\uc31c\u74b1\u8389\u494c\u88c5\u446c(\u3bc9\u67e9\uc87f\u47c2\u5f50.\uc31c\u74b1\u8389\u494c\u88c5\u446c.class, invokeinterface:\uc31c\u74b1\u8389\u494c\u88c5\u446c(\u6c56\u6b0d\u927d\u99f7\u4e72\u7049<Object, \uc31c\u74b1\u8389\u494c\u88c5\u446c>::\u9af2\u47c2\u3776\u12b2\u6b5f\u8308, p0:\u6c56\u6b0d\u927d\u99f7\u4e72\u7049<Object, \uc31c\u74b1\u8389\u494c\u88c5\u446c>, p1:Object, var_8_81:ImmutableMap<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>, p2:MapCodec))
            invokeinterface:\uc31c\u74b1\u8389\u494c\u88c5\u446c(Map<ImmutableMap<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>, \uc31c\u74b1\u8389\u494c\u88c5\u446c>::put, p3:Map<ImmutableMap<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>, \uc31c\u74b1\u8389\u494c\u88c5\u446c>, var_8_81:ImmutableMap<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>, Comparable<?>>, var_9_90:\uc31c\u74b1\u8389\u494c\u88c5\u446c)
            invokeinterface:boolean(List<\uc31c\u74b1\u8389\u494c\u88c5\u446c>::add, p4:List<\uc31c\u74b1\u8389\u494c\u88c5\u446c>, var_9_90:\uc31c\u74b1\u8389\u494c\u88c5\u446c)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.util.stream.Stream lambda$\uae5d\ub18d\ua562\ubcb0\u3e75\uf995$2(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d p0, java.util.List p1) {
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
    
    private static java.util.List lambda$\u8389\ufcaf\u960f\uc9f6\u67d0\u9a18$1(java.util.List p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d p1, java.lang.Comparable p2) {
        var_5_66 : ArrayList
        
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
            var_5_66 = invokestatic:ArrayList(Lists::newArrayList, p0:List[expected:Iterable])
            invokeinterface:boolean(List<Pair>::add, var_5_66:ArrayList<Pair>[expected:List<Pair>], invokestatic:Pair(Pair::of, p1:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d[expected:Object], p2:Comparable[expected:Object]))
            return:List(var_5_66:ArrayList<Pair>)
        }
        
        goto(Label_0006)
    }
    
    private static \u3bc9\u67e9\uc87f\u47c2\u5f50.\uc31c\u74b1\u8389\u494c\u88c5\u446c lambda$\uafe7\u8709\uc31c\u9033\ud158\uc246$0(java.util.function.Function p0, java.lang.Object p1) {
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
            return:\uc31c\u74b1\u8389\u494c\u88c5\u446c(checkcast:\uc31c\u74b1\u8389\u494c\u88c5\u446c(\u3bc9\u67e9\uc87f\u47c2\u5f50.\uc31c\u74b1\u8389\u494c\u88c5\u446c.class, invokeinterface:\uc31c\u74b1\u8389\u494c\u88c5\u446c(Function<Object, \uc31c\u74b1\u8389\u494c\u88c5\u446c>::apply, p0:Function<Object, \uc31c\u74b1\u8389\u494c\u88c5\u446c>, p1:Object)))
        }
        
        goto(Label_0006)
    }
    
    public static java.util.regex.Pattern \ua61f\u3bc9\u6fb0\uceb8\u92ff\u0800() {
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
            return:Pattern(getstatic:Pattern(\ubcb0\ud4fe\uff55\u965f\u5f50\u9937::\u8753\u8258\u8d98\ubcb0\u4f52\u8aa5))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_293 : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_9E_0 : byte[] [generated]
        stack_A0_0 : byte[] [generated]
        stack_CE_0 : byte[] [generated]
        stack_D0_0 : byte[] [generated]
        stack_110_0 : byte[] [generated]
        stack_112_0 : byte[] [generated]
        stack_13F_0 : byte[] [generated]
        stack_23E_0 : byte[] [generated]
        stack_2A6_0 : byte[] [generated]
        stack_32D_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_1CE : byte[]
        var_4_1CF : int
        expr_A0 : int [generated]
        var_5_21F : int
        var_3_224 : byte[]
        var_4_225 : int
        expr_23E : byte [generated]
        var_0_2C0 : int
        expr_2A6 : byte [generated]
        stack_2F8_2 : byte [generated]
        stack_2CC_0 : byte [generated]
        expr_D0 : int [generated]
        expr_112 : int [generated]
        var_3_31B : byte[]
        var_4_31C : int
        var_3_14B : String
        expr_153 : String[] [generated]
        expr_15D : String[] [generated]
        
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
            var_0_293 = and:int(ldc:int(1409461995), ldc:int(-21152059))
            expr_68 = var_2_6C = stack_9E_0 = stack_A0_0 = stack_CE_0 = stack_D0_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_23E_0 = stack_2A6_0 = stack_32D_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("BU11TeVFdf7YUHYDBmVmbW/l519v599dY3VuYA=="))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_1CE = newarray:byte[](byte.class, expr_70:int)
                var_4_1CF = expr_70:int
                
                loop {
                    var_0_293 = and:int(var_0_293:int, ldc:int(1121070833))
                    var_4_1CF = add:int(var_4_1CF:int, ldc:int(-1))
                    storeelement:byte(var_3_1CE:byte[], var_4_1CF:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_1CF:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_1CF:int, xor:int(ldc:int(4100), ldc:int(4101)))), ldc:int(3)), and:int(ldc:int(8319), ldc:int(17695)))))
                    
                    if (cmpne:boolean(var_4_1CF:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A0_0 = stack_9E_0 = stack_CE_0 = stack_D0_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_23E_0 = stack_2A6_0 = stack_32D_0 = var_3_1CE:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_293:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0279)
                }
                
                if (cmpne:boolean(and:int(var_0_293:int, ldc:int(262144)), ldc:int(0))) {
                    var_0_293 = and:int(var_0_293:int, ldc:int(1183458682))
                    goto(Label_0213)
                }
                
                if (cmpeq:boolean(and:int(var_0_293:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0165)
                }
                
                var_0_293 = and:int(var_0_293:int, ldc:int(2138558425))
                expr_A0 = arraylength:int(stack_A0_0:byte[])
                
                if (cmpeq:boolean(expr_A0:int, ldc:int(0))) {
                    goto(Label_0165)
                }
                
                var_5_21F = expr_A0:int
                var_3_224 = newarray:byte[](byte.class, expr_A0:int)
                var_4_225 = expr_A0:int
                Label_0551:
                
                while (cmpeq:boolean(and:int(var_0_293:int, ldc:int(16384)), ldc:int(0))) {
                    var_0_293 = and:int(var_0_293:int, ldc:int(1775177429))
                    var_4_225 = add:int(var_4_225:int, ldc:int(-1))
                    expr_23E = loadelement:byte(stack_23E_0:byte[], var_4_225:int)
                    storeelement:byte(var_3_224:byte[], var_4_225:int, add:int(or:int(and:int(shl:int(expr_23E:byte, and:int(ldc:int(21), ldc:int(29604))), ldc:int(-16)), and:int(shr:int(expr_23E:byte[expected:int], xor:int(ldc:int(2067), ldc:int(2071))), ldc:int(15))), ldc:int(53)))
                    
                    if (cmpne:boolean(var_4_225:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A0_0 = stack_9E_0 = stack_CE_0 = stack_D0_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_23E_0 = stack_2A6_0 = stack_32D_0 = var_3_224:byte[]
                    goto(Label_0165)
                }
                
                Label_0646:
                
                while (cmpne:boolean(and:int(var_0_293:int, ldc:int(128)), ldc:int(0))) {
                    var_0_2C0 = and:int(var_0_293:int, ldc:int(-391422241))
                    var_4_225 = add:int(var_4_225:int, ldc:int(-1))
                    expr_2A6 = stack_2F8_2 = loadelement(stack_2A6_0, var_4_225)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_225:int, ldc:int(3)), neg:int(var_5_21F:int)), ldc:int(0))) {
                        stack_2F8_2 = stack_2CC_0 = add:byte(expr_2A6:byte, loadelement:byte(var_3_224:byte[], add:int(var_4_225:int, ldc:int(3))))
                        goto(Label_0732)
                    }
                    
                    Label_0691:
                    
                    if (cmpne:boolean(and:int(var_0_2C0:int, ldc:int(524288)), ldc:int(0))) {
                        var_0_2C0 = and:int(var_0_2C0:int, ldc:int(73176427))
                    }
                    else {
                        var_0_2C0 = and:int(var_0_2C0:int, ldc:int(-1010556981))
                        stack_2F8_2 = stack_2CC_0 = add:byte(expr_2A6:byte, ldc:byte(3))
                    }
                    
                    Label_0732:
                    
                    if (cmpeq:boolean(and:int(var_0_2C0:int, ldc:int(1)), ldc:int(0))) {
                        var_0_2C0 = and:int(var_0_2C0:int, ldc:int(-253301069))
                        goto(Label_0691)
                    }
                    
                    var_0_293 = and:int(var_0_2C0:int, ldc:int(-762376211))
                    storeelement:byte(var_3_224:byte[], var_4_225:int, stack_2F8_2:byte)
                    
                    if (cmpne:boolean(var_4_225:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A0_0 = stack_9E_0 = stack_CE_0 = stack_D0_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_23E_0 = stack_2A6_0 = stack_32D_0 = var_3_224:byte[]
                    goto(Label_0213)
                }
                
                var_0_293 = and:int(var_0_293:int, ldc:int(137609702))
                goto(Label_0551)
                Label_0165:
                
                if (cmpeq:boolean(and:int(var_0_293:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0279)
                }
                
                if (cmpeq:boolean(and:int(var_0_293:int, ldc:int(2097152)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_293:int, ldc:int(2097152)), ldc:int(0))) {
                        var_0_293 = and:int(var_0_293:int, ldc:int(-1497808084))
                        loopcontinue()
                    }
                    
                    var_0_293 = and:int(var_0_293:int, ldc:int(-377868603))
                    expr_D0 = arraylength:int(stack_D0_0:byte[])
                    
                    if (cmpne:boolean(expr_D0:int, ldc:int(0))) {
                        var_5_21F = expr_D0:int
                        var_3_224 = newarray:byte[](byte.class, expr_D0:int)
                        var_4_225 = expr_D0:int
                        goto(Label_0646)
                    }
                }
                
                Label_0213:
                
                if (cmpne:boolean(and:int(var_0_293:int, ldc:int(256)), ldc:int(0))) {
                    var_0_293 = and:int(var_0_293:int, ldc:int(297340499))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_293:int, ldc:int(128)), ldc:int(0))) {
                        var_0_293 = and:int(var_0_293:int, ldc:int(734744997))
                        goto(Label_0165)
                    }
                    
                    if (cmpeq:boolean(and:int(var_0_293:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_0_293 = and:int(var_0_293:int, ldc:int(-1397173917))
                        loopcontinue()
                    }
                    
                    var_0_293 = and:int(var_0_293:int, ldc:int(-681857299))
                    expr_112 = arraylength:int(stack_112_0:byte[])
                    
                    if (cmpne:boolean(expr_112:int, ldc:int(0))) {
                        var_3_31B = newarray:byte[](byte.class, expr_112:int)
                        var_4_31C = expr_112:int
                        
                        loop {
                            var_0_293 = and:int(var_0_293:int, ldc:int(-1006469387))
                            var_4_31C = add:int(var_4_31C:int, ldc:int(-1))
                            storeelement:byte(var_3_31B:byte[], var_4_31C:int, xor:byte(loadelement:byte(stack_32D_0:byte[], var_4_31C:int), ldc:byte(119)))
                            
                            if (cmpne:boolean(var_4_31C:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A0_0 = stack_9E_0 = stack_CE_0 = stack_D0_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_23E_0 = stack_2A6_0 = stack_32D_0 = var_3_31B:byte[]
                    }
                }
                
                Label_0279:
                
                if (cmpne:boolean(and:int(var_0_293:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0213)
                }
                
                if (cmpeq:boolean(and:int(var_0_293:int, ldc:int(1)), ldc:int(0))) {
                    var_0_293 = and:int(var_0_293:int, ldc:int(-916367753))
                    goto(Label_0165)
                }
                
                if (cmpeq:boolean(and:int(var_0_293:int, ldc:int(1048576)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_14B = initobject:String(String::<init>, stack_13F_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_153 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(138), ldc:int(137)))
            expr_15D = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(35), ldc:int(579)))
            storeelement:String(expr_153:String[], and:int(ldc:int(8194), ldc:int(5251)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(6017), ldc:int(-6018)), xor:int(ldc:int(74), ldc:int(70))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(9640), ldc:int(-11753)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(3073), ldc:int(3085)), and:int(ldc:int(7699), ldc:int(25049))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(4180), ldc:int(4181)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(117), ldc:int(5777)), xor:int(ldc:int(8710), ldc:int(8733))))
            putstatic:String[](\ubcb0\ud4fe\uff55\u965f\u5f50\u9937::\ud158\u97b7\u52d3\u92ee\u52d3\ufcaf, expr_15D:String[])
            putstatic:Pattern(\ubcb0\ud4fe\uff55\u965f\u5f50\u9937::\u8753\u8258\u8d98\ubcb0\u4f52\u8aa5, invokestatic:Pattern(Pattern::compile, loadelement:String(expr_153:String[], and:int(ldc:int(16642), ldc:int(13378)))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4daf\u071d\u4975\ubb2b\u4cd9\u8753(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_696 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_6A1 : int
        
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
        var_3_696 = and:int(ldc:int(1885877959), ldc:int(1374451159))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<O, S>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
            var_3_696 = and:int(var_3_696:int, ldc:int(-624449619))
            var_5_81 = and:int(ldc:int(-15737), ldc:int(6520))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-6486), ldc:int(6421)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_696:int, ldc:int(-1111071563))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(3205), ldc:int(12353)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(9221), ldc:int(19137)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_696 = and:int(var_3_D1:int, ldc:int(275594997))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(26757), ldc:int(33)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0675)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-429796233))
                        goto(Label_0532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-2008205873))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0532)
                            }
                            
                            goto(Label_0816)
                        }
                    }
                    
                    Label_0375:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1260329932))
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-361122678))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1292969005))
                        goto(Label_0675)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1956764011))
                            var_11_E2 = and:int(ldc:int(-1222), ldc:int(1221))
                            goto(Label_1553)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0532:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1378088827))
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1599141318))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(353910906))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0816)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1128238639))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1933209940))
                            goto(Label_0375)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1282854324))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(1893561551))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0816)
                        }
                    }
                    
                    Label_0675:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1049496717))
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(446849274))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1342779698))
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1434558211))
                            goto(Label_0532)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0375)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1385141589))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1266766145))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0816:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(334274014))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1885875770))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1711638364))
                            goto(Label_0675)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1617207168))
                            goto(Label_0532)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0375)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(1860812487))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(2370), ldc:int(2371))
                                goto(Label_1119)
                            }
                        }
                    }
                    
                    Label_0941:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1630671581))
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1571684344))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-12905928))
                            goto(Label_0816)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1532180395))
                            goto(Label_0675)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1641945192))
                            goto(Label_0532)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-501214307))
                            goto(Label_0375)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(694763509))
                        var_11_E2 = and:int(ldc:int(-4152), ldc:int(4151))
                    }
                    
                    Label_1119:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-266423794))
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1107928991))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1359895631))
                            goto(Label_0941)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1510138485))
                            goto(Label_0816)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1470811362))
                            goto(Label_0675)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0532)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0375)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(1273294543))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1407)
                            }
                        }
                    }
                    
                    Label_1253:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(2145790112))
                            goto(Label_1119)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1998328328))
                            goto(Label_0941)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-2044338847))
                            goto(Label_0816)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1515410608))
                            goto(Label_0675)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(111632428))
                            goto(Label_0532)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0375)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(728185939))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(1045066999))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1553)
                    }
                    
                    Label_1407:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-40164229))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1549829159))
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-282066518))
                        goto(Label_0675)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1817912596))
                        goto(Label_0532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(843581677))
                        goto(Label_0375)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_696 = and:int(var_3_696:int, ldc:int(-1244565827))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1553:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A1 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1564:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1124592110))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1926564681))
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0816)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0675)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1073423637))
                        goto(Label_0532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(345037302))
                        goto(Label_0375)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(273497501))
                        var_17_6A1 = add:int(var_16_110:int, and:int(ldc:int(1281), ldc:int(21203)))
                        looporswitchbreak()
                    }
                    
                    var_3_696 = and:int(var_3_696:int, ldc:int(2090322))
                }
                
                var_3_696 = and:int(var_3_696:int, ldc:int(-755632419))
                
                if (cmple:boolean(var_5_81 = var_17_6A1:int, sub:int(var_6_88:int, xor:int(ldc:int(1248), ldc:int(1249))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
