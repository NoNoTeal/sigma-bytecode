public abstract class \ub113\uc4d2\u183a\u527a\u6435.\u4179\u4daf\u3d64\u56bd\u4975 {
    public static com.mojang.datafixers.Products$P2<com.mojang.serialization.codecs.RecordCodecBuilder$Mu<P>, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe> \u3711\u7043\ud36e\u52d3\uae5d\u0800(com.mojang.serialization.codecs.RecordCodecBuilder$Instance<P> p0) {
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
    
    public void \u4179\u4daf\u3d64\u56bd\u4975(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe p1) {
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
            invokespecial:Object(Object::<init>, this:\u4179\u4daf\u3d64\u56bd\u4975)
            putfield:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe(\u4179\u4daf\u3d64\u56bd\u4975::\ubff1\u40a9\u52d3\ub32d\u4ab3\u836c, this:\u4179\u4daf\u3d64\u56bd\u4975, p0:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe)
            putfield:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe(\u4179\u4daf\u3d64\u56bd\u4975::\u8df4\u4c2b\u71ae\u3bc9\ub102\ub32d, this:\u4179\u4daf\u3d64\u56bd\u4975, p1:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public abstract \u7c6b\u7c6b\ubefe\u385b\u3c25.\ubefe\uc3e3\ua61f\u3bc9\ubded<?> \u7af6\u71f1\ucfaf\u8bb0\uc87f\u59ec();
    
    public void \u120d\u92ee\u9937\u6c52\u93a2\u647c(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ucef1\u6d69\u946b\u97e6\u6b5f p0, java.util.Random p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3776\u8df4\u7af6\uc31c\u5f50\u47c2 p2, int p3, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u516c\u5fe1\u8c8a\u9255\ubb2b p4, int p5, int p6, java.util.Set<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> p7, \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 p8) {
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
            invokevirtual:void(\u4179\u4daf\u3d64\u56bd\u4975::\u8d90\u5bc4\uafe7\u3a62\u99f7\uf995, this:\u4179\u4daf\u3d64\u56bd\u4975, p0:\ucef1\u6d69\u946b\u97e6\u6b5f, p1:Random, p2:\u3776\u8df4\u7af6\uc31c\u5f50\u47c2, p3:int, p4:\u516c\u5fe1\u8c8a\u9255\ubb2b, p5:int, p6:int, p7:Set<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>, invokespecial:int(\u4179\u4daf\u3d64\u56bd\u4975::\u4179\u2dcc\u47c2\u6d69\u0800\u47c2, this:\u4179\u4daf\u3d64\u56bd\u4975, p1:Random), p8:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public abstract void \u8d90\u5bc4\uafe7\u3a62\u99f7\uf995(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ucef1\u6d69\u946b\u97e6\u6b5f p0, java.util.Random p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3776\u8df4\u7af6\uc31c\u5f50\u47c2 p2, int p3, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u516c\u5fe1\u8c8a\u9255\ubb2b p4, int p5, int p6, java.util.Set<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> p7, int p8, \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 p9);
    
    public abstract int \u5db4\u9937\u97e6\ucb79\u8308\u64ab(java.util.Random p0, int p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3776\u8df4\u7af6\uc31c\u5f50\u47c2 p2);
    
    public int \uafe7\ub113\u5db4\uc29a\u8350\ucfaf(java.util.Random p0, int p1) {
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
            return:int(invokevirtual:int(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u4cd9\ubb2b\u5fe1\u71ae\u6c52\u4f52, getfield:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe(\u4179\u4daf\u3d64\u56bd\u4975::\ubff1\u40a9\u52d3\ub32d\u4ab3\u836c, this:\u4179\u4daf\u3d64\u56bd\u4975), p0:Random))
        }
        
        goto(Label_0006)
    }
    
    private int \u4179\u2dcc\u47c2\u6d69\u0800\u47c2(java.util.Random p0) {
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
            return:int(invokevirtual:int(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u4cd9\ubb2b\u5fe1\u71ae\u6c52\u4f52, getfield:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe(\u4179\u4daf\u3d64\u56bd\u4975::\u8df4\u4c2b\u71ae\u3bc9\ub102\ub32d, this:\u4179\u4daf\u3d64\u56bd\u4975), p0:Random))
        }
        
        goto(Label_0006)
    }
    
    public abstract boolean \u93a2\u965f\u6cfe\u59ec\u98a4\u718f(java.util.Random p0, int p1, int p2, int p3, int p4, boolean p5);
    
    public boolean \uc29a\ub19c\u67d0\u385b\u5140\ua562(java.util.Random p0, int p1, int p2, int p3, int p4, boolean p5) {
        var_7_61 : int
        var_9_73 : int
        var_10_7A : int
        
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
            var_7_61 = and:int(ldc:int(898433516), ldc:int(898434302))
            
            if (logicalnot:boolean(p5:boolean)) {
                var_7_61 = and:int(var_7_61:int, ldc:int(-172387079))
                var_9_73 = invokestatic:int(Math::abs, p1:int)
                var_10_7A = invokestatic:int(Math::abs, p3:int)
            }
            else {
                var_9_73 = invokestatic:int(Math::min, invokestatic:int(Math::abs, p1:int), invokestatic:int(Math::abs, sub:int(p1:int, xor:int(ldc:int(8337), ldc:int(8336)))))
                var_10_7A = invokestatic:int(Math::min, invokestatic:int(Math::abs, p3:int), invokestatic:int(Math::abs, sub:int(p3:int, and:int(ldc:int(9449), ldc:int(4099)))))
            }
            
            return:boolean(invokevirtual:boolean(\u4179\u4daf\u3d64\u56bd\u4975::\u93a2\u965f\u6cfe\u59ec\u98a4\u718f, this:\u4179\u4daf\u3d64\u56bd\u4975, p0:Random, var_9_73:int, p2:int, var_10_7A:int, p4:int, p5:boolean))
        }
        
        goto(Label_0006)
    }
    
    public void \ucfaf\ud7e8\u5140\ub8be\u6198\uc910(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ucef1\u6d69\u946b\u97e6\u6b5f p0, java.util.Random p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3776\u8df4\u7af6\uc31c\u5f50\u47c2 p2, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p3, int p4, java.util.Set<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> p5, int p6, boolean p7, \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 p8) {
        var_10_61 : int
        stack_8B_0 : int [generated]
        var_10_E4 : int
        var_12_8B : int
        var_13_94 : \u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a
        var_14_99 : int
        var_15_D5 : int
        
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
            var_10_61 = and:int(ldc:int(-1111671085), ldc:int(-140150801))
            
            if (logicalnot:boolean(p7:boolean)) {
                var_10_61 = and:int(var_10_61:int, ldc:int(-250899250))
                stack_8B_0 = and:int(ldc:int(16911), ldc:int(-16912))
            }
            else {
                stack_8B_0 = xor:int(ldc:int(5250), ldc:int(5251))
            }
            
            var_10_E4 = and:int(var_10_61:int, ldc:int(-1692706864))
            var_12_8B = stack_8B_0:int
            var_13_94 = initobject:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::<init>)
            var_14_99 = neg:int(p4:int)
            
            loop {
                if (cmpeq:boolean(and:int(var_10_E4:int, ldc:int(33554432)), ldc:int(0))) {
                    var_10_E4 = and:int(var_10_E4:int, ldc:int(-83108395))
                    
                    if (cmple:boolean(var_14_99:int, add:int(p4:int, var_12_8B:int))) {
                        var_15_D5 = neg:int(p4:int)
                        
                        loop {
                            if (cmpne:boolean(and:int(var_10_E4:int, ldc:int(4096)), ldc:int(0))) {
                                var_10_E4 = and:int(var_10_E4:int, ldc:int(-742212381))
                                
                                if (cmple:boolean(var_15_D5:int, add:int(p4:int, var_12_8B:int))) {
                                    if (logicalnot:boolean(invokevirtual:boolean(\u4179\u4daf\u3d64\u56bd\u4975::\uc29a\ub19c\u67d0\u385b\u5140\ua562, this:\u4179\u4daf\u3d64\u56bd\u4975, p1:Random, var_14_99:int, p6:int, var_15_D5:int, p4:int, p7:boolean))) {
                                        invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u0a06\u12b2\uc2bd\ufe34\u760c\u47c2, var_13_94:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, p3:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], var_14_99:int, p6:int, var_15_D5:int)
                                        
                                        if (invokestatic:boolean(\uc246\ud158\u99f7\u64f2\u5f50\u6c52::\u64ab\u5140\u6b5f\u98a4\u71f1\u946b, p0:\ucef1\u6d69\u946b\u97e6\u6b5f[expected:\u527a\u8aa5\u34df\u7d52\u7e3f], var_13_94:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56])) {
                                            invokeinterface:boolean(\u72f1\u7ce1\ucef1\ub83f\u516c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, p0:\ucef1\u6d69\u946b\u97e6\u6b5f[expected:\u72f1\u7ce1\ucef1\ub83f\u516c], var_13_94:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56], invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u4cd9\uceb8\uc229\u416d\ud217\u12cb::\uc246\ube23\u5d20\u71ae\u600f\ud12e, getfield:\u4cd9\uceb8\uc229\u416d\ud217\u12cb(\u3776\u8df4\u7af6\uc31c\u5f50\u47c2::\u7c6b\u3e2a\u5d20\ud7e8\u74b1\ucef1, p2:\u3776\u8df4\u7af6\uc31c\u5f50\u47c2), p1:Random, var_13_94:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56]), ldc:int(19))
                                            invokevirtual:void(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u120d\u7e3f\ub7dc\ua6bd\u873d\u7049, p8:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, initobject:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::<init>, var_13_94:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], var_13_94:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))
                                            invokeinterface:boolean(Set<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::add, p5:Set<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u183a\u647c\u71f1\u6435\u6c52\u8df4, var_13_94:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a))
                                        }
                                    }
                                    
                                    var_10_E4 = and:int(var_10_E4:int, ldc:int(-1291225165))
                                    inc:int(var_15_D5, ldc:int(1))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpne:boolean(and:int(var_10_E4:int, ldc:int(16777216)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        var_10_E4 = and:int(var_10_E4:int, ldc:int(-1153272580))
                        inc:int(var_14_99, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_10_E4:int, ldc:int(4096)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_10_E4 = and:int(var_10_E4:int, ldc:int(-2034930420))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe lambda$\u8389\u4f52\ub113\u7043\u983f\ud171$1(\ub113\uc4d2\u183a\u527a\u6435.\u4179\u4daf\u3d64\u56bd\u4975 p0) {
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
            return:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe(getfield:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe(\u4179\u4daf\u3d64\u56bd\u4975::\u8df4\u4c2b\u71ae\u3bc9\ub102\ub32d, p0:\u4179\u4daf\u3d64\u56bd\u4975))
        }
        
        goto(Label_0006)
    }
    
    private static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe lambda$\u4d85\ubcb0\u8aa5\u5db4\u71ae\u6c52$0(\ub113\uc4d2\u183a\u527a\u6435.\u4179\u4daf\u3d64\u56bd\u4975 p0) {
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
            return:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe(getfield:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe(\u4179\u4daf\u3d64\u56bd\u4975::\ubff1\u40a9\u52d3\ub32d\u4ab3\u836c, p0:\u4179\u4daf\u3d64\u56bd\u4975))
        }
        
        goto(Label_0006)
    }
    
    static {
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
            putstatic:Codec<\u4179\u4daf\u3d64\u56bd\u4975>(\u4179\u4daf\u3d64\u56bd\u4975::\u5db4\uf995\u8308\u74b1\u494c\ud523, invokevirtual:Codec(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::dispatch, getstatic:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\ubefe\uc3e3\ua61f\u3bc9\ubded<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u385b\ua3b4\u51fa\ufcaf\u759a\u4d85), invokedynamic:Function<T, \ubefe\uc3e3\ua61f\u3bc9\ubded>(apply:()Ljava/util/function/Function;), invokedynamic:Function<T, Codec>(apply:()Ljava/util/function/Function;)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ua6bd\u4daf\ub19c\u8df4\u76bc\u36d3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_68D : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_698 : int
        
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
        var_3_68D = and:int(ldc:int(-2145590810), ldc:int(-310578722))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4179\u4daf\u3d64\u56bd\u4975[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_68D = and:int(var_3_68D:int, ldc:int(542965231))
            var_5_81 = and:int(ldc:int(18217), ldc:int(-18350))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-11382), ldc:int(11317)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_68D:int, ldc:int(125805431))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(330), ldc:int(331)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(35), ldc:int(10753)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_68D = and:int(var_3_DA:int, ldc:int(249473398))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(17697), ldc:int(2583)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(2124393248))
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(77499342))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(274118299))
                    }
                    else {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-457196713))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(579787813))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(671376021))
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1585460740))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1410641880))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1057103717))
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1075986817))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-838930609))
                            var_11_EB = and:int(ldc:int(-8505), ldc:int(8504))
                            goto(Label_1562)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0586:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(828135132))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1805053742))
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1987367054))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(727624388))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-788970897))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(731703758))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0720:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(496853406))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1448799965))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1730150171))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1820914210))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-811798145))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0852:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-387874097))
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1467936584))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(499963552))
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1925777249))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1040189994))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(288), ldc:int(289))
                                goto(Label_1146)
                            }
                        }
                    }
                    
                    Label_0977:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(186852139))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1341763376))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1014788331))
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-228403848))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(737816526))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1723638615))
                        var_11_EB = and:int(ldc:int(-6565), ldc:int(6564))
                    }
                    
                    Label_1146:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-240568958))
                            goto(Label_0977)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(902310258))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(574599292))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-795023369))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1416)
                            }
                        }
                    }
                    
                    Label_1262:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1426324938))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1487000182))
                            goto(Label_1146)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(637769238))
                            goto(Label_0977)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1982149676))
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-287750590))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-457148914))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(446538223))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1562)
                    }
                    
                    Label_1416:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1427841809))
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1516973105))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1575855425))
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1239725863))
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1277510856))
                        loopcontinue()
                    }
                    
                    var_3_68D = and:int(var_3_68D:int, ldc:int(282961254))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1562:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_698 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1573:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-477983820))
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(979274788))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-765107919))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1293964954))
                        var_17_698 = add:int(var_16_119:int, xor:int(ldc:int(550), ldc:int(551)))
                        looporswitchbreak()
                    }
                }
                
                var_3_68D = and:int(var_3_68D:int, ldc:int(-1279410857))
                
                if (cmple:boolean(var_5_81 = var_17_698:int, sub:int(var_6_88:int, and:int(ldc:int(343), ldc:int(9225))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
            var_3_68D = and:int(var_3_68D:int, ldc:int(-675126023))
            goto(Label_0108)
        }
    }
}
