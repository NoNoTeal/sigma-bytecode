public class \u4f52\u6cfe\u9a18\uc29a\u3bd6.\u3bd6\ubf56\u71ae\u4f4a\u6bb9 {
    public void \u3bd6\ubf56\u71ae\u4f4a\u6bb9() {
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
            invokespecial:Object(Object::<init>, this:\u3bd6\ubf56\u71ae\u4f4a\u6bb9)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u416d\u960f\u0800\uf9c5\u3776\u12cb(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int \u71ae\uc84e\u67d0\u8258\u3bd6\u983f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 p1, \ub113\uc4d2\u183a\u527a\u6435.\ub6ab\ube23\uae87\uc84e\u1833 p2, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\uc2e8\u47c2\u7006\u6cfe\u6c56 p3, java.util.function.Predicate<\u927d\u92ff\u71ae\uafe7\u6bb9.\u839e\u8389\ua562\uc7fe\u76bc\ube23> p4) {
        var_5_61 : int
        var_7_71 : int
        var_5_121 : int
        var_8_84 : ArrayList
        var_9_8A : \ube23\uc238\u5140\u4cd9\u8aa5
        var_10_93 : int
        var_11_B5 : Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>
        var_12_10B : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_13_13D : \ub6ab\ube23\uae87\uc84e\u1833
        var_11_F8 : Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>
        var_12_23E : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        stack_220_1 : String [generated]
        expr_20F : Object[] [generated]
        
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
        var_5_61 = and:int(ldc:int(1644585757), ldc:int(-82248769))
        var_7_71 = mul:int(mul:int(invokevirtual:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u4d85\u34df\u4bc8\u72f1\ubded\ub7dc, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), invokevirtual:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u64f2\ub1b9\uae5d\u3c25\uc4d2\u8389, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), invokevirtual:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\uc9f6\ub83f\u7330\ufe34\u8258\ucfaf, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6))
        
        if (cmpgt:boolean(var_7_71:int, ldc:int(32768))) {
            athrow(invokevirtual:CommandSyntaxException(Dynamic2CommandExceptionType::create, getstatic:Dynamic2CommandExceptionType(\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u59ec\u3711\u446c\u6d69\u8cae\u3d4b), invokestatic:Integer[expected:Object](Integer::valueOf, ldc:int(32768)), invokestatic:Integer(Integer::valueOf, var_7_71:int)))
        }
        
        var_5_121 = and:int(var_5_61:int, ldc:int(-151624738))
        var_8_84 = invokestatic:ArrayList(Lists::newArrayList)
        var_9_8A = invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5(\u8413\u5140\u64f2\uc9f6\u9937::\ube23\u7043\ubded\u759a\u74b1\u5f50, p0:\u8413\u5140\u64f2\uc9f6\u9937)
        var_10_93 = and:int(ldc:int(4875), ldc:int(-4876))
        var_11_B5 = invokeinterface:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(Iterable<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::iterator, invokestatic:Iterable<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u7873\u8753\u6c56\ufcaf\u8c8a\u7d52, getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u0800\ub18d\u64ab\u36d3\u8bb0\u2dcc, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u8bb0\u12b2\u8753\u7e3f\uceb8\ua6bd, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u1833\u5f50\u93a2\uc246\u9255\u759a, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\ube23\uc7fe\u927d\u873d\ud36e\u8cae, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u4e72\uc238\u5245\ud217\u3d64\ub8be, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u4daf\u3bc9\u98a4\u6ec6\u16f6\u3d64, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)))
        
        while (invokeinterface:boolean(Iterator::hasNext, var_11_B5:Iterator)) {
            var_12_10B = checkcast:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56.class, invokeinterface:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::next, var_11_B5:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>))
            
            if (cmpne:boolean(p4:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>, aconstnull:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>())) {
                if (logicalnot:boolean(invokeinterface:boolean(Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>::test, p4:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>, initobject:\u839e\u8389\ua562\uc7fe\u76bc\ube23(\u839e\u8389\ua562\uc7fe\u76bc\ube23::<init>, var_9_8A:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], var_12_10B:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, xor:int[expected:boolean](ldc:int(10240), ldc:int(10241)))))) {
                    goto(Label_0324)
                }
            }
            
            Label_0274:
            
            if (cmpeq:boolean(and:int(var_5_121:int, ldc:int(4)), ldc:int(0))) {
                var_5_121 = and:int(var_5_121:int, ldc:int(260194337))
            }
            else {
                var_5_121 = and:int(var_5_121:int, ldc:int(1721091966))
                var_13_13D = invokeinterface:\ub6ab\ube23\uae87\uc84e\u1833(\u836c\u98a4\ub18d\u3c25\u960f::\u12b2\uc910\uc7fe\u6c56\ubcb0\u3a62, getfield:\u836c\u98a4\ub18d\u3c25\u960f(\uc2e8\u47c2\u7006\u6cfe\u6c56::\u0800\u4c2b\u4492\u7330\u12b2\u6b0d, p3:\uc2e8\u47c2\u7006\u6cfe\u6c56), p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, var_12_10B:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p2:\ub6ab\ube23\uae87\uc84e\u1833, var_9_8A:\ube23\uc238\u5140\u4cd9\u8aa5)
                
                if (cmpne:boolean(var_13_13D:\ub6ab\ube23\uae87\uc84e\u1833, aconstnull:\ub6ab\ube23\uae87\uc84e\u1833())) {
                    invokestatic:void(\u16f6\ub7dc\u8bb0\ufcaf\u67e9::\u946b\u3bc9\u718f\u3dd3\ub171\u6ec6, invokevirtual:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, var_9_8A:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_12_10B:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
                    
                    if (invokevirtual:boolean(\ub6ab\ube23\uae87\uc84e\u1833::\u1833\u446c\u6b5f\u392e\u071d\u6b5f, var_13_13D:\ub6ab\ube23\uae87\uc84e\u1833, var_9_8A:\ube23\uc238\u5140\u4cd9\u8aa5, var_12_10B:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, xor:int(ldc:int(1), ldc:int(3)))) {
                        invokeinterface:boolean(List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::add, var_8_84:ArrayList<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>[expected:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>], invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u183a\u647c\u71f1\u6435\u6c52\u8df4, var_12_10B:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
                        inc:int(var_10_93, ldc:int(1))
                    }
                }
            }
            
            Label_0324:
            
            if (cmpne:boolean(and:int(var_5_121:int, ldc:int(128)), ldc:int(0))) {
                var_5_121 = and:int(var_5_121:int, ldc:int(-995046459))
                goto(Label_0274)
            }
            
            var_5_121 = and:int(var_5_121:int, ldc:int(1656445469))
        }
        
        loop {
            if (cmpne:boolean(and:int(var_5_121:int, ldc:int(512)), ldc:int(0))) {
                var_5_121 = and:int(var_5_121:int, ldc:int(1724687101))
                var_11_F8 = invokeinterface:Iterator<Object>(List<Object>::iterator, var_8_84:ArrayList<Object>[expected:List<Object>])
                
                while (invokeinterface:boolean(Iterator::hasNext, var_11_F8:Iterator)) {
                    var_12_23E = checkcast:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56.class, invokeinterface:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::next, var_11_F8:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>))
                    invokevirtual:void(\ube23\uc238\u5140\u4cd9\u8aa5::\uc3e3\u8aa5\uc910\ud217\u5db4\uafe7, var_9_8A:\ube23\uc238\u5140\u4cd9\u8aa5, var_12_23E:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, var_9_8A:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_12_23E:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)))
                }
            }
            
            if (cmpeq:boolean(and:int(var_5_121:int, ldc:int(8388608)), ldc:int(0))) {
                looporswitchbreak()
            }
        }
        
        if (cmpne:boolean(var_10_93:int, ldc:int(0))) {
            stack_220_1 = loadelement:String(getstatic:String[](\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u4daf\u12b2\u3c25\u2dcc\u98a4\u5d20), and:int(ldc:int(10443), ldc:int(782)))
            expr_20F = newarray:Object[](java.lang.Object.class, and:int(ldc:int(2115), ldc:int(385)))
            storeelement:Object(expr_20F:Object[], and:int(ldc:int(-21061), ldc:int(21060)), invokestatic:Integer[expected:Object](Integer::valueOf, var_10_93:int))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_220_1:String, expr_20F:Object[]), and:int[expected:boolean](ldc:int(2309), ldc:int(12305)))
            return:int(var_10_93:int)
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u8c8a\u527a\u927d\u4179\u5f50\uff55)))
    }
    
    private static int lambda$\u1187\u7006\uc229\uc7fe\u4daf\u392e$9(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u71ae\uc84e\u67d0\u8258\u3bd6\u983f, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), initobject:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::<init>, invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u4daf\u12b2\u3c25\u2dcc\u98a4\u5d20), and:int(ldc:int(12801), ldc:int(157)))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u4daf\u12b2\u3c25\u2dcc\u98a4\u5d20), and:int(ldc:int(98), ldc:int(9366))))), invokestatic:\ub6ab\ube23\uae87\uc84e\u1833(\ub1b9\u59ec\u9033\u8389\u62da::\u1187\u8640\u3e75\ubefe\u4d85\ubff1, p0:CommandContext, loadelement:String(getstatic:String[](\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u4daf\u12b2\u3c25\u2dcc\u98a4\u5d20), and:int(ldc:int(467), ldc:int(25603)))), getstatic:\uc2e8\u47c2\u7006\u6cfe\u6c56(\uc2e8\u47c2\u7006\u6cfe\u6c56::\u071d\u960f\u120d\ubcb0\u5db4\ub18d), checkcast:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>(java.util.function.Predicate<\u927d\u92ff\u71ae\uafe7\u6bb9.\u839e\u8389\ua562\uc7fe\u76bc\ube23>.class, aconstnull:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>())))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u0a06\u7ce1\u3711\u61a4\u8bb0\u2dcc$8(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u71ae\uc84e\u67d0\u8258\u3bd6\u983f, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), initobject:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::<init>, invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u4daf\u12b2\u3c25\u2dcc\u98a4\u5d20), and:int(ldc:int(209), ldc:int(1539)))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u4daf\u12b2\u3c25\u2dcc\u98a4\u5d20), xor:int(ldc:int(2177), ldc:int(2179))))), invokestatic:\ub6ab\ube23\uae87\uc84e\u1833(\ub1b9\u59ec\u9033\u8389\u62da::\u1187\u8640\u3e75\ubefe\u4d85\ubff1, p0:CommandContext, loadelement:String(getstatic:String[](\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u4daf\u12b2\u3c25\u2dcc\u98a4\u5d20), and:int(ldc:int(12299), ldc:int(18467)))), getstatic:\uc2e8\u47c2\u7006\u6cfe\u6c56(\uc2e8\u47c2\u7006\u6cfe\u6c56::\u51b2\ud158\ubb2b\uceb8\u392e\u52d3), checkcast:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>(java.util.function.Predicate<\u927d\u92ff\u71ae\uafe7\u6bb9.\u839e\u8389\ua562\uc7fe\u76bc\ube23>.class, aconstnull:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>())))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u4f52\u6fb0\u4c2b\uc238\u8389\u527a$7(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u71ae\uc84e\u67d0\u8258\u3bd6\u983f, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), initobject:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::<init>, invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u4daf\u12b2\u3c25\u2dcc\u98a4\u5d20), xor:int(ldc:int(8964), ldc:int(8965)))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u4daf\u12b2\u3c25\u2dcc\u98a4\u5d20), xor:int(ldc:int(961), ldc:int(963))))), invokestatic:\ub6ab\ube23\uae87\uc84e\u1833(\ub1b9\u59ec\u9033\u8389\u62da::\u1187\u8640\u3e75\ubefe\u4d85\ubff1, p0:CommandContext, loadelement:String(getstatic:String[](\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u4daf\u12b2\u3c25\u2dcc\u98a4\u5d20), and:int(ldc:int(3), ldc:int(18467)))), getstatic:\uc2e8\u47c2\u7006\u6cfe\u6c56(\uc2e8\u47c2\u7006\u6cfe\u6c56::\u4c04\ud158\u6bb9\u965f\u52d3\u4f52), checkcast:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>(java.util.function.Predicate<\u927d\u92ff\u71ae\uafe7\u6bb9.\u839e\u8389\ua562\uc7fe\u76bc\ube23>.class, aconstnull:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>())))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u4179\u5654\u56bd\u7bad\u99f7\u6fb0$6(com.mojang.brigadier.context.CommandContext p0) {
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
    
    private static boolean lambda$\uc31c\u59ec\u600f\u5fe1\u836c\u4c04$5(\u927d\u92ff\u71ae\uafe7\u6bb9.\u839e\u8389\ua562\uc7fe\u76bc\ube23 p0) {
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
    
    private static int lambda$\u071d\u71ae\u6d69\u71f1\u6435\u8aa5$4(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u71ae\uc84e\u67d0\u8258\u3bd6\u983f, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), initobject:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::<init>, invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u4daf\u12b2\u3c25\u2dcc\u98a4\u5d20), xor:int(ldc:int(1289), ldc:int(1288)))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u4daf\u12b2\u3c25\u2dcc\u98a4\u5d20), and:int(ldc:int(12570), ldc:int(17030))))), invokestatic:\ub6ab\ube23\uae87\uc84e\u1833(\ub1b9\u59ec\u9033\u8389\u62da::\u1187\u8640\u3e75\ubefe\u4d85\ubff1, p0:CommandContext, loadelement:String(getstatic:String[](\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u4daf\u12b2\u3c25\u2dcc\u98a4\u5d20), xor:int(ldc:int(4622), ldc:int(4621)))), getstatic:\uc2e8\u47c2\u7006\u6cfe\u6c56(\uc2e8\u47c2\u7006\u6cfe\u6c56::\ub18d\u4975\ud4fe\u5bc4\u3c25\uc246), invokestatic:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>(\u8bb0\u5f50\u760c\u7af6\u760c::\uae87\u92ff\u624e\u8aa5\ud158\ua61f, p0:CommandContext, loadelement:String(getstatic:String[](\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u4daf\u12b2\u3c25\u2dcc\u98a4\u5d20), and:int(ldc:int(2093), ldc:int(21783))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ub70c\u4cd9\uc4d2\ube23\u97b7\u624e$3(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u71ae\uc84e\u67d0\u8258\u3bd6\u983f, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), initobject:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::<init>, invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u4daf\u12b2\u3c25\u2dcc\u98a4\u5d20), and:int(ldc:int(1795), ldc:int(1)))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u4daf\u12b2\u3c25\u2dcc\u98a4\u5d20), xor:int(ldc:int(55), ldc:int(53))))), invokestatic:\ub6ab\ube23\uae87\uc84e\u1833(\ub1b9\u59ec\u9033\u8389\u62da::\u1187\u8640\u3e75\ubefe\u4d85\ubff1, p0:CommandContext, loadelement:String(getstatic:String[](\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u4daf\u12b2\u3c25\u2dcc\u98a4\u5d20), and:int(ldc:int(19779), ldc:int(8199)))), getstatic:\uc2e8\u47c2\u7006\u6cfe\u6c56(\uc2e8\u47c2\u7006\u6cfe\u6c56::\ub18d\u4975\ud4fe\u5bc4\u3c25\uc246), checkcast:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>(java.util.function.Predicate<\u927d\u92ff\u71ae\uafe7\u6bb9.\u839e\u8389\ua562\uc7fe\u76bc\ube23>.class, aconstnull:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>())))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u51b2\u416d\u34df\u6fb0\u2dcc\ufe34$2(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u71ae\uc84e\u67d0\u8258\u3bd6\u983f, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), initobject:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::<init>, invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u4daf\u12b2\u3c25\u2dcc\u98a4\u5d20), and:int(ldc:int(16641), ldc:int(8193)))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u4daf\u12b2\u3c25\u2dcc\u98a4\u5d20), xor:int(ldc:int(3108), ldc:int(3110))))), invokestatic:\ub6ab\ube23\uae87\uc84e\u1833(\ub1b9\u59ec\u9033\u8389\u62da::\u1187\u8640\u3e75\ubefe\u4d85\ubff1, p0:CommandContext, loadelement:String(getstatic:String[](\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u4daf\u12b2\u3c25\u2dcc\u98a4\u5d20), and:int(ldc:int(5387), ldc:int(24583)))), getstatic:\uc2e8\u47c2\u7006\u6cfe\u6c56(\uc2e8\u47c2\u7006\u6cfe\u6c56::\ub18d\u4975\ud4fe\u5bc4\u3c25\uc246), checkcast:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>(java.util.function.Predicate<\u927d\u92ff\u71ae\uafe7\u6bb9.\u839e\u8389\ua562\uc7fe\u76bc\ube23>.class, aconstnull:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>())))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\uc238\u3bd6\u6ec6\u8753\u99f7\u59ec$1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, and:int(ldc:int(32258), ldc:int(334))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\u8aa5\u3d4b\u624e\ubefe\u76bc\ubff1$0(java.lang.Object p0, java.lang.Object p1) {
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
            stack_8F_1 = loadelement:String(getstatic:String[](\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u4daf\u12b2\u3c25\u2dcc\u98a4\u5d20), and:int(ldc:int(11387), ldc:int(527)))
            expr_78 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(5634), ldc:int(10327)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(18715), ldc:int(-18716)), p0:Object)
            storeelement:Object(expr_78:Object[], xor:int(ldc:int(9408), ldc:int(9409)), p1:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_8F_1:String, expr_78:Object[]))
        }
        
        goto(Label_0006)
    }
    
    public static \ub113\uc4d2\u183a\u527a\u6435.\ub6ab\ube23\uae87\uc84e\u1833 \u3e75\uceb8\u946b\u5bc4\u4daf\u40a9() {
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
            return:\ub6ab\ube23\uae87\uc84e\u1833(getstatic:\ub6ab\ube23\uae87\uc84e\u1833(\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u8d98\u34df\u67e9\u3776\u64ab\u4daf))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_36D : int
        expr_6E : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_C5_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_100_0 : byte[] [generated]
        stack_12D_0 : byte[] [generated]
        stack_318_0 : byte[] [generated]
        stack_380_0 : byte[] [generated]
        stack_3F2_0 : byte[] [generated]
        stack_448_0 : byte[] [generated]
        var_4_2F9 : int
        var_3_2FE : byte[]
        var_5_2FF : int
        expr_318 : byte [generated]
        var_0_376 : int
        expr_380 : byte [generated]
        stack_3C0_2 : byte [generated]
        stack_39D_0 : byte [generated]
        expr_9E : int [generated]
        var_2_C3 : byte[]
        expr_C7 : int [generated]
        var_3_3E0 : byte[]
        var_5_3E1 : int
        expr_100 : int [generated]
        var_3_436 : byte[]
        var_5_437 : int
        var_3_139 : String
        expr_141 : String[] [generated]
        expr_14B : String[] [generated]
        var_3_2B2 : String[]
        
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
        var_0_36D = and:int(ldc:int(1707424238), ldc:int(1506080718))
        expr_6E = arraylength:int(stack_9C_0 = stack_9E_0 = stack_C3_0 = stack_C5_0 = stack_FE_0 = stack_100_0 = stack_12D_0 = stack_318_0 = stack_380_0 = stack_3F2_0 = stack_448_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("W91e0NrS3N/e0FvTNHTSWlC+/dJe2lBTXlzc397QW9M0dNJaUL79WdHT3tHT3tbc397QW9M0dNJaUL7921LeUFzTX1/TUdtV1VtaUN7RWlDaV1PY1FXfXFBf3l7a0NXeVFTbXtJdX1RTWlTUUd3RVmLD")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_2F9 = expr_6E:int
        var_3_2FE = newarray:byte[](byte.class, expr_6E:int)
        var_5_2FF = expr_6E:int
        Label_0769:
        
        while (cmpeq:boolean(and:int(var_0_36D:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_36D = and:int(var_0_36D:int, ldc:int(-660278449))
            var_5_2FF = add:int(var_5_2FF:int, ldc:int(-1))
            expr_318 = loadelement:byte(stack_318_0:byte[], var_5_2FF:int)
            storeelement:byte(var_3_2FE:byte[], var_5_2FF:int, add:int(or:int(and:int(shl:int(expr_318:byte, and:int(ldc:int(5766), ldc:int(16469))), ldc:int(-16)), and:int(shr:int(expr_318:byte[expected:int], xor:int(ldc:int(544), ldc:int(548))), ldc:int(15))), ldc:int(19)))
            
            if (cmpne:boolean(var_5_2FF:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C3_0 = stack_C5_0 = stack_FE_0 = stack_100_0 = stack_12D_0 = stack_318_0 = stack_380_0 = stack_3F2_0 = stack_448_0 = var_3_2FE:byte[]
            goto(Label_0115)
        }
        
        Label_0864:
        
        while (cmpeq:boolean(and:int(var_0_36D:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_376 = and:int(var_0_36D:int, ldc:int(-840689281))
            var_5_2FF = add:int(var_5_2FF:int, ldc:int(-1))
            expr_380 = stack_3C0_2 = loadelement(stack_380_0, var_5_2FF)
            
            if (cmplt:boolean(add:int(add:int(var_5_2FF:int, ldc:int(1)), neg:int(var_4_2F9:int)), ldc:int(0))) {
                stack_3C0_2 = stack_39D_0 = add:byte(expr_380:byte, loadelement:byte(var_3_2FE:byte[], add:int(var_5_2FF:int, ldc:int(1))))
                goto(Label_0941)
            }
            
            Label_0909:
            
            if (cmpne:boolean(and:int(var_0_376:int, ldc:int(256)), ldc:int(0))) {
                var_0_376 = and:int(var_0_376:int, ldc:int(-709512338))
                stack_3C0_2 = stack_39D_0 = add:byte(expr_380:byte, ldc:byte(1))
            }
            
            Label_0941:
            
            if (cmpeq:boolean(and:int(var_0_376:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0909)
            }
            
            var_0_36D = and:int(var_0_376:int, ldc:int(2127428446))
            storeelement:byte(var_3_2FE:byte[], var_5_2FF:int, stack_3C0_2:byte)
            
            if (cmpne:boolean(var_5_2FF:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C3_0 = stack_C5_0 = stack_FE_0 = stack_100_0 = stack_12D_0 = stack_318_0 = stack_380_0 = stack_3F2_0 = stack_448_0 = var_3_2FE:byte[]
            goto(Label_0163)
        }
        
        var_0_36D = and:int(var_0_36D:int, ldc:int(1645968431))
        goto(Label_0769)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_36D:int, ldc:int(262144)), ldc:int(0))) {
            var_0_36D = and:int(var_0_36D:int, ldc:int(1426739753))
            goto(Label_0261)
        }
        
        if (cmpeq:boolean(and:int(var_0_36D:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_0204)
        }
        
        if (cmpeq:boolean(and:int(var_0_36D:int, ldc:int(1)), ldc:int(0))) {
            var_0_36D = and:int(var_0_36D:int, ldc:int(2007373151))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_2F9 = expr_9E:int
                var_3_2FE = newarray:byte[](byte.class, expr_9E:int)
                var_5_2FF = expr_9E:int
                goto(Label_0864)
            }
        }
        
        Label_0163:
        
        if (cmpeq:boolean(and:int(var_0_36D:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0261)
        }
        
        if (cmpne:boolean(and:int(var_0_36D:int, ldc:int(8388608)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_36D:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_36D = and:int(var_0_36D:int, ldc:int(-139185330))
            var_2_C3 = stack_C3_0:byte[]
            expr_C7 = add:int(arraylength:int(stack_C5_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C7:int, ldc:int(0))) {
                var_3_3E0 = newarray:byte[](byte.class, expr_C7:int)
                var_5_3E1 = expr_C7:int
                
                loop {
                    var_0_36D = and:int(var_0_36D:int, ldc:int(2112295935))
                    var_5_3E1 = add:int(var_5_3E1:int, ldc:int(-1))
                    storeelement:byte(var_3_3E0:byte[], var_5_3E1:int, add:int(shl:int(loadelement:byte(stack_3F2_0:byte[], var_5_3E1:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_C3:byte[], add:int(var_5_3E1:int, and:int(ldc:int(2081), ldc:int(9473)))), ldc:int(3)), and:int(ldc:int(8255), ldc:int(21919)))))
                    
                    if (cmpne:boolean(var_5_3E1:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C3_0 = stack_C5_0 = stack_FE_0 = stack_100_0 = stack_12D_0 = stack_318_0 = stack_380_0 = stack_3F2_0 = stack_448_0 = var_3_3E0:byte[]
            }
        }
        
        Label_0204:
        
        if (cmpne:boolean(and:int(var_0_36D:int, ldc:int(1)), ldc:int(0))) {
            var_0_36D = and:int(var_0_36D:int, ldc:int(1956129405))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_36D:int, ldc:int(262144)), ldc:int(0))) {
                var_0_36D = and:int(var_0_36D:int, ldc:int(-282079555))
                goto(Label_0163)
            }
            
            if (cmpne:boolean(and:int(var_0_36D:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_36D = and:int(var_0_36D:int, ldc:int(1990638543))
            expr_100 = arraylength:int(stack_100_0:byte[])
            
            if (cmpne:boolean(expr_100:int, ldc:int(0))) {
                var_3_436 = newarray:byte[](byte.class, expr_100:int)
                var_5_437 = expr_100:int
                
                loop {
                    var_0_36D = and:int(var_0_36D:int, ldc:int(2109037391))
                    var_5_437 = add:int(var_5_437:int, ldc:int(-1))
                    storeelement:byte(var_3_436:byte[], var_5_437:int, xor:byte(loadelement:byte(stack_448_0:byte[], var_5_437:int), ldc:byte(69)))
                    
                    if (cmpne:boolean(var_5_437:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C3_0 = stack_C5_0 = stack_FE_0 = stack_100_0 = stack_12D_0 = stack_318_0 = stack_380_0 = stack_3F2_0 = stack_448_0 = var_3_436:byte[]
            }
        }
        
        Label_0261:
        
        if (cmpeq:boolean(and:int(var_0_36D:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_36D = and:int(var_0_36D:int, ldc:int(136619122))
            goto(Label_0204)
        }
        
        if (cmpeq:boolean(and:int(var_0_36D:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0163)
        }
        
        if (cmpne:boolean(and:int(var_0_36D:int, ldc:int(64)), ldc:int(0))) {
            var_3_139 = initobject:String(String::<init>, stack_12D_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_141 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4493), ldc:int(16943)))
            expr_14B = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8751), ldc:int(1053)))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(2128), ldc:int(2131)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(-10854), ldc:int(10853)), and:int(ldc:int(6925), ldc:int(71))))
            storeelement:String(expr_141:String[], xor:int(ldc:int(221), ldc:int(209)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(8967), ldc:int(21669)), xor:int(ldc:int(-14320), ldc:int(-14327))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(4129), ldc:int(4139)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(11545), ldc:int(571)), xor:int(ldc:int(16449), ldc:int(16495))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(1160), ldc:int(1155)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(4150), ldc:int(4120)), xor:int(ldc:int(5290), ldc:int(5352))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(10788), ldc:int(10797)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(354), ldc:int(18503)), and:int(ldc:int(11517), ldc:int(4425))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(-30735), ldc:int(30734)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(2198), ldc:int(2271)), xor:int(ldc:int(569), ldc:int(628))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(-31737), ldc:int(-31742)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(6989), ldc:int(1133)), xor:int(ldc:int(21799), ldc:int(21876))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(3072), ldc:int(3073)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(10839), ldc:int(211)), xor:int(ldc:int(298), ldc:int(381))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(1309), ldc:int(1301)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(8192), ldc:int(8279)), xor:int(ldc:int(8368), ldc:int(8429))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(5775), ldc:int(2086)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(8319), ldc:int(221)), and:int(ldc:int(4449), ldc:int(1257))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(1055), ldc:int(1048)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(-32245), ldc:int(-32150)), and:int(ldc:int(12012), ldc:int(4456))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(-32575), ldc:int(-32571)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(5729), ldc:int(5641)), xor:int(ldc:int(4179), ldc:int(4156))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(2), ldc:int(15042)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(339), ldc:int(316)), xor:int(ldc:int(-16308), ldc:int(-16323))))
            putstatic:String[](\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u4daf\u12b2\u3c25\u2dcc\u98a4\u5d20, expr_14B:String[])
            var_3_2B2 = expr_141:String[]
            putstatic:Dynamic2CommandExceptionType(\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u59ec\u3711\u446c\u6d69\u8cae\u3d4b, initobject:Dynamic2CommandExceptionType(Dynamic2CommandExceptionType::<init>, invokedynamic:Dynamic2CommandExceptionType$Function(apply:()Lcom/mojang/brigadier/exceptions/Dynamic2CommandExceptionType$Function;)))
            putstatic:\ub6ab\ube23\uae87\uc84e\u1833(\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u8d98\u34df\u67e9\u3776\u64ab\u4daf, initobject:\ub6ab\ube23\uae87\uc84e\u1833(\ub6ab\ube23\uae87\uc84e\u1833::<init>, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u8d98\u392e\u7006\ud171\u7bad\ua6bd)), invokestatic:Set<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>(Collections::emptySet), checkcast:\uc31c\uc87f\uc246\u3776\ub7dc(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc.class, aconstnull:\uc31c\uc87f\uc246\u3776\ub7dc())))
            putstatic:SimpleCommandExceptionType(\u3bd6\ubf56\u71ae\u4f4a\u6bb9::\u8c8a\u527a\u927d\u4179\u5f50\uff55, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_2B2:String[], and:int(ldc:int(21006), ldc:int(12))))))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u5f50\u6198\u5654\u8389\u62da\u0800(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_65F : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_66A : int
        
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
        var_3_65F = and:int(ldc:int(-489603954), ldc:int(-739283346))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3bd6\ubf56\u71ae\u4f4a\u6bb9[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(4)), ldc:int(0))) {
            var_3_65F = and:int(var_3_65F:int, ldc:int(2128330366))
            var_5_81 = and:int(ldc:int(-17051), ldc:int(17050))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(19804), ldc:int(-20317)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_65F:int, ldc:int(1542946686))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(17668), ldc:int(17669)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, xor:int(ldc:int(16916), ldc:int(16917)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_65F = and:int(var_3_D1:int, ldc:int(-624723441))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(24621), ldc:int(7825)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1637490008))
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1264)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(306604164))
                        goto(Label_0971)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-1345499327))
                        goto(Label_0847)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0716)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0585)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1539145771))
                    }
                    else {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(2012441933))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0585)
                            }
                            
                            goto(Label_0847)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-1027742872))
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1264)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-278497349))
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-694593453))
                        goto(Label_0971)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(988322480))
                        goto(Label_0847)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0716)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(2142290576))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(383747128))
                            loopcontinue()
                        }
                        
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-220906417))
                        var_11_E2 = and:int(ldc:int(20196), ldc:int(-20197))
                        goto(Label_1499)
                    }
                    
                    Label_0585:
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-1423539372))
                        goto(Label_1264)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1713949631))
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0971)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0847)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-295135906))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(-1034144258))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(-831110822))
                            loopcontinue()
                        }
                        
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-420533089))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0847)
                        }
                    }
                    
                    Label_0716:
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1811605389))
                        goto(Label_1381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1264)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(602733386))
                        goto(Label_1139)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0971)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(1215575464))
                            goto(Label_0585)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(-308577278))
                            loopcontinue()
                        }
                        
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1321330796))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0847:
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(120465281))
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(650663682))
                        goto(Label_1381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1183633715))
                        goto(Label_1264)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1629021258))
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0716)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0585)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1123936477))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(-24060), ldc:int(-24059))
                                goto(Label_1139)
                            }
                        }
                    }
                    
                    Label_0971:
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(870683492))
                        goto(Label_1381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1995692208))
                        goto(Label_1264)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0847)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(-1856777496))
                            goto(Label_0716)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(1607810285))
                            goto(Label_0585)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(293048037))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1190477198))
                        var_11_E2 = and:int(ldc:int(-24830), ldc:int(24825))
                    }
                    
                    Label_1139:
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0971)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(-673647406))
                            goto(Label_0847)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(-1032943918))
                            goto(Label_0716)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0585)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(404505024))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(938455525))
                            loopcontinue()
                        }
                        
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1724250140))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1381)
                            }
                        }
                    }
                    
                    Label_1264:
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-1472121939))
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_1139)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0971)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(1440263383))
                            goto(Label_0847)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0716)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0585)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_65F = and:int(var_3_65F:int, ldc:int(-940983508))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1499)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1381:
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1264)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0971)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0847)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(48692997))
                        goto(Label_0716)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0585)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(232032699))
                        loopcontinue()
                    }
                    
                    var_3_65F = and:int(var_3_65F:int, ldc:int(-608098036))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1499:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66A = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1510:
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-703351177))
                        goto(Label_1381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1622289015))
                        goto(Label_1264)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1491770792))
                        goto(Label_0971)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0847)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0716)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1893055309))
                        goto(Label_0585)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(-357958701))
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65F = and:int(var_3_65F:int, ldc:int(1459612125))
                        var_17_66A = add:int(var_16_110:int, and:int(ldc:int(16939), ldc:int(11393)))
                        looporswitchbreak()
                    }
                }
                
                var_3_65F = and:int(var_3_65F:int, ldc:int(-1025431475))
                
                if (cmple:boolean(var_5_81 = var_17_66A:int, sub:int(var_6_88:int, and:int(ldc:int(611), ldc:int(4225))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_65F:int, ldc:int(67108864)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
