public class \u56bd\u8413\u647c\u5bc4\ud158.\u6d99\u873d\ub18d\u446c\u8389\u5245 {
    public void \u6d99\u873d\ub18d\u446c\u8389\u5245(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0, \u56bd\u8413\u647c\u5bc4\ud158.\u8389\u3bd6\u3bc9\ubefe\u5fe1\u9255 p1, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d p2, int p3) {
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
            invokespecial:\u6d99\u873d\ub18d\u446c\u8389\u5245(\u6d99\u873d\ub18d\u446c\u8389\u5245::<init>, this:\u6d99\u873d\ub18d\u446c\u8389\u5245, p0:\u6c52\u52d3\u516c\uae87\uae5d, p1:\u8389\u3bd6\u3bc9\ubefe\u5fe1\u9255, xor:int[expected:boolean](ldc:int(12354), ldc:int(12355)))
            invokevirtual:void(\u6d99\u873d\ub18d\u446c\u8389\u5245::\uc7fe\ua61f\u9255\u5fe1\ub70c\ubefe, this:\u6d99\u873d\ub18d\u446c\u8389\u5245, p2:\ubf56\u64f2\u392e\u98a4\u120d, p3:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6d99\u873d\ub18d\u446c\u8389\u5245(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0, \u56bd\u8413\u647c\u5bc4\ud158.\u8389\u3bd6\u3bc9\ubefe\u5fe1\u9255 p1, boolean p2) {
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
    
    public void \uc7fe\ua61f\u9255\u5fe1\ub70c\ubefe(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d p0, int p1) {
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
    
    public \u59ec\u8413\u97e6\uc229\u3776.\u120d\u8389\u8bb0\u8bb0\u6d69\u4492 \u8308\u12b2\u69d9\ub32d\u0a06\u8cae(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99 p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d p1) {
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
    
    private static java.util.function.Predicate<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d> \u600f\u51fa\u3a62\uc84e\u64ab\uc4d2(\u6b0d\u12cb\u156b\u4179\u8bb0.\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d> p0, java.lang.String p1) {
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
    
    public static T extends java.lang.Comparable<T> \ucfaf\u6cfe\u9a18\u7af6\u4c2b\u6d69(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T> p0, java.lang.String p1) {
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
            return:T extends Comparable<T>(checkcast:T extends Comparable<T>(T extends java.lang.Comparable<T>.class, invokevirtual:T extends Comparable<T>(Optional<T>::orElse, invokevirtual:Optional<T>(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>::\u873d\uc87f\ucef1\u9033\u3bc9\u6bb9, p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, p1:String), checkcast:T extends Comparable<T>(T extends java.lang.Comparable<T>.class, aconstnull:T extends Comparable<T>()))))
        }
        
        goto(Label_0006)
    }
    
    public \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ube23\uc31c\uc84e\uafe7\u3c25\uc31c \u6198\ud36e\ub18d\u4e72\u6bb9\ubded(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
        var_2_61 : int
        var_2_259 : int
        var_4_243 : \ube23\uc31c\uc84e\uafe7\u3c25\uc31c
        var_2_4C7 : int
        var_5_2B1 : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        var_6_3ED : \u5bc4\ud158\uf94d\u71f1\u416d\ubb2b
        var_6_4CF : Exception
        var_2_643 : int
        
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
        var_2_61 = and:int(ldc:int(-1563077815), ldc:int(-1161437313))
        
        loop {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(536870912)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1156016386))
                goto(Label_0484)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1696553925))
                goto(Label_0371)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0318)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0215)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1073741824)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1543637111))
                
                if (logicalnot:boolean(invokeinterface:boolean(Map<K, V>::containsKey, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ube23\uc31c\uc84e\uafe7\u3c25\uc31c>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u0800\ud171\u64f2\u446c\u64f2\u960f, this:\u6d99\u873d\ub18d\u446c\u8389\u5245), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object]))) {
                    if (invokeinterface:boolean(Set<E>::contains, getfield:Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u99f7\u2dcc\uc3e3\u9033\u8d90\ubcb0, this:\u6d99\u873d\ub18d\u446c\u8389\u5245), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object])) {
                        goto(Label_0318)
                    }
                    
                    invokeinterface:boolean(Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>::add, getfield:Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u99f7\u2dcc\uc3e3\u9033\u8d90\ubcb0, this:\u6d99\u873d\ub18d\u446c\u8389\u5245), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
                    goto(Label_0484)
                }
            }
            
            Label_0171:
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0484)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0371)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0318)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(8388608)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(256)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_61 = and:int(var_2_61:int, ldc:int(-1275199527))
            }
            
            Label_0215:
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0484)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1073741824)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(149777598))
                goto(Label_0371)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1073741824)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-536737543))
            }
            else {
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(1036069771))
                    goto(Label_0171)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    return:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c(checkcast:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ube23\uc31c\uc84e\uafe7\u3c25\uc31c.class, invokeinterface:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ube23\uc31c\uc84e\uafe7\u3c25\uc31c>::get, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ube23\uc31c\uc84e\uafe7\u3c25\uc31c>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u0800\ud171\u64f2\u446c\u64f2\u960f, this:\u6d99\u873d\ub18d\u446c\u8389\u5245), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object])))
                }
                
                loopcontinue()
            }
            
            Label_0318:
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(8192)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(124803581))
                goto(Label_0484)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1073741824)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_0215)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0171)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_61 = and:int(var_2_61:int, ldc:int(-67120213))
            }
            
            Label_0371:
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(536870912)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(1393111731))
                    goto(Label_0318)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0215)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(2097152)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-896609665))
                    goto(Label_0171)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
                    athrow(initobject:IllegalStateException(IllegalStateException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u6d99\u873d\ub18d\u446c\u8389\u5245::\uc84e\ud523\ub70c\uc2bd\ub113\u71f1), xor:int(ldc:int(-32105), ldc:int(-32122)))), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object]))))
                }
                
                loopcontinue()
            }
            
            Label_0484:
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1283964204))
                goto(Label_0371)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1024)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-2001944867))
                goto(Label_0318)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(4194304)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(505862638))
                goto(Label_0215)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0171)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(65536)), ldc:int(0))) {
                var_2_259 = and:int(var_2_61:int, ldc:int(-100829362))
                var_4_243 = checkcast:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ube23\uc31c\uc84e\uafe7\u3c25\uc31c.class, invokeinterface:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ube23\uc31c\uc84e\uafe7\u3c25\uc31c>::get, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ube23\uc31c\uc84e\uafe7\u3c25\uc31c>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u0800\ud171\u64f2\u446c\u64f2\u960f, this:\u6d99\u873d\ub18d\u446c\u8389\u5245), getstatic:\u71ae\u64ab\u718f\u9a18\uc31c\u7d52[expected:Object](\u6d99\u873d\ub18d\u446c\u8389\u5245::\u6435\u120d\u5bc4\ubff1\u6c52\ud523)))
                
                loop {
                    if (cmpeq:boolean(and:int(var_2_259:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_259:int, ldc:int(8)), ldc:int(0))) {
                        var_2_259 = and:int(var_2_259:int, ldc:int(-1144168453))
                        
                        if (invokeinterface:boolean(Set<E>::isEmpty, getfield:Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u99f7\u2dcc\uc3e3\u9033\u8d90\ubcb0, this:\u6d99\u873d\ub18d\u446c\u8389\u5245))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0614:
                    
                    if (cmpeq:boolean(and:int(var_2_259:int, ldc:int(262144)), ldc:int(0))) {
                        var_2_259 = and:int(var_2_259:int, ldc:int(-755873875))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_2_259:int, ldc:int(262144)), ldc:int(0))) {
                            var_2_259 = and:int(var_2_259:int, ldc:int(-1409452941))
                            loopcontinue()
                        }
                        
                        var_2_259 = and:int(var_2_259:int, ldc:int(-1494912197))
                    }
                    
                    Label_0652:
                    
                    if (cmpne:boolean(and:int(var_2_259:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0614)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_259:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_4C7 = and:int(var_2_259:int, ldc:int(-421012481))
                    var_5_2B1 = checkcast:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753.class, invokeinterface:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Iterator<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>::next, invokeinterface:Iterator<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>::iterator, getfield:Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u99f7\u2dcc\uc3e3\u9033\u8d90\ubcb0, this:\u6d99\u873d\ub18d\u446c\u8389\u5245))))
                    
                    try {
                        loop {
                            if (cmpeq:boolean(and:int(var_2_4C7:int, ldc:int(65536)), ldc:int(0))) {
                                var_2_4C7 = and:int(var_2_4C7:int, ldc:int(852082964))
                                goto(Label_0934)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_4C7:int, ldc:int(256)), ldc:int(0))) {
                                goto(Label_0857)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_4C7:int, ldc:int(8388608)), ldc:int(0))) {
                                var_2_4C7 = and:int(var_2_4C7:int, ldc:int(1288106841))
                                goto(Label_0805)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_4C7:int, ldc:int(4194304)), ldc:int(0))) {
                                var_2_4C7 = and:int(var_2_4C7:int, ldc:int(-774363092))
                            }
                            else {
                                var_2_4C7 = and:int(var_2_4C7:int, ldc:int(-1093675093))
                                
                                if (invokeinterface:boolean(Map<K, V>::containsKey, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ube23\uc31c\uc84e\uafe7\u3c25\uc31c>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u0800\ud171\u64f2\u446c\u64f2\u960f, this:\u6d99\u873d\ub18d\u446c\u8389\u5245), var_5_2B1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object])) {
                                    goto(Label_0857)
                                }
                            }
                            
                            Label_0769:
                            
                            if (cmpne:boolean(and:int(var_2_4C7:int, ldc:int(32)), ldc:int(0))) {
                                goto(Label_0934)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_4C7:int, ldc:int(1073741824)), ldc:int(0))) {
                                goto(Label_0857)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_4C7:int, ldc:int(65536)), ldc:int(0))) {
                                if (cmpne:boolean(and:int(var_2_4C7:int, ldc:int(16)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_2_4C7 = and:int(var_2_4C7:int, ldc:int(-1459759109))
                            }
                            
                            Label_0805:
                            
                            if (cmpeq:boolean(and:int(var_2_4C7:int, ldc:int(4194304)), ldc:int(0))) {
                                goto(Label_0934)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_4C7:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_2_4C7 = and:int(var_2_4C7:int, ldc:int(636613498))
                            }
                            else {
                                if (cmpne:boolean(and:int(var_2_4C7:int, ldc:int(32)), ldc:int(0))) {
                                    goto(Label_0769)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4C7:int, ldc:int(16384)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_2_4C7 = and:int(var_2_4C7:int, ldc:int(-186689541))
                                invokespecial:void(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u446c\ud51e\u9937\u93a2\u4c2b\u2dcc, this:\u6d99\u873d\ub18d\u446c\u8389\u5245, var_5_2B1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
                            }
                            
                            Label_0857:
                            
                            if (cmpeq:boolean(and:int(var_2_4C7:int, ldc:int(16384)), ldc:int(0))) {
                                var_2_4C7 = and:int(var_2_4C7:int, ldc:int(271871585))
                            }
                            else {
                                if (cmpeq:boolean(and:int(var_2_4C7:int, ldc:int(512)), ldc:int(0))) {
                                    var_2_4C7 = and:int(var_2_4C7:int, ldc:int(-162781992))
                                    goto(Label_0805)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_4C7:int, ldc:int(16777216)), ldc:int(0))) {
                                    var_2_4C7 = and:int(var_2_4C7:int, ldc:int(629738662))
                                    goto(Label_0769)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4C7:int, ldc:int(256)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_2_4C7 = and:int(var_2_4C7:int, ldc:int(-1295680578))
                                invokeinterface:boolean(Set<E>::remove, getfield:Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u99f7\u2dcc\uc3e3\u9033\u8d90\ubcb0, this:\u6d99\u873d\ub18d\u446c\u8389\u5245), var_5_2B1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object])
                            }
                            
                            Label_0934:
                            
                            if (cmpne:boolean(and:int(var_2_4C7:int, ldc:int(1024)), ldc:int(0))) {
                                goto(Label_0857)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_4C7:int, ldc:int(1024)), ldc:int(0))) {
                                var_2_4C7 = and:int(var_2_4C7:int, ldc:int(512949521))
                                goto(Label_0805)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_4C7:int, ldc:int(262144)), ldc:int(0))) {
                                var_2_4C7 = and:int(var_2_4C7:int, ldc:int(-1758329590))
                                goto(Label_0769)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_4C7:int, ldc:int(4194304)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_2_4C7 = and:int(var_2_4C7:int, ldc:int(1326706432))
                        }
                        
                        var_2_4C7 = and:int(var_2_4C7:int, ldc:int(-1225395201))
                    }
                    catch (\u5245\u8aa5\u61a4\u7049\u4cd9.\u5bc4\ud158\uf94d\u71f1\u416d\ubb2b var_6_3ED) {
                        loop {
                            if (cmpeq:boolean(and:int(var_2_4C7:int, ldc:int(256)), ldc:int(0))) {
                                goto(Label_1187)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_4C7:int, ldc:int(16)), ldc:int(0))) {
                                var_2_4C7 = and:int(var_2_4C7:int, ldc:int(-139819144))
                                goto(Label_1118)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_4C7:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_2_4C7 = and:int(var_2_4C7:int, ldc:int(-437259489))
                                invokeinterface:void(Logger::warn, getstatic:Logger(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u3dd3\u8d90\uc229\u3c25\u5654\ua61f), invokevirtual:String(Throwable::getMessage, var_6_3ED:\u5bc4\ud158\uf94d\u71f1\u416d\ubb2b[expected:Throwable]))
                            }
                            
                            Label_1057:
                            
                            if (cmpeq:boolean(and:int(var_2_4C7:int, ldc:int(8388608)), ldc:int(0))) {
                                var_2_4C7 = and:int(var_2_4C7:int, ldc:int(445833854))
                                goto(Label_1187)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_4C7:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_2_4C7 = and:int(var_2_4C7:int, ldc:int(1484880145))
                            }
                            else {
                                if (cmpne:boolean(and:int(var_2_4C7:int, ldc:int(32)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_2_4C7 = and:int(var_2_4C7:int, ldc:int(-1176019974))
                                invokeinterface:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ube23\uc31c\uc84e\uafe7\u3c25\uc31c>::put, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ube23\uc31c\uc84e\uafe7\u3c25\uc31c>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u0800\ud171\u64f2\u446c\u64f2\u960f, this:\u6d99\u873d\ub18d\u446c\u8389\u5245), var_5_2B1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, var_4_243:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c)
                            }
                            
                            Label_1118:
                            
                            if (cmpne:boolean(and:int(var_2_4C7:int, ldc:int(1024)), ldc:int(0))) {
                                var_2_4C7 = and:int(var_2_4C7:int, ldc:int(-921843849))
                            }
                            else {
                                if (cmpne:boolean(and:int(var_2_4C7:int, ldc:int(2)), ldc:int(0))) {
                                    var_2_4C7 = and:int(var_2_4C7:int, ldc:int(-1727328085))
                                    goto(Label_1057)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4C7:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_2_4C7 = and:int(var_2_4C7:int, ldc:int(1780590427))
                                    loopcontinue()
                                }
                                
                                var_2_4C7 = and:int(var_2_4C7:int, ldc:int(-353535042))
                                invokeinterface:boolean(Set<E>::remove, getfield:Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u99f7\u2dcc\uc3e3\u9033\u8d90\ubcb0, this:\u6d99\u873d\ub18d\u446c\u8389\u5245), var_5_2B1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object])
                            }
                            
                            Label_1187:
                            
                            if (cmpeq:boolean(and:int(var_2_4C7:int, ldc:int(536870912)), ldc:int(0))) {
                                goto(Label_1118)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_4C7:int, ldc:int(16)), ldc:int(0))) {
                                goto(Label_1057)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_4C7:int, ldc:int(4096)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_2_4C7 = and:int(var_2_4C7:int, ldc:int(-1193120554))
                        }
                        
                        var_2_4C7 = and:int(var_2_4C7:int, ldc:int(-1311285265))
                    }
                    catch (java.lang.Exception var_6_4CF) {
                        loop {
                            if (cmpne:boolean(and:int(var_2_4C7:int, ldc:int(2097152)), ldc:int(0))) {
                                var_2_4C7 = and:int(var_2_4C7:int, ldc:int(-1968960157))
                                goto(Label_1534)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_4C7:int, ldc:int(8192)), ldc:int(0))) {
                                goto(Label_1468)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_4C7:int, ldc:int(16384)), ldc:int(0))) {
                                goto(Label_1408)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_4C7:int, ldc:int(1024)), ldc:int(0))) {
                                var_2_4C7 = and:int(var_2_4C7:int, ldc:int(-1360571493))
                                invokeinterface:void(Logger::warn, getstatic:Logger(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u3dd3\u8d90\uc229\u3c25\u5654\ua61f), loadelement:String(getstatic:String[](\u6d99\u873d\ub18d\u446c\u8389\u5245::\uc84e\ud523\ub70c\uc2bd\ub113\u71f1), xor:int(ldc:int(1793), ldc:int(1811))), var_5_2B1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object], p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object])
                            }
                            
                            Label_1302:
                            
                            if (cmpeq:boolean(and:int(var_2_4C7:int, ldc:int(8)), ldc:int(0))) {
                                var_2_4C7 = and:int(var_2_4C7:int, ldc:int(-2145979056))
                                goto(Label_1534)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_4C7:int, ldc:int(4096)), ldc:int(0))) {
                                var_2_4C7 = and:int(var_2_4C7:int, ldc:int(324376567))
                                goto(Label_1468)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_4C7:int, ldc:int(16384)), ldc:int(0))) {
                                if (cmpne:boolean(and:int(var_2_4C7:int, ldc:int(8192)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_2_4C7 = and:int(var_2_4C7:int, ldc:int(-1090553924))
                                invokeinterface:void(Logger::warn, getstatic:Logger(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u3dd3\u8d90\uc229\u3c25\u5654\ua61f), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(Class<T>::getName, invokevirtual:Class<? extends Exception>(Exception::getClass, var_6_4CF:Exception))), loadelement:String(getstatic:String[](\u6d99\u873d\ub18d\u446c\u8389\u5245::\uc84e\ud523\ub70c\uc2bd\ub113\u71f1), xor:int(ldc:int(265), ldc:int(282)))), invokevirtual:String(Throwable::getMessage, var_6_4CF:Exception[expected:Throwable]))))
                            }
                            
                            Label_1408:
                            
                            if (cmpne:boolean(and:int(var_2_4C7:int, ldc:int(16777216)), ldc:int(0))) {
                                goto(Label_1534)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_4C7:int, ldc:int(262144)), ldc:int(0))) {
                                if (cmpne:boolean(and:int(var_2_4C7:int, ldc:int(2097152)), ldc:int(0))) {
                                    var_2_4C7 = and:int(var_2_4C7:int, ldc:int(2078378329))
                                    goto(Label_1302)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_4C7:int, ldc:int(2097152)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_2_4C7 = and:int(var_2_4C7:int, ldc:int(-388506691))
                                invokeinterface:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ube23\uc31c\uc84e\uafe7\u3c25\uc31c>::put, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ube23\uc31c\uc84e\uafe7\u3c25\uc31c>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u0800\ud171\u64f2\u446c\u64f2\u960f, this:\u6d99\u873d\ub18d\u446c\u8389\u5245), var_5_2B1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, var_4_243:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c)
                            }
                            
                            Label_1468:
                            
                            if (cmpeq:boolean(and:int(var_2_4C7:int, ldc:int(16)), ldc:int(0))) {
                                if (cmpne:boolean(and:int(var_2_4C7:int, ldc:int(2)), ldc:int(0))) {
                                    var_2_4C7 = and:int(var_2_4C7:int, ldc:int(-1570027404))
                                    goto(Label_1408)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4C7:int, ldc:int(65536)), ldc:int(0))) {
                                    var_2_4C7 = and:int(var_2_4C7:int, ldc:int(-864078144))
                                    goto(Label_1302)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4C7:int, ldc:int(16384)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_2_4C7 = and:int(var_2_4C7:int, ldc:int(-1194339349))
                                invokeinterface:boolean(Set<E>::remove, getfield:Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u99f7\u2dcc\uc3e3\u9033\u8d90\ubcb0, this:\u6d99\u873d\ub18d\u446c\u8389\u5245), var_5_2B1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object])
                            }
                            
                            Label_1534:
                            
                            if (cmpeq:boolean(and:int(var_2_4C7:int, ldc:int(8388608)), ldc:int(0))) {
                                goto(Label_1468)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_4C7:int, ldc:int(256)), ldc:int(0))) {
                                goto(Label_1408)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_4C7:int, ldc:int(2)), ldc:int(0))) {
                                var_2_4C7 = and:int(var_2_4C7:int, ldc:int(800997964))
                                goto(Label_1302)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_4C7:int, ldc:int(262144)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_2_4C7 = and:int(var_2_4C7:int, ldc:int(-1085630210))
                        }
                        
                        var_2_4C7 = and:int(var_2_4C7:int, ldc:int(-1160939572))
                    }
                    finally {
                        var_2_643 = and:int(var_2_4C7:int, ldc:int(-304262257))
                        invokeinterface:boolean(Set<E>::remove, getfield:Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u99f7\u2dcc\uc3e3\u9033\u8d90\ubcb0, this:\u6d99\u873d\ub18d\u446c\u8389\u5245), var_5_2B1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object])
                        var_2_259 = and:int(var_2_643:int, ldc:int(-454172775))
                    }
                }
                
                return:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c(checkcast:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ube23\uc31c\uc84e\uafe7\u3c25\uc31c.class, invokeinterface:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ube23\uc31c\uc84e\uafe7\u3c25\uc31c>::getOrDefault, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ube23\uc31c\uc84e\uafe7\u3c25\uc31c>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u0800\ud171\u64f2\u446c\u64f2\u960f, this:\u6d99\u873d\ub18d\u446c\u8389\u5245), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object], var_4_243:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c)))
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(1845463943))
        }
    }
    
    private void \u446c\ud51e\u9937\u93a2\u4c2b\u2dcc(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
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
    
    private void \u8640\ua3b4\u4e72\ud158\uc2bd\u965f(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ube23\uc31c\uc84e\uafe7\u3c25\uc31c p1) {
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
            invokeinterface:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ube23\uc31c\uc84e\uafe7\u3c25\uc31c>::put, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ube23\uc31c\uc84e\uafe7\u3c25\uc31c>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u0800\ud171\u64f2\u446c\u64f2\u960f, this:\u6d99\u873d\ub18d\u446c\u8389\u5245), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, p1:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c)
            invokeinterface:boolean(Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>::addAll, getfield:Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u99f7\u2dcc\uc3e3\u9033\u8d90\ubcb0, this:\u6d99\u873d\ub18d\u446c\u8389\u5245), invokeinterface:Collection<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\ube23\uc31c\uc84e\uafe7\u3c25\uc31c::\ubefe\u960f\u760c\ucfaf\u4d85\ufe34, p1:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u7e3f\u61a4\uc29a\ubff1\uae5d\u836c(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
        var_4_67 : \ube23\uc31c\uc84e\uafe7\u3c25\uc31c
        
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
            var_4_67 = invokevirtual:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u6198\ud36e\ub18d\u4e72\u6bb9\ubded, this:\u6d99\u873d\ub18d\u446c\u8389\u5245, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            invokeinterface:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ube23\uc31c\uc84e\uafe7\u3c25\uc31c>::put, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ube23\uc31c\uc84e\uafe7\u3c25\uc31c>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u0800\ud171\u64f2\u446c\u64f2\u960f, this:\u6d99\u873d\ub18d\u446c\u8389\u5245), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, var_4_67:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c)
            invokeinterface:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ube23\uc31c\uc84e\uafe7\u3c25\uc31c>::put, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ube23\uc31c\uc84e\uafe7\u3c25\uc31c>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\ubded\u67d0\u5d20\u76bc\u8350\u927d, this:\u6d99\u873d\ub18d\u446c\u8389\u5245), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, var_4_67:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8c8a\u8aa5\u9937\u9af2\u494c\u4c04(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u71ae\u64ab\u718f\u9a18\uc31c\u7d52 p0) {
        var_4_67 : \ube23\uc31c\uc84e\uafe7\u3c25\uc31c
        
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
            var_4_67 = invokevirtual:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u6198\ud36e\ub18d\u4e72\u6bb9\ubded, this:\u6d99\u873d\ub18d\u446c\u8389\u5245, p0:\u71ae\u64ab\u718f\u9a18\uc31c\u7d52[expected:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753])
            invokeinterface:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c(Map<\u71ae\u64ab\u718f\u9a18\uc31c\u7d52, \ube23\uc31c\uc84e\uafe7\u3c25\uc31c>::put, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ube23\uc31c\uc84e\uafe7\u3c25\uc31c>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u0800\ud171\u64f2\u446c\u64f2\u960f, this:\u6d99\u873d\ub18d\u446c\u8389\u5245), p0:\u71ae\u64ab\u718f\u9a18\uc31c\u7d52, var_4_67:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c)
            invokeinterface:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c(Map<\u71ae\u64ab\u718f\u9a18\uc31c\u7d52, \ube23\uc31c\uc84e\uafe7\u3c25\uc31c>::put, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ube23\uc31c\uc84e\uafe7\u3c25\uc31c>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\ubded\u67d0\u5d20\u76bc\u8350\u927d, this:\u6d99\u873d\ub18d\u446c\u8389\u5245), p0:\u71ae\u64ab\u718f\u9a18\uc31c\u7d52, var_4_67:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ud7e8\u2dcc\u9033\u7c6b\u759a\ubded(java.lang.Iterable<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d> p0) {
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
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ua562\ud4fe\u647c\uc84e\u5245\u5f50 \u12cb\u3e75\ucef1\uc3e3\uc7fe\ud7e8(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, \u47c2\u2dcc\u12cb\ud171\u8c8a.\u34df\u40a9\u51b2\ub6ab\u4492\u4492 p1) {
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
            return:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(invokevirtual:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6d99\u873d\ub18d\u446c\u8389\u5245::\uc229\ud12e\u64ab\u4e72\ua61f\u839e, this:\u6d99\u873d\ub18d\u446c\u8389\u5245, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, p1:\u34df\u40a9\u51b2\ub6ab\u4492\u4492, invokedynamic:Function<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, \u97b7\u8350\u99f7\ub1b9\u839e\u873d>(apply:(L\u59ec\u8413\u97e6\uc229\u3776/\u120d\u8389\u8bb0\u8bb0\u6d69\u4492;)Ljava/util/function/Function;, getfield:\u120d\u8389\u8bb0\u8bb0\u6d69\u4492(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u0b8e\u0a06\u61a4\u647c\ubefe\ud523, this:\u6d99\u873d\ub18d\u446c\u8389\u5245))))
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ua562\ud4fe\u647c\uc84e\u5245\u5f50 \uc229\ud12e\u64ab\u4e72\ua61f\u839e(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, \u47c2\u2dcc\u12cb\ud171\u8c8a.\u34df\u40a9\u51b2\ub6ab\u4492\u4492 p1, java.util.function.Function<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u97b7\u8350\u99f7\ub1b9\u839e\u873d> p2) {
        var_4_63 : int
        var_6_78 : Triple
        var_7_C0 : \ube23\uc31c\uc84e\uafe7\u3c25\uc31c
        var_8_147 : \u69d9\uff55\u5bc4\u4492\u8cae\u61a4
        var_8_EA : \ua562\ud4fe\u647c\uc84e\u5245\u5f50
        
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
        var_4_63 = and:int(ldc:int(1909217778), ldc:int(2003619953))
        var_6_78 = invokestatic:Triple(Triple::of, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object], invokeinterface:\u4c04\u56bd\ub7dc\u8709\u72f1\ufe34[expected:Object](\u34df\u40a9\u51b2\ub6ab\u4492\u4492::\u4179\u8753\u0a06\ud4fe\u516c\ud217, p1:\u34df\u40a9\u51b2\ub6ab\u4492\u4492), invokestatic:Boolean[expected:Object](Boolean::valueOf, invokeinterface:boolean(\u34df\u40a9\u51b2\ub6ab\u4492\u4492::\u1833\u624e\u98a4\u120d\ube23\u5d20, p1:\u34df\u40a9\u51b2\ub6ab\u4492\u4492)))
        
        if (logicalnot:boolean(invokeinterface:boolean(Map<K, V>::containsKey, getfield:Map<Triple<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4c04\u56bd\ub7dc\u8709\u72f1\ufe34, Boolean>, \ua562\ud4fe\u647c\uc84e\u5245\u5f50>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u0a06\u6435\ub113\ua562\u51b2\u51fa, this:\u6d99\u873d\ub18d\u446c\u8389\u5245), var_6_78:Triple[expected:Object]))) {
            do {
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16777216)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-862958829))
                }
                else {
                    var_4_63 = and:int(var_4_63:int, ldc:int(1943567483))
                    
                    if (cmpne:boolean(getfield:\u120d\u8389\u8bb0\u8bb0\u6d69\u4492(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u0b8e\u0a06\u61a4\u647c\ubefe\ud523, this:\u6d99\u873d\ub18d\u446c\u8389\u5245), aconstnull:\u120d\u8389\u8bb0\u8bb0\u6d69\u4492())) {
                        loopcontinue()
                    }
                    
                    athrow(initobject:IllegalStateException(IllegalStateException::<init>, loadelement:String(getstatic:String[](\u6d99\u873d\ub18d\u446c\u8389\u5245::\uc84e\ud523\ub70c\uc2bd\ub113\u71f1), and:int(ldc:int(1114), ldc:int(16410)))))
                }
            } while (cmpne:boolean(and:int(var_4_63:int, ldc:int(8)), ldc:int(0)))
            
            var_7_C0 = invokevirtual:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u6198\ud36e\ub18d\u4e72\u6bb9\ubded, this:\u6d99\u873d\ub18d\u446c\u8389\u5245, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            
            if (instanceof:boolean(\u494c\u4975\ua068\u0c95\uc84e.\u69d9\uff55\u5bc4\u4492\u8cae\u61a4.class, var_7_C0:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c)) {
                var_8_147 = checkcast:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4(\u494c\u4975\ua068\u0c95\uc84e.\u69d9\uff55\u5bc4\u4492\u8cae\u61a4.class, var_7_C0:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4)
                
                if (cmpeq:boolean(invokevirtual:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4(\u69d9\uff55\u5bc4\u4492\u8cae\u61a4::\ud523\u6c56\u76bc\u5654\ub18d\u2dcc, var_8_147:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4), getstatic:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u3c25\u3bc9\uc910\u8bb0\ud7e8\u5fe1))) {
                    if (logicalnot:boolean(invokevirtual:boolean(\u93a2\u1833\u6cfe\uc4d2\u4ab3\uc84e::\u9255\u8413\ube23\u71ae\u647c\u4f52, getstatic:\u93a2\u1833\u6cfe\uc4d2\u4ab3\uc84e(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u760c\u4d85\u9033\u8bb0\u5654\u600f)))) {
                        return:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(invokevirtual:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u69d9\uff55\u5bc4\u4492\u8cae\u61a4::\u8c8a\u3e75\u4f4a\ucfaf\u6c56\u0800, invokevirtual:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4(\ub171\ud51e\u59ec\u946b\ub19c\u8d90::\u8d98\u4bc8\ud51e\uc87f\ub18d\u385b, getstatic:\ub171\ud51e\u59ec\u946b\ub19c\u8d90(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u12cb\u9af2\u7006\u759a\u36d3\u97e6), invokedynamic:Function<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, \u97b7\u8350\u99f7\ub1b9\u839e\u873d>(apply:(L\u59ec\u8413\u97e6\uc229\u3776/\u120d\u8389\u8bb0\u8bb0\u6d69\u4492;)Ljava/util/function/Function;, getfield:\u120d\u8389\u8bb0\u8bb0\u6d69\u4492(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u0b8e\u0a06\u61a4\u647c\ubefe\ud523, this:\u6d99\u873d\ub18d\u446c\u8389\u5245)), var_8_147:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4), this:\u6d99\u873d\ub18d\u446c\u8389\u5245, var_8_147:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4, invokedynamic:Function<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, \u97b7\u8350\u99f7\ub1b9\u839e\u873d>(apply:(L\u59ec\u8413\u97e6\uc229\u3776/\u120d\u8389\u8bb0\u8bb0\u6d69\u4492;)Ljava/util/function/Function;, getfield:\u120d\u8389\u8bb0\u8bb0\u6d69\u4492(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u0b8e\u0a06\u61a4\u647c\ubefe\ud523, this:\u6d99\u873d\ub18d\u446c\u8389\u5245)), p1:\u34df\u40a9\u51b2\ub6ab\u4492\u4492, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, and:int[expected:boolean](ldc:int(-17859), ldc:int(17856))))
                    }
                    
                    return:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(invokevirtual:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u69d9\uff55\u5bc4\u4492\u8cae\u61a4::\u8c8a\u3e75\u4f4a\ucfaf\u6c56\u0800, invokevirtual:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4(\ub171\ud51e\u59ec\u946b\ub19c\u8d90::\u8d98\u4bc8\ud51e\uc87f\ub18d\u385b, getstatic:\ub171\ud51e\u59ec\u946b\ub19c\u8d90(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u12cb\u9af2\u7006\u759a\u36d3\u97e6), p2:Function<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, \u97b7\u8350\u99f7\ub1b9\u839e\u873d>, var_8_147:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4), this:\u6d99\u873d\ub18d\u446c\u8389\u5245, var_8_147:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4, p2:Function<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, \u97b7\u8350\u99f7\ub1b9\u839e\u873d>, p1:\u34df\u40a9\u51b2\ub6ab\u4492\u4492, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, and:int[expected:boolean](ldc:int(-7800), ldc:int(5173))))
                }
            }
            
            var_8_EA = invokeinterface:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\ube23\uc31c\uc84e\uafe7\u3c25\uc31c::\u8c8a\u3e75\u4f4a\ucfaf\u6c56\u0800, var_7_C0:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4[expected:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c], this:\u6d99\u873d\ub18d\u446c\u8389\u5245, invokedynamic:Function<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, \u97b7\u8350\u99f7\ub1b9\u839e\u873d>(apply:(L\u59ec\u8413\u97e6\uc229\u3776/\u120d\u8389\u8bb0\u8bb0\u6d69\u4492;)Ljava/util/function/Function;, getfield:\u120d\u8389\u8bb0\u8bb0\u6d69\u4492(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u0b8e\u0a06\u61a4\u647c\ubefe\ud523, this:\u6d99\u873d\ub18d\u446c\u8389\u5245)), p1:\u34df\u40a9\u51b2\ub6ab\u4492\u4492, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            
            if (invokevirtual:boolean(\u93a2\u1833\u6cfe\uc4d2\u4ab3\uc84e::\u9255\u8413\ube23\u71ae\u647c\u4f52, getstatic:\u93a2\u1833\u6cfe\uc4d2\u4ab3\uc84e(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u760c\u4d85\u9033\u8bb0\u5654\u600f))) {
                var_8_EA = invokeinterface:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\ube23\uc31c\uc84e\uafe7\u3c25\uc31c::\u8c8a\u3e75\u4f4a\ucfaf\u6c56\u0800, var_7_C0:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4[expected:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c], this:\u6d99\u873d\ub18d\u446c\u8389\u5245, p2:Function<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, \u97b7\u8350\u99f7\ub1b9\u839e\u873d>, p1:\u34df\u40a9\u51b2\ub6ab\u4492\u4492, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            }
            
            invokeinterface:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(Map<Triple<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4c04\u56bd\ub7dc\u8709\u72f1\ufe34, Boolean>, \ua562\ud4fe\u647c\uc84e\u5245\u5f50>::put, getfield:Map<Triple<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4c04\u56bd\ub7dc\u8709\u72f1\ufe34, Boolean>, \ua562\ud4fe\u647c\uc84e\u5245\u5f50>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u0a06\u6435\ub113\ua562\u51b2\u51fa, this:\u6d99\u873d\ub18d\u446c\u8389\u5245), var_6_78:Triple<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4c04\u56bd\ub7dc\u8709\u72f1\ufe34, Boolean>, var_8_EA:\ua562\ud4fe\u647c\uc84e\u5245\u5f50)
            return:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(var_8_EA:\ua562\ud4fe\u647c\uc84e\u5245\u5f50)
        }
        
        return:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(checkcast:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ua562\ud4fe\u647c\uc84e\u5245\u5f50.class, invokeinterface:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(Map<Triple<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4c04\u56bd\ub7dc\u8709\u72f1\ufe34, Boolean>, \ua562\ud4fe\u647c\uc84e\u5245\u5f50>::get, getfield:Map<Triple<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4c04\u56bd\ub7dc\u8709\u72f1\ufe34, Boolean>, \ua562\ud4fe\u647c\uc84e\u5245\u5f50>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u0a06\u6435\ub113\ua562\u51b2\u51fa, this:\u6d99\u873d\ub18d\u446c\u8389\u5245), var_6_78:Triple<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4c04\u56bd\ub7dc\u8709\u72f1\ufe34, Boolean>[expected:Object])))
    }
    
    private \u494c\u4975\ua068\u0c95\uc84e.\u69d9\uff55\u5bc4\u4492\u8cae\u61a4 \u0a06\u071d\ud12e\u3bc9\ua068\u416d(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
        var_4_69 : Reader
        var_5_6C : \ufe34\u960f\ua6bd\u71f1\u516c
        var_6_72 : String
        var_7_75 : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        var_9_E8 : String
        var_8_13D : \u69d9\uff55\u5bc4\u4492\u8cae\u61a4
        var_11_171 : \u69d9\uff55\u5bc4\u4492\u8cae\u61a4
        
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
            var_4_69 = aconstnull:Reader()
            var_5_6C = aconstnull:\ufe34\u960f\ua6bd\u71f1\u516c()
            
            try {
                var_6_72 = invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u3776\ubded\u88c5\u647c\u40a9\u494c, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
                var_7_75 = p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753
                
                if (invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\u6d99\u873d\ub18d\u446c\u8389\u5245::\uc84e\ud523\ub70c\uc2bd\ub113\u71f1), and:int(ldc:int(20543), ldc:int(795))), var_6_72:String[expected:Object])) {
                    return:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4(getstatic:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u3c25\u3bc9\uc910\u8bb0\ud7e8\u5fe1))
                }
                
                if (logicalnot:boolean(invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\u6d99\u873d\ub18d\u446c\u8389\u5245::\uc84e\ud523\ub70c\uc2bd\ub113\u71f1), xor:int(ldc:int(3334), ldc:int(3354))), var_6_72:String[expected:Object]))) {
                    if (invokevirtual:boolean(String::startsWith, var_6_72:String, loadelement:String(getstatic:String[](\u6d99\u873d\ub18d\u446c\u8389\u5245::\uc84e\ud523\ub70c\uc2bd\ub113\u71f1), and:int(ldc:int(543), ldc:int(3229))))) {
                        var_9_E8 = checkcast:String(java.lang.String.class, invokeinterface:String(Map<String, String>::get, getstatic:Map<String, String>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u56bd\u3711\u7043\u527a\u7043\u9937), invokevirtual:String[expected:Object](String::substring, var_6_72:String, invokevirtual:int(String::length, loadelement:String(getstatic:String[](\u6d99\u873d\ub18d\u446c\u8389\u5245::\uc84e\ud523\ub70c\uc2bd\ub113\u71f1), and:int(ldc:int(6205), ldc:int(1311)))))))
                        
                        if (cmpeq:boolean(var_9_E8:String, aconstnull:String())) {
                            athrow(initobject:FileNotFoundException(FileNotFoundException::<init>, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)))
                        }
                        
                        var_4_69 = initobject:StringReader(StringReader::<init>, var_9_E8:String)
                    }
                    else {
                        var_7_75 = invokespecial:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u6d99\u873d\ub18d\u446c\u8389\u5245::\uc4d2\u071d\u93a2\u071d\ucb79\ucef1, this:\u6d99\u873d\ub18d\u446c\u8389\u5245, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
                        var_5_6C = invokeinterface:\ufe34\u960f\ua6bd\u71f1\u516c(\u6c52\u52d3\u516c\uae87\uae5d::\u5d20\uc2e8\ubff1\u120d\u965f\u36d3, getfield:\u6c52\u52d3\u516c\uae87\uae5d(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u0b8e\u873d\ub113\u64f2\ubff1\u416d, this:\u6d99\u873d\ub18d\u446c\u8389\u5245), var_7_75:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
                        var_4_69 = initobject:InputStreamReader(InputStreamReader::<init>, invokeinterface:InputStream(\ufe34\u960f\ua6bd\u71f1\u516c::\u494c\u9af2\u3a62\u67d0\uff55\uc9f6, var_5_6C:\ufe34\u960f\ua6bd\u71f1\u516c), getstatic:Charset(StandardCharsets::UTF_8))
                    }
                    
                    var_8_13D = invokestatic:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4(\u69d9\uff55\u5bc4\u4492\u8cae\u61a4::\u4c04\u51fa\u6cfe\uf94d\u7049\u836c, var_4_69:Reader)
                    putfield:String(\u69d9\uff55\u5bc4\u4492\u8cae\u61a4::\u12cb\ubf56\ucef1\u759a\u983f\u8df4, var_8_13D:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753))
                    invokestatic:void(\u6d99\u873d\ub18d\u446c\u8389\u5245::\ubb2b\uafe7\ud217\u67d0\u3e75\u3e75, var_8_13D:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4, invokestatic:String(\uc910\uc2e8\u3e2a\u3bd6\u836c\uff55::\u3d4b\u3c25\u8258\u7873\ub102\u92ff, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u3776\ubded\u88c5\u647c\u40a9\u494c, var_7_75:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)))
                    return:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4(var_8_13D:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4)
                }
                
                var_11_171 = getstatic:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u4c2b\u0c95\uc29a\u9937\u927d\uc910)
            }
            finally {
                invokestatic:void(IOUtils::closeQuietly, var_4_69:Reader)
                invokestatic:void(IOUtils::closeQuietly, var_5_6C:\ufe34\u960f\ua6bd\u71f1\u516c[expected:Closeable])
            }
            
            return:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4(var_11_171:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4)
        }
        
        goto(Label_0006)
    }
    
    public java.util.Map<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ua562\ud4fe\u647c\uc84e\u5245\u5f50> \ud4fe\u960f\u4c04\u6c56\uc29a\u8c8a() {
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
            return:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ua562\ud4fe\u647c\uc84e\u5245\u5f50>(getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ua562\ud4fe\u647c\uc84e\u5245\u5f50>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\uf9c5\u3a62\uc2bd\u4492\u97e6\ub6ab, this:\u6d99\u873d\ub18d\u446c\u8389\u5245))
        }
        
        goto(Label_0006)
    }
    
    public it.unimi.dsi.fastutil.objects.Object2IntMap<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d> \ubf56\u9937\u4492\ubff1\u3776\u99f7() {
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
            return:Object2IntMap<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(getfield:Object2IntMap<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u93a2\ub19c\ubefe\u071d\u3e2a\u6bb9, this:\u6d99\u873d\ub18d\u446c\u8389\u5245))
        }
        
        goto(Label_0006)
    }
    
    private \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \uc4d2\u071d\u93a2\u071d\ucb79\ucef1(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
        var_4_66 : String
        
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
        var_4_66 = invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u3776\ubded\u88c5\u647c\u40a9\u494c, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
        
        if (logicalnot:boolean(invokevirtual:boolean(String::startsWith, var_4_66:String, loadelement:String(getstatic:String[](\u6d99\u873d\ub18d\u446c\u8389\u5245::\uc84e\ud523\ub70c\uc2bd\ub113\u71f1), and:int(ldc:int(253), ldc:int(533)))))) {
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u92ff\ubf56\ub8be\u647c\u624e\u0c95, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u6d99\u873d\ub18d\u446c\u8389\u5245::\uc84e\ud523\ub70c\uc2bd\ub113\u71f1), and:int(ldc:int(382), ldc:int(8734)))), invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u3776\ubded\u88c5\u647c\u40a9\u494c, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)), loadelement:String(getstatic:String[](\u6d99\u873d\ub18d\u446c\u8389\u5245::\uc84e\ud523\ub70c\uc2bd\ub113\u71f1), and:int(ldc:int(3511), ldc:int(4119)))))))
        }
        
        if (logicalnot:boolean(invokevirtual:boolean(String::endsWith, var_4_66:String, loadelement:String(getstatic:String[](\u6d99\u873d\ub18d\u446c\u8389\u5245::\uc84e\ud523\ub70c\uc2bd\ub113\u71f1), xor:int(ldc:int(-7156), ldc:int(-7141)))))) {
            p0 = initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u92ff\ubf56\ub8be\u647c\u624e\u0c95, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), var_4_66:String), loadelement:String(getstatic:String[](\u6d99\u873d\ub18d\u446c\u8389\u5245::\uc84e\ud523\ub70c\uc2bd\ub113\u71f1), and:int(ldc:int(407), ldc:int(15447))))))
        }
        
        return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
    }
    
    public static void \ubb2b\uafe7\ud217\u67d0\u3e75\u3e75(\u494c\u4975\ua068\u0c95\uc84e.\u69d9\uff55\u5bc4\u4492\u8cae\u61a4 p0, java.lang.String p1) {
        var_2_FD : int
        var_4_6A : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        var_5_B8 : Iterator<Entry<String, Either<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, String>>>
        var_6_DB : Entry<String, Either<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, String>>
        var_8_EE : Optional
        var_9_10D : \ubcb0\ud171\u516c\u76bc\u8cae\u99f7
        var_10_114 : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        var_11_11B : String
        var_12_123 : String
        
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
            var_2_FD = and:int(ldc:int(-228571519), ldc:int(1044182477))
            var_4_6A = invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u9af2\u71ae\u36d3\uc2bd\u4f52\u74b1, getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u69d9\uff55\u5bc4\u4492\u8cae\u61a4::\u4e72\ubff1\ua562\u7d52\u64ab\u3a62, p0:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4), p1:String)
            
            if (cmpne:boolean(var_4_6A:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u69d9\uff55\u5bc4\u4492\u8cae\u61a4::\u4e72\ubff1\ua562\u7d52\u64ab\u3a62, p0:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4))) {
                putfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u69d9\uff55\u5bc4\u4492\u8cae\u61a4::\u4e72\ubff1\ua562\u7d52\u64ab\u3a62, p0:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4, var_4_6A:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_2_FD:int, ldc:int(524288)), ldc:int(0))) {
                    var_2_FD = and:int(var_2_FD:int, ldc:int(2032438386))
                    
                    if (cmpne:boolean(getfield:Map<String, Either<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, String>>(\u69d9\uff55\u5bc4\u4492\u8cae\u61a4::\u6bb9\u0a06\u965f\u647c\u5f50\u6cfe, p0:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4), aconstnull:Map<String, Either<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, String>>())) {
                        var_5_B8 = invokeinterface:Iterator<Entry<String, Either<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, String>>>(Set<Entry<String, Either<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, String>>>::iterator, invokeinterface:Set<Entry<String, Either<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, String>>>(Map<String, Either<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, String>>::entrySet, getfield:Map<String, Either<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, String>>(\u69d9\uff55\u5bc4\u4492\u8cae\u61a4::\u6bb9\u0a06\u965f\u647c\u5f50\u6cfe, p0:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4)))
                        
                        loop {
                            var_2_FD = and:int(var_2_FD:int, ldc:int(2113843198))
                            
                            if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_5_B8:Iterator<Entry<String, Either<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, String>>>))) {
                                looporswitchbreak()
                            }
                            
                            var_6_DB = checkcast:Entry<String, Either<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, String>>(java.util.Map.Entry<java.lang.String, com.mojang.datafixers.util.Either<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, java.lang.String>>.class, invokeinterface:Entry<String, Either<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, String>>(Iterator<Entry<String, Either<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, String>>>::next, var_5_B8:Iterator<Entry<String, Either<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, String>>>))
                            var_8_EE = invokevirtual:Optional(Either::left, checkcast:Either<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, String>(com.mojang.datafixers.util.Either<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, java.lang.String>.class, invokeinterface:Either<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, String>(Entry<String, Either<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, String>>::getValue, var_6_DB:Entry<String, Either<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, String>>)))
                            
                            if (invokevirtual:boolean(Optional::isPresent, var_8_EE:Optional)) {
                                var_9_10D = checkcast:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ubcb0\ud171\u516c\u76bc\u8cae\u99f7.class, invokevirtual:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7(Optional<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>::get, var_8_EE:Optional<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>))
                                var_10_114 = invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ubcb0\ud171\u516c\u76bc\u8cae\u99f7::\u4f4a\uc3e3\u76bc\u62da\u760c\uc2e8, var_9_10D:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7)
                                var_11_11B = invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u3776\ubded\u88c5\u647c\u40a9\u494c, var_10_114:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
                                var_12_123 = invokestatic:String(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u759a\u12cb\u983f\ubff1\uae87\u6cfe, var_11_11B:String, p1:String)
                                
                                if (logicalnot:boolean(invokevirtual:boolean(String::equals, var_12_123:String, var_11_11B:String[expected:Object]))) {
                                    invokeinterface:Either<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, String>(Entry<String, Either<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, String>>::setValue, var_6_DB:Entry<String, Either<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7, String>>, invokestatic:Either(Either::left, initobject:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7(\ubcb0\ud171\u516c\u76bc\u8cae\u99f7::<init>, invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ubcb0\ud171\u516c\u76bc\u8cae\u99f7::\ud51e\u392e\u12b2\u8413\u836c\u40a9, var_9_10D:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7), initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u92ff\ubf56\ub8be\u647c\u624e\u0c95, var_10_114:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753), var_12_123:String))))
                                }
                            }
                            
                            var_2_FD = and:int(var_2_FD:int, ldc:int(972914049))
                        }
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_FD:int, ldc:int(2)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \u9af2\u71ae\u36d3\uc2bd\u4f52\u74b1(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, java.lang.String p1) {
        var_2_61 : int
        var_4_B4 : String
        var_5_BC : String
        
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
        var_2_61 = and:int(ldc:int(369103989), ldc:int(1185296631))
        
        if (cmpne:boolean(p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, aconstnull:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753())) {
            if (cmpne:boolean(p1:String, aconstnull:String())) {
                if (invokevirtual:boolean(String::equals, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u92ff\ubf56\ub8be\u647c\u624e\u0c95, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753), loadelement:String[expected:Object](getstatic:String[](\u6d99\u873d\ub18d\u446c\u8389\u5245::\uc84e\ud523\ub70c\uc2bd\ub113\u71f1), and:int(ldc:int(351), ldc:int(16543))))) {
                    goto(Label_0163)
                }
                
                return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            }
        }
        
        Label_0102:
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(128)), ldc:int(0))) {
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
        }
        
        var_2_61 = and:int(var_2_61:int, ldc:int(405639865))
        Label_0163:
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
            var_4_B4 = invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u3776\ubded\u88c5\u647c\u40a9\u494c, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            var_5_BC = invokestatic:String(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u759a\u12cb\u983f\ubff1\uae87\u6cfe, var_4_B4:String, p1:String)
            
            if (cmpne:boolean(var_5_BC:String, var_4_B4:String)) {
                p0 = initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u92ff\ubf56\ub8be\u647c\u624e\u0c95, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753), var_5_BC:String)
            }
            
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
        }
        
        goto(Label_0102)
    }
    
    private static java.lang.String \u759a\u12cb\u983f\ubff1\uae87\u6cfe(java.lang.String p0, java.lang.String p1) {
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
            p0 = invokestatic:String(\uc910\uc2e8\u3e2a\u3bd6\u836c\uff55::\ud12e\ub6ab\u385b\ud36e\ua562\u40a9, p0:String, p1:String)
            p0 = invokestatic:String(\ud7e8\ua3b4\uc9f6\u56bd\u2dcc\u718f::\ub113\u59ec\u1833\u4e72\u8640\u9a18, p0:String, loadelement:String(getstatic:String[](\u6d99\u873d\ub18d\u446c\u8389\u5245::\uc84e\ud523\ub70c\uc2bd\ub113\u71f1), xor:int(ldc:int(24612), ldc:int(24627))))
            return:String(invokestatic:String(\ud7e8\ua3b4\uc9f6\u56bd\u2dcc\u718f::\ub113\u59ec\u1833\u4e72\u8640\u9a18, p0:String, loadelement:String(getstatic:String[](\u6d99\u873d\ub18d\u446c\u8389\u5245::\uc84e\ud523\ub70c\uc2bd\ub113\u71f1), xor:int(ldc:int(6430), ldc:int(6462)))))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Set<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> \uf9c5\ud4fe\u12b2\u120d\u3e75\u5fe1() {
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
            return:Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(invokestatic:Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(Collections::emptySet))
        }
        
        goto(Label_0006)
    }
    
    public \u59ec\u8413\u97e6\uc229\u3776.\u120d\u8389\u8bb0\u8bb0\u6d69\u4492 \u4bc8\u4e72\ud4fe\u72f1\uafe7\ufcaf() {
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
            return:\u120d\u8389\u8bb0\u8bb0\u6d69\u4492(getfield:\u120d\u8389\u8bb0\u8bb0\u6d69\u4492(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u0b8e\u0a06\u61a4\u647c\ubefe\ud523, this:\u6d99\u873d\ub18d\u446c\u8389\u5245))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u5fe1\u983f\u52d3\u4ab3\u7bad\u759a$27(int p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1) {
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
            invokeinterface:int(Object2IntMap::put, getfield:Object2IntMap<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u93a2\ub19c\ubefe\u071d\u3e2a\u6bb9, this:\u6d99\u873d\ub18d\u446c\u8389\u5245), p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:Object], p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u7bad\uc2bd\u3c25\u6b5f\ua068\u4c04$26(java.lang.Object p0, java.lang.Object p1) {
        var_3_89 : int
        var_5_6B : Iterator<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>
        var_6_FC : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        
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
            var_3_89 = and:int(ldc:int(1626093626), ldc:int(-76634860))
            var_5_6B = invokeinterface:Iterator(Set::iterator, checkcast:Set(java.util.Set.class, p1:Object[expected:Set<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>]))
            
            loop {
                if (cmpeq:boolean(and:int(var_3_89:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_89 = and:int(var_3_89:int, ldc:int(-1916579061))
                    goto(Label_0206)
                }
                
                if (cmpeq:boolean(and:int(var_3_89:int, ldc:int(134217728)), ldc:int(0))) {
                    var_3_89 = and:int(var_3_89:int, ldc:int(-122685350))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_5_6B:Iterator)) {
                        var_6_FC = checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(Iterator<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::next, var_5_6B:Iterator<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>))
                        
                        if (cmpne:boolean(invokevirtual:\u5245\ubff1\ub18d\u6b5f\u3e2a\u156b(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\ube23\u59ec\ucb79\ub7dc\u4ab3\u16f6, var_6_FC:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]), getstatic:\u5245\ubff1\ub18d\u6b5f\u3e2a\u156b(\u5245\ubff1\ub18d\u6b5f\u3e2a\u156b::\u183a\u9033\u4f4a\u392e\u4e72\ucef1))) {
                            invokeinterface:void(Iterator::remove, var_5_6B:Iterator)
                            invokeinterface:int(Object2IntMap::put, getfield:Object2IntMap<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u93a2\ub19c\ubefe\u071d\u3e2a\u6bb9, this:\u6d99\u873d\ub18d\u446c\u8389\u5245), var_6_FC:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:Object], and:int(ldc:int(-19658), ldc:int(3273)))
                        }
                        
                        var_3_89 = and:int(var_3_89:int, ldc:int(1627257051))
                        loopcontinue()
                    }
                }
                
                Label_0148:
                
                if (cmpeq:boolean(and:int(var_3_89:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_89 = and:int(var_3_89:int, ldc:int(-1927206267))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_89:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_89 = and:int(var_3_89:int, ldc:int(-58850208))
                        loopcontinue()
                    }
                    
                    var_3_89 = and:int(var_3_89:int, ldc:int(-29494728))
                    
                    if (cmpgt:boolean(invokeinterface:int(Set::size, checkcast:Set(java.util.Set.class, p1:Object[expected:Set])), and:int(ldc:int(279), ldc:int(2761)))) {
                        invokespecial:void(\u6d99\u873d\ub18d\u446c\u8389\u5245::\ud7e8\u2dcc\u9033\u7c6b\u759a\ubded, this:\u6d99\u873d\ub18d\u446c\u8389\u5245, checkcast:Set[expected:Iterable<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](java.util.Set.class, p1:Object[expected:Set<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>]))
                    }
                }
                
                Label_0206:
                
                if (cmpeq:boolean(and:int(var_3_89:int, ldc:int(524288)), ldc:int(0))) {
                    var_3_89 = and:int(var_3_89:int, ldc:int(1586819454))
                    goto(Label_0148)
                }
                
                if (cmpeq:boolean(and:int(var_3_89:int, ldc:int(1024)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ufcaf\u6435\ub6ab\u4c2b\u3a62\uc84e$25(java.util.Map p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1, com.mojang.datafixers.util.Pair p2, java.util.HashMap p3, \u51b2\u6fb0\ufcaf\u61a4\u0800.\u71ae\u64ab\u718f\u9a18\uc31c\u7d52 p4, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p5) {
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
    
    private static java.lang.Object lambda$\u0c95\ud523\u0a06\u8c8a\u2dcc\u12b2$24(java.lang.Object p0) {
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
            return:Object(invokestatic:Set[expected:Object](Sets::newIdentityHashSet))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u6ec6\u1833\u5245\uf9c5\ub32d\u92ff$23(com.google.common.collect.ImmutableList p0, \u6b0d\u12cb\u156b\u4179\u8bb0.\ubcb0\ud4fe\uff55\u965f\u5f50\u9937 p1, java.util.Map p2, java.util.List p3, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51b2\ud523\uae87\u4f4a\ub102\u88c5 p4, com.mojang.datafixers.util.Pair p5, \u392e\ud7e8\u3bc9\u88c5\ud51e.\u3d64\u69d9\uc9f6\u3c25\u0a06\ubcb0 p6, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p7, com.mojang.datafixers.util.Pair p8, java.lang.String p9, \u3d64\u7af6\uae87\uc238\u7d52.\ud12e\ucfaf\uc7fe\u59ec\u718f\ua3b4 p10) {
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
    
    private static void lambda$\u6d69\u8bb0\u40a9\uc3e3\u7bad\u9af2$22(java.util.Map p0, \u3d64\u7af6\uae87\uc238\u7d52.\ud12e\ucfaf\uc7fe\u59ec\u718f\ua3b4 p1, java.util.List p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51b2\ud523\uae87\u4f4a\ub102\u88c5 p3, com.mojang.datafixers.util.Pair p4, \u392e\ud7e8\u3bc9\u88c5\ud51e.\u3d64\u69d9\uc9f6\u3c25\u0a06\ubcb0 p5, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p6) {
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
    
    private static boolean lambda$\u47c2\u4d85\ucef1\ud51e\u97b7\u8308$21(com.mojang.datafixers.util.Pair p0, java.util.Map.Entry p1) {
        var_2_61 : int
        stack_90_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(-2086141210), ldc:int(-671103016))
            
            if (cmpne:boolean(invokeinterface:Object(Entry::getValue, p1:Entry), invokevirtual:Object(Pair::getFirst, p0:Pair))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1336843895))
                stack_90_0 = and:int(ldc:int(-17287), ldc:int(17286))
            }
            else {
                stack_90_0 = and:int(ldc:int(8197), ldc:int(17217))
            }
            
            return:boolean(stack_90_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static \u3d64\u7af6\uae87\uc238\u7d52.\u416d\ud7e8\ud51e\u5d20\u8413\u92ee lambda$\u120d\u7049\uae5d\u965f\u7049\u8cae$20(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u3d64\u7af6\uae87\uc238\u7d52.\ud12e\ucfaf\uc7fe\u59ec\u718f\ua3b4 p1, java.util.List p2) {
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
            return:\u416d\ud7e8\ud51e\u5d20\u8413\u92ee(invokestatic:\u416d\ud7e8\ud51e\u5d20\u8413\u92ee(\u416d\ud7e8\ud51e\u5d20\u8413\u92ee::\ubf56\u183a\u97b7\u97e6\u7006\u8df4, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p1:\ud12e\ucfaf\uc7fe\u59ec\u718f\ua3b4[expected:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c], p2:List<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>[expected:Collection<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>]))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u5f50\u8413\uc9f6\u983f\u0c95\uc31c$19(java.util.Map p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51b2\ud523\uae87\u4f4a\ub102\u88c5 p1, java.util.List p2, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p3) {
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
    
    private static \u3d64\u7af6\uae87\uc238\u7d52.\u416d\ud7e8\ud51e\u5d20\u8413\u92ee lambda$\u3d4b\ua61f\u76bc\ub19c\u927d\uc9f6$18(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51b2\ud523\uae87\u4f4a\ub102\u88c5 p1, java.util.List p2) {
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
            return:\u416d\ud7e8\ud51e\u5d20\u8413\u92ee(invokestatic:\u416d\ud7e8\ud51e\u5d20\u8413\u92ee(\u416d\ud7e8\ud51e\u5d20\u8413\u92ee::\ubf56\u183a\u97b7\u97e6\u7006\u8df4, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p1:\u51b2\ud523\uae87\u4f4a\ub102\u88c5, p2:List<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>[expected:Collection<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>]))
        }
        
        goto(Label_0006)
    }
    
    private com.mojang.datafixers.util.Pair lambda$\uc238\u873d\u64ab\ud7e8\uc910\ua562$17(\ua562\ucb79\uc87f\u3dd3\ubcb0.\ufe34\u960f\ua6bd\u71f1\u516c p0) {
        var_2_61 : int
        var_4_6E : InputStream
        var_5_71 : Throwable
        var_6_C3 : Throwable
        var_9_E8 : Throwable
        stack_151_0 : String [generated]
        expr_122 : Object[] [generated]
        var_4_104 : Exception
        
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
        var_2_61 = and:int(ldc:int(1319205478), ldc:int(-822254748))
        
        try {
            var_2_61 = and:int(var_2_61:int, ldc:int(1593554127))
            var_4_6E = invokeinterface:InputStream(\ufe34\u960f\ua6bd\u71f1\u516c::\u494c\u9af2\u3a62\u67d0\uff55\uc9f6, p0:\ufe34\u960f\ua6bd\u71f1\u516c)
            var_5_71 = aconstnull:Throwable()
            
            try {
                return:Pair(invokestatic:Pair(Pair::of, invokeinterface:String[expected:Object](\ufe34\u960f\ua6bd\u71f1\u516c::\ufcaf\ua61f\uf995\u183a\ud523\uc3e3, p0:\ufe34\u960f\ua6bd\u71f1\u516c), invokestatic:\u3d64\u69d9\uc9f6\u3c25\u0a06\ubcb0(\u3d64\u69d9\uc9f6\u3c25\u0a06\ubcb0::\u3776\u3bc9\u40a9\ub113\u759a\u8308, getfield:\u12b2\uae87\uc238\u836c\uf995\u6ec6(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u6198\uc229\u8c8a\u3bd6\uc229\ub19c, this:\u6d99\u873d\ub18d\u446c\u8389\u5245), initobject:InputStreamReader(InputStreamReader::<init>, var_4_6E:InputStream, getstatic:Charset(StandardCharsets::UTF_8)))))
            }
            catch (java.lang.Throwable var_6_C3) {
                var_5_71 = var_6_C3:Throwable
                athrow(var_6_C3:Throwable)
            }
            finally {
                if (cmpne:boolean(var_4_6E:InputStream, aconstnull:InputStream())) {
                    if (cmpne:boolean(var_5_71:Throwable, aconstnull:Throwable())) {
                        try {
                            invokevirtual:void(InputStream::close, var_4_6E:InputStream)
                        }
                        catch (java.lang.Throwable var_9_E8) {
                            invokevirtual:void(Throwable::addSuppressed, var_5_71:Throwable, var_9_E8:Throwable)
                        }
                    }
                    else {
                        invokevirtual:void(InputStream::close, var_4_6E:InputStream)
                    }
                }
            }
        }
        catch (java.lang.Exception var_4_104) {
            stack_151_0 = loadelement:String(getstatic:String[](\u6d99\u873d\ub18d\u446c\u8389\u5245::\uc84e\ud523\ub70c\uc2bd\ub113\u71f1), and:int(ldc:int(21053), ldc:int(1189)))
            expr_122 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(-24544), ldc:int(-24541)))
            storeelement:Object(expr_122:Object[], and:int(ldc:int(-20323), ldc:int(3426)), invokeinterface:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\ufe34\u960f\ua6bd\u71f1\u516c::\u62da\u67e9\ua562\u51fa\u8d98\u6cfe, p0:\ufe34\u960f\ua6bd\u71f1\u516c))
            storeelement:Object(expr_122:Object[], and:int(ldc:int(3907), ldc:int(24593)), invokeinterface:String[expected:Object](\ufe34\u960f\ua6bd\u71f1\u516c::\ufcaf\ua61f\uf995\u183a\ud523\uc3e3, p0:\ufe34\u960f\ua6bd\u71f1\u516c))
            storeelement:Object(expr_122:Object[], and:int(ldc:int(16898), ldc:int(3491)), invokevirtual:String[expected:Object](Throwable::getMessage, var_4_104:Exception[expected:Throwable]))
            athrow(initobject:\u5bc4\ud158\uf94d\u71f1\u416d\ubb2b(\u5bc4\ud158\uf94d\u71f1\u416d\ubb2b::<init>, invokestatic:String(String::format, stack_151_0:String, expr_122:Object[])))
        }
    }
    
    private static \u3d64\u7af6\uae87\uc238\u7d52.\u416d\ud7e8\ud51e\u5d20\u8413\u92ee lambda$\ub171\ua068\u98a4\u92ee\u7e3f\u8d98$16(\u3d64\u7af6\uae87\uc238\u7d52.\u416d\ud7e8\ud51e\u5d20\u8413\u92ee p0) {
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
            return:\u416d\ud7e8\ud51e\u5d20\u8413\u92ee(p0:\u416d\ud7e8\ud51e\u5d20\u8413\u92ee)
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u759a\ua3b4\u3bc9\u392e\u516c\u7ce1$15(java.util.Map p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p2) {
        var_5_71 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        
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
            var_5_71 = checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(Map<\u71ae\u64ab\u718f\u9a18\uc31c\u7d52, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::put, p0:Map<\u71ae\u64ab\u718f\u9a18\uc31c\u7d52, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>, invokestatic:\u71ae\u64ab\u718f\u9a18\uc31c\u7d52(\uae5d\uafe7\u2dcc\u88c5\u6d69\u5140::\u965f\u76bc\ud523\ub32d\u6c52\u51b2, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, p2:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d), p2:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \u6b0d\u12cb\u156b\u4179\u8bb0.\ubcb0\ud4fe\uff55\u965f\u5f50\u9937 lambda$\u965f\u873d\u7330\u8df4\u600f\u93a2$14(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
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
            return:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937(invokevirtual:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u51b2\u72f1\ubcb0\uc87f\u2dcc\u92ee, checkcast:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a.class, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::\u3776\uc2bd\uc246\ufcaf\u4975\u0800, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u0800\u5d20\u946b\ubf56\u64f2\u9255), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\ua3b4\ub32d\u34df\ub113\u4d85\ub7dc$13(\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a p0, java.util.Map p1, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p2) {
        var_3_61 : int
        var_5_92 : Iterator<Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, V>>
        var_6_D8 : Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, V>
        
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
        var_3_61 = and:int(ldc:int(1187174209), ldc:int(-423561231))
        
        if (logicalor:boolean(cmpeq:boolean(p2:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, aconstnull:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d()), cmpne:boolean(p0:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, p2:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])))) {
            return:boolean(and:int[expected:boolean](ldc:int(20614), ldc:int(-20679)))
        }
        
        var_5_92 = invokeinterface:Iterator<Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, V>>(Set<Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, V>>::iterator, invokeinterface:Set<Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, V>>(Map<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, V>::entrySet, p1:Map<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, V>))
        
        loop {
            if (cmpne:boolean(and:int(var_3_61:int, ldc:int(65536)), ldc:int(0))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-383249122))
            }
            else {
                var_3_61 = and:int(var_3_61:int, ldc:int(1073383035))
                
                if (invokeinterface:boolean(Iterator<E>::hasNext, var_5_92:Iterator<Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, V>>)) {
                    var_6_D8 = checkcast:Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, V>(java.util.Map.Entry<\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, V>.class, invokeinterface:Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, V>(Iterator<Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, V>>::next, var_5_92:Iterator<Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, V>>))
                    
                    if (invokestatic:boolean(Objects::equals, invokevirtual:Object(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p2:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], checkcast:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>.class, invokeinterface:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>(Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, V>::getKey, var_6_D8:Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, V>))), invokeinterface:V(Entry<K, V>::getValue, var_6_D8:Entry<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, V>))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(1220800293))
                        loopcontinue()
                    }
                    
                    return:boolean(and:int[expected:boolean](ldc:int(20822), ldc:int(-23511)))
                }
            }
            
            if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(1048576)), ldc:int(0))) {
                return:boolean(xor:int[expected:boolean](ldc:int(8224), ldc:int(8225)))
            }
        }
    }
    
    private void lambda$\u8df4\u47c2\u392e\u12cb\uc3e3\ub171$12(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
        var_4_69 : \ua562\ud4fe\u647c\uc84e\u5245\u5f50
        var_5_82 : Exception
        
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
            var_4_69 = aconstnull:\ua562\ud4fe\u647c\uc84e\u5245\u5f50()
            
            try {
                var_4_69 = invokevirtual:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u12cb\u3e75\ucef1\uc3e3\uc7fe\ud7e8, this:\u6d99\u873d\ub18d\u446c\u8389\u5245, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, getstatic:\u6cfe\ub70c\u9af2\u4c2b\u7043\u3bc9[expected:\u34df\u40a9\u51b2\ub6ab\u4492\u4492](\u6cfe\ub70c\u9af2\u4c2b\u7043\u3bc9::\ua562\uceb8\uc29a\u4ab3\u5bc4\uc7fe))
            }
            catch (java.lang.Exception var_5_82) {
                invokeinterface:void(Logger::warn, getstatic:Logger(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u3dd3\u8d90\uc229\u3c25\u5654\ua61f), loadelement:String(getstatic:String[](\u6d99\u873d\ub18d\u446c\u8389\u5245::\uc84e\ud523\ub70c\uc2bd\ub113\u71f1), and:int(ldc:int(1575), ldc:int(25014))), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object], var_5_82:Exception[expected:Object])
            }
            
            if (cmpne:boolean(var_4_69:\ua562\ud4fe\u647c\uc84e\u5245\u5f50, aconstnull:\ua562\ud4fe\u647c\uc84e\u5245\u5f50())) {
                invokeinterface:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ua562\ud4fe\u647c\uc84e\u5245\u5f50>::put, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ua562\ud4fe\u647c\uc84e\u5245\u5f50>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\uf9c5\u3a62\uc2bd\u4492\u97e6\ub6ab, this:\u6d99\u873d\ub18d\u446c\u8389\u5245), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, var_4_69:\ua562\ud4fe\u647c\uc84e\u5245\u5f50)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u16f6\u34df\ub32d\u4bc8\u7873\ud171$11(com.mojang.datafixers.util.Pair p0) {
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
            invokeinterface:void(Logger::warn, getstatic:Logger(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u3dd3\u8d90\uc229\u3c25\u5654\ua61f), loadelement:String(getstatic:String[](\u6d99\u873d\ub18d\u446c\u8389\u5245::\uc84e\ud523\ub70c\uc2bd\ub113\u71f1), xor:int(ldc:int(533), ldc:int(562))), invokevirtual:Object(Pair::getFirst, p0:Pair), invokevirtual:Object(Pair::getSecond, p0:Pair))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u3bc9\u4c2b\u51fa\u8df4\u446c\ua6bd$10(com.mojang.datafixers.util.Pair p0) {
        var_1_61 : int
        stack_93_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(2075105244), ldc:int(2071927541))
            
            if (invokevirtual:boolean(String::equals, checkcast:String(java.lang.String.class, invokevirtual:Object[expected:String](Pair::getSecond, p0:Pair)), getstatic:String[expected:Object](\u6d99\u873d\ub18d\u446c\u8389\u5245::\u873d\u4cd9\ubcb0\u97b7\u8aa5\u8cae))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-555821355))
                stack_93_0 = and:int(ldc:int(25870), ldc:int(-28063))
            }
            else {
                stack_93_0 = xor:int(ldc:int(2817), ldc:int(2816))
            }
            
            return:boolean(stack_93_0:int)
        }
        
        goto(Label_0006)
    }
    
    private java.util.stream.Stream lambda$\u8413\u2dcc\u7ce1\ub1b9\u120d\u62da$9(java.util.Set p0, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ube23\uc31c\uc84e\uafe7\u3c25\uc31c p1) {
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
            return:Stream(invokeinterface:Stream<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>(Collection<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>::stream, invokeinterface:Collection<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>(\ube23\uc31c\uc84e\uafe7\u3c25\uc31c::\u12cb\ub70c\u72f1\ua6bd\u0c95\uff55, p1:\ube23\uc31c\uc84e\uafe7\u3c25\uc31c, invokedynamic:Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ube23\uc31c\uc84e\uafe7\u3c25\uc31c>(apply:(L\u56bd\u8413\u647c\u5bc4\ud158/\u6d99\u873d\ub18d\u446c\u8389\u5245;)Ljava/util/function/Function;, this:\u6d99\u873d\ub18d\u446c\u8389\u5245), p0:Set<Pair<String, String>>)))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ub70c\u6cfe\u99f7\u4d85\u8413\u8709$8(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0) {
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
            invokevirtual:void(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u8c8a\u8aa5\u9937\u9af2\u494c\u4c04, this:\u6d99\u873d\ub18d\u446c\u8389\u5245, invokestatic:\u71ae\u64ab\u718f\u9a18\uc31c\u7d52(\uae5d\uafe7\u2dcc\u88c5\u6d69\u5140::\u965f\u76bc\ud523\ub32d\u6c52\u51b2, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\uc84e\u4cd9\u8d98\u071d\u527a\ud12e$7(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, \u6b0d\u12cb\u156b\u4179\u8bb0.\ubcb0\ud4fe\uff55\u965f\u5f50\u9937 p1) {
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
    
    private void lambda$\uc3e3\u12b2\u8df4\ubff1\ube23\u9af2$6(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1) {
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
            invokevirtual:void(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u8c8a\u8aa5\u9937\u9af2\u494c\u4c04, this:\u6d99\u873d\ub18d\u446c\u8389\u5245, invokestatic:\u71ae\u64ab\u718f\u9a18\uc31c\u7d52(\uae5d\uafe7\u2dcc\u88c5\u6d69\u5140::\u965f\u76bc\ud523\ub32d\u6c52\u51b2, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ub113\uc9f6\u3e2a\u16f6\u4cd9\u0b8e$5(it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap p0) {
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
            invokevirtual:void(Object2IntOpenHashMap::defaultReturnValue, p0:Object2IntOpenHashMap, ldc:int(-1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ub8be\u5fe1\u5654\uf9c5\u6bb9\u446c$4(\u494c\u4975\ua068\u0c95\uc84e.\u69d9\uff55\u5bc4\u4492\u8cae\u61a4 p0) {
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
            putfield:String(\u69d9\uff55\u5bc4\u4492\u8cae\u61a4::\u12cb\ubf56\ucef1\u759a\u983f\u8df4, p0:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4, loadelement:String(getstatic:String[](\u6d99\u873d\ub18d\u446c\u8389\u5245::\uc84e\ud523\ub70c\uc2bd\ub113\u71f1), and:int(ldc:int(11176), ldc:int(1150))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\uceb8\u72f1\u759a\uc229\u93a2\u983f$3(\u494c\u4975\ua068\u0c95\uc84e.\u69d9\uff55\u5bc4\u4492\u8cae\u61a4 p0) {
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
            putfield:String(\u69d9\uff55\u5bc4\u4492\u8cae\u61a4::\u12cb\ubf56\ucef1\u759a\u983f\u8df4, p0:\u69d9\uff55\u5bc4\u4492\u8cae\u61a4, loadelement:String(getstatic:String[](\u6d99\u873d\ub18d\u446c\u8389\u5245::\uc84e\ud523\ub70c\uc2bd\ub113\u71f1), and:int(ldc:int(2105), ldc:int(25645))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ucfaf\u6b5f\u3711\ud171\ucef1\u4179$2(java.util.HashSet p0) {
        var_1_61 : int
        var_3_EA : Iterator<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>
        
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
            var_1_61 = and:int(ldc:int(1610652947), ldc:int(-998572629))
            invokevirtual:boolean(HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>::add, p0:HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>, getstatic:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u74b1\u5db4\u67e9\u3bd6\u0a06\u4c04))
            invokevirtual:boolean(HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>::add, p0:HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>, getstatic:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7(\u6d99\u873d\ub18d\u446c\u8389\u5245::\ua068\uc31c\uc84e\u2dcc\u927d\uc84e))
            invokevirtual:boolean(HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>::add, p0:HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>, getstatic:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7(\u6d99\u873d\ub18d\u446c\u8389\u5245::\uae87\u6cfe\uc3e3\ud4fe\ud12e\ubded))
            invokevirtual:boolean(HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>::add, p0:HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>, getstatic:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u8753\u7043\u6435\u516c\u67d0\u7af6))
            invokevirtual:boolean(HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>::add, p0:HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>, getstatic:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u5140\uc238\ub113\u5d20\u946b\u0a06))
            invokevirtual:boolean(HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>::add, p0:HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>, getstatic:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7(\u16f6\ub8be\u760c\u9a18\ud158\u16f6::\u4cd9\u6d69\u5d20\u47c2\u527a\uc7fe))
            invokevirtual:boolean(HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>::add, p0:HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>, getstatic:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7(\u6d69\u62da\u4179\u3d64\u7ce1\u40a9::\u4179\u527a\ud12e\u8753\u4ab3\uf9c5))
            invokevirtual:boolean(HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>::add, p0:HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>, getstatic:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7(\u6d69\u62da\u4179\u3d64\u7ce1\u40a9::\u34df\ubf56\u7873\u76bc\u3711\u446c))
            invokevirtual:boolean(HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>::add, p0:HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>, getstatic:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7(\u6d69\u62da\u4179\u3d64\u7ce1\u40a9::\u385b\u946b\u760c\ub171\ucb79\ua562))
            invokevirtual:boolean(HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>::add, p0:HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>, getstatic:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7(\u6d69\u62da\u4179\u3d64\u7ce1\u40a9::\u3bd6\uf995\ucef1\u8640\ub18d\u156b))
            invokevirtual:boolean(HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>::add, p0:HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>, getstatic:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7(\u6d69\u62da\u4179\u3d64\u7ce1\u40a9::\u1187\ud36e\ub1b9\u4f4a\u74b1\u74b1))
            invokevirtual:boolean(HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>::add, p0:HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>, getstatic:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7(\u6d69\u62da\u4179\u3d64\u7ce1\u40a9::\u120d\u34df\u7e3f\u4f52\u69d9\u93a2))
            invokevirtual:boolean(HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>::add, p0:HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>, getstatic:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7(\u6bb9\ub102\u3bc9\u88c5\u4d85\u8bb0::\u9937\u34df\uf9c5\ub1b9\u67e9\u7873))
            invokevirtual:boolean(HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>::add, p0:HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>, getstatic:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7(\u6d99\u873d\ub18d\u446c\u8389\u5245::\ubcb0\u8aa5\u9af2\u6ec6\u97e6\u8d90))
            invokevirtual:boolean(HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>::add, p0:HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>, getstatic:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7(\u6d99\u873d\ub18d\u446c\u8389\u5245::\ua562\u8d98\u8258\u5f50\u5245\u8389))
            invokevirtual:boolean(HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>::add, p0:HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>, getstatic:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u3a62\ubefe\uc9f6\uc3e3\u9255\u12cb))
            var_3_EA = invokeinterface:Iterator<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(List<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>::iterator, getstatic:List<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u6d99\u873d\ub18d\u446c\u8389\u5245::\u960f\ubcb0\ua3b4\u7049\ud36e\u3bc9))
            
            loop {
                var_1_61 = and:int(var_1_61:int, ldc:int(1129149439))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_3_EA:Iterator<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>))) {
                    looporswitchbreak()
                }
                
                invokevirtual:boolean(HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>::add, p0:HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>, initobject:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7(\ubcb0\ud171\u516c\u76bc\u8cae\u99f7::<init>, getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ud171\u156b\u0800\u36d3\ub8be\u760c::\u7043\u3e2a\u5d20\u52d3\u4e72\ub32d), checkcast:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753.class, invokeinterface:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Iterator<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>::next, var_3_EA:Iterator<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>))))
            }
            
            invokevirtual:boolean(HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>::add, p0:HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>, initobject:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7(\ubcb0\ud171\u516c\u76bc\u8cae\u99f7::<init>, getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ud171\u156b\u0800\u36d3\ub8be\u760c::\u7043\u3e2a\u5d20\u52d3\u4e72\ub32d), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ubb2b\u6b0d\u6c56\uc29a\u4e72::\u7043\ubf56\ubded\ufcaf\ud158\u3711)))
            invokevirtual:boolean(HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>::add, p0:HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>, initobject:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7(\ubcb0\ud171\u516c\u76bc\u8cae\u99f7::<init>, getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ud171\u156b\u0800\u36d3\ub8be\u760c::\u7043\u3e2a\u5d20\u52d3\u4e72\ub32d), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ubb2b\u6b0d\u6c56\uc29a\u4e72::\u69d9\u5bc4\u98a4\u4daf\u5db4\u8709)))
            invokevirtual:boolean(HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>::add, p0:HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>, initobject:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7(\ubcb0\ud171\u516c\u76bc\u8cae\u99f7::<init>, getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ud171\u156b\u0800\u36d3\ub8be\u760c::\u7043\u3e2a\u5d20\u52d3\u4e72\ub32d), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ubb2b\u6b0d\u6c56\uc29a\u4e72::\u494c\u6b0d\u494c\u4975\u8753\u8709)))
            invokevirtual:boolean(HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>::add, p0:HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>, initobject:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7(\ubcb0\ud171\u516c\u76bc\u8cae\u99f7::<init>, getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ud171\u156b\u0800\u36d3\ub8be\u760c::\u7043\u3e2a\u5d20\u52d3\u4e72\ub32d), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ubb2b\u6b0d\u6c56\uc29a\u4e72::\u51b2\u4f52\u8bb0\u120d\u960f\u36d3)))
            invokevirtual:boolean(HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>::add, p0:HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>, initobject:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7(\ubcb0\ud171\u516c\u76bc\u8cae\u99f7::<init>, getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ud171\u156b\u0800\u36d3\ub8be\u760c::\u7043\u3e2a\u5d20\u52d3\u4e72\ub32d), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ubb2b\u6b0d\u6c56\uc29a\u4e72::\u8753\u8640\ubefe\u392e\u873d\uceb8)))
            invokestatic:void(\uf995\u3e75\u946b\uf995\u4c2b\ucfaf::\u7006\uc84e\ucfaf\ua6bd\u965f\u416d, invokedynamic:Consumer<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>(accept:(Ljava/util/HashSet;)Ljava/util/function/Consumer;, p0:HashSet<\ubcb0\ud171\u516c\u76bc\u8cae\u99f7>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 lambda$\ud51e\u56bd\uc3e3\u965f\ub113\u71f1$1(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
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
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u6d99\u873d\ub18d\u446c\u8389\u5245::\uc84e\ud523\ub70c\uc2bd\ub113\u71f1), xor:int(ldc:int(-12245), ldc:int(-12287)))), invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u3776\ubded\u88c5\u647c\u40a9\u494c, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)), loadelement:String(getstatic:String[](\u6d99\u873d\ub18d\u446c\u8389\u5245::\uc84e\ud523\ub70c\uc2bd\ub113\u71f1), xor:int(ldc:int(16546), ldc:int(16514)))))))
        }
        
        goto(Label_0006)
    }
    
    private static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 lambda$\ub18d\u3e75\u8aa5\ub1b9\ub83f\ud12e$0(int p0) {
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
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u6d99\u873d\ub18d\u446c\u8389\u5245::\uc84e\ud523\ub70c\uc2bd\ub113\u71f1), xor:int(ldc:int(5291), ldc:int(5248)))), p0:int))))
        }
        
        goto(Label_0006)
    }
    
    static {
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
    
    public void \u7c6b\ua61f\ub7dc\u983f\u8c8a\u6c52(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_645 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_650 : int
        
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
        var_3_645 = and:int(ldc:int(-1403366355), ldc:int(-270870952))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6d99\u873d\ub18d\u446c\u8389\u5245[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(4096)), ldc:int(0))) {
            var_3_645 = and:int(var_3_645:int, ldc:int(-1991423507))
        }
        else {
            var_3_645 = and:int(var_3_645:int, ldc:int(-285516401))
            var_5_8A = and:int(ldc:int(-21357), ldc:int(876))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(17561), ldc:int(-21660)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_645:int, ldc:int(-379685527))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(8195), ldc:int(4481)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(24834), ldc:int(24835)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_645 = and:int(var_3_E3:int, ldc:int(-42207431))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(-31739), ldc:int(-31740)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1514)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1368)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(39797120))
                        goto(Label_1228)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1017592263))
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(128)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1587502584))
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0846)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-966320561))
                        goto(Label_0727)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-632354751))
                        goto(Label_0606)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-111444161))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0606)
                            }
                            
                            goto(Label_0846)
                        }
                    }
                    
                    Label_0424:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1025140387))
                        goto(Label_1514)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1399793807))
                        goto(Label_1368)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1228)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1618398577))
                        goto(Label_1107)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1613268310))
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1797507607))
                        goto(Label_0846)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0727)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(136891019))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1376059729))
                            var_11_F4 = and:int(ldc:int(3224), ldc:int(-3225))
                            goto(Label_1503)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0606:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1514)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(2087860494))
                        goto(Label_1368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(2045339015))
                        goto(Label_1228)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1107)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-867430981))
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0846)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1819820075))
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1082206936))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0846)
                        }
                    }
                    
                    Label_0727:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1514)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1525336400))
                        goto(Label_1368)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1228)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1107)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-284535997))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0606)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1681427352))
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(-319072470))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0846:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1514)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1368)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1228)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(619264260))
                        goto(Label_1107)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1647185527))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0727)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0606)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(-362818001))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = xor:int(ldc:int(-32704), ldc:int(-32703))
                                goto(Label_1107)
                            }
                        }
                    }
                    
                    Label_0950:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1514)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1368)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1228)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-739963650))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0846)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0727)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(1129815474))
                            goto(Label_0606)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(256)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(1630208185))
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(1836679542))
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1386481953))
                        var_11_F4 = and:int(ldc:int(-21795), ldc:int(21792))
                    }
                    
                    Label_1107:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(128)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1315331799))
                        goto(Label_1514)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1647744620))
                        goto(Label_1368)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0950)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0846)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(1570573389))
                            goto(Label_0727)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0606)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(276501099))
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1342286020))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1368)
                            }
                        }
                    }
                    
                    Label_1228:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1121594703))
                        goto(Label_1514)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1419343864))
                            goto(Label_1107)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0950)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0846)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-2076716421))
                            goto(Label_0727)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1706038229))
                            goto(Label_0606)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1891948768))
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(-379882104))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1503)
                    }
                    
                    Label_1368:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(842011890))
                        goto(Label_1514)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(267982957))
                        goto(Label_1228)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1107)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1571407619))
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0846)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0727)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1781016043))
                        goto(Label_0606)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0424)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_645 = and:int(var_3_645:int, ldc:int(-304423349))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1503:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_650 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1514:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1228)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(64)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-789609691))
                        goto(Label_1107)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0846)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0727)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0606)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0424)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(128)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1076209685))
                        var_17_650 = add:int(var_16_122:int, xor:int(ldc:int(3), ldc:int(2)))
                        looporswitchbreak()
                    }
                    
                    var_3_645 = and:int(var_3_645:int, ldc:int(1518368211))
                }
                
                var_3_645 = and:int(var_3_645:int, ldc:int(-379912821))
                
                if (cmple:boolean(var_5_8A = var_17_650:int, sub:int(var_6_91:int, and:int(ldc:int(13), ldc:int(27779))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(16384)), ldc:int(0))) {
            var_3_645 = and:int(var_3_645:int, ldc:int(-478338132))
            goto(Label_0108)
        }
    }
}
