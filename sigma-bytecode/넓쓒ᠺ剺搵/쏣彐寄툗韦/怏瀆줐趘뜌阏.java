public class \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u600f\u7006\uc910\u8d98\ub70c\u960f {
    public void \u600f\u7006\uc910\u8d98\ub70c\u960f() {
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
            invokespecial:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::<init>, this:\u600f\u7006\uc910\u8d98\ub70c\u960f, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u600f\u7006\uc910\u8d98\ub70c\u960f::\u5fe1\u88c5\u7c6b\u3e2a\u97e6\u47c2), and:int(ldc:int(3428), ldc:int(-11621)))))
            putfield:\u3bd6\u6bb9\u9a18\u12cb\ub1b9\u8c8a(\u600f\u7006\uc910\u8d98\ub70c\u960f::\u0b8e\u88c5\u47c2\ua3b4\u1833\u8640, this:\u600f\u7006\uc910\u8d98\ub70c\u960f, getstatic:\u3bd6\u6bb9\u9a18\u12cb\ub1b9\u8c8a(\u3bd6\u6bb9\u9a18\u12cb\ub1b9\u8c8a::\u51b2\u52d3\u446c\u4ab3\ubff1\u8d90))
            putfield:\u3bd6\u6bb9\u9a18\u12cb\ub1b9\u8c8a(\u600f\u7006\uc910\u8d98\ub70c\u960f::\u3dd3\ub113\u8413\u8640\u624e\uc229, this:\u600f\u7006\uc910\u8d98\ub70c\u960f, getstatic:\u3bd6\u6bb9\u9a18\u12cb\ub1b9\u8c8a(\u3bd6\u6bb9\u9a18\u12cb\ub1b9\u8c8a::\u51b2\u52d3\u446c\u4ab3\ubff1\u8d90))
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
    
    public void \u0a06\u12cb\u97b7\u4492\u1833\ubded(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0) {
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
            invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u0a06\u12cb\u97b7\u4492\u1833\ubded, this:\u600f\u7006\uc910\u8d98\ub70c\u960f[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f))
            invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u600f\u7006\uc910\u8d98\ub70c\u960f::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u600f\u7006\uc910\u8d98\ub70c\u960f)), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u600f\u7006\uc910\u8d98\ub70c\u960f::\uc4d2\u4f4a\u4c04\u8389\u4492\u527a))
            invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, this:\u600f\u7006\uc910\u8d98\ub70c\u960f[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, div:int(sub:int(getfield:int(\u600f\u7006\uc910\u8d98\ub70c\u960f::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u600f\u7006\uc910\u8d98\ub70c\u960f), and:int(ldc:int(16637), ldc:int(5114))), and:int(ldc:int(39), ldc:int(4634))), div:int(sub:int(getfield:int(\u600f\u7006\uc910\u8d98\ub70c\u960f::\u6d69\ud12e\u4bc8\ubded\u120d\u0800, this:\u600f\u7006\uc910\u8d98\ub70c\u960f), and:int(ldc:int(1190), ldc:int(8870))), and:int(ldc:int(486), ldc:int(6674))), and:int(ldc:int(-9692), ldc:int(411)), and:int(ldc:int(-32383), ldc:int(25708)), xor:int(ldc:int(-32558), ldc:int(-32726)), xor:int(ldc:int(2483), ldc:int(2325)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, float p3) {
        var_7_7F : int
        var_8_98 : int
        
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
            invokevirtual:void(\u600f\u7006\uc910\u8d98\ub70c\u960f::\u0a06\u12cb\u97b7\u4492\u1833\ubded, this:\u600f\u7006\uc910\u8d98\ub70c\u960f, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            var_7_7F = add:int(div:int(sub:int(getfield:int(\u600f\u7006\uc910\u8d98\ub70c\u960f::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u600f\u7006\uc910\u8d98\ub70c\u960f), xor:int(ldc:int(2459), ldc:int(2403))), and:int(ldc:int(20686), ldc:int(514))), ldc:int(10))
            var_8_98 = add:int(div:int(sub:int(getfield:int(\u600f\u7006\uc910\u8d98\ub70c\u960f::\u6d69\ud12e\u4bc8\ubded\u120d\u0800, this:\u600f\u7006\uc910\u8d98\ub70c\u960f), and:int(ldc:int(230), ldc:int(29110))), xor:int(ldc:int(10625), ldc:int(10627))), ldc:int(8))
            invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ub18d\u99f7\uc910\u97e6\u5245\uceb8, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u600f\u7006\uc910\u8d98\ub70c\u960f::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u600f\u7006\uc910\u8d98\ub70c\u960f), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:ITextComponent(\u600f\u7006\uc910\u8d98\ub70c\u960f::\ud36e\uafe7\ubf56\uc229\u51b2\u8413, this:\u600f\u7006\uc910\u8d98\ub70c\u960f), i2f:float(var_7_7F:int), i2f:float(var_8_98:int), ldc:int(2039583))
            invokeinterface:int(\u3bd6\u6bb9\u9a18\u12cb\ub1b9\u8c8a::\ubff1\ub18d\uff55\u0800\ud7e8\u8308, getfield:\u3bd6\u6bb9\u9a18\u12cb\ub1b9\u8c8a(\u600f\u7006\uc910\u8d98\ub70c\u960f::\u3dd3\ub113\u8413\u8640\u624e\uc229, this:\u600f\u7006\uc910\u8d98\ub70c\u960f), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_7_7F:int, add:int(invokeinterface:int(\u3bd6\u6bb9\u9a18\u12cb\ub1b9\u8c8a::\ubff1\ub18d\uff55\u0800\ud7e8\u8308, getfield:\u3bd6\u6bb9\u9a18\u12cb\ub1b9\u8c8a(\u600f\u7006\uc910\u8d98\ub70c\u960f::\u0b8e\u88c5\u47c2\ua3b4\u1833\u8640, this:\u600f\u7006\uc910\u8d98\ub70c\u960f), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_7_7F:int, add:int(var_8_98:int, ldc:int(12)), ldc:int(12), ldc:int(5197647)), ldc:int(20)), ldc:int(9), ldc:int(2039583))
            invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, this:\u600f\u7006\uc910\u8d98\ub70c\u960f[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u5654\u120d\u7330\u7049\u51fa\u8350$1(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u600f\u7006\uc910\u8d98\ub70c\u960f::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u600f\u7006\uc910\u8d98\ub70c\u960f), checkcast:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006.class, aconstnull:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006()))
            invokevirtual:void(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\ua6bd\u1187\u983f\u7e3f\u5140\u67d0, getfield:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4daf\u6c56\uc87f\ub19c\u3d4b\u760c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u600f\u7006\uc910\u8d98\ub70c\u960f::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u600f\u7006\uc910\u8d98\ub70c\u960f)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u6b0d\uc229\ub32d\u3c25\ubb2b\u8350$0(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, p0:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d, and:int[expected:boolean](ldc:int(-10756), ldc:int(10755)))
            invokevirtual:void(\u36d3\u8640\u92ff\ub113\u12b2\ud158::\ub6ab\u92ff\u8350\u624e\ub102\u5f50, invokestatic:\u36d3\u8640\u92ff\ub113\u12b2\ud158(\ud217\u3504\u760c\uc29a\u97e6\ube23::\uc910\u4f4a\uc29a\u61a4\uc87f\u516c), loadelement:String(getstatic:String[](\u600f\u7006\uc910\u8d98\ub70c\u960f::\u5fe1\u88c5\u7c6b\u3e2a\u97e6\u47c2), and:int(ldc:int(12554), ldc:int(1193))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_356 : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_AD_0 : byte[] [generated]
        stack_AF_0 : byte[] [generated]
        stack_EF_0 : byte[] [generated]
        stack_F1_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_118_0 : byte[] [generated]
        stack_157_0 : byte[] [generated]
        stack_317_0 : byte[] [generated]
        stack_369_0 : byte[] [generated]
        stack_3F0_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_2A7 : byte[]
        var_4_2A8 : int
        expr_AF : int [generated]
        var_5_2F8 : int
        var_3_2FD : byte[]
        var_4_2FE : int
        var_0_383 : int
        expr_369 : byte [generated]
        stack_3BB_2 : byte [generated]
        stack_38F_0 : byte [generated]
        expr_F1 : int [generated]
        expr_118 : int [generated]
        var_3_3DE : byte[]
        var_4_3DF : int
        expr_3F0 : byte [generated]
        var_3_163 : String
        expr_16B : String[] [generated]
        expr_175 : String[] [generated]
        
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
            var_0_356 = and:int(ldc:int(1939671356), ldc:int(1903901812))
            expr_65 = var_2_69 = stack_AD_0 = stack_AF_0 = stack_EF_0 = stack_F1_0 = stack_116_0 = stack_118_0 = stack_157_0 = stack_317_0 = stack_369_0 = stack_3F0_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("AKfApiKHb8YloMwjHRinwKYih2/AJaKGJBZtp/IlJR0bJ6CnwKYih2/Boh9JIyIgJW2lpJ0Yp8CmIodvwiWjBmqfIZinwKYih2/DI55Po+sbIJinwKYih2/Dop9PIiKfpu8To6Z+IpwfIKfApiKHb8Oin08iIp+m6hggmvFtpJ+Yp8CmIodvx2+eTxklH2rvbkC6ugdPTr4cG4cgJWkkpCHHI55LwmsjgqObC6AmgqUjGMOjI3ii7yfrI2gjmiG8JCCHQpkigKAdpCVvpiLtImkdp7xoIANED4g="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_2A7 = newarray:byte[](byte.class, expr_6D:int)
                var_4_2A8 = expr_6D:int
                
                loop {
                    var_0_356 = and:int(var_0_356:int, ldc:int(1905920722))
                    var_4_2A8 = add:int(var_4_2A8:int, ldc:int(-1))
                    storeelement:byte(var_3_2A7:byte[], var_4_2A8:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_2A8:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_2A8:int, and:int(ldc:int(25681), ldc:int(427)))), ldc:int(3)), xor:int(ldc:int(22), ldc:int(9)))))
                    
                    if (cmpne:boolean(var_4_2A8:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AF_0 = stack_AD_0 = stack_EF_0 = stack_F1_0 = stack_116_0 = stack_118_0 = stack_157_0 = stack_317_0 = stack_369_0 = stack_3F0_0 = var_3_2A7:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_356:int, ldc:int(536870912)), ldc:int(0))) {
                    var_0_356 = and:int(var_0_356:int, ldc:int(684905552))
                    goto(Label_0285)
                }
                
                if (cmpne:boolean(and:int(var_0_356:int, ldc:int(1)), ldc:int(0))) {
                    var_0_356 = and:int(var_0_356:int, ldc:int(-322622101))
                    goto(Label_0246)
                }
                
                if (cmpeq:boolean(and:int(var_0_356:int, ldc:int(2048)), ldc:int(0))) {
                    var_0_356 = and:int(var_0_356:int, ldc:int(601505039))
                    goto(Label_0180)
                }
                
                var_0_356 = and:int(var_0_356:int, ldc:int(-178581827))
                expr_AF = arraylength:int(stack_AF_0:byte[])
                
                if (cmpeq:boolean(expr_AF:int, ldc:int(0))) {
                    goto(Label_0180)
                }
                
                var_5_2F8 = expr_AF:int
                var_3_2FD = newarray:byte[](byte.class, expr_AF:int)
                var_4_2FE = expr_AF:int
                Label_0768:
                
                while (cmpne:boolean(and:int(var_0_356:int, ldc:int(268435456)), ldc:int(0))) {
                    var_0_356 = and:int(var_0_356:int, ldc:int(-46249890))
                    var_4_2FE = add:int(var_4_2FE:int, ldc:int(-1))
                    storeelement:byte(var_3_2FD:byte[], var_4_2FE:int, xor:byte(add:byte(loadelement:byte(stack_317_0:byte[], var_4_2FE:int), ldc:byte(23)), ldc:byte(123)))
                    
                    if (cmpne:boolean(var_4_2FE:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_AF_0 = stack_AD_0 = stack_EF_0 = stack_F1_0 = stack_116_0 = stack_118_0 = stack_157_0 = stack_317_0 = stack_369_0 = stack_3F0_0 = var_3_2FD:byte[]
                    goto(Label_0180)
                }
                
                Label_0841:
                
                while (cmpne:boolean(and:int(var_0_356:int, ldc:int(16)), ldc:int(0))) {
                    var_0_383 = and:int(var_0_356:int, ldc:int(-48374479))
                    var_4_2FE = add:int(var_4_2FE:int, ldc:int(-1))
                    expr_369 = stack_3BB_2 = loadelement(stack_369_0, var_4_2FE)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_2FE:int, ldc:int(3)), neg:int(var_5_2F8:int)), ldc:int(0))) {
                        stack_3BB_2 = stack_38F_0 = add:byte(expr_369:byte, loadelement:byte(var_3_2FD:byte[], add:int(var_4_2FE:int, ldc:int(3))))
                        goto(Label_0927)
                    }
                    
                    Label_0886:
                    
                    if (cmpeq:boolean(and:int(var_0_383:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_0_383 = and:int(var_0_383:int, ldc:int(1848899375))
                    }
                    else {
                        var_0_383 = and:int(var_0_383:int, ldc:int(1971306456))
                        stack_3BB_2 = stack_38F_0 = add:byte(expr_369:byte, ldc:byte(3))
                    }
                    
                    Label_0927:
                    
                    if (cmpne:boolean(and:int(var_0_383:int, ldc:int(512)), ldc:int(0))) {
                        var_0_383 = and:int(var_0_383:int, ldc:int(-1435397848))
                        goto(Label_0886)
                    }
                    
                    var_0_356 = and:int(var_0_383:int, ldc:int(1931155612))
                    storeelement:byte(var_3_2FD:byte[], var_4_2FE:int, stack_3BB_2:byte)
                    
                    if (cmpne:boolean(var_4_2FE:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_AF_0 = stack_AD_0 = stack_EF_0 = stack_F1_0 = stack_116_0 = stack_118_0 = stack_157_0 = stack_317_0 = stack_369_0 = stack_3F0_0 = var_3_2FD:byte[]
                    goto(Label_0246)
                }
                
                var_0_356 = and:int(var_0_356:int, ldc:int(-426122190))
                goto(Label_0768)
                Label_0180:
                
                if (cmpeq:boolean(and:int(var_0_356:int, ldc:int(1048576)), ldc:int(0))) {
                    var_0_356 = and:int(var_0_356:int, ldc:int(-1796676402))
                    goto(Label_0285)
                }
                
                if (cmpeq:boolean(and:int(var_0_356:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_356 = and:int(var_0_356:int, ldc:int(-399838245))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_356:int, ldc:int(536870912)), ldc:int(0))) {
                        var_0_356 = and:int(var_0_356:int, ldc:int(677342918))
                        loopcontinue()
                    }
                    
                    var_0_356 = and:int(var_0_356:int, ldc:int(-115742351))
                    expr_F1 = arraylength:int(stack_F1_0:byte[])
                    
                    if (cmpne:boolean(expr_F1:int, ldc:int(0))) {
                        var_5_2F8 = expr_F1:int
                        var_3_2FD = newarray:byte[](byte.class, expr_F1:int)
                        var_4_2FE = expr_F1:int
                        goto(Label_0841)
                    }
                }
                
                Label_0246:
                
                if (cmpeq:boolean(and:int(var_0_356:int, ldc:int(16384)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_356:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0180)
                    }
                    
                    if (cmpeq:boolean(and:int(var_0_356:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_356 = and:int(var_0_356:int, ldc:int(1964804401))
                    expr_118 = arraylength:int(stack_118_0:byte[])
                    
                    if (cmpne:boolean(expr_118:int, ldc:int(0))) {
                        var_3_3DE = newarray:byte[](byte.class, expr_118:int)
                        var_4_3DF = expr_118:int
                        
                        loop {
                            var_0_356 = and:int(var_0_356:int, ldc:int(2013178075))
                            var_4_3DF = add:int(var_4_3DF:int, ldc:int(-1))
                            expr_3F0 = loadelement:byte(stack_3F0_0:byte[], var_4_3DF:int)
                            storeelement:byte(var_3_3DE:byte[], var_4_3DF:int, or:int(and:int(shl:int(expr_3F0:byte, xor:int(ldc:int(20611), ldc:int(20615))), ldc:int(-16)), and:int(shr:int(expr_3F0:byte[expected:int], and:int(ldc:int(9348), ldc:int(6420))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_4_3DF:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_AF_0 = stack_AD_0 = stack_EF_0 = stack_F1_0 = stack_116_0 = stack_118_0 = stack_157_0 = stack_317_0 = stack_369_0 = stack_3F0_0 = var_3_3DE:byte[]
                    }
                }
                
                Label_0285:
                
                if (cmpne:boolean(and:int(var_0_356:int, ldc:int(512)), ldc:int(0))) {
                    var_0_356 = and:int(var_0_356:int, ldc:int(339266934))
                    goto(Label_0246)
                }
                
                if (cmpeq:boolean(and:int(var_0_356:int, ldc:int(1048576)), ldc:int(0))) {
                    var_0_356 = and:int(var_0_356:int, ldc:int(991192247))
                    goto(Label_0180)
                }
                
                if (cmpne:boolean(and:int(var_0_356:int, ldc:int(2147483647)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_356 = and:int(var_0_356:int, ldc:int(-1420386806))
            }
            
            var_3_163 = initobject:String(String::<init>, stack_157_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_16B = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16650), ldc:int(90)))
            expr_175 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2884), ldc:int(2894)))
            storeelement:String(expr_175:String[], and:int(ldc:int(133), ldc:int(11025)), invokevirtual:String[expected:String](String::substring, var_3_163:String, and:int(ldc:int(18178), ldc:int(-18183)), xor:int(ldc:int(8330), ldc:int(8327))))
            storeelement:String(expr_175:String[], xor:int(ldc:int(18954), ldc:int(18957)), invokevirtual:String[expected:String](String::substring, var_3_163:String, and:int(ldc:int(2333), ldc:int(20493)), and:int(ldc:int(20522), ldc:int(11367))))
            storeelement:String(expr_175:String[], xor:int(ldc:int(16430), ldc:int(16424)), invokevirtual:String[expected:String](String::substring, var_3_163:String, xor:int(ldc:int(2335), ldc:int(2365)), and:int(ldc:int(191), ldc:int(5685))))
            storeelement:String(expr_175:String[], xor:int(ldc:int(10312), ldc:int(10317)), invokevirtual:String[expected:String](String::substring, var_3_163:String, and:int(ldc:int(5181), ldc:int(16629)), xor:int(ldc:int(12349), ldc:int(12414))))
            storeelement:String(expr_175:String[], xor:int(ldc:int(-28670), ldc:int(-28672)), invokevirtual:String[expected:String](String::substring, var_3_163:String, xor:int(ldc:int(2145), ldc:int(2082)), xor:int(ldc:int(-26424), ldc:int(-26470))))
            storeelement:String(expr_175:String[], and:int(ldc:int(132), ldc:int(9998)), invokevirtual:String[expected:String](String::substring, var_3_163:String, xor:int(ldc:int(16430), ldc:int(16508)), and:int(ldc:int(8427), ldc:int(377))))
            storeelement:String(expr_175:String[], xor:int(ldc:int(2052), ldc:int(2055)), invokevirtual:String[expected:String](String::substring, var_3_163:String, xor:int(ldc:int(548), ldc:int(589)), xor:int(ldc:int(-22186), ldc:int(-22058))))
            storeelement:String(expr_175:String[], and:int(ldc:int(-24350), ldc:int(18969)), invokevirtual:String[expected:String](String::substring, var_3_163:String, and:int(ldc:int(1418), ldc:int(18657)), xor:int(ldc:int(2094), ldc:int(2209))))
            storeelement:String(expr_175:String[], xor:int(ldc:int(5250), ldc:int(5258)), invokevirtual:String[expected:String](String::substring, var_3_163:String, xor:int(ldc:int(312), ldc:int(439)), and:int(ldc:int(6585), ldc:int(701))))
            storeelement:String(expr_16B:String[], xor:int(ldc:int(294), ldc:int(303)), invokevirtual:String[expected:String](String::substring, var_3_163:String, xor:int(ldc:int(8198), ldc:int(8383)), xor:int(ldc:int(8785), ldc:int(8840))))
            putstatic:String[](\u600f\u7006\uc910\u8d98\ub70c\u960f::\u5fe1\u88c5\u7c6b\u3e2a\u97e6\u47c2, expr_175:String[])
            putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u600f\u7006\uc910\u8d98\ub70c\u960f::\uc4d2\u4f4a\u4c04\u8389\u4492\u527a, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(expr_16B:String[], and:int(ldc:int(3917), ldc:int(41)))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_657 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_662 : int
        
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
        var_3_657 = and:int(ldc:int(2058907608), ldc:int(2042288624))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u600f\u7006\uc910\u8d98\ub70c\u960f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_657 = and:int(var_3_657:int, ldc:int(2126205398))
            var_5_81 = and:int(ldc:int(14692), ldc:int(-31221))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(17677), ldc:int(-17678)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_657:int, ldc:int(-2573930))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(2049), ldc:int(1033)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(61), ldc:int(2113)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_657 = and:int(var_3_D1:int, ldc:int(-67412494))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(775), ldc:int(18569)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-371019101))
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-789146093))
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0657)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0550)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-102841889))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0550)
                            }
                            
                            goto(Label_0807)
                        }
                    }
                    
                    Label_0384:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(736312012))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-2035037082))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(537780340))
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0657)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-1513899079))
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(-103031881))
                        var_11_E2 = and:int(ldc:int(19975), ldc:int(-28168))
                        goto(Label_1508)
                    }
                    
                    Label_0550:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(16)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1159194214))
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1424661740))
                        goto(Label_0807)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0384)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(-117567244))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0807)
                        }
                    }
                    
                    Label_0657:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-892833350))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(128)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-2050473090))
                        goto(Label_1092)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1004905460))
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1086560136))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-54855160))
                            goto(Label_0550)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0384)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-1808585621))
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(2096677584))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0807:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-123947909))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(256419229))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(587128295))
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(192389552))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-1532769557))
                            goto(Label_0657)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0550)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0384)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(2089282613))
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(2080110003))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(6285), ldc:int(67))
                                goto(Label_1092)
                            }
                        }
                    }
                    
                    Label_0950:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0807)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-970786331))
                            goto(Label_0657)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0550)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(2053516735))
                            goto(Label_0384)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(-73720133))
                        var_11_E2 = and:int(ldc:int(22312), ldc:int(-24366))
                    }
                    
                    Label_1092:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1729813224))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0950)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0807)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-656147192))
                            goto(Label_0657)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0550)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0384)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(1015307906))
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(-54851362))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1362)
                            }
                        }
                    }
                    
                    Label_1208:
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1829932560))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(1239496028))
                            goto(Label_1092)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-1053269679))
                            goto(Label_0950)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-823981713))
                            goto(Label_0807)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0657)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-1084502626))
                            goto(Label_0550)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(128)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-2014735014))
                            goto(Label_0384)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-2612592))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1508)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1362:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1596905287))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1500253778))
                        goto(Label_1208)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-532470304))
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(515326859))
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0657)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0550)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(288416697))
                        goto(Label_0384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1073741824)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_657 = and:int(var_3_657:int, ldc:int(-69419521))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1508:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_662 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1519:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-2093218597))
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(628167690))
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(776664290))
                        goto(Label_0807)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0657)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0550)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0384)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(128)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-377417))
                        var_17_662 = add:int(var_16_110:int, and:int(ldc:int(8349), ldc:int(7169)))
                        looporswitchbreak()
                    }
                }
                
                var_3_657 = and:int(var_3_657:int, ldc:int(2046712754))
                
                if (cmple:boolean(var_5_81 = var_17_662:int, sub:int(var_6_88:int, xor:int(ldc:int(6402), ldc:int(6403))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(524288)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
