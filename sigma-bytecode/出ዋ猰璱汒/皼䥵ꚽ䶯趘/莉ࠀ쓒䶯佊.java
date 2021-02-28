public class \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u8389\u0800\uc4d2\u4daf\u4f4a {
    public void \u8389\u0800\uc4d2\u4daf\u4f4a() {
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
            invokespecial:Object(Object::<init>, this:\u8389\u0800\uc4d2\u4daf\u4f4a)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u9937\u61a4\uf995\u8d90\u718f\ub8be(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int \u5fe1\uae5d\u8709\ubded\u8389\u64f2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3a62\u5d20\u4f52\uc229\u8308\ud7e8 p2, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p3, boolean p4) {
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
    
    private static \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f lambda$\u4daf\ud158\u3504\u69d9\u927d\uf9c5$4(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3a62\u5d20\u4f52\uc229\u8308\ud7e8 p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p1) {
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
            invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\u392e\u4179\ud51e\u12b2\ub83f\u960f, p1:\u7d52\u718f\u3776\u6fb0\ub83f, getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, p0:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6bb9\uc29a\u99f7\u7e3f\u6b5f\u156b, p0:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, p0:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), getfield:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u7d52\u8709\ubefe\u7af6\u0b8e\ua61f, p1:\u7d52\u718f\u3776\u6fb0\ub83f), getfield:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u4d85\u71ae\u494c\u839e\uf9c5\u93a2, p1:\u7d52\u718f\u3776\u6fb0\ub83f))
            return:\u7d52\u718f\u3776\u6fb0\ub83f(p1:\u7d52\u718f\u3776\u6fb0\ub83f)
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ud158\u71f1\u5db4\ub8be\u600f\u3776$3(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u8389\u0800\uc4d2\u4daf\u4f4a::\u5fe1\uae5d\u8709\ubded\u8389\u64f2, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u527a\u4ab3\u62da\u8bb0\u5140::\uf9c5\ub1b9\u69d9\u5245\uc7fe\u8cae, p0:CommandContext, loadelement:String(getstatic:String[](\u8389\u0800\uc4d2\u4daf\u4f4a::\u7006\u3bd6\ua562\u67d0\u5d20\u7bad), xor:int(ldc:int(540), ldc:int(541)))), invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u4f52\u873d\u5bc4\u647c\u4c2b::\uff55\u97e6\u8640\uae87\u5f50\u3e2a, p0:CommandContext, loadelement:String(getstatic:String[](\u8389\u0800\uc4d2\u4daf\u4f4a::\u7006\u3bd6\ua562\u67d0\u5d20\u7bad), xor:int(ldc:int(664), ldc:int(666)))), invokestatic:\uc31c\uc87f\uc246\u3776\ub7dc(\u61a4\u6c52\u4ab3\u4ab3\u4c04::\u7af6\uc31c\ud523\ufcaf\u4f4a\u3d64, p0:CommandContext, loadelement:String(getstatic:String[](\u8389\u0800\uc4d2\u4daf\u4f4a::\u7006\u3bd6\ua562\u67d0\u5d20\u7bad), and:int(ldc:int(3), ldc:int(20595)))), and:int[expected:boolean](ldc:int(-3087), ldc:int(3086))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u7ce1\u624e\u7c6b\uc910\u36d3\u7d52$2(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u8389\u0800\uc4d2\u4daf\u4f4a::\u5fe1\uae5d\u8709\ubded\u8389\u64f2, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u527a\u4ab3\u62da\u8bb0\u5140::\uf9c5\ub1b9\u69d9\u5245\uc7fe\u8cae, p0:CommandContext, loadelement:String(getstatic:String[](\u8389\u0800\uc4d2\u4daf\u4f4a::\u7006\u3bd6\ua562\u67d0\u5d20\u7bad), xor:int(ldc:int(898), ldc:int(899)))), invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u4f52\u873d\u5bc4\u647c\u4c2b::\uff55\u97e6\u8640\uae87\u5f50\u3e2a, p0:CommandContext, loadelement:String(getstatic:String[](\u8389\u0800\uc4d2\u4daf\u4f4a::\u7006\u3bd6\ua562\u67d0\u5d20\u7bad), xor:int(ldc:int(4642), ldc:int(4640)))), initobject:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::<init>), xor:int[expected:boolean](ldc:int(-28543), ldc:int(-28544))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u7873\u5654\uf94d\u76bc\u67e9\u5f50$1(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u8389\u0800\uc4d2\u4daf\u4f4a::\u5fe1\uae5d\u8709\ubded\u8389\u64f2, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u527a\u4ab3\u62da\u8bb0\u5140::\uf9c5\ub1b9\u69d9\u5245\uc7fe\u8cae, p0:CommandContext, loadelement:String(getstatic:String[](\u8389\u0800\uc4d2\u4daf\u4f4a::\u7006\u3bd6\ua562\u67d0\u5d20\u7bad), and:int(ldc:int(19511), ldc:int(449)))), invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u8413\u5140\u64f2\uc9f6\u9937::\u59ec\ubf56\ucef1\ubcb0\ubb2b\u6435, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext))), initobject:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::<init>), xor:int[expected:boolean](ldc:int(384), ldc:int(385))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\uae5d\u5bc4\u6b5f\u3a62\u98a4\u494c$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, xor:int(ldc:int(16386), ldc:int(16384))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2C7 : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_96_0 : byte[] [generated]
        stack_98_0 : byte[] [generated]
        stack_C6_0 : byte[] [generated]
        stack_C8_0 : byte[] [generated]
        stack_ED_0 : byte[] [generated]
        stack_2DA_0 : byte[] [generated]
        stack_33C_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_261 : byte[]
        var_4_262 : int
        expr_98 : int [generated]
        var_5_2B2 : int
        var_3_2B7 : byte[]
        var_4_2B8 : int
        expr_2DD : byte [generated]
        var_0_332 : int
        expr_33C : byte [generated]
        stack_36C_2 : byte [generated]
        expr_C8 : int [generated]
        var_3_F9 : String
        expr_101 : String[] [generated]
        expr_10B : String[] [generated]
        var_3_20A : String[]
        
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
            var_0_2C7 = and:int(ldc:int(505276650), ldc:int(-338071051))
            expr_68 = var_2_6C = stack_96_0 = stack_98_0 = stack_C6_0 = stack_C8_0 = stack_ED_0 = stack_2DA_0 = stack_33C_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("AS8i7GMqvmsuXSEi7vxjYVAvrWBhLO0vIuxjKr5rLl0hIu78Y2FQL61jPqrpUmIgLO0vIuxjKr5rLl0hIu79Iqycoi9jb6QuaOvsIC0hIq5tLyLsYyq+ay5dISLu/6xv0qKiqqqtYu+sL+6uo+Diqy3ub2wtISEi7AuLyA=="))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_261 = newarray:byte[](byte.class, expr_70:int)
                var_4_262 = expr_70:int
                
                loop {
                    var_0_2C7 = and:int(var_0_2C7:int, ldc:int(-1073875514))
                    var_4_262 = add:int(var_4_262:int, ldc:int(-1))
                    storeelement:byte(var_3_261:byte[], var_4_262:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_262:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_262:int, and:int(ldc:int(1313), ldc:int(8333)))), ldc:int(2)), and:int(ldc:int(383), ldc:int(2111)))))
                    
                    if (cmpne:boolean(var_4_262:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_98_0 = stack_96_0 = stack_C6_0 = stack_C8_0 = stack_ED_0 = stack_2DA_0 = stack_33C_0 = var_3_261:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_2C7:int, ldc:int(134217728)), ldc:int(0))) {
                    var_0_2C7 = and:int(var_0_2C7:int, ldc:int(1506701314))
                    goto(Label_0205)
                }
                
                if (cmpeq:boolean(and:int(var_0_2C7:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0157)
                }
                
                var_0_2C7 = and:int(var_0_2C7:int, ldc:int(228190960))
                expr_98 = arraylength:int(stack_98_0:byte[])
                
                if (cmpeq:boolean(expr_98:int, ldc:int(0))) {
                    goto(Label_0157)
                }
                
                var_5_2B2 = expr_98:int
                var_3_2B7 = newarray:byte[](byte.class, expr_98:int)
                var_4_2B8 = expr_98:int
                Label_0698:
                
                while (cmpne:boolean(and:int(var_0_2C7:int, ldc:int(8192)), ldc:int(0))) {
                    var_0_2C7 = and:int(var_0_2C7:int, ldc:int(515896795))
                    var_4_2B8 = add:int(var_4_2B8:int, ldc:int(-1))
                    expr_2DD = xor:byte(loadelement:byte(stack_2DA_0:byte[], var_4_2B8:int), ldc:byte(114))
                    storeelement:byte(var_3_2B7:byte[], var_4_2B8:int, add:int(or:int(and:int(shl:int(expr_2DD:byte, and:int(ldc:int(9220), ldc:int(942))), ldc:int(-16)), and:int(shr:int(expr_2DD:byte[expected:int], and:int(ldc:int(11270), ldc:int(17029))), ldc:int(15))), ldc:int(99)))
                    
                    if (cmpne:boolean(var_4_2B8:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_C6_0 = stack_C8_0 = stack_ED_0 = stack_2DA_0 = stack_33C_0 = var_3_2B7:byte[]
                    goto(Label_0157)
                }
                
                var_0_2C7 = and:int(var_0_2C7:int, ldc:int(-1906865428))
                Label_0805:
                
                while (cmpne:boolean(and:int(var_0_2C7:int, ldc:int(128)), ldc:int(0))) {
                    var_0_332 = and:int(var_0_2C7:int, ldc:int(-2000947501))
                    var_4_2B8 = add:int(var_4_2B8:int, ldc:int(-1))
                    expr_33C = loadelement:byte(stack_33C_0:byte[], var_4_2B8:int)
                    
                    if (cmpge:boolean(add:int(add:int(var_4_2B8:int, ldc:int(3)), neg:int(var_5_2B2:int)), ldc:int(0))) {
                        var_0_332 = and:int(var_0_332:int, ldc:int(1302193345))
                        stack_36C_2 = add:byte(expr_33C:byte, ldc:byte(3))
                    }
                    else {
                        stack_36C_2 = add:byte(expr_33C:byte, loadelement:byte(var_3_2B7:byte[], add:int(var_4_2B8:int, ldc:int(3))))
                    }
                    
                    var_0_2C7 = and:int(var_0_332:int, ldc:int(-1984305175))
                    storeelement:byte(var_3_2B7:byte[], var_4_2B8:int, stack_36C_2:byte)
                    
                    if (cmpne:boolean(var_4_2B8:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_C6_0 = stack_C8_0 = stack_ED_0 = stack_2DA_0 = stack_33C_0 = var_3_2B7:byte[]
                    goto(Label_0205)
                }
                
                goto(Label_0698)
                Label_0157:
                
                if (cmpne:boolean(and:int(var_0_2C7:int, ldc:int(8388608)), ldc:int(0))) {
                    var_0_2C7 = and:int(var_0_2C7:int, ldc:int(-1808335654))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_2C7:int, ldc:int(16384)), ldc:int(0))) {
                        var_0_2C7 = and:int(var_0_2C7:int, ldc:int(-1587915828))
                        loopcontinue()
                    }
                    
                    var_0_2C7 = and:int(var_0_2C7:int, ldc:int(-1705285690))
                    expr_C8 = arraylength:int(stack_C8_0:byte[])
                    
                    if (cmpne:boolean(expr_C8:int, ldc:int(0))) {
                        var_5_2B2 = expr_C8:int
                        var_3_2B7 = newarray:byte[](byte.class, expr_C8:int)
                        var_4_2B8 = expr_C8:int
                        goto(Label_0805)
                    }
                }
                
                Label_0205:
                
                if (cmpeq:boolean(and:int(var_0_2C7:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0157)
                }
                
                if (cmpne:boolean(and:int(var_0_2C7:int, ldc:int(2147483647)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_2C7 = and:int(var_0_2C7:int, ldc:int(764064452))
            }
            
            var_3_F9 = initobject:String(String::<init>, stack_ED_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_101 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32764), ldc:int(-32755)))
            expr_10B = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(9113), ldc:int(17449)))
            storeelement:String(expr_101:String[], and:int(ldc:int(135), ldc:int(5702)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(-19620), ldc:int(19491)), and:int(ldc:int(6295), ldc:int(17782))))
            storeelement:String(expr_101:String[], xor:int(ldc:int(2197), ldc:int(2194)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(17430), ldc:int(534)), and:int(ldc:int(185), ldc:int(8819))))
            storeelement:String(expr_101:String[], xor:int(ldc:int(97), ldc:int(105)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(21049), ldc:int(435)), xor:int(ldc:int(8456), ldc:int(8536))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(279), ldc:int(274)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(524), ldc:int(604)), xor:int(ldc:int(-32748), ldc:int(-32653))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(771), ldc:int(770)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(9332), ldc:int(9235)), and:int(ldc:int(4205), ldc:int(2285))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(17152), ldc:int(17156)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(2157), ldc:int(4205)), and:int(ldc:int(16623), ldc:int(4207))))
            storeelement:String(expr_10B:String[], and:int(ldc:int(8227), ldc:int(5771)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(31087), ldc:int(255)), xor:int(ldc:int(44), ldc:int(94))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(4149), ldc:int(4151)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(-24422), ldc:int(-24344)), xor:int(ldc:int(8341), ldc:int(8416))))
            storeelement:String(expr_10B:String[], and:int(ldc:int(16967), ldc:int(-16968)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(1397), ldc:int(8311)), and:int(ldc:int(1147), ldc:int(4219))))
            putstatic:String[](\u8389\u0800\uc4d2\u4daf\u4f4a::\u7006\u3bd6\ua562\u67d0\u5d20\u7bad, expr_10B:String[])
            var_3_20A = expr_101:String[]
            putstatic:SimpleCommandExceptionType(\u8389\u0800\uc4d2\u4daf\u4f4a::\u3711\ud51e\uc29a\u983f\u93a2\u8cae, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_20A:String[], and:int(ldc:int(4110), ldc:int(16470))))))
            putstatic:SimpleCommandExceptionType(\u8389\u0800\uc4d2\u4daf\u4f4a::\ub113\u8389\u99f7\u6c56\u983f\uceb8, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_20A:String[], and:int(ldc:int(10055), ldc:int(18599))))))
            putstatic:SimpleCommandExceptionType(\u8389\u0800\uc4d2\u4daf\u4f4a::\u983f\uae5d\u7330\u6d69\u52d3\u120d, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_20A:String[], and:int(ldc:int(1226), ldc:int(8968))))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8d90\ua562\u7873\u760c\u494c\uc246(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6B6 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_6C1 : int
        
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
        var_3_6B6 = and:int(ldc:int(-1683873971), ldc:int(-1816732834))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8389\u0800\uc4d2\u4daf\u4f4a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(16384)), ldc:int(0))) {
            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-537879729))
            var_5_81 = and:int(ldc:int(12390), ldc:int(-13415))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(1069), ldc:int(-1072)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_6B6:int, ldc:int(-1141678130))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(17408), ldc:int(17409)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(9), ldc:int(8193)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_6B6 = and:int(var_3_D1:int, ldc:int(-1277263924))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:boolean(0), ldc:boolean(1)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1395106210))
                        goto(Label_1589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1424)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(791870436))
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1561478555))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1490516219))
                        goto(Label_0846)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(330691893))
                        goto(Label_0715)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-326028273))
                        goto(Label_0584)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(1767077601))
                    }
                    else {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-607888387))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0584)
                            }
                            
                            goto(Label_0846)
                        }
                    }
                    
                    Label_0428:
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-405145479))
                        goto(Label_1589)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1424)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-537406718))
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0846)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0715)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(1543737415))
                            loopcontinue()
                        }
                        
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-202801154))
                        var_11_E2 = and:int(ldc:int(19905), ldc:int(-24018))
                        goto(Label_1578)
                    }
                    
                    Label_0584:
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(325256817))
                        goto(Label_1589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-373409092))
                        goto(Label_1424)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(1889889047))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(499164680))
                        goto(Label_0846)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0428)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1430974939))
                            loopcontinue()
                        }
                        
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1077444627))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0846)
                        }
                    }
                    
                    Label_0715:
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1941295231))
                        goto(Label_1589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(1683424856))
                        goto(Label_1424)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-202428478))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1799335460))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0584)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0428)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-137232548))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0846:
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(1423924160))
                        goto(Label_1589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1424)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1682590705))
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1747479))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1854313074))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0715)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1950216533))
                            goto(Label_0584)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-680905309))
                            goto(Label_0428)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1807782316))
                            loopcontinue()
                        }
                        
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1277740044))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(1), ldc:int(2089))
                                goto(Label_1164)
                            }
                        }
                    }
                    
                    Label_0995:
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1589)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1424)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1547358136))
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1991927211))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0846)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0715)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-442815255))
                            goto(Label_0584)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1946641737))
                            goto(Label_0428)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-468892752))
                            loopcontinue()
                        }
                        
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-581762))
                        var_11_E2 = and:int(ldc:int(-12163), ldc:int(11138))
                    }
                    
                    Label_1164:
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1589)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1424)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(46296775))
                            goto(Label_0995)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(1887409702))
                            goto(Label_0846)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(1983206105))
                            goto(Label_0715)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0584)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0428)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(331590655))
                            loopcontinue()
                        }
                        
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1817666620))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1424)
                            }
                        }
                    }
                    
                    Label_1288:
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1589)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_1164)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(1318490851))
                            goto(Label_0995)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1748087107))
                            goto(Label_0846)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(769632977))
                            goto(Label_0715)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0584)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(763065282))
                            goto(Label_0428)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-675381426))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1578)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1424:
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(142175306))
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(1475255024))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0846)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1437290590))
                        goto(Label_0715)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(2105804452))
                        goto(Label_0584)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(969186607))
                        goto(Label_0428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1011741607))
                        loopcontinue()
                    }
                    
                    var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-676930748))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1578:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6C1 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1589:
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(1290630627))
                        goto(Label_1424)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1104187597))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(331214397))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(1642294233))
                        goto(Label_0846)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0715)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1960237539))
                        goto(Label_0584)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0428)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B6:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1820106883))
                        var_17_6C1 = add:int(var_16_110:int, and:int(ldc:int(901), ldc:int(75)))
                        looporswitchbreak()
                    }
                    
                    var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-1056146710))
                }
                
                var_3_6B6 = and:int(var_3_6B6:int, ldc:int(-202556578))
                
                if (cmple:boolean(var_5_81 = var_17_6C1:int, sub:int(var_6_88:int, and:int(ldc:int(3209), ldc:int(4963))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_6B6:int, ldc:int(128)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
