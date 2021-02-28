public class \u56bd\u8413\u647c\u5bc4\ud158.\u6b0d\uc3e3\u12cb\u5bc4\u0b8e {
    public void \u6b0d\uc3e3\u12cb\u5bc4\u0b8e(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56> p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u6435\u12b2\ua61f\u600f\uc238 p1, java.util.List<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u527a\u61a4\u760c\u40a9\ua068> p2, boolean p3, boolean p4, java.util.Optional<java.util.function.Supplier<\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56>> p5) {
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
    
    public void \u6b0d\uc3e3\u12cb\u5bc4\u0b8e(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u6435\u12b2\ua61f\u600f\uc238 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56> p1) {
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
    
    public \u56bd\u8413\u647c\u5bc4\ud158.\u6b0d\uc3e3\u12cb\u5bc4\u0b8e \u9a18\u8413\u7e3f\u3a62\ub19c\ubcb0(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u6435\u12b2\ua61f\u600f\uc238 p0) {
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
            return:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e(invokevirtual:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u6b0d\uc84e\ua068\ub83f\u3bd6\u9033, this:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e, getfield:List<\u527a\u61a4\u760c\u40a9\ua068>(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u946b\u34df\u88c5\ua562\u51fa\u3bd6, this:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e), p0:\u6435\u12b2\ua61f\u600f\uc238))
        }
        
        goto(Label_0006)
    }
    
    public \u56bd\u8413\u647c\u5bc4\ud158.\u6b0d\uc3e3\u12cb\u5bc4\u0b8e \u6b0d\uc84e\ua068\ub83f\u3bd6\u9033(java.util.List<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u527a\u61a4\u760c\u40a9\ua068> p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u6435\u12b2\ua61f\u600f\uc238 p1) {
        var_3_81 : int
        var_5_6C : \u6b0d\uc3e3\u12cb\u5bc4\u0b8e
        var_6_74 : Iterator<\u527a\u61a4\u760c\u40a9\ua068>
        var_7_106 : \u527a\u61a4\u760c\u40a9\ua068
        
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
            var_3_81 = and:int(ldc:int(-2030787182), ldc:int(-161632814))
            var_5_6C = initobject:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::<init>, p1:\u6435\u12b2\ua61f\u600f\uc238, getfield:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\ubcb0\ufcaf\u6cfe\uc238\u72f1\u6b0d, this:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e))
            var_6_74 = invokeinterface:Iterator<\u527a\u61a4\u760c\u40a9\ua068>(List<\u527a\u61a4\u760c\u40a9\ua068>::iterator, p0:List<\u527a\u61a4\u760c\u40a9\ua068>)
            
            loop {
                if (cmpne:boolean(and:int(var_3_81:int, ldc:int(64)), ldc:int(0))) {
                    var_3_81 = and:int(var_3_81:int, ldc:int(-1599743072))
                    goto(Label_0206)
                }
                
                if (cmpne:boolean(and:int(var_3_81:int, ldc:int(1)), ldc:int(0))) {
                    var_3_81 = and:int(var_3_81:int, ldc:int(686716962))
                }
                else {
                    var_3_81 = and:int(var_3_81:int, ldc:int(-814810314))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_6_74:Iterator<\u527a\u61a4\u760c\u40a9\ua068>)) {
                        var_7_106 = checkcast:\u527a\u61a4\u760c\u40a9\ua068(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u527a\u61a4\u760c\u40a9\ua068.class, invokeinterface:\u527a\u61a4\u760c\u40a9\ua068(Iterator<\u527a\u61a4\u760c\u40a9\ua068>::next, var_6_74:Iterator<\u527a\u61a4\u760c\u40a9\ua068>))
                        invokeinterface:boolean(List<\u527a\u61a4\u760c\u40a9\ua068>::add, getfield:List<\u527a\u61a4\u760c\u40a9\ua068>(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u946b\u34df\u88c5\ua562\u51fa\u3bd6, var_5_6C:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e), initobject:\u527a\u61a4\u760c\u40a9\ua068(\u527a\u61a4\u760c\u40a9\ua068::<init>, invokevirtual:int(\u527a\u61a4\u760c\u40a9\ua068::\u416d\u8308\u8389\u99f7\u3776\u3a62, var_7_106:\u527a\u61a4\u760c\u40a9\ua068), invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u527a\u61a4\u760c\u40a9\ua068::\u4179\u5654\ud51e\u4f52\u8640\u8413, var_7_106:\u527a\u61a4\u760c\u40a9\ua068))))
                        invokevirtual:void(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\uc31c\u8d98\ub1b9\ubded\uc4d2\u7006, var_5_6C:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e)
                        loopcontinue()
                    }
                }
                
                Label_0163:
                
                if (cmpeq:boolean(and:int(var_3_81:int, ldc:int(64)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_81:int, ldc:int(2)), ldc:int(0))) {
                        var_3_81 = and:int(var_3_81:int, ldc:int(14526068))
                        loopcontinue()
                    }
                    
                    var_3_81 = and:int(var_3_81:int, ldc:int(-1390414058))
                    invokevirtual:void(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u760c\uceb8\uceb8\u9937\uc4d2\u47c2, var_5_6C:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e, getfield:Supplier<\uc2e8\u9255\u647c\ud171\ubf56>(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u67d0\u64ab\u8640\u7873\uc2e8\u4cd9, this:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e))
                    
                    if (getfield:boolean(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u7006\u5140\uc9f6\u56bd\u960f\u64ab, this:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e)) {
                        invokevirtual:void(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u51fa\u4e72\uf94d\u7873\u64ab\u9937, var_5_6C:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e)
                    }
                }
                
                Label_0206:
                
                if (cmpeq:boolean(and:int(var_3_81:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0163)
                }
                
                if (cmpne:boolean(and:int(var_3_81:int, ldc:int(32768)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_81 = and:int(var_3_81:int, ldc:int(330620794))
            }
            
            if (getfield:boolean(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u76bc\u965f\u8258\u5f50\ubcb0\u4e72, this:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e)) {
                invokevirtual:void(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\ud158\u67e9\ube23\ua6bd\uc4d2\ub171, var_5_6C:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e)
            }
            
            return:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e(var_5_6C:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e)
        }
        
        goto(Label_0006)
    }
    
    public void \u51fa\u4e72\uf94d\u7873\u64ab\u9937() {
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
            putfield:boolean(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u7006\u5140\uc9f6\u56bd\u960f\u64ab, this:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e, xor:int[expected:boolean](ldc:int(-15840), ldc:int(-15839)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud158\u67e9\ube23\ua6bd\uc4d2\ub171() {
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
            putfield:boolean(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u76bc\u965f\u8258\u5f50\ubcb0\u4e72, this:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e, and:int[expected:boolean](ldc:int(9249), ldc:int(20819)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u3e2a\u71f1\u4f4a\ubf56\u3711\u3d4b() {
        var_1_5F : int
        var_3_64 : \uc2e8\u9255\u647c\ud171\ubf56
        var_4_69 : \uae5d\u8d98\u7d52\u4f52\u51b2
        var_5_7A : \u67d0\u9a18\u6ec6\u8aa5\u1187
        var_1_122 : int
        var_6_99 : Iterator<Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u718f\ubefe\u6b0d\ub18d\u71ae>>
        stack_190_0 : int [generated]
        var_1_239 : int
        var_7_1B8 : List<List<Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>>
        var_8_1C1 : int
        var_9_232 : Iterator<Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>
        var_7_1A1 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d[]
        var_8_1AA : int
        var_9_2CA : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        
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
            var_1_5F = and:int(ldc:int(-1012171393), ldc:int(1776803695))
            var_3_64 = invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u71ae\u7049\u5bc4\ube23\u0800\uc238, this:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e)
            var_4_69 = invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\uc2e8\u9255\u647c\ud171\ubf56::\u16f6\uf9c5\u62da\u4975\u527a\u5db4, var_3_64:\uc2e8\u9255\u647c\ud171\ubf56)
            var_5_7A = invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub113\u16f6\ub70c\u8413\u0c95\u3d4b, initobject:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::<init>), invokevirtual:Supplier<\u64ab\ua6bd\u8413\u93a2\u88c5<?>>(\uae5d\u8d98\u7d52\u4f52\u51b2::\ud523\ub113\u8640\u40a9\u4d85\u6cfe, var_4_69:\uae5d\u8d98\u7d52\u4f52\u51b2))
            
            if (getfield:boolean(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u76bc\u965f\u8258\u5f50\ubcb0\u4e72, this:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e)) {
                invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, var_5_7A:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u72f1\u647c\ub70c\u92ff\u3a62\u3e75), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u3bc9\u34df\u6cfe\uc7fe\ud171\u72f1))
                invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, var_5_7A:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u72f1\u647c\ub70c\u92ff\u3a62\u3e75), getstatic:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u3504\u7ce1\uc2bd\ub6ab\u8640\u4975::\u183a\u52d3\ubff1\ub1b9\u9937\u120d))
            }
            
            var_1_122 = and:int(var_1_5F:int, ldc:int(1944614909))
            var_6_99 = invokeinterface:Iterator<Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u718f\ubefe\u6b0d\ub18d\u71ae>>(Set<Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u718f\ubefe\u6b0d\ub18d\u71ae>>::iterator, invokeinterface:Set<Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u718f\ubefe\u6b0d\ub18d\u71ae>>(Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u718f\ubefe\u6b0d\ub18d\u71ae>::entrySet, invokevirtual:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u718f\ubefe\u6b0d\ub18d\u71ae>(\u6435\u12b2\ua61f\u600f\uc238::\u983f\u7043\ud36e\u6435\u392e\u0a06, getfield:\u6435\u12b2\ua61f\u600f\uc238(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u97e6\u8cae\u12b2\ucef1\uc31c\u5d20, this:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e))))
            
            while (invokeinterface:boolean(Iterator::hasNext, var_6_99:Iterator)) {
                invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub102\u120d\u93a2\u3d4b\u6d99\uc9f6, var_5_7A:\u67d0\u9a18\u6ec6\u8aa5\u1187, invokevirtual:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<?, ?>(\uae5d\u8d98\u7d52\u4f52\u51b2::\u69d9\u6d69\u3bd6\u960f\u5d20\u6cfe, var_4_69:\uae5d\u8d98\u7d52\u4f52\u51b2, checkcast:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<?, ?>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<?, ?>.class, invokeinterface:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<?, ?>(Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<?, ?>>::get, getstatic:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<?, ?>>(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u97e6\u6d99\ud12e\u3d4b\u120d\u8d90), invokeinterface:\u5654\u9937\u72f1\ud4fe\u0c95<?>(Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u718f\ubefe\u6b0d\ub18d\u71ae>::getKey, checkcast:Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u718f\ubefe\u6b0d\ub18d\u71ae>(java.util.Map.Entry<\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u718f\ubefe\u6b0d\ub18d\u71ae>.class, invokeinterface:Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u718f\ubefe\u6b0d\ub18d\u71ae>(Iterator<Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u718f\ubefe\u6b0d\ub18d\u71ae>>::next, var_6_99:Iterator<Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u718f\ubefe\u6b0d\ub18d\u71ae>>)))))))
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_1_122:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0269)
                }
                
                if (cmpeq:boolean(and:int(var_1_122:int, ldc:int(8388608)), ldc:int(0))) {
                    var_1_122 = and:int(var_1_122:int, ldc:int(1639469987))
                }
                else {
                    var_1_122 = and:int(var_1_122:int, ldc:int(2046031215))
                    
                    if (getfield:boolean(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u8308\u7e3f\u7e3f\ub70c\u3d4b\u3a62, this:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e)) {
                        if (logicalnot:boolean(invokevirtual:boolean(Optional<T>::equals, invokevirtual:Optional<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uc2e8\u9255\u647c\ud171\ubf56>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>::\u836c\uc3e3\u9a18\ufcaf\uc3e3\ubff1, getfield:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\ubcb0\ufcaf\u6cfe\uc238\u72f1\u6b0d, this:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e), var_3_64:\uc2e8\u9255\u647c\ud171\ubf56), invokestatic:Optional<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uc2e8\u9255\u647c\ud171\ubf56>>[expected:Object](Optional<T>::of, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uc2e8\u9255\u647c\ud171\ubf56>(\ud523\u7330\u7049\u9033\ub32d::\uc7fe\u69d9\ub70c\u8d90\u6d69\uc2e8))))) {
                            goto(Label_0269)
                        }
                    }
                }
                
                Label_0241:
                
                if (cmpne:boolean(and:int(var_1_122:int, ldc:int(64)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_122:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_122 = and:int(var_1_122:int, ldc:int(-509116435))
                    
                    if (getfield:boolean(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u7006\u5140\uc9f6\u56bd\u960f\u64ab, this:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e)) {
                        stack_190_0 = and:int(ldc:int(17425), ldc:int(8553))
                        looporswitchbreak()
                    }
                }
                
                Label_0269:
                
                if (cmpeq:boolean(and:int(var_1_122:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0241)
                }
                
                if (cmpne:boolean(and:int(var_1_122:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_122 = and:int(var_1_122:int, ldc:int(-419832465))
                    stack_190_0 = and:int(ldc:int(-32142), ldc:int(14733))
                    looporswitchbreak()
                }
            }
            
            var_1_239 = and:int(var_1_122:int, ldc:int(-459082369))
            
            if (cmpne:boolean(stack_190_0:int, ldc:int(0))) {
                var_7_1B8 = invokevirtual:List<List<Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>>(\uae5d\u8d98\u7d52\u4f52\u51b2::\ubcb0\ub1b9\u416d\uc3e3\u71f1\u93a2, var_4_69:\uae5d\u8d98\u7d52\u4f52\u51b2)
                var_8_1C1 = and:int(ldc:int(25826), ldc:int(-25828))
                
                loop {
                    if (cmpne:boolean(and:int(var_1_239:int, ldc:int(8388608)), ldc:int(0))) {
                        var_1_239 = and:int(var_1_239:int, ldc:int(1457544559))
                        
                        if (cmpge:boolean(var_8_1C1:int, invokeinterface:int(List<E>::size, var_7_1B8:List<List<Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>>))) {
                            looporswitchbreak()
                        }
                        
                        if (cmpne:boolean(var_8_1C1:int, invokevirtual:int(Enum<E>::ordinal, getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa[expected:Enum<\u527a\u5f50\u92ff\ud36e\u3e75\u51fa>](\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u9937\u7049\uff55\u9af2\u8753\u92ee)))) {
                            if (cmpne:boolean(var_8_1C1:int, invokevirtual:int(Enum<E>::ordinal, getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa[expected:Enum<\u527a\u5f50\u92ff\ud36e\u3e75\u51fa>](\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u4c04\ufcaf\u7049\u47c2\u4e72\u62da)))) {
                                var_9_232 = invokeinterface:Iterator<Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>(List<Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>::iterator, checkcast:List<Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>(java.util.List<java.util.function.Supplier<\u392e\ud7e8\u3bc9\u88c5\ud51e.\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>.class, invokeinterface:List<Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>(List<List<Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>>::get, var_7_1B8:List<List<Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>>, var_8_1C1:int)))
                                
                                loop {
                                    var_1_239 = and:int(var_1_239:int, ldc:int(1173020527))
                                    
                                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_9_232:Iterator))) {
                                        looporswitchbreak()
                                    }
                                    
                                    invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u946b\u6b5f\u5f50\u3c25\u3dd3\u5db4, var_5_7A:\u67d0\u9a18\u6ec6\u8aa5\u1187, var_8_1C1:int, checkcast:Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>(java.util.function.Supplier<\u392e\ud7e8\u3bc9\u88c5\ud51e.\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>.class, invokeinterface:Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>(Iterator<Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>::next, var_9_232:Iterator<Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>)))
                                }
                            }
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_239:int, ldc:int(1)), ldc:int(0))) {
                        var_1_239 = and:int(var_1_239:int, ldc:int(1155546060))
                    }
                    else {
                        var_1_239 = and:int(var_1_239:int, ldc:int(-890275857))
                        inc:int(var_8_1C1, ldc:int(1))
                    }
                }
            }
            
            var_7_1A1 = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[](\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u3e2a\u392e\u6198\u965f\u7ce1\u64f2, this:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e)
            var_8_1AA = and:int(ldc:int(16454), ldc:int(-16455))
            
            while (cmplt:boolean(var_8_1AA:int, arraylength:int(var_7_1A1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[]))) {
                var_9_2CA = loadelement:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(var_7_1A1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[], var_8_1AA:int)
                
                if (cmpne:boolean(var_9_2CA:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, aconstnull:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d())) {
                    if (logicalnot:boolean(invokeinterface:boolean(Predicate<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::test, invokevirtual:Predicate<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9::\u36d3\u8c8a\u3e2a\u839e\u6c56\u72f1, getstatic:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9(\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9::\uceb8\ua3b4\u4975\u4179\uf94d\u6198)), var_9_2CA:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d))) {
                        storeelement:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[](\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u759a\u6b0d\u51fa\uc246\u7ce1\u36d3, this:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e), var_8_1AA:int, aconstnull:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d())
                        invokevirtual:\u67d0\u9a18\u6ec6\u8aa5\u1187(\u67d0\u9a18\u6ec6\u8aa5\u1187::\uc3e3\u7330\u3776\u97b7\u3e75\u3e2a, var_5_7A:\u67d0\u9a18\u6ec6\u8aa5\u1187, getstatic:\u527a\u5f50\u92ff\ud36e\u3e75\u51fa(\u527a\u5f50\u92ff\ud36e\u3e75\u51fa::\u71ae\u62da\u9a18\u4f4a\u8413\u51b2), invokevirtual:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<\u6cfe\uc2bd\u7d52\u4f52\u446c\ub83f, ?>(\u93a2\u1187\u5654\u8413\u3a62\ua61f<\u6cfe\uc2bd\u7d52\u4f52\u446c\ub83f>::\u64f2\u071d\ua562\ub19c\u76bc\ub7dc, getstatic:\u93a2\u1187\u5654\u8413\u3a62\ua61f<\u6cfe\uc2bd\u7d52\u4f52\u446c\ub83f>(\u93a2\u1187\u5654\u8413\u3a62\ua61f::\u8709\u759a\u3a62\u4c04\ubcb0\u759a), initobject:\u6cfe\uc2bd\u7d52\u4f52\u446c\ub83f(\u6cfe\uc2bd\u7d52\u4f52\u446c\ub83f::<init>, var_8_1AA:int, var_9_2CA:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)))
                    }
                }
                
                inc:int(var_8_1AA, ldc:int(1))
            }
            
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8389\uc29a\uc3e3\u69d9\u3504::\ud36e\u51b2\u7e3f\u36d3\u3e2a\ube23, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u4d85\u718f\u4f4a\uc3e3\u927d\uc2bd, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u156b\uc84e\u5fe1\u67e9\u4c2b\u3776, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u76bc\u0b8e\u873d\u3a62\u516c\u34df, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u3e75\u64f2\ud7e8\ub113\u6bb9\uc29a, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\uff55\u6c52\u183a\u4e72\u6198\ua562, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u8df4\ub8be\u6d99\uc2e8\u8389\u92ff, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u88c5\u6ec6\u759a\u8df4\ub8be\u4c2b, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u51b2\u6bb9\u4179\u8389\u6c52\u960f, invokevirtual:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::\u7873\u16f6\uc2bd\u8d90\ud217\u5fe1, initobject:\u8389\uc29a\uc3e3\u69d9\u3504(\u8389\uc29a\uc3e3\u69d9\u3504::<init>), invokevirtual:\ud51e\u927d\u69d9\u8df4\u6cfe(\uc2e8\u9255\u647c\ud171\ubf56::\u99f7\ub113\ua562\u5db4\u760c\u3d4b, var_3_64:\uc2e8\u9255\u647c\ud171\ubf56)), invokevirtual:\uf995\u7049\u8258\u5654\u718f(\uc2e8\u9255\u647c\ud171\ubf56::\u7af6\u156b\ub7dc\ua3b4\u7ce1\u7049, var_3_64:\uc2e8\u9255\u647c\ud171\ubf56)), invokevirtual:float(\uc2e8\u9255\u647c\ud171\ubf56::\u7bad\uae87\ub7dc\u983f\ud7e8\uc29a, var_3_64:\uc2e8\u9255\u647c\ud171\ubf56)), invokevirtual:float(\uc2e8\u9255\u647c\ud171\ubf56::\u61a4\u6b5f\u965f\u385b\ubded\u8389, var_3_64:\uc2e8\u9255\u647c\ud171\ubf56)), invokevirtual:float(\uc2e8\u9255\u647c\ud171\ubf56::\u4bc8\u97e6\uc31c\ub83f\ubded\uc246, var_3_64:\uc2e8\u9255\u647c\ud171\ubf56)), invokevirtual:float(\uc2e8\u9255\u647c\ud171\ubf56::\ud4fe\u2dcc\u494c\u8389\ubcb0\u8389, var_3_64:\uc2e8\u9255\u647c\ud171\ubf56)), invokevirtual:\u8cae\uc87f\u8640\u836c\uc238(\uc2e8\u9255\u647c\ud171\ubf56::\u4c04\u59ec\ud171\u56bd\u156b\ubb2b, var_3_64:\uc2e8\u9255\u647c\ud171\ubf56)), invokevirtual:\uae5d\u8d98\u7d52\u4f52\u51b2(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub8be\ud36e\ub18d\ub171\u6198\ub171, var_5_7A:\u67d0\u9a18\u6ec6\u8aa5\u1187)), invokevirtual:\u6198\uff55\u56bd\u8308\u4cd9(\uc2e8\u9255\u647c\ud171\ubf56::\u36d3\u873d\uf9c5\u3bd6\u156b\u6d69, var_3_64:\uc2e8\u9255\u647c\ud171\ubf56))))
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u6435\u12b2\ua61f\u600f\uc238 \u6d99\u3e2a\ud4fe\u8cae\u71f1\u759a() {
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
            return:\u6435\u12b2\ua61f\u600f\uc238(getfield:\u6435\u12b2\ua61f\u600f\uc238(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u97e6\u8cae\u12b2\ucef1\uc31c\u5d20, this:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e))
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u71ae\u7049\u5bc4\ube23\u0800\uc238() {
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
            return:\uc2e8\u9255\u647c\ud171\ubf56(checkcast:\uc2e8\u9255\u647c\ud171\ubf56(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56.class, invokeinterface:\uc2e8\u9255\u647c\ud171\ubf56(Supplier<\uc2e8\u9255\u647c\ud171\ubf56>::get, getfield:Supplier<\uc2e8\u9255\u647c\ud171\ubf56>(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u67d0\u64ab\u8640\u7873\uc2e8\u4cd9, this:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e))))
        }
        
        goto(Label_0006)
    }
    
    public void \u760c\uceb8\uceb8\u9937\uc4d2\u47c2(java.util.function.Supplier<\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56> p0) {
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
            putfield:Supplier<\uc2e8\u9255\u647c\ud171\ubf56>(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u67d0\u64ab\u8640\u7873\uc2e8\u4cd9, this:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e, p0:Supplier<\uc2e8\u9255\u647c\ud171\ubf56>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u527a\u61a4\u760c\u40a9\ua068> \u4ab3\u12cb\u0c95\u4cd9\u8258\u8d98() {
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
            return:List<\u527a\u61a4\u760c\u40a9\ua068>(getfield:List<\u527a\u61a4\u760c\u40a9\ua068>(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u946b\u34df\u88c5\ua562\u51fa\u3bd6, this:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e))
        }
        
        goto(Label_0006)
    }
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[] \u3e2a\u392e\u6198\u965f\u7ce1\u64f2() {
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
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[](getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[](\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u759a\u6b0d\u51fa\uc246\u7ce1\u36d3, this:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e))
        }
        
        goto(Label_0006)
    }
    
    public void \uc31c\u8d98\ub1b9\ubded\uc4d2\u7006() {
        var_1_15C : int
        var_3_7D : int
        var_4_87 : Iterator<\u527a\u61a4\u760c\u40a9\ua068>
        var_5_F8 : \u527a\u61a4\u760c\u40a9\ua068
        var_5_146 : \u527a\u61a4\u760c\u40a9\ua068
        var_6_14D : int
        var_7_186 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        
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
            var_1_15C = and:int(ldc:int(-2018413269), ldc:int(-407546201))
            invokestatic:void(Arrays::fill, getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[][expected:Object[]](\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u759a\u6b0d\u51fa\uc246\u7ce1\u36d3, this:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e), and:int(ldc:int(-19523), ldc:int(19522)), arraylength:int(getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[](\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u759a\u6b0d\u51fa\uc246\u7ce1\u36d3, this:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e)), aconstnull:Object())
            var_3_7D = and:int(ldc:int(4829), ldc:int(-8160))
            var_4_87 = invokeinterface:Iterator<\u527a\u61a4\u760c\u40a9\ua068>(List<\u527a\u61a4\u760c\u40a9\ua068>::iterator, getfield:List<\u527a\u61a4\u760c\u40a9\ua068>(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u946b\u34df\u88c5\ua562\u51fa\u3bd6, this:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e))
            
            loop {
                if (cmpne:boolean(and:int(var_1_15C:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0281)
                }
                
                if (cmpeq:boolean(and:int(var_1_15C:int, ldc:int(33554432)), ldc:int(0))) {
                    var_1_15C = and:int(var_1_15C:int, ldc:int(-516990299))
                }
                else {
                    var_1_15C = and:int(var_1_15C:int, ldc:int(-2018149149))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_4_87:Iterator)) {
                        var_5_F8 = checkcast:\u527a\u61a4\u760c\u40a9\ua068(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u527a\u61a4\u760c\u40a9\ua068.class, invokeinterface:\u527a\u61a4\u760c\u40a9\ua068(Iterator<\u527a\u61a4\u760c\u40a9\ua068>::next, var_4_87:Iterator<\u527a\u61a4\u760c\u40a9\ua068>))
                        invokevirtual:void(\u527a\u61a4\u760c\u40a9\ua068::\u4ab3\uc238\u5bc4\u93a2\u3e75\ufe34, var_5_F8:\u527a\u61a4\u760c\u40a9\ua068, var_3_7D:int)
                        var_3_7D = add:int(var_3_7D:int, invokevirtual:int(\u527a\u61a4\u760c\u40a9\ua068::\u416d\u8308\u8389\u99f7\u3776\u3a62, var_5_F8:\u527a\u61a4\u760c\u40a9\ua068))
                        loopcontinue()
                    }
                }
                
                Label_0178:
                
                if (cmpne:boolean(and:int(var_1_15C:int, ldc:int(16384)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_15C:int, ldc:int(268435456)), ldc:int(0))) {
                        var_1_15C = and:int(var_1_15C:int, ldc:int(-254173069))
                        loopcontinue()
                    }
                    
                    var_1_15C = and:int(var_1_15C:int, ldc:int(1002495035))
                    putfield:boolean(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u8308\u7e3f\u7e3f\ub70c\u3d4b\u3a62, this:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e, xor:int[expected:boolean](ldc:int(16800), ldc:int(16801)))
                    var_4_87 = invokeinterface:Iterator<\u527a\u61a4\u760c\u40a9\ua068>(List<\u527a\u61a4\u760c\u40a9\ua068>::iterator, getfield:List<\u527a\u61a4\u760c\u40a9\ua068>(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u946b\u34df\u88c5\ua562\u51fa\u3bd6, this:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e))
                    
                    while (invokeinterface:boolean(Iterator::hasNext, var_4_87:Iterator)) {
                        var_5_146 = checkcast:\u527a\u61a4\u760c\u40a9\ua068(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u527a\u61a4\u760c\u40a9\ua068.class, invokeinterface:\u527a\u61a4\u760c\u40a9\ua068(Iterator<\u527a\u61a4\u760c\u40a9\ua068>::next, var_4_87:Iterator<\u527a\u61a4\u760c\u40a9\ua068>))
                        var_6_14D = invokevirtual:int(\u527a\u61a4\u760c\u40a9\ua068::\u600f\u4cd9\u92ff\u4e72\uae5d\uae87, var_5_146:\u527a\u61a4\u760c\u40a9\ua068)
                        
                        loop {
                            if (cmpne:boolean(and:int(var_1_15C:int, ldc:int(16384)), ldc:int(0))) {
                                var_1_15C = and:int(var_1_15C:int, ldc:int(131169707))
                                
                                if (cmplt:boolean(var_6_14D:int, add:int(invokevirtual:int(\u527a\u61a4\u760c\u40a9\ua068::\u600f\u4cd9\u92ff\u4e72\uae5d\uae87, var_5_146:\u527a\u61a4\u760c\u40a9\ua068), invokevirtual:int(\u527a\u61a4\u760c\u40a9\ua068::\u416d\u8308\u8389\u99f7\u3776\u3a62, var_5_146:\u527a\u61a4\u760c\u40a9\ua068)))) {
                                    var_7_186 = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u527a\u61a4\u760c\u40a9\ua068::\u4179\u5654\ud51e\u4f52\u8640\u8413, var_5_146:\u527a\u61a4\u760c\u40a9\ua068)
                                    
                                    if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, var_7_186:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u8d98\u392e\u7006\ud171\u7bad\ua6bd)))) {
                                        putfield:boolean(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u8308\u7e3f\u7e3f\ub70c\u3d4b\u3a62, this:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e, and:int[expected:boolean](ldc:int(17191), ldc:int(-25384)))
                                        storeelement:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[](\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u759a\u6b0d\u51fa\uc246\u7ce1\u36d3, this:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e), var_6_14D:int, var_7_186:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
                                    }
                                    
                                    var_1_15C = and:int(var_1_15C:int, ldc:int(-610632729))
                                    inc:int(var_6_14D, ldc:int(1))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpne:boolean(and:int(var_1_15C:int, ldc:int(1)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        var_1_15C = and:int(var_1_15C:int, ldc:int(1202290211))
                    }
                }
                
                Label_0281:
                
                if (cmpne:boolean(and:int(var_1_15C:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_15C = and:int(var_1_15C:int, ldc:int(1443959874))
                    goto(Label_0178)
                }
                
                if (cmpne:boolean(and:int(var_1_15C:int, ldc:int(1)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u56bd\u8413\u647c\u5bc4\ud158.\u6b0d\uc3e3\u12cb\u5bc4\u0b8e \ud171\ud217\u6ec6\u8640\u8753\u7d52(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56> p0) {
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
    
    private static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 lambda$\u51b2\u2dcc\u7af6\u392e\ud4fe\u8308$8(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255 p0) {
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
            return:\uc2e8\u9255\u647c\ud171\ubf56(checkcast:\uc2e8\u9255\u647c\ud171\ubf56(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56.class, invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>::\u624e\u62da\u9937\uafe7\u8389\u98a4, p0:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uc2e8\u9255\u647c\ud171\ubf56>(\ud523\u7330\u7049\u9033\ub32d::\u3d4b\u7d52\u6bb9\uf995\u416d\u5140))))
        }
        
        goto(Label_0006)
    }
    
    private static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 lambda$\ud51e\u983f\u7ce1\ud171\u51b2\uf995$7(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255 p0) {
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
            return:\uc2e8\u9255\u647c\ud171\ubf56(checkcast:\uc2e8\u9255\u647c\ud171\ubf56(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56.class, invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>::\u624e\u62da\u9937\uafe7\u8389\u98a4, p0:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uc2e8\u9255\u647c\ud171\ubf56>(\ud523\u7330\u7049\u9033\ub32d::\u3d4b\u7d52\u6bb9\uf995\u416d\u5140))))
        }
        
        goto(Label_0006)
    }
    
    private static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 lambda$\ubefe\u6b0d\ua61f\ubcb0\ucb79\u718f$6(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255 p0) {
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
            return:\uc2e8\u9255\u647c\ud171\ubf56(checkcast:\uc2e8\u9255\u647c\ud171\ubf56(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56.class, invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>::\u624e\u62da\u9937\uafe7\u8389\u98a4, p0:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uc2e8\u9255\u647c\ud171\ubf56>(\ud523\u7330\u7049\u9033\ub32d::\u3d4b\u7d52\u6bb9\uf995\u416d\u5140))))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u7006\u76bc\u59ec\u6b5f\u6cfe\u873d$5(java.util.HashMap p0) {
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
            invokevirtual:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>(HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>::put, p0:HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>, getstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>(\u5654\u9937\u72f1\ud4fe\u0c95::\uc2e8\ube23\ub102\u5140\u51b2\ucb79), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u8308\u51fa\uc87f\u760c\u8df4\u5654))
            invokevirtual:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>(HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>::put, p0:HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>, getstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>(\u5654\u9937\u72f1\ud4fe\u0c95::\u4492\u3a62\u5db4\uae87\ua61f\u93a2), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4bc8\u7bad\u92ff\ubefe\u8d90, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u7006\u527a\u3711\u9937\u8d90\u64f2))
            invokevirtual:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>(HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>::put, p0:HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>, getstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>(\u5654\u9937\u72f1\ud4fe\u0c95::\ub6ab\u97e6\u4492\uc3e3\u965f\u1187), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u516c\u71ae\u4d85\uc4d2\u4d85\ua068))
            invokevirtual:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>(HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>::put, p0:HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>, getstatic:\ub102\ua61f\ua61f\u69d9\u98a4[expected:\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>](\u5654\u9937\u72f1\ud4fe\u0c95::\u9af2\u760c\ud217\u6cfe\ub32d\ud523), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u8709\u16f6\uff55\u67e9\ub7dc\u0b8e))
            invokevirtual:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>(HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>::put, p0:HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>, getstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>(\u5654\u9937\u72f1\ud4fe\u0c95::\ud171\ub83f\ub18d\u624e\u97e6\ud36e), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u0b8e\ubff1\u6d99\u3e75\u52d3\u9937))
            invokevirtual:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>(HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>::put, p0:HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>, getstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>(\u5654\u9937\u72f1\ud4fe\u0c95::\u4f4a\ua068\u8753\ub7dc\u88c5\u71ae), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\uc87f\u64f2\u5bc4\ud171\ua3b4\u4cd9))
            invokevirtual:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>(HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>::put, p0:HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>, getstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>(\u5654\u9937\u72f1\ud4fe\u0c95::\ubf56\ubded\ua6bd\u62da\ua562\u516c), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\uc238\u47c2\u3e75\u6198\uc3e3\u392e))
            invokevirtual:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>(HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>::put, p0:HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>, getstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\ub70c\u516c\ud523\uafe7\ud217>(\u5654\u9937\u72f1\ud4fe\u0c95::\u34df\u6bb9\ub113\u8389\u1187\ua3b4), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\ub70c\u516c\ud523\uafe7\ud217, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\ub70c\u516c\ud523\uafe7\ud217>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u7d52\u624e\u61a4\u92ff\u385b\uc229))
            invokevirtual:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>(HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>::put, p0:HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>, getstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u7d52\ua3b4\ub102\u71f1\u5bc4\u74b1>(\u5654\u9937\u72f1\ud4fe\u0c95::\u494c\u2dcc\u6b0d\ud171\ubb2b\ud4fe), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7d52\ua3b4\ub102\u71f1\u5bc4\u74b1, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7d52\ua3b4\ub102\u71f1\u5bc4\u74b1>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u6ec6\u5654\uc84e\u12b2\u6bb9\u0800))
            invokevirtual:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>(HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>::put, p0:HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>, getstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>(\u5654\u9937\u72f1\ud4fe\u0c95::\u946b\u071d\uc7fe\ud36e\uae87\u9a18), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u3d4b\u7ce1\u7e3f\u527a\u3bd6\u527a))
            invokevirtual:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>(HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>::put, p0:HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>, getstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>(\u5654\u9937\u72f1\ud4fe\u0c95::\u51fa\u120d\u8258\u3bd6\uc246\uc229), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u8413\ubcb0\u0800\u4daf\u0c95\ud12e))
            invokevirtual:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>(HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>::put, p0:HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>, getstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>(\u5654\u9937\u72f1\ud4fe\u0c95::\ubcb0\uc246\u4ab3\uf9c5\u7049\ucef1), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u600f\u8350\u0800\u4e72\u5140\u1187))
            invokevirtual:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>(HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>::put, p0:HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>, getstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>(\u5654\u9937\u72f1\ud4fe\u0c95::\u69d9\ub18d\u4179\u3dd3\u67e9\u4bc8), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4975\ud12e\u2dcc\u718f\ub83f\u4d85>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u0a06\ub6ab\u7006\u7049\u9255\u74b1))
            invokevirtual:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>(HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>::put, p0:HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>, getstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>(\u5654\u9937\u72f1\ud4fe\u0c95::\u0a06\u3711\u3d4b\u2dcc\ud523\u8aa5), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4bc8\u7bad\u92ff\ubefe\u8d90, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\ub32d\u5db4\u965f\u759a\u6d69\u4975))
            invokevirtual:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>(HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>::put, p0:HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>, getstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>(\u5654\u9937\u72f1\ud4fe\u0c95::\u3e75\u93a2\u839e\u8aa5\u873d\u3d64), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u7043\u0a06\u7e3f\u3e2a\u392e, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u7043\u0a06\u7e3f\u3e2a\u392e>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\u183a\u927d\u6cfe\u71ae\u3bc9\u61a4))
            invokevirtual:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>(HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>::put, p0:HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>, \uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u836c\ub102\u836c\ucef1\u647c, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u836c\ub102\u836c\ucef1\u647c>>>, getstatic:\u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>(\u5654\u9937\u72f1\ud4fe\u0c95::\ub102\u97e6\u183a\u8cae\uc4d2\u64f2), getstatic:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<\u4bc8\u7bad\u92ff\ubefe\u8d90, ? extends \u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>>(\u0b8e\ubcb0\ua61f\uc87f\u6cfe::\ufe34\ub102\u8bb0\u965f\u0b8e\uc3e3))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.kinds.App lambda$\ubf56\u52d3\u4bc8\u3c25\u6fb0\ub171$4(com.mojang.serialization.codecs.RecordCodecBuilder$Instance p0) {
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
    
    private static java.util.Optional lambda$\u7ce1\u6435\uc2bd\ucef1\u52d3\u16f6$3(\u56bd\u8413\u647c\u5bc4\ud158.\u6b0d\uc3e3\u12cb\u5bc4\u0b8e p0) {
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
            return:Optional(invokestatic:Optional<Supplier<\uc2e8\u9255\u647c\ud171\ubf56>>(Optional<T>::of, getfield:Supplier<\uc2e8\u9255\u647c\ud171\ubf56>(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u67d0\u64ab\u8640\u7873\uc2e8\u4cd9, p0:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Boolean lambda$\u4ab3\u4492\ub171\u600f\ube23\u47c2$2(\u56bd\u8413\u647c\u5bc4\ud158.\u6b0d\uc3e3\u12cb\u5bc4\u0b8e p0) {
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
            return:Boolean(invokestatic:Boolean(Boolean::valueOf, getfield:boolean(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u7006\u5140\uc9f6\u56bd\u960f\u64ab, p0:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Boolean lambda$\ua562\uc2bd\ua068\u6c52\u600f\u16f6$1(\u56bd\u8413\u647c\u5bc4\ud158.\u6b0d\uc3e3\u12cb\u5bc4\u0b8e p0) {
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
            return:Boolean(invokestatic:Boolean(Boolean::valueOf, getfield:boolean(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\u76bc\u965f\u8258\u5f50\ubcb0\u4e72, p0:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e)))
        }
        
        goto(Label_0006)
    }
    
    private static \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255 lambda$\u8413\u9033\u3d64\uf94d\u6198\u8753$0(\u56bd\u8413\u647c\u5bc4\ud158.\u6b0d\uc3e3\u12cb\u5bc4\u0b8e p0) {
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
            return:\ud12e\ub8be\u69d9\uc246\uc84e\u9255(getfield:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>(\u6b0d\uc3e3\u12cb\u5bc4\u0b8e::\ubcb0\ufcaf\u6cfe\uc238\u72f1\u6b0d, p0:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e))
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
    
    public void \u5d20\ua068\u51fa\ua068\u5bc4\ud4fe(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_69F : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
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
        var_3_69F = and:int(ldc:int(-1916229286), ldc:int(-286703776))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_69F = and:int(var_3_69F:int, ldc:int(-1343660190))
            var_5_81 = and:int(ldc:int(28721), ldc:int(-28722))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-27849), ldc:int(9416)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_69F:int, ldc:int(-1362968305))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(272), ldc:int(273)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(1170), ldc:int(1171)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_69F = and:int(var_3_DA:int, ldc:int(-1667203230))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(3137), ldc:int(259)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-894420474))
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1426629755))
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1012852577))
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-964308437))
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(842818185))
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-327592956))
                    }
                    else {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1394895916))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0613)
                            }
                            
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1257922528))
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1665053729))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(292889903))
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1768569433))
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(860612759))
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(176637606))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1880981556))
                            var_11_EB = and:int(ldc:int(-10757), ldc:int(10756))
                            goto(Label_1553)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0613:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(224607449))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1044210968))
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1061478931))
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-824744670))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0729:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1567326900))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(998317644))
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(934087640))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1122537451))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1096507966))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0861:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1882778219))
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1194627171))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1489733703))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1203111393))
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1626064437))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-349732363))
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(256)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(2052900980))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-411563943))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1898459257))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(-24559), ldc:int(-24560))
                                goto(Label_1173)
                            }
                        }
                    }
                    
                    Label_1022:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1251654256))
                            goto(Label_0861)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1125372933))
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1703655879))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-575016704))
                        var_11_EB = and:int(ldc:int(-27228), ldc:int(18969))
                    }
                    
                    Label_1173:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_1022)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1665218862))
                            goto(Label_0861)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(256)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1008307906))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-325385808))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1407)
                            }
                        }
                    }
                    
                    Label_1280:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(352870174))
                            goto(Label_1173)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(95714420))
                            goto(Label_1022)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0861)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-2091198373))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-555908308))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1553)
                    }
                    
                    Label_1407:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1040449796))
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(2045494316))
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-563183401))
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-186364561))
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1959329355))
                        loopcontinue()
                    }
                    
                    var_3_69F = and:int(var_3_69F:int, ldc:int(-290062908))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1553:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6AA = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1564:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-533645504))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-722057896))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(957204365))
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-158825604))
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1263244744))
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1365692025))
                        var_17_6AA = add:int(var_16_119:int, and:int(ldc:int(705), ldc:int(10513)))
                        looporswitchbreak()
                    }
                    
                    var_3_69F = and:int(var_3_69F:int, ldc:int(-1331680469))
                }
                
                var_3_69F = and:int(var_3_69F:int, ldc:int(-1899137545))
                
                if (cmple:boolean(var_5_81 = var_17_6AA:int, sub:int(var_6_88:int, and:int(ldc:int(6529), ldc:int(17))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
            var_3_69F = and:int(var_3_69F:int, ldc:int(451777438))
            goto(Label_0108)
        }
    }
}
