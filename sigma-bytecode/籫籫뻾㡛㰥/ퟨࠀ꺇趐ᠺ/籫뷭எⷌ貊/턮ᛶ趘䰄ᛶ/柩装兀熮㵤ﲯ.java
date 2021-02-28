public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u67e9\u88c5\u5140\u71ae\u3d64\ufcaf {
    public void \u67e9\u88c5\u5140\u71ae\u3d64\ufcaf(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u47c2\ubded\u12cb\u3dd3\u12cb\u0800 p0) {
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
    
    public \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u92ee\u3a62\u4179\u600f\u0c95<? extends \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ub113\u983f\u7e3f\ud36e\uc7fe> \u6b5f\u4f52\u927d\u5d20\uc238\u7043(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, boolean p3) {
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
            return:\u92ee\u3a62\u4179\u600f\u0c95<? extends \ub113\u983f\u7e3f\ud36e\uc7fe>(invokedynamic:\u92ee\u3a62\u4179\u600f\u0c95<? extends \ub113\u983f\u7e3f\ud36e\uc7fe>(\u61a4\u74b1\ud4fe\u8258\ua562\u8640:()L\u8cae\u8bb0\ucef1\u8c8a\u3a62/\u92ee\u3a62\u4179\u600f\u0c95;))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52 \u6b5f\u5fe1\ua3b4\u873d\u71ae\ub113(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u5d20\u97b7\u8753\u873d\u16f6.\u718f\u6435\uc31c\u4ab3\u98a4 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u494c\u4975\ua068\u0c95\uc84e.\ucfaf\u9255\u839e\u8258\uc31c\u983f p3) {
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
            return:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(getstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u67e9\u88c5\u5140\u71ae\u3d64\ufcaf::\u1187\u8413\u4c04\u59ec\u3c25\u3a62))
        }
        
        goto(Label_0006)
    }
    
    public \u12b2\u4e72\u8df4\u67e9\u67e9.\u5245\ubff1\ub18d\u6b5f\u3e2a\u156b \u9a18\ub171\u8aa5\u71ae\ub70c\ubb2b(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0) {
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
            return:\u5245\ubff1\ub18d\u6b5f\u3e2a\u156b(getstatic:\u5245\ubff1\ub18d\u6b5f\u3e2a\u156b(\u5245\ubff1\ub18d\u6b5f\u3e2a\u156b::\ud7e8\u59ec\u3776\u7af6\u8d90\u3e2a))
        }
        
        goto(Label_0006)
    }
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d \u983f\u3504\uc29a\ub113\uc238\u5fe1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3bc9\u3776\u6d69\u7af6\ub32d\u64f2 p0) {
        var_2_5F : int
        var_4_6B : \uf995\u8709\ua61f\ub32d\ubff1\u99f7
        stack_B1_0 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d [generated]
        stack_B1_1 : \u3c25\ua61f\uff55\u92ff\u6b0d\ucef1 [generated]
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
            var_2_5F = and:int(ldc:int(-1643485768), ldc:int(-410163216))
            var_4_6B = invokevirtual:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u9033\u3711\u494c\u88c5\u69d9\u97b7, invokevirtual:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ud158\u0c95\u9937\u2dcc\u4f4a\ub83f::\uae5d\ud171\u6b5f\u8753\u8753\u5db4, p0:\u3bc9\u3776\u6d69\u7af6\ub32d\u64f2[expected:\ud158\u0c95\u9937\u2dcc\u4f4a\ub83f]), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u3bc9\u3776\u6d69\u7af6\ub32d\u64f2::\u3d64\u67e9\u5245\u4daf\u8d90\uafe7, p0:\u3bc9\u3776\u6d69\u7af6\ub32d\u64f2))
            stack_B1_0 = checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, this:\u67e9\u88c5\u5140\u71ae\u3d64\ufcaf[expected:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a]), getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u67e9\u88c5\u5140\u71ae\u3d64\ufcaf::\u120d\u3e2a\u64ab\u9255\ub1b9\u071d), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u759a\u4bc8\u873d\ud171\ub32d\u7873, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\ud158\u0c95\u9937\u2dcc\u4f4a\ub83f::\uff55\u7d52\u120d\u5db4\u6c56\u7330, p0:\u3bc9\u3776\u6d69\u7af6\ub32d\u64f2[expected:\ud158\u0c95\u9937\u2dcc\u4f4a\ub83f]))))
            stack_B1_1 = getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1(\u67e9\u88c5\u5140\u71ae\u3d64\ufcaf::\u0c95\u8413\u8753\u759a\u8413\u9937)
            
            if (cmpne:boolean(invokevirtual:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f(\uf995\u8709\ua61f\ub32d\ubff1\u99f7::\u156b\ubb2b\u4492\u647c\ud217\uc4d2, var_4_6B:\uf995\u8709\ua61f\ub32d\ubff1\u99f7), getstatic:\ub102\u4f4a\u7bad\u3711\uc7fe\u59ec[expected:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f](\u69d9\ud12e\uae5d\u8258\ub18d\ub32d::\u7e3f\u3dd3\ua6bd\uae87\ubff1\uceb8))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-824903747))
                stack_AE_0 = and:int(ldc:int(-24410), ldc:int(24144))
            }
            else {
                stack_AE_0 = and:int(ldc:int(6705), ldc:int(449))
            }
            
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<Object, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, stack_B1_0:\uc31c\u74b1\u8389\u494c\u88c5\u446c<Object, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>, stack_B1_1:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>, invokestatic:Boolean(Boolean::valueOf, stack_AE_0:boolean[expected:int]))))
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u9af2\ucef1\ub102\u16f6\u61a4\ud523 \u6bb9\u6435\uc31c\u3bd6\u7043\u9255(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p3, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\ub113\u6c56\u97e6\u51b2\u4c2b p4, \ub113\uc4d2\u183a\u527a\u6435.\ud4fe\u120d\u9a18\u385b\u4492\u5f50 p5) {
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
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1 \ufe34\u0c95\u67d0\uc31c\u6bb9\u3d64(\u5d20\u97b7\u8753\u873d\u16f6.\u718f\u6435\uc31c\u4ab3\u98a4 p0) {
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
            return:\ub83f\uc9f6\u47c2\u67d0\u7ce1(initobject:\uc246\u7049\ub70c\u6b5f\ubf56[expected:\ub83f\uc9f6\u47c2\u67d0\u7ce1](\uc246\u7049\ub70c\u6b5f\ubf56::<init>))
        }
        
        goto(Label_0006)
    }
    
    public void \u6d99\u156b\ud12e\ubff1\u3711\u74b1(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, java.util.Random p3) {
        var_5_63 : int
        var_7_6C : int
        var_8_AB : int
        var_9_C9 : int
        
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
            var_5_63 = and:int(ldc:int(957110206), ldc:int(-579022338))
            var_7_6C = and:int(ldc:int(980), ldc:int(-2005))
            
            loop {
                var_5_63 = and:int(var_5_63:int, ldc:int(-1818409090))
                
                if (cmpge:boolean(var_7_6C:int, and:int(ldc:int(79), ldc:int(4611)))) {
                    looporswitchbreak()
                }
                
                var_8_AB = sub:int(mul:int(invokevirtual:int(Random::nextInt, p3:Random, and:int(ldc:int(898), ldc:int(10343))), and:int(ldc:int(1322), ldc:int(18))), and:int(ldc:int(8201), ldc:int(5297)))
                var_9_C9 = sub:int(mul:int(invokevirtual:int(Random::nextInt, p3:Random, xor:int(ldc:int(1584), ldc:int(1586))), xor:int(ldc:int(339), ldc:int(337))), and:int(ldc:int(565), ldc:int(19467)))
                invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u385b\u8c8a\uf9c5\u6ec6\ufcaf\u5fe1, p1:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, getstatic:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140[expected:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a](\u34df\u8d98\ua3b4\u873d\ud217\u4c2b::\u5d20\u67d0\u97b7\u4cd9\u3e2a\ud217), add:double(add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.5)), mul:double(ldc:double(0.25), i2d:double(var_8_AB:int))), f2d:double(add:float(i2f:float(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokevirtual:float(Random::nextFloat, p3:Random))), add:double(add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.5)), mul:double(ldc:double(0.25), i2d:double(var_9_C9:int))), f2d:double(mul:float(invokevirtual:float(Random::nextFloat, p3:Random), i2f:float(var_8_AB:int))), mul:double(sub:double(f2d:double(invokevirtual:float(Random::nextFloat, p3:Random)), ldc:double(0.5)), ldc:double(0.125)), f2d:double(mul:float(invokevirtual:float(Random::nextFloat, p3:Random), i2f:float(var_9_C9:int))))
                inc:int(var_7_6C, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d \u6b5f\u9937\u5f50\u516c\ub32d\uceb8(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7049\u52d3\u8640\u5654\u1833\ub18d p1) {
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
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u67e9\u88c5\u5140\u71ae\u3d64\ufcaf::\u120d\u3e2a\u64ab\u9255\ub1b9\u071d), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d, checkcast:\u760c\u4975\u4179\uc246\u8640\u64f2(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2.class, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u760c\u4975\u4179\uc246\u8640\u64f2>](\u67e9\u88c5\u5140\u71ae\u3d64\ufcaf::\u120d\u3e2a\u64ab\u9255\ub1b9\u071d)))))))
        }
        
        goto(Label_0006)
    }
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d \ub19c\u6ec6\u8640\uc2e8\u3bd6\ucef1(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u56bd\u8413\u647c\u5bc4\ud158.\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5 p1) {
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
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u71f1\u6b0d\ud217\ua61f\u4bc8\u4bc8, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], invokevirtual:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5::\u71f1\u88c5\u51fa\u6fb0\u873d\uc910, p1:\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5, checkcast:\u760c\u4975\u4179\uc246\u8640\u64f2(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2.class, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u760c\u4975\u4179\uc246\u8640\u64f2>](\u67e9\u88c5\u5140\u71ae\u3d64\ufcaf::\u120d\u3e2a\u64ab\u9255\ub1b9\u071d))))))
        }
        
        goto(Label_0006)
    }
    
    public void \u69d9\u8640\u12cb\ua068\u7ce1\u61a4(\u71f1\uc910\u3bc9\u516c\u93a2.\u7049\u71ae\u51fa\u64ab\ubefe\ube23<\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d> p0) {
        expr_6A : \u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d[] [generated]
        
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
            expr_6A = newarray:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d[](\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d.class, and:int(ldc:int(13058), ldc:int(16418)))
            storeelement:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d(expr_6A:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d[], and:int(ldc:int(-4913), ldc:int(4912)), getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d](\u67e9\u88c5\u5140\u71ae\u3d64\ufcaf::\u120d\u3e2a\u64ab\u9255\ub1b9\u071d))
            storeelement:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d(expr_6A:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d[], xor:int(ldc:int(-29632), ldc:int(-29631)), getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d](\u67e9\u88c5\u5140\u71ae\u3d64\ufcaf::\u0c95\u8413\u8753\u759a\u8413\u9937))
            invokevirtual:\u7049\u71ae\u51fa\u64ab\ubefe\ube23<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\u7049\u71ae\u51fa\u64ab\ubefe\ube23<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u9af2\ua3b4\u3dd3\ub102\u3c25\uc31c, p0:\u7049\u71ae\u51fa\u64ab\ubefe\ube23<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>, expr_6A:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u7043\u88c5\u5db4\uf94d.\uf995\u8709\ua61f\ub32d\ubff1\u99f7 \u97b7\uf9c5\uc2e8\uc2e8\u7330\u71ae(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0) {
        var_2_61 : int
        stack_97_0 : \uf995\u8709\ua61f\ub32d\ubff1\u99f7 [generated]
        
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
            var_2_61 = and:int(ldc:int(308769294), ldc:int(593311103))
            
            if (logicalnot:boolean(invokevirtual:boolean(Boolean::booleanValue, checkcast:Boolean(java.lang.Boolean.class, invokevirtual:Boolean(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Boolean>](\u67e9\u88c5\u5140\u71ae\u3d64\ufcaf::\u0c95\u8413\u8753\u759a\u8413\u9937)))))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(248369874))
                stack_97_0 = invokespecial:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\u071d\u69d9\u69d9\u8cae\ub8be\u600f::\u97b7\uf9c5\uc2e8\uc2e8\u7330\u71ae, this:\u67e9\u88c5\u5140\u71ae\u3d64\ufcaf[expected:\u071d\u69d9\u69d9\u8cae\ub8be\u600f], p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
            }
            else {
                stack_97_0 = invokevirtual:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\ub102\u4f4a\u7bad\u3711\uc7fe\u59ec::\uc29a\u0b8e\uceb8\u9937\u6bb9\u7873, getstatic:\ub102\u4f4a\u7bad\u3711\uc7fe\u59ec(\u69d9\ud12e\uae5d\u8258\ub18d\ub32d::\u7e3f\u3dd3\ua6bd\uae87\ubff1\uceb8), and:int[expected:boolean](ldc:int(12320), ldc:int(-12321)))
            }
            
            return:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(stack_97_0:\uf995\u8709\ua61f\ub32d\ubff1\u99f7)
        }
        
        goto(Label_0006)
    }
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d \u8258\u527a\u5db4\uc84e\u5bc4\u7c6b(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p1, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd p3, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p4, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p5) {
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
            
            if (invokevirtual:boolean(Boolean::booleanValue, checkcast:Boolean(java.lang.Boolean.class, invokevirtual:Boolean(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Boolean>](\u67e9\u88c5\u5140\u71ae\u3d64\ufcaf::\u0c95\u8413\u8753\u759a\u8413\u9937))))) {
                invokeinterface:void(\u8258\uc238\u7e3f\u36d3\uc238<\ub102\u4f4a\u7bad\u3711\uc7fe\u59ec>::\u71ae\u4bc8\u74b1\u97b7\u67e9\ud217, invokeinterface:\u8258\uc238\u7e3f\u36d3\uc238<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u8cae\u4f4a\ud217\u8709\u4cd9\ud51e, p3:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd), p4:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\ub102\u4f4a\u7bad\u3711\uc7fe\u59ec(\u69d9\ud12e\uae5d\u8258\ub18d\ub32d::\u7e3f\u3dd3\ua6bd\uae87\ubff1\uceb8), invokevirtual:int(\u8cae\ucb79\ud7e8\ub8be\u156b\u960f::\u92ee\u8d98\ub171\u8753\u5f50\u4c04, getstatic:\ub102\u4f4a\u7bad\u3711\uc7fe\u59ec[expected:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f](\u69d9\ud12e\uae5d\u8258\ub18d\ub32d::\u7e3f\u3dd3\ua6bd\uae87\ubff1\uceb8), p3:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a]))
            }
            
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(invokespecial:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u071d\u69d9\u69d9\u8cae\ub8be\u600f::\u8258\u527a\u5db4\uc84e\u5bc4\u7c6b, this:\u67e9\u88c5\u5140\u71ae\u3d64\ufcaf[expected:\u071d\u69d9\u69d9\u8cae\ub8be\u600f], p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p1:\u760c\u4975\u4179\uc246\u8640\u64f2, p2:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p3:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd, p4:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p5:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u7873\u1187\u71f1\u600f\ud51e\ub70c(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u5d20\u97b7\u8753\u873d\u16f6.\u718f\u6435\uc31c\u4ab3\u98a4 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u516c\u3d64\u718f\ub171\u6b5f.\uc4d2\ufcaf\u4f52\u120d\uc2e8\u7873 p3) {
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
            return:boolean(and:int[expected:boolean](ldc:int(27145), ldc:int(-27246)))
        }
        
        goto(Label_0006)
    }
    
    private static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub1b9\u62da\u9af2\u92ee\u64f2 lambda$\u7043\u759a\u8709\ucb79\u5d20\u8753$1(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u718f\u5d20\u4f52\u92ee\u8709 p0, int p1, \ub113\ufcaf\u3c25\u071d\u97b7.\u0b8e\ud4fe\uc229\u92ee\ud4fe p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p3) {
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
            return:\ub1b9\u62da\u9af2\u92ee\u64f2(invokestatic:\u6ec6\u61a4\u4c04\u120d\u4f52[expected:\ub1b9\u62da\u9af2\u92ee\u64f2](\u6ec6\u61a4\u4c04\u120d\u4f52::\uc246\u156b\u624e\ud171\ub113\u983f, p1:int, p2:\u0b8e\ud4fe\uc229\u92ee\ud4fe, p0:\u718f\u5d20\u4f52\u92ee\u8709[expected:\ua61f\uae87\u6b5f\uc31c\ud12e]))
        }
        
        goto(Label_0006)
    }
    
    private static \u59ec\u8413\u97e6\uc229\u3776.\uc229\u8413\ufcaf\u99f7\u494c lambda$\u071d\u600f\u9937\ub113\u183a\u9a18$0() {
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
            return:\uc229\u8413\ufcaf\u99f7\u494c(getstatic:\uc229\u8413\ufcaf\u99f7\u494c<\uc246\u7049\ub70c\u6b5f\ubf56>(\uc229\u8413\ufcaf\u99f7\u494c::\ub7dc\u624e\u183a\uc9f6\u8350\uae87))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1CD : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_D9_0 : byte[] [generated]
        stack_110_0 : byte[] [generated]
        stack_112_0 : byte[] [generated]
        stack_13F_0 : byte[] [generated]
        stack_1E8_0 : byte[] [generated]
        stack_239_0 : byte[] [generated]
        stack_2B1_0 : byte[] [generated]
        stack_30B_0 : byte[] [generated]
        var_4_1B8 : int
        var_3_1BD : byte[]
        var_5_1BE : int
        expr_1E8 : byte [generated]
        var_0_301 : int
        expr_30B : byte [generated]
        stack_33B_2 : byte [generated]
        var_2_A5 : byte[]
        expr_A9 : int [generated]
        var_3_227 : byte[]
        var_5_228 : int
        expr_D9 : int [generated]
        expr_112 : int [generated]
        var_3_14B : String
        expr_153 : String[] [generated]
        expr_15D : String[] [generated]
        var_3_180 : String[]
        
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
        var_0_1CD = and:int(ldc:int(-734643208), ldc:int(-706217124))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_D7_0 = stack_D9_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_1E8_0 = stack_239_0 = stack_2B1_0 = stack_30B_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("wcG53Zs7w6/bSK/Ts7W9m4p1npoM")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1B8 = expr_6E:int
        var_3_1BD = newarray:byte[](byte.class, expr_6E:int)
        var_5_1BE = expr_6E:int
        Label_0448:
        
        while (cmpne:boolean(and:int(var_0_1CD:int, ldc:int(131072)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1CD:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0640)
            }
            
            var_0_1CD = and:int(var_0_1CD:int, ldc:int(419426109))
            var_5_1BE = add:int(var_5_1BE:int, ldc:int(-1))
            expr_1E8 = loadelement:byte(stack_1E8_0:byte[], var_5_1BE:int)
            storeelement:byte(var_3_1BD:byte[], var_5_1BE:int, or:int(and:int(shl:int(expr_1E8:byte, and:int(ldc:int(10380), ldc:int(4948))), ldc:int(-16)), and:int(shr:int(expr_1E8:byte[expected:int], xor:int(ldc:int(-20415), ldc:int(-20411))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1BE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_1E8_0 = stack_239_0 = stack_2B1_0 = stack_30B_0 = var_3_1BD:byte[]
            goto(Label_0115)
        }
        
        var_0_1CD = and:int(var_0_1CD:int, ldc:int(1698066635))
        goto(Label_0739)
        Label_0640:
        
        while (cmpne:boolean(and:int(var_0_1CD:int, ldc:int(268435456)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1CD:int, ldc:int(32768)), ldc:int(0))) {
                var_0_1CD = and:int(var_0_1CD:int, ldc:int(-342734352))
                goto(Label_0448)
            }
            
            var_0_1CD = and:int(var_0_1CD:int, ldc:int(-762840261))
            var_5_1BE = add:int(var_5_1BE:int, ldc:int(-1))
            storeelement:byte(var_3_1BD:byte[], var_5_1BE:int, add:byte(xor:byte(loadelement:byte(stack_2B1_0:byte[], var_5_1BE:int), ldc:byte(64)), ldc:byte(98)))
            
            if (cmpne:boolean(var_5_1BE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_1E8_0 = stack_239_0 = stack_2B1_0 = stack_30B_0 = var_3_1BD:byte[]
            goto(Label_0222)
        }
        
        var_0_1CD = and:int(var_0_1CD:int, ldc:int(1581604940))
        Label_0739:
        
        while (cmpne:boolean(and:int(var_0_1CD:int, ldc:int(131072)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1CD:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_1CD = and:int(var_0_1CD:int, ldc:int(-1124202009))
                goto(Label_0448)
            }
            
            var_0_301 = and:int(var_0_1CD:int, ldc:int(835186456))
            var_5_1BE = add:int(var_5_1BE:int, ldc:int(-1))
            expr_30B = loadelement:byte(stack_30B_0:byte[], var_5_1BE:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_1BE:int, ldc:int(4)), neg:int(var_4_1B8:int)), ldc:int(0))) {
                var_0_301 = and:int(var_0_301:int, ldc:int(871250747))
                stack_33B_2 = add:byte(expr_30B:byte, ldc:byte(4))
            }
            else {
                stack_33B_2 = add:byte(expr_30B:byte, loadelement:byte(var_3_1BD:byte[], add:int(var_5_1BE:int, ldc:int(4))))
            }
            
            var_0_1CD = and:int(var_0_301:int, ldc:int(-7885925))
            storeelement:byte(var_3_1BD:byte[], var_5_1BE:int, stack_33B_2:byte)
            
            if (cmpne:boolean(var_5_1BE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_1E8_0 = stack_239_0 = stack_2B1_0 = stack_30B_0 = var_3_1BD:byte[]
            goto(Label_0279)
        }
        
        goto(Label_0640)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_1CD:int, ldc:int(16)), ldc:int(0))) {
            var_0_1CD = and:int(var_0_1CD:int, ldc:int(-769687889))
            goto(Label_0279)
        }
        
        if (cmpne:boolean(and:int(var_0_1CD:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_1CD = and:int(var_0_1CD:int, ldc:int(-669268182))
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_1CD:int, ldc:int(256)), ldc:int(0))) {
            var_0_1CD = and:int(var_0_1CD:int, ldc:int(-1630094372))
            var_2_A5 = stack_A5_0:byte[]
            expr_A9 = add:int(arraylength:int(stack_A7_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A9:int, ldc:int(0))) {
                var_3_227 = newarray:byte[](byte.class, expr_A9:int)
                var_5_228 = expr_A9:int
                
                loop {
                    var_0_1CD = and:int(var_0_1CD:int, ldc:int(945254266))
                    var_5_228 = add:int(var_5_228:int, ldc:int(-1))
                    storeelement:byte(var_3_227:byte[], var_5_228:int, add:int(shl:int(loadelement:byte(stack_239_0:byte[], var_5_228:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_A5:byte[], add:int(var_5_228:int, xor:int(ldc:int(24576), ldc:int(24577)))), ldc:int(5)), xor:int(ldc:int(-32234), ldc:int(-32239)))))
                    
                    if (cmpne:boolean(var_5_228:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_1E8_0 = stack_239_0 = stack_2B1_0 = stack_30B_0 = var_3_227:byte[]
            }
        }
        
        Label_0174:
        
        if (cmpne:boolean(and:int(var_0_1CD:int, ldc:int(32768)), ldc:int(0))) {
            var_0_1CD = and:int(var_0_1CD:int, ldc:int(-2048467948))
            goto(Label_0279)
        }
        
        if (cmpne:boolean(and:int(var_0_1CD:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1CD:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_1CD = and:int(var_0_1CD:int, ldc:int(-73503910))
            expr_D9 = arraylength:int(stack_D9_0:byte[])
            
            if (cmpne:boolean(expr_D9:int, ldc:int(0))) {
                var_4_1B8 = expr_D9:int
                var_3_1BD = newarray:byte[](byte.class, expr_D9:int)
                var_5_1BE = expr_D9:int
                goto(Label_0640)
            }
        }
        
        Label_0222:
        
        if (cmpne:boolean(and:int(var_0_1CD:int, ldc:int(65536)), ldc:int(0))) {
            var_0_1CD = and:int(var_0_1CD:int, ldc:int(-928313213))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_1CD:int, ldc:int(256)), ldc:int(0))) {
                var_0_1CD = and:int(var_0_1CD:int, ldc:int(1506523785))
                goto(Label_0174)
            }
            
            if (cmpne:boolean(and:int(var_0_1CD:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_1CD = and:int(var_0_1CD:int, ldc:int(-211292292))
            expr_112 = arraylength:int(stack_112_0:byte[])
            
            if (cmpne:boolean(expr_112:int, ldc:int(0))) {
                var_4_1B8 = expr_112:int
                var_3_1BD = newarray:byte[](byte.class, expr_112:int)
                var_5_1BE = expr_112:int
                goto(Label_0739)
            }
        }
        
        Label_0279:
        
        if (cmpeq:boolean(and:int(var_0_1CD:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpeq:boolean(and:int(var_0_1CD:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0174)
        }
        
        if (cmpeq:boolean(and:int(var_0_1CD:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_1CD = and:int(var_0_1CD:int, ldc:int(-1469655170))
            goto(Label_0115)
        }
        
        var_3_14B = initobject:String(String::<init>, stack_13F_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_153 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(1672), ldc:int(1673)))
        expr_15D = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(18085), ldc:int(265)))
        storeelement:String(expr_153:String[], and:int(ldc:int(30384), ldc:int(-30386)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(30992), ldc:int(-31537)), and:int(ldc:int(22), ldc:int(16404))))
        putstatic:String[](\u67e9\u88c5\u5140\u71ae\u3d64\ufcaf::\u6c56\uc246\u3e75\u3776\ub113\u12cb, expr_15D:String[])
        var_3_180 = expr_153:String[]
        putstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a(\u67e9\u88c5\u5140\u71ae\u3d64\ufcaf::\u120d\u3e2a\u64ab\u9255\ub1b9\u071d, getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a(\u51fa\uc29a\ud51e\u71ae\u759a\ua6bd::\u8709\u6d69\u0b8e\ua068\uff55\u6fb0))
        putstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1(\u67e9\u88c5\u5140\u71ae\u3d64\ufcaf::\u0c95\u8413\u8753\u759a\u8413\u9937, getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1(\u392e\u47c2\ud171\ub171\u4f4a\u64ab::\u156b\u385b\u8709\u839e\u71ae\ube23))
        putstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u67e9\u88c5\u5140\u71ae\u3d64\ufcaf::\u1187\u8413\u4c04\u59ec\u3c25\u3a62, invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u4179\u718f\u4bc8\ubff1\u4f4a\u4bc8, ldc:double(1.0), ldc:double(0.0), ldc:double(1.0), ldc:double(15.0), ldc:double(14.0), ldc:double(15.0)))
        putstatic:ITextComponent(\u67e9\u88c5\u5140\u71ae\u3d64\ufcaf::\u61a4\u92ee\u5f50\u74b1\ud12e\u47c2, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_180:String[], and:int(ldc:int(1287), ldc:int(-1288)))))
    }
    
    public void \u9a18\u61a4\u8c8a\u5245\u1187\u7bad(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
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
        var_3_67B = and:int(ldc:int(103790950), ldc:int(2142199327))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u67e9\u88c5\u5140\u71ae\u3d64\ufcaf[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
            var_3_67B = and:int(var_3_67B:int, ldc:int(-1737403759))
        }
        else {
            var_3_67B = and:int(var_3_67B:int, ldc:int(1848819026))
            var_5_8A = and:int(ldc:int(16806), ldc:int(-19455))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-8154), ldc:int(5208)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_67B:int, ldc:int(-432825065))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(4673), ldc:int(2049)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(8704), ldc:int(8705)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_67B = and:int(var_3_E3:int, ldc:int(1042779190))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(22677), ldc:int(353)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(532767079))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(618609623))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2028112609))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-2039503651))
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1903677515))
                    }
                    else {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-562111652))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-930711487))
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-397958517))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2079748224))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(648956749))
                            var_11_F4 = and:int(ldc:int(7364), ldc:int(-23781))
                            goto(Label_1544)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0586:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1298264236))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-599447701))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1607642179))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2011835074))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0702:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(201358850))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-177373947))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-446525365))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-170738998))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1481986861))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0834:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1083743664))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(387777826))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1116598132))
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1450357182))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-230437957))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1653813540))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(938409759))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = xor:int(ldc:int(4097), ldc:int(4096))
                                goto(Label_1128)
                            }
                        }
                    }
                    
                    Label_0977:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1263911453))
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1185969238))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1014483449))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-293627798))
                        var_11_F4 = and:int(ldc:int(497), ldc:int(-7670))
                    }
                    
                    Label_1128:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1952564562))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-345825728))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0977)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1488346070))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1494773921))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1416)
                            }
                        }
                    }
                    
                    Label_1244:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1132422203))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1572172672))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(2132008289))
                            goto(Label_1128)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1545071140))
                            goto(Label_0977)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(264760965))
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1714538816))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(157354556))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1737466322))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-954053494))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1544)
                    }
                    
                    Label_1416:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1640225358))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-572954749))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(698027709))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_67B = and:int(var_3_67B:int, ldc:int(1714839308))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1544:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_686 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1555:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-889327435))
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-251229246))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(56659020))
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(937584928))
                        var_17_686 = add:int(var_16_122:int, and:int(ldc:int(5521), ldc:int(24585)))
                        looporswitchbreak()
                    }
                }
                
                var_3_67B = and:int(var_3_67B:int, ldc:int(652431105))
                
                if (cmple:boolean(var_5_8A = var_17_686:int, sub:int(var_6_91:int, xor:int(ldc:int(16521), ldc:int(16520))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_67B = and:int(var_3_67B:int, ldc:int(460856700))
            goto(Label_0108)
        }
    }
}
