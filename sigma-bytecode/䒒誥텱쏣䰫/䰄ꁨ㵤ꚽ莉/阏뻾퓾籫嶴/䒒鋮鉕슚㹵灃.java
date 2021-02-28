public interface \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u4492\u92ee\u9255\uc29a\u3e75\u7043 {
    int \uc910\u3d64\u62da\u62da\u7c6b\u8d90();
    
    int \u1833\ub83f\uc29a\u3e2a\u5f50\u3711();
    
    int \u1187\ub171\ub70c\ufcaf\u69d9\u4d85();
    
    float \ub18d\u9937\uf995\u7ce1\u983f\u9033();
    
    long \u93a2\u0b8e\u40a9\u8640\u93a2\u64ab();
    
    long \ud523\ud523\u64f2\uc229\u071d\ud12e();
    
    boolean \uc229\u6bb9\u3a62\ub6ab\ud7e8\u97b7();
    
    boolean \u12cb\u946b\ubb2b\u7bad\u6bb9\u8c8a();
    
    void \u3776\u6d69\u4ab3\ub18d\uc29a\u2dcc(boolean p0);
    
    boolean \u7af6\u946b\uceb8\uc246\u5d20\u6b5f();
    
    \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7e3f\ubff1\u718f\ub171\u72f1 \uf94d\u873d\u836c\u9a18\u718f\ud7e8();
    
    \u6435\ub8be\u718f\u6b0d\u67e9.\u8753\u0800\u4f4a\u4975\u64ab\u4c04 \u3bc9\u6435\u47c2\uf9c5\u3a62\u6198();
    
    boolean \uc87f\u71ae\u5245\uff55\u9255\u5140();
    
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
    
    java.lang.String lambda$\uae87\u3bc9\ub7dc\u56bd\u8cae\u600f$1() {
        stack_90_0 : String [generated]
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
            stack_90_0 = ldc:String("%d game time, %d day time")
            expr_69 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(4698), ldc:int(1410)))
            storeelement:Object(expr_69:Object[], and:int(ldc:int(25744), ldc:int(-27801)), invokestatic:Long[expected:Object](Long::valueOf, invokeinterface:long(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\u93a2\u0b8e\u40a9\u8640\u93a2\u64ab, this:\u4492\u92ee\u9255\uc29a\u3e75\u7043)))
            storeelement:Object(expr_69:Object[], xor:int(ldc:int(20624), ldc:int(20625)), invokestatic:Long[expected:Object](Long::valueOf, invokeinterface:long(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\ud523\ud523\u64f2\uc229\u071d\ud12e, this:\u4492\u92ee\u9255\uc29a\u3e75\u7043)))
            return:String(invokestatic:String(String::format, stack_90_0:String, expr_69:Object[]))
        }
        
        goto(Label_0006)
    }
    
    java.lang.String lambda$\uafe7\ub113\u8413\ubcb0\u4f4a\u960f$0() {
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
            return:String(invokestatic:String(\u446c\u67d0\ua562\u97b7\u6c56\u59ec::\u927d\u16f6\u3bd6\u8aa5\u6b0d\u7e3f, invokeinterface:int(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\uc910\u3d64\u62da\u62da\u7c6b\u8d90, this:\u4492\u92ee\u9255\uc29a\u3e75\u7043), invokeinterface:int(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\u1833\ub83f\uc29a\u3e2a\u5f50\u3711, this:\u4492\u92ee\u9255\uc29a\u3e75\u7043), invokeinterface:int(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\u1187\ub171\ub70c\ufcaf\u69d9\u4d85, this:\u4492\u92ee\u9255\uc29a\u3e75\u7043)))
        }
        
        goto(Label_0006)
    }
}
