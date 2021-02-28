public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u3bc9\ud217\u7006\uae87\ud171 {
    public void \u3bc9\ud217\u7006\uae87\ud171() {
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
            invokespecial:Object(Object::<init>, this:\u3bc9\ud217\u7006\uae87\ud171)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u8cae\u97e6\u64ab\uc31c\u12cb\uf9c5(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int lambda$\uc84e\u4f4a\u7bad\u4cd9\u8709\ud523$1(com.mojang.brigadier.context.CommandContext p0) {
        var_1_5F : int
        var_3_6F : ITextComponent
        stack_A6_1 : String [generated]
        expr_86 : Object[] [generated]
        var_4_A9 : TranslationTextComponent
        var_5_B5 : \u7d52\u718f\u3776\u6fb0\ub83f
        
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
            var_1_5F = and:int(ldc:int(-1633415213), ldc:int(1468485531))
            var_3_6F = invokestatic:ITextComponent(\u3c25\u5140\u7049\uae5d\ub32d::\u3e2a\u0c95\uc7fe\u74b1\u7043\u392e, p0:CommandContext, loadelement:String(getstatic:String[](\u3bc9\ud217\u7006\uae87\ud171::\uc29a\ucb79\u4daf\u8bb0\u8aa5\u1833), and:int(ldc:int(10253), ldc:int(1249))))
            stack_A6_1 = loadelement:String(getstatic:String[](\u3bc9\ud217\u7006\uae87\ud171::\uc29a\ucb79\u4daf\u8bb0\u8aa5\u1833), xor:int(ldc:int(419), ldc:int(417)))
            expr_86 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(6280), ldc:int(6282)))
            storeelement:Object(expr_86:Object[], and:int(ldc:int(18508), ldc:int(-18766)), invokevirtual:ITextComponent[expected:Object](\u8413\u5140\u64f2\uc9f6\u9937::\u2dcc\u416d\u946b\ub171\ubff1\ud7e8, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext))))
            storeelement:Object(expr_86:Object[], xor:int(ldc:int(257), ldc:int(256)), var_3_6F:ITextComponent[expected:Object])
            var_4_A9 = initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_A6_1:String, expr_86:Object[])
            var_5_B5 = invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8413\u5140\u64f2\uc9f6\u9937::\ud171\uf94d\ub6ab\u6b0d\uae5d\u6d99, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)))
            
            if (cmpeq:boolean(var_5_B5:\u7d52\u718f\u3776\u6fb0\ub83f, aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f())) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-153284683))
                invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\u3bc9\u7006\ud12e\u7c6b\u6fb0\ubf56, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)))), var_4_A9:TranslationTextComponent[expected:ITextComponent], getstatic:ChatType(ChatType::SYSTEM), getstatic:UUID(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u3d4b\uc910\ua61f\u5fe1\ub7dc\u62da))
            }
            else {
                invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\u3bc9\u7006\ud12e\u7c6b\u6fb0\ubf56, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)))), var_4_A9:TranslationTextComponent[expected:ITextComponent], getstatic:ChatType(ChatType::CHAT), invokevirtual:UUID(\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, var_5_B5:\u7d52\u718f\u3776\u6fb0\ub83f))
            }
            
            return:int(and:int(ldc:int(16699), ldc:int(581)))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\ub171\ub7dc\u7043\u69d9\uc7fe\uf995$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, and:int(ldc:int(306), ldc:int(2630))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_BF_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_11E_0 : byte[] [generated]
        stack_1B7_0 : byte[] [generated]
        stack_22E_0 : byte[] [generated]
        stack_26B_0 : byte[] [generated]
        stack_2C0_0 : byte[] [generated]
        var_4_19A : int
        var_3_19F : byte[]
        var_5_1A0 : int
        var_0_1AD : int
        expr_1B7 : byte [generated]
        stack_1F3_2 : byte [generated]
        stack_1D2_0 : byte [generated]
        expr_96 : int [generated]
        var_2_BF : byte[]
        expr_C3 : int [generated]
        var_3_25A : byte[]
        var_5_25B : int
        expr_EE : int [generated]
        var_3_2AF : byte[]
        var_5_2B0 : int
        expr_2C0 : byte [generated]
        var_3_12A : String
        stack_193_0 : String[] [generated]
        expr_13C : String[] [generated]
        
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
        var_0_5F = and:int(ldc:int(439157993), ldc:int(2076010206))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_1B7_0 = stack_22E_0 = stack_26B_0 = stack_2C0_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Mvjk9uM25f/wEBYH/wL5+gYAChIDA/gC+vIDKzEvNS0y")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_19A = expr_6B:int
        var_3_19F = newarray:byte[](byte.class, expr_6B:int)
        var_5_1A0 = expr_6B:int
        Label_0418:
        
        while (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_1AD = and:int(var_0_5F:int, ldc:int(1333514154))
            var_5_1A0 = add:int(var_5_1A0:int, ldc:int(-1))
            expr_1B7 = stack_1F3_2 = loadelement(stack_1B7_0, var_5_1A0)
            
            if (cmplt:boolean(add:int(add:int(var_5_1A0:int, ldc:int(6)), neg:int(var_4_19A:int)), ldc:int(0))) {
                stack_1F3_2 = stack_1D2_0 = add:byte(expr_1B7:byte, loadelement:byte(var_3_19F:byte[], add:int(var_5_1A0:int, ldc:int(6))))
                goto(Label_0482)
            }
            
            Label_0452:
            
            if (cmpeq:boolean(and:int(var_0_1AD:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_1AD = and:int(var_0_1AD:int, ldc:int(-1100257907))
                stack_1F3_2 = stack_1D2_0 = add:byte(expr_1B7:byte, ldc:byte(6))
            }
            
            Label_0482:
            
            if (cmpne:boolean(and:int(var_0_1AD:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0452)
            }
            
            var_0_5F = and:int(var_0_1AD:int, ldc:int(1781096187))
            storeelement:byte(var_3_19F:byte[], var_5_1A0:int, stack_1F3_2:byte)
            
            if (cmpne:boolean(var_5_1A0:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_1B7_0 = stack_22E_0 = stack_26B_0 = stack_2C0_0 = var_3_19F:byte[]
            goto(Label_0112)
        }
        
        Label_0537:
        
        while (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(171554024))
            var_5_1A0 = add:int(var_5_1A0:int, ldc:int(-1))
            storeelement:byte(var_3_19F:byte[], var_5_1A0:int, add:byte(xor:byte(loadelement:byte(stack_22E_0:byte[], var_5_1A0:int), ldc:byte(85)), ldc:byte(3)))
            
            if (cmpne:boolean(var_5_1A0:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_1B7_0 = stack_22E_0 = stack_26B_0 = stack_2C0_0 = var_3_19F:byte[]
            goto(Label_0155)
        }
        
        goto(Label_0418)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(801989745))
        }
        else {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1170227798))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_19A = expr_96:int
                var_3_19F = newarray:byte[](byte.class, expr_96:int)
                var_5_1A0 = expr_96:int
                goto(Label_0537)
            }
        }
        
        Label_0155:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1156240668))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1419157617))
            var_2_BF = stack_BF_0:byte[]
            expr_C3 = add:int(arraylength:int(stack_C1_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_3_25A = newarray:byte[](byte.class, expr_C3:int)
                var_5_25B = expr_C3:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(187301832))
                    var_5_25B = add:int(var_5_25B:int, ldc:int(-1))
                    storeelement:byte(var_3_25A:byte[], var_5_25B:int, add:int(shl:int(loadelement:byte(stack_26B_0:byte[], var_5_25B:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_BF:byte[], add:int(var_5_25B:int, and:int(ldc:int(4179), ldc:int(8353)))), ldc:int(4)), xor:int(ldc:int(17740), ldc:int(17731)))))
                    
                    if (cmpne:boolean(var_5_25B:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_1B7_0 = stack_22E_0 = stack_26B_0 = stack_2C0_0 = var_3_25A:byte[]
            }
        }
        
        Label_0200:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2048)), ldc:int(0))) {
                var_0_5F = and:int(var_0_5F:int, ldc:int(100143486))
                goto(Label_0155)
            }
            
            if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1631637587))
            expr_EE = arraylength:int(stack_EE_0:byte[])
            
            if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                var_3_2AF = newarray:byte[](byte.class, expr_EE:int)
                var_5_2B0 = expr_EE:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-805585157))
                    var_5_2B0 = add:int(var_5_2B0:int, ldc:int(-1))
                    expr_2C0 = loadelement:byte(stack_2C0_0:byte[], var_5_2B0:int)
                    storeelement:byte(var_3_2AF:byte[], var_5_2B0:int, or:int(and:int(shl:int(expr_2C0:byte, and:int(ldc:int(3125), ldc:int(12356))), ldc:int(-16)), and:int(shr:int(expr_2C0:byte[expected:int], xor:int(ldc:int(16451), ldc:int(16455))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_2B0:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_1B7_0 = stack_22E_0 = stack_26B_0 = stack_2C0_0 = var_3_2AF:byte[]
            }
        }
        
        Label_0243:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2048)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-487287226))
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0155)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(128)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(96320940))
            goto(Label_0112)
        }
        
        var_3_12A = initobject:String(String::<init>, stack_11E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_193_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(20482), ldc:int(20481)))
        expr_13C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(16900), ldc:int(16903)))
        storeelement:String(expr_13C:String[], and:int(ldc:int(17811), ldc:int(2)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(10459), ldc:int(-10460)), and:int(ldc:int(25206), ldc:int(6166))))
        storeelement:String(expr_13C:String[], and:int(ldc:int(8385), ldc:int(4113)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(9302), ldc:int(2975)), and:int(ldc:int(18685), ldc:int(14111))))
        storeelement:String(expr_13C:String[], and:int(ldc:int(19089), ldc:int(-19092)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(16671), ldc:int(9437)), and:int(ldc:int(4128), ldc:int(376))))
        putstatic:String[](\u3bc9\ud217\u7006\uae87\ud171::\uc29a\ucb79\u4daf\u8bb0\u8aa5\u1833, expr_13C:String[])
    }
    
    public void \u9a18\ub171\uc3e3\uae87\ub102\u516c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6A6 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_6B1 : int
        
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
        var_3_6A6 = and:int(ldc:int(-940188291), ldc:int(-36086345))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3bc9\ud217\u7006\uae87\ud171[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(524288)), ldc:int(0))) {
            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1532797449))
            var_5_81 = and:int(ldc:int(-15078), ldc:int(12997))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(1842), ldc:int(-1843)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_6A6:int, ldc:int(-1971323681))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(178), ldc:int(179)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(1537), ldc:int(6465)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_6A6 = and:int(var_3_D1:int, ldc:int(-1909723561))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(20624), ldc:int(20625)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1611)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1634397869))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1315)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1193)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1332248991))
                        goto(Label_1029)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(1842980816))
                        goto(Label_0898)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(1562310310))
                        goto(Label_0744)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-382191942))
                        goto(Label_0596)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(2092130848))
                    }
                    else {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1749590859))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0596)
                            }
                            
                            goto(Label_0898)
                        }
                    }
                    
                    Label_0416:
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(732441121))
                        goto(Label_1611)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1400474454))
                        goto(Label_1315)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1315082943))
                        goto(Label_1193)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-2084292626))
                        goto(Label_1029)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(1610236724))
                        goto(Label_0898)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(2034024316))
                        goto(Label_0744)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(1429466997))
                            var_11_E2 = and:int(ldc:int(12960), ldc:int(-14057))
                            goto(Label_1600)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0596:
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(286906739))
                        goto(Label_1611)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1282515090))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1315)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(18685597))
                        goto(Label_1193)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1298137470))
                        goto(Label_1029)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0898)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(727847372))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(520858116))
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1643799218))
                            loopcontinue()
                        }
                        
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-857387595))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0898)
                        }
                    }
                    
                    Label_0744:
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-74552615))
                        goto(Label_1611)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1389228297))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1315)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(2099179078))
                        goto(Label_1193)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-898420509))
                        goto(Label_1029)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-222657725))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1423802930))
                            goto(Label_0596)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(129967486))
                            loopcontinue()
                        }
                        
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(583270365))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0898:
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1833278818))
                        goto(Label_1611)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(988961931))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-2109121380))
                        goto(Label_1315)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1193)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0744)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0596)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(1559792157))
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-178224490))
                            loopcontinue()
                        }
                        
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(1469042133))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(4701), ldc:int(385))
                                goto(Label_1193)
                            }
                        }
                    }
                    
                    Label_1029:
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1611)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(921746532))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1459705655))
                        goto(Label_1315)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(1931948242))
                            goto(Label_0898)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(1354451942))
                            goto(Label_0744)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1616504146))
                            goto(Label_0596)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(1020919221))
                        var_11_E2 = and:int(ldc:int(-7582), ldc:int(6553))
                    }
                    
                    Label_1193:
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1428074508))
                        goto(Label_1611)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(350018689))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_1029)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0898)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0744)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1498803095))
                            goto(Label_0596)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-2041624026))
                            loopcontinue()
                        }
                        
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1070506051))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1450)
                            }
                        }
                    }
                    
                    Label_1315:
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1611)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(632653097))
                            goto(Label_1193)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-805286096))
                            goto(Label_1029)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1998879702))
                            goto(Label_0898)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0744)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(1535626732))
                            goto(Label_0596)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(1841659709))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1600)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1450:
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1611)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-213784039))
                        goto(Label_1315)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1193)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(1940534111))
                        goto(Label_1029)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-550527920))
                        goto(Label_0898)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1778089918))
                        goto(Label_0744)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(1523990955))
                        goto(Label_0596)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(77908723))
                        loopcontinue()
                    }
                    
                    var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-533205219))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1600:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6B1 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1611:
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1315)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(317184435))
                        goto(Label_1193)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1029)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-860302347))
                        goto(Label_0898)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0744)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0596)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1311023713))
                        var_17_6B1 = add:int(var_16_110:int, and:int(ldc:int(5377), ldc:int(35)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6A6 = and:int(var_3_6A6:int, ldc:int(123460767))
                
                if (cmple:boolean(var_5_81 = var_17_6B1:int, sub:int(var_6_88:int, xor:int(ldc:int(-32701), ldc:int(-32702))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(16)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
