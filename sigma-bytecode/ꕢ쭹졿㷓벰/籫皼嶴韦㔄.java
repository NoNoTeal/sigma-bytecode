public class \ua562\ucb79\uc87f\u3dd3\ubcb0.\u7c6b\u76bc\u5db4\u97e6\u3504 {
    public void \u7c6b\u76bc\u5db4\u97e6\u3504() {
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
            invokespecial:\u0c95\u8cae\u67e9\u67e9\ub18d(\u0c95\u8cae\u67e9\u67e9\ub18d::<init>, this:\u7c6b\u76bc\u5db4\u97e6\u3504)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Set<\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\ud36e\u4bc8\u6d69\u92ee\ubb2b<?>> \u3504\u8258\u1833\uc246\u98a4\u6cfe() {
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
            return:Set<\ud36e\u4bc8\u6d69\u92ee\ubb2b<?>>(invokestatic:ImmutableSet[expected:Set<\ud36e\u4bc8\u6d69\u92ee\ubb2b<?>>](ImmutableSet::of, getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\u8bb0\u40a9\u74b1\ube23\u76bc>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\ud171\u3e2a\u9937\u56bd\u5fe1\u983f), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<List<\ube23\u67d0\u64f2\u839e\u76bc>>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u759a\ub7dc\u4ab3\u8753\ufe34\u56bd)))
        }
        
        goto(Label_0006)
    }
    
    public void \u36d3\u120d\u3bc9\uf94d\u6d69\u0b8e(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u8bb0\u40a9\u74b1\ube23\u76bc p1) {
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
    
    private void \u2dcc\u6c56\u97e6\ufcaf\u8bb0\u6198(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u8bb0\u40a9\u74b1\ube23\u76bc p0, java.util.List<\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc> p1) {
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
    
    public void \u36d3\u120d\u3bc9\uf94d\u6d69\u0b8e(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
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
            invokevirtual:void(\u7c6b\u76bc\u5db4\u97e6\u3504::\u36d3\u120d\u3bc9\uf94d\u6d69\u0b8e, this:\u7c6b\u76bc\u5db4\u97e6\u3504, p0:\ube23\uc238\u5140\u4cd9\u8aa5, checkcast:\u8bb0\u40a9\u74b1\ube23\u76bc(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u8bb0\u40a9\u74b1\ube23\u76bc.class, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u8bb0\u40a9\u74b1\ube23\u76bc]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u76bc\ub19c\u3e2a\uf995\u0a06\ud7e8$3(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u8bb0\u40a9\u74b1\ube23\u76bc p0) {
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
            var_1_5F = and:int(ldc:int(-249422404), ldc:int(-719317508))
            
            if (invokevirtual:boolean(\u8bb0\u40a9\u74b1\ube23\u76bc::\u527a\u34df\u4bc8\ub8be\u965f\u836c, p0:\u8bb0\u40a9\u74b1\ube23\u76bc)) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1418567550))
                stack_86_0 = and:int(ldc:int(-15931), ldc:int(13866))
            }
            else {
                stack_86_0 = and:int(ldc:int(2083), ldc:int(12305))
            }
            
            return:boolean(stack_86_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u8bb0\u40a9\u74b1\ube23\u76bc lambda$\u9af2\u5fe1\uc2bd\u4e72\ud51e\u7af6$2(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
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
            return:\u8bb0\u40a9\u74b1\ube23\u76bc(checkcast:\u8bb0\u40a9\u74b1\ube23\u76bc(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u8bb0\u40a9\u74b1\ube23\u76bc.class, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u8bb0\u40a9\u74b1\ube23\u76bc]))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u52d3\ub70c\u3dd3\u5654\ua3b4\u0a06$1(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u8bb0\u40a9\u74b1\ube23\u76bc p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
        var_2_5F : int
        stack_8A_0 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(1235946258), ldc:int(-1447353407))
            
            if (cmpne:boolean(invokevirtual:\u9255\u0c95\u4cd9\ube23\u760c<?>(\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\ud523\ub171\u4975\u516c\uf995, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), invokevirtual:\u9255\u0c95\u4cd9\ube23\u760c<?>(\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\ud523\ub171\u4975\u516c\uf995, p0:\u8bb0\u40a9\u74b1\ube23\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-541640824))
                stack_8A_0 = and:int(ldc:int(4246), ldc:int(-4247))
            }
            else {
                stack_8A_0 = xor:int(ldc:int(136), ldc:int(137))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ucb79\ud217\u4d85\u760c\u64f2\uf995$0(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u8bb0\u40a9\u74b1\ube23\u76bc p0, java.util.List p1) {
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
            invokespecial:void(\u7c6b\u76bc\u5db4\u97e6\u3504::\u2dcc\u6c56\u97e6\ufcaf\u8bb0\u6198, this:\u7c6b\u76bc\u5db4\u97e6\u3504, p0:\u8bb0\u40a9\u74b1\ube23\u76bc, p1:List<\ube23\u67d0\u64f2\u839e\u76bc>)
            return:void()
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
    
    public void \ud171\uc910\ubff1\uc31c\u9937\u2dcc(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_662 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_66D : int
        
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
        var_3_662 = and:int(ldc:int(-1948676325), ldc:int(-2032881771))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7c6b\u76bc\u5db4\u97e6\u3504[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_662:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_662 = and:int(var_3_662:int, ldc:int(1372258060))
        }
        else {
            var_3_662 = and:int(var_3_662:int, ldc:int(-1075340335))
            var_5_85 = and:int(ldc:int(-20493), ldc:int(20492))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(18185), ldc:int(-18314)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_662:int, ldc:int(-1883141869))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(2049), ldc:int(2048)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(17451), ldc:int(8837)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_662 = and:int(var_3_D2:int, ldc:int(-352482863))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(1025), ldc:int(1024)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1515)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1351)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(32)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-1626353767))
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0932)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0803)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-1800967720))
                        goto(Label_0666)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0543)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-1898193127))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0543)
                            }
                            
                            goto(Label_0803)
                        }
                    }
                    
                    Label_0380:
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1515)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1351)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(655568192))
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-590216527))
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-174193590))
                        goto(Label_0932)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(937003321))
                        goto(Label_0803)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0666)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_662 = and:int(var_3_662:int, ldc:int(-422082117))
                            var_11_E3 = and:int(ldc:int(-8638), ldc:int(8605))
                            goto(Label_1504)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0543:
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1515)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-1249903984))
                        goto(Label_1351)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0932)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-735044152))
                        goto(Label_0803)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(1)), ldc:int(0))) {
                            var_3_662 = and:int(var_3_662:int, ldc:int(116229929))
                            goto(Label_0380)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_662 = and:int(var_3_662:int, ldc:int(2110019410))
                            loopcontinue()
                        }
                        
                        var_3_662 = and:int(var_3_662:int, ldc:int(-1258500805))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0803)
                        }
                    }
                    
                    Label_0666:
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1515)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1351)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(1991299700))
                        goto(Label_1090)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-1341742334))
                        goto(Label_0932)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(16)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(46159921))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_662:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_662 = and:int(var_3_662:int, ldc:int(1225067067))
                            goto(Label_0543)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(256)), ldc:int(0))) {
                            var_3_662 = and:int(var_3_662:int, ldc:int(1177701264))
                            goto(Label_0380)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_662:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_662 = and:int(var_3_662:int, ldc:int(-453256811))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0803:
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1515)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1351)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-1676335741))
                        goto(Label_1090)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(921520740))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_662 = and:int(var_3_662:int, ldc:int(301199050))
                            goto(Label_0666)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_662 = and:int(var_3_662:int, ldc:int(867104533))
                            goto(Label_0543)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0380)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_662 = and:int(var_3_662:int, ldc:int(-684921930))
                            loopcontinue()
                        }
                        
                        var_3_662 = and:int(var_3_662:int, ldc:int(-588608683))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(6224), ldc:int(6225))
                                goto(Label_1090)
                            }
                        }
                    }
                    
                    Label_0932:
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-450548798))
                        goto(Label_1515)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1351)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-128760091))
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-1919649420))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0803)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_662:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0666)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_662:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_662 = and:int(var_3_662:int, ldc:int(-870652231))
                            goto(Label_0543)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0380)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_662:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_662 = and:int(var_3_662:int, ldc:int(-1376137731))
                        var_11_E3 = and:int(ldc:int(-9015), ldc:int(9012))
                    }
                    
                    Label_1090:
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1515)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1351)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_662:int, ldc:int(32)), ldc:int(0))) {
                            var_3_662 = and:int(var_3_662:int, ldc:int(35053565))
                            goto(Label_0932)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_662:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0803)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_662:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_662 = and:int(var_3_662:int, ldc:int(1609124584))
                            goto(Label_0666)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_662:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_662 = and:int(var_3_662:int, ldc:int(-39112275))
                            goto(Label_0543)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0380)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_662:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_662 = and:int(var_3_662:int, ldc:int(-1537361988))
                            loopcontinue()
                        }
                        
                        var_3_662 = and:int(var_3_662:int, ldc:int(-507388143))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1351)
                            }
                        }
                    }
                    
                    Label_1209:
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(1117796287))
                        goto(Label_1515)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(32)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-72784480))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1090)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(16)), ldc:int(0))) {
                            var_3_662 = and:int(var_3_662:int, ldc:int(-481403790))
                            goto(Label_0932)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_662 = and:int(var_3_662:int, ldc:int(1467083384))
                            goto(Label_0803)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_662:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0666)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_662:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0543)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_662:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0380)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_662 = and:int(var_3_662:int, ldc:int(689064042))
                            loopcontinue()
                        }
                        
                        var_3_662 = and:int(var_3_662:int, ldc:int(-487482093))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1504)
                    }
                    
                    Label_1351:
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-1066942693))
                        goto(Label_1515)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-1755650897))
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-748373997))
                        goto(Label_0932)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0803)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-1609412746))
                        goto(Label_0666)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(16)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-1912108544))
                        goto(Label_0543)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(811781877))
                        goto(Label_0380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_662 = and:int(var_3_662:int, ldc:int(-1208317607))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1504:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66D = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1515:
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1351)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(1904059403))
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(1795454911))
                        goto(Label_0932)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0803)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_662:int, ldc:int(32)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-143944760))
                        goto(Label_0666)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(16)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-281754241))
                        goto(Label_0543)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(2112032322))
                        goto(Label_0380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_662:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_662 = and:int(var_3_662:int, ldc:int(-1863918287))
                        var_17_66D = add:int(var_16_111:int, xor:int(ldc:int(576), ldc:int(577)))
                        looporswitchbreak()
                    }
                }
                
                var_3_662 = and:int(var_3_662:int, ldc:int(-1309827693))
                
                if (cmple:boolean(var_5_85 = var_17_66D:int, sub:int(var_6_8C:int, xor:int(ldc:int(2448), ldc:int(2449))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_662:int, ldc:int(1)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
