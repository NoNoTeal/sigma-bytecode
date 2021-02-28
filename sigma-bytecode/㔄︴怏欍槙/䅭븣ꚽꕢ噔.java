public class \u3504\ufe34\u600f\u6b0d\u69d9.\u416d\ube23\ua6bd\ua562\u5654 {
    public void \u416d\ube23\ua6bd\ua562\u5654(\u927d\u92ff\u71ae\uafe7\u6bb9.\u8aa5\u8d90\u5bc4\u3504\u16f6 p0) {
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
            invokespecial:\uc87f\ub70c\uc87f\ubb2b\u0c95(\uc87f\ub70c\uc87f\ubb2b\u0c95::<init>, this:\u416d\ube23\ua6bd\ua562\u5654)
            putfield:\u8aa5\u8d90\u5bc4\u3504\u16f6(\u416d\ube23\ua6bd\ua562\u5654::\u6d99\u9a18\uc87f\u4e72\u0b8e\u64ab, this:\u416d\ube23\ua6bd\ua562\u5654, p0:\u8aa5\u8d90\u5bc4\u3504\u16f6)
            putfield:int(\u416d\ube23\ua6bd\ua562\u5654::\u8308\ub1b9\u6fb0\u34df\u6cfe\uf995, this:\u416d\ube23\ua6bd\ua562\u5654, invokevirtual:int(\u416d\ube23\ua6bd\ua562\u5654::\u8cae\uc3e3\u12b2\u9033\u8258\u59ec, this:\u416d\ube23\ua6bd\ua562\u5654, p0:\u8aa5\u8d90\u5bc4\u3504\u16f6))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u8cae\uc3e3\u12b2\u9033\u8258\u59ec(\u927d\u92ff\u71ae\uafe7\u6bb9.\u8aa5\u8d90\u5bc4\u3504\u16f6 p0) {
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
            return:int(add:int(xor:int(ldc:int(2572), ldc:int(2756)), rem:int(invokevirtual:int(Random::nextInt, invokevirtual:Random(\ube23\u67d0\u64f2\u839e\u76bc::\u4daf\u446c\ubcb0\u759a\ua562\u5245, p0:\u8aa5\u8d90\u5bc4\u3504\u16f6[expected:\ube23\u67d0\u64f2\u839e\u76bc]), and:int(ldc:int(8444), ldc:int(18379))), ldc:int(20))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u62da\u0b8e\u5f50\u718f\u7ce1\ud523() {
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
    
    public boolean \u3d4b\u0b8e\u61a4\u12b2\uff55\u965f() {
        var_1_5F : int
        stack_9A_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(1564892660), ldc:int(2113284087))
            
            if (logicaland:boolean(invokevirtual:boolean(\u8aa5\u8d90\u5bc4\u3504\u16f6::\uc7fe\u4cd9\u3d64\uc4d2\u8cae\u6435, getfield:\u8aa5\u8d90\u5bc4\u3504\u16f6(\u416d\ube23\ua6bd\ua562\u5654::\u6d99\u9a18\uc87f\u4e72\u0b8e\u64ab, this:\u416d\ube23\ua6bd\ua562\u5654)), invokevirtual:boolean(\u8aa5\u8d90\u5bc4\u3504\u16f6::\u34df\u156b\u6198\ud51e\u5245\u98a4, getfield:\u8aa5\u8d90\u5bc4\u3504\u16f6(\u416d\ube23\ua6bd\ua562\u5654::\u6d99\u9a18\uc87f\u4e72\u0b8e\u64ab, this:\u416d\ube23\ua6bd\ua562\u5654)))) {
                stack_9A_0 = xor:int(ldc:int(420), ldc:int(421))
            }
            else {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-47796243))
                stack_9A_0 = and:int(ldc:int(-31537), ldc:int(31520))
            }
            
            return:boolean(stack_9A_0:int)
        }
        
        goto(Label_0006)
    }
    
    public void \ub7dc\u4c2b\ud523\ube23\u416d\u3776() {
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
            putfield:int(\u416d\ube23\ua6bd\ua562\u5654::\uc2e8\u51fa\uc2e8\u51b2\u5bc4\u64ab, this:\u416d\ube23\ua6bd\ua562\u5654, and:int(ldc:int(9765), ldc:int(-13862)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7bad\u74b1\uc3e3\u760c\u4f52\u6c56() {
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
            invokevirtual:void(\u8aa5\u8d90\u5bc4\u3504\u16f6::\u97b7\ub1b9\u4f52\u873d\ubb2b\u9937, getfield:\u8aa5\u8d90\u5bc4\u3504\u16f6(\u416d\ube23\ua6bd\ua562\u5654::\u6d99\u9a18\uc87f\u4e72\u0b8e\u64ab, this:\u416d\ube23\ua6bd\ua562\u5654))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4c04\u74b1\u0800\u3a62\uafe7\u718f() {
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
            
            if (cmple:boolean(putfield:int(\u416d\ube23\ua6bd\ua562\u5654::\uc2e8\u51fa\uc2e8\u51b2\u5bc4\u64ab, this:\u416d\ube23\ua6bd\ua562\u5654, sub:int(getfield:int(\u416d\ube23\ua6bd\ua562\u5654::\uc2e8\u51fa\uc2e8\u51b2\u5bc4\u64ab, this:\u416d\ube23\ua6bd\ua562\u5654), and:int(ldc:int(18885), ldc:int(1025)))), ldc:int(0))) {
                putfield:int(\u416d\ube23\ua6bd\ua562\u5654::\uc2e8\u51fa\uc2e8\u51b2\u5bc4\u64ab, this:\u416d\ube23\ua6bd\ua562\u5654, ldc:int(10))
                invokevirtual:void(\u8aa5\u8d90\u5bc4\u3504\u16f6::\ub1b9\u9255\u8c8a\u4975\u927d\ucef1, getfield:\u8aa5\u8d90\u5bc4\u3504\u16f6(\u416d\ube23\ua6bd\ua562\u5654::\u6d99\u9a18\uc87f\u4e72\u0b8e\u64ab, this:\u416d\ube23\ua6bd\ua562\u5654))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u5245\ub1b9\u4e72\ua562\uc246\uc4d2$1(\u927d\u92ff\u71ae\uafe7\u6bb9.\u8aa5\u8d90\u5bc4\u3504\u16f6 p0) {
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
            var_1_5F = and:int(ldc:int(735844162), ldc:int(1878392600))
            
            if (invokevirtual:boolean(\u8aa5\u8d90\u5bc4\u3504\u16f6::\uc7fe\u4cd9\u3d64\uc4d2\u8cae\u6435, p0:\u8aa5\u8d90\u5bc4\u3504\u16f6)) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1540754581))
                stack_86_0 = and:int(ldc:int(11888), ldc:int(-11889))
            }
            else {
                stack_86_0 = and:int(ldc:int(1), ldc:int(28901))
            }
            
            return:boolean(stack_86_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\uf94d\ud7e8\u836c\u183a\u8640\u839e$0(\u927d\u92ff\u71ae\uafe7\u6bb9.\u8aa5\u8d90\u5bc4\u3504\u16f6 p0) {
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
            return:boolean(ternaryop:int[expected:boolean](logicaland:boolean(logicalnot:boolean(invokevirtual:boolean(\u8aa5\u8d90\u5bc4\u3504\u16f6::\ub102\uc29a\u1833\ufe34\ud4fe\u12b2, p0:\u8aa5\u8d90\u5bc4\u3504\u16f6)), invokevirtual:boolean(\u8aa5\u8d90\u5bc4\u3504\u16f6::\uc7fe\u4cd9\u3d64\uc4d2\u8cae\u6435, p0:\u8aa5\u8d90\u5bc4\u3504\u16f6)), and:int(ldc:int(-8946), ldc:int(8945)), xor:int(ldc:int(-32704), ldc:int(-32703))))
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
    
    public void \ub8be\u4c2b\u071d\ub70c\ubded\u6d99(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_653 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_65E : int
        
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
        var_3_653 = and:int(ldc:int(-1670319360), ldc:int(-696485941))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u416d\ube23\ua6bd\ua562\u5654[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(512)), ldc:int(0))) {
            var_3_653 = and:int(var_3_653:int, ldc:int(-564823217))
            var_5_7D = and:int(ldc:int(8345), ldc:int(-8410))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(6914), ldc:int(-15123)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_653:int, ldc:int(-571280753))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(1668), ldc:int(1669)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(24705), ldc:int(51)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_653 = and:int(var_3_D2:int, ldc:int(-1134709953))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(2921), ldc:int(1041)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1326)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1320564683))
                        goto(Label_1088)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-440352308))
                        goto(Label_0912)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(381358733))
                        goto(Label_0807)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0670)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1802228187))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(8)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1784939642))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0807)
                        }
                    }
                    
                    Label_0403:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1326)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1088)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(128)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-579482510))
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-967244511))
                        goto(Label_0670)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-199675256))
                            var_11_E3 = and:int(ldc:int(21712), ldc:int(-21973))
                            goto(Label_1479)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1783321896))
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1529529929))
                        goto(Label_1326)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1330594338))
                        goto(Label_1212)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1088)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-476858461))
                            goto(Label_0403)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(-732103980))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0807)
                        }
                    }
                    
                    Label_0670:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1356401341))
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(512)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(57258375))
                        goto(Label_1326)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-646946843))
                        goto(Label_1212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1088)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-310644004))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0403)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-953216483))
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1744995615))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0807:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1326)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(512)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1003571019))
                        goto(Label_1088)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0670)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-832608714))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0403)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1663830400))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(28929), ldc:int(115))
                                goto(Label_1088)
                            }
                        }
                    }
                    
                    Label_0912:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1728949870))
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(355238340))
                        goto(Label_1326)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(594810438))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(991199967))
                            goto(Label_0807)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-1782254370))
                            goto(Label_0670)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-214682823))
                            goto(Label_0403)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(-723830114))
                        var_11_E3 = and:int(ldc:int(-29970), ldc:int(29713))
                    }
                    
                    Label_1088:
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1282596632))
                        goto(Label_1326)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(128)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-816662249))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-327720910))
                            goto(Label_0912)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0807)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0670)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0403)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-1637683967))
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(-151226449))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1326)
                            }
                        }
                    }
                    
                    Label_1212:
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_1088)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0912)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-1487699365))
                            goto(Label_0807)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(363239659))
                            goto(Label_0670)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0403)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-1673528411))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1479)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1326:
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-739721159))
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1382911426))
                        goto(Label_1212)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1088)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1921518231))
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(2076322381))
                        goto(Label_0670)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-529992027))
                        goto(Label_0403)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1584098582))
                        loopcontinue()
                    }
                    
                    var_3_653 = and:int(var_3_653:int, ldc:int(-570442997))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1479:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_65E = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1490:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-941952932))
                        goto(Label_1326)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(128)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(317895150))
                        goto(Label_1088)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-300080248))
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1895154211))
                        goto(Label_0807)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(613809724))
                        goto(Label_0670)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(128)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(982786598))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0403)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(128)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1090898258))
                        var_17_65E = add:int(var_16_111:int, xor:int(ldc:int(-32478), ldc:int(-32477)))
                        looporswitchbreak()
                    }
                }
                
                var_3_653 = and:int(var_3_653:int, ldc:int(-163905910))
                
                if (cmple:boolean(var_5_7D = var_17_65E:int, sub:int(var_6_84:int, xor:int(ldc:int(-12256), ldc:int(-12255))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_653 = and:int(var_3_653:int, ldc:int(-1819600614))
            goto(Label_0106)
        }
    }
}
