public class \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 {
    public void \uafe7\uc7fe\u4c04\u6b5f\u5bc4() {
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
    
    public void \u99f7\u4d85\u5bc4\u12cb\ub32d\u839e(double p0, double p1, double p2) {
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
            invokevirtual:void(\uc87f\u5f50\u16f6\ub113\u52d3\u12b2::\u71f1\u9af2\u960f\u6b5f\u34df\ubf56, invokestatic:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\u3711\u6c52\ufcaf\u4bc8\ud158::\u61a4\u76bc\u0c95\u1833\u7043\u3711, checkcast:\u3711\u6c52\ufcaf\u4bc8\ud158(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u3711\u6c52\ufcaf\u4bc8\ud158.class, invokeinterface:\u3711\u6c52\ufcaf\u4bc8\ud158(Deque<\u3711\u6c52\ufcaf\u4bc8\ud158>::getLast, getfield:Deque<\u3711\u6c52\ufcaf\u4bc8\ud158>(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u3e75\u3bc9\ufe34\u47c2\u6c52\ub8be, this:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)))), d2f:float(p0:double), d2f:float(p1:double), d2f:float(p2:double))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uf94d\ub18d\u5654\ubff1\u624e\ua6bd(float p0, float p1, float p2) {
        var_4_61 : int
        var_6_6F : \u3711\u6c52\ufcaf\u4bc8\ud158
        var_7_8C : float
        var_8_91 : float
        var_9_96 : float
        var_10_A3 : float
        
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
            var_4_61 = and:int(ldc:int(-1722257823), ldc:int(-1814503501))
            var_6_6F = checkcast:\u3711\u6c52\ufcaf\u4bc8\ud158(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u3711\u6c52\ufcaf\u4bc8\ud158.class, invokeinterface:\u3711\u6c52\ufcaf\u4bc8\ud158(Deque<\u3711\u6c52\ufcaf\u4bc8\ud158>::getLast, getfield:Deque<\u3711\u6c52\ufcaf\u4bc8\ud158>(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u3e75\u3bc9\ufe34\u47c2\u6c52\ub8be, this:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)))
            invokevirtual:void(\uc87f\u5f50\u16f6\ub113\u52d3\u12b2::\u5db4\u0b8e\ub7dc\u56bd\u7330\uc9f6, invokestatic:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\u3711\u6c52\ufcaf\u4bc8\ud158::\u61a4\u76bc\u0c95\u1833\u7043\u3711, var_6_6F:\u3711\u6c52\ufcaf\u4bc8\ud158), p0:float, p1:float, p2:float)
            
            if (cmpeq:boolean(p0:float, p1:float)) {
                if (cmpeq:boolean(p1:float, p2:float)) {
                    if (cmpgt:boolean(p0:float, ldc:float(0.0f))) {
                        return:void()
                    }
                    
                    var_4_61 = and:int(var_4_61:int, ldc:int(-1344501719))
                    invokevirtual:void(\u67e9\uc4d2\u4f52\u965f\u8308\ua562::\u4e72\uc87f\ucef1\u4daf\ud4fe\u5bc4, invokestatic:\u67e9\uc4d2\u4f52\u965f\u8308\ua562(\u3711\u6c52\ufcaf\u4bc8\ud158::\ub83f\u2dcc\u3d64\u8bb0\u67e9\u3711, var_6_6F:\u3711\u6c52\ufcaf\u4bc8\ud158), ldc:float(-1.0f))
                }
            }
            
            var_7_8C = div:float(ldc:float(1.0f), p0:float)
            var_8_91 = div:float(ldc:float(1.0f), p1:float)
            var_9_96 = div:float(ldc:float(1.0f), p2:float)
            var_10_A3 = invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ubefe\u718f\u1187\u8d98\u446c\ube23, mul:float(mul:float(var_7_8C:float, var_8_91:float), var_9_96:float))
            invokevirtual:void(\u67e9\uc4d2\u4f52\u965f\u8308\ua562::\u4e72\uc87f\ucef1\u4daf\ud4fe\u5bc4, invokestatic:\u67e9\uc4d2\u4f52\u965f\u8308\ua562(\u3711\u6c52\ufcaf\u4bc8\ud158::\ub83f\u2dcc\u3d64\u8bb0\u67e9\u3711, var_6_6F:\u3711\u6c52\ufcaf\u4bc8\ud158), invokestatic:\u67e9\uc4d2\u4f52\u965f\u8308\ua562(\u67e9\uc4d2\u4f52\u965f\u8308\ua562::\u8df4\u071d\u74b1\uae5d\u927d\u3bd6, mul:float(var_10_A3:float, var_7_8C:float), mul:float(var_10_A3:float, var_8_91:float), mul:float(var_10_A3:float, var_9_96:float)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ucfaf\u1187\u4c2b\u8350\u5f50\uc910(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ucef1\u6c52\u5654\u4cd9\u61a4\ua6bd p0) {
        var_4_6C : \u3711\u6c52\ufcaf\u4bc8\ud158
        
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
            var_4_6C = checkcast:\u3711\u6c52\ufcaf\u4bc8\ud158(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u3711\u6c52\ufcaf\u4bc8\ud158.class, invokeinterface:\u3711\u6c52\ufcaf\u4bc8\ud158(Deque<\u3711\u6c52\ufcaf\u4bc8\ud158>::getLast, getfield:Deque<\u3711\u6c52\ufcaf\u4bc8\ud158>(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u3e75\u3bc9\ufe34\u47c2\u6c52\ub8be, this:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)))
            invokevirtual:void(\uc87f\u5f50\u16f6\ub113\u52d3\u12b2::\u99f7\u3776\uc238\u6435\u5db4\u392e, invokestatic:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\u3711\u6c52\ufcaf\u4bc8\ud158::\u61a4\u76bc\u0c95\u1833\u7043\u3711, var_4_6C:\u3711\u6c52\ufcaf\u4bc8\ud158), p0:\ucef1\u6c52\u5654\u4cd9\u61a4\ua6bd)
            invokevirtual:void(\u67e9\uc4d2\u4f52\u965f\u8308\ua562::\u4e72\uc87f\ucef1\u4daf\ud4fe\u5bc4, invokestatic:\u67e9\uc4d2\u4f52\u965f\u8308\ua562(\u3711\u6c52\ufcaf\u4bc8\ud158::\ub83f\u2dcc\u3d64\u8bb0\u67e9\u3711, var_4_6C:\u3711\u6c52\ufcaf\u4bc8\ud158), p0:\ucef1\u6c52\u5654\u4cd9\u61a4\ua6bd)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9937\u7d52\u3e75\u98a4\u8aa5\u7006() {
        var_1_5F : int
        var_3_6C : \u3711\u6c52\ufcaf\u4bc8\ud158
        var_4_79 : \u3711\u6c52\ufcaf\u4bc8\ud158
        
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
            var_1_5F = and:int(ldc:int(-2030920255), ldc:int(-354483725))
            var_3_6C = checkcast:\u3711\u6c52\ufcaf\u4bc8\ud158(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u3711\u6c52\ufcaf\u4bc8\ud158.class, invokeinterface:\u3711\u6c52\ufcaf\u4bc8\ud158(Deque<\u3711\u6c52\ufcaf\u4bc8\ud158>::getLast, getfield:Deque<\u3711\u6c52\ufcaf\u4bc8\ud158>(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u3e75\u3bc9\ufe34\u47c2\u6c52\ub8be, this:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)))
            var_4_79 = checkcast:\u3711\u6c52\ufcaf\u4bc8\ud158(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u3711\u6c52\ufcaf\u4bc8\ud158.class, invokeinterface:\u3711\u6c52\ufcaf\u4bc8\ud158(Deque<\u3711\u6c52\ufcaf\u4bc8\ud158>::pollLast, getfield:Deque<\u3711\u6c52\ufcaf\u4bc8\ud158>(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u67e9\u5fe1\u839e\uae87\u9033\u7d52, this:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)))
            
            if (cmpne:boolean(var_4_79:\u3711\u6c52\ufcaf\u4bc8\ud158, aconstnull:\u3711\u6c52\ufcaf\u4bc8\ud158())) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1550688397))
                invokevirtual:void(\uc87f\u5f50\u16f6\ub113\u52d3\u12b2::\u8aa5\u56bd\u3776\ua068\u8c8a\ubded, invokestatic:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\u3711\u6c52\ufcaf\u4bc8\ud158::\u61a4\u76bc\u0c95\u1833\u7043\u3711, var_4_79:\u3711\u6c52\ufcaf\u4bc8\ud158), invokestatic:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\u3711\u6c52\ufcaf\u4bc8\ud158::\u61a4\u76bc\u0c95\u1833\u7043\u3711, var_3_6C:\u3711\u6c52\ufcaf\u4bc8\ud158))
                invokevirtual:void(\u67e9\uc4d2\u4f52\u965f\u8308\ua562::\u59ec\ub70c\u9a18\u7330\ud217\u3e2a, invokestatic:\u67e9\uc4d2\u4f52\u965f\u8308\ua562(\u3711\u6c52\ufcaf\u4bc8\ud158::\ub83f\u2dcc\u3d64\u8bb0\u67e9\u3711, var_4_79:\u3711\u6c52\ufcaf\u4bc8\ud158), invokestatic:\u67e9\uc4d2\u4f52\u965f\u8308\ua562(\u3711\u6c52\ufcaf\u4bc8\ud158::\ub83f\u2dcc\u3d64\u8bb0\u67e9\u3711, var_3_6C:\u3711\u6c52\ufcaf\u4bc8\ud158))
            }
            else {
                var_4_79 = initobject:\u3711\u6c52\ufcaf\u4bc8\ud158(\u3711\u6c52\ufcaf\u4bc8\ud158::<init>, invokevirtual:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\uc87f\u5f50\u16f6\ub113\u52d3\u12b2::\u64f2\u527a\u97b7\u8640\u7006\u071d, invokestatic:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\u3711\u6c52\ufcaf\u4bc8\ud158::\u61a4\u76bc\u0c95\u1833\u7043\u3711, var_3_6C:\u3711\u6c52\ufcaf\u4bc8\ud158)), invokevirtual:\u67e9\uc4d2\u4f52\u965f\u8308\ua562(\u67e9\uc4d2\u4f52\u965f\u8308\ua562::\u7bad\u5db4\u9255\uc29a\u6435\u4f4a, invokestatic:\u67e9\uc4d2\u4f52\u965f\u8308\ua562(\u3711\u6c52\ufcaf\u4bc8\ud158::\ub83f\u2dcc\u3d64\u8bb0\u67e9\u3711, var_3_6C:\u3711\u6c52\ufcaf\u4bc8\ud158)), aconstnull:\u7e3f\ubded\u416d\ua6bd\uc2e8())
            }
            
            invokeinterface:void(Deque<\u3711\u6c52\ufcaf\u4bc8\ud158>::addLast, getfield:Deque<\u3711\u6c52\ufcaf\u4bc8\ud158>(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u3e75\u3bc9\ufe34\u47c2\u6c52\ub8be, this:\uafe7\uc7fe\u4c04\u6b5f\u5bc4), var_4_79:\u3711\u6c52\ufcaf\u4bc8\ud158)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4ab3\u839e\ub1b9\u1833\u4cd9\u2dcc() {
        var_3_6C : \u3711\u6c52\ufcaf\u4bc8\ud158
        
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
            var_3_6C = checkcast:\u3711\u6c52\ufcaf\u4bc8\ud158(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u3711\u6c52\ufcaf\u4bc8\ud158.class, invokeinterface:\u3711\u6c52\ufcaf\u4bc8\ud158(Deque<\u3711\u6c52\ufcaf\u4bc8\ud158>::removeLast, getfield:Deque<\u3711\u6c52\ufcaf\u4bc8\ud158>(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u3e75\u3bc9\ufe34\u47c2\u6c52\ub8be, this:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)))
            
            if (cmpne:boolean(var_3_6C:\u3711\u6c52\ufcaf\u4bc8\ud158, aconstnull:\u3711\u6c52\ufcaf\u4bc8\ud158())) {
                invokeinterface:boolean(Deque<\u3711\u6c52\ufcaf\u4bc8\ud158>::add, getfield:Deque<\u3711\u6c52\ufcaf\u4bc8\ud158>(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u67e9\u5fe1\u839e\uae87\u9033\u7d52, this:\uafe7\uc7fe\u4c04\u6b5f\u5bc4), var_3_6C:\u3711\u6c52\ufcaf\u4bc8\ud158)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u3711\u6c52\ufcaf\u4bc8\ud158 \u9033\u12b2\u516c\u97e6\u6d99\ua3b4() {
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
            return:\u3711\u6c52\ufcaf\u4bc8\ud158(checkcast:\u3711\u6c52\ufcaf\u4bc8\ud158(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u3711\u6c52\ufcaf\u4bc8\ud158.class, invokeinterface:\u3711\u6c52\ufcaf\u4bc8\ud158(Deque<\u3711\u6c52\ufcaf\u4bc8\ud158>::getLast, getfield:Deque<\u3711\u6c52\ufcaf\u4bc8\ud158>(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u3e75\u3bc9\ufe34\u47c2\u6c52\ub8be, this:\uafe7\uc7fe\u4c04\u6b5f\u5bc4))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \uf995\u3e75\u946b\uf995\u4c2b\ucfaf() {
        var_1_5F : int
        stack_92_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-1210826191), ldc:int(2147304183))
            
            if (cmpne:boolean(invokeinterface:int(Deque<E>::size, getfield:Deque<\u3711\u6c52\ufcaf\u4bc8\ud158>(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u3e75\u3bc9\ufe34\u47c2\u6c52\ub8be, this:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)), xor:int(ldc:int(1028), ldc:int(1029)))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1214820170))
                stack_92_0 = and:int(ldc:int(27650), ldc:int(-27779))
            }
            else {
                stack_92_0 = xor:int(ldc:int(-27584), ldc:int(-27583))
            }
            
            return:boolean(stack_92_0:int)
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String toString() {
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
            return:String(invokevirtual:String(\u3711\u6c52\ufcaf\u4bc8\ud158::toString, invokevirtual:\u3711\u6c52\ufcaf\u4bc8\ud158(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9033\u12b2\u516c\u97e6\u6d99\ua3b4, this:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u3e75\u12cb\u0c95\ub102\u385b\ub113$0(java.util.ArrayDeque p0) {
        var_3_67 : \uc87f\u5f50\u16f6\ub113\u52d3\u12b2
        var_4_73 : \u67e9\uc4d2\u4f52\u965f\u8308\ua562
        
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
            var_3_67 = initobject:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\uc87f\u5f50\u16f6\ub113\u52d3\u12b2::<init>)
            invokevirtual:void(\uc87f\u5f50\u16f6\ub113\u52d3\u12b2::\ub1b9\u3d4b\u8413\u5fe1\u92ee\u40a9, var_3_67:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2)
            var_4_73 = initobject:\u67e9\uc4d2\u4f52\u965f\u8308\ua562(\u67e9\uc4d2\u4f52\u965f\u8308\ua562::<init>)
            invokevirtual:void(\u67e9\uc4d2\u4f52\u965f\u8308\ua562::\u5140\u5245\u69d9\ubf56\u4179\u64ab, var_4_73:\u67e9\uc4d2\u4f52\u965f\u8308\ua562)
            invokevirtual:boolean(ArrayDeque<\u3711\u6c52\ufcaf\u4bc8\ud158>::add, p0:ArrayDeque<\u3711\u6c52\ufcaf\u4bc8\ud158>, initobject:\u3711\u6c52\ufcaf\u4bc8\ud158(\u3711\u6c52\ufcaf\u4bc8\ud158::<init>, var_3_67:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_4_73:\u67e9\uc4d2\u4f52\u965f\u8308\ua562, aconstnull:\u7e3f\ubded\u416d\ua6bd\uc2e8()))
            return:void()
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud4fe\uc87f\u6435\u5f50\u0a06\u2dcc(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6E8 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C3 : double
        var_3_D5 : int
        var_11_E6 : int
        var_14_110 : double
        var_16_114 : int
        var_12_10C : double
        var_17_6F3 : int
        
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
        var_3_6E8 = and:int(ldc:int(27711138), ldc:int(1824304398))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uafe7\uc7fe\u4c04\u6b5f\u5bc4[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(8)), ldc:int(0))) {
            var_3_6E8 = and:int(var_3_6E8:int, ldc:int(-2025072292))
        }
        else {
            var_3_6E8 = and:int(var_3_6E8:int, ldc:int(1337854254))
            var_5_85 = and:int(ldc:int(-25129), ldc:int(25128))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(9864), ldc:int(-9930)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C3 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D5 = and:int(var_3_6E8:int, ldc:int(312817815))
                    var_9_C3 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E6 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E6:int, sub:int(var_6_8C:int, xor:int(ldc:int(8242), ldc:int(8243)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E6:int, and:int(ldc:int(1), ldc:int(8613)))), var_7_9B:double))) {
                        inc:int(var_11_E6, ldc:int(1))
                    }
                    
                    var_3_6E8 = and:int(var_3_D5:int, ldc:int(-907718498))
                    var_14_110 = var_7_9B:double
                    var_16_114 = var_11_E6:int
                }
                else {
                    var_11_E6 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(39), ldc:int(38)))
                    var_12_10C = var_14_110 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_114 = var_11_E6:int, var_6_8C:int)) {
                        var_9_C3 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E6:int)
                        var_16_114 = var_11_E6:int
                        var_14_110 = var_12_10C:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(249549662))
                        goto(Label_1656)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E8:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(-662096742))
                        goto(Label_1328)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(329591078))
                        goto(Label_1197)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1037)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(-1226991801))
                        goto(Label_0895)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(-759647569))
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E8:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0614)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(-495748454))
                    }
                    else {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(-1213625553))
                        
                        if (cmplt:boolean(var_16_114:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0614)
                            }
                            
                            goto(Label_0895)
                        }
                    }
                    
                    Label_0422:
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(-1264268079))
                        goto(Label_1656)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(741963774))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(-572961076))
                        goto(Label_1328)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(-46373064))
                        goto(Label_1197)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(1190474547))
                        goto(Label_1037)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(1881123429))
                        goto(Label_0895)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(-1271906697))
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E8:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6E8:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6E8 = and:int(var_3_6E8:int, ldc:int(435048047))
                            var_11_E6 = and:int(ldc:int(7993), ldc:int(-8190))
                            goto(Label_1645)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0614:
                    
                    if (cmpeq:boolean(and:int(var_3_6E8:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(493216109))
                        goto(Label_1656)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(-1302024613))
                        goto(Label_1328)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E8:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1197)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(-359327871))
                        goto(Label_1037)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0895)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(582329006))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6E8 = and:int(var_3_6E8:int, ldc:int(-1557925788))
                            goto(Label_0422)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(1022642462))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_110 = var_9_C3:double
                            goto(Label_0895)
                        }
                    }
                    
                    Label_0746:
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(-713744945))
                        goto(Label_1656)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(387412300))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E8:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1328)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E8:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(668727687))
                        goto(Label_1197)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1037)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(1592716504))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0614)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6E8 = and:int(var_3_6E8:int, ldc:int(1819564732))
                            goto(Label_0422)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6E8 = and:int(var_3_6E8:int, ldc:int(1740019692))
                            loopcontinue()
                        }
                        
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(1957740623))
                        var_14_110 = mul:double(ldc:double(0.5), add:double(var_9_C3:double, var_14_110:double))
                    }
                    
                    Label_0895:
                    
                    if (cmpeq:boolean(and:int(var_3_6E8:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(821660033))
                        goto(Label_1656)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(220991053))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(-517154425))
                        goto(Label_1328)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1197)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(-500475904))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6E8 = and:int(var_3_6E8:int, ldc:int(94430282))
                            goto(Label_0614)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0422)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6E8 = and:int(var_3_6E8:int, ldc:int(1081708564))
                            loopcontinue()
                        }
                        
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(-72520981))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E6 = and:int(ldc:int(2389), ldc:int(8193))
                                goto(Label_1197)
                            }
                        }
                    }
                    
                    Label_1037:
                    
                    if (cmpeq:boolean(and:int(var_3_6E8:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(1009303238))
                        goto(Label_1656)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(1582348681))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(-31364166))
                        goto(Label_1328)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0895)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0614)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E8:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0422)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6E8 = and:int(var_3_6E8:int, ldc:int(1211139954))
                            loopcontinue()
                        }
                        
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(-1344006058))
                        var_11_E6 = and:int(ldc:int(18864), ldc:int(-27577))
                    }
                    
                    Label_1197:
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1656)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E8:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(1383899015))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(1206177037))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6E8 = and:int(var_3_6E8:int, ldc:int(-756577164))
                            goto(Label_1037)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6E8 = and:int(var_3_6E8:int, ldc:int(-19544556))
                            goto(Label_0895)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E8:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E8:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6E8 = and:int(var_3_6E8:int, ldc:int(1097748968))
                            goto(Label_0614)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0422)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(296616842))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E6:int, ldc:int(0))) {
                                goto(Label_1482)
                            }
                        }
                    }
                    
                    Label_1328:
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1656)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E8:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6E8 = and:int(var_3_6E8:int, ldc:int(1132168457))
                            goto(Label_1197)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6E8 = and:int(var_3_6E8:int, ldc:int(2020407207))
                            goto(Label_1037)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0895)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6E8 = and:int(var_3_6E8:int, ldc:int(-1772880490))
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6E8 = and:int(var_3_6E8:int, ldc:int(-1170089297))
                            goto(Label_0614)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E8:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6E8 = and:int(var_3_6E8:int, ldc:int(599623650))
                            goto(Label_0422)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6E8 = and:int(var_3_6E8:int, ldc:int(-529174076))
                            loopcontinue()
                        }
                        
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(1912180686))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_110:double, var_5_85:int, var_16_114:int)
                        goto(Label_1645)
                    }
                    
                    Label_1482:
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(1040003515))
                        goto(Label_1656)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(137103031))
                        goto(Label_1328)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(1081585314))
                        goto(Label_1197)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1037)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(1582775002))
                        goto(Label_0895)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(981988524))
                        goto(Label_0614)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(126334971))
                        goto(Label_0422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(-633307496))
                        loopcontinue()
                    }
                    
                    var_3_6E8 = and:int(var_3_6E8:int, ldc:int(1810340738))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_110:double, ldc:double(0.0))
                    Label_1645:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6F3 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E6:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1656:
                    
                    if (cmpeq:boolean(and:int(var_3_6E8:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(1570701650))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1328)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1197)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1037)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(-462446488))
                        goto(Label_0895)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E8:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0614)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E8:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(-1708067682))
                        goto(Label_0422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E8:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6E8 = and:int(var_3_6E8:int, ldc:int(1928489198))
                        var_17_6F3 = add:int(var_16_114:int, and:int(ldc:int(709), ldc:int(19)))
                        looporswitchbreak()
                    }
                    
                    var_3_6E8 = and:int(var_3_6E8:int, ldc:int(-1017167793))
                }
                
                var_3_6E8 = and:int(var_3_6E8:int, ldc:int(1252856382))
                
                if (cmple:boolean(var_5_85 = var_17_6F3:int, sub:int(var_6_8C:int, xor:int(ldc:int(-32383), ldc:int(-32384))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_6E8:int, ldc:int(1073741824)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
