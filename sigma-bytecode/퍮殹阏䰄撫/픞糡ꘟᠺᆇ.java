public interface \ud36e\u6bb9\u960f\u4c04\u64ab.\ud51e\u7ce1\ua61f\u183a\u1187 {
    net.minecraft.util.text.ITextComponent \uc246\u0b8e\uc7fe\u8413\u3776\u8413(net.minecraft.util.text.ITextComponent p0);
    
    \ud36e\u6bb9\u960f\u4c04\u64ab.\ud51e\u7ce1\ua61f\u183a\u1187 \ufcaf\u8df4\u9255\u3711\ub70c\u0c95() {
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
    
    \ud36e\u6bb9\u960f\u4c04\u64ab.\ud51e\u7ce1\ua61f\u183a\u1187 \u0800\ufe34\u9033\u3d4b\ubefe\u8753(java.lang.String p0) {
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
    
    net.minecraft.util.text.ITextComponent lambda$\u51b2\u8bb0\u6435\u3a62\u873d\u446c$1(net.minecraft.util.text.ITextComponent p0, net.minecraft.util.text.ITextComponent p1) {
        stack_84_1 : String [generated]
        expr_6D : Object[] [generated]
        
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
            stack_84_1 = ldc:String("pack.nameAndSource")
            expr_6D = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(520), ldc:int(522)))
            storeelement:Object(expr_6D:Object[], and:int(ldc:int(3270), ldc:int(-15607)), p1:ITextComponent[expected:Object])
            storeelement:Object(expr_6D:Object[], and:int(ldc:int(4737), ldc:int(16397)), p0:ITextComponent[expected:Object])
            return:ITextComponent(invokevirtual:IFormattableTextComponent(IFormattableTextComponent::mergeStyle, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_84_1:String, expr_6D:Object[]), getstatic:TextFormatting(TextFormatting::GRAY)))
        }
        
        goto(Label_0006)
    }
    
    net.minecraft.util.text.ITextComponent lambda$\ua61f\u3711\ud523\ubefe\u9033\u4ab3$0(net.minecraft.util.text.ITextComponent p0) {
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
            return:ITextComponent(p0:ITextComponent)
        }
        
        goto(Label_0006)
    }
    
    static {
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
            putstatic:\ud51e\u7ce1\ua61f\u183a\u1187(\ud51e\u7ce1\ua61f\u183a\u1187::\u3504\uae87\u8258\ua3b4\u8308\u7e3f, invokestatic:\ud51e\u7ce1\ua61f\u183a\u1187(\ud51e\u7ce1\ua61f\u183a\u1187::\ufcaf\u8df4\u9255\u3711\ub70c\u0c95))
            putstatic:\ud51e\u7ce1\ua61f\u183a\u1187(\ud51e\u7ce1\ua61f\u183a\u1187::\u6d99\ucb79\u624e\u8c8a\u960f\u3e2a, invokestatic:\ud51e\u7ce1\ua61f\u183a\u1187(\ud51e\u7ce1\ua61f\u183a\u1187::\u0800\ufe34\u9033\u3d4b\ubefe\u8753, ldc:String("pack.source.builtin")))
            putstatic:\ud51e\u7ce1\ua61f\u183a\u1187(\ud51e\u7ce1\ua61f\u183a\u1187::\u4179\ua3b4\uc238\u88c5\u120d\u36d3, invokestatic:\ud51e\u7ce1\ua61f\u183a\u1187(\ud51e\u7ce1\ua61f\u183a\u1187::\u0800\ufe34\u9033\u3d4b\ubefe\u8753, ldc:String("pack.source.world")))
            putstatic:\ud51e\u7ce1\ua61f\u183a\u1187(\ud51e\u7ce1\ua61f\u183a\u1187::\u6c56\u4f4a\u4f52\ua61f\u8413\u3a62, invokestatic:\ud51e\u7ce1\ua61f\u183a\u1187(\ud51e\u7ce1\ua61f\u183a\u1187::\u0800\ufe34\u9033\u3d4b\ubefe\u8753, ldc:String("pack.source.server")))
            return:void()
        }
        
        goto(Label_0006)
    }
}
