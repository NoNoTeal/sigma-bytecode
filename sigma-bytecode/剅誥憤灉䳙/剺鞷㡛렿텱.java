public class \u5245\u8aa5\u61a4\u7049\u4cd9.\u527a\u97b7\u385b\ub83f\ud171 {
    public void \u527a\u97b7\u385b\ub83f\ud171() {
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
            invokespecial:Object(Object::<init>, this:\u527a\u97b7\u385b\ub83f\ud171)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u5245\u51b2\ud158\u6b5f\ud36e\u97e6(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int \ud4fe\uf94d\u7e3f\u62da\u392e\u4f52(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \ub113\uc4d2\u183a\u527a\u6435.\ub6ab\ube23\uae87\uc84e\u1833 p2, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u6c52\uceb8\uafe7\u36d3\uc2bd p3, java.util.function.Predicate<\u927d\u92ff\u71ae\uafe7\u6bb9.\u839e\u8389\ua562\uc7fe\u76bc\ube23> p4) {
        var_5_61 : int
        var_7_67 : \ube23\uc238\u5140\u4cd9\u8aa5
        var_9_E5 : int
        stack_1B7_0 : int [generated]
        stack_223_1 : String [generated]
        expr_1F0 : Object[] [generated]
        
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
        var_5_61 = and:int(ldc:int(1220255735), ldc:int(-718630953))
        var_7_67 = invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5(\u8413\u5140\u64f2\uc9f6\u9937::\ube23\u7043\ubded\u759a\u74b1\u5f50, p0:\u8413\u5140\u64f2\uc9f6\u9937)
        
        if (cmpne:boolean(p4:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>, aconstnull:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>())) {
            if (logicalnot:boolean(invokeinterface:boolean(Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>::test, p4:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>, initobject:\u839e\u8389\ua562\uc7fe\u76bc\ube23(\u839e\u8389\ua562\uc7fe\u76bc\ube23::<init>, var_7_67:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, and:int[expected:boolean](ldc:int(6167), ldc:int(8193)))))) {
                athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u527a\u97b7\u385b\ub83f\ud171::\u071d\u0a06\u385b\u4f4a\u760c\uc246)))
            }
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_5_61:int, ldc:int(2147483647)), ldc:int(0))) {
                var_5_61 = and:int(var_5_61:int, ldc:int(-2115401016))
                goto(Label_0377)
            }
            
            if (cmpeq:boolean(and:int(var_5_61:int, ldc:int(2097152)), ldc:int(0))) {
                var_5_61 = and:int(var_5_61:int, ldc:int(220644478))
                goto(Label_0310)
            }
            
            if (cmpne:boolean(and:int(var_5_61:int, ldc:int(64)), ldc:int(0))) {
                var_5_61 = and:int(var_5_61:int, ldc:int(1986788337))
                
                if (cmpeq:boolean(p3:\u6c52\uceb8\uafe7\u36d3\uc2bd, getstatic:\u6c52\uceb8\uafe7\u36d3\uc2bd(\u6c52\uceb8\uafe7\u36d3\uc2bd::\u64f2\u3d4b\u4c04\u4ab3\u5654\u8df4))) {
                    invokevirtual:boolean(\u72f1\u7ce1\ucef1\ub83f\u516c::\u0b8e\ub70c\ud12e\u965f\uf94d\u8cae, var_7_67:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u72f1\u7ce1\ucef1\ub83f\u516c], p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, and:int[expected:boolean](ldc:int(4817), ldc:int(18437)))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u3504\u99f7\ud523\ud171\u9937\u873d, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\ub6ab\ube23\uae87\uc84e\u1833::\u7330\u8753\u0a06\ub8be\ud171\uc87f, p2:\ub6ab\ube23\uae87\uc84e\u1833)))) {
                        goto(Label_0310)
                    }
                    
                    if (invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u3504\u99f7\ud523\ud171\u9937\u873d, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, var_7_67:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                        goto(Label_0377)
                    }
                    
                    goto(Label_0310)
                }
            }
            
            Label_0168:
            
            if (cmpeq:boolean(and:int(var_5_61:int, ldc:int(2097152)), ldc:int(0))) {
                var_5_61 = and:int(var_5_61:int, ldc:int(1717625527))
                goto(Label_0377)
            }
            
            if (cmpeq:boolean(and:int(var_5_61:int, ldc:int(262144)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_5_61:int, ldc:int(256)), ldc:int(0))) {
                    invokestatic:void(\u16f6\ub7dc\u8bb0\ufcaf\u67e9::\u946b\u3bc9\u718f\u3dd3\ub171\u6ec6, invokevirtual:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, var_7_67:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
                    var_9_E5 = and:int(ldc:int(345), ldc:int(8323))
                    goto(Label_0441)
                }
                
                loopcontinue()
            }
            
            Label_0310:
            
            if (cmpne:boolean(and:int(var_5_61:int, ldc:int(2147483647)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_5_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_5_61 = and:int(var_5_61:int, ldc:int(1638134525))
                    goto(Label_0168)
                }
                
                if (cmpne:boolean(and:int(var_5_61:int, ldc:int(2048)), ldc:int(0))) {
                    stack_1B7_0 = xor:int(ldc:int(2176), ldc:int(2177))
                    looporswitchbreak()
                }
                
                loopcontinue()
            }
            
            Label_0377:
            
            if (cmpeq:boolean(and:int(var_5_61:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0310)
            }
            
            if (cmpeq:boolean(and:int(var_5_61:int, ldc:int(128)), ldc:int(0))) {
                var_5_61 = and:int(var_5_61:int, ldc:int(1411734662))
                goto(Label_0168)
            }
            
            if (cmpeq:boolean(and:int(var_5_61:int, ldc:int(262144)), ldc:int(0))) {
                stack_1B7_0 = and:int(ldc:int(-7879), ldc:int(7366))
                looporswitchbreak()
            }
        }
        
        var_9_E5 = stack_1B7_0:int
        Label_0441:
        
        if (logicaland:boolean(cmpne:boolean(var_9_E5:int, ldc:int(0)), logicalnot:boolean(invokevirtual:boolean(\ub6ab\ube23\uae87\uc84e\u1833::\u1833\u446c\u6b5f\u392e\u071d\u6b5f, p2:\ub6ab\ube23\uae87\uc84e\u1833, var_7_67:\ube23\uc238\u5140\u4cd9\u8aa5, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, xor:int(ldc:int(20864), ldc:int(20866)))))) {
            athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u527a\u97b7\u385b\ub83f\ud171::\u071d\u0a06\u385b\u4f4a\u760c\uc246)))
        }
        
        invokevirtual:void(\ube23\uc238\u5140\u4cd9\u8aa5::\uc3e3\u8aa5\uc910\ud217\u5db4\uafe7, var_7_67:\ube23\uc238\u5140\u4cd9\u8aa5, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\ub6ab\ube23\uae87\uc84e\u1833::\u7330\u8753\u0a06\ub8be\ud171\uc87f, p2:\ub6ab\ube23\uae87\uc84e\u1833)))
        stack_223_1 = loadelement:String(getstatic:String[](\u527a\u97b7\u385b\ub83f\ud171::\u9255\u61a4\ua3b4\u6c52\ud36e\u3711), xor:int(ldc:int(226), ldc:int(228)))
        expr_1F0 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(2586), ldc:int(2585)))
        storeelement:Object(expr_1F0:Object[], and:int(ldc:int(12306), ldc:int(-12307)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])))
        storeelement:Object(expr_1F0:Object[], and:int(ldc:int(9993), ldc:int(2133)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])))
        storeelement:Object(expr_1F0:Object[], xor:int(ldc:int(-27631), ldc:int(-27629)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])))
        invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_223_1:String, expr_1F0:Object[]), xor:int[expected:boolean](ldc:int(1536), ldc:int(1537)))
        return:int(and:int(ldc:int(2097), ldc:int(21639)))
    }
    
    private static int lambda$\u12cb\u4cd9\u392e\u071d\uf995\u3e2a$5(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u527a\u97b7\u385b\ub83f\ud171::\ud4fe\uf94d\u7e3f\u62da\u392e\u4f52, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\u527a\u97b7\u385b\ub83f\ud171::\u9255\u61a4\ua3b4\u6c52\ud36e\u3711), and:int(ldc:int(12801), ldc:int(16449)))), invokestatic:\ub6ab\ube23\uae87\uc84e\u1833(\ub1b9\u59ec\u9033\u8389\u62da::\u1187\u8640\u3e75\ubefe\u4d85\ubff1, p0:CommandContext, loadelement:String(getstatic:String[](\u527a\u97b7\u385b\ub83f\ud171::\u9255\u61a4\ua3b4\u6c52\ud36e\u3711), and:int(ldc:int(6210), ldc:int(17414)))), getstatic:\u6c52\uceb8\uafe7\u36d3\uc2bd(\u6c52\uceb8\uafe7\u36d3\uc2bd::\u92ff\u759a\u6d99\u7af6\u36d3\u392e), checkcast:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>(java.util.function.Predicate<\u927d\u92ff\u71ae\uafe7\u6bb9.\u839e\u8389\ua562\uc7fe\u76bc\ube23>.class, aconstnull:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>())))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u7bad\u9af2\u4bc8\u97b7\u4ab3\ud4fe$4(com.mojang.brigadier.context.CommandContext p0) {
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
    
    private static boolean lambda$\uc7fe\ufcaf\u56bd\ubefe\ud12e\u9937$3(\u927d\u92ff\u71ae\uafe7\u6bb9.\u839e\u8389\ua562\uc7fe\u76bc\ube23 p0) {
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
            return:boolean(invokeinterface:boolean(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\u416d\ub113\u8bb0\u416d\u946b\u3504, invokevirtual:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a(\u839e\u8389\ua562\uc7fe\u76bc\ube23::\ua068\u51fa\u4c04\u4c2b\u8389\ub171, p0:\u839e\u8389\ua562\uc7fe\u76bc\ube23), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u839e\u8389\ua562\uc7fe\u76bc\ube23::\uc229\ub1b9\u3d64\u4cd9\u7ce1\u3bc9, p0:\u839e\u8389\ua562\uc7fe\u76bc\ube23)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u40a9\u92ff\ub19c\ud36e\u8350\u8389$2(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u527a\u97b7\u385b\ub83f\ud171::\ud4fe\uf94d\u7e3f\u62da\u392e\u4f52, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\u527a\u97b7\u385b\ub83f\ud171::\u9255\u61a4\ua3b4\u6c52\ud36e\u3711), and:int(ldc:int(5197), ldc:int(18979)))), invokestatic:\ub6ab\ube23\uae87\uc84e\u1833(\ub1b9\u59ec\u9033\u8389\u62da::\u1187\u8640\u3e75\ubefe\u4d85\ubff1, p0:CommandContext, loadelement:String(getstatic:String[](\u527a\u97b7\u385b\ub83f\ud171::\u9255\u61a4\ua3b4\u6c52\ud36e\u3711), and:int(ldc:int(8195), ldc:int(19526)))), getstatic:\u6c52\uceb8\uafe7\u36d3\uc2bd(\u6c52\uceb8\uafe7\u36d3\uc2bd::\u64f2\u3d4b\u4c04\u4ab3\u5654\u8df4), checkcast:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>(java.util.function.Predicate<\u927d\u92ff\u71ae\uafe7\u6bb9.\u839e\u8389\ua562\uc7fe\u76bc\ube23>.class, aconstnull:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>())))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\uc31c\u7049\uc84e\u8413\uae5d\u392e$1(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u527a\u97b7\u385b\ub83f\ud171::\ud4fe\uf94d\u7e3f\u62da\u392e\u4f52, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\u527a\u97b7\u385b\ub83f\ud171::\u9255\u61a4\ua3b4\u6c52\ud36e\u3711), xor:int(ldc:int(5154), ldc:int(5155)))), invokestatic:\ub6ab\ube23\uae87\uc84e\u1833(\ub1b9\u59ec\u9033\u8389\u62da::\u1187\u8640\u3e75\ubefe\u4d85\ubff1, p0:CommandContext, loadelement:String(getstatic:String[](\u527a\u97b7\u385b\ub83f\ud171::\u9255\u61a4\ua3b4\u6c52\ud36e\u3711), xor:int(ldc:int(16384), ldc:int(16386)))), getstatic:\u6c52\uceb8\uafe7\u36d3\uc2bd(\u6c52\uceb8\uafe7\u36d3\uc2bd::\u92ff\u759a\u6d99\u7af6\u36d3\u392e), checkcast:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>(java.util.function.Predicate<\u927d\u92ff\u71ae\uafe7\u6bb9.\u839e\u8389\ua562\uc7fe\u76bc\ube23>.class, aconstnull:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>())))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u74b1\ubded\u61a4\u59ec\u7bad\uceb8$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, xor:int(ldc:int(4123), ldc:int(4121))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_61 : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_9E_0 : byte[] [generated]
        stack_A0_0 : byte[] [generated]
        stack_C6_0 : byte[] [generated]
        stack_C8_0 : byte[] [generated]
        stack_ED_0 : byte[] [generated]
        stack_276_0 : byte[] [generated]
        stack_2FD_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_20E : byte[]
        var_4_20F : int
        expr_A0 : int [generated]
        var_5_25F : int
        var_3_264 : byte[]
        var_4_265 : int
        var_0_290 : int
        expr_276 : byte [generated]
        stack_2C8_2 : byte [generated]
        stack_29C_0 : byte [generated]
        expr_C8 : int [generated]
        var_3_2EB : byte[]
        var_4_2EC : int
        expr_303 : byte [generated]
        var_3_F9 : String
        expr_101 : String[] [generated]
        expr_10B : String[] [generated]
        
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
            var_0_61 = and:int(ldc:int(1072870256), ldc:int(800450520))
            expr_68 = var_2_6C = stack_9E_0 = stack_A0_0 = stack_C6_0 = stack_C8_0 = stack_ED_0 = stack_276_0 = stack_2FD_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("ODQQICAwCAAQLCgkcs1XxGf4NBAgEyE0IBQcBCQwCAAQLCgkcs1XxGf4NBAgEw1YJ8AYKEAb/ChcKCv4d/gANEAj0EQT9G/MOBgoV8Rn+DQQIDMA"))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_20E = newarray:byte[](byte.class, expr_70:int)
                var_4_20F = expr_70:int
                
                loop {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-309747721))
                    var_4_20F = add:int(var_4_20F:int, ldc:int(-1))
                    storeelement:byte(var_3_20E:byte[], var_4_20F:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_20F:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_20F:int, and:int(ldc:int(1001), ldc:int(25603)))), ldc:int(6)), and:int(ldc:int(8291), ldc:int(1283)))))
                    
                    if (cmpne:boolean(var_4_20F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A0_0 = stack_9E_0 = stack_C6_0 = stack_C8_0 = stack_ED_0 = stack_276_0 = stack_2FD_0 = var_3_20E:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(1)), ldc:int(0))) {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-1476815527))
                    goto(Label_0205)
                }
                
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(262144)), ldc:int(0))) {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-2117686359))
                }
                else {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-285831344))
                    expr_A0 = arraylength:int(stack_A0_0:byte[])
                    
                    if (cmpne:boolean(expr_A0:int, ldc:int(0))) {
                        var_5_25F = expr_A0:int
                        var_3_264 = newarray:byte[](byte.class, expr_A0:int)
                        var_4_265 = expr_A0:int
                        
                        loop {
                            var_0_290 = and:int(var_0_61:int, ldc:int(-1342337168))
                            var_4_265 = add:int(var_4_265:int, ldc:int(-1))
                            expr_276 = stack_2C8_2 = loadelement(stack_276_0, var_4_265)
                            
                            if (cmplt:boolean(add:int(add:int(var_4_265:int, ldc:int(1)), neg:int(var_5_25F:int)), ldc:int(0))) {
                                stack_2C8_2 = stack_29C_0 = add:byte(expr_276:byte, loadelement:byte(var_3_264:byte[], add:int(var_4_265:int, ldc:int(1))))
                                goto(Label_0684)
                            }
                            
                            Label_0643:
                            
                            if (cmpeq:boolean(and:int(var_0_290:int, ldc:int(134217728)), ldc:int(0))) {
                                var_0_290 = and:int(var_0_290:int, ldc:int(-1550382946))
                            }
                            else {
                                var_0_290 = and:int(var_0_290:int, ldc:int(-1367101477))
                                stack_2C8_2 = stack_29C_0 = add:byte(expr_276:byte, ldc:byte(1))
                            }
                            
                            Label_0684:
                            
                            if (cmpeq:boolean(and:int(var_0_290:int, ldc:int(67108864)), ldc:int(0))) {
                                var_0_290 = and:int(var_0_290:int, ldc:int(265182299))
                                goto(Label_0643)
                            }
                            
                            var_0_61 = and:int(var_0_290:int, ldc:int(-51644427))
                            storeelement:byte(var_3_264:byte[], var_4_265:int, stack_2C8_2:byte)
                            
                            if (cmpne:boolean(var_4_265:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A0_0 = stack_9E_0 = stack_C6_0 = stack_C8_0 = stack_ED_0 = stack_276_0 = stack_2FD_0 = var_3_264:byte[]
                    }
                }
                
                Label_0165:
                
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(67108864)), ldc:int(0))) {
                    var_0_61 = and:int(var_0_61:int, ldc:int(1028642832))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_61 = and:int(var_0_61:int, ldc:int(1859040220))
                    expr_C8 = arraylength:int(stack_C8_0:byte[])
                    
                    if (cmpne:boolean(expr_C8:int, ldc:int(0))) {
                        var_3_2EB = newarray:byte[](byte.class, expr_C8:int)
                        var_4_2EC = expr_C8:int
                        
                        loop {
                            var_0_61 = and:int(var_0_61:int, ldc:int(-326379661))
                            var_4_2EC = add:int(var_4_2EC:int, ldc:int(-1))
                            expr_303 = xor:byte(add:byte(loadelement:byte(stack_2FD_0:byte[], var_4_2EC:int), ldc:byte(46)), ldc:byte(77))
                            storeelement:byte(var_3_2EB:byte[], var_4_2EC:int, or:int(and:int(shl:int(expr_303:byte, and:int(ldc:int(8223), ldc:int(1092))), ldc:int(-16)), and:int(shr:int(expr_303:byte[expected:int], xor:int(ldc:int(-26111), ldc:int(-26107))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_4_2EC:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A0_0 = stack_9E_0 = stack_C6_0 = stack_C8_0 = stack_ED_0 = stack_276_0 = stack_2FD_0 = var_3_2EB:byte[]
                    }
                }
                
                Label_0205:
                
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0165)
                }
                
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(8)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_61 = and:int(var_0_61:int, ldc:int(329393812))
            }
            
            var_3_F9 = initobject:String(String::<init>, stack_ED_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_101 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4104), ldc:int(4096)))
            expr_10B = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(1155), ldc:int(1163)))
            storeelement:String(expr_10B:String[], and:int(ldc:int(27906), ldc:int(738)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(14912), ldc:int(-15045)), xor:int(ldc:int(9728), ldc:int(9733))))
            storeelement:String(expr_101:String[], and:int(ldc:int(13063), ldc:int(19479)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(8351), ldc:int(869)), xor:int(ldc:int(21013), ldc:int(21000))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(806), ldc:int(800)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(10301), ldc:int(21085)), xor:int(ldc:int(125), ldc:int(75))))
            storeelement:String(expr_10B:String[], and:int(ldc:int(1059), ldc:int(4611)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(2167), ldc:int(8502)), and:int(ldc:int(9277), ldc:int(4735))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(-32762), ldc:int(-32766)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(-24548), ldc:int(-24543)), and:int(ldc:int(97), ldc:int(67))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(4420), ldc:int(4421)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(65), ldc:int(26051)), and:int(ldc:int(5196), ldc:int(10614))))
            storeelement:String(expr_10B:String[], and:int(ldc:int(4613), ldc:int(1375)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(196), ldc:int(1101)), and:int(ldc:int(12635), ldc:int(16975))))
            storeelement:String(expr_10B:String[], and:int(ldc:int(-12512), ldc:int(8285)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(18947), ldc:int(19016)), xor:int(ldc:int(-28548), ldc:int(-28625))))
            putstatic:String[](\u527a\u97b7\u385b\ub83f\ud171::\u9255\u61a4\ua3b4\u6c52\ud36e\u3711, expr_10B:String[])
            putstatic:SimpleCommandExceptionType(\u527a\u97b7\u385b\ub83f\ud171::\u071d\u0a06\u385b\u4f4a\u760c\uc246, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(expr_101:String[], and:int(ldc:int(16679), ldc:int(8407))))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u960f\ud171\u3776\u36d3\ud523\u156b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6C5 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_6D0 : int
        
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
        var_3_6C5 = and:int(ldc:int(-306976242), ldc:int(-726627410))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u527a\u97b7\u385b\ub83f\ud171[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(16)), ldc:int(0))) {
            var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-625452495))
        }
        else {
            var_3_6C5 = and:int(var_3_6C5:int, ldc:int(1738185643))
            var_5_8A = and:int(ldc:int(9617), ldc:int(-13778))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(9293), ldc:int(-9312)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_6C5:int, ldc:int(-270820533))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, xor:int(ldc:int(-32656), ldc:int(-32655)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(-32184), ldc:int(-32183)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_6C5 = and:int(var_3_E3:int, ldc:int(-52518950))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(8705), ldc:int(20513)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1620)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-73293209))
                        goto(Label_1473)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1328)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-1360946793))
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1044)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-1832897712))
                        goto(Label_0893)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(1890442266))
                        goto(Label_0744)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0601)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-481873812))
                    }
                    else {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(1186966202))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0601)
                            }
                            
                            goto(Label_0893)
                        }
                    }
                    
                    Label_0428:
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1473)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-1302556336))
                        goto(Label_1328)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(1830597130))
                        goto(Label_1213)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1044)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(1272366125))
                        goto(Label_0893)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0744)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(241917710))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-1657127998))
                            loopcontinue()
                        }
                        
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-956457185))
                        var_11_F4 = and:int(ldc:int(-5922), ldc:int(5921))
                        goto(Label_1609)
                    }
                    
                    Label_0601:
                    
                    if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(1703651349))
                        goto(Label_1620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1473)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1328)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-621565077))
                        goto(Label_1213)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1044)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(1540770127))
                        goto(Label_0893)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(1157649212))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6C5 = and:int(var_3_6C5:int, ldc:int(239643463))
                            goto(Label_0428)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6C5 = and:int(var_3_6C5:int, ldc:int(1921214348))
                            loopcontinue()
                        }
                        
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(1995542107))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0893)
                        }
                    }
                    
                    Label_0744:
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-2039639882))
                        goto(Label_1620)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(1575097881))
                        goto(Label_1473)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-42775398))
                        goto(Label_1328)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(1446295473))
                        goto(Label_1044)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(1279088850))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-1105524884))
                            goto(Label_0601)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0428)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(1593227822))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0893:
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(1206602957))
                        goto(Label_1620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(428725728))
                        goto(Label_1473)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(555897210))
                        goto(Label_1328)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-590848350))
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-592119318))
                            goto(Label_0744)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-524112901))
                            goto(Label_0601)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0428)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-979925872))
                            loopcontinue()
                        }
                        
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(1823906506))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = and:int(ldc:int(10505), ldc:int(17473))
                                goto(Label_1213)
                            }
                        }
                    }
                    
                    Label_1044:
                    
                    if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(539248119))
                        goto(Label_1620)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(2016150221))
                        goto(Label_1473)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1328)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(1808270328))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0893)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0744)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-1400042590))
                            goto(Label_0601)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6C5 = and:int(var_3_6C5:int, ldc:int(1841328642))
                            goto(Label_0428)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(1306447567))
                        var_11_F4 = and:int(ldc:int(13922), ldc:int(-14183))
                    }
                    
                    Label_1213:
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(1681057956))
                        goto(Label_1620)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1473)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-1519997947))
                            goto(Label_1044)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-1448671245))
                            goto(Label_0893)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0744)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0601)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0428)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-407728145))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1473)
                            }
                        }
                    }
                    
                    Label_1328:
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1620)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(438658019))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_1213)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6C5 = and:int(var_3_6C5:int, ldc:int(622835574))
                            goto(Label_1044)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0893)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-80180171))
                            goto(Label_0744)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6C5 = and:int(var_3_6C5:int, ldc:int(634035817))
                            goto(Label_0601)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0428)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-268699006))
                            loopcontinue()
                        }
                        
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(1306304378))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1609)
                    }
                    
                    Label_1473:
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-1333389808))
                        goto(Label_1620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-1478082344))
                        goto(Label_1328)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1044)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0893)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0744)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-1080199316))
                        goto(Label_0601)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-1596128739))
                        goto(Label_0428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(67108864)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6C5 = and:int(var_3_6C5:int, ldc:int(1859172958))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1609:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6D0 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1620:
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-1212501477))
                        goto(Label_1473)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-19515554))
                        goto(Label_1328)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1044)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-776079224))
                        goto(Label_0893)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0744)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(1553984399))
                        goto(Label_0601)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0428)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-976164257))
                        var_17_6D0 = add:int(var_16_122:int, and:int(ldc:int(2071), ldc:int(16641)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6C5 = and:int(var_3_6C5:int, ldc:int(1609673226))
                
                if (cmple:boolean(var_5_8A = var_17_6D0:int, sub:int(var_6_91:int, xor:int(ldc:int(6209), ldc:int(6208))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_6C5:int, ldc:int(1024)), ldc:int(0))) {
            var_3_6C5 = and:int(var_3_6C5:int, ldc:int(-890741852))
            goto(Label_0108)
        }
    }
}
