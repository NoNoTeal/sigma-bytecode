public interface \u36d3\u9033\u6b0d\u983f\u8d90.\u7e3f\uf94d\u446c\uc7fe\u7e3f {
    java.util.Collection<java.lang.String> \u99f7\u6d99\u839e\u16f6\u6cfe\u97e6();
    
    java.util.Collection<java.lang.String> \uc2bd\u97e6\u6ec6\u4c2b\u8308\u946b() {
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
            return:Collection<String>(invokestatic:List<Object>[expected:Collection<String>](Collections::emptyList))
        }
        
        goto(Label_0006)
    }
    
    java.util.Collection<java.lang.String> \u3d4b\u5245\u74b1\u7e3f\u6c56\u8df4();
    
    java.util.Collection<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> \u4cd9\uc4d2\u8640\u3bc9\u0b8e\u40a9();
    
    java.util.stream.Stream<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> \u0b8e\u9033\ud12e\u446c\u67d0\u3711();
    
    java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> \u6c56\u56bd\ud523\u8d98\u600f\uc910(com.mojang.brigadier.context.CommandContext<\u36d3\u9033\u6b0d\u983f\u8d90.\u7e3f\uf94d\u446c\uc7fe\u7e3f> p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1);
    
    java.util.Collection<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4492\ub8be\u8cae\uae5d\u40a9> \u59ec\uc246\u4ab3\u88c5\u7873\uae5d() {
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
            return:Collection<\u4492\ub8be\u8cae\uae5d\u40a9>(invokestatic:Set<\u4492\ub8be\u8cae\uae5d\u40a9>[expected:Collection<\u4492\ub8be\u8cae\uae5d\u40a9>](Collections::singleton, getstatic:\u4492\ub8be\u8cae\uae5d\u40a9(\u4492\ub8be\u8cae\uae5d\u40a9::\u4179\u99f7\uc246\ub18d\uc84e\u93a2)))
        }
        
        goto(Label_0006)
    }
    
    java.util.Collection<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4492\ub8be\u8cae\uae5d\u40a9> \ud7e8\u12cb\u3e2a\u6b0d\u392e\ub19c() {
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
            return:Collection<\u4492\ub8be\u8cae\uae5d\u40a9>(invokestatic:Set<\u4492\ub8be\u8cae\uae5d\u40a9>[expected:Collection<\u4492\ub8be\u8cae\uae5d\u40a9>](Collections::singleton, getstatic:\u4492\ub8be\u8cae\uae5d\u40a9(\u4492\ub8be\u8cae\uae5d\u40a9::\u4179\u99f7\uc246\ub18d\uc84e\u93a2)))
        }
        
        goto(Label_0006)
    }
    
    java.util.Set<\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c>> \u97e6\u69d9\ua562\uc87f\ub6ab\u76bc();
    
    \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f \u392e\uc7fe\u7330\u36d3\u4ab3\u56bd();
    
    boolean \u873d\u7043\u385b\uceb8\u3a62\u6b0d(int p0);
    
    void \u74b1\u62da\u839e\u4daf\u76bc\u4daf(java.lang.Iterable<T> p0, java.lang.String p1, java.util.function.Function<T, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> p2, java.util.function.Consumer<T> p3) {
        var_4_61 : int
        stack_90_0 : int [generated]
        var_4_114 : int
        var_6_90 : int
        var_7_98 : Iterator<T>
        var_8_D8 : T
        var_9_E5 : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        
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
            var_4_61 = and:int(ldc:int(-1814044871), ldc:int(-740566118))
            
            if (cmple:boolean(invokevirtual:int(String::indexOf, p1:String, ldc:int(58)), ldc:int(-1))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(-1948262516))
                stack_90_0 = and:int(ldc:int(-20926), ldc:int(16700))
            }
            else {
                stack_90_0 = and:int(ldc:int(18689), ldc:int(4803))
            }
            
            var_4_114 = and:int(var_4_61:int, ldc:int(-67110627))
            var_6_90 = stack_90_0:int
            var_7_98 = invokeinterface:Iterator<T>(Iterable<T>::iterator, p0:Iterable<T>)
            
            loop {
                if (cmpeq:boolean(and:int(var_4_114:int, ldc:int(8192)), ldc:int(0))) {
                    var_4_114 = and:int(var_4_114:int, ldc:int(-1073751720))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_7_98:Iterator<T>)) {
                        var_8_D8 = invokeinterface:T(Iterator<T>::next, var_7_98:Iterator<T>)
                        var_9_E5 = checkcast:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753.class, invokeinterface:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Function<T, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>::apply, p2:Function<T, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>, var_8_D8:T))
                        
                        if (cmpeq:boolean(var_6_90:int, ldc:int(0))) {
                            loop {
                                if (cmpeq:boolean(and:int(var_4_114:int, ldc:int(4)), ldc:int(0))) {
                                    var_4_114 = and:int(var_4_114:int, ldc:int(-472130678))
                                    
                                    if (logicalnot:boolean(invokestatic:boolean(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u9a18\u4f52\uc31c\u3bd6\ub102\ubefe, p1:String, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u92ff\ubf56\ub8be\u647c\u624e\u0c95, var_9_E5:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)))) {
                                        if (logicalnot:boolean(invokevirtual:boolean(String::equals, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u92ff\ubf56\ub8be\u647c\u624e\u0c95, var_9_E5:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753), ldc:String[expected:Object]("minecraft")))) {
                                            looporswitchbreak()
                                        }
                                        
                                        if (logicalnot:boolean(invokestatic:boolean(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u9a18\u4f52\uc31c\u3bd6\ub102\ubefe, p1:String, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u3776\ubded\u88c5\u647c\u40a9\u494c, var_9_E5:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)))) {
                                            looporswitchbreak()
                                        }
                                    }
                                }
                                
                                if (cmpeq:boolean(and:int(var_4_114:int, ldc:int(4)), ldc:int(0))) {
                                    var_4_114 = and:int(var_4_114:int, ldc:int(-1006641672))
                                    invokeinterface:void(Consumer<T>::accept, p3:Consumer<T>, var_8_D8:T)
                                    looporswitchbreak()
                                }
                            }
                        }
                        else {
                            if (invokestatic:boolean(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u9a18\u4f52\uc31c\u3bd6\ub102\ubefe, p1:String, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, var_9_E5:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753))) {
                                invokeinterface:void(Consumer<T>::accept, p3:Consumer<T>, var_8_D8:T)
                            }
                            
                            var_4_114 = and:int(var_4_114:int, ldc:int(-268445237))
                        }
                        
                        var_4_114 = and:int(var_4_114:int, ldc:int(-1678516791))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_4_114:int, ldc:int(64)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_4_114 = and:int(var_4_114:int, ldc:int(1041195800))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    void \uc29a\u98a4\u61a4\u67e9\u5fe1\uff55(java.lang.Iterable<T> p0, java.lang.String p1, java.lang.String p2, java.util.function.Function<T, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> p3, java.util.function.Consumer<T> p4) {
        var_5_61 : int
        var_7_76 : String
        
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
            var_5_61 = and:int(ldc:int(-416547960), ldc:int(1752432572))
            
            if (logicalnot:boolean(invokevirtual:boolean(String::isEmpty, p1:String))) {
                var_5_61 = and:int(var_5_61:int, ldc:int(-100928514))
                var_7_76 = invokestatic:String(Strings::commonPrefix, p1:String[expected:CharSequence], p2:String[expected:CharSequence])
                
                if (logicalnot:boolean(invokevirtual:boolean(String::isEmpty, var_7_76:String))) {
                    invokestatic:void(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u74b1\u62da\u839e\u4daf\u76bc\u4daf, p0:Iterable<T>, invokevirtual:String(String::substring, p1:String, invokevirtual:int(String::length, var_7_76:String)), p3:Function<T, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>, p4:Consumer<T>)
                }
            }
            else {
                invokeinterface:void(Iterable<T>::forEach, p0:Iterable<T>, p4:Consumer<T>)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> \u6cfe\u965f\uae5d\uc2e8\ud51e\u8cae(java.lang.Iterable<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1, java.lang.String p2) {
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
    
    java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> \u6cfe\u965f\uae5d\uc2e8\ud51e\u8cae(java.lang.Iterable<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1) {
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
    
    java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> \u8640\uf94d\ud158\u72f1\u624e\u36d3(java.lang.Iterable<T> p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1, java.util.function.Function<T, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> p2, java.util.function.Function<T, com.mojang.brigadier.Message> p3) {
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
    
    java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> \uc87f\u6198\u5245\u7006\u97b7\ua6bd(java.util.stream.Stream<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1) {
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
            return:CompletableFuture<Suggestions>(invokestatic:CompletableFuture<Suggestions>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u6cfe\u965f\uae5d\uc2e8\ud51e\u8cae, invokedynamic:Iterable<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(iterator:(Ljava/util/stream/Stream;)Ljava/lang/Iterable;, p0:BaseStream<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, S>), p1:SuggestionsBuilder))
        }
        
        goto(Label_0006)
    }
    
    java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> \ubff1\u8df4\u8aa5\u8640\u836c\u5bc4(java.util.stream.Stream<T> p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1, java.util.function.Function<T, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> p2, java.util.function.Function<T, com.mojang.brigadier.Message> p3) {
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
            return:CompletableFuture<Suggestions>(invokestatic:CompletableFuture<Suggestions>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u8640\uf94d\ud158\u72f1\u624e\u36d3, invokedynamic:Iterable<T>(iterator:(Ljava/util/stream/Stream;)Ljava/lang/Iterable;, p0:BaseStream<T, S>), p1:SuggestionsBuilder, p2:Function<T, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>, p3:Function<T, Message>))
        }
        
        goto(Label_0006)
    }
    
    java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> \u7ce1\u4f52\ua6bd\uff55\u62da\u8753(java.lang.String p0, java.util.Collection<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4492\ub8be\u8cae\uae5d\u40a9> p1, com.mojang.brigadier.suggestion.SuggestionsBuilder p2, java.util.function.Predicate<java.lang.String> p3) {
        var_4_63 : int
        var_6_68 : ArrayList
        var_4_77 : int
        var_7_80 : String[]
        var_8_18C : Iterator<\u4492\ub8be\u8cae\uae5d\u40a9>
        var_9_1FE : \u4492\ub8be\u8cae\uae5d\u40a9
        var_10_233 : String
        var_4_2B8 : int
        var_10_30F : String
        var_7_B5 : Iterator<\u4492\ub8be\u8cae\uae5d\u40a9>
        var_8_F4 : \u4492\ub8be\u8cae\uae5d\u40a9
        var_9_124 : String
        
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
            var_4_63 = and:int(ldc:int(1703799176), ldc:int(-923936353))
            var_6_68 = invokestatic:ArrayList(Lists::newArrayList)
            
            if (logicalnot:boolean(invokestatic:boolean(Strings::isNullOrEmpty, p0:String))) {
                var_4_77 = and:int(var_4_63:int, ldc:int(207617868))
                var_7_80 = invokevirtual:String[](String::split, p0:String, ldc:String(" "))
                
                if (cmpne:boolean(arraylength:int(var_7_80:String[]), and:int(ldc:int(19539), ldc:int(12297)))) {
                    var_4_77 = and:int(var_4_77:int, ldc:int(-109065429))
                    
                    if (cmpne:boolean(arraylength:int(var_7_80:String[]), and:int(ldc:int(9251), ldc:int(16734)))) {
                        return:CompletableFuture<Suggestions>(invokestatic:CompletableFuture<Suggestions>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u5245\u16f6\u3711\u64ab\u6d69\u647c, var_6_68:ArrayList<String>[expected:Iterable<String>], p2:SuggestionsBuilder))
                    }
                    
                    var_8_18C = invokeinterface:Iterator<\u4492\ub8be\u8cae\uae5d\u40a9>(Collection<\u4492\ub8be\u8cae\uae5d\u40a9>::iterator, p1:Collection<\u4492\ub8be\u8cae\uae5d\u40a9>)
                    goto(Label_0661)
                }
                else {
                    var_8_18C = invokeinterface:Iterator<\u4492\ub8be\u8cae\uae5d\u40a9>(Collection<\u4492\ub8be\u8cae\uae5d\u40a9>::iterator, p1:Collection<\u4492\ub8be\u8cae\uae5d\u40a9>)
                }
                
                Label_0398:
                
                while (cmpne:boolean(and:int(var_4_77:int, ldc:int(8)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_4_77:int, ldc:int(16384)), ldc:int(0))) {
                        var_4_77 = and:int(var_4_77:int, ldc:int(1684012250))
                        goto(Label_0456)
                    }
                    
                    var_4_77 = and:int(var_4_77:int, ldc:int(907005226))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_8_18C:Iterator<\u4492\ub8be\u8cae\uae5d\u40a9>))) {
                        goto(Label_0456)
                    }
                    
                    var_9_1FE = checkcast:\u4492\ub8be\u8cae\uae5d\u40a9(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4492\ub8be\u8cae\uae5d\u40a9.class, invokeinterface:\u4492\ub8be\u8cae\uae5d\u40a9(Iterator<\u4492\ub8be\u8cae\uae5d\u40a9>::next, var_8_18C:Iterator<\u4492\ub8be\u8cae\uae5d\u40a9>))
                    var_10_233 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(var_7_80:String[], and:int(ldc:int(-22916), ldc:int(22913)))), ldc:String(" ")), getfield:String(\u4492\ub8be\u8cae\uae5d\u40a9::\u4c04\u527a\uc9f6\u4cd9\ub7dc\uc3e3, var_9_1FE:\u4492\ub8be\u8cae\uae5d\u40a9)), ldc:String(" ")), getfield:String(\u4492\ub8be\u8cae\uae5d\u40a9::\u92ff\ub102\uc238\u93a2\u5654\uafe7, var_9_1FE:\u4492\ub8be\u8cae\uae5d\u40a9)))
                    
                    if (invokeinterface:boolean(Predicate<String>::test, p3:Predicate<String>, var_10_233:String)) {
                        invokeinterface:boolean(List<String>::add, var_6_68:ArrayList<String>[expected:List<String>], invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(var_7_80:String[], and:int(ldc:int(29538), ldc:int(-29555)))), ldc:String(" ")), getfield:String(\u4492\ub8be\u8cae\uae5d\u40a9::\u4c04\u527a\uc9f6\u4cd9\ub7dc\uc3e3, var_9_1FE:\u4492\ub8be\u8cae\uae5d\u40a9))))
                        invokeinterface:boolean(List<String>::add, var_6_68:ArrayList<String>[expected:List<String>], var_10_233:String)
                    }
                    
                    var_4_77 = and:int(var_4_77:int, ldc:int(996145656))
                }
                
                var_4_77 = and:int(var_4_77:int, ldc:int(-1353768939))
                Label_0661:
                
                while (cmpeq:boolean(and:int(var_4_77:int, ldc:int(2097152)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_4_77:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_4_77 = and:int(var_4_77:int, ldc:int(-1942919925))
                        goto(Label_0398)
                    }
                    
                    var_4_2B8 = and:int(var_4_77:int, ldc:int(1254087149))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator<E>::hasNext, var_8_18C:Iterator<\u4492\ub8be\u8cae\uae5d\u40a9>))) {
                        return:CompletableFuture<Suggestions>(invokestatic:CompletableFuture<Suggestions>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u5245\u16f6\u3711\u64ab\u6d69\u647c, var_6_68:ArrayList<String>[expected:Iterable<String>], p2:SuggestionsBuilder))
                    }
                    
                    var_10_30F = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(var_7_80:String[], and:int(ldc:int(-6619), ldc:int(2522)))), ldc:String(" ")), loadelement:String(var_7_80:String[], and:int(ldc:int(5249), ldc:int(9)))), ldc:String(" ")), getfield:String(\u4492\ub8be\u8cae\uae5d\u40a9::\u92ff\ub102\uc238\u93a2\u5654\uafe7, checkcast:\u4492\ub8be\u8cae\uae5d\u40a9(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4492\ub8be\u8cae\uae5d\u40a9.class, invokeinterface:\u4492\ub8be\u8cae\uae5d\u40a9(Iterator<\u4492\ub8be\u8cae\uae5d\u40a9>::next, var_8_18C:Iterator<\u4492\ub8be\u8cae\uae5d\u40a9>)))))
                    
                    if (invokeinterface:boolean(Predicate<String>::test, p3:Predicate<String>, var_10_30F:String)) {
                        invokeinterface:boolean(List<String>::add, var_6_68:ArrayList<String>[expected:List<String>], var_10_30F:String)
                    }
                    
                    var_4_77 = and:int(var_4_2B8:int, ldc:int(75492684))
                }
                
                Label_0456:
                
                if (cmpne:boolean(and:int(var_4_77:int, ldc:int(33554432)), ldc:int(0))) {
                    var_4_77 = and:int(var_4_77:int, ldc:int(-141286677))
                    goto(Label_0661)
                }
                
                if (cmpne:boolean(and:int(var_4_77:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0398)
                }
            }
            else {
                var_7_B5 = invokeinterface:Iterator<\u4492\ub8be\u8cae\uae5d\u40a9>(Collection<\u4492\ub8be\u8cae\uae5d\u40a9>::iterator, p1:Collection<\u4492\ub8be\u8cae\uae5d\u40a9>)
                
                loop {
                    if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_4_63 = and:int(var_4_63:int, ldc:int(-361772632))
                        
                        if (invokeinterface:boolean(Iterator<E>::hasNext, var_7_B5:Iterator<\u4492\ub8be\u8cae\uae5d\u40a9>)) {
                            var_8_F4 = checkcast:\u4492\ub8be\u8cae\uae5d\u40a9(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4492\ub8be\u8cae\uae5d\u40a9.class, invokeinterface:\u4492\ub8be\u8cae\uae5d\u40a9(Iterator<\u4492\ub8be\u8cae\uae5d\u40a9>::next, var_7_B5:Iterator<\u4492\ub8be\u8cae\uae5d\u40a9>))
                            var_9_124 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), getfield:String(\u4492\ub8be\u8cae\uae5d\u40a9::\u88c5\u34df\ud51e\u527a\u0c95\u59ec, var_8_F4:\u4492\ub8be\u8cae\uae5d\u40a9)), ldc:String(" ")), getfield:String(\u4492\ub8be\u8cae\uae5d\u40a9::\u4c04\u527a\uc9f6\u4cd9\ub7dc\uc3e3, var_8_F4:\u4492\ub8be\u8cae\uae5d\u40a9)), ldc:String(" ")), getfield:String(\u4492\ub8be\u8cae\uae5d\u40a9::\u92ff\ub102\uc238\u93a2\u5654\uafe7, var_8_F4:\u4492\ub8be\u8cae\uae5d\u40a9)))
                            
                            if (invokeinterface:boolean(Predicate<String>::test, p3:Predicate<String>, var_9_124:String)) {
                                invokeinterface:boolean(List<String>::add, var_6_68:ArrayList<String>[expected:List<String>], getfield:String(\u4492\ub8be\u8cae\uae5d\u40a9::\u88c5\u34df\ud51e\u527a\u0c95\u59ec, var_8_F4:\u4492\ub8be\u8cae\uae5d\u40a9))
                                invokeinterface:boolean(List<String>::add, var_6_68:ArrayList<String>[expected:List<String>], invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), getfield:String(\u4492\ub8be\u8cae\uae5d\u40a9::\u88c5\u34df\ud51e\u527a\u0c95\u59ec, var_8_F4:\u4492\ub8be\u8cae\uae5d\u40a9)), ldc:String(" ")), getfield:String(\u4492\ub8be\u8cae\uae5d\u40a9::\u4c04\u527a\uc9f6\u4cd9\ub7dc\uc3e3, var_8_F4:\u4492\ub8be\u8cae\uae5d\u40a9))))
                                invokeinterface:boolean(List<String>::add, var_6_68:ArrayList<String>[expected:List<String>], var_9_124:String)
                            }
                            
                            var_4_63 = and:int(var_4_63:int, ldc:int(688913805))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
            }
            
            return:CompletableFuture<Suggestions>(invokestatic:CompletableFuture<Suggestions>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u5245\u16f6\u3711\u64ab\u6d69\u647c, var_6_68:ArrayList<String>[expected:Iterable<String>], p2:SuggestionsBuilder))
        }
        
        goto(Label_0006)
    }
    
    java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> \u47c2\u5d20\u9255\u4bc8\u7043\u6c56(java.lang.String p0, java.util.Collection<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4492\ub8be\u8cae\uae5d\u40a9> p1, com.mojang.brigadier.suggestion.SuggestionsBuilder p2, java.util.function.Predicate<java.lang.String> p3) {
        var_4_63 : int
        var_6_68 : ArrayList
        var_4_77 : int
        var_7_80 : String[]
        var_8_14C : Iterator<\u4492\ub8be\u8cae\uae5d\u40a9>
        var_4_154 : int
        var_10_198 : String
        var_7_A0 : Iterator<\u4492\ub8be\u8cae\uae5d\u40a9>
        var_8_EA : \u4492\ub8be\u8cae\uae5d\u40a9
        var_9_10C : String
        
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
            var_4_63 = and:int(ldc:int(1576155243), ldc:int(-692652063))
            var_6_68 = invokestatic:ArrayList(Lists::newArrayList)
            
            if (logicalnot:boolean(invokestatic:boolean(Strings::isNullOrEmpty, p0:String))) {
                var_4_77 = and:int(var_4_63:int, ldc:int(-38045597))
                var_7_80 = invokevirtual:String[](String::split, p0:String, ldc:String(" "))
                
                if (cmpeq:boolean(arraylength:int(var_7_80:String[]), and:int(ldc:int(1185), ldc:int(515)))) {
                    var_8_14C = invokeinterface:Iterator<\u4492\ub8be\u8cae\uae5d\u40a9>(Collection<\u4492\ub8be\u8cae\uae5d\u40a9>::iterator, p1:Collection<\u4492\ub8be\u8cae\uae5d\u40a9>)
                    
                    loop {
                        var_4_154 = and:int(var_4_77:int, ldc:int(-55070351))
                        
                        if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_8_14C:Iterator<\u4492\ub8be\u8cae\uae5d\u40a9>))) {
                            looporswitchbreak()
                        }
                        
                        var_10_198 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(var_7_80:String[], and:int(ldc:int(6656), ldc:int(-6657)))), ldc:String(" ")), getfield:String(\u4492\ub8be\u8cae\uae5d\u40a9::\u92ff\ub102\uc238\u93a2\u5654\uafe7, checkcast:\u4492\ub8be\u8cae\uae5d\u40a9(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4492\ub8be\u8cae\uae5d\u40a9.class, invokeinterface:\u4492\ub8be\u8cae\uae5d\u40a9(Iterator<\u4492\ub8be\u8cae\uae5d\u40a9>::next, var_8_14C:Iterator<\u4492\ub8be\u8cae\uae5d\u40a9>)))))
                        
                        if (invokeinterface:boolean(Predicate<String>::test, p3:Predicate<String>, var_10_198:String)) {
                            invokeinterface:boolean(List<String>::add, var_6_68:ArrayList<String>[expected:List<String>], var_10_198:String)
                        }
                        
                        var_4_77 = and:int(var_4_154:int, ldc:int(1472115559))
                    }
                }
            }
            else {
                var_7_A0 = invokeinterface:Iterator<\u4492\ub8be\u8cae\uae5d\u40a9>(Collection<\u4492\ub8be\u8cae\uae5d\u40a9>::iterator, p1:Collection<\u4492\ub8be\u8cae\uae5d\u40a9>)
                
                loop {
                    if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2097152)), ldc:int(0))) {
                        var_4_63 = and:int(var_4_63:int, ldc:int(1817750947))
                    }
                    else {
                        var_4_63 = and:int(var_4_63:int, ldc:int(-185435671))
                        
                        if (invokeinterface:boolean(Iterator<E>::hasNext, var_7_A0:Iterator<\u4492\ub8be\u8cae\uae5d\u40a9>)) {
                            var_8_EA = checkcast:\u4492\ub8be\u8cae\uae5d\u40a9(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4492\ub8be\u8cae\uae5d\u40a9.class, invokeinterface:\u4492\ub8be\u8cae\uae5d\u40a9(Iterator<\u4492\ub8be\u8cae\uae5d\u40a9>::next, var_7_A0:Iterator<\u4492\ub8be\u8cae\uae5d\u40a9>))
                            var_9_10C = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), getfield:String(\u4492\ub8be\u8cae\uae5d\u40a9::\u88c5\u34df\ud51e\u527a\u0c95\u59ec, var_8_EA:\u4492\ub8be\u8cae\uae5d\u40a9)), ldc:String(" ")), getfield:String(\u4492\ub8be\u8cae\uae5d\u40a9::\u92ff\ub102\uc238\u93a2\u5654\uafe7, var_8_EA:\u4492\ub8be\u8cae\uae5d\u40a9)))
                            
                            if (invokeinterface:boolean(Predicate<String>::test, p3:Predicate<String>, var_9_10C:String)) {
                                invokeinterface:boolean(List<String>::add, var_6_68:ArrayList<String>[expected:List<String>], getfield:String(\u4492\ub8be\u8cae\uae5d\u40a9::\u88c5\u34df\ud51e\u527a\u0c95\u59ec, var_8_EA:\u4492\ub8be\u8cae\uae5d\u40a9))
                                invokeinterface:boolean(List<String>::add, var_6_68:ArrayList<String>[expected:List<String>], var_9_10C:String)
                            }
                            
                            var_4_63 = and:int(var_4_63:int, ldc:int(-725681163))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
            }
            
            return:CompletableFuture<Suggestions>(invokestatic:CompletableFuture<Suggestions>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u5245\u16f6\u3711\u64ab\u6d69\u647c, var_6_68:ArrayList<String>[expected:Iterable<String>], p2:SuggestionsBuilder))
        }
        
        goto(Label_0006)
    }
    
    java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> \u5245\u16f6\u3711\u64ab\u6d69\u647c(java.lang.Iterable<java.lang.String> p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1) {
        var_2_83 : int
        var_4_6C : String
        var_5_74 : Iterator<String>
        var_6_B8 : String
        
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
            var_2_83 = and:int(ldc:int(1951685448), ldc:int(2111920703))
            var_4_6C = invokevirtual:String(String::toLowerCase, invokevirtual:String(SuggestionsBuilder::getRemaining, p1:SuggestionsBuilder), getstatic:Locale(Locale::ROOT))
            var_5_74 = invokeinterface:Iterator<String>(Iterable<String>::iterator, p0:Iterable<String>)
            
            loop {
                if (cmpne:boolean(and:int(var_2_83:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_2_83 = and:int(var_2_83:int, ldc:int(2011494937))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_5_74:Iterator)) {
                        var_6_B8 = checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_5_74:Iterator<String>))
                        
                        if (invokestatic:boolean(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u9a18\u4f52\uc31c\u3bd6\ub102\ubefe, var_4_6C:String, invokevirtual:String(String::toLowerCase, var_6_B8:String, getstatic:Locale(Locale::ROOT)))) {
                            invokevirtual:SuggestionsBuilder(SuggestionsBuilder::suggest, p1:SuggestionsBuilder, var_6_B8:String)
                        }
                        
                        var_2_83 = and:int(var_2_83:int, ldc:int(1976949102))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_83:int, ldc:int(2048)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_83 = and:int(var_2_83:int, ldc:int(-476453515))
            }
            
            return:CompletableFuture<Suggestions>(invokevirtual:CompletableFuture(SuggestionsBuilder::buildFuture, p1:SuggestionsBuilder))
        }
        
        goto(Label_0006)
    }
    
    java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> \u5245\u16f6\u3711\u64ab\u6d69\u647c(java.util.stream.Stream<java.lang.String> p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1) {
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
    
    java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> \u5245\u16f6\u3711\u64ab\u6d69\u647c(java.lang.String[] p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1) {
        var_2_61 : int
        var_4_6C : String
        var_6_74 : int
        var_7_7D : int
        var_8_A0 : String
        
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
            var_2_61 = and:int(ldc:int(1496203900), ldc:int(1261984357))
            var_4_6C = invokevirtual:String(String::toLowerCase, invokevirtual:String(SuggestionsBuilder::getRemaining, p1:SuggestionsBuilder), getstatic:Locale(Locale::ROOT))
            var_6_74 = arraylength:int(p0:String[])
            var_7_7D = and:int(ldc:int(6009), ldc:int(-22394))
            
            loop {
                var_2_61 = and:int(var_2_61:int, ldc:int(146748530))
                
                if (cmpge:boolean(var_7_7D:int, var_6_74:int)) {
                    looporswitchbreak()
                }
                
                var_8_A0 = loadelement:String(p0:String[], var_7_7D:int)
                
                if (invokestatic:boolean(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u9a18\u4f52\uc31c\u3bd6\ub102\ubefe, var_4_6C:String, invokevirtual:String(String::toLowerCase, var_8_A0:String, getstatic:Locale(Locale::ROOT)))) {
                    invokevirtual:SuggestionsBuilder(SuggestionsBuilder::suggest, p1:SuggestionsBuilder, var_8_A0:String)
                }
                
                inc:int(var_7_7D, ldc:int(1))
            }
            
            return:CompletableFuture<Suggestions>(invokevirtual:CompletableFuture(SuggestionsBuilder::buildFuture, p1:SuggestionsBuilder))
        }
        
        goto(Label_0006)
    }
    
    boolean \u9a18\u4f52\uc31c\u3bd6\ub102\ubefe(java.lang.String p0, java.lang.String p1) {
        var_2_61 : int
        var_4_69 : int
        
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
        var_2_61 = and:int(ldc:int(-427137084), ldc:int(-86390811))
        var_4_69 = and:int(ldc:int(4256), ldc:int(-4257))
        
        loop {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1024)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(2053877011))
            }
            else {
                var_2_61 = and:int(var_2_61:int, ldc:int(-343347210))
                
                if (logicalnot:boolean(invokevirtual:boolean(String::startsWith, p1:String, p0:String, var_4_69:int))) {
                    var_4_69 = invokevirtual:int(String::indexOf, p1:String, ldc:int(95), var_4_69:int)
                    
                    if (cmpge:boolean(var_4_69:int, ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(-1010176010))
                        inc:int(var_4_69, ldc:int(1))
                        loopcontinue()
                    }
                    
                    return:boolean(and:int[expected:boolean](ldc:int(-14408), ldc:int(14406)))
                }
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(8)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(3207), ldc:int(8457)))
            }
        }
    }
    
    boolean lambda$\u7ce1\ua6bd\u62da\u8aa5\u3d4b\u983f$5(java.lang.String p0, java.lang.String p1) {
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
            return:boolean(invokestatic:boolean(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u9a18\u4f52\uc31c\u3bd6\ub102\ubefe, p0:String, invokevirtual:String(String::toLowerCase, p1:String, getstatic:Locale(Locale::ROOT))))
        }
        
        goto(Label_0006)
    }
    
    void lambda$\ub19c\u8df4\u3711\u64f2\u92ff\uafe7$4(com.mojang.brigadier.suggestion.SuggestionsBuilder p0, java.util.function.Function p1, java.util.function.Function p2, java.lang.Object p3) {
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
            invokevirtual:SuggestionsBuilder(SuggestionsBuilder::suggest, p0:SuggestionsBuilder, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, checkcast:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753.class, invokeinterface:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Function<Object, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>::apply, p1:Function<Object, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>, p3:Object))), checkcast:Message(com.mojang.brigadier.Message.class, invokeinterface:Message(Function<Object, Message>::apply, p2:Function<Object, Message>, p3:Object)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    void lambda$\u446c\u36d3\u5245\u6fb0\u527a\u4c2b$3(com.mojang.brigadier.suggestion.SuggestionsBuilder p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1) {
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
            invokevirtual:SuggestionsBuilder(SuggestionsBuilder::suggest, p0:SuggestionsBuilder, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 lambda$\u98a4\u47c2\u873d\u9033\uc246\uc229$2(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
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
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
        }
        
        goto(Label_0006)
    }
    
    void lambda$\uc246\u4d85\u8350\u3dd3\u6c56\uae5d$1(com.mojang.brigadier.suggestion.SuggestionsBuilder p0, java.lang.String p1, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p2) {
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
            invokevirtual:SuggestionsBuilder(SuggestionsBuilder::suggest, p0:SuggestionsBuilder, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p1:String), p2:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object])))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 lambda$\u5bc4\u600f\u3e75\u7043\u8308\u64ab$0(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
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
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
        }
        
        goto(Label_0006)
    }
}
