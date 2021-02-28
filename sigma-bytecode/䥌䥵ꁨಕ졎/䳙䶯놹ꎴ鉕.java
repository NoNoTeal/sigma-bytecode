public class \u494c\u4975\ua068\u0c95\uc84e.\u4cd9\u4daf\ub1b9\ua3b4\u9255 {
    public void \u4cd9\u4daf\ub1b9\ua3b4\u9255() {
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
            invokespecial:Object(Object::<init>, this:\u4cd9\u4daf\ub1b9\ua3b4\u9255)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void main(java.lang.String[] p0) {
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
    
    private static void \u392e\u8258\u0c95\u9af2\u67e9\uf94d(\u51fa\u12cb\u7330\u74b1\u6c52.\uae87\ub19c\u9937\u836c\u34df\ub8be p0, com.mojang.datafixers.DataFixer p1, boolean p2, java.util.function.BooleanSupplier p3, com.google.common.collect.ImmutableSet<\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c>> p4) {
        var_5_63 : int
        var_5_A1 : int
        var_7_AF : \uc87f\u8c8a\u0c95\u3bd6\u071d\u385b
        var_5_B7 : int
        var_8_BA : ITextComponent
        var_9_C9 : ITextComponent
        var_10_F5 : int
        var_11_107 : int
        
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
            var_5_63 = and:int(ldc:int(1177688888), ldc:int(1199079879))
            
            do {
                if (cmpeq:boolean(and:int(var_5_63:int, ldc:int(256)), ldc:int(0))) {
                    var_5_63 = and:int(var_5_63:int, ldc:int(1555521160))
                }
                else {
                    var_5_63 = and:int(var_5_63:int, ldc:int(1324605892))
                    invokeinterface:void(Logger::info, getstatic:Logger(\u4cd9\u4daf\ub1b9\ua3b4\u9255::\ub32d\uc29a\ub32d\uae87\ud4fe\ua068), loadelement:String(getstatic:String[](\u4cd9\u4daf\ub1b9\ua3b4\u9255::\u8258\u8389\ub18d\u718f\u61a4\ubf56), xor:int(ldc:int(4615), ldc:int(4639))))
                }
            } while (cmpeq:boolean(and:int(var_5_63:int, ldc:int(1048576)), ldc:int(0)))
            
            var_5_A1 = and:int(var_5_63:int, ldc:int(1874220293))
            var_7_AF = initobject:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::<init>, p0:\uae87\ub19c\u9937\u836c\u34df\ub8be, p1:DataFixer, p4:ImmutableSet<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>>, p2:boolean)
            var_5_B7 = and:int(var_5_A1:int, ldc:int(-836888710))
            var_8_BA = aconstnull:ITextComponent()
            
            while (logicalnot:boolean(invokevirtual:boolean(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\ub7dc\u34df\u40a9\u494c\u67d0\ua6bd, var_7_AF:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b))) {
                var_9_C9 = invokevirtual:ITextComponent(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\u92ee\u624e\uafe7\u6d69\ub7dc\u4f4a, var_7_AF:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b)
                
                if (cmpne:boolean(var_8_BA:ITextComponent, var_9_C9:ITextComponent)) {
                    var_8_BA = var_9_C9:ITextComponent
                    var_5_B7 = and:int(var_5_B7:int, ldc:int(1721585932))
                    invokeinterface:void(Logger::info, getstatic:Logger(\u4cd9\u4daf\ub1b9\ua3b4\u9255::\ub32d\uc29a\ub32d\uae87\ud4fe\ua068), invokeinterface:String(ITextComponent::getString, invokevirtual:ITextComponent(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\u92ee\u624e\uafe7\u6d69\ub7dc\u4f4a, var_7_AF:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b)))
                }
                
                var_10_F5 = invokevirtual:int(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\u7330\uf995\u8753\u5140\uf995\ud36e, var_7_AF:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b)
                
                if (cmpgt:boolean(var_10_F5:int, ldc:int(0))) {
                    var_11_107 = add:int(invokevirtual:int(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\ufe34\u72f1\u416d\ud171\u99f7\u5db4, var_7_AF:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b), invokevirtual:int(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\uc246\u88c5\u600f\uc246\u3e2a\u647c, var_7_AF:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b))
                    invokeinterface:void(Logger::info, getstatic:Logger(\u4cd9\u4daf\ub1b9\ua3b4\u9255::\ub32d\uc29a\ub32d\uae87\ud4fe\ua068), loadelement:String(getstatic:String[](\u4cd9\u4daf\ub1b9\ua3b4\u9255::\u8258\u8389\ub18d\u718f\u61a4\ubf56), and:int(ldc:int(16925), ldc:int(12507))), invokestatic:Integer(Integer::valueOf, invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, mul:float(div:float(i2f:float(var_11_107:int), i2f:float(var_10_F5:int)), ldc:float(100.0f)))), invokestatic:Integer(Integer::valueOf, var_11_107:int), invokestatic:Integer[expected:Object](Integer::valueOf, var_10_F5:int))
                }
                
                if (logicalnot:boolean(invokeinterface:boolean(BooleanSupplier::getAsBoolean, p3:BooleanSupplier))) {
                    invokevirtual:void(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\uc2bd\ub1b9\ubff1\uc238\u8350\u5db4, var_7_AF:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b)
                }
                else {
                    try {
                        invokestatic:void(Thread::sleep, ldc:long(1000L))
                    }
                    catch (java.lang.InterruptedException stack_159_0) {
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \ua562\ucb79\uc87f\u3dd3\ubcb0.\u12b2\u4bc8\ub1b9\u516c\u61a4 lambda$\ua068\u7873\u071d\uf9c5\uc87f\u67d0$1(\u5d20\u7043\u88c5\u5db4\uf94d.\u7d52\u51fa\u56bd\u76bc\u4975\ub113 p0, \u51fa\u12cb\u7330\u74b1\u6c52.\uae87\ub19c\u9937\u836c\u34df\ub8be p1, \ub113\uc4d2\u183a\u527a\u6435.\u4f52\ua068\u4f52\u47c2\u4492 p2, \u59ec\u8413\u97e6\uc229\u3776.\u7bad\u76bc\uae5d\u12cb\u16f6 p3, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec p4, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u6cfe\ub1b9\u8350\u7043\u71ae p5, com.mojang.authlib.minecraft.MinecraftSessionService p6, com.mojang.authlib.GameProfileRepository p7, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ub1b9\u983f\uf9c5\u6fb0\u51fa p8, joptsimple.OptionSet p9, joptsimple.OptionSpec p10, joptsimple.OptionSpec p11, joptsimple.OptionSpec p12, joptsimple.OptionSpec p13, joptsimple.OptionSpec p14, joptsimple.OptionSpec p15, java.lang.Thread p16) {
        var_17_63 : int
        var_19_84 : \u12b2\u4bc8\ub1b9\u516c\u61a4
        stack_112_0 : int [generated]
        
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
            var_17_63 = and:int(ldc:int(123372475), ldc:int(1330988809))
            var_19_84 = initobject:\u12b2\u4bc8\ub1b9\u516c\u61a4(\u12b2\u4bc8\ub1b9\u516c\u61a4::<init>, p16:Thread, p0:\u7d52\u51fa\u56bd\u76bc\u4975\ub113, p1:\uae87\ub19c\u9937\u836c\u34df\ub8be, p2:\u4f52\ua068\u4f52\u47c2\u4492, p3:\u7bad\u76bc\uae5d\u12cb\u16f6, p4:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec, p5:\u6cfe\ub1b9\u8350\u7043\u71ae, invokestatic:DataFixer(\ud4fe\u67e9\u69d9\ud36e\u3504\u5245::\u12cb\u6cfe\u965f\u34df\ub18d\u7bad), p6:MinecraftSessionService, p7:GameProfileRepository, p8:\ub1b9\u983f\uf9c5\u6fb0\u51fa, invokedynamic:\u446c\u527a\u8c8a\u927d\u3e75(\ud12e\ub18d\u8cae\ua6bd\u47c2\uae87:()L\u4492\u8aa5\ud171\uc3e3\u4c2b/\u4c04\ua068\u3d64\ua6bd\u8389/\u446c\u527a\u8c8a\u927d\u3e75;))
            invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\ubefe\uc7fe\u8df4\u6fb0\u72f1\uc7fe, var_19_84:\u12b2\u4bc8\ub1b9\u516c\u61a4[expected:\u88c5\ud171\ub113\u6435\ud51e], checkcast:String(java.lang.String.class, invokevirtual:Object[expected:String](OptionSet::valueOf, p9:OptionSet, p10:OptionSpec)))
            invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\ub18d\u74b1\u494c\u0a06\u7049\u8c8a, var_19_84:\u12b2\u4bc8\ub1b9\u516c\u61a4[expected:\u88c5\ud171\ub113\u6435\ud51e], invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Object[expected:Integer](OptionSet::valueOf, p9:OptionSet, p11:OptionSpec))))
            invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\u494c\ubefe\u7043\u4179\u3e2a\uc84e, var_19_84:\u12b2\u4bc8\ub1b9\u516c\u61a4[expected:\u88c5\ud171\ub113\u6435\ud51e], invokevirtual:boolean(OptionSet::has, p9:OptionSet, p12:OptionSpec))
            invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\u7af6\u8d90\u120d\u8d98\u3711\u7006, var_19_84:\u12b2\u4bc8\ub1b9\u516c\u61a4[expected:\u88c5\ud171\ub113\u6435\ud51e], checkcast:String(java.lang.String.class, invokevirtual:Object[expected:String](OptionSet::valueOf, p9:OptionSet, p13:OptionSpec)))
            
            if (logicalnot:boolean(logicalor:boolean(invokevirtual:boolean(OptionSet::has, p9:OptionSet, p14:OptionSpec), invokeinterface:boolean(List::contains, invokevirtual:List(OptionSet::valuesOf, p9:OptionSet, p15:OptionSpec), loadelement:String[expected:Object](getstatic:String[](\u4cd9\u4daf\ub1b9\ua3b4\u9255::\u8258\u8389\ub18d\u718f\u61a4\ubf56), and:int(ldc:int(2504), ldc:int(-2505))))))) {
                stack_112_0 = and:int(ldc:int(169), ldc:int(1281))
            }
            else {
                var_17_63 = and:int(var_17_63:int, ldc:int(-965669044))
                stack_112_0 = and:int(ldc:int(25710), ldc:int(-25712))
            }
            
            if (cmpne:boolean(stack_112_0:int, ldc:int(0))) {
                if (logicalnot:boolean(invokestatic:boolean(GraphicsEnvironment::isHeadless))) {
                    invokevirtual:void(\u12b2\u4bc8\ub1b9\u516c\u61a4::\u69d9\uf9c5\u5f50\u4bc8\u9255\u7330, var_19_84:\u12b2\u4bc8\ub1b9\u516c\u61a4)
                }
            }
            
            return:\u12b2\u4bc8\ub1b9\u516c\u61a4(var_19_84:\u12b2\u4bc8\ub1b9\u516c\u61a4)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u927d\uc9f6\u6d69\u71ae\u5fe1\u873d$0() {
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
            return:boolean(xor:int[expected:boolean](ldc:int(2064), ldc:int(2065)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_4CB : int
        expr_6E : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_CB_0 : byte[] [generated]
        stack_CD_0 : byte[] [generated]
        stack_F1_0 : byte[] [generated]
        stack_F3_0 : byte[] [generated]
        stack_130_0 : byte[] [generated]
        stack_43D_0 : byte[] [generated]
        stack_478_0 : byte[] [generated]
        stack_4DE_0 : byte[] [generated]
        stack_553_0 : byte[] [generated]
        var_4_41F : int
        var_3_424 : byte[]
        var_5_425 : int
        var_0_4D4 : int
        expr_4DE : byte [generated]
        stack_51E_2 : byte [generated]
        stack_4FB_0 : byte [generated]
        var_2_9C : byte[]
        expr_A0 : int [generated]
        var_3_466 : byte[]
        var_5_467 : int
        expr_CD : int [generated]
        expr_F3 : int [generated]
        var_3_541 : byte[]
        var_5_542 : int
        expr_556 : byte [generated]
        var_3_13C : String
        stack_412_0 : String[] [generated]
        expr_14E : String[] [generated]
        
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
        var_0_4CB = and:int(ldc:int(2029790308), ldc:int(-352355588))
        expr_6E = arraylength:int(stack_9C_0 = stack_9E_0 = stack_CB_0 = stack_CD_0 = stack_F1_0 = stack_F3_0 = stack_130_0 = stack_43D_0 = stack_478_0 = stack_4DE_0 = stack_553_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Qbl6QwGAAVKtB5CzA8MBUrCDfIR/h8JBvZdDcMCBkO1Xr8CHQ8BAAVJvxX9GU2/E/0AE/NSzA8MB08H2Pj0XcMCD0vNBf0SA/NYzAH5V7sY8gNawg3yEf4fCQbyUc3zXLwQ/xH1WrQeSLQSBAwBCgBJvxX9GUIBCLMaAAks6g4OJekMBgAFSrQeTb4CH/8FWr0SBEPFCggDAfAaAPVdvxP9ABP9N+3+GwoGBkm5HfcZBUu0CBXwHA4FRuvkBfoZBAIP9BAFSAq/B1YPwgsFSAq/B1zr5AX6GQQCD/QQ8lgCvxP9ABP1XL8CH/oT/woVAP1WD8ILBUgAzvgaAki9BQxaDQq9EgYPT70NFfAGPe8MAfJSxg/wGA1JvxX9GUi0EgQMAQoASsIN8hH+HwkKQcADA/cg+gAEQ88KDgRPzw/6E/AYTQHAAwP4WLQSBAwBCgBKwg3yEf4fCQpJvxwBDUzMBELMDwwOAAAc8/0AE/Nd2/PwARQG+B9K2vT8FQwKGPj0UMgBAAVKtB5PywX8EQRKtB5KvRIES+74GgAnyg9Bzf8eA/NatB5MvAYfSr0SBE2/E/0AE/VfCebuSrQeS874GgJIvQUFWMYN81PPDfwUR8oJBgBKwgAJ8wE74gD+AR4JDwsD8Bz/EyDvCgIBDvgaAki9BQ8WDf4fARXoFfAcDgwCCAr2GgQF8Czx8QoaBgL0HgkA/RnwHf8AAxoACSzqDgD/E/0AE/VcvwIf+hP/ChUA8Q8T/QAT+DXh+xoGCgYF9RoG9RP8BhQD8BP+Dxz5HfcZCf8JVA3FAw31FgH+EAVJDb8MUA4FvwxdygP2Egb7WgEBBpA==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_41F = expr_6E:int
        var_3_424 = newarray:byte[](byte.class, expr_6E:int)
        var_5_425 = expr_6E:int
        Label_1063:
        
        while (cmpne:boolean(and:int(var_0_4CB:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_4CB = and:int(var_0_4CB:int, ldc:int(-557881746))
            var_5_425 = add:int(var_5_425:int, ldc:int(-1))
            storeelement:byte(var_3_424:byte[], var_5_425:int, xor:byte(loadelement:byte(stack_43D_0:byte[], var_5_425:int), ldc:byte(64)))
            
            if (cmpne:boolean(var_5_425:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_CB_0 = stack_CD_0 = stack_F1_0 = stack_F3_0 = stack_130_0 = stack_43D_0 = stack_478_0 = stack_4DE_0 = stack_553_0 = var_3_424:byte[]
            goto(Label_0115)
        }
        
        Label_1215:
        
        while (cmpne:boolean(and:int(var_0_4CB:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_4D4 = and:int(var_0_4CB:int, ldc:int(-626234897))
            var_5_425 = add:int(var_5_425:int, ldc:int(-1))
            expr_4DE = stack_51E_2 = loadelement(stack_4DE_0, var_5_425)
            
            if (cmplt:boolean(add:int(add:int(var_5_425:int, ldc:int(1)), neg:int(var_4_41F:int)), ldc:int(0))) {
                stack_51E_2 = stack_4FB_0 = add:byte(expr_4DE:byte, loadelement:byte(var_3_424:byte[], add:int(var_5_425:int, ldc:int(1))))
                goto(Label_1291)
            }
            
            Label_1259:
            
            if (cmpeq:boolean(and:int(var_0_4D4:int, ldc:int(65536)), ldc:int(0))) {
                var_0_4D4 = and:int(var_0_4D4:int, ldc:int(-370317113))
                stack_51E_2 = stack_4FB_0 = add:byte(expr_4DE:byte, ldc:byte(1))
            }
            
            Label_1291:
            
            if (cmpne:boolean(and:int(var_0_4D4:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_1259)
            }
            
            var_0_4CB = and:int(var_0_4D4:int, ldc:int(1273344837))
            storeelement:byte(var_3_424:byte[], var_5_425:int, stack_51E_2:byte)
            
            if (cmpne:boolean(var_5_425:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_CB_0 = stack_CD_0 = stack_F1_0 = stack_F3_0 = stack_130_0 = stack_43D_0 = stack_478_0 = stack_4DE_0 = stack_553_0 = var_3_424:byte[]
            goto(Label_0210)
        }
        
        var_0_4CB = and:int(var_0_4CB:int, ldc:int(1902274027))
        goto(Label_1063)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_4CB:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_4CB = and:int(var_0_4CB:int, ldc:int(-1332060722))
            goto(Label_0248)
        }
        
        if (cmpeq:boolean(and:int(var_0_4CB:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0210)
        }
        
        if (cmpeq:boolean(and:int(var_0_4CB:int, ldc:int(131072)), ldc:int(0))) {
            var_0_4CB = and:int(var_0_4CB:int, ldc:int(1323761223))
            var_2_9C = stack_9C_0:byte[]
            expr_A0 = add:int(arraylength:int(stack_9E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A0:int, ldc:int(0))) {
                var_3_466 = newarray:byte[](byte.class, expr_A0:int)
                var_5_467 = expr_A0:int
                
                loop {
                    var_0_4CB = and:int(var_0_4CB:int, ldc:int(1857447268))
                    var_5_467 = add:int(var_5_467:int, ldc:int(-1))
                    storeelement:byte(var_3_466:byte[], var_5_467:int, add:int(shl:int(loadelement:byte(stack_478_0:byte[], var_5_467:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_9C:byte[], add:int(var_5_467:int, xor:int(ldc:int(4100), ldc:int(4101)))), ldc:int(2)), and:int(ldc:int(16895), ldc:int(2111)))))
                    
                    if (cmpne:boolean(var_5_467:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_CB_0 = stack_CD_0 = stack_F1_0 = stack_F3_0 = stack_130_0 = stack_43D_0 = stack_478_0 = stack_4DE_0 = stack_553_0 = var_3_466:byte[]
            }
        }
        
        Label_0165:
        
        if (cmpne:boolean(and:int(var_0_4CB:int, ldc:int(1)), ldc:int(0))) {
            var_0_4CB = and:int(var_0_4CB:int, ldc:int(539379342))
            goto(Label_0248)
        }
        
        if (cmpne:boolean(and:int(var_0_4CB:int, ldc:int(4)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_4CB:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_4CB = and:int(var_0_4CB:int, ldc:int(-307776388))
            expr_CD = arraylength:int(stack_CD_0:byte[])
            
            if (cmpne:boolean(expr_CD:int, ldc:int(0))) {
                var_4_41F = expr_CD:int
                var_3_424 = newarray:byte[](byte.class, expr_CD:int)
                var_5_425 = expr_CD:int
                goto(Label_1215)
            }
        }
        
        Label_0210:
        
        if (cmpeq:boolean(and:int(var_0_4CB:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_4CB:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0165)
            }
            
            if (cmpeq:boolean(and:int(var_0_4CB:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_4CB = and:int(var_0_4CB:int, ldc:int(2112628565))
            expr_F3 = arraylength:int(stack_F3_0:byte[])
            
            if (cmpne:boolean(expr_F3:int, ldc:int(0))) {
                var_3_541 = newarray:byte[](byte.class, expr_F3:int)
                var_5_542 = expr_F3:int
                
                loop {
                    var_0_4CB = and:int(var_0_4CB:int, ldc:int(1302719468))
                    var_5_542 = add:int(var_5_542:int, ldc:int(-1))
                    expr_556 = add:byte(loadelement:byte(stack_553_0:byte[], var_5_542:int), ldc:byte(104))
                    storeelement:byte(var_3_541:byte[], var_5_542:int, or:int(and:int(shl:int(expr_556:byte, xor:int(ldc:int(2202), ldc:int(2206))), ldc:int(-16)), and:int(shr:int(expr_556:byte[expected:int], and:int(ldc:int(2244), ldc:int(25093))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_542:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_CB_0 = stack_CD_0 = stack_F1_0 = stack_F3_0 = stack_130_0 = stack_43D_0 = stack_478_0 = stack_4DE_0 = stack_553_0 = var_3_541:byte[]
            }
        }
        
        Label_0248:
        
        if (cmpeq:boolean(and:int(var_0_4CB:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_4CB = and:int(var_0_4CB:int, ldc:int(-451136546))
            goto(Label_0210)
        }
        
        if (cmpne:boolean(and:int(var_0_4CB:int, ldc:int(256)), ldc:int(0))) {
            var_0_4CB = and:int(var_0_4CB:int, ldc:int(-1650388986))
            goto(Label_0165)
        }
        
        if (cmpeq:boolean(and:int(var_0_4CB:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_4CB = and:int(var_0_4CB:int, ldc:int(705408875))
            goto(Label_0115)
        }
        
        var_3_13C = initobject:String(String::<init>, stack_130_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_412_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-31695), ldc:int(-31701)))
        expr_14E = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16410), ldc:int(10555)))
        storeelement:String(expr_14E:String[], xor:int(ldc:int(27139), ldc:int(27151)), invokevirtual:String[expected:String](String::substring, var_3_13C:String, and:int(ldc:int(-8415), ldc:int(8414)), and:int(ldc:int(27715), ldc:int(17))))
        storeelement:String(expr_14E:String[], xor:int(ldc:int(16), ldc:int(5)), invokevirtual:String[expected:String](String::substring, var_3_13C:String, xor:int(ldc:int(2080), ldc:int(2081)), and:int(ldc:int(12480), ldc:int(1176))))
        storeelement:String(expr_14E:String[], xor:int(ldc:int(72), ldc:int(95)), invokevirtual:String[expected:String](String::substring, var_3_13C:String, and:int(ldc:int(652), ldc:int(2259)), and:int(ldc:int(4326), ldc:int(3493))))
        storeelement:String(expr_14E:String[], xor:int(ldc:int(16470), ldc:int(16462)), invokevirtual:String[expected:String](String::substring, var_3_13C:String, and:int(ldc:int(21476), ldc:int(167)), and:int(ldc:int(13759), ldc:int(2234))))
        storeelement:String(expr_14E:String[], and:int(ldc:int(50), ldc:int(2258)), invokevirtual:String[expected:String](String::substring, var_3_13C:String, xor:int(ldc:int(4110), ldc:int(4276)), xor:int(ldc:int(8996), ldc:int(9207))))
        storeelement:String(expr_14E:String[], and:int(ldc:int(374), ldc:int(16898)), invokevirtual:String[expected:String](String::substring, var_3_13C:String, and:int(ldc:int(21723), ldc:int(2259)), xor:int(ldc:int(12767), ldc:int(12498))))
        storeelement:String(expr_14E:String[], xor:int(ldc:int(2562), ldc:int(2570)), invokevirtual:String[expected:String](String::substring, var_3_13C:String, xor:int(ldc:int(20736), ldc:int(20493)), xor:int(ldc:int(6255), ldc:int(6492))))
        storeelement:String(expr_14E:String[], and:int(ldc:int(21908), ldc:int(10332)), invokevirtual:String[expected:String](String::substring, var_3_13C:String, xor:int(ldc:int(2704), ldc:int(2979)), xor:int(ldc:int(18614), ldc:int(18911))))
        storeelement:String(expr_14E:String[], and:int(ldc:int(2134), ldc:int(5270)), invokevirtual:String[expected:String](String::substring, var_3_13C:String, and:int(ldc:int(9195), ldc:int(22909)), and:int(ldc:int(24959), ldc:int(1407))))
        storeelement:String(expr_14E:String[], and:int(ldc:int(4307), ldc:int(1043)), invokevirtual:String[expected:String](String::substring, var_3_13C:String, and:int(ldc:int(25983), ldc:int(1023)), and:int(ldc:int(3062), ldc:int(25046))))
        storeelement:String(expr_14E:String[], and:int(ldc:int(4252), ldc:int(8966)), invokevirtual:String[expected:String](String::substring, var_3_13C:String, xor:int(ldc:int(6242), ldc:int(6580)), xor:int(ldc:int(5145), ldc:int(5625))))
        storeelement:String(expr_14E:String[], xor:int(ldc:int(50), ldc:int(49)), invokevirtual:String[expected:String](String::substring, var_3_13C:String, xor:int(ldc:int(16), ldc:int(496)), and:int(ldc:int(500), ldc:int(997))))
        storeelement:String(expr_14E:String[], xor:int(ldc:int(5123), ldc:int(5125)), invokevirtual:String[expected:String](String::substring, var_3_13C:String, xor:int(ldc:int(16446), ldc:int(16858)), and:int(ldc:int(4591), ldc:int(10734))))
        storeelement:String(expr_14E:String[], xor:int(ldc:int(1158), ldc:int(1175)), invokevirtual:String[expected:String](String::substring, var_3_13C:String, xor:int(ldc:int(-26459), ldc:int(-26293)), xor:int(ldc:int(2445), ldc:int(2171))))
        storeelement:String(expr_14E:String[], xor:int(ldc:int(135), ldc:int(130)), invokevirtual:String[expected:String](String::substring, var_3_13C:String, xor:int(ldc:int(-32533), ldc:int(-32483)), and:int(ldc:int(5634), ldc:int(27586))))
        storeelement:String(expr_14E:String[], xor:int(ldc:int(2199), ldc:int(2206)), invokevirtual:String[expected:String](String::substring, var_3_13C:String, and:int(ldc:int(22338), ldc:int(10898)), xor:int(ldc:int(24777), ldc:int(25295))))
        storeelement:String(expr_14E:String[], xor:int(ldc:int(294), ldc:int(295)), invokevirtual:String[expected:String](String::substring, var_3_13C:String, xor:int(ldc:int(10579), ldc:int(11093)), and:int(ldc:int(2834), ldc:int(4690))))
        storeelement:String(expr_14E:String[], and:int(ldc:int(-24842), ldc:int(24841)), invokevirtual:String[expected:String](String::substring, var_3_13C:String, xor:int(ldc:int(1010), ldc:int(480)), xor:int(ldc:int(16404), ldc:int(16899))))
        storeelement:String(expr_14E:String[], xor:int(ldc:int(2088), ldc:int(2086)), invokevirtual:String[expected:String](String::substring, var_3_13C:String, and:int(ldc:int(10911), ldc:int(535)), xor:int(ldc:int(2675), ldc:int(2152))))
        storeelement:String(expr_14E:String[], and:int(ldc:int(21775), ldc:int(615)), invokevirtual:String[expected:String](String::substring, var_3_13C:String, xor:int(ldc:int(698), ldc:int(161)), xor:int(ldc:int(218), ldc:int(761))))
        storeelement:String(expr_14E:String[], xor:int(ldc:int(541), ldc:int(525)), invokevirtual:String[expected:String](String::substring, var_3_13C:String, xor:int(ldc:int(8360), ldc:int(8843)), xor:int(ldc:int(25041), ldc:int(25573))))
        storeelement:String(expr_14E:String[], and:int(ldc:int(559), ldc:int(2079)), invokevirtual:String[expected:String](String::substring, var_3_13C:String, xor:int(ldc:int(6), ldc:int(562)), and:int(ldc:int(4670), ldc:int(2940))))
        storeelement:String(expr_14E:String[], xor:int(ldc:int(266), ldc:int(256)), invokevirtual:String[expected:String](String::substring, var_3_13C:String, and:int(ldc:int(16959), ldc:int(9084)), and:int(ldc:int(584), ldc:int(6776))))
        storeelement:String(expr_14E:String[], and:int(ldc:int(29195), ldc:int(351)), invokevirtual:String[expected:String](String::substring, var_3_13C:String, and:int(ldc:int(17256), ldc:int(8781)), xor:int(ldc:int(140), ldc:int(732))))
        storeelement:String(expr_14E:String[], xor:int(ldc:int(6146), ldc:int(6159)), invokevirtual:String[expected:String](String::substring, var_3_13C:String, xor:int(ldc:int(8286), ldc:int(8718)), and:int(ldc:int(2901), ldc:int(4821))))
        storeelement:String(expr_14E:String[], xor:int(ldc:int(18705), ldc:int(18696)), invokevirtual:String[expected:String](String::substring, var_3_13C:String, xor:int(ldc:int(841), ldc:int(284)), and:int(ldc:int(630), ldc:int(19063))))
        putstatic:String[](\u4cd9\u4daf\ub1b9\ua3b4\u9255::\u8258\u8389\ub18d\u718f\u61a4\ubf56, expr_14E:String[])
        putstatic:Logger(\u4cd9\u4daf\ub1b9\ua3b4\u9255::\ub32d\uc29a\ub32d\uae87\ud4fe\ua068, invokestatic:Logger(LogManager::getLogger))
    }
    
    public void \ubcb0\u183a\ub70c\u98a4\u7330\ub70c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61F : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_62A : int
        
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
        var_3_61F = and:int(ldc:int(1858505794), ldc:int(1044615027))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4cd9\u4daf\ub1b9\ua3b4\u9255[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_61F = and:int(var_3_61F:int, ldc:int(-639403142))
        }
        else {
            var_3_61F = and:int(var_3_61F:int, ldc:int(-1076805809))
            var_5_8A = and:int(ldc:int(-10640), ldc:int(10638))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(2947), ldc:int(-27524)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_61F:int, ldc:int(-277659881))
                    var_9_C7 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_91:int, and:int(ldc:int(1777), ldc:int(2053)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, xor:int(ldc:int(10504), ldc:int(10505)))), var_7_A0:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_61F = and:int(var_3_D9:int, ldc:int(-1354071005))
                    var_14_114 = var_7_A0:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(16529), ldc:int(8707)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_91:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-2123315211))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1888035209))
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1204)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1077)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1101074))
                        goto(Label_0812)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1254033786))
                        goto(Label_0593)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1195657971))
                    }
                    else {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1353561045))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0593)
                            }
                            
                            goto(Label_0812)
                        }
                    }
                    
                    Label_0414:
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1181822734))
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1204)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-331976699))
                        goto(Label_1077)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1745747193))
                        goto(Label_0812)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1738843233))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(425172301))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(570356121))
                            loopcontinue()
                        }
                        
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1368379822))
                        var_11_EA = and:int(ldc:int(-4965), ldc:int(4964))
                        goto(Label_1439)
                    }
                    
                    Label_0593:
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1343)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1204)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1077)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0812)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0414)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61F = and:int(var_3_61F:int, ldc:int(2130347086))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0812)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1343)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1216241569))
                        goto(Label_1204)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-470986644))
                        goto(Label_1077)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1311113599))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(-1731166382))
                            goto(Label_0593)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0414)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(2090378297))
                            loopcontinue()
                        }
                        
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1061389859))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0812:
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1182993837))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1475414463))
                        goto(Label_1343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(2083234352))
                        goto(Label_1204)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1077)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(159480872))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(-1779645943))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0593)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0414)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(1008596883))
                            loopcontinue()
                        }
                        
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-276869626))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EA = xor:int(ldc:int(17921), ldc:int(17920))
                                goto(Label_1077)
                            }
                        }
                    }
                    
                    Label_0950:
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1617271672))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1343)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1204)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0812)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0593)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0414)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1075360577))
                        var_11_EA = and:int(ldc:int(25004), ldc:int(-25007))
                    }
                    
                    Label_1077:
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1537613014))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1343)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(128454590))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(-1536677731))
                            goto(Label_0950)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(512)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(-412298512))
                            goto(Label_0812)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(4)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(1801091729))
                            goto(Label_0593)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0414)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61F = and:int(var_3_61F:int, ldc:int(2119657059))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1343)
                            }
                        }
                    }
                    
                    Label_1204:
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1834017491))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1477521645))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_1077)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0950)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(128)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(-995668513))
                            goto(Label_0812)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(-1800892054))
                            goto(Label_0593)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0414)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(42340433))
                            loopcontinue()
                        }
                        
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1053812287))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_8A:int, var_16_118:int)
                        goto(Label_1439)
                    }
                    
                    Label_1343:
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1204)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1077)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0812)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0593)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0414)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(128)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_61F = and:int(var_3_61F:int, ldc:int(-1099487814))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1439:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_62A = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1450:
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-199701608))
                        goto(Label_1343)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1204)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1077)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(292325526))
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0812)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1571381092))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0593)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1941336889))
                        goto(Label_0414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1072451570))
                        var_17_62A = add:int(var_16_118:int, xor:int(ldc:int(657), ldc:int(656)))
                        looporswitchbreak()
                    }
                    
                    var_3_61F = and:int(var_3_61F:int, ldc:int(48182385))
                }
                
                var_3_61F = and:int(var_3_61F:int, ldc:int(1850969495))
                
                if (cmple:boolean(var_5_8A = var_17_62A:int, sub:int(var_6_91:int, and:int(ldc:int(22569), ldc:int(1091))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
