public class \u494c\u4975\ua068\u0c95\uc84e.\u3bc9\u64ab\ud4fe\uc4d2\u6fb0 {
    public void \u3bc9\u64ab\ud4fe\uc4d2\u6fb0() {
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
            invokespecial:Object(Object::<init>, this:\u3bc9\u64ab\ud4fe\uc4d2\u6fb0)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \uc4d2\u4c2b\u392e\u6c52\ub8be\ud12e(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int \u600f\u97e6\uc910\u760c\ub1b9\ubded(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?> p1) {
        var_4_6B : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_5_80 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        
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
        var_4_6B = initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u8413\u5140\u64f2\uc9f6\u9937::\u59ec\ubf56\ucef1\ubcb0\ubb2b\u6435, p0:\u8413\u5140\u64f2\uc9f6\u9937))
        var_5_80 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ube23\uc238\u5140\u4cd9\u8aa5::\u40a9\u16f6\u927d\u6cfe\ub18d\u6b0d, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5(\u8413\u5140\u64f2\uc9f6\u9937::\ube23\u7043\ubded\u759a\u74b1\u5f50, p0:\u8413\u5140\u64f2\uc9f6\u9937), p1:\u5654\u9937\u72f1\ud4fe\u0c95<?>, var_4_6B:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, ldc:int(100), and:int[expected:boolean](ldc:int(18851), ldc:int(-18852)))
        
