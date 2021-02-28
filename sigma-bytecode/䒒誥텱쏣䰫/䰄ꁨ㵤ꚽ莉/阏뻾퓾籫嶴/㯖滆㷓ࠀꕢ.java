public abstract class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u3bd6\u6ec6\u3dd3\u0800\ua562 {
    public static com.mojang.datafixers.Products$P3<com.mojang.serialization.codecs.RecordCodecBuilder$Mu<P>, java.lang.Integer, java.lang.Integer, java.lang.Integer> \ucfaf\u6fb0\u16f6\u4cd9\u836c\uc7fe(com.mojang.serialization.codecs.RecordCodecBuilder$Instance<P> p0) {
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
    
    public void \u3bd6\u6ec6\u3dd3\u0800\ua562(int p0, int p1, int p2) {
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
            invokespecial:Object(Object::<init>, this:\u3bd6\u6ec6\u3dd3\u0800\ua562)
            putfield:int(\u3bd6\u6ec6\u3dd3\u0800\ua562::\u0c95\u1187\u51b2\u385b\u16f6\u4ab3, this:\u3bd6\u6ec6\u3dd3\u0800\ua562, p0:int)
            putfield:int(\u3bd6\u6ec6\u3dd3\u0800\ua562::\ub8be\u3d4b\ud51e\u92ee\ua068\ubff1, this:\u3bd6\u6ec6\u3dd3\u0800\ua562, p1:int)
            putfield:int(\u3bd6\u6ec6\u3dd3\u0800\ua562::\u9937\u927d\u71f1\u1187\u7ce1\u3bc9, this:\u3bd6\u6ec6\u3dd3\u0800\ua562, p2:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public abstract \u6435\ub8be\u718f\u6b0d\u67e9.\u97e6\ub19c\uc2bd\u873d\u8640<?> \u3bd6\uc87f\ub83f\u92ee\u71ae\u92ff();
    
    public abstract java.util.List<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u516c\u5fe1\u8c8a\u9255\ubb2b> \u120d\u61a4\u120d\ubb2b\u3a62\ua3b4(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ucef1\u6d69\u946b\u97e6\u6b5f p0, java.util.Random p1, int p2, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p3, java.util.Set<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> p4, \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 p5, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3776\u8df4\u7af6\uc31c\u5f50\u47c2 p6);
    
    public int \uc229\u5bc4\u3d64\u3776\u983f\u7330(java.util.Random p0) {
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
            return:int(add:int(add:int(getfield:int(\u3bd6\u6ec6\u3dd3\u0800\ua562::\u0c95\u1187\u51b2\u385b\u16f6\u4ab3, this:\u3bd6\u6ec6\u3dd3\u0800\ua562), invokevirtual:int(Random::nextInt, p0:Random, add:int(getfield:int(\u3bd6\u6ec6\u3dd3\u0800\ua562::\ub8be\u3d4b\ud51e\u92ee\ua068\ubff1, this:\u3bd6\u6ec6\u3dd3\u0800\ua562), and:int(ldc:int(14387), ldc:int(16641))))), invokevirtual:int(Random::nextInt, p0:Random, add:int(getfield:int(\u3bd6\u6ec6\u3dd3\u0800\ua562::\u9937\u927d\u71f1\u1187\u7ce1\u3bc9, this:\u3bd6\u6ec6\u3dd3\u0800\ua562), xor:int(ldc:int(68), ldc:int(69))))))
        }
        
        goto(Label_0006)
    }
    
    public static void \ua61f\u6c56\ub102\u8308\u5d20\u74b1(\u5d20\u7043\u88c5\u5db4\uf94d.\u72f1\u7ce1\ucef1\ub83f\u516c p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p2, \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 p3) {
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
            invokestatic:void(\uc246\ud158\u99f7\u64f2\u5f50\u6c52::\u6ec6\u71ae\u7e3f\u40a9\u0800\ubf56, p0:\u72f1\u7ce1\ucef1\ub83f\u516c, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p2:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
            invokevirtual:void(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u120d\u7e3f\ub7dc\ua6bd\u873d\u7049, p3:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, initobject:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::<init>, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean \u8753\ua562\ua61f\ud4fe\u527a\ub18d(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u527a\u8aa5\u34df\u7d52\u7e3f p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
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
    
    public static void \u4c04\u56bd\ubf56\u4bc8\u0b8e\u6c56(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ucef1\u6d69\u946b\u97e6\u6b5f p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
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
            
            if (logicalnot:boolean(invokestatic:boolean(\u3bd6\u6ec6\u3dd3\u0800\ua562::\u8753\ua562\ua61f\ud4fe\u527a\ub18d, p0:\ucef1\u6d69\u946b\u97e6\u6b5f[expected:\u527a\u8aa5\u34df\u7d52\u7e3f], p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                invokestatic:void(\uc246\ud158\u99f7\u64f2\u5f50\u6c52::\u6ec6\u71ae\u7e3f\u40a9\u0800\ubf56, p0:\ucef1\u6d69\u946b\u97e6\u6b5f[expected:\u72f1\u7ce1\ucef1\ub83f\u516c], p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u51fa\u4492\ubb2b\u7006\u8350\u4ab3)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u4492\u72f1\u5db4\ubf56\u34df\ub18d(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ucef1\u6d69\u946b\u97e6\u6b5f p0, java.util.Random p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, java.util.Set<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> p3, \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 p4, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3776\u8df4\u7af6\uc31c\u5f50\u47c2 p5) {
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
        
        if (logicalnot:boolean(invokestatic:boolean(\uc246\ud158\u99f7\u64f2\u5f50\u6c52::\u64ab\u5140\u6b5f\u98a4\u71f1\u946b, p0:\ucef1\u6d69\u946b\u97e6\u6b5f[expected:\u527a\u8aa5\u34df\u7d52\u7e3f], p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
            return:boolean(and:int[expected:boolean](ldc:int(-22663), ldc:int(22662)))
        }
        
        invokestatic:void(\u3bd6\u6ec6\u3dd3\u0800\ua562::\ua61f\u6c56\ub102\u8308\u5d20\u74b1, p0:\ucef1\u6d69\u946b\u97e6\u6b5f[expected:\u72f1\u7ce1\ucef1\ub83f\u516c], p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u4cd9\uceb8\uc229\u416d\ud217\u12cb::\uc246\ube23\u5d20\u71ae\u600f\ud12e, getfield:\u4cd9\uceb8\uc229\u416d\ud217\u12cb(\u3776\u8df4\u7af6\uc31c\u5f50\u47c2::\u8c8a\u4975\u93a2\u8c8a\ubb2b\u5245, p5:\u3776\u8df4\u7af6\uc31c\u5f50\u47c2), p1:Random, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), p4:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)
        invokeinterface:boolean(Set<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::add, p3:Set<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u183a\u647c\u71f1\u6435\u6c52\u8df4, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
        return:boolean(xor:int[expected:boolean](ldc:int(-32256), ldc:int(-32255)))
    }
    
    public static void \u4c04\u8389\uafe7\u3776\ucfaf\u7ce1(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ucef1\u6d69\u946b\u97e6\u6b5f p0, java.util.Random p1, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a p2, java.util.Set<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> p3, \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 p4, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3776\u8df4\u7af6\uc31c\u5f50\u47c2 p5) {
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
            
            if (invokestatic:boolean(\uc246\ud158\u99f7\u64f2\u5f50\u6c52::\ua6bd\ud51e\u0b8e\u0c95\u3c25\u718f, p0:\ucef1\u6d69\u946b\u97e6\u6b5f[expected:\u527a\u8aa5\u34df\u7d52\u7e3f], p2:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56])) {
                invokestatic:boolean(\u3bd6\u6ec6\u3dd3\u0800\ua562::\u4492\u72f1\u5db4\ubf56\u34df\ub18d, p0:\ucef1\u6d69\u946b\u97e6\u6b5f, p1:Random, p2:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56], p3:Set<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>, p4:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, p5:\u3776\u8df4\u7af6\uc31c\u5f50\u47c2)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u67e9\u0a06\u8df4\uff55\ua3b4\uae5d$3(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0) {
        var_1_5F : int
        stack_AE_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(1019874537), ldc:int(530575087))
            
            if (invokestatic:boolean(\u93a2\u1187\u5654\u8413\u3a62\ua61f<FC>::\u76bc\u6d99\uc84e\u7af6\u6b5f\ud158, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]))) {
                if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u9255\ud12e\ufcaf\u960f\ub18d\ud523)))) {
                    if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\ud36e\ubcb0\u839e\ua3b4\u4bc8\u5140)))) {
                        stack_AE_0 = xor:int[expected:boolean](ldc:int(4166), ldc:int(4167))
                        return:boolean(stack_AE_0:boolean)
                    }
                }
            }
            
            var_1_5F = and:int(var_1_5F:int, ldc:int(1038561011))
            stack_AE_0 = and:int[expected:boolean](ldc:int(11286), ldc:int(-11287))
            return:boolean(stack_AE_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Integer lambda$\ua6bd\u92ee\ub32d\u6d69\u4975\u64f2$2(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u3bd6\u6ec6\u3dd3\u0800\ua562 p0) {
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
            return:Integer(invokestatic:Integer(Integer::valueOf, getfield:int(\u3bd6\u6ec6\u3dd3\u0800\ua562::\u9937\u927d\u71f1\u1187\u7ce1\u3bc9, p0:\u3bd6\u6ec6\u3dd3\u0800\ua562)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Integer lambda$\uf9c5\uf94d\u8640\u3776\u7ce1\u5654$1(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u3bd6\u6ec6\u3dd3\u0800\ua562 p0) {
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
            return:Integer(invokestatic:Integer(Integer::valueOf, getfield:int(\u3bd6\u6ec6\u3dd3\u0800\ua562::\ub8be\u3d4b\ud51e\u92ee\ua068\ubff1, p0:\u3bd6\u6ec6\u3dd3\u0800\ua562)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Integer lambda$\ube23\u98a4\u3bc9\ud4fe\u8aa5\u1833$0(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u3bd6\u6ec6\u3dd3\u0800\ua562 p0) {
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
            return:Integer(invokestatic:Integer(Integer::valueOf, getfield:int(\u3bd6\u6ec6\u3dd3\u0800\ua562::\u0c95\u1187\u51b2\u385b\u16f6\u4ab3, p0:\u3bd6\u6ec6\u3dd3\u0800\ua562)))
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
            putstatic:Codec<\u3bd6\u6ec6\u3dd3\u0800\ua562>(\u3bd6\u6ec6\u3dd3\u0800\ua562::\u0800\u4f4a\uc229\u99f7\u1187\u6bb9, invokevirtual:Codec(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::dispatch, getstatic:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u97e6\ub19c\uc2bd\u873d\u8640<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\uc910\uc87f\ua068\ubb2b\u92ff\u3bc9), invokedynamic:Function<T, \u97e6\ub19c\uc2bd\u873d\u8640>(apply:()Ljava/util/function/Function;), invokedynamic:Function<T, Codec>(apply:()Ljava/util/function/Function;)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u51fa\uc31c\uae87\u446c\ud51e\u156b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_69F : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6AA : int
        
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
        var_3_69F = and:int(ldc:int(-891288880), ldc:int(-1652729133))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3bd6\u6ec6\u3dd3\u0800\ua562[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
            var_3_69F = and:int(var_3_69F:int, ldc:int(366642726))
        }
        else {
            var_3_69F = and:int(var_3_69F:int, ldc:int(1546707825))
            var_5_8A = and:int(ldc:int(-1869), ldc:int(1868))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-10654), ldc:int(10645)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_69F:int, ldc:int(1805906556))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, xor:int(ldc:int(8457), ldc:int(8456)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(2064), ldc:int(2065)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_69F = and:int(var_3_DA:int, ldc:int(-358394118))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(17408), ldc:int(17409)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-911454526))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-2114188080))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1250105944))
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1314950005))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0595)
                            }
                            
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(207468834))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1634144260))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-778787884))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(320107837))
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(811557678))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(2123538040))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(815805205))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1347594503))
                        var_11_EB = and:int(ldc:int(4773), ldc:int(-12968))
                        goto(Label_1562)
                    }
                    
                    Label_0595:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(942060735))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-545901421))
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(701922777))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(727921918))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1483123665))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0720:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-775327783))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1479604664))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1610553905))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-471295242))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1778081393))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0852:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-2145050251))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(32622352))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1205608402))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1182842041))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(859145986))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1997596683))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = xor:int(ldc:int(36), ldc:int(37))
                                goto(Label_1155)
                            }
                        }
                    }
                    
                    Label_0986:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1178574817))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1517950763))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1471033669))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1978539792))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-219722078))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1132840965))
                        var_11_EB = and:int(ldc:int(28288), ldc:int(-28289))
                    }
                    
                    Label_1155:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0986)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1194111300))
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(20258386))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-150082920))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-64261410))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1416)
                            }
                        }
                    }
                    
                    Label_1271:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1187675407))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1427774937))
                            goto(Label_1155)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0986)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(717810112))
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-900386835))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1372319510))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1331749884))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                            goto(Label_1562)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1416:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1099174534))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-426208975))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(366228343))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1299012343))
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1487328814))
                        loopcontinue()
                    }
                    
                    var_3_69F = and:int(var_3_69F:int, ldc:int(-637997443))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1562:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6AA = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1573:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-705764976))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1815043612))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(41070524))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1879052027))
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1790377555))
                        var_17_6AA = add:int(var_16_119:int, and:int(ldc:int(16545), ldc:int(1543)))
                        looporswitchbreak()
                    }
                    
                    var_3_69F = and:int(var_3_69F:int, ldc:int(-1836319266))
                }
                
                var_3_69F = and:int(var_3_69F:int, ldc:int(-1942613414))
                
                if (cmple:boolean(var_5_8A = var_17_6AA:int, sub:int(var_6_91:int, and:int(ldc:int(16945), ldc:int(5381))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(65536)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
