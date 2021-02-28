public class \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u3bd6\u6435\u4e72\uc9f6\u5140 {
    public void \u3bd6\u6435\u4e72\uc9f6\u5140(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be p0, double p1, float p2, float p3) {
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
    
    public boolean \u62da\u0b8e\u5f50\u718f\u7ce1\ud523() {
        var_1_D0 : int
        var_3_7F : List<\u4f4a\uafe7\u76bc\u392e\ub8be>
        var_4_A0 : Iterator<\u4f4a\uafe7\u76bc\u392e\ub8be>
        var_5_C2 : \u4f4a\uafe7\u76bc\u392e\ub8be
        
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
            var_1_D0 = and:int(ldc:int(630840107), ldc:int(932116334))
            var_3_7F = invokevirtual:List<\u7d52\u718f\u3776\u6fb0\ub83f>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u965f\ucef1\u34df\u4daf\u760c\u6d99, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u4f4a\uafe7\u76bc\u392e\ub8be::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be(\u3bd6\u6435\u4e72\uc9f6\u5140::\ub83f\u4f4a\ubefe\u385b\u8bb0\u4c2b, this:\u3bd6\u6435\u4e72\uc9f6\u5140)), ldc:Class<\u4f4a\uafe7\u76bc\u392e\ub8be>(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be.class), invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub19c\u946b\u718f\u6cfe\u4bc8\u5654, invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7d52\u718f\u3776\u6fb0\ub83f::\ub113\ub1b9\u9937\u1833\u64f2\u3504, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u3bd6\u6435\u4e72\uc9f6\u5140::\ub83f\u4f4a\ubefe\u385b\u8bb0\u4c2b, this:\u3bd6\u6435\u4e72\uc9f6\u5140)), f2d:double(getfield:float(\u3bd6\u6435\u4e72\uc9f6\u5140::\u7873\ud12e\ubded\u8d98\u61a4\ub32d, this:\u3bd6\u6435\u4e72\uc9f6\u5140))), getfield:Predicate<\u4f4a\uafe7\u76bc\u392e\ub8be>(\u3bd6\u6435\u4e72\uc9f6\u5140::\u4975\u3776\u4ab3\uc2bd\u9af2\u9af2, this:\u3bd6\u6435\u4e72\uc9f6\u5140))
            
            if (logicalnot:boolean(invokeinterface:boolean(List::isEmpty, var_3_7F:List<\u4f4a\uafe7\u76bc\u392e\ub8be>))) {
                var_4_A0 = invokeinterface:Iterator<\u4f4a\uafe7\u76bc\u392e\ub8be>(List<\u4f4a\uafe7\u76bc\u392e\ub8be>::iterator, var_3_7F:List<\u4f4a\uafe7\u76bc\u392e\ub8be>)
                
                loop {
                    var_1_D0 = and:int(var_1_D0:int, ldc:int(-1517356054))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_4_A0:Iterator<\u4f4a\uafe7\u76bc\u392e\ub8be>))) {
                        looporswitchbreak()
                    }
                    
                    var_5_C2 = checkcast:\u4f4a\uafe7\u76bc\u392e\ub8be(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be.class, invokeinterface:\u4f4a\uafe7\u76bc\u392e\ub8be(Iterator<\u4f4a\uafe7\u76bc\u392e\ub8be>::next, var_4_A0:Iterator<\u4f4a\uafe7\u76bc\u392e\ub8be>))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u9937\u3bd6\ubcb0\u8389\u7c6b\u8308, var_5_C2:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))) {
                        putfield:\u4f4a\uafe7\u76bc\u392e\ub8be(\u3bd6\u6435\u4e72\uc9f6\u5140::\u873d\u4bc8\u8258\u16f6\ucb79\u5140, this:\u3bd6\u6435\u4e72\uc9f6\u5140, var_5_C2:\u4f4a\uafe7\u76bc\u392e\ub8be)
                        return:boolean(xor:int[expected:boolean](ldc:int(-16319), ldc:int(-16320)))
                    }
                    
                    var_1_D0 = and:int(var_1_D0:int, ldc:int(2113593658))
                }
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(24839), ldc:int(-24968)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u3d4b\u0b8e\u61a4\u12b2\uff55\u965f() {
        var_1_5F : int
        stack_B7_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(1879830102), ldc:int(2106715006))
            
            if (cmpne:boolean(getfield:\u4f4a\uafe7\u76bc\u392e\ub8be(\u3bd6\u6435\u4e72\uc9f6\u5140::\u873d\u4bc8\u8258\u16f6\ucb79\u5140, this:\u3bd6\u6435\u4e72\uc9f6\u5140), aconstnull:\u4f4a\uafe7\u76bc\u392e\ub8be())) {
                if (logicalnot:boolean(invokevirtual:boolean(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\u7ce1\uc246\u5bc4\u3d4b\u760c\uc2e8, getfield:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u3bd6\u6435\u4e72\uc9f6\u5140::\uc238\uc29a\u67e9\u4bc8\u59ec\ud12e, this:\u3bd6\u6435\u4e72\uc9f6\u5140)))) {
                    if (cmpgt:boolean(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u3e2a\ua3b4\u4975\u4179\u64f2\u6c52, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u3bd6\u6435\u4e72\uc9f6\u5140::\ub83f\u4f4a\ubefe\u385b\u8bb0\u4c2b, this:\u3bd6\u6435\u4e72\uc9f6\u5140), getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u3bd6\u6435\u4e72\uc9f6\u5140::\u873d\u4bc8\u8258\u16f6\ucb79\u5140, this:\u3bd6\u6435\u4e72\uc9f6\u5140)), f2d:double(mul:float(getfield:float(\u3bd6\u6435\u4e72\uc9f6\u5140::\u74b1\u4975\u7ce1\u40a9\u4d85\u6ec6, this:\u3bd6\u6435\u4e72\uc9f6\u5140), getfield:float(\u3bd6\u6435\u4e72\uc9f6\u5140::\u74b1\u4975\u7ce1\u40a9\u4d85\u6ec6, this:\u3bd6\u6435\u4e72\uc9f6\u5140))))) {
                        stack_B7_0 = xor:int[expected:boolean](ldc:int(9), ldc:int(8))
                        return:boolean(stack_B7_0:boolean)
                    }
                }
            }
            
            var_1_5F = and:int(var_1_5F:int, ldc:int(1910598230))
            stack_B7_0 = and:int[expected:boolean](ldc:int(-19514), ldc:int(19513))
            return:boolean(stack_B7_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    public void \ub7dc\u4c2b\ud523\ube23\u416d\u3776() {
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
            putfield:int(\u3bd6\u6435\u4e72\uc9f6\u5140::\ud12e\u983f\u72f1\u9255\uc84e\u7043, this:\u3bd6\u6435\u4e72\uc9f6\u5140, and:int(ldc:int(18971), ldc:int(-19228)))
            putfield:float(\u3bd6\u6435\u4e72\uc9f6\u5140::\ud36e\uc229\u88c5\u3776\u494c\u8350, this:\u3bd6\u6435\u4e72\uc9f6\u5140, invokevirtual:float(\u4f4a\uafe7\u76bc\u392e\ub8be::\u385b\u3a62\u183a\u836c\u76bc\u64f2, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be(\u3bd6\u6435\u4e72\uc9f6\u5140::\ub83f\u4f4a\ubefe\u385b\u8bb0\u4c2b, this:\u3bd6\u6435\u4e72\uc9f6\u5140), getstatic:\u8350\u7e3f\u8d98\u983f\u99f7\u61a4(\u8350\u7e3f\u8d98\u983f\u99f7\u61a4::\ua6bd\ub32d\ubefe\u92ee\u4c2b\u92ee)))
            invokevirtual:void(\u4f4a\uafe7\u76bc\u392e\ub8be::\u836c\ucef1\u34df\u4bc8\uc84e\u5bc4, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be(\u3bd6\u6435\u4e72\uc9f6\u5140::\ub83f\u4f4a\ubefe\u385b\u8bb0\u4c2b, this:\u3bd6\u6435\u4e72\uc9f6\u5140), getstatic:\u8350\u7e3f\u8d98\u983f\u99f7\u61a4(\u8350\u7e3f\u8d98\u983f\u99f7\u61a4::\ua6bd\ub32d\ubefe\u92ee\u4c2b\u92ee), ldc:float(0.0f))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7bad\u74b1\uc3e3\u760c\u4f52\u6c56() {
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
            putfield:\u4f4a\uafe7\u76bc\u392e\ub8be(\u3bd6\u6435\u4e72\uc9f6\u5140::\u873d\u4bc8\u8258\u16f6\ucb79\u5140, this:\u3bd6\u6435\u4e72\uc9f6\u5140, aconstnull:\u4f4a\uafe7\u76bc\u392e\ub8be())
            invokevirtual:void(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\ua6bd\u8c8a\u7043\u40a9\ud217\u47c2, getfield:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u3bd6\u6435\u4e72\uc9f6\u5140::\uc238\uc29a\u67e9\u4bc8\u59ec\ud12e, this:\u3bd6\u6435\u4e72\uc9f6\u5140))
            invokevirtual:void(\u4f4a\uafe7\u76bc\u392e\ub8be::\u836c\ucef1\u34df\u4bc8\uc84e\u5bc4, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be(\u3bd6\u6435\u4e72\uc9f6\u5140::\ub83f\u4f4a\ubefe\u385b\u8bb0\u4c2b, this:\u3bd6\u6435\u4e72\uc9f6\u5140), getstatic:\u8350\u7e3f\u8d98\u983f\u99f7\u61a4(\u8350\u7e3f\u8d98\u983f\u99f7\u61a4::\ua6bd\ub32d\ubefe\u92ee\u4c2b\u92ee), getfield:float(\u3bd6\u6435\u4e72\uc9f6\u5140::\ud36e\uc229\u88c5\u3776\u494c\u8350, this:\u3bd6\u6435\u4e72\uc9f6\u5140))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4c04\u74b1\u0800\u3a62\uafe7\u718f() {
        var_1_5F : int
        var_3_CA : double
        var_5_DA : double
        var_7_EB : double
        var_9_FC : double
        var_11_121 : \ub83f\u8753\ud217\u71f1\u6cfe
        
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
            var_1_5F = and:int(ldc:int(283757079), ldc:int(-1614396419))
            
            if (cmpne:boolean(getfield:\u4f4a\uafe7\u76bc\u392e\ub8be(\u3bd6\u6435\u4e72\uc9f6\u5140::\u873d\u4bc8\u8258\u16f6\ucb79\u5140, this:\u3bd6\u6435\u4e72\uc9f6\u5140), aconstnull:\u4f4a\uafe7\u76bc\u392e\ub8be())) {
                if (logicalnot:boolean(invokevirtual:boolean(\u4f4a\uafe7\u76bc\u392e\ub8be::\uf94d\u36d3\u6c52\ub8be\ub32d\u67d0, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be(\u3bd6\u6435\u4e72\uc9f6\u5140::\ub83f\u4f4a\ubefe\u385b\u8bb0\u4c2b, this:\u3bd6\u6435\u4e72\uc9f6\u5140)))) {
                    invokevirtual:void(\ub83f\u8753\ud217\u71f1\u6cfe::\u0800\u8cae\u6c56\ub8be\u3a62\u6435, invokevirtual:\ub83f\u8753\ud217\u71f1\u6cfe(\u4f4a\uafe7\u76bc\u392e\ub8be::\u7873\u51b2\ube23\ud158\u836c\ucfaf, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be(\u3bd6\u6435\u4e72\uc9f6\u5140::\ub83f\u4f4a\ubefe\u385b\u8bb0\u4c2b, this:\u3bd6\u6435\u4e72\uc9f6\u5140)), getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u3bd6\u6435\u4e72\uc9f6\u5140::\u873d\u4bc8\u8258\u16f6\ucb79\u5140, this:\u3bd6\u6435\u4e72\uc9f6\u5140), ldc:float(10.0f), i2f:float(invokevirtual:int(\u4f4a\uafe7\u76bc\u392e\ub8be::\u494c\u7ce1\u8413\u3711\ub83f\u71f1, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be(\u3bd6\u6435\u4e72\uc9f6\u5140::\ub83f\u4f4a\ubefe\u385b\u8bb0\u4c2b, this:\u3bd6\u6435\u4e72\uc9f6\u5140))))
                    
                    if (cmple:boolean(putfield:int(\u3bd6\u6435\u4e72\uc9f6\u5140::\ud12e\u983f\u72f1\u9255\uc84e\u7043, this:\u3bd6\u6435\u4e72\uc9f6\u5140, sub:int(getfield:int(\u3bd6\u6435\u4e72\uc9f6\u5140::\ud12e\u983f\u72f1\u9255\uc84e\u7043, this:\u3bd6\u6435\u4e72\uc9f6\u5140), xor:int(ldc:int(788), ldc:int(789)))), ldc:int(0))) {
                        putfield:int(\u3bd6\u6435\u4e72\uc9f6\u5140::\ud12e\u983f\u72f1\u9255\uc84e\u7043, this:\u3bd6\u6435\u4e72\uc9f6\u5140, ldc:int(10))
                        var_3_CA = sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u3bd6\u6435\u4e72\uc9f6\u5140::\ub83f\u4f4a\ubefe\u385b\u8bb0\u4c2b, this:\u3bd6\u6435\u4e72\uc9f6\u5140)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u3bd6\u6435\u4e72\uc9f6\u5140::\u873d\u4bc8\u8258\u16f6\ucb79\u5140, this:\u3bd6\u6435\u4e72\uc9f6\u5140)))
                        var_5_DA = sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u3bd6\u6435\u4e72\uc9f6\u5140::\ub83f\u4f4a\ubefe\u385b\u8bb0\u4c2b, this:\u3bd6\u6435\u4e72\uc9f6\u5140)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u3bd6\u6435\u4e72\uc9f6\u5140::\u873d\u4bc8\u8258\u16f6\ucb79\u5140, this:\u3bd6\u6435\u4e72\uc9f6\u5140)))
                        var_7_EB = sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u3bd6\u6435\u4e72\uc9f6\u5140::\ub83f\u4f4a\ubefe\u385b\u8bb0\u4c2b, this:\u3bd6\u6435\u4e72\uc9f6\u5140)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u3bd6\u6435\u4e72\uc9f6\u5140::\u873d\u4bc8\u8258\u16f6\ucb79\u5140, this:\u3bd6\u6435\u4e72\uc9f6\u5140)))
                        var_9_FC = add:double(add:double(mul:double(var_3_CA:double, var_3_CA:double), mul:double(var_5_DA:double, var_5_DA:double)), mul:double(var_7_EB:double, var_7_EB:double))
                        
                        if (cmple:boolean(var_9_FC:double, f2d:double(mul:float(getfield:float(\u3bd6\u6435\u4e72\uc9f6\u5140::\u74b1\u4975\u7ce1\u40a9\u4d85\u6ec6, this:\u3bd6\u6435\u4e72\uc9f6\u5140), getfield:float(\u3bd6\u6435\u4e72\uc9f6\u5140::\u74b1\u4975\u7ce1\u40a9\u4d85\u6ec6, this:\u3bd6\u6435\u4e72\uc9f6\u5140))))) {
                            var_1_5F = and:int(var_1_5F:int, ldc:int(-34093139))
                            invokevirtual:void(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\ua6bd\u8c8a\u7043\u40a9\ud217\u47c2, getfield:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u3bd6\u6435\u4e72\uc9f6\u5140::\uc238\uc29a\u67e9\u4bc8\u59ec\ud12e, this:\u3bd6\u6435\u4e72\uc9f6\u5140))
                            var_11_121 = invokevirtual:\ub83f\u8753\ud217\u71f1\u6cfe(\u4f4a\uafe7\u76bc\u392e\ub8be::\u7873\u51b2\ube23\ud158\u836c\ucfaf, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be(\u3bd6\u6435\u4e72\uc9f6\u5140::\u873d\u4bc8\u8258\u16f6\ucb79\u5140, this:\u3bd6\u6435\u4e72\uc9f6\u5140))
                            
                            if (cmpgt:boolean(var_9_FC:double, f2d:double(getfield:float(\u3bd6\u6435\u4e72\uc9f6\u5140::\u74b1\u4975\u7ce1\u40a9\u4d85\u6ec6, this:\u3bd6\u6435\u4e72\uc9f6\u5140)))) {
                                if (cmpne:boolean(invokevirtual:double(\ub83f\u8753\ud217\u71f1\u6cfe::\u624e\ua6bd\u1833\u494c\ube23\uc7fe, var_11_121:\ub83f\u8753\ud217\u71f1\u6cfe), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u3bd6\u6435\u4e72\uc9f6\u5140::\ub83f\u4f4a\ubefe\u385b\u8bb0\u4c2b, this:\u3bd6\u6435\u4e72\uc9f6\u5140)))) {
                                    return:void()
                                }
                                
                                if (cmpne:boolean(invokevirtual:double(\ub83f\u8753\ud217\u71f1\u6cfe::\u718f\ud158\u5d20\u6435\uc3e3\ud217, var_11_121:\ub83f\u8753\ud217\u71f1\u6cfe), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u3bd6\u6435\u4e72\uc9f6\u5140::\ub83f\u4f4a\ubefe\u385b\u8bb0\u4c2b, this:\u3bd6\u6435\u4e72\uc9f6\u5140)))) {
                                    return:void()
                                }
                                
                                if (cmpne:boolean(invokevirtual:double(\ub83f\u8753\ud217\u71f1\u6cfe::\u64f2\u965f\u71f1\u56bd\ubff1\uc7fe, var_11_121:\ub83f\u8753\ud217\u71f1\u6cfe), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u3bd6\u6435\u4e72\uc9f6\u5140::\ub83f\u4f4a\ubefe\u385b\u8bb0\u4c2b, this:\u3bd6\u6435\u4e72\uc9f6\u5140)))) {
                                    return:void()
                                }
                            }
                            
                            var_1_5F = and:int(var_1_5F:int, ldc:int(-1130696169))
                            invokevirtual:boolean(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\u3711\u7049\u8cae\u72f1\uc7fe\u5140, getfield:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u3bd6\u6435\u4e72\uc9f6\u5140::\uc238\uc29a\u67e9\u4bc8\u59ec\ud12e, this:\u3bd6\u6435\u4e72\uc9f6\u5140), sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u3bd6\u6435\u4e72\uc9f6\u5140::\ub83f\u4f4a\ubefe\u385b\u8bb0\u4c2b, this:\u3bd6\u6435\u4e72\uc9f6\u5140)), sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u3bd6\u6435\u4e72\uc9f6\u5140::\u873d\u4bc8\u8258\u16f6\ucb79\u5140, this:\u3bd6\u6435\u4e72\uc9f6\u5140)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u3bd6\u6435\u4e72\uc9f6\u5140::\ub83f\u4f4a\ubefe\u385b\u8bb0\u4c2b, this:\u3bd6\u6435\u4e72\uc9f6\u5140)))), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u3bd6\u6435\u4e72\uc9f6\u5140::\ub83f\u4f4a\ubefe\u385b\u8bb0\u4c2b, this:\u3bd6\u6435\u4e72\uc9f6\u5140)), sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u3bd6\u6435\u4e72\uc9f6\u5140::\ub83f\u4f4a\ubefe\u385b\u8bb0\u4c2b, this:\u3bd6\u6435\u4e72\uc9f6\u5140)), sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u3bd6\u6435\u4e72\uc9f6\u5140::\u873d\u4bc8\u8258\u16f6\ucb79\u5140, this:\u3bd6\u6435\u4e72\uc9f6\u5140)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u3bd6\u6435\u4e72\uc9f6\u5140::\ub83f\u4f4a\ubefe\u385b\u8bb0\u4c2b, this:\u3bd6\u6435\u4e72\uc9f6\u5140)))), getfield:double(\u3bd6\u6435\u4e72\uc9f6\u5140::\uf9c5\u51b2\u5db4\u6c52\u6c56\u62da, this:\u3bd6\u6435\u4e72\uc9f6\u5140))
                        }
                        else {
                            invokevirtual:boolean(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\u960f\u839e\u4ab3\ud523\u7af6\ud12e, getfield:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u3bd6\u6435\u4e72\uc9f6\u5140::\uc238\uc29a\u67e9\u4bc8\u59ec\ud12e, this:\u3bd6\u6435\u4e72\uc9f6\u5140), getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u3bd6\u6435\u4e72\uc9f6\u5140::\u873d\u4bc8\u8258\u16f6\ucb79\u5140, this:\u3bd6\u6435\u4e72\uc9f6\u5140), getfield:double(\u3bd6\u6435\u4e72\uc9f6\u5140::\uf9c5\u51b2\u5db4\u6c52\u6c56\u62da, this:\u3bd6\u6435\u4e72\uc9f6\u5140))
                        }
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u9033\u8d98\u156b\uceb8\u72f1\u98a4$0(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be p0, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be p1) {
        var_2_61 : int
        stack_99_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(-29221917), ldc:int(-1154352145))
            
            if (logicaland:boolean(cmpne:boolean(p1:\u4f4a\uafe7\u76bc\u392e\ub8be, aconstnull:\u4f4a\uafe7\u76bc\u392e\ub8be()), cmpne:boolean(invokevirtual:Class<? extends \u4f4a\uafe7\u76bc\u392e\ub8be>(\u4f4a\uafe7\u76bc\u392e\ub8be::getClass, p0:\u4f4a\uafe7\u76bc\u392e\ub8be), invokevirtual:Class<? extends \u4f4a\uafe7\u76bc\u392e\ub8be>(\u4f4a\uafe7\u76bc\u392e\ub8be::getClass, p1:\u4f4a\uafe7\u76bc\u392e\ub8be)))) {
                stack_99_0 = xor:int(ldc:int(26628), ldc:int(26629))
            }
            else {
                var_2_61 = and:int(var_2_61:int, ldc:int(-8050045))
                stack_99_0 = and:int(ldc:int(-2639), ldc:int(2638))
            }
            
            return:boolean(stack_99_0:int)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1EC : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_AC_0 : byte[] [generated]
        stack_AE_0 : byte[] [generated]
        stack_DC_0 : byte[] [generated]
        stack_194_0 : byte[] [generated]
        stack_1FF_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_124 : byte[]
        var_4_125 : int
        expr_8F : int [generated]
        var_5_175 : int
        var_3_17A : byte[]
        var_4_17B : int
        expr_197 : byte [generated]
        var_0_1F5 : int
        expr_1FF : byte [generated]
        stack_22F_2 : byte [generated]
        expr_AE : int [generated]
        var_3_E8 : String
        stack_11B_0 : String[] [generated]
        expr_FA : String[] [generated]
        
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
            var_0_1EC = and:int(ldc:int(-190499217), ldc:int(-34891905))
            expr_68 = var_2_6C = stack_8D_0 = stack_8F_0 = stack_AC_0 = stack_AE_0 = stack_DC_0 = stack_194_0 = stack_1FF_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("H4PYMCAP+9AkcSvi+AkPqrQ0ZUvi98kUov9YE/PchDuEm++YCX2A"))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_124 = newarray:byte[](byte.class, expr_70:int)
                var_4_125 = expr_70:int
                
                loop {
                    var_0_1EC = and:int(var_0_1EC:int, ldc:int(-29657913))
                    var_4_125 = add:int(var_4_125:int, ldc:int(-1))
                    storeelement:byte(var_3_124:byte[], var_4_125:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_125:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_125:int, xor:int(ldc:int(8528), ldc:int(8529)))), ldc:int(6)), and:int(ldc:int(4611), ldc:int(1435)))))
                    
                    if (cmpne:boolean(var_4_125:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_AC_0 = stack_AE_0 = stack_DC_0 = stack_194_0 = stack_1FF_0 = var_3_124:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_1EC:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0179)
                }
                
                if (cmpeq:boolean(and:int(var_0_1EC:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0148)
                }
                
                var_0_1EC = and:int(var_0_1EC:int, ldc:int(-138849329))
                expr_8F = arraylength:int(stack_8F_0:byte[])
                
                if (cmpeq:boolean(expr_8F:int, ldc:int(0))) {
                    goto(Label_0148)
                }
                
                var_5_175 = expr_8F:int
                var_3_17A = newarray:byte[](byte.class, expr_8F:int)
                var_4_17B = expr_8F:int
                Label_0381:
                
                while (cmpne:boolean(and:int(var_0_1EC:int, ldc:int(64)), ldc:int(0))) {
                    var_0_1EC = and:int(var_0_1EC:int, ldc:int(-38407837))
                    var_4_17B = add:int(var_4_17B:int, ldc:int(-1))
                    expr_197 = add:byte(loadelement:byte(stack_194_0:byte[], var_4_17B:int), ldc:byte(32))
                    storeelement:byte(var_3_17A:byte[], var_4_17B:int, xor:int(or:int(and:int(shl:int(expr_197:byte, and:int(ldc:int(12308), ldc:int(711))), ldc:int(-16)), and:int(shr:int(expr_197:byte[expected:int], and:int(ldc:int(4132), ldc:int(2525))), ldc:int(15))), ldc:int(11)))
                    
                    if (cmpne:boolean(var_4_17B:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_8F_0 = stack_8D_0 = stack_AC_0 = stack_AE_0 = stack_DC_0 = stack_194_0 = stack_1FF_0 = var_3_17A:byte[]
                    goto(Label_0148)
                }
                
                Label_0479:
                
                while (cmpne:boolean(and:int(var_0_1EC:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_1F5 = and:int(var_0_1EC:int, ldc:int(-181046713))
                    var_4_17B = add:int(var_4_17B:int, ldc:int(-1))
                    expr_1FF = loadelement:byte(stack_1FF_0:byte[], var_4_17B:int)
                    
                    if (cmpge:boolean(add:int(add:int(var_4_17B:int, ldc:int(2)), neg:int(var_5_175:int)), ldc:int(0))) {
                        var_0_1F5 = and:int(var_0_1F5:int, ldc:int(-163768497))
                        stack_22F_2 = add:byte(expr_1FF:byte, ldc:byte(2))
                    }
                    else {
                        stack_22F_2 = add:byte(expr_1FF:byte, loadelement:byte(var_3_17A:byte[], add:int(var_4_17B:int, ldc:int(2))))
                    }
                    
                    var_0_1EC = and:int(var_0_1F5:int, ldc:int(-182193665))
                    storeelement:byte(var_3_17A:byte[], var_4_17B:int, stack_22F_2:byte)
                    
                    if (cmpne:boolean(var_4_17B:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_8F_0 = stack_8D_0 = stack_AC_0 = stack_AE_0 = stack_DC_0 = stack_194_0 = stack_1FF_0 = var_3_17A:byte[]
                    goto(Label_0179)
                }
                
                var_0_1EC = and:int(var_0_1EC:int, ldc:int(1486641076))
                goto(Label_0381)
                Label_0148:
                
                if (cmpeq:boolean(and:int(var_0_1EC:int, ldc:int(134217728)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_1EC:int, ldc:int(32768)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_1EC = and:int(var_0_1EC:int, ldc:int(-168206857))
                    expr_AE = arraylength:int(stack_AE_0:byte[])
                    
                    if (cmpne:boolean(expr_AE:int, ldc:int(0))) {
                        var_5_175 = expr_AE:int
                        var_3_17A = newarray:byte[](byte.class, expr_AE:int)
                        var_4_17B = expr_AE:int
                        goto(Label_0479)
                    }
                }
                
                Label_0179:
                
                if (cmpne:boolean(and:int(var_0_1EC:int, ldc:int(524288)), ldc:int(0))) {
                    var_0_1EC = and:int(var_0_1EC:int, ldc:int(1232034286))
                    goto(Label_0148)
                }
                
                if (cmpne:boolean(and:int(var_0_1EC:int, ldc:int(1073741824)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_1EC = and:int(var_0_1EC:int, ldc:int(-406571620))
            }
            
            var_3_E8 = initobject:String(String::<init>, stack_DC_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_11B_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1165), ldc:int(2115)))
            expr_FA = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(960), ldc:int(961)))
            storeelement:String(expr_FA:String[], and:int(ldc:int(-6329), ldc:int(6328)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(26882), ldc:int(-26884)), xor:int(ldc:int(5442), ldc:int(5476))))
            putstatic:String[](\u3bd6\u6435\u4e72\uc9f6\u5140::\u416d\u7873\u5f50\u8258\u8bb0\uf995, expr_FA:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub8be\u4c2b\u071d\ub70c\ubded\u6d99(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
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
        var_3_696 = and:int(ldc:int(195134100), ldc:int(-1423720378))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3bd6\u6435\u4e72\uc9f6\u5140[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
            var_3_696 = and:int(var_3_696:int, ldc:int(1068186612))
            var_5_81 = and:int(ldc:int(-32673), ldc:int(32640))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-27485), ldc:int(27476)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_696:int, ldc:int(-81310845))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(8800), ldc:int(8801)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(7441), ldc:int(24609)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_696 = and:int(var_3_D1:int, ldc:int(-1103133289))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(19015), ldc:int(8209)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1373291624))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(749206824))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(720315984))
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-498069547))
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1300944236))
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-39774047))
                    }
                    else {
                        var_3_696 = and:int(var_3_696:int, ldc:int(505793370))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0595)
                            }
                            
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(2056669513))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1004303655))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1983848921))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1593424950))
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1570299236))
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(186735982))
                            var_11_E2 = and:int(ldc:int(-11576), ldc:int(2343))
                            goto(Label_1571)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0595:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(169410166))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-532099806))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1370717832))
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1431406832))
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-790850950))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-538054822))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0729:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-341461522))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1322599124))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(160012922))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1507906235))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(799746790))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0861:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-257069258))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1901698953))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(258553231))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(8203), ldc:int(8202))
                                goto(Label_1137)
                            }
                        }
                    }
                    
                    Label_0968:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(180726627))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1449875181))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0861)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(948919186))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1543491989))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1291851749))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1154229508))
                        var_11_E2 = and:int(ldc:int(6), ldc:int(-7))
                    }
                    
                    Label_1137:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1682633608))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1913347210))
                            goto(Label_0968)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1405795947))
                            goto(Label_0861)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(194327899))
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1961621423))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(686643846))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(535812315))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1425)
                            }
                        }
                    }
                    
                    Label_1280:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(2106746790))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1812828869))
                            goto(Label_1137)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0968)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-781576079))
                            goto(Label_0861)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1306555070))
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(648721502))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1149541079))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1571)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1425:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1125722059))
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1288157360))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-40579770))
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-133152103))
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1425578919))
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_696 = and:int(var_3_696:int, ldc:int(-1947890222))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1571:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A1 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1582:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1398025372))
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1829322319))
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1888931469))
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-878204319))
                        var_17_6A1 = add:int(var_16_110:int, xor:int(ldc:int(17408), ldc:int(17409)))
                        looporswitchbreak()
                    }
                }
                
                var_3_696 = and:int(var_3_696:int, ldc:int(-1952373767))
                
                if (cmple:boolean(var_5_81 = var_17_6A1:int, sub:int(var_6_88:int, and:int(ldc:int(4105), ldc:int(18083))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
