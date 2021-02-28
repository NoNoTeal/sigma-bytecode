public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6c56\u5fe1\ub171\u9255\uae87 {
    public void \u6c56\u5fe1\ub171\u9255\uae87() {
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
            invokespecial:Object(Object::<init>, this:\u6c56\u5fe1\ub171\u9255\uae87)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \uc246\u64f2\u4f52\u8bb0\u7bad\u3dd3(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int \u8d98\u5f50\u6bb9\u0800\ub6ab\u67e9(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p2) {
        var_3_C3 : int
        stack_12F_1 : String [generated]
        expr_11F : Object[] [generated]
        
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
        var_3_C3 = and:int(ldc:int(-634720959), ldc:int(-756624042))
        
        if (cmpne:boolean(p2:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f], p1:\u7d52\u718f\u3776\u6fb0\ub83f)) {
            loop {
                if (cmpne:boolean(and:int(var_3_C3:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0169)
                }
                
                if (cmpeq:boolean(and:int(var_3_C3:int, ldc:int(8388608)), ldc:int(0))) {
                    var_3_C3 = and:int(var_3_C3:int, ldc:int(-487803620))
                    
                    if (cmpne:boolean(invokevirtual:\uf94d\u51b2\u1833\u34df\u1187(\u8bb0\u36d3\u40a9\u836c\u7ce1::\u12b2\ud523\u4ab3\u97e6\ub18d\u9255, getfield:\u8bb0\u36d3\u40a9\u836c\u7ce1(\u51fa\u6c52\u7330\u7330\u960f::\ub8be\u3a62\u718f\u7330\u3711\ud36e, p2:\u51fa\u6c52\u7330\u7330\u960f)), getstatic:\uf94d\u51b2\u1833\u34df\u1187(\uf94d\u51b2\u1833\u34df\u1187::\u71ae\u98a4\ub6ab\ucef1\u0c95\u3776))) {
                        athrow(invokevirtual:CommandSyntaxException(DynamicCommandExceptionType::create, getstatic:DynamicCommandExceptionType(\u6c56\u5fe1\ub171\u9255\uae87::\u4975\u8308\uf995\u760c\u5d20\u965f), invokevirtual:ITextComponent[expected:Object](\ua3b4\u8aa5\ub113\ubf56\u873d::\u8258\u4e72\u40a9\u93a2\u3a62\ud36e, p2:\u51fa\u6c52\u7330\u7330\u960f[expected:\ua3b4\u8aa5\ub113\ubf56\u873d])))
                    }
                }
                
                Label_0133:
                
                if (cmpeq:boolean(and:int(var_3_C3:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_3_C3 = and:int(var_3_C3:int, ldc:int(-363204892))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_C3:int, ldc:int(512)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_C3 = and:int(var_3_C3:int, ldc:int(-684803264))
                    invokevirtual:void(\u51fa\u6c52\u7330\u7330\u960f::\u446c\u99f7\ub70c\ub1b9\u67d0\u516c, p2:\u51fa\u6c52\u7330\u7330\u960f, p1:\u7d52\u718f\u3776\u6fb0\ub83f)
                    
                    if (cmpne:boolean(p1:\u7d52\u718f\u3776\u6fb0\ub83f, aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f())) {
                        stack_12F_1 = loadelement:String(getstatic:String[](\u6c56\u5fe1\ub171\u9255\uae87::\u67e9\uc2bd\u416d\ub19c\u4975\u600f), xor:int(ldc:int(18434), ldc:int(18433)))
                        expr_11F = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(-31224), ldc:int(-31223)))
                        storeelement:Object(expr_11F:Object[], and:int(ldc:int(4627), ldc:int(-12820)), invokevirtual:ITextComponent[expected:Object](\u7d52\u718f\u3776\u6fb0\ub83f::\u8258\u4e72\u40a9\u93a2\u3a62\ud36e, p1:\u7d52\u718f\u3776\u6fb0\ub83f))
                        invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_12F_1:String, expr_11F:Object[]), and:int[expected:boolean](ldc:int(-8034), ldc:int(7969)))
                        looporswitchbreak()
                    }
                }
                
                Label_0169:
                
                if (cmpne:boolean(and:int(var_3_C3:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_0133)
                }
                
                if (cmpeq:boolean(and:int(var_3_C3:int, ldc:int(536870912)), ldc:int(0))) {
                    var_3_C3 = and:int(var_3_C3:int, ldc:int(-156983118))
                    invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u6c56\u5fe1\ub171\u9255\uae87::\u67e9\uc2bd\u416d\ub19c\u4975\u600f), xor:int(ldc:int(8738), ldc:int(8742)))), and:int[expected:boolean](ldc:int(29287), ldc:int(-32360)))
                    looporswitchbreak()
                }
                
                var_3_C3 = and:int(var_3_C3:int, ldc:int(-227106367))
            }
            
            return:int(xor:int(ldc:int(-32127), ldc:int(-32128)))
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u6c56\u5fe1\ub171\u9255\uae87::\u56bd\u6ec6\u47c2\u8640\u183a\u8640)))
    }
    
    private static int lambda$\u5d20\u3776\u3dd3\ud4fe\u927d\u9937$4(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u6c56\u5fe1\ub171\u9255\uae87::\u8d98\u5f50\u6bb9\u0800\ub6ab\u67e9, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u7d52\u718f\u3776\u6fb0\ub83f(\u600f\u9937\ub8be\ud171\u624e::\u446c\u4f52\ub8be\u6d99\u5654\u8cae, p0:CommandContext, loadelement:String(getstatic:String[](\u6c56\u5fe1\ub171\u9255\uae87::\u67e9\uc2bd\u416d\ub19c\u4975\u600f), and:int(ldc:int(4613), ldc:int(10257)))), invokestatic:\u51fa\u6c52\u7330\u7330\u960f(\u600f\u9937\ub8be\ud171\u624e::\u624e\u71f1\u0c95\u120d\u0800\u4cd9, p0:CommandContext, loadelement:String(getstatic:String[](\u6c56\u5fe1\ub171\u9255\uae87::\u67e9\uc2bd\u416d\ub19c\u4975\u600f), xor:int(ldc:int(6), ldc:int(4))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ubded\u392e\u0c95\ubded\ud7e8\u6cfe$3(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u6c56\u5fe1\ub171\u9255\uae87::\u8d98\u5f50\u6bb9\u0800\ub6ab\u67e9, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u7d52\u718f\u3776\u6fb0\ub83f(\u600f\u9937\ub8be\ud171\u624e::\u446c\u4f52\ub8be\u6d99\u5654\u8cae, p0:CommandContext, loadelement:String(getstatic:String[](\u6c56\u5fe1\ub171\u9255\uae87::\u67e9\uc2bd\u416d\ub19c\u4975\u600f), and:int(ldc:int(12293), ldc:int(177)))), invokevirtual:\u51fa\u6c52\u7330\u7330\u960f(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u7006\u5fe1\u965f\u51b2\ub83f, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u64ab\uc229\u62da\u56bd\uc84e\u9033$2(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u6c56\u5fe1\ub171\u9255\uae87::\u8d98\u5f50\u6bb9\u0800\ub6ab\u67e9, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f()), invokevirtual:\u51fa\u6c52\u7330\u7330\u960f(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u7006\u5fe1\u965f\u51b2\ub83f, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u8308\u5f50\u156b\u6bb9\u64ab\u446c$1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, and:int(ldc:int(550), ldc:int(8258))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\uf94d\u392e\uc4d2\uc7fe\u385b\u873d$0(java.lang.Object p0) {
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
            stack_83_1 = loadelement:String(getstatic:String[](\u6c56\u5fe1\ub171\u9255\uae87::\u67e9\uc2bd\u416d\ub19c\u4975\u600f), and:int(ldc:int(2061), ldc:int(17989)))
            expr_76 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(25603), ldc:int(65)))
            storeelement:Object(expr_76:Object[], and:int(ldc:int(28841), ldc:int(-30890)), p0:Object)
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
    
    public void \u88c5\u873d\ub7dc\u8d90\u494c\u71ae(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_683 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_68E : int
        
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
        var_3_683 = and:int(ldc:int(-662329631), ldc:int(-5511761))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6c56\u5fe1\ub171\u9255\uae87[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(65536)), ldc:int(0))) {
            var_3_683 = and:int(var_3_683:int, ldc:int(93636391))
        }
        else {
            var_3_683 = and:int(var_3_683:int, ldc:int(1991095487))
            var_5_8A = and:int(ldc:int(-26795), ldc:int(26794))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-19573), ldc:int(19540)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_683:int, ldc:int(411430081))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, xor:int(ldc:int(1088), ldc:int(1089)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(16897), ldc:int(8593)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_683 = and:int(var_3_DA:int, ldc:int(1523562169))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(1025), ldc:int(801)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(858145577))
                        goto(Label_1556)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-2044251292))
                        goto(Label_1393)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(233797134))
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1124)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0973)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0832)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1622827002))
                        goto(Label_0710)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0585)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1511264367))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0585)
                            }
                            
                            goto(Label_0832)
                        }
                    }
                    
                    Label_0410:
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(256)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(545164521))
                        goto(Label_1556)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(530849996))
                        goto(Label_1393)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(8)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(74635611))
                        goto(Label_1258)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1124)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(8)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1704589633))
                        goto(Label_0973)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(8)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-305741885))
                        goto(Label_0832)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0710)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(1186838223))
                            var_11_EB = and:int(ldc:int(-7925), ldc:int(7908))
                            goto(Label_1545)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0585:
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1874408283))
                        goto(Label_1556)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1393)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-74416577))
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1124)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0973)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-863223612))
                        goto(Label_0832)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-1835790786))
                            loopcontinue()
                        }
                        
                        var_3_683 = and:int(var_3_683:int, ldc:int(983690389))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0832)
                        }
                    }
                    
                    Label_0710:
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1556)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1393)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(128)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1880946530))
                        goto(Label_1124)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-553998533))
                        goto(Label_0973)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-263488137))
                            goto(Label_0585)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1210188147))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0832:
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1556)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(128)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1663755256))
                        goto(Label_1393)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(2097711693))
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-130594800))
                        goto(Label_1124)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(2029466950))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0710)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(1204460813))
                            goto(Label_0585)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-1223318554))
                            loopcontinue()
                        }
                        
                        var_3_683 = and:int(var_3_683:int, ldc:int(299498727))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(3109), ldc:int(24833))
                                goto(Label_1124)
                            }
                        }
                    }
                    
                    Label_0973:
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1556)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1393)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-1300432661))
                            goto(Label_0832)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(128)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(273572614))
                            goto(Label_0710)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0585)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-1658782751))
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_683 = and:int(var_3_683:int, ldc:int(687073007))
                        var_11_EB = and:int(ldc:int(12423), ldc:int(-12488))
                    }
                    
                    Label_1124:
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1556)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1666462858))
                        goto(Label_1393)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(982845875))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0973)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(217669043))
                            goto(Label_0832)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-942882155))
                            goto(Label_0710)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-1528794897))
                            goto(Label_0585)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_683 = and:int(var_3_683:int, ldc:int(1888609511))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1393)
                            }
                        }
                    }
                    
                    Label_1258:
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1556)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(821549577))
                            goto(Label_1124)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(1060218202))
                            goto(Label_0973)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0832)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0710)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(1033684569))
                            goto(Label_0585)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(1914071643))
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-459821885))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                            goto(Label_1545)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1393:
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1556)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1434732839))
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1867896561))
                        goto(Label_1124)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(63456862))
                        goto(Label_0973)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0832)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(661404786))
                        goto(Label_0710)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0585)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1608325841))
                        goto(Label_0410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(537783922))
                        loopcontinue()
                    }
                    
                    var_3_683 = and:int(var_3_683:int, ldc:int(-335808539))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1545:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_68E = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1556:
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(256)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-2133863976))
                        goto(Label_1393)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1258)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1719447855))
                        goto(Label_1124)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0973)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(256)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1314695182))
                        goto(Label_0832)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0710)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1648922991))
                        goto(Label_0585)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1504028631))
                        var_17_68E = add:int(var_16_119:int, and:int(ldc:int(261), ldc:int(1027)))
                        looporswitchbreak()
                    }
                }
                
                var_3_683 = and:int(var_3_683:int, ldc:int(-757744507))
                
                if (cmple:boolean(var_5_8A = var_17_68E:int, sub:int(var_6_91:int, and:int(ldc:int(835), ldc:int(15489))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2048)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
