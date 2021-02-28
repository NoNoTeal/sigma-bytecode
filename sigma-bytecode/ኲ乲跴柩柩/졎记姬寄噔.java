public class \u12b2\u4e72\u8df4\u67e9\u67e9.\uc84e\u8bb0\u59ec\u5bc4\u5654 {
    public void \uc84e\u8bb0\u59ec\u5bc4\u5654() {
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
            invokespecial:Object(Object::<init>, this:\uc84e\u8bb0\u59ec\u5bc4\u5654)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \ua3b4\ufcaf\u8350\uc84e\ub8be\u7d52(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int \u927d\u4d85\u6d99\u6ec6\u983f\u92ff(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.util.Collection<com.mojang.authlib.GameProfile> p1) {
        var_2_8C : int
        var_4_67 : \ucb79\u8350\u7bad\u392e\u51fa
        var_5_70 : int
        var_6_78 : Iterator<GameProfile>
        var_7_EB : GameProfile
        stack_141_1 : String [generated]
        expr_124 : Object[] [generated]
        
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
        var_2_8C = and:int(ldc:int(2139083040), ldc:int(-16968617))
        var_4_67 = invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937))
        var_5_70 = and:int(ldc:int(5556), ldc:int(-5557))
        var_6_78 = invokeinterface:Iterator<GameProfile>(Collection<GameProfile>::iterator, p1:Collection<GameProfile>)
        
        loop {
            if (cmpeq:boolean(and:int(var_2_8C:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0191)
            }
            
            if (cmpne:boolean(and:int(var_2_8C:int, ldc:int(16)), ldc:int(0))) {
                var_2_8C = and:int(var_2_8C:int, ldc:int(1258394905))
            }
            else {
                var_2_8C = and:int(var_2_8C:int, ldc:int(-272671571))
                
                if (invokeinterface:boolean(Iterator::hasNext, var_6_78:Iterator)) {
                    var_7_EB = checkcast:GameProfile(com.mojang.authlib.GameProfile.class, invokeinterface:GameProfile(Iterator<GameProfile>::next, var_6_78:Iterator<GameProfile>))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\ucb79\u8350\u7bad\u392e\u51fa::\ub7dc\u624e\u183a\uc9f6\u8350\uae87, var_4_67:\ucb79\u8350\u7bad\u392e\u51fa, var_7_EB:GameProfile))) {
                        invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\uc4d2\u92ee\u8350\ub32d\ud12e\ud12e, var_4_67:\ucb79\u8350\u7bad\u392e\u51fa, var_7_EB:GameProfile)
                        inc:int(var_5_70, ldc:int(1))
                        stack_141_1 = loadelement:String(getstatic:String[](\uc84e\u8bb0\u59ec\u5bc4\u5654::\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded), and:int(ldc:int(1346), ldc:int(4762)))
                        expr_124 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(4420), ldc:int(4421)))
                        storeelement:Object(expr_124:Object[], and:int(ldc:int(8560), ldc:int(-8571)), invokevirtual:String[expected:Object](GameProfile::getName, checkcast:GameProfile(com.mojang.authlib.GameProfile.class, invokeinterface:GameProfile(Iterator<GameProfile>::next, invokeinterface:Iterator<GameProfile>(Collection<GameProfile>::iterator, p1:Collection<GameProfile>)))))
                        invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_141_1:String, expr_124:Object[]), and:int[expected:boolean](ldc:int(16897), ldc:int(3185)))
                    }
                    
                    var_2_8C = and:int(var_2_8C:int, ldc:int(-281059977))
                    loopcontinue()
                }
            }
            
            Label_0159:
            
            if (cmpne:boolean(and:int(var_2_8C:int, ldc:int(1073741824)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_2_8C:int, ldc:int(2097152)), ldc:int(0))) {
                    var_2_8C = and:int(var_2_8C:int, ldc:int(-1111165948))
                    loopcontinue()
                }
                
                var_2_8C = and:int(var_2_8C:int, ldc:int(2138797723))
                
                if (cmpeq:boolean(var_5_70:int, ldc:int(0))) {
                    athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\uc84e\u8bb0\u59ec\u5bc4\u5654::\u6b5f\u61a4\u6c56\u88c5\u9255\u6b5f)))
                }
            }
            
            Label_0191:
            
            if (cmpeq:boolean(and:int(var_2_8C:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0159)
            }
            
            if (cmpeq:boolean(and:int(var_2_8C:int, ldc:int(512)), ldc:int(0))) {
                return:int(var_5_70:int)
            }
            
            var_2_8C = and:int(var_2_8C:int, ldc:int(-1544811330))
        }
    }
    
    private static int lambda$\u59ec\u9a18\u873d\u6c56\u6435\u59ec$4(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\uc84e\u8bb0\u59ec\u5bc4\u5654::\u927d\u4d85\u6d99\u6ec6\u983f\u92ff, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:Collection<GameProfile>(\ubf56\u7e3f\ua61f\u8753\u5f50::\ucfaf\u7006\u67e9\u51b2\uc29a\u92ff, p0:CommandContext, loadelement:String(getstatic:String[](\uc84e\u8bb0\u59ec\u5bc4\u5654::\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded), xor:int(ldc:int(-31996), ldc:int(-31995))))))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.concurrent.CompletableFuture lambda$\ud171\u4e72\ub8be\u0c95\ub1b9\u965f$3(com.mojang.brigadier.context.CommandContext p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1) {
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
    
    private static java.lang.String lambda$\u516c\u6d99\u8c8a\u3bc9\u4f4a\u183a$2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p0) {
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
            return:String(invokevirtual:String(GameProfile::getName, invokevirtual:GameProfile(\ua3b4\u8aa5\ub113\ubf56\u873d::\ud158\u385b\u3dd3\u4e72\ud171\ub102, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\ua3b4\u8aa5\ub113\ubf56\u873d])))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u7e3f\u446c\u8640\u392e\ube23\ub70c$1(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ucb79\u8350\u7bad\u392e\u51fa p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p1) {
        var_2_61 : int
        stack_8E_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(-626467635), ldc:int(-1163079955))
            
            if (invokevirtual:boolean(\ucb79\u8350\u7bad\u392e\u51fa::\ub7dc\u624e\u183a\uc9f6\u8350\uae87, p0:\ucb79\u8350\u7bad\u392e\u51fa, invokevirtual:GameProfile(\ua3b4\u8aa5\ub113\ubf56\u873d::\ud158\u385b\u3dd3\u4e72\ud171\ub102, p1:\u51fa\u6c52\u7330\u7330\u960f[expected:\ua3b4\u8aa5\ub113\ubf56\u873d]))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1073883705))
                stack_8E_0 = and:int(ldc:int(10315), ldc:int(-10860))
            }
            else {
                stack_8E_0 = xor:int(ldc:int(5160), ldc:int(5161))
            }
            
            return:boolean(stack_8E_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u9937\u8c8a\u4c2b\u3d4b\u416d\u8709$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, xor:int(ldc:int(576), ldc:int(579))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_259 : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_96_0 : byte[] [generated]
        stack_98_0 : byte[] [generated]
        stack_BE_0 : byte[] [generated]
        stack_C0_0 : byte[] [generated]
        stack_DC_0 : byte[] [generated]
        stack_201_0 : byte[] [generated]
        stack_26C_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_191 : byte[]
        var_4_192 : int
        expr_98 : int [generated]
        var_5_1E2 : int
        var_3_1E7 : byte[]
        var_4_1E8 : int
        expr_201 : byte [generated]
        var_0_262 : int
        expr_26C : byte [generated]
        stack_29C_2 : byte [generated]
        expr_C0 : int [generated]
        var_3_E8 : String
        expr_F0 : String[] [generated]
        expr_FA : String[] [generated]
        
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
            var_0_259 = and:int(ldc:int(-922215110), ldc:int(-146123597))
            expr_68 = var_2_6C = stack_96_0 = stack_98_0 = stack_BE_0 = stack_C0_0 = stack_DC_0 = stack_201_0 = stack_26C_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("NSWV9b1lrUufnaPXzdUN3a2ttSWV9b1lrUufnaP/BaIVhaUVtZ31Oh19pa0toQA="))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_191 = newarray:byte[](byte.class, expr_70:int)
                var_4_192 = expr_70:int
                
                loop {
                    var_0_259 = and:int(var_0_259:int, ldc:int(-516720965))
                    var_4_192 = add:int(var_4_192:int, ldc:int(-1))
                    storeelement:byte(var_3_191:byte[], var_4_192:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_192:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_192:int, xor:int(ldc:int(368), ldc:int(369)))), ldc:int(7)), and:int(ldc:int(513), ldc:int(19797)))))
                    
                    if (cmpne:boolean(var_4_192:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_98_0 = stack_96_0 = stack_BE_0 = stack_C0_0 = stack_DC_0 = stack_201_0 = stack_26C_0 = var_3_191:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_259:int, ldc:int(1)), ldc:int(0))) {
                    var_0_259 = and:int(var_0_259:int, ldc:int(-785710017))
                    goto(Label_0197)
                }
                
                if (cmpne:boolean(and:int(var_0_259:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0157)
                }
                
                var_0_259 = and:int(var_0_259:int, ldc:int(-499286098))
                expr_98 = arraylength:int(stack_98_0:byte[])
                
                if (cmpeq:boolean(expr_98:int, ldc:int(0))) {
                    goto(Label_0157)
                }
                
                var_5_1E2 = expr_98:int
                var_3_1E7 = newarray:byte[](byte.class, expr_98:int)
                var_4_1E8 = expr_98:int
                Label_0490:
                
                while (cmpeq:boolean(and:int(var_0_259:int, ldc:int(4)), ldc:int(0))) {
                    var_0_259 = and:int(var_0_259:int, ldc:int(-306938003))
                    var_4_1E8 = add:int(var_4_1E8:int, ldc:int(-1))
                    expr_201 = loadelement:byte(stack_201_0:byte[], var_4_1E8:int)
                    storeelement:byte(var_3_1E7:byte[], var_4_1E8:int, add:int(xor:int(or:int(and:int(shl:int(expr_201:byte, xor:int(ldc:int(736), ldc:int(740))), ldc:int(-16)), and:int(shr:int(expr_201:byte[expected:int], and:int(ldc:int(11461), ldc:int(550))), ldc:int(15))), ldc:int(65)), ldc:int(13)))
                    
                    if (cmpne:boolean(var_4_1E8:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_BE_0 = stack_C0_0 = stack_DC_0 = stack_201_0 = stack_26C_0 = var_3_1E7:byte[]
                    goto(Label_0157)
                }
                
                Label_0588:
                
                while (cmpne:boolean(and:int(var_0_259:int, ldc:int(1024)), ldc:int(0))) {
                    var_0_262 = and:int(var_0_259:int, ldc:int(-1325507219))
                    var_4_1E8 = add:int(var_4_1E8:int, ldc:int(-1))
                    expr_26C = loadelement:byte(stack_26C_0:byte[], var_4_1E8:int)
                    
                    if (cmpge:boolean(add:int(add:int(var_4_1E8:int, ldc:int(1)), neg:int(var_5_1E2:int)), ldc:int(0))) {
                        var_0_262 = and:int(var_0_262:int, ldc:int(-662137101))
                        stack_29C_2 = add:byte(expr_26C:byte, ldc:byte(1))
                    }
                    else {
                        stack_29C_2 = add:byte(expr_26C:byte, loadelement:byte(var_3_1E7:byte[], add:int(var_4_1E8:int, ldc:int(1))))
                    }
                    
                    var_0_259 = and:int(var_0_262:int, ldc:int(-1449306264))
                    storeelement:byte(var_3_1E7:byte[], var_4_1E8:int, stack_29C_2:byte)
                    
                    if (cmpne:boolean(var_4_1E8:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_BE_0 = stack_C0_0 = stack_DC_0 = stack_201_0 = stack_26C_0 = var_3_1E7:byte[]
                    goto(Label_0197)
                }
                
                var_0_259 = and:int(var_0_259:int, ldc:int(-2118401872))
                goto(Label_0490)
                Label_0157:
                
                if (cmpne:boolean(and:int(var_0_259:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_259:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_0_259 = and:int(var_0_259:int, ldc:int(67734422))
                        loopcontinue()
                    }
                    
                    var_0_259 = and:int(var_0_259:int, ldc:int(-1949755787))
                    expr_C0 = arraylength:int(stack_C0_0:byte[])
                    
                    if (cmpne:boolean(expr_C0:int, ldc:int(0))) {
                        var_5_1E2 = expr_C0:int
                        var_3_1E7 = newarray:byte[](byte.class, expr_C0:int)
                        var_4_1E8 = expr_C0:int
                        goto(Label_0588)
                    }
                }
                
                Label_0197:
                
                if (cmpne:boolean(and:int(var_0_259:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0157)
                }
                
                if (cmpeq:boolean(and:int(var_0_259:int, ldc:int(262144)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_E8 = initobject:String(String::<init>, stack_DC_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_F0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(6), ldc:int(30860)))
            expr_FA = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(352), ldc:int(356)))
            storeelement:String(expr_F0:String[], xor:int(ldc:int(-22399), ldc:int(-22398)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(25387), ldc:int(-26540)), xor:int(ldc:int(13069), ldc:int(13087))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(542), ldc:int(24898)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(-15997), ldc:int(-15983)), and:int(ldc:int(37), ldc:int(10365))))
            storeelement:String(expr_FA:String[], and:int(ldc:int(18116), ldc:int(-18149)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(3076), ldc:int(3105)), and:int(ldc:int(103), ldc:int(5687))))
            storeelement:String(expr_FA:String[], xor:int(ldc:int(17480), ldc:int(17481)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(567), ldc:int(12647)), xor:int(ldc:int(16416), ldc:int(16398))))
            putstatic:String[](\uc84e\u8bb0\u59ec\u5bc4\u5654::\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded, expr_FA:String[])
            putstatic:SimpleCommandExceptionType(\uc84e\u8bb0\u59ec\u5bc4\u5654::\u6b5f\u61a4\u6c56\u88c5\u9255\u6b5f, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(expr_F0:String[], xor:int(ldc:int(4421), ldc:int(4422))))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u759a\ud217\u8cae\u56bd\u56bd\u759a(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_646 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_651 : int
        
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
        var_3_646 = and:int(ldc:int(-1085292253), ldc:int(-23213377))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc84e\u8bb0\u59ec\u5bc4\u5654[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_646 = and:int(var_3_646:int, ldc:int(-1082724175))
            var_5_81 = and:int(ldc:int(30245), ldc:int(-32358))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-11473), ldc:int(11472)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_646:int, ldc:int(-9050187))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(23591), ldc:int(1)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(16736), ldc:int(16737)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_646 = and:int(var_3_DA:int, ldc:int(-1114246393))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(-32503), ldc:int(-32504)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1503)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(8)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1584443741))
                        goto(Label_1355)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-508226382))
                        goto(Label_1223)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-217593545))
                        goto(Label_0935)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1468340384))
                        goto(Label_0822)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0690)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-619069461))
                        goto(Label_0575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1125133321))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0575)
                            }
                            
                            goto(Label_0822)
                        }
                    }
                    
                    Label_0419:
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1503)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(64)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(993381981))
                        goto(Label_1355)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1223)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-968288590))
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0935)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0822)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(8)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1374801959))
                        goto(Label_0690)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(64)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-1126380613))
                            var_11_EB = and:int(ldc:int(557), ldc:int(-558))
                            goto(Label_1492)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0575:
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1503)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1443879439))
                        goto(Label_1355)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-2120025))
                        goto(Label_1223)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0935)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0822)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(2129532257))
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1103772443))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0822)
                        }
                    }
                    
                    Label_0690:
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1503)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1355)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(395174211))
                        goto(Label_1223)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0935)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1266166797))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(1822355467))
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-631104314))
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(-52046133))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0822:
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1503)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1355)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1223)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1638392473))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0690)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-723406030))
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(1932951433))
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(-27270813))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(-11264), ldc:int(-11263))
                                goto(Label_1111)
                            }
                        }
                    }
                    
                    Label_0935:
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1503)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(361843943))
                        goto(Label_1355)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-53535283))
                        goto(Label_1223)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-263643577))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-1859180044))
                            goto(Label_0822)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0690)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(468435824))
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(8)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-424891195))
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1092813323))
                        var_11_EB = and:int(ldc:int(2418), ldc:int(-2419))
                    }
                    
                    Label_1111:
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1503)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1355)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1451108472))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-1046289252))
                            goto(Label_0935)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0822)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(1556241283))
                            goto(Label_0690)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(-36778595))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1355)
                            }
                        }
                    }
                    
                    Label_1223:
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1503)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1601157823))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(1855217404))
                            goto(Label_1111)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0935)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-1502675203))
                            goto(Label_0822)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0690)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(8)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(1108269933))
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(-39852545))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1492)
                    }
                    
                    Label_1355:
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(54221895))
                        goto(Label_1503)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1223)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0935)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1712914656))
                        goto(Label_0822)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0690)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(8)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1877821616))
                        goto(Label_0575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-630372689))
                        loopcontinue()
                    }
                    
                    var_3_646 = and:int(var_3_646:int, ldc:int(-1133193579))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1492:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_651 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1503:
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1355)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1577397605))
                        goto(Label_1223)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0935)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0822)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0690)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1681077947))
                        goto(Label_0575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1636323138))
                        goto(Label_0419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1098581287))
                        var_17_651 = add:int(var_16_119:int, xor:int(ldc:int(264), ldc:int(265)))
                        looporswitchbreak()
                    }
                }
                
                var_3_646 = and:int(var_3_646:int, ldc:int(-56166955))
                
                if (cmple:boolean(var_5_81 = var_17_651:int, sub:int(var_6_88:int, xor:int(ldc:int(-30672), ldc:int(-30671))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1)), ldc:int(0))) {
            var_3_646 = and:int(var_3_646:int, ldc:int(-938072983))
            goto(Label_0108)
        }
    }
}
