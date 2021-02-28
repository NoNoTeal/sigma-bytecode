public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u3504\u5bc4\u7ce1\u36d3\u71f1 {
    public void \u3504\u5bc4\u7ce1\u36d3\u71f1(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u3d4b\u9af2\u71f1\u67d0\u99f7 p1, long p2, boolean p3) {
        expr_6C : ITextComponent[] [generated]
        
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
            invokespecial:\u99f7\u7006\u6198\u47c2\ub1b9\u12cb(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::<init>, this:\u3504\u5bc4\u7ce1\u36d3\u71f1)
            expr_6C = newarray:ITextComponent[](net.minecraft.util.text.ITextComponent.class, and:int(ldc:int(8842), ldc:int(3126)))
            storeelement:ITextComponent(expr_6C:ITextComponent[], and:int(ldc:int(-28597), ldc:int(2992)), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u3504\u5bc4\u7ce1\u36d3\u71f1::\u624e\u6b5f\u3bd6\u9255\u183a\u52d3), and:int(ldc:int(-3096), ldc:int(3095)))))
            storeelement:ITextComponent(expr_6C:ITextComponent[], xor:int(ldc:int(329), ldc:int(328)), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u3504\u5bc4\u7ce1\u36d3\u71f1::\u624e\u6b5f\u3bd6\u9255\u183a\u52d3), xor:int(ldc:int(312), ldc:int(313)))))
            putfield:ITextComponent[](\u3504\u5bc4\u7ce1\u36d3\u71f1::\u3504\u7330\u4e72\uc3e3\uc229\ubff1, this:\u3504\u5bc4\u7ce1\u36d3\u71f1, expr_6C:ITextComponent[])
            putfield:List<Integer>(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u8df4\uc4d2\u9af2\u4ab3\u8753\ucfaf, this:\u3504\u5bc4\u7ce1\u36d3\u71f1, invokestatic:ArrayList[expected:List<Integer>](Lists::newArrayList))
            putfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u98a4\u8d98\u3c25\u446c\u12b2\u93a2, this:\u3504\u5bc4\u7ce1\u36d3\u71f1, p0:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006)
            putfield:\u3d4b\u9af2\u71f1\u67d0\u99f7(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u4c2b\u600f\u97e6\u071d\u647c\ua068, this:\u3504\u5bc4\u7ce1\u36d3\u71f1, p1:\u3d4b\u9af2\u71f1\u67d0\u99f7)
            putfield:long(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u64ab\u9033\u1833\u8640\u5654\u4f4a, this:\u3504\u5bc4\u7ce1\u36d3\u71f1, p2:long)
            putfield:ITextComponent(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u59ec\uf9c5\u8350\u5140\u5654\u5fe1, this:\u3504\u5bc4\u7ce1\u36d3\u71f1, ternaryop:TranslationTextComponent[expected:ITextComponent](p3:boolean, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u3504\u5bc4\u7ce1\u36d3\u71f1::\u624e\u6b5f\u3bd6\u9255\u183a\u52d3), xor:int(ldc:int(16832), ldc:int(16834)))), initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u3504\u5bc4\u7ce1\u36d3\u71f1::\u624e\u6b5f\u3bd6\u9255\u183a\u52d3), and:int(ldc:int(7171), ldc:int(25227))))))
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
    
    private void \u62da\ub70c\u416d\u6435\uc31c\ub18d() {
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
            putfield:int(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u120d\u839e\u1187\ud36e\ub18d\u4bc8, this:\u3504\u5bc4\u7ce1\u36d3\u71f1, add:int(getfield:int(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u120d\u839e\u1187\ud36e\ub18d\u4bc8, this:\u3504\u5bc4\u7ce1\u36d3\u71f1), xor:int(ldc:int(16992), ldc:int(16993))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, float p3) {
        var_5_A8 : int
        var_7_97 : int
        var_5_1C6 : int
        var_7_13A : Iterator<Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>>
        var_8_15F : Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>
        stack_343_0 : \u3504\u5bc4\u7ce1\u36d3\u71f1 [generated]
        stack_2D8_0 : \u3504\u5bc4\u7ce1\u36d3\u71f1 [generated]
        stack_343_1 : \uafe7\uc7fe\u4c04\u6b5f\u5bc4 [generated]
        stack_2D8_1 : \uafe7\uc7fe\u4c04\u6b5f\u5bc4 [generated]
        stack_343_2 : int [generated]
        stack_2D8_2 : int [generated]
        stack_343_3 : int [generated]
        stack_2D8_3 : int [generated]
        stack_343_4 : int [generated]
        stack_2D8_4 : int [generated]
        stack_343_5 : int [generated]
        stack_2D8_5 : int [generated]
        stack_343_6 : int [generated]
        stack_2D8_6 : int [generated]
        var_5_288 : int
        
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
            var_5_A8 = and:int(ldc:int(-1633507566), ldc:int(-687938102))
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u0a06\u12cb\u97b7\u4492\u1833\ubded, this:\u3504\u5bc4\u7ce1\u36d3\u71f1[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, this:\u3504\u5bc4\u7ce1\u36d3\u71f1[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u3504\u5bc4\u7ce1\u36d3\u71f1::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u3504\u5bc4\u7ce1\u36d3\u71f1), getfield:ITextComponent(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u59ec\uf9c5\u8350\u5140\u5654\u5fe1, this:\u3504\u5bc4\u7ce1\u36d3\u71f1), div:int(getfield:int(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u3504\u5bc4\u7ce1\u36d3\u71f1), and:int(ldc:int(10758), ldc:int(20546))), ldc:int(17), ldc:int(16777215))
            var_7_97 = and:int(ldc:int(3682), ldc:int(-12019))
            
            loop {
                if (cmpne:boolean(and:int(var_5_A8:int, ldc:int(32)), ldc:int(0))) {
                    var_5_A8 = and:int(var_5_A8:int, ldc:int(1627970332))
                }
                else {
                    var_5_A8 = and:int(var_5_A8:int, ldc:int(-1612204698))
                    
                    if (cmplt:boolean(var_7_97:int, arraylength:int(getfield:ITextComponent[](\u3504\u5bc4\u7ce1\u36d3\u71f1::\u3504\u7330\u4e72\uc3e3\uc229\ubff1, this:\u3504\u5bc4\u7ce1\u36d3\u71f1)))) {
                        invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u3504\u5bc4\u7ce1\u36d3\u71f1::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u3504\u5bc4\u7ce1\u36d3\u71f1), loadelement:ITextComponent(getfield:ITextComponent[](\u3504\u5bc4\u7ce1\u36d3\u71f1::\u3504\u7330\u4e72\uc3e3\uc229\ubff1, this:\u3504\u5bc4\u7ce1\u36d3\u71f1), var_7_97:int), div:int(getfield:int(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u3504\u5bc4\u7ce1\u36d3\u71f1), and:int(ldc:int(8418), ldc:int(1555))), add:int(add:int(invokestatic:int(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\ub6ab\u071d\u6cfe\u6c52\u5245\u6ec6, ldc:int(-1)), xor:int(ldc:int(-27642), ldc:int(-27643))), mul:int(var_7_97:int, ldc:int(12))), ldc:int(10526880))
                        inc:int(var_7_97, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_5_A8:int, ldc:int(4)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_5_A8 = and:int(var_5_A8:int, ldc:int(195218948))
            }
            
            var_5_1C6 = and:int(var_5_A8:int, ldc:int(-739050093))
            
            if (cmpne:boolean(getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab, this:\u3504\u5bc4\u7ce1\u36d3\u71f1), aconstnull:\ud12e\u946b\u97b7\u51b2\u3d64())) {
                var_7_13A = invokeinterface:Iterator<Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>>(Set<Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>>::iterator, invokeinterface:Set<Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>>(Map<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>::entrySet, getfield:Map<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>(\ud12e\u946b\u97b7\u51b2\u3d64::\u3776\ua61f\uc2e8\uc9f6\ubb2b\u4e72, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab, this:\u3504\u5bc4\u7ce1\u36d3\u71f1))))
                
                loop {
                    var_5_1C6 = and:int(var_5_1C6:int, ldc:int(-1633161941))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_7_13A:Iterator<Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>>))) {
                        looporswitchbreak()
                    }
                    
                    var_8_15F = checkcast:Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>(java.util.Map.Entry<java.lang.Integer, \u494c\u4975\ua068\u0c95\uc84e.\uc31c\ub19c\u3e75\u1833\u8c8a>.class, invokeinterface:Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>(Iterator<Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>>::next, var_7_13A:Iterator<Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>>))
                    
                    if (logicaland:boolean(cmpne:boolean(getfield:String(\uc31c\ub19c\u3e75\u1833\u8c8a::\u392e\u4ab3\u5f50\ub70c\u76bc\uc910, checkcast:\uc31c\ub19c\u3e75\u1833\u8c8a(\u494c\u4975\ua068\u0c95\uc84e.\uc31c\ub19c\u3e75\u1833\u8c8a.class, invokeinterface:\uc31c\ub19c\u3e75\u1833\u8c8a(Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>::getValue, var_8_15F:Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>))), aconstnull:String()), cmpne:boolean(getfield:long(\uc31c\ub19c\u3e75\u1833\u8c8a::\u51fa\u7330\u69d9\ua3b4\u9255\u3c25, checkcast:\uc31c\ub19c\u3e75\u1833\u8c8a(\u494c\u4975\ua068\u0c95\uc84e.\uc31c\ub19c\u3e75\u1833\u8c8a.class, invokeinterface:\uc31c\ub19c\u3e75\u1833\u8c8a(Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>::getValue, var_8_15F:Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>))), ldc:long(-1L)))) {
                        stack_343_0 = this:\u3504\u5bc4\u7ce1\u36d3\u71f1
                        stack_2D8_0 = this:\u3504\u5bc4\u7ce1\u36d3\u71f1
                        stack_343_1 = p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4
                        stack_2D8_1 = p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4
                        stack_343_2 = stack_2D8_2 = invokespecial(\u3504\u5bc4\u7ce1\u36d3\u71f1::\ubefe\u3504\u6ec6\u5654\ub171\uc87f, this, invokevirtual(Integer::intValue, checkcast(java.lang.Integer.class, invokeinterface(Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>::getKey, var_8_15F))))
                        stack_343_3 = stack_2D8_3 = add(invokestatic(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\ub6ab\u071d\u6cfe\u6c52\u5245\u6ec6, and(ldc(2437), ldc(3))), xor(ldc(12555), ldc(12558)))
                        stack_343_4 = p1:int
                        stack_2D8_4 = p1:int
                        stack_343_5 = p2:int
                        stack_2D8_5 = p2:int
                        
                        if (cmpne:boolean(getfield:int(\ud12e\u946b\u97b7\u51b2\u3d64::\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab, this:\u3504\u5bc4\u7ce1\u36d3\u71f1)), invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokeinterface:Integer(Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>::getKey, var_8_15F:Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>))))) {
                            goto(Label_0559)
                        }
                        
                        if (invokespecial:boolean(\u3504\u5bc4\u7ce1\u36d3\u71f1::\ub171\u156b\ub6ab\uf9c5\u12cb\u760c, this:\u3504\u5bc4\u7ce1\u36d3\u71f1)) {
                            goto(Label_0559)
                        }
                        
                        stack_343_6 = stack_2D8_6 = xor(ldc(8323), ldc(8322))
                        goto(Label_0622)
                    }
                    else {
                        var_5_1C6 = and:int(var_5_1C6:int, ldc:int(-671830170))
                        stack_343_0 = this:\u3504\u5bc4\u7ce1\u36d3\u71f1
                        stack_2D8_0 = this:\u3504\u5bc4\u7ce1\u36d3\u71f1
                        stack_343_1 = p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4
                        stack_2D8_1 = p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4
                        stack_343_2 = stack_2D8_2 = invokespecial(\u3504\u5bc4\u7ce1\u36d3\u71f1::\ubefe\u3504\u6ec6\u5654\ub171\uc87f, this, invokevirtual(Integer::intValue, checkcast(java.lang.Integer.class, invokeinterface(Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>::getKey, var_8_15F))))
                        stack_343_3 = stack_2D8_3 = add(invokestatic(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\ub6ab\u071d\u6cfe\u6c52\u5245\u6ec6, and(ldc(2083), ldc(29185))), and(ldc(10439), ldc(1085)))
                        stack_343_4 = p1:int
                        stack_2D8_4 = p1:int
                        stack_343_5 = p2:int
                        stack_2D8_5 = p2:int
                        
                        if (cmpeq:boolean(getfield:int(\ud12e\u946b\u97b7\u51b2\u3d64::\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab, this:\u3504\u5bc4\u7ce1\u36d3\u71f1)), invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokeinterface:Integer(Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>::getKey, var_8_15F:Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>))))) {
                            if (logicalnot:boolean(invokespecial:boolean(\u3504\u5bc4\u7ce1\u36d3\u71f1::\ub171\u156b\ub6ab\uf9c5\u12cb\u760c, this:\u3504\u5bc4\u7ce1\u36d3\u71f1))) {
                                stack_343_6 = stack_2D8_6 = xor(ldc(6657), ldc(6656))
                                goto(Label_0759)
                            }
                        }
                    }
                    
                    Label_0439:
                    
                    if (cmpeq:boolean(and:int(var_5_1C6:int, ldc:int(4)), ldc:int(0))) {
                        var_5_1C6 = and:int(var_5_1C6:int, ldc:int(-1075255530))
                        stack_343_6 = stack_2D8_6 = and(ldc(-14974), ldc(14436))
                        goto(Label_0759)
                    }
                    
                    Label_0559:
                    
                    if (cmpne:boolean(and:int(var_5_1C6:int, ldc:int(2048)), ldc:int(0))) {
                        var_5_1C6 = and:int(var_5_1C6:int, ldc:int(-1736067721))
                        goto(Label_0439)
                    }
                    
                    var_5_1C6 = and:int(var_5_1C6:int, ldc:int(-1214863638))
                    stack_343_6 = stack_2D8_6 = and(ldc(-15929), ldc(14904))
                    Label_0622:
                    
                    if (cmpeq:boolean(and:int(var_5_1C6:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_5_288 = and:int(var_5_1C6:int, ldc:int(-1684740305))
                        invokespecial:void(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u51b2\u0c95\u4e72\uc9f6\ub18d\u9af2, stack_2D8_0:\u3504\u5bc4\u7ce1\u36d3\u71f1, stack_2D8_1:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, stack_2D8_2:int, stack_2D8_3:int, stack_2D8_4:int, stack_2D8_5:int, stack_2D8_6:boolean, invokevirtual:String(\uc31c\ub19c\u3e75\u1833\u8c8a::\u4179\u6b0d\u51fa\uff55\u873d\u9af2, checkcast:\uc31c\ub19c\u3e75\u1833\u8c8a(\u494c\u4975\ua068\u0c95\uc84e.\uc31c\ub19c\u3e75\u1833\u8c8a.class, invokeinterface:\uc31c\ub19c\u3e75\u1833\u8c8a(Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>::getValue, var_8_15F:Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>)), invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokeinterface:Integer(Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>::getKey, var_8_15F:Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>)))), invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokeinterface:Integer(Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>::getKey, var_8_15F:Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>))), getfield:long(\uc31c\ub19c\u3e75\u1833\u8c8a::\u51fa\u7330\u69d9\ua3b4\u9255\u3c25, checkcast:\uc31c\ub19c\u3e75\u1833\u8c8a(\u494c\u4975\ua068\u0c95\uc84e.\uc31c\ub19c\u3e75\u1833\u8c8a.class, invokeinterface:\uc31c\ub19c\u3e75\u1833\u8c8a(Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>::getValue, var_8_15F:Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>))), getfield:String(\uc31c\ub19c\u3e75\u1833\u8c8a::\u392e\u4ab3\u5f50\ub70c\u76bc\uc910, checkcast:\uc31c\ub19c\u3e75\u1833\u8c8a(\u494c\u4975\ua068\u0c95\uc84e.\uc31c\ub19c\u3e75\u1833\u8c8a.class, invokeinterface:\uc31c\ub19c\u3e75\u1833\u8c8a(Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>::getValue, var_8_15F:Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>))), getfield:boolean(\uc31c\ub19c\u3e75\u1833\u8c8a::\uc29a\u8350\u8bb0\u4cd9\u51fa\u839e, checkcast:\uc31c\ub19c\u3e75\u1833\u8c8a(\u494c\u4975\ua068\u0c95\uc84e.\uc31c\ub19c\u3e75\u1833\u8c8a.class, invokeinterface:\uc31c\ub19c\u3e75\u1833\u8c8a(Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>::getValue, var_8_15F:Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>))))
                        goto(Label_0838)
                    }
                    
                    var_5_1C6 = and:int(var_5_1C6:int, ldc:int(296842817))
                    Label_0759:
                    
                    if (cmpne:boolean(and:int(var_5_1C6:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0622)
                    }
                    
                    var_5_288 = and:int(var_5_1C6:int, ldc:int(-137036429))
                    invokespecial:void(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u51b2\u0c95\u4e72\uc9f6\ub18d\u9af2, stack_343_0:\u3504\u5bc4\u7ce1\u36d3\u71f1, stack_343_1:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, stack_343_2:int, stack_343_3:int, stack_343_4:int, stack_343_5:int, stack_343_6:boolean, invokevirtual:String(\uc31c\ub19c\u3e75\u1833\u8c8a::\u4179\u6b0d\u51fa\uff55\u873d\u9af2, checkcast:\uc31c\ub19c\u3e75\u1833\u8c8a(\u494c\u4975\ua068\u0c95\uc84e.\uc31c\ub19c\u3e75\u1833\u8c8a.class, invokeinterface:\uc31c\ub19c\u3e75\u1833\u8c8a(Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>::getValue, var_8_15F:Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>)), invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokeinterface:Integer(Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>::getKey, var_8_15F:Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>)))), invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokeinterface:Integer(Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>::getKey, var_8_15F:Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>))), ldc:long(-1L), checkcast:String(java.lang.String.class, aconstnull:String()), getfield:boolean(\uc31c\ub19c\u3e75\u1833\u8c8a::\uc29a\u8350\u8bb0\u4cd9\u51fa\u839e, checkcast:\uc31c\ub19c\u3e75\u1833\u8c8a(\u494c\u4975\ua068\u0c95\uc84e.\uc31c\ub19c\u3e75\u1833\u8c8a.class, invokeinterface:\uc31c\ub19c\u3e75\u1833\u8c8a(Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>::getValue, var_8_15F:Entry<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>))))
                    Label_0838:
                    var_5_1C6 = and:int(var_5_288:int, ldc:int(-1147883654))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private int \ubefe\u3504\u6ec6\u5654\ub171\uc87f(int p0) {
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
            return:int(add:int(getfield:int(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u4cd9\u718f\ubcb0\u3c25\u0b8e\u0a06, this:\u3504\u5bc4\u7ce1\u36d3\u71f1), mul:int(sub:int(p0:int, and:int(ldc:int(3091), ldc:int(28961))), ldc:int(110))))
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
            invokevirtual:void(\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe::\u7bad\ub171\u61a4\ubff1\u6d69\u6cfe, getfield:\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u760c\u156b\u6435\u76bc\u9033\u392e, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u3504\u5bc4\u7ce1\u36d3\u71f1)), and:int[expected:boolean](ldc:int(3347), ldc:int(-7444)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc229\u3a62\u12cb\ud51e\uafe7\u8308(int p0, int p1, int p2) {
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
        
        if (cmpne:boolean(p0:int, and:int(ldc:int(10624), ldc:int(22290)))) {
            return:boolean(invokespecial:boolean(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc229\u3a62\u12cb\ud51e\uafe7\u8308, this:\u3504\u5bc4\u7ce1\u36d3\u71f1[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:int, p1:int, p2:int))
        }
        
        invokespecial:void(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u67e9\uc229\u8389\u4ab3\u67d0\u7c6b, this:\u3504\u5bc4\u7ce1\u36d3\u71f1)
        return:boolean(xor:int[expected:boolean](ldc:int(16448), ldc:int(16449)))
    }
    
    private void \u67e9\uc229\u8389\u4ab3\u67d0\u7c6b() {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u3504\u5bc4\u7ce1\u36d3\u71f1), getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u98a4\u8d98\u3c25\u446c\u12b2\u93a2, this:\u3504\u5bc4\u7ce1\u36d3\u71f1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u5f50\u6c52\u92ee\u62da\ubcb0\u8753(long p0) {
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
    
    public void \ub32d\uf94d\ub7dc\u4ab3\u5d20\u40a9() {
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
    
    private void \u4492\ub7dc\u7330\ud51e\u6b5f\u98a4(int p0) {
        var_2_67 : int
        var_4_6B : \u61a4\u8aa5\uff55\u718f\ub8be
        var_5_80 : \u99f7\u3dd3\ub7dc\u92ff\u64f2
        var_6_A1 : \u6fb0\u3d4b\u8d98\u1187\uf9c5
        var_5_D8 : \uae5d\u5654\uc910\ub18d\u7d52
        
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
            var_2_67 = and:int(and:int(ldc:int(1781683665), ldc:int(-805364309)), ldc:int(1807631833))
            var_4_6B = invokestatic:\u61a4\u8aa5\uff55\u718f\ub8be(\u61a4\u8aa5\uff55\u718f\ub8be::\u8350\ubf56\u4f52\u9937\u8350\ub83f)
            
            try {
                var_2_67 = and:int(var_2_67:int, ldc:int(-805597768))
                var_5_80 = invokevirtual:\u99f7\u3dd3\ub7dc\u92ff\u64f2(\u61a4\u8aa5\uff55\u718f\ub8be::\u8aa5\u67d0\u7c6b\u385b\ub6ab\u67d0, var_4_6B:\u61a4\u8aa5\uff55\u718f\ub8be, getfield:long(\ud12e\u946b\u97b7\u51b2\u3d64::\uc910\u7049\u4975\u97b7\u8c8a\u960f, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab, this:\u3504\u5bc4\u7ce1\u36d3\u71f1)), p0:int)
                var_2_67 = and:int(var_2_67:int, ldc:int(1572595680))
                var_6_A1 = initobject:\u6fb0\u3d4b\u8d98\u1187\uf9c5(\u6fb0\u3d4b\u8d98\u1187\uf9c5::<init>, this:\u3504\u5bc4\u7ce1\u36d3\u71f1[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], var_5_80:\u99f7\u3dd3\ub7dc\u92ff\u64f2, invokevirtual:String(\ud12e\u946b\u97b7\u51b2\u3d64::\uff55\u61a4\u3bd6\u983f\u516c\u6cfe, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab, this:\u3504\u5bc4\u7ce1\u36d3\u71f1), p0:int), invokedynamic:BooleanConsumer(accept:(L\u6ec6\ubb2b\uf94d\u6d99\u4f52/\u3504\u5bc4\u7ce1\u36d3\u71f1;I)Lit/unimi/dsi/fastutil/booleans/BooleanConsumer;, this:\u3504\u5bc4\u7ce1\u36d3\u71f1, p0:int))
                
                loop {
                    if (cmpeq:boolean(and:int(var_2_67:int, ldc:int(67108864)), ldc:int(0))) {
                        var_2_67 = and:int(var_2_67:int, ldc:int(1505367450))
                        invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u3504\u5bc4\u7ce1\u36d3\u71f1), var_6_A1:\u6fb0\u3d4b\u8d98\u1187\uf9c5[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
                    }
                    
                    if (cmpne:boolean(and:int(var_2_67:int, ldc:int(256)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_2_67 = and:int(var_2_67:int, ldc:int(-1131932421))
                }
                
                var_2_67 = and:int(var_2_67:int, ldc:int(1530087362))
            }
            catch (\u516c\u3d64\u718f\ub171\u6b5f.\uae5d\u5654\uc910\ub18d\u7d52 var_5_D8) {
                invokeinterface:void(Logger::error, getstatic:Logger(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u960f\uc4d2\u4e72\u965f\u4c2b\u4c04), loadelement:String(getstatic:String[](\u3504\u5bc4\u7ce1\u36d3\u71f1::\u624e\u6b5f\u3bd6\u9255\u183a\u52d3), xor:int(ldc:int(4440), ldc:int(4433))))
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u3504\u5bc4\u7ce1\u36d3\u71f1), initobject:\uf94d\u647c\uc7fe\u4bc8\u97e6[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\uf94d\u647c\uc7fe\u4bc8\u97e6::<init>, var_5_D8:\uae5d\u5654\uc910\ub18d\u7d52, this:\u3504\u5bc4\u7ce1\u36d3\u71f1[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006]))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private boolean \ub171\u156b\ub6ab\uf9c5\u12cb\u760c() {
        var_1_61 : int
        stack_9E_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-1557706214), ldc:int(829380407))
            
            if (logicaland:boolean(cmpne:boolean(getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab, this:\u3504\u5bc4\u7ce1\u36d3\u71f1), aconstnull:\ud12e\u946b\u97b7\u51b2\u3d64()), cmpeq:boolean(getfield:\u8c8a\ube23\ubb2b\u647c\uc84e(\ud12e\u946b\u97b7\u51b2\u3d64::\u8cae\u392e\u5fe1\u5140\u3dd3\u7006, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab, this:\u3504\u5bc4\u7ce1\u36d3\u71f1)), getstatic:\u8c8a\ube23\ubb2b\u647c\uc84e(\u8c8a\ube23\ubb2b\u647c\uc84e::\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a)))) {
                stack_9E_0 = xor:int(ldc:int(18466), ldc:int(18467))
            }
            else {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1318114975))
                stack_9E_0 = and:int(ldc:int(25699), ldc:int(-25716))
            }
            
            return:boolean(stack_9E_0:int)
        }
        
        goto(Label_0006)
    }
    
    private void \u51b2\u0c95\u4e72\uc9f6\ub18d\u9af2(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, int p3, int p4, boolean p5, java.lang.String p6, int p7, long p8, java.lang.String p9, boolean p10) {
        var_13_5B3 : int
        var_15_5F1 : float
        
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
            var_13_5B3 = and:int(ldc:int(1539638306), ldc:int(-852276341))
            
            if (p10:boolean) {
                invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u3504\u5bc4\u7ce1\u36d3\u71f1)), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9a18\ucb79\u3e75\u8d98\u983f::\u446c\ua6bd\u51b2\u494c\u6d69))
                goto(Label_0898)
            }
            
            Label_0106:
            
            if (cmpeq:boolean(and:int(var_13_5B3:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_1315)
            }
            
            if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_1155)
            }
            
            if (cmpeq:boolean(and:int(var_13_5B3:int, ldc:int(2147483647)), ldc:int(0))) {
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(1598858564))
                goto(Label_1027)
            }
            
            if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(67108864)), ldc:int(0))) {
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(-1788142317))
                goto(Label_0898)
            }
            
            if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(16)), ldc:int(0))) {
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(-504401620))
                goto(Label_0663)
            }
            
            if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(256)), ldc:int(0))) {
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(1586650192))
                goto(Label_0517)
            }
            
            if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0359)
            }
            
            if (cmpeq:boolean(and:int(var_13_5B3:int, ldc:int(67108864)), ldc:int(0))) {
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(1286196639))
                
                if (cmpne:boolean(p9:String, aconstnull:String())) {
                    if (cmpne:boolean(p8:long, ldc:long(-1L))) {
                        invokestatic:void(\u6cfe\u4f4a\u718f\u6b0d\u9af2::\u5db4\u873d\u6198\u8cae\u7006\u6435, invokestatic:String(String::valueOf, p8:long), p9:String)
                        goto(Label_0898)
                    }
                }
            }
            
            Label_0235:
            
            if (cmpeq:boolean(and:int(var_13_5B3:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_1315)
            }
            
            if (cmpeq:boolean(and:int(var_13_5B3:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_1155)
            }
            
            if (cmpeq:boolean(and:int(var_13_5B3:int, ldc:int(134217728)), ldc:int(0))) {
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(1694379603))
                goto(Label_1027)
            }
            
            if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0898)
            }
            
            if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0663)
            }
            
            if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(4096)), ldc:int(0))) {
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(1789799586))
                goto(Label_0517)
            }
            
            if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(64)), ldc:int(0))) {
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(-1215151550))
            }
            else {
                if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0106)
                }
                
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(1287077855))
                
                if (cmpeq:boolean(p7:int, and:int(ldc:int(16389), ldc:int(267)))) {
                    invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u3504\u5bc4\u7ce1\u36d3\u71f1)), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9a18\ucb79\u3e75\u8d98\u983f::\u72f1\u7006\u8bb0\u6d69\u5bc4))
                    goto(Label_0898)
                }
            }
            
            Label_0359:
            
            if (cmpeq:boolean(and:int(var_13_5B3:int, ldc:int(134217728)), ldc:int(0))) {
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(-681429680))
                goto(Label_1315)
            }
            
            if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_1155)
            }
            
            if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(536870912)), ldc:int(0))) {
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(852871916))
                goto(Label_1027)
            }
            
            if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(256)), ldc:int(0))) {
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(1422825802))
                goto(Label_0898)
            }
            
            if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0663)
            }
            
            if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(4096)), ldc:int(0))) {
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(-42479650))
            }
            else {
                if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(2048)), ldc:int(0))) {
                    var_13_5B3 = and:int(var_13_5B3:int, ldc:int(-2119983274))
                    goto(Label_0235)
                }
                
                if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(16)), ldc:int(0))) {
                    var_13_5B3 = and:int(var_13_5B3:int, ldc:int(-1039999655))
                    goto(Label_0106)
                }
                
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(-365176209))
                
                if (cmpeq:boolean(p7:int, xor:int(ldc:int(8725), ldc:int(8727)))) {
                    invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u3504\u5bc4\u7ce1\u36d3\u71f1)), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9a18\ucb79\u3e75\u8d98\u983f::\u8bb0\u6c52\u965f\u51b2\u7ce1))
                    goto(Label_0898)
                }
            }
            
            Label_0517:
            
            if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_1315)
            }
            
            if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(8192)), ldc:int(0))) {
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(1517602170))
                goto(Label_1155)
            }
            
            if (cmpeq:boolean(and:int(var_13_5B3:int, ldc:int(2)), ldc:int(0))) {
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(-725672172))
                goto(Label_1027)
            }
            
            if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0898)
            }
            
            if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(64)), ldc:int(0))) {
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(-150050012))
            }
            else {
                if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(4096)), ldc:int(0))) {
                    var_13_5B3 = and:int(var_13_5B3:int, ldc:int(-276661190))
                    goto(Label_0359)
                }
                
                if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0235)
                }
                
                if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(256)), ldc:int(0))) {
                    var_13_5B3 = and:int(var_13_5B3:int, ldc:int(-1921156357))
                    goto(Label_0106)
                }
                
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(-128216929))
                
                if (cmpeq:boolean(p7:int, and:int(ldc:int(1555), ldc:int(12295)))) {
                    invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u3504\u5bc4\u7ce1\u36d3\u71f1)), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9a18\ucb79\u3e75\u8d98\u983f::\u4f4a\ud158\u67e9\ub70c\u3e75))
                    goto(Label_0898)
                }
            }
            
            Label_0663:
            
            if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(1)), ldc:int(0))) {
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(-753965277))
                goto(Label_1315)
            }
            
            if (cmpeq:boolean(and:int(var_13_5B3:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_1155)
            }
            
            if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_1027)
            }
            
            if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(16)), ldc:int(0))) {
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(-80661968))
            }
            else {
                if (cmpeq:boolean(and:int(var_13_5B3:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0517)
                }
                
                if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0359)
                }
                
                if (cmpeq:boolean(and:int(var_13_5B3:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0235)
                }
                
                if (cmpeq:boolean(and:int(var_13_5B3:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0106)
                }
                
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(2126501603))
                invokestatic:void(\u6cfe\u4f4a\u718f\u6b0d\u9af2::\u5db4\u873d\u6198\u8cae\u7006\u6435, invokestatic:String(String::valueOf, getfield:int(\ud12e\u946b\u97b7\u51b2\u3d64::\u4d85\ucef1\u8640\ub102\u5db4\u64ab, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab, this:\u3504\u5bc4\u7ce1\u36d3\u71f1))), getfield:String(\ud12e\u946b\u97b7\u51b2\u3d64::\u97e6\u98a4\ubded\u527a\u836c\u4975, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab, this:\u3504\u5bc4\u7ce1\u36d3\u71f1)))
            }
            
            Label_0898:
            
            if (cmpeq:boolean(and:int(var_13_5B3:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_1315)
            }
            
            if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(512)), ldc:int(0))) {
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(1829662574))
                goto(Label_1155)
            }
            
            if (cmpeq:boolean(and:int(var_13_5B3:int, ldc:int(256)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_13_5B3:int, ldc:int(134217728)), ldc:int(0))) {
                    var_13_5B3 = and:int(var_13_5B3:int, ldc:int(1284297172))
                    goto(Label_0663)
                }
                
                if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(67108864)), ldc:int(0))) {
                    var_13_5B3 = and:int(var_13_5B3:int, ldc:int(2114424876))
                    goto(Label_0517)
                }
                
                if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0359)
                }
                
                if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(536870912)), ldc:int(0))) {
                    var_13_5B3 = and:int(var_13_5B3:int, ldc:int(1835030096))
                    goto(Label_0235)
                }
                
                if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_0106)
                }
                
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(-40116221))
                
                if (logicalnot:boolean(p5:boolean)) {
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, ldc:float(0.56f), ldc:float(0.56f), ldc:float(0.56f), ldc:float(1.0f))
                    goto(Label_1155)
                }
            }
            
            Label_1027:
            
            if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(64)), ldc:int(0))) {
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(528664154))
                goto(Label_1315)
            }
            
            if (cmpeq:boolean(and:int(var_13_5B3:int, ldc:int(512)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_13_5B3:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0898)
                }
                
                if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0663)
                }
                
                if (cmpeq:boolean(and:int(var_13_5B3:int, ldc:int(134217728)), ldc:int(0))) {
                    var_13_5B3 = and:int(var_13_5B3:int, ldc:int(627452874))
                    goto(Label_0517)
                }
                
                if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(536870912)), ldc:int(0))) {
                    var_13_5B3 = and:int(var_13_5B3:int, ldc:int(1061835806))
                    goto(Label_0359)
                }
                
                if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(8192)), ldc:int(0))) {
                    var_13_5B3 = and:int(var_13_5B3:int, ldc:int(1298737161))
                    goto(Label_0235)
                }
                
                if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0106)
                }
                
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(-603209786))
                
                if (p5:boolean) {
                    var_15_5F1 = add:float(ldc:float(0.9f), mul:float(ldc:float(0.1f), invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u88c5\u7ce1\u4ab3\u8350\uae87\u62da, mul:float(i2f:float(getfield:int(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u120d\u839e\u1187\ud36e\ub18d\u4bc8, this:\u3504\u5bc4\u7ce1\u36d3\u71f1)), ldc:float(0.2f)))))
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, var_15_5F1:float, var_15_5F1:float, var_15_5F1:float, ldc:float(1.0f))
                }
            }
            
            Label_1155:
            
            if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(65536)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_1027)
                }
                
                if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0898)
                }
                
                if (cmpeq:boolean(and:int(var_13_5B3:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0663)
                }
                
                if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(8192)), ldc:int(0))) {
                    var_13_5B3 = and:int(var_13_5B3:int, ldc:int(94765958))
                    goto(Label_0517)
                }
                
                if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(67108864)), ldc:int(0))) {
                    var_13_5B3 = and:int(var_13_5B3:int, ldc:int(1858940352))
                    goto(Label_0359)
                }
                
                if (cmpeq:boolean(and:int(var_13_5B3:int, ldc:int(2)), ldc:int(0))) {
                    var_13_5B3 = and:int(var_13_5B3:int, ldc:int(-2009523380))
                    goto(Label_0235)
                }
                
                if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0106)
                }
                
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(1853197430))
                invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, add:int(p1:int, and:int(ldc:int(18587), ldc:int(8515))), add:int(p2:int, xor:int(ldc:int(2688), ldc:int(2691))), ldc:float(0.0f), ldc:float(0.0f), ldc:int(74), ldc:int(74), ldc:int(74), ldc:int(74))
                invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u3504\u5bc4\u7ce1\u36d3\u71f1)), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9a18\ucb79\u3e75\u8d98\u983f::\u1187\u3d64\u7330\u836c\u7330))
                
                if (p5:boolean) {
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f))
                    goto(Label_1547)
                }
            }
            
            Label_1315:
            
            if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(1)), ldc:int(0))) {
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(-637296024))
                goto(Label_1155)
            }
            
            if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(131072)), ldc:int(0))) {
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(-391121789))
                goto(Label_1027)
            }
            
            if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(1)), ldc:int(0))) {
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(187247932))
                goto(Label_0898)
            }
            
            if (cmpeq:boolean(and:int(var_13_5B3:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0663)
            }
            
            if (cmpeq:boolean(and:int(var_13_5B3:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0517)
            }
            
            if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(131072)), ldc:int(0))) {
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(783527264))
                goto(Label_0359)
            }
            
            if (cmpne:boolean(and:int(var_13_5B3:int, ldc:int(2048)), ldc:int(0))) {
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(-841731527))
                goto(Label_0235)
            }
            
            if (cmpeq:boolean(and:int(var_13_5B3:int, ldc:int(2147483647)), ldc:int(0))) {
                var_13_5B3 = and:int(var_13_5B3:int, ldc:int(-1215198866))
                goto(Label_0106)
            }
            
            var_13_5B3 = and:int(var_13_5B3:int, ldc:int(-911104162))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, ldc:float(0.56f), ldc:float(0.56f), ldc:float(0.56f), ldc:float(1.0f))
            Label_1547:
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, ldc:float(0.0f), ldc:float(0.0f), ldc:int(80), ldc:int(80), ldc:int(80), ldc:int(80))
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u3504\u5bc4\u7ce1\u36d3\u71f1::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u3504\u5bc4\u7ce1\u36d3\u71f1), p6:String, add:int(p1:int, ldc:int(40)), add:int(p2:int, ldc:int(66)), ldc:int(16777215))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u62da\u6cfe\ud523\u8df4\u4179\u6c52$11(int p0, boolean p1) {
        var_3_61 : int
        
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
            var_3_61 = and:int(ldc:int(1514263148), ldc:int(1496143597))
            
            if (logicalnot:boolean(p1:boolean)) {
                var_3_61 = and:int(var_3_61:int, ldc:int(1795670714))
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u3504\u5bc4\u7ce1\u36d3\u71f1), this:\u3504\u5bc4\u7ce1\u36d3\u71f1[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            }
            else {
                invokeinterface:boolean(List<Integer>::add, getfield:List<Integer>(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u8df4\uc4d2\u9af2\u4ab3\u8753\ucfaf, this:\u3504\u5bc4\u7ce1\u36d3\u71f1), invokestatic:Integer(Integer::valueOf, p0:int))
                invokeinterface:void(List<E>::clear, getfield:List<\u3e75\ub8be\u88c5\ub7dc\uc246\u8753>(\u3504\u5bc4\u7ce1\u36d3\u71f1::\uc31c\u59ec\u600f\ub83f\uc87f\u9033, this:\u3504\u5bc4\u7ce1\u36d3\u71f1))
                invokespecial:void(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u62da\ub70c\u416d\u6435\uc31c\ub18d, this:\u3504\u5bc4\u7ce1\u36d3\u71f1)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u8cae\u4179\u5db4\u0a06\ubded\u7bad$10() {
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
    
    private void lambda$\u718f\u6435\u6c52\uc246\u92ee\u4c2b$9() {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u3504\u5bc4\u7ce1\u36d3\u71f1), getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u98a4\u8d98\u3c25\u446c\u12b2\u93a2, this:\u3504\u5bc4\u7ce1\u36d3\u71f1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u3711\ud158\u4c2b\u8df4\u4f4a\ufe34$8() {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u3504\u5bc4\u7ce1\u36d3\u71f1), initobject:\u6c52\u93a2\u8709\ub102\u4bc8[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u6c52\u93a2\u8709\ub102\u4bc8::<init>, this:\u3504\u5bc4\u7ce1\u36d3\u71f1[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], initobject:\uc9f6\u6bb9\uc7fe\u12cb\ub1b9\u494c[expected:\u9033\u4179\ube23\u5f50\ucfaf](\uc9f6\u6bb9\uc7fe\u12cb\ub1b9\u494c::<init>, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab, this:\u3504\u5bc4\u7ce1\u36d3\u71f1), this:\u3504\u5bc4\u7ce1\u36d3\u71f1[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], getfield:\u3d4b\u9af2\u71f1\u67d0\u99f7(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u4c2b\u600f\u97e6\u071d\u647c\ua068, this:\u3504\u5bc4\u7ce1\u36d3\u71f1), and:int[expected:boolean](ldc:int(2053), ldc:int(16401)))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u6bb9\u12b2\u6435\u960f\uc84e\u5fe1$7(long p0) {
        var_3_115 : int
        var_5_6B : \u61a4\u8aa5\uff55\u718f\ub8be
        var_3_E2 : int
        var_6_D4 : \uae5d\u5654\uc910\ub18d\u7d52
        
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
            var_3_115 = and:int(and:int(ldc:int(-1804228893), ldc:int(-1940282653)), ldc:int(-277501973))
            var_5_6B = invokestatic:\u61a4\u8aa5\uff55\u718f\ub8be(\u61a4\u8aa5\uff55\u718f\ub8be::\u8350\ubf56\u4f52\u9937\u8350\ub83f)
            
            try {
                loop {
                    if (cmpne:boolean(and:int(var_3_115:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0174)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_115:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_115 = and:int(var_3_115:int, ldc:int(-961077677))
                    }
                    else {
                        var_3_115 = and:int(var_3_115:int, ldc:int(-950534189))
                        putfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab, this:\u3504\u5bc4\u7ce1\u36d3\u71f1, invokevirtual:\ud12e\u946b\u97b7\u51b2\u3d64(\u61a4\u8aa5\uff55\u718f\ub8be::\u6d69\ub1b9\u93a2\u624e\u416d\u51fa, var_5_6B:\u61a4\u8aa5\uff55\u718f\ub8be, p0:long))
                    }
                    
                    Label_0150:
                    
                    if (cmpne:boolean(and:int(var_3_115:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_115:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_115 = and:int(var_3_115:int, ldc:int(-1602243961))
                        invokespecial:void(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u62da\ub70c\u416d\u6435\uc31c\ub18d, this:\u3504\u5bc4\u7ce1\u36d3\u71f1)
                    }
                    
                    Label_0174:
                    
                    if (cmpeq:boolean(and:int(var_3_115:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_115 = and:int(var_3_115:int, ldc:int(763627185))
                        goto(Label_0150)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_115:int, ldc:int(4194304)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_3_115 = and:int(var_3_115:int, ldc:int(-461918285))
            }
            catch (\u516c\u3d64\u718f\ub171\u6b5f.\uae5d\u5654\uc910\ub18d\u7d52 var_6_D4) {
                loop {
                    if (cmpeq:boolean(and:int(var_3_115:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_E2 = and:int(var_3_115:int, ldc:int(-1044290051))
                    }
                    else {
                        var_3_E2 = and:int(var_3_115:int, ldc:int(-506333441))
                        invokeinterface:void(Logger::error, getstatic:Logger(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u960f\uc4d2\u4e72\u965f\u4c2b\u4c04), loadelement:String(getstatic:String[](\u3504\u5bc4\u7ce1\u36d3\u71f1::\u624e\u6b5f\u3bd6\u9255\u183a\u52d3), xor:int(ldc:int(9283), ldc:int(9289))))
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_E2:int, ldc:int(16384)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_3_115 = and:int(var_3_E2:int, ldc:int(-512725677))
                }
                
                var_3_115 = and:int(var_3_E2:int, ldc:int(-1703428177))
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u3504\u5bc4\u7ce1\u36d3\u71f1), initobject:\uf94d\u647c\uc7fe\u4bc8\u97e6[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\uf94d\u647c\uc7fe\u4bc8\u97e6::<init>, invokestatic:ITextComponent(ITextComponent::func_244388_a, invokevirtual:String(Throwable::getMessage, var_6_D4:\uae5d\u5654\uc910\ub18d\u7d52[expected:Throwable])), getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u98a4\u8d98\u3c25\u446c\u12b2\u93a2, this:\u3504\u5bc4\u7ce1\u36d3\u71f1)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u4d85\u760c\u3bd6\u759a\u36d3\u7af6$6(int p0, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p1) {
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
    
    private void lambda$\u120d\u5db4\ucef1\u0b8e\ufcaf\ud523$5() {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u3504\u5bc4\u7ce1\u36d3\u71f1), this:\u3504\u5bc4\u7ce1\u36d3\u71f1[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            invokevirtual:void(\u3504\u5bc4\u7ce1\u36d3\u71f1::\ub32d\uf94d\ub7dc\u4ab3\u5d20\u40a9, this:\u3504\u5bc4\u7ce1\u36d3\u71f1)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u92ff\u8640\u7043\u4492\u839e\u6435$4(int p0, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p1) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u3504\u5bc4\u7ce1\u36d3\u71f1), initobject:\u1833\u4f4a\u64f2\uc910\u5d20[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u1833\u4f4a\u64f2\uc910\u5d20::<init>, invokedynamic:BooleanConsumer(accept:(L\u6ec6\ubb2b\uf94d\u6d99\u4f52/\u3504\u5bc4\u7ce1\u36d3\u71f1;I)Lit/unimi/dsi/fastutil/booleans/BooleanConsumer;, this:\u3504\u5bc4\u7ce1\u36d3\u71f1, p0:int), getstatic:\u5654\u7e3f\u3bd6\u6435\ua068(\u5654\u7e3f\u3bd6\u6435\ua068::\u516c\u8aa5\u8df4\u71f1\u8258\u4d85), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u3504\u5bc4\u7ce1\u36d3\u71f1::\u624e\u6b5f\u3bd6\u9255\u183a\u52d3), and:int(ldc:int(4111), ldc:int(8219)))), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u3504\u5bc4\u7ce1\u36d3\u71f1::\u624e\u6b5f\u3bd6\u9255\u183a\u52d3), xor:int(ldc:int(-22492), ldc:int(-22488)))), and:int[expected:boolean](ldc:int(2113), ldc:int(385))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2$3(int p0, boolean p1) {
        var_3_61 : int
        
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
            var_3_61 = and:int(ldc:int(-1689330498), ldc:int(-1151348737))
            
            if (logicalnot:boolean(p1:boolean)) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-813837059))
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u3504\u5bc4\u7ce1\u36d3\u71f1), this:\u3504\u5bc4\u7ce1\u36d3\u71f1[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            }
            else {
                invokespecial:void(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u4492\ub7dc\u7330\ud51e\u6b5f\u98a4, this:\u3504\u5bc4\u7ce1\u36d3\u71f1, p0:int)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u6fb0\u4e72\ubf56\u6ec6\u8bb0\u3776$2(int p0, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p1) {
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
    
    private void lambda$\u3c25\u7bad\u47c2\u6435\u6c52\u624e$1() {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u3504\u5bc4\u7ce1\u36d3\u71f1), this:\u3504\u5bc4\u7ce1\u36d3\u71f1[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            invokevirtual:void(\u3504\u5bc4\u7ce1\u36d3\u71f1::\ub32d\uf94d\ub7dc\u4ab3\u5d20\u40a9, this:\u3504\u5bc4\u7ce1\u36d3\u71f1)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u446c\uc238\u6fb0\u6435\u839e\u3e75$0(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokespecial:void(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u67e9\uc229\u8389\u4ab3\u67d0\u7c6b, this:\u3504\u5bc4\u7ce1\u36d3\u71f1)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_38D : int
        expr_6E : int [generated]
        stack_AE_0 : byte[] [generated]
        stack_B0_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_E0_0 : byte[] [generated]
        stack_119_0 : byte[] [generated]
        stack_11B_0 : byte[] [generated]
        stack_151_0 : byte[] [generated]
        stack_351_0 : byte[] [generated]
        stack_3A0_0 : byte[] [generated]
        stack_41B_0 : byte[] [generated]
        stack_471_0 : byte[] [generated]
        var_4_332 : int
        var_3_337 : byte[]
        var_5_338 : int
        var_0_3BA : int
        expr_3A0 : byte [generated]
        stack_3E9_2 : byte [generated]
        stack_3BD_0 : byte [generated]
        expr_B0 : int [generated]
        var_2_DE : byte[]
        expr_E2 : int [generated]
        var_3_409 : byte[]
        var_5_40A : int
        expr_11B : int [generated]
        var_3_45F : byte[]
        var_5_460 : int
        expr_474 : byte [generated]
        var_3_15D : String
        stack_325_0 : String[] [generated]
        expr_16F : String[] [generated]
        
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
        var_0_38D = and:int(ldc:int(-892342614), ldc:int(-260342213))
        expr_6E = arraylength:int(stack_AE_0 = stack_B0_0 = stack_DE_0 = stack_E0_0 = stack_119_0 = stack_11B_0 = stack_151_0 = stack_351_0 = stack_3A0_0 = stack_41B_0 = stack_471_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Uo8YF0SaTZS36bRok2WWTJGRkonvz27okDH5aOrvGBdEmkzpiGiUl5tgbJxukonhaO8TdegQag/qZJ6REWngz28XELRok2VoFmmTdegQag/qZJ6REWngz28XELRok2Vs7eqRE5N16BBqD+pknpERaeDL5BEePpdvYsIXk+02/pYTae3oEGoP6mSekRFp4MvkER4+l29iwheT7TV+lhNqbegQag/qZJ6REWngy+ITawuUaeqUzhJoEYjuke8T9egQag/qZJ6REWngyWiS6zLt6ZXN6BBqD+pknpERaeDIbBEVD5Roa5NN6BBqD+pknpERaeDPauiRiO6R7xP1amjsjWxtGpKU92rpEYngyGwRFbLpF2tF6u+QtGiTZZd3lpAWNhZrautO62htNv6WE2ntamjsjWxtGpKU92rpEYngyGwRFbLpF2tF6u+QtGiTZZd3lpAWNhZrautO62htNX6WE2ptamjsjWxtGpKU92rpEYngyOse7bBv7fHrFe2zbeiTTWpo7I1sbRqSlPdq6RGJ4MjrHu2wb+3x6xXtss0VmWW1YOto7pHvE/VoFZcPF+vNm+kRieDIbBEVD5PPFmhpiOLUIFTU")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_332 = expr_6E:int
        var_3_337 = newarray:byte[](byte.class, expr_6E:int)
        var_5_338 = expr_6E:int
        Label_0826:
        
        while (cmpeq:boolean(and:int(var_0_38D:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_38D = and:int(var_0_38D:int, ldc:int(-799347090))
            var_5_338 = add:int(var_5_338:int, ldc:int(-1))
            storeelement:byte(var_3_337:byte[], var_5_338:int, xor:byte(loadelement:byte(stack_351_0:byte[], var_5_338:int), ldc:byte(104)))
            
            if (cmpne:boolean(var_5_338:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B0_0 = stack_AE_0 = stack_DE_0 = stack_E0_0 = stack_119_0 = stack_11B_0 = stack_151_0 = stack_351_0 = stack_3A0_0 = stack_41B_0 = stack_471_0 = var_3_337:byte[]
            goto(Label_0115)
        }
        
        Label_0896:
        
        while (cmpne:boolean(and:int(var_0_38D:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_3BA = and:int(var_0_38D:int, ldc:int(-253298962))
            var_5_338 = add:int(var_5_338:int, ldc:int(-1))
            expr_3A0 = stack_3E9_2 = loadelement(stack_3A0_0, var_5_338)
            
            if (cmplt:boolean(add:int(add:int(var_5_338:int, ldc:int(4)), neg:int(var_4_332:int)), ldc:int(0))) {
                stack_3E9_2 = stack_3BD_0 = add:byte(expr_3A0:byte, loadelement:byte(var_3_337:byte[], add:int(var_5_338:int, ldc:int(4))))
                goto(Label_0973)
            }
            
            Label_0941:
            
            if (cmpeq:boolean(and:int(var_0_3BA:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_3BA = and:int(var_0_3BA:int, ldc:int(-1302137222))
                stack_3E9_2 = stack_3BD_0 = add:byte(expr_3A0:byte, ldc:byte(4))
            }
            
            Label_0973:
            
            if (cmpeq:boolean(and:int(var_0_3BA:int, ldc:int(2)), ldc:int(0))) {
                var_0_3BA = and:int(var_0_3BA:int, ldc:int(2091678081))
                goto(Label_0941)
            }
            
            var_0_38D = and:int(var_0_3BA:int, ldc:int(-1815648594))
            storeelement:byte(var_3_337:byte[], var_5_338:int, stack_3E9_2:byte)
            
            if (cmpne:boolean(var_5_338:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B0_0 = stack_AE_0 = stack_DE_0 = stack_E0_0 = stack_119_0 = stack_11B_0 = stack_151_0 = stack_351_0 = stack_3A0_0 = stack_41B_0 = stack_471_0 = var_3_337:byte[]
            goto(Label_0181)
        }
        
        var_0_38D = and:int(var_0_38D:int, ldc:int(965318098))
        goto(Label_0826)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_38D:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_38D = and:int(var_0_38D:int, ldc:int(198645803))
            goto(Label_0288)
        }
        
        if (cmpne:boolean(and:int(var_0_38D:int, ldc:int(256)), ldc:int(0))) {
            var_0_38D = and:int(var_0_38D:int, ldc:int(-230115547))
            goto(Label_0231)
        }
        
        if (cmpeq:boolean(and:int(var_0_38D:int, ldc:int(1024)), ldc:int(0))) {
            var_0_38D = and:int(var_0_38D:int, ldc:int(687020293))
        }
        else {
            var_0_38D = and:int(var_0_38D:int, ldc:int(-1729200513))
            expr_B0 = arraylength:int(stack_B0_0:byte[])
            
            if (cmpne:boolean(expr_B0:int, ldc:int(0))) {
                var_4_332 = expr_B0:int
                var_3_337 = newarray:byte[](byte.class, expr_B0:int)
                var_5_338 = expr_B0:int
                goto(Label_0896)
            }
        }
        
        Label_0181:
        
        if (cmpeq:boolean(and:int(var_0_38D:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_38D = and:int(var_0_38D:int, ldc:int(918264560))
            goto(Label_0288)
        }
        
        if (cmpne:boolean(and:int(var_0_38D:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_38D:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_38D = and:int(var_0_38D:int, ldc:int(-1932532034))
            var_2_DE = stack_DE_0:byte[]
            expr_E2 = add:int(arraylength:int(stack_E0_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_E2:int, ldc:int(0))) {
                var_3_409 = newarray:byte[](byte.class, expr_E2:int)
                var_5_40A = expr_E2:int
                
                loop {
                    var_0_38D = and:int(var_0_38D:int, ldc:int(-663296401))
                    var_5_40A = add:int(var_5_40A:int, ldc:int(-1))
                    storeelement:byte(var_3_409:byte[], var_5_40A:int, add:int(shl:int(loadelement:byte(stack_41B_0:byte[], var_5_40A:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_DE:byte[], add:int(var_5_40A:int, and:int(ldc:int(1409), ldc:int(16501)))), ldc:int(3)), and:int(ldc:int(2079), ldc:int(17087)))))
                    
                    if (cmpne:boolean(var_5_40A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_B0_0 = stack_AE_0 = stack_DE_0 = stack_E0_0 = stack_119_0 = stack_11B_0 = stack_151_0 = stack_351_0 = stack_3A0_0 = stack_41B_0 = stack_471_0 = var_3_409:byte[]
            }
        }
        
        Label_0231:
        
        if (cmpeq:boolean(and:int(var_0_38D:int, ldc:int(512)), ldc:int(0))) {
            var_0_38D = and:int(var_0_38D:int, ldc:int(-1182022218))
        }
        else {
            if (cmpne:boolean(and:int(var_0_38D:int, ldc:int(4096)), ldc:int(0))) {
                var_0_38D = and:int(var_0_38D:int, ldc:int(-1392870563))
                goto(Label_0181)
            }
            
            if (cmpne:boolean(and:int(var_0_38D:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_38D = and:int(var_0_38D:int, ldc:int(-429754434))
            expr_11B = arraylength:int(stack_11B_0:byte[])
            
            if (cmpne:boolean(expr_11B:int, ldc:int(0))) {
                var_3_45F = newarray:byte[](byte.class, expr_11B:int)
                var_5_460 = expr_11B:int
                
                loop {
                    var_0_38D = and:int(var_0_38D:int, ldc:int(-288655809))
                    var_5_460 = add:int(var_5_460:int, ldc:int(-1))
                    expr_474 = add:byte(loadelement:byte(stack_471_0:byte[], var_5_460:int), ldc:byte(62))
                    storeelement:byte(var_3_45F:byte[], var_5_460:int, or:int(and:int(shl:int(expr_474:byte, and:int(ldc:int(2692), ldc:int(20581))), ldc:int(-16)), and:int(shr:int(expr_474:byte[expected:int], and:int(ldc:int(19716), ldc:int(4758))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_460:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_B0_0 = stack_AE_0 = stack_DE_0 = stack_E0_0 = stack_119_0 = stack_11B_0 = stack_151_0 = stack_351_0 = stack_3A0_0 = stack_41B_0 = stack_471_0 = var_3_45F:byte[]
            }
        }
        
        Label_0288:
        
        if (cmpne:boolean(and:int(var_0_38D:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0231)
        }
        
        if (cmpeq:boolean(and:int(var_0_38D:int, ldc:int(8)), ldc:int(0))) {
            var_0_38D = and:int(var_0_38D:int, ldc:int(-1120704089))
            goto(Label_0181)
        }
        
        if (cmpne:boolean(and:int(var_0_38D:int, ldc:int(4096)), ldc:int(0))) {
            var_0_38D = and:int(var_0_38D:int, ldc:int(650934507))
            goto(Label_0115)
        }
        
        var_3_15D = initobject:String(String::<init>, stack_151_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_325_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32256), ldc:int(-32240)))
        expr_16F = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2328), ldc:int(534)))
        storeelement:String(expr_16F:String[], xor:int(ldc:int(-31488), ldc:int(-31484)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(9485), ldc:int(-9488)), and:int(ldc:int(4643), ldc:int(18565))))
        storeelement:String(expr_16F:String[], and:int(ldc:int(11019), ldc:int(173)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(16641), ldc:int(2741)), xor:int(ldc:int(4670), ldc:int(4643))))
        storeelement:String(expr_16F:String[], and:int(ldc:int(8218), ldc:int(4234)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(10269), ldc:int(16959)), and:int(ldc:int(9267), ldc:int(123))))
        storeelement:String(expr_16F:String[], xor:int(ldc:int(4107), ldc:int(4109)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(307), ldc:int(115)), and:int(ldc:int(235), ldc:int(4431))))
        storeelement:String(expr_16F:String[], xor:int(ldc:int(9730), ldc:int(9733)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, xor:int(ldc:int(24594), ldc:int(24665)), xor:int(ldc:int(16443), ldc:int(16478))))
        storeelement:String(expr_16F:String[], and:int(ldc:int(23298), ldc:int(-23299)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(17765), ldc:int(10855)), xor:int(ldc:int(16935), ldc:int(17061))))
        storeelement:String(expr_16F:String[], xor:int(ldc:int(9), ldc:int(8)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(8339), ldc:int(1154)), xor:int(ldc:int(1421), ldc:int(1298))))
        storeelement:String(expr_16F:String[], and:int(ldc:int(8275), ldc:int(19202)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(159), ldc:int(7839)), and:int(ldc:int(1981), ldc:int(189))))
        storeelement:String(expr_16F:String[], xor:int(ldc:int(8225), ldc:int(8228)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, xor:int(ldc:int(415), ldc:int(290)), and:int(ldc:int(10449), ldc:int(16881))))
        storeelement:String(expr_16F:String[], and:int(ldc:int(10010), ldc:int(40)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, xor:int(ldc:int(18705), ldc:int(18880)), xor:int(ldc:int(2584), ldc:int(2814))))
        storeelement:String(expr_16F:String[], xor:int(ldc:int(2104), ldc:int(2107)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, xor:int(ldc:int(27), ldc:int(253)), xor:int(ldc:int(-16381), ldc:int(-16136))))
        storeelement:String(expr_16F:String[], xor:int(ldc:int(1289), ldc:int(1282)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(4347), ldc:int(3323)), and:int(ldc:int(8495), ldc:int(18798))))
        storeelement:String(expr_16F:String[], and:int(ldc:int(1100), ldc:int(9100)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(25007), ldc:int(6446)), xor:int(ldc:int(6794), ldc:int(7147))))
        storeelement:String(expr_16F:String[], xor:int(ldc:int(26626), ldc:int(26639)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, xor:int(ldc:int(1319), ldc:int(1094)), xor:int(ldc:int(1287), ldc:int(1159))))
        storeelement:String(expr_16F:String[], xor:int(ldc:int(1118), ldc:int(1104)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(10704), ldc:int(1409)), xor:int(ldc:int(8221), ldc:int(8629))))
        storeelement:String(expr_16F:String[], and:int(ldc:int(1359), ldc:int(4127)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, xor:int(ldc:int(37), ldc:int(397)), xor:int(ldc:int(1962), ldc:int(1646))))
        putstatic:String[](\u3504\u5bc4\u7ce1\u36d3\u71f1::\u624e\u6b5f\u3bd6\u9255\u183a\u52d3, expr_16F:String[])
        putstatic:Logger(\u3504\u5bc4\u7ce1\u36d3\u71f1::\u960f\uc4d2\u4e72\u965f\u4c2b\u4c04, invokestatic:Logger(LogManager::getLogger))
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_688 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_693 : int
        
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
        var_3_688 = and:int(ldc:int(-497399926), ldc:int(1851414475))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3504\u5bc4\u7ce1\u36d3\u71f1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_688 = and:int(var_3_688:int, ldc:int(25671209))
        }
        else {
            var_3_688 = and:int(var_3_688:int, ldc:int(1064722331))
            var_5_8A = and:int(ldc:int(8398), ldc:int(-9936))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-20505), ldc:int(20504)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_688:int, ldc:int(2136895470))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(16705), ldc:int(1085)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, and:int(ldc:int(10369), ldc:int(17477)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_688 = and:int(var_3_E3:int, ldc:int(2147217310))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(2112), ldc:int(2113)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(470705017))
                        goto(Label_1534)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-910089086))
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1250)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(542816245))
                        goto(Label_1117)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0957)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0823)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(4)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(670556158))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0567)
                            }
                            
                            goto(Label_0823)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1534)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1240030223))
                        goto(Label_1250)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1827488008))
                        goto(Label_1117)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0957)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0823)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(1622973863))
                            loopcontinue()
                        }
                        
                        var_3_688 = and:int(var_3_688:int, ldc:int(1652291502))
                        var_11_F4 = and:int(ldc:int(-17401), ldc:int(17368))
                        goto(Label_1523)
                    }
                    
                    Label_0567:
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1534)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(128)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1456070006))
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(64)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1494231854))
                        goto(Label_1250)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1703423373))
                        goto(Label_1117)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0957)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0823)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(281027327))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_688 = and:int(var_3_688:int, ldc:int(-86513746))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0823)
                        }
                    }
                    
                    Label_0692:
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1534)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1558166552))
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(16)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(786233940))
                        goto(Label_1250)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1117)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1247995724))
                        goto(Label_0957)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0567)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(1)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(-2067193280))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_688 = and:int(var_3_688:int, ldc:int(920059835))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0823:
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1534)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(64)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1377809029))
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1857260653))
                        goto(Label_1250)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1117)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1616404731))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(1321848945))
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(1452111676))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1563199542))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = xor:int(ldc:int(4613), ldc:int(4612))
                                goto(Label_1117)
                            }
                        }
                    }
                    
                    Label_0957:
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1534)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(4)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1293806014))
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1250)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1687848126))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0823)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(-327807474))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(-1651858855))
                            loopcontinue()
                        }
                        
                        var_3_688 = and:int(var_3_688:int, ldc:int(578289562))
                        var_11_F4 = and:int(ldc:int(1807), ldc:int(-5904))
                    }
                    
                    Label_1117:
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(334661421))
                        goto(Label_1534)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(952148782))
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1711018044))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(1106586998))
                            goto(Label_0957)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0823)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(-417800524))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_688 = and:int(var_3_688:int, ldc:int(-411082869))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1386)
                            }
                        }
                    }
                    
                    Label_1250:
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1534)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(4)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(167624101))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_1117)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0957)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(512)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(-165909612))
                            goto(Label_0823)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0567)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(64)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(-887957109))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(763850916))
                            loopcontinue()
                        }
                        
                        var_3_688 = and:int(var_3_688:int, ldc:int(-136591458))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1523)
                    }
                    
                    Label_1386:
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1534)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1250)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1117)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(128)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1342021524))
                        goto(Label_0957)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0823)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(1)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-114572221))
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1762297593))
                        goto(Label_0567)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(4128286))
                        loopcontinue()
                    }
                    
                    var_3_688 = and:int(var_3_688:int, ldc:int(1071304651))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1523:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_693 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1534:
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1625714709))
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-644437428))
                        goto(Label_1250)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(2)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1721373776))
                        goto(Label_1117)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(16)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(984291049))
                        goto(Label_0957)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(742844190))
                        goto(Label_0823)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(2)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1601485115))
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(8)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1985470362))
                        var_17_693 = add:int(var_16_122:int, xor:int(ldc:int(4352), ldc:int(4353)))
                        looporswitchbreak()
                    }
                    
                    var_3_688 = and:int(var_3_688:int, ldc:int(-981300418))
                }
                
                var_3_688 = and:int(var_3_688:int, ldc:int(794785679))
                
                if (cmple:boolean(var_5_8A = var_17_693:int, sub:int(var_6_91:int, xor:int(ldc:int(16433), ldc:int(16432))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_688 = and:int(var_3_688:int, ldc:int(-659331471))
            goto(Label_0108)
        }
    }
}
