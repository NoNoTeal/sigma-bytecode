public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u392e\ub70c\ud523\u7049\u5bc4 {
    public void \u392e\ub70c\ud523\u7049\u5bc4() {
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
            invokespecial:Object(Object::<init>, this:\u392e\ub70c\ud523\u7049\u5bc4)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \ub32d\u2dcc\uae5d\uc910\uf995\u51fa(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int \ubefe\u3c25\u965f\uf995\ub8be\uc84e(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, int p1) {
        stack_B4_1 : String [generated]
        expr_A4 : Object[] [generated]
        
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
        
        if (invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u3711\u0c95\u718f\u9033\u4cd9\u8308, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937))) {
            athrow(invokevirtual:CommandSyntaxException(DynamicCommandExceptionType::create, getstatic:DynamicCommandExceptionType(\u392e\ub70c\ud523\u7049\u5bc4::\u64ab\u6198\u97e6\u4c04\ubb2b\u5245), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u88c5\ud171\ub113\u6435\ud51e::\u1187\u5245\ub6ab\u9a18\u12cb\ua6bd, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937)))))
        }
        
        if (invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\ucb79\ua3b4\u4ab3\u62da\uc87f\ua562, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937), invokevirtual:\uf94d\u51b2\u1833\u34df\u1187(\u88c5\ud171\ub113\u6435\ud51e::\u3dd3\u5140\u839e\u3c25\u600f\uf995, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937)), and:int[expected:boolean](ldc:int(-19654), ldc:int(19653)), p1:int)) {
            stack_B4_1 = loadelement:String(getstatic:String[](\u392e\ub70c\ud523\u7049\u5bc4::\u7006\u67e9\u3776\u6fb0\u71f1\uc2bd), xor:int(ldc:int(1552), ldc:int(1554)))
            expr_A4 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(8225), ldc:int(16415)))
            storeelement:Object(expr_A4:Object[], and:int(ldc:int(-16483), ldc:int(16482)), invokestatic:Integer[expected:Object](Integer::valueOf, p1:int))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_B4_1:String, expr_A4:Object[]), and:int[expected:boolean](ldc:int(9), ldc:int(19047)))
            return:int(p1:int)
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u392e\ub70c\ud523\u7049\u5bc4::\u62da\ub171\ub70c\u4179\u8bb0\uc29a)))
    }
    
    private static int lambda$\ubded\u4daf\u12cb\u16f6\u4c04\u4bc8$3(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u392e\ub70c\ud523\u7049\u5bc4::\ubefe\u3c25\u965f\uf995\ub8be\uc84e, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:int(IntegerArgumentType::getInteger, p0:CommandContext, loadelement:String(getstatic:String[](\u392e\ub70c\ud523\u7049\u5bc4::\u7006\u67e9\u3776\u6fb0\u71f1\uc2bd), xor:int(ldc:int(16386), ldc:int(16387))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u6b0d\u6cfe\u36d3\u183a\u836c\u9255$2(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u392e\ub70c\ud523\u7049\u5bc4::\ubefe\u3c25\u965f\uf995\ub8be\uc84e, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:int(\u647c\u8753\ub171\u6cfe\ua562\u3d4b::\uc910\u5245\ud171\u69d9\u9255\u6b5f)))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u6c56\u3e75\u61a4\uc229\uc84e\u71ae$1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, and:int(ldc:int(1141), ldc:int(24582))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\u183a\u527a\u3bd6\u392e\u67e9\ub102$0(java.lang.Object p0) {
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
            stack_83_1 = loadelement:String(getstatic:String[](\u392e\ub70c\ud523\u7049\u5bc4::\u7006\u67e9\u3776\u6fb0\u71f1\uc2bd), xor:int(ldc:int(9235), ldc:int(9232)))
            expr_76 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(-15359), ldc:int(-15360)))
            storeelement:Object(expr_76:Object[], and:int(ldc:int(-27022), ldc:int(10637)), p0:Object)
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
    
    public void \u494c\u4f52\ub1b9\u8640\ufe34\u8258(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6BE : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6C9 : int
        
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
        var_3_6BE = and:int(ldc:int(-963146722), ldc:int(-1366823268))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u392e\ub70c\ud523\u7049\u5bc4[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(4096)), ldc:int(0))) {
            var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1900548435))
            var_5_81 = and:int(ldc:int(6278), ldc:int(-6279))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-2120), ldc:int(2119)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6BE:int, ldc:int(-1357951650))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(160), ldc:int(161)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(16403), ldc:int(16402)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6BE = and:int(var_3_DA:int, ldc:int(-160052115))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(1), ldc:int(2945)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1597)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-354457704))
                        goto(Label_1440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(248064551))
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-379087897))
                        goto(Label_1006)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(159576452))
                        goto(Label_0846)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0697)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0576)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-150081955))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0576)
                            }
                            
                            goto(Label_0846)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(1499604429))
                        goto(Label_1597)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(209327634))
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(428534216))
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1006)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0846)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(305265851))
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1628971236))
                            var_11_EB = and:int(ldc:int(-17157), ldc:int(17156))
                            goto(Label_1586)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0576:
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1053952829))
                        goto(Label_1597)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-499154858))
                        goto(Label_1440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1895772517))
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1006)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-554541653))
                        goto(Label_0846)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1637503924))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0846)
                        }
                    }
                    
                    Label_0697:
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1722753370))
                        goto(Label_1597)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(2072948159))
                        goto(Label_1440)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(882332721))
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1006)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(1812515850))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1734908344))
                            goto(Label_0576)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(2066599830))
                            loopcontinue()
                        }
                        
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1371697826))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0846:
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1681298070))
                        goto(Label_1597)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1132465018))
                        goto(Label_1440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1730864529))
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1007000664))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(1399768684))
                            goto(Label_0697)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(-379835238))
                            goto(Label_0576)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1236965893))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(1175727236))
                            loopcontinue()
                        }
                        
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1098383971))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(141), ldc:int(140))
                                goto(Label_1173)
                            }
                        }
                    }
                    
                    Label_1006:
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1597)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1126619144))
                        goto(Label_1440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1309605786))
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0846)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(775212527))
                            goto(Label_0697)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0576)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(-308569022))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(1153788626))
                            loopcontinue()
                        }
                        
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1374823073))
                        var_11_EB = and:int(ldc:int(19524), ldc:int(-19525))
                    }
                    
                    Label_1173:
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1768645769))
                        goto(Label_1597)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1440)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(-798927473))
                            goto(Label_1006)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0846)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(1869632419))
                            goto(Label_0697)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0576)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-967500275))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1440)
                            }
                        }
                    }
                    
                    Label_1288:
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1890426071))
                        goto(Label_1597)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(541236957))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(-426261727))
                            goto(Label_1173)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1006)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(-875612888))
                            goto(Label_0846)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(1360115337))
                            goto(Label_0697)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0576)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6BE = and:int(var_3_6BE:int, ldc:int(533404206))
                            loopcontinue()
                        }
                        
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1748668419))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1586)
                    }
                    
                    Label_1440:
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(1664976131))
                        goto(Label_1597)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-418296273))
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-2019626431))
                        goto(Label_1006)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0846)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-866199226))
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(916326479))
                        goto(Label_0576)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(64)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6BE = and:int(var_3_6BE:int, ldc:int(-282608500))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1586:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6C9 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1597:
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1868011825))
                        goto(Label_1440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(970618794))
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1543552100))
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1006)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(1135652774))
                        goto(Label_0846)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0697)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1058881275))
                        goto(Label_0576)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BE:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6BE = and:int(var_3_6BE:int, ldc:int(-538497299))
                        var_17_6C9 = add:int(var_16_119:int, xor:int(ldc:int(2055), ldc:int(2054)))
                        looporswitchbreak()
                    }
                    
                    var_3_6BE = and:int(var_3_6BE:int, ldc:int(476259982))
                }
                
                var_3_6BE = and:int(var_3_6BE:int, ldc:int(-1359008369))
                
                if (cmple:boolean(var_5_81 = var_17_6C9:int, sub:int(var_6_88:int, and:int(ldc:int(1841), ldc:int(195))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_6BE:int, ldc:int(16384)), ldc:int(0))) {
            var_3_6BE = and:int(var_3_6BE:int, ldc:int(507217026))
            goto(Label_0108)
        }
    }
}
