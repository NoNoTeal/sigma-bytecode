public class \u516c\u3d64\u718f\ub171\u6b5f.\u52d3\u624e\u8bb0\u385b\u6198 {
    public void \u52d3\u624e\u8bb0\u385b\u6198(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, java.util.List<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52> p1) {
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
    
    public int \u7049\u7d52\u7bad\u7006\u4c2b\ua068() {
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
            return:int(getfield:int(\u52d3\u624e\u8bb0\u385b\u6198::\u67e9\u98a4\ub19c\u76bc\u8709\u965f, this:\u52d3\u624e\u8bb0\u385b\u6198))
        }
        
        goto(Label_0006)
    }
    
    public int \u5bc4\u4d85\u7bad\u92ee\ube23\u7006() {
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
            return:int(getfield:int(\u52d3\u624e\u8bb0\u385b\u6198::\u071d\u16f6\uae87\u12b2\u8413\u6198, this:\u52d3\u624e\u8bb0\u385b\u6198))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 \ub113\u12b2\u3711\uc7fe\u1187\u5f50(int p0, int p1) {
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
            return:\u8aa5\ubded\ub18d\u4f4a\u4f52(invokevirtual:\u8aa5\ubded\ub18d\u4f4a\u4f52(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, this:\u52d3\u624e\u8bb0\u385b\u6198[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], p0:int, p1:int, getstatic:\ucb79\u7ce1\ubded\u3d64\ub171(\ucb79\u7ce1\ubded\u3d64\ub171::\u3e2a\u4d85\ub6ab\uc3e3\u416d\ub8be)))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 \ub113\u12b2\u3711\uc7fe\u1187\u5f50(int p0, int p1, \u927d\u92ff\u71ae\uafe7\u6bb9.\ucb79\u7ce1\ubded\u3d64\ub171 p2, boolean p3) {
        var_7_74 : \u8aa5\ubded\ub18d\u4f4a\u4f52
        stack_165_0 : String [generated]
        expr_148 : Object[] [generated]
        stack_1CC_0 : String [generated]
        expr_195 : Object[] [generated]
        
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
        
        if (logicalnot:boolean(invokevirtual:boolean(\u52d3\u624e\u8bb0\u385b\u6198::\u3d64\ucef1\u69d9\u8d98\u3d64\u5bc4, this:\u52d3\u624e\u8bb0\u385b\u6198, p0:int, p1:int))) {
            var_7_74 = aconstnull:\u8aa5\ubded\ub18d\u4f4a\u4f52()
        }
        else {
            var_7_74 = checkcast:\u8aa5\ubded\ub18d\u4f4a\u4f52(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52.class, invokeinterface:\u8aa5\ubded\ub18d\u4f4a\u4f52(List<\u8aa5\ubded\ub18d\u4f4a\u4f52>::get, getfield:List<\u8aa5\ubded\ub18d\u4f4a\u4f52>(\u52d3\u624e\u8bb0\u385b\u6198::\u7873\u946b\u0b8e\u120d\u4492\u3bc9, this:\u52d3\u624e\u8bb0\u385b\u6198), add:int(sub:int(p0:int, getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\uc7fe\u8aa5\u69d9\u64ab\u71f1\u9af2, getfield:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u52d3\u624e\u8bb0\u385b\u6198::\ufcaf\u47c2\u5bc4\u40a9\ubcb0\u34df, this:\u52d3\u624e\u8bb0\u385b\u6198))), mul:int(sub:int(p1:int, getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u3d4b\u12b2\u98a4\u0b8e\u8cae\u183a, getfield:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u52d3\u624e\u8bb0\u385b\u6198::\ufcaf\u47c2\u5bc4\u40a9\ubcb0\u34df, this:\u52d3\u624e\u8bb0\u385b\u6198))), getfield:int(\u52d3\u624e\u8bb0\u385b\u6198::\ub6ab\u416d\u3a62\u62da\u120d\ub1b9, this:\u52d3\u624e\u8bb0\u385b\u6198)))))
            
            if (invokevirtual:boolean(\ucb79\u7ce1\ubded\u3d64\ub171::\u183a\u873d\ub7dc\u6cfe\uf94d\u5245, invokeinterface:\ucb79\u7ce1\ubded\u3d64\ub171(\u8aa5\ubded\ub18d\u4f4a\u4f52::\u8753\ud523\u6cfe\u0c95\u946b\u385b, var_7_74:\u8aa5\ubded\ub18d\u4f4a\u4f52), p2:\ucb79\u7ce1\ubded\u3d64\ub171)) {
                return:\u8aa5\ubded\ub18d\u4f4a\u4f52(var_7_74:\u8aa5\ubded\ub18d\u4f4a\u4f52)
            }
        }
        
        if (logicalnot:boolean(p3:boolean)) {
            return:\u8aa5\ubded\ub18d\u4f4a\u4f52(aconstnull:\u8aa5\ubded\ub18d\u4f4a\u4f52())
        }
        
        invokeinterface:void(Logger::error, getstatic:Logger(\u52d3\u624e\u8bb0\u385b\u6198::\u71f1\u59ec\u59ec\uae87\uc84e\u3711), loadelement:String(getstatic:String[](\u52d3\u624e\u8bb0\u385b\u6198::\u7e3f\ub7dc\u47c2\u3e75\ua61f\u5245), xor:int(ldc:int(-28638), ldc:int(-28637))), invokestatic:Integer[expected:Object](Integer::valueOf, p0:int), invokestatic:Integer[expected:Object](Integer::valueOf, p1:int))
        invokeinterface:void(Logger::error, getstatic:Logger(\u52d3\u624e\u8bb0\u385b\u6198::\u71f1\u59ec\u59ec\uae87\uc84e\u3711), loadelement:String(getstatic:String[](\u52d3\u624e\u8bb0\u385b\u6198::\u7e3f\ub7dc\u47c2\u3e75\ua61f\u5245), and:int(ldc:int(13506), ldc:int(258))), invokestatic:Integer[expected:Object](Integer::valueOf, getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\uc7fe\u8aa5\u69d9\u64ab\u71f1\u9af2, getfield:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u52d3\u624e\u8bb0\u385b\u6198::\ufcaf\u47c2\u5bc4\u40a9\ubcb0\u34df, this:\u52d3\u624e\u8bb0\u385b\u6198))), invokestatic:Integer[expected:Object](Integer::valueOf, getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u3d4b\u12b2\u98a4\u0b8e\u8cae\u183a, getfield:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u52d3\u624e\u8bb0\u385b\u6198::\ufcaf\u47c2\u5bc4\u40a9\ubcb0\u34df, this:\u52d3\u624e\u8bb0\u385b\u6198))), invokestatic:Integer[expected:Object](Integer::valueOf, getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\uc7fe\u8aa5\u69d9\u64ab\u71f1\u9af2, getfield:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u52d3\u624e\u8bb0\u385b\u6198::\u67d0\uc238\u7d52\uc4d2\u6ec6\ub7dc, this:\u52d3\u624e\u8bb0\u385b\u6198))), invokestatic:Integer[expected:Object](Integer::valueOf, getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u3d4b\u12b2\u98a4\u0b8e\u8cae\u183a, getfield:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u52d3\u624e\u8bb0\u385b\u6198::\u67d0\uc238\u7d52\uc4d2\u6ec6\ub7dc, this:\u52d3\u624e\u8bb0\u385b\u6198))))
        
        if (cmpeq:boolean(var_7_74:\u8aa5\ubded\ub18d\u4f4a\u4f52, aconstnull:\u8aa5\ubded\ub18d\u4f4a\u4f52())) {
            stack_165_0 = loadelement:String(getstatic:String[](\u52d3\u624e\u8bb0\u385b\u6198::\u7e3f\ub7dc\u47c2\u3e75\ua61f\u5245), xor:int(ldc:int(28677), ldc:int(28673)))
            expr_148 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(21514), ldc:int(10434)))
            storeelement:Object(expr_148:Object[], and:int(ldc:int(611), ldc:int(-612)), invokestatic:Integer[expected:Object](Integer::valueOf, p0:int))
            storeelement:Object(expr_148:Object[], xor:int(ldc:int(160), ldc:int(161)), invokestatic:Integer[expected:Object](Integer::valueOf, p1:int))
            athrow(checkcast:RuntimeException(java.lang.RuntimeException.class, invokestatic:RuntimeException(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u8640\u36d3\ua3b4\u4ab3\uc238\u839e, initobject:RuntimeException(RuntimeException::<init>, invokestatic:String(String::format, stack_165_0:String, expr_148:Object[])))))
        }
        
        stack_1CC_0 = loadelement:String(getstatic:String[](\u52d3\u624e\u8bb0\u385b\u6198::\u7e3f\ub7dc\u47c2\u3e75\ua61f\u5245), and:int(ldc:int(1411), ldc:int(16411)))
        expr_195 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(8198), ldc:int(733)))
        storeelement:Object(expr_195:Object[], and:int(ldc:int(9605), ldc:int(-9606)), p2:\ucb79\u7ce1\ubded\u3d64\ub171[expected:Object])
        storeelement:Object(expr_195:Object[], and:int(ldc:int(20481), ldc:int(1805)), invokeinterface:\ucb79\u7ce1\ubded\u3d64\ub171[expected:Object](\u8aa5\ubded\ub18d\u4f4a\u4f52::\u8753\ud523\u6cfe\u0c95\u946b\u385b, var_7_74:\u8aa5\ubded\ub18d\u4f4a\u4f52))
        storeelement:Object(expr_195:Object[], xor:int(ldc:int(1537), ldc:int(1539)), invokestatic:Integer[expected:Object](Integer::valueOf, p0:int))
        storeelement:Object(expr_195:Object[], and:int(ldc:int(275), ldc:int(26723)), invokestatic:Integer[expected:Object](Integer::valueOf, p1:int))
        athrow(checkcast:RuntimeException(java.lang.RuntimeException.class, invokestatic:RuntimeException(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u8640\u36d3\ua3b4\u4ab3\uc238\u839e, initobject:RuntimeException(RuntimeException::<init>, invokestatic:String(String::format, stack_1CC_0:String, expr_195:Object[])))))
    }
    
    public boolean \u3d64\ucef1\u69d9\u8d98\u3d64\u5bc4(int p0, int p1) {
        var_3_61 : int
        stack_C4_0 : int [generated]
        
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
            var_3_61 = and:int(ldc:int(-1888573671), ldc:int(-1880346657))
            
            if (cmpge:boolean(p0:int, getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\uc7fe\u8aa5\u69d9\u64ab\u71f1\u9af2, getfield:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u52d3\u624e\u8bb0\u385b\u6198::\ufcaf\u47c2\u5bc4\u40a9\ubcb0\u34df, this:\u52d3\u624e\u8bb0\u385b\u6198)))) {
                if (cmple:boolean(p0:int, getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\uc7fe\u8aa5\u69d9\u64ab\u71f1\u9af2, getfield:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u52d3\u624e\u8bb0\u385b\u6198::\u67d0\uc238\u7d52\uc4d2\u6ec6\ub7dc, this:\u52d3\u624e\u8bb0\u385b\u6198)))) {
                    if (cmpge:boolean(p1:int, getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u3d4b\u12b2\u98a4\u0b8e\u8cae\u183a, getfield:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u52d3\u624e\u8bb0\u385b\u6198::\ufcaf\u47c2\u5bc4\u40a9\ubcb0\u34df, this:\u52d3\u624e\u8bb0\u385b\u6198)))) {
                        if (cmple:boolean(p1:int, getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u3d4b\u12b2\u98a4\u0b8e\u8cae\u183a, getfield:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u52d3\u624e\u8bb0\u385b\u6198::\u67d0\uc238\u7d52\uc4d2\u6ec6\ub7dc, this:\u52d3\u624e\u8bb0\u385b\u6198)))) {
                            stack_C4_0 = xor:int[expected:boolean](ldc:int(10243), ldc:int(10242))
                            return:boolean(stack_C4_0:boolean)
                        }
                    }
                }
            }
            
            var_3_61 = and:int(var_3_61:int, ldc:int(-302237801))
            stack_C4_0 = and:int[expected:boolean](ldc:int(-22686), ldc:int(18573))
            return:boolean(stack_C4_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d \uc238\uc31c\ua61f\u92ee\u51b2\u527a(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u718f\u6435\uc31c\u4ab3\u98a4::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, invokevirtual:\u8aa5\ubded\ub18d\u4f4a\u4f52[expected:\u718f\u6435\uc31c\u4ab3\u98a4](\u52d3\u624e\u8bb0\u385b\u6198::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, this:\u52d3\u624e\u8bb0\u385b\u6198, shr:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), and:int(ldc:int(1622), ldc:int(2052))), shr:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), and:int(ldc:int(2948), ldc:int(1094)))), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u7043\u88c5\u5db4\uf94d.\uf995\u8709\ua61f\ub32d\ubff1\u99f7 \u9033\u3711\u494c\u88c5\u69d9\u97b7(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            return:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(invokeinterface:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\u718f\u6435\uc31c\u4ab3\u98a4::\u9033\u3711\u494c\u88c5\u69d9\u97b7, invokevirtual:\u8aa5\ubded\ub18d\u4f4a\u4f52[expected:\u718f\u6435\uc31c\u4ab3\u98a4](\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, this:\u52d3\u624e\u8bb0\u385b\u6198[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d \uf94d\ubefe\u8350\u416d\u3a62\u4e72(double p0, double p1, double p2, double p3, java.util.function.Predicate<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f> p4) {
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
            return:\ua3b4\u8aa5\ub113\ubf56\u873d(aconstnull:\ua3b4\u8aa5\ub113\ubf56\u873d())
        }
        
        goto(Label_0006)
    }
    
    public int \u8308\ufcaf\u392e\u5db4\u5d20\ud51e() {
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
            return:int(and:int(ldc:int(-726), ldc:int(725)))
        }
        
        goto(Label_0006)
    }
    
    public \u3d64\u7af6\uae87\uc238\u7d52.\u8c8a\u51b2\u516c\ub70c\u624e \uc238\u8350\u120d\uc7fe\u965f\u8c8a() {
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
            return:\u8c8a\u51b2\u516c\ub70c\u624e(getfield:\u8c8a\u51b2\u516c\ub70c\u624e(\u52d3\u624e\u8bb0\u385b\u6198::\u9937\uc29a\u9a18\u61a4\u2dcc\u6435, this:\u52d3\u624e\u8bb0\u385b\u6198))
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \uc29a\u6435\ub1b9\ub18d\u0800\u873d(int p0, int p1, int p2) {
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
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\ube23\uc238\u5140\u4cd9\u8aa5::\uc29a\u6435\ub1b9\ub18d\u0800\u873d, getfield:\ube23\uc238\u5140\u4cd9\u8aa5(\u52d3\u624e\u8bb0\u385b\u6198::\u1187\u9255\ud12e\u6b5f\u4c04\u6198, this:\u52d3\u624e\u8bb0\u385b\u6198), p0:int, p1:int, p2:int))
        }
        
        goto(Label_0006)
    }
    
    public float \u72f1\u8d90\ud36e\uc9f6\ubff1\ubff1(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p0, boolean p1) {
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
            return:float(ldc:float(1.0f))
        }
        
        goto(Label_0006)
    }
    
    public \u56bd\u8413\u647c\u5bc4\ud158.\ube23\u51b2\u92ee\u6435\u8308\u1833 \u8c8a\ua6bd\u61a4\u72f1\ub32d\u64f2() {
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
            return:\ube23\u51b2\u92ee\u6435\u8308\u1833(invokevirtual:\ube23\u51b2\u92ee\u6435\u8308\u1833(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8c8a\ua6bd\u61a4\u72f1\ub32d\u64f2, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u52d3\u624e\u8bb0\u385b\u6198::\u1187\u9255\ud12e\u6b5f\u4c04\u6198, this:\u52d3\u624e\u8bb0\u385b\u6198)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u0b8e\ub70c\ud12e\u965f\uf94d\u8cae(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, boolean p1, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p2, int p3) {
        var_5_63 : int
        var_7_6A : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        stack_E2_0 : \ub83f\uc9f6\u47c2\u67d0\u7ce1 [generated]
        
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
        var_5_63 = and:int(ldc:int(-795925551), ldc:int(1556458443))
        var_7_6A = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u52d3\u624e\u8bb0\u385b\u6198::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, this:\u52d3\u624e\u8bb0\u385b\u6198, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
        
        if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u3504\u99f7\ud523\ud171\u9937\u873d, var_7_6A:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]))) {
            loop {
                if (cmpne:boolean(and:int(var_5_63:int, ldc:int(64)), ldc:int(0))) {
                    var_5_63 = and:int(var_5_63:int, ldc:int(2046145251))
                    
                    if (p1:boolean) {
                        if (logicalnot:boolean(invokevirtual:boolean(\u071d\u69d9\u69d9\u8cae\ub8be\u600f::\ubff1\ub1b9\uc229\uc7fe\u983f\u3711, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, var_7_6A:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])))) {
                            var_5_63 = and:int(var_5_63:int, ldc:int(-662231091))
                            stack_E2_0 = aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1()
                        }
                        else {
                            stack_E2_0 = invokevirtual:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\u52d3\u624e\u8bb0\u385b\u6198::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, this:\u52d3\u624e\u8bb0\u385b\u6198, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                        }
                        
                        invokestatic:void(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u5245\uc910\u5f50\u1833\u6b0d\ube23, var_7_6A:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u52d3\u624e\u8bb0\u385b\u6198::\u1187\u9255\ud12e\u6b5f\u4c04\u6198, this:\u52d3\u624e\u8bb0\u385b\u6198), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, stack_E2_0:\ub83f\uc9f6\u47c2\u67d0\u7ce1, p2:\u7d52\u718f\u3776\u6fb0\ub83f, getstatic:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u9033\uff55\u52d3\u8709\uae87\uc4d2))
                    }
                }
                
                if (cmpne:boolean(and:int(var_5_63:int, ldc:int(268435456)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:boolean(invokevirtual:boolean(\u52d3\u624e\u8bb0\u385b\u6198::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, this:\u52d3\u624e\u8bb0\u385b\u6198, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u8d98\u392e\u7006\ud171\u7bad\ua6bd)), xor:int(ldc:int(1728), ldc:int(1731)), p3:int))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-25547), ldc:int(842)))
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1 \uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_2_61 : int
        var_4_67 : \u8aa5\ubded\ub18d\u4f4a\u4f52
        var_5_71 : \ub83f\uc9f6\u47c2\u67d0\u7ce1
        var_2_7D : int
        var_6_86 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_7_90 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_8_13C : \ub1b9\u8cae\u7d52\u759a\u3e2a\u527a
        var_5_12E : \ub83f\uc9f6\u47c2\u67d0\u7ce1
        
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
        var_2_61 = and:int(ldc:int(-1054603811), ldc:int(-537103038))
        var_4_67 = invokevirtual:\u8aa5\ubded\ub18d\u4f4a\u4f52(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, this:\u52d3\u624e\u8bb0\u385b\u6198[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
        var_5_71 = invokeinterface:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\u718f\u6435\uc31c\u4ab3\u98a4::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, var_4_67:\u8aa5\ubded\ub18d\u4f4a\u4f52[expected:\u718f\u6435\uc31c\u4ab3\u98a4], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
        
        if (cmpne:boolean(var_5_71:\ub83f\uc9f6\u47c2\u67d0\u7ce1, aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1())) {
            return:\ub83f\uc9f6\u47c2\u67d0\u7ce1(var_5_71:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
        }
        
        var_2_7D = and:int(var_2_61:int, ldc:int(-276999205))
        var_6_86 = invokeinterface:\uc31c\uc87f\uc246\u3776\ub7dc(\u8aa5\ubded\ub18d\u4f4a\u4f52::\ua6bd\u6ec6\ub1b9\u7873\u7873\ub83f, var_4_67:\u8aa5\ubded\ub18d\u4f4a\u4f52, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
        var_7_90 = invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u718f\u6435\uc31c\u4ab3\u98a4::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, var_4_67:\u8aa5\ubded\ub18d\u4f4a\u4f52[expected:\u718f\u6435\uc31c\u4ab3\u98a4], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
        
        if (cmpne:boolean(var_6_86:\uc31c\uc87f\uc246\u3776\ub7dc, aconstnull:\uc31c\uc87f\uc246\u3776\ub7dc())) {
            if (logicalnot:boolean(invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\u52d3\u624e\u8bb0\u385b\u6198::\u7e3f\ub7dc\u47c2\u3e75\ua61f\u5245), and:int(ldc:int(21), ldc:int(25381))), invokevirtual:String(\uc31c\uc87f\uc246\u3776\ub7dc::\ud36e\u51fa\ua562\ubf56\u51fa\u1187, var_6_86:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u52d3\u624e\u8bb0\u385b\u6198::\u7e3f\ub7dc\u47c2\u3e75\ua61f\u5245), xor:int(ldc:int(1349), ldc:int(1347))))))) {
                goto(Label_0273)
            }
            
            var_8_13C = invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, var_7_90:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])
            
            if (instanceof:boolean(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u2dcc\ub32d\uc2bd\u8aa5\ub171\ucb79.class, var_8_13C:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a)) {
                var_2_7D = and:int(var_2_7D:int, ldc:int(-2013360437))
                var_5_12E = invokeinterface:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\u2dcc\ub32d\uc2bd\u8aa5\ub171\ucb79::\ufe34\u0c95\u67d0\uc31c\u6bb9\u3d64, checkcast:\u2dcc\ub32d\uc2bd\u8aa5\ub171\ucb79(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u2dcc\ub32d\uc2bd\u8aa5\ub171\ucb79.class, var_8_13C:\u2dcc\ub32d\uc2bd\u8aa5\ub171\ucb79), getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u718f\u6435\uc31c\u4ab3\u98a4](\u52d3\u624e\u8bb0\u385b\u6198::\u1187\u9255\ud12e\u6b5f\u4c04\u6198, this:\u52d3\u624e\u8bb0\u385b\u6198))
                goto(Label_0364)
            }
            
            return:\ub83f\uc9f6\u47c2\u67d0\u7ce1(aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1())
        }
        
        Label_0151:
        
        if (cmpne:boolean(and:int(var_2_7D:int, ldc:int(268435456)), ldc:int(0))) {
            var_2_7D = and:int(var_2_7D:int, ldc:int(-2138357786))
            goto(Label_0273)
        }
        
        if (cmpeq:boolean(and:int(var_2_7D:int, ldc:int(262144)), ldc:int(0))) {
            var_2_7D = and:int(var_2_7D:int, ldc:int(1498711905))
        }
        else {
            var_2_7D = and:int(var_2_7D:int, ldc:int(-243927992))
            
            if (instanceof:boolean(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u2dcc\ub32d\uc2bd\u8aa5\ub171\ucb79.class, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, var_7_90:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]))) {
                invokeinterface:void(Logger::warn, getstatic:Logger(\u52d3\u624e\u8bb0\u385b\u6198::\u71f1\u59ec\u59ec\uae87\uc84e\u3711), loadelement:String(getstatic:String[](\u52d3\u624e\u8bb0\u385b\u6198::\u7e3f\ub7dc\u47c2\u3e75\ua61f\u5245), xor:int(ldc:int(24578), ldc:int(24581))), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object])
            }
        }
        
        Label_0202:
        
        if (cmpeq:boolean(and:int(var_2_7D:int, ldc:int(2048)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_2_7D:int, ldc:int(2)), ldc:int(0))) {
                return:\ub83f\uc9f6\u47c2\u67d0\u7ce1(aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1())
            }
            
            goto(Label_0151)
        }
        
        Label_0273:
        
        if (cmpeq:boolean(and:int(var_2_7D:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0202)
        }
        
        if (cmpeq:boolean(and:int(var_2_7D:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_0151)
        }
        
        var_2_7D = and:int(var_2_7D:int, ldc:int(-1812052131))
        var_5_12E = invokestatic:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\u3504\u64f2\ub171\u873d\u76bc\ufcaf, var_7_90:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, var_6_86:\uc31c\uc87f\uc246\u3776\ub7dc)
        Label_0364:
        
        if (cmpeq:boolean(var_5_12E:\ub83f\uc9f6\u47c2\u67d0\u7ce1, aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1())) {
            goto(Label_0151)
        }
        
        invokeinterface:void(\u8aa5\ubded\ub18d\u4f4a\u4f52::\u8753\u647c\u6bb9\u7873\u759a\u69d9, var_4_67:\u8aa5\ubded\ub18d\u4f4a\u4f52, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_5_12E:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
        return:\ub83f\uc9f6\u47c2\u67d0\u7ce1(var_5_12E:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
    }
    
    public boolean \uc31c\u8709\u5db4\u97b7\u5d20\u9af2(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1, int p2, int p3) {
        var_5_63 : int
        var_7_6A : \u8aa5\ubded\ub18d\u4f4a\u4f52
        var_8_7C : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_5_89 : int
        var_9_8F : \ub1b9\u8cae\u7d52\u759a\u3e2a\u527a
        var_10_148 : \uc31c\uc87f\uc246\u3776\ub7dc
        
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
        var_5_63 = and:int(ldc:int(1964953239), ldc:int(1899851091))
        var_7_6A = invokevirtual:\u8aa5\ubded\ub18d\u4f4a\u4f52(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, this:\u52d3\u624e\u8bb0\u385b\u6198[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
        var_8_7C = invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u8aa5\ubded\ub18d\u4f4a\u4f52::\uc7fe\u4975\u3bd6\u5bc4\u8cae\u839e, var_7_6A:\u8aa5\ubded\ub18d\u4f4a\u4f52, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, and:int[expected:boolean](ldc:int(-1971), ldc:int(1970)))
        
        if (cmpne:boolean(var_8_7C:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, aconstnull:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d())) {
            invokevirtual:void(\ube23\uc238\u5140\u4cd9\u8aa5::\u8308\u69d9\uc2e8\ub32d\ud51e\u6ec6, getfield:\ube23\uc238\u5140\u4cd9\u8aa5(\u52d3\u624e\u8bb0\u385b\u6198::\u1187\u9255\ud12e\u6b5f\u4c04\u6198, this:\u52d3\u624e\u8bb0\u385b\u6198), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_8_7C:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
        }
        
        var_5_89 = and:int(var_5_63:int, ldc:int(2022502355))
        var_9_8F = invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])
        
        if (invokevirtual:boolean(\u071d\u69d9\u69d9\u8cae\ub8be\u600f::\ubff1\ub1b9\uc229\uc7fe\u983f\u3711, var_9_8F:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[expected:\u071d\u69d9\u69d9\u8cae\ub8be\u600f])) {
            if (cmpne:boolean(invokevirtual:\u983f\u7e3f\u4e72\u6cfe\u6435(\ucb79\u7ce1\ubded\u3d64\ub171::\u839e\u927d\uc229\u34df\u93a2\u6c56, invokeinterface:\ucb79\u7ce1\ubded\u3d64\ub171(\u8aa5\ubded\ub18d\u4f4a\u4f52::\u8753\ud523\u6cfe\u0c95\u946b\u385b, var_7_6A:\u8aa5\ubded\ub18d\u4f4a\u4f52)), getstatic:\u983f\u7e3f\u4e72\u6cfe\u6435(\u983f\u7e3f\u4e72\u6cfe\u6435::\uc229\ubefe\u392e\ube23\u12cb\u071d))) {
                var_5_89 = and:int(var_5_89:int, ldc:int(1894521307))
                var_10_148 = initobject:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::<init>)
                invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, var_10_148:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u52d3\u624e\u8bb0\u385b\u6198::\u7e3f\ub7dc\u47c2\u3e75\ua61f\u5245), xor:int(ldc:int(-12286), ldc:int(-12278))), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))
                invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, var_10_148:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u52d3\u624e\u8bb0\u385b\u6198::\u7e3f\ub7dc\u47c2\u3e75\ua61f\u5245), and:int(ldc:int(6169), ldc:int(24651))), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))
                invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, var_10_148:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u52d3\u624e\u8bb0\u385b\u6198::\u7e3f\ub7dc\u47c2\u3e75\ua61f\u5245), xor:int(ldc:int(2306), ldc:int(2312))), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))
                invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u385b\uafe7\u8d90\u8308\u12cb\u7049, var_10_148:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u52d3\u624e\u8bb0\u385b\u6198::\u7e3f\ub7dc\u47c2\u3e75\ua61f\u5245), xor:int(ldc:int(19585), ldc:int(19591))), loadelement:String(getstatic:String[](\u52d3\u624e\u8bb0\u385b\u6198::\u7e3f\ub7dc\u47c2\u3e75\ua61f\u5245), xor:int(ldc:int(7175), ldc:int(7170))))
                invokeinterface:void(\u8aa5\ubded\ub18d\u4f4a\u4f52::\u8753\u647c\u6bb9\u7873\u759a\u69d9, var_7_6A:\u8aa5\ubded\ub18d\u4f4a\u4f52, var_10_148:\uc31c\uc87f\uc246\u3776\ub7dc)
                goto(Label_0184)
            }
            
            invokeinterface:void(\u8aa5\ubded\ub18d\u4f4a\u4f52::\u8753\u647c\u6bb9\u7873\u759a\u69d9, var_7_6A:\u8aa5\ubded\ub18d\u4f4a\u4f52, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokeinterface:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\u2dcc\ub32d\uc2bd\u8aa5\ub171\ucb79::\ufe34\u0c95\u67d0\uc31c\u6bb9\u3d64, checkcast:\u2dcc\ub32d\uc2bd\u8aa5\ub171\ucb79(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u2dcc\ub32d\uc2bd\u8aa5\ub171\ucb79.class, var_9_8F:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[expected:\u2dcc\ub32d\uc2bd\u8aa5\ub171\ucb79]), this:\u52d3\u624e\u8bb0\u385b\u6198[expected:\u718f\u6435\uc31c\u4ab3\u98a4]))
            goto(Label_0184)
        }
        
        Label_0153:
        
        if (cmpeq:boolean(and:int(var_5_89:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0230)
        }
        
        if (cmpeq:boolean(and:int(var_5_89:int, ldc:int(65536)), ldc:int(0))) {
            var_5_89 = and:int(var_5_89:int, ldc:int(-105923845))
            
            if (cmpne:boolean(var_8_7C:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, aconstnull:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d())) {
                if (invokevirtual:boolean(\u071d\u69d9\u69d9\u8cae\ub8be\u600f::\ubff1\ub1b9\uc229\uc7fe\u983f\u3711, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, var_8_7C:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]))) {
                    invokeinterface:void(\u8aa5\ubded\ub18d\u4f4a\u4f52::\ud4fe\u6c56\ud217\uc4d2\u6b0d\u3776, var_7_6A:\u8aa5\ubded\ub18d\u4f4a\u4f52, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                }
            }
        }
        
        Label_0184:
        
        if (cmpeq:boolean(and:int(var_5_89:int, ldc:int(1073741824)), ldc:int(0))) {
            var_5_89 = and:int(var_5_89:int, ldc:int(-1823174866))
        }
        else {
            if (cmpeq:boolean(and:int(var_5_89:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0153)
            }
            
            var_5_89 = and:int(var_5_89:int, ldc:int(1912472607))
            
            if (invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u5654\ud12e\u8c8a\u5bc4\u120d\u6bb9, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], this:\u52d3\u624e\u8bb0\u385b\u6198[expected:\u718f\u6435\uc31c\u4ab3\u98a4], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)) {
                invokespecial:void(\u52d3\u624e\u8bb0\u385b\u6198::\u4cd9\u6d69\u647c\u1187\ud523\uf995, this:\u52d3\u624e\u8bb0\u385b\u6198, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            }
        }
        
        Label_0230:
        
        if (cmpeq:boolean(and:int(var_5_89:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0184)
        }
        
        if (cmpeq:boolean(and:int(var_5_89:int, ldc:int(524288)), ldc:int(0))) {
            var_5_89 = and:int(var_5_89:int, ldc:int(-1498409166))
            goto(Label_0153)
        }
        
        return:boolean(xor:int[expected:boolean](ldc:int(8710), ldc:int(8711)))
    }
    
    private void \u4cd9\u6d69\u647c\u1187\ud523\uf995(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            invokeinterface:void(\u8aa5\ubded\ub18d\u4f4a\u4f52::\u8350\u071d\ua61f\u5140\u2dcc\u3e2a, invokevirtual:\u8aa5\ubded\ub18d\u4f4a\u4f52(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, this:\u52d3\u624e\u8bb0\u385b\u6198[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \ua6bd\ubefe\u5f50\u12cb\uceb8\u718f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
            invokeinterface:void(\u8aa5\ubded\ub18d\u4f4a\u4f52::\u56bd\ub7dc\u5bc4\u67d0\ud523\u5d20, invokevirtual:\u8aa5\ubded\ub18d\u4f4a\u4f52(\u52d3\u624e\u8bb0\u385b\u6198::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, this:\u52d3\u624e\u8bb0\u385b\u6198, invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, p0:\u7d52\u718f\u3776\u6fb0\ub83f), ldc:double(16.0))), invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, p0:\u7d52\u718f\u3776\u6fb0\ub83f), ldc:double(16.0)))), p0:\u7d52\u718f\u3776\u6fb0\ub83f)
            return:boolean(and:int[expected:boolean](ldc:int(8193), ldc:int(113)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u0b8e\u983f\uc238\ub6ab\u7049\ud4fe(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, boolean p1) {
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
            return:boolean(invokevirtual:boolean(\u72f1\u7ce1\ucef1\ub83f\u516c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, this:\u52d3\u624e\u8bb0\u385b\u6198[expected:\u72f1\u7ce1\ucef1\ub83f\u516c], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u8d98\u392e\u7006\ud171\u7bad\ua6bd)), xor:int(ldc:int(2148), ldc:int(2151))))
        }
        
        goto(Label_0006)
    }
    
    public \ub113\ufcaf\u3c25\u071d\u97b7.\u34df\u4492\u71ae\uc238\u7873\uafe7 \u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330() {
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
            return:\u34df\u4492\u71ae\uc238\u7873\uafe7(invokevirtual:\u34df\u4492\u71ae\uc238\u7873\uafe7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u52d3\u624e\u8bb0\u385b\u6198::\u1187\u9255\ud12e\u6b5f\u4c04\u6198, this:\u52d3\u624e\u8bb0\u385b\u6198)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ube23\u3d4b\u98a4\ud158\u97b7\u718f() {
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
            return:boolean(and:int[expected:boolean](ldc:int(11688), ldc:int(-15785)))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 \u3711\u4492\ub8be\u7330\uc9f6\u8640() {
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
            return:\ube23\uc238\u5140\u4cd9\u8aa5(getfield:\ube23\uc238\u5140\u4cd9\u8aa5(\u52d3\u624e\u8bb0\u385b\u6198::\u1187\u9255\ud12e\u6b5f\u4c04\u6198, this:\u52d3\u624e\u8bb0\u385b\u6198))
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f \u4bc8\ubff1\u76bc\u718f\uc238\u6d69() {
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
            return:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f(invokevirtual:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f(\ube23\uc238\u5140\u4cd9\u8aa5::\u4bc8\ubff1\u76bc\u718f\uc238\u6d69, getfield:\ube23\uc238\u5140\u4cd9\u8aa5(\u52d3\u624e\u8bb0\u385b\u6198::\u1187\u9255\ud12e\u6b5f\u4c04\u6198, this:\u52d3\u624e\u8bb0\u385b\u6198)))
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u4492\u92ee\u9255\uc29a\u3e75\u7043 \u3d4b\ud523\uff55\u647c\u4ab3\u7af6() {
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
            return:\u4492\u92ee\u9255\uc29a\u3e75\u7043(getfield:\u4492\u92ee\u9255\uc29a\u3e75\u7043(\u52d3\u624e\u8bb0\u385b\u6198::\ub18d\u71ae\uf995\u4daf\u516c\ub19c, this:\u52d3\u624e\u8bb0\u385b\u6198))
        }
        
        goto(Label_0006)
    }
    
    public \u516c\u3d64\u718f\ub171\u6b5f.\u6d99\u6b0d\ubff1\uc246\u946b \u7af6\u8350\u4179\ufe34\ub18d\ucfaf(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
        
        if (invokevirtual:boolean(\u52d3\u624e\u8bb0\u385b\u6198::\u3d64\ucef1\u69d9\u8d98\u3d64\u5bc4, this:\u52d3\u624e\u8bb0\u385b\u6198, shr:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), and:int(ldc:int(6502), ldc:int(8732))), shr:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), and:int(ldc:int(16748), ldc:int(21))))) {
            return:\u6d99\u6b0d\ubff1\uc246\u946b(initobject:\u6d99\u6b0d\ubff1\uc246\u946b(\u6d99\u6b0d\ubff1\uc246\u946b::<init>, invokevirtual:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u3dd3\u4daf\ub32d\ubcb0\u7d52\u718f, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd](\u52d3\u624e\u8bb0\u385b\u6198::\u1187\u9255\ud12e\u6b5f\u4c04\u6198, this:\u52d3\u624e\u8bb0\u385b\u6198)), invokevirtual:long(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u960f\u6d99\ub70c\u8753\u4ab3\u6c56, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u52d3\u624e\u8bb0\u385b\u6198::\u1187\u9255\ud12e\u6b5f\u4c04\u6198, this:\u52d3\u624e\u8bb0\u385b\u6198)), ldc:long(0L), invokevirtual:float(\u8753\u8709\ubff1\ub32d\u4d85::\uc3e3\ubded\u5d20\u8d98\u64ab\u3d4b, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u8753\u8709\ubff1\ub32d\u4d85](\u52d3\u624e\u8bb0\u385b\u6198::\u1187\u9255\ud12e\u6b5f\u4c04\u6198, this:\u52d3\u624e\u8bb0\u385b\u6198))))
        }
        
        athrow(initobject:RuntimeException(RuntimeException::<init>, loadelement:String(getstatic:String[](\u52d3\u624e\u8bb0\u385b\u6198::\u7e3f\ub7dc\u47c2\u3e75\ua61f\u5245), xor:int(ldc:int(2178), ldc:int(2185)))))
    }
    
    public \u4f52\u6cfe\u9a18\uc29a\u3bd6.\u34df\ua068\u72f1\u527a\u0b8e \u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1() {
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
            return:\u34df\ua068\u72f1\u527a\u0b8e(invokevirtual:\u69d9\u759a\u64ab\ua3b4\u6b0d[expected:\u34df\ua068\u72f1\u527a\u0b8e](\ube23\uc238\u5140\u4cd9\u8aa5::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, getfield:\ube23\uc238\u5140\u4cd9\u8aa5(\u52d3\u624e\u8bb0\u385b\u6198::\u1187\u9255\ud12e\u6b5f\u4c04\u6198, this:\u52d3\u624e\u8bb0\u385b\u6198)))
        }
        
        goto(Label_0006)
    }
    
    public long \ud12e\ubded\u6b5f\u4cd9\u64ab\ud36e() {
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
            return:long(getfield:long(\u52d3\u624e\u8bb0\u385b\u6198::\u72f1\u93a2\u7043\uc238\u56bd\u6bb9, this:\u52d3\u624e\u8bb0\u385b\u6198))
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u8258\uc238\u7e3f\u36d3\uc238<\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a> \u8413\uff55\ub8be\u385b\u92ee\u7330() {
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
            return:\u8258\uc238\u7e3f\u36d3\uc238<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(getfield:\u8258\uc238\u7e3f\u36d3\uc238<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\u52d3\u624e\u8bb0\u385b\u6198::\u927d\u7330\u8cae\u0800\ud12e\u3dd3, this:\u52d3\u624e\u8bb0\u385b\u6198))
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u8258\uc238\u7e3f\u36d3\uc238<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8cae\ucb79\ud7e8\ub8be\u156b\u960f> \u8cae\u4f4a\ud217\u8709\u4cd9\ud51e() {
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
            return:\u8258\uc238\u7e3f\u36d3\uc238<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>(getfield:\u8258\uc238\u7e3f\u36d3\uc238<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>(\u52d3\u624e\u8bb0\u385b\u6198::\u7e3f\uae5d\u71f1\u5db4\u4f4a\u8df4, this:\u52d3\u624e\u8bb0\u385b\u6198))
        }
        
        goto(Label_0006)
    }
    
    public int \u97e6\uc246\uafe7\ubf56\u3bd6\u6ec6() {
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
            return:int(invokevirtual:int(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u97e6\uc246\uafe7\ubf56\u3bd6\u6ec6, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u52d3\u624e\u8bb0\u385b\u6198::\u1187\u9255\ud12e\u6b5f\u4c04\u6198, this:\u52d3\u624e\u8bb0\u385b\u6198)))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Random \u76bc\u6c52\u9a18\u4179\u97b7\uafe7() {
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
            return:Random(getfield:Random(\u52d3\u624e\u8bb0\u385b\u6198::\uc3e3\u0a06\u9937\u7bad\u5245\u6cfe, this:\u52d3\u624e\u8bb0\u385b\u6198))
        }
        
        goto(Label_0006)
    }
    
    public int \uf995\uc7fe\u4daf\u71f1\u62da\ub102(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9 p0, int p1, int p2) {
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
            return:int(add:int(invokeinterface:int(\u8aa5\ubded\ub18d\u4f4a\u4f52::\u8258\u7af6\ubb2b\u6198\u6fb0\u9a18, invokevirtual:\u8aa5\ubded\ub18d\u4f4a\u4f52(\u52d3\u624e\u8bb0\u385b\u6198::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, this:\u52d3\u624e\u8bb0\u385b\u6198, shr:int(p1:int, and:int(ldc:int(8454), ldc:int(7412))), shr:int(p2:int, and:int(ldc:int(24908), ldc:int(5157)))), p0:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9, and:int(p1:int, ldc:int(15)), and:int(p2:int, ldc:int(15))), xor:int(ldc:int(5144), ldc:int(5145))))
        }
        
        goto(Label_0006)
    }
    
    public void \u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u927d\u92ff\u71ae\uafe7\u6bb9.\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937 p2, \u36d3\u9033\u6b0d\u983f\u8d90.\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8 p3, float p4, float p5) {
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
    
    public void \u385b\u8c8a\uf9c5\u6ec6\ufcaf\u5fe1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a p0, double p1, double p2, double p3, double p4, double p5, double p6) {
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
    
    public void \u4f4a\u76bc\ub6ab\u5654\uc4d2\ub7dc(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0, int p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, int p3) {
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
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u3d4b\u9937\u7af6\u7af6\u6198\uae87 \uc910\u74b1\u4cd9\u3711\uc29a\u071d() {
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
            return:\u3d4b\u9937\u7af6\u7af6\u6198\uae87(getfield:\u3d4b\u9937\u7af6\u7af6\u6198\uae87(\u52d3\u624e\u8bb0\u385b\u6198::\u3d64\uc87f\u6ec6\ua3b4\u6cfe\u8709, this:\u52d3\u624e\u8bb0\u385b\u6198))
        }
        
        goto(Label_0006)
    }
    
    public boolean \uf94d\uc3e3\ubb2b\u6435\u4f4a\u7043(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, java.util.function.Predicate<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d> p1) {
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
            return:boolean(invokeinterface:boolean(Predicate<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::test, p1:Predicate<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u52d3\u624e\u8bb0\u385b\u6198::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, this:\u52d3\u624e\u8bb0\u385b\u6198, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)))
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<T> \u965f\ucef1\u34df\u4daf\u760c\u6d99(java.lang.Class<? extends T> p0, \u3504\ufe34\u600f\u6b0d\u69d9.\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7 p1, java.util.function.Predicate<? super T> p2) {
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
            return:List<T>(invokestatic:List<T>(Collections::emptyList))
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f> \u12cb\u873d\u6d99\u3e2a\uf995\u8389(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0, \u3504\ufe34\u600f\u6b0d\u69d9.\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7 p1, java.util.function.Predicate<? super \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f> p2) {
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
            return:List<\u7d52\u718f\u3776\u6fb0\ub83f>(invokestatic:List<\u7d52\u718f\u3776\u6fb0\ub83f>(Collections::emptyList))
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d> \uc3e3\u7043\u12b2\u56bd\uf94d\u3e2a() {
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
            return:List<\ua3b4\u8aa5\ub113\ubf56\u873d>(invokestatic:List<\ua3b4\u8aa5\ub113\ubf56\u873d>(Collections::emptyList))
        }
        
        goto(Label_0006)
    }
    
    public java.util.stream.Stream<? extends \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\uceb8\u34df\u8640\u1187<?>> \u12b2\u7d52\u3dd3\u4cd9\u5bc4\u516c(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u5d20\ubefe\u8640\u183a\u6ec6\u93a2 p0, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?> p1) {
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
            return:Stream<? extends \u34df\uceb8\u34df\u8640\u1187<?>>(invokevirtual:Stream<? extends \u34df\uceb8\u34df\u8640\u1187<?>>(\u8753\u4975\ubf56\u6b0d\u7e3f::\u6bb9\u4daf\u88c5\ub1b9\u92ff\u6bb9, getfield:\u8753\u4975\ubf56\u6b0d\u7e3f(\u52d3\u624e\u8bb0\u385b\u6198::\uc84e\u839e\u71f1\u5d20\uc87f\u5245, this:\u52d3\u624e\u8bb0\u385b\u6198), p0:\u5d20\ubefe\u8640\u183a\u6ec6\u93a2, p1:\u5654\u9937\u72f1\ud4fe\u0c95<?>))
        }
        
        goto(Label_0006)
    }
    
    private \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u8258\uc238\u7e3f\u36d3\uc238 lambda$\uc87f\u0800\u4daf\u6fb0\u8389\uafe7$1(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            return:\u8258\uc238\u7e3f\u36d3\uc238(invokeinterface:\u8258\uc238\u7e3f\u36d3\uc238<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>(\u8aa5\ubded\ub18d\u4f4a\u4f52::\uc84e\u2dcc\u92ff\ubb2b\u4492\ubf56, invokevirtual:\u8aa5\ubded\ub18d\u4f4a\u4f52(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, this:\u52d3\u624e\u8bb0\u385b\u6198[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)))
        }
        
        goto(Label_0006)
    }
    
    private \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u8258\uc238\u7e3f\u36d3\uc238 lambda$\ub8be\ube23\u64ab\uc910\u392e\uafe7$0(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            return:\u8258\uc238\u7e3f\u36d3\uc238(invokeinterface:\u8258\uc238\u7e3f\u36d3\uc238<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\u8aa5\ubded\ub18d\u4f4a\u4f52::\u34df\u983f\u647c\ufcaf\ub102\u3e2a, invokevirtual:\u8aa5\ubded\ub18d\u4f4a\u4f52(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, this:\u52d3\u624e\u8bb0\u385b\u6198[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2C9 : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_D9_0 : byte[] [generated]
        stack_107_0 : byte[] [generated]
        stack_109_0 : byte[] [generated]
        stack_13F_0 : byte[] [generated]
        stack_2DC_0 : byte[] [generated]
        stack_31A_0 : byte[] [generated]
        stack_378_0 : byte[] [generated]
        stack_3FF_0 : byte[] [generated]
        var_4_2B4 : int
        var_3_2B9 : byte[]
        var_5_2BA : int
        var_0_392 : int
        expr_378 : byte [generated]
        stack_3CA_2 : byte [generated]
        stack_39E_0 : byte [generated]
        var_2_A5 : byte[]
        expr_A9 : int [generated]
        var_3_308 : byte[]
        var_5_309 : int
        expr_D9 : int [generated]
        expr_109 : int [generated]
        var_3_3ED : byte[]
        var_5_3EE : int
        expr_3FF : byte [generated]
        var_3_14B : String
        stack_2A7_0 : String[] [generated]
        expr_15D : String[] [generated]
        
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
        var_0_2C9 = and:int(ldc:int(-1266749496), ldc:int(-167874582))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_D7_0 = stack_D9_0 = stack_107_0 = stack_109_0 = stack_13F_0 = stack_2DC_0 = stack_31A_0 = stack_378_0 = stack_3FF_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("SiRRRFdHQTxR/keLWvWFAlpBl0SVOvkQRE5JiiZJRQRHi1r3f0YIN4NaUYdBWfZHWUdBl034BhRKP4OHdjk1Sgb8WQ7/jIZDQkpW/0dHR0dO85dlKW5hKFZcamBaXAxBQFdChVYCBf9dR0WJkvhHR0dHSEmQHzWdPzVnUzg8BzM2XUuKBRz5VFdFiZ4iTY0wOxVBTApDiDFDlFoJTAg+N4VLiQ5IRVlCklUJO0UxNJRMBEFZ9FWMW/OMQ0kylUU+CABOVC+HQTJIXAWEXjNIgUrxQAJZP39HizwIQUNVBY0DQTGaS4oAR0BSB4BM+TeAT0KCMUz0SFhcBYReM0iBSvFAAlk/f0eLPAhBQ1UFjQNBMZpLigBHQFIHgEz5N4BPQokJXPAHV07zkoY+kpBAOy8gISc=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_2B4 = expr_6E:int
        var_3_2B9 = newarray:byte[](byte.class, expr_6E:int)
        var_5_2BA = expr_6E:int
        Label_0700:
        
        while (cmpne:boolean(and:int(var_0_2C9:int, ldc:int(256)), ldc:int(0))) {
            var_0_2C9 = and:int(var_0_2C9:int, ldc:int(-1275531781))
            var_5_2BA = add:int(var_5_2BA:int, ldc:int(-1))
            storeelement:byte(var_3_2B9:byte[], var_5_2BA:int, xor:byte(add:byte(loadelement:byte(stack_2DC_0:byte[], var_5_2BA:int), ldc:byte(49)), ldc:byte(120)))
            
            if (cmpne:boolean(var_5_2BA:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_107_0 = stack_109_0 = stack_13F_0 = stack_2DC_0 = stack_31A_0 = stack_378_0 = stack_3FF_0 = var_3_2B9:byte[]
            goto(Label_0115)
        }
        
        var_0_2C9 = and:int(var_0_2C9:int, ldc:int(1874692829))
        Label_0865:
        
        while (cmpne:boolean(and:int(var_0_2C9:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_392 = and:int(var_0_2C9:int, ldc:int(-169181220))
            var_5_2BA = add:int(var_5_2BA:int, ldc:int(-1))
            expr_378 = stack_3CA_2 = loadelement(stack_378_0, var_5_2BA)
            
            if (cmplt:boolean(add:int(add:int(var_5_2BA:int, ldc:int(5)), neg:int(var_4_2B4:int)), ldc:int(0))) {
                stack_3CA_2 = stack_39E_0 = add:byte(expr_378:byte, loadelement:byte(var_3_2B9:byte[], add:int(var_5_2BA:int, ldc:int(5))))
                goto(Label_0942)
            }
            
            Label_0901:
            
            if (cmpeq:boolean(and:int(var_0_392:int, ldc:int(8192)), ldc:int(0))) {
                var_0_392 = and:int(var_0_392:int, ldc:int(-433918476))
            }
            else {
                var_0_392 = and:int(var_0_392:int, ldc:int(-1075221043))
                stack_3CA_2 = stack_39E_0 = add:byte(expr_378:byte, ldc:byte(5))
            }
            
            Label_0942:
            
            if (cmpeq:boolean(and:int(var_0_392:int, ldc:int(8192)), ldc:int(0))) {
                var_0_392 = and:int(var_0_392:int, ldc:int(1568831321))
                goto(Label_0901)
            }
            
            var_0_2C9 = and:int(var_0_392:int, ldc:int(-50332199))
            storeelement:byte(var_3_2B9:byte[], var_5_2BA:int, stack_3CA_2:byte)
            
            if (cmpne:boolean(var_5_2BA:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_107_0 = stack_109_0 = stack_13F_0 = stack_2DC_0 = stack_31A_0 = stack_378_0 = stack_3FF_0 = var_3_2B9:byte[]
            goto(Label_0222)
        }
        
        goto(Label_0700)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_2C9:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0270)
        }
        
        if (cmpeq:boolean(and:int(var_0_2C9:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_2C9 = and:int(var_0_2C9:int, ldc:int(-1306878440))
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_2C9:int, ldc:int(65536)), ldc:int(0))) {
            var_0_2C9 = and:int(var_0_2C9:int, ldc:int(-880287611))
        }
        else {
            var_0_2C9 = and:int(var_0_2C9:int, ldc:int(-9667079))
            var_2_A5 = stack_A5_0:byte[]
            expr_A9 = add:int(arraylength:int(stack_A7_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A9:int, ldc:int(0))) {
                var_3_308 = newarray:byte[](byte.class, expr_A9:int)
                var_5_309 = expr_A9:int
                
                loop {
                    var_0_2C9 = and:int(var_0_2C9:int, ldc:int(-1268126214))
                    var_5_309 = add:int(var_5_309:int, ldc:int(-1))
                    storeelement:byte(var_3_308:byte[], var_5_309:int, add:int(shl:int(loadelement:byte(stack_31A_0:byte[], var_5_309:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_A5:byte[], add:int(var_5_309:int, xor:int(ldc:int(-28592), ldc:int(-28591)))), ldc:int(4)), xor:int(ldc:int(6), ldc:int(9)))))
                    
                    if (cmpne:boolean(var_5_309:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_107_0 = stack_109_0 = stack_13F_0 = stack_2DC_0 = stack_31A_0 = stack_378_0 = stack_3FF_0 = var_3_308:byte[]
            }
        }
        
        Label_0174:
        
        if (cmpeq:boolean(and:int(var_0_2C9:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0270)
        }
        
        if (cmpeq:boolean(and:int(var_0_2C9:int, ldc:int(8388608)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2C9:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_2C9 = and:int(var_0_2C9:int, ldc:int(677159616))
                goto(Label_0115)
            }
            
            var_0_2C9 = and:int(var_0_2C9:int, ldc:int(-1224737316))
            expr_D9 = arraylength:int(stack_D9_0:byte[])
            
            if (cmpne:boolean(expr_D9:int, ldc:int(0))) {
                var_4_2B4 = expr_D9:int
                var_3_2B9 = newarray:byte[](byte.class, expr_D9:int)
                var_5_2BA = expr_D9:int
                goto(Label_0865)
            }
        }
        
        Label_0222:
        
        if (cmpeq:boolean(and:int(var_0_2C9:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_2C9:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0174)
            }
            
            if (cmpeq:boolean(and:int(var_0_2C9:int, ldc:int(1024)), ldc:int(0))) {
                var_0_2C9 = and:int(var_0_2C9:int, ldc:int(736118616))
                goto(Label_0115)
            }
            
            var_0_2C9 = and:int(var_0_2C9:int, ldc:int(-1099333684))
            expr_109 = arraylength:int(stack_109_0:byte[])
            
            if (cmpne:boolean(expr_109:int, ldc:int(0))) {
                var_3_3ED = newarray:byte[](byte.class, expr_109:int)
                var_5_3EE = expr_109:int
                
                loop {
                    var_0_2C9 = and:int(var_0_2C9:int, ldc:int(-127111714))
                    var_5_3EE = add:int(var_5_3EE:int, ldc:int(-1))
                    expr_3FF = loadelement:byte(stack_3FF_0:byte[], var_5_3EE:int)
                    storeelement:byte(var_3_3ED:byte[], var_5_3EE:int, or:int(and:int(shl:int(expr_3FF:byte, xor:int(ldc:int(6153), ldc:int(6157))), ldc:int(-16)), and:int(shr:int(expr_3FF:byte[expected:int], and:int(ldc:int(5), ldc:int(2134))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_3EE:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_107_0 = stack_109_0 = stack_13F_0 = stack_2DC_0 = stack_31A_0 = stack_378_0 = stack_3FF_0 = var_3_3ED:byte[]
            }
        }
        
        Label_0270:
        
        if (cmpne:boolean(and:int(var_0_2C9:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpeq:boolean(and:int(var_0_2C9:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_2C9 = and:int(var_0_2C9:int, ldc:int(520571155))
            goto(Label_0174)
        }
        
        if (cmpeq:boolean(and:int(var_0_2C9:int, ldc:int(2048)), ldc:int(0))) {
            var_0_2C9 = and:int(var_0_2C9:int, ldc:int(-1390618753))
            goto(Label_0115)
        }
        
        var_3_14B = initobject:String(String::<init>, stack_13F_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_2A7_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(9610), ldc:int(9606)))
        expr_15D = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16620), ldc:int(6670)))
        storeelement:String(expr_15D:String[], and:int(ldc:int(-5899), ldc:int(5898)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(11853), ldc:int(-11982)), xor:int(ldc:int(10586), ldc:int(10561))))
        storeelement:String(expr_15D:String[], xor:int(ldc:int(24580), ldc:int(24583)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(17195), ldc:int(17200)), and:int(ldc:int(1623), ldc:int(4575))))
        storeelement:String(expr_15D:String[], and:int(ldc:int(5), ldc:int(8423)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(8258), ldc:int(8213)), and:int(ldc:int(8796), ldc:int(126))))
        storeelement:String(expr_15D:String[], xor:int(ldc:int(9232), ldc:int(9234)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(16988), ldc:int(8413)), and:int(ldc:int(5881), ldc:int(121))))
        storeelement:String(expr_15D:String[], and:int(ldc:int(261), ldc:int(2067)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(1302), ldc:int(1391)), and:int(ldc:int(1720), ldc:int(22673))))
        storeelement:String(expr_15D:String[], xor:int(ldc:int(43), ldc:int(44)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(-31415), ldc:int(-31271)), xor:int(ldc:int(4), ldc:int(204))))
        storeelement:String(expr_15D:String[], xor:int(ldc:int(1552), ldc:int(1563)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(16504), ldc:int(16560)), and:int(ldc:int(759), ldc:int(8439))))
        storeelement:String(expr_15D:String[], xor:int(ldc:int(1379), ldc:int(1383)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(18687), ldc:int(8439)), and:int(ldc:int(24895), ldc:int(2542))))
        storeelement:String(expr_15D:String[], xor:int(ldc:int(35), ldc:int(37)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(7470), ldc:int(8495)), xor:int(ldc:int(438), ldc:int(134))))
        storeelement:String(expr_15D:String[], and:int(ldc:int(16508), ldc:int(7305)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(432), ldc:int(316)), and:int(ldc:int(305), ldc:int(20273))))
        storeelement:String(expr_15D:String[], and:int(ldc:int(4489), ldc:int(18445)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(377), ldc:int(7473)), and:int(ldc:int(826), ldc:int(503))))
        storeelement:String(expr_15D:String[], xor:int(ldc:int(2324), ldc:int(2334)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(8691), ldc:int(2354)), xor:int(ldc:int(257), ldc:int(50))))
        putstatic:String[](\u52d3\u624e\u8bb0\u385b\u6198::\u7e3f\ub7dc\u47c2\u3e75\ua61f\u5245, expr_15D:String[])
        putstatic:Logger(\u52d3\u624e\u8bb0\u385b\u6198::\u71f1\u59ec\u59ec\uae87\uc84e\u3711, invokestatic:Logger(LogManager::getLogger))
    }
    
    public void \uafe7\ub102\u61a4\ub32d\u647c\u760c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6BA : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_6C5 : int
        
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
        var_3_6BA = and:int(ldc:int(-323756513), ldc:int(1820303167))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u52d3\u624e\u8bb0\u385b\u6198[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1065862063))
        }
        else {
            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-403972309))
            var_5_8A = and:int(ldc:int(9577), ldc:int(-9580))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-3868), ldc:int(3354)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_6BA:int, ldc:int(2112073343))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(1025), ldc:int(193)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(3072), ldc:int(3073)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_6BA = and:int(var_3_E3:int, ldc:int(1701557999))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(69), ldc:int(2603)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(499649139))
                        goto(Label_1609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1356690115))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1590092680))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1707952534))
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1859480251))
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(2146944795))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0613)
                            }
                            
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(496194251))
                        goto(Label_1609)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-30569181))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-224916860))
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(415200159))
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1228338284))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1818054127))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1995431803))
                        var_11_F4 = and:int(ldc:int(9760), ldc:int(-9761))
                        goto(Label_1598)
                    }
                    
                    Label_0613:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1995605062))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1631607520))
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1582640706))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1969569635))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1979424571))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0738:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-2144213679))
                        goto(Label_1609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1135290968))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(481537833))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-2108539433))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(2091886331))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0870:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(780950775))
                        goto(Label_1609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1077583212))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(994059009))
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1634600726))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1511067891))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-425466257))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = xor:int(ldc:int(16392), ldc:int(16393))
                                goto(Label_1146)
                            }
                        }
                    }
                    
                    Label_1004:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1509311044))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0870)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-26657807))
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-303063121))
                        var_11_F4 = and:int(ldc:int(-11655), ldc:int(10626))
                    }
                    
                    Label_1146:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1383420913))
                        goto(Label_1609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-558211582))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1004)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1827478042))
                            goto(Label_0870)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1184605877))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(2104987531))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1443)
                            }
                        }
                    }
                    
                    Label_1271:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1755217417))
                        goto(Label_1609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1706359656))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-2124952918))
                            goto(Label_1146)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1948551111))
                            goto(Label_1004)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(2052196056))
                            goto(Label_0870)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(102025782))
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1704628295))
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-2051226525))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1696847599))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1598)
                    }
                    
                    Label_1443:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-2036639734))
                        goto(Label_1609)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-902187768))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-533258156))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-2078800773))
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1283598173))
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1076704578))
                        goto(Label_0613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(32768)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6BA = and:int(var_3_6BA:int, ldc:int(-319584741))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1598:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6C5 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1609:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(2054721288))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1975819765))
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(43943744))
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1569306262))
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1966602111))
                        var_17_6C5 = add:int(var_16_122:int, and:int(ldc:int(385), ldc:int(9217)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6BA = and:int(var_3_6BA:int, ldc:int(1978910475))
                
                if (cmple:boolean(var_5_8A = var_17_6C5:int, sub:int(var_6_91:int, xor:int(ldc:int(-13824), ldc:int(-13823))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-835477343))
            goto(Label_0108)
        }
    }
}
