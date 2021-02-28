public final class \u12b2\u4e72\u8df4\u67e9\u67e9.\u4daf\ud158\u3504\u69d9\u927d\uf9c5 {
    public void \u4daf\ud158\u3504\u69d9\u927d\uf9c5() {
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
            invokespecial:\u5d20\u6bb9\ub113\u983f\u47c2\u718f(\u5d20\u6bb9\ub113\u983f\u47c2\u718f::<init>, this:\u4daf\ud158\u3504\u69d9\u927d\uf9c5)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0a06\u93a2\ud7e8\u6198\u156b\u8640() {
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
    
    private static void lambda$\u3bc9\u5db4\ua3b4\u5d20\ubb2b\u4e72$1(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p0) {
        var_3_90 : String
        
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
            invokevirtual:void(\u4f52\u6bb9\u965f\u6435\u8c8a\u516c::\u6198\u4daf\u5245\u34df\ub18d\uc7fe, checkcast:\uc7fe\ufcaf\u56bd\ubefe\ud12e\u9937[expected:\u4f52\u6bb9\u965f\u6435\u8c8a\u516c](\u516c\u3d64\u718f\ub171\u6b5f.\uc7fe\ufcaf\u56bd\ubefe\ud12e\u9937.class, invokevirtual:\uc7fe\ufcaf\u56bd\ubefe\ud12e\u9937(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u4d85\u71f1\u6435\u1833\u1187\u6435, invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4), ldc:Class<\uc7fe\ufcaf\u56bd\ubefe\ud12e\u9937>(\u516c\u3d64\u718f\ub171\u6b5f.\uc7fe\ufcaf\u56bd\ubefe\ud12e\u9937.class))), invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u120d\u51b2\u071d\u071d\u5140\u0800, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u6198\u4975\ub83f\ub7dc\u3d64\u5140), and:int(ldc:int(23648), ldc:int(-23649))))), getstatic:\u62da\u8389\uceb8\uc4d2\u7d52\u51b2[expected:\ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3](\u62da\u8389\uceb8\uc4d2\u7d52\u51b2::\ub32d\u5f50\ub171\u759a\ub6ab\ubefe))
            var_3_90 = checkcast:String(java.lang.String.class, invokevirtual:String(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u7ce1\uc238\u946b\ubb2b\ua6bd\u12b2, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<String>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u0c95\ube23\u12cb\u839e\ucb79\u56bd)))
            invokevirtual:Object(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Object>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1))
            invokevirtual:Boolean(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8))
            invokevirtual:Boolean(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8))
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8), invokestatic:Boolean(Boolean::valueOf, and:int[expected:boolean](ldc:int(-24222), ldc:int(19485))))
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8), invokestatic:Boolean(Boolean::valueOf, invokevirtual:boolean(String::equals, var_3_90:String, loadelement:String[expected:Object](getstatic:String[](\u4daf\ud158\u3504\u69d9\u927d\uf9c5::\u5d20\u946b\u3776\u6fb0\u6435\ub6ab), and:int(ldc:int(2160), ldc:int(-2161))))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u7bad\u760c\u93a2\u8bb0\u51fa\u120d$0(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p0) {
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
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Byte>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u7330\u16f6\ucfaf\u6435\u8753\u4cd9), invokestatic:Byte(Byte::valueOf, ldc:byte(-1)))
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<String[]>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u5bc4\uc84e\u36d3\ud158\u98a4\u983f), invokestatic:String[](\u8d90\ua562\u7873\u760c\u494c\uc246::\uc238\uc87f\ud217\uafe7\uc229\ufe34))
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\ub83f\u6c52\u12cb\u3c25\u3776>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u3bc9\u5fe1\u4ab3\ub70c\u600f\u6fb0), getstatic:\ub83f\u6c52\u12cb\u3c25\u3776(\u8d90\ua562\u7873\u760c\u494c\uc246::\u62da\u836c\u7873\ub1b9\u8258\u0c95))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_177 : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_BF_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_F4_0 : byte[] [generated]
        stack_F6_0 : byte[] [generated]
        stack_11E_0 : byte[] [generated]
        stack_189_0 : byte[] [generated]
        stack_208_0 : byte[] [generated]
        stack_242_0 : byte[] [generated]
        stack_297_0 : byte[] [generated]
        var_4_164 : int
        var_3_169 : byte[]
        var_5_16A : int
        var_0_17F : int
        expr_189 : byte [generated]
        stack_1C5_2 : byte [generated]
        stack_1A4_0 : byte [generated]
        expr_96 : int [generated]
        var_2_BF : byte[]
        expr_C3 : int [generated]
        var_3_231 : byte[]
        var_5_232 : int
        expr_F6 : int [generated]
        var_3_286 : byte[]
        var_5_287 : int
        expr_297 : byte [generated]
        var_3_12A : String
        stack_15D_0 : String[] [generated]
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
        var_0_177 = and:int(ldc:int(-1868916228), ldc:int(-783630858))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_BF_0 = stack_C1_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_189_0 = stack_208_0 = stack_242_0 = stack_297_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("49ZxlkY=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_164 = expr_6B:int
        var_3_169 = newarray:byte[](byte.class, expr_6B:int)
        var_5_16A = expr_6B:int
        Label_0364:
        
        while (cmpne:boolean(and:int(var_0_177:int, ldc:int(4096)), ldc:int(0))) {
            var_0_17F = and:int(var_0_177:int, ldc:int(-2026659980))
            var_5_16A = add:int(var_5_16A:int, ldc:int(-1))
            expr_189 = stack_1C5_2 = loadelement(stack_189_0, var_5_16A)
            
            if (cmplt:boolean(add:int(add:int(var_5_16A:int, ldc:int(4)), neg:int(var_4_164:int)), ldc:int(0))) {
                stack_1C5_2 = stack_1A4_0 = add:byte(expr_189:byte, loadelement:byte(var_3_169:byte[], add:int(var_5_16A:int, ldc:int(4))))
                goto(Label_0436)
            }
            
            Label_0406:
            
            if (cmpne:boolean(and:int(var_0_17F:int, ldc:int(32)), ldc:int(0))) {
                var_0_17F = and:int(var_0_17F:int, ldc:int(-495191172))
                stack_1C5_2 = stack_1A4_0 = add:byte(expr_189:byte, ldc:byte(4))
            }
            
            Label_0436:
            
            if (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0406)
            }
            
            var_0_177 = and:int(var_0_17F:int, ldc:int(1345567735))
            storeelement:byte(var_3_169:byte[], var_5_16A:int, stack_1C5_2:byte)
            
            if (cmpne:boolean(var_5_16A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_189_0 = stack_208_0 = stack_242_0 = stack_297_0 = var_3_169:byte[]
            goto(Label_0112)
        }
        
        var_0_177 = and:int(var_0_177:int, ldc:int(-1355191214))
        Label_0491:
        
        while (cmpne:boolean(and:int(var_0_177:int, ldc:int(64)), ldc:int(0))) {
            var_0_177 = and:int(var_0_177:int, ldc:int(72334327))
            var_5_16A = add:int(var_5_16A:int, ldc:int(-1))
            storeelement:byte(var_3_169:byte[], var_5_16A:int, xor:byte(loadelement:byte(stack_208_0:byte[], var_5_16A:int), ldc:byte(74)))
            
            if (cmpne:boolean(var_5_16A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_189_0 = stack_208_0 = stack_242_0 = stack_297_0 = var_3_169:byte[]
            goto(Label_0155)
        }
        
        var_0_177 = and:int(var_0_177:int, ldc:int(686255531))
        goto(Label_0364)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_177:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0251)
        }
        
        if (cmpeq:boolean(and:int(var_0_177:int, ldc:int(32)), ldc:int(0))) {
            var_0_177 = and:int(var_0_177:int, ldc:int(-227358911))
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_177:int, ldc:int(32768)), ldc:int(0))) {
            var_0_177 = and:int(var_0_177:int, ldc:int(923246589))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_164 = expr_96:int
                var_3_169 = newarray:byte[](byte.class, expr_96:int)
                var_5_16A = expr_96:int
                goto(Label_0491)
            }
        }
        
        Label_0155:
        
        if (cmpeq:boolean(and:int(var_0_177:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0251)
        }
        
        if (cmpne:boolean(and:int(var_0_177:int, ldc:int(2)), ldc:int(0))) {
            var_0_177 = and:int(var_0_177:int, ldc:int(623024912))
        }
        else {
            if (cmpne:boolean(and:int(var_0_177:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_177 = and:int(var_0_177:int, ldc:int(1897643383))
            var_2_BF = stack_BF_0:byte[]
            expr_C3 = add:int(arraylength:int(stack_C1_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_3_231 = newarray:byte[](byte.class, expr_C3:int)
                var_5_232 = expr_C3:int
                
                loop {
                    var_0_177 = and:int(var_0_177:int, ldc:int(-2128372233))
                    var_5_232 = add:int(var_5_232:int, ldc:int(-1))
                    storeelement:byte(var_3_231:byte[], var_5_232:int, add:int(shl:int(loadelement:byte(stack_242_0:byte[], var_5_232:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_BF:byte[], add:int(var_5_232:int, and:int(ldc:int(9489), ldc:int(18949)))), ldc:int(7)), xor:int(ldc:int(387), ldc:int(386)))))
                    
                    if (cmpne:boolean(var_5_232:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_189_0 = stack_208_0 = stack_242_0 = stack_297_0 = var_3_231:byte[]
            }
        }
        
        Label_0200:
        
        if (cmpne:boolean(and:int(var_0_177:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_177 = and:int(var_0_177:int, ldc:int(1145736410))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_177:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0155)
            }
            
            if (cmpne:boolean(and:int(var_0_177:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_177 = and:int(var_0_177:int, ldc:int(1197029372))
                goto(Label_0112)
            }
            
            var_0_177 = and:int(var_0_177:int, ldc:int(-338493961))
            expr_F6 = arraylength:int(stack_F6_0:byte[])
            
            if (cmpne:boolean(expr_F6:int, ldc:int(0))) {
                var_3_286 = newarray:byte[](byte.class, expr_F6:int)
                var_5_287 = expr_F6:int
                
                loop {
                    var_0_177 = and:int(var_0_177:int, ldc:int(19577855))
                    var_5_287 = add:int(var_5_287:int, ldc:int(-1))
                    expr_297 = loadelement:byte(stack_297_0:byte[], var_5_287:int)
                    storeelement:byte(var_3_286:byte[], var_5_287:int, add:int(or:int(and:int(shl:int(expr_297:byte, xor:int(ldc:int(3), ldc:int(7))), ldc:int(-16)), and:int(shr:int(expr_297:byte[expected:int], and:int(ldc:int(17940), ldc:int(8327))), ldc:int(15))), ldc:int(106)))
                    
                    if (cmpne:boolean(var_5_287:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_189_0 = stack_208_0 = stack_242_0 = stack_297_0 = var_3_286:byte[]
            }
        }
        
        Label_0251:
        
        if (cmpne:boolean(and:int(var_0_177:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_177:int, ldc:int(512)), ldc:int(0))) {
            var_0_177 = and:int(var_0_177:int, ldc:int(-1596823214))
            goto(Label_0155)
        }
        
        if (cmpne:boolean(and:int(var_0_177:int, ldc:int(131072)), ldc:int(0))) {
            var_3_12A = initobject:String(String::<init>, stack_11E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_15D_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2112), ldc:int(2113)))
            expr_13C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16577), ldc:int(4611)))
            storeelement:String(expr_13C:String[], and:int(ldc:int(-5210), ldc:int(4185)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(4907), ldc:int(-5932)), xor:int(ldc:int(1098), ldc:int(1102))))
            putstatic:String[](\u4daf\ud158\u3504\u69d9\u927d\uf9c5::\u5d20\u946b\u3776\u6fb0\u6435\ub6ab, expr_13C:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u6cfe\u3e75\uf94d\u071d\u3776\u74b1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_64D : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_658 : int
        
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
        var_3_64D = and:int(ldc:int(-938941083), ldc:int(-629488123))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4daf\ud158\u3504\u69d9\u927d\uf9c5[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(4)), ldc:int(0))) {
            var_3_64D = and:int(var_3_64D:int, ldc:int(1982382848))
        }
        else {
            var_3_64D = and:int(var_3_64D:int, ldc:int(2077147789))
            var_5_8A = and:int(ldc:int(-3407), ldc:int(3150))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(25408), ldc:int(-26443)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_64D:int, ldc:int(-624234691))
                    var_9_D0 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_91:int, xor:int(ldc:int(-32760), ldc:int(-32759)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, and:int(ldc:int(19), ldc:int(24769)))), var_7_A0:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_64D = and:int(var_3_E2:int, ldc:int(-15770569))
                    var_14_11D = var_7_A0:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(-31744), ldc:int(-31743)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_91:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1328)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(916517417))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1071)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0808)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0687)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1651558283))
                        goto(Label_0580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1368606176))
                    }
                    else {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-19344451))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0580)
                            }
                            
                            goto(Label_0808)
                        }
                    }
                    
                    Label_0407:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-493146760))
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-688691708))
                        goto(Label_1328)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1265242231))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1985825149))
                        goto(Label_1071)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0808)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-867831165))
                        goto(Label_0687)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-378869875))
                            var_11_F3 = and:int(ldc:int(-6174), ldc:int(6173))
                            goto(Label_1463)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0580:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1328)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1071)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0808)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-729503996))
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(823025977))
                            loopcontinue()
                        }
                        
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1846403175))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0808)
                        }
                    }
                    
                    Label_0687:
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1328)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-25924774))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1071)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1496898469))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(5182225))
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-663099097))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0808:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-243888132))
                        goto(Label_1328)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1679999466))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1071)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0687)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-1488159001))
                            loopcontinue()
                        }
                        
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-567772145))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F3 = and:int(ldc:int(12487), ldc:int(2081))
                                goto(Label_1071)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1328)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1332449191))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1973468741))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0808)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0687)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(1600307883))
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-604049385))
                        var_11_F3 = and:int(ldc:int(15371), ldc:int(-15632))
                    }
                    
                    Label_1071:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(690077282))
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1328)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1530853096))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(1644133581))
                            goto(Label_0808)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0687)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-936546363))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1328)
                            }
                        }
                    }
                    
                    Label_1186:
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-789061601))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_1071)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(16)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(86858402))
                            goto(Label_0808)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0687)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(-1368915657))
                            goto(Label_0580)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(659788780))
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_64D = and:int(var_3_64D:int, ldc:int(781928881))
                            loopcontinue()
                        }
                        
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-24126673))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_8A:int, var_16_121:int)
                        goto(Label_1463)
                    }
                    
                    Label_1328:
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-375889702))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1071)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-706368133))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0808)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0687)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-769779842))
                        goto(Label_0580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-1170469716))
                        goto(Label_0407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(1073741824)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_64D = and:int(var_3_64D:int, ldc:int(1523499061))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1463:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_658 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1474:
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-222759755))
                        goto(Label_1328)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(119183463))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(811885401))
                        goto(Label_1071)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1459237707))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(943933584))
                        goto(Label_0808)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0687)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(-229504861))
                        goto(Label_0407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_64D = and:int(var_3_64D:int, ldc:int(1330441293))
                        var_17_658 = add:int(var_16_121:int, and:int(ldc:int(33), ldc:int(9537)))
                        looporswitchbreak()
                    }
                    
                    var_3_64D = and:int(var_3_64D:int, ldc:int(1866897346))
                }
                
                var_3_64D = and:int(var_3_64D:int, ldc:int(-898042697))
                
                if (cmple:boolean(var_5_8A = var_17_658:int, sub:int(var_6_91:int, xor:int(ldc:int(516), ldc:int(517))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_64D:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_64D = and:int(var_3_64D:int, ldc:int(-237626258))
            goto(Label_0108)
        }
    }
}
