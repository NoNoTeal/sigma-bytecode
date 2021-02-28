public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u7c6b\u34df\uf995\u4179\ub70c\u8c8a {
    public void \u7c6b\u34df\uf995\u4179\ub70c\u8c8a(\u392e\ud7e8\u3bc9\u88c5\ud51e.\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?> p0, float p1) {
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
    
    private void \u7c6b\u34df\uf995\u4179\ub70c\u8c8a(java.util.function.Supplier<\u392e\ud7e8\u3bc9\u88c5\ud51e.\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>> p0, float p1) {
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
            invokespecial:Object(Object::<init>, this:\u7c6b\u34df\uf995\u4179\ub70c\u8c8a)
            putfield:Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>(\u7c6b\u34df\uf995\u4179\ub70c\u8c8a::\u4c04\ub171\u4c2b\ub171\ucb79\uc2e8, this:\u7c6b\u34df\uf995\u4179\ub70c\u8c8a, p0:Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>)
            putfield:float(\u7c6b\u34df\uf995\u4179\ub70c\u8c8a::\u76bc\u6435\ub83f\u72f1\u6c52\u6b5f, this:\u7c6b\u34df\uf995\u4179\ub70c\u8c8a, p1:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u7c6b\u36d3\u5fe1\ub32d\ubb2b\u927d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u183a\uafe7\u74b1\u62da\u71f1\uc2bd p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p1, java.util.Random p2, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p3) {
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
            return:boolean(invokevirtual:boolean(\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<FC, F>::\ua562\ud12e\u8389\ub8be\u3d64\u8cae, checkcast:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u392e\ud7e8\u3bc9\u88c5\ud51e.\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>.class, invokeinterface:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>::get, getfield:Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>(\u7c6b\u34df\uf995\u4179\ub70c\u8c8a::\u4c04\ub171\u4c2b\ub171\ucb79\uc2e8, this:\u7c6b\u34df\uf995\u4179\ub70c\u8c8a))), p0:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd, p1:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0, p2:Random, p3:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
        }
        
        goto(Label_0006)
    }
    
    private static \u392e\ud7e8\u3bc9\u88c5\ud51e.\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a lambda$\uc910\u6bb9\u946b\u7af6\u8258\u6d99$3(\u392e\ud7e8\u3bc9\u88c5\ud51e.\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a p0) {
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
            return:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a(p0:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a)
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.kinds.App lambda$\u51fa\u3bd6\u8d90\ubf56\u5654\u59ec$2(com.mojang.serialization.codecs.RecordCodecBuilder$Instance p0) {
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
    
    private static java.lang.Float lambda$\u69d9\u6435\u1187\u6d99\uc7fe\u4492$1(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u7c6b\u34df\uf995\u4179\ub70c\u8c8a p0) {
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
            return:Float(invokestatic:Float(Float::valueOf, getfield:float(\u7c6b\u34df\uf995\u4179\ub70c\u8c8a::\u76bc\u6435\ub83f\u72f1\u6c52\u6b5f, p0:\u7c6b\u34df\uf995\u4179\ub70c\u8c8a)))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.function.Supplier lambda$\u7af6\ua3b4\u6ec6\uae5d\u8258\u516c$0(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u7c6b\u34df\uf995\u4179\ub70c\u8c8a p0) {
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
            return:Supplier(getfield:Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>(\u7c6b\u34df\uf995\u4179\ub70c\u8c8a::\u4c04\ub171\u4c2b\ub171\ucb79\uc2e8, p0:\u7c6b\u34df\uf995\u4179\ub70c\u8c8a))
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
    
    public void \u1833\u71ae\u51b2\u8640\u873d\uceb8(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_65A : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C3 : double
        var_3_D5 : int
        var_11_E6 : int
        var_14_110 : double
        var_16_114 : int
        var_12_10C : double
        var_17_665 : int
        
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
        var_3_65A = and:int(ldc:int(-1000759901), ldc:int(-8739929))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7c6b\u34df\uf995\u4179\ub70c\u8c8a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_65A = and:int(var_3_65A:int, ldc:int(1241614352))
        }
        else {
            var_3_65A = and:int(var_3_65A:int, ldc:int(-388286037))
            var_5_85 = and:int(ldc:int(3337), ldc:int(-19726))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(28460), ldc:int(-32557)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C3 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D5 = and:int(var_3_65A:int, ldc:int(-1183036425))
                    var_9_C3 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E6 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E6:int, sub:int(var_6_8C:int, xor:int(ldc:int(66), ldc:int(67)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E6:int, xor:int(ldc:int(2820), ldc:int(2821)))), var_7_9B:double))) {
                        inc:int(var_11_E6, ldc:int(1))
                    }
                    
                    var_3_65A = and:int(var_3_D5:int, ldc:int(-1854177409))
                    var_14_110 = var_7_9B:double
                    var_16_114 = var_11_E6:int
                }
                else {
                    var_11_E6 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(2081), ldc:int(4241)))
                    var_12_10C = var_14_110 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_114 = var_11_E6:int, var_6_8C:int)) {
                        var_9_C3 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E6:int)
                        var_16_114 = var_11_E6:int
                        var_14_110 = var_12_10C:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(466154937))
                        goto(Label_1495)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1041617098))
                        goto(Label_1351)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(946732742))
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1583482108))
                        goto(Label_1068)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0946)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0701)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1437857462))
                        goto(Label_0585)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1275349005))
                        
                        if (cmplt:boolean(var_16_114:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0585)
                            }
                            
                            goto(Label_0839)
                        }
                    }
                    
                    Label_0412:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-2096876180))
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1351)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(71129237))
                        goto(Label_1068)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(142929572))
                        goto(Label_0946)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-754667891))
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0701)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-448096159))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-27499665))
                            var_11_E6 = and:int(ldc:int(-19574), ldc:int(19573))
                            goto(Label_1484)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0585:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(907090685))
                        goto(Label_1495)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1351)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1891108328))
                        goto(Label_1068)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1074294630))
                        goto(Label_0946)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1510217425))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_110 = var_9_C3:double
                            goto(Label_0839)
                        }
                    }
                    
                    Label_0701:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1351)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1218636069))
                        goto(Label_1208)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-518018840))
                        goto(Label_1068)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1941368887))
                        goto(Label_0946)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-2011789523))
                            goto(Label_0585)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0412)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-1074983912))
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-455331017))
                        var_14_110 = mul:double(ldc:double(0.5), add:double(var_9_C3:double, var_14_110:double))
                    }
                    
                    Label_0839:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1351)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1866956129))
                        goto(Label_1068)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1729513707))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0701)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0585)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0412)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-623019221))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E6 = xor:int(ldc:int(16961), ldc:int(16960))
                                goto(Label_1068)
                            }
                        }
                    }
                    
                    Label_0946:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1495)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1351)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0839)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0701)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0585)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0412)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-438499521))
                        var_11_E6 = and:int(ldc:int(30592), ldc:int(-30625))
                    }
                    
                    Label_1068:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(2087923671))
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1574989311))
                        goto(Label_1351)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(2043962206))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0946)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(1945542884))
                            goto(Label_0839)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(32)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-760871867))
                            goto(Label_0701)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0585)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-429911701))
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-2131133569))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E6:int, ldc:int(0))) {
                                goto(Label_1351)
                            }
                        }
                    }
                    
                    Label_1208:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1261495696))
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(256)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-1962765705))
                            goto(Label_1068)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0946)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(1446136714))
                            goto(Label_0839)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(1376845355))
                            goto(Label_0701)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0585)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-727321266))
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1015285841))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_110:double, var_5_85:int, var_16_114:int)
                        goto(Label_1484)
                    }
                    
                    Label_1351:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1495)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1064135803))
                        goto(Label_1068)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1497615767))
                        goto(Label_0946)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0701)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-2042220786))
                        goto(Label_0585)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1258106846))
                        goto(Label_0412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_65A = and:int(var_3_65A:int, ldc:int(-1778414733))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_110:double, ldc:double(0.0))
                    Label_1484:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_665 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E6:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1495:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1761974319))
                        goto(Label_1351)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(875076198))
                        goto(Label_1068)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1636942937))
                        goto(Label_0946)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1493918920))
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1501319916))
                        goto(Label_0701)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0585)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-706973893))
                        var_17_665 = add:int(var_16_114:int, xor:int(ldc:int(1348), ldc:int(1349)))
                        looporswitchbreak()
                    }
                    
                    var_3_65A = and:int(var_3_65A:int, ldc:int(-947425265))
                }
                
                var_3_65A = and:int(var_3_65A:int, ldc:int(-564328977))
                
                if (cmple:boolean(var_5_85 = var_17_665:int, sub:int(var_6_8C:int, xor:int(ldc:int(3392), ldc:int(3393))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
