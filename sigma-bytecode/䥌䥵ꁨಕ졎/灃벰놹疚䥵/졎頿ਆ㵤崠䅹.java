public interface \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\uc84e\u983f\u0a06\u3d64\u5d20\u4179 {
    java.lang.String \u51b2\u67e9\ua068\u4e72\u4f4a\u1187();
    
    void \uc2e8\u47c2\ub19c\ub32d\u40a9\u61a4(boolean p0);
    
    int \ua068\u624e\u40a9\u3e75\u9a18\u836c();
    
    void \uc229\ud217\u760c\ufcaf\ua562\u8640(int p0);
    
    void \uae5d\u9af2\uc229\u3711\uc238\u9af2(int p0);
    
    int \u446c\u4975\uc87f\u52d3\u3e2a\ua068();
    
    void \u8350\u5245\u4f4a\u3d64\u5654\u3d64(\u5245\u8aa5\u61a4\u7049\u4cd9.\u446c\u67d0\ua562\u97b7\u6c56\u59ec p0) {
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
    
    int \u6c56\u156b\u4f52\u3776\ub113\u494c();
    
    void \u93a2\u4c04\u4e72\u9255\u7049\ud217(int p0);
    
    int \u647c\uc7fe\u0c95\u385b\u392e\uc31c();
    
    void \u4bc8\u1833\u6bb9\u8cae\u5d20\u6d69(int p0);
    
    int \u7bad\u3e2a\u0800\uc4d2\u3d64\ub18d();
    
    void \u7049\ub8be\u873d\u8258\u69d9\u8cae(int p0);
    
    void \ub171\u36d3\u8258\uafe7\u40a9\u0800(java.util.UUID p0);
    
    \u3504\ufe34\u600f\u6b0d\u69d9.\uf94d\u51b2\u1833\u34df\u1187 \u1833\ub102\u72f1\u4ab3\u647c\uff55();
    
    void \u3e2a\u51fa\uae5d\u4c2b\u62da\u5654(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ud523\u0a06\u76bc\u4e72\u59ec\ufe34 p0);
    
    \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ud523\u0a06\u76bc\u4e72\u59ec\ufe34 \u1833\uf9c5\u1833\u98a4\ucb79\ub70c();
    
    boolean \u6b0d\ub83f\u47c2\u8d98\u8cae\ua068();
    
    void \u4ab3\u624e\u8350\u36d3\uc246\u600f(boolean p0);
    
    boolean \u8709\u0b8e\u6d99\u3c25\u9033\uae5d();
    
    void \ud171\u983f\u6d69\u92ee\u5fe1\u4c2b(\u3504\ufe34\u600f\u6b0d\u69d9.\uf94d\u51b2\u1833\u34df\u1187 p0);
    
    \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u7873\u7ce1\u516c\u1833\ua6bd<\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u88c5\ud171\ub113\u6435\ud51e> \uc9f6\u0c95\u8640\u0b8e\u960f\u51fa();
    
    void \u416d\u7ce1\u8350\u527a\u9033\ub70c(long p0);
    
    void \u527a\uc7fe\u6d99\ud4fe\u7049\u3e2a(long p0);
    
    java.lang.String lambda$\uae87\u3bc9\ub7dc\u56bd\u8cae\u600f$1() {
        stack_B4_0 : String [generated]
        expr_69 : Object[] [generated]
        
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
            stack_B4_0 = ldc:String("Rain time: %d (now: %b), thunder time: %d (now: %b)")
            expr_69 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(21505), ldc:int(21509)))
            storeelement:Object(expr_69:Object[], and:int(ldc:int(-22187), ldc:int(5794)), invokestatic:Integer[expected:Object](Integer::valueOf, invokeinterface:int(\uc84e\u983f\u0a06\u3d64\u5d20\u4179::\ua068\u624e\u40a9\u3e75\u9a18\u836c, this:\uc84e\u983f\u0a06\u3d64\u5d20\u4179)))
            storeelement:Object(expr_69:Object[], and:int(ldc:int(24843), ldc:int(5249)), invokestatic:Boolean[expected:Object](Boolean::valueOf, invokeinterface:boolean(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\u12cb\u946b\ubb2b\u7bad\u6bb9\u8c8a, this:\uc84e\u983f\u0a06\u3d64\u5d20\u4179[expected:\u4492\u92ee\u9255\uc29a\u3e75\u7043])))
            storeelement:Object(expr_69:Object[], and:int(ldc:int(22), ldc:int(770)), invokestatic:Integer[expected:Object](Integer::valueOf, invokeinterface:int(\uc84e\u983f\u0a06\u3d64\u5d20\u4179::\u446c\u4975\uc87f\u52d3\u3e2a\ua068, this:\uc84e\u983f\u0a06\u3d64\u5d20\u4179)))
            storeelement:Object(expr_69:Object[], and:int(ldc:int(643), ldc:int(3)), invokestatic:Boolean[expected:Object](Boolean::valueOf, invokeinterface:boolean(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\uc229\u6bb9\u3a62\ub6ab\ud7e8\u97b7, this:\uc84e\u983f\u0a06\u3d64\u5d20\u4179[expected:\u4492\u92ee\u9255\uc29a\u3e75\u7043])))
            return:String(invokestatic:String(String::format, stack_B4_0:String, expr_69:Object[]))
        }
        
        goto(Label_0006)
    }
    
    java.lang.String lambda$\uafe7\ub113\u8413\ubcb0\u4f4a\u960f$0() {
        stack_B7_0 : String [generated]
        expr_69 : Object[] [generated]
        
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
            stack_B7_0 = ldc:String("Game mode: %s (ID %d). Hardcore: %b. Cheats: %b")
            expr_69 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(18534), ldc:int(140)))
            storeelement:Object(expr_69:Object[], and:int(ldc:int(-9903), ldc:int(9898)), invokevirtual:String[expected:Object](\uf94d\u51b2\u1833\u34df\u1187::\uf94d\u183a\u446c\u71f1\u5654\u9033, invokeinterface:\uf94d\u51b2\u1833\u34df\u1187(\uc84e\u983f\u0a06\u3d64\u5d20\u4179::\u1833\ub102\u72f1\u4ab3\u647c\uff55, this:\uc84e\u983f\u0a06\u3d64\u5d20\u4179)))
            storeelement:Object(expr_69:Object[], xor:int(ldc:int(-32764), ldc:int(-32763)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\uf94d\u51b2\u1833\u34df\u1187::\u873d\u47c2\ube23\uc29a\u71ae\u2dcc, invokeinterface:\uf94d\u51b2\u1833\u34df\u1187(\uc84e\u983f\u0a06\u3d64\u5d20\u4179::\u1833\ub102\u72f1\u4ab3\u647c\uff55, this:\uc84e\u983f\u0a06\u3d64\u5d20\u4179))))
            storeelement:Object(expr_69:Object[], xor:int(ldc:int(0), ldc:int(2)), invokestatic:Boolean[expected:Object](Boolean::valueOf, invokeinterface:boolean(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\u7af6\u946b\uceb8\uc246\u5d20\u6b5f, this:\uc84e\u983f\u0a06\u3d64\u5d20\u4179[expected:\u4492\u92ee\u9255\uc29a\u3e75\u7043])))
            storeelement:Object(expr_69:Object[], xor:int(ldc:int(1064), ldc:int(1067)), invokestatic:Boolean[expected:Object](Boolean::valueOf, invokeinterface:boolean(\uc84e\u983f\u0a06\u3d64\u5d20\u4179::\u8709\u0b8e\u6d99\u3c25\u9033\uae5d, this:\uc84e\u983f\u0a06\u3d64\u5d20\u4179)))
            return:String(invokestatic:String(String::format, stack_B7_0:String, expr_69:Object[]))
        }
        
        goto(Label_0006)
    }
}
