public class \u927d\u92ff\u71ae\uafe7\u6bb9.\ud217\ubded\uafe7\u7c6b\u9033 {
    public void \ud217\ubded\uafe7\u7c6b\u9033() {
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
            invokespecial:Object(Object::<init>, this:\ud217\ubded\uafe7\u7c6b\u9033)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u183a\u12cb\u4d85\u4daf\u759a\u9a18(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    public static int \ud158\u5bc4\u97e6\u8753\u7bad\u7c6b(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u6435\ub8be\u718f\u6b0d\u67e9.\u8753\u0800\u4f4a\u4975\u64ab\u4c04 p1) {
        var_4_64 : \u88c5\ud171\ub113\u6435\ud51e
        stack_AD_1 : String [generated]
        expr_9D : Object[] [generated]
        
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
        var_4_64 = invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937)
        
        if (cmpne:boolean(invokeinterface:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\u3bc9\u6435\u47c2\uf9c5\u3a62\u6198, invokevirtual:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4, var_4_64:\u88c5\ud171\ub113\u6435\ud51e)), p1:\u8753\u0800\u4f4a\u4975\u64ab\u4c04)) {
            invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\u6d69\ub19c\u6b0d\u3c25\u4e72\u839e, var_4_64:\u88c5\ud171\ub113\u6435\ud51e, p1:\u8753\u0800\u4f4a\u4975\u64ab\u4c04, xor:int[expected:boolean](ldc:int(12291), ldc:int(12290)))
            stack_AD_1 = loadelement:String(getstatic:String[](\ud217\ubded\uafe7\u7c6b\u9033::\u9af2\uc9f6\u8709\ud523\u0b8e\u8350), xor:int(ldc:int(21056), ldc:int(21057)))
            expr_9D = newarray:Object[](java.lang.Object.class, and:int(ldc:int(527), ldc:int(8481)))
            storeelement:Object(expr_9D:Object[], and:int(ldc:int(-29540), ldc:int(24931)), invokevirtual:ITextComponent[expected:Object](\u8753\u0800\u4f4a\u4975\u64ab\u4c04::\u93a2\uc229\u6c56\u12b2\u8389\ub83f, p1:\u8753\u0800\u4f4a\u4975\u64ab\u4c04))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_AD_1:String, expr_9D:Object[]), and:int[expected:boolean](ldc:int(4741), ldc:int(107)))
            return:int(and:int(ldc:int(23622), ldc:int(-23752)))
        }
        
        athrow(invokevirtual:CommandSyntaxException(DynamicCommandExceptionType::create, getstatic:DynamicCommandExceptionType(\ud217\ubded\uafe7\u7c6b\u9033::\uceb8\u40a9\u0b8e\u4daf\ub32d\ufe34), invokevirtual:String[expected:Object](\u8753\u0800\u4f4a\u4975\u64ab\u4c04::\u6c52\u8df4\u6b0d\u8cae\u624e\u16f6, p1:\u8753\u0800\u4f4a\u4975\u64ab\u4c04)))
    }
    
    private static int lambda$\ua6bd\u527a\u8aa5\u7c6b\u983f\u0800$3(com.mojang.brigadier.context.CommandContext p0) {
        var_3_6D : \u8753\u0800\u4f4a\u4975\u64ab\u4c04
        stack_A5_0 : \u8413\u5140\u64f2\uc9f6\u9937 [generated]
        stack_9B_1 : String [generated]
        expr_8B : Object[] [generated]
        
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
            var_3_6D = invokevirtual:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u3dd3\u4daf\ub32d\ubcb0\u7d52\u718f, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd](\u8413\u5140\u64f2\uc9f6\u9937::\ube23\u7043\ubded\u759a\u74b1\u5f50, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext))))
            stack_A5_0 = checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext))
            stack_9B_1 = loadelement:String(getstatic:String[](\ud217\ubded\uafe7\u7c6b\u9033::\u9af2\uc9f6\u8709\ud523\u0b8e\u8350), xor:int(ldc:int(-28160), ldc:int(-28158)))
            expr_8B = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(17504), ldc:int(17505)))
            storeelement:Object(expr_8B:Object[], and:int(ldc:int(-3840), ldc:int(1754)), invokevirtual:ITextComponent[expected:Object](\u8753\u0800\u4f4a\u4975\u64ab\u4c04::\u93a2\uc229\u6c56\u12b2\u8389\ub83f, var_3_6D:\u8753\u0800\u4f4a\u4975\u64ab\u4c04))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, stack_A5_0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_9B_1:String, expr_8B:Object[]), and:int[expected:boolean](ldc:int(21796), ldc:int(-21797)))
            return:int(invokevirtual:int(\u8753\u0800\u4f4a\u4975\u64ab\u4c04::\u8d90\ud36e\ub70c\u946b\u7e3f\uc2e8, var_3_6D:\u8753\u0800\u4f4a\u4975\u64ab\u4c04))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u4f52\u74b1\ubded\ucfaf\uc2e8\ub7dc$2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, and:int(ldc:int(1414), ldc:int(12411))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u3504\u983f\ud7e8\ud4fe\u7330\u74b1$1(\u6435\ub8be\u718f\u6b0d\u67e9.\u8753\u0800\u4f4a\u4975\u64ab\u4c04 p0, com.mojang.brigadier.context.CommandContext p1) {
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
            return:int(invokestatic:int(\ud217\ubded\uafe7\u7c6b\u9033::\ud158\u5bc4\u97e6\u8753\u7bad\u7c6b, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p1:CommandContext)), p0:\u8753\u0800\u4f4a\u4975\u64ab\u4c04))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\u3dd3\ucfaf\u4f52\uae87\u7bad\u47c2$0(java.lang.Object p0) {
        stack_83_1 : String [generated]
        expr_76 : Object[] [generated]
        
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
            stack_83_1 = loadelement:String(getstatic:String[](\ud217\ubded\uafe7\u7c6b\u9033::\u9af2\uc9f6\u8709\ud523\u0b8e\u8350), and:int(ldc:int(10659), ldc:int(4163)))
            expr_76 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(18945), ldc:int(1041)))
            storeelement:Object(expr_76:Object[], and:int(ldc:int(-20624), ldc:int(20623)), p0:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_83_1:String, expr_76:Object[]))
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
    
    public void \u6b0d\u6435\u64ab\u416d\uc2e8\u8c8a(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_680 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BD : double
        var_3_CF : int
        var_11_E0 : int
        var_14_10A : double
        var_16_10E : int
        var_12_106 : double
        var_17_68B : int
        
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
        var_3_680 = and:int(ldc:int(62996894), ldc:int(1901960404))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ud217\ubded\uafe7\u7c6b\u9033[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_680 = and:int(var_3_680:int, ldc:int(568917750))
            var_5_80 = and:int(ldc:int(-28071), ldc:int(11680))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-11312), ldc:int(11271)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BD = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CF = and:int(var_3_680:int, ldc:int(972398292))
                    var_9_BD = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E0 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E0:int, sub:int(var_6_87:int, xor:int(ldc:int(132), ldc:int(133)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E0:int, xor:int(ldc:int(-32752), ldc:int(-32751)))), var_7_96:double))) {
                        inc:int(var_11_E0, ldc:int(1))
                    }
                    
                    var_3_680 = and:int(var_3_CF:int, ldc:int(-1318296739))
                    var_14_10A = var_7_96:double
                    var_16_10E = var_11_E0:int
                }
                else {
                    var_11_E0 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(769), ldc:int(19561)))
                    var_12_106 = var_14_10A = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10E = var_11_E0:int, var_6_87:int)) {
                        var_9_BD = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E0:int)
                        var_16_10E = var_11_E0:int
                        var_14_10A = var_12_106:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(1941670875))
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-494613637))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1255)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1124)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0689)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(743159555))
                        goto(Label_0559)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-1501643638))
                    }
                    else {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-1858861642))
                        
                        if (cmplt:boolean(var_16_10E:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0559)
                            }
                            
                            goto(Label_0827)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(694783891))
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1255)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1124)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(16)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-948189506))
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-631615094))
                        goto(Label_0689)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(16)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(899074778))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_680 = and:int(var_3_680:int, ldc:int(825821502))
                            var_11_E0 = and:int(ldc:int(-29930), ldc:int(13545))
                            goto(Label_1524)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0559:
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(498119733))
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(1897927079))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(16)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(455297709))
                        goto(Label_1255)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1124)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-16884685))
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(897914938))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_680 = and:int(var_3_680:int, ldc:int(1866383189))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10A = var_9_BD:double
                            goto(Label_0827)
                        }
                    }
                    
                    Label_0689:
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(4)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(835766270))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1255)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(431796443))
                        goto(Label_1124)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(16)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(1670984585))
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_680 = and:int(var_3_680:int, ldc:int(-593114081))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_680 = and:int(var_3_680:int, ldc:int(-1401581520))
                            loopcontinue()
                        }
                        
                        var_3_680 = and:int(var_3_680:int, ldc:int(-171781516))
                        var_14_10A = mul:double(ldc:double(0.5), add:double(var_9_BD:double, var_14_10A:double))
                    }
                    
                    Label_0827:
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-352629726))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1255)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(203722089))
                        goto(Label_1124)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(110705856))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0689)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(4)), ldc:int(0))) {
                            var_3_680 = and:int(var_3_680:int, ldc:int(-2103373338))
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_680 = and:int(var_3_680:int, ldc:int(-1614989833))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E0 = xor:int(ldc:int(7232), ldc:int(7233))
                                goto(Label_1124)
                            }
                        }
                    }
                    
                    Label_0950:
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(1504595376))
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(1483314971))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(497662388))
                        goto(Label_1255)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-1212438982))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0827)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(16)), ldc:int(0))) {
                            var_3_680 = and:int(var_3_680:int, ldc:int(1033543933))
                            goto(Label_0689)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_680 = and:int(var_3_680:int, ldc:int(-1950442196))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_680 = and:int(var_3_680:int, ldc:int(-1387917249))
                        var_11_E0 = and:int(ldc:int(-16551), ldc:int(16550))
                    }
                    
                    Label_1124:
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-576701086))
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(16)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-1223954107))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0950)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_680 = and:int(var_3_680:int, ldc:int(2063573330))
                            goto(Label_0827)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(512)), ldc:int(0))) {
                            var_3_680 = and:int(var_3_680:int, ldc:int(1821931969))
                            goto(Label_0689)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_680 = and:int(var_3_680:int, ldc:int(493243651))
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_680 = and:int(var_3_680:int, ldc:int(1267029183))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                                goto(Label_1380)
                            }
                        }
                    }
                    
                    Label_1255:
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(1884046333))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_1124)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0950)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_680 = and:int(var_3_680:int, ldc:int(-396490056))
                            goto(Label_0827)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0689)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_680 = and:int(var_3_680:int, ldc:int(858419214))
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_680:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_680 = and:int(var_3_680:int, ldc:int(1533019348))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10A:double, var_5_80:int, var_16_10E:int)
                            goto(Label_1524)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1380:
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-1948522067))
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1255)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1124)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(1163395783))
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-664689382))
                        goto(Label_0827)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0689)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0559)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(1366267749))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-1950981288))
                        loopcontinue()
                    }
                    
                    var_3_680 = and:int(var_3_680:int, ldc:int(291794453))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10A:double, ldc:double(0.0))
                    Label_1524:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_68B = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1535:
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(534103900))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1255)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-877074632))
                        goto(Label_1124)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(4)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-1578697532))
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(512)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(-572532227))
                        goto(Label_0689)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_680:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(1986020375))
                        goto(Label_0559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_680 = and:int(var_3_680:int, ldc:int(592164669))
                        var_17_68B = add:int(var_16_10E:int, and:int(ldc:int(8201), ldc:int(4147)))
                        looporswitchbreak()
                    }
                    
                    var_3_680 = and:int(var_3_680:int, ldc:int(1380536301))
                }
                
                var_3_680 = and:int(var_3_680:int, ldc:int(-1491693898))
                
                if (cmple:boolean(var_5_80 = var_17_68B:int, sub:int(var_6_87:int, and:int(ldc:int(16645), ldc:int(9363))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpeq:boolean(and:int(var_3_680:int, ldc:int(2097152)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
