public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u6435\u97e6\u51fa\ucfaf\uc3e3 {
    public void \u6435\u97e6\u51fa\ucfaf\uc3e3() {
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
            invokespecial:Object(Object::<init>, this:\u6435\u97e6\u51fa\ucfaf\uc3e3)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \ufcaf\uc7fe\ub171\u600f\u4cd9\u7bad(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int \u51fa\u183a\u927d\ud4fe\u3a62\uceb8(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
        var_3_64 : \u88c5\ud171\ub113\u6435\ud51e
        stack_A3_1 : String [generated]
        expr_8C : Object[] [generated]
        
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
        var_3_64 = invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937)
        
        if (logicalnot:boolean(invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u983f\u3711\ud171\ub32d\ubded\uc3e3, var_3_64:\u88c5\ud171\ub113\u6435\ud51e))) {
            invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\u88c5\u51fa\uc910\u59ec\uc29a\u12b2, var_3_64:\u88c5\ud171\ub113\u6435\ud51e)
            stack_A3_1 = loadelement:String(getstatic:String[](\u6435\u97e6\u51fa\ucfaf\uc3e3::\u3e2a\uc229\u718f\ua6bd\u51fa\u4975), xor:int(ldc:int(-31471), ldc:int(-31467)))
            expr_8C = newarray:Object[](java.lang.Object.class, and:int(ldc:int(15505), ldc:int(17257)))
            storeelement:Object(expr_8C:Object[], and:int(ldc:int(25954), ldc:int(-26467)), loadelement:String[expected:Object](getstatic:String[](\u6435\u97e6\u51fa\ucfaf\uc3e3::\u3e2a\uc229\u718f\ua6bd\u51fa\u4975), xor:int(ldc:int(-31454), ldc:int(-31449))))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_A3_1:String, expr_8C:Object[]), and:int[expected:boolean](ldc:int(1), ldc:int(16785)))
            return:int(and:int(ldc:int(-19589), ldc:int(19588)))
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u6435\u97e6\u51fa\ucfaf\uc3e3::\u92ee\u7330\ucfaf\uc229\uc2e8\u183a)))
    }
    
    private static int \uc84e\uc84e\u4492\u64f2\u8d98\uf94d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
        var_3_64 : \u88c5\ud171\ub113\u6435\ud51e
        var_4_75 : \u4492\u4179\u416d\uc910\u8d98
        var_6_E9 : float
        var_7_F6 : float
        stack_186_1 : String [generated]
        expr_10F : Object[] [generated]
        stack_143_1 : int [generated]
        stack_140_0 : Locale [generated]
        stack_140_1 : String [generated]
        expr_12F : Object[] [generated]
        stack_185_1 : int [generated]
        stack_182_0 : String [generated]
        expr_171 : Object[] [generated]
        
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
        var_3_64 = invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937)
        
        if (invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u983f\u3711\ud171\ub32d\ubded\uc3e3, var_3_64:\u88c5\ud171\ub113\u6435\ud51e)) {
            var_4_75 = invokevirtual:\u4492\u4179\u416d\uc910\u8d98(\u88c5\ud171\ub113\u6435\ud51e::\u5bc4\uc4d2\u64f2\u16f6\u3d64\uafe7, var_3_64:\u88c5\ud171\ub113\u6435\ud51e)
            invokeinterface:boolean(\u4492\u4179\u416d\uc910\u8d98::\u8258\ud158\u446c\u64ab\uae5d\u600f, var_4_75:\u4492\u4179\u416d\uc910\u8d98, initobject:File(File::<init>, invokevirtual:File(\u88c5\ud171\ub113\u6435\ud51e::\u7bad\u4d85\u3d64\u1833\ud523\u8d98, var_3_64:\u88c5\ud171\ub113\u6435\ud51e, loadelement:String(getstatic:String[](\u6435\u97e6\u51fa\ucfaf\uc3e3::\u3e2a\uc229\u718f\ua6bd\u51fa\u4975), and:int(ldc:int(2732), ldc:int(-7086)))), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u6435\u97e6\u51fa\ucfaf\uc3e3::\u3e2a\uc229\u718f\ua6bd\u51fa\u4975), and:int(ldc:int(30), ldc:int(2118)))), invokevirtual:String(DateFormat::format, initobject:SimpleDateFormat[expected:DateFormat](SimpleDateFormat::<init>, loadelement:String(getstatic:String[](\u6435\u97e6\u51fa\ucfaf\uc3e3::\u3e2a\uc229\u718f\ua6bd\u51fa\u4975), xor:int(ldc:int(-8159), ldc:int(-8154)))), initobject:Date(Date::<init>))), loadelement:String(getstatic:String[](\u6435\u97e6\u51fa\ucfaf\uc3e3::\u3e2a\uc229\u718f\ua6bd\u51fa\u4975), and:int(ldc:int(2060), ldc:int(21448)))))))
            var_6_E9 = div:float(l2f:float(invokeinterface:long(\u4492\u4179\u416d\uc910\u8d98::\u3504\ua3b4\u56bd\u392e\ud12e\u7af6, var_4_75:\u4492\u4179\u416d\uc910\u8d98)), ldc:float(1.0E9f))
            var_7_F6 = div:float(i2f:float(invokeinterface:int(\u4492\u4179\u416d\uc910\u8d98::\u4975\u6198\ubf56\uae5d\u6cfe\u92ff, var_4_75:\u4492\u4179\u416d\uc910\u8d98)), var_6_E9:float)
            stack_186_1 = loadelement:String(getstatic:String[](\u6435\u97e6\u51fa\ucfaf\uc3e3::\u3e2a\uc229\u718f\ua6bd\u51fa\u4975), xor:int(ldc:int(21), ldc:int(28)))
            expr_10F = newarray:Object[](java.lang.Object.class, and:int(ldc:int(8199), ldc:int(2915)))
            stack_143_1 = and:int(ldc:int(-25383), ldc:int(25350))
            stack_140_0 = getstatic:Locale(Locale::ROOT)
            stack_140_1 = loadelement:String(getstatic:String[](\u6435\u97e6\u51fa\ucfaf\uc3e3::\u3e2a\uc229\u718f\ua6bd\u51fa\u4975), xor:int(ldc:int(17447), ldc:int(17453)))
            expr_12F = newarray:Object[](java.lang.Object.class, and:int(ldc:int(7), ldc:int(20753)))
            storeelement:Object(expr_12F:Object[], and:int(ldc:int(-27077), ldc:int(26948)), invokestatic:Float[expected:Object](Float::valueOf, var_6_E9:float))
            storeelement:Object(expr_10F:Object[], stack_143_1:int, invokestatic:String(String::format, stack_140_0:Locale, stack_140_1:String, expr_12F:Object[]))
            storeelement:Object(expr_10F:Object[], and:int(ldc:int(18577), ldc:int(5417)), invokestatic:Integer[expected:Object](Integer::valueOf, invokeinterface:int(\u4492\u4179\u416d\uc910\u8d98::\u4975\u6198\ubf56\uae5d\u6cfe\u92ff, var_4_75:\u4492\u4179\u416d\uc910\u8d98)))
            stack_185_1 = and:int(ldc:int(4779), ldc:int(1046))
            stack_182_0 = loadelement:String(getstatic:String[](\u6435\u97e6\u51fa\ucfaf\uc3e3::\u3e2a\uc229\u718f\ua6bd\u51fa\u4975), and:int(ldc:int(75), ldc:int(8334)))
            expr_171 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(1059), ldc:int(16393)))
            storeelement:Object(expr_171:Object[], and:int(ldc:int(-7489), ldc:int(7488)), invokestatic:Float[expected:Object](Float::valueOf, var_7_F6:float))
            storeelement:Object(expr_10F:Object[], stack_185_1:int, invokestatic:String(String::format, stack_182_0:String, expr_171:Object[]))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_186_1:String, expr_10F:Object[]), xor:int[expected:boolean](ldc:int(-21504), ldc:int(-21503)))
            return:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, var_7_F6:float))
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u6435\u97e6\u51fa\ucfaf\uc3e3::\u8640\u4cd9\uc910\ua61f\u873d\u9255)))
    }
    
    private static int \uf995\u98a4\ubf56\u6d69\u7af6\u4975(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
        var_1_64 : int
        var_3_69 : \u88c5\ud171\ub113\u6435\ud51e
        var_1_6E : int
        var_4_A6 : String
        var_5_BF : Path
        var_6_219 : Path
        var_7_26C : FileSystem
        var_8_26F : Throwable
        var_9_2C1 : Throwable
        var_11_2E6 : Throwable
        stack_396_1 : String [generated]
        expr_388 : Object[] [generated]
        stack_3E0_0 : int [generated]
        var_5_3E5 : IOException
        
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
        var_1_64 = and:int(and:int(ldc:int(-1135279355), ldc:int(-100469825)), ldc:int(-1206306969))
        var_3_69 = invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937)
        var_1_6E = and:int(var_1_64:int, ldc:int(-1700389086))
        var_4_A6 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u6435\u97e6\u51fa\ucfaf\uc3e3::\u3e2a\uc229\u718f\ua6bd\u51fa\u4975), xor:int(ldc:int(-29685), ldc:int(-29696)))), invokevirtual:String(DateFormat::format, initobject:SimpleDateFormat[expected:DateFormat](SimpleDateFormat::<init>, loadelement:String(getstatic:String[](\u6435\u97e6\u51fa\ucfaf\uc3e3::\u3e2a\uc229\u718f\ua6bd\u51fa\u4975), xor:int(ldc:int(6153), ldc:int(6158)))), initobject:Date(Date::<init>))))
        
        try {
            var_1_6E = and:int(var_1_6E:int, ldc:int(-1626645658))
            var_5_BF = invokevirtual:Path(File::toPath, invokevirtual:File(\u88c5\ud171\ub113\u6435\ud51e::\u7bad\u4d85\u3d64\u1833\ud523\u8d98, var_3_69:\u88c5\ud171\ub113\u6435\ud51e, loadelement:String(getstatic:String[](\u6435\u97e6\u51fa\ucfaf\uc3e3::\u3e2a\uc229\u718f\ua6bd\u51fa\u4975), and:int(ldc:int(19833), ldc:int(-24444)))))
            
            loop {
                if (cmpne:boolean(and:int(var_1_6E:int, ldc:int(32)), ldc:int(0))) {
                    var_1_6E = and:int(var_1_6E:int, ldc:int(-1413114957))
                    goto(Label_0445)
                }
                
                if (cmpne:boolean(and:int(var_1_6E:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_0389)
                }
                
                if (cmpne:boolean(and:int(var_1_6E:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_6E = and:int(var_1_6E:int, ldc:int(1204797255))
                    goto(Label_0327)
                }
                
                if (cmpne:boolean(and:int(var_1_6E:int, ldc:int(64)), ldc:int(0))) {
                    var_1_6E = and:int(var_1_6E:int, ldc:int(1898777748))
                }
                else {
                    var_1_6E = and:int(var_1_6E:int, ldc:int(-616284254))
                    invokestatic:Path(Files::createDirectories, var_5_BF:Path, newarray:FileAttribute[](java.nio.file.attribute.FileAttribute.class, and:int(ldc:int(5410), ldc:int(-5411))))
                }
                
                Label_0274:
                
                if (cmpne:boolean(and:int(var_1_6E:int, ldc:int(32)), ldc:int(0))) {
                    var_1_6E = and:int(var_1_6E:int, ldc:int(1387058143))
                    goto(Label_0445)
                }
                
                if (cmpne:boolean(and:int(var_1_6E:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0389)
                }
                
                if (cmpeq:boolean(and:int(var_1_6E:int, ldc:int(16777216)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_6E:int, ldc:int(4096)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_6E = and:int(var_1_6E:int, ldc:int(-30708935))
                    
                    if (getstatic:boolean(\u527a\u8bb0\ud12e\u3c25\u6fb0\u6435::\uc31c\ub8be\u52d3\u5fe1\uceb8\u7006)) {
                        looporswitchbreak()
                    }
                }
                
                Label_0327:
                
                if (cmpne:boolean(and:int(var_1_6E:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_6E = and:int(var_1_6E:int, ldc:int(-1905552356))
                    goto(Label_0445)
                }
                
                if (cmpeq:boolean(and:int(var_1_6E:int, ldc:int(16)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_6E:int, ldc:int(32)), ldc:int(0))) {
                        var_1_6E = and:int(var_1_6E:int, ldc:int(1734151262))
                        goto(Label_0274)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_6E:int, ldc:int(4096)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_6E = and:int(var_1_6E:int, ldc:int(-30225474))
                    
                    if (cmpeq:boolean(getstatic:FileSystemProvider(\u6435\u97e6\u51fa\ucfaf\uc3e3::\ub18d\ud171\ud7e8\ua562\u5fe1\u92ff), aconstnull:FileSystemProvider())) {
                        looporswitchbreak()
                    }
                }
                
                Label_0389:
                
                if (cmpne:boolean(and:int(var_1_6E:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_6E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0327)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_6E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_1_6E = and:int(var_1_6E:int, ldc:int(123363411))
                        goto(Label_0274)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_6E:int, ldc:int(512)), ldc:int(0))) {
                        var_1_6E = and:int(var_1_6E:int, ldc:int(-1302638176))
                        loopcontinue()
                    }
                    
                    var_1_6E = and:int(var_1_6E:int, ldc:int(-1134724299))
                }
                
                Label_0445:
                
                if (cmpne:boolean(and:int(var_1_6E:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_6E = and:int(var_1_6E:int, ldc:int(919587171))
                    goto(Label_0389)
                }
                
                if (cmpne:boolean(and:int(var_1_6E:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0327)
                }
                
                if (cmpne:boolean(and:int(var_1_6E:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0274)
                }
                
                if (cmpne:boolean(and:int(var_1_6E:int, ldc:int(64)), ldc:int(0))) {
                    var_1_6E = and:int(var_1_6E:int, ldc:int(-266857942))
                }
                else {
                    var_1_6E = and:int(var_1_6E:int, ldc:int(-1684972603))
                    var_6_219 = invokeinterface:Path(Path::resolve, var_5_BF:Path, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), var_4_A6:String), loadelement:String(getstatic:String[](\u6435\u97e6\u51fa\ucfaf\uc3e3::\u3e2a\uc229\u718f\ua6bd\u51fa\u4975), and:int(ldc:int(5164), ldc:int(19084))))))
                    Label_0539:
                    
                    if (cmpeq:boolean(and:int(var_1_6E:int, ldc:int(134217728)), ldc:int(0))) {
                        var_1_6E = and:int(var_1_6E:int, ldc:int(-718634698))
                        goto(Label_0931)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_6E:int, ldc:int(134217728)), ldc:int(0))) {
                        var_1_6E = and:int(var_1_6E:int, ldc:int(-1514871013))
                        goto(Label_0833)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_6E:int, ldc:int(134217728)), ldc:int(0))) {
                        var_1_6E = and:int(var_1_6E:int, ldc:int(-538831091))
                        var_7_26C = invokevirtual:FileSystem(FileSystemProvider::newFileSystem, getstatic:FileSystemProvider(\u6435\u97e6\u51fa\ucfaf\uc3e3::\ub18d\ud171\ud7e8\ua562\u5fe1\u92ff), var_6_219:Path, invokestatic:ImmutableMap[expected:Map<String, ?>](ImmutableMap::of, loadelement:String[expected:Object](getstatic:String[](\u6435\u97e6\u51fa\ucfaf\uc3e3::\u3e2a\uc229\u718f\ua6bd\u51fa\u4975), and:int(ldc:int(5133), ldc:int(8205))), loadelement:String[expected:Object](getstatic:String[](\u6435\u97e6\u51fa\ucfaf\uc3e3::\u3e2a\uc229\u718f\ua6bd\u51fa\u4975), and:int(ldc:int(62), ldc:int(15)))))
                        var_8_26F = aconstnull:Throwable()
                        
                        try {
                            invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\uc2bd\uff55\u4e72\u983f\ub8be\u6ec6, var_3_69:\u88c5\ud171\ub113\u6435\ud51e, invokevirtual:Path(FileSystem::getPath, var_7_26C:FileSystem, loadelement:String(getstatic:String[](\u6435\u97e6\u51fa\ucfaf\uc3e3::\u3e2a\uc229\u718f\ua6bd\u51fa\u4975), and:int(ldc:int(17839), ldc:int(2063))), newarray:String[](java.lang.String.class, and:int(ldc:int(17012), ldc:int(-21373)))))
                        }
                        catch (java.lang.Throwable var_9_2C1) {
                            var_8_26F = var_9_2C1:Throwable
                            athrow(var_9_2C1:Throwable)
                        }
                        finally {
                            if (cmpne:boolean(var_7_26C:FileSystem, aconstnull:FileSystem())) {
                                if (cmpne:boolean(var_8_26F:Throwable, aconstnull:Throwable())) {
                                    try {
                                        invokevirtual:void(FileSystem::close, var_7_26C:FileSystem)
                                    }
                                    catch (java.lang.Throwable var_11_2E6) {
                                        invokevirtual:void(Throwable::addSuppressed, var_8_26F:Throwable, var_11_2E6:Throwable)
                                    }
                                }
                                else {
                                    invokevirtual:void(FileSystem::close, var_7_26C:FileSystem)
                                }
                            }
                        }
                        
                        goto(Label_0833)
                    }
                    
                    goto(Label_0788)
                }
            }
            
            var_6_219 = invokeinterface:Path(Path::resolve, var_5_BF:Path, var_4_A6:String)
            Label_0788:
            
            if (cmpeq:boolean(and:int(var_1_6E:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0931)
            }
            
            if (cmpne:boolean(and:int(var_1_6E:int, ldc:int(1073741824)), ldc:int(0))) {
                var_1_6E = and:int(var_1_6E:int, ldc:int(483538635))
            }
            else {
                if (cmpeq:boolean(and:int(var_1_6E:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0539)
                }
                
                var_1_6E = and:int(var_1_6E:int, ldc:int(-79744229))
                invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\uc2bd\uff55\u4e72\u983f\ub8be\u6ec6, var_3_69:\u88c5\ud171\ub113\u6435\ud51e, var_6_219:Path)
            }
            
            Label_0833:
            
            if (cmpne:boolean(and:int(var_1_6E:int, ldc:int(32768)), ldc:int(0))) {
                var_1_6E = and:int(var_1_6E:int, ldc:int(-1817039817))
            }
            else {
                if (cmpeq:boolean(and:int(var_1_6E:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0788)
                }
                
                if (cmpeq:boolean(and:int(var_1_6E:int, ldc:int(256)), ldc:int(0))) {
                    var_1_6E = and:int(var_1_6E:int, ldc:int(266399121))
                    goto(Label_0539)
                }
                
                var_1_6E = and:int(var_1_6E:int, ldc:int(-1142729894))
                stack_396_1 = loadelement:String(getstatic:String[](\u6435\u97e6\u51fa\ucfaf\uc3e3::\u3e2a\uc229\u718f\ua6bd\u51fa\u4975), xor:int(ldc:int(9478), ldc:int(9494)))
                expr_388 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(1033), ldc:int(4887)))
                storeelement:Object(expr_388:Object[], and:int(ldc:int(-21198), ldc:int(21197)), var_4_A6:String[expected:Object])
                invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_396_1:String, expr_388:Object[]), and:int[expected:boolean](ldc:int(936), ldc:int(-31662)))
            }
            
            Label_0931:
            
            if (cmpne:boolean(and:int(var_1_6E:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0833)
            }
            
            if (cmpne:boolean(and:int(var_1_6E:int, ldc:int(1073741824)), ldc:int(0))) {
                var_1_6E = and:int(var_1_6E:int, ldc:int(-1580218718))
                goto(Label_0788)
            }
            
            if (cmpne:boolean(and:int(var_1_6E:int, ldc:int(16)), ldc:int(0))) {
                var_1_6E = and:int(var_1_6E:int, ldc:int(-1523090967))
                goto(Label_0539)
            }
            
            var_1_6E = and:int(var_1_6E:int, ldc:int(-1113567318))
            stack_3E0_0 = and:int(ldc:int(4771), ldc:int(17))
            var_1_6E = and:int(var_1_6E:int, ldc:int(-620845180))
            return:int(stack_3E0_0:int)
        }
        catch (java.io.IOException var_5_3E5) {
            do {
                if (cmpne:boolean(and:int(var_1_6E:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_6E = and:int(var_1_6E:int, ldc:int(-1425055827))
                }
                else {
                    var_1_6E = and:int(var_1_6E:int, ldc:int(-1193182420))
                    invokeinterface:void(Logger::error, getstatic:Logger(\u6435\u97e6\u51fa\ucfaf\uc3e3::\u839e\u120d\u8350\u183a\u927d\u3d4b), loadelement:String(getstatic:String[](\u6435\u97e6\u51fa\ucfaf\uc3e3::\u3e2a\uc229\u718f\ua6bd\u51fa\u4975), xor:int(ldc:int(99), ldc:int(114))), var_5_3E5:IOException[expected:Throwable])
                }
            } while (cmpeq:boolean(and:int(var_1_6E:int, ldc:int(256)), ldc:int(0)))
            
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\ub19c\u92ff\u760c\u759a\u946b\ucef1, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u6435\u97e6\u51fa\ucfaf\uc3e3::\u3e2a\uc229\u718f\ua6bd\u51fa\u4975), and:int(ldc:int(17458), ldc:int(12627)))))
            return:int(and:int(ldc:int(26801), ldc:int(-31730)))
        }
    }
    
    private static int lambda$\u6c52\ud523\uc3e3\u6c56\u12b2\u4975$4(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u6435\u97e6\u51fa\ucfaf\uc3e3::\uf995\u98a4\ubf56\u6d69\u7af6\u4975, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u9af2\u69d9\ubded\u8709\u516c\u7c6b$3(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u6435\u97e6\u51fa\ucfaf\uc3e3::\uc84e\uc84e\u4492\u64f2\u8d98\uf94d, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u7d52\u3bd6\u527a\u836c\uc7fe\uc3e3$2(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u6435\u97e6\u51fa\ucfaf\uc3e3::\u51fa\u183a\u927d\ud4fe\u3a62\uceb8, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\uceb8\ub113\u8cae\u97e6\u120d\u416d$1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, xor:int(ldc:int(1045), ldc:int(1046))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\ubcb0\u4f4a\u5db4\ua068\u98a4\u3711$0(java.nio.file.spi.FileSystemProvider p0) {
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
            return:boolean(invokevirtual:boolean(String::equalsIgnoreCase, invokevirtual:String(FileSystemProvider::getScheme, p0:FileSystemProvider), loadelement:String(getstatic:String[](\u6435\u97e6\u51fa\ucfaf\uc3e3::\u3e2a\uc229\u718f\ua6bd\u51fa\u4975), and:int(ldc:int(179), ldc:int(4119)))))
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
    
    public void \ua562\ub171\u5245\u62da\ud4fe\ubefe(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_696 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_6A1 : int
        
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
        var_3_696 = and:int(ldc:int(882573088), ldc:int(-1641317843))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6435\u97e6\u51fa\ucfaf\uc3e3[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(65536)), ldc:int(0))) {
            var_3_696 = and:int(var_3_696:int, ldc:int(2004867637))
            var_5_81 = and:int(ldc:int(-3930), ldc:int(3353))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(30860), ldc:int(-31376)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_696:int, ldc:int(-1295156419))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(641), ldc:int(10313)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(6371), ldc:int(521)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_696 = and:int(var_3_D1:int, ldc:int(1520268198))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(-31744), ldc:int(-31743)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-931878473))
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1951445078))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1657540180))
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(990536932))
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-272528157))
                    }
                    else {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1873257696))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(165978037))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1541664012))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1886745952))
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(532887571))
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1429242561))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1682155841))
                            var_11_E2 = and:int(ldc:int(-31786), ldc:int(23592))
                            goto(Label_1562)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0586:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1155143174))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(2034086980))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(808086015))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-505377632))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1771393511))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(859338542))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0720:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-433034853))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(792371813))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-453692613))
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(919310470))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-51315190))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-649375194))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0861:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(516310306))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(798862160))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1771685569))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-676946489))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(2054361605))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-46641672))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(2069820982))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(-16319), ldc:int(-16320))
                                goto(Label_1164)
                            }
                        }
                    }
                    
                    Label_1004:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1727864900))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1976671105))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-529520889))
                            goto(Label_0861)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1200441430))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(2115600098))
                        var_11_E2 = and:int(ldc:int(2586), ldc:int(-2587))
                    }
                    
                    Label_1164:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1657467214))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-280149554))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_1004)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1989620616))
                            goto(Label_0861)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1695584648))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(2037059260))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1337787851))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-767667343))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1434)
                            }
                        }
                    }
                    
                    Label_1307:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1164)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_1004)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-2120448175))
                            goto(Label_0861)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(110507993))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(763719227))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-575940625))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1562)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1434:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-676651077))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1289033674))
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(608137217))
                        loopcontinue()
                    }
                    
                    var_3_696 = and:int(var_3_696:int, ldc:int(-1801530587))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1562:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A1 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1573:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-915741834))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1656815166))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-2062268350))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-535322102))
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1584985056))
                        var_17_6A1 = add:int(var_16_110:int, xor:int(ldc:int(-12256), ldc:int(-12255)))
                        looporswitchbreak()
                    }
                }
                
                var_3_696 = and:int(var_3_696:int, ldc:int(-206578079))
                
                if (cmple:boolean(var_5_81 = var_17_6A1:int, sub:int(var_6_88:int, and:int(ldc:int(8515), ldc:int(45))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
