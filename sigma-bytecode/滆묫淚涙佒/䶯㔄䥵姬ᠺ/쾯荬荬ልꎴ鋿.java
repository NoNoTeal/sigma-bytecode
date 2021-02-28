public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\ucfaf\u836c\u836c\u120d\ua3b4\u92ff {
    public void \ucfaf\u836c\u836c\u120d\ua3b4\u92ff(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\ucfaf\u836c\u836c\u120d\ua3b4\u92ff p1, \u5d20\u7043\u88c5\u5db4\uf94d.\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f p2, \u927d\u92ff\u71ae\uafe7\u6bb9.\u7e3f\u516c\ud217\ube23\u52d3\ud36e p3, java.util.Map<java.lang.String, \u6435\ub8be\u718f\u6b0d\u67e9.\u12b2\u0b8e\u3776\u120d\ub113\ubefe> p4, java.lang.String[][] p5) {
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
    
    public \u5d20\u7043\u88c5\u5db4\uf94d.\u3e75\u0800\u40a9\u3d4b\u8cae\u3d4b \uc7fe\u7ce1\u760c\uceb8\u8308\uc29a() {
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
            return:\u3e75\u0800\u40a9\u3d4b\u8cae\u3d4b(initobject:\u3e75\u0800\u40a9\u3d4b\u8cae\u3d4b(\u3e75\u0800\u40a9\u3d4b\u8cae\u3d4b::<init>, ternaryop:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(cmpne:boolean(getfield:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff(\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u3e75\u5fe1\ubcb0\ua3b4\ub18d\u494c, this:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff), aconstnull:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff()), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u5d20\ubb2b\u97b7\u74b1\u983f\u4ab3, getfield:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff(\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u3e75\u5fe1\ubcb0\ua3b4\ub18d\u494c, this:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff)), aconstnull:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753()), getfield:\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f(\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\uc2bd\uc238\u6d99\ud158\ub19c\u92ee, this:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff), getfield:\u7e3f\u516c\ud217\ube23\u52d3\ud36e(\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u12b2\ubefe\u600f\ub32d\uf9c5\u6fb0, this:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff), getfield:Map<String, \u12b2\u0b8e\u3776\u120d\ub113\ubefe>(\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u9af2\u3c25\ucef1\ud217\u6b5f\u5f50, this:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff), getfield:String[][](\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u3d4b\u12cb\u67e9\u4f52\u8258\u8bb0, this:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff), aconstnull:\u3c25\u624e\u6d69\u0800\u61a4\u92ee()))
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\ucfaf\u836c\u836c\u120d\ua3b4\u92ff \ubff1\u6b5f\u4f52\u1833\u7873\ubded() {
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
            return:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff(getfield:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff(\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u3e75\u5fe1\ubcb0\ua3b4\ub18d\u494c, this:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff))
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u7043\u88c5\u5db4\uf94d.\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f \u71ae\u5fe1\u8c8a\u5d20\u6198\u7043() {
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
            return:\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f(getfield:\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f(\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\uc2bd\uc238\u6d99\ud158\ub19c\u92ee, this:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff))
        }
        
        goto(Label_0006)
    }
    
    public \u927d\u92ff\u71ae\uafe7\u6bb9.\u7e3f\u516c\ud217\ube23\u52d3\ud36e \u6198\u4d85\u0a06\u647c\uc246\u8640() {
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
            return:\u7e3f\u516c\ud217\ube23\u52d3\ud36e(getfield:\u7e3f\u516c\ud217\ube23\u52d3\ud36e(\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u12b2\ubefe\u600f\ub32d\uf9c5\u6fb0, this:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff))
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u624e\u516c\u3a62\u74b1\u446c\u51b2), and:int(ldc:int(16971), ldc:int(1313)))), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u5d20\ubb2b\u97b7\u74b1\u983f\u4ab3, this:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff)), loadelement:String(getstatic:String[](\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u624e\u516c\u3a62\u74b1\u446c\u51b2), and:int(ldc:int(24834), ldc:int(5138)))), ternaryop:Object(cmpne:boolean(getfield:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff(\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u3e75\u5fe1\ubcb0\ua3b4\ub18d\u494c, this:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff), aconstnull:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff()), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u5d20\ubb2b\u97b7\u74b1\u983f\u4ab3, getfield:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff(\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u3e75\u5fe1\ubcb0\ua3b4\ub18d\u494c, this:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff)), loadelement:String[expected:Object](getstatic:String[](\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u624e\u516c\u3a62\u74b1\u446c\u51b2), xor:int(ldc:int(4101), ldc:int(4102))))), loadelement:String(getstatic:String[](\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u624e\u516c\u3a62\u74b1\u446c\u51b2), and:int(ldc:int(260), ldc:int(2606)))), getfield:\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f[expected:Object](\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\uc2bd\uc238\u6d99\ud158\ub19c\u92ee, this:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff)), loadelement:String(getstatic:String[](\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u624e\u516c\u3a62\u74b1\u446c\u51b2), xor:int(ldc:int(18434), ldc:int(18439)))), getfield:\u7e3f\u516c\ud217\ube23\u52d3\ud36e[expected:Object](\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u12b2\ubefe\u600f\ub32d\uf9c5\u6fb0, this:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff)), loadelement:String(getstatic:String[](\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u624e\u516c\u3a62\u74b1\u446c\u51b2), xor:int(ldc:int(19489), ldc:int(19495)))), getfield:Map<String, \u12b2\u0b8e\u3776\u120d\ub113\ubefe>[expected:Object](\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u9af2\u3c25\ucef1\ud217\u6b5f\u5f50, this:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff)), loadelement:String(getstatic:String[](\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u624e\u516c\u3a62\u74b1\u446c\u51b2), xor:int(ldc:int(-22523), ldc:int(-22526)))), invokestatic:String(Arrays::deepToString, getfield:String[][][expected:Object[]](\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u3d4b\u12cb\u67e9\u4f52\u8258\u8bb0, this:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff))), ldc:char(125))))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Iterable<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\ucfaf\u836c\u836c\u120d\ua3b4\u92ff> \ufe34\u34df\ud51e\u64f2\u6d69\u12cb() {
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
            return:Iterable<\ucfaf\u836c\u836c\u120d\ua3b4\u92ff>(getfield:Set<\ucfaf\u836c\u836c\u120d\ua3b4\u92ff>[expected:Iterable<\ucfaf\u836c\u836c\u120d\ua3b4\u92ff>](\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u64f2\ucfaf\uf995\u4c04\u4daf\u7bad, this:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Map<java.lang.String, \u6435\ub8be\u718f\u6b0d\u67e9.\u12b2\u0b8e\u3776\u120d\ub113\ubefe> \u600f\u40a9\u8389\u40a9\u3a62\u7049() {
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
            return:Map<String, \u12b2\u0b8e\u3776\u120d\ub113\ubefe>(getfield:Map<String, \u12b2\u0b8e\u3776\u120d\ub113\ubefe>(\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u9af2\u3c25\ucef1\ud217\u6b5f\u5f50, this:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff))
        }
        
        goto(Label_0006)
    }
    
    public int \uc87f\uae87\u6cfe\u8cae\ud158\u98a4() {
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
            return:int(arraylength:int(getfield:String[][](\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u3d4b\u12cb\u67e9\u4f52\u8258\u8bb0, this:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff)))
        }
        
        goto(Label_0006)
    }
    
    public void \u836c\ub19c\ud523\u718f\ud51e\u93a2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\ucfaf\u836c\u836c\u120d\ua3b4\u92ff p0) {
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
            invokeinterface:boolean(Set<\ucfaf\u836c\u836c\u120d\ua3b4\u92ff>::add, getfield:Set<\ucfaf\u836c\u836c\u120d\ua3b4\u92ff>(\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u64f2\ucfaf\uf995\u4c04\u4daf\u7bad, this:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff), p0:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \u5d20\ubb2b\u97b7\u74b1\u983f\u4ab3() {
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
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\uc2bd\u839e\u16f6\u624e\u67d0\uc29a, this:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff))
        }
        
        goto(Label_0006)
    }
    
    public boolean equals(java.lang.Object p0) {
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
        
        if (cmpeq:boolean(this:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff[expected:Object], p0:Object)) {
            return:boolean(and:int[expected:boolean](ldc:int(5189), ldc:int(43)))
        }
        
        if (instanceof:boolean(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\ucfaf\u836c\u836c\u120d\ua3b4\u92ff.class, p0:Object)) {
            return:boolean(invokevirtual:boolean(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::equals, getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\uc2bd\u839e\u16f6\u624e\u67d0\uc29a, this:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff), getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\uc2bd\u839e\u16f6\u624e\u67d0\uc29a, checkcast:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\ucfaf\u836c\u836c\u120d\ua3b4\u92ff.class, p0:Object[expected:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff]))))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-31578), ldc:int(21273)))
    }
    
    public int hashCode() {
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
            return:int(invokevirtual:int(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::hashCode, getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\uc2bd\u839e\u16f6\u624e\u67d0\uc29a, this:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff)))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String[][] \u4bc8\u74b1\ud36e\u62da\u873d\ub83f() {
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
            return:String[][](getfield:String[][](\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u3d4b\u12cb\u67e9\u4f52\u8258\u8bb0, this:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff))
        }
        
        goto(Label_0006)
    }
    
    public net.minecraft.util.text.ITextComponent \uc246\uf995\ub171\u4179\u718f\u4e72() {
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
            return:ITextComponent(getfield:ITextComponent(\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u34df\u4cd9\ub83f\u7006\u56bd\ufe34, this:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff))
        }
        
        goto(Label_0006)
    }
    
    private static net.minecraft.util.text.Style lambda$\u446c\u7c6b\ub7dc\u4d85\ud51e\u8aa5$0(net.minecraft.util.text.ITextComponent p0, net.minecraft.util.text.Style p1) {
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
            return:Style(invokevirtual:Style(Style::setHoverEvent, p1:Style, initobject:HoverEvent(HoverEvent::<init>, getstatic:HoverEvent$Action<ITextComponent>(HoverEvent$Action::SHOW_TEXT), p0:ITextComponent[expected:T])))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2DC : int
        expr_6E : int [generated]
        stack_B6_0 : byte[] [generated]
        stack_B8_0 : byte[] [generated]
        stack_F7_0 : byte[] [generated]
        stack_F9_0 : byte[] [generated]
        stack_14A_0 : byte[] [generated]
        stack_14C_0 : byte[] [generated]
        stack_18D_0 : byte[] [generated]
        stack_18F_0 : byte[] [generated]
        stack_1C4_0 : byte[] [generated]
        stack_2F7_0 : byte[] [generated]
        stack_34E_0 : byte[] [generated]
        stack_3E5_0 : byte[] [generated]
        stack_420_0 : byte[] [generated]
        stack_476_0 : byte[] [generated]
        var_4_2C7 : int
        var_3_2CC : byte[]
        var_5_2CD : int
        var_0_368 : int
        expr_34E : byte [generated]
        stack_397_2 : byte [generated]
        stack_36B_0 : byte [generated]
        expr_B8 : int [generated]
        expr_F9 : int [generated]
        var_2_14A : byte[]
        expr_14E : int [generated]
        var_3_40E : byte[]
        var_5_40F : int
        expr_18F : int [generated]
        var_3_464 : byte[]
        var_5_465 : int
        expr_476 : byte [generated]
        var_3_1D0 : String
        stack_2C0_0 : String[] [generated]
        expr_1E2 : String[] [generated]
        
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
        var_0_2DC = and:int(ldc:int(-1919346453), ldc:int(-1389155347))
        expr_6E = arraylength:int(stack_B6_0 = stack_B8_0 = stack_F7_0 = stack_F9_0 = stack_14A_0 = stack_14C_0 = stack_18D_0 = stack_18F_0 = stack_1C4_0 = stack_2F7_0 = stack_34E_0 = stack_3E5_0 = stack_420_0 = stack_476_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("qLqrl79DuUW/TqJnSqrtUKWiTa66F0pW+Vm7UVyxF0qo+0K6qkG7Xl6hXKegF0qo+1igWbhHsByMuluyQVJLiKNVXaiuXqFcv1RDoXmPv0ZaTg==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_2C7 = expr_6E:int
        var_3_2CC = newarray:byte[](byte.class, expr_6E:int)
        var_5_2CD = expr_6E:int
        Label_0719:
        
        while (cmpeq:boolean(and:int(var_0_2DC:int, ldc:int(262144)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2DC:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0806)
            }
            
            var_0_2DC = and:int(var_0_2DC:int, ldc:int(-887690890))
            var_5_2CD = add:int(var_5_2CD:int, ldc:int(-1))
            storeelement:byte(var_3_2CC:byte[], var_5_2CD:int, xor:byte(loadelement:byte(stack_2F7_0:byte[], var_5_2CD:int), ldc:byte(86)))
            
            if (cmpne:boolean(var_5_2CD:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B8_0 = stack_B6_0 = stack_F7_0 = stack_F9_0 = stack_14A_0 = stack_14C_0 = stack_18D_0 = stack_18F_0 = stack_1C4_0 = stack_2F7_0 = stack_34E_0 = stack_3E5_0 = stack_420_0 = stack_476_0 = var_3_2CC:byte[]
            goto(Label_0115)
        }
        
        var_0_2DC = and:int(var_0_2DC:int, ldc:int(-1567202183))
        goto(Label_0957)
        Label_0806:
        
        while (cmpne:boolean(and:int(var_0_2DC:int, ldc:int(16777216)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_2DC:int, ldc:int(16)), ldc:int(0))) {
                var_0_2DC = and:int(var_0_2DC:int, ldc:int(1389594911))
                goto(Label_0719)
            }
            
            var_0_368 = and:int(var_0_2DC:int, ldc:int(-1721802891))
            var_5_2CD = add:int(var_5_2CD:int, ldc:int(-1))
            expr_34E = stack_397_2 = loadelement(stack_34E_0, var_5_2CD)
            
            if (cmplt:boolean(add:int(add:int(var_5_2CD:int, ldc:int(1)), neg:int(var_4_2C7:int)), ldc:int(0))) {
                stack_397_2 = stack_36B_0 = add:byte(expr_34E:byte, loadelement:byte(var_3_2CC:byte[], add:int(var_5_2CD:int, ldc:int(1))))
                goto(Label_0891)
            }
            
            Label_0859:
            
            if (cmpeq:boolean(and:int(var_0_368:int, ldc:int(262144)), ldc:int(0))) {
                var_0_368 = and:int(var_0_368:int, ldc:int(-1108201547))
                stack_397_2 = stack_36B_0 = add:byte(expr_34E:byte, ldc:byte(1))
            }
            
            Label_0891:
            
            if (cmpne:boolean(and:int(var_0_368:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_368 = and:int(var_0_368:int, ldc:int(1472245028))
                goto(Label_0859)
            }
            
            var_0_2DC = and:int(var_0_368:int, ldc:int(-1183506762))
            storeelement:byte(var_3_2CC:byte[], var_5_2CD:int, stack_397_2:byte)
            
            if (cmpne:boolean(var_5_2CD:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B8_0 = stack_B6_0 = stack_F7_0 = stack_F9_0 = stack_14A_0 = stack_14C_0 = stack_18D_0 = stack_18F_0 = stack_1C4_0 = stack_2F7_0 = stack_34E_0 = stack_3E5_0 = stack_420_0 = stack_476_0 = var_3_2CC:byte[]
            goto(Label_0189)
        }
        
        Label_0957:
        
        while (cmpeq:boolean(and:int(var_0_2DC:int, ldc:int(262144)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2DC:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_2DC = and:int(var_0_2DC:int, ldc:int(1201481654))
                goto(Label_0719)
            }
            
            var_0_2DC = and:int(var_0_2DC:int, ldc:int(-1147171667))
            var_5_2CD = add:int(var_5_2CD:int, ldc:int(-1))
            storeelement:byte(var_3_2CC:byte[], var_5_2CD:int, add:byte(loadelement:byte(stack_3E5_0:byte[], var_5_2CD:int), ldc:byte(71)))
            
            if (cmpne:boolean(var_5_2CD:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B8_0 = stack_B6_0 = stack_F7_0 = stack_F9_0 = stack_14A_0 = stack_14C_0 = stack_18D_0 = stack_18F_0 = stack_1C4_0 = stack_2F7_0 = stack_34E_0 = stack_3E5_0 = stack_420_0 = stack_476_0 = var_3_2CC:byte[]
            goto(Label_0254)
        }
        
        goto(Label_0806)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_2DC:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0404)
        }
        
        if (cmpeq:boolean(and:int(var_0_2DC:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_2DC = and:int(var_0_2DC:int, ldc:int(872077007))
            goto(Label_0339)
        }
        
        if (cmpeq:boolean(and:int(var_0_2DC:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_2DC = and:int(var_0_2DC:int, ldc:int(-1999623766))
            goto(Label_0254)
        }
        
        if (cmpne:boolean(and:int(var_0_2DC:int, ldc:int(4)), ldc:int(0))) {
            var_0_2DC = and:int(var_0_2DC:int, ldc:int(1303478204))
        }
        else {
            var_0_2DC = and:int(var_0_2DC:int, ldc:int(-1147544722))
            expr_B8 = arraylength:int(stack_B8_0:byte[])
            
            if (cmpne:boolean(expr_B8:int, ldc:int(0))) {
                var_4_2C7 = expr_B8:int
                var_3_2CC = newarray:byte[](byte.class, expr_B8:int)
                var_5_2CD = expr_B8:int
                goto(Label_0806)
            }
        }
        
        Label_0189:
        
        if (cmpeq:boolean(and:int(var_0_2DC:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0404)
        }
        
        if (cmpeq:boolean(and:int(var_0_2DC:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_2DC = and:int(var_0_2DC:int, ldc:int(-1515553813))
            goto(Label_0339)
        }
        
        if (cmpne:boolean(and:int(var_0_2DC:int, ldc:int(32)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_2DC:int, ldc:int(16)), ldc:int(0))) {
                var_0_2DC = and:int(var_0_2DC:int, ldc:int(-45480697))
                goto(Label_0115)
            }
            
            var_0_2DC = and:int(var_0_2DC:int, ldc:int(-1950553050))
            expr_F9 = arraylength:int(stack_F9_0:byte[])
            
            if (cmpne:boolean(expr_F9:int, ldc:int(0))) {
                var_4_2C7 = expr_F9:int
                var_3_2CC = newarray:byte[](byte.class, expr_F9:int)
                var_5_2CD = expr_F9:int
                goto(Label_0957)
            }
        }
        
        Label_0254:
        
        if (cmpeq:boolean(and:int(var_0_2DC:int, ldc:int(2048)), ldc:int(0))) {
            var_0_2DC = and:int(var_0_2DC:int, ldc:int(269780132))
            goto(Label_0404)
        }
        
        if (cmpne:boolean(and:int(var_0_2DC:int, ldc:int(131072)), ldc:int(0))) {
            var_0_2DC = and:int(var_0_2DC:int, ldc:int(-809000441))
        }
        else {
            if (cmpne:boolean(and:int(var_0_2DC:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_2DC = and:int(var_0_2DC:int, ldc:int(1302940843))
                goto(Label_0189)
            }
            
            if (cmpeq:boolean(and:int(var_0_2DC:int, ldc:int(2048)), ldc:int(0))) {
                var_0_2DC = and:int(var_0_2DC:int, ldc:int(-1049738676))
                goto(Label_0115)
            }
            
            var_0_2DC = and:int(var_0_2DC:int, ldc:int(-612603400))
            var_2_14A = stack_14A_0:byte[]
            expr_14E = add:int(arraylength:int(stack_14C_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_14E:int, ldc:int(0))) {
                var_3_40E = newarray:byte[](byte.class, expr_14E:int)
                var_5_40F = expr_14E:int
                
                loop {
                    var_0_2DC = and:int(var_0_2DC:int, ldc:int(-279606795))
                    var_5_40F = add:int(var_5_40F:int, ldc:int(-1))
                    storeelement:byte(var_3_40E:byte[], var_5_40F:int, add:int(shl:int(loadelement:byte(stack_420_0:byte[], var_5_40F:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_14A:byte[], add:int(var_5_40F:int, and:int(ldc:int(9), ldc:int(16531)))), ldc:int(4)), xor:int(ldc:int(16420), ldc:int(16427)))))
                    
                    if (cmpne:boolean(var_5_40F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_B8_0 = stack_B6_0 = stack_F7_0 = stack_F9_0 = stack_14A_0 = stack_14C_0 = stack_18D_0 = stack_18F_0 = stack_1C4_0 = stack_2F7_0 = stack_34E_0 = stack_3E5_0 = stack_420_0 = stack_476_0 = var_3_40E:byte[]
            }
        }
        
        Label_0339:
        
        if (cmpeq:boolean(and:int(var_0_2DC:int, ldc:int(1073741824)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2DC:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_2DC = and:int(var_0_2DC:int, ldc:int(804378252))
                goto(Label_0254)
            }
            
            if (cmpne:boolean(and:int(var_0_2DC:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0189)
            }
            
            if (cmpeq:boolean(and:int(var_0_2DC:int, ldc:int(2048)), ldc:int(0))) {
                var_0_2DC = and:int(var_0_2DC:int, ldc:int(1992413154))
                goto(Label_0115)
            }
            
            var_0_2DC = and:int(var_0_2DC:int, ldc:int(-570741073))
            expr_18F = arraylength:int(stack_18F_0:byte[])
            
            if (cmpne:boolean(expr_18F:int, ldc:int(0))) {
                var_3_464 = newarray:byte[](byte.class, expr_18F:int)
                var_5_465 = expr_18F:int
                
                loop {
                    var_0_2DC = and:int(var_0_2DC:int, ldc:int(-1078821004))
                    var_5_465 = add:int(var_5_465:int, ldc:int(-1))
                    expr_476 = loadelement:byte(stack_476_0:byte[], var_5_465:int)
                    storeelement:byte(var_3_464:byte[], var_5_465:int, or:int(and:int(shl:int(expr_476:byte, and:int(ldc:int(5188), ldc:int(2845))), ldc:int(-16)), and:int(shr:int(expr_476:byte[expected:int], xor:int(ldc:int(6277), ldc:int(6273))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_465:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_B8_0 = stack_B6_0 = stack_F7_0 = stack_F9_0 = stack_14A_0 = stack_14C_0 = stack_18D_0 = stack_18F_0 = stack_1C4_0 = stack_2F7_0 = stack_34E_0 = stack_3E5_0 = stack_420_0 = stack_476_0 = var_3_464:byte[]
            }
        }
        
        Label_0404:
        
        if (cmpne:boolean(and:int(var_0_2DC:int, ldc:int(16)), ldc:int(0))) {
            var_0_2DC = and:int(var_0_2DC:int, ldc:int(1374692262))
            goto(Label_0339)
        }
        
        if (cmpne:boolean(and:int(var_0_2DC:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0254)
        }
        
        if (cmpeq:boolean(and:int(var_0_2DC:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0189)
        }
        
        if (cmpeq:boolean(and:int(var_0_2DC:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_1D0 = initobject:String(String::<init>, stack_1C4_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_2C0_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8196), ldc:int(8204)))
            expr_1E2 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16392), ldc:int(6318)))
            storeelement:String(expr_1E2:String[], and:int(ldc:int(19184), ldc:int(-19199)), invokevirtual:String[expected:String](String::substring, var_3_1D0:String, and:int(ldc:int(9987), ldc:int(-10060)), and:int(ldc:int(4163), ldc:int(18457))))
            storeelement:String(expr_1E2:String[], and:int(ldc:int(2087), ldc:int(1822)), invokevirtual:String[expected:String](String::substring, var_3_1D0:String, xor:int(ldc:int(17456), ldc:int(17457)), xor:int(ldc:int(-8191), ldc:int(-8179))))
            storeelement:String(expr_1E2:String[], and:int(ldc:int(9740), ldc:int(2198)), invokevirtual:String[expected:String](String::substring, var_3_1D0:String, and:int(ldc:int(1292), ldc:int(2220)), and:int(ldc:int(1310), ldc:int(2102))))
            storeelement:String(expr_1E2:String[], xor:int(ldc:int(17921), ldc:int(17923)), invokevirtual:String[expected:String](String::substring, var_3_1D0:String, xor:int(ldc:int(3598), ldc:int(3608)), xor:int(ldc:int(-30204), ldc:int(-30181))))
            storeelement:String(expr_1E2:String[], and:int(ldc:int(28687), ldc:int(1063)), invokevirtual:String[expected:String](String::substring, var_3_1D0:String, xor:int(ldc:int(-32000), ldc:int(-31969)), xor:int(ldc:int(17819), ldc:int(17845))))
            storeelement:String(expr_1E2:String[], and:int(ldc:int(16389), ldc:int(10397)), invokevirtual:String[expected:String](String::substring, var_3_1D0:String, and:int(ldc:int(19263), ldc:int(174)), and:int(ldc:int(56), ldc:int(4792))))
            storeelement:String(expr_1E2:String[], xor:int(ldc:int(18438), ldc:int(18439)), invokevirtual:String[expected:String](String::substring, var_3_1D0:String, and:int(ldc:int(440), ldc:int(16440)), and:int(ldc:int(6509), ldc:int(589))))
            storeelement:String(expr_1E2:String[], and:int(ldc:int(24643), ldc:int(131)), invokevirtual:String[expected:String](String::substring, var_3_1D0:String, and:int(ldc:int(8541), ldc:int(20685)), xor:int(ldc:int(707), ldc:int(658))))
            putstatic:String[](\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u624e\u516c\u3a62\u74b1\u446c\u51b2, expr_1E2:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u7043\u8bb0\u71ae\ub171\uc31c\u3d64(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_696 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
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
        var_3_696 = and:int(ldc:int(1296716695), ldc:int(-577801390))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
            var_3_696 = and:int(var_3_696:int, ldc:int(-551627779))
            var_5_81 = and:int(ldc:int(5961), ldc:int(-5962))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-31915), ldc:int(27818)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_696:int, ldc:int(-578101633))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(513), ldc:int(512)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(2050), ldc:int(2051)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_696 = and:int(var_3_DA:int, ldc:int(1292883729))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(16388), ldc:int(16389)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(2139402717))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1002846123))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-855579162))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1340348387))
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-39322722))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1826611988))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(234197405))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(161973646))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-198834692))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1142822638))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(1605556052))
                        var_11_EB = and:int(ldc:int(5288), ldc:int(-5289))
                        goto(Label_1544)
                    }
                    
                    Label_0586:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1159783118))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1247681144))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(521249601))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(2108420696))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0702:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(605063049))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-554716348))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-623366036))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(982447283))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(246178611))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(654718381))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(2142729915))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0852:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-2096873415))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-113059692))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1771536863))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1250567631))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-19768748))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-552608232))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(517), ldc:int(11465))
                                goto(Label_1146)
                            }
                        }
                    }
                    
                    Label_0986:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-840145214))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-2136764532))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1999937311))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-928780865))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(1869840087))
                        var_11_EB = and:int(ldc:int(-14784), ldc:int(10297))
                    }
                    
                    Label_1146:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1618350793))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0986)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1819181474))
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1520045153))
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(967476473))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(528535642))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(2100000764))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1416)
                            }
                        }
                    }
                    
                    Label_1280:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1874785924))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1314782039))
                            goto(Label_1146)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0986)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-903992214))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-540333579))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(1572303379))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1544)
                    }
                    
                    Label_1416:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-404193395))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-2057422300))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-429727777))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_696 = and:int(var_3_696:int, ldc:int(-304972902))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1544:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A1 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1555:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(838723390))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1775090517))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(2082957895))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1311796835))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1816848523))
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1605072860))
                        var_17_6A1 = add:int(var_16_119:int, xor:int(ldc:int(25601), ldc:int(25600)))
                        looporswitchbreak()
                    }
                    
                    var_3_696 = and:int(var_3_696:int, ldc:int(360006613))
                }
                
                var_3_696 = and:int(var_3_696:int, ldc:int(1840208760))
                
                if (cmple:boolean(var_5_81 = var_17_6A1:int, sub:int(var_6_88:int, and:int(ldc:int(2725), ldc:int(8265))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_696 = and:int(var_3_696:int, ldc:int(1177421928))
            goto(Label_0108)
        }
    }
}
