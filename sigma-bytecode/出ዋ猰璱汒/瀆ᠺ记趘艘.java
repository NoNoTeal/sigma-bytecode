public class \u51fa\u12cb\u7330\u74b1\u6c52.\u7006\u183a\u8bb0\u8d98\u8258 {
    public void \u7006\u183a\u8bb0\u8d98\u8258() {
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
            invokespecial:Object(Object::<init>, this:\u7006\u183a\u8bb0\u8d98\u8258)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u8308\u071d\u3e2a\u7af6\u6b0d\uff55(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int \u0800\u69d9\u3504\ua562\u3504\u527a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u47c2\u47c2\u8709\u5fe1\u5140\u0800 p1) {
        var_4_7F : \u120d\u2dcc\ubff1\uceb8\ube23\u647c
        var_5_85 : \ube23\uc238\u5140\u4cd9\u8aa5
        var_6_8C : \u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>
        stack_EE_1 : String [generated]
        expr_D2 : Object[] [generated]
        
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
        var_4_7F = initobject:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::<init>, shr:int(getfield:int(\u47c2\u47c2\u8709\u5fe1\u5140\u0800::\u69d9\u6b0d\u74b1\u7873\u4e72\u494c, p1:\u47c2\u47c2\u8709\u5fe1\u5140\u0800), and:int(ldc:int(8196), ldc:int(18436))), shr:int(getfield:int(\u47c2\u47c2\u8709\u5fe1\u5140\u0800::\uc84e\u4c2b\u1187\u4975\uc4d2\u7af6, p1:\u47c2\u47c2\u8709\u5fe1\u5140\u0800), xor:int(ldc:int(162), ldc:int(166))))
        var_5_85 = invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5(\u8413\u5140\u64f2\uc9f6\u9937::\ube23\u7043\ubded\u759a\u74b1\u5f50, p0:\u8413\u5140\u64f2\uc9f6\u9937)
        var_6_8C = invokevirtual:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u64f2\uc9f6\u92ee\ud158\uc87f, var_5_85:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c])
        
        if (logicalnot:boolean(invokeinterface:boolean(LongSet::contains, invokevirtual:LongSet(\ube23\uc238\u5140\u4cd9\u8aa5::\uceb8\u8640\u4975\ub18d\ud158\u56bd, var_5_85:\ube23\uc238\u5140\u4cd9\u8aa5), invokevirtual:long(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u69d9\uf9c5\u97e6\u873d\u5245\uc7fe, var_4_7F:\u120d\u2dcc\ubff1\uceb8\ube23\u647c)))) {
            athrow(invokevirtual:CommandSyntaxException(Dynamic2CommandExceptionType::create, getstatic:Dynamic2CommandExceptionType(\u7006\u183a\u8bb0\u8d98\u8258::\uceb8\u836c\u5245\u9af2\u4f52\u0b8e), var_4_7F:\u120d\u2dcc\ubff1\uceb8\ube23\u647c[expected:Object], invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>::\u5f50\ub102\u71ae\u12b2\u4c2b\ub113, var_6_8C:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>)))
        }
        
        stack_EE_1 = loadelement:String(getstatic:String[](\u7006\u183a\u8bb0\u8d98\u8258::\u7c6b\ua61f\uc910\u72f1\u4c2b\ubded), and:int(ldc:int(16648), ldc:int(8217)))
        expr_D2 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(549), ldc:int(551)))
        storeelement:Object(expr_D2:Object[], and:int(ldc:int(-22048), ldc:int(21022)), var_4_7F:\u120d\u2dcc\ubff1\uceb8\ube23\u647c[expected:Object])
        storeelement:Object(expr_D2:Object[], and:int(ldc:int(513), ldc:int(18581)), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>::\u5f50\ub102\u71ae\u12b2\u4c2b\ub113, var_6_8C:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>))
        invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_EE_1:String, expr_D2:Object[]), and:int[expected:boolean](ldc:int(12104), ldc:int(-28521)))
        return:int(and:int(ldc:int(6373), ldc:int(17673)))
    }
    
    private static int \ub7dc\u071d\u385b\u36d3\ud7e8\u40a9(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
        var_1_10A : int
        var_3_64 : \ube23\uc238\u5140\u4cd9\u8aa5
        var_4_69 : \u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>
        var_5_6F : LongSet
        var_6_78 : int
        stack_AC_1 : String [generated]
        expr_9B : Object[] [generated]
        var_7_EF : String
        stack_19C_1 : String [generated]
        expr_180 : Object[] [generated]
        stack_155_1 : String [generated]
        expr_12B : Object[] [generated]
        
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
            var_1_10A = and:int(ldc:int(-961435241), ldc:int(-711738627))
            var_3_64 = invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5(\u8413\u5140\u64f2\uc9f6\u9937::\ube23\u7043\ubded\u759a\u74b1\u5f50, p0:\u8413\u5140\u64f2\uc9f6\u9937)
            var_4_69 = invokevirtual:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u64f2\uc9f6\u92ee\ud158\uc87f, var_3_64:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c])
            var_5_6F = invokevirtual:LongSet(\ube23\uc238\u5140\u4cd9\u8aa5::\uceb8\u8640\u4975\ub18d\ud158\u56bd, var_3_64:\ube23\uc238\u5140\u4cd9\u8aa5)
            var_6_78 = invokeinterface:int(LongSet::size, var_5_6F:LongSet)
            
            if (cmple:boolean(var_6_78:int, ldc:int(0))) {
                stack_AC_1 = loadelement:String(getstatic:String[](\u7006\u183a\u8bb0\u8d98\u8258::\u7c6b\ua61f\uc910\u72f1\u4c2b\ubded), xor:int(ldc:int(-24052), ldc:int(-24064)))
                expr_9B = newarray:Object[](java.lang.Object.class, and:int(ldc:int(905), ldc:int(15361)))
                storeelement:Object(expr_9B:Object[], and:int(ldc:int(-19825), ldc:int(16752)), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>::\u5f50\ub102\u71ae\u12b2\u4c2b\ub113, var_4_69:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>))
                invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\ub19c\u92ff\u760c\u759a\u946b\ucef1, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_AC_1:String, expr_9B:Object[]))
            }
            else {
                var_7_EF = invokevirtual:String(Joiner::join, invokestatic:Joiner(Joiner::on, loadelement:String(getstatic:String[](\u7006\u183a\u8bb0\u8d98\u8258::\u7c6b\ua61f\uc910\u72f1\u4c2b\ubded), xor:int(ldc:int(-30462), ldc:int(-30453)))), invokeinterface:Iterator(BaseStream::iterator, invokeinterface:Stream[expected:BaseStream](Stream::map, invokeinterface:Stream(Stream::map, invokeinterface:Stream(Stream::sorted, invokeinterface:Stream(LongSet::stream, var_5_6F:LongSet)), invokedynamic:Function<Long, \u120d\u2dcc\ubff1\uceb8\ube23\u647c>(apply:()Ljava/util/function/Function;)), invokedynamic:Function<T, String>(apply:()Ljava/util/function/Function;))))
                
                if (cmpeq:boolean(var_6_78:int, and:int(ldc:int(51), ldc:int(9477)))) {
                    stack_19C_1 = loadelement:String(getstatic:String[](\u7006\u183a\u8bb0\u8d98\u8258::\u7c6b\ua61f\uc910\u72f1\u4c2b\ubded), xor:int(ldc:int(16393), ldc:int(16387)))
                    expr_180 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(24608), ldc:int(24610)))
                    storeelement:Object(expr_180:Object[], and:int(ldc:int(24630), ldc:int(-25791)), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>::\u5f50\ub102\u71ae\u12b2\u4c2b\ub113, var_4_69:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>))
                    storeelement:Object(expr_180:Object[], xor:int(ldc:int(16496), ldc:int(16497)), var_7_EF:String[expected:Object])
                    invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_19C_1:String, expr_180:Object[]), and:int[expected:boolean](ldc:int(-9923), ldc:int(9922)))
                    goto(Label_0425)
                }
                
                Label_0253:
                
                if (cmpne:boolean(and:int(var_1_10A:int, ldc:int(8)), ldc:int(0))) {
                    var_1_10A = and:int(var_1_10A:int, ldc:int(1561519083))
                }
                else {
                    var_1_10A = and:int(var_1_10A:int, ldc:int(-855638319))
                    stack_155_1 = loadelement:String(getstatic:String[](\u7006\u183a\u8bb0\u8d98\u8258::\u7c6b\ua61f\uc910\u72f1\u4c2b\ubded), xor:int(ldc:int(-32478), ldc:int(-32471)))
                    expr_12B = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(-24574), ldc:int(-24575)))
                    storeelement:Object(expr_12B:Object[], and:int(ldc:int(1810), ldc:int(-12179)), invokestatic:Integer[expected:Object](Integer::valueOf, var_6_78:int))
                    storeelement:Object(expr_12B:Object[], xor:int(ldc:int(2059), ldc:int(2058)), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>::\u5f50\ub102\u71ae\u12b2\u4c2b\ub113, var_4_69:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>))
                    storeelement:Object(expr_12B:Object[], and:int(ldc:int(8982), ldc:int(20482)), var_7_EF:String[expected:Object])
                    invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_155_1:String, expr_12B:Object[]), and:int[expected:boolean](ldc:int(-24194), ldc:int(7681)))
                }
                
                Label_0425:
                
                if (cmpeq:boolean(and:int(var_1_10A:int, ldc:int(8192)), ldc:int(0))) {
                    var_1_10A = and:int(var_1_10A:int, ldc:int(-764795469))
                    goto(Label_0253)
                }
            }
            
            return:int(var_6_78:int)
        }
        
        goto(Label_0006)
    }
    
    private static int \uafe7\ub8be\u4d85\u51b2\u4e72\uc29a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
    
    private static int \u7ce1\u8df4\u8753\ub18d\u5bc4\uc910(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u47c2\u47c2\u8709\u5fe1\u5140\u0800 p1, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u47c2\u47c2\u8709\u5fe1\u5140\u0800 p2, boolean p3) {
        var_6_70 : int
        var_7_7D : int
        var_8_8A : int
        var_9_97 : int
        var_10_EB : int
        var_11_F7 : int
        var_12_103 : int
        var_13_10F : int
        var_14_122 : long
        var_16_139 : \ube23\uc238\u5140\u4cd9\u8aa5
        var_17_140 : \u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>
        var_18_143 : Object
        var_19_14C : int
        var_20_150 : int
        var_21_1DA : int
        var_20_199 : \u120d\u2dcc\ubff1\uceb8\ube23\u647c
        var_21_1A6 : \u120d\u2dcc\ubff1\uceb8\ube23\u647c
        stack_328_1 : String [generated]
        expr_2F3 : Object[] [generated]
        stack_2B9_1 : String [generated]
        expr_29D : Object[] [generated]
        
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
            var_6_70 = invokestatic:int(Math::min, getfield:int(\u47c2\u47c2\u8709\u5fe1\u5140\u0800::\u69d9\u6b0d\u74b1\u7873\u4e72\u494c, p1:\u47c2\u47c2\u8709\u5fe1\u5140\u0800), getfield:int(\u47c2\u47c2\u8709\u5fe1\u5140\u0800::\u69d9\u6b0d\u74b1\u7873\u4e72\u494c, p2:\u47c2\u47c2\u8709\u5fe1\u5140\u0800))
            var_7_7D = invokestatic:int(Math::min, getfield:int(\u47c2\u47c2\u8709\u5fe1\u5140\u0800::\uc84e\u4c2b\u1187\u4975\uc4d2\u7af6, p1:\u47c2\u47c2\u8709\u5fe1\u5140\u0800), getfield:int(\u47c2\u47c2\u8709\u5fe1\u5140\u0800::\uc84e\u4c2b\u1187\u4975\uc4d2\u7af6, p2:\u47c2\u47c2\u8709\u5fe1\u5140\u0800))
            var_8_8A = invokestatic:int(Math::max, getfield:int(\u47c2\u47c2\u8709\u5fe1\u5140\u0800::\u69d9\u6b0d\u74b1\u7873\u4e72\u494c, p1:\u47c2\u47c2\u8709\u5fe1\u5140\u0800), getfield:int(\u47c2\u47c2\u8709\u5fe1\u5140\u0800::\u69d9\u6b0d\u74b1\u7873\u4e72\u494c, p2:\u47c2\u47c2\u8709\u5fe1\u5140\u0800))
            var_9_97 = invokestatic:int(Math::max, getfield:int(\u47c2\u47c2\u8709\u5fe1\u5140\u0800::\uc84e\u4c2b\u1187\u4975\uc4d2\u7af6, p1:\u47c2\u47c2\u8709\u5fe1\u5140\u0800), getfield:int(\u47c2\u47c2\u8709\u5fe1\u5140\u0800::\uc84e\u4c2b\u1187\u4975\uc4d2\u7af6, p2:\u47c2\u47c2\u8709\u5fe1\u5140\u0800))
            
            if (cmpge:boolean(var_6_70:int, ldc:int(-30000000))) {
                if (cmpge:boolean(var_7_7D:int, ldc:int(-30000000))) {
                    if (cmplt:boolean(var_8_8A:int, ldc:int(30000000))) {
                        if (cmplt:boolean(var_9_97:int, ldc:int(30000000))) {
                            var_10_EB = shr:int(var_6_70:int, xor:int(ldc:int(2691), ldc:int(2695)))
                            var_11_F7 = shr:int(var_7_7D:int, xor:int(ldc:int(-24304), ldc:int(-24300)))
                            var_12_103 = shr:int(var_8_8A:int, xor:int(ldc:int(624), ldc:int(628)))
                            var_13_10F = shr:int(var_9_97:int, xor:int(ldc:int(-24541), ldc:int(-24537)))
                            var_14_122 = mul:long(add:long(i2l:long(sub:int(var_12_103:int, var_10_EB:int)), ldc:long(1L)), add:long(i2l:long(sub:int(var_13_10F:int, var_11_F7:int)), ldc:long(1L)))
                            
                            if (cmpgt:boolean(var_14_122:long, ldc:long(256L))) {
                                athrow(invokevirtual:CommandSyntaxException(Dynamic2CommandExceptionType::create, getstatic:Dynamic2CommandExceptionType(\u7006\u183a\u8bb0\u8d98\u8258::\ub6ab\u8258\u4d85\u5bc4\ub18d\uc246), invokestatic:Integer[expected:Object](Integer::valueOf, and:int(ldc:int(6912), ldc:int(9472))), invokestatic:Long(Long::valueOf, var_14_122:long)))
                            }
                            
                            var_16_139 = invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5(\u8413\u5140\u64f2\uc9f6\u9937::\ube23\u7043\ubded\u759a\u74b1\u5f50, p0:\u8413\u5140\u64f2\uc9f6\u9937)
                            var_17_140 = invokevirtual:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u64f2\uc9f6\u92ee\ud158\uc87f, var_16_139:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c])
                            var_18_143 = aconstnull:Object()
                            var_19_14C = and:int(ldc:int(-24943), ldc:int(24942))
                            var_20_150 = var_10_EB:int
                            
                            while (cmple:boolean(var_20_150:int, var_12_103:int)) {
                                var_21_1DA = var_11_F7:int
                                
                                while (cmple:boolean(var_21_1DA:int, var_13_10F:int)) {
                                    if (invokevirtual:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\u6d99\ud51e\uc87f\u4d85\u760c\ube23, var_16_139:\ube23\uc238\u5140\u4cd9\u8aa5, var_20_150:int, var_21_1DA:int, p3:boolean)) {
                                        inc:int(var_19_14C, ldc:int(1))
                                        
                                        if (cmpeq:boolean(var_18_143:Object, aconstnull:Object())) {
                                            var_18_143 = initobject:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::<init>, var_20_150:int, var_21_1DA:int)
                                        }
                                    }
                                    
                                    inc:int(var_21_1DA, ldc:int(1))
                                }
                                
                                inc:int(var_20_150, ldc:int(1))
                            }
                            
                            if (cmpne:boolean(var_19_14C:int, ldc:int(0))) {
                                if (cmpne:boolean(var_19_14C:int, xor:int(ldc:int(4128), ldc:int(4129)))) {
                                    var_20_199 = initobject:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::<init>, var_10_EB:int, var_11_F7:int)
                                    var_21_1A6 = initobject:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::<init>, var_12_103:int, var_13_10F:int)
                                    stack_328_1 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7006\u183a\u8bb0\u8d98\u8258::\u7c6b\ua61f\uc910\u72f1\u4c2b\ubded), and:int(ldc:int(14), ldc:int(4623)))), ternaryop:String(p3:boolean, loadelement:String(getstatic:String[](\u7006\u183a\u8bb0\u8d98\u8258::\u7c6b\ua61f\uc910\u72f1\u4c2b\ubded), xor:int(ldc:int(-27606), ldc:int(-27611))), loadelement:String(getstatic:String[](\u7006\u183a\u8bb0\u8d98\u8258::\u7c6b\ua61f\uc910\u72f1\u4c2b\ubded), and:int(ldc:int(272), ldc:int(2196))))), loadelement:String(getstatic:String[](\u7006\u183a\u8bb0\u8d98\u8258::\u7c6b\ua61f\uc910\u72f1\u4c2b\ubded), and:int(ldc:int(22750), ldc:int(8211)))))
                                    expr_2F3 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(18819), ldc:int(18823)))
                                    storeelement:Object(expr_2F3:Object[], and:int(ldc:int(3470), ldc:int(-4047)), invokestatic:Integer[expected:Object](Integer::valueOf, var_19_14C:int))
                                    storeelement:Object(expr_2F3:Object[], xor:int(ldc:int(16386), ldc:int(16387)), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>::\u5f50\ub102\u71ae\u12b2\u4c2b\ub113, var_17_140:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>))
                                    storeelement:Object(expr_2F3:Object[], and:int(ldc:int(11523), ldc:int(170)), var_20_199:\u120d\u2dcc\ubff1\uceb8\ube23\u647c[expected:Object])
                                    storeelement:Object(expr_2F3:Object[], xor:int(ldc:int(1281), ldc:int(1282)), var_21_1A6:\u120d\u2dcc\ubff1\uceb8\ube23\u647c[expected:Object])
                                    invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_328_1:String, expr_2F3:Object[]), xor:int[expected:boolean](ldc:int(897), ldc:int(896)))
                                }
                                else {
                                    stack_2B9_1 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7006\u183a\u8bb0\u8d98\u8258::\u7c6b\ua61f\uc910\u72f1\u4c2b\ubded), xor:int(ldc:int(13576), ldc:int(13574)))), ternaryop:String(p3:boolean, loadelement:String(getstatic:String[](\u7006\u183a\u8bb0\u8d98\u8258::\u7c6b\ua61f\uc910\u72f1\u4c2b\ubded), xor:int(ldc:int(2594), ldc:int(2605))), loadelement:String(getstatic:String[](\u7006\u183a\u8bb0\u8d98\u8258::\u7c6b\ua61f\uc910\u72f1\u4c2b\ubded), and:int(ldc:int(1616), ldc:int(20501))))), loadelement:String(getstatic:String[](\u7006\u183a\u8bb0\u8d98\u8258::\u7c6b\ua61f\uc910\u72f1\u4c2b\ubded), xor:int(ldc:int(-23552), ldc:int(-23535)))))
                                    expr_29D = newarray:Object[](java.lang.Object.class, and:int(ldc:int(82), ldc:int(24707)))
                                    storeelement:Object(expr_29D:Object[], and:int(ldc:int(4827), ldc:int(-29660)), var_18_143:Object)
                                    storeelement:Object(expr_29D:Object[], and:int(ldc:int(20737), ldc:int(10261)), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\u64f2\ub8be\u760c\u5245\u6c52\u7af6<T>::\u5f50\ub102\u71ae\u12b2\u4c2b\ub113, var_17_140:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>))
                                    invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_2B9_1:String, expr_29D:Object[]), xor:int[expected:boolean](ldc:int(12), ldc:int(13)))
                                }
                                
                                return:int(var_19_14C:int)
                            }
                            
                            athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, ternaryop:SimpleCommandExceptionType(p3:boolean, getstatic:SimpleCommandExceptionType(\u7006\u183a\u8bb0\u8d98\u8258::\u7ce1\u5fe1\u92ff\u92ee\u4975\u718f), getstatic:SimpleCommandExceptionType(\u7006\u183a\u8bb0\u8d98\u8258::\u392e\ub171\u7af6\u4975\u12cb\u36d3))))
                        }
                    }
                }
            }
            
            athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u8413\uc2e8\u3e2a\u7043\uc9f6::\ubcb0\u98a4\u516c\ube23\u5654\ufcaf)))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u6c56\u5245\u67d0\u5bc4\ucb79\uceb8$10(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, long p1) {
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
            invokevirtual:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\u6d99\ud51e\uc87f\u4d85\u760c\ube23, p0:\ube23\uc238\u5140\u4cd9\u8aa5, invokestatic:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\ud523\u7e3f\ua562\u4bc8\u836c\u647c, p1:long), invokestatic:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u1187\uc4d2\u4d85\u3e75\ubb2b\ua068, p1:long), and:int[expected:boolean](ldc:int(10565), ldc:int(-10566)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u6bb9\u6d99\ub113\u4daf\u7d52\ucfaf$9(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7006\u183a\u8bb0\u8d98\u8258::\u0800\u69d9\u3504\ua562\u3504\u527a, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u47c2\u47c2\u8709\u5fe1\u5140\u0800(\u4f4a\u7e3f\u5fe1\u8350\ub8be::\u7af6\ub113\ube23\u59ec\u8350\u3e2a, p0:CommandContext, loadelement:String(getstatic:String[](\u7006\u183a\u8bb0\u8d98\u8258::\u7c6b\ua61f\uc910\u72f1\u4c2b\ubded), and:int(ldc:int(1031), ldc:int(8471))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u6b0d\u760c\u4e72\u7873\u5654\u392e$8(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7006\u183a\u8bb0\u8d98\u8258::\ub7dc\u071d\u385b\u36d3\ud7e8\u40a9, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u4f4a\u7ce1\u120d\u69d9\ud12e\uf995$7(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7006\u183a\u8bb0\u8d98\u8258::\uafe7\ub8be\u4d85\u51b2\u4e72\uc29a, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u76bc\uc246\u59ec\ub7dc\u6fb0\ua61f$6(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7006\u183a\u8bb0\u8d98\u8258::\u7ce1\u8df4\u8753\ub18d\u5bc4\uc910, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u47c2\u47c2\u8709\u5fe1\u5140\u0800(\u4f4a\u7e3f\u5fe1\u8350\ub8be::\u7af6\ub113\ube23\u59ec\u8350\u3e2a, p0:CommandContext, loadelement:String(getstatic:String[](\u7006\u183a\u8bb0\u8d98\u8258::\u7c6b\ua61f\uc910\u72f1\u4c2b\ubded), and:int(ldc:int(26311), ldc:int(2354)))), invokestatic:\u47c2\u47c2\u8709\u5fe1\u5140\u0800(\u4f4a\u7e3f\u5fe1\u8350\ub8be::\u7af6\ub113\ube23\u59ec\u8350\u3e2a, p0:CommandContext, loadelement:String(getstatic:String[](\u7006\u183a\u8bb0\u8d98\u8258::\u7c6b\ua61f\uc910\u72f1\u4c2b\ubded), xor:int(ldc:int(2064), ldc:int(2067)))), and:int[expected:boolean](ldc:int(4135), ldc:int(-4136))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ubded\u97b7\u6bb9\u3d64\u392e\u7ce1$5(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7006\u183a\u8bb0\u8d98\u8258::\u7ce1\u8df4\u8753\ub18d\u5bc4\uc910, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u47c2\u47c2\u8709\u5fe1\u5140\u0800(\u4f4a\u7e3f\u5fe1\u8350\ub8be::\u7af6\ub113\ube23\u59ec\u8350\u3e2a, p0:CommandContext, loadelement:String(getstatic:String[](\u7006\u183a\u8bb0\u8d98\u8258::\u7c6b\ua61f\uc910\u72f1\u4c2b\ubded), and:int(ldc:int(9538), ldc:int(2090)))), invokestatic:\u47c2\u47c2\u8709\u5fe1\u5140\u0800(\u4f4a\u7e3f\u5fe1\u8350\ub8be::\u7af6\ub113\ube23\u59ec\u8350\u3e2a, p0:CommandContext, loadelement:String(getstatic:String[](\u7006\u183a\u8bb0\u8d98\u8258::\u7c6b\ua61f\uc910\u72f1\u4c2b\ubded), xor:int(ldc:int(2200), ldc:int(2202)))), and:int[expected:boolean](ldc:int(-13863), ldc:int(13350))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u9937\ub102\u760c\u3504\u8640\ub102$4(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7006\u183a\u8bb0\u8d98\u8258::\u7ce1\u8df4\u8753\ub18d\u5bc4\uc910, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u47c2\u47c2\u8709\u5fe1\u5140\u0800(\u4f4a\u7e3f\u5fe1\u8350\ub8be::\u7af6\ub113\ube23\u59ec\u8350\u3e2a, p0:CommandContext, loadelement:String(getstatic:String[](\u7006\u183a\u8bb0\u8d98\u8258::\u7c6b\ua61f\uc910\u72f1\u4c2b\ubded), xor:int(ldc:int(4163), ldc:int(4161)))), invokestatic:\u47c2\u47c2\u8709\u5fe1\u5140\u0800(\u4f4a\u7e3f\u5fe1\u8350\ub8be::\u7af6\ub113\ube23\u59ec\u8350\u3e2a, p0:CommandContext, loadelement:String(getstatic:String[](\u7006\u183a\u8bb0\u8d98\u8258::\u7c6b\ua61f\uc910\u72f1\u4c2b\ubded), and:int(ldc:int(83), ldc:int(20739)))), and:int[expected:boolean](ldc:int(1137), ldc:int(17037))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u9a18\u4e72\u183a\u99f7\ua3b4\u1187$3(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7006\u183a\u8bb0\u8d98\u8258::\u7ce1\u8df4\u8753\ub18d\u5bc4\uc910, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u47c2\u47c2\u8709\u5fe1\u5140\u0800(\u4f4a\u7e3f\u5fe1\u8350\ub8be::\u7af6\ub113\ube23\u59ec\u8350\u3e2a, p0:CommandContext, loadelement:String(getstatic:String[](\u7006\u183a\u8bb0\u8d98\u8258::\u7c6b\ua61f\uc910\u72f1\u4c2b\ubded), xor:int(ldc:int(913), ldc:int(915)))), invokestatic:\u47c2\u47c2\u8709\u5fe1\u5140\u0800(\u4f4a\u7e3f\u5fe1\u8350\ub8be::\u7af6\ub113\ube23\u59ec\u8350\u3e2a, p0:CommandContext, loadelement:String(getstatic:String[](\u7006\u183a\u8bb0\u8d98\u8258::\u7c6b\ua61f\uc910\u72f1\u4c2b\ubded), and:int(ldc:int(2), ldc:int(16403)))), and:int[expected:boolean](ldc:int(21763), ldc:int(645))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u7c6b\ud4fe\u0b8e\u8389\uc4d2\u983f$2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, and:int(ldc:int(418), ldc:int(70))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\u52d3\u385b\u3d64\u40a9\u0a06\u51fa$1(java.lang.Object p0, java.lang.Object p1) {
        stack_8F_1 : String [generated]
        expr_78 : Object[] [generated]
        
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
            stack_8F_1 = loadelement:String(getstatic:String[](\u7006\u183a\u8bb0\u8d98\u8258::\u7c6b\ua61f\uc910\u72f1\u4c2b\ubded), xor:int(ldc:int(8195), ldc:int(8208)))
            expr_78 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(839), ldc:int(16434)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(9514), ldc:int(-10155)), p0:Object)
            storeelement:Object(expr_78:Object[], xor:int(ldc:int(33), ldc:int(32)), p1:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_8F_1:String, expr_78:Object[]))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\u5f50\u64ab\ud158\u99f7\u8cae\u7ce1$0(java.lang.Object p0, java.lang.Object p1) {
        stack_8F_1 : String [generated]
        expr_78 : Object[] [generated]
        
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
            stack_8F_1 = loadelement:String(getstatic:String[](\u7006\u183a\u8bb0\u8d98\u8258::\u7c6b\ua61f\uc910\u72f1\u4c2b\ubded), and:int(ldc:int(17684), ldc:int(2109)))
            expr_78 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(21121), ldc:int(21123)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(-5118), ldc:int(4565)), p0:Object)
            storeelement:Object(expr_78:Object[], xor:int(ldc:int(384), ldc:int(385)), p1:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_8F_1:String, expr_78:Object[]))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_430 : int
        expr_6E : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_CC_0 : byte[] [generated]
        stack_CE_0 : byte[] [generated]
        stack_107_0 : byte[] [generated]
        stack_109_0 : byte[] [generated]
        stack_12D_0 : byte[] [generated]
        stack_443_0 : byte[] [generated]
        stack_4D2_0 : byte[] [generated]
        stack_50D_0 : byte[] [generated]
        stack_563_0 : byte[] [generated]
        var_4_41B : int
        var_3_420 : byte[]
        var_5_421 : int
        var_0_45D : int
        expr_443 : byte [generated]
        stack_48C_2 : byte [generated]
        stack_460_0 : byte [generated]
        expr_9E : int [generated]
        var_2_CC : byte[]
        expr_D0 : int [generated]
        var_3_4FB : byte[]
        var_5_4FC : int
        expr_109 : int [generated]
        var_3_551 : byte[]
        var_5_552 : int
        expr_566 : byte [generated]
        var_3_139 : String
        expr_141 : String[] [generated]
        expr_14B : String[] [generated]
        var_3_3C2 : String[]
        
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
        var_0_430 = and:int(ldc:int(1138845501), ldc:int(-637622722))
        expr_6E = arraylength:int(stack_9C_0 = stack_9E_0 = stack_CC_0 = stack_CE_0 = stack_107_0 = stack_109_0 = stack_12D_0 = stack_443_0 = stack_4D2_0 = stack_50D_0 = stack_563_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("QN7LXmyUgzPslwcB3xT9+X6AfoCAAAQEAQOCAH6CfX3npYCB6BVdAAGXg52AAgR/Yn1956WAgegVXQABl4OefX6AfeGnAoYE/ULm+/+EG5oCfX3npYCB6BVdAAGXg559foB94aMDg4B+YIEBggJ9feelgIHoFV0AAZeDoAP/6OgAeuuYA15slIGVApiCAn1956WAgegVXQABl4OgA//o6P1oAp+Z3xMAfQCCAn1956WAgegVXQABl4OeZeYB60m/mgWWlULm+/+EG5oCfX3npYCB6BVdAAGXg55l5gHrSbkA6JMVYAEAAgQDGRp9feelgIHoFV0AAZeDneUCA4THmH+f/RyBgGIAfoJ9feelgIHoFV0AAZeDneUCA4THmH+ke54E/ULm+/+EG5oCfX3npYCB6BVdAAGXg5zoAQEDZ5yAAOP5/QABl4d96AIC5IB/5OaWbf+AHAKZf5lkAfyfZ5h8aABKsjJHqw==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_41B = expr_6E:int
        var_3_420 = newarray:byte[](byte.class, expr_6E:int)
        var_5_421 = expr_6E:int
        Label_1059:
        
        while (cmpne:boolean(and:int(var_0_430:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_45D = and:int(var_0_430:int, ldc:int(-338892228))
            var_5_421 = add:int(var_5_421:int, ldc:int(-1))
            expr_443 = stack_48C_2 = loadelement(stack_443_0, var_5_421)
            
            if (cmplt:boolean(add:int(add:int(var_5_421:int, ldc:int(5)), neg:int(var_4_41B:int)), ldc:int(0))) {
                stack_48C_2 = stack_460_0 = add:byte(expr_443:byte, loadelement:byte(var_3_420:byte[], add:int(var_5_421:int, ldc:int(5))))
                goto(Label_1136)
            }
            
            Label_1104:
            
            if (cmpeq:boolean(and:int(var_0_45D:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_45D = and:int(var_0_45D:int, ldc:int(1339946591))
                stack_48C_2 = stack_460_0 = add:byte(expr_443:byte, ldc:byte(5))
            }
            
            Label_1136:
            
            if (cmpeq:boolean(and:int(var_0_45D:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_45D = and:int(var_0_45D:int, ldc:int(-246711181))
                goto(Label_1104)
            }
            
            var_0_430 = and:int(var_0_45D:int, ldc:int(2078196668))
            storeelement:byte(var_3_420:byte[], var_5_421:int, stack_48C_2:byte)
            
            if (cmpne:boolean(var_5_421:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_CC_0 = stack_CE_0 = stack_107_0 = stack_109_0 = stack_12D_0 = stack_443_0 = stack_4D2_0 = stack_50D_0 = stack_563_0 = var_3_420:byte[]
            goto(Label_0115)
        }
        
        var_0_430 = and:int(var_0_430:int, ldc:int(-1899168789))
        Label_1202:
        
        while (cmpeq:boolean(and:int(var_0_430:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_430 = and:int(var_0_430:int, ldc:int(-118417636))
            var_5_421 = add:int(var_5_421:int, ldc:int(-1))
            storeelement:byte(var_3_420:byte[], var_5_421:int, xor:byte(loadelement:byte(stack_4D2_0:byte[], var_5_421:int), ldc:byte(8)))
            
            if (cmpne:boolean(var_5_421:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_CC_0 = stack_CE_0 = stack_107_0 = stack_109_0 = stack_12D_0 = stack_443_0 = stack_4D2_0 = stack_50D_0 = stack_563_0 = var_3_420:byte[]
            goto(Label_0163)
        }
        
        var_0_430 = and:int(var_0_430:int, ldc:int(208684861))
        goto(Label_1059)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_430:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_430 = and:int(var_0_430:int, ldc:int(1333883307))
            goto(Label_0270)
        }
        
        if (cmpeq:boolean(and:int(var_0_430:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0213)
        }
        
        if (cmpeq:boolean(and:int(var_0_430:int, ldc:int(2048)), ldc:int(0))) {
            var_0_430 = and:int(var_0_430:int, ldc:int(1458672573))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_41B = expr_9E:int
                var_3_420 = newarray:byte[](byte.class, expr_9E:int)
                var_5_421 = expr_9E:int
                goto(Label_1202)
            }
        }
        
        Label_0163:
        
        if (cmpne:boolean(and:int(var_0_430:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_430 = and:int(var_0_430:int, ldc:int(1433657197))
            goto(Label_0270)
        }
        
        if (cmpeq:boolean(and:int(var_0_430:int, ldc:int(536870912)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_430:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_430 = and:int(var_0_430:int, ldc:int(1740824319))
            var_2_CC = stack_CC_0:byte[]
            expr_D0 = add:int(arraylength:int(stack_CE_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_D0:int, ldc:int(0))) {
                var_3_4FB = newarray:byte[](byte.class, expr_D0:int)
                var_5_4FC = expr_D0:int
                
                loop {
                    var_0_430 = and:int(var_0_430:int, ldc:int(1659034493))
                    var_5_4FC = add:int(var_5_4FC:int, ldc:int(-1))
                    storeelement:byte(var_3_4FB:byte[], var_5_4FC:int, add:int(shl:int(loadelement:byte(stack_50D_0:byte[], var_5_4FC:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_CC:byte[], add:int(var_5_4FC:int, xor:int(ldc:int(10753), ldc:int(10752)))), ldc:int(3)), xor:int(ldc:int(17156), ldc:int(17179)))))
                    
                    if (cmpne:boolean(var_5_4FC:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_CC_0 = stack_CE_0 = stack_107_0 = stack_109_0 = stack_12D_0 = stack_443_0 = stack_4D2_0 = stack_50D_0 = stack_563_0 = var_3_4FB:byte[]
            }
        }
        
        Label_0213:
        
        if (cmpne:boolean(and:int(var_0_430:int, ldc:int(8388608)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_430:int, ldc:int(2048)), ldc:int(0))) {
                var_0_430 = and:int(var_0_430:int, ldc:int(-335355105))
                goto(Label_0163)
            }
            
            if (cmpne:boolean(and:int(var_0_430:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_430 = and:int(var_0_430:int, ldc:int(-1115391456))
                goto(Label_0115)
            }
            
            var_0_430 = and:int(var_0_430:int, ldc:int(1660172861))
            expr_109 = arraylength:int(stack_109_0:byte[])
            
            if (cmpne:boolean(expr_109:int, ldc:int(0))) {
                var_3_551 = newarray:byte[](byte.class, expr_109:int)
                var_5_552 = expr_109:int
                
                loop {
                    var_0_430 = and:int(var_0_430:int, ldc:int(-1010500995))
                    var_5_552 = add:int(var_5_552:int, ldc:int(-1))
                    expr_566 = add:byte(loadelement:byte(stack_563_0:byte[], var_5_552:int), ldc:byte(95))
                    storeelement:byte(var_3_551:byte[], var_5_552:int, or:int(and:int(shl:int(expr_566:byte, and:int(ldc:int(629), ldc:int(6148))), ldc:int(-16)), and:int(shr:int(expr_566:byte[expected:int], xor:int(ldc:int(2633), ldc:int(2637))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_552:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_CC_0 = stack_CE_0 = stack_107_0 = stack_109_0 = stack_12D_0 = stack_443_0 = stack_4D2_0 = stack_50D_0 = stack_563_0 = var_3_551:byte[]
            }
        }
        
        Label_0270:
        
        if (cmpne:boolean(and:int(var_0_430:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0213)
        }
        
        if (cmpeq:boolean(and:int(var_0_430:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0163)
        }
        
        if (cmpne:boolean(and:int(var_0_430:int, ldc:int(512)), ldc:int(0))) {
            var_3_139 = initobject:String(String::<init>, stack_12D_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_141 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(73), ldc:int(94)))
            expr_14B = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1119), ldc:int(183)))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(18981), ldc:int(18988)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(6849), ldc:int(-6854)), and:int(ldc:int(8335), ldc:int(5970))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(8284), ldc:int(8270)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(21008), ldc:int(21010)), and:int(ldc:int(8491), ldc:int(22539))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(6359), ldc:int(16433)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(-24309), ldc:int(-24320)), xor:int(ldc:int(1033), ldc:int(1051))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(25369), ldc:int(3)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(4355), ldc:int(4369)), and:int(ldc:int(7221), ldc:int(991))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(10241), ldc:int(10254)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(2069), ldc:int(25685)), xor:int(ldc:int(18471), ldc:int(18493))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(4373), ldc:int(3239)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(4575), ldc:int(10298)), xor:int(ldc:int(555), ldc:int(566))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(5262), ldc:int(17182)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(4701), ldc:int(16413)), xor:int(ldc:int(16467), ldc:int(16483))))
            storeelement:String(expr_141:String[], and:int(ldc:int(25173), ldc:int(2071)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(17476), ldc:int(17524)), and:int(ldc:int(4308), ldc:int(9296))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(20493), ldc:int(20481)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(1296), ldc:int(1344)), xor:int(ldc:int(13387), ldc:int(13350))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(4123), ldc:int(17419)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(8225), ldc:int(8268)), and:int(ldc:int(17053), ldc:int(8623))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(338), ldc:int(344)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(979), ldc:int(862)), xor:int(ldc:int(-32673), ldc:int(-32524))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(2259), ldc:int(20755)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(16526), ldc:int(16421)), and:int(ldc:int(1227), ldc:int(24831))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(310), ldc:int(318)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(1271), ldc:int(1084)), and:int(ldc:int(3067), ldc:int(20715))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(365), ldc:int(29)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(20715), ldc:int(2283)), and:int(ldc:int(8585), ldc:int(18779))))
            storeelement:String(expr_141:String[], xor:int(ldc:int(-14332), ldc:int(-14318)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(27483), ldc:int(4365)), and:int(ldc:int(827), ldc:int(10603))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(20564), ldc:int(20)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(1835), ldc:int(12719)), xor:int(ldc:int(13037), ldc:int(13225))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(20515), ldc:int(-20516)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(1372), ldc:int(24903)), and:int(ldc:int(1869), ldc:int(4429))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(5426), ldc:int(16587)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(1213), ldc:int(1520)), and:int(ldc:int(8573), ldc:int(22867))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(4655), ldc:int(24647)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(1086), ldc:int(1391)), and:int(ldc:int(862), ldc:int(2388))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(16451), ldc:int(16453)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(445), ldc:int(233)), and:int(ldc:int(6141), ldc:int(18779))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(21508), ldc:int(21504)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(9049), ldc:int(7515)), and:int(ldc:int(4447), ldc:int(4095))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(6289), ldc:int(16)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(9695), ldc:int(351)), xor:int(ldc:int(151), ldc:int(497))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(528), ldc:int(531)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(2645), ldc:int(2867)), xor:int(ldc:int(5129), ldc:int(5473))))
            putstatic:String[](\u7006\u183a\u8bb0\u8d98\u8258::\u7c6b\ua61f\uc910\u72f1\u4c2b\ubded, expr_14B:String[])
            var_3_3C2 = expr_141:String[]
            putstatic:Dynamic2CommandExceptionType(\u7006\u183a\u8bb0\u8d98\u8258::\ub6ab\u8258\u4d85\u5bc4\ub18d\uc246, initobject:Dynamic2CommandExceptionType(Dynamic2CommandExceptionType::<init>, invokedynamic:Dynamic2CommandExceptionType$Function(apply:()Lcom/mojang/brigadier/exceptions/Dynamic2CommandExceptionType$Function;)))
            putstatic:Dynamic2CommandExceptionType(\u7006\u183a\u8bb0\u8d98\u8258::\uceb8\u836c\u5245\u9af2\u4f52\u0b8e, initobject:Dynamic2CommandExceptionType(Dynamic2CommandExceptionType::<init>, invokedynamic:Dynamic2CommandExceptionType$Function(apply:()Lcom/mojang/brigadier/exceptions/Dynamic2CommandExceptionType$Function;)))
            putstatic:SimpleCommandExceptionType(\u7006\u183a\u8bb0\u8d98\u8258::\u7ce1\u5fe1\u92ff\u92ee\u4975\u718f, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_3C2:String[], and:int(ldc:int(18527), ldc:int(8213))))))
            putstatic:SimpleCommandExceptionType(\u7006\u183a\u8bb0\u8d98\u8258::\u392e\ub171\u7af6\u4975\u12cb\u36d3, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_3C2:String[], and:int(ldc:int(118), ldc:int(28566))))))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u6c52\u8258\ud171\uc3e3\ud4fe\ub171(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_669 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_674 : int
        
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
        var_3_669 = and:int(ldc:int(-236072867), ldc:int(2144992749))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7006\u183a\u8bb0\u8d98\u8258[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(524288)), ldc:int(0))) {
            var_3_669 = and:int(var_3_669:int, ldc:int(2106178541))
            var_5_81 = and:int(ldc:int(-14626), ldc:int(14625))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(2802), ldc:int(-2803)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_669:int, ldc:int(-71434545))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(-32512), ldc:int(-32511)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(209), ldc:int(2565)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_669 = and:int(var_3_DA:int, ldc:int(2046547053))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(9753), ldc:int(2401)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1981127891))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(4)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-322355260))
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(4)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1175112390))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1029023868))
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(2)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1748337205))
                    }
                    else {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1977202127))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0595)
                            }
                            
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(2)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(2004147010))
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-197769284))
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1651660279))
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(500373238))
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1102840179))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-206588675))
                            var_11_EB = and:int(ldc:int(-32002), ldc:int(32001))
                            goto(Label_1508)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0595:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-262928281))
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-2112689188))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1470478089))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-506129207))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(1973361622))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(2042213583))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0729:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(390877819))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-174082083))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0834:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(527733728))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-661420763))
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1703141943))
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-964662137))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(1944040045))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(19985), ldc:int(263))
                                goto(Label_1137)
                            }
                        }
                    }
                    
                    Label_0959:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(64)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1280038898))
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-409213070))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(64)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(111496613))
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(332869324))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1749416538))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1011860089))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-240264323))
                        var_11_EB = and:int(ldc:int(-28076), ldc:int(27810))
                    }
                    
                    Label_1137:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0959)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(155779592))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1917264403))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-3280305))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1371)
                            }
                        }
                    }
                    
                    Label_1244:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(669642909))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_1137)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(1257177707))
                            goto(Label_0959)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-841165242))
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-70396049))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1508)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1371:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1494915711))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1923828852))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-613363799))
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(833540567))
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(65536)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_669 = and:int(var_3_669:int, ldc:int(1944711535))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1508:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_674 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1519:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1078238094))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1984956431))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-972558069))
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-156471147))
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-886873360))
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(2011156719))
                        var_17_674 = add:int(var_16_119:int, and:int(ldc:int(2681), ldc:int(4231)))
                        looporswitchbreak()
                    }
                }
                
                var_3_669 = and:int(var_3_669:int, ldc:int(-206988321))
                
                if (cmple:boolean(var_5_81 = var_17_674:int, sub:int(var_6_88:int, xor:int(ldc:int(3360), ldc:int(3361))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
            var_3_669 = and:int(var_3_669:int, ldc:int(592282823))
            goto(Label_0108)
        }
    }
}
