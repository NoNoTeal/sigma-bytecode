public class \u5245\u8aa5\u61a4\u7049\u4cd9.\u7049\uafe7\u120d\u1187\uceb8\u6fb0<T> {
    public void \u7049\uafe7\u120d\u1187\uceb8\u6fb0(java.util.function.Function<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, java.util.Optional<T>> p0, java.lang.String p1, java.lang.String p2) {
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
            invokespecial:Object(Object::<init>, this:\u7049\uafe7\u120d\u1187\uceb8\u6fb0<T>)
            putfield:Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, Optional<T>>(\u7049\uafe7\u120d\u1187\uceb8\u6fb0::\u9255\ud4fe\uc246\u5bc4\u8389\u4bc8, this:\u7049\uafe7\u120d\u1187\uceb8\u6fb0<T>, p0:Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, Optional<T>>)
            putfield:String(\u7049\uafe7\u120d\u1187\uceb8\u6fb0::\u6bb9\uae5d\u67d0\u7330\ua562\ub6ab, this:\u7049\uafe7\u120d\u1187\uceb8\u6fb0<T>, p1:String)
            putfield:String(\u7049\uafe7\u120d\u1187\uceb8\u6fb0::\u6d69\u88c5\u8413\u8aa5\u3d64\uf9c5, this:\u7049\uafe7\u120d\u1187\uceb8\u6fb0<T>, p2:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.concurrent.CompletableFuture<java.util.Map<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u7d52\u3776\u7ce1\u97e6\ud158\u6d99>> \u5db4\u960f\u6cfe\ub18d\u8350\ub18d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0, java.util.concurrent.Executor p1) {
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
    
    public \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8d90\u183a\ub171\u59ec\u836c\u8413<T> \ua3b4\u5f50\u51fa\u4c2b\u5fe1\uff55(java.util.Map<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u7d52\u3776\u7ce1\u97e6\ud158\u6d99> p0) {
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
    
    private void lambda$\u8308\u67d0\u3776\ud158\ua562\ubb2b$4(java.util.function.Function p0, java.util.function.Function p1, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p2, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u7d52\u3776\u7ce1\u97e6\ud158\u6d99 p3) {
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
            invokeinterface:void(Logger::error, getstatic:Logger(\u7049\uafe7\u120d\u1187\uceb8\u6fb0::\ua6bd\u4f4a\uae5d\uafe7\ub32d\u8aa5), loadelement:String(getstatic:String[](\u7049\uafe7\u120d\u1187\uceb8\u6fb0::\u7330\u600f\ud12e\u0800\uc9f6\u392e), and:int(ldc:int(26193), ldc:int(-26196))), getfield:String[expected:Object](\u7049\uafe7\u120d\u1187\uceb8\u6fb0::\u6d69\u88c5\u8413\u8aa5\u3d64\uf9c5, this:\u7049\uafe7\u120d\u1187\uceb8\u6fb0<T>), p2:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object], invokeinterface:String[expected:Object](Stream<Object>::collect, invokeinterface:Stream<Object>(Stream<\u4492\u51fa\u8413\u3bd6\uc31c\ubded>::map, invokevirtual:Stream<\u4492\u51fa\u8413\u3bd6\uc31c\ubded>(\u7d52\u3776\u7ce1\u97e6\ud158\u6d99::\uc87f\ubb2b\ua3b4\u4daf\u1187\u93a2, p3:\u7d52\u3776\u7ce1\u97e6\ud158\u6d99, p0:Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<Object>>, p1:Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, Object>), invokedynamic:Function<Object, String>(apply:()Ljava/util/function/Function;)), invokestatic:Collector<CharSequence, ?, String>(Collectors::joining, loadelement:String[expected:CharSequence](getstatic:String[](\u7049\uafe7\u120d\u1187\uceb8\u6fb0::\u7330\u600f\ud12e\u0800\uc9f6\u392e), and:int(ldc:int(67), ldc:int(32553))))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private java.lang.Object lambda$\u71f1\uc87f\u647c\u3bd6\u64f2\u40a9$3(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
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
            return:Object(invokevirtual:T[expected:Object](Optional<T>::orElse, checkcast:Optional<T>(java.util.Optional<T>.class, invokeinterface:Optional<T>(Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, Optional<T>>::apply, getfield:Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, Optional<T>>(\u7049\uafe7\u120d\u1187\uceb8\u6fb0::\u9255\ud4fe\uc246\u5bc4\u8389\u4bc8, this:\u7049\uafe7\u120d\u1187\uceb8\u6fb0<T>), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)), aconstnull:T()))
        }
        
        goto(Label_0006)
    }
    
    private java.util.Map lambda$\uc910\u12cb\ud158\u4ab3\u7049\u9033$2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0) {
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
    
    private static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u7d52\u3776\u7ce1\u97e6\ud158\u6d99 lambda$\u4975\u3504\u5fe1\ucef1\u1187\u5db4$1(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
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
            return:\u7d52\u3776\u7ce1\u97e6\ud158\u6d99(invokestatic:\u7d52\u3776\u7ce1\u97e6\ud158\u6d99(\u7d52\u3776\u7ce1\u97e6\ud158\u6d99::\ufe34\u6fb0\u647c\ud158\u7c6b\ubb2b))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u92ee\u873d\u8df4\u3bd6\u5d20\uc29a$0(java.lang.String p0) {
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
            return:boolean(invokevirtual:boolean(String::endsWith, p0:String, loadelement:String(getstatic:String[](\u7049\uafe7\u120d\u1187\uceb8\u6fb0::\u7330\u600f\ud12e\u0800\uc9f6\u392e), xor:int(ldc:int(-23547), ldc:int(-23552)))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_248 : int
        expr_6E : int [generated]
        stack_93_0 : byte[] [generated]
        stack_95_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_10C_0 : byte[] [generated]
        stack_10E_0 : byte[] [generated]
        stack_146_0 : byte[] [generated]
        stack_26C_0 : byte[] [generated]
        stack_2C3_0 : byte[] [generated]
        stack_350_0 : byte[] [generated]
        stack_3A4_0 : byte[] [generated]
        var_4_234 : int
        var_3_239 : byte[]
        var_5_23A : int
        var_0_2B9 : int
        expr_2C3 : byte [generated]
        stack_302_2 : byte [generated]
        stack_2E0_0 : byte [generated]
        expr_350 : byte [generated]
        expr_95 : int [generated]
        expr_D7 : int [generated]
        var_2_10C : byte[]
        expr_110 : int [generated]
        var_3_392 : byte[]
        var_5_393 : int
        var_3_152 : String
        stack_20C_0 : String[] [generated]
        expr_164 : String[] [generated]
        
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
        var_0_248 = and:int(ldc:int(-843158426), ldc:int(-34211089))
        expr_6E = arraylength:int(stack_93_0 = stack_95_0 = stack_D5_0 = stack_D7_0 = stack_10C_0 = stack_10E_0 = stack_146_0 = stack_26C_0 = stack_2C3_0 = stack_350_0 = stack_3A4_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("HBRnd3Pvhe50fdZ26HIhfG9QdZBTeJF1XnWYeWhLfJhTeJrueWJuDFN4G9xxEHXt1fuNdX7adA1TeBdOdSDPcZ9OcR57a2lZ+yDObiNv9HFwhu50fdZ26HIhfG9QdZBTeJF1XnUPU3gXTnUgz3GfTnEieejqAIPU7pV8+HR2avKB1O6Ld//16/UD9HDNUJyVY/kO7nR91nbochR3fFV1kFN4kXVedZh5aEt8mFN4mu55Ym4MY/kO7nR91nbochR3fFV1kFN4kXVedZh5aEt8mFN4mu55Ym4MU3gb3HEQde3V+411ftp0DUP9LA==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_234 = expr_6E:int
        var_3_239 = newarray:byte[](byte.class, expr_6E:int)
        var_5_23A = expr_6E:int
        Label_0572:
        
        while (cmpne:boolean(and:int(var_0_248:int, ldc:int(67108864)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_248:int, ldc:int(65536)), ldc:int(0))) {
                var_0_248 = and:int(var_0_248:int, ldc:int(-2030715686))
                goto(Label_0667)
            }
            
            var_0_248 = and:int(var_0_248:int, ldc:int(-1615405058))
            var_5_23A = add:int(var_5_23A:int, ldc:int(-1))
            storeelement:byte(var_3_239:byte[], var_5_23A:int, add:byte(loadelement:byte(stack_26C_0:byte[], var_5_23A:int), ldc:byte(11)))
            
            if (cmpne:boolean(var_5_23A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_95_0 = stack_93_0 = stack_D5_0 = stack_D7_0 = stack_10C_0 = stack_10E_0 = stack_146_0 = stack_26C_0 = stack_2C3_0 = stack_350_0 = stack_3A4_0 = var_3_239:byte[]
            goto(Label_0115)
        }
        
        var_0_248 = and:int(var_0_248:int, ldc:int(-1252813008))
        goto(Label_0808)
        Label_0667:
        
        while (cmpeq:boolean(and:int(var_0_248:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_248:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_248 = and:int(var_0_248:int, ldc:int(-1436727704))
                goto(Label_0572)
            }
            
            var_0_2B9 = and:int(var_0_248:int, ldc:int(-1745236145))
            var_5_23A = add:int(var_5_23A:int, ldc:int(-1))
            expr_2C3 = stack_302_2 = loadelement(stack_2C3_0, var_5_23A)
            
            if (cmplt:boolean(add:int(add:int(var_5_23A:int, ldc:int(2)), neg:int(var_4_234:int)), ldc:int(0))) {
                stack_302_2 = stack_2E0_0 = add:byte(expr_2C3:byte, loadelement:byte(var_3_239:byte[], add:int(var_5_23A:int, ldc:int(2))))
                goto(Label_0752)
            }
            
            Label_0720:
            
            if (cmpne:boolean(and:int(var_0_2B9:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_2B9 = and:int(var_0_2B9:int, ldc:int(-671167529))
                stack_302_2 = stack_2E0_0 = add:byte(expr_2C3:byte, ldc:byte(2))
            }
            
            Label_0752:
            
            if (cmpeq:boolean(and:int(var_0_2B9:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0720)
            }
            
            var_0_248 = and:int(var_0_2B9:int, ldc:int(-537822602))
            storeelement:byte(var_3_239:byte[], var_5_23A:int, stack_302_2:byte)
            
            if (cmpne:boolean(var_5_23A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_95_0 = stack_93_0 = stack_D5_0 = stack_D7_0 = stack_10C_0 = stack_10E_0 = stack_146_0 = stack_26C_0 = stack_2C3_0 = stack_350_0 = stack_3A4_0 = var_3_239:byte[]
            goto(Label_0154)
        }
        
        Label_0808:
        
        while (cmpeq:boolean(and:int(var_0_248:int, ldc:int(4096)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_248:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0572)
            }
            
            var_0_248 = and:int(var_0_248:int, ldc:int(-306646434))
            var_5_23A = add:int(var_5_23A:int, ldc:int(-1))
            expr_350 = loadelement:byte(stack_350_0:byte[], var_5_23A:int)
            storeelement:byte(var_3_239:byte[], var_5_23A:int, xor:int(or:int(and:int(shl:int(expr_350:byte, and:int(ldc:int(16948), ldc:int(12292))), ldc:int(-16)), and:int(shr:int(expr_350:byte[expected:int], xor:int(ldc:int(2187), ldc:int(2191))), ldc:int(15))), ldc:int(123)))
            
            if (cmpne:boolean(var_5_23A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_95_0 = stack_93_0 = stack_D5_0 = stack_D7_0 = stack_10C_0 = stack_10E_0 = stack_146_0 = stack_26C_0 = stack_2C3_0 = stack_350_0 = stack_3A4_0 = var_3_239:byte[]
            goto(Label_0220)
        }
        
        var_0_248 = and:int(var_0_248:int, ldc:int(-40189600))
        goto(Label_0667)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_248:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0277)
        }
        
        if (cmpne:boolean(and:int(var_0_248:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0220)
        }
        
        if (cmpne:boolean(and:int(var_0_248:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_248 = and:int(var_0_248:int, ldc:int(-172102962))
            expr_95 = arraylength:int(stack_95_0:byte[])
            
            if (cmpne:boolean(expr_95:int, ldc:int(0))) {
                var_4_234 = expr_95:int
                var_3_239 = newarray:byte[](byte.class, expr_95:int)
                var_5_23A = expr_95:int
                goto(Label_0667)
            }
        }
        
        Label_0154:
        
        if (cmpeq:boolean(and:int(var_0_248:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_248 = and:int(var_0_248:int, ldc:int(-638621061))
            goto(Label_0277)
        }
        
        if (cmpne:boolean(and:int(var_0_248:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_248 = and:int(var_0_248:int, ldc:int(601878177))
        }
        else {
            if (cmpne:boolean(and:int(var_0_248:int, ldc:int(65536)), ldc:int(0))) {
                var_0_248 = and:int(var_0_248:int, ldc:int(1083612931))
                goto(Label_0115)
            }
            
            var_0_248 = and:int(var_0_248:int, ldc:int(-1074338993))
            expr_D7 = arraylength:int(stack_D7_0:byte[])
            
            if (cmpne:boolean(expr_D7:int, ldc:int(0))) {
                var_4_234 = expr_D7:int
                var_3_239 = newarray:byte[](byte.class, expr_D7:int)
                var_5_23A = expr_D7:int
                goto(Label_0808)
            }
        }
        
        Label_0220:
        
        if (cmpeq:boolean(and:int(var_0_248:int, ldc:int(256)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_248:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_248 = and:int(var_0_248:int, ldc:int(-499154513))
                goto(Label_0154)
            }
            
            if (cmpne:boolean(and:int(var_0_248:int, ldc:int(65536)), ldc:int(0))) {
                var_0_248 = and:int(var_0_248:int, ldc:int(-1097924034))
                goto(Label_0115)
            }
            
            var_0_248 = and:int(var_0_248:int, ldc:int(-1745691265))
            var_2_10C = stack_10C_0:byte[]
            expr_110 = add:int(arraylength:int(stack_10E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_110:int, ldc:int(0))) {
                var_3_392 = newarray:byte[](byte.class, expr_110:int)
                var_5_393 = expr_110:int
                
                loop {
                    var_0_248 = and:int(var_0_248:int, ldc:int(-1380521473))
                    var_5_393 = add:int(var_5_393:int, ldc:int(-1))
                    storeelement:byte(var_3_392:byte[], var_5_393:int, add:int(shl:int(loadelement:byte(stack_3A4_0:byte[], var_5_393:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_10C:byte[], add:int(var_5_393:int, xor:int(ldc:int(4100), ldc:int(4101)))), ldc:int(3)), xor:int(ldc:int(344), ldc:int(327)))))
                    
                    if (cmpne:boolean(var_5_393:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_95_0 = stack_93_0 = stack_D5_0 = stack_D7_0 = stack_10C_0 = stack_10E_0 = stack_146_0 = stack_26C_0 = stack_2C3_0 = stack_350_0 = stack_3A4_0 = var_3_392:byte[]
            }
        }
        
        Label_0277:
        
        if (cmpne:boolean(and:int(var_0_248:int, ldc:int(128)), ldc:int(0))) {
            var_0_248 = and:int(var_0_248:int, ldc:int(1604946385))
            goto(Label_0220)
        }
        
        if (cmpeq:boolean(and:int(var_0_248:int, ldc:int(16384)), ldc:int(0))) {
            var_0_248 = and:int(var_0_248:int, ldc:int(197022094))
            goto(Label_0154)
        }
        
        if (cmpeq:boolean(and:int(var_0_248:int, ldc:int(128)), ldc:int(0))) {
            var_3_152 = initobject:String(String::<init>, stack_146_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_20C_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(24583), ldc:int(4934)))
            expr_164 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8449), ldc:int(8455)))
            storeelement:String(expr_164:String[], xor:int(ldc:int(36), ldc:int(37)), invokevirtual:String[expected:String](String::substring, var_3_152:String, and:int(ldc:int(-14529), ldc:int(14528)), xor:int(ldc:int(-32680), ldc:int(-32679))))
            storeelement:String(expr_164:String[], xor:int(ldc:int(16389), ldc:int(16384)), invokevirtual:String[expected:String](String::substring, var_3_152:String, xor:int(ldc:int(8578), ldc:int(8579)), xor:int(ldc:int(4112), ldc:int(4118))))
            storeelement:String(expr_164:String[], xor:int(ldc:int(33), ldc:int(35)), invokevirtual:String[expected:String](String::substring, var_3_152:String, xor:int(ldc:int(-30720), ldc:int(-30714)), and:int(ldc:int(20689), ldc:int(8281))))
            storeelement:String(expr_164:String[], and:int(ldc:int(9357), ldc:int(-25742)), invokevirtual:String[expected:String](String::substring, var_3_152:String, xor:int(ldc:int(-31654), ldc:int(-31733)), and:int(ldc:int(210), ldc:int(4282))))
            storeelement:String(expr_164:String[], xor:int(ldc:int(-30622), ldc:int(-30618)), invokevirtual:String[expected:String](String::substring, var_3_152:String, xor:int(ldc:int(-26567), ldc:int(-26453)), xor:int(ldc:int(18784), ldc:int(18902))))
            storeelement:String(expr_164:String[], xor:int(ldc:int(20506), ldc:int(20505)), invokevirtual:String[expected:String](String::substring, var_3_152:String, xor:int(ldc:int(3152), ldc:int(3302)), and:int(ldc:int(4330), ldc:int(2283))))
            putstatic:String[](\u7049\uafe7\u120d\u1187\uceb8\u6fb0::\u7330\u600f\ud12e\u0800\uc9f6\u392e, expr_164:String[])
            putstatic:Logger(\u7049\uafe7\u120d\u1187\uceb8\u6fb0::\ua6bd\u4f4a\uae5d\uafe7\ub32d\u8aa5, invokestatic:Logger(LogManager::getLogger))
            putstatic:Gson(\u7049\uafe7\u120d\u1187\uceb8\u6fb0::\u76bc\u0800\u6c56\u4c04\u76bc\u385b, initobject:Gson(Gson::<init>))
            putstatic:int(\u7049\uafe7\u120d\u1187\uceb8\u6fb0::\u0a06\u6198\ubb2b\uf9c5\u0c95\u927d, invokevirtual:int(String::length, loadelement:String(getstatic:String[](\u7049\uafe7\u120d\u1187\uceb8\u6fb0::\u7330\u600f\ud12e\u0800\uc9f6\u392e), xor:int(ldc:int(-14319), ldc:int(-14316)))))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u4c04\u61a4\u7bad\u6435\u4daf\uae5d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_654 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_65F : int
        
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
        var_3_654 = and:int(ldc:int(-289454530), ldc:int(-33726664))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7049\uafe7\u120d\u1187\uceb8\u6fb0<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(524288)), ldc:int(0))) {
            var_3_654 = and:int(var_3_654:int, ldc:int(-21019123))
            var_5_81 = and:int(ldc:int(-17007), ldc:int(622))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-20318), ldc:int(19021)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_654:int, ldc:int(-134263169))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(16416), ldc:int(16417)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(22723), ldc:int(1313)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_654 = and:int(var_3_DA:int, ldc:int(-1090523414))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(1040), ldc:int(1041)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1508)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1843980684))
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-139039319))
                        goto(Label_0848)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-567647009))
                        goto(Label_0707)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1372004198))
                    }
                    else {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1279428819))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0575)
                            }
                            
                            goto(Label_0848)
                        }
                    }
                    
                    Label_0410:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1729626013))
                        goto(Label_1508)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1533016743))
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0848)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1451534607))
                        goto(Label_0707)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-889422319))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-201341041))
                            var_11_EB = and:int(ldc:int(9897), ldc:int(-30444))
                            goto(Label_1497)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0575:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(175420786))
                        goto(Label_1508)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(2124438318))
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1119258275))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0848)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(64)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-866509672))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(389588385))
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-88246581))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0848)
                        }
                    }
                    
                    Label_0707:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1508)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-346088046))
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1734142206))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(488038744))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(160558489))
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(151592230))
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-386054485))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0848:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1583551586))
                        goto(Label_1508)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(64)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-288528970))
                            goto(Label_0707)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-122213477))
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-235016328))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(6537), ldc:int(25089))
                                goto(Label_1111)
                            }
                        }
                    }
                    
                    Label_0961:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-466018628))
                        goto(Label_1508)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0848)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-219165618))
                            goto(Label_0707)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1049736991))
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1275111576))
                        var_11_EB = and:int(ldc:int(17551), ldc:int(-17568))
                    }
                    
                    Label_1111:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1237781539))
                        goto(Label_1508)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1902354998))
                        goto(Label_1370)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0961)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1656841522))
                            goto(Label_0848)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0707)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1463847315))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1370)
                            }
                        }
                    }
                    
                    Label_1226:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-824783277))
                        goto(Label_1508)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1875345239))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1111)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0961)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-769300049))
                            goto(Label_0848)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(1288810080))
                            goto(Label_0707)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-736096049))
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1543512498))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1497)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1370:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1508)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(733605068))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1288998679))
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0848)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0707)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(338090447))
                        goto(Label_0410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_654 = and:int(var_3_654:int, ldc:int(-67272994))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1497:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_65F = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1508:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-508291291))
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-783852199))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1737129790))
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0848)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0707)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1852769475))
                        goto(Label_0575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-318810532))
                        var_17_65F = add:int(var_16_119:int, xor:int(ldc:int(8738), ldc:int(8739)))
                        looporswitchbreak()
                    }
                }
                
                var_3_654 = and:int(var_3_654:int, ldc:int(-520102007))
                
                if (cmple:boolean(var_5_81 = var_17_65F:int, sub:int(var_6_88:int, xor:int(ldc:int(2112), ldc:int(2113))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
            var_3_654 = and:int(var_3_654:int, ldc:int(23109920))
            goto(Label_0108)
        }
    }
}
