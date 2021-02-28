public class \u51fa\u12cb\u7330\u74b1\u6c52.\ub113\u7873\u183a\u600f\u3a62 {
    public void \ub113\u7873\u183a\u600f\u3a62() {
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
            invokespecial:Object(Object::<init>, this:\ub113\u7873\u183a\u600f\u3a62)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \uff55\u9255\uc31c\u4c2b\uf9c5\u3d4b(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int \uff55\u8bb0\u946b\u4492\uc2bd\u52d3(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.util.Collection<? extends \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f> p1, \u392e\ud7e8\u3bc9\u88c5\ud51e.\u965f\u7043\ufcaf\uae87\u839e p2, int p3) {
        var_4_61 : int
        var_4_1FD : int
        var_6_79 : int
        var_7_81 : Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>
        var_8_191 : \u7d52\u718f\u3776\u6fb0\ub83f
        var_9_1DF : \ube23\u67d0\u64f2\u839e\u76bc
        var_10_1E6 : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        var_4_137 : int
        stack_35A_1 : String [generated]
        expr_32F : Object[] [generated]
        stack_173_1 : String [generated]
        expr_150 : Object[] [generated]
        
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
        var_4_61 = and:int(ldc:int(-617090973), ldc:int(-1749084177))
        
        if (cmple:boolean(p3:int, invokevirtual:int(\u965f\u7043\ufcaf\uae87\u839e::\u99f7\ufe34\u8413\ub19c\u0800\u6cfe, p2:\u965f\u7043\ufcaf\uae87\u839e))) {
            var_4_1FD = and:int(var_4_61:int, ldc:int(-1280867777))
            var_6_79 = and:int(ldc:int(902), ldc:int(-903))
            var_7_81 = invokeinterface:Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>(Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>::iterator, p1:Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>)
            
            while (invokeinterface:boolean(Iterator::hasNext, var_7_81:Iterator)) {
                var_8_191 = checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:? extends \u7d52\u718f\u3776\u6fb0\ub83f[expected:\u7d52\u718f\u3776\u6fb0\ub83f](Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>::next, var_7_81:Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>))
                
                if (instanceof:boolean(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, var_8_191:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                    var_9_1DF = checkcast:\ube23\u67d0\u64f2\u839e\u76bc(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, var_8_191:\ube23\u67d0\u64f2\u839e\u76bc)
                    var_10_1E6 = invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\ube23\u67d0\u64f2\u839e\u76bc::\u6b5f\u6b5f\u3e75\ub83f\u4c2b\u5245, var_9_1DF:\ube23\u67d0\u64f2\u839e\u76bc)
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, var_10_1E6:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
                        if (logicalnot:boolean(invokevirtual:boolean(\u965f\u7043\ufcaf\uae87\u839e::\u64ab\u12b2\u7e3f\u647c\ub19c\uf995, p2:\u965f\u7043\ufcaf\uae87\u839e, var_10_1E6:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
                            goto(Label_0594)
                        }
                        
                        if (logicalnot:boolean(invokestatic:boolean(\u97e6\u647c\u93a2\uc87f\ud523::\ud158\u759a\u7af6\uff55\u4975\u4f52, invokeinterface:Set<\u965f\u7043\ufcaf\uae87\u839e>(Map<\u965f\u7043\ufcaf\uae87\u839e, Integer>::keySet, invokestatic:Map<\u965f\u7043\ufcaf\uae87\u839e, Integer>(\u97e6\u647c\u93a2\uc87f\ud523::\u8389\u3e75\ud12e\u965f\uff55\u385b, var_10_1E6:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)), p2:\u965f\u7043\ufcaf\uae87\u839e))) {
                            goto(Label_0594)
                        }
                        
                        invokevirtual:void(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u600f\u8df4\uff55\u51fa\u0a06\u8bb0, var_10_1E6:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, p2:\u965f\u7043\ufcaf\uae87\u839e, p3:int)
                        inc:int(var_6_79, ldc:int(1))
                        goto(Label_0545)
                    }
                    
                    Label_0496:
                    
                    if (cmpne:boolean(and:int(var_4_1FD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_4_1FD = and:int(var_4_1FD:int, ldc:int(-1381608334))
                        goto(Label_0594)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_1FD:int, ldc:int(1)), ldc:int(0))) {
                        var_4_1FD = and:int(var_4_1FD:int, ldc:int(-1212204825))
                        
                        if (cmpeq:boolean(invokeinterface:int(Collection::size, p1:Collection), xor:int(ldc:int(18945), ldc:int(18944)))) {
                            athrow(invokevirtual:CommandSyntaxException(DynamicCommandExceptionType::create, getstatic:DynamicCommandExceptionType(\ub113\u7873\u183a\u600f\u3a62::\u40a9\u600f\ud171\u52d3\uc238\u34df), invokeinterface:String(ITextComponent::getString, invokevirtual:ITextComponent(\u7d52\u718f\u3776\u6fb0\ub83f::\uf94d\u7c6b\u92ff\u071d\u7e3f\u69d9, var_9_1DF:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))))
                        }
                    }
                    
                    Label_0545:
                    
                    if (cmpeq:boolean(and:int(var_4_1FD:int, ldc:int(32)), ldc:int(0))) {
                        var_4_1FD = and:int(var_4_1FD:int, ldc:int(-74330006))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_4_1FD:int, ldc:int(2097152)), ldc:int(0))) {
                            var_4_1FD = and:int(var_4_1FD:int, ldc:int(-685263885))
                            goto(Label_0452)
                        }
                        
                        goto(Label_0496)
                    }
                    
                    Label_0594:
                    
                    if (cmpeq:boolean(and:int(var_4_1FD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_4_1FD = and:int(var_4_1FD:int, ldc:int(-2043154868))
                        goto(Label_0545)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_1FD:int, ldc:int(131072)), ldc:int(0))) {
                        var_4_1FD = and:int(var_4_1FD:int, ldc:int(736740513))
                        goto(Label_0496)
                    }
                    
                    var_4_1FD = and:int(var_4_1FD:int, ldc:int(-1155028737))
                    
                    if (cmpne:boolean(invokeinterface:int(Collection<E>::size, p1:Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>), and:int(ldc:int(16513), ldc:int(5681)))) {
                        goto(Label_0545)
                    }
                    
                    athrow(invokevirtual:CommandSyntaxException(DynamicCommandExceptionType::create, getstatic:DynamicCommandExceptionType(\ub113\u7873\u183a\u600f\u3a62::\u71f1\ud7e8\u8389\u34df\u385b\uc3e3), invokeinterface:String(ITextComponent::getString, invokevirtual:ITextComponent(\u9af2\u1833\u156b\u12cb\u7d52\u6c52::\u1187\uc9f6\u7049\ub8be\ucb79\u64f2, invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, var_10_1E6:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), var_10_1E6:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))))
                }
                
                Label_0411:
                
                if (cmpeq:boolean(and:int(var_4_1FD:int, ldc:int(65536)), ldc:int(0))) {
                    var_4_1FD = and:int(var_4_1FD:int, ldc:int(-135910313))
                }
                else {
                    var_4_1FD = and:int(var_4_1FD:int, ldc:int(-1078520393))
                    
                    if (cmpeq:boolean(invokeinterface:int(Collection<E>::size, p1:Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>), xor:int(ldc:int(16560), ldc:int(16561)))) {
                        athrow(invokevirtual:CommandSyntaxException(DynamicCommandExceptionType::create, getstatic:DynamicCommandExceptionType(\ub113\u7873\u183a\u600f\u3a62::\uae87\u4c2b\u88c5\u52d3\uc2bd\ub1b9), invokeinterface:String(ITextComponent::getString, invokevirtual:ITextComponent(\u7d52\u718f\u3776\u6fb0\ub83f::\uf94d\u7c6b\u92ff\u071d\u7e3f\u69d9, var_8_191:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))))
                    }
                }
                
                Label_0452:
                
                if (cmpne:boolean(and:int(var_4_1FD:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_0411)
                }
                
                var_4_1FD = and:int(var_4_1FD:int, ldc:int(-206596685))
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_4_1FD:int, ldc:int(32)), ldc:int(0))) {
                    var_4_137 = and:int(var_4_1FD:int, ldc:int(-1294578643))
                    goto(Label_0270)
                }
                
                if (cmpeq:boolean(and:int(var_4_1FD:int, ldc:int(268435456)), ldc:int(0))) {
                    var_4_137 = and:int(var_4_1FD:int, ldc:int(734514752))
                }
                else {
                    var_4_137 = and:int(var_4_1FD:int, ldc:int(-1612229333))
                    
                    if (cmpeq:boolean(var_6_79:int, ldc:int(0))) {
                        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\ub113\u7873\u183a\u600f\u3a62::\ud7e8\ub19c\u836c\uf9c5\ud171\u8709)))
                    }
                }
                
                Label_0221:
                
                if (cmpne:boolean(and:int(var_4_137:int, ldc:int(131072)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_4_137:int, ldc:int(262144)), ldc:int(0))) {
                        var_4_1FD = and:int(var_4_137:int, ldc:int(-1379322187))
                        loopcontinue()
                    }
                    
                    var_4_137 = and:int(var_4_137:int, ldc:int(-1817246365))
                    
                    if (cmpeq:boolean(invokeinterface:int(Collection<E>::size, p1:Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>), and:int(ldc:int(16449), ldc:int(4141)))) {
                        stack_35A_1 = loadelement:String(getstatic:String[](\ub113\u7873\u183a\u600f\u3a62::\ub8be\u92ff\uafe7\ud51e\u0c95\u4492), xor:int(ldc:int(-32255), ldc:int(-32251)))
                        expr_32F = newarray:Object[](java.lang.Object.class, and:int(ldc:int(9266), ldc:int(2058)))
                        storeelement:Object(expr_32F:Object[], and:int(ldc:int(24980), ldc:int(-24981)), invokevirtual:ITextComponent[expected:Object](\u965f\u7043\ufcaf\uae87\u839e::\u527a\u71f1\u3dd3\u69d9\u071d\u2dcc, p2:\u965f\u7043\ufcaf\uae87\u839e, p3:int))
                        storeelement:Object(expr_32F:Object[], xor:int(ldc:int(5249), ldc:int(5248)), invokevirtual:ITextComponent[expected:Object](\u7d52\u718f\u3776\u6fb0\ub83f::\u8258\u4e72\u40a9\u93a2\u3a62\ud36e, checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:? extends \u7d52\u718f\u3776\u6fb0\ub83f[expected:\u7d52\u718f\u3776\u6fb0\ub83f](Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>::next, invokeinterface:Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>(Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>::iterator, p1:Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>)))))
                        invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_35A_1:String, expr_32F:Object[]), xor:int[expected:boolean](ldc:int(-8191), ldc:int(-8192)))
                        looporswitchbreak()
                    }
                }
                
                Label_0270:
                
                if (cmpne:boolean(and:int(var_4_137:int, ldc:int(536870912)), ldc:int(0))) {
                    var_4_137 = and:int(var_4_137:int, ldc:int(192250341))
                    goto(Label_0221)
                }
                
                if (cmpne:boolean(and:int(var_4_137:int, ldc:int(268435456)), ldc:int(0))) {
                    var_4_137 = and:int(var_4_137:int, ldc:int(-1679313245))
                    stack_173_1 = loadelement:String(getstatic:String[](\ub113\u7873\u183a\u600f\u3a62::\ub8be\u92ff\uafe7\ud51e\u0c95\u4492), and:int(ldc:int(17927), ldc:int(141)))
                    expr_150 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(530), ldc:int(20623)))
                    storeelement:Object(expr_150:Object[], and:int(ldc:int(-2155), ldc:int(2154)), invokevirtual:ITextComponent[expected:Object](\u965f\u7043\ufcaf\uae87\u839e::\u527a\u71f1\u3dd3\u69d9\u071d\u2dcc, p2:\u965f\u7043\ufcaf\uae87\u839e, p3:int))
                    storeelement:Object(expr_150:Object[], and:int(ldc:int(517), ldc:int(21827)), invokestatic:Integer[expected:Object](Integer::valueOf, invokeinterface:int(Collection<E>::size, p1:Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>)))
                    invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_173_1:String, expr_150:Object[]), and:int[expected:boolean](ldc:int(1585), ldc:int(2057)))
                    looporswitchbreak()
                }
                
                var_4_1FD = and:int(var_4_137:int, ldc:int(950050145))
            }
            
            return:int(var_6_79:int)
        }
        
        athrow(invokevirtual:CommandSyntaxException(Dynamic2CommandExceptionType::create, getstatic:Dynamic2CommandExceptionType(\ub113\u7873\u183a\u600f\u3a62::\ubb2b\ub8be\u8d90\u647c\u4975\uc7fe), invokestatic:Integer[expected:Object](Integer::valueOf, p3:int), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u965f\u7043\ufcaf\uae87\u839e::\u99f7\ufe34\u8413\ub19c\u0800\u6cfe, p2:\u965f\u7043\ufcaf\uae87\u839e))))
    }
    
    private static int lambda$\uc229\u960f\u446c\u0c95\u64f2\u4c2b$6(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\ub113\u7873\u183a\u600f\u3a62::\uff55\u8bb0\u946b\u4492\uc2bd\u52d3, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>(\u600f\u9937\ub8be\ud171\u624e::\u92ff\uc2e8\u5d20\uc3e3\ub6ab\u183a, p0:CommandContext, loadelement:String(getstatic:String[](\ub113\u7873\u183a\u600f\u3a62::\ub8be\u92ff\uafe7\ud51e\u0c95\u4492), xor:int(ldc:int(16930), ldc:int(16931)))), invokestatic:\u965f\u7043\ufcaf\uae87\u839e(\u5d20\uc238\u12b2\u8640\ub83f::\ubb2b\u839e\u516c\u759a\u965f\u6ec6, p0:CommandContext, loadelement:String(getstatic:String[](\ub113\u7873\u183a\u600f\u3a62::\ub8be\u92ff\uafe7\ud51e\u0c95\u4492), and:int(ldc:int(1187), ldc:int(11010)))), invokestatic:int(IntegerArgumentType::getInteger, p0:CommandContext, loadelement:String(getstatic:String[](\ub113\u7873\u183a\u600f\u3a62::\ub8be\u92ff\uafe7\ud51e\u0c95\u4492), xor:int(ldc:int(2339), ldc:int(2336))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ub1b9\ub19c\u3d4b\u40a9\u516c\u51b2$5(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\ub113\u7873\u183a\u600f\u3a62::\uff55\u8bb0\u946b\u4492\uc2bd\u52d3, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>(\u600f\u9937\ub8be\ud171\u624e::\u92ff\uc2e8\u5d20\uc3e3\ub6ab\u183a, p0:CommandContext, loadelement:String(getstatic:String[](\ub113\u7873\u183a\u600f\u3a62::\ub8be\u92ff\uafe7\ud51e\u0c95\u4492), xor:int(ldc:int(12306), ldc:int(12307)))), invokestatic:\u965f\u7043\ufcaf\uae87\u839e(\u5d20\uc238\u12b2\u8640\ub83f::\ubb2b\u839e\u516c\u759a\u965f\u6ec6, p0:CommandContext, loadelement:String(getstatic:String[](\ub113\u7873\u183a\u600f\u3a62::\ub8be\u92ff\uafe7\ud51e\u0c95\u4492), and:int(ldc:int(17218), ldc:int(4230)))), xor:int(ldc:int(19008), ldc:int(19009))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u8d90\u0a06\ub171\uc246\u93a2\u8aa5$4(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, xor:int(ldc:int(20745), ldc:int(20747))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\u76bc\ua562\u3d4b\ud158\ube23\uc31c$3(java.lang.Object p0, java.lang.Object p1) {
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
            stack_8F_1 = loadelement:String(getstatic:String[](\ub113\u7873\u183a\u600f\u3a62::\ub8be\u92ff\uafe7\ud51e\u0c95\u4492), and:int(ldc:int(7), ldc:int(11390)))
            expr_78 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(15938), ldc:int(16547)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(1928), ldc:int(-1961)), p0:Object)
            storeelement:Object(expr_78:Object[], and:int(ldc:int(225), ldc:int(523)), p1:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_8F_1:String, expr_78:Object[]))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\u6d69\u6d69\ub18d\u71ae\u7c6b\u0a06$2(java.lang.Object p0) {
        stack_85_1 : String [generated]
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
            stack_85_1 = loadelement:String(getstatic:String[](\ub113\u7873\u183a\u600f\u3a62::\ub8be\u92ff\uafe7\ud51e\u0c95\u4492), and:int(ldc:int(24663), ldc:int(7079)))
            expr_78 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(-32754), ldc:int(-32753)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(-14965), ldc:int(14900)), p0:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_85_1:String, expr_78:Object[]))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\ubf56\ud4fe\u4cd9\u8709\u600f\u3711$1(java.lang.Object p0) {
        stack_85_1 : String [generated]
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
            stack_85_1 = loadelement:String(getstatic:String[](\ub113\u7873\u183a\u600f\u3a62::\ub8be\u92ff\uafe7\ud51e\u0c95\u4492), and:int(ldc:int(16441), ldc:int(12168)))
            expr_78 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(12308), ldc:int(12309)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(20730), ldc:int(-21243)), p0:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_85_1:String, expr_78:Object[]))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\u9a18\u183a\u72f1\u9937\u3d4b\u5140$0(java.lang.Object p0) {
        stack_85_1 : String [generated]
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
            stack_85_1 = loadelement:String(getstatic:String[](\ub113\u7873\u183a\u600f\u3a62::\ub8be\u92ff\uafe7\ud51e\u0c95\u4492), xor:int(ldc:int(148), ldc:int(157)))
            expr_78 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(4193), ldc:int(25091)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(10841), ldc:int(-10842)), p0:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_85_1:String, expr_78:Object[]))
        }
        
        goto(Label_0006)
    }
    
    static {
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
    
    public void \u5bc4\uceb8\u9255\u64f2\u7bad\u4492(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_649 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_654 : int
        
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
        var_3_649 = and:int(ldc:int(1536756542), ldc:int(-6594440))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub113\u7873\u183a\u600f\u3a62[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_649 = and:int(var_3_649:int, ldc:int(1526695807))
            var_5_81 = and:int(ldc:int(8996), ldc:int(-8997))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(3331), ldc:int(-11600)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_649:int, ldc:int(1543347771))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(1728), ldc:int(1729)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, xor:int(ldc:int(1025), ldc:int(1024)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_649 = and:int(var_3_D1:int, ldc:int(-625226819))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(4352), ldc:int(4353)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1470)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(136594195))
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1219)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1483425752))
                        goto(Label_0956)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(1)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1609941394))
                        goto(Label_0806)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1277133014))
                        goto(Label_0677)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1610335994))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0546)
                            }
                            
                            goto(Label_0806)
                        }
                    }
                    
                    Label_0400:
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-864385053))
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1219)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0956)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0806)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0677)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(-2075286257))
                            loopcontinue()
                        }
                        
                        var_3_649 = and:int(var_3_649:int, ldc:int(-4520325))
                        var_11_E2 = and:int(ldc:int(6954), ldc:int(-15147))
                        goto(Label_1459)
                    }
                    
                    Label_0546:
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1301992257))
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1343)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-686591743))
                        goto(Label_1219)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0956)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0806)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1879893684))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(-1442599952))
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(-1908755554))
                            loopcontinue()
                        }
                        
                        var_3_649 = and:int(var_3_649:int, ldc:int(-538999813))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0806)
                        }
                    }
                    
                    Label_0677:
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(347545814))
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(128)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1633406554))
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1219)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1881421594))
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0956)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-2074457927))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0546)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_649 = and:int(var_3_649:int, ldc:int(-606488264))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0806:
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1470)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1950248948))
                        goto(Label_1343)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(474593449))
                        goto(Label_1219)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1492741633))
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(64)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1125733724))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(70096995))
                            goto(Label_0677)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0546)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(279353027))
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(32)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(-1734634664))
                            loopcontinue()
                        }
                        
                        var_3_649 = and:int(var_3_649:int, ldc:int(-560002440))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(-28512), ldc:int(-28511))
                                goto(Label_1114)
                            }
                        }
                    }
                    
                    Label_0956:
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1068518566))
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1219)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1933790592))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0806)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(-97953513))
                            goto(Label_0677)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0546)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(-1811289333))
                            loopcontinue()
                        }
                        
                        var_3_649 = and:int(var_3_649:int, ldc:int(2126318782))
                        var_11_E2 = and:int(ldc:int(10768), ldc:int(-10769))
                    }
                    
                    Label_1114:
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-270595759))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(243472966))
                            goto(Label_0956)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0806)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0677)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0546)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_649 = and:int(var_3_649:int, ldc:int(1608450107))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1343)
                            }
                        }
                    }
                    
                    Label_1219:
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(-1262657423))
                            goto(Label_1114)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0956)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0806)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(64)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(-1851963976))
                            goto(Label_0677)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0546)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(-2115778043))
                            loopcontinue()
                        }
                        
                        var_3_649 = and:int(var_3_649:int, ldc:int(1526332989))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1459)
                    }
                    
                    Label_1343:
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1219)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-921431595))
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0956)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0806)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0677)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1096378457))
                        goto(Label_0546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0400)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_649 = and:int(var_3_649:int, ldc:int(-541377799))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1459:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_654 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1470:
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1293260464))
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-257907374))
                        goto(Label_1219)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(994889167))
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0956)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-58745143))
                        goto(Label_0806)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0677)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-48241555))
                        goto(Label_0546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(954478127))
                        goto(Label_0400)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-543327489))
                        var_17_654 = add:int(var_16_110:int, and:int(ldc:int(8595), ldc:int(4129)))
                        looporswitchbreak()
                    }
                    
                    var_3_649 = and:int(var_3_649:int, ldc:int(643167789))
                }
                
                var_3_649 = and:int(var_3_649:int, ldc:int(1591310073))
                
                if (cmple:boolean(var_5_81 = var_17_654:int, sub:int(var_6_88:int, and:int(ldc:int(129), ldc:int(5457))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(64)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
