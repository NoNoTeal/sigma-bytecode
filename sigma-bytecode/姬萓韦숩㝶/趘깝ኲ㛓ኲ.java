public class \u59ec\u8413\u97e6\uc229\u3776.\u8d98\uae5d\u12b2\u36d3\u12b2 {
    public void \u8d98\uae5d\u12b2\u36d3\u12b2() {
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
            invokespecial:Object(Object::<init>, this:\u8d98\uae5d\u12b2\u36d3\u12b2)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \ud217\u7d52\ub32d\u4c04\u983f\u98a4(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
            invokevirtual:LiteralCommandNode(CommandDispatcher::register, p0:CommandDispatcher<\u8413\u5140\u64f2\uc9f6\u9937>, checkcast:LiteralArgumentBuilder(com.mojang.brigadier.builder.LiteralArgumentBuilder.class, invokevirtual:ArgumentBuilder[expected:LiteralArgumentBuilder](LiteralArgumentBuilder::then, invokestatic:LiteralArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937>(\u40a9\ud51e\ua562\ucef1\u873d::\u3bc9\u3e75\u3e2a\uc87f\uc238\u965f, loadelement:String(getstatic:String[](\u8d98\uae5d\u12b2\u36d3\u12b2::\u7bad\ua61f\u385b\u8d90\ubefe\ua6bd), and:int(ldc:int(11015), ldc:int(-16200)))), invokevirtual:ArgumentBuilder(RequiredArgumentBuilder::executes, invokestatic:RequiredArgumentBuilder(\u40a9\ud51e\ua562\ucef1\u873d::\u494c\u67d0\u5d20\uc4d2\u516c\u3bd6, loadelement:String(getstatic:String[](\u8d98\uae5d\u12b2\u36d3\u12b2::\u7bad\ua61f\u385b\u8d90\ubefe\ua6bd), xor:int(ldc:int(-13312), ldc:int(-13311))), invokestatic:StringArgumentType[expected:ArgumentType](StringArgumentType::greedyString)), invokedynamic:Command(run:()Lcom/mojang/brigadier/Command;)))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static net.minecraft.util.text.ITextComponent \u4d85\u40a9\u4c04\uc84e\ub6ab\u8640(com.mojang.brigadier.context.CommandContext<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0, java.lang.String p1) {
        stack_96_1 : String [generated]
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
            stack_96_1 = loadelement:String(getstatic:String[](\u8d98\uae5d\u12b2\u36d3\u12b2::\u7bad\ua61f\u385b\u8d90\ubefe\ua6bd), xor:int(ldc:int(128), ldc:int(130)))
            expr_76 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(23), ldc:int(21)))
            storeelement:Object(expr_76:Object[], and:int(ldc:int(3496), ldc:int(-11692)), invokevirtual:ITextComponent[expected:Object](\u8413\u5140\u64f2\uc9f6\u9937::\u2dcc\u416d\u946b\ub171\ubff1\ud7e8, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>))))
            storeelement:Object(expr_76:Object[], and:int(ldc:int(27393), ldc:int(169)), p1:String[expected:Object])
            return:ITextComponent(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_96_1:String, expr_76:Object[]))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ub32d\u071d\u4cd9\u385b\ub83f\u5fe1$2(com.mojang.brigadier.context.CommandContext p0) {
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
    
    private static void lambda$\u4bc8\u62da\ud36e\u965f\u8413\u3e75$1(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u88c5\ud171\ub113\u6435\ud51e p0, com.mojang.brigadier.context.CommandContext p1, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p2, java.util.Optional p3) {
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
    
    private static void lambda$\ub171\uc84e\ub113\u92ff\u446c\u3e75$0(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u88c5\ud171\ub113\u6435\ud51e p0, com.mojang.brigadier.context.CommandContext p1, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p2, java.lang.String p3) {
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
            invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\u3bc9\u7006\ud12e\u7c6b\u6fb0\ubf56, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, p0:\u88c5\ud171\ub113\u6435\ud51e), invokestatic:ITextComponent(\u8d98\uae5d\u12b2\u36d3\u12b2::\u4d85\u40a9\u4c04\uc84e\ub6ab\u8640, p1:CommandContext, p3:String), getstatic:ChatType(ChatType::CHAT), invokevirtual:UUID(\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, p2:\u7d52\u718f\u3776\u6fb0\ub83f))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_22E : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_9E_0 : byte[] [generated]
        stack_A0_0 : byte[] [generated]
        stack_D1_0 : byte[] [generated]
        stack_D3_0 : byte[] [generated]
        stack_112_0 : byte[] [generated]
        stack_114_0 : byte[] [generated]
        stack_14A_0 : byte[] [generated]
        stack_241_0 : byte[] [generated]
        stack_293_0 : byte[] [generated]
        stack_31A_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_1C8 : byte[]
        var_4_1C9 : int
        expr_A0 : int [generated]
        var_5_219 : int
        var_3_21E : byte[]
        var_4_21F : int
        var_0_2AD : int
        expr_293 : byte [generated]
        stack_2E5_2 : byte [generated]
        stack_2B9_0 : byte [generated]
        expr_D3 : int [generated]
        expr_114 : int [generated]
        var_3_308 : byte[]
        var_4_309 : int
        expr_31A : byte [generated]
        var_3_156 : String
        stack_1BF_0 : String[] [generated]
        expr_168 : String[] [generated]
        
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
            var_0_22E = and:int(ldc:int(82674530), ldc:int(1609527232))
            expr_65 = var_2_69 = stack_9E_0 = stack_A0_0 = stack_D1_0 = stack_D3_0 = stack_112_0 = stack_114_0 = stack_14A_0 = stack_241_0 = stack_293_0 = stack_31A_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("AVITLBNWIlZW1m4Sby7u1MAQEm0p7+3s"))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_1C8 = newarray:byte[](byte.class, expr_6D:int)
                var_4_1C9 = expr_6D:int
                
                loop {
                    var_0_22E = and:int(var_0_22E:int, ldc:int(1587395583))
                    var_4_1C9 = add:int(var_4_1C9:int, ldc:int(-1))
                    storeelement:byte(var_3_1C8:byte[], var_4_1C9:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_1C9:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_1C9:int, xor:int(ldc:int(288), ldc:int(289)))), ldc:int(2)), xor:int(ldc:int(8218), ldc:int(8229)))))
                    
                    if (cmpne:boolean(var_4_1C9:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A0_0 = stack_9E_0 = stack_D1_0 = stack_D3_0 = stack_112_0 = stack_114_0 = stack_14A_0 = stack_241_0 = stack_293_0 = stack_31A_0 = var_3_1C8:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_22E:int, ldc:int(262144)), ldc:int(0))) {
                    var_0_22E = and:int(var_0_22E:int, ldc:int(-1608803351))
                    goto(Label_0281)
                }
                
                if (cmpne:boolean(and:int(var_0_22E:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0216)
                }
                
                if (cmpne:boolean(and:int(var_0_22E:int, ldc:int(131072)), ldc:int(0))) {
                    var_0_22E = and:int(var_0_22E:int, ldc:int(-960327740))
                    goto(Label_0165)
                }
                
                var_0_22E = and:int(var_0_22E:int, ldc:int(1033733063))
                expr_A0 = arraylength:int(stack_A0_0:byte[])
                
                if (cmpeq:boolean(expr_A0:int, ldc:int(0))) {
                    goto(Label_0165)
                }
                
                var_5_219 = expr_A0:int
                var_3_21E = newarray:byte[](byte.class, expr_A0:int)
                var_4_21F = expr_A0:int
                Label_0545:
                
                while (cmpeq:boolean(and:int(var_0_22E:int, ldc:int(16)), ldc:int(0))) {
                    var_0_22E = and:int(var_0_22E:int, ldc:int(-1662057019))
                    var_4_21F = add:int(var_4_21F:int, ldc:int(-1))
                    storeelement:byte(var_3_21E:byte[], var_4_21F:int, add:byte(xor:byte(loadelement:byte(stack_241_0:byte[], var_4_21F:int), ldc:byte(83)), ldc:byte(41)))
                    
                    if (cmpne:boolean(var_4_21F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A0_0 = stack_9E_0 = stack_D1_0 = stack_D3_0 = stack_112_0 = stack_114_0 = stack_14A_0 = stack_241_0 = stack_293_0 = stack_31A_0 = var_3_21E:byte[]
                    goto(Label_0165)
                }
                
                var_0_22E = and:int(var_0_22E:int, ldc:int(-944245018))
                Label_0627:
                
                while (cmpeq:boolean(and:int(var_0_22E:int, ldc:int(4096)), ldc:int(0))) {
                    var_0_2AD = and:int(var_0_22E:int, ldc:int(1842339191))
                    var_4_21F = add:int(var_4_21F:int, ldc:int(-1))
                    expr_293 = stack_2E5_2 = loadelement(stack_293_0, var_4_21F)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_21F:int, ldc:int(5)), neg:int(var_5_219:int)), ldc:int(0))) {
                        stack_2E5_2 = stack_2B9_0 = add:byte(expr_293:byte, loadelement:byte(var_3_21E:byte[], add:int(var_4_21F:int, ldc:int(5))))
                        goto(Label_0713)
                    }
                    
                    Label_0672:
                    
                    if (cmpeq:boolean(and:int(var_0_2AD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_0_2AD = and:int(var_0_2AD:int, ldc:int(81055019))
                    }
                    else {
                        var_0_2AD = and:int(var_0_2AD:int, ldc:int(-992149048))
                        stack_2E5_2 = stack_2B9_0 = add:byte(expr_293:byte, ldc:byte(5))
                    }
                    
                    Label_0713:
                    
                    if (cmpne:boolean(and:int(var_0_2AD:int, ldc:int(8)), ldc:int(0))) {
                        var_0_2AD = and:int(var_0_2AD:int, ldc:int(1636926463))
                        goto(Label_0672)
                    }
                    
                    var_0_22E = and:int(var_0_2AD:int, ldc:int(1740485488))
                    storeelement:byte(var_3_21E:byte[], var_4_21F:int, stack_2E5_2:byte)
                    
                    if (cmpne:boolean(var_4_21F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A0_0 = stack_9E_0 = stack_D1_0 = stack_D3_0 = stack_112_0 = stack_114_0 = stack_14A_0 = stack_241_0 = stack_293_0 = stack_31A_0 = var_3_21E:byte[]
                    goto(Label_0216)
                }
                
                var_0_22E = and:int(var_0_22E:int, ldc:int(1910526302))
                goto(Label_0545)
                Label_0165:
                
                if (cmpne:boolean(and:int(var_0_22E:int, ldc:int(131072)), ldc:int(0))) {
                    var_0_22E = and:int(var_0_22E:int, ldc:int(-540613512))
                    goto(Label_0281)
                }
                
                if (cmpne:boolean(and:int(var_0_22E:int, ldc:int(131072)), ldc:int(0))) {
                    var_0_22E = and:int(var_0_22E:int, ldc:int(-145904079))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_22E:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_22E = and:int(var_0_22E:int, ldc:int(-1494255636))
                    expr_D3 = arraylength:int(stack_D3_0:byte[])
                    
                    if (cmpne:boolean(expr_D3:int, ldc:int(0))) {
                        var_5_219 = expr_D3:int
                        var_3_21E = newarray:byte[](byte.class, expr_D3:int)
                        var_4_21F = expr_D3:int
                        goto(Label_0627)
                    }
                }
                
                Label_0216:
                
                if (cmpeq:boolean(and:int(var_0_22E:int, ldc:int(64)), ldc:int(0))) {
                    var_0_22E = and:int(var_0_22E:int, ldc:int(610827425))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_22E:int, ldc:int(8)), ldc:int(0))) {
                        var_0_22E = and:int(var_0_22E:int, ldc:int(621930513))
                        goto(Label_0165)
                    }
                    
                    if (cmpeq:boolean(and:int(var_0_22E:int, ldc:int(256)), ldc:int(0))) {
                        var_0_22E = and:int(var_0_22E:int, ldc:int(-236967630))
                        loopcontinue()
                    }
                    
                    var_0_22E = and:int(var_0_22E:int, ldc:int(-1362265254))
                    expr_114 = arraylength:int(stack_114_0:byte[])
                    
                    if (cmpne:boolean(expr_114:int, ldc:int(0))) {
                        var_3_308 = newarray:byte[](byte.class, expr_114:int)
                        var_4_309 = expr_114:int
                        
                        loop {
                            var_0_22E = and:int(var_0_22E:int, ldc:int(-292728506))
                            var_4_309 = add:int(var_4_309:int, ldc:int(-1))
                            expr_31A = loadelement:byte(stack_31A_0:byte[], var_4_309:int)
                            storeelement:byte(var_3_308:byte[], var_4_309:int, or:int(and:int(shl:int(expr_31A:byte, and:int(ldc:int(8228), ldc:int(19462))), ldc:int(-16)), and:int(shr:int(expr_31A:byte[expected:int], and:int(ldc:int(172), ldc:int(26631))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_4_309:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A0_0 = stack_9E_0 = stack_D1_0 = stack_D3_0 = stack_112_0 = stack_114_0 = stack_14A_0 = stack_241_0 = stack_293_0 = stack_31A_0 = var_3_308:byte[]
                    }
                }
                
                Label_0281:
                
                if (cmpeq:boolean(and:int(var_0_22E:int, ldc:int(67108864)), ldc:int(0))) {
                    var_0_22E = and:int(var_0_22E:int, ldc:int(1981370320))
                    goto(Label_0216)
                }
                
                if (cmpne:boolean(and:int(var_0_22E:int, ldc:int(16777216)), ldc:int(0))) {
                    var_0_22E = and:int(var_0_22E:int, ldc:int(1647542643))
                    goto(Label_0165)
                }
                
                if (cmpne:boolean(and:int(var_0_22E:int, ldc:int(524288)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_156 = initobject:String(String::<init>, stack_14A_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1BF_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(20899), ldc:int(1103)))
            expr_168 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(17664), ldc:int(17667)))
            storeelement:String(expr_168:String[], xor:int(ldc:int(3616), ldc:int(3617)), invokevirtual:String[expected:String](String::substring, var_3_156:String, and:int(ldc:int(1134), ldc:int(-1135)), xor:int(ldc:int(4739), ldc:int(4741))))
            storeelement:String(expr_168:String[], and:int(ldc:int(13379), ldc:int(790)), invokevirtual:String[expected:String](String::substring, var_3_156:String, xor:int(ldc:int(1029), ldc:int(1027)), xor:int(ldc:int(4377), ldc:int(4364))))
            storeelement:String(expr_168:String[], and:int(ldc:int(-3520), ldc:int(3509)), invokevirtual:String[expected:String](String::substring, var_3_156:String, and:int(ldc:int(17431), ldc:int(4189)), and:int(ldc:int(2207), ldc:int(9751))))
            putstatic:String[](\u8d98\uae5d\u12b2\u36d3\u12b2::\u7bad\ua61f\u385b\u8d90\ubefe\ua6bd, expr_168:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u71f1\u4492\ucfaf\ucfaf\ud12e\ub18d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_677 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_682 : int
        
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
        var_3_677 = and:int(ldc:int(-67401466), ldc:int(1249888690))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8d98\uae5d\u12b2\u36d3\u12b2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(131072)), ldc:int(0))) {
            var_3_677 = and:int(var_3_677:int, ldc:int(1055825779))
            var_5_80 = and:int(ldc:int(-3834), ldc:int(1785))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(11524), ldc:int(-28613)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_677:int, ldc:int(1052438395))
                    var_9_BE = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_87:int, xor:int(ldc:int(-16381), ldc:int(-16382)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, and:int(ldc:int(33), ldc:int(2307)))), var_7_96:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_677 = and:int(var_3_D0:int, ldc:int(-886399557))
                    var_14_10B = var_7_96:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(5), ldc:int(6817)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_87:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(8)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-1041732304))
                        goto(Label_1533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1107)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(2034068233))
                        goto(Label_0938)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0674)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(1048291731))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0814)
                        }
                    }
                    
                    Label_0383:
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(1368525290))
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1107)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(256)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(287093346))
                        goto(Label_0938)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(626540982))
                        goto(Label_0814)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0674)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(512)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-856539004))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(128)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(-2005140574))
                            var_11_E1 = and:int(ldc:int(7223), ldc:int(-7224))
                            goto(Label_1522)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(8)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(210574230))
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(1466534804))
                        goto(Label_1241)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-1990449390))
                        goto(Label_1107)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0938)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-1579393306))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0383)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_677 = and:int(var_3_677:int, ldc:int(1543413043))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0814)
                        }
                    }
                    
                    Label_0674:
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(1077872226))
                        goto(Label_1533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-295328481))
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(128)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-1788762193))
                        goto(Label_1107)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(8526054))
                        goto(Label_0938)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(1522872193))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0383)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_677 = and:int(var_3_677:int, ldc:int(-50345693))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0814:
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(391213208))
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1107)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-739218289))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0674)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(-1459287832))
                            goto(Label_0383)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(-1120146593))
                            loopcontinue()
                        }
                        
                        var_3_677 = and:int(var_3_677:int, ldc:int(-1389691973))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E1 = xor:int(ldc:int(7424), ldc:int(7425))
                                goto(Label_1107)
                            }
                        }
                    }
                    
                    Label_0938:
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-2027830287))
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1241)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(1192831376))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(1858762875))
                            goto(Label_0814)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(707276568))
                            goto(Label_0674)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0383)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(512)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(-533600494))
                            loopcontinue()
                        }
                        
                        var_3_677 = and:int(var_3_677:int, ldc:int(155162911))
                        var_11_E1 = and:int(ldc:int(11649), ldc:int(-28098))
                    }
                    
                    Label_1107:
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-675466284))
                        goto(Label_1533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(512)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-1170031019))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(-559351308))
                            goto(Label_0938)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0814)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0674)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(16)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(236996478))
                            goto(Label_0383)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(-822507377))
                            loopcontinue()
                        }
                        
                        var_3_677 = and:int(var_3_677:int, ldc:int(-113509101))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1376)
                            }
                        }
                    }
                    
                    Label_1241:
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(-1170307445))
                            goto(Label_1107)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0938)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(512)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(-730457308))
                            goto(Label_0814)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0674)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(-509379034))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0383)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(8)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(-816871405))
                            loopcontinue()
                        }
                        
                        var_3_677 = and:int(var_3_677:int, ldc:int(-1975783585))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_80:int, var_16_10F:int)
                        goto(Label_1522)
                    }
                    
                    Label_1376:
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(16)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(65932549))
                        goto(Label_1241)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(8)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(922956862))
                        goto(Label_1107)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(2)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-2104901488))
                        goto(Label_0938)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(547172478))
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0674)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(16)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(1719071550))
                        goto(Label_0383)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(32768)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_677 = and:int(var_3_677:int, ldc:int(-55853310))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1522:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_682 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1533:
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(1)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(770721498))
                        goto(Label_1241)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1107)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0938)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(8)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(1801607484))
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(1451926948))
                        goto(Label_0674)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(256)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(214857687))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(16)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(1221096215))
                        goto(Label_0383)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-113574642))
                        var_17_682 = add:int(var_16_10F:int, xor:int(ldc:int(9732), ldc:int(9733)))
                        looporswitchbreak()
                    }
                }
                
                var_3_677 = and:int(var_3_677:int, ldc:int(-1379939329))
                
                if (cmple:boolean(var_5_80 = var_17_682:int, sub:int(var_6_87:int, xor:int(ldc:int(226), ldc:int(227))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(8192)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
