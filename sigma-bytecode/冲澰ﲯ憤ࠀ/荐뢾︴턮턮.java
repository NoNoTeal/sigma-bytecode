public class \u51b2\u6fb0\ufcaf\u61a4\u0800.\u8350\ub8be\ufe34\ud12e\ud12e {
    public void \u8350\ub8be\ufe34\ud12e\ud12e() {
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
            invokespecial:Object(Object::<init>, this:\u8350\ub8be\ufe34\ud12e\ud12e)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u7bad\u59ec\u34df\ubefe\u7bad\u3c25(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int \u718f\u0b8e\uc4d2\ud217\u3c25\uc31c(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, float p1) {
        var_4_67 : \u34df\u4492\u71ae\uc238\u7873\uafe7
        stack_CB_1 : String [generated]
        expr_97 : Object[] [generated]
        stack_CA_1 : int [generated]
        stack_C7_0 : Locale [generated]
        stack_C7_1 : String [generated]
        expr_B7 : Object[] [generated]
        
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
        var_4_67 = invokevirtual:\u34df\u4492\u71ae\uc238\u7873\uafe7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u8413\u5140\u64f2\uc9f6\u9937::\ube23\u7043\ubded\u759a\u74b1\u5f50, p0:\u8413\u5140\u64f2\uc9f6\u9937))
        
        if (cmpne:boolean(invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\ubded\ud4fe\ua6bd\u71ae\u494c\u7330, var_4_67:\u34df\u4492\u71ae\uc238\u7873\uafe7), f2d:double(p1:float))) {
            invokevirtual:void(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u64f2\u647c\u7049\u99f7\ub102\uc29a, var_4_67:\u34df\u4492\u71ae\uc238\u7873\uafe7, f2d:double(p1:float))
            stack_CB_1 = loadelement:String(getstatic:String[](\u8350\ub8be\ufe34\ud12e\ud12e::\u927d\u7ce1\u3776\u3e75\u946b\u67e9), xor:int(ldc:int(1038), ldc:int(1027)))
            expr_97 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(321), ldc:int(1185)))
            stack_CA_1 = and:int(ldc:int(1765), ldc:int(-2032))
            stack_C7_0 = getstatic:Locale(Locale::ROOT)
            stack_C7_1 = loadelement:String(getstatic:String[](\u8350\ub8be\ufe34\ud12e\ud12e::\u927d\u7ce1\u3776\u3e75\u946b\u67e9), and:int(ldc:int(15), ldc:int(12590)))
            expr_B7 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(8197), ldc:int(5697)))
            storeelement:Object(expr_B7:Object[], and:int(ldc:int(-16260), ldc:int(16257)), invokestatic:Float[expected:Object](Float::valueOf, p1:float))
            storeelement:Object(expr_97:Object[], stack_CA_1:int, invokestatic:String(String::format, stack_C7_0:Locale, stack_C7_1:String, expr_B7:Object[]))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_CB_1:String, expr_97:Object[]), xor:int[expected:boolean](ldc:int(610), ldc:int(611)))
            return:int(f2i:int(p1:float))
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u8350\ub8be\ufe34\ud12e\ud12e::\ub113\u647c\ub19c\u7043\u4975\u6ec6)))
    }
    
    private static int \ucfaf\u71ae\uc246\uafe7\u3776\u99f7(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, float p1) {
        var_4_68 : \u34df\u4492\u71ae\uc238\u7873\uafe7
        stack_CD_1 : String [generated]
        expr_99 : Object[] [generated]
        stack_CC_1 : int [generated]
        stack_C9_0 : Locale [generated]
        stack_C9_1 : String [generated]
        expr_B9 : Object[] [generated]
        
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
        var_4_68 = invokevirtual:\u34df\u4492\u71ae\uc238\u7873\uafe7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u8413\u5140\u64f2\uc9f6\u9937::\ube23\u7043\ubded\u759a\u74b1\u5f50, p0:\u8413\u5140\u64f2\uc9f6\u9937))
        
        if (cmpne:boolean(invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u92ee\u4daf\u759a\ubded\ud217\u36d3, var_4_68:\u34df\u4492\u71ae\uc238\u7873\uafe7), f2d:double(p1:float))) {
            invokevirtual:void(\u34df\u4492\u71ae\uc238\u7873\uafe7::\uc9f6\u6b5f\u8aa5\u97b7\u6cfe\u3504, var_4_68:\u34df\u4492\u71ae\uc238\u7873\uafe7, f2d:double(p1:float))
            stack_CD_1 = loadelement:String(getstatic:String[](\u8350\ub8be\ufe34\ud12e\ud12e::\u927d\u7ce1\u3776\u3e75\u946b\u67e9), and:int(ldc:int(79), ldc:int(8479)))
            expr_99 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(8197), ldc:int(5147)))
            stack_CC_1 = and:int(ldc:int(31914), ldc:int(-31915))
            stack_C9_0 = getstatic:Locale(Locale::ROOT)
            stack_C9_1 = loadelement:String(getstatic:String[](\u8350\ub8be\ufe34\ud12e\ud12e::\u927d\u7ce1\u3776\u3e75\u946b\u67e9), xor:int(ldc:int(1156), ldc:int(1162)))
            expr_B9 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(2321), ldc:int(515)))
            storeelement:Object(expr_B9:Object[], and:int(ldc:int(9898), ldc:int(-13995)), invokestatic:Float[expected:Object](Float::valueOf, p1:float))
            storeelement:Object(expr_99:Object[], stack_CC_1:int, invokestatic:String(String::format, stack_C9_0:Locale, stack_C9_1:String, expr_B9:Object[]))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_CD_1:String, expr_99:Object[]), xor:int[expected:boolean](ldc:int(4152), ldc:int(4153)))
            return:int(f2i:int(p1:float))
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u8350\ub8be\ufe34\ud12e\ud12e::\ub8be\u7d52\u3dd3\ub171\ud158\ufcaf)))
    }
    
    private static int \u4179\u836c\uc2bd\u4e72\uf94d\u71ae(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, int p1) {
        var_4_69 : \u34df\u4492\u71ae\uc238\u7873\uafe7
        stack_A7_1 : String [generated]
        expr_97 : Object[] [generated]
        
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
        var_4_69 = invokevirtual:\u34df\u4492\u71ae\uc238\u7873\uafe7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u8413\u5140\u64f2\uc9f6\u9937::\ube23\u7043\ubded\u759a\u74b1\u5f50, p0:\u8413\u5140\u64f2\uc9f6\u9937))
        
        if (cmpne:boolean(invokevirtual:int(\u34df\u4492\u71ae\uc238\u7873\uafe7::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, var_4_69:\u34df\u4492\u71ae\uc238\u7873\uafe7), p1:int)) {
            invokevirtual:void(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u494c\uc910\u59ec\u64f2\uc3e3\u3a62, var_4_69:\u34df\u4492\u71ae\uc238\u7873\uafe7, p1:int)
            stack_A7_1 = loadelement:String(getstatic:String[](\u8350\ub8be\ufe34\ud12e\ud12e::\u927d\u7ce1\u3776\u3e75\u946b\u67e9), and:int(ldc:int(17104), ldc:int(16)))
            expr_97 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(9216), ldc:int(9217)))
            storeelement:Object(expr_97:Object[], and:int(ldc:int(940), ldc:int(-1021)), invokestatic:Integer[expected:Object](Integer::valueOf, p1:int))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_A7_1:String, expr_97:Object[]), xor:int[expected:boolean](ldc:int(195), ldc:int(194)))
            return:int(p1:int)
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u8350\ub8be\ufe34\ud12e\ud12e::\u7e3f\u1833\u6b5f\u3711\u760c\u67e9)))
    }
    
    private static int \ud523\u5245\u62da\u183a\u6435\u3a62(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, int p1) {
        var_4_69 : \u34df\u4492\u71ae\uc238\u7873\uafe7
        stack_A7_1 : String [generated]
        expr_97 : Object[] [generated]
        
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
        var_4_69 = invokevirtual:\u34df\u4492\u71ae\uc238\u7873\uafe7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u8413\u5140\u64f2\uc9f6\u9937::\ube23\u7043\ubded\u759a\u74b1\u5f50, p0:\u8413\u5140\u64f2\uc9f6\u9937))
        
        if (cmpne:boolean(invokevirtual:int(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u9033\u8bb0\u965f\ubcb0\u99f7\u99f7, var_4_69:\u34df\u4492\u71ae\uc238\u7873\uafe7), p1:int)) {
            invokevirtual:void(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u9af2\u5d20\u6c56\uc229\u8350\uc84e, var_4_69:\u34df\u4492\u71ae\uc238\u7873\uafe7, p1:int)
            stack_A7_1 = loadelement:String(getstatic:String[](\u8350\ub8be\ufe34\ud12e\ud12e::\u927d\u7ce1\u3776\u3e75\u946b\u67e9), and:int(ldc:int(1713), ldc:int(16667)))
            expr_97 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(5), ldc:int(4241)))
            storeelement:Object(expr_97:Object[], and:int(ldc:int(-32621), ldc:int(14956)), invokestatic:Integer[expected:Object](Integer::valueOf, p1:int))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_A7_1:String, expr_97:Object[]), and:int[expected:boolean](ldc:int(3841), ldc:int(8375)))
            return:int(p1:int)
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u8350\ub8be\ufe34\ud12e\ud12e::\u071d\u965f\u7330\u6c56\u16f6\u4bc8)))
    }
    
    private static int \u12b2\ubb2b\u385b\ud523\u3504\uc7fe(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
        var_3_6C : double
        stack_B8_1 : String [generated]
        expr_84 : Object[] [generated]
        stack_B7_1 : int [generated]
        stack_B4_0 : Locale [generated]
        stack_B4_1 : String [generated]
        expr_A4 : Object[] [generated]
        
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
            var_3_6C = invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\uf9c5\u8413\u760c\u8413\u624e\u4c2b, invokevirtual:\u34df\u4492\u71ae\uc238\u7873\uafe7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u8413\u5140\u64f2\uc9f6\u9937::\ube23\u7043\ubded\u759a\u74b1\u5f50, p0:\u8413\u5140\u64f2\uc9f6\u9937)))
            stack_B8_1 = loadelement:String(getstatic:String[](\u8350\ub8be\ufe34\ud12e\ud12e::\u927d\u7ce1\u3776\u3e75\u946b\u67e9), xor:int(ldc:int(4634), ldc:int(4616)))
            expr_84 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(7), ldc:int(22937)))
            stack_B7_1 = and:int(ldc:int(16796), ldc:int(-27552))
            stack_B4_0 = getstatic:Locale(Locale::ROOT)
            stack_B4_1 = loadelement:String(getstatic:String[](\u8350\ub8be\ufe34\ud12e\ud12e::\u927d\u7ce1\u3776\u3e75\u946b\u67e9), xor:int(ldc:int(-30648), ldc:int(-30629)))
            expr_A4 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(21633), ldc:int(2405)))
            storeelement:Object(expr_A4:Object[], and:int(ldc:int(21280), ldc:int(-21281)), invokestatic:Double[expected:Object](Double::valueOf, var_3_6C:double))
            storeelement:Object(expr_84:Object[], stack_B7_1:int, invokestatic:String(String::format, stack_B4_0:Locale, stack_B4_1:String, expr_A4:Object[]))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_B8_1:String, expr_84:Object[]), and:int[expected:boolean](ldc:int(-19529), ldc:int(19528)))
            return:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, add:double(var_3_6C:double, ldc:double(0.5))))
        }
        
        goto(Label_0006)
    }
    
    private static int \u0800\ub70c\u759a\u5245\u97e6\u3e2a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u6435\ub8be\u718f\u6b0d\u67e9.\ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2 p1) {
        var_4_69 : \u34df\u4492\u71ae\uc238\u7873\uafe7
        stack_10D_1 : String [generated]
        expr_A5 : Object[] [generated]
        stack_DB_1 : int [generated]
        stack_D8_0 : Locale [generated]
        stack_D8_1 : String [generated]
        expr_C5 : Object[] [generated]
        stack_10C_1 : int [generated]
        stack_109_0 : String [generated]
        expr_F6 : Object[] [generated]
        
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
        var_4_69 = invokevirtual:\u34df\u4492\u71ae\uc238\u7873\uafe7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u8413\u5140\u64f2\uc9f6\u9937::\ube23\u7043\ubded\u759a\u74b1\u5f50, p0:\u8413\u5140\u64f2\uc9f6\u9937))
        
        if (logicaland:boolean(cmpeq:boolean(invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u759a\u51fa\ud7e8\ub18d\u40a9\u4daf, var_4_69:\u34df\u4492\u71ae\uc238\u7873\uafe7), f2d:double(getfield:float(\ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2::\u51fa\ub18d\u0c95\u3c25\ubded\u3bc9, p1:\ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2))), cmpeq:boolean(invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\uc84e\u6ec6\u56bd\u4c04\u759a\u69d9, var_4_69:\u34df\u4492\u71ae\uc238\u7873\uafe7), f2d:double(getfield:float(\ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2::\uf995\u88c5\ub18d\ufcaf\ud12e\u2dcc, p1:\ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2))))) {
            athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u8350\ub8be\ufe34\ud12e\ud12e::\u6198\u56bd\u12cb\ub18d\u5f50\ubf56)))
        }
        
        invokevirtual:void(\u34df\u4492\u71ae\uc238\u7873\uafe7::\uafe7\u3bd6\uc229\u36d3\u6198\u6d99, var_4_69:\u34df\u4492\u71ae\uc238\u7873\uafe7, f2d:double(getfield:float(\ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2::\u51fa\ub18d\u0c95\u3c25\ubded\u3bc9, p1:\ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2)), f2d:double(getfield:float(\ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2::\uf995\u88c5\ub18d\ufcaf\ud12e\u2dcc, p1:\ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2)))
        stack_10D_1 = loadelement:String(getstatic:String[](\u8350\ub8be\ufe34\ud12e\ud12e::\u927d\u7ce1\u3776\u3e75\u946b\u67e9), xor:int(ldc:int(14603), ldc:int(14623)))
        expr_A5 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(16653), ldc:int(16655)))
        stack_DB_1 = and:int(ldc:int(-15401), ldc:int(15400))
        stack_D8_0 = getstatic:Locale(Locale::ROOT)
        stack_D8_1 = loadelement:String(getstatic:String[](\u8350\ub8be\ufe34\ud12e\ud12e::\u927d\u7ce1\u3776\u3e75\u946b\u67e9), xor:int(ldc:int(-29631), ldc:int(-29617)))
        expr_C5 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(2059), ldc:int(2058)))
        storeelement:Object(expr_C5:Object[], and:int(ldc:int(30490), ldc:int(-30491)), invokestatic:Float[expected:Object](Float::valueOf, getfield:float(\ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2::\u51fa\ub18d\u0c95\u3c25\ubded\u3bc9, p1:\ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2)))
        storeelement:Object(expr_A5:Object[], stack_DB_1:int, invokestatic:String(String::format, stack_D8_0:Locale, stack_D8_1:String, expr_C5:Object[]))
        stack_10C_1 = and:int(ldc:int(18977), ldc:int(9281))
        stack_109_0 = loadelement:String(getstatic:String[](\u8350\ub8be\ufe34\ud12e\ud12e::\u927d\u7ce1\u3776\u3e75\u946b\u67e9), xor:int(ldc:int(1050), ldc:int(1044)))
        expr_F6 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(1), ldc:int(8759)))
        storeelement:Object(expr_F6:Object[], and:int(ldc:int(11680), ldc:int(-15859)), invokestatic:Float[expected:Object](Float::valueOf, getfield:float(\ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2::\uf995\u88c5\ub18d\ufcaf\ud12e\u2dcc, p1:\ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2)))
        storeelement:Object(expr_A5:Object[], stack_10C_1:int, invokestatic:String(String::format, stack_109_0:String, expr_F6:Object[]))
        invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_10D_1:String, expr_A5:Object[]), and:int[expected:boolean](ldc:int(13701), ldc:int(16401)))
        return:int(and:int(ldc:int(29475), ldc:int(-29548)))
    }
    
    private static int \u4492\uc238\u156b\u183a\u3bc9\u59ec(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, double p1, long p2) {
        var_5_196 : int
        var_7_6C : \u34df\u4492\u71ae\uc238\u7873\uafe7
        var_8_73 : double
        stack_350_1 : String [generated]
        expr_30B : Object[] [generated]
        stack_33E_1 : int [generated]
        stack_33B_0 : Locale [generated]
        stack_33B_1 : String [generated]
        expr_32B : Object[] [generated]
        stack_1E9_1 : String [generated]
        expr_1B5 : Object[] [generated]
        stack_1E8_1 : int [generated]
        stack_1E5_0 : Locale [generated]
        stack_1E5_1 : String [generated]
        expr_1D5 : Object[] [generated]
        stack_2E0_1 : String [generated]
        expr_29B : Object[] [generated]
        stack_2CE_1 : int [generated]
        stack_2CB_0 : Locale [generated]
        stack_2CB_1 : String [generated]
        expr_2BB : Object[] [generated]
        
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
        var_5_196 = and:int(ldc:int(902682904), ldc:int(1910488605))
        var_7_6C = invokevirtual:\u34df\u4492\u71ae\uc238\u7873\uafe7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u8413\u5140\u64f2\uc9f6\u9937::\ube23\u7043\ubded\u759a\u74b1\u5f50, p0:\u8413\u5140\u64f2\uc9f6\u9937))
        var_8_73 = invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\uf9c5\u8413\u760c\u8413\u624e\u4c2b, var_7_6C:\u34df\u4492\u71ae\uc238\u7873\uafe7)
        
        if (cmpne:boolean(var_8_73:double, p1:double)) {
            loop {
                if (cmpne:boolean(and:int(var_5_196:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0567)
                }
                
                if (cmpne:boolean(and:int(var_5_196:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0331)
                }
                
                if (cmpeq:boolean(and:int(var_5_196:int, ldc:int(2048)), ldc:int(0))) {
                    var_5_196 = and:int(var_5_196:int, ldc:int(-1095469713))
                    goto(Label_0259)
                }
                
                if (cmpeq:boolean(and:int(var_5_196:int, ldc:int(512)), ldc:int(0))) {
                    var_5_196 = and:int(var_5_196:int, ldc:int(1677696152))
                    
                    if (cmplt:boolean(p1:double, ldc:double(1.0))) {
                        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u8350\ub8be\ufe34\ud12e\ud12e::\u59ec\u873d\u12b2\u8df4\u718f\ud158)))
                    }
                }
                
                Label_0185:
                
                if (cmpne:boolean(and:int(var_5_196:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0567)
                }
                
                if (cmpeq:boolean(and:int(var_5_196:int, ldc:int(16)), ldc:int(0))) {
                    var_5_196 = and:int(var_5_196:int, ldc:int(-1332383347))
                    goto(Label_0331)
                }
                
                if (cmpne:boolean(and:int(var_5_196:int, ldc:int(524288)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_5_196:int, ldc:int(4)), ldc:int(0))) {
                        var_5_196 = and:int(var_5_196:int, ldc:int(-156946522))
                        loopcontinue()
                    }
                    
                    var_5_196 = and:int(var_5_196:int, ldc:int(669891218))
                    
                    if (cmpgt:boolean(p1:double, ldc:double(6.0E7))) {
                        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u8350\ub8be\ufe34\ud12e\ud12e::\ub18d\u51b2\u6d99\u97e6\ub32d\uc910)))
                    }
                }
                
                Label_0259:
                
                if (cmpeq:boolean(and:int(var_5_196:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0567)
                }
                
                if (cmpeq:boolean(and:int(var_5_196:int, ldc:int(4096)), ldc:int(0))) {
                    var_5_196 = and:int(var_5_196:int, ldc:int(1934029282))
                }
                else {
                    if (cmpeq:boolean(and:int(var_5_196:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0185)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_196:int, ldc:int(16)), ldc:int(0))) {
                        var_5_196 = and:int(var_5_196:int, ldc:int(-359192600))
                        loopcontinue()
                    }
                    
                    var_5_196 = and:int(var_5_196:int, ldc:int(1810733466))
                    
                    if (cmpgt:boolean(p2:long, ldc:long(0L))) {
                        invokevirtual:void(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u8709\u416d\uae5d\u2dcc\u183a\u3776, var_7_6C:\u34df\u4492\u71ae\uc238\u7873\uafe7, var_8_73:double, p1:double, p2:long)
                        
                        if (cmple:boolean(p1:double, var_8_73:double)) {
                            goto(Label_0567)
                        }
                        
                        stack_350_1 = loadelement:String(getstatic:String[](\u8350\ub8be\ufe34\ud12e\ud12e::\u927d\u7ce1\u3776\u3e75\u946b\u67e9), and:int(ldc:int(757), ldc:int(28693)))
                        expr_30B = newarray:Object[](java.lang.Object.class, and:int(ldc:int(6979), ldc:int(9354)))
                        stack_33E_1 = and:int(ldc:int(-22717), ldc:int(22704))
                        stack_33B_0 = getstatic:Locale(Locale::ROOT)
                        stack_33B_1 = loadelement:String(getstatic:String[](\u8350\ub8be\ufe34\ud12e\ud12e::\u927d\u7ce1\u3776\u3e75\u946b\u67e9), and:int(ldc:int(20638), ldc:int(10295)))
                        expr_32B = newarray:Object[](java.lang.Object.class, and:int(ldc:int(10757), ldc:int(5257)))
                        storeelement:Object(expr_32B:Object[], and:int(ldc:int(-26888), ldc:int(18695)), invokestatic:Double[expected:Object](Double::valueOf, p1:double))
                        storeelement:Object(expr_30B:Object[], stack_33E_1:int, invokestatic:String(String::format, stack_33B_0:Locale, stack_33B_1:String, expr_32B:Object[]))
                        storeelement:Object(expr_30B:Object[], and:int(ldc:int(29445), ldc:int(2049)), invokestatic:String[expected:Object](Long::toString, div:long(p2:long, ldc:long(1000L))))
                        invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_350_1:String, expr_30B:Object[]), and:int[expected:boolean](ldc:int(33), ldc:int(12549)))
                        looporswitchbreak()
                    }
                }
                
                Label_0331:
                
                if (cmpeq:boolean(and:int(var_5_196:int, ldc:int(1024)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_5_196:int, ldc:int(2048)), ldc:int(0))) {
                        var_5_196 = and:int(var_5_196:int, ldc:int(1075785423))
                        goto(Label_0259)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_196:int, ldc:int(128)), ldc:int(0))) {
                        var_5_196 = and:int(var_5_196:int, ldc:int(1366163747))
                        goto(Label_0185)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_196:int, ldc:int(64)), ldc:int(0))) {
                        var_5_196 = and:int(var_5_196:int, ldc:int(-849437264))
                        loopcontinue()
                    }
                    
                    var_5_196 = and:int(var_5_196:int, ldc:int(-370165100))
                    invokevirtual:void(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u8709\u416d\uae5d\u2dcc\u183a\u3776, var_7_6C:\u34df\u4492\u71ae\uc238\u7873\uafe7, p1:double)
                    stack_1E9_1 = loadelement:String(getstatic:String[](\u8350\ub8be\ufe34\ud12e\ud12e::\u927d\u7ce1\u3776\u3e75\u946b\u67e9), xor:int(ldc:int(13326), ldc:int(13334)))
                    expr_1B5 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(65), ldc:int(29713)))
                    stack_1E8_1 = and:int(ldc:int(15269), ldc:int(-15334))
                    stack_1E5_0 = getstatic:Locale(Locale::ROOT)
                    stack_1E5_1 = loadelement:String(getstatic:String[](\u8350\ub8be\ufe34\ud12e\ud12e::\u927d\u7ce1\u3776\u3e75\u946b\u67e9), and:int(ldc:int(2070), ldc:int(8350)))
                    expr_1D5 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(1109), ldc:int(801)))
                    storeelement:Object(expr_1D5:Object[], and:int(ldc:int(3420), ldc:int(-27998)), invokestatic:Double[expected:Object](Double::valueOf, p1:double))
                    storeelement:Object(expr_1B5:Object[], stack_1E8_1:int, invokestatic:String(String::format, stack_1E5_0:Locale, stack_1E5_1:String, expr_1D5:Object[]))
                    invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_1E9_1:String, expr_1B5:Object[]), xor:int[expected:boolean](ldc:int(18176), ldc:int(18177)))
                    looporswitchbreak()
                }
                
                Label_0567:
                
                if (cmpeq:boolean(and:int(var_5_196:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0331)
                }
                
                if (cmpeq:boolean(and:int(var_5_196:int, ldc:int(16777216)), ldc:int(0))) {
                    var_5_196 = and:int(var_5_196:int, ldc:int(-927199024))
                    goto(Label_0259)
                }
                
                if (cmpne:boolean(and:int(var_5_196:int, ldc:int(33554432)), ldc:int(0))) {
                    var_5_196 = and:int(var_5_196:int, ldc:int(-2122899171))
                    goto(Label_0185)
                }
                
                if (cmpeq:boolean(and:int(var_5_196:int, ldc:int(64)), ldc:int(0))) {
                    var_5_196 = and:int(var_5_196:int, ldc:int(2144329629))
                    stack_2E0_1 = loadelement:String(getstatic:String[](\u8350\ub8be\ufe34\ud12e\ud12e::\u927d\u7ce1\u3776\u3e75\u946b\u67e9), xor:int(ldc:int(6), ldc:int(17)))
                    expr_29B = newarray:Object[](java.lang.Object.class, and:int(ldc:int(1322), ldc:int(25286)))
                    stack_2CE_1 = and:int(ldc:int(-22632), ldc:int(22630))
                    stack_2CB_0 = getstatic:Locale(Locale::ROOT)
                    stack_2CB_1 = loadelement:String(getstatic:String[](\u8350\ub8be\ufe34\ud12e\ud12e::\u927d\u7ce1\u3776\u3e75\u946b\u67e9), and:int(ldc:int(28694), ldc:int(182)))
                    expr_2BB = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(18689), ldc:int(18688)))
                    storeelement:Object(expr_2BB:Object[], and:int(ldc:int(6855), ldc:int(-7112)), invokestatic:Double[expected:Object](Double::valueOf, p1:double))
                    storeelement:Object(expr_29B:Object[], stack_2CE_1:int, invokestatic:String(String::format, stack_2CB_0:Locale, stack_2CB_1:String, expr_2BB:Object[]))
                    storeelement:Object(expr_29B:Object[], and:int(ldc:int(67), ldc:int(12677)), invokestatic:String[expected:Object](Long::toString, div:long(p2:long, ldc:long(1000L))))
                    invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_2E0_1:String, expr_29B:Object[]), and:int[expected:boolean](ldc:int(16525), ldc:int(2353)))
                    looporswitchbreak()
                }
                
                var_5_196 = and:int(var_5_196:int, ldc:int(-1403834789))
            }
            
            return:int(d2i:int(sub:double(p1:double, var_8_73:double)))
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u8350\ub8be\ufe34\ud12e\ud12e::\u156b\u2dcc\u97b7\u6bb9\u5245\u392e)))
    }
    
    private static int lambda$\u965f\u760c\u516c\ube23\u8d90\u6198$10(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u8350\ub8be\ufe34\ud12e\ud12e::\u4179\u836c\uc2bd\u4e72\uf94d\u71ae, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:int(IntegerArgumentType::getInteger, p0:CommandContext, loadelement:String(getstatic:String[](\u8350\ub8be\ufe34\ud12e\ud12e::\u927d\u7ce1\u3776\u3e75\u946b\u67e9), xor:int(ldc:int(320), ldc:int(323))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u0800\u67d0\uc229\u624e\u839e\u494c$9(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u8350\ub8be\ufe34\ud12e\ud12e::\ud523\u5245\u62da\u183a\u6435\u3a62, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:int(IntegerArgumentType::getInteger, p0:CommandContext, loadelement:String(getstatic:String[](\u8350\ub8be\ufe34\ud12e\ud12e::\u927d\u7ce1\u3776\u3e75\u946b\u67e9), and:int(ldc:int(19458), ldc:int(4278))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u5654\u5bc4\u873d\uc910\u392e\u3d4b$8(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u8350\ub8be\ufe34\ud12e\ud12e::\u12b2\ubb2b\u385b\ud523\u3504\uc7fe, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u5d20\u4ab3\uc31c\u92ff\u3a62\uf94d$7(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u8350\ub8be\ufe34\ud12e\ud12e::\u718f\u0b8e\uc4d2\ud217\u3c25\uc31c, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:float(FloatArgumentType::getFloat, p0:CommandContext, loadelement:String(getstatic:String[](\u8350\ub8be\ufe34\ud12e\ud12e::\u927d\u7ce1\u3776\u3e75\u946b\u67e9), xor:int(ldc:int(4609), ldc:int(4611))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u7e3f\ubf56\u69d9\u6fb0\u51fa\u3c25$6(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u8350\ub8be\ufe34\ud12e\ud12e::\ucfaf\u71ae\uc246\uafe7\u3776\u99f7, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:float(FloatArgumentType::getFloat, p0:CommandContext, loadelement:String(getstatic:String[](\u8350\ub8be\ufe34\ud12e\ud12e::\u927d\u7ce1\u3776\u3e75\u946b\u67e9), xor:int(ldc:int(8741), ldc:int(8748))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u88c5\uc246\u47c2\u4c04\u4c04\u927d$5(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u8350\ub8be\ufe34\ud12e\ud12e::\u0800\ub70c\u759a\u5245\u97e6\u3e2a, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2(\u8cae\u4cd9\u3dd3\u5fe1\u4daf::\u4e72\u67e9\u12b2\u836c\u6198\u2dcc, p0:CommandContext, loadelement:String(getstatic:String[](\u8350\ub8be\ufe34\ud12e\ud12e::\u927d\u7ce1\u3776\u3e75\u946b\u67e9), xor:int(ldc:int(8227), ldc:int(8229))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u6435\uafe7\u8640\u59ec\u1187\u8350$4(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u8350\ub8be\ufe34\ud12e\ud12e::\u4492\uc238\u156b\u183a\u3bc9\u59ec, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), f2d:double(invokestatic:float(FloatArgumentType::getFloat, p0:CommandContext, loadelement:String(getstatic:String[](\u8350\ub8be\ufe34\ud12e\ud12e::\u927d\u7ce1\u3776\u3e75\u946b\u67e9), xor:int(ldc:int(10252), ldc:int(10254))))), mul:long(i2l:long(invokestatic:int(IntegerArgumentType::getInteger, p0:CommandContext, loadelement:String(getstatic:String[](\u8350\ub8be\ufe34\ud12e\ud12e::\u927d\u7ce1\u3776\u3e75\u946b\u67e9), and:int(ldc:int(16899), ldc:int(71))))), ldc:long(1000L))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u3d4b\u51b2\uc31c\uc29a\u600f\ub18d$3(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u8350\ub8be\ufe34\ud12e\ud12e::\u4492\uc238\u156b\u183a\u3bc9\u59ec, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), f2d:double(invokestatic:float(FloatArgumentType::getFloat, p0:CommandContext, loadelement:String(getstatic:String[](\u8350\ub8be\ufe34\ud12e\ud12e::\u927d\u7ce1\u3776\u3e75\u946b\u67e9), xor:int(ldc:int(4243), ldc:int(4241))))), ldc:long(0L)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u12cb\u4c2b\u071d\u8413\u59ec\u836c$2(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u8350\ub8be\ufe34\ud12e\ud12e::\u4492\uc238\u156b\u183a\u3bc9\u59ec, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), add:double(invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\uf9c5\u8413\u760c\u8413\u624e\u4c2b, invokevirtual:\u34df\u4492\u71ae\uc238\u7873\uafe7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u8413\u5140\u64f2\uc9f6\u9937::\ube23\u7043\ubded\u759a\u74b1\u5f50, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext))))), f2d:double(invokestatic:float(FloatArgumentType::getFloat, p0:CommandContext, loadelement:String(getstatic:String[](\u8350\ub8be\ufe34\ud12e\ud12e::\u927d\u7ce1\u3776\u3e75\u946b\u67e9), xor:int(ldc:int(37), ldc:int(39)))))), add:long(invokevirtual:long(\u34df\u4492\u71ae\uc238\u7873\uafe7::\ud217\u6ec6\uc229\u7c6b\u4f52\u1187, invokevirtual:\u34df\u4492\u71ae\uc238\u7873\uafe7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u8413\u5140\u64f2\uc9f6\u9937::\ube23\u7043\ubded\u759a\u74b1\u5f50, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext))))), mul:long(i2l:long(invokestatic:int(IntegerArgumentType::getInteger, p0:CommandContext, loadelement:String(getstatic:String[](\u8350\ub8be\ufe34\ud12e\ud12e::\u927d\u7ce1\u3776\u3e75\u946b\u67e9), and:int(ldc:int(24731), ldc:int(4387))))), ldc:long(1000L)))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u8709\u8aa5\ub6ab\u6cfe\ubf56\uc2bd$1(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u8350\ub8be\ufe34\ud12e\ud12e::\u4492\uc238\u156b\u183a\u3bc9\u59ec, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), add:double(invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\uf9c5\u8413\u760c\u8413\u624e\u4c2b, invokevirtual:\u34df\u4492\u71ae\uc238\u7873\uafe7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u8413\u5140\u64f2\uc9f6\u9937::\ube23\u7043\ubded\u759a\u74b1\u5f50, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext))))), f2d:double(invokestatic:float(FloatArgumentType::getFloat, p0:CommandContext, loadelement:String(getstatic:String[](\u8350\ub8be\ufe34\ud12e\ud12e::\u927d\u7ce1\u3776\u3e75\u946b\u67e9), and:int(ldc:int(24646), ldc:int(179)))))), ldc:long(0L)))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\ud4fe\ub8be\u4e72\u7e3f\ubded\u1187$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, xor:int(ldc:int(16641), ldc:int(16643))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5DA : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_E0_0 : byte[] [generated]
        stack_110_0 : byte[] [generated]
        stack_112_0 : byte[] [generated]
        stack_13F_0 : byte[] [generated]
        stack_5ED_0 : byte[] [generated]
        stack_655_0 : byte[] [generated]
        stack_6D0_0 : byte[] [generated]
        stack_726_0 : byte[] [generated]
        var_4_5C5 : int
        var_3_5CA : byte[]
        var_5_5CB : int
        expr_5F0 : byte [generated]
        var_0_66F : int
        expr_655 : byte [generated]
        stack_69E_2 : byte [generated]
        stack_672_0 : byte [generated]
        expr_A7 : int [generated]
        var_2_DE : byte[]
        expr_E2 : int [generated]
        var_3_6BE : byte[]
        var_5_6BF : int
        expr_112 : int [generated]
        var_3_714 : byte[]
        var_5_715 : int
        var_3_14B : String
        expr_153 : String[] [generated]
        expr_15D : String[] [generated]
        var_3_4EE : String[]
        
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
        var_0_5DA = and:int(ldc:int(-1645632020), ldc:int(-1114003729))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_DE_0 = stack_E0_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_5ED_0 = stack_655_0 = stack_6D0_0 = stack_726_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Dn7VWwaERuZyeDjXFN0K5hz2x/zw8tPlBvLm5uXqv/S97hxtHNki3dV8vRbP+hRh/s3XCseYXfD8t9vHePLb8u703eocbRzZIt3VfL0Wz/oUYf7N1wrHmF0QIs/w0Zjs1eHd2dXB8BxtHNki3dV8vRbP+hRh/tPf9M18X+rm5RLhnGEE/Lnu0YTy2/Lu9N3qHG0c2SLd1Xy9Fs/6FGH+09/0zXxf6ublEuGcYSQi0QLLpOzV4d3Z1cHwHG0c2SLd1Xy9Fs/6FGH+09/0zXxf6hzm9OiWXc3s19fHePLb8u703eocbRzZIt3VfL0Wz/oUYf7T3/TNfF/qHOb06JZd7hLw7NGY7NXh3dnVwfAcbRzZIt3VfL0Wz/oUYf7VCObBbN/yveocbRzZIt3VfL0Wz/oUYR7NCGXLfrfhx4Rh5uz2V+xw4+juauYcbRzZIt3VfL0Wz/oUYR7NCGXLfrfhx4Rh5fQC3/Bs9gTy5t/u8NnsHG0c2SLd1Xy9Fs/6FGEezQhly3634ceEYQbq/tvX5tXm2e4EbOYcbRzZIt3VfL0Wz/oUYR7NCGXLnL0OyXDjwfi56BxtHNki3dV8vRbP+hRhHs0IZbtwv+rVZvgW+Obh6N3N2+wcbRzZIt3VfL0Wz/oUYR7NCGXsdOrXvWrL5r/o/ujwHG0c2SLd1Xy9Fs/6FGEe1RDhu3DVZdPqGBryauYAPc/q5tfsdvLb8u703eocbRzZIt3VfL0Wz/oUYR7VEOG7cNVl0+oYGvJq5gA98BD+7OaW7NXh3dnVwfAcbRzZIt3VfL0Wz/oUYR7VEOG7cNVl9Oro/l941ezm6Hby2/Lu9N3qHG0c2SLd1Xy9Fs/6FGEe1RDhu3DVZfTq6P5fmOwE+vKW7NXo4erNzerm5ubm5kbuHjTb44nX0ZkgIPTy8ADNzRQg2Q4S7ubm7rnJCsns8vTdywbBHO4A8r8Wz/oUUvbP5vLTlQ==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_5C5 = expr_6E:int
        var_3_5CA = newarray:byte[](byte.class, expr_6E:int)
        var_5_5CB = expr_6E:int
        Label_1485:
        
        while (cmpne:boolean(and:int(var_0_5DA:int, ldc:int(524288)), ldc:int(0))) {
            var_0_5DA = and:int(var_0_5DA:int, ldc:int(-710285378))
            var_5_5CB = add:int(var_5_5CB:int, ldc:int(-1))
            expr_5F0 = add:byte(loadelement:byte(stack_5ED_0:byte[], var_5_5CB:int), ldc:byte(26))
            storeelement:byte(var_3_5CA:byte[], var_5_5CB:int, or:int(and:int(shl:int(expr_5F0:byte, and:int(ldc:int(2100), ldc:int(26118))), ldc:int(-16)), and:int(shr:int(expr_5F0:byte[expected:int], and:int(ldc:int(2052), ldc:int(1166))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_5CB:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_5ED_0 = stack_655_0 = stack_6D0_0 = stack_726_0 = var_3_5CA:byte[]
            goto(Label_0115)
        }
        
        var_0_5DA = and:int(var_0_5DA:int, ldc:int(-1630286163))
        Label_1589:
        
        while (cmpne:boolean(and:int(var_0_5DA:int, ldc:int(4)), ldc:int(0))) {
            var_0_66F = and:int(var_0_5DA:int, ldc:int(-1745109787))
            var_5_5CB = add:int(var_5_5CB:int, ldc:int(-1))
            expr_655 = stack_69E_2 = loadelement(stack_655_0, var_5_5CB)
            
            if (cmplt:boolean(add:int(add:int(var_5_5CB:int, ldc:int(6)), neg:int(var_4_5C5:int)), ldc:int(0))) {
                stack_69E_2 = stack_672_0 = add:byte(expr_655:byte, loadelement:byte(var_3_5CA:byte[], add:int(var_5_5CB:int, ldc:int(6))))
                goto(Label_1666)
            }
            
            Label_1634:
            
            if (cmpne:boolean(and:int(var_0_66F:int, ldc:int(128)), ldc:int(0))) {
                var_0_66F = and:int(var_0_66F:int, ldc:int(-544612377))
                stack_69E_2 = stack_672_0 = add:byte(expr_655:byte, ldc:byte(6))
            }
            
            Label_1666:
            
            if (cmpeq:boolean(and:int(var_0_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_66F = and:int(var_0_66F:int, ldc:int(1801669948))
                goto(Label_1634)
            }
            
            var_0_5DA = and:int(var_0_66F:int, ldc:int(-1781822284))
            storeelement:byte(var_3_5CA:byte[], var_5_5CB:int, stack_69E_2:byte)
            
            if (cmpne:boolean(var_5_5CB:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_5ED_0 = stack_655_0 = stack_6D0_0 = stack_726_0 = var_3_5CA:byte[]
            goto(Label_0172)
        }
        
        var_0_5DA = and:int(var_0_5DA:int, ldc:int(-296858761))
        goto(Label_1485)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_5DA:int, ldc:int(262144)), ldc:int(0))) {
            var_0_5DA = and:int(var_0_5DA:int, ldc:int(1715135568))
            goto(Label_0279)
        }
        
        if (cmpne:boolean(and:int(var_0_5DA:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_0231)
        }
        
        if (cmpeq:boolean(and:int(var_0_5DA:int, ldc:int(32768)), ldc:int(0))) {
            var_0_5DA = and:int(var_0_5DA:int, ldc:int(1392480233))
        }
        else {
            var_0_5DA = and:int(var_0_5DA:int, ldc:int(-4225873))
            expr_A7 = arraylength:int(stack_A7_0:byte[])
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_4_5C5 = expr_A7:int
                var_3_5CA = newarray:byte[](byte.class, expr_A7:int)
                var_5_5CB = expr_A7:int
                goto(Label_1589)
            }
        }
        
        Label_0172:
        
        if (cmpne:boolean(and:int(var_0_5DA:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_0279)
        }
        
        if (cmpne:boolean(and:int(var_0_5DA:int, ldc:int(2)), ldc:int(0))) {
            var_0_5DA = and:int(var_0_5DA:int, ldc:int(495616511))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_5DA:int, ldc:int(32)), ldc:int(0))) {
                var_0_5DA = and:int(var_0_5DA:int, ldc:int(1519652781))
                goto(Label_0115)
            }
            
            var_0_5DA = and:int(var_0_5DA:int, ldc:int(-1247814403))
            var_2_DE = stack_DE_0:byte[]
            expr_E2 = add:int(arraylength:int(stack_E0_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_E2:int, ldc:int(0))) {
                var_3_6BE = newarray:byte[](byte.class, expr_E2:int)
                var_5_6BF = expr_E2:int
                
                loop {
                    var_0_5DA = and:int(var_0_5DA:int, ldc:int(-1113981212))
                    var_5_6BF = add:int(var_5_6BF:int, ldc:int(-1))
                    storeelement:byte(var_3_6BE:byte[], var_5_6BF:int, add:int(shl:int(loadelement:byte(stack_6D0_0:byte[], var_5_6BF:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_DE:byte[], add:int(var_5_6BF:int, xor:int(ldc:int(-8188), ldc:int(-8187)))), ldc:int(5)), xor:int(ldc:int(-12223), ldc:int(-12218)))))
                    
                    if (cmpne:boolean(var_5_6BF:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_5ED_0 = stack_655_0 = stack_6D0_0 = stack_726_0 = var_3_6BE:byte[]
            }
        }
        
        Label_0231:
        
        if (cmpeq:boolean(and:int(var_0_5DA:int, ldc:int(262144)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_5DA:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0172)
            }
            
            if (cmpeq:boolean(and:int(var_0_5DA:int, ldc:int(524288)), ldc:int(0))) {
                var_0_5DA = and:int(var_0_5DA:int, ldc:int(747269560))
                goto(Label_0115)
            }
            
            var_0_5DA = and:int(var_0_5DA:int, ldc:int(-138422290))
            expr_112 = arraylength:int(stack_112_0:byte[])
            
            if (cmpne:boolean(expr_112:int, ldc:int(0))) {
                var_3_714 = newarray:byte[](byte.class, expr_112:int)
                var_5_715 = expr_112:int
                
                loop {
                    var_0_5DA = and:int(var_0_5DA:int, ldc:int(-671359057))
                    var_5_715 = add:int(var_5_715:int, ldc:int(-1))
                    storeelement:byte(var_3_714:byte[], var_5_715:int, xor:byte(loadelement:byte(stack_726_0:byte[], var_5_715:int), ldc:byte(82)))
                    
                    if (cmpne:boolean(var_5_715:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_5ED_0 = stack_655_0 = stack_6D0_0 = stack_726_0 = var_3_714:byte[]
            }
        }
        
        Label_0279:
        
        if (cmpeq:boolean(and:int(var_0_5DA:int, ldc:int(4)), ldc:int(0))) {
            var_0_5DA = and:int(var_0_5DA:int, ldc:int(1658263984))
            goto(Label_0231)
        }
        
        if (cmpne:boolean(and:int(var_0_5DA:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_0172)
        }
        
        if (cmpne:boolean(and:int(var_0_5DA:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_14B = initobject:String(String::<init>, stack_13F_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_153 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16433), ldc:int(10795)))
            expr_15D = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(14375), ldc:int(16417)))
            storeelement:String(expr_15D:String[], and:int(ldc:int(9491), ldc:int(4691)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(-17703), ldc:int(17670)), and:int(ldc:int(2052), ldc:int(1494))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(2308), ldc:int(2322)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(132), ldc:int(18476)), xor:int(ldc:int(16450), ldc:int(16458))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(2076), ldc:int(2066)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(20740), ldc:int(20748)), xor:int(ldc:int(-32712), ldc:int(-32716))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(170), ldc:int(171)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(16556), ldc:int(12)), xor:int(ldc:int(-30200), ldc:int(-30201))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(5896), ldc:int(2059)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(2575), ldc:int(4111)), xor:int(ldc:int(4288), ldc:int(4309))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(-31741), ldc:int(-31735)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(4137), ldc:int(4156)), and:int(ldc:int(1115), ldc:int(14523))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(25125), ldc:int(2119)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(4123), ldc:int(8923)), xor:int(ldc:int(808), ldc:int(777))))
            storeelement:String(expr_153:String[], xor:int(ldc:int(1203), ldc:int(1194)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(8728), ldc:int(8761)), and:int(ldc:int(2635), ldc:int(83))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(4148), ldc:int(2580)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(77), ldc:int(14)), xor:int(ldc:int(342), ldc:int(304))))
            storeelement:String(expr_153:String[], xor:int(ldc:int(16414), ldc:int(16446)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(39), ldc:int(65)), xor:int(ldc:int(16904), ldc:int(17031))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(415), ldc:int(24687)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(-32232), ldc:int(-32105)), xor:int(ldc:int(10357), ldc:int(10444))))
            storeelement:String(expr_153:String[], xor:int(ldc:int(17455), ldc:int(17456)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(714), ldc:int(627)), xor:int(ldc:int(11), ldc:int(233))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(4487), ldc:int(4490)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(2286), ldc:int(8419)), xor:int(ldc:int(738), ldc:int(1006))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(18522), ldc:int(5298)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(24878), ldc:int(268)), xor:int(ldc:int(3382), ldc:int(3090))))
            storeelement:String(expr_153:String[], xor:int(ldc:int(20), ldc:int(8)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(10701), ldc:int(10473)), and:int(ldc:int(25950), ldc:int(968))))
            storeelement:String(expr_153:String[], and:int(ldc:int(1118), ldc:int(10394)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(4221), ldc:int(4405)), xor:int(ldc:int(-24075), ldc:int(-24443))))
            storeelement:String(expr_153:String[], xor:int(ldc:int(9234), ldc:int(9225)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(17905), ldc:int(8564)), xor:int(ldc:int(25218), ldc:int(25364))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(51), ldc:int(38)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(4055), ldc:int(8630)), xor:int(ldc:int(2104), ldc:int(2443))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(4256), ldc:int(4280)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(4087), ldc:int(443)), and:int(ldc:int(19925), ldc:int(1013))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(23), ldc:int(18783)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(511), ldc:int(9685)), xor:int(ldc:int(-13848), ldc:int(-14308))))
            storeelement:String(expr_153:String[], xor:int(ldc:int(24605), ldc:int(24579)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(248), ldc:int(268)), and:int(ldc:int(17953), ldc:int(548))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(24644), ldc:int(24661)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(9124), ldc:int(8580)), and:int(ldc:int(847), ldc:int(27389))))
            storeelement:String(expr_153:String[], and:int(ldc:int(3229), ldc:int(28703)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(10331), ldc:int(10774)), and:int(ldc:int(629), ldc:int(893))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(2192), ldc:int(20593)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(13941), ldc:int(19061)), xor:int(ldc:int(306), ldc:int(940))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(151), ldc:int(6215)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(630), ldc:int(232)), xor:int(ldc:int(-30377), ldc:int(-29709))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(71), ldc:int(78)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(4774), ldc:int(2036)), xor:int(ldc:int(17992), ldc:int(17658))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(3010), ldc:int(38)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(3968), ldc:int(3378)), xor:int(ldc:int(2349), ldc:int(2967))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(8235), ldc:int(20619)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(4117), ldc:int(4783)), and:int(ldc:int(10941), ldc:int(17087))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(16391), ldc:int(10278)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(1727), ldc:int(31421)), xor:int(ldc:int(10805), ldc:int(10485))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(8712), ldc:int(8716)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(12992), ldc:int(4048)), and:int(ldc:int(9971), ldc:int(4815))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(76), ldc:int(79)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(9955), ldc:int(17111)), and:int(ldc:int(4039), ldc:int(711))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(-31594), ldc:int(-31590)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(27639), ldc:int(711)), and:int(ldc:int(27374), ldc:int(734))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(32096), ldc:int(-32097)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(2181), ldc:int(2635)), and:int(ldc:int(6877), ldc:int(1753))))
            putstatic:String[](\u8350\ub8be\ufe34\ud12e\ud12e::\u927d\u7ce1\u3776\u3e75\u946b\u67e9, expr_15D:String[])
            var_3_4EE = expr_153:String[]
            putstatic:SimpleCommandExceptionType(\u8350\ub8be\ufe34\ud12e\ud12e::\u6198\u56bd\u12cb\ub18d\u5f50\ubf56, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_4EE:String[], and:int(ldc:int(21145), ldc:int(8253))))))
            putstatic:SimpleCommandExceptionType(\u8350\ub8be\ufe34\ud12e\ud12e::\u156b\u2dcc\u97b7\u6bb9\u5245\u392e, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_4EE:String[], xor:int(ldc:int(621), ldc:int(631))))))
            putstatic:SimpleCommandExceptionType(\u8350\ub8be\ufe34\ud12e\ud12e::\u59ec\u873d\u12b2\u8df4\u718f\ud158, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_4EE:String[], xor:int(ldc:int(4408), ldc:int(4387))))))
            putstatic:SimpleCommandExceptionType(\u8350\ub8be\ufe34\ud12e\ud12e::\ub18d\u51b2\u6d99\u97e6\ub32d\uc910, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_4EE:String[], and:int(ldc:int(9340), ldc:int(924))))))
            putstatic:SimpleCommandExceptionType(\u8350\ub8be\ufe34\ud12e\ud12e::\u7e3f\u1833\u6b5f\u3711\u760c\u67e9, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_4EE:String[], xor:int(ldc:int(16670), ldc:int(16643))))))
            putstatic:SimpleCommandExceptionType(\u8350\ub8be\ufe34\ud12e\ud12e::\u071d\u965f\u7330\u6c56\u16f6\u4bc8, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_4EE:String[], xor:int(ldc:int(1296), ldc:int(1294))))))
            putstatic:SimpleCommandExceptionType(\u8350\ub8be\ufe34\ud12e\ud12e::\ub113\u647c\ub19c\u7043\u4975\u6ec6, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_4EE:String[], xor:int(ldc:int(1089), ldc:int(1118))))))
            putstatic:SimpleCommandExceptionType(\u8350\ub8be\ufe34\ud12e\ud12e::\ub8be\u7d52\u3dd3\ub171\ud158\ufcaf, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_4EE:String[], xor:int(ldc:int(6160), ldc:int(6192))))))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \ua068\u7330\uc246\ub32d\u98a4\u12cb(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6DE : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_6E9 : int
        
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
        var_3_6DE = and:int(ldc:int(-536991625), ldc:int(-370185861))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8350\ub8be\ufe34\ud12e\ud12e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_6DE = and:int(var_3_6DE:int, ldc:int(456166290))
        }
        else {
            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-841695750))
            var_5_8A = and:int(ldc:int(4979), ldc:int(-4980))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-9241), ldc:int(9240)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_6DE:int, ldc:int(-571481513))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(2847), ldc:int(4225)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(4352), ldc:int(4353)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_6DE = and:int(var_3_E3:int, ldc:int(-1905954))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(20552), ldc:int(20553)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(808875674))
                        goto(Label_1627)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1621565254))
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1013)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1645703293))
                    }
                    else {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1711685773))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0577)
                            }
                            
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1627)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1461)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1838410227))
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1226541308))
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-546064749))
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(709069541))
                            loopcontinue()
                        }
                        
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1144381101))
                        var_11_F4 = and:int(ldc:int(-22600), ldc:int(22597))
                        goto(Label_1616)
                    }
                    
                    Label_0577:
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1627)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(2058354078))
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1315813780))
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1490225294))
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(523780819))
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-834099757))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-2106499698))
                            loopcontinue()
                        }
                        
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-337467401))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0720:
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-818149285))
                        goto(Label_1627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1131900241))
                        goto(Label_1461)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1540486794))
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1125691649))
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1872733660))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-159510898))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1710039965))
                            loopcontinue()
                        }
                        
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1108247845))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0879:
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-251186998))
                        goto(Label_1627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(635774724))
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1293620944))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1871442773))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1382600491))
                            loopcontinue()
                        }
                        
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-102749449))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = and:int(ldc:int(20611), ldc:int(777))
                                goto(Label_1173)
                            }
                        }
                    }
                    
                    Label_1013:
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(294108863))
                        goto(Label_1461)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1827945674))
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0879)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-985351714))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-804315866))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1448120361))
                        var_11_F4 = and:int(ldc:int(-860), ldc:int(859))
                    }
                    
                    Label_1173:
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-487567975))
                        goto(Label_1627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-572463282))
                        goto(Label_1461)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-300072531))
                            goto(Label_1013)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(939142349))
                            goto(Label_0879)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(891214856))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-21183777))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-13798379))
                            loopcontinue()
                        }
                        
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-844829345))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1461)
                            }
                        }
                    }
                    
                    Label_1325:
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1103744483))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_1173)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1013)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-830628758))
                            goto(Label_0879)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-682974093))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(22876002))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1383193509))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                            goto(Label_1616)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1461:
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-931520769))
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-643881626))
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-119346565))
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(2062344517))
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(279158124))
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1465506903))
                        loopcontinue()
                    }
                    
                    var_3_6DE = and:int(var_3_6DE:int, ldc:int(-38310786))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1616:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6E9 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1627:
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-2108691228))
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-741550829))
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(295520751))
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1768184461))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(169891367))
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1714788905))
                        var_17_6E9 = add:int(var_16_122:int, xor:int(ldc:int(-22520), ldc:int(-22519)))
                        looporswitchbreak()
                    }
                    
                    var_3_6DE = and:int(var_3_6DE:int, ldc:int(-2073042421))
                }
                
                var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1144379402))
                
                if (cmple:boolean(var_5_8A = var_17_6E9:int, sub:int(var_6_91:int, and:int(ldc:int(257), ldc:int(31403))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_6DE = and:int(var_3_6DE:int, ldc:int(825523803))
            goto(Label_0108)
        }
    }
}
