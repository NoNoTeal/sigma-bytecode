public class \u5245\u8aa5\u61a4\u7049\u4cd9.\u446c\u8753\u836c\uc84e\ucef1 {
    public void \u446c\u8753\u836c\uc84e\ucef1() {
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
            invokespecial:Object(Object::<init>, this:\u446c\u8753\u836c\uc84e\ucef1)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u760c\u7330\u600f\u6d69\u6c56\u120d(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
        var_3_A5 : LiteralCommandNode
        
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
            var_3_A5 = invokevirtual:LiteralCommandNode(CommandDispatcher::register, p0:CommandDispatcher<\u8413\u5140\u64f2\uc9f6\u9937>, checkcast:LiteralArgumentBuilder(com.mojang.brigadier.builder.LiteralArgumentBuilder.class, invokevirtual:ArgumentBuilder[expected:LiteralArgumentBuilder](LiteralArgumentBuilder::then, invokestatic:LiteralArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937>(\u40a9\ud51e\ua562\ucef1\u873d::\u3bc9\u3e75\u3e2a\uc87f\uc238\u965f, loadelement:String(getstatic:String[](\u446c\u8753\u836c\uc84e\ucef1::\u6c52\u7006\ufcaf\u927d\uae5d\ub19c), and:int(ldc:int(17097), ldc:int(-17098)))), invokevirtual:ArgumentBuilder(RequiredArgumentBuilder::then, invokestatic:RequiredArgumentBuilder(\u40a9\ud51e\ua562\ucef1\u873d::\u494c\u67d0\u5d20\uc4d2\u516c\u3bd6, loadelement:String(getstatic:String[](\u446c\u8753\u836c\uc84e\ucef1::\u6c52\u7006\ufcaf\u927d\uae5d\ub19c), and:int(ldc:int(16449), ldc:int(2825))), invokestatic:\u600f\u9937\ub8be\ud171\u624e[expected:ArgumentType](\u600f\u9937\ub8be\ud171\u624e::\u0b8e\u927d\u7006\u4ab3\u647c\u7873)), invokevirtual:ArgumentBuilder(RequiredArgumentBuilder::executes, invokestatic:RequiredArgumentBuilder(\u40a9\ud51e\ua562\ucef1\u873d::\u494c\u67d0\u5d20\uc4d2\u516c\u3bd6, loadelement:String(getstatic:String[](\u446c\u8753\u836c\uc84e\ucef1::\u6c52\u7006\ufcaf\u927d\uae5d\ub19c), and:int(ldc:int(8238), ldc:int(22547))), invokestatic:\u3c25\u5140\u7049\uae5d\ub32d[expected:ArgumentType](\u3c25\u5140\u7049\uae5d\ub32d::\u16f6\u836c\uc246\u5fe1\u4f52\u3711)), invokedynamic:Command(run:()Lcom/mojang/brigadier/Command;))))))
            invokevirtual:LiteralCommandNode(CommandDispatcher::register, p0:CommandDispatcher<\u8413\u5140\u64f2\uc9f6\u9937>, checkcast:LiteralArgumentBuilder(com.mojang.brigadier.builder.LiteralArgumentBuilder.class, invokevirtual:ArgumentBuilder(LiteralArgumentBuilder::redirect, invokestatic:LiteralArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937>(\u40a9\ud51e\ua562\ucef1\u873d::\u3bc9\u3e75\u3e2a\uc87f\uc238\u965f, loadelement:String(getstatic:String[](\u446c\u8753\u836c\uc84e\ucef1::\u6c52\u7006\ufcaf\u927d\uae5d\ub19c), xor:int(ldc:int(592), ldc:int(595)))), var_3_A5:CommandNode)))
            invokevirtual:LiteralCommandNode(CommandDispatcher::register, p0:CommandDispatcher<\u8413\u5140\u64f2\uc9f6\u9937>, checkcast:LiteralArgumentBuilder(com.mojang.brigadier.builder.LiteralArgumentBuilder.class, invokevirtual:ArgumentBuilder(LiteralArgumentBuilder::redirect, invokestatic:LiteralArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937>(\u40a9\ud51e\ua562\ucef1\u873d::\u3bc9\u3e75\u3e2a\uc87f\uc238\u965f, loadelement:String(getstatic:String[](\u446c\u8753\u836c\uc84e\ucef1::\u6c52\u7006\ufcaf\u927d\uae5d\ub19c), and:int(ldc:int(678), ldc:int(8213)))), var_3_A5:CommandNode)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static int \uae5d\u760c\u8753\ucef1\u8413\uc2bd(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.util.Collection<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f> p1, net.minecraft.util.text.ITextComponent p2) {
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
    
    private static void lambda$\uc3e3\u8c8a\u965f\u3bc9\u59ec\u72f1$2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, net.minecraft.util.text.ITextComponent p1, net.minecraft.util.text.ITextComponent p2) {
        stack_8E_1 : String [generated]
        expr_77 : Object[] [generated]
        expr_61 : TranslationTextComponent [generated]
        expr_98 : TextFormatting[] [generated]
        
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
            stack_8E_1 = loadelement:String(getstatic:String[](\u446c\u8753\u836c\uc84e\ucef1::\u6c52\u7006\ufcaf\u927d\uae5d\ub19c), xor:int(ldc:int(1123), ldc:int(1125)))
            expr_77 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(514), ldc:int(3126)))
            storeelement:Object(expr_77:Object[], and:int(ldc:int(9487), ldc:int(-9504)), p2:ITextComponent[expected:Object])
            storeelement:Object(expr_77:Object[], and:int(ldc:int(7255), ldc:int(1)), p1:ITextComponent[expected:Object])
            expr_61 = initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_8E_1:String, expr_77:Object[])
            expr_98 = newarray:TextFormatting[](net.minecraft.util.text.TextFormatting.class, xor:int(ldc:int(16553), ldc:int(16555)))
            storeelement:TextFormatting(expr_98:TextFormatting[], and:int(ldc:int(-119), ldc:int(118)), getstatic:TextFormatting(TextFormatting::GRAY))
            storeelement:TextFormatting(expr_98:TextFormatting[], xor:int(ldc:int(-16336), ldc:int(-16335)), getstatic:TextFormatting(TextFormatting::ITALIC))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, invokevirtual:IFormattableTextComponent(IFormattableTextComponent::mergeStyle, expr_61:TranslationTextComponent[expected:IFormattableTextComponent], expr_98:TextFormatting[]), and:int[expected:boolean](ldc:int(-6025), ldc:int(6016)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u960f\u61a4\ub19c\u56bd\uc29a\ub102$1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p0, net.minecraft.util.text.ITextComponent p1, net.minecraft.util.text.ITextComponent p2) {
        stack_8E_1 : String [generated]
        expr_77 : Object[] [generated]
        expr_61 : TranslationTextComponent [generated]
        expr_98 : TextFormatting[] [generated]
        
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
            stack_8E_1 = loadelement:String(getstatic:String[](\u446c\u8753\u836c\uc84e\ucef1::\u6c52\u7006\ufcaf\u927d\uae5d\ub19c), xor:int(ldc:int(9738), ldc:int(9740)))
            expr_77 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(515), ldc:int(26774)))
            storeelement:Object(expr_77:Object[], and:int(ldc:int(-12401), ldc:int(12400)), p2:ITextComponent[expected:Object])
            storeelement:Object(expr_77:Object[], and:int(ldc:int(24609), ldc:int(13)), p1:ITextComponent[expected:Object])
            expr_61 = initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_8E_1:String, expr_77:Object[])
            expr_98 = newarray:TextFormatting[](net.minecraft.util.text.TextFormatting.class, xor:int(ldc:int(713), ldc:int(715)))
            storeelement:TextFormatting(expr_98:TextFormatting[], and:int(ldc:int(8213), ldc:int(-8214)), getstatic:TextFormatting(TextFormatting::GRAY))
            storeelement:TextFormatting(expr_98:TextFormatting[], xor:int(ldc:int(1409), ldc:int(1408)), getstatic:TextFormatting(TextFormatting::ITALIC))
            invokevirtual:void(\u51fa\u6c52\u7330\u7330\u960f::\u5db4\u0c95\u960f\u3776\ud217\u647c, p0:\u51fa\u6c52\u7330\u7330\u960f, invokevirtual:IFormattableTextComponent(IFormattableTextComponent::mergeStyle, expr_61:TranslationTextComponent[expected:IFormattableTextComponent], expr_98:TextFormatting[]), invokevirtual:UUID(\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u7c6b\u5db4\u3c25\u600f\u7006\uc2bd$0(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u446c\u8753\u836c\uc84e\ucef1::\uae5d\u760c\u8753\ucef1\u8413\uc2bd, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:Collection<\u51fa\u6c52\u7330\u7330\u960f>(\u600f\u9937\ub8be\ud171\u624e::\u4f4a\u6b0d\u946b\u4e72\u56bd\u56bd, p0:CommandContext, loadelement:String(getstatic:String[](\u446c\u8753\u836c\uc84e\ucef1::\u6c52\u7006\ufcaf\u927d\uae5d\ub19c), and:int(ldc:int(2465), ldc:int(20997)))), invokestatic:ITextComponent(\u3c25\u5140\u7049\uae5d\ub32d::\u3e2a\u0c95\uc7fe\u74b1\u7043\u392e, p0:CommandContext, loadelement:String(getstatic:String[](\u446c\u8753\u836c\uc84e\ucef1::\u6c52\u7006\ufcaf\u927d\uae5d\ub19c), and:int(ldc:int(94), ldc:int(8322))))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_216 : int
        expr_6C : int [generated]
        stack_9A_0 : byte[] [generated]
        stack_9C_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_C5_0 : byte[] [generated]
        stack_F3_0 : byte[] [generated]
        stack_F5_0 : byte[] [generated]
        stack_119_0 : byte[] [generated]
        stack_229_0 : byte[] [generated]
        stack_264_0 : byte[] [generated]
        stack_2CB_0 : byte[] [generated]
        stack_352_0 : byte[] [generated]
        var_4_201 : int
        var_3_206 : byte[]
        var_5_207 : int
        var_0_2E5 : int
        expr_2CB : byte [generated]
        stack_31D_2 : byte [generated]
        stack_2F1_0 : byte [generated]
        var_2_9A : byte[]
        expr_9E : int [generated]
        var_3_252 : byte[]
        var_5_253 : int
        expr_C5 : int [generated]
        expr_F5 : int [generated]
        var_3_340 : byte[]
        var_5_341 : int
        expr_355 : byte [generated]
        var_3_125 : String
        stack_1FA_0 : String[] [generated]
        expr_137 : String[] [generated]
        
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
        var_0_216 = and:int(ldc:int(1622212711), ldc:int(-53642291))
        expr_6C = arraylength:int(stack_9A_0 = stack_9C_0 = stack_C3_0 = stack_C5_0 = stack_F3_0 = stack_F5_0 = stack_119_0 = stack_229_0 = stack_264_0 = stack_2CB_0 = stack_352_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("a219fIntcW96F3NzRdVzbJQff3tryWljUvdlZX97e217a219fIntcW96F3NzRdVzbJQff3tr1XiFYu93Q09rZ3qIl3NzQ1SPbpdtb3FWkWqPf0FVcCIiLA8=")))
        
        if (cmpeq:boolean(expr_6C:int, ldc:int(0))) {
            goto(Label_0113)
        }
        
        var_4_201 = expr_6C:int
        var_3_206 = newarray:byte[](byte.class, expr_6C:int)
        var_5_207 = expr_6C:int
        Label_0521:
        
        while (cmpne:boolean(and:int(var_0_216:int, ldc:int(64)), ldc:int(0))) {
            var_0_216 = and:int(var_0_216:int, ldc:int(1691182917))
            var_5_207 = add:int(var_5_207:int, ldc:int(-1))
            storeelement:byte(var_3_206:byte[], var_5_207:int, xor:byte(loadelement:byte(stack_229_0:byte[], var_5_207:int), ldc:byte(111)))
            
            if (cmpne:boolean(var_5_207:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9C_0 = stack_9A_0 = stack_C3_0 = stack_C5_0 = stack_F3_0 = stack_F5_0 = stack_119_0 = stack_229_0 = stack_264_0 = stack_2CB_0 = stack_352_0 = var_3_206:byte[]
            goto(Label_0113)
        }
        
        var_0_216 = and:int(var_0_216:int, ldc:int(-1318156038))
        Label_0683:
        
        while (cmpne:boolean(and:int(var_0_216:int, ldc:int(64)), ldc:int(0))) {
            var_0_2E5 = and:int(var_0_216:int, ldc:int(1858696399))
            var_5_207 = add:int(var_5_207:int, ldc:int(-1))
            expr_2CB = stack_31D_2 = loadelement(stack_2CB_0, var_5_207)
            
            if (cmplt:boolean(add:int(add:int(var_5_207:int, ldc:int(4)), neg:int(var_4_201:int)), ldc:int(0))) {
                stack_31D_2 = stack_2F1_0 = add:byte(expr_2CB:byte, loadelement:byte(var_3_206:byte[], add:int(var_5_207:int, ldc:int(4))))
                goto(Label_0769)
            }
            
            Label_0728:
            
            if (cmpeq:boolean(and:int(var_0_2E5:int, ldc:int(64)), ldc:int(0))) {
                var_0_2E5 = and:int(var_0_2E5:int, ldc:int(1268131499))
            }
            else {
                var_0_2E5 = and:int(var_0_2E5:int, ldc:int(-354862481))
                stack_31D_2 = stack_2F1_0 = add:byte(expr_2CB:byte, ldc:byte(4))
            }
            
            Label_0769:
            
            if (cmpeq:boolean(and:int(var_0_2E5:int, ldc:int(4)), ldc:int(0))) {
                var_0_2E5 = and:int(var_0_2E5:int, ldc:int(738164913))
                goto(Label_0728)
            }
            
            var_0_216 = and:int(var_0_2E5:int, ldc:int(1720440063))
            storeelement:byte(var_3_206:byte[], var_5_207:int, stack_31D_2:byte)
            
            if (cmpne:boolean(var_5_207:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9C_0 = stack_9A_0 = stack_C3_0 = stack_C5_0 = stack_F3_0 = stack_F5_0 = stack_119_0 = stack_229_0 = stack_264_0 = stack_2CB_0 = stack_352_0 = var_3_206:byte[]
            goto(Label_0202)
        }
        
        var_0_216 = and:int(var_0_216:int, ldc:int(122363601))
        goto(Label_0521)
        Label_0113:
        
        if (cmpeq:boolean(and:int(var_0_216:int, ldc:int(4)), ldc:int(0))) {
            var_0_216 = and:int(var_0_216:int, ldc:int(1431859010))
            goto(Label_0250)
        }
        
        if (cmpeq:boolean(and:int(var_0_216:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0202)
        }
        
        if (cmpeq:boolean(and:int(var_0_216:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_216 = and:int(var_0_216:int, ldc:int(-457602580))
            var_2_9A = stack_9A_0:byte[]
            expr_9E = add:int(arraylength:int(stack_9C_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_3_252 = newarray:byte[](byte.class, expr_9E:int)
                var_5_253 = expr_9E:int
                
                loop {
                    var_0_216 = and:int(var_0_216:int, ldc:int(-442237489))
                    var_5_253 = add:int(var_5_253:int, ldc:int(-1))
                    storeelement:byte(var_3_252:byte[], var_5_253:int, add:int(shl:int(loadelement:byte(stack_264_0:byte[], var_5_253:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_9A:byte[], add:int(var_5_253:int, and:int(ldc:int(20737), ldc:int(1585)))), ldc:int(5)), xor:int(ldc:int(-30681), ldc:int(-30688)))))
                    
                    if (cmpne:boolean(var_5_253:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9C_0 = stack_9A_0 = stack_C3_0 = stack_C5_0 = stack_F3_0 = stack_F5_0 = stack_119_0 = stack_229_0 = stack_264_0 = stack_2CB_0 = stack_352_0 = var_3_252:byte[]
            }
        }
        
        Label_0163:
        
        if (cmpeq:boolean(and:int(var_0_216:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0250)
        }
        
        if (cmpne:boolean(and:int(var_0_216:int, ldc:int(4)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_216:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0113)
            }
            
            var_0_216 = and:int(var_0_216:int, ldc:int(2077710453))
            expr_C5 = arraylength:int(stack_C5_0:byte[])
            
            if (cmpne:boolean(expr_C5:int, ldc:int(0))) {
                var_4_201 = expr_C5:int
                var_3_206 = newarray:byte[](byte.class, expr_C5:int)
                var_5_207 = expr_C5:int
                goto(Label_0683)
            }
        }
        
        Label_0202:
        
        if (cmpne:boolean(and:int(var_0_216:int, ldc:int(1073741824)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_216:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0163)
            }
            
            if (cmpeq:boolean(and:int(var_0_216:int, ldc:int(4)), ldc:int(0))) {
                var_0_216 = and:int(var_0_216:int, ldc:int(-1792008771))
                goto(Label_0113)
            }
            
            var_0_216 = and:int(var_0_216:int, ldc:int(-471767738))
            expr_F5 = arraylength:int(stack_F5_0:byte[])
            
            if (cmpne:boolean(expr_F5:int, ldc:int(0))) {
                var_3_340 = newarray:byte[](byte.class, expr_F5:int)
                var_5_341 = expr_F5:int
                
                loop {
                    var_0_216 = and:int(var_0_216:int, ldc:int(2076142446))
                    var_5_341 = add:int(var_5_341:int, ldc:int(-1))
                    expr_355 = add:byte(loadelement:byte(stack_352_0:byte[], var_5_341:int), ldc:byte(88))
                    storeelement:byte(var_3_340:byte[], var_5_341:int, or:int(and:int(shl:int(expr_355:byte, and:int(ldc:int(4774), ldc:int(68))), ldc:int(-16)), and:int(shr:int(expr_355:byte[expected:int], and:int(ldc:int(6151), ldc:int(18252))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_341:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9C_0 = stack_9A_0 = stack_C3_0 = stack_C5_0 = stack_F3_0 = stack_F5_0 = stack_119_0 = stack_229_0 = stack_264_0 = stack_2CB_0 = stack_352_0 = var_3_340:byte[]
            }
        }
        
        Label_0250:
        
        if (cmpne:boolean(and:int(var_0_216:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0202)
        }
        
        if (cmpne:boolean(and:int(var_0_216:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0163)
        }
        
        if (cmpeq:boolean(and:int(var_0_216:int, ldc:int(8192)), ldc:int(0))) {
            var_3_125 = initobject:String(String::<init>, stack_119_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1FA_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(256), ldc:int(263)))
            expr_137 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2327), ldc:int(20519)))
            storeelement:String(expr_137:String[], xor:int(ldc:int(6176), ldc:int(6181)), invokevirtual:String[expected:String](String::substring, var_3_125:String, and:int(ldc:int(14659), ldc:int(-14696)), xor:int(ldc:int(3121), ldc:int(3088))))
            storeelement:String(expr_137:String[], xor:int(ldc:int(2113), ldc:int(2119)), invokevirtual:String[expected:String](String::substring, var_3_125:String, and:int(ldc:int(3701), ldc:int(161)), xor:int(ldc:int(1695), ldc:int(1757))))
            storeelement:String(expr_137:String[], xor:int(ldc:int(8332), ldc:int(8334)), invokevirtual:String[expected:String](String::substring, var_3_125:String, and:int(ldc:int(9287), ldc:int(18762)), xor:int(ldc:int(10324), ldc:int(10269))))
            storeelement:String(expr_137:String[], and:int(ldc:int(-28882), ldc:int(20688)), invokevirtual:String[expected:String](String::substring, var_3_125:String, and:int(ldc:int(9689), ldc:int(18539)), and:int(ldc:int(7647), ldc:int(16460))))
            storeelement:String(expr_137:String[], and:int(ldc:int(2247), ldc:int(16385)), invokevirtual:String[expected:String](String::substring, var_3_125:String, and:int(ldc:int(16509), ldc:int(10316)), and:int(ldc:int(22743), ldc:int(91))))
            storeelement:String(expr_137:String[], and:int(ldc:int(20183), ldc:int(3)), invokevirtual:String[expected:String](String::substring, var_3_125:String, and:int(ldc:int(1147), ldc:int(29011)), and:int(ldc:int(21591), ldc:int(8919))))
            storeelement:String(expr_137:String[], xor:int(ldc:int(4419), ldc:int(4423)), invokevirtual:String[expected:String](String::substring, var_3_125:String, xor:int(ldc:int(4361), ldc:int(4446)), and:int(ldc:int(248), ldc:int(857))))
            putstatic:String[](\u446c\u8753\u836c\uc84e\ucef1::\u6c52\u7006\ufcaf\u927d\uae5d\ub19c, expr_137:String[])
            return:void()
        }
        
        goto(Label_0113)
    }
    
    public void \u5d20\ubded\uc29a\ucef1\ub19c\u61a4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67B : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_686 : int
        
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
        var_3_67B = and:int(ldc:int(-1289827720), ldc:int(-402690321))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u446c\u8753\u836c\uc84e\ucef1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
            var_3_67B = and:int(var_3_67B:int, ldc:int(411922717))
        }
        else {
            var_3_67B = and:int(var_3_67B:int, ldc:int(-283162040))
            var_5_8A = and:int(ldc:int(221), ldc:int(-222))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(20588), ldc:int(-23149)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_67B:int, ldc:int(-1554056241))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, xor:int(ldc:int(16673), ldc:int(16672)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(48), ldc:int(49)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_67B = and:int(var_3_E3:int, ldc:int(-1424242098))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(6209), ldc:int(425)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(768473169))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(490071399))
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-828310681))
                    }
                    else {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-880805121))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0595)
                            }
                            
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(267143566))
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1915397682))
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1253087313))
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(101461799))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(384128009))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1202495290))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-2093069322))
                        var_11_F4 = and:int(ldc:int(-20584), ldc:int(20519))
                        goto(Label_1544)
                    }
                    
                    Label_0595:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1959839973))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1106740092))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1565362665))
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2103375904))
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-433616939))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1482890060))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1759813651))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0738:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(295163830))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1891162017))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1948981972))
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-317226689))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-686101665))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0870:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-362761001))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-820327714))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = xor:int(ldc:int(2344), ldc:int(2345))
                                goto(Label_1119)
                            }
                        }
                    }
                    
                    Label_0968:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(390864106))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2052305324))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0870)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-43124832))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1147180188))
                        var_11_F4 = and:int(ldc:int(-14548), ldc:int(10451))
                    }
                    
                    Label_1119:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1884211578))
                            goto(Label_0968)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-22953400))
                            goto(Label_0870)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1099426083))
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1766444471))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(803391659))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-744587454))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1398)
                            }
                        }
                    }
                    
                    Label_1253:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1537745704))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-100670533))
                            goto(Label_1119)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0968)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0870)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1624707921))
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1301025152))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1580535391))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-209790236))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1544)
                    }
                    
                    Label_1398:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1612131309))
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1305868561))
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1141815891))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1442481932))
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-2032256427))
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_67B = and:int(var_3_67B:int, ldc:int(-1285567496))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1544:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_686 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1555:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(450024428))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(242118576))
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1017492629))
                        var_17_686 = add:int(var_16_122:int, xor:int(ldc:int(-30590), ldc:int(-30589)))
                        looporswitchbreak()
                    }
                    
                    var_3_67B = and:int(var_3_67B:int, ldc:int(2124064825))
                }
                
                var_3_67B = and:int(var_3_67B:int, ldc:int(-1006711963))
                
                if (cmple:boolean(var_5_8A = var_17_686:int, sub:int(var_6_91:int, xor:int(ldc:boolean(0), ldc:boolean(1))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
            var_3_67B = and:int(var_3_67B:int, ldc:int(590496600))
            goto(Label_0108)
        }
    }
}
