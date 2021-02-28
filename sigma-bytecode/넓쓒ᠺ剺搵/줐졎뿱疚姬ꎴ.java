public interface \ub113\uc4d2\u183a\u527a\u6435.\uc910\uc84e\ubff1\u759a\u59ec\ua3b4<P> {
    com.mojang.serialization.Codec<P> \u5245\u71f1\ub18d\uc3e3\uc84e\u52d3();
    
    \ub113\uc4d2\u183a\u527a\u6435.\uc910\uc84e\ubff1\u759a\u59ec\ua3b4<P> \u960f\u16f6\uf94d\uae87\u6ec6\u12cb(java.lang.String p0, com.mojang.serialization.Codec<P> p1) {
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
    
    com.mojang.serialization.Codec lambda$\u5f50\ub8be\u56bd\u93a2\ube23\u156b$0(com.mojang.serialization.Codec p0) {
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
            putstatic:\uc910\uc84e\ubff1\u759a\u59ec\ua3b4<\u98a4\u4f4a\u3504\ub171\u52d3\u156b>(\uc910\uc84e\ubff1\u759a\u59ec\ua3b4::\u7c6b\u6cfe\ud4fe\u97e6\u56bd\u8cae, invokestatic:\uc910\uc84e\ubff1\u759a\u59ec\ua3b4<\u98a4\u4f4a\u3504\ub171\u52d3\u156b>(\uc910\uc84e\ubff1\u759a\u59ec\ua3b4<P>::\u960f\u16f6\uf94d\uae87\u6ec6\u12cb, ldc:String("always_true"), getstatic:Codec<\u98a4\u4f4a\u3504\ub171\u52d3\u156b>(\u98a4\u4f4a\u3504\ub171\u52d3\u156b::\u71ae\uafe7\uc84e\u647c\u40a9\u927d)))
            putstatic:\uc910\uc84e\ubff1\u759a\u59ec\ua3b4<\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255>(\uc910\uc84e\ubff1\u759a\u59ec\ua3b4::\u7af6\uc910\uc7fe\u4492\u0b8e\u0b8e, invokestatic:\uc910\uc84e\ubff1\u759a\u59ec\ua3b4<\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255>(\uc910\uc84e\ubff1\u759a\u59ec\ua3b4<P>::\u960f\u16f6\uf94d\uae87\u6ec6\u12cb, ldc:String("linear_pos"), getstatic:Codec<\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255>(\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255::\ua6bd\uff55\u5140\ud523\u120d\u3d64)))
            putstatic:\uc910\uc84e\ubff1\u759a\u59ec\ua3b4<\uff55\u7873\u927d\ub8be\u8258\u6b0d>(\uc910\uc84e\ubff1\u759a\u59ec\ua3b4::\uc229\u4e72\ud217\u385b\u4d85\u8640, invokestatic:\uc910\uc84e\ubff1\u759a\u59ec\ua3b4<\uff55\u7873\u927d\ub8be\u8258\u6b0d>(\uc910\uc84e\ubff1\u759a\u59ec\ua3b4<P>::\u960f\u16f6\uf94d\uae87\u6ec6\u12cb, ldc:String("axis_aligned_linear_pos"), getstatic:Codec<\uff55\u7873\u927d\ub8be\u8258\u6b0d>(\uff55\u7873\u927d\ub8be\u8258\u6b0d::\u4d85\ub102\ub70c\uae87\uc4d2\u3bc9)))
            return:void()
        }
        
        goto(Label_0006)
    }
}
