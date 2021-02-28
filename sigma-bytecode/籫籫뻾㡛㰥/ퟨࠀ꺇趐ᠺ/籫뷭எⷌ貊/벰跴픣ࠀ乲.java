public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ubcb0\u8df4\ud523\u0800\u4e72 {
    public void \ubcb0\u8df4\ud523\u0800\u4e72() {
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
            invokespecial:Object(Object::<init>, this:\ubcb0\u8df4\ud523\u0800\u4e72)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u5140\u624e\uae5d\ube23\ucef1\uc31c(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int \uc87f\u12b2\u392e\u97b7\ub171\u624e(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, boolean p1) {
        var_4_81 : \u88c5\ud171\ub113\u6435\ud51e
        
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
        invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\ubcb0\u8df4\ud523\u0800\u4e72::\u4f4a\u7bad\u9a18\u6c52\u760c\u9937), xor:int(ldc:int(22533), ldc:int(22535)))), and:int[expected:boolean](ldc:int(-12859), ldc:int(4666)))
        var_4_81 = invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937)
        invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\ua3b4\u836c\u983f\u51b2\u8aa5\u7ce1, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, var_4_81:\u88c5\ud171\ub113\u6435\ud51e))
        
        if (invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u98a4\u4f52\u4c04\u8aa5\u47c2\u4ab3, var_4_81:\u88c5\ud171\ub113\u6435\ud51e, and:int[expected:boolean](ldc:int(9641), ldc:int(19009)), p1:boolean, and:int[expected:boolean](ldc:int(8387), ldc:int(18945)))) {
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\ubcb0\u8df4\ud523\u0800\u4e72::\u4f4a\u7bad\u9a18\u6c52\u760c\u9937), xor:int(ldc:int(16523), ldc:int(16520)))), xor:int[expected:boolean](ldc:int(2052), ldc:int(2053)))
            return:int(xor:int(ldc:int(6154), ldc:int(6155)))
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\ubcb0\u8df4\ud523\u0800\u4e72::\u71ae\u0800\u8350\u4ab3\ub171\ub113)))
    }
    
    private static int lambda$\ub32d\u8d90\ub6ab\u3711\ub19c\u4d85$2(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\ubcb0\u8df4\ud523\u0800\u4e72::\uc87f\u12b2\u392e\u97b7\ub171\u624e, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), and:int[expected:boolean](ldc:int(2181), ldc:int(1793))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ub113\u6198\u647c\u7d52\u5f50\ube23$1(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\ubcb0\u8df4\ud523\u0800\u4e72::\uc87f\u12b2\u392e\u97b7\ub171\u624e, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), and:int[expected:boolean](ldc:int(-19176), ldc:int(19046))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u6d99\u67d0\u8753\uae87\u9af2\u72f1$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, and:int(ldc:int(388), ldc:int(100))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_6B : int [generated]
        stack_8C_0 : byte[] [generated]
        stack_8E_0 : byte[] [generated]
        stack_B9_0 : byte[] [generated]
        stack_BB_0 : byte[] [generated]
        stack_DC_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_106_0 : byte[] [generated]
        stack_1F1_0 : byte[] [generated]
        stack_244_0 : byte[] [generated]
        stack_2A0_0 : byte[] [generated]
        stack_310_0 : byte[] [generated]
        var_4_1D4 : int
        var_3_1D9 : byte[]
        var_5_1DA : int
        expr_1F1 : byte [generated]
        var_0_296 : int
        expr_2A0 : byte [generated]
        stack_2DC_2 : byte [generated]
        stack_2BB_0 : byte [generated]
        var_2_8C : byte[]
        expr_90 : int [generated]
        var_3_233 : byte[]
        var_5_234 : int
        expr_BB : int [generated]
        expr_DE : int [generated]
        var_3_2FF : byte[]
        var_5_300 : int
        var_3_112 : String
        expr_11A : String[] [generated]
        expr_124 : String[] [generated]
        
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
        var_0_5F = and:int(ldc:int(851811880), ldc:int(714978746))
        expr_6B = arraylength:int(stack_8C_0 = stack_8E_0 = stack_B9_0 = stack_BB_0 = stack_DC_0 = stack_DE_0 = stack_106_0 = stack_1F1_0 = stack_244_0 = stack_2A0_0 = stack_310_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("4x7/HNGO4yB3Em4kAov59woY4e/tHv8c0Y7jIHcSbgQEexLnFAz//ece/xzRjuMgdxJuBOWTJCLj4/MM/e8ECibnFm4q+YFgdngI")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1D4 = expr_6B:int
        var_3_1D9 = newarray:byte[](byte.class, expr_6B:int)
        var_5_1DA = expr_6B:int
        Label_0476:
        
        while (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1264600274))
            var_5_1DA = add:int(var_5_1DA:int, ldc:int(-1))
            expr_1F1 = loadelement:byte(stack_1F1_0:byte[], var_5_1DA:int)
            storeelement:byte(var_3_1D9:byte[], var_5_1DA:int, xor:int(or:int(and:int(shl:int(expr_1F1:byte, and:int(ldc:int(6973), ldc:int(4))), ldc:int(-16)), and:int(shr:int(expr_1F1:byte[expected:int], xor:int(ldc:int(-24533), ldc:int(-24529))), ldc:int(15))), ldc:int(32)))
            
            if (cmpne:boolean(var_5_1DA:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_B9_0 = stack_BB_0 = stack_DC_0 = stack_DE_0 = stack_106_0 = stack_1F1_0 = stack_244_0 = stack_2A0_0 = stack_310_0 = var_3_1D9:byte[]
            goto(Label_0112)
        }
        
        Label_0651:
        
        while (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8)), ldc:int(0))) {
            var_0_296 = and:int(var_0_5F:int, ldc:int(1818073131))
            var_5_1DA = add:int(var_5_1DA:int, ldc:int(-1))
            expr_2A0 = stack_2DC_2 = loadelement(stack_2A0_0, var_5_1DA)
            
            if (cmplt:boolean(add:int(add:int(var_5_1DA:int, ldc:int(3)), neg:int(var_4_1D4:int)), ldc:int(0))) {
                stack_2DC_2 = stack_2BB_0 = add:byte(expr_2A0:byte, loadelement:byte(var_3_1D9:byte[], add:int(var_5_1DA:int, ldc:int(3))))
                goto(Label_0715)
            }
            
            Label_0685:
            
            if (cmpeq:boolean(and:int(var_0_296:int, ldc:int(524288)), ldc:int(0))) {
                var_0_296 = and:int(var_0_296:int, ldc:int(-1299320132))
                stack_2DC_2 = stack_2BB_0 = add:byte(expr_2A0:byte, ldc:byte(3))
            }
            
            Label_0715:
            
            if (cmpeq:boolean(and:int(var_0_296:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0685)
            }
            
            var_0_5F = and:int(var_0_296:int, ldc:int(923115241))
            storeelement:byte(var_3_1D9:byte[], var_5_1DA:int, stack_2DC_2:byte)
            
            if (cmpne:boolean(var_5_1DA:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_B9_0 = stack_BB_0 = stack_DC_0 = stack_DE_0 = stack_106_0 = stack_1F1_0 = stack_244_0 = stack_2A0_0 = stack_310_0 = var_3_1D9:byte[]
            goto(Label_0192)
        }
        
        goto(Label_0476)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0227)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0192)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(32768)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(1922537135))
            var_2_8C = stack_8C_0:byte[]
            expr_90 = add:int(arraylength:int(stack_8E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_90:int, ldc:int(0))) {
                var_3_233 = newarray:byte[](byte.class, expr_90:int)
                var_5_234 = expr_90:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(1711788653))
                    var_5_234 = add:int(var_5_234:int, ldc:int(-1))
                    storeelement:byte(var_3_233:byte[], var_5_234:int, add:int(shl:int(loadelement:byte(stack_244_0:byte[], var_5_234:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_8C:byte[], add:int(var_5_234:int, and:int(ldc:int(16681), ldc:int(10753)))), ldc:int(5)), xor:int(ldc:int(4133), ldc:int(4130)))))
                    
                    if (cmpne:boolean(var_5_234:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_B9_0 = stack_BB_0 = stack_DC_0 = stack_DE_0 = stack_106_0 = stack_1F1_0 = stack_244_0 = stack_2A0_0 = stack_310_0 = var_3_233:byte[]
            }
        }
        
        Label_0149:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(1703783695))
            goto(Label_0227)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(1902485114))
            expr_BB = arraylength:int(stack_BB_0:byte[])
            
            if (cmpne:boolean(expr_BB:int, ldc:int(0))) {
                var_4_1D4 = expr_BB:int
                var_3_1D9 = newarray:byte[](byte.class, expr_BB:int)
                var_5_1DA = expr_BB:int
                goto(Label_0651)
            }
        }
        
        Label_0192:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(16777216)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0149)
            }
            
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(1648342891))
            expr_DE = arraylength:int(stack_DE_0:byte[])
            
            if (cmpne:boolean(expr_DE:int, ldc:int(0))) {
                var_3_2FF = newarray:byte[](byte.class, expr_DE:int)
                var_5_300 = expr_DE:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-1596612868))
                    var_5_300 = add:int(var_5_300:int, ldc:int(-1))
                    storeelement:byte(var_3_2FF:byte[], var_5_300:int, add:byte(loadelement:byte(stack_310_0:byte[], var_5_300:int), ldc:byte(44)))
                    
                    if (cmpne:boolean(var_5_300:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_B9_0 = stack_BB_0 = stack_DC_0 = stack_DE_0 = stack_106_0 = stack_1F1_0 = stack_244_0 = stack_2A0_0 = stack_310_0 = var_3_2FF:byte[]
            }
        }
        
        Label_0227:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0192)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0149)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-777554122))
            goto(Label_0112)
        }
        
        var_3_112 = initobject:String(String::<init>, stack_106_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_11A = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(1803), ldc:int(1806)))
        expr_124 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(5408), ldc:int(5413)))
        storeelement:String(expr_11A:String[], and:int(ldc:int(3172), ldc:int(28806)), invokevirtual:String[expected:String](String::substring, var_3_112:String, and:int(ldc:int(169), ldc:int(-170)), xor:int(ldc:int(1179), ldc:int(1167))))
        storeelement:String(expr_124:String[], xor:int(ldc:int(25600), ldc:int(25602)), invokevirtual:String[expected:String](String::substring, var_3_112:String, and:int(ldc:int(150), ldc:int(28220)), xor:int(ldc:int(167), ldc:int(143))))
        storeelement:String(expr_124:String[], and:int(ldc:int(4939), ldc:int(7)), invokevirtual:String[expected:String](String::substring, var_3_112:String, and:int(ldc:int(553), ldc:int(252)), xor:int(ldc:int(-30668), ldc:int(-30711))))
        storeelement:String(expr_124:String[], xor:int(ldc:int(24576), ldc:int(24577)), invokevirtual:String[expected:String](String::substring, var_3_112:String, xor:int(ldc:int(64), ldc:int(125)), xor:int(ldc:int(136), ldc:int(202))))
        storeelement:String(expr_124:String[], and:int(ldc:int(-4085), ldc:int(2740)), invokevirtual:String[expected:String](String::substring, var_3_112:String, and:int(ldc:int(16971), ldc:int(5186)), and:int(ldc:int(20555), ldc:int(3182))))
        putstatic:String[](\ubcb0\u8df4\ud523\u0800\u4e72::\u4f4a\u7bad\u9a18\u6c52\u760c\u9937, expr_124:String[])
        putstatic:SimpleCommandExceptionType(\ubcb0\u8df4\ud523\u0800\u4e72::\u71ae\u0800\u8350\u4ab3\ub171\ub113, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(expr_11A:String[], and:int(ldc:int(4), ldc:int(10781))))))
    }
    
    public void \u6d69\u8413\u2dcc\u759a\u7e3f\u4e72(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67F : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C2 : double
        var_3_D4 : int
        var_11_E5 : int
        var_14_10F : double
        var_16_113 : int
        var_12_10B : double
        var_17_68A : int
        
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
        var_3_67F = and:int(ldc:int(683927080), ldc:int(-43821331))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubcb0\u8df4\ud523\u0800\u4e72[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_67F = and:int(var_3_67F:int, ldc:int(-777278326))
        }
        else {
            var_3_67F = and:int(var_3_67F:int, ldc:int(-1084799465))
            var_5_85 = and:int(ldc:int(-5571), ldc:int(5570))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-18030), ldc:int(18028)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C2 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D4 = and:int(var_3_67F:int, ldc:int(1850439222))
                    var_9_C2 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E5 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E5:int, sub:int(var_6_8C:int, xor:int(ldc:int(2064), ldc:int(2065)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E5:int, xor:int(ldc:int(66), ldc:int(67)))), var_7_9B:double))) {
                        inc:int(var_11_E5, ldc:int(1))
                    }
                    
                    var_3_67F = and:int(var_3_D4:int, ldc:int(-305443029))
                    var_14_10F = var_7_9B:double
                    var_16_113 = var_11_E5:int
                }
                else {
                    var_11_E5 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(17033), ldc:int(1363)))
                    var_12_10B = var_14_10F = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_113 = var_11_E5:int, var_6_8C:int)) {
                        var_9_C2 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E5:int)
                        var_16_113 = var_11_E5:int
                        var_14_10F = var_12_10B:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(76645791))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1369029307))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1126)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0976)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(897648278))
                        goto(Label_0855)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0725)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1620823252))
                        goto(Label_0592)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1653791569))
                    }
                    else {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1801182746))
                        
                        if (cmplt:boolean(var_16_113:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0592)
                            }
                            
                            goto(Label_0855)
                        }
                    }
                    
                    Label_0412:
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(508578916))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1317055632))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(859251029))
                        goto(Label_1267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1126)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1273099244))
                        goto(Label_0976)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-395643996))
                        goto(Label_0855)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-929173121))
                        goto(Label_0725)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-1377349882))
                            var_11_E5 = and:int(ldc:int(6816), ldc:int(-15265))
                            goto(Label_1544)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0592:
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-880967264))
                        goto(Label_1267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1126)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1079160325))
                        goto(Label_0976)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1471112870))
                        goto(Label_0855)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1520001762))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(660028473))
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-78119347))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10F = var_9_C2:double
                            goto(Label_0855)
                        }
                    }
                    
                    Label_0725:
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-595911862))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1126)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0976)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1465329195))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-627144584))
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-165071896))
                            goto(Label_0412)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67F = and:int(var_3_67F:int, ldc:int(2138301961))
                        var_14_10F = mul:double(ldc:double(0.5), add:double(var_9_C2:double, var_14_10F:double))
                    }
                    
                    Label_0855:
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-818251135))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1754956182))
                        goto(Label_1267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(720973397))
                        goto(Label_1126)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-803392727))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0725)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67F = and:int(var_3_67F:int, ldc:int(2145611682))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E5 = and:int(ldc:int(8803), ldc:int(1281))
                                goto(Label_1126)
                            }
                        }
                    }
                    
                    Label_0976:
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-2003389053))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-183607644))
                            goto(Label_0855)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0725)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(1660699187))
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-278929427))
                        var_11_E5 = and:int(ldc:int(14730), ldc:int(-14731))
                    }
                    
                    Label_1126:
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1381856131))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1829968828))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-922717909))
                            goto(Label_0976)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-512393837))
                            goto(Label_0855)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-679740781))
                            goto(Label_0725)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-1609713892))
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0412)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1853587309))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E5:int, ldc:int(0))) {
                                goto(Label_1410)
                            }
                        }
                    }
                    
                    Label_1267:
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-344785942))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_1126)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0976)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-2096028896))
                            goto(Label_0855)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-1990782398))
                            goto(Label_0725)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-1889032063))
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(512)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-1108539969))
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-1101570350))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10F:double, var_5_85:int, var_16_113:int)
                            goto(Label_1544)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1410:
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(643495859))
                        goto(Label_1267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1126)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(355666438))
                        goto(Label_0976)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1321109383))
                        goto(Label_0855)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0725)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0592)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1780991446))
                        goto(Label_0412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(16)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_67F = and:int(var_3_67F:int, ldc:int(-1312880))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10F:double, ldc:double(0.0))
                    Label_1544:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_68A = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E5:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1555:
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1222372760))
                        goto(Label_1126)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0976)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(269735060))
                        goto(Label_0855)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0725)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-526329698))
                        goto(Label_0592)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1039630116))
                        var_17_68A = add:int(var_16_113:int, xor:int(ldc:int(21505), ldc:int(21504)))
                        looporswitchbreak()
                    }
                    
                    var_3_67F = and:int(var_3_67F:int, ldc:int(-132233367))
                }
                
                var_3_67F = and:int(var_3_67F:int, ldc:int(1072393876))
                
                if (cmple:boolean(var_5_85 = var_17_68A:int, sub:int(var_6_8C:int, and:int(ldc:int(26633), ldc:int(4099))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(1048576)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
