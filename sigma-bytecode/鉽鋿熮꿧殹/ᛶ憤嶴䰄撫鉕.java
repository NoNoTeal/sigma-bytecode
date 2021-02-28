public class \u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 {
    public void \u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u527a\u873d\u071d\u4f52\uc229\ud217 p0, \u56bd\u8413\u647c\u5bc4\ud158.\uc84e\uc229\u7006\u7049\ufe34\ubb2b p1, \u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c> p2, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u3d4b\u9937\u7af6\u7af6\u6198\uae87 p3, int p4, java.util.function.Supplier<\ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d> p5, \u47c2\u2dcc\u12cb\ud171\u8c8a.\u9937\u7d52\u3e75\u98a4\u8aa5\u7006 p6, boolean p7, long p8) {
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
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\ua61f\u183a\u6c52\uf9c5\u4cd9\u4d85 \u7873\u67e9\u3e75\ub6ab\u7873\u7873() {
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
            return:\ua61f\u183a\u6c52\uf9c5\u4cd9\u4d85(getfield:\ua61f\u183a\u6c52\uf9c5\u4cd9\u4d85(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\ub8be\u120d\u6b5f\u93a2\u67d0\u4975, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255))
        }
        
        goto(Label_0006)
    }
    
    public void \u12b2\u071d\u1187\u6cfe\u647c\u88c5(java.util.function.BooleanSupplier p0) {
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
            invokevirtual:void(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u416d\ud171\ubefe\u0b8e\ucb79\u3d4b, invokevirtual:\u34df\u4492\u71ae\uc238\u7873\uafe7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]))
            invokespecial:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u6d69\u6d99\uff55\u16f6\u40a9\u98a4, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)
            invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u4179\u97b7\u3d64\ufcaf\u6ec6\u8c8a, invokevirtual:\ubf56\u64f2\u392e\u98a4\u120d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8d90\uae5d\u7049\u61a4\uceb8\u8df4, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]), loadelement:String(getstatic:String[](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uc3e3\ucfaf\uc910\u6198\u5245\u8640), and:int(ldc:int(16950), ldc:int(-16951))))
            invokevirtual:void(\ua562\u7330\ub113\u64ab\u6d69\u5fe1::\u4f4a\u3bd6\u8389\ubcb0\ucfaf\ub18d, getfield:\ua562\u7330\ub113\u64ab\u6d69\u5fe1(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\ubcb0\u7e3f\u47c2\u98a4\u385b\uc238, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255), p0:BooleanSupplier)
            invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u61a4\u4c04\uf995\uc31c\u4ab3\u6d69, invokevirtual:\ubf56\u64f2\u392e\u98a4\u120d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8d90\uae5d\u7049\u61a4\uceb8\u8df4, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u6d69\u6d99\uff55\u16f6\u40a9\u98a4() {
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
            invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u71f1\u34df\u385b\ud158\u4c2b\u8308, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, add:long(invokeinterface:long(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\u93a2\u0b8e\u40a9\u8640\u93a2\u64ab, getfield:\u7873\u7006\u960f\ua6bd\u839e\u7873[expected:\u4492\u92ee\u9255\uc29a\u3e75\u7043](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u527a\u3d64\ud171\u59ec\u836c\u6b0d, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)), ldc:long(1L)))
            
            if (invokevirtual:boolean(\u7e3f\ubff1\u718f\ub171\u72f1::\ub113\u718f\u8389\u071d\uc87f\u16f6, invokeinterface:\u7e3f\ubff1\u718f\ub171\u72f1(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\uf94d\u873d\u836c\u9a18\u718f\ud7e8, getfield:\u7873\u7006\u960f\ua6bd\u839e\u7873[expected:\u4492\u92ee\u9255\uc29a\u3e75\u7043](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u527a\u3d64\ud171\u59ec\u836c\u6b0d, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)), getstatic:\uc4d2\u74b1\u8413\u67e9\u1833\u3bc9<\u3d4b\u5654\u8d98\u4bc8\u5db4>(\u7e3f\ubff1\u718f\ub171\u72f1::\u5245\u965f\ubcb0\u4f52\ud217\uc3e3))) {
                invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u4e72\uc7fe\u71f1\u8c8a\u5bc4\u2dcc, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, add:long(invokeinterface:long(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\ud523\ud523\u64f2\uc229\u071d\ud12e, getfield:\u7873\u7006\u960f\ua6bd\u839e\u7873[expected:\u4492\u92ee\u9255\uc29a\u3e75\u7043](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u527a\u3d64\ud171\u59ec\u836c\u6b0d, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)), ldc:long(1L)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u71f1\u34df\u385b\ud158\u4c2b\u8308(long p0) {
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
            invokevirtual:void(\uc84e\uc229\u7006\u7049\ufe34\ubb2b::\uc84e\u7873\u7049\u760c\u9033\ubefe, getfield:\uc84e\uc229\u7006\u7049\ufe34\ubb2b(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u759a\uc2e8\u759a\uc910\ub8be\uae5d, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255), p0:long)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4e72\uc7fe\u71f1\u8c8a\u5bc4\u2dcc(long p0) {
        var_3_61 : int
        
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
            var_3_61 = and:int(ldc:int(553281313), ldc:int(-1519853762))
            
            if (cmpge:boolean(p0:long, ldc:long(0L))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(2045279728))
                invokevirtual:void(\u3d4b\u5654\u8d98\u4bc8\u5db4::\u1833\u516c\u8709\u51fa\ub32d\u4c04, checkcast:\u3d4b\u5654\u8d98\u4bc8\u5db4(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u3d4b\u5654\u8d98\u4bc8\u5db4.class, invokevirtual:\u3d4b\u5654\u8d98\u4bc8\u5db4(\u7e3f\ubff1\u718f\ub171\u72f1::\u873d\ud171\u97e6\u6c56\u718f\u5bc4, invokevirtual:\u7e3f\ubff1\u718f\ub171\u72f1(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8cae\u7330\u9937\ub83f\ube23\u6d69, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]), getstatic:\uc4d2\u74b1\u8413\u67e9\u1833\u3bc9<\u3d4b\u5654\u8d98\u4bc8\u5db4>(\u7e3f\ubff1\u718f\ub171\u72f1::\u5245\u965f\ubcb0\u4f52\ud217\uc3e3))), xor:int[expected:boolean](ldc:int(12288), ldc:int(12289)), checkcast:\u88c5\ud171\ub113\u6435\ud51e(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u88c5\ud171\ub113\u6435\ud51e.class, aconstnull:\u88c5\ud171\ub113\u6435\ud51e()))
            }
            else {
                p0 = neg:long(p0:long)
                invokevirtual:void(\u3d4b\u5654\u8d98\u4bc8\u5db4::\u1833\u516c\u8709\u51fa\ub32d\u4c04, checkcast:\u3d4b\u5654\u8d98\u4bc8\u5db4(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u3d4b\u5654\u8d98\u4bc8\u5db4.class, invokevirtual:\u3d4b\u5654\u8d98\u4bc8\u5db4(\u7e3f\ubff1\u718f\ub171\u72f1::\u873d\ud171\u97e6\u6c56\u718f\u5bc4, invokevirtual:\u7e3f\ubff1\u718f\ub171\u72f1(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8cae\u7330\u9937\ub83f\ube23\u6d69, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]), getstatic:\uc4d2\u74b1\u8413\u67e9\u1833\u3bc9<\u3d4b\u5654\u8d98\u4bc8\u5db4>(\u7e3f\ubff1\u718f\ub171\u72f1::\u5245\u965f\ubcb0\u4f52\ud217\uc3e3))), and:int[expected:boolean](ldc:int(-2459), ldc:int(2458)), checkcast:\u88c5\ud171\ub113\u6435\ud51e(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u88c5\ud171\ub113\u6435\ud51e.class, aconstnull:\u88c5\ud171\ub113\u6435\ud51e()))
            }
            
            invokevirtual:void(\uc84e\uc229\u7006\u7049\ufe34\ubb2b::\u34df\u120d\u5db4\ud4fe\ucb79\u927d, getfield:\uc84e\uc229\u7006\u7049\ufe34\ubb2b(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u759a\uc2e8\u759a\uc910\ub8be\uae5d, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255), p0:long)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Iterable<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f> \u3bc9\u4daf\u446c\u647c\u7ce1\u960f() {
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
            return:Iterable<\u7d52\u718f\u3776\u6fb0\ub83f>(invokeinterface:ObjectCollection[expected:Iterable<\u7d52\u718f\u3776\u6fb0\ub83f>](Int2ObjectMap::values, getfield:Int2ObjectMap<\u7d52\u718f\u3776\u6fb0\ub83f>(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uc246\ub171\u4e72\u7006\u4d85\ud7e8, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)))
        }
        
        goto(Label_0006)
    }
    
    public void \u392e\u5245\uf9c5\u0b8e\u7af6\u71ae() {
        var_1_61 : int
        var_3_66 : \ubf56\u64f2\u392e\u98a4\u120d
        var_4_86 : ObjectIterator
        var_1_12A : int
        var_6_E5 : \u7d52\u718f\u3776\u6fb0\ub83f
        var_1_133 : int
        
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
            var_1_61 = and:int(ldc:int(-1311229015), ldc:int(-655221977))
            var_3_66 = invokevirtual:\ubf56\u64f2\u392e\u98a4\u120d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8d90\uae5d\u7049\u61a4\uceb8\u8df4, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c])
            invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u4179\u97b7\u3d64\ufcaf\u6ec6\u8c8a, var_3_66:\ubf56\u64f2\u392e\u98a4\u120d, loadelement:String(getstatic:String[](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uc3e3\ucfaf\uc910\u6198\u5245\u8640), xor:int(ldc:int(16944), ldc:int(16945))))
            var_4_86 = invokeinterface:ObjectIterator(ObjectSet::iterator, invokeinterface:ObjectSet(Int2ObjectMap::int2ObjectEntrySet, getfield:Int2ObjectMap<\u7d52\u718f\u3776\u6fb0\ub83f>(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uc246\ub171\u4e72\u7006\u4d85\ud7e8, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)))
            
            loop {
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(64)), ldc:int(0))) {
                    var_1_12A = and:int(var_1_61:int, ldc:int(-152300057))
                }
                else {
                    var_1_12A = and:int(var_1_61:int, ldc:int(-541467861))
                    
                    if (invokeinterface:boolean(ObjectIterator::hasNext, var_4_86:ObjectIterator)) {
                        var_6_E5 = checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:Object[expected:\u7d52\u718f\u3776\u6fb0\ub83f](Int2ObjectMap$Entry::getValue, checkcast:Int2ObjectMap$Entry(it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry.class, invokeinterface:Object[expected:Int2ObjectMap$Entry](ObjectIterator::next, var_4_86:ObjectIterator))))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u72f1\u8753\u8bb0\ub102\ua3b4\u3c25, var_6_E5:\u7d52\u718f\u3776\u6fb0\ub83f))) {
                            invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u4179\u97b7\u3d64\ufcaf\u6ec6\u8c8a, var_3_66:\ubf56\u64f2\u392e\u98a4\u120d, loadelement:String(getstatic:String[](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uc3e3\ucfaf\uc910\u6198\u5245\u8640), xor:int(ldc:int(145), ldc:int(147))))
                            
                            if (getfield:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\ua6bd\u3a62\ua61f\u12b2\u3e2a\ub19c, var_6_E5:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                                goto(Label_0285)
                            }
                            
                            invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u4d85\u385b\ua3b4\u5654\ubf56\ub8be, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], invokedynamic:Consumer<\u7d52\u718f\u3776\u6fb0\ub83f>(accept:(L\u927d\u92ff\u71ae\uafe7\u6bb9/\u16f6\u61a4\u5db4\u4c04\u64ab\u9255;)Ljava/util/function/Consumer;, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255), var_6_E5:\u7d52\u718f\u3776\u6fb0\ub83f)
                            goto(Label_0285)
                        }
                        
                        Label_0239:
                        
                        if (cmpne:boolean(and:int(var_1_12A:int, ldc:int(32)), ldc:int(0))) {
                            var_1_61 = and:int(var_1_12A:int, ldc:int(-1091191825))
                            loopcontinue()
                        }
                        
                        Label_0285:
                        
                        if (cmpne:boolean(and:int(var_1_12A:int, ldc:int(64)), ldc:int(0))) {
                            var_1_12A = and:int(var_1_12A:int, ldc:int(-1073405436))
                            goto(Label_0239)
                        }
                        
                        var_1_133 = and:int(var_1_12A:int, ldc:int(-17323342))
                        invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u61a4\u4c04\uf995\uc31c\u4ab3\u6d69, var_3_66:\ubf56\u64f2\u392e\u98a4\u120d)
                        invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u4179\u97b7\u3d64\ufcaf\u6ec6\u8c8a, var_3_66:\ubf56\u64f2\u392e\u98a4\u120d, loadelement:String(getstatic:String[](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uc3e3\ucfaf\uc910\u6198\u5245\u8640), xor:int(ldc:int(4), ldc:int(7))))
                        
                        if (getfield:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\ua6bd\u3a62\ua61f\u12b2\u3e2a\ub19c, var_6_E5:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                            invokeinterface:void(ObjectIterator::remove, var_4_86:ObjectIterator)
                            invokespecial:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3711\ub171\uc246\u759a\u16f6\u3d64, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, var_6_E5:\u7d52\u718f\u3776\u6fb0\ub83f)
                        }
                        
                        var_1_12A = and:int(var_1_133:int, ldc:int(-572944519))
                        invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u61a4\u4c04\uf995\uc31c\u4ab3\u6d69, var_3_66:\ubf56\u64f2\u392e\u98a4\u120d)
                        goto(Label_0239)
                    }
                }
                
                if (cmpeq:boolean(and:int(var_1_12A:int, ldc:int(131072)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_61 = and:int(var_1_12A:int, ldc:int(1342299924))
            }
            
            invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u156b\u12cb\uc31c\ucfaf\u36d3\u392e, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c])
            invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u61a4\u4c04\uf995\uc31c\u4ab3\u6d69, var_3_66:\ubf56\u64f2\u392e\u98a4\u120d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7873\uc4d2\uc84e\ube23\u6d99\u8640(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
    
    public void \u8d90\u8640\u4179\u6cfe\u6d99\u7ce1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p1) {
        var_3_1C6 : int
        var_5_1BF : Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>
        
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
        var_3_1C6 = and:int(ldc:int(1400241361), ldc:int(1541151925))
        
        if (logicalnot:boolean(getfield:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\ua6bd\u3a62\ua61f\u12b2\u3e2a\ub19c, p1:\u7d52\u718f\u3776\u6fb0\ub83f))) {
            if (cmpeq:boolean(invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u7d52\u718f\u3776\u6fb0\ub83f::\u183a\u36d3\u6bb9\u647c\u7873\uceb8, p1:\u7d52\u718f\u3776\u6fb0\ub83f), p0:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d.class, p1:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                    goto(Label_0195)
                }
                
                if (logicalnot:boolean(invokevirtual:boolean(\ua562\u7330\ub113\u64ab\u6d69\u5fe1::\ufcaf\u67e9\u873d\u8709\ud51e\u97b7, invokevirtual:\ua562\u7330\ub113\u64ab\u6d69\u5fe1(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255), p1:\u7d52\u718f\u3776\u6fb0\ub83f))) {
                    goto(Label_0324)
                }
                
                goto(Label_0195)
            }
        }
        
        Label_0105:
        
        if (cmpeq:boolean(and:int(var_3_1C6:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_1C6 = and:int(var_3_1C6:int, ldc:int(-268696524))
            goto(Label_0324)
        }
        
        if (cmpeq:boolean(and:int(var_3_1C6:int, ldc:int(1)), ldc:int(0))) {
            var_3_1C6 = and:int(var_3_1C6:int, ldc:int(313832916))
            goto(Label_0264)
        }
        
        if (cmpeq:boolean(and:int(var_3_1C6:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_1C6 = and:int(var_3_1C6:int, ldc:int(-539689263))
            invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\u446c\ub113\u5fe1\u3a62\ube23\u8bb0, p1:\u7d52\u718f\u3776\u6fb0\ub83f)
            goto(Label_0324)
        }
        
        var_3_1C6 = and:int(var_3_1C6:int, ldc:int(1445268755))
        Label_0195:
        
        if (cmpeq:boolean(and:int(var_3_1C6:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0324)
        }
        
        if (cmpeq:boolean(and:int(var_3_1C6:int, ldc:int(512)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_3_1C6:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0105)
            }
            
            var_3_1C6 = and:int(var_3_1C6:int, ldc:int(1878902521))
            invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\ube23\u5654\u2dcc\u6ec6\u9937\u3776, p1:\u7d52\u718f\u3776\u6fb0\ub83f, invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, p1:\u7d52\u718f\u3776\u6fb0\ub83f), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, p1:\u7d52\u718f\u3776\u6fb0\ub83f), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, p1:\u7d52\u718f\u3776\u6fb0\ub83f))
            putfield:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u5245\uae87\ua068\u6cfe\u6198\u0a06, p1:\u7d52\u718f\u3776\u6fb0\ub83f, getfield:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u7d52\u8709\ubefe\u7af6\u0b8e\ua61f, p1:\u7d52\u718f\u3776\u6fb0\ub83f))
            putfield:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u516c\u3dd3\u3bd6\u93a2\u0c95\u8cae, p1:\u7d52\u718f\u3776\u6fb0\ub83f, getfield:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u4d85\u71ae\u494c\u839e\uf9c5\u93a2, p1:\u7d52\u718f\u3776\u6fb0\ub83f))
            
            if (getfield:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u8d90\ud36e\u7e3f\u3dd3\uc9f6\uc238, p1:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                putfield:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u718f\u446c\u9a18\ubb2b\u69d9\ub8be, p1:\u7d52\u718f\u3776\u6fb0\ub83f, add:int(getfield:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u718f\u446c\u9a18\ubb2b\u69d9\ub8be, p1:\u7d52\u718f\u3776\u6fb0\ub83f), and:int(ldc:int(2309), ldc:int(8243))))
                invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\u8413\u93a2\u718f\u99f7\u51b2\u960f, p1:\u7d52\u718f\u3776\u6fb0\ub83f)
            }
        }
        
        Label_0264:
        
        if (cmpeq:boolean(and:int(var_3_1C6:int, ldc:int(8388608)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_3_1C6:int, ldc:int(1)), ldc:int(0))) {
                var_3_1C6 = and:int(var_3_1C6:int, ldc:int(-1884184816))
                goto(Label_0195)
            }
            
            if (cmpne:boolean(and:int(var_3_1C6:int, ldc:int(8388608)), ldc:int(0))) {
                var_3_1C6 = and:int(var_3_1C6:int, ldc:int(1588958041))
                goto(Label_0105)
            }
            
            var_3_1C6 = and:int(var_3_1C6:int, ldc:int(1870131153))
            invokespecial:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u51b2\u446c\u59ec\u74b1\ud36e\ub32d, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p1:\u7d52\u718f\u3776\u6fb0\ub83f)
            
            if (getfield:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u8d90\ud36e\u7e3f\u3dd3\uc9f6\uc238, p1:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                var_5_1BF = invokeinterface:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>(List<\u7d52\u718f\u3776\u6fb0\ub83f>::iterator, invokevirtual:List<\u7d52\u718f\u3776\u6fb0\ub83f>(\u7d52\u718f\u3776\u6fb0\ub83f::\u983f\u4f4a\ub6ab\u3e75\u5140\u7bad, p1:\u7d52\u718f\u3776\u6fb0\ub83f))
                
                loop {
                    var_3_1C6 = and:int(var_3_1C6:int, ldc:int(-344689517))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_5_1BF:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>))) {
                        looporswitchbreak()
                    }
                    
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u8d90\u8640\u4179\u6cfe\u6d99\u7ce1, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p1:\u7d52\u718f\u3776\u6fb0\ub83f, checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>::next, var_5_1BF:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>)))
                }
                
                var_3_1C6 = and:int(var_3_1C6:int, ldc:int(1943909631))
            }
        }
        
        Label_0324:
        
        if (cmpeq:boolean(and:int(var_3_1C6:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_1C6 = and:int(var_3_1C6:int, ldc:int(-1169459558))
            goto(Label_0264)
        }
        
        if (cmpne:boolean(and:int(var_3_1C6:int, ldc:int(131072)), ldc:int(0))) {
            var_3_1C6 = and:int(var_3_1C6:int, ldc:int(179196315))
            goto(Label_0195)
        }
        
        if (cmpne:boolean(and:int(var_3_1C6:int, ldc:int(512)), ldc:int(0))) {
            var_3_1C6 = and:int(var_3_1C6:int, ldc:int(880527518))
            goto(Label_0105)
        }
    }
    
    private void \u51b2\u446c\u59ec\u74b1\ud36e\ub32d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
        var_2_D3 : int
        var_4_93 : int
        var_5_A0 : int
        var_6_AD : int
        
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
            var_2_D3 = and:int(ldc:int(-1357919766), ldc:int(-1353190675))
            
            if (invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u5140\u8d90\u0b8e\u6198\ub8be\u8bb0, p0:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u4179\u97b7\u3d64\ufcaf\u6ec6\u8c8a, invokevirtual:\ubf56\u64f2\u392e\u98a4\u120d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8d90\uae5d\u7049\u61a4\uceb8\u8df4, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]), loadelement:String(getstatic:String[](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uc3e3\ucfaf\uc910\u6198\u5245\u8640), and:int(ldc:int(2111), ldc:int(17924))))
                var_4_93 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, p0:\u7d52\u718f\u3776\u6fb0\ub83f), ldc:double(16.0)))
                var_5_A0 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, p0:\u7d52\u718f\u3776\u6fb0\ub83f), ldc:double(16.0)))
                var_6_AD = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, p0:\u7d52\u718f\u3776\u6fb0\ub83f), ldc:double(16.0)))
                
                if (getfield:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u8d90\ud36e\u7e3f\u3dd3\uc9f6\uc238, p0:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                    if (cmpeq:boolean(getfield:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u8bb0\u7006\u965f\u8709\u74b1\u72f1, p0:\u7d52\u718f\u3776\u6fb0\ub83f), var_4_93:int)) {
                        if (cmpeq:boolean(getfield:int(\u7d52\u718f\u3776\u6fb0\ub83f::\ubf56\u7af6\ua068\u7873\u71f1\u3711, p0:\u7d52\u718f\u3776\u6fb0\ub83f), var_5_A0:int)) {
                            if (cmpeq:boolean(getfield:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u8308\u3bc9\u3711\uc246\ud4fe\ub171, p0:\u7d52\u718f\u3776\u6fb0\ub83f), var_6_AD:int)) {
                                goto(Label_0373)
                            }
                        }
                    }
                }
                
                Label_0182:
                
                if (cmpne:boolean(and:int(var_2_D3:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0373)
                }
                
                if (cmpeq:boolean(and:int(var_2_D3:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0283)
                }
                
                if (cmpne:boolean(and:int(var_2_D3:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_D3 = and:int(var_2_D3:int, ldc:int(-2029128577))
                    
                    if (getfield:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u8d90\ud36e\u7e3f\u3dd3\uc9f6\uc238, p0:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                        if (invokevirtual:boolean(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3d64\ucef1\u69d9\u8d98\u3d64\u5bc4, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, getfield:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u8bb0\u7006\u965f\u8709\u74b1\u72f1, p0:\u7d52\u718f\u3776\u6fb0\ub83f), getfield:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u8308\u3bc9\u3711\uc246\ud4fe\ub171, p0:\u7d52\u718f\u3776\u6fb0\ub83f))) {
                            invokevirtual:void(\ud523\u92ff\ubb2b\u759a\ud36e::\u3e75\u76bc\u6fb0\u5d20\uc3e3\uae87, invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], getfield:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u8bb0\u7006\u965f\u8709\u74b1\u72f1, p0:\u7d52\u718f\u3776\u6fb0\ub83f), getfield:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u8308\u3bc9\u3711\uc246\ud4fe\ub171, p0:\u7d52\u718f\u3776\u6fb0\ub83f)), p0:\u7d52\u718f\u3776\u6fb0\ub83f, getfield:int(\u7d52\u718f\u3776\u6fb0\ub83f::\ubf56\u7af6\ua068\u7873\u71f1\u3711, p0:\u7d52\u718f\u3776\u6fb0\ub83f))
                        }
                    }
                }
                
                Label_0219:
                
                if (cmpne:boolean(and:int(var_2_D3:int, ldc:int(8388608)), ldc:int(0))) {
                    var_2_D3 = and:int(var_2_D3:int, ldc:int(-896867594))
                    goto(Label_0373)
                }
                
                if (cmpeq:boolean(and:int(var_2_D3:int, ldc:int(8)), ldc:int(0))) {
                    var_2_D3 = and:int(var_2_D3:int, ldc:int(37468725))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_D3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_D3 = and:int(var_2_D3:int, ldc:int(-1523644977))
                        goto(Label_0182)
                    }
                    
                    var_2_D3 = and:int(var_2_D3:int, ldc:int(-2015373959))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u7873\u9af2\u7af6\ubcb0\u416d\ub6ab, p0:\u7d52\u718f\u3776\u6fb0\ub83f))) {
                        if (logicalnot:boolean(invokevirtual:boolean(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3d64\ucef1\u69d9\u8d98\u3d64\u5bc4, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, var_4_93:int, var_6_AD:int))) {
                            if (getfield:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u8d90\ud36e\u7e3f\u3dd3\uc9f6\uc238, p0:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                                invokeinterface:void(Logger::warn, getstatic:Logger(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u5fe1\u5d20\uc246\u8258\u873d\uf995), loadelement:String(getstatic:String[](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uc3e3\ucfaf\uc910\u6198\u5245\u8640), xor:int(ldc:int(8357), ldc:int(8352))), p0:\u7d52\u718f\u3776\u6fb0\ub83f[expected:Object])
                            }
                            
                            var_2_D3 = and:int(var_2_D3:int, ldc:int(-1620715544))
                            putfield:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u8d90\ud36e\u7e3f\u3dd3\uc9f6\uc238, p0:\u7d52\u718f\u3776\u6fb0\ub83f, and:int[expected:boolean](ldc:int(-3877), ldc:int(3876)))
                            goto(Label_0373)
                        }
                    }
                }
                
                Label_0283:
                
                if (cmpne:boolean(and:int(var_2_D3:int, ldc:int(65536)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_D3:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0219)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_D3:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0182)
                    }
                    
                    var_2_D3 = and:int(var_2_D3:int, ldc:int(-2057311256))
                    invokevirtual:void(\ud523\u92ff\ubb2b\u759a\ud36e::\u56bd\ub7dc\u5bc4\u67d0\ud523\u5d20, invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_4_93:int, var_6_AD:int), p0:\u7d52\u718f\u3776\u6fb0\ub83f)
                }
                
                Label_0373:
                
                if (cmpeq:boolean(and:int(var_2_D3:int, ldc:int(65536)), ldc:int(0))) {
                    var_2_D3 = and:int(var_2_D3:int, ldc:int(1408708272))
                    goto(Label_0283)
                }
                
                if (cmpeq:boolean(and:int(var_2_D3:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_0219)
                }
                
                if (cmpeq:boolean(and:int(var_2_D3:int, ldc:int(16384)), ldc:int(0))) {
                    var_2_D3 = and:int(var_2_D3:int, ldc:int(-1280552603))
                    goto(Label_0182)
                }
                
                var_2_D3 = and:int(var_2_D3:int, ldc:int(-1915361155))
                invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u61a4\u4c04\uf995\uc31c\u4ab3\u6d69, invokevirtual:\ubf56\u64f2\u392e\u98a4\u120d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8d90\uae5d\u7049\u61a4\uceb8\u8df4, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u873d\ud171\ub1b9\u36d3\u3504\ub171(\u5d20\u97b7\u8753\u873d\u16f6.\ud523\u92ff\ubb2b\u759a\ud36e p0) {
        var_4_75 : Collection<\ub83f\uc9f6\u47c2\u67d0\u7ce1>
        
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
            
            if (logicalnot:boolean(invokevirtual:boolean(\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0::\u7e3f\ubb2b\u7e3f\u446c\u97b7\ucfaf, getstatic:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u4f4a\ub83f\u9937\u4c2b\u6fb0\u51b2)))) {
                var_4_75 = getfield:List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>[expected:Collection<\ub83f\uc9f6\u47c2\u67d0\u7ce1>](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3c25\u8258\u8aa5\ub70c\u5654\uc2bd, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)
            }
            else {
                var_4_75 = checkcast:Collection(java.util.Collection.class, invokestatic:Object[expected:Collection<\ub83f\uc9f6\u47c2\u67d0\u7ce1>](\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u416d\ud158\ud36e\u4c2b\u5db4\u8308, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:Object], getstatic:\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u4f4a\ub83f\u9937\u4c2b\u6fb0\u51b2)))
            }
            
            invokeinterface:boolean(Collection<\ub83f\uc9f6\u47c2\u67d0\u7ce1>::addAll, var_4_75:Collection<\ub83f\uc9f6\u47c2\u67d0\u7ce1>, invokeinterface:Collection<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>::values, invokevirtual:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>(\ud523\u92ff\ubb2b\u759a\ud36e::\u69d9\u62da\ubb2b\ua6bd\u99f7\u99f7, p0:\ud523\u92ff\ubb2b\u759a\ud36e)))
            invokevirtual:void(\ube23\u51b2\u92ee\u6435\u8308\u1833::\u4975\u93a2\ub19c\uc246\u8bb0\ua562, invokevirtual:\ube23\u51b2\u92ee\u6435\u8308\u1833(\ua562\u7330\ub113\u64ab\u6d69\u5fe1::\ufe34\u3d4b\u946b\u74b1\ud4fe\ucb79, getfield:\ua562\u7330\ub113\u64ab\u6d69\u5fe1(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\ubcb0\u7e3f\u47c2\u98a4\u385b\uc238, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)), invokevirtual:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\ud523\u92ff\ubb2b\u759a\ud36e::\u4f52\u4daf\uc910\ud217\uc3e3\u8d98, p0:\ud523\u92ff\ubb2b\u759a\ud36e), and:int[expected:boolean](ldc:int(84), ldc:int(-85)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ufcaf\u836c\u8413\u99f7\u6c52\u40a9(int p0, int p1) {
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
    
    public void \u3dd3\u16f6\u7ce1\u3dd3\u3d4b\u47c2() {
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
    
    public boolean \u3d64\ucef1\u69d9\u8d98\u3d64\u5bc4(int p0, int p1) {
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
            return:boolean(xor:int[expected:boolean](ldc:int(2433), ldc:int(2432)))
        }
        
        goto(Label_0006)
    }
    
    public int \ubded\u836c\u59ec\u4c04\u4cd9\uc4d2() {
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
            return:int(invokeinterface:int(Int2ObjectMap::size, getfield:Int2ObjectMap<\u7d52\u718f\u3776\u6fb0\ub83f>(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uc246\ub171\u4e72\u7006\u4d85\ud7e8, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)))
        }
        
        goto(Label_0006)
    }
    
    public void \u183a\u69d9\u946b\u64f2\u93a2\u494c(int p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\uc910\ufcaf\uc229\u9255\u71f1\u0b8e p1) {
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
            invokespecial:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u61a4\uafe7\u120d\ud158\u6435\ub102, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p0:int, p1:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
            invokeinterface:boolean(List<\uc910\ufcaf\uc229\u9255\u71f1\u0b8e>::add, getfield:List<\uc910\ufcaf\uc229\u9255\u71f1\u0b8e>(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uf995\u7ce1\ua61f\u76bc\u7330\ud36e, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255), p1:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ua6bd\ubefe\u5f50\u12cb\uceb8\u718f(int p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p1) {
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
            invokespecial:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u61a4\uafe7\u120d\ud158\u6435\ub102, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p0:int, p1:\u7d52\u718f\u3776\u6fb0\ub83f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u61a4\uafe7\u120d\ud158\u6435\ub102(int p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p1) {
        var_3_D4 : int
        stack_102_0 : \ub113\u6435\u927d\u6b0d\u8cae\ubcb0 [generated]
        expr_EB : Object[] [generated]
        
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
            var_3_D4 = and:int(ldc:int(-1663681188), ldc:int(-851280007))
            
            if (invokevirtual:boolean(\ub113\u6435\u927d\u6b0d\u8cae\ubcb0::\ub18d\u8d90\u1187\ub32d\u34df\u8258, getstatic:\ub113\u6435\u927d\u6b0d\u8cae\ubcb0(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\ub32d\ub102\ub171\u927d\u6cfe\u4d85))) {
                stack_102_0 = getstatic:\ub113\u6435\u927d\u6b0d\u8cae\ubcb0(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\ub32d\ub102\ub171\u927d\u6cfe\u4d85)
                expr_EB = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(-15870), ldc:int(-15872)))
                storeelement:Object(expr_EB:Object[], and:int(ldc:int(-30599), ldc:int(30214)), p1:\u7d52\u718f\u3776\u6fb0\ub83f[expected:Object])
                storeelement:Object(expr_EB:Object[], xor:int(ldc:int(320), ldc:int(321)), this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:Object])
                
                if (invokestatic:boolean(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u59ec\ubded\u7043\u946b\ub70c\ub19c, stack_102_0:\ub113\u6435\u927d\u6b0d\u8cae\ubcb0, expr_EB:Object[])) {
                    return:void()
                }
            }
            
            loop {
                if (cmpne:boolean(and:int(var_3_D4:int, ldc:int(16)), ldc:int(0))) {
                    var_3_D4 = and:int(var_3_D4:int, ldc:int(-1195870761))
                    invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\ud7e8\ua61f\uc9f6\ua562\u8c8a\u3bd6, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p0:int)
                    invokeinterface:Object(Int2ObjectMap::put, getfield:Int2ObjectMap<\u7d52\u718f\u3776\u6fb0\ub83f>(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uc246\ub171\u4e72\u7006\u4d85\ud7e8, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255), p0:int, p1:\u7d52\u718f\u3776\u6fb0\ub83f[expected:Object])
                    invokevirtual:void(\ud523\u92ff\ubb2b\u759a\ud36e::\u56bd\ub7dc\u5bc4\u67d0\ud523\u5d20, invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(\ua562\u7330\ub113\u64ab\u6d69\u5fe1::\uc29a\u4975\u600f\u99f7\uc7fe\u8709, invokevirtual:\ua562\u7330\ub113\u64ab\u6d69\u5fe1(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255), invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, p1:\u7d52\u718f\u3776\u6fb0\ub83f), ldc:double(16.0))), invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, p1:\u7d52\u718f\u3776\u6fb0\ub83f), ldc:double(16.0))), getstatic:\ucb79\u7ce1\ubded\u3d64\ub171(\ucb79\u7ce1\ubded\u3d64\ub171::\u6b0d\u5fe1\ua068\u946b\u9255\ua068), xor:boolean(ldc:boolean(0), ldc:boolean(1))), p1:\u7d52\u718f\u3776\u6fb0\ub83f)
                    
                    if (invokevirtual:boolean(\u71ae\u5fe1\u0b8e\u5140\uf995\u927d::\uc87f\u7af6\u7043\ub19c\uc84e\u4c04, getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\ua61f\u6b5f\u1187\u62da\u960f\u6b5f))) {
                        invokestatic:Object(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u7af6\u97e6\u51fa\u8df4\ub6ab\ud523, p1:\u7d52\u718f\u3776\u6fb0\ub83f[expected:Object], getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\ua61f\u6b5f\u1187\u62da\u960f\u6b5f), newarray:Object[](java.lang.Object.class, and:int(ldc:int(20368), ldc:int(-20377))))
                    }
                }
                
                if (cmpne:boolean(and:int(var_3_D4:int, ldc:int(4096)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_D4 = and:int(var_3_D4:int, ldc:int(642957021))
            }
            
            var_3_D4 = and:int(var_3_D4:int, ldc:int(-1204325167))
            invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\ud36e\ubff1\uff55\ubb2b\u52d3\u51b2, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p1:\u7d52\u718f\u3776\u6fb0\ub83f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud7e8\ua61f\uc9f6\ua562\u8c8a\u3bd6(int p0) {
        var_4_6F : \u7d52\u718f\u3776\u6fb0\ub83f
        
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
            var_4_6F = checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:Object[expected:\u7d52\u718f\u3776\u6fb0\ub83f](Int2ObjectMap::remove, getfield:Int2ObjectMap<\u7d52\u718f\u3776\u6fb0\ub83f>(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uc246\ub171\u4e72\u7006\u4d85\ud7e8, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255), p0:int))
            
            if (cmpne:boolean(var_4_6F:\u7d52\u718f\u3776\u6fb0\ub83f, aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f())) {
                invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\u760c\ud12e\u3d64\u6bb9\u67d0\u0c95, var_4_6F:\u7d52\u718f\u3776\u6fb0\ub83f)
                invokespecial:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3711\ub171\uc246\u759a\u16f6\u3d64, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, var_4_6F:\u7d52\u718f\u3776\u6fb0\ub83f)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u3711\ub171\uc246\u759a\u16f6\u3d64(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
        var_2_61 : int
        stack_107_0 : \ub113\u6435\u927d\u6b0d\u8cae\ubcb0 [generated]
        expr_F0 : Object[] [generated]
        
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
            var_2_61 = and:int(ldc:int(977799282), ldc:int(1003896170))
            invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\u836c\u5654\u3e2a\u7af6\uae87\ub8be, p0:\u7d52\u718f\u3776\u6fb0\ub83f)
            
            if (getfield:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u8d90\ud36e\u7e3f\u3dd3\uc9f6\uc238, p0:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                invokevirtual:void(\ud523\u92ff\ubb2b\u759a\ud36e::\u8413\u759a\ub19c\ubb2b\ubcb0\u6bb9, invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], getfield:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u8bb0\u7006\u965f\u8709\u74b1\u72f1, p0:\u7d52\u718f\u3776\u6fb0\ub83f), getfield:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u8308\u3bc9\u3711\uc246\ud4fe\ub171, p0:\u7d52\u718f\u3776\u6fb0\ub83f)), p0:\u7d52\u718f\u3776\u6fb0\ub83f)
            }
            
            loop {
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(995352163))
                    invokeinterface:boolean(List<E>::remove, getfield:List<\uc910\ufcaf\uc229\u9255\u71f1\u0b8e>(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uf995\u7ce1\ua61f\u76bc\u7330\ud36e, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255), p0:\u7d52\u718f\u3776\u6fb0\ub83f[expected:Object])
                    
                    if (invokevirtual:boolean(\u71ae\u5fe1\u0b8e\u5140\uf995\u927d::\uc87f\u7af6\u7043\ub19c\uc84e\u4c04, getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u927d\u16f6\ua562\uc87f\u516c\u62da))) {
                        invokestatic:Object(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u7af6\u97e6\u51fa\u8df4\ub6ab\ud523, p0:\u7d52\u718f\u3776\u6fb0\ub83f[expected:Object], getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u927d\u16f6\ua562\uc87f\u516c\u62da), newarray:Object[](java.lang.Object.class, and:int(ldc:int(-8453), ldc:int(8452))))
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1024)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            if (invokevirtual:boolean(\ub113\u6435\u927d\u6b0d\u8cae\ubcb0::\ub18d\u8d90\u1187\ub32d\u34df\u8258, getstatic:\ub113\u6435\u927d\u6b0d\u8cae\ubcb0(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u5d20\u8308\u7873\u92ff\u7006\ub83f))) {
                stack_107_0 = getstatic:\ub113\u6435\u927d\u6b0d\u8cae\ubcb0(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u5d20\u8308\u7873\u92ff\u7006\ub83f)
                expr_F0 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(16835), ldc:int(5650)))
                storeelement:Object(expr_F0:Object[], and:int(ldc:int(14080), ldc:int(-14113)), p0:\u7d52\u718f\u3776\u6fb0\ub83f[expected:Object])
                storeelement:Object(expr_F0:Object[], xor:int(ldc:int(2080), ldc:int(2081)), this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:Object])
                invokestatic:boolean(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u59ec\ubded\u7043\u946b\ub70c\ub19c, stack_107_0:\ub113\u6435\u927d\u6b0d\u8cae\ubcb0, expr_F0:Object[])
            }
            
            invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uae5d\u97e6\u6d99\ufe34\u965f\ub113, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p0:\u7d52\u718f\u3776\u6fb0\ub83f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u647c\u3bc9\ub19c\ud4fe\u3d64\u4ab3(\u5d20\u97b7\u8753\u873d\u16f6.\ud523\u92ff\ubb2b\u759a\ud36e p0) {
        var_2_61 : int
        var_4_70 : ObjectIterator
        var_2_7F : int
        var_6_C5 : \u7d52\u718f\u3776\u6fb0\ub83f
        var_7_D3 : int
        var_8_E1 : int
        
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
            var_2_61 = and:int(ldc:int(-412828074), ldc:int(-827245345))
            var_4_70 = invokeinterface:ObjectIterator(ObjectSet::iterator, invokeinterface:ObjectSet(Int2ObjectMap::int2ObjectEntrySet, getfield:Int2ObjectMap<\u7d52\u718f\u3776\u6fb0\ub83f>(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uc246\ub171\u4e72\u7006\u4d85\ud7e8, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
                    var_2_7F = and:int(var_2_61:int, ldc:int(-2085295709))
                }
                else {
                    var_2_7F = and:int(var_2_61:int, ldc:int(-961151077))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_4_70:ObjectIterator)) {
                        var_6_C5 = checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:Object[expected:\u7d52\u718f\u3776\u6fb0\ub83f](Int2ObjectMap$Entry::getValue, checkcast:Int2ObjectMap$Entry(it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry.class, invokeinterface:Int2ObjectMap$Entry(Iterator<Int2ObjectMap$Entry>::next, var_4_70:Iterator<Int2ObjectMap$Entry>))))
                        var_7_D3 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, var_6_C5:\u7d52\u718f\u3776\u6fb0\ub83f), ldc:double(16.0)))
                        var_8_E1 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, var_6_C5:\u7d52\u718f\u3776\u6fb0\ub83f), ldc:double(16.0)))
                        
                        if (cmpeq:boolean(var_7_D3:int, getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\uc7fe\u8aa5\u69d9\u64ab\u71f1\u9af2, invokevirtual:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\ud523\u92ff\ubb2b\u759a\ud36e::\u4f52\u4daf\uc910\ud217\uc3e3\u8d98, p0:\ud523\u92ff\ubb2b\u759a\ud36e)))) {
                            if (cmpeq:boolean(var_8_E1:int, getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u3d4b\u12b2\u98a4\u0b8e\u8cae\u183a, invokevirtual:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\ud523\u92ff\ubb2b\u759a\ud36e::\u4f52\u4daf\uc910\ud217\uc3e3\u8d98, p0:\ud523\u92ff\ubb2b\u759a\ud36e)))) {
                                invokevirtual:void(\ud523\u92ff\ubb2b\u759a\ud36e::\u56bd\ub7dc\u5bc4\u67d0\ud523\u5d20, p0:\ud523\u92ff\ubb2b\u759a\ud36e, var_6_C5:\u7d52\u718f\u3776\u6fb0\ub83f)
                            }
                        }
                        
                        var_2_61 = and:int(var_2_7F:int, ldc:int(-272843749))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_7F:int, ldc:int(2048)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_61 = and:int(var_2_7F:int, ldc:int(-1354640715))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f \u5f50\uc910\u5140\u7330\u8709\uc2bd(int p0) {
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
            return:\u7d52\u718f\u3776\u6fb0\ub83f(checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:Object[expected:\u7d52\u718f\u3776\u6fb0\ub83f](Int2ObjectMap::get, getfield:Int2ObjectMap<\u7d52\u718f\u3776\u6fb0\ub83f>(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uc246\ub171\u4e72\u7006\u4d85\ud7e8, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255), p0:int)))
        }
        
        goto(Label_0006)
    }
    
    public void \u5654\u647c\u600f\u67d0\u8308\uae5d(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1) {
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
            invokevirtual:boolean(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, ldc:int(19))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3e2a\u9af2\ub83f\u5d20\uc2e8\u92ee() {
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
            invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\u98a4\uc31c\u6c52\uf995\u62da\u64f2, invokevirtual:\u527a\u494c\u88c5\u965f\u759a(\u527a\u873d\u071d\u4f52\uc229\ud217::\ua562\u9255\u36d3\u8389\uc246\ub113, getfield:\u527a\u873d\u071d\u4f52\uc229\ud217(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u1833\u72f1\uc7fe\ua3b4\u8df4\ube23, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uc3e3\ucfaf\uc910\u6198\u5245\u8640), xor:int(ldc:int(-24560), ldc:int(-24554)))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u2dcc\u7bad\u120d\u3776\ucfaf\ubefe(int p0, int p1, int p2) {
        var_4_F6 : int
        var_7_70 : Random
        var_8_79 : int
        var_9_BB : Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>
        var_9_9A : \u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a
        var_10_A3 : int
        
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
            var_4_F6 = and:int(ldc:int(-1779826723), ldc:int(-9438722))
            var_7_70 = initobject:Random(Random::<init>)
            var_8_79 = and:int(ldc:int(14611), ldc:int(-14612))
            
            if (cmpeq:boolean(invokevirtual:\uf94d\u51b2\u1833\u34df\u1187(\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179::\uc910\u8258\u51b2\ucef1\ud51e\u6cfe, getfield:\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc9f6\u6b5f\u8aa5\u97b7\u6cfe\u3504, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u71f1\u156b\u4179\ub83f\u7d52\u8308, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255))), getstatic:\uf94d\u51b2\u1833\u34df\u1187(\uf94d\u51b2\u1833\u34df\u1187::\ucfaf\uc3e3\ubb2b\u1187\u7bad\u72f1))) {
                var_9_BB = invokeinterface:Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(Iterable<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::iterator, invokevirtual:Iterable<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(\ua3b4\u8aa5\ub113\ubf56\u873d::\u624e\ubb2b\uae5d\u1833\u16f6\u40a9, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\ua3b4\u8aa5\ub113\ubf56\u873d](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u71f1\u156b\u4179\ub83f\u7d52\u8308, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255))))
                
                loop {
                    var_4_F6 = and:int(var_4_F6:int, ldc:int(-718474371))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_9_BB:Iterator))) {
                        looporswitchbreak()
                    }
                    
                    if (cmpeq:boolean(invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, checkcast:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56.class, invokeinterface:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::next, var_9_BB:Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>))), invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\ua61f\ua068\u6cfe\uc910\u51fa\u9af2, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u416d\u1187\ud171\uafe7\u92ee\u6c56)))) {
                        var_8_79 = xor:int(ldc:int(16640), ldc:int(16641))
                        looporswitchbreak()
                    }
                    
                    var_4_F6 = and:int(var_4_F6:int, ldc:int(-541526182))
                }
            }
            
            var_9_9A = initobject:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::<init>)
            var_10_A3 = and:int(ldc:int(-21047), ldc:int(21046))
            
            while (cmplt:boolean(var_10_A3:int, and:int(ldc:int(671), ldc:int(21211)))) {
                invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u2dcc\u7bad\u120d\u3776\ucfaf\ubefe, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p0:int, p1:int, p2:int, ldc:int(16), var_7_70:Random, var_8_79:boolean, var_9_9A:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a)
                invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u2dcc\u7bad\u120d\u3776\ucfaf\ubefe, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p0:int, p1:int, p2:int, ldc:int(32), var_7_70:Random, var_8_79:boolean, var_9_9A:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a)
                inc:int(var_10_A3, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u2dcc\u7bad\u120d\u3776\ucfaf\ubefe(int p0, int p1, int p2, int p3, java.util.Random p4, boolean p5, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a p6) {
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
    
    private void \u0b8e\ua562\u7006\u6fb0\ubb2b\u12cb(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a p2, boolean p3) {
        var_5_63 : int
        var_7_82 : \u6c52\ubded\u4975\u71ae\u47c2\u7d52
        var_10_103 : double
        var_12_118 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_13_120 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        
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
            var_5_63 = and:int(ldc:int(-1330369130), ldc:int(-75633722))
            
            if (invokevirtual:boolean(\uf995\u8709\ua61f\ub32d\ubff1\u99f7::\ubff1\uc4d2\ub1b9\u8cae\ud4fe\u8308, invokevirtual:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\ub171\u3bc9\u67d0\u516c\u9937\ub102, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]))) {
                var_7_82 = invokevirtual:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\uc87f\uf94d\ucb79\u120d\u836c\ubb2b, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u718f\u6435\uc31c\u4ab3\u98a4], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                
                if (cmpge:boolean(invokevirtual:double(\u6c52\ubded\u4975\u71ae\u47c2\u7d52::\u7c6b\ud12e\u3d4b\u8d98\u3d64\u64f2, var_7_82:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, getstatic:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u6c52\u156b\u4179\u5654\uceb8\u9af2::\u385b\ub83f\u47c2\u5245\u7c6b\uc31c)), ldc:double(1.0))) {
                    var_5_63 = and:int(var_5_63:int, ldc:int(-1217045081))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\uc29a\u8350\u8bb0\u4cd9\u51fa\u839e<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>[expected:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>](\u69d9\u7bad\u8709\u9937\u446c\u67d0::\u6c56\ufe34\u99f7\u494c\u5bc4\u4f52)))) {
                        var_10_103 = invokevirtual:double(\u6c52\ubded\u4975\u71ae\u47c2\u7d52::\u12cb\uf9c5\u071d\ucb79\ubff1\u1833, var_7_82:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, getstatic:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u6c52\u156b\u4179\u5654\uceb8\u9af2::\u385b\ub83f\u47c2\u5245\u7c6b\uc31c))
                        
                        if (cmple:boolean(var_10_103:double, ldc:double(0.0))) {
                            var_5_63 = and:int(var_5_63:int, ldc:int(-222412874))
                            var_12_118 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\u64f2\ub7dc\ud217\u56bd\u8c8a, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                            var_13_120 = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_12_118:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                            
                            if (cmplt:boolean(invokevirtual:double(\u6c52\ubded\u4975\u71ae\u47c2\u7d52::\u7c6b\ud12e\u3d4b\u8d98\u3d64\u64f2, invokevirtual:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\uc87f\uf94d\ucb79\u120d\u836c\ubb2b, var_13_120:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u718f\u6435\uc31c\u4ab3\u98a4], var_12_118:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u6c52\u156b\u4179\u5654\uceb8\u9af2::\u385b\ub83f\u47c2\u5245\u7c6b\uc31c)), ldc:double(1.0))) {
                                if (invokevirtual:boolean(\uf995\u8709\ua61f\ub32d\ubff1\u99f7::\ubff1\uc4d2\ub1b9\u8cae\ud4fe\u8308, invokevirtual:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\ub171\u3bc9\u67d0\u516c\u9937\ub102, var_13_120:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]))) {
                                    invokespecial:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3504\u960f\u62da\uc246\u8308\u3d4b, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p2:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, var_7_82:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, sub:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.05)))
                                }
                            }
                        }
                        else {
                            invokespecial:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3504\u960f\u62da\uc246\u8308\u3d4b, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p2:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, var_7_82:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, sub:double(add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), var_10_103:double), ldc:double(0.05)))
                        }
                    }
                }
                else {
                    if (p3:boolean) {
                        invokespecial:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3504\u960f\u62da\uc246\u8308\u3d4b, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), i2d:double(add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), xor:int(ldc:int(2049), ldc:int(2048)))), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), i2d:double(add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), and:int(ldc:int(17697), ldc:int(8193)))), sub:double(i2d:double(add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), xor:int(ldc:int(2880), ldc:int(2881)))), ldc:double(0.05)), p2:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a)
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u3504\u960f\u62da\uc246\u8308\u3d4b(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52 p2, double p3) {
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
            invokespecial:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3504\u960f\u62da\uc246\u8308\u3d4b, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokevirtual:double(\u6c52\ubded\u4975\u71ae\u47c2\u7d52::\u12cb\uf9c5\u071d\ucb79\ubff1\u1833, p2:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, getstatic:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u6c52\u156b\u4179\u5654\uceb8\u9af2::\ud217\u4c2b\uc238\uc84e\u392e\uae5d))), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokevirtual:double(\u6c52\ubded\u4975\u71ae\u47c2\u7d52::\u7c6b\ud12e\u3d4b\u8d98\u3d64\u64f2, p2:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, getstatic:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u6c52\u156b\u4179\u5654\uceb8\u9af2::\ud217\u4c2b\uc238\uc84e\u392e\uae5d))), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokevirtual:double(\u6c52\ubded\u4975\u71ae\u47c2\u7d52::\u12cb\uf9c5\u071d\ucb79\ubff1\u1833, p2:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, getstatic:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u6c52\u156b\u4179\u5654\uceb8\u9af2::\u6d69\ud523\ud51e\ube23\u7330\uc7fe))), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokevirtual:double(\u6c52\ubded\u4975\u71ae\u47c2\u7d52::\u7c6b\ud12e\u3d4b\u8d98\u3d64\u64f2, p2:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, getstatic:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u6c52\u156b\u4179\u5654\uceb8\u9af2::\u6d69\ud523\ud51e\ube23\u7330\uc7fe))), p3:double, p1:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u3504\u960f\u62da\uc246\u8308\u3d4b(double p0, double p1, double p2, double p3, double p4, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a p5) {
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
            invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u385b\u8c8a\uf9c5\u6ec6\ufcaf\u5fe1, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p5:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u494c\ub6ab\u8bb0\u8bb0\uc31c\uc31c, invokevirtual:double(Random::nextDouble, getfield:Random(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)), p0:double, p1:double), p4:double, invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u494c\ub6ab\u8bb0\u8bb0\uc31c\uc31c, invokevirtual:double(Random::nextDouble, getfield:Random(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)), p2:double, p3:double), ldc:double(0.0), ldc:double(0.0), ldc:double(0.0))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7c6b\u983f\u946b\u5654\u97b7\u527a() {
        var_1_61 : int
        var_3_70 : ObjectIterator
        var_1_7E : int
        var_5_C2 : \u7d52\u718f\u3776\u6fb0\ub83f
        
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
            var_1_61 = and:int(ldc:int(-1989599444), ldc:int(-1599205427))
            var_3_70 = invokeinterface:ObjectIterator(ObjectSet::iterator, invokeinterface:ObjectSet(Int2ObjectMap::int2ObjectEntrySet, getfield:Int2ObjectMap<\u7d52\u718f\u3776\u6fb0\ub83f>(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uc246\ub171\u4e72\u7006\u4d85\ud7e8, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)))
            
            loop {
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_7E = and:int(var_1_61:int, ldc:int(-124480974))
                }
                else {
                    var_1_7E = and:int(var_1_61:int, ldc:int(-81842352))
                    
                    if (invokeinterface:boolean(ObjectIterator::hasNext, var_3_70:ObjectIterator)) {
                        var_5_C2 = checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:Object[expected:\u7d52\u718f\u3776\u6fb0\ub83f](Int2ObjectMap$Entry::getValue, checkcast:Int2ObjectMap$Entry(it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry.class, invokeinterface:Object[expected:Int2ObjectMap$Entry](ObjectIterator::next, var_3_70:ObjectIterator))))
                        
                        if (getfield:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\ua6bd\u3a62\ua61f\u12b2\u3e2a\ub19c, var_5_C2:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                            invokeinterface:void(ObjectIterator::remove, var_3_70:ObjectIterator)
                            invokespecial:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3711\ub171\uc246\u759a\u16f6\u3d64, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, var_5_C2:\u7d52\u718f\u3776\u6fb0\ub83f)
                        }
                        
                        var_1_61 = and:int(var_1_7E:int, ldc:int(-1132519462))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_7E:int, ldc:int(1024)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_61 = and:int(var_1_7E:int, ldc:int(1781487964))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\u446c\u67d0\ua562\u97b7\u6c56\u59ec \u3504\u8413\u5fe1\ub8be\u0b8e\u3e2a(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u1833\u88c5\u0b8e\uc9f6\u960f\u839e p0) {
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
    
    public void \u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0, double p1, double p2, double p3, \u927d\u92ff\u71ae\uafe7\u6bb9.\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937 p4, \u36d3\u9033\u6b0d\u983f\u8d90.\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8 p5, float p6, float p7) {
        var_12_63 : int
        stack_FF_0 : \u71ae\u5fe1\u0b8e\u5140\uf995\u927d [generated]
        expr_C0 : Object[] [generated]
        var_14_102 : Object
        var_12_7D : int
        
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
            var_12_63 = and:int(ldc:int(-1546141088), ldc:int(1472955297))
            
            if (invokevirtual:boolean(\u71ae\u5fe1\u0b8e\u5140\uf995\u927d::\uc87f\u7af6\u7043\ub19c\uc84e\u4c04, getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\uafe7\u6ec6\u3e2a\uc29a\u3776\u965f))) {
                stack_FF_0 = getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\uafe7\u6ec6\u3e2a\uc29a\u3776\u965f)
                expr_C0 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(17221), ldc:int(12469)))
                storeelement:Object(expr_C0:Object[], and:int(ldc:int(5795), ldc:int(-30372)), p0:\ua3b4\u8aa5\ub113\ubf56\u873d[expected:Object])
                storeelement:Object(expr_C0:Object[], xor:int(ldc:int(129), ldc:int(128)), p4:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937[expected:Object])
                storeelement:Object(expr_C0:Object[], and:int(ldc:int(1130), ldc:int(10242)), p5:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8[expected:Object])
                storeelement:Object(expr_C0:Object[], and:int(ldc:int(6171), ldc:int(39)), invokestatic:Float[expected:Object](Float::valueOf, p6:float))
                storeelement:Object(expr_C0:Object[], and:int(ldc:int(284), ldc:int(16516)), invokestatic:Float[expected:Object](Float::valueOf, p7:float))
                var_14_102 = invokevirtual:Object(\u71ae\u5fe1\u0b8e\u5140\uf995\u927d::\u4e72\u4cd9\u5654\u385b\u8389\u76bc, stack_FF_0:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d, expr_C0:Object[])
                
                if (logicalor:boolean(invokestatic:boolean(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u0c95\u3bc9\ud51e\ubefe\u0c95\u8350, var_14_102:Object, getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\ud36e\uc229\u120d\u494c\u8aa5\u6b5f), newarray:Object[](java.lang.Object.class, and:int(ldc:int(-652), ldc:int(651)))), cmpeq:boolean(invokestatic:Object(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u7af6\u97e6\u51fa\u8df4\ub6ab\ud523, var_14_102:Object, getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u74b1\ua068\ud7e8\u4bc8\u92ff\u4cd9), newarray:Object[](java.lang.Object.class, and:int(ldc:int(22404), ldc:int(-22437)))), aconstnull:Object()))) {
                    return:void()
                }
                
                var_12_63 = and:int(var_12_63:int, ldc:int(398967895))
                p4 = checkcast:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\u927d\u92ff\u71ae\uafe7\u6bb9.\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937.class, invokestatic:Object(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u7af6\u97e6\u51fa\u8df4\ub6ab\ud523, var_14_102:Object, getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u74b1\ua068\ud7e8\u4bc8\u92ff\u4cd9), newarray:Object[](java.lang.Object.class, and:int(ldc:int(22984), ldc:int(-22985)))))
                p5 = checkcast:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u36d3\u9033\u6b0d\u983f\u8d90.\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8.class, invokestatic:Object(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u7af6\u97e6\u51fa\u8df4\ub6ab\ud523, var_14_102:Object, getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\ub32d\u5fe1\u647c\u7873\u59ec\ub32d), newarray:Object[](java.lang.Object.class, and:int(ldc:int(-26546), ldc:int(17840)))))
                p6 = invokestatic:float(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u9033\u97e6\u9a18\u983f\ud217\ud36e, var_14_102:Object, getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\ub32d\u0c95\u0b8e\u7043\u6fb0\u97e6), newarray:Object[](java.lang.Object.class, and:int(ldc:int(2287), ldc:int(-2800))))
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_12_63:int, ldc:int(33554432)), ldc:int(0))) {
                    var_12_7D = and:int(var_12_63:int, ldc:int(-536570037))
                }
                else {
                    var_12_7D = and:int(var_12_63:int, ldc:int(-2014404506))
                    
                    if (cmpeq:boolean(p0:\ua3b4\u8aa5\ub113\ubf56\u873d, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\ua3b4\u8aa5\ub113\ubf56\u873d](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u71f1\u156b\u4179\ub83f\u7d52\u8308, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)))) {
                        invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p1:double, p2:double, p3:double, p4:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937, p5:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8, p6:float, p7:float, and:int[expected:boolean](ldc:int(295), ldc:int(-296)))
                    }
                }
                
                if (cmpne:boolean(and:int(var_12_7D:int, ldc:int(33554432)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_12_63 = and:int(var_12_7D:int, ldc:int(-1412337530))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8308\u67e9\u965f\uc7fe\u9255\u51fa(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p1, \u927d\u92ff\u71ae\uafe7\u6bb9.\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937 p2, \u36d3\u9033\u6b0d\u983f\u8d90.\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8 p3, float p4, float p5) {
        var_7_63 : int
        stack_E8_0 : \u71ae\u5fe1\u0b8e\u5140\uf995\u927d [generated]
        expr_AA : Object[] [generated]
        var_9_EB : Object
        
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
            var_7_63 = and:int(ldc:int(1601215695), ldc:int(1584568269))
            
            if (invokevirtual:boolean(\u71ae\u5fe1\u0b8e\u5140\uf995\u927d::\uc87f\u7af6\u7043\ub19c\uc84e\u4c04, getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\uafe7\u6ec6\u3e2a\uc29a\u3776\u965f))) {
                stack_E8_0 = getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\uafe7\u6ec6\u3e2a\uc29a\u3776\u965f)
                expr_AA = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(16455), ldc:int(16450)))
                storeelement:Object(expr_AA:Object[], and:int(ldc:int(317), ldc:int(-318)), p0:\ua3b4\u8aa5\ub113\ubf56\u873d[expected:Object])
                storeelement:Object(expr_AA:Object[], and:int(ldc:int(69), ldc:int(6281)), p2:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937[expected:Object])
                storeelement:Object(expr_AA:Object[], and:int(ldc:int(22546), ldc:int(266)), p3:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8[expected:Object])
                storeelement:Object(expr_AA:Object[], and:int(ldc:int(21507), ldc:int(2707)), invokestatic:Float[expected:Object](Float::valueOf, p4:float))
                storeelement:Object(expr_AA:Object[], xor:int(ldc:int(8199), ldc:int(8195)), invokestatic:Float[expected:Object](Float::valueOf, p5:float))
                var_9_EB = invokevirtual:Object(\u71ae\u5fe1\u0b8e\u5140\uf995\u927d::\u4e72\u4cd9\u5654\u385b\u8389\u76bc, stack_E8_0:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d, expr_AA:Object[])
                
                if (logicalor:boolean(invokestatic:boolean(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u0c95\u3bc9\ud51e\ubefe\u0c95\u8350, var_9_EB:Object, getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\ud36e\uc229\u120d\u494c\u8aa5\u6b5f), newarray:Object[](java.lang.Object.class, and:int(ldc:int(-977), ldc:int(976)))), cmpeq:boolean(invokestatic:Object(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u7af6\u97e6\u51fa\u8df4\ub6ab\ud523, var_9_EB:Object, getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u74b1\ua068\ud7e8\u4bc8\u92ff\u4cd9), newarray:Object[](java.lang.Object.class, and:int(ldc:int(31488), ldc:int(-31507)))), aconstnull:Object()))) {
                    return:void()
                }
                
                var_7_63 = and:int(var_7_63:int, ldc:int(-1085128753))
                p2 = checkcast:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\u927d\u92ff\u71ae\uafe7\u6bb9.\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937.class, invokestatic:Object(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u7af6\u97e6\u51fa\u8df4\ub6ab\ud523, var_9_EB:Object, getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u74b1\ua068\ud7e8\u4bc8\u92ff\u4cd9), newarray:Object[](java.lang.Object.class, and:int(ldc:int(-15695), ldc:int(14350)))))
                p3 = checkcast:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u36d3\u9033\u6b0d\u983f\u8d90.\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8.class, invokestatic:Object(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u7af6\u97e6\u51fa\u8df4\ub6ab\ud523, var_9_EB:Object, getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\ub32d\u5fe1\u647c\u7873\u59ec\ub32d), newarray:Object[](java.lang.Object.class, and:int(ldc:int(9060), ldc:int(-10215)))))
                p4 = invokestatic:float(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\u9033\u97e6\u9a18\u983f\ud217\ud36e, var_9_EB:Object, getstatic:\u71ae\u5fe1\u0b8e\u5140\uf995\u927d(\u6c52\u873d\uc84e\u7ce1\u4daf\u8308::\ub32d\u0c95\u0b8e\u7043\u6fb0\u97e6), newarray:Object[](java.lang.Object.class, and:int(ldc:int(-18225), ldc:int(18224))))
            }
            
            loop {
                if (cmpne:boolean(and:int(var_7_63:int, ldc:int(33554432)), ldc:int(0))) {
                    var_7_63 = and:int(var_7_63:int, ldc:int(1584526573))
                    
                    if (cmpeq:boolean(p0:\ua3b4\u8aa5\ub113\ubf56\u873d, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\ua3b4\u8aa5\ub113\ubf56\u873d](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u71f1\u156b\u4179\ub83f\u7d52\u8308, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)))) {
                        invokevirtual:void(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\ubf56\ua61f\u4975\ua61f\u1187\u6b5f, invokevirtual:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u64f2\u3bc9\u67e9\u36d3\u5d20, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u71f1\u156b\u4179\ub83f\u7d52\u8308, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)), initobject:\u12b2\u6b0d\ub102\u6fb0\u600f\uc7fe[expected:\u9033\u6b0d\u3d64\uae87\u4c04\u965f](\u12b2\u6b0d\ub102\u6fb0\u600f\uc7fe::<init>, p2:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937, p3:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8, p1:\u7d52\u718f\u3776\u6fb0\ub83f))
                    }
                }
                
                if (cmpne:boolean(and:int(var_7_63:int, ldc:int(4096)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u927d\u92ff\u71ae\uafe7\u6bb9.\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937 p1, \u36d3\u9033\u6b0d\u983f\u8d90.\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8 p2, float p3, float p4, boolean p5) {
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
            invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.5)), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.5)), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.5)), p1:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937, p2:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8, p3:float, p4:float, p5:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e(double p0, double p1, double p2, \u927d\u92ff\u71ae\uafe7\u6bb9.\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937 p3, \u36d3\u9033\u6b0d\u983f\u8d90.\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8 p4, float p5, float p6, boolean p7) {
        var_12_63 : int
        var_14_79 : double
        var_16_8E : \u6cfe\u3d64\u8bb0\ub83f\u4f52\ube23
        
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
            var_12_63 = and:int(ldc:int(-655221497), ldc:int(418846554))
            var_14_79 = invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\uc87f\uc2e8\u7af6\u64ab\u718f\u6435, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u71f1\u156b\u4179\ub83f\u7d52\u8308, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)))), p0:double, p1:double, p2:double)
            var_16_8E = initobject:\u6cfe\u3d64\u8bb0\ub83f\u4f52\ube23(\u6cfe\u3d64\u8bb0\ub83f\u4f52\ube23::<init>, p3:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937, p4:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8, p5:float, p6:float, p0:double, p1:double, p2:double)
            
            if (logicaland:boolean(p7:boolean, cmpgt:boolean(var_14_79:double, ldc:double(100.0)))) {
                invokevirtual:void(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u3bc9\u4d85\u8d98\u7af6\u7043\u5654, invokevirtual:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u64f2\u3bc9\u67e9\u36d3\u5d20, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u71f1\u156b\u4179\ub83f\u7d52\u8308, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)), var_16_8E:\u6cfe\u3d64\u8bb0\ub83f\u4f52\ube23[expected:\u9033\u6b0d\u3d64\uae87\u4c04\u965f], d2i:int(mul:double(div:double(invokestatic:double(Math::sqrt, var_14_79:double), ldc:double(40.0)), ldc:double(20.0))))
            }
            else {
                var_12_63 = and:int(var_12_63:int, ldc:int(972236686))
                invokevirtual:void(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\ubf56\ua61f\u4975\ua61f\u1187\u6b5f, invokevirtual:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u64f2\u3bc9\u67e9\u36d3\u5d20, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u71f1\u156b\u4179\ub83f\u7d52\u8308, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)), var_16_8E:\u6cfe\u3d64\u8bb0\ub83f\u4f52\ube23[expected:\u9033\u6b0d\u3d64\uae87\u4c04\u965f])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3e75\uc84e\u62da\u64f2\ubefe\u1833(double p0, double p1, double p2, double p3, double p4, double p5, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p6) {
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
            invokevirtual:void(\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2::\u6ec6\ubf56\u5bc4\u4d85\u960f\u9937, getfield:\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4bc8\uc29a\u5245\ub70c\u183a\u12b2, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u71f1\u156b\u4179\ub83f\u7d52\u8308, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)), initobject:\u9937\u4f52\u527a\uc4d2\u4d85\u34df[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a](\u9937\u4f52\u527a\uc4d2\u4d85\u34df::<init>, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p0:double, p1:double, p2:double, p3:double, p4:double, p5:double, getfield:\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4bc8\uc29a\u5245\ub70c\u183a\u12b2, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u71f1\u156b\u4179\ub83f\u7d52\u8308, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)), p6:\uc31c\uc87f\uc246\u3776\ub7dc))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7ce1\u9937\u12cb\u3d64\u5bc4\uc84e(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u946b\u6d99\u8df4\u12cb\u5d20<?> p0) {
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
            invokevirtual:void(\u527a\u873d\u071d\u4f52\uc229\ud217::\u88c5\u4975\u6d69\u0b8e\u516c\uc246, getfield:\u527a\u873d\u071d\u4f52\uc229\ud217(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u1833\u72f1\uc7fe\ua3b4\u8df4\ube23, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255), p0:\u946b\u6d99\u8df4\u12cb\u5d20<?>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u8350\u76bc\u67e9\uff55\u8bb0\u385b \u516c\uafe7\u8df4\u92ff\ub32d\u9937() {
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
            return:\u8350\u76bc\u67e9\uff55\u8bb0\u385b(invokevirtual:\u8350\u76bc\u67e9\uff55\u8bb0\u385b(\u527a\u873d\u071d\u4f52\uc229\ud217::\u4179\u983f\ub6ab\u960f\u836c\ub6ab, getfield:\u527a\u873d\u071d\u4f52\uc229\ud217(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u1833\u72f1\uc7fe\ua3b4\u8df4\ube23, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)))
        }
        
        goto(Label_0006)
    }
    
    public void \ucb79\u7c6b\u8bb0\u72f1\u5db4\u9937(\u392e\ud7e8\u3bc9\u88c5\ud51e.\u7c6b\ud36e\u8d90\u0800\ua6bd p0) {
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
            putfield:\u7c6b\ud36e\u8d90\u0800\ua6bd(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u8350\u7006\u760c\u61a4\u5245\ubefe, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p0:\u7c6b\ud36e\u8d90\u0800\ua6bd)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u8258\uc238\u7e3f\u36d3\uc238<\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a> \u8413\uff55\ub8be\u385b\u92ee\u7330() {
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
            return:\u8258\uc238\u7e3f\u36d3\uc238<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(invokestatic:\u7e3f\u6bb9\ubff1\uc84e\u6bb9<Object>[expected:\u8258\uc238\u7e3f\u36d3\uc238<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>](\u7e3f\u6bb9\ubff1\uc84e\u6bb9<Object>::\u071d\u385b\u7049\uae5d\uc84e\u1833))
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u8258\uc238\u7e3f\u36d3\uc238<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8cae\ucb79\ud7e8\ub8be\u156b\u960f> \u8cae\u4f4a\ud217\u8709\u4cd9\ud51e() {
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
            return:\u8258\uc238\u7e3f\u36d3\uc238<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>(invokestatic:\u7e3f\u6bb9\ubff1\uc84e\u6bb9<Object>[expected:\u8258\uc238\u7e3f\u36d3\uc238<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>](\u7e3f\u6bb9\ubff1\uc84e\u6bb9<Object>::\u071d\u385b\u7049\uae5d\uc84e\u1833))
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ua562\u7330\ub113\u64ab\u6d69\u5fe1 \u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1() {
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
            return:\ua562\u7330\ub113\u64ab\u6d69\u5fe1(getfield:\ua562\u7330\ub113\u64ab\u6d69\u5fe1(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\ubcb0\u7e3f\u47c2\u98a4\u385b\uc238, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255))
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc31c\u8709\u5db4\u97b7\u5d20\u9af2(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1, int p2) {
        var_6_74 : boolean
        
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
            putfield:boolean(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u8aa5\uc31c\u4ab3\ub32d\u4d85\uc2bd, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, invokespecial:boolean(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u1833\u392e\u183a\u6b5f\u6ec6\ufe34, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255))
            var_6_74 = invokespecial:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p2:int)
            putfield:boolean(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u8aa5\uc31c\u4ab3\ub32d\u4d85\uc2bd, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, and:int[expected:boolean](ldc:int(17772), ldc:int(-28013)))
            return:boolean(var_6_74:boolean)
        }
        
        goto(Label_0006)
    }
    
    private boolean \u1833\u392e\u183a\u6b5f\u6ec6\ufe34() {
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
        
        if (logicalnot:boolean(instanceof:boolean(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u51fa\uc229\u494c\u92ff\u3504\u7873.class, getfield:\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc9f6\u6b5f\u8aa5\u97b7\u6cfe\u3504, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u71f1\u156b\u4179\ub83f\u7d52\u8308, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255))))) {
            return:boolean(and:int[expected:boolean](ldc:int(16508), ldc:int(-19966)))
        }
        
        return:boolean(invokevirtual:boolean(\u51fa\uc229\u494c\u92ff\u3504\u7873::\u7043\u0a06\u494c\ud4fe\u99f7\u5bc4, checkcast:\u51fa\uc229\u494c\u92ff\u3504\u7873(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u51fa\uc229\u494c\u92ff\u3504\u7873.class, getfield:\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179[expected:\u51fa\uc229\u494c\u92ff\u3504\u7873](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc9f6\u6b5f\u8aa5\u97b7\u6cfe\u3504, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u71f1\u156b\u4179\ub83f\u7d52\u8308, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)))))
    }
    
    public boolean \ubb2b\u927d\u51b2\u7330\u76bc\u3504() {
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
            return:boolean(getfield:boolean(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u8aa5\uc31c\u4ab3\ub32d\u4d85\uc2bd, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255))
        }
        
        goto(Label_0006)
    }
    
    public void \ud36e\ubff1\uff55\ubb2b\u52d3\u51b2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
            invokestatic:void(\u983f\ufe34\u36d3\uc229\ua068\u4c2b::\u40a9\u494c\u71ae\u88c5\u59ec\u8cae, p0:\u7d52\u718f\u3776\u6fb0\ub83f, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c])
            
            if (invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u446c\u4975\u88c5\u3711\u9033\u3e2a)) {
                invokestatic:void(\u3711\uff55\u385b\u8aa5\u51fa\u99f7::\u6c56\ucef1\u7c6b\u67d0\ubefe\u59ec, p0:\u7d52\u718f\u3776\u6fb0\ub83f, invokestatic:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u97e6\uf995\u0b8e\ucfaf\u071d\u527a))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uae5d\u97e6\u6d99\ufe34\u965f\ub113(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
            invokestatic:void(\u983f\ufe34\u36d3\uc229\ua068\u4c2b::\u4bc8\ub19c\u36d3\u8640\u8308\u6c56, p0:\u7d52\u718f\u3776\u6fb0\ub83f, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c])
            
            if (invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u446c\u4975\u88c5\u3711\u9033\u3e2a)) {
                invokestatic:void(\u3711\uff55\u385b\u8aa5\u51fa\u99f7::\ub171\u839e\ub70c\ube23\u52d3\uceb8, p0:\u7d52\u718f\u3776\u6fb0\ub83f, invokestatic:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u97e6\uf995\u0b8e\ucfaf\u071d\u527a))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u7c6b\u839e\u5245\u12cb\u7873\ud171 \u9033\u67d0\ud217\u946b\u51fa\u624e(java.lang.String p0) {
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
            return:\u7c6b\u839e\u5245\u12cb\u7873\ud171(checkcast:\u7c6b\u839e\u5245\u12cb\u7873\ud171(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u7c6b\u839e\u5245\u12cb\u7873\ud171.class, invokeinterface:\u7c6b\u839e\u5245\u12cb\u7873\ud171(Map<String, \u7c6b\u839e\u5245\u12cb\u7873\ud171>::get, getfield:Map<String, \u7c6b\u839e\u5245\u12cb\u7873\ud171>(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u71ae\u2dcc\u8bb0\u64f2\u8389\u446c, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255), p0:String[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    public void \u760c\u7e3f\u7bad\u16f6\u56bd\u1833(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u7c6b\u839e\u5245\u12cb\u7873\ud171 p0) {
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
            invokeinterface:\u7c6b\u839e\u5245\u12cb\u7873\ud171(Map<String, \u7c6b\u839e\u5245\u12cb\u7873\ud171>::put, getfield:Map<String, \u7c6b\u839e\u5245\u12cb\u7873\ud171>(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u71ae\u2dcc\u8bb0\u64f2\u8389\u446c, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255), invokevirtual:String(\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217::\uceb8\u8413\uae87\u4daf\u47c2\u6ec6, p0:\u7c6b\u839e\u5245\u12cb\u7873\ud171[expected:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217]), p0:\u7c6b\u839e\u5245\u12cb\u7873\ud171)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u4bc8\u9033\u4f4a\u3c25\u9af2\u7e3f() {
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
            return:int(and:int(ldc:int(18490), ldc:int(-18496)))
        }
        
        goto(Label_0006)
    }
    
    public \u392e\ud7e8\u3bc9\u88c5\ud51e.\u7c6b\ud36e\u8d90\u0800\ua6bd \u8df4\ub113\u9937\u4cd9\u4c04\u6d69() {
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
            return:\u7c6b\ud36e\u8d90\u0800\ua6bd(getfield:\u7c6b\ud36e\u8d90\u0800\ua6bd(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u8350\u7006\u760c\u61a4\u5245\ubefe, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255))
        }
        
        goto(Label_0006)
    }
    
    public \u59ec\u8413\u97e6\uc229\u3776.\u88c5\uc2bd\u1833\u960f\u5db4\u4d85 \u6b5f\u8709\u36d3\ubb2b\ua3b4\ud36e() {
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
            return:\u88c5\uc2bd\u1833\u960f\u5db4\u4d85(invokevirtual:\u88c5\uc2bd\u1833\u960f\u5db4\u4d85(\u527a\u873d\u071d\u4f52\uc229\ud217::\u0a06\ud523\u5bc4\ufe34\u4975\u6bb9, getfield:\u527a\u873d\u071d\u4f52\uc229\ud217(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u1833\u72f1\uc7fe\ua3b4\u8df4\ube23, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)))
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f \u4bc8\ubff1\u76bc\u718f\uc238\u6d69() {
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
            return:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f(invokevirtual:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f(\u527a\u873d\u071d\u4f52\uc229\ud217::\u7049\u7af6\u8d98\ud523\u2dcc\u873d, getfield:\u527a\u873d\u071d\u4f52\uc229\ud217(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u1833\u72f1\uc7fe\ua3b4\u8df4\ube23, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)))
        }
        
        goto(Label_0006)
    }
    
    public void \u92ee\uceb8\u2dcc\u51b2\u5245\u34df(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p2, int p3) {
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
            invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u927d\u3504\u5bc4\ub70c\u6198\u4daf, getfield:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u59ec\u16f6\ub70c\ud171\u64ab, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255), this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u718f\u6435\uc31c\u4ab3\u98a4], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p2:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p3:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u600f\u9033\u4c2b\u7873\ub8be\uc2bd(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p2) {
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
            invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u7d52\u0800\u647c\u7049\uc29a\u8258, getfield:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u59ec\u16f6\ub70c\ud171\u64ab, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p2:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u965f\ub19c\u960f\u8640\u6cfe\ub19c(int p0, int p1, int p2) {
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
            invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud171\u71f1\u4daf\uff55\ubded\u74b1, getfield:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u59ec\u16f6\ub70c\ud171\u64ab, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255), p0:int, p1:int, p2:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u392e\u8d98\u156b\ufe34\u51b2\u8640(int p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, int p2) {
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
            invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u759a\ubcb0\u4179\u7e3f\u836c\u5f50, getfield:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u59ec\u16f6\ub70c\ud171\u64ab, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255), p0:int, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p2:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u64ab\ub1b9\u12b2\ub6ab\u718f\u51b2(int p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, int p2) {
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
            invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u120d\u965f\ud171\u3a62\u1833\u71f1, getfield:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u59ec\u16f6\ub70c\ud171\u64ab, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255), p0:int, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p2:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4f4a\u76bc\ub6ab\u5654\uc4d2\ub7dc(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0, int p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, int p3) {
        var_5_9C : int
        var_5_AD : int
        var_8_BF : \u1833\u88c5\u0b8e\uc9f6\u960f\u839e
        var_7_A5 : Throwable
        var_5_C7 : int
        var_9_D9 : \u446c\u67d0\ua562\u97b7\u6c56\u59ec
        
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
            var_5_9C = and:int(ldc:int(2134214356), ldc:int(-613054773))
            
            try {
                loop {
                    if (cmpne:boolean(and:int(var_5_9C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_5_9C = and:int(var_5_9C:int, ldc:int(-1170215224))
                        invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ub83f\u5140\uf94d\u16f6\ubefe\uf9c5, getfield:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u59ec\u16f6\ub70c\ud171\u64ab, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255), p0:\ua3b4\u8aa5\ub113\ubf56\u873d, p1:int, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p3:int)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_9C:int, ldc:int(1)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_5_9C = and:int(var_5_9C:int, ldc:int(-19480377))
                }
                
                var_5_9C = and:int(var_5_9C:int, ldc:int(-138465342))
            }
            catch (java.lang.Throwable var_7_A5) {
                var_5_AD = and:int(var_5_9C:int, ldc:int(1047465683))
                var_8_BF = invokestatic:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e(\u1833\u88c5\u0b8e\uc9f6\u960f\u839e::\ubcb0\u59ec\u6d99\u156b\u0800\u946b, var_7_A5:Throwable, loadelement:String(getstatic:String[](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uc3e3\ucfaf\uc910\u6198\u5245\u8640), xor:int(ldc:int(205), ldc:int(196))))
                var_5_C7 = and:int(var_5_AD:int, ldc:int(1999073257))
                var_9_D9 = invokevirtual:\u446c\u67d0\ua562\u97b7\u6c56\u59ec(\u1833\u88c5\u0b8e\uc9f6\u960f\u839e::\u8c8a\u6b0d\uae87\u7330\u446c\uc9f6, var_8_BF:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e, loadelement:String(getstatic:String[](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uc3e3\ucfaf\uc910\u6198\u5245\u8640), xor:int(ldc:int(4610), ldc:int(4616))))
                
                loop {
                    if (cmpeq:boolean(and:int(var_5_C7:int, ldc:int(33554432)), ldc:int(0))) {
                        var_5_C7 = and:int(var_5_C7:int, ldc:int(1028300080))
                        goto(Label_0417)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_C7:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0350)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_C7:int, ldc:int(128)), ldc:int(0))) {
                        var_5_C7 = and:int(var_5_C7:int, ldc:int(-1765976346))
                        invokevirtual:\u446c\u67d0\ua562\u97b7\u6c56\u59ec(\u446c\u67d0\ua562\u97b7\u6c56\u59ec::\u7af6\u67d0\ub113\u4daf\u12b2\ufcaf, var_9_D9:\u446c\u67d0\ua562\u97b7\u6c56\u59ec, loadelement:String(getstatic:String[](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uc3e3\ucfaf\uc910\u6198\u5245\u8640), and:int(ldc:int(30219), ldc:int(2063))), invokestatic:String[expected:Object](\u446c\u67d0\ua562\u97b7\u6c56\u59ec::\u927d\u16f6\u3bd6\u8aa5\u6b0d\u7e3f, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
                    }
                    
                    Label_0286:
                    
                    if (cmpeq:boolean(and:int(var_5_C7:int, ldc:int(1024)), ldc:int(0))) {
                        var_5_C7 = and:int(var_5_C7:int, ldc:int(1099121888))
                        goto(Label_0417)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_C7:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_5_C7:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_5_C7 = and:int(var_5_C7:int, ldc:int(1379352293))
                        invokevirtual:\u446c\u67d0\ua562\u97b7\u6c56\u59ec(\u446c\u67d0\ua562\u97b7\u6c56\u59ec::\u7af6\u67d0\ub113\u4daf\u12b2\ufcaf, var_9_D9:\u446c\u67d0\ua562\u97b7\u6c56\u59ec, loadelement:String(getstatic:String[](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uc3e3\ucfaf\uc910\u6198\u5245\u8640), xor:int(ldc:int(-31676), ldc:int(-31672))), p0:\ua3b4\u8aa5\ub113\ubf56\u873d[expected:Object])
                    }
                    
                    Label_0350:
                    
                    if (cmpeq:boolean(and:int(var_5_C7:int, ldc:int(262144)), ldc:int(0))) {
                        var_5_C7 = and:int(var_5_C7:int, ldc:int(-317324972))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_5_C7:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0286)
                        }
                        
                        if (cmpne:boolean(and:int(var_5_C7:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_5_C7 = and:int(var_5_C7:int, ldc:int(-1011398972))
                        invokevirtual:\u446c\u67d0\ua562\u97b7\u6c56\u59ec(\u446c\u67d0\ua562\u97b7\u6c56\u59ec::\u7af6\u67d0\ub113\u4daf\u12b2\ufcaf, var_9_D9:\u446c\u67d0\ua562\u97b7\u6c56\u59ec, loadelement:String(getstatic:String[](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uc3e3\ucfaf\uc910\u6198\u5245\u8640), and:int(ldc:int(16397), ldc:int(3405))), invokestatic:Integer[expected:Object](Integer::valueOf, p1:int))
                    }
                    
                    Label_0417:
                    
                    if (cmpeq:boolean(and:int(var_5_C7:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0350)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_C7:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0286)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_C7:int, ldc:int(8388608)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_5_C7 = and:int(var_5_C7:int, ldc:int(308516805))
                }
                
                invokevirtual:\u446c\u67d0\ua562\u97b7\u6c56\u59ec(\u446c\u67d0\ua562\u97b7\u6c56\u59ec::\u7af6\u67d0\ub113\u4daf\u12b2\ufcaf, var_9_D9:\u446c\u67d0\ua562\u97b7\u6c56\u59ec, loadelement:String(getstatic:String[](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uc3e3\ucfaf\uc910\u6198\u5245\u8640), and:int(ldc:int(2062), ldc:int(29630))), invokestatic:Integer[expected:Object](Integer::valueOf, p3:int))
                athrow(initobject:\uceb8\u8258\uf9c5\uc229\u7330\ucfaf(\uceb8\u8258\uf9c5\uc229\u7330\ucfaf::<init>, var_8_BF:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u385b\u8c8a\uf9c5\u6ec6\ufcaf\u5fe1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a p0, double p1, double p2, double p3, double p4, double p5, double p6) {
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
            invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u16f6\u8d98\u6b0d\u836c\u6b0d\u51b2, getfield:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u59ec\u16f6\ub70c\ud171\u64ab, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255), p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, invokevirtual:boolean(\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<T>::\u4f4a\u836c\ud523\ub32d\u6d99\u9255, invokeinterface:\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<?>(\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a::\u8389\u516c\u6fb0\u52d3\ubb2b\uae5d, p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a)), p1:double, p2:double, p3:double, p4:double, p5:double, p6:double)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u385b\u8c8a\uf9c5\u6ec6\ufcaf\u5fe1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a p0, boolean p1, double p2, double p3, double p4, double p5, double p6, double p7) {
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
            invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u16f6\u8d98\u6b0d\u836c\u6b0d\u51b2, getfield:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u59ec\u16f6\ub70c\ud171\u64ab, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255), p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, ternaryop:int[expected:boolean](logicalor:boolean(invokevirtual:boolean(\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<T>::\u4f4a\u836c\ud523\ub32d\u6d99\u9255, invokeinterface:\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<?>(\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a::\u8389\u516c\u6fb0\u52d3\ubb2b\uae5d, p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a)), p1:boolean), and:int(ldc:int(3351), ldc:int(12449)), and:int(ldc:int(1515), ldc:int(-3564))), p2:double, p3:double, p4:double, p5:double, p6:double, p7:double)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubded\u3504\uc2e8\uf995\u3a62\u67d0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a p0, double p1, double p2, double p3, double p4, double p5, double p6) {
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
            invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u16f6\u8d98\u6b0d\u836c\u6b0d\u51b2, getfield:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u59ec\u16f6\ub70c\ud171\u64ab, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255), p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, and:int[expected:boolean](ldc:int(28682), ldc:int(-28684)), xor:int[expected:boolean](ldc:int(-32512), ldc:int(-32511)), p1:double, p2:double, p3:double, p4:double, p5:double, p6:double)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubded\u3504\uc2e8\uf995\u3a62\u67d0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a p0, boolean p1, double p2, double p3, double p4, double p5, double p6, double p7) {
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
            invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u16f6\u8d98\u6b0d\u836c\u6b0d\u51b2, getfield:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u34df\u59ec\u16f6\ub70c\ud171\u64ab, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255), p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, ternaryop:int[expected:boolean](logicalor:boolean(invokevirtual:boolean(\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<T>::\u4f4a\u836c\ud523\ub32d\u6d99\u9255, invokeinterface:\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<?>(\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a::\u8389\u516c\u6fb0\u52d3\ubb2b\uae5d, p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a)), p1:boolean), xor:int(ldc:int(20609), ldc:int(20608)), and:int(ldc:int(-20401), ldc:int(20368))), xor:int[expected:boolean](ldc:int(18432), ldc:int(18433)), p2:double, p3:double, p4:double, p5:double, p6:double, p7:double)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\uc910\ufcaf\uc229\u9255\u71f1\u0b8e> \uc3e3\u7043\u12b2\u56bd\uf94d\u3e2a() {
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
            return:List<\uc910\ufcaf\uc229\u9255\u71f1\u0b8e>(getfield:List<\uc910\ufcaf\uc229\u9255\u71f1\u0b8e>(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uf995\u7ce1\ua61f\u76bc\u7330\ud36e, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255))
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \uc29a\u6435\ub1b9\ub18d\u0800\u873d(int p0, int p1, int p2) {
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
            return:\uc2e8\u9255\u647c\ud171\ubf56(checkcast:\uc2e8\u9255\u647c\ud171\ubf56(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56.class, invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>::\u624e\u62da\u9937\uafe7\u8389\u98a4, invokevirtual:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<Object>[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>](\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f::\ucb79\ud36e\uc4d2\uc2e8\u3776\ub171, invokevirtual:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u4bc8\ubff1\u76bc\u718f\uc238\u6d69, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255), getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u4d85\u071d\u4c2b\ua6bd\uc238\u718f)), getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uc2e8\u9255\u647c\ud171\ubf56>(\ud523\u7330\u7049\u9033\ub32d::\u3d4b\u7d52\u6bb9\uf995\u416d\u5140))))
        }
        
        goto(Label_0006)
    }
    
    public float \u392e\u34df\u3a62\u9937\u836c\u8aa5(float p0) {
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
            return:float(add:float(mul:float(d2f:float(mul:double(f2d:double(d2f:float(mul:double(f2d:double(sub:float(ldc:float(1.0f), invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, sub:float(ldc:float(1.0f), add:float(mul:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u88c5\u7ce1\u4ab3\u8350\uae87\u62da, mul:float(invokevirtual:float(\u8753\u8709\ubff1\ub32d\u4d85::\u8bb0\u8413\u4cd9\u3d4b\u52d3\u4c2b, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u8753\u8709\ubff1\ub32d\u4d85], p0:float), ldc:float(6.2831855f))), ldc:float(2.0f)), ldc:float(0.2f))), ldc:float(0.0f), ldc:float(1.0f)))), sub:double(ldc:double(1.0), div:double(f2d:double(mul:float(invokevirtual:float(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub32d\u8413\u600f\ucfaf\u61a4\ua3b4, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], p0:float), ldc:float(5.0f))), ldc:double(16.0)))))), sub:double(ldc:double(1.0), div:double(f2d:double(mul:float(invokevirtual:float(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u76bc\ua3b4\ubf56\ub83f\u6ec6\u759a, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], p0:float), ldc:float(5.0f))), ldc:double(16.0))))), ldc:float(0.8f)), ldc:float(0.2f)))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3a62\u5d20\u4f52\uc229\u8308\ud7e8 \u4bc8\ufcaf\u8bb0\uc3e3\u120d\u3c25(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, float p1) {
        var_3_61 : int
        var_6_81 : float
        var_8_8F : int
        var_9_A3 : float
        var_10_B7 : float
        var_11_C8 : float
        var_9_CF : float
        var_10_D6 : float
        var_11_DD : float
        var_12_E4 : float
        var_13_151 : float
        var_14_15B : float
        var_3_F2 : int
        var_13_F8 : float
        var_14_1A9 : float
        var_15_1B3 : float
        var_14_1F0 : float
        var_14_205 : float
        
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
            var_3_61 = and:int(ldc:int(144416600), ldc:int(1568620461))
            var_6_81 = invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, add:float(mul:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u88c5\u7ce1\u4ab3\u8350\uae87\u62da, mul:float(invokevirtual:float(\u8753\u8709\ubff1\ub32d\u4d85::\u8bb0\u8413\u4cd9\u3d4b\u52d3\u4c2b, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u8753\u8709\ubff1\ub32d\u4d85], p1:float), ldc:float(6.2831855f))), ldc:float(2.0f)), ldc:float(0.5f)), ldc:float(0.0f), ldc:float(1.0f))
            var_8_8F = invokevirtual:int(\uc2e8\u9255\u647c\ud171\ubf56::\uc2bd\u93a2\uc238\u392e\u76bc\u71f1, invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\ub83f\uc9f6\u61a4\u8df4\uc2bd\u8709, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
            var_9_A3 = div:float(i2f:float(and:int(shr:int(var_8_8F:int, ldc:int(16)), and:int(ldc:int(17663), ldc:int(4863)))), ldc:float(255.0f))
            var_10_B7 = div:float(i2f:float(and:int(shr:int(var_8_8F:int, ldc:int(8)), xor:int(ldc:int(8197), ldc:int(8442)))), ldc:float(255.0f))
            var_11_C8 = div:float(i2f:float(and:int(var_8_8F:int, and:int(ldc:int(511), ldc:int(2815)))), ldc:float(255.0f))
            var_9_CF = mul:float(var_9_A3:float, var_6_81:float)
            var_10_D6 = mul:float(var_10_B7:float, var_6_81:float)
            var_11_DD = mul:float(var_11_C8:float, var_6_81:float)
            var_12_E4 = invokevirtual:float(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub32d\u8413\u600f\ucfaf\u61a4\ua3b4, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], p1:float)
            
            if (cmpgt:boolean(var_12_E4:float, ldc:float(0.0f))) {
                var_13_151 = mul:float(add:float(add:float(mul:float(var_9_CF:float, ldc:float(0.3f)), mul:float(var_10_D6:float, ldc:float(0.59f))), mul:float(var_11_DD:float, ldc:float(0.11f))), ldc:float(0.6f))
                var_14_15B = sub:float(ldc:float(1.0f), mul:float(var_12_E4:float, ldc:float(0.75f)))
                var_9_CF = add:float(mul:float(var_9_CF:float, var_14_15B:float), mul:float(var_13_151:float, sub:float(ldc:float(1.0f), var_14_15B:float)))
                var_10_D6 = add:float(mul:float(var_10_D6:float, var_14_15B:float), mul:float(var_13_151:float, sub:float(ldc:float(1.0f), var_14_15B:float)))
                var_11_DD = add:float(mul:float(var_11_DD:float, var_14_15B:float), mul:float(var_13_151:float, sub:float(ldc:float(1.0f), var_14_15B:float)))
            }
            
            var_3_F2 = and:int(var_3_61:int, ldc:int(491525934))
            var_13_F8 = invokevirtual:float(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u76bc\ua3b4\ubf56\ub83f\u6ec6\u759a, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], p1:float)
            
            if (cmpgt:boolean(var_13_F8:float, ldc:float(0.0f))) {
                var_14_1A9 = mul:float(add:float(add:float(mul:float(var_9_CF:float, ldc:float(0.3f)), mul:float(var_10_D6:float, ldc:float(0.59f))), mul:float(var_11_DD:float, ldc:float(0.11f))), ldc:float(0.2f))
                var_15_1B3 = sub:float(ldc:float(1.0f), mul:float(var_13_F8:float, ldc:float(0.75f)))
                var_9_CF = add:float(mul:float(var_9_CF:float, var_15_1B3:float), mul:float(var_14_1A9:float, sub:float(ldc:float(1.0f), var_15_1B3:float)))
                var_10_D6 = add:float(mul:float(var_10_D6:float, var_15_1B3:float), mul:float(var_14_1A9:float, sub:float(ldc:float(1.0f), var_15_1B3:float)))
                var_11_DD = add:float(mul:float(var_11_DD:float, var_15_1B3:float), mul:float(var_14_1A9:float, sub:float(ldc:float(1.0f), var_15_1B3:float)))
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_3_F2:int, ldc:int(536870912)), ldc:int(0))) {
                    var_3_F2 = and:int(var_3_F2:int, ldc:int(-580808774))
                    
                    if (cmpgt:boolean(getfield:int(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\ua6bd\ua6bd\ud12e\ud4fe\u4492\u8350, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255), ldc:int(0))) {
                        var_14_1F0 = sub:float(i2f:float(getfield:int(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\ua6bd\ua6bd\ud12e\ud4fe\u4492\u8350, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)), p1:float)
                        
                        if (cmpgt:boolean(var_14_1F0:float, ldc:float(1.0f))) {
                            var_14_1F0 = ldc:float(1.0f)
                        }
                        
                        var_3_F2 = and:int(var_3_F2:int, ldc:int(-832827592))
                        var_14_205 = mul:float(var_14_1F0:float, ldc:float(0.45f))
                        var_9_CF = add:float(mul:float(var_9_CF:float, sub:float(ldc:float(1.0f), var_14_205:float)), mul:float(ldc:float(0.8f), var_14_205:float))
                        var_10_D6 = add:float(mul:float(var_10_D6:float, sub:float(ldc:float(1.0f), var_14_205:float)), mul:float(ldc:float(0.8f), var_14_205:float))
                        var_11_DD = add:float(mul:float(var_11_DD:float, sub:float(ldc:float(1.0f), var_14_205:float)), mul:float(ldc:float(1.0f), var_14_205:float))
                    }
                }
                
                if (cmpne:boolean(and:int(var_3_F2:int, ldc:int(1024)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(initobject:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::<init>, f2d:double(var_9_CF:float), f2d:double(var_10_D6:float), f2d:double(var_11_DD:float)))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3a62\u5d20\u4f52\uc229\u8308\ud7e8 \u71ae\u8cae\u0a06\ud7e8\u4ab3\ub18d(float p0) {
        var_5_81 : float
        var_6_84 : float
        var_7_87 : float
        var_8_8A : float
        var_9_91 : float
        var_10_10E : float
        var_11_118 : float
        var_6_AD : float
        var_7_BC : float
        var_8_CB : float
        var_10_D2 : float
        var_11_166 : float
        var_12_170 : float
        
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
            var_5_81 = invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, add:float(mul:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u88c5\u7ce1\u4ab3\u8350\uae87\u62da, mul:float(invokevirtual:float(\u8753\u8709\ubff1\ub32d\u4d85::\u8bb0\u8413\u4cd9\u3d4b\u52d3\u4c2b, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u8753\u8709\ubff1\ub32d\u4d85], p0:float), ldc:float(6.2831855f))), ldc:float(2.0f)), ldc:float(0.5f)), ldc:float(0.0f), ldc:float(1.0f))
            var_6_84 = ldc:float(1.0f)
            var_7_87 = ldc:float(1.0f)
            var_8_8A = ldc:float(1.0f)
            var_9_91 = invokevirtual:float(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub32d\u8413\u600f\ucfaf\u61a4\ua3b4, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], p0:float)
            
            if (cmpgt:boolean(var_9_91:float, ldc:float(0.0f))) {
                var_10_10E = mul:float(add:float(add:float(mul:float(var_6_84:float, ldc:float(0.3f)), mul:float(var_7_87:float, ldc:float(0.59f))), mul:float(var_8_8A:float, ldc:float(0.11f))), ldc:float(0.6f))
                var_11_118 = sub:float(ldc:float(1.0f), mul:float(var_9_91:float, ldc:float(0.95f)))
                var_6_84 = add:float(mul:float(var_6_84:float, var_11_118:float), mul:float(var_10_10E:float, sub:float(ldc:float(1.0f), var_11_118:float)))
                var_7_87 = add:float(mul:float(var_7_87:float, var_11_118:float), mul:float(var_10_10E:float, sub:float(ldc:float(1.0f), var_11_118:float)))
                var_8_8A = add:float(mul:float(var_8_8A:float, var_11_118:float), mul:float(var_10_10E:float, sub:float(ldc:float(1.0f), var_11_118:float)))
            }
            
            var_6_AD = mul:float(var_6_84:float, add:float(mul:float(var_5_81:float, ldc:float(0.9f)), ldc:float(0.1f)))
            var_7_BC = mul:float(var_7_87:float, add:float(mul:float(var_5_81:float, ldc:float(0.9f)), ldc:float(0.1f)))
            var_8_CB = mul:float(var_8_8A:float, add:float(mul:float(var_5_81:float, ldc:float(0.85f)), ldc:float(0.15f)))
            var_10_D2 = invokevirtual:float(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u76bc\ua3b4\ubf56\ub83f\u6ec6\u759a, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], p0:float)
            
            if (cmpgt:boolean(var_10_D2:float, ldc:float(0.0f))) {
                var_11_166 = mul:float(add:float(add:float(mul:float(var_6_AD:float, ldc:float(0.3f)), mul:float(var_7_BC:float, ldc:float(0.59f))), mul:float(var_8_CB:float, ldc:float(0.11f))), ldc:float(0.2f))
                var_12_170 = sub:float(ldc:float(1.0f), mul:float(var_10_D2:float, ldc:float(0.95f)))
                var_6_AD = add:float(mul:float(var_6_AD:float, var_12_170:float), mul:float(var_11_166:float, sub:float(ldc:float(1.0f), var_12_170:float)))
                var_7_BC = add:float(mul:float(var_7_BC:float, var_12_170:float), mul:float(var_11_166:float, sub:float(ldc:float(1.0f), var_12_170:float)))
                var_8_CB = add:float(mul:float(var_8_CB:float, var_12_170:float), mul:float(var_11_166:float, sub:float(ldc:float(1.0f), var_12_170:float)))
            }
            
            return:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(initobject:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::<init>, f2d:double(var_6_AD:float), f2d:double(var_7_BC:float), f2d:double(var_8_CB:float)))
        }
        
        goto(Label_0006)
    }
    
    public float \ua6bd\u4c2b\uc87f\u4daf\uc7fe\u97b7(float p0) {
        var_5_83 : float
        
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
            var_5_83 = invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, sub:float(ldc:float(1.0f), add:float(mul:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u88c5\u7ce1\u4ab3\u8350\uae87\u62da, mul:float(invokevirtual:float(\u8753\u8709\ubff1\ub32d\u4d85::\u8bb0\u8413\u4cd9\u3d4b\u52d3\u4c2b, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u8753\u8709\ubff1\ub32d\u4d85], p0:float), ldc:float(6.2831855f))), ldc:float(2.0f)), ldc:float(0.25f))), ldc:float(0.0f), ldc:float(1.0f))
            return:float(mul:float(mul:float(var_5_83:float, var_5_83:float), ldc:float(0.5f)))
        }
        
        goto(Label_0006)
    }
    
    public int \u3d4b\u64ab\u51b2\u4975\u12b2\u960f() {
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
            return:int(getfield:int(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\ua6bd\ua6bd\ud12e\ud4fe\u4492\u8350, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255))
        }
        
        goto(Label_0006)
    }
    
    public void \u5245\ub70c\u3bd6\u4daf\u3bd6\ub7dc(int p0) {
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
            putfield:int(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\ua6bd\ua6bd\ud12e\ud4fe\u4492\u8350, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public float \u72f1\u8d90\ud36e\uc9f6\ubff1\ubff1(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p0, boolean p1) {
        var_3_67 : int
        var_5_6F : boolean
        var_3_106 : int
        var_6_7A : boolean
        stack_3C9_0 : float [generated]
        stack_265_0 : float [generated]
        stack_45D_0 : float [generated]
        
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
        var_3_67 = and:int(and:int(ldc:int(-122002279), ldc:int(-109027619)), ldc:int(-41554689))
        var_5_6F = invokevirtual:boolean(\ua61f\u183a\u6c52\uf9c5\u4cd9\u4d85::\ufcaf\u8413\ub7dc\u5f50\u516c\u8c8a, invokevirtual:\ua61f\u183a\u6c52\uf9c5\u4cd9\u4d85(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u7873\u67e9\u3e75\ub6ab\u7873\u7873, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255))
        var_3_106 = and:int(var_3_67:int, ldc:int(-777236514))
        var_6_7A = invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u61a4\u3e75\u8aa5\ub102\ub7dc\u647c)
        
        loop {
            if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_1432)
            }
            
            if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(268435456)), ldc:int(0))) {
                var_3_106 = and:int(var_3_106:int, ldc:int(1980559738))
                goto(Label_1287)
            }
            
            if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_1128)
            }
            
            if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0979)
            }
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0811)
            }
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0673)
            }
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(256)), ldc:int(0))) {
                var_3_106 = and:int(var_3_106:int, ldc:int(1078011671))
                goto(Label_0466)
            }
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0347)
            }
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(4096)), ldc:int(0))) {
                var_3_106 = and:int(var_3_106:int, ldc:int(124966066))
            }
            else {
                var_3_106 = and:int(var_3_106:int, ldc:int(-86849812))
                
                if (p1:boolean) {
                    switch (loadelement:int(getstatic:int[](\u3d4b\u3d4b\u3bd6\ucb79\u74b1\u9af2::\u3d64\u385b\ud4fe\u960f\u8389\u960f), invokevirtual:int(Enum<E>::ordinal, p0:\u760c\u4975\u4179\uc246\u8640\u64f2[expected:Enum<\u760c\u4975\u4179\uc246\u8640\u64f2>]))) {
                        case 1:
                            if (var_5_6F:boolean) {
                                goto(Label_0673)
                            }
                            
                            if (var_6_7A:boolean) {
                                goto(Label_0811)
                            }
                            
                            stack_3C9_0 = stack_265_0 = stack_45D_0 = ldc(0.5f)
                            goto(Label_0938)
                        
                        case 2:
                            if (var_5_6F:boolean) {
                                goto(Label_0979)
                            }
                            
                            stack_3C9_0 = stack_265_0 = stack_45D_0 = ldc(1.0f)
                            goto(Label_1086)
                        
                        case 3:
                        case 4:
                            if (invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u61a4\u3e75\u8aa5\ub102\ub7dc\u647c)) {
                                goto(Label_1128)
                            }
                            
                            return:float(ldc:float(0.8f))
                        
                        case 5:
                        case 6:
                            if (invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u61a4\u3e75\u8aa5\ub102\ub7dc\u647c)) {
                                goto(Label_1432)
                            }
                            
                            return:float(ldc:float(0.6f))
                        
                        default:
                            return:float(ldc:float(1.0f))
                    }
                }
            }
            
            Label_0233:
            
            if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_1432)
            }
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_1287)
            }
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(16777216)), ldc:int(0))) {
                var_3_106 = and:int(var_3_106:int, ldc:int(-1979945100))
                goto(Label_1128)
            }
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0979)
            }
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(4096)), ldc:int(0))) {
                var_3_106 = and:int(var_3_106:int, ldc:int(1013676440))
                goto(Label_0811)
            }
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(16777216)), ldc:int(0))) {
                var_3_106 = and:int(var_3_106:int, ldc:int(1314182294))
                goto(Label_0673)
            }
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0466)
            }
            
            if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(8388608)), ldc:int(0))) {
                var_3_106 = and:int(var_3_106:int, ldc:int(113722681))
            }
            else {
                if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(268435456)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_106 = and:int(var_3_106:int, ldc:int(-556505124))
            }
            
            Label_0347:
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_1432)
            }
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(4096)), ldc:int(0))) {
                var_3_106 = and:int(var_3_106:int, ldc:int(968736287))
                goto(Label_1287)
            }
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_1128)
            }
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0979)
            }
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0811)
            }
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0673)
            }
            
            if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(268435456)), ldc:int(0))) {
                var_3_106 = and:int(var_3_106:int, ldc:int(-451909262))
            }
            else {
                if (cmpne:boolean(and:int(var_3_106:int, ldc:int(4096)), ldc:int(0))) {
                    var_3_106 = and:int(var_3_106:int, ldc:int(584232119))
                    goto(Label_0233)
                }
                
                if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_106 = and:int(var_3_106:int, ldc:int(-263677248))
                    loopcontinue()
                }
                
                var_3_106 = and:int(var_3_106:int, ldc:int(-242067511))
                
                if (logicalnot:boolean(var_5_6F:boolean)) {
                    stack_3C9_0 = stack_265_0 = stack_45D_0 = ldc(1.0f)
                    looporswitchbreak()
                }
            }
            
            Label_0466:
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_1432)
            }
            
            if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(268435456)), ldc:int(0))) {
                var_3_106 = and:int(var_3_106:int, ldc:int(1200549156))
                goto(Label_1287)
            }
            
            if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(2147483647)), ldc:int(0))) {
                var_3_106 = and:int(var_3_106:int, ldc:int(2130585472))
                goto(Label_1128)
            }
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0979)
            }
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0811)
            }
            
            if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(128)), ldc:int(0))) {
                var_3_106 = and:int(var_3_106:int, ldc:int(-1337368104))
            }
            else {
                if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0347)
                }
                
                if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0233)
                }
                
                if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(256)), ldc:int(0))) {
                    var_3_106 = and:int(var_3_106:int, ldc:int(-623350390))
                    stack_3C9_0 = stack_265_0 = stack_45D_0 = ldc(0.9f)
                    looporswitchbreak()
                }
                
                loopcontinue()
            }
            
            Label_0673:
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(16777216)), ldc:int(0))) {
                var_3_106 = and:int(var_3_106:int, ldc:int(-1220657532))
                goto(Label_1432)
            }
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(512)), ldc:int(0))) {
                var_3_106 = and:int(var_3_106:int, ldc:int(-2040384394))
                goto(Label_1287)
            }
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(4096)), ldc:int(0))) {
                var_3_106 = and:int(var_3_106:int, ldc:int(851667174))
                goto(Label_1128)
            }
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0979)
            }
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(8)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_106 = and:int(var_3_106:int, ldc:int(1834712212))
                    goto(Label_0466)
                }
                
                if (cmpne:boolean(and:int(var_3_106:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0347)
                }
                
                if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0233)
                }
                
                if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_106 = and:int(var_3_106:int, ldc:int(-951994940))
                    loopcontinue()
                }
                
                var_3_106 = and:int(var_3_106:int, ldc:int(-73873510))
                stack_3C9_0 = stack_265_0 = stack_45D_0 = ldc(0.9f)
                goto(Label_0938)
            }
            
            Label_0811:
            
            if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_1432)
            }
            
            if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_1287)
            }
            
            if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(8388608)), ldc:int(0))) {
                var_3_106 = and:int(var_3_106:int, ldc:int(2067595397))
                goto(Label_1128)
            }
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(16384)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_3_106:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0673)
                }
                
                if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0466)
                }
                
                if (cmpne:boolean(and:int(var_3_106:int, ldc:int(32768)), ldc:int(0))) {
                    var_3_106 = and:int(var_3_106:int, ldc:int(1886530236))
                    goto(Label_0347)
                }
                
                if (cmpne:boolean(and:int(var_3_106:int, ldc:int(256)), ldc:int(0))) {
                    var_3_106 = and:int(var_3_106:int, ldc:int(1929017547))
                    goto(Label_0233)
                }
                
                if (cmpne:boolean(and:int(var_3_106:int, ldc:int(512)), ldc:int(0))) {
                    var_3_106 = and:int(var_3_106:int, ldc:int(-359249298))
                    loopcontinue()
                }
                
                var_3_106 = and:int(var_3_106:int, ldc:int(-591570983))
                stack_3C9_0 = stack_265_0 = stack_45D_0 = getstatic(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u624e\u59ec\u983f\u3776\u3504\u4cd9)
                goto(Label_0938)
            }
            
            Label_0979:
            
            if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_1432)
            }
            
            if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_1287)
            }
            
            if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(256)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_3_106:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0811)
                }
                
                if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_3_106 = and:int(var_3_106:int, ldc:int(1781388980))
                    goto(Label_0673)
                }
                
                if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0466)
                }
                
                if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0347)
                }
                
                if (cmpne:boolean(and:int(var_3_106:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0233)
                }
                
                if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(128)), ldc:int(0))) {
                    var_3_106 = and:int(var_3_106:int, ldc:int(747824639))
                    loopcontinue()
                }
                
                var_3_106 = and:int(var_3_106:int, ldc:int(-34421346))
                stack_3C9_0 = stack_265_0 = stack_45D_0 = ldc(0.9f)
                goto(Label_1086)
            }
            
            Label_1128:
            
            if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(16384)), ldc:int(0))) {
                var_3_106 = and:int(var_3_106:int, ldc:int(-1741107032))
                goto(Label_1432)
            }
            
            if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(1073741824)), ldc:int(0))) {
                var_3_106 = and:int(var_3_106:int, ldc:int(-1804400374))
            }
            else {
                if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_106 = and:int(var_3_106:int, ldc:int(-23959252))
                    goto(Label_0979)
                }
                
                if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_106 = and:int(var_3_106:int, ldc:int(603949687))
                    goto(Label_0811)
                }
                
                if (cmpne:boolean(and:int(var_3_106:int, ldc:int(4096)), ldc:int(0))) {
                    var_3_106 = and:int(var_3_106:int, ldc:int(-1956771185))
                    goto(Label_0673)
                }
                
                if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(8388608)), ldc:int(0))) {
                    var_3_106 = and:int(var_3_106:int, ldc:int(-1816537193))
                    goto(Label_0466)
                }
                
                if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(8388608)), ldc:int(0))) {
                    var_3_106 = and:int(var_3_106:int, ldc:int(-67423878))
                    goto(Label_0347)
                }
                
                if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(16384)), ldc:int(0))) {
                    var_3_106 = and:int(var_3_106:int, ldc:int(-1406588482))
                    goto(Label_0233)
                }
                
                if (cmpne:boolean(and:int(var_3_106:int, ldc:int(16777216)), ldc:int(0))) {
                    var_3_106 = and:int(var_3_106:int, ldc:int(2105866769))
                    loopcontinue()
                }
                
                var_3_106 = and:int(var_3_106:int, ldc:int(-19171637))
            }
            
            Label_1287:
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(32768)), ldc:int(0))) {
                var_3_106 = and:int(var_3_106:int, ldc:int(665058240))
            }
            else {
                if (cmpne:boolean(and:int(var_3_106:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_1128)
                }
                
                if (cmpne:boolean(and:int(var_3_106:int, ldc:int(32768)), ldc:int(0))) {
                    var_3_106 = and:int(var_3_106:int, ldc:int(783052224))
                    goto(Label_0979)
                }
                
                if (cmpne:boolean(and:int(var_3_106:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0811)
                }
                
                if (cmpne:boolean(and:int(var_3_106:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0673)
                }
                
                if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0466)
                }
                
                if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(268435456)), ldc:int(0))) {
                    var_3_106 = and:int(var_3_106:int, ldc:int(-2016027360))
                    goto(Label_0347)
                }
                
                if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(1024)), ldc:int(0))) {
                    var_3_106 = and:int(var_3_106:int, ldc:int(1469791967))
                    goto(Label_0233)
                }
                
                if (cmpne:boolean(and:int(var_3_106:int, ldc:int(4096)), ldc:int(0))) {
                    var_3_106 = and:int(var_3_106:int, ldc:int(-831598910))
                    loopcontinue()
                }
                
                return:float(getstatic:float(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\uc29a\u0b8e\u64ab\u446c\u8640\u4bc8))
            }
            
            Label_1432:
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_1287)
            }
            
            if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_1128)
            }
            
            if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0979)
            }
            
            if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(8388608)), ldc:int(0))) {
                var_3_106 = and:int(var_3_106:int, ldc:int(-1926321869))
                goto(Label_0811)
            }
            
            if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0673)
            }
            
            if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(1024)), ldc:int(0))) {
                var_3_106 = and:int(var_3_106:int, ldc:int(-1073084406))
                goto(Label_0466)
            }
            
            if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0347)
            }
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(512)), ldc:int(0))) {
                var_3_106 = and:int(var_3_106:int, ldc:int(-870998118))
                goto(Label_0233)
            }
            
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(2147483647)), ldc:int(0))) {
                return:float(getstatic:float(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u6c56\u3776\u759a\u4492\u6fb0\u385b))
            }
            
            var_3_106 = and:int(var_3_106:int, ldc:int(648613512))
        }
        
        Label_0582:
        
        if (cmpne:boolean(and:int(var_3_106:int, ldc:int(4096)), ldc:int(0))) {
            var_3_106 = and:int(var_3_106:int, ldc:int(-2087629033))
            goto(Label_1086)
        }
        
        if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(4096)), ldc:int(0))) {
            return:float(stack_265_0:float)
        }
        
        Label_0938:
        
        if (cmpeq:boolean(and:int(var_3_106:int, ldc:int(16384)), ldc:int(0))) {
            var_3_106 = and:int(var_3_106:int, ldc:int(1080854281))
        }
        else {
            if (cmpne:boolean(and:int(var_3_106:int, ldc:int(2147483647)), ldc:int(0))) {
                return:float(stack_3C9_0:float)
            }
            
            goto(Label_0582)
        }
        
        Label_1086:
        
        if (cmpne:boolean(and:int(var_3_106:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_106 = and:int(var_3_106:int, ldc:int(-1699769214))
            goto(Label_0938)
        }
        
        if (cmpne:boolean(and:int(var_3_106:int, ldc:int(1073741824)), ldc:int(0))) {
            return:float(stack_45D_0:float)
        }
        
        goto(Label_0582)
    }
    
    public int \u4f52\u3d4b\ub83f\u120d\u7d52\u64ab(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u6b0d\u12cb\u156b\u4179\u8bb0.\u760c\u5bc4\u6d69\u3bd6\u4d85\ub171 p1) {
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
    
    public int \u59ec\ud4fe\u416d\ub6ab\uc229\u6198(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u6b0d\u12cb\u156b\u4179\u8bb0.\u760c\u5bc4\u6d69\u3bd6\u4d85\ub171 p1) {
        var_5_6B : int
        var_6_9D : int
        var_7_A6 : int
        var_8_AF : int
        var_9_B8 : int
        var_10_E5 : \ub7dc\u8753\u3711\u4daf\u7bad\u4cd9
        var_11_EE : \u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a
        var_12_183 : int
        
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
        var_5_6B = getfield:int(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u7006\u5140\u839e\u92ee\u8709\u3bc9, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)))
        
        if (cmpne:boolean(var_5_6B:int, ldc:int(0))) {
            var_6_9D = mul:int(add:int(mul:int(var_5_6B:int, and:int(ldc:int(18754), ldc:int(39))), and:int(ldc:int(57), ldc:int(2437))), add:int(mul:int(var_5_6B:int, xor:int(ldc:int(8264), ldc:int(8266))), xor:int(ldc:int(-16372), ldc:int(-16371))))
            var_7_A6 = and:int(ldc:int(-22972), ldc:int(6322))
            var_8_AF = and:int(ldc:int(5076), ldc:int(-7127))
            var_9_B8 = and:int(ldc:int(-20102), ldc:int(19973))
            var_10_E5 = initobject:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::<init>, sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), var_5_6B:int), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), var_5_6B:int), add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), var_5_6B:int), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), var_5_6B:int))
            var_11_EE = initobject:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::<init>)
            
            while (invokevirtual:boolean(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\u2dcc\uc7fe\u836c\ua61f\uae5d\ud171, var_10_E5:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9)) {
                invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\ucb79\u3bc9\u494c\u6d99\uc2e8\uae87, var_11_EE:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, invokevirtual:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\u51b2\ufe34\uc229\u40a9\u647c\ufe34, var_10_E5:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9), invokevirtual:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\u3e75\uc31c\u76bc\ub70c\u156b\u98a4, var_10_E5:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9), invokevirtual:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\uae5d\u97b7\ucfaf\u61a4\u8d90\ud51e, var_10_E5:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9))
                var_12_183 = invokeinterface:int(\u760c\u5bc4\u6d69\u3bd6\u4d85\ub171::\u56bd\u74b1\u3a62\ua3b4\u5140\ub70c, p1:\u760c\u5bc4\u6d69\u3bd6\u4d85\ub171, invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\ub83f\uc9f6\u61a4\u8df4\uc2bd\u8709, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], var_11_EE:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56]), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_11_EE:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_11_EE:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])))
                var_7_A6 = add:int(var_7_A6:int, shr:int(and:int(var_12_183:int, ldc:int(16711680)), ldc:int(16)))
                var_8_AF = add:int(var_8_AF:int, shr:int(and:int(var_12_183:int, ldc:int(65280)), ldc:int(8)))
                var_9_B8 = add:int(var_9_B8:int, and:int(var_12_183:int, and:int(ldc:int(1791), ldc:int(511))))
            }
            
            return:int(or:int(or:int(shl:int(and:int(div:int(var_7_A6:int, var_6_9D:int), xor:int(ldc:int(123), ldc:int(132))), ldc:int(16)), shl:int(and:int(div:int(var_8_AF:int, var_6_9D:int), xor:int(ldc:int(17458), ldc:int(17613))), ldc:int(8))), and:int(div:int(var_9_B8:int, var_6_9D:int), xor:int(ldc:int(5229), ldc:int(5266)))))
        }
        
        return:int(invokeinterface:int(\u760c\u5bc4\u6d69\u3bd6\u4d85\ub171::\u56bd\u74b1\u3a62\ua3b4\u5140\ub70c, p1:\u760c\u5bc4\u6d69\u3bd6\u4d85\ub171, invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\ub83f\uc9f6\u61a4\u8df4\uc2bd\u8709, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))))
    }
    
    public \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 \u5db4\ua068\u6cfe\u1833\ud171\uc246() {
        var_3_84 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        
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
            var_3_84 = initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, invokeinterface:int(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\uc910\u3d64\u62da\u62da\u7c6b\u8d90, getfield:\u7873\u7006\u960f\ua6bd\u839e\u7873[expected:\u4492\u92ee\u9255\uc29a\u3e75\u7043](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u527a\u3d64\ud171\u59ec\u836c\u6b0d, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)), invokeinterface:int(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\u1833\ub83f\uc29a\u3e2a\u5f50\u3711, getfield:\u7873\u7006\u960f\ua6bd\u839e\u7873[expected:\u4492\u92ee\u9255\uc29a\u3e75\u7043](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u527a\u3d64\ud171\u59ec\u836c\u6b0d, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)), invokeinterface:int(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\u1187\ub171\ub70c\ufcaf\u69d9\u4d85, getfield:\u7873\u7006\u960f\ua6bd\u839e\u7873[expected:\u4492\u92ee\u9255\uc29a\u3e75\u7043](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u527a\u3d64\ud171\u59ec\u836c\u6b0d, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u59ec\uc2e8\u0c95\u8d90\uc7fe\u927d, invokevirtual:\u34df\u4492\u71ae\uc238\u7873\uafe7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]), var_3_84:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                var_3_84 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u7ce1\uc9f6\u61a4\u0a06\uff55::\uf995\uc7fe\u4daf\u71f1\u62da\ub102, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u7ce1\uc9f6\u61a4\u0a06\uff55], getstatic:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9(\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9::\uceb8\ua3b4\u4975\u4179\uf94d\u6198), initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u759a\u51fa\ud7e8\ub18d\u40a9\u4daf, invokevirtual:\u34df\u4492\u71ae\uc238\u7873\uafe7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c])), ldc:double(0.0), invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\uc84e\u6ec6\u56bd\u4c04\u759a\u69d9, invokevirtual:\u34df\u4492\u71ae\uc238\u7873\uafe7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]))))
            }
            
            return:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(var_3_84:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
        }
        
        goto(Label_0006)
    }
    
    public float \u61a4\u5bc4\ud7e8\u92ff\u9937\u8cae() {
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
            return:float(invokeinterface:float(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\ub18d\u9937\uf995\u7ce1\u983f\u9033, getfield:\u7873\u7006\u960f\ua6bd\u839e\u7873[expected:\u4492\u92ee\u9255\uc29a\u3e75\u7043](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u527a\u3d64\ud171\u59ec\u836c\u6b0d, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)))
        }
        
        goto(Label_0006)
    }
    
    public void \ud217\u839e\u8350\u5d20\u7330\u7af6(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, float p1) {
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
            invokeinterface:void(\u7873\u7006\u960f\ua6bd\u839e\u7873::\u647c\u7006\u7006\u69d9\u759a\u718f, getfield:\u7873\u7006\u960f\ua6bd\u839e\u7873(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u527a\u3d64\ud171\u59ec\u836c\u6b0d, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:float)
            return:void()
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
            return:String(loadelement:String(getstatic:String[](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uc3e3\ucfaf\uc910\u6198\u5245\u8640), and:int(ldc:int(4239), ldc:int(2847))))
        }
        
        goto(Label_0006)
    }
    
    public \u56bd\u8413\u647c\u5bc4\ud158.\uc84e\uc229\u7006\u7049\ufe34\ubb2b \u3d4b\ud523\uff55\u647c\u4ab3\u7af6() {
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
            return:\uc84e\uc229\u7006\u7049\ufe34\ubb2b(getfield:\uc84e\uc229\u7006\u7049\ufe34\ubb2b(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u759a\uc2e8\u759a\uc910\ub8be\uae5d, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255))
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u4492\u92ee\u9255\uc29a\u3e75\u7043 \u3d4b\ud523\uff55\u647c\u4ab3\u7af6() {
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
            return:\u4492\u92ee\u9255\uc29a\u3e75\u7043(invokevirtual:\uc84e\uc229\u7006\u7049\ufe34\ubb2b[expected:\u4492\u92ee\u9255\uc29a\u3e75\u7043](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3d4b\ud523\uff55\u647c\u4ab3\u7af6, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255))
        }
        
        goto(Label_0006)
    }
    
    public \u4f52\u6cfe\u9a18\uc29a\u3bd6.\u34df\ua068\u72f1\u527a\u0b8e \u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1() {
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
            return:\u34df\ua068\u72f1\u527a\u0b8e(invokevirtual:\ua562\u7330\ub113\u64ab\u6d69\u5fe1[expected:\u34df\ua068\u72f1\u527a\u0b8e](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255))
        }
        
        goto(Label_0006)
    }
    
    private int lambda$\u8df4\ud171\uc87f\u527a\u9a18\u52d3$7(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u6b0d\u12cb\u156b\u4179\u8bb0.\u760c\u5bc4\u6d69\u3bd6\u4d85\ub171 p1) {
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
            return:int(invokevirtual:int(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u59ec\ud4fe\u416d\ub6ab\uc229\u6198, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\u760c\u5bc4\u6d69\u3bd6\u4d85\ub171))
        }
        
        goto(Label_0006)
    }
    
    private java.lang.String lambda$\u8bb0\uc29a\u4c2b\u64f2\ub102\u071d$6() {
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
            return:String(ternaryop:String(cmpne:boolean(invokevirtual:\uf995\u64f2\u3711\uc2e8\u927d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u5bc4\uc87f\ua562\u6b5f\ud36e\u6198, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u71f1\u156b\u4179\ub83f\u7d52\u8308, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)), aconstnull:\uf995\u64f2\u3711\uc2e8\u927d()), loadelement:String(getstatic:String[](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uc3e3\ucfaf\uc910\u6198\u5245\u8640), and:int(ldc:int(16537), ldc:int(1617))), loadelement:String(getstatic:String[](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uc3e3\ucfaf\uc910\u6198\u5245\u8640), and:int(ldc:int(176), ldc:int(16978)))))
        }
        
        goto(Label_0006)
    }
    
    private java.lang.String lambda$\ua562\u759a\u3776\u8308\u76bc\u8d90$5() {
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
            return:String(invokevirtual:String(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\ub83f\u3e2a\u516c\u6fb0\uceb8\ubded, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u71f1\u156b\u4179\ub83f\u7d52\u8308, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255))))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ua562\u927d\u7049\u52d3\u4c04\u3776$4(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a p0, \u5d20\u7043\u88c5\u5db4\uf94d.\u7049\u5fe1\u4179\u9937\ubded p1) {
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
            
            if (invokevirtual:boolean(\u7049\u5fe1\u4179\u9937\ubded::\u56bd\ub7dc\u6cfe\u7006\u76bc\u527a, p1:\u7049\u5fe1\u4179\u9937\ubded, getfield:Random(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255))) {
                invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u385b\u8c8a\uf9c5\u6ec6\ufcaf\u5fe1, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, invokevirtual:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a(\u7049\u5fe1\u4179\u9937\ubded::\u960f\ua562\u69d9\uc7fe\u88c5\u8bb0, p1:\u7049\u5fe1\u4179\u9937\ubded), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokevirtual:double(Random::nextDouble, getfield:Random(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255))), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokevirtual:double(Random::nextDouble, getfield:Random(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255))), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokevirtual:double(Random::nextDouble, getfield:Random(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255))), ldc:double(0.0), ldc:double(0.0), ldc:double(0.0))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u59ec\ubff1\u8d90\u99f7\u62da\u4492$3(\u6b0d\u12cb\u156b\u4179\u8bb0.\u760c\u5bc4\u6d69\u3bd6\u4d85\ub171 p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e p1) {
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
            invokevirtual:void(\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e::\u0a06\u40a9\u7ce1\ub113\u7006\ub7dc, p1:\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ufcaf\ub70c\u3a62\u76bc\u0b8e\u7043$2(int p0, int p1, \u6b0d\u12cb\u156b\u4179\u8bb0.\u760c\u5bc4\u6d69\u3bd6\u4d85\ub171 p2, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e p3) {
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
            invokevirtual:void(\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e::\uc7fe\u836c\u759a\u71ae\ua562\u71ae, p3:\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e, p0:int, p1:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\ua3b4\u3dd3\u6198\u873d\u6cfe\u8d98$1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
            return:String(invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9255\u0c95\u4cd9\ube23\u760c<?>>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9255\u0c95\u4cd9\ube23\u760c<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u6d69\u64f2\uc2bd\ub6ab\ub7dc\u7873), invokevirtual:\u9255\u0c95\u4cd9\ube23\u760c<?>(\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\ud523\ub171\u4975\u516c\uf995, p0:\u7d52\u718f\u3776\u6fb0\ub83f))))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u0c95\u6cfe\u8d90\u8640\u4975\u3776$0(it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap p0) {
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
            invokevirtual:Object(Object2ObjectArrayMap::put, p0:Object2ObjectArrayMap, getstatic:\u760c\u5bc4\u6d69\u3bd6\u4d85\ub171[expected:Object](\uafe7\uc246\ud7e8\u8350\u0c95::\u98a4\u51b2\uc31c\u7d52\u64ab\u6c52), initobject:\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e[expected:Object](\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e::<init>))
            invokevirtual:Object(Object2ObjectArrayMap::put, p0:Object2ObjectArrayMap, getstatic:\u760c\u5bc4\u6d69\u3bd6\u4d85\ub171[expected:Object](\uafe7\uc246\ud7e8\u8350\u0c95::\uc84e\u7873\u93a2\u7d52\ub171\u7c6b), initobject:\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e[expected:Object](\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e::<init>))
            invokevirtual:Object(Object2ObjectArrayMap::put, p0:Object2ObjectArrayMap, getstatic:\u760c\u5bc4\u6d69\u3bd6\u4d85\ub171[expected:Object](\uafe7\uc246\ud7e8\u8350\u0c95::\u5db4\u7330\u7049\u4c04\u67e9\ub1b9), initobject:\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e[expected:Object](\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_30B : int
        expr_6E : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_BC_0 : byte[] [generated]
        stack_BE_0 : byte[] [generated]
        stack_E5_0 : byte[] [generated]
        stack_31E_0 : byte[] [generated]
        stack_3AD_0 : byte[] [generated]
        stack_404_0 : byte[] [generated]
        var_4_2F6 : int
        var_3_2FB : byte[]
        var_5_2FC : int
        var_0_314 : int
        expr_31E : byte [generated]
        stack_367_2 : byte [generated]
        stack_344_0 : byte [generated]
        expr_3AD : byte [generated]
        expr_96 : int [generated]
        var_2_BC : byte[]
        expr_C0 : int [generated]
        var_3_3F2 : byte[]
        var_5_3F3 : int
        var_3_F1 : String
        stack_2EF_0 : String[] [generated]
        expr_103 : String[] [generated]
        
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
        var_0_30B = and:int(ldc:int(-105429758), ldc:int(-390636041))
        expr_6E = arraylength:int(stack_94_0 = stack_96_0 = stack_BC_0 = stack_BE_0 = stack_E5_0 = stack_31E_0 = stack_3AD_0 = stack_404_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("dfj0EKDzIAj0+AicaAx0/FA0jNDA3GTgHPw4oHDxOKRRMPMM5PQAIAhE/9zhDCjAICf17Azc5HesLCSshUQYoFh7vOhgqIUUHJgUByRoCCwUxIUE+LBIq1zINPwY7AQAAD3IaBz8EzCoBBjY/ADpwAjQ7O/8pDQEAFBpAAAAALcBVAAQZPf12PT09PcsgAgoHTB8oOzjmOwEAAA9GAAcxC+sZPQszADpwAjQ7O/8VFRY9GDU2PU01KAAF+EAAAAAt1A41JxAfBVEEBBQ70AsxJwAfBX0ONQ0A1gwOCS47AS8+GSAAEDw/HD4uCSYPOAU5ADsxGS4ZPQszAD5uMgU8KcEYbgAbPCraGDMCDjsALw0xBTwcI3ve5+HJg==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_2F6 = expr_6E:int
        var_3_2FB = newarray:byte[](byte.class, expr_6E:int)
        var_5_2FC = expr_6E:int
        Label_0766:
        
        while (cmpeq:boolean(and:int(var_0_30B:int, ldc:int(2048)), ldc:int(0))) {
            var_0_314 = and:int(var_0_30B:int, ldc:int(-87667342))
            var_5_2FC = add:int(var_5_2FC:int, ldc:int(-1))
            expr_31E = stack_367_2 = loadelement(stack_31E_0, var_5_2FC)
            
            if (cmplt:boolean(add:int(add:int(var_5_2FC:int, ldc:int(5)), neg:int(var_4_2F6:int)), ldc:int(0))) {
                stack_367_2 = stack_344_0 = add:byte(expr_31E:byte, loadelement:byte(var_3_2FB:byte[], add:int(var_5_2FC:int, ldc:int(5))))
                goto(Label_0852)
            }
            
            Label_0811:
            
            if (cmpne:boolean(and:int(var_0_314:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_314 = and:int(var_0_314:int, ldc:int(-1163504861))
            }
            else {
                var_0_314 = and:int(var_0_314:int, ldc:int(-422063359))
                stack_367_2 = stack_344_0 = add:byte(expr_31E:byte, ldc:byte(5))
            }
            
            Label_0852:
            
            if (cmpne:boolean(and:int(var_0_314:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0811)
            }
            
            var_0_30B = and:int(var_0_314:int, ldc:int(-440982701))
            storeelement:byte(var_3_2FB:byte[], var_5_2FC:int, stack_367_2:byte)
            
            if (cmpne:boolean(var_5_2FC:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BC_0 = stack_BE_0 = stack_E5_0 = stack_31E_0 = stack_3AD_0 = stack_404_0 = var_3_2FB:byte[]
            goto(Label_0115)
        }
        
        var_0_30B = and:int(var_0_30B:int, ldc:int(-2129002181))
        Label_0909:
        
        while (cmpeq:boolean(and:int(var_0_30B:int, ldc:int(4096)), ldc:int(0))) {
            var_0_30B = and:int(var_0_30B:int, ldc:int(-24724129))
            var_5_2FC = add:int(var_5_2FC:int, ldc:int(-1))
            expr_3AD = loadelement:byte(stack_3AD_0:byte[], var_5_2FC:int)
            storeelement:byte(var_3_2FB:byte[], var_5_2FC:int, xor:int(add:int(or:int(and:int(shl:int(expr_3AD:byte, and:int(ldc:int(12452), ldc:int(532))), ldc:int(-16)), and:int(shr:int(expr_3AD:byte[expected:int], and:int(ldc:int(260), ldc:int(7300))), ldc:int(15))), ldc:int(48)), ldc:int(34)))
            
            if (cmpne:boolean(var_5_2FC:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BC_0 = stack_BE_0 = stack_E5_0 = stack_31E_0 = stack_3AD_0 = stack_404_0 = var_3_2FB:byte[]
            goto(Label_0155)
        }
        
        var_0_30B = and:int(var_0_30B:int, ldc:int(-751505060))
        goto(Label_0766)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_30B:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0197)
        }
        
        if (cmpne:boolean(and:int(var_0_30B:int, ldc:int(2048)), ldc:int(0))) {
            var_0_30B = and:int(var_0_30B:int, ldc:int(50272967))
        }
        else {
            var_0_30B = and:int(var_0_30B:int, ldc:int(-6377065))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_2F6 = expr_96:int
                var_3_2FB = newarray:byte[](byte.class, expr_96:int)
                var_5_2FC = expr_96:int
                goto(Label_0909)
            }
        }
        
        Label_0155:
        
        if (cmpeq:boolean(and:int(var_0_30B:int, ldc:int(4096)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_30B:int, ldc:int(32)), ldc:int(0))) {
                var_0_30B = and:int(var_0_30B:int, ldc:int(91147134))
                goto(Label_0115)
            }
            
            var_0_30B = and:int(var_0_30B:int, ldc:int(-218192024))
            var_2_BC = stack_BC_0:byte[]
            expr_C0 = add:int(arraylength:int(stack_BE_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C0:int, ldc:int(0))) {
                var_3_3F2 = newarray:byte[](byte.class, expr_C0:int)
                var_5_3F3 = expr_C0:int
                
                loop {
                    var_0_30B = and:int(var_0_30B:int, ldc:int(-370704555))
                    var_5_3F3 = add:int(var_5_3F3:int, ldc:int(-1))
                    storeelement:byte(var_3_3F2:byte[], var_5_3F3:int, add:int(shl:int(loadelement:byte(stack_404_0:byte[], var_5_3F3:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_BC:byte[], add:int(var_5_3F3:int, xor:int(ldc:int(8214), ldc:int(8215)))), ldc:int(6)), xor:int(ldc:int(260), ldc:int(263)))))
                    
                    if (cmpne:boolean(var_5_3F3:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BC_0 = stack_BE_0 = stack_E5_0 = stack_31E_0 = stack_3AD_0 = stack_404_0 = var_3_3F2:byte[]
            }
        }
        
        Label_0197:
        
        if (cmpeq:boolean(and:int(var_0_30B:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_30B = and:int(var_0_30B:int, ldc:int(44646809))
            goto(Label_0155)
        }
        
        if (cmpne:boolean(and:int(var_0_30B:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_F1 = initobject:String(String::<init>, stack_E5_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_2EF_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32660), ldc:int(-32642)))
            expr_103 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1811), ldc:int(82)))
            storeelement:String(expr_103:String[], xor:int(ldc:int(-25600), ldc:int(-25589)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(-10925), ldc:int(10924)), xor:int(ldc:int(110), ldc:int(127))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(299), ldc:int(292)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(533), ldc:int(5201)), xor:int(ldc:int(26757), ldc:int(26777))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(4234), ldc:int(4239)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(543), ldc:int(24636)), and:int(ldc:int(1084), ldc:int(4414))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(8748), ldc:int(8738)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(16703), ldc:int(252)), and:int(ldc:int(19663), ldc:int(4182))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(8589), ldc:int(8577)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(18510), ldc:int(5719)), and:int(ldc:int(602), ldc:int(8434))))
            storeelement:String(expr_103:String[], and:int(ldc:int(1759), ldc:int(8493)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(10834), ldc:int(95)), and:int(ldc:int(24831), ldc:int(2396))))
            storeelement:String(expr_103:String[], and:int(ldc:int(24849), ldc:int(7249)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(4263), ldc:int(4347)), xor:int(ldc:int(291), ldc:int(345))))
            storeelement:String(expr_103:String[], and:int(ldc:int(19162), ldc:int(4366)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(4095), ldc:int(122)), and:int(ldc:int(17626), ldc:int(2706))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(-20337), ldc:int(-20321)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(8915), ldc:int(150)), and:int(ldc:int(955), ldc:int(18615))))
            storeelement:String(expr_103:String[], and:int(ldc:int(2313), ldc:int(1641)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(25335), ldc:int(7355)), xor:int(ldc:int(8245), ldc:int(8435))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(25620), ldc:int(25619)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(-28626), ldc:int(-28440)), xor:int(ldc:int(18581), ldc:int(18503))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(788), ldc:int(796)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(2802), ldc:int(8662)), and:int(ldc:int(5631), ldc:int(733))))
            storeelement:String(expr_103:String[], and:int(ldc:int(7192), ldc:int(-7193)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(20580), ldc:int(20665)), xor:int(ldc:int(16495), ldc:int(16524))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(-32640), ldc:int(-32636)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(324), ldc:int(423)), and:int(ldc:int(12525), ldc:int(493))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(2322), ldc:int(2323)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(1570), ldc:int(1743)), xor:int(ldc:int(-31797), ldc:int(-31938))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(2694), ldc:int(2688)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(12533), ldc:int(1269)), xor:int(ldc:int(4418), ldc:int(4178))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(4232), ldc:int(4235)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(12893), ldc:int(13133)), xor:int(ldc:int(-23450), ldc:int(-23184))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(-32120), ldc:int(-32118)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(16513), ldc:int(16791)), and:int(ldc:int(27482), ldc:int(410))))
            putstatic:String[](\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\uc3e3\ucfaf\uc910\u6198\u5245\u8640, expr_103:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u3a62\ucef1\u718f\ub70c\u71ae\u6bb9(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_68D : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_698 : int
        
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
        var_3_68D = and:int(ldc:int(-1397218066), ldc:int(-419442785))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_68D = and:int(var_3_68D:int, ldc:int(-275040002))
            var_5_81 = and:int(ldc:int(-5167), ldc:int(5166))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(14976), ldc:int(-16017)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_68D:int, ldc:int(-1361476162))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(80), ldc:int(81)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(8496), ldc:int(8497)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_68D = and:int(var_3_DA:int, ldc:int(2040351231))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(28169), ldc:int(147)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(744676257))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-74934217))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(95861634))
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1357937529))
                    }
                    else {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1744421534))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1223711144))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1765156890))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1153593599))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(748373021))
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-22727027))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1891517326))
                            var_11_EB = and:int(ldc:int(26673), ldc:int(-27314))
                            goto(Label_1562)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0586:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-858931920))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(966230326))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(620412670))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0693:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1794075782))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1869838242))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(276117578))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1687367676))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1262782065))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0825:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1005231799))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(89476155))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1253271071))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(2082317477))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1983947825))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1363258129))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(1290), ldc:int(1291))
                                goto(Label_1137)
                            }
                        }
                    }
                    
                    Label_0959:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-709792889))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-2058560807))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-555172765))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1597457388))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0825)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1190079111))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-102181412))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(2078055663))
                        var_11_EB = and:int(ldc:int(12768), ldc:int(-14817))
                    }
                    
                    Label_1137:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1915895891))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1339537604))
                            goto(Label_0959)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1208336648))
                            goto(Label_0825)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1437786497))
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-2135114616))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(731768117))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-888723448))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-438319458))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1416)
                            }
                        }
                    }
                    
                    Label_1289:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1941769318))
                            goto(Label_1137)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0959)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1845235943))
                            goto(Label_0825)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(752447826))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1195848546))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1562)
                    }
                    
                    Label_1416:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(145048148))
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1008613988))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1420423632))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1704201607))
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-281824404))
                        loopcontinue()
                    }
                    
                    var_3_68D = and:int(var_3_68D:int, ldc:int(851257823))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1562:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_698 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1573:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1371897100))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1660649157))
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1671044510))
                        var_17_698 = add:int(var_16_119:int, and:int(ldc:int(19721), ldc:int(65)))
                        looporswitchbreak()
                    }
                    
                    var_3_68D = and:int(var_3_68D:int, ldc:int(598911961))
                }
                
                var_3_68D = and:int(var_3_68D:int, ldc:int(2042546878))
                
                if (cmple:boolean(var_5_81 = var_17_698:int, sub:int(var_6_88:int, and:int(ldc:int(16901), ldc:int(4131))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
            var_3_68D = and:int(var_3_68D:int, ldc:int(496112205))
            goto(Label_0108)
        }
    }
}
