public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u071d\u16f6\u7049\u983f\uc9f6\uae5d {
    public void \u071d\u16f6\u7049\u983f\uc9f6\uae5d(\u3504\ufe34\u600f\u6b0d\u69d9.\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9 p0, java.lang.String p1, java.lang.String p2, int p3) {
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
            putfield:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9(\u071d\u16f6\u7049\u983f\uc9f6\uae5d::\u51fa\ucef1\u4975\u120d\u92ee\ud51e, this:\u071d\u16f6\u7049\u983f\uc9f6\uae5d, p0:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9)
            putfield:String(\u071d\u16f6\u7049\u983f\uc9f6\uae5d::\u4daf\ub70c\u7330\u8bb0\u3d64\u93a2, this:\u071d\u16f6\u7049\u983f\uc9f6\uae5d, p2:String)
            putfield:int(\u071d\u16f6\u7049\u983f\uc9f6\uae5d::\u965f\u4d85\u7bad\u99f7\u5d20\u3504, this:\u071d\u16f6\u7049\u983f\uc9f6\uae5d, p3:int)
            invokespecial:Thread(Thread::<init>, this:\u071d\u16f6\u7049\u983f\uc9f6\uae5d, p1:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void run() {
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
    
    private void lambda$\ubefe\uc4d2\u4bc8\uc87f\uf94d\u647c$2(java.lang.String p0) {
        stack_9E_0 : \u67e9\u4daf\u760c\ud217\ua6bd\ubff1 [generated]
        stack_9B_1 : \ua3b4\u965f\u6d99\u4492\ud4fe\u7006 [generated]
        stack_9B_2 : ITextComponent [generated]
        stack_98_1 : String [generated]
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
            stack_9E_0 = getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u647c\u8709\u7c6b\uc246\u9033\u5245, getfield:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9(\u071d\u16f6\u7049\u983f\uc9f6\uae5d::\u51fa\ucef1\u4975\u120d\u92ee\ud51e, this:\u071d\u16f6\u7049\u983f\uc9f6\uae5d))
            stack_9B_1 = invokestatic:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u8c8a\ufe34\u9af2\ucef1\uae87\u2dcc, getfield:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9(\u071d\u16f6\u7049\u983f\uc9f6\uae5d::\u51fa\ucef1\u4975\u120d\u92ee\ud51e, this:\u071d\u16f6\u7049\u983f\uc9f6\uae5d))
            stack_9B_2 = getstatic:ITextComponent(\u98a4\u8d98\u64f2\u72f1\u6c52\uc9f6::\u527a\uceb8\u6fb0\u71f1\ud36e\u3dd3)
            stack_98_1 = loadelement:String(getstatic:String[](\u071d\u16f6\u7049\u983f\uc9f6\uae5d::\u5654\u494c\u9033\ub83f\u5d20\u92ee), and:int(ldc:int(3), ldc:int(6331)))
            expr_8B = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(16392), ldc:int(16393)))
            storeelement:Object(expr_8B:Object[], and:int(ldc:int(2580), ldc:int(-2581)), p0:String[expected:Object])
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, stack_9E_0:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, initobject:\u120d\u72f1\uc229\ub70c\ud12e\u7bad(\u120d\u72f1\uc229\ub70c\ud12e\u7bad::<init>, stack_9B_1:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006, stack_9B_2:ITextComponent, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_98_1:String, expr_8B:Object[])))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u5fe1\u960f\u71f1\u8709\uf94d\u8aa5$1() {
        stack_AA_0 : \u67e9\u4daf\u760c\ud217\ua6bd\ubff1 [generated]
        stack_A7_1 : \ua3b4\u965f\u6d99\u4492\ud4fe\u7006 [generated]
        stack_A7_2 : ITextComponent [generated]
        stack_A4_1 : String [generated]
        expr_8D : Object[] [generated]
        
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
            stack_AA_0 = getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u647c\u8709\u7c6b\uc246\u9033\u5245, getfield:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9(\u071d\u16f6\u7049\u983f\uc9f6\uae5d::\u51fa\ucef1\u4975\u120d\u92ee\ud51e, this:\u071d\u16f6\u7049\u983f\uc9f6\uae5d))
            stack_A7_1 = invokestatic:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u8c8a\ufe34\u9af2\ucef1\uae87\u2dcc, getfield:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9(\u071d\u16f6\u7049\u983f\uc9f6\uae5d::\u51fa\ucef1\u4975\u120d\u92ee\ud51e, this:\u071d\u16f6\u7049\u983f\uc9f6\uae5d))
            stack_A7_2 = getstatic:ITextComponent(\u98a4\u8d98\u64f2\u72f1\u6c52\uc9f6::\u527a\uceb8\u6fb0\u71f1\ud36e\u3dd3)
            stack_A4_1 = loadelement:String(getstatic:String[](\u071d\u16f6\u7049\u983f\uc9f6\uae5d::\u5654\u494c\u9033\ub83f\u5d20\u92ee), xor:int(ldc:int(17029), ldc:int(17030)))
            expr_8D = newarray:Object[](java.lang.Object.class, and:int(ldc:int(19), ldc:int(22657)))
            storeelement:Object(expr_8D:Object[], and:int(ldc:int(-30950), ldc:int(30820)), loadelement:String[expected:Object](getstatic:String[](\u071d\u16f6\u7049\u983f\uc9f6\uae5d::\u5654\u494c\u9033\ub83f\u5d20\u92ee), and:int(ldc:int(3268), ldc:int(12295))))
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, stack_AA_0:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, initobject:\u120d\u72f1\uc229\ub70c\ud12e\u7bad(\u120d\u72f1\uc229\ub70c\ud12e\u7bad::<init>, stack_A7_1:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006, stack_A7_2:ITextComponent, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_A4_1:String, expr_8D:Object[])))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u52d3\u5f50\u7043\u6d99\u5d20\u8308$0(net.minecraft.util.text.ITextComponent p0) {
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
            invokestatic:void(\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9::\u4c2b\uf94d\u9033\u8753\u7bad\u839e, getfield:\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9(\u071d\u16f6\u7049\u983f\uc9f6\uae5d::\u51fa\ucef1\u4975\u120d\u92ee\ud51e, this:\u071d\u16f6\u7049\u983f\uc9f6\uae5d), p0:ITextComponent)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_208 : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_96_0 : byte[] [generated]
        stack_98_0 : byte[] [generated]
        stack_BE_0 : byte[] [generated]
        stack_C0_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_21B_0 : byte[] [generated]
        stack_27D_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_1A2 : byte[]
        var_4_1A3 : int
        expr_98 : int [generated]
        var_5_1F3 : int
        var_3_1F8 : byte[]
        var_4_1F9 : int
        expr_21B : byte [generated]
        var_0_273 : int
        expr_27D : byte [generated]
        stack_2AD_2 : byte [generated]
        expr_C0 : int [generated]
        var_3_FA : String
        stack_199_0 : String[] [generated]
        expr_10C : String[] [generated]
        
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
            var_0_208 = and:int(ldc:int(-495010744), ldc:int(-1242636689))
            expr_68 = var_2_6C = stack_96_0 = stack_98_0 = stack_BE_0 = stack_C0_0 = stack_EE_0 = stack_21B_0 = stack_27D_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("AUlh9Ibs83bT6NP7jnP0i3voWHZoWGf372xx9/gN6/F17m/U8W1sbHVra/qX7u/wcnTNbebta/Z08QuBgL6/OA=="))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_1A2 = newarray:byte[](byte.class, expr_70:int)
                var_4_1A3 = expr_70:int
                
                loop {
                    var_0_208 = and:int(var_0_208:int, ldc:int(-1226837764))
                    var_4_1A3 = add:int(var_4_1A3:int, ldc:int(-1))
                    storeelement:byte(var_3_1A2:byte[], var_4_1A3:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_1A3:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_1A3:int, and:int(ldc:int(24865), ldc:int(6673)))), ldc:int(3)), and:int(ldc:int(31), ldc:int(2591)))))
                    
                    if (cmpne:boolean(var_4_1A3:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_98_0 = stack_96_0 = stack_BE_0 = stack_C0_0 = stack_EE_0 = stack_21B_0 = stack_27D_0 = var_3_1A2:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_208:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0197)
                }
                
                if (cmpeq:boolean(and:int(var_0_208:int, ldc:int(8)), ldc:int(0))) {
                    var_0_208 = and:int(var_0_208:int, ldc:int(-517239904))
                    goto(Label_0157)
                }
                
                var_0_208 = and:int(var_0_208:int, ldc:int(-1193350967))
                expr_98 = arraylength:int(stack_98_0:byte[])
                
                if (cmpeq:boolean(expr_98:int, ldc:int(0))) {
                    goto(Label_0157)
                }
                
                var_5_1F3 = expr_98:int
                var_3_1F8 = newarray:byte[](byte.class, expr_98:int)
                var_4_1F9 = expr_98:int
                Label_0507:
                
                while (cmpne:boolean(and:int(var_0_208:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_208 = and:int(var_0_208:int, ldc:int(-1141510018))
                    var_4_1F9 = add:int(var_4_1F9:int, ldc:int(-1))
                    expr_21B = loadelement:byte(stack_21B_0:byte[], var_4_1F9:int)
                    storeelement:byte(var_3_1F8:byte[], var_4_1F9:int, add:int(xor:int(or:int(and:int(shl:int(expr_21B:byte, xor:int(ldc:int(20516), ldc:int(20512))), ldc:int(-16)), and:int(shr:int(expr_21B:byte[expected:int], xor:int(ldc:int(12306), ldc:int(12310))), ldc:int(15))), ldc:int(59)), ldc:int(35)))
                    
                    if (cmpne:boolean(var_4_1F9:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_BE_0 = stack_C0_0 = stack_EE_0 = stack_21B_0 = stack_27D_0 = var_3_1F8:byte[]
                    goto(Label_0157)
                }
                
                var_0_208 = and:int(var_0_208:int, ldc:int(1377060833))
                Label_0614:
                
                while (cmpne:boolean(and:int(var_0_208:int, ldc:int(262144)), ldc:int(0))) {
                    var_0_273 = and:int(var_0_208:int, ldc:int(-1601793))
                    var_4_1F9 = add:int(var_4_1F9:int, ldc:int(-1))
                    expr_27D = loadelement:byte(stack_27D_0:byte[], var_4_1F9:int)
                    
                    if (cmpge:boolean(add:int(add:int(var_4_1F9:int, ldc:int(6)), neg:int(var_5_1F3:int)), ldc:int(0))) {
                        var_0_273 = and:int(var_0_273:int, ldc:int(-447315240))
                        stack_2AD_2 = add:byte(expr_27D:byte, ldc:byte(6))
                    }
                    else {
                        stack_2AD_2 = add:byte(expr_27D:byte, loadelement:byte(var_3_1F8:byte[], add:int(var_4_1F9:int, ldc:int(6))))
                    }
                    
                    var_0_208 = and:int(var_0_273:int, ldc:int(-1419466673))
                    storeelement:byte(var_3_1F8:byte[], var_4_1F9:int, stack_2AD_2:byte)
                    
                    if (cmpne:boolean(var_4_1F9:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_BE_0 = stack_C0_0 = stack_EE_0 = stack_21B_0 = stack_27D_0 = var_3_1F8:byte[]
                    goto(Label_0197)
                }
                
                goto(Label_0507)
                Label_0157:
                
                if (cmpne:boolean(and:int(var_0_208:int, ldc:int(512)), ldc:int(0))) {
                    var_0_208 = and:int(var_0_208:int, ldc:int(-1821225618))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_208:int, ldc:int(4)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_208 = and:int(var_0_208:int, ldc:int(-278481687))
                    expr_C0 = arraylength:int(stack_C0_0:byte[])
                    
                    if (cmpne:boolean(expr_C0:int, ldc:int(0))) {
                        var_5_1F3 = expr_C0:int
                        var_3_1F8 = newarray:byte[](byte.class, expr_C0:int)
                        var_4_1F9 = expr_C0:int
                        goto(Label_0614)
                    }
                }
                
                Label_0197:
                
                if (cmpeq:boolean(and:int(var_0_208:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_208 = and:int(var_0_208:int, ldc:int(-1842358616))
                    goto(Label_0157)
                }
                
                if (cmpeq:boolean(and:int(var_0_208:int, ldc:int(512)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_208 = and:int(var_0_208:int, ldc:int(730427605))
            }
            
            var_3_FA = initobject:String(String::<init>, stack_EE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_199_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(9293), ldc:int(17285)))
            expr_10C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(5), ldc:int(23253)))
            storeelement:String(expr_10C:String[], and:int(ldc:int(2123), ldc:int(9490)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, and:int(ldc:int(3174), ldc:int(-19559)), and:int(ldc:int(16922), ldc:int(-16923))))
            storeelement:String(expr_10C:String[], xor:int(ldc:int(8274), ldc:int(8275)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, and:int(ldc:int(-9412), ldc:int(8387)), and:int(ldc:int(9409), ldc:int(265))))
            storeelement:String(expr_10C:String[], and:int(ldc:int(-27360), ldc:int(16988)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, and:int(ldc:int(2317), ldc:int(13409)), and:int(ldc:int(8219), ldc:int(3679))))
            storeelement:String(expr_10C:String[], xor:int(ldc:int(-15359), ldc:int(-15355)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, xor:int(ldc:int(264), ldc:int(275)), xor:int(ldc:int(9220), ldc:int(9251))))
            storeelement:String(expr_10C:String[], xor:int(ldc:int(-32703), ldc:int(-32702)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, and:int(ldc:int(295), ldc:int(1199)), xor:int(ldc:int(22561), ldc:int(22558))))
            putstatic:String[](\u071d\u16f6\u7049\u983f\uc9f6\uae5d::\u5654\u494c\u9033\ub83f\u5d20\u92ee, expr_10C:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u88c5\u0800\u392e\u6198\u8709\u9033(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_676 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_681 : int
        
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
        var_3_676 = and:int(ldc:int(-242300319), ldc:int(-70275087))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u071d\u16f6\u7049\u983f\uc9f6\uae5d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_676 = and:int(var_3_676:int, ldc:int(-561410753))
        }
        else {
            var_3_676 = and:int(var_3_676:int, ldc:int(-235929747))
            var_5_8A = and:int(ldc:int(18675), ldc:int(-19188))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(26146), ldc:int(-26147)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_676:int, ldc:int(-309335051))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, xor:int(ldc:int(1161), ldc:int(1160)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, and:int(ldc:int(3585), ldc:int(12707)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_676 = and:int(var_3_E3:int, ldc:int(-108078491))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(14403), ldc:int(1153)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(-751262704))
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(-472227742))
                        goto(Label_1060)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0928)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(1615185093))
                        goto(Label_0796)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(4)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(-2030944710))
                        goto(Label_0686)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(4)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(792921735))
                        goto(Label_0580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(16)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(-708535220))
                    }
                    else {
                        var_3_676 = and:int(var_3_676:int, ldc:int(-71378331))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0580)
                            }
                            
                            goto(Label_0796)
                        }
                    }
                    
                    Label_0434:
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(1058465711))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1060)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0928)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0796)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(382075466))
                        goto(Label_0686)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(256)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(-45114499))
                            var_11_F4 = and:int(ldc:int(2378), ldc:int(-10571))
                            goto(Label_1506)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0580:
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1060)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0928)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(237890535))
                        goto(Label_0796)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(2)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(753408861))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0434)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_676:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_676 = and:int(var_3_676:int, ldc:int(-370225157))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0796)
                        }
                    }
                    
                    Label_0686:
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1060)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0928)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_676:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(2131445470))
                            goto(Label_0434)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_676:int, ldc:int(128)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(1741680871))
                            loopcontinue()
                        }
                        
                        var_3_676 = and:int(var_3_676:int, ldc:int(-176238727))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0796:
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(8)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(413504304))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(512)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(-2049873910))
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1060)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_676:int, ldc:int(16)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(1820431120))
                            goto(Label_0686)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(-1142736084))
                            goto(Label_0434)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_676:int, ldc:int(2)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(-1834466570))
                            loopcontinue()
                        }
                        
                        var_3_676 = and:int(var_3_676:int, ldc:int(-13714819))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = and:int(ldc:int(12843), ldc:int(18561))
                                goto(Label_1060)
                            }
                        }
                    }
                    
                    Label_0928:
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(64)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(-437429801))
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0796)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0686)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_676:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0434)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_676 = and:int(var_3_676:int, ldc:int(-170946965))
                        var_11_F4 = and:int(ldc:int(-28495), ldc:int(18510))
                    }
                    
                    Label_1060:
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(8)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(-508402305))
                        goto(Label_1517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(146274157))
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(340781198))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_676:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(-150831556))
                            goto(Label_0928)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0796)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_676:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0686)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(1694464569))
                            goto(Label_0580)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(-1058352559))
                            goto(Label_0434)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_676:int, ldc:int(2)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(2136177713))
                            loopcontinue()
                        }
                        
                        var_3_676 = and:int(var_3_676:int, ldc:int(-306209153))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1362)
                            }
                        }
                    }
                    
                    Label_1210:
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(1818819735))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_676:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_1060)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(107409019))
                            goto(Label_0928)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(64)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(234622204))
                            goto(Label_0796)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_676:int, ldc:int(2)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(1061631823))
                            goto(Label_0686)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(64)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(1502643249))
                            goto(Label_0580)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(1)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(1298665696))
                            goto(Label_0434)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_676 = and:int(var_3_676:int, ldc:int(-36775067))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                            goto(Label_1506)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1362:
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(377269150))
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(1)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(-881359089))
                        goto(Label_1060)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0928)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0796)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(32)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(1987371326))
                        goto(Label_0686)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(598390420))
                        goto(Label_0580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(-1268653056))
                        loopcontinue()
                    }
                    
                    var_3_676 = and:int(var_3_676:int, ldc:int(-311517335))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1506:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_681 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1517:
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(2)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(721674724))
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(356613681))
                        goto(Label_1060)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(8)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(197696993))
                        goto(Label_0928)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(-726115988))
                        goto(Label_0796)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0686)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(1676749554))
                        goto(Label_0580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_676:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(959960490))
                        goto(Label_0434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(128)), ldc:int(0))) {
                        var_3_676 = and:int(var_3_676:int, ldc:int(-135360641))
                        var_17_681 = add:int(var_16_122:int, xor:int(ldc:int(2584), ldc:int(2585)))
                        looporswitchbreak()
                    }
                    
                    var_3_676 = and:int(var_3_676:int, ldc:int(-1261276828))
                }
                
                var_3_676 = and:int(var_3_676:int, ldc:int(-277942555))
                
                if (cmple:boolean(var_5_8A = var_17_681:int, sub:int(var_6_91:int, and:int(ldc:int(10241), ldc:int(4165))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_676:int, ldc:int(32)), ldc:int(0))) {
            var_3_676 = and:int(var_3_676:int, ldc:int(915574533))
            goto(Label_0108)
        }
    }
}
