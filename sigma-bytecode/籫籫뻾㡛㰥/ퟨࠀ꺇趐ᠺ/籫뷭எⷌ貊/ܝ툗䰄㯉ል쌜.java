public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u071d\ud217\u4c04\u3bc9\u120d\uc31c {
    public void \u071d\ud217\u4c04\u3bc9\u120d\uc31c(\u59ec\u8413\u97e6\uc229\u3776.\u3e75\u8753\u61a4\uc31c\u946b\u72f1 p0, \u5d20\u97b7\u8753\u873d\u16f6.\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7e3f\ubff1\u718f\ub171\u72f1 p2, java.util.Map p3) {
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
            putfield:\u3e75\u8753\u61a4\uc31c\u946b\u72f1(\u071d\ud217\u4c04\u3bc9\u120d\uc31c::\u34df\u4bc8\u3776\u873d\ub19c\uc87f, this:\u071d\ud217\u4c04\u3bc9\u120d\uc31c, p0:\u3e75\u8753\u61a4\uc31c\u946b\u72f1)
            putfield:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d(\u071d\ud217\u4c04\u3bc9\u120d\uc31c::\ua3b4\u071d\ub32d\u8640\u3c25\u392e, this:\u071d\ud217\u4c04\u3bc9\u120d\uc31c, p1:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d)
            putfield:\u7e3f\ubff1\u718f\ub171\u72f1(\u071d\ud217\u4c04\u3bc9\u120d\uc31c::\u8c8a\u9033\ub83f\uc2e8\u6d99\u8258, this:\u071d\ud217\u4c04\u3bc9\u120d\uc31c, p2:\u7e3f\ubff1\u718f\ub171\u72f1)
            putfield:Map(\u071d\ud217\u4c04\u3bc9\u120d\uc31c::\uc910\u4c04\u965f\u6d99\u7af6\u72f1, this:\u071d\ud217\u4c04\u3bc9\u120d\uc31c, p3:Map)
            invokespecial:Object(Object::<init>, this:\u071d\ud217\u4c04\u3bc9\u120d\uc31c)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4d85\uc4d2\uc238\u74b1\u92ff\u7049(\ub113\uc4d2\u183a\u527a\u6435.\uc4d2\u74b1\u8413\u67e9\u1833\u3bc9<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u3d4b\u5654\u8d98\u4bc8\u5db4> p0, \u3d64\u7af6\uae87\uc238\u7d52.\u3c25\u9033\uc229\u156b\u8d98\u7ce1<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u3d4b\u5654\u8d98\u4bc8\u5db4> p1) {
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
    
    public void \u873d\u0b8e\uc2e8\u7873\u0a06\ua61f(\ub113\uc4d2\u183a\u527a\u6435.\uc4d2\u74b1\u8413\u67e9\u1833\u3bc9<\u12b2\u7049\u8df4\uc9f6\uae87.\u7006\uc3e3\uc910\u9033\u8c8a> p0, \u3d64\u7af6\uae87\uc238\u7d52.\u3c25\u9033\uc229\u156b\u8d98\u7ce1<\u12b2\u7049\u8df4\uc9f6\uae87.\u7006\uc3e3\uc910\u9033\u8c8a> p1) {
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
    
    private void \u156b\u76bc\u5654\uff55\ua61f\u6b0d(\ub113\uc4d2\u183a\u527a\u6435.\uc4d2\u74b1\u8413\u67e9\u1833\u3bc9<T> p0, \u927d\u92ff\u71ae\uafe7\u6bb9.\u183a\u3dd3\u3776\u6fb0\u4f4a\uc87f<T> p1) {
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
    
    private static java.util.Map lambda$\uae87\u4c04\u965f\u600f\uc2e8\u983f$2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u9af2\u3504\ucfaf\uc229\u88c5 p0) {
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
            return:Map(invokestatic:HashMap[expected:Map](Maps::newHashMap))
        }
        
        goto(Label_0006)
    }
    
    private \u51fa\u12cb\u7330\u74b1\u6c52.\u8389\ub18d\u494c\u1833\ub8be\u6cfe lambda$\ud523\ub83f\u1833\u946b\u6fb0\u5fe1$1(net.minecraft.util.text.ITextComponent p0, java.util.List p1, java.lang.String p2, \u12b2\u7049\u8df4\uc9f6\uae87.\u7006\uc3e3\uc910\u9033\u8c8a p3) {
        expr_6D : \ub83f\u156b\ud7e8\u0c95\u47c2\ub32d [generated]
        
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
            expr_6D = getfield:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d(\u3e75\u8753\u61a4\uc31c\u946b\u72f1::\u6435\uff55\u5db4\u6198\u7873\u156b, getfield:\u3e75\u8753\u61a4\uc31c\u946b\u72f1(\u071d\ud217\u4c04\u3bc9\u120d\uc31c::\u34df\u4bc8\u3776\u873d\ub19c\uc87f, this:\u071d\ud217\u4c04\u3bc9\u120d\uc31c))
            invokevirtual:Class<? extends \ub83f\u156b\ud7e8\u0c95\u47c2\ub32d>(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::getClass, expr_6D:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d)
            return:\u8389\ub18d\u494c\u1833\ub8be\u6cfe(initobject:\ucef1\u7d52\u1187\u4cd9\u8640\ua61f(\ucef1\u7d52\u1187\u4cd9\u8640\ua61f::<init>, expr_6D:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d, p0:ITextComponent, p1:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>, p2:String, p3:\u7006\uc3e3\uc910\u9033\u8c8a))
        }
        
        goto(Label_0006)
    }
    
    private \u51fa\u12cb\u7330\u74b1\u6c52.\u8389\ub18d\u494c\u1833\ub8be\u6cfe lambda$\u927d\u67e9\u69d9\uc238\u3d4b\u36d3$0(net.minecraft.util.text.ITextComponent p0, java.util.List p1, java.lang.String p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u3d4b\u5654\u8d98\u4bc8\u5db4 p3) {
        expr_6D : \ub83f\u156b\ud7e8\u0c95\u47c2\ub32d [generated]
        
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
            expr_6D = getfield:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d(\u3e75\u8753\u61a4\uc31c\u946b\u72f1::\u6435\uff55\u5db4\u6198\u7873\u156b, getfield:\u3e75\u8753\u61a4\uc31c\u946b\u72f1(\u071d\ud217\u4c04\u3bc9\u120d\uc31c::\u34df\u4bc8\u3776\u873d\ub19c\uc87f, this:\u071d\ud217\u4c04\u3bc9\u120d\uc31c))
            invokevirtual:Class<? extends \ub83f\u156b\ud7e8\u0c95\u47c2\ub32d>(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::getClass, expr_6D:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d)
            return:\u8389\ub18d\u494c\u1833\ub8be\u6cfe(initobject:\ub70c\uc910\u6198\u8308\ubff1\u5f50(\ub70c\uc910\u6198\u8308\ubff1\u5f50::<init>, expr_6D:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d, p0:ITextComponent, p1:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>, p2:String, p3:\u3d4b\u5654\u8d98\u4bc8\u5db4))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_22B : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_110_0 : byte[] [generated]
        stack_112_0 : byte[] [generated]
        stack_151_0 : byte[] [generated]
        stack_1EC_0 : byte[] [generated]
        stack_23E_0 : byte[] [generated]
        stack_2B0_0 : byte[] [generated]
        stack_306_0 : byte[] [generated]
        var_4_1CD : int
        var_3_1D2 : byte[]
        var_5_1D3 : int
        var_0_234 : int
        expr_23E : byte [generated]
        stack_27E_2 : byte [generated]
        stack_25B_0 : byte [generated]
        expr_A7 : int [generated]
        var_2_D5 : byte[]
        expr_D9 : int [generated]
        var_3_29E : byte[]
        var_5_29F : int
        expr_112 : int [generated]
        var_3_2F4 : byte[]
        var_5_2F5 : int
        expr_306 : byte [generated]
        var_3_15D : String
        stack_1C6_0 : String[] [generated]
        expr_16F : String[] [generated]
        
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
        var_0_22B = and:int(ldc:int(1452825356), ldc:int(-1765815620))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_D5_0 = stack_D7_0 = stack_110_0 = stack_112_0 = stack_151_0 = stack_1EC_0 = stack_23E_0 = stack_2B0_0 = stack_306_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("q6i2/AXAu8QCiUrGgwGOwAVKNIHFghnHRUQ1u8UB2twaHQ==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1CD = expr_6E:int
        var_3_1D2 = newarray:byte[](byte.class, expr_6E:int)
        var_5_1D3 = expr_6E:int
        Label_0469:
        
        while (cmpeq:boolean(and:int(var_0_22B:int, ldc:int(8192)), ldc:int(0))) {
            var_0_22B = and:int(var_0_22B:int, ldc:int(-1296143588))
            var_5_1D3 = add:int(var_5_1D3:int, ldc:int(-1))
            storeelement:byte(var_3_1D2:byte[], var_5_1D3:int, xor:byte(add:byte(loadelement:byte(stack_1EC_0:byte[], var_5_1D3:int), ldc:byte(61)), ldc:byte(66)))
            
            if (cmpne:boolean(var_5_1D3:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_110_0 = stack_112_0 = stack_151_0 = stack_1EC_0 = stack_23E_0 = stack_2B0_0 = stack_306_0 = var_3_1D2:byte[]
            goto(Label_0115)
        }
        
        Label_0542:
        
        while (cmpeq:boolean(and:int(var_0_22B:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_234 = and:int(var_0_22B:int, ldc:int(-1834070068))
            var_5_1D3 = add:int(var_5_1D3:int, ldc:int(-1))
            expr_23E = stack_27E_2 = loadelement(stack_23E_0, var_5_1D3)
            
            if (cmplt:boolean(add:int(add:int(var_5_1D3:int, ldc:int(4)), neg:int(var_4_1CD:int)), ldc:int(0))) {
                stack_27E_2 = stack_25B_0 = add:byte(expr_23E:byte, loadelement:byte(var_3_1D2:byte[], add:int(var_5_1D3:int, ldc:int(4))))
                goto(Label_0619)
            }
            
            Label_0587:
            
            if (cmpne:boolean(and:int(var_0_234:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_234 = and:int(var_0_234:int, ldc:int(848055195))
                stack_27E_2 = stack_25B_0 = add:byte(expr_23E:byte, ldc:byte(4))
            }
            
            Label_0619:
            
            if (cmpeq:boolean(and:int(var_0_234:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0587)
            }
            
            var_0_22B = and:int(var_0_234:int, ldc:int(445512651))
            storeelement:byte(var_3_1D2:byte[], var_5_1D3:int, stack_27E_2:byte)
            
            if (cmpne:boolean(var_5_1D3:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_110_0 = stack_112_0 = stack_151_0 = stack_1EC_0 = stack_23E_0 = stack_2B0_0 = stack_306_0 = var_3_1D2:byte[]
            goto(Label_0172)
        }
        
        var_0_22B = and:int(var_0_22B:int, ldc:int(107001263))
        goto(Label_0469)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_22B:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_22B = and:int(var_0_22B:int, ldc:int(782778219))
            goto(Label_0279)
        }
        
        if (cmpne:boolean(and:int(var_0_22B:int, ldc:int(65536)), ldc:int(0))) {
            var_0_22B = and:int(var_0_22B:int, ldc:int(521893901))
            goto(Label_0222)
        }
        
        if (cmpeq:boolean(and:int(var_0_22B:int, ldc:int(65536)), ldc:int(0))) {
            var_0_22B = and:int(var_0_22B:int, ldc:int(-1148302518))
            expr_A7 = arraylength:int(stack_A7_0:byte[])
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_4_1CD = expr_A7:int
                var_3_1D2 = newarray:byte[](byte.class, expr_A7:int)
                var_5_1D3 = expr_A7:int
                goto(Label_0542)
            }
        }
        
        Label_0172:
        
        if (cmpne:boolean(and:int(var_0_22B:int, ldc:int(131072)), ldc:int(0))) {
            goto(Label_0279)
        }
        
        if (cmpne:boolean(and:int(var_0_22B:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_22B = and:int(var_0_22B:int, ldc:int(1012390998))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_22B:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_22B = and:int(var_0_22B:int, ldc:int(2139999195))
            var_2_D5 = stack_D5_0:byte[]
            expr_D9 = add:int(arraylength:int(stack_D7_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_D9:int, ldc:int(0))) {
                var_3_29E = newarray:byte[](byte.class, expr_D9:int)
                var_5_29F = expr_D9:int
                
                loop {
                    var_0_22B = and:int(var_0_22B:int, ldc:int(-1212358802))
                    var_5_29F = add:int(var_5_29F:int, ldc:int(-1))
                    storeelement:byte(var_3_29E:byte[], var_5_29F:int, add:int(shl:int(loadelement:byte(stack_2B0_0:byte[], var_5_29F:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_D5:byte[], add:int(var_5_29F:int, and:int(ldc:int(4099), ldc:int(541)))), ldc:int(2)), xor:int(ldc:int(185), ldc:int(134)))))
                    
                    if (cmpne:boolean(var_5_29F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_110_0 = stack_112_0 = stack_151_0 = stack_1EC_0 = stack_23E_0 = stack_2B0_0 = stack_306_0 = var_3_29E:byte[]
            }
        }
        
        Label_0222:
        
        if (cmpne:boolean(and:int(var_0_22B:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_22B = and:int(var_0_22B:int, ldc:int(-38959167))
        }
        else {
            if (cmpne:boolean(and:int(var_0_22B:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0172)
            }
            
            if (cmpeq:boolean(and:int(var_0_22B:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_22B = and:int(var_0_22B:int, ldc:int(-2061016117))
                goto(Label_0115)
            }
            
            var_0_22B = and:int(var_0_22B:int, ldc:int(-1831305251))
            expr_112 = arraylength:int(stack_112_0:byte[])
            
            if (cmpne:boolean(expr_112:int, ldc:int(0))) {
                var_3_2F4 = newarray:byte[](byte.class, expr_112:int)
                var_5_2F5 = expr_112:int
                
                loop {
                    var_0_22B = and:int(var_0_22B:int, ldc:int(401342121))
                    var_5_2F5 = add:int(var_5_2F5:int, ldc:int(-1))
                    expr_306 = loadelement:byte(stack_306_0:byte[], var_5_2F5:int)
                    storeelement:byte(var_3_2F4:byte[], var_5_2F5:int, or:int(and:int(shl:int(expr_306:byte, xor:int(ldc:int(-12270), ldc:int(-12266))), ldc:int(-16)), and:int(shr:int(expr_306:byte[expected:int], xor:int(ldc:int(16389), ldc:int(16385))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_2F5:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_110_0 = stack_112_0 = stack_151_0 = stack_1EC_0 = stack_23E_0 = stack_2B0_0 = stack_306_0 = var_3_2F4:byte[]
            }
        }
        
        Label_0279:
        
        if (cmpeq:boolean(and:int(var_0_22B:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_22B = and:int(var_0_22B:int, ldc:int(-1969950898))
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_22B:int, ldc:int(262144)), ldc:int(0))) {
            var_0_22B = and:int(var_0_22B:int, ldc:int(341776600))
            goto(Label_0172)
        }
        
        if (cmpeq:boolean(and:int(var_0_22B:int, ldc:int(524288)), ldc:int(0))) {
            var_0_22B = and:int(var_0_22B:int, ldc:int(-1632957277))
            goto(Label_0115)
        }
        
        var_3_15D = initobject:String(String::<init>, stack_151_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1C6_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(295), ldc:int(12891)))
        expr_16F = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2119), ldc:int(17411)))
        storeelement:String(expr_16F:String[], xor:int(ldc:int(2176), ldc:int(2178)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(-6485), ldc:int(6484)), and:int(ldc:int(1457), ldc:int(8193))))
        storeelement:String(expr_16F:String[], xor:int(ldc:int(-32232), ldc:int(-32231)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, xor:int(ldc:int(170), ldc:int(171)), xor:int(ldc:int(-31413), ldc:int(-31418))))
        storeelement:String(expr_16F:String[], and:int(ldc:int(25107), ldc:int(-26196)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(24925), ldc:int(525)), and:int(ldc:int(12833), ldc:int(1141))))
        putstatic:String[](\u071d\ud217\u4c04\u3bc9\u120d\uc31c::\u7e3f\u2dcc\uae5d\u5140\u64f2\uc84e, expr_16F:String[])
    }
    
    public void \uae5d\u62da\u965f\uc87f\u760c\u873d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6D5 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6E0 : int
        
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
        var_3_6D5 = and:int(ldc:int(1704580116), ldc:int(1134138487))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u071d\ud217\u4c04\u3bc9\u120d\uc31c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(524288)), ldc:int(0))) {
            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1001218448))
        }
        else {
            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1241495028))
            var_5_8A = and:int(ldc:int(18089), ldc:int(-22254))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(16388), ldc:int(-16389)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6D5:int, ldc:int(1238982156))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, xor:int(ldc:int(-12280), ldc:int(-12279)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(-31739), ldc:int(-31740)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6D5 = and:int(var_3_DA:int, ldc:int(1088003168))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(1632), ldc:int(1633)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-417197302))
                        goto(Label_1618)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1455415349))
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1200)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1181084037))
                        goto(Label_1040)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(960079143))
                        goto(Label_0747)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(428044993))
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1136646524))
                    }
                    else {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-459424326))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0613)
                            }
                            
                            goto(Label_0897)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1618)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-2092507558))
                        goto(Label_1461)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-540485554))
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1040)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1917466184))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1100412971))
                        goto(Label_0747)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(293691796))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-554165479))
                            loopcontinue()
                        }
                        
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-50757731))
                        var_11_EB = and:int(ldc:int(-9364), ldc:int(9347))
                        goto(Label_1607)
                    }
                    
                    Label_0613:
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-246194790))
                        goto(Label_1618)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(523658523))
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(685278082))
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(984985737))
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1040)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1550935185))
                            loopcontinue()
                        }
                        
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-572688435))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0897)
                        }
                    }
                    
                    Label_0747:
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(251086388))
                        goto(Label_1618)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1686983335))
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(2048926576))
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1171712484))
                        goto(Label_1040)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-2033059631))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-3053226))
                            loopcontinue()
                        }
                        
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(2061213386))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0897:
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-301383038))
                        goto(Label_1618)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1910415003))
                        goto(Label_1461)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1727791582))
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(863154571))
                        goto(Label_1200)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0747)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(978914440))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1756124207))
                            loopcontinue()
                        }
                        
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-385935433))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(2833), ldc:int(101))
                                goto(Label_1200)
                            }
                        }
                    }
                    
                    Label_1040:
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1618)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-98381596))
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(2113169813))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1754861289))
                            goto(Label_0747)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1305636826))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-270581818))
                        var_11_EB = and:int(ldc:int(18146), ldc:int(-18147))
                    }
                    
                    Label_1200:
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1618)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(287158768))
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1125159262))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1196150409))
                            goto(Label_1040)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0747)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1764964669))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1912599586))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1461)
                            }
                        }
                    }
                    
                    Label_1325:
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(266751078))
                        goto(Label_1618)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1200)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1040)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-368856566))
                            goto(Label_0747)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-48329428))
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1041454008))
                            loopcontinue()
                        }
                        
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-761530608))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                        goto(Label_1607)
                    }
                    
                    Label_1461:
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1535253241))
                        goto(Label_1618)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-218635434))
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1040)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1665835653))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0747)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(2031840887))
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(353995548))
                        loopcontinue()
                    }
                    
                    var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1306260741))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1607:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6E0 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1618:
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-675384465))
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1003741543))
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1040)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(825810263))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0747)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1777449768))
                        goto(Label_0613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1221715902))
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-660636366))
                        var_17_6E0 = add:int(var_16_119:int, and:int(ldc:int(1029), ldc:int(16657)))
                        looporswitchbreak()
                    }
                    
                    var_3_6D5 = and:int(var_3_6D5:int, ldc:int(180382477))
                }
                
                var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-861963182))
                
                if (cmple:boolean(var_5_8A = var_17_6E0:int, sub:int(var_6_91:int, and:int(ldc:int(4387), ldc:int(1237))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