        if (cmpne:boolean(var_5_80:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56())) {
            return:int(invokestatic:int(\u3bc9\u64ab\ud4fe\uc4d2\u6fb0::\u6c52\u51b2\ubb2b\u0b8e\u3d4b\u6ec6, p0:\u8413\u5140\u64f2\uc9f6\u9937, invokevirtual:String(\u5654\u9937\u72f1\ud4fe\u0c95<C>::\u4e72\u1833\u3a62\u5f50\u183a\u9af2, p1:\u5654\u9937\u72f1\ud4fe\u0c95<?>), var_4_6B:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_5_80:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, loadelement:String(getstatic:String[](\u3bc9\u64ab\ud4fe\uc4d2\u6fb0::\u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a), xor:int(ldc:int(2062), ldc:int(2063)))))
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u3bc9\u64ab\ud4fe\uc4d2\u6fb0::\u8d90\ub1b9\u392e\u3776\ub18d\uf94d)))
    }
    
    public static int \u6c52\u51b2\ubb2b\u0b8e\u3d4b\u6ec6(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.lang.String p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p3, java.lang.String p4) {
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
    
    private static float \u64ab\uff55\u8389\u7d52\ud217\uafe7(int p0, int p1, int p2, int p3) {
        var_6_66 : int
        var_7_6B : int
        
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
            var_6_66 = sub:int(p2:int, p0:int)
            var_7_6B = sub:int(p3:int, p1:int)
            return:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u7d52\u8258\u61a4\u7049\uc3e3\u4c2b, i2f:float(add:int(mul:int(var_6_66:int, var_6_66:int), mul:int(var_7_6B:int, var_7_6B:int)))))
        }
        
        goto(Label_0006)
    }
    
    private static net.minecraft.util.text.Style lambda$\uc910\u4975\u946b\u7ce1\ucef1\u67e9$2(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, net.minecraft.util.text.Style p1) {
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
            return:Style(invokevirtual:Style(Style::setHoverEvent, invokevirtual:Style(Style::setClickEvent, invokevirtual:Style(Style::setFormatting, p1:Style, getstatic:TextFormatting(TextFormatting::GREEN)), initobject:ClickEvent(ClickEvent::<init>, getstatic:ClickEvent$Action(ClickEvent$Action::SUGGEST_COMMAND), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u3bc9\u64ab\ud4fe\uc4d2\u6fb0::\u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a), xor:int(ldc:int(578), ldc:int(582)))), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), loadelement:String(getstatic:String[](\u3bc9\u64ab\ud4fe\uc4d2\u6fb0::\u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a), xor:int(ldc:int(5136), ldc:int(5141)))), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))))), initobject:HoverEvent(HoverEvent::<init>, getstatic:HoverEvent$Action<ITextComponent>(HoverEvent$Action::SHOW_TEXT), initobject:T(TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u3bc9\u64ab\ud4fe\uc4d2\u6fb0::\u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a), xor:int(ldc:int(3072), ldc:int(3078)))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ub70c\u64ab\u3bc9\u6d69\u5140\u92ff$1(java.util.Map.Entry p0, com.mojang.brigadier.context.CommandContext p1) {
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
            return:int(invokestatic:int(\u3bc9\u64ab\ud4fe\uc4d2\u6fb0::\u600f\u97e6\uc910\u760c\ub1b9\ubded, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p1:CommandContext)), checkcast:\u5654\u9937\u72f1\ud4fe\u0c95<?>(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?>.class, invokeinterface:\u5654\u9937\u72f1\ud4fe\u0c95<?>(Entry<K, \u5654\u9937\u72f1\ud4fe\u0c95<?>>::getValue, p0:Entry<K, \u5654\u9937\u72f1\ud4fe\u0c95<?>>))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u8753\u4f4a\ufcaf\uafe7\u5245\u0a06$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, and:int(ldc:int(22659), ldc:int(586))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_8A : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_A7_0 : byte[] [generated]
        stack_A9_0 : byte[] [generated]
        stack_E9_0 : byte[] [generated]
        stack_EB_0 : byte[] [generated]
        stack_12B_0 : byte[] [generated]
        stack_12D_0 : byte[] [generated]
        stack_15A_0 : byte[] [generated]
        stack_2EB_0 : byte[] [generated]
        stack_353_0 : byte[] [generated]
        stack_3DA_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_27B : byte[]
        var_4_27C : int
        expr_A9 : int [generated]
        var_5_2CC : int
        var_3_2D1 : byte[]
        var_4_2D2 : int
        expr_2EE : byte [generated]
        var_0_36D : int
        expr_353 : byte [generated]
        stack_3A5_2 : byte [generated]
        stack_379_0 : byte [generated]
        expr_EB : int [generated]
        expr_12D : int [generated]
        var_3_3C8 : byte[]
        var_4_3C9 : int
        var_3_166 : String
        expr_16E : String[] [generated]
        expr_178 : String[] [generated]
        
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
            var_0_8A = and:int(ldc:int(-819939495), ldc:int(1266672629))
            expr_68 = var_2_6C = stack_A7_0 = stack_A9_0 = stack_E9_0 = stack_EB_0 = stack_12B_0 = stack_12D_0 = stack_15A_0 = stack_2EB_0 = stack_353_0 = stack_3DA_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("ARKeetFXEv4gQnwvbukUYG6T7lFskJEREN0UL27pFGBuk+5Rb9+trFNu7GASERLs0xGS7i7dUa/R0u9in1GTLxETodGuLuwQru4u3VGv0dLvYp4uqq1VE/0TUC0QEu6SqJ+bG94YQA=="))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_27B = newarray:byte[](byte.class, expr_70:int)
                var_4_27C = expr_70:int
                
                loop {
                    var_0_8A = and:int(var_0_8A:int, ldc:int(2077288413))
                    var_4_27C = add:int(var_4_27C:int, ldc:int(-1))
                    storeelement:byte(var_3_27B:byte[], var_4_27C:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_27C:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_27C:int, xor:int(ldc:int(-32512), ldc:int(-32511)))), ldc:int(2)), and:int(ldc:int(2175), ldc:int(20671)))))
                    
                    if (cmpne:boolean(var_4_27C:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A9_0 = stack_A7_0 = stack_E9_0 = stack_EB_0 = stack_12B_0 = stack_12D_0 = stack_15A_0 = stack_2EB_0 = stack_353_0 = stack_3DA_0 = var_3_27B:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_8A:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0306)
                }
                
                if (cmpne:boolean(and:int(var_0_8A:int, ldc:int(128)), ldc:int(0))) {
                    var_0_8A = and:int(var_0_8A:int, ldc:int(912103763))
                    goto(Label_0240)
                }
                
                if (cmpeq:boolean(and:int(var_0_8A:int, ldc:int(256)), ldc:int(0))) {
                    var_0_8A = and:int(var_0_8A:int, ldc:int(1328099301))
                    goto(Label_0174)
                }
                
                var_0_8A = and:int(var_0_8A:int, ldc:int(2117838661))
                expr_A9 = arraylength:int(stack_A9_0:byte[])
                
                if (cmpeq:boolean(expr_A9:int, ldc:int(0))) {
                    goto(Label_0174)
                }
                
                var_5_2CC = expr_A9:int
                var_3_2D1 = newarray:byte[](byte.class, expr_A9:int)
                var_4_2D2 = expr_A9:int
                Label_0724:
                
                while (cmpne:boolean(and:int(var_0_8A:int, ldc:int(1)), ldc:int(0))) {
                    var_0_8A = and:int(var_0_8A:int, ldc:int(1326821239))
                    var_4_2D2 = add:int(var_4_2D2:int, ldc:int(-1))
                    expr_2EE = xor:byte(loadelement:byte(stack_2EB_0:byte[], var_4_2D2:int), ldc:byte(68))
                    storeelement:byte(var_3_2D1:byte[], var_4_2D2:int, or:int(and:int(shl:int(expr_2EE:byte, xor:int(ldc:int(1024), ldc:int(1028))), ldc:int(-16)), and:int(shr:int(expr_2EE:byte[expected:int], and:int(ldc:int(8454), ldc:int(2580))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_4_2D2:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A9_0 = stack_A7_0 = stack_E9_0 = stack_EB_0 = stack_12B_0 = stack_12D_0 = stack_15A_0 = stack_2EB_0 = stack_353_0 = stack_3DA_0 = var_3_2D1:byte[]
                    goto(Label_0174)
                }
                
                Label_0819:
                
                while (cmpeq:boolean(and:int(var_0_8A:int, ldc:int(2048)), ldc:int(0))) {
                    var_0_36D = and:int(var_0_8A:int, ldc:int(-837814433))
                    var_4_2D2 = add:int(var_4_2D2:int, ldc:int(-1))
                    expr_353 = stack_3A5_2 = loadelement(stack_353_0, var_4_2D2)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_2D2:int, ldc:int(6)), neg:int(var_5_2CC:int)), ldc:int(0))) {
                        stack_3A5_2 = stack_379_0 = add:byte(expr_353:byte, loadelement:byte(var_3_2D1:byte[], add:int(var_4_2D2:int, ldc:int(6))))
                        goto(Label_0905)
                    }
                    
                    Label_0864:
                    
                    if (cmpne:boolean(and:int(var_0_36D:int, ldc:int(16384)), ldc:int(0))) {
                        var_0_36D = and:int(var_0_36D:int, ldc:int(-260661926))
                    }
                    else {
                        var_0_36D = and:int(var_0_36D:int, ldc:int(-812193835))
                        stack_3A5_2 = stack_379_0 = add:byte(expr_353:byte, ldc:byte(6))
                    }
                    
                    Label_0905:
                    
                    if (cmpeq:boolean(and:int(var_0_36D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_0_36D = and:int(var_0_36D:int, ldc:int(-2113826164))
                        goto(Label_0864)
                    }
                    
                    var_0_8A = and:int(var_0_36D:int, ldc:int(-289275909))
                    storeelement:byte(var_3_2D1:byte[], var_4_2D2:int, stack_3A5_2:byte)
                    
                    if (cmpne:boolean(var_4_2D2:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A9_0 = stack_A7_0 = stack_E9_0 = stack_EB_0 = stack_12B_0 = stack_12D_0 = stack_15A_0 = stack_2EB_0 = stack_353_0 = stack_3DA_0 = var_3_2D1:byte[]
                    goto(Label_0240)
                }
                
                var_0_8A = and:int(var_0_8A:int, ldc:int(1479659427))
                goto(Label_0724)
                Label_0174:
                
                if (cmpeq:boolean(and:int(var_0_8A:int, ldc:int(32768)), ldc:int(0))) {
                    var_0_8A = and:int(var_0_8A:int, ldc:int(1970012777))
                    goto(Label_0306)
                }
                
                if (cmpeq:boolean(and:int(var_0_8A:int, ldc:int(32768)), ldc:int(0))) {
                    var_0_8A = and:int(var_0_8A:int, ldc:int(-1399028856))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_8A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_0_8A = and:int(var_0_8A:int, ldc:int(-1488627013))
                        loopcontinue()
                    }
                    
                    var_0_8A = and:int(var_0_8A:int, ldc:int(-903482423))
                    expr_EB = arraylength:int(stack_EB_0:byte[])
                    
                    if (cmpne:boolean(expr_EB:int, ldc:int(0))) {
                        var_5_2CC = expr_EB:int
                        var_3_2D1 = newarray:byte[](byte.class, expr_EB:int)
                        var_4_2D2 = expr_EB:int
                        goto(Label_0819)
                    }
                }
                
                Label_0240:
                
                if (cmpne:boolean(and:int(var_0_8A:int, ldc:int(1048576)), ldc:int(0))) {
                    var_0_8A = and:int(var_0_8A:int, ldc:int(-769572890))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_8A:int, ldc:int(256)), ldc:int(0))) {
                        var_0_8A = and:int(var_0_8A:int, ldc:int(-1306375323))
                        goto(Label_0174)
                    }
                    
                    if (cmpne:boolean(and:int(var_0_8A:int, ldc:int(65536)), ldc:int(0))) {
                        var_0_8A = and:int(var_0_8A:int, ldc:int(1496552690))
                        loopcontinue()
                    }
                    
                    var_0_8A = and:int(var_0_8A:int, ldc:int(2069868383))
                    expr_12D = arraylength:int(stack_12D_0:byte[])
                    
                    if (cmpne:boolean(expr_12D:int, ldc:int(0))) {
                        var_3_3C8 = newarray:byte[](byte.class, expr_12D:int)
                        var_4_3C9 = expr_12D:int
                        
                        loop {
                            var_0_8A = and:int(var_0_8A:int, ldc:int(-546116661))
                            var_4_3C9 = add:int(var_4_3C9:int, ldc:int(-1))
                            storeelement:byte(var_3_3C8:byte[], var_4_3C9:int, add:byte(loadelement:byte(stack_3DA_0:byte[], var_4_3C9:int), ldc:byte(51)))
                            
                            if (cmpne:boolean(var_4_3C9:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A9_0 = stack_A7_0 = stack_E9_0 = stack_EB_0 = stack_12B_0 = stack_12D_0 = stack_15A_0 = stack_2EB_0 = stack_353_0 = stack_3DA_0 = var_3_3C8:byte[]
                    }
                }
                
                Label_0306:
                
                if (cmpeq:boolean(and:int(var_0_8A:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0240)
                }
                
                if (cmpeq:boolean(and:int(var_0_8A:int, ldc:int(1)), ldc:int(0))) {
                    var_0_8A = and:int(var_0_8A:int, ldc:int(562076268))
                    goto(Label_0174)
                }
                
                if (cmpne:boolean(and:int(var_0_8A:int, ldc:int(32768)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_166 = initobject:String(String::<init>, stack_15A_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_16E = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(21658), ldc:int(9037)))
            expr_178 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4231), ldc:int(4239)))
            storeelement:String(expr_178:String[], xor:int(ldc:int(521), ldc:int(524)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(5825), ldc:int(-22212)), and:int(ldc:int(9795), ldc:int(3))))
            storeelement:String(expr_178:String[], xor:int(ldc:int(-28654), ldc:int(-28650)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(8267), ldc:int(2183)), xor:int(ldc:int(10369), ldc:int(10379))))
            storeelement:String(expr_178:String[], and:int(ldc:int(5154), ldc:int(282)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(1065), ldc:int(1059)), xor:int(ldc:int(8536), ldc:int(8514))))
            storeelement:String(expr_178:String[], and:int(ldc:int(20006), ldc:int(263)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(8212), ldc:int(8206)), xor:int(ldc:int(5145), ldc:int(5163))))
            storeelement:String(expr_16E:String[], xor:int(ldc:int(16583), ldc:int(16576)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(50), ldc:int(635)), and:int(ldc:int(2376), ldc:int(16968))))
            storeelement:String(expr_178:String[], xor:int(ldc:int(20545), ldc:int(20544)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(1516), ldc:int(1444)), and:int(ldc:int(2143), ldc:int(8799))))
            storeelement:String(expr_178:String[], and:int(ldc:int(28098), ldc:int(-28099)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(2201), ldc:int(2246)), xor:int(ldc:int(17520), ldc:int(17429))))
            storeelement:String(expr_178:String[], and:int(ldc:int(16619), ldc:int(2071)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(3173), ldc:int(245)), xor:int(ldc:int(18554), ldc:int(18460))))
            putstatic:String[](\u3bc9\u64ab\ud4fe\uc4d2\u6fb0::\u0800\u8aa5\u36d3\u67e9\u52d3\u4f4a, expr_178:String[])
            putstatic:SimpleCommandExceptionType(\u3bc9\u64ab\ud4fe\uc4d2\u6fb0::\u8d90\ub1b9\u392e\u3776\ub18d\uf94d, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(expr_16E:String[], and:int(ldc:int(4231), ldc:int(1071))))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7ce1\u7873\u839e\u92ee\ucef1\u8d98(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_684 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_68F : int
        
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
        var_3_684 = and:int(ldc:int(-1794144475), ldc:int(-1310721569))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3bc9\u64ab\ud4fe\uc4d2\u6fb0[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_684 = and:int(var_3_684:int, ldc:int(-1122509515))
            var_5_81 = and:int(ldc:int(-13503), ldc:int(13468))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(20584), ldc:int(-21737)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_684:int, ldc:int(-747111339))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(7489), ldc:int(155)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(1025), ldc:int(1024)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_684 = and:int(var_3_DA:int, ldc:int(-740304515))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(2121), ldc:int(2120)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1176744004))
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(224460459))
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0550)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1090188866))
                    }
                    else {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-242239281))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0550)
                            }
                            
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-837747466))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-2070106492))
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(2101318551))
                            var_11_EB = and:int(ldc:int(-28227), ldc:int(26114))
                            goto(Label_1526)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0550:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1724913905))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1207221974))
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-274997921))
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1925259774))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1237899388))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(966756357))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-476511941))
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(657433591))
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-2026765047))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1688344580))
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0550)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-596065154))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1143492547))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0825:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(416872903))
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1842182379))
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1313119875))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(800689229))
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-241382510))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-527327242))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(972866601))
                            goto(Label_0550)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(1447532310))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1353836322))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1286104379))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(1313), ldc:int(9))
                                goto(Label_1173)
                            }
                        }
                    }
                    
                    Label_0995:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(379813574))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-123380028))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1155471074))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(1602128016))
                            goto(Label_0825)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-564981882))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-423106553))
                            goto(Label_0550)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(319806711))
                        var_11_EB = and:int(ldc:int(9159), ldc:int(-10232))
                    }
                    
                    Label_1173:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(2067886132))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0995)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0825)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-84764139))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0550)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(454026597))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1389)
                            }
                        }
                    }
                    
                    Label_1280:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(402574516))
                            goto(Label_1173)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0995)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0825)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0550)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1713903675))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1526)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1389:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1427332962))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1247792083))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1035824473))
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-860866574))
                        goto(Label_0550)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_684 = and:int(var_3_684:int, ldc:int(-1825076993))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1526:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_68F = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1537:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(834029097))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1692071655))
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1935486897))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-193342663))
                        goto(Label_0550)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1898032721))
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-707792827))
                        var_17_68F = add:int(var_16_119:int, xor:int(ldc:int(16385), ldc:int(16384)))
                        looporswitchbreak()
                    }
                    
                    var_3_684 = and:int(var_3_684:int, ldc:int(361585725))
                }
                
                var_3_684 = and:int(var_3_684:int, ldc:int(-42485987))
                
                if (cmple:boolean(var_5_81 = var_17_68F:int, sub:int(var_6_88:int, and:int(ldc:int(25105), ldc:int(2085))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1)), ldc:int(0))) {
            var_3_684 = and:int(var_3_684:int, ldc:int(-727692732))
            goto(Label_0108)
        }
    }
}
