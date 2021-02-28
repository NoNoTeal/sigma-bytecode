public class \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u7043\u4c04\u7bad\u3d64\u8258\ud158 {
    public void \u7043\u4c04\u7bad\u3d64\u8258\ud158(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p0, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u718f\u183a\u6d99\u3bc9\ub70c\u7af6 p1, java.util.UUID p2, java.lang.String p3, java.util.function.Supplier<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> p4) {
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
    
    public void \u8413\u4492\uc2e8\u946b\u1187\u516c(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, boolean p8, float p9) {
        var_11_61 : int
        var_13_6D : int
        var_14_7E : int
        var_15_8D : int
        var_16_93 : ITextComponent
        var_17_C6 : int
        var_18_1EC : float
        
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
            var_11_61 = and:int(ldc:int(579187533), ldc:int(-1937260566))
            var_13_6D = add:int(p3:int, xor:int(ldc:int(6155), ldc:int(6159)))
            var_14_7E = add:int(p2:int, div:int(sub:int(p5:int, ldc:int(24)), xor:int(ldc:int(-32599), ldc:int(-32597))))
            var_15_8D = add:int(add:int(var_13_6D:int, ldc:int(24)), and:int(ldc:int(2244), ldc:int(1036)))
            var_16_93 = invokespecial:ITextComponent(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u3dd3\u56bd\u3e75\u16f6\u98a4\u392e, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158)
            
            if (cmpne:boolean(var_16_93:ITextComponent, getstatic:ITextComponent(StringTextComponent::EMPTY))) {
                var_11_61 = and:int(var_11_61:int, ldc:int(-693813543))
                invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\uff55\u5245\uf995\u7049\u4179\u624e, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p3:int, p2:int, add:int(p3:int, p4:int), add:int(p2:int, p5:int), getstatic:int(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u4f52\u9937\u7e3f\u7d52\u836c\ua068))
                var_17_C6 = add:int(p2:int, div:int(sub:int(p5:int, ldc:int(18)), xor:int(ldc:int(16449), ldc:int(16451))))
                invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ub18d\u99f7\uc910\u97e6\u5245\uceb8, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u8258\ub32d\u9255\uc84e\u5245\uf9c5, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158)), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_16_93:ITextComponent, i2f:float(var_15_8D:int), i2f:float(add:int(var_17_C6:int, ldc:int(12))), getstatic:int(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u12cb\u3e2a\u8389\u946b\u7043\u7043))
            }
            else {
                invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\uff55\u5245\uf995\u7049\u4179\u624e, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p3:int, p2:int, add:int(p3:int, p4:int), add:int(p2:int, p5:int), getstatic:int(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u527a\u8bb0\uceb8\u7e3f\u9937\ua61f))
                var_17_C6 = add:int(p2:int, div:int(sub:int(p5:int, ldc:int(9)), and:int(ldc:int(7803), ldc:int(8194))))
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_11_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_11_61 = and:int(var_11_61:int, ldc:int(-1611382608))
                }
                else {
                    var_11_61 = and:int(var_11_61:int, ldc:int(248512457))
                    invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u8258\ub32d\u9255\uc84e\u5245\uf9c5, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158)), checkcast:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753.class, invokeinterface:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Supplier<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>::get, getfield:Supplier<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u6d99\u64f2\u92ee\u6b5f\u6b5f\u3a62, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158))))
                    invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_13_6D:int, var_14_7E:int, ldc:int(24), ldc:int(24), ldc:float(8.0f), ldc:float(8.0f), ldc:int(8), ldc:int(8), ldc:int(64), ldc:int(64))
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\uc9f6\u7049\u92ee\ube23\u3c25\u6d99)
                    invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_13_6D:int, var_14_7E:int, ldc:int(24), ldc:int(24), ldc:float(40.0f), ldc:float(8.0f), ldc:int(8), ldc:int(8), ldc:int(64), ldc:int(64))
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9)
                    invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u071d\u6198\ud12e\uc229\u93a2\ua6bd, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u8258\ub32d\u9255\uc84e\u5245\uf9c5, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158)), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:String(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u34df\u4bc8\u3504\u0800\u3711\u4c04, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158), i2f:float(var_15_8D:int), i2f:float(var_17_C6:int), getstatic:int(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\ubefe\ub19c\u3e75\uae87\u4bc8\u72f1))
                    
                    if (getfield:boolean(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u1833\uc87f\u624e\u2dcc\uff55\ua562, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158)) {
                        invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\uff55\u5245\uf995\u7049\u4179\u624e, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_13_6D:int, var_14_7E:int, add:int(var_13_6D:int, ldc:int(24)), add:int(var_14_7E:int, ldc:int(24)), getstatic:int(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u6435\u5db4\uc31c\u7049\ubded\u3bc9))
                    }
                }
                
                if (cmpne:boolean(and:int(var_11_61:int, ldc:int(65536)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            if (cmpne:boolean(getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\ubded\u56bd\u67e9\uff55\u92ff\u12b2, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158), aconstnull:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d())) {
                if (cmpne:boolean(getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u4e72\u5db4\u7bad\u071d\u72f1\u494c, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158), aconstnull:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d())) {
                    var_18_1EC = getfield:float(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u6b0d\u51fa\uc229\ud158\u071d\u3d4b, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158)
                    putfield:int(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\u3dd3\u4975\u6cfe\u51fa\ua562\u5db4, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\ubded\u56bd\u67e9\uff55\u92ff\u12b2, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158), add:int(p3:int, sub:int(sub:int(p4:int, invokevirtual:int(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\u494c\u3711\u3776\u67e9\u74b1\u836c, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995](\u7043\u4c04\u7bad\u3d64\u8258\ud158::\ubded\u56bd\u67e9\uff55\u92ff\u12b2, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158))), xor:int(ldc:int(161), ldc:int(165)))))
                    putfield:int(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\uae87\u5f50\u3bd6\u6c56\ud51e\u1833, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\ubded\u56bd\u67e9\uff55\u92ff\u12b2, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158), add:int(p2:int, div:int(sub:int(p5:int, invokevirtual:int(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\u3a62\u6bb9\u9937\u12b2\u74b1\u8d98, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995](\u7043\u4c04\u7bad\u3d64\u8258\ud158::\ubded\u56bd\u67e9\uff55\u92ff\u12b2, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158))), xor:int(ldc:int(528), ldc:int(530)))))
                    invokevirtual:void(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995](\u7043\u4c04\u7bad\u3d64\u8258\ud158::\ubded\u56bd\u67e9\uff55\u92ff\u12b2, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p6:int, p7:int, p9:float)
                    putfield:int(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\u3dd3\u4975\u6cfe\u51fa\ua562\u5db4, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u4e72\u5db4\u7bad\u071d\u72f1\u494c, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158), add:int(p3:int, sub:int(sub:int(p4:int, invokevirtual:int(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\u494c\u3711\u3776\u67e9\u74b1\u836c, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995](\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u4e72\u5db4\u7bad\u071d\u72f1\u494c, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158))), and:int(ldc:int(743), ldc:int(24604)))))
                    putfield:int(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\uae87\u5f50\u3bd6\u6c56\ud51e\u1833, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u4e72\u5db4\u7bad\u071d\u72f1\u494c, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158), add:int(p2:int, div:int(sub:int(p5:int, invokevirtual:int(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\u3a62\u6bb9\u9937\u12b2\u74b1\u8d98, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995](\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u4e72\u5db4\u7bad\u071d\u72f1\u494c, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158))), and:int(ldc:int(16454), ldc:int(666)))))
                    invokevirtual:void(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995](\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u4e72\u5db4\u7bad\u071d\u72f1\u494c, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p6:int, p7:int, p9:float)
                    
                    if (cmpeq:boolean(var_18_1EC:float, getfield:float(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u6b0d\u51fa\uc229\ud158\u071d\u3d4b, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158))) {
                        putfield:float(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u6b0d\u51fa\uc229\ud158\u071d\u3d4b, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158, ldc:float(0.0f))
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<? extends \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u3e75\ub8be\u88c5\ub7dc\uc246\u8753> \u51fa\u67d0\u965f\u76bc\u3d4b\u7c6b() {
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
            return:List<? extends \u3e75\ub8be\u88c5\ub7dc\uc246\u8753>(getfield:List<\u3e75\ub8be\u88c5\ub7dc\uc246\u8753>(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u4cd9\u52d3\uf94d\ub18d\u6bb9\u0800, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u34df\u52d3\u446c\u9af2\u385b\u4e72() {
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
            return:String(getfield:String(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u34df\u4bc8\u3504\u0800\u3711\u4c04, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158))
        }
        
        goto(Label_0006)
    }
    
    public java.util.UUID \u4daf\uc2bd\ub32d\u92ff\ud7e8\u7043() {
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
            return:UUID(getfield:UUID(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u8c8a\u67d0\u34df\u3d4b\u8640\u76bc, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158))
        }
        
        goto(Label_0006)
    }
    
    public void \uc31c\u4c04\u6bb9\u67e9\ua61f\u6435(boolean p0) {
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
            putfield:boolean(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u1833\uc87f\u624e\u2dcc\uff55\ua562, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158, p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ud217\u7873\uc87f\u3c25\ucfaf\ub7dc(boolean p0, net.minecraft.util.text.ITextComponent p1) {
        var_3_61 : int
        stack_93_0 : \u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d [generated]
        stack_93_1 : int [generated]
        
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
            var_3_61 = and:int(ldc:int(-488448223), ldc:int(-188248159))
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\u92ee\u5654\u5f50\u6c56\u6b0d\uf94d, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u4e72\u5db4\u7bad\u071d\u72f1\u494c, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158), p0:boolean)
            stack_93_0 = getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\ubded\u56bd\u67e9\uff55\u92ff\u12b2, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158)
            
            if (p0:boolean) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-119656750))
                stack_93_1 = and:int[expected:boolean](ldc:int(27778), ldc:int(-27780))
            }
            else {
                stack_93_1 = xor:int[expected:boolean](ldc:int(3648), ldc:int(3649))
            }
            
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\u92ee\u5654\u5f50\u6c56\u6b0d\uf94d, stack_93_0:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d, stack_93_1:boolean)
            invokevirtual:void(\u4d85\u3e2a\u5654\u7d52\u718f\u7e3f::\u9937\u8d98\ud158\u4c04\u600f\u7e3f, invokevirtual:\u4d85\u3e2a\u5654\u7d52\u718f\u7e3f(\u120d\u446c\uff55\u3d64\u494c\u69d9::\ub8be\u6c56\u494c\ud51e\u7330\u3bc9, getfield:\u120d\u446c\uff55\u3d64\u494c\u69d9(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u76bc\u873d\uc238\u0a06\uceb8\u92ee, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u8258\ub32d\u9255\uc84e\u5245\uf9c5, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158))), p1:ITextComponent)
            invokevirtual:void(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u624e\u76bc\u92ee\u5db4\u5654\u88c5, getstatic:\u74b1\u516c\u7330\ud523\u8df4\uc87f(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u385b\uf9c5\uf94d\u718f\u5d20\u494c), invokeinterface:String(ITextComponent::getString, p1:ITextComponent))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private net.minecraft.util.text.IFormattableTextComponent \u4c2b\u51b2\u9af2\u99f7\u5bc4\u64f2(net.minecraft.util.text.IFormattableTextComponent p0) {
        var_2_61 : int
        var_4_66 : ITextComponent
        stack_D8_0 : IFormattableTextComponent [generated]
        
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
            var_2_61 = and:int(ldc:int(864169049), ldc:int(-485671089))
            var_4_66 = invokespecial:ITextComponent(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u3dd3\u56bd\u3e75\u16f6\u98a4\u392e, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158)
            
            if (cmpne:boolean(var_4_66:ITextComponent, getstatic:ITextComponent(StringTextComponent::EMPTY))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1541908205))
                stack_D8_0 = invokeinterface:IFormattableTextComponent(IFormattableTextComponent::append, invokeinterface:IFormattableTextComponent(IFormattableTextComponent::appendString, invokeinterface:IFormattableTextComponent(IFormattableTextComponent::append, invokevirtual:IFormattableTextComponent(IFormattableTextComponent::appendString, initobject:StringTextComponent[expected:IFormattableTextComponent](StringTextComponent::<init>, getfield:String(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u34df\u4bc8\u3504\u0800\u3711\u4c04, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158)), loadelement:String(getstatic:String[](\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u52d3\u4bc8\u4e72\u12cb\u960f\u4bc8), and:int(ldc:int(4623), ldc:int(9700)))), var_4_66:ITextComponent), loadelement:String(getstatic:String[](\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u52d3\u4bc8\u4e72\u12cb\u960f\u4bc8), xor:int(ldc:int(17024), ldc:int(17028)))), p0:IFormattableTextComponent[expected:ITextComponent])
            }
            else {
                stack_D8_0 = invokeinterface:IFormattableTextComponent(IFormattableTextComponent::append, invokevirtual:IFormattableTextComponent(IFormattableTextComponent::appendString, initobject:StringTextComponent[expected:IFormattableTextComponent](StringTextComponent::<init>, getfield:String(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u34df\u4bc8\u3504\u0800\u3711\u4c04, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158)), loadelement:String(getstatic:String[](\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u52d3\u4bc8\u4e72\u12cb\u960f\u4bc8), and:int(ldc:int(4), ldc:int(22934)))), p0:IFormattableTextComponent[expected:ITextComponent])
            }
            
            return:IFormattableTextComponent(stack_D8_0:IFormattableTextComponent)
        }
        
        goto(Label_0006)
    }
    
    private net.minecraft.util.text.ITextComponent \u3dd3\u56bd\u3e75\u16f6\u98a4\u392e() {
        var_1_19F : int
        var_3_70 : boolean
        var_4_7F : boolean
        stack_1FB_0 : ITextComponent [generated]
        
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
            var_1_19F = and:int(ldc:int(-1927632623), ldc:int(207616367))
            var_3_70 = invokevirtual:boolean(\u59ec\u4bc8\uc910\ua562\u72f1\u839e::\u3776\u0800\u1833\u5140\u56bd\ub7dc, invokevirtual:\u59ec\u4bc8\uc910\ua562\u72f1\u839e(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u12cb\ud51e\u9255\u92ff\u3711\uc87f, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u8258\ub32d\u9255\uc84e\u5245\uf9c5, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158)), getfield:UUID(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u8c8a\u67d0\u34df\u3d4b\u8640\u76bc, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158))
            var_4_7F = invokevirtual:boolean(\u59ec\u4bc8\uc910\ua562\u72f1\u839e::\uc910\u6fb0\u7c6b\u3a62\ub102\u64ab, invokevirtual:\u59ec\u4bc8\uc910\ua562\u72f1\u839e(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u12cb\ud51e\u9255\u92ff\u3711\uc87f, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u8258\ub32d\u9255\uc84e\u5245\uf9c5, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158)), getfield:UUID(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u8c8a\u67d0\u34df\u3d4b\u8640\u76bc, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158))
            
            if (var_4_7F:boolean) {
                if (getfield:boolean(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u1833\uc87f\u624e\u2dcc\uff55\ua562, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158)) {
                    return:ITextComponent(getstatic:ITextComponent(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u52d3\ub6ab\ud36e\u7873\u6c52\u9255))
                }
            }
            
            loop {
                if (cmpne:boolean(and:int(var_1_19F:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0360)
                }
                
                if (cmpeq:boolean(and:int(var_1_19F:int, ldc:int(8192)), ldc:int(0))) {
                    var_1_19F = and:int(var_1_19F:int, ldc:int(-126544135))
                    goto(Label_0306)
                }
                
                if (cmpeq:boolean(and:int(var_1_19F:int, ldc:int(131072)), ldc:int(0))) {
                    var_1_19F = and:int(var_1_19F:int, ldc:int(1448898721))
                    goto(Label_0255)
                }
                
                if (cmpne:boolean(and:int(var_1_19F:int, ldc:int(2048)), ldc:int(0))) {
                    var_1_19F = and:int(var_1_19F:int, ldc:int(-278991029))
                    
                    if (var_3_70:boolean) {
                        if (getfield:boolean(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u1833\uc87f\u624e\u2dcc\uff55\ua562, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158)) {
                            return:ITextComponent(getstatic:ITextComponent(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u4cd9\ud4fe\u3bd6\u983f\u8c8a\u8413))
                        }
                    }
                }
                
                Label_0194:
                
                if (cmpeq:boolean(and:int(var_1_19F:int, ldc:int(131072)), ldc:int(0))) {
                    var_1_19F = and:int(var_1_19F:int, ldc:int(196604879))
                    goto(Label_0360)
                }
                
                if (cmpeq:boolean(and:int(var_1_19F:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0306)
                }
                
                if (cmpne:boolean(and:int(var_1_19F:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_19F = and:int(var_1_19F:int, ldc:int(1346901157))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_19F:int, ldc:int(134217728)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_19F = and:int(var_1_19F:int, ldc:int(-1392793096))
                    
                    if (var_4_7F:boolean) {
                        return:ITextComponent(getstatic:ITextComponent(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\ud4fe\u4f52\u72f1\u600f\ud217\u516c))
                    }
                }
                
                Label_0255:
                
                if (cmpne:boolean(and:int(var_1_19F:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0360)
                }
                
                if (cmpeq:boolean(and:int(var_1_19F:int, ldc:int(536870912)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_19F:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_19F = and:int(var_1_19F:int, ldc:int(1733414540))
                        goto(Label_0194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_19F:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_19F = and:int(var_1_19F:int, ldc:int(1012645133))
                    
                    if (var_3_70:boolean) {
                        return:ITextComponent(getstatic:ITextComponent(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u3dd3\ua61f\u416d\ucb79\u6435\ucfaf))
                    }
                }
                
                Label_0306:
                
                if (cmpne:boolean(and:int(var_1_19F:int, ldc:int(32768)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_19F:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0255)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_19F:int, ldc:int(8)), ldc:int(0))) {
                        var_1_19F = and:int(var_1_19F:int, ldc:int(-716923570))
                        goto(Label_0194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_19F:int, ldc:int(32768)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_19F = and:int(var_1_19F:int, ldc:int(-1959067761))
                    
                    if (getfield:boolean(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u1833\uc87f\u624e\u2dcc\uff55\ua562, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158)) {
                        stack_1FB_0 = getstatic:ITextComponent(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u4bc8\ua3b4\u0800\uc87f\u93a2\u97b7)
                        looporswitchbreak()
                    }
                }
                
                Label_0360:
                
                if (cmpeq:boolean(and:int(var_1_19F:int, ldc:int(8192)), ldc:int(0))) {
                    var_1_19F = and:int(var_1_19F:int, ldc:int(1595844769))
                    goto(Label_0306)
                }
                
                if (cmpeq:boolean(and:int(var_1_19F:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0255)
                }
                
                if (cmpne:boolean(and:int(var_1_19F:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_0194)
                }
                
                if (cmpne:boolean(and:int(var_1_19F:int, ldc:int(256)), ldc:int(0))) {
                    var_1_19F = and:int(var_1_19F:int, ldc:int(-1136989279))
                    stack_1FB_0 = getstatic:ITextComponent(StringTextComponent::EMPTY)
                    looporswitchbreak()
                }
                
                var_1_19F = and:int(var_1_19F:int, ldc:int(-941076441))
            }
            
            return:ITextComponent(stack_1FB_0:ITextComponent)
        }
        
        goto(Label_0006)
    }
    
    private static void \ud158\uc229\uc229\u6c52\u4d85\u647c(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u718f\u183a\u6d99\u3bc9\ub70c\u7af6 p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p1, java.util.List<\u5d20\u7043\u88c5\u5db4\uf94d.\u718f\u8413\u1833\u72f1\u5fe1\u927d> p2, int p3, int p4) {
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
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u6b0d\ud12e\u760c\u6d99\u7873\u3bc9, p0:\u718f\u183a\u6d99\u3bc9\ub70c\u7af6[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p1:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p2:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>, p3:int, p4:int)
            invokevirtual:void(\u718f\u183a\u6d99\u3bc9\ub70c\u7af6::\u1187\ud523\u836c\uafe7\u527a\u6cfe, p0:\u718f\u183a\u6d99\u3bc9\ub70c\u7af6, checkcast:Runnable(java.lang.Runnable.class, aconstnull:Runnable()))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u4daf\u927d\u156b\ud171\ucfaf\u1833$5(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p0, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u718f\u183a\u6d99\u3bc9\ub70c\u7af6 p1, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p2, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p3, int p4, int p5) {
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
    
    private void lambda$\u76bc\u51b2\u92ff\u71ae\u12cb\u69d9$4(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u718f\u183a\u6d99\u3bc9\ub70c\u7af6 p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p1, int p2, int p3) {
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
            invokestatic:void(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\ud158\uc229\uc229\u6c52\u4d85\u647c, p0:\u718f\u183a\u6d99\u3bc9\ub70c\u7af6, p1:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\ub32d\u5140\u946b\u47c2\ubded\u527a, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158), p2:int, p3:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u3d64\uc9f6\ubded\u7873\u34df\ud7e8$3(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u59ec\u4bc8\uc910\ua562\u72f1\u839e p0, java.util.UUID p1, java.lang.String p2, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p3) {
        stack_98_1 : int [generated]
        stack_95_1 : String [generated]
        expr_88 : Object[] [generated]
        
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
            invokevirtual:void(\u59ec\u4bc8\uc910\ua562\u72f1\u839e::\ucef1\u5140\u72f1\u74b1\u6bb9\u760c, p0:\u59ec\u4bc8\uc910\ua562\u72f1\u839e, p1:UUID)
            stack_98_1 = and:int[expected:boolean](ldc:int(14705), ldc:int(-14706))
            stack_95_1 = loadelement:String(getstatic:String[](\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u52d3\u4bc8\u4e72\u12cb\u960f\u4bc8), xor:int(ldc:int(16391), ldc:int(16386)))
            expr_88 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(20993), ldc:int(2049)))
            storeelement:Object(expr_88:Object[], and:int(ldc:int(19772), ldc:int(-19903)), p2:String[expected:Object])
            invokespecial:void(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\ud217\u7873\uc87f\u3c25\ucfaf\ub7dc, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158, stack_98_1:boolean, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_95_1:String, expr_88:Object[]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u6bb9\u97e6\u3bc9\u6b5f\uc31c\u6b0d$2(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p0, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u718f\u183a\u6d99\u3bc9\ub70c\u7af6 p1, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p2, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p3, int p4, int p5) {
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
    
    private void lambda$\u385b\u839e\u51b2\u8389\u624e\u4f4a$1(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u718f\u183a\u6d99\u3bc9\ub70c\u7af6 p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p1, int p2, int p3) {
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
            invokestatic:void(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\ud158\uc229\uc229\u6c52\u4d85\u647c, p0:\u718f\u183a\u6d99\u3bc9\ub70c\u7af6, p1:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\ua562\u62da\uf995\u62da\uc7fe\ub1b9, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158), p2:int, p3:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u6c52\u5654\u7d52\u4c2b\uafe7\uceb8$0(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u59ec\u4bc8\uc910\ua562\u72f1\u839e p0, java.util.UUID p1, java.lang.String p2, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p3) {
        stack_98_1 : int [generated]
        stack_95_1 : String [generated]
        expr_88 : Object[] [generated]
        
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
            invokevirtual:void(\u59ec\u4bc8\uc910\ua562\u72f1\u839e::\ud7e8\u8df4\u2dcc\u5245\u9a18\u97b7, p0:\u59ec\u4bc8\uc910\ua562\u72f1\u839e, p1:UUID)
            stack_98_1 = xor:int[expected:boolean](ldc:int(25089), ldc:int(25088))
            stack_95_1 = loadelement:String(getstatic:String[](\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u52d3\u4bc8\u4e72\u12cb\u960f\u4bc8), and:int(ldc:int(18614), ldc:int(1030)))
            expr_88 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(10250), ldc:int(10251)))
            storeelement:Object(expr_88:Object[], and:int(ldc:int(17438), ldc:int(-21535)), p2:String[expected:Object])
            invokespecial:void(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\ud217\u7873\uc87f\u3c25\ucfaf\ub7dc, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158, stack_98_1:boolean, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_95_1:String, expr_88:Object[]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static net.minecraft.util.text.IFormattableTextComponent \u52d3\u72f1\u5bc4\u6435\ub32d\u5f50(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\u7043\u4c04\u7bad\u3d64\u8258\ud158 p0, net.minecraft.util.text.IFormattableTextComponent p1) {
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
            return:IFormattableTextComponent(invokespecial:IFormattableTextComponent(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u4c2b\u51b2\u9af2\u99f7\u5bc4\u64f2, p0:\u7043\u4c04\u7bad\u3d64\u8258\ud158, p1:IFormattableTextComponent))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_429 : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_9E_0 : byte[] [generated]
        stack_A0_0 : byte[] [generated]
        stack_E0_0 : byte[] [generated]
        stack_E2_0 : byte[] [generated]
        stack_110_0 : byte[] [generated]
        stack_112_0 : byte[] [generated]
        stack_13F_0 : byte[] [generated]
        stack_43C_0 : byte[] [generated]
        stack_485_0 : byte[] [generated]
        stack_503_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_3C3 : byte[]
        var_4_3C4 : int
        expr_A0 : int [generated]
        var_5_414 : int
        var_3_419 : byte[]
        var_4_41A : int
        var_0_49F : int
        expr_485 : byte [generated]
        stack_4CE_2 : byte [generated]
        stack_4A2_0 : byte [generated]
        expr_E2 : int [generated]
        expr_112 : int [generated]
        var_3_4F1 : byte[]
        var_4_4F2 : int
        expr_503 : byte [generated]
        var_3_14B : String
        expr_153 : String[] [generated]
        expr_15D : String[] [generated]
        var_3_2B1 : String[]
        
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
            var_0_429 = and:int(ldc:int(1409229710), ldc:int(-1310756866))
            expr_68 = var_2_6C = stack_9E_0 = stack_A0_0 = stack_E0_0 = stack_E2_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_43C_0 = stack_485_0 = stack_503_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("H5/26Hh3+FBiZKpiCjoKSHB0fGBeBuB4Vfx8YH5MZGRgYG4QBnoaVuh4d/hQYmSqYgo6CkhwdHxgXgbgeFXqaHAMduh4d/hQYmSqYgo6CkhwdHxgXgb4Gk/sZnYQVuh4d/hQYmSqYgo6CkhwdHxgXgb4Gk/seGRQRGRgYG4QBnoaVuh4d/hQYmSqYgo6CkhwdHxgXgb4Emvycm4eqkJSEmZ4cnxyGnboeHf4UGJkqmIKOgpIcHR8YF4G+BJr8nJuHqpCUhJmeHJsQHB0Cm50Ymh0DHboeHf4UGJkqmIKOgpIcHR8YF4G+BJr8nJuHq5YWBx8YG5yHnboeHf4UGJkqmIKOgpIcHR8YF4G+BJr8nJuHq5YWBx8YH5AdHQKbnRiaHQMduh4d/hQYmSqYgo6CkhwdHxgXgb4Emvycm4eoE5UCm50Ymh0DHboeHf4UGJkqmIKOgpIcHR8YF4G9hxP9FgAegDGYlXqaHAMduh4d/hQYmSqYgo6CkhwdHxgXgb2HE/0WAB6AN4UT+x0koLg"))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_3C3 = newarray:byte[](byte.class, expr_70:int)
                var_4_3C4 = expr_70:int
                
                loop {
                    var_0_429 = and:int(var_0_429:int, ldc:int(-2083047459))
                    var_4_3C4 = add:int(var_4_3C4:int, ldc:int(-1))
                    storeelement:byte(var_3_3C3:byte[], var_4_3C4:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_3C4:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_3C4:int, and:int(ldc:int(8977), ldc:int(1)))), ldc:int(5)), and:int(ldc:int(2055), ldc:int(8199)))))
                    
                    if (cmpne:boolean(var_4_3C4:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A0_0 = stack_9E_0 = stack_E0_0 = stack_E2_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_43C_0 = stack_485_0 = stack_503_0 = var_3_3C3:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_429:int, ldc:int(64)), ldc:int(0))) {
                    var_0_429 = and:int(var_0_429:int, ldc:int(-1408621961))
                    goto(Label_0279)
                }
                
                if (cmpeq:boolean(and:int(var_0_429:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0231)
                }
                
                if (cmpeq:boolean(and:int(var_0_429:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0165)
                }
                
                var_0_429 = and:int(var_0_429:int, ldc:int(1073191853))
                expr_A0 = arraylength:int(stack_A0_0:byte[])
                
                if (cmpeq:boolean(expr_A0:int, ldc:int(0))) {
                    goto(Label_0165)
                }
                
                var_5_414 = expr_A0:int
                var_3_419 = newarray:byte[](byte.class, expr_A0:int)
                var_4_41A = expr_A0:int
                Label_1052:
                
                while (cmpne:boolean(and:int(var_0_429:int, ldc:int(16777216)), ldc:int(0))) {
                    var_0_429 = and:int(var_0_429:int, ldc:int(-167807059))
                    var_4_41A = add:int(var_4_41A:int, ldc:int(-1))
                    storeelement:byte(var_3_419:byte[], var_4_41A:int, xor:byte(add:byte(loadelement:byte(stack_43C_0:byte[], var_4_41A:int), ldc:byte(38)), ldc:byte(73)))
                    
                    if (cmpne:boolean(var_4_41A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A0_0 = stack_9E_0 = stack_E0_0 = stack_E2_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_43C_0 = stack_485_0 = stack_503_0 = var_3_419:byte[]
                    goto(Label_0165)
                }
                
                var_0_429 = and:int(var_0_429:int, ldc:int(1899524624))
                Label_1134:
                
                while (cmpne:boolean(and:int(var_0_429:int, ldc:int(128)), ldc:int(0))) {
                    var_0_49F = and:int(var_0_429:int, ldc:int(467060621))
                    var_4_41A = add:int(var_4_41A:int, ldc:int(-1))
                    expr_485 = stack_4CE_2 = loadelement(stack_485_0, var_4_41A)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_41A:int, ldc:int(3)), neg:int(var_5_414:int)), ldc:int(0))) {
                        stack_4CE_2 = stack_4A2_0 = add:byte(expr_485:byte, loadelement:byte(var_3_419:byte[], add:int(var_4_41A:int, ldc:int(3))))
                        goto(Label_1202)
                    }
                    
                    Label_1170:
                    
                    if (cmpeq:boolean(and:int(var_0_49F:int, ldc:int(16)), ldc:int(0))) {
                        var_0_49F = and:int(var_0_49F:int, ldc:int(-1109484561))
                        stack_4CE_2 = stack_4A2_0 = add:byte(expr_485:byte, ldc:byte(3))
                    }
                    
                    Label_1202:
                    
                    if (cmpeq:boolean(and:int(var_0_49F:int, ldc:int(262144)), ldc:int(0))) {
                        var_0_49F = and:int(var_0_49F:int, ldc:int(1120522570))
                        goto(Label_1170)
                    }
                    
                    var_0_429 = and:int(var_0_49F:int, ldc:int(1207869436))
                    storeelement:byte(var_3_419:byte[], var_4_41A:int, stack_4CE_2:byte)
                    
                    if (cmpne:boolean(var_4_41A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A0_0 = stack_9E_0 = stack_E0_0 = stack_E2_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_43C_0 = stack_485_0 = stack_503_0 = var_3_419:byte[]
                    goto(Label_0231)
                }
                
                goto(Label_1052)
                Label_0165:
                
                if (cmpeq:boolean(and:int(var_0_429:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_429 = and:int(var_0_429:int, ldc:int(-1622182442))
                    goto(Label_0279)
                }
                
                if (cmpne:boolean(and:int(var_0_429:int, ldc:int(64)), ldc:int(0))) {
                    var_0_429 = and:int(var_0_429:int, ldc:int(344462678))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_429:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_0_429 = and:int(var_0_429:int, ldc:int(-512193835))
                        loopcontinue()
                    }
                    
                    var_0_429 = and:int(var_0_429:int, ldc:int(1375730591))
                    expr_E2 = arraylength:int(stack_E2_0:byte[])
                    
                    if (cmpne:boolean(expr_E2:int, ldc:int(0))) {
                        var_5_414 = expr_E2:int
                        var_3_419 = newarray:byte[](byte.class, expr_E2:int)
                        var_4_41A = expr_E2:int
                        goto(Label_1134)
                    }
                }
                
                Label_0231:
                
                if (cmpne:boolean(and:int(var_0_429:int, ldc:int(4)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_429:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0165)
                    }
                    
                    if (cmpne:boolean(and:int(var_0_429:int, ldc:int(16)), ldc:int(0))) {
                        var_0_429 = and:int(var_0_429:int, ldc:int(49402416))
                        loopcontinue()
                    }
                    
                    var_0_429 = and:int(var_0_429:int, ldc:int(-573140020))
                    expr_112 = arraylength:int(stack_112_0:byte[])
                    
                    if (cmpne:boolean(expr_112:int, ldc:int(0))) {
                        var_3_4F1 = newarray:byte[](byte.class, expr_112:int)
                        var_4_4F2 = expr_112:int
                        
                        loop {
                            var_0_429 = and:int(var_0_429:int, ldc:int(-872531044))
                            var_4_4F2 = add:int(var_4_4F2:int, ldc:int(-1))
                            expr_503 = loadelement:byte(stack_503_0:byte[], var_4_4F2:int)
                            storeelement:byte(var_3_4F1:byte[], var_4_4F2:int, or:int(and:int(shl:int(expr_503:byte, xor:int(ldc:int(12802), ldc:int(12806))), ldc:int(-16)), and:int(shr:int(expr_503:byte[expected:int], xor:int(ldc:int(18432), ldc:int(18436))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_4_4F2:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A0_0 = stack_9E_0 = stack_E0_0 = stack_E2_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_43C_0 = stack_485_0 = stack_503_0 = var_3_4F1:byte[]
                    }
                }
                
                Label_0279:
                
                if (cmpeq:boolean(and:int(var_0_429:int, ldc:int(262144)), ldc:int(0))) {
                    var_0_429 = and:int(var_0_429:int, ldc:int(1982873940))
                    goto(Label_0231)
                }
                
                if (cmpne:boolean(and:int(var_0_429:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0165)
                }
                
                if (cmpne:boolean(and:int(var_0_429:int, ldc:int(4194304)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_14B = initobject:String(String::<init>, stack_13F_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_153 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(28510), ldc:int(4108)))
            expr_15D = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(528), ldc:int(540)))
            storeelement:String(expr_15D:String[], and:int(ldc:int(10276), ldc:int(17620)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(-8103), ldc:int(7718)), and:int(ldc:int(18446), ldc:int(4098))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(5303), ldc:int(16910)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(-28600), ldc:int(-28598)), xor:int(ldc:int(128), ldc:int(167))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(16896), ldc:int(16898)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(1173), ldc:int(1202)), and:int(ldc:int(2370), ldc:int(25170))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(2083), ldc:int(3)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(3686), ldc:int(466)), xor:int(ldc:int(-32709), ldc:int(-32666))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(-30621), ldc:int(-30618)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(17241), ldc:int(17156)), and:int(ldc:int(17073), ldc:int(1411))))
            storeelement:String(expr_153:String[], and:int(ldc:int(4252), ldc:int(8715)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(4231), ldc:int(26497)), xor:int(ldc:int(1058), ldc:int(1156))))
            storeelement:String(expr_153:String[], and:int(ldc:int(4299), ldc:int(17419)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(2982), ldc:int(4326)), and:int(ldc:int(19711), ldc:int(8915))))
            storeelement:String(expr_153:String[], xor:int(ldc:int(10274), ldc:int(10277)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(4819), ldc:int(467)), xor:int(ldc:int(-16366), ldc:int(-16155))))
            storeelement:String(expr_153:String[], and:int(ldc:int(8459), ldc:int(17422)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(5367), ldc:int(17143)), xor:int(ldc:int(1680), ldc:int(1971))))
            storeelement:String(expr_153:String[], xor:int(ldc:int(21), ldc:int(28)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(6252), ldc:int(6479)), and:int(ldc:int(18248), ldc:int(8526))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(12676), ldc:int(-13197)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(2070), ldc:int(2398)), xor:int(ldc:int(17556), ldc:int(17919))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(8641), ldc:int(4101)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(-32199), ldc:int(-31918)), and:int(ldc:int(398), ldc:int(7599))))
            putstatic:String[](\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u52d3\u4bc8\u4e72\u12cb\u960f\u4bc8, expr_15D:String[])
            var_3_2B1 = expr_153:String[]
            putstatic:ITextComponent(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u3dd3\ua61f\u416d\ucb79\u6435\ucfaf, invokevirtual:IFormattableTextComponent(IFormattableTextComponent::mergeStyle, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_2B1:String[], and:int(ldc:int(2151), ldc:int(647)))), getstatic:TextFormatting(TextFormatting::ITALIC)))
            putstatic:ITextComponent(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\ud4fe\u4f52\u72f1\u600f\ud217\u516c, invokevirtual:IFormattableTextComponent(IFormattableTextComponent::mergeStyle, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_2B1:String[], and:int(ldc:int(8200), ldc:int(415)))), getstatic:TextFormatting(TextFormatting::ITALIC)))
            putstatic:ITextComponent(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u4bc8\ua3b4\u0800\uc87f\u93a2\u97b7, invokevirtual:IFormattableTextComponent(IFormattableTextComponent::mergeStyle, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_2B1:String[], and:int(ldc:int(20507), ldc:int(2573)))), getstatic:TextFormatting(TextFormatting::ITALIC)))
            putstatic:ITextComponent(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u4cd9\ud4fe\u3bd6\u983f\u8c8a\u8413, invokevirtual:IFormattableTextComponent(IFormattableTextComponent::mergeStyle, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_2B1:String[], xor:int(ldc:int(8233), ldc:int(8227)))), getstatic:TextFormatting(TextFormatting::ITALIC)))
            putstatic:ITextComponent(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u52d3\ub6ab\ud36e\u7873\u6c52\u9255, invokevirtual:IFormattableTextComponent(IFormattableTextComponent::mergeStyle, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_2B1:String[], xor:int(ldc:int(-16294), ldc:int(-16303)))), getstatic:TextFormatting(TextFormatting::ITALIC)))
            putstatic:int(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u6435\u5db4\uc31c\u7049\ubded\u3bc9, invokestatic:int(\u3e75\u3bc9\ufe34\u47c2\u6c52\ub8be::\u4975\u92ee\u93a2\u4179\ubff1\ufcaf, xor:int(ldc:int(8248), ldc:int(8326)), and:int(ldc:int(-14716), ldc:int(14442)), and:int(ldc:int(10884), ldc:int(-27269)), and:int(ldc:int(6506), ldc:int(-6635))))
            putstatic:int(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u527a\u8bb0\uceb8\u7e3f\u9937\ua61f, invokestatic:int(\u3e75\u3bc9\ufe34\u47c2\u6c52\ub8be::\u4975\u92ee\u93a2\u4179\ubff1\ufcaf, and:int(ldc:int(4863), ldc:int(8703)), ldc:int(74), ldc:int(74), ldc:int(74)))
            putstatic:int(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u4f52\u9937\u7e3f\u7d52\u836c\ua068, invokestatic:int(\u3e75\u3bc9\ufe34\u47c2\u6c52\ub8be::\u4975\u92ee\u93a2\u4179\ubff1\ufcaf, and:int(ldc:int(4607), ldc:int(255)), ldc:int(48), ldc:int(48), ldc:int(48)))
            putstatic:int(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\ubefe\ub19c\u3e75\uae87\u4bc8\u72f1, invokestatic:int(\u3e75\u3bc9\ufe34\u47c2\u6c52\ub8be::\u4975\u92ee\u93a2\u4179\ubff1\ufcaf, and:int(ldc:int(1791), ldc:int(4351)), and:int(ldc:int(2303), ldc:int(17151)), xor:int(ldc:int(-27402), ldc:int(-27639)), and:int(ldc:int(22271), ldc:int(2559))))
            putstatic:int(\u7043\u4c04\u7bad\u3d64\u8258\ud158::\u12cb\u3e2a\u8389\u946b\u7043\u7043, invokestatic:int(\u3e75\u3bc9\ufe34\u47c2\u6c52\ub8be::\u4975\u92ee\u93a2\u4179\ubff1\ufcaf, and:int(ldc:int(2508), ldc:int(18092)), xor:int(ldc:int(6497), ldc:int(6558)), xor:int(ldc:int(12799), ldc:int(12544)), xor:int(ldc:int(422), ldc:int(345))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0a06\u516c\u76bc\u5fe1\u61a4\u946b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67B : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_686 : int
        
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
        var_3_67B = and:int(ldc:int(508415516), ldc:int(283688700))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7043\u4c04\u7bad\u3d64\u8258\ud158[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_67B = and:int(var_3_67B:int, ldc:int(446715195))
        }
        else {
            var_3_67B = and:int(var_3_67B:int, ldc:int(-1142248324))
            var_5_8A = and:int(ldc:int(-15745), ldc:int(11648))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(5260), ldc:int(-21645)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_67B:int, ldc:int(290372761))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(16653), ldc:int(49)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, and:int(ldc:int(2265), ldc:int(24833)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_67B = and:int(var_3_E3:int, ldc:int(-1238368613))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(4112), ldc:int(4113)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1217193859))
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-777115437))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-570346404))
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(930285161))
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1915654045))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(87895676))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2068458588))
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1036083164))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1449688758))
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1980358270))
                            var_11_F4 = and:int(ldc:int(4253), ldc:int(-4256))
                            goto(Label_1526)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0586:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1446654523))
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1832694324))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(348305244))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-2111817894))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1675960996))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0711:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-112352994))
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1154347410))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1221951390))
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(494467240))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(2061407423))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(899581304))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2083253310))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0861:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(8291011))
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1887245864))
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-95243914))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(314773202))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-328707056))
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-576414112))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(490274584))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = xor:int(ldc:int(1121), ldc:int(1120))
                                goto(Label_1146)
                            }
                        }
                    }
                    
                    Label_1004:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-437080529))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0861)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-377459013))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2049957145))
                        var_11_F4 = and:int(ldc:int(4033), ldc:int(-4042))
                    }
                    
                    Label_1146:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-984873363))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_1004)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0861)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1847188572))
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(182135695))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-50549218))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1398)
                            }
                        }
                    }
                    
                    Label_1262:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1693655685))
                            goto(Label_1146)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_1004)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1809913250))
                            goto(Label_0861)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(2112089727))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(921188905))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1943006687))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1526)
                    }
                    
                    Label_1398:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-767113326))
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1052379075))
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1338435855))
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_67B = and:int(var_3_67B:int, ldc:int(-1787236834))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1526:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_686 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1537:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-287755846))
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1401708955))
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1139771965))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1650438210))
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1427881017))
                        var_17_686 = add:int(var_16_122:int, and:int(ldc:int(18477), ldc:int(9217)))
                        looporswitchbreak()
                    }
                    
                    var_3_67B = and:int(var_3_67B:int, ldc:int(1920217173))
                }
                
                var_3_67B = and:int(var_3_67B:int, ldc:int(-1249009955))
                
                if (cmple:boolean(var_5_8A = var_17_686:int, sub:int(var_6_91:int, and:int(ldc:int(65), ldc:int(16535))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
            var_3_67B = and:int(var_3_67B:int, ldc:int(-479818581))
            goto(Label_0108)
        }
    }
}
