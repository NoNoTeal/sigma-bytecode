public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u5bc4\u8413\u8753\u983f\ubf56 {
    public void \u5bc4\u8413\u8753\u983f\ubf56() {
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
            invokespecial:Object(Object::<init>, this:\u5bc4\u8413\u8753\u983f\ubf56)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u36d3\u7d52\u7006\u6d69\u7330\u67d0(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int \ubb2b\uc7fe\u183a\u4cd9\uc9f6\ufcaf(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u927d\u92ff\u71ae\uafe7\u6bb9.\u92ee\u5bc4\uc910\u7043\ud523 p1, java.util.Collection<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f> p2, int p3) {
        var_4_F0 : int
        var_6_69 : Iterator<\u51fa\u6c52\u7330\u7330\u960f>
        var_7_161 : \u51fa\u6c52\u7330\u7330\u960f
        var_8_164 : int
        var_9_1A6 : int
        var_10_1BC : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        var_12_22A : \u120d\u8bb0\u836c\u64f2\u3504
        var_12_1E4 : \u120d\u8bb0\u836c\u64f2\u3504
        stack_307_1 : String [generated]
        expr_2C5 : Object[] [generated]
        stack_143_1 : String [generated]
        expr_109 : Object[] [generated]
        
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
            var_4_F0 = and:int(ldc:int(1075808568), ldc:int(636452859))
            var_6_69 = invokeinterface:Iterator<\u51fa\u6c52\u7330\u7330\u960f>(Collection<\u51fa\u6c52\u7330\u7330\u960f>::iterator, p2:Collection<\u51fa\u6c52\u7330\u7330\u960f>)
            
            loop {
                if (cmpne:boolean(and:int(var_4_F0:int, ldc:int(8192)), ldc:int(0))) {
                    var_4_F0 = and:int(var_4_F0:int, ldc:int(-1865409034))
                    goto(Label_0219)
                }
                
                if (cmpeq:boolean(and:int(var_4_F0:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_4_F0 = and:int(var_4_F0:int, ldc:int(-1188902527))
                }
                else {
                    var_4_F0 = and:int(var_4_F0:int, ldc:int(1797252459))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_6_69:Iterator)) {
                        var_7_161 = checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Iterator<\u51fa\u6c52\u7330\u7330\u960f>::next, var_6_69:Iterator<\u51fa\u6c52\u7330\u7330\u960f>))
                        var_8_164 = p3:int
                        
                        loop {
                            if (cmpne:boolean(and:int(var_4_F0:int, ldc:int(32)), ldc:int(0))) {
                                var_4_F0 = and:int(var_4_F0:int, ldc:int(-943372435))
                                
                                if (cmpgt:boolean(var_8_164:int, ldc:int(0))) {
                                    var_9_1A6 = invokestatic:int(Math::min, invokevirtual:int(\u9af2\u1833\u156b\u12cb\u7d52\u6c52::\uae87\u7c6b\ud217\u12cb\u7d52\u516c, invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u92ee\u5bc4\uc910\u7043\ud523::\u0c95\ua3b4\u4ab3\ud158\u983f\u516c, p1:\u92ee\u5bc4\uc910\u7043\ud523)), var_8_164:int)
                                    var_8_164 = sub:int(var_8_164:int, var_9_1A6:int)
                                    var_10_1BC = invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u92ee\u5bc4\uc910\u7043\ud523::\u9033\ub19c\u7e3f\ud171\ua61f\ub8be, p1:\u92ee\u5bc4\uc910\u7043\ud523, var_9_1A6:int, and:int[expected:boolean](ldc:int(10292), ldc:int(-11319)))
                                    
                                    if (logicaland:boolean(invokevirtual:boolean(\u0b8e\ud4fe\uc229\u92ee\ud4fe::\u7bad\uc238\ud171\u71ae\u98a4\ud51e, getfield:\u0b8e\ud4fe\uc229\u92ee\ud4fe(\u51fa\u6c52\u7330\u7330\u960f::\u64f2\u93a2\ub70c\uafe7\u5f50\u5bc4, var_7_161:\u51fa\u6c52\u7330\u7330\u960f), var_10_1BC:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, var_10_1BC:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
                                        invokevirtual:void(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\uc4d2\uc29a\uf94d\u6bb9\u97e6\u5d20, var_10_1BC:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, xor:int(ldc:int(-27136), ldc:int(-27135)))
                                        var_12_22A = invokevirtual:\u120d\u8bb0\u836c\u64f2\u3504(\ua3b4\u8aa5\ub113\ubf56\u873d::\u93a2\u4bc8\u5d20\ub32d\u836c\u72f1, var_7_161:\u51fa\u6c52\u7330\u7330\u960f[expected:\ua3b4\u8aa5\ub113\ubf56\u873d], var_10_1BC:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, and:int[expected:boolean](ldc:int(19776), ldc:int(-19777)))
                                        
                                        if (cmpeq:boolean(var_12_22A:\u120d\u8bb0\u836c\u64f2\u3504, aconstnull:\u120d\u8bb0\u836c\u64f2\u3504())) {
                                            goto(Label_0561)
                                        }
                                        
                                        invokevirtual:void(\u120d\u8bb0\u836c\u64f2\u3504::\uc87f\u4f4a\uceb8\u52d3\u8cae\u392e, var_12_22A:\u120d\u8bb0\u836c\u64f2\u3504)
                                        goto(Label_0561)
                                    }
                                    else {
                                        var_4_F0 = and:int(var_4_F0:int, ldc:int(217286525))
                                        var_12_1E4 = invokevirtual:\u120d\u8bb0\u836c\u64f2\u3504(\ua3b4\u8aa5\ub113\ubf56\u873d::\u93a2\u4bc8\u5d20\ub32d\u836c\u72f1, var_7_161:\u51fa\u6c52\u7330\u7330\u960f[expected:\ua3b4\u8aa5\ub113\ubf56\u873d], var_10_1BC:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, and:int[expected:boolean](ldc:int(27558), ldc:int(-27559)))
                                        
                                        if (cmpne:boolean(var_12_1E4:\u120d\u8bb0\u836c\u64f2\u3504, aconstnull:\u120d\u8bb0\u836c\u64f2\u3504())) {
                                            invokevirtual:void(\u120d\u8bb0\u836c\u64f2\u3504::\uae5d\ub171\ud36e\ubefe\ufcaf\u8d98, var_12_1E4:\u120d\u8bb0\u836c\u64f2\u3504)
                                            invokevirtual:void(\u120d\u8bb0\u836c\u64f2\u3504::\u8d98\u7e3f\ubff1\ubff1\u3a62\u0800, var_12_1E4:\u120d\u8bb0\u836c\u64f2\u3504, invokevirtual:UUID(\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, var_7_161:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))
                                        }
                                    }
                                    
                                    Label_0491:
                                    
                                    if (cmpeq:boolean(and:int(var_4_F0:int, ldc:int(4194304)), ldc:int(0))) {
                                        var_4_F0 = and:int(var_4_F0:int, ldc:int(-1405148936))
                                        loopcontinue()
                                    }
                                    
                                    Label_0561:
                                    
                                    if (cmpeq:boolean(and:int(var_4_F0:int, ldc:int(16384)), ldc:int(0))) {
                                        var_4_F0 = and:int(var_4_F0:int, ldc:int(-526815958))
                                        invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u51fa\u6c52\u7330\u7330\u960f::\u12cb\ubf56\u647c\u7330\u446c\u836c, var_7_161:\u51fa\u6c52\u7330\u7330\u960f), checkcast:\ua3b4\u8aa5\ub113\ubf56\u873d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d.class, aconstnull:\ua3b4\u8aa5\ub113\ubf56\u873d()), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, var_7_161:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, var_7_161:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, var_7_161:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\u8389\u3bd6\u6b5f\u71f1\u4f52\u624e), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\u3c25\u8308\uff55\u3bd6\u5f50\u5f50), ldc:float(0.2f), mul:float(add:float(mul:float(sub:float(invokevirtual:float(Random::nextFloat, invokevirtual:Random(\ube23\u67d0\u64f2\u839e\u76bc::\u4daf\u446c\ubcb0\u759a\ua562\u5245, var_7_161:\u51fa\u6c52\u7330\u7330\u960f[expected:\ube23\u67d0\u64f2\u839e\u76bc])), invokevirtual:float(Random::nextFloat, invokevirtual:Random(\ube23\u67d0\u64f2\u839e\u76bc::\u4daf\u446c\ubcb0\u759a\ua562\u5245, var_7_161:\u51fa\u6c52\u7330\u7330\u960f[expected:\ube23\u67d0\u64f2\u839e\u76bc]))), ldc:float(0.7f)), ldc:float(1.0f)), ldc:float(2.0f)))
                                        invokevirtual:void(\ub1b9\u62da\u9af2\u92ee\u64f2::\u839e\u8709\u8709\u71f1\u9a18\ud12e, getfield:\ubb2b\u6b0d\u6c56\uc29a\u4e72(\u51fa\u6c52\u7330\u7330\u960f::\ud36e\u600f\ua61f\u76bc\u965f\u64ab, var_7_161:\u51fa\u6c52\u7330\u7330\u960f))
                                    }
                                    
                                    goto(Label_0491)
                                }
                            }
                            
                            if (cmpeq:boolean(and:int(var_4_F0:int, ldc:int(33554432)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_4_F0 = and:int(var_4_F0:int, ldc:int(1114663671))
                        }
                        
                        var_4_F0 = and:int(var_4_F0:int, ldc:int(-434817559))
                        loopcontinue()
                    }
                }
                
                Label_0160:
                
                if (cmpne:boolean(and:int(var_4_F0:int, ldc:int(33554432)), ldc:int(0))) {
                    var_4_F0 = and:int(var_4_F0:int, ldc:int(-257281950))
                }
                else {
                    if (cmpne:boolean(and:int(var_4_F0:int, ldc:int(4194304)), ldc:int(0))) {
                        var_4_F0 = and:int(var_4_F0:int, ldc:int(1257879309))
                        loopcontinue()
                    }
                    
                    var_4_F0 = and:int(var_4_F0:int, ldc:int(2104727274))
                    
                    if (cmpeq:boolean(invokeinterface:int(Collection::size, p2:Collection), and:int(ldc:int(8745), ldc:int(69)))) {
                        stack_307_1 = loadelement:String(getstatic:String[](\u5bc4\u8413\u8753\u983f\ubf56::\u7043\u51b2\u4179\ufe34\u64f2\u8cae), xor:int(ldc:int(8257), ldc:int(8261)))
                        expr_2C5 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(2059), ldc:int(29731)))
                        storeelement:Object(expr_2C5:Object[], and:int(ldc:int(4623), ldc:int(-4624)), invokestatic:Integer[expected:Object](Integer::valueOf, p3:int))
                        storeelement:Object(expr_2C5:Object[], and:int(ldc:int(6709), ldc:int(16513)), invokevirtual:ITextComponent[expected:Object](\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u3e2a\ua61f\u5f50\u120d\ud36e\ub113, invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u92ee\u5bc4\uc910\u7043\ud523::\u9033\ub19c\u7e3f\ud171\ua61f\ub8be, p1:\u92ee\u5bc4\uc910\u7043\ud523, p3:int, and:int[expected:boolean](ldc:int(-4487), ldc:int(4486)))))
                        storeelement:Object(expr_2C5:Object[], and:int(ldc:int(20562), ldc:int(9894)), invokevirtual:ITextComponent[expected:Object](\ua3b4\u8aa5\ub113\ubf56\u873d::\u8258\u4e72\u40a9\u93a2\u3a62\ud36e, checkcast:\u51fa\u6c52\u7330\u7330\u960f[expected:\ua3b4\u8aa5\ub113\ubf56\u873d](\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Iterator<\u51fa\u6c52\u7330\u7330\u960f>::next, invokeinterface:Iterator<\u51fa\u6c52\u7330\u7330\u960f>(Collection<\u51fa\u6c52\u7330\u7330\u960f>::iterator, p2:Collection<\u51fa\u6c52\u7330\u7330\u960f>)))))
                        invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_307_1:String, expr_2C5:Object[]), xor:int[expected:boolean](ldc:int(8338), ldc:int(8339)))
                        looporswitchbreak()
                    }
                }
                
                Label_0219:
                
                if (cmpne:boolean(and:int(var_4_F0:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0160)
                }
                
                if (cmpeq:boolean(and:int(var_4_F0:int, ldc:int(268435456)), ldc:int(0))) {
                    var_4_F0 = and:int(var_4_F0:int, ldc:int(518632876))
                    stack_143_1 = loadelement:String(getstatic:String[](\u5bc4\u8413\u8753\u983f\ubf56::\u7043\u51b2\u4179\ufe34\u64f2\u8cae), xor:int(ldc:int(4642), ldc:int(4646)))
                    expr_109 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(7459), ldc:int(8263)))
                    storeelement:Object(expr_109:Object[], and:int(ldc:int(459), ldc:int(-460)), invokestatic:Integer[expected:Object](Integer::valueOf, p3:int))
                    storeelement:Object(expr_109:Object[], and:int(ldc:int(1), ldc:int(17025)), invokevirtual:ITextComponent[expected:Object](\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u3e2a\ua61f\u5f50\u120d\ud36e\ub113, invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u92ee\u5bc4\uc910\u7043\ud523::\u9033\ub19c\u7e3f\ud171\ua61f\ub8be, p1:\u92ee\u5bc4\uc910\u7043\ud523, p3:int, and:int[expected:boolean](ldc:int(-6956), ldc:int(6955)))))
                    storeelement:Object(expr_109:Object[], xor:int(ldc:int(7201), ldc:int(7203)), invokestatic:Integer[expected:Object](Integer::valueOf, invokeinterface:int(Collection<E>::size, p2:Collection<\u51fa\u6c52\u7330\u7330\u960f>)))
                    invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_143_1:String, expr_109:Object[]), xor:int[expected:boolean](ldc:int(24642), ldc:int(24643)))
                    looporswitchbreak()
                }
            }
            
            return:int(invokeinterface:int(Collection<E>::size, p2:Collection<\u51fa\u6c52\u7330\u7330\u960f>))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u6435\ud7e8\u416d\u72f1\u12cb\ub102$2(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u5bc4\u8413\u8753\u983f\ubf56::\ubb2b\uc7fe\u183a\u4cd9\uc9f6\ufcaf, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u92ee\u5bc4\uc910\u7043\ud523(\uf94d\u983f\u40a9\u6fb0\u12b2::\ufe34\u8d90\u9255\ub18d\u47c2\u3711, p0:CommandContext, loadelement:String(getstatic:String[](\u5bc4\u8413\u8753\u983f\ubf56::\u7043\u51b2\u4179\ufe34\u64f2\u8cae), and:int(ldc:int(8710), ldc:int(21507)))), invokestatic:Collection<\u51fa\u6c52\u7330\u7330\u960f>(\u600f\u9937\ub8be\ud171\u624e::\u4f4a\u6b0d\u946b\u4e72\u56bd\u56bd, p0:CommandContext, loadelement:String(getstatic:String[](\u5bc4\u8413\u8753\u983f\ubf56::\u7043\u51b2\u4179\ufe34\u64f2\u8cae), and:int(ldc:int(10245), ldc:int(18371)))), invokestatic:int(IntegerArgumentType::getInteger, p0:CommandContext, loadelement:String(getstatic:String[](\u5bc4\u8413\u8753\u983f\ubf56::\u7043\u51b2\u4179\ufe34\u64f2\u8cae), and:int(ldc:int(131), ldc:int(2579))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u718f\u3776\u3e2a\u7d52\uf94d\u2dcc$1(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u5bc4\u8413\u8753\u983f\ubf56::\ubb2b\uc7fe\u183a\u4cd9\uc9f6\ufcaf, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u92ee\u5bc4\uc910\u7043\ud523(\uf94d\u983f\u40a9\u6fb0\u12b2::\ufe34\u8d90\u9255\ub18d\u47c2\u3711, p0:CommandContext, loadelement:String(getstatic:String[](\u5bc4\u8413\u8753\u983f\ubf56::\u7043\u51b2\u4179\ufe34\u64f2\u8cae), and:int(ldc:int(17103), ldc:int(2082)))), invokestatic:Collection<\u51fa\u6c52\u7330\u7330\u960f>(\u600f\u9937\ub8be\ud171\u624e::\u4f4a\u6b0d\u946b\u4e72\u56bd\u56bd, p0:CommandContext, loadelement:String(getstatic:String[](\u5bc4\u8413\u8753\u983f\ubf56::\u7043\u51b2\u4179\ufe34\u64f2\u8cae), xor:int(ldc:int(1161), ldc:int(1160)))), xor:int(ldc:int(225), ldc:int(224))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\ub32d\ufcaf\uf9c5\u494c\u5d20\u8cae$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, and:int(ldc:int(16386), ldc:int(11346))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2B9 : int
        expr_6E : int [generated]
        stack_A3_0 : byte[] [generated]
        stack_A5_0 : byte[] [generated]
        stack_DD_0 : byte[] [generated]
        stack_DF_0 : byte[] [generated]
        stack_103_0 : byte[] [generated]
        stack_105_0 : byte[] [generated]
        stack_143_0 : byte[] [generated]
        stack_214_0 : byte[] [generated]
        stack_265_0 : byte[] [generated]
        stack_2CC_0 : byte[] [generated]
        stack_349_0 : byte[] [generated]
        var_4_1F5 : int
        var_3_1FA : byte[]
        var_5_1FB : int
        expr_214 : byte [generated]
        var_0_2E5 : int
        expr_2CC : byte [generated]
        stack_314_2 : byte [generated]
        stack_2E8_0 : byte [generated]
        var_2_A3 : byte[]
        expr_A7 : int [generated]
        var_3_253 : byte[]
        var_5_254 : int
        expr_DF : int [generated]
        expr_105 : int [generated]
        var_3_337 : byte[]
        var_5_338 : int
        var_3_14F : String
        stack_1EE_0 : String[] [generated]
        expr_161 : String[] [generated]
        
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
        var_0_2B9 = and:int(ldc:int(1971235610), ldc:int(-251794245))
        expr_6E = arraylength:int(stack_A3_0 = stack_A5_0 = stack_DD_0 = stack_DF_0 = stack_103_0 = stack_105_0 = stack_143_0 = stack_214_0 = stack_265_0 = stack_2CC_0 = stack_349_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("MAjb8/+FP1rwxfdhoapGIhjJoXkE8Hbn6wjrFNkI59duzfdSpfdyrdcACFqlrTg0AA==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1F5 = expr_6E:int
        var_3_1FA = newarray:byte[](byte.class, expr_6E:int)
        var_5_1FB = expr_6E:int
        Label_0509:
        
        while (cmpeq:boolean(and:int(var_0_2B9:int, ldc:int(1024)), ldc:int(0))) {
            var_0_2B9 = and:int(var_0_2B9:int, ldc:int(-84113079))
            var_5_1FB = add:int(var_5_1FB:int, ldc:int(-1))
            expr_214 = loadelement:byte(stack_214_0:byte[], var_5_1FB:int)
            storeelement:byte(var_3_1FA:byte[], var_5_1FB:int, or:int(and:int(shl:int(expr_214:byte, xor:int(ldc:int(7232), ldc:int(7236))), ldc:int(-16)), and:int(shr:int(expr_214:byte[expected:int], xor:int(ldc:int(192), ldc:int(196))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1FB:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_DD_0 = stack_DF_0 = stack_103_0 = stack_105_0 = stack_143_0 = stack_214_0 = stack_265_0 = stack_2CC_0 = stack_349_0 = var_3_1FA:byte[]
            goto(Label_0115)
        }
        
        Label_0684:
        
        while (cmpne:boolean(and:int(var_0_2B9:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_2E5 = and:int(var_0_2B9:int, ldc:int(2063371661))
            var_5_1FB = add:int(var_5_1FB:int, ldc:int(-1))
            expr_2CC = stack_314_2 = loadelement(stack_2CC_0, var_5_1FB)
            
            if (cmplt:boolean(add:int(add:int(var_5_1FB:int, ldc:int(2)), neg:int(var_4_1F5:int)), ldc:int(0))) {
                stack_314_2 = stack_2E8_0 = add:byte(expr_2CC:byte, loadelement:byte(var_3_1FA:byte[], add:int(var_5_1FB:int, ldc:int(2))))
                goto(Label_0760)
            }
            
            Label_0729:
            
            if (cmpne:boolean(and:int(var_0_2E5:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_2E5 = and:int(var_0_2E5:int, ldc:int(1895811674))
                stack_314_2 = stack_2E8_0 = add:byte(expr_2CC:byte, ldc:byte(2))
            }
            
            Label_0760:
            
            if (cmpeq:boolean(and:int(var_0_2E5:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_2E5 = and:int(var_0_2E5:int, ldc:int(1686402669))
                goto(Label_0729)
            }
            
            var_0_2B9 = and:int(var_0_2E5:int, ldc:int(-142803272))
            storeelement:byte(var_3_1FA:byte[], var_5_1FB:int, stack_314_2:byte)
            
            if (cmpne:boolean(var_5_1FB:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_DD_0 = stack_DF_0 = stack_103_0 = stack_105_0 = stack_143_0 = stack_214_0 = stack_265_0 = stack_2CC_0 = stack_349_0 = var_3_1FA:byte[]
            goto(Label_0228)
        }
        
        var_0_2B9 = and:int(var_0_2B9:int, ldc:int(-2005689152))
        goto(Label_0509)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_2B9:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_2B9 = and:int(var_0_2B9:int, ldc:int(-394395331))
            goto(Label_0266)
        }
        
        if (cmpeq:boolean(and:int(var_0_2B9:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0228)
        }
        
        if (cmpeq:boolean(and:int(var_0_2B9:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_2B9 = and:int(var_0_2B9:int, ldc:int(-1292788158))
        }
        else {
            var_0_2B9 = and:int(var_0_2B9:int, ldc:int(2138884539))
            var_2_A3 = stack_A3_0:byte[]
            expr_A7 = add:int(arraylength:int(stack_A5_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_3_253 = newarray:byte[](byte.class, expr_A7:int)
                var_5_254 = expr_A7:int
                
                loop {
                    var_0_2B9 = and:int(var_0_2B9:int, ldc:int(-100742391))
                    var_5_254 = add:int(var_5_254:int, ldc:int(-1))
                    storeelement:byte(var_3_253:byte[], var_5_254:int, add:int(shl:int(loadelement:byte(stack_265_0:byte[], var_5_254:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_A3:byte[], add:int(var_5_254:int, and:int(ldc:int(2057), ldc:int(16645)))), ldc:int(6)), xor:int(ldc:int(-28664), ldc:int(-28661)))))
                    
                    if (cmpne:boolean(var_5_254:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_DD_0 = stack_DF_0 = stack_103_0 = stack_105_0 = stack_143_0 = stack_214_0 = stack_265_0 = stack_2CC_0 = stack_349_0 = var_3_253:byte[]
            }
        }
        
        Label_0172:
        
        if (cmpeq:boolean(and:int(var_0_2B9:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_2B9 = and:int(var_0_2B9:int, ldc:int(718586827))
            goto(Label_0266)
        }
        
        if (cmpne:boolean(and:int(var_0_2B9:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2B9:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_2B9 = and:int(var_0_2B9:int, ldc:int(1979853945))
                goto(Label_0115)
            }
            
            var_0_2B9 = and:int(var_0_2B9:int, ldc:int(-84100389))
            expr_DF = arraylength:int(stack_DF_0:byte[])
            
            if (cmpne:boolean(expr_DF:int, ldc:int(0))) {
                var_4_1F5 = expr_DF:int
                var_3_1FA = newarray:byte[](byte.class, expr_DF:int)
                var_5_1FB = expr_DF:int
                goto(Label_0684)
            }
        }
        
        Label_0228:
        
        if (cmpne:boolean(and:int(var_0_2B9:int, ldc:int(2097152)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2B9:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0172)
            }
            
            if (cmpeq:boolean(and:int(var_0_2B9:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_2B9 = and:int(var_0_2B9:int, ldc:int(2029948154))
            expr_105 = arraylength:int(stack_105_0:byte[])
            
            if (cmpne:boolean(expr_105:int, ldc:int(0))) {
                var_3_337 = newarray:byte[](byte.class, expr_105:int)
                var_5_338 = expr_105:int
                
                loop {
                    var_0_2B9 = and:int(var_0_2B9:int, ldc:int(1912396184))
                    var_5_338 = add:int(var_5_338:int, ldc:int(-1))
                    storeelement:byte(var_3_337:byte[], var_5_338:int, add:byte(xor:byte(loadelement:byte(stack_349_0:byte[], var_5_338:int), ldc:byte(76)), ldc:byte(49)))
                    
                    if (cmpne:boolean(var_5_338:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_DD_0 = stack_DF_0 = stack_103_0 = stack_105_0 = stack_143_0 = stack_214_0 = stack_265_0 = stack_2CC_0 = stack_349_0 = var_3_337:byte[]
            }
        }
        
        Label_0266:
        
        if (cmpne:boolean(and:int(var_0_2B9:int, ldc:int(1024)), ldc:int(0))) {
            var_0_2B9 = and:int(var_0_2B9:int, ldc:int(-738977232))
            goto(Label_0228)
        }
        
        if (cmpne:boolean(and:int(var_0_2B9:int, ldc:int(64)), ldc:int(0))) {
            var_0_2B9 = and:int(var_0_2B9:int, ldc:int(-672863694))
            goto(Label_0172)
        }
        
        if (cmpeq:boolean(and:int(var_0_2B9:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_2B9 = and:int(var_0_2B9:int, ldc:int(-2070251253))
            goto(Label_0115)
        }
        
        var_3_14F = initobject:String(String::<init>, stack_143_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1EE_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4805), ldc:int(39)))
        expr_161 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(17567), ldc:int(8709)))
        storeelement:String(expr_161:String[], xor:int(ldc:int(256), ldc:int(260)), invokevirtual:String[expected:String](String::substring, var_3_14F:String, and:int(ldc:int(6435), ldc:int(-15652)), and:int(ldc:int(4412), ldc:int(17437))))
        storeelement:String(expr_161:String[], xor:int(ldc:int(18563), ldc:int(18560)), invokevirtual:String[expected:String](String::substring, var_3_14F:String, xor:int(ldc:int(-31741), ldc:int(-31713)), and:int(ldc:int(13873), ldc:int(16417))))
        storeelement:String(expr_161:String[], and:int(ldc:int(-12192), ldc:int(11150)), invokevirtual:String[expected:String](String::substring, var_3_14F:String, xor:int(ldc:int(152), ldc:int(185)), xor:int(ldc:int(20546), ldc:int(20583))))
        storeelement:String(expr_161:String[], and:int(ldc:int(2058), ldc:int(1138)), invokevirtual:String[expected:String](String::substring, var_3_14F:String, xor:int(ldc:int(277), ldc:int(304)), and:int(ldc:int(21291), ldc:int(1065))))
        storeelement:String(expr_161:String[], and:int(ldc:int(12433), ldc:int(16387)), invokevirtual:String[expected:String](String::substring, var_3_14F:String, xor:int(ldc:int(8206), ldc:int(8231)), xor:int(ldc:int(8973), ldc:int(9021))))
        putstatic:String[](\u5bc4\u8413\u8753\u983f\ubf56::\u7043\u51b2\u4179\ufe34\u64f2\u8cae, expr_161:String[])
    }
    
    public void \uf94d\ud217\uc2e8\u8640\u3d4b\u97e6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_654 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_65F : int
        
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
        var_3_654 = and:int(ldc:int(442658155), ldc:int(-29401729))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5bc4\u8413\u8753\u983f\ubf56[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_654 = and:int(var_3_654:int, ldc:int(-1171075742))
            var_5_80 = and:int(ldc:int(-2832), ldc:int(2575))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-5480), ldc:int(5478)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_654:int, ldc:int(-73986179))
                    var_9_C7 = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_87:int, xor:int(ldc:int(928), ldc:int(929)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, and:int(ldc:int(87), ldc:int(13729)))), var_7_96:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_654 = and:int(var_3_D9:int, ldc:int(-1623814213))
                    var_14_114 = var_7_96:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(265), ldc:int(7)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_87:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1520)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-516540245))
                        goto(Label_1251)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(128)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1237941178))
                        goto(Label_1131)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(128)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1864470555))
                        goto(Label_0965)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0850)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0722)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1376796077))
                    }
                    else {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1688995562))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0590)
                            }
                            
                            goto(Label_0850)
                        }
                    }
                    
                    Label_0408:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1520)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(99457107))
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-180046431))
                        goto(Label_1251)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1702174570))
                        goto(Label_1131)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0965)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-78506640))
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0722)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(111077014))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-257304272))
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1690046991))
                        var_11_EA = and:int(ldc:int(8321), ldc:int(-8322))
                        goto(Label_1509)
                    }
                    
                    Label_0590:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-2127590880))
                        goto(Label_1520)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(2137637928))
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(517171296))
                        goto(Label_1251)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(128)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1358002640))
                        goto(Label_1131)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0965)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0850)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-418764054))
                            goto(Label_0408)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1074323653))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0850)
                        }
                    }
                    
                    Label_0722:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1520)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1251)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1984341210))
                        goto(Label_1131)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(374989514))
                        goto(Label_0965)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(256)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-42363112))
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-897665261))
                            goto(Label_0408)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(985819541))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0850:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1520)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1251)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1437311760))
                        goto(Label_1131)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-2048490555))
                            goto(Label_0722)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(926176231))
                            goto(Label_0590)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0408)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(1597496751))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_EA = xor:int(ldc:int(1040), ldc:int(1041))
                                goto(Label_1131)
                            }
                        }
                    }
                    
                    Label_0965:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(379051152))
                        goto(Label_1520)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(947419359))
                        goto(Label_1251)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1859922539))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0850)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-416849561))
                            goto(Label_0722)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1864552582))
                            goto(Label_0590)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0408)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1148236308))
                        var_11_EA = and:int(ldc:int(18790), ldc:int(-19327))
                    }
                    
                    Label_1131:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1347065706))
                        goto(Label_1520)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-68239801))
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(98100909))
                            goto(Label_0965)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0850)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(1418734346))
                            goto(Label_0722)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0408)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1637635203))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1376)
                            }
                        }
                    }
                    
                    Label_1251:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1520)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(834973822))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1258867805))
                            goto(Label_1131)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0965)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0850)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0722)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1804399685))
                            goto(Label_0408)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1079874060))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_80:int, var_16_118:int)
                            goto(Label_1509)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1376:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1787320128))
                        goto(Label_1520)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1251)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1131)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0965)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(686657223))
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0722)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0590)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(832887522))
                        goto(Label_0408)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(146756370))
                        loopcontinue()
                    }
                    
                    var_3_654 = and:int(var_3_654:int, ldc:int(-73963053))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1509:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_65F = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1520:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1166603276))
                        goto(Label_1251)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(256)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1591869453))
                        goto(Label_1131)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1920113179))
                        goto(Label_0965)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0722)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0590)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0408)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1581997872))
                        var_17_65F = add:int(var_16_118:int, and:int(ldc:int(16897), ldc:int(5577)))
                        looporswitchbreak()
                    }
                }
                
                var_3_654 = and:int(var_3_654:int, ldc:int(468679659))
                
                if (cmple:boolean(var_5_80 = var_17_65F:int, sub:int(var_6_87:int, xor:int(ldc:int(-31744), ldc:int(-31743))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
            var_3_654 = and:int(var_3_654:int, ldc:int(-1367626491))
            goto(Label_0108)
        }
    }
}
