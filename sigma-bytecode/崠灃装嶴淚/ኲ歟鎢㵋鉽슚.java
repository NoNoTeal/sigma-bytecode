public class \u5d20\u7043\u88c5\u5db4\uf94d.\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a {
    public static \u5d20\u7043\u88c5\u5db4\uf94d.\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a \uf9c5\u927d\ud217\u6d99\u8709\uc4d2(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p0, it.unimi.dsi.fastutil.booleans.BooleanConsumer p1, com.mojang.datafixers.DataFixer p2, \u51fa\u12cb\u7330\u74b1\u6c52.\uae87\ub19c\u9937\u836c\u34df\ub8be p3, boolean p4) {
        var_5_68 : int
        var_7_6D : \u7d52\u51fa\u56bd\u76bc\u4975\ub113
        var_8_8E : \u6fb0\u6c56\ubf56\u7006\u965f\u7c6b
        var_9_91 : Throwable
        var_10_98 : \u960f\u76bc\u8c8a\u5654\u4c2b\u59ec
        var_10_F7 : Throwable
        var_15_11C : Throwable
        var_8_138 : Exception
        
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
        var_5_68 = and:int(and:int(ldc:int(265424690), ldc:int(-6304793)), ldc:int(-1617739781))
        var_7_6D = invokestatic:\u7d52\u51fa\u56bd\u76bc\u4975\ub113(\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f::\u4bc8\ub6ab\u97b7\u3e2a\uc9f6\u76bc)
        
        try {
            var_5_68 = and:int(var_5_68:int, ldc:int(-21095501))
            var_8_8E = invokevirtual:\u6fb0\u6c56\ubf56\u7006\u965f\u7c6b(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u600f\u88c5\u9033\ub18d\uc3e3\uc238, p0:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, var_7_6D:\u7d52\u51fa\u56bd\u76bc\u4975\ub113, invokedynamic:Function<\uae87\ub19c\u9937\u836c\u34df\ub8be, \u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf>(apply:()Ljava/util/function/Function;), invokedynamic:Function4(apply:()Lcom/mojang/datafixers/util/Function4;), and:int[expected:boolean](ldc:int(5637), ldc:int(-5776)), p3:\uae87\ub19c\u9937\u836c\u34df\ub8be)
            var_9_91 = aconstnull:Throwable()
            
            try {
                var_10_98 = invokevirtual:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u6fb0\u6c56\ubf56\u7006\u965f\u7c6b::\u3d4b\u8413\ud523\u6d99\u7873\u4f52, var_8_8E:\u6fb0\u6c56\ubf56\u7006\u965f\u7c6b)
                invokevirtual:void(\uae87\ub19c\u9937\u836c\u34df\ub8be::\u6435\u8bb0\ud217\u47c2\u12cb\ub70c, p3:\uae87\ub19c\u9937\u836c\u34df\ub8be, var_7_6D:\u7d52\u51fa\u56bd\u76bc\u4975\ub113[expected:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f], var_10_98:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec)
                return:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a(initobject:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::<init>, p1:BooleanConsumer, p2:DataFixer, p3:\uae87\ub19c\u9937\u836c\u34df\ub8be, invokeinterface:\ubded\u9033\u5654\u6198\uc29a\uc910(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\u527a\u8bb0\uceb8\u7e3f\u9937\ua61f, var_10_98:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec), p4:boolean, invokevirtual:ImmutableSet<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>>(\u7043\u40a9\u4975\u0800\u385b::\u3dd3\u4e72\u4daf\ub70c\u5f50\u8aa5, invokeinterface:\u7043\u40a9\u4975\u0800\u385b(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\ub32d\u446c\uf9c5\u3504\u4c04\u7ce1, var_10_98:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec))))
            }
            catch (java.lang.Throwable var_10_F7) {
                var_9_91 = var_10_F7:Throwable
                athrow(var_10_F7:Throwable)
            }
            finally {
                if (cmpne:boolean(var_8_8E:\u6fb0\u6c56\ubf56\u7006\u965f\u7c6b, aconstnull:\u6fb0\u6c56\ubf56\u7006\u965f\u7c6b())) {
                    if (cmpne:boolean(var_9_91:Throwable, aconstnull:Throwable())) {
                        try {
                            invokevirtual:void(\u6fb0\u6c56\ubf56\u7006\u965f\u7c6b::close, var_8_8E:\u6fb0\u6c56\ubf56\u7006\u965f\u7c6b)
                        }
                        catch (java.lang.Throwable var_15_11C) {
                            invokevirtual:void(Throwable::addSuppressed, var_9_91:Throwable, var_15_11C:Throwable)
                        }
                    }
                    else {
                        invokevirtual:void(\u6fb0\u6c56\ubf56\u7006\u965f\u7c6b::close, var_8_8E:\u6fb0\u6c56\ubf56\u7006\u965f\u7c6b)
                    }
                }
            }
        }
        catch (java.lang.Exception var_8_138) {
            invokeinterface:void(Logger::warn, getstatic:Logger(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\ub113\u36d3\ud4fe\ub8be\uf995\u0c95), loadelement:String(getstatic:String[](\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\ubb2b\u0b8e\uc2bd\u61a4\u446c\uc246), and:int(ldc:int(30235), ldc:int(-30236))), var_8_138:Exception[expected:Throwable])
            return:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a(aconstnull:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a())
        }
    }
    
    private void \u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a(it.unimi.dsi.fastutil.booleans.BooleanConsumer p0, com.mojang.datafixers.DataFixer p1, \u51fa\u12cb\u7330\u74b1\u6c52.\uae87\ub19c\u9937\u836c\u34df\ub8be p2, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\ubded\u9033\u5654\u6198\uc29a\uc910 p3, boolean p4, com.google.common.collect.ImmutableSet<\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c>> p5) {
        stack_88_1 : String [generated]
        expr_77 : Object[] [generated]
        
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
            stack_88_1 = loadelement:String(getstatic:String[](\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\ubb2b\u0b8e\uc2bd\u61a4\u446c\uc246), and:int(ldc:int(5649), ldc:int(26721)))
            expr_77 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(4899), ldc:int(9421)))
            storeelement:Object(expr_77:Object[], and:int(ldc:int(-16448), ldc:int(63)), invokevirtual:String[expected:Object](\ubded\u9033\u5654\u6198\uc29a\uc910::\u5d20\ube23\u98a4\uc2bd\u97e6\u7049, p3:\ubded\u9033\u5654\u6198\uc29a\uc910))
            invokespecial:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::<init>, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_88_1:String, expr_77:Object[]))
            putfield:BooleanConsumer(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\ub70c\u7006\u4e72\u4cd9\u76bc\u946b, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a, p0:BooleanConsumer)
            putfield:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\uf94d\u516c\u8413\u8640\u5245\u6bb9, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a, initobject:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::<init>, p2:\uae87\ub19c\u9937\u836c\u34df\ub8be, p1:DataFixer, p5:ImmutableSet<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>>, p4:boolean))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u72f1\u5f50\u51fa\ubcb0\u0b8e\uafe7() {
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
    
    public void \u759a\uc87f\u5140\ud36e\u12cb\ubcb0() {
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
            
            if (invokevirtual:boolean(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\ub7dc\u34df\u40a9\u494c\u67d0\ua6bd, getfield:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\uf94d\u516c\u8413\u8640\u5245\u6bb9, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a))) {
                invokeinterface:void(BooleanConsumer::accept, getfield:BooleanConsumer(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\ub70c\u7006\u4e72\u4cd9\u76bc\u946b, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a), xor:int[expected:boolean](ldc:int(2578), ldc:int(2579)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubf56\u64ab\u97e6\u7d52\ufe34\u6cfe() {
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
            invokeinterface:void(BooleanConsumer::accept, getfield:BooleanConsumer(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\ub70c\u7006\u4e72\u4cd9\u76bc\u946b, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a), and:int[expected:boolean](ldc:int(17488), ldc:int(-17489)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u760c\ud51e\u3e2a\uc910\uc7fe\u71ae() {
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
            invokevirtual:void(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\uc2bd\ub1b9\ubff1\uc238\u8350\u5db4, getfield:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\uf94d\u516c\u8413\u8640\u5245\u6bb9, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, float p3) {
        var_5_218 : int
        var_7_99 : int
        var_8_AF : int
        var_9_C0 : int
        var_10_C7 : int
        stack_17E_1 : \ucef1\u99f7\u4e72\u7873\u0800\u72f1 [generated]
        stack_174_1 : String [generated]
        expr_15E : Object[] [generated]
        stack_1BC_1 : \ucef1\u99f7\u4e72\u7873\u0800\u72f1 [generated]
        stack_1B2_1 : String [generated]
        expr_19C : Object[] [generated]
        stack_1FA_1 : \ucef1\u99f7\u4e72\u7873\u0800\u72f1 [generated]
        stack_1F0_1 : String [generated]
        expr_1DA : Object[] [generated]
        var_11_204 : int
        var_12_210 : UnmodifiableIterator
        var_13_2F1 : \u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>
        var_14_306 : int
        
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
            var_5_218 = and:int(ldc:int(191722274), ldc:int(596507362))
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u0a06\u12cb\u97b7\u4492\u1833\ubded, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a), getfield:ITextComponent(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\ud36e\uafe7\ubf56\uc229\u51b2\u8413, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a), div:int(getfield:int(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a), and:int(ldc:int(2), ldc:int(602))), ldc:int(20), ldc:int(16777215))
            var_7_99 = sub:int(div:int(getfield:int(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a), and:int(ldc:int(6163), ldc:int(802))), and:int(ldc:int(3031), ldc:int(4254)))
            var_8_AF = add:int(div:int(getfield:int(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a), xor:int(ldc:int(4194), ldc:int(4192))), and:int(ldc:int(4287), ldc:int(2262)))
            var_9_C0 = add:int(div:int(getfield:int(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\u6d69\ud12e\u4bc8\ubded\u120d\u0800, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a), and:int(ldc:int(7045), ldc:int(8244))), ldc:int(100))
            var_10_C7 = add:int(var_9_C0:int, ldc:int(10))
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a), invokevirtual:ITextComponent(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\u92ee\u624e\uafe7\u6d69\ub7dc\u4f4a, getfield:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\uf94d\u516c\u8413\u8640\u5245\u6bb9, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a)), div:int(getfield:int(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a), xor:int(ldc:int(339), ldc:int(337))), sub:int(sub:int(var_9_C0:int, ldc:int(9)), and:int(ldc:int(29266), ldc:int(2051))), ldc:int(10526880))
            
            if (cmpgt:boolean(invokevirtual:int(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\u7330\uf995\u8753\u5140\uf995\ud36e, getfield:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\uf94d\u516c\u8413\u8640\u5245\u6bb9, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a)), ldc:int(0))) {
                invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\uff55\u5245\uf995\u7049\u4179\u624e, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, sub:int(var_7_99:int, xor:int(ldc:int(291), ldc:int(290))), sub:int(var_9_C0:int, xor:int(ldc:int(-32704), ldc:int(-32703))), add:int(var_8_AF:int, xor:int(ldc:int(282), ldc:int(283))), add:int(var_10_C7:int, xor:int(ldc:boolean(0), ldc:boolean(1))), ldc:int(-16777216))
                stack_17E_1 = getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a)
                stack_174_1 = loadelement:String(getstatic:String[](\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\ubb2b\u0b8e\uc2bd\u61a4\u446c\uc246), and:int(ldc:int(2122), ldc:int(1026)))
                expr_15E = newarray:Object[](java.lang.Object.class, and:int(ldc:int(3713), ldc:int(265)))
                storeelement:Object(expr_15E:Object[], and:int(ldc:int(-11089), ldc:int(10832)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\ufe34\u72f1\u416d\ud171\u99f7\u5db4, getfield:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\uf94d\u516c\u8413\u8640\u5245\u6bb9, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a))))
                invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub32d\u3e75\uc7fe\u92ff\u9937\u5f50, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, stack_17E_1:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_174_1:String, expr_15E:Object[]), var_7_99:int, ldc:int(40), ldc:int(10526880))
                stack_1BC_1 = getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a)
                stack_1B2_1 = loadelement:String(getstatic:String[](\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\ubb2b\u0b8e\uc2bd\u61a4\u446c\uc246), and:int(ldc:int(1603), ldc:int(12555)))
                expr_19C = newarray:Object[](java.lang.Object.class, and:int(ldc:int(16481), ldc:int(12685)))
                storeelement:Object(expr_19C:Object[], and:int(ldc:int(-3411), ldc:int(3410)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\uc246\u88c5\u600f\uc246\u3e2a\u647c, getfield:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\uf94d\u516c\u8413\u8640\u5245\u6bb9, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a))))
                invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub32d\u3e75\uc7fe\u92ff\u9937\u5f50, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, stack_1BC_1:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_1B2_1:String, expr_19C:Object[]), var_7_99:int, ldc:int(52), ldc:int(10526880))
                stack_1FA_1 = getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a)
                stack_1F0_1 = loadelement:String(getstatic:String[](\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\ubb2b\u0b8e\uc2bd\u61a4\u446c\uc246), and:int(ldc:int(4470), ldc:int(1036)))
                expr_1DA = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(16720), ldc:int(16721)))
                storeelement:Object(expr_1DA:Object[], and:int(ldc:int(5429), ldc:int(-5438)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\u7330\uf995\u8753\u5140\uf995\ud36e, getfield:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\uf94d\u516c\u8413\u8640\u5245\u6bb9, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a))))
                invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub32d\u3e75\uc7fe\u92ff\u9937\u5f50, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, stack_1FA_1:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_1F0_1:String, expr_1DA:Object[]), var_7_99:int, ldc:int(64), ldc:int(10526880))
                var_11_204 = and:int(ldc:int(1728), ldc:int(-1729))
                var_12_210 = invokevirtual:UnmodifiableIterator(ImmutableSet::iterator, invokevirtual:ImmutableSet<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>>(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\u839e\u647c\u6198\ub7dc\u8d90\uc31c, getfield:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\uf94d\u516c\u8413\u8640\u5245\u6bb9, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a)))
                
                loop {
                    var_5_218 = and:int(var_5_218:int, ldc:int(1261287990))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_12_210:UnmodifiableIterator))) {
                        looporswitchbreak()
                    }
                    
                    var_13_2F1 = checkcast:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c>.class, invokeinterface:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(Iterator<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>>::next, var_12_210:Iterator<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>>))
                    var_14_306 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, mul:float(invokevirtual:float(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\ube23\ud217\u8350\uc3e3\u0a06\u6ec6, getfield:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\uf94d\u516c\u8413\u8640\u5245\u6bb9, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a), var_13_2F1:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>), i2f:float(sub:int(var_8_AF:int, var_7_99:int))))
                    invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\uff55\u5245\uf995\u7049\u4179\u624e, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, add:int(var_7_99:int, var_11_204:int), var_9_C0:int, add:int(add:int(var_7_99:int, var_11_204:int), var_14_306:int), var_10_C7:int, invokeinterface:int(Object2IntMap::getInt, getstatic:Object2IntMap<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>>(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\u36d3\u3d4b\u759a\u9255\u51b2\u446c), var_13_2F1:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>[expected:Object]))
                    var_11_204 = add:int(var_11_204:int, var_14_306:int)
                }
                
                var_5_218 = and:int(var_5_218:int, ldc:int(1607332598))
                invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), add:int(invokevirtual:int(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\ufe34\u72f1\u416d\ud171\u99f7\u5db4, getfield:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\uf94d\u516c\u8413\u8640\u5245\u6bb9, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a)), invokevirtual:int(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\uc246\u88c5\u600f\uc246\u3e2a\u647c, getfield:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\uf94d\u516c\u8413\u8640\u5245\u6bb9, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a)))), loadelement:String(getstatic:String[](\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\ubb2b\u0b8e\uc2bd\u61a4\u446c\uc246), xor:int(ldc:int(4102), ldc:int(4099)))), invokevirtual:int(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\u7330\uf995\u8753\u5140\uf995\ud36e, getfield:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\uf94d\u516c\u8413\u8640\u5245\u6bb9, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a)))), div:int(getfield:int(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a), xor:int(ldc:int(16640), ldc:int(16642))), add:int(add:int(var_9_C0:int, ldc:int(18)), xor:int(ldc:int(597), ldc:int(599))), ldc:int(10526880))
                invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, mul:float(invokevirtual:float(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\u759a\ub102\uae87\u4d85\uc29a\u416d, getfield:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\uf94d\u516c\u8413\u8640\u5245\u6bb9, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a)), ldc:float(100.0f)))), loadelement:String(getstatic:String[](\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\ubb2b\u0b8e\uc2bd\u61a4\u446c\uc246), xor:int(ldc:int(16403), ldc:int(16405))))), div:int(getfield:int(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a), and:int(ldc:int(38), ldc:int(8842))), sub:int(add:int(var_9_C0:int, div:int(sub:int(var_10_C7:int, var_9_C0:int), and:int(ldc:int(16650), ldc:int(2179)))), and:int(ldc:int(18444), ldc:int(12292))), ldc:int(10526880))
            }
            
            invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u120d\u72f1\u64f2\ud4fe\u7af6\u4f4a$1(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\uc2bd\ub1b9\ubff1\uc238\u8350\u5db4, getfield:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\uf94d\u516c\u8413\u8640\u5245\u6bb9, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a))
            invokeinterface:void(BooleanConsumer::accept, getfield:BooleanConsumer(\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a::\ub70c\u7006\u4e72\u4cd9\u76bc\u946b, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a), and:int[expected:boolean](ldc:int(16554), ldc:int(-16555)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u600f\u6ec6\u5f50\u8258\u600f\u7049$0(it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap p0) {
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
            invokevirtual:int(Object2IntOpenCustomHashMap::put, p0:Object2IntOpenCustomHashMap, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>[expected:Object](\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u071d\u5140\u600f\u4975\ufcaf\u624e), ldc:int(-13408734))
            invokevirtual:int(Object2IntOpenCustomHashMap::put, p0:Object2IntOpenCustomHashMap, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>[expected:Object](\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ubded\ub18d\u76bc\u8d98\u69d9\ucb79), ldc:int(-10075085))
            invokevirtual:int(Object2IntOpenCustomHashMap::put, p0:Object2IntOpenCustomHashMap, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>[expected:Object](\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u4d85\u120d\u5654\u9033\u446c\u4c2b), ldc:int(-8943531))
            invokevirtual:void(Object2IntOpenCustomHashMap::defaultReturnValue, p0:Object2IntOpenCustomHashMap, ldc:int(-2236963))
            return:void()
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
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_64E : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_659 : int
        
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
        var_3_64E = and:int(ldc:int(1628053612), ldc:int(2045747364))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u12b2\u6b5f\u93a2\u3d4b\u927d\uc29a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_64E = and:int(var_3_64E:int, ldc:int(1971268208))
            var_5_81 = and:int(ldc:int(-13420), ldc:int(9322))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-23373), ldc:int(6472)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_64E:int, ldc:int(-518823829))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(4741), ldc:int(24681)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(51), ldc:int(9925)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_64E = and:int(var_3_DA:int, ldc:int(-117118727))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(273), ldc:int(21515)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-478237306))
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1344)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(133456535))
                    }
                    else {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-272178961))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0393:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1791393223))
                        goto(Label_1344)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(145245932))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-606372262))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(613658709))
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1513750040))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1071540356))
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-938480795))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-1557058122))
                            var_11_EB = and:int(ldc:int(-18537), ldc:int(18536))
                            goto(Label_1499)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0586:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1217867490))
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1344)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1704876374))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1012763116))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-83120384))
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(859095384))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(1087859364))
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1516653393))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0729:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1696170519))
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1567531400))
                        goto(Label_1344)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1471649629))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-477746897))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0852:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1344)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(927745862))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(865808995))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(145), ldc:int(14849))
                                goto(Label_1101)
                            }
                        }
                    }
                    
                    Label_0950:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1344)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1901305115))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(1265270956))
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-642173221))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1909924215))
                        var_11_EB = and:int(ldc:int(-28407), ldc:int(25158))
                    }
                    
                    Label_1101:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(2073348482))
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1344)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(16)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-2141636548))
                            goto(Label_0950)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(512)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(593590894))
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-1062205988))
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-275322630))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1344)
                            }
                        }
                    }
                    
                    Label_1226:
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(32)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(890168680))
                            goto(Label_1101)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0950)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-703375129))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(512)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-1183614684))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1499)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1344:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-267445281))
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-446279696))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(848937423))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1171528970))
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(700505246))
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0393)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-197963194))
                        loopcontinue()
                    }
                    
                    var_3_64E = and:int(var_3_64E:int, ldc:int(1069431931))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1499:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_659 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1510:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1344)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1040647197))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1561443710))
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-685583944))
                        goto(Label_0393)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(2074587124))
                        var_17_659 = add:int(var_16_119:int, and:int(ldc:int(11785), ldc:int(129)))
                        looporswitchbreak()
                    }
                }
                
                var_3_64E = and:int(var_3_64E:int, ldc:int(-1146603539))
                
                if (cmple:boolean(var_5_81 = var_17_659:int, sub:int(var_6_88:int, xor:int(ldc:int(2241), ldc:int(2240))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_64E = and:int(var_3_64E:int, ldc:int(1329215439))
            goto(Label_0108)
        }
    }
}
