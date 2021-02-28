public interface \u3504\ufe34\u600f\u6b0d\u69d9.\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6<P> {
    com.mojang.serialization.Codec<P> \u93a2\u74b1\u6c56\u8413\uc9f6\ucef1();
    
    \u3504\ufe34\u600f\u6b0d\u69d9.\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6<P> \uf995\ub102\u9255\ucfaf\ucfaf\u7330(java.lang.String p0, com.mojang.serialization.Codec<P> p1) {
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
    
    com.mojang.serialization.Codec lambda$\u61a4\u3a62\u5140\u3e2a\u5fe1\u946b$0(com.mojang.serialization.Codec p0) {
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
            return:Codec(p0:Codec)
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
            putstatic:\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6<\ud171\u4179\u4975\ub102\u8709\u8350>(\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6::\u4492\u6b0d\u8350\u516c\u446c\u4bc8, invokestatic:\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6<\ud171\u4179\u4975\ub102\u8709\u8350>(\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6<P>::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, ldc:String("always_true"), getstatic:Codec<\ud171\u4179\u4975\ub102\u8709\u8350>(\ud171\u4179\u4975\ub102\u8709\u8350::\u8308\u8753\uc4d2\ub171\u3a62\uc87f)))
            putstatic:\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6<\uf995\u071d\u47c2\u92ee\u56bd\u76bc>(\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6::\u64ab\u72f1\ud4fe\u3dd3\u6435\u836c, invokestatic:\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6<\uf995\u071d\u47c2\u92ee\u56bd\u76bc>(\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6<P>::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, ldc:String("block_match"), getstatic:Codec<\uf995\u071d\u47c2\u92ee\u56bd\u76bc>(\uf995\u071d\u47c2\u92ee\u56bd\u76bc::\u0a06\u5654\uc910\u8709\u8c8a\u7006)))
            putstatic:\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6<\u4c2b\u9af2\u9033\u718f\u6435\uc31c>(\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6::\ua3b4\u446c\u6fb0\ube23\u6435\u99f7, invokestatic:\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6<\u4c2b\u9af2\u9033\u718f\u6435\uc31c>(\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6<P>::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, ldc:String("blockstate_match"), getstatic:Codec<\u4c2b\u9af2\u9033\u718f\u6435\uc31c>(\u4c2b\u9af2\u9033\u718f\u6435\uc31c::\u6c56\u72f1\u16f6\u7c6b\u6cfe\uc238)))
            putstatic:\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6<\u4daf\uc87f\uc31c\u34df\ucfaf\u392e>(\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6::\u34df\u3711\ubff1\u5f50\u7d52\u67d0, invokestatic:\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6<\u4daf\uc87f\uc31c\u34df\ucfaf\u392e>(\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6<P>::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, ldc:String("tag_match"), getstatic:Codec<\u4daf\uc87f\uc31c\u34df\ucfaf\u392e>(\u4daf\uc87f\uc31c\u34df\ucfaf\u392e::\u62da\u5140\u6b5f\ub1b9\u8308\u51fa)))
            putstatic:\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6<\u0a06\u527a\u927d\uafe7\u5d20\u516c>(\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6::\u120d\u71f1\ub32d\u67d0\ud158\ufe34, invokestatic:\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6<\u0a06\u527a\u927d\uafe7\u5d20\u516c>(\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6<P>::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, ldc:String("random_block_match"), getstatic:Codec<\u0a06\u527a\u927d\uafe7\u5d20\u516c>(\u0a06\u527a\u927d\uafe7\u5d20\u516c::\ub32d\ud217\uae87\uff55\u4179\u8709)))
            putstatic:\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6<\ud158\u9255\u6198\u183a\u98a4\u4975>(\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6::\u64ab\u6d99\uc229\ucb79\u51fa\u600f, invokestatic:\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6<\ud158\u9255\u6198\u183a\u98a4\u4975>(\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6<P>::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, ldc:String("random_blockstate_match"), getstatic:Codec<\ud158\u9255\u6198\u183a\u98a4\u4975>(\ud158\u9255\u6198\u183a\u98a4\u4975::\u8308\u69d9\ud171\u3bd6\uff55\u5140)))
            return:void()
        }
        
        goto(Label_0006)
    }
}
