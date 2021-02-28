public class \ub113\ufcaf\u3c25\u071d\u97b7.\ube23\uf9c5\u8350\u62da\ub32d {
    public void \ube23\uf9c5\u8350\u62da\ub32d() {
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
    
    public void \u6d69\ub83f\u7e3f\ud51e\uafe7() {
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
            putfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d, initobject:ArrayList<\u8640\ud7e8\u8308\u4bc8\uc29a>[expected:List<\u8640\ud7e8\u8308\u4bc8\uc29a>](ArrayList<E>::<init>))
            putfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ube23\uf9c5\u8350\u62da\ub32d::\u8c8a\u7ce1\u6b5f\u71ae\u6cfe, this:\ube23\uf9c5\u8350\u62da\ub32d, initobject:\u4e72\ua6bd\u927d\uc238\ub8be(\u4e72\ua6bd\u927d\uc238\ub8be::<init>, this:\ube23\uf9c5\u8350\u62da\ub32d[expected:\ud158\u839e\u7006\uc3e3\u446c]))
            invokespecial:void(\ud158\u839e\u7006\uc3e3\u446c::\u6d69\ub83f\u7e3f\ud51e\uafe7, this:\ube23\uf9c5\u8350\u62da\ub32d[expected:\ud158\u839e\u7006\uc3e3\u446c])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub6ab\ube23\uae87\uc84e\u1833() {
        var_1_5F : int
        stack_152_0 : \u4e72\ua6bd\u927d\uc238\ub8be [generated]
        stack_152_1 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(200374264), ldc:int(467618674))
            putfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d, initobject:ArrayList<\u8640\ud7e8\u8308\u4bc8\uc29a>[expected:List<\u8640\ud7e8\u8308\u4bc8\uc29a>](ArrayList<E>::<init>))
            putstatic:\u7d52\u718f\u3776\u6fb0\ub83f(\ube23\uf9c5\u8350\u62da\ub32d::\u61a4\u8258\u4daf\ub6ab\ud7e8, aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f())
            putstatic:\u8640\ud7e8\u8308\u4bc8\uc29a(\ube23\uf9c5\u8350\u62da\ub32d::\ub83f\u6c52\u12cb\u3c25\u3776, aconstnull:\u8640\ud7e8\u8308\u4bc8\uc29a())
            putfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\u0c95\u34df\u71f1\u56bd\u4f52, this:\ube23\uf9c5\u8350\u62da\ub32d, f2i:int(invokevirtual:float(\u4e72\ua6bd\u927d\uc238\ub8be::\uae87\u9033\ubded\u71f1\u71ae, getfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ube23\uf9c5\u8350\u62da\ub32d::\u8c8a\u7ce1\u6b5f\u71ae\u6cfe, this:\ube23\uf9c5\u8350\u62da\ub32d), and:int(ldc:int(-12118), ldc:int(853)))))
            putfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\u71f1\u71ae\u385b\ub18d\u0c95, this:\ube23\uf9c5\u8350\u62da\ub32d, and:int(ldc:int(-5443), ldc:int(5442)))
            putfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\uc31c\u4c2b\ucef1\ud4fe\u392e, this:\ube23\uf9c5\u8350\u62da\ub32d, and:int(ldc:int(11282), ldc:int(-11347)))
            putstatic:int(\ube23\uf9c5\u8350\u62da\ub32d::\u8413\uc3e3\u3711\ubff1\u1833, and:int(ldc:int(492), ldc:int(-496)))
            putfield:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\u183a\ub18d\u3504\ubff1\u4cd9, this:\ube23\uf9c5\u8350\u62da\ub32d, initobject:\u5245\u8cae\ub102\u4c04\u983f(\u5245\u8cae\ub102\u4c04\u983f::<init>, getfield:float(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\ub171\u718f\u12b2\ua6bd\u8df4\u47c2, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b))), getfield:float(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u760c\u8258\u3e75\u69d9\uc238\u647c, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b)))))
            putfield:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\ub1b9\u960f\u3a62\ua6bd\u9255, this:\ube23\uf9c5\u8350\u62da\ub32d, initobject:\u5245\u8cae\ub102\u4c04\u983f(\u5245\u8cae\ub102\u4c04\u983f::<init>, getfield:float(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u7d52\u8709\ubefe\u7af6\u0b8e\ua61f, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b))), getfield:float(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u4d85\u71ae\u494c\u839e\uf9c5\u93a2, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b)))))
            putstatic:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\uc2bd\u5fe1\uc29a\u5140\ud171, initobject:\u5245\u8cae\ub102\u4c04\u983f(\u5245\u8cae\ub102\u4c04\u983f::<init>, getfield:float(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u7d52\u8709\ubefe\u7af6\u0b8e\ua61f, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b))), getfield:float(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u4d85\u71ae\u494c\u839e\uf9c5\u93a2, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b)))))
            putfield:float(\ube23\uf9c5\u8350\u62da\ub32d::\u6d99\u718f\uf995\u4c04\uc238, this:\ube23\uf9c5\u8350\u62da\ub32d, ldc:float(-1.0f))
            stack_152_0 = getfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ube23\uf9c5\u8350\u62da\ub32d::\u8c8a\u7ce1\u6b5f\u71ae\u6cfe, this:\ube23\uf9c5\u8350\u62da\ub32d)
            
            if (logicaland:boolean(instanceof:boolean(\u6435\ub8be\u718f\u6b0d\u67e9.\u76bc\u71f1\uceb8\u7049\u3c25\u647c.class, invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\ube23\u67d0\u64f2\u839e\u76bc::\u71f1\u836c\u47c2\uae5d\u6b0d\u946b, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\ube23\u67d0\u64f2\u839e\u76bc](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b)), getstatic:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b(\u34df\ub113\u6c56\u97e6\u51b2\u4c2b::\uc238\u120d\u516c\u446c\u51fa\u40a9)))), invokevirtual:boolean(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u718f\u3776\u5d20\ub70c\ud217\u759a, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\uf9c5\u7ce1\u624e\u392e\u6435\u624e, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b)))))) {
                stack_152_1 = and:int[expected:boolean](ldc:int(6561), ldc:int(587))
            }
            else {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1805107234))
                stack_152_1 = and:int[expected:boolean](ldc:int(20000), ldc:int(-20005))
            }
            
            invokevirtual:void(\u4e72\ua6bd\u927d\uc238\ub8be::\uae5d\ub1b9\u7873\u47c2\ub102, stack_152_0:\u4e72\ua6bd\u927d\uc238\ub8be, stack_152_1:boolean)
            putfield:boolean(\ube23\uf9c5\u8350\u62da\ub32d::\u4179\ua6bd\u960f\ud171\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d, and:int[expected:boolean](ldc:int(-29563), ldc:int(4442)))
            putfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\uc2e8\ud51e\u8350\u69d9\u965f, this:\ube23\uf9c5\u8350\u62da\ub32d, ldc:int(-1))
            invokevirtual:void(HashMap<K, V>::clear, getfield:HashMap<\u7d52\u718f\u3776\u6fb0\ub83f, List<\u416d\u183a\u071d\ud171\u5bc4<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, Long>>>(\u4e72\ua6bd\u927d\uc238\ub8be::\u8413\u5140\u64f2\uc9f6\u9937, getfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ube23\uf9c5\u8350\u62da\ub32d::\u8c8a\u7ce1\u6b5f\u71ae\u6cfe, this:\ube23\uf9c5\u8350\u62da\ub32d)))
            invokevirtual:void(HashMap<K, V>::clear, getfield:HashMap<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>(\ube23\uf9c5\u8350\u62da\ub32d::\u3776\u527a\ua61f\u8df4\u2dcc, this:\ube23\uf9c5\u8350\u62da\ub32d))
            
            if (getfield:boolean(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u8c8a\u62da\u7c6b\u385b\u3dd3\ud12e, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b)))) {
                putfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\u3d4b\uc238\ubcb0\u67e9\u5d20, this:\ube23\uf9c5\u8350\u62da\ub32d, xor:int(ldc:int(4352), ldc:int(4353)))
            }
            
            invokespecial:void(\ud158\u839e\u7006\uc3e3\u446c::\ub6ab\ube23\uae87\uc84e\u1833, this:\ube23\uf9c5\u8350\u62da\ub32d[expected:\ud158\u839e\u7006\uc3e3\u446c])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ufe34\u6bb9\u392e\u7043\u67d0() {
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
            putstatic:\u7d52\u718f\u3776\u6fb0\ub83f(\ube23\uf9c5\u8350\u62da\ub32d::\u61a4\u8258\u4daf\ub6ab\ud7e8, aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f())
            putstatic:\u8640\ud7e8\u8308\u4bc8\uc29a(\ube23\uf9c5\u8350\u62da\ub32d::\ub83f\u6c52\u12cb\u3c25\u3776, aconstnull:\u8640\ud7e8\u8308\u4bc8\uc29a())
            putfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d, aconstnull:List<\u8640\ud7e8\u8308\u4bc8\uc29a>())
            putstatic:boolean(\ube23\uf9c5\u8350\u62da\ub32d::\ubb2b\uf995\uc9f6\u0c95\ubb2b, and:int[expected:boolean](ldc:int(3918), ldc:int(-4063)))
            invokespecial:void(\ud158\u839e\u7006\uc3e3\u446c::\ufe34\u6bb9\u392e\u7043\u67d0, this:\ube23\uf9c5\u8350\u62da\ub32d[expected:\ud158\u839e\u7006\uc3e3\u446c])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0c95\ub83f\u6cfe\u5140\u9a18(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u9937\u416d\ub171\uae87\ub8be p0) {
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
        
        if (logicaland:boolean(invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\ube23\uf9c5\u8350\u62da\ub32d[expected:\ud158\u839e\u7006\uc3e3\u446c]), invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u7bad\u71ae\ua61f\ub102\u8413, this:\ube23\uf9c5\u8350\u62da\ub32d[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), xor:int(ldc:int(2956), ldc:int(2996)))))) {
            invokevirtual:void(\u392e\u40a9\u4bc8\u9a18\uc31c::\u64f2\u183a\u92ee\u4d85\ub171, invokevirtual:\u392e\u40a9\u4bc8\u9a18\uc31c(\u6b0d\ua068\uc4d2\u5245\u4d85::\u624e\u494c\u0b8e\u56bd\u5654, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), initobject:\u97e6\ubf56\u61a4\ub7dc\u93a2(\u97e6\ubf56\u61a4\ub7dc\u93a2::<init>, loadelement:String(getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), xor:int(ldc:int(19021), ldc:int(18958))), loadelement:String(getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), and:int(ldc:int(16716), ldc:int(2773)))))
            invokevirtual:void(\ud158\u839e\u7006\uc3e3\u446c::\u836c\u6198\ua6bd\u071d\u47c2, this:\ube23\uf9c5\u8350\u62da\ub32d[expected:\ud158\u839e\u7006\uc3e3\u446c])
        }
    }
    
    public void \u8640\u9255\ua6bd\u9af2\ubb2b(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u983f\u7ce1\uceb8\ubded\u3a62 p0) {
        var_2_61 : int
        
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
        var_2_61 = and:int(ldc:int(-32085230), ldc:int(-59025608))
        
        if (logicalnot:boolean(invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\ube23\uf9c5\u8350\u62da\ub32d[expected:\ud158\u839e\u7006\uc3e3\u446c]))) {
            return:void()
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0195)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(256)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(401506412))
            }
            else {
                var_2_61 = and:int(var_2_61:int, ldc:int(2100714307))
                
                if (cmpne:boolean(getfield:float(\ube23\uf9c5\u8350\u62da\ub32d::\u6d99\u718f\uf995\u4c04\uc238, this:\ube23\uf9c5\u8350\u62da\ub32d), ldc:float(-1.0f))) {
                    putfield:float(\ube23\uf9c5\u8350\u62da\ub32d::\u6d99\u718f\uf995\u4c04\uc238, this:\ube23\uf9c5\u8350\u62da\ub32d, add:float(getfield:float(\ube23\uf9c5\u8350\u62da\ub32d::\u6d99\u718f\uf995\u4c04\uc238, this:\ube23\uf9c5\u8350\u62da\ub32d), ldc:float(1.0f)))
                }
            }
            
            Label_0146:
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(128)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-84573377))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1048576)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_61 = and:int(var_2_61:int, ldc:int(2105236408))
                
                if (logicalnot:boolean(invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u7bad\u71ae\ua61f\ub102\u8413, this:\ube23\uf9c5\u8350\u62da\ub32d[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), and:int(ldc:int(700), ldc:int(8249)))))) {
                    return:void()
                }
            }
            
            Label_0195:
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(512)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1740933432))
                goto(Label_0146)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(512)), ldc:int(0))) {
                loopcontinue()
            }
            
            if (invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\u6b0d\u5bc4\u3504\u40a9\u7043\u98a4, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\ube23\u67d0\u64f2\u839e\u76bc](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b)))) {
                return:void()
            }
            
            invokevirtual:void(\ud158\u839e\u7006\uc3e3\u446c::\u836c\u6198\ua6bd\u071d\u47c2, this:\ube23\uf9c5\u8350\u62da\ub32d[expected:\ud158\u839e\u7006\uc3e3\u446c])
            invokevirtual:void(\u392e\u40a9\u4bc8\u9a18\uc31c::\u64f2\u183a\u92ee\u4d85\ub171, invokevirtual:\u392e\u40a9\u4bc8\u9a18\uc31c(\u6b0d\ua068\uc4d2\u5245\u4d85::\u624e\u494c\u0b8e\u56bd\u5654, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), initobject:\u97e6\ubf56\u61a4\ub7dc\u93a2(\u97e6\ubf56\u61a4\ub7dc\u93a2::<init>, loadelement:String(getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), and:int(ldc:int(22627), ldc:int(847))), loadelement:String(getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), and:int(ldc:int(17485), ldc:int(215)))))
        }
    }
    
    public void \u516c\uc84e\u516c\ub171\ua562(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ubcb0\u4ab3\u4c04\uae5d\uc238 p0) {
        var_2_61 : int
        
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
        var_2_61 = and:int(ldc:int(1279510433), ldc:int(1793298367))
        
        if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\ube23\uf9c5\u8350\u62da\ub32d[expected:\ud158\u839e\u7006\uc3e3\u446c])) {
            loop {
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(432207154))
                    goto(Label_0226)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(2)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-887392127))
                }
                else {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-296296469))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(String::equals, invokevirtual:String(\ud158\u839e\u7006\uc3e3\u446c::\u5140\u8bb0\uc84e\u4179\ubcb0, this:\ube23\uf9c5\u8350\u62da\ub32d[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), and:int(ldc:int(9535), ldc:int(6215)))), loadelement:String[expected:Object](getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), xor:int(ldc:int(28742), ldc:int(28750)))))) {
                        if (logicalor:boolean(instanceof:boolean(\u6435\ub8be\u718f\u6b0d\u67e9.\u76bc\u71f1\uceb8\u7049\u3c25\u647c.class, invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\ube23\u67d0\u64f2\u839e\u76bc::\u6b5f\u6b5f\u3e75\ub83f\u4c2b\u5245, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\ube23\u67d0\u64f2\u839e\u76bc](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b))))), cmpne:boolean(getfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\ud171\u76bc\uf995\u4cd9\u8709, this:\ube23\uf9c5\u8350\u62da\ub32d), getfield:int(\u0b8e\ud4fe\uc229\u92ee\ud4fe::\u0800\u946b\u4c04\u494c\u4c04\u527a, getfield:\u0b8e\ud4fe\uc229\u92ee\ud4fe(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u64f2\u93a2\ub70c\uafe7\u5f50\u5bc4, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b))))))) {
                            var_2_61 = and:int(var_2_61:int, ldc:int(1788519415))
                            
                            if (cmpne:boolean(getstatic:\u7d52\u718f\u3776\u6fb0\ub83f(\ube23\uf9c5\u8350\u62da\ub32d::\u61a4\u8258\u4daf\ub6ab\ud7e8), aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f())) {
                                invokevirtual:boolean(\u6ec6\uc7fe\u927d\u6cfe\ub32d::\u4e72\u6198\u7c6b\u718f\u64ab, p0:\ubcb0\u4ab3\u4c04\uae5d\uc238[expected:\u6ec6\uc7fe\u927d\u6cfe\ub32d], xor:int[expected:boolean](ldc:int(-32724), ldc:int(-32723)))
                                goto(Label_0226)
                            }
                        }
                    }
                }
                
                Label_0177:
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(128)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(1794609047))
                        loopcontinue()
                    }
                    
                    var_2_61 = and:int(var_2_61:int, ldc:int(-109137985))
                    
                    if (instanceof:boolean(\u6435\ub8be\u718f\u6b0d\u67e9.\u76bc\u71f1\uceb8\u7049\u3c25\u647c.class, invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\ube23\u67d0\u64f2\u839e\u76bc::\u6b5f\u6b5f\u3e75\ub83f\u4c2b\u5245, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\ube23\u67d0\u64f2\u839e\u76bc](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b)))))) {
                        putfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\ua3b4\uff55\ub83f\u8389\u4cd9, this:\ube23\uf9c5\u8350\u62da\ub32d, and:int(ldc:int(2050), ldc:int(26399)))
                    }
                }
                
                Label_0226:
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(1243990719))
                    goto(Label_0177)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1073741824)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
        }
    }
    
    public void \ubb2b\u9a18\u71ae\ud523\u8413(\ub113\uc4d2\u183a\u527a\u6435.\u8df4\ubff1\u759a\u4c2b\u8308 p0) {
        var_2_852 : int
        var_4_82A : float
        var_5_83B : \u3bc9\u36d3\u4ab3\u8258\u6c52
        var_2_8C2 : int
        var_6_8A2 : boolean
        var_2_999 : int
        stack_98C_0 : float [generated]
        var_7_98C : float
        stack_9CF_0 : int [generated]
        var_2_9CE : int
        var_8_9CF : int
        var_2_A59 : int
        var_9_A2E : \u8753\u446c\u93a2\u071d\uc3e3
        
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
        var_2_852 = and:int(ldc:int(-1379695669), ldc:int(-255115310))
        
        if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\ube23\uf9c5\u8350\u62da\ub32d[expected:\ud158\u839e\u7006\uc3e3\u446c])) {
            if (cmpne:boolean(getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b)), aconstnull:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98())) {
                goto(Label_0232)
            }
        }
        
        Label_0105:
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_1849)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(64)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(1916621894))
            goto(Label_1670)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_1321)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(2147483647)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(898423448))
            goto(Label_1138)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_0996)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0840)
        }
        
        if (cmpne:boolean(and:int(var_2_852:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0663)
        }
        
        if (cmpne:boolean(and:int(var_2_852:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0508)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(2147483647)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(-88195480))
            goto(Label_0370)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(268435456)), ldc:int(0))) {
            return:void()
        }
        
        Label_0232:
        
        if (cmpne:boolean(and:int(var_2_852:int, ldc:int(4096)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(-377721940))
            goto(Label_1849)
        }
        
        if (cmpne:boolean(and:int(var_2_852:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_1670)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(2)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(624796799))
            goto(Label_1321)
        }
        
        if (cmpne:boolean(and:int(var_2_852:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_1138)
        }
        
        if (cmpne:boolean(and:int(var_2_852:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0996)
        }
        
        if (cmpne:boolean(and:int(var_2_852:int, ldc:int(524288)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(1553465884))
            goto(Label_0840)
        }
        
        if (cmpne:boolean(and:int(var_2_852:int, ldc:int(268435456)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(1087951809))
            goto(Label_0663)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0508)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(2)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(1947408400))
                goto(Label_0105)
            }
            
            var_2_852 = and:int(var_2_852:int, ldc:int(-1985461265))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u8df4\ubff1\u759a\u4c2b\u8308::\ua562\ud171\ud12e\u624e\u97b7, p0:\u8df4\ubff1\u759a\u4c2b\u8308))) {
                putfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\ud171\u76bc\uf995\u4cd9\u8709, this:\ube23\uf9c5\u8350\u62da\ub32d, getfield:int(\u0b8e\ud4fe\uc229\u92ee\ud4fe::\u0800\u946b\u4c04\u494c\u4c04\u527a, getfield:\u0b8e\ud4fe\uc229\u92ee\ud4fe(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u64f2\u93a2\ub70c\uafe7\u5f50\u5bc4, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b)))))
                
                if (cmpeq:boolean(getstatic:\u7d52\u718f\u3776\u6fb0\ub83f(\ube23\uf9c5\u8350\u62da\ub32d::\u61a4\u8258\u4daf\ub6ab\ud7e8), aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f())) {
                    goto(Label_1321)
                }
                
                if (logicalnot:boolean(invokevirtual:boolean(\u4e72\ua6bd\u927d\uc238\ub8be::\u8308\u12cb\u61a4\uc2e8\u92ee, getfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ube23\uf9c5\u8350\u62da\ub32d::\u8c8a\u7ce1\u6b5f\u71ae\u6cfe, this:\ube23\uf9c5\u8350\u62da\ub32d)))) {
                    goto(Label_1321)
                }
                
                if (cmpeq:boolean(getfield:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\ub1b9\u960f\u3a62\ua6bd\u9255, this:\ube23\uf9c5\u8350\u62da\ub32d), aconstnull:\u5245\u8cae\ub102\u4c04\u983f())) {
                    goto(Label_1321)
                }
                
                invokevirtual:void(\u4e72\ua6bd\u927d\uc238\ub8be::\u1187\ub70c\u74b1\u6198\u7e3f, getfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ube23\uf9c5\u8350\u62da\ub32d::\u8c8a\u7ce1\u6b5f\u71ae\u6cfe, this:\ube23\uf9c5\u8350\u62da\ub32d), getstatic:\u7d52\u718f\u3776\u6fb0\ub83f(\ube23\uf9c5\u8350\u62da\ub32d::\u61a4\u8258\u4daf\ub6ab\ud7e8), getfield:float(\u5245\u8cae\ub102\u4c04\u983f::\ud171\u3dd3\ud171\ud523\u8bb0, getfield:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\ub1b9\u960f\u3a62\ua6bd\u9255, this:\ube23\uf9c5\u8350\u62da\ub32d)), getfield:float(\u5245\u8cae\ub102\u4c04\u983f::\uf9c5\ud158\u7330\u9255\u9937, getfield:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\ub1b9\u960f\u3a62\ua6bd\u9255, this:\ube23\uf9c5\u8350\u62da\ub32d)))
                goto(Label_1321)
            }
        }
        
        Label_0370:
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_1849)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(128)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(-176575942))
            goto(Label_1670)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(2)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(880573843))
            goto(Label_1321)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(2)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(-673950919))
            goto(Label_1138)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0996)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0840)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(64)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(-688938114))
            goto(Label_0663)
        }
        
        if (cmpne:boolean(and:int(var_2_852:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(512)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(672871204))
                goto(Label_0232)
            }
            
            if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0105)
            }
            
            var_2_852 = and:int(var_2_852:int, ldc:int(-572185630))
            
            if (cmpgt:boolean(getfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\ua3b4\uff55\ub83f\u8389\u4cd9, this:\ube23\uf9c5\u8350\u62da\ub32d), ldc:int(0))) {
                putfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\ua3b4\uff55\ub83f\u8389\u4cd9, this:\ube23\uf9c5\u8350\u62da\ub32d, sub:int(getfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\ua3b4\uff55\ub83f\u8389\u4cd9, this:\ube23\uf9c5\u8350\u62da\ub32d), xor:int(ldc:int(24576), ldc:int(24577))))
            }
        }
        
        Label_0508:
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_1849)
        }
        
        if (cmpne:boolean(and:int(var_2_852:int, ldc:int(268435456)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(-198431115))
            goto(Label_1670)
        }
        
        if (cmpne:boolean(and:int(var_2_852:int, ldc:int(4)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(1942094474))
            goto(Label_1321)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(128)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(-621327673))
            goto(Label_1138)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0996)
        }
        
        if (cmpne:boolean(and:int(var_2_852:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0840)
        }
        
        if (cmpne:boolean(and:int(var_2_852:int, ldc:int(2048)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(1156211529))
        }
        else {
            if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(2147483647)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(193106022))
                goto(Label_0370)
            }
            
            if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(2)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(1031343952))
                goto(Label_0232)
            }
            
            if (cmpne:boolean(and:int(var_2_852:int, ldc:int(268435456)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(280251733))
                goto(Label_0105)
            }
            
            var_2_852 = and:int(var_2_852:int, ldc:int(988872414))
            
            if (cmpne:boolean(getstatic:\u7d52\u718f\u3776\u6fb0\ub83f(\ube23\uf9c5\u8350\u62da\ub32d::\u61a4\u8258\u4daf\ub6ab\ud7e8), aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f())) {
                if (invokevirtual:boolean(\u4e72\ua6bd\u927d\uc238\ub8be::\u4ab3\u51b2\u12cb\u16f6\u2dcc, getfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ube23\uf9c5\u8350\u62da\ub32d::\u8c8a\u7ce1\u6b5f\u71ae\u6cfe, this:\ube23\uf9c5\u8350\u62da\ub32d))) {
                    if (invokestatic:boolean(\u3e75\u8413\u3711\u4daf\ub1b9::\u4d85\ucb79\u5db4\ud51e\u6198)) {
                        if (invokevirtual:boolean(String::equals, invokevirtual:String(\ud158\u839e\u7006\uc3e3\u446c::\u5140\u8bb0\uc84e\u4179\ubcb0, this:\ube23\uf9c5\u8350\u62da\ub32d[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), xor:int(ldc:int(337), ldc:int(342)))), loadelement:String[expected:Object](getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), and:int(ldc:int(12825), ldc:int(457))))) {
                            invokevirtual:void(\u4e72\ua6bd\u927d\uc238\ub8be::\ub1b9\u6c56\ud51e\u4492\u8350, getfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ube23\uf9c5\u8350\u62da\ub32d::\u8c8a\u7ce1\u6b5f\u71ae\u6cfe, this:\ube23\uf9c5\u8350\u62da\ub32d))
                        }
                    }
                }
            }
        }
        
        Label_0663:
        
        if (cmpne:boolean(and:int(var_2_852:int, ldc:int(4096)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(-614318772))
            goto(Label_1849)
        }
        
        if (cmpne:boolean(and:int(var_2_852:int, ldc:int(1024)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(1634360632))
            goto(Label_1670)
        }
        
        if (cmpne:boolean(and:int(var_2_852:int, ldc:int(4096)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(951106389))
            goto(Label_1321)
        }
        
        if (cmpne:boolean(and:int(var_2_852:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_1138)
        }
        
        if (cmpne:boolean(and:int(var_2_852:int, ldc:int(4)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(-1952971809))
            goto(Label_0996)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(2147483647)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(-1358465668))
        }
        else {
            if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(2)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(269632543))
                goto(Label_0508)
            }
            
            if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(2147483647)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(989797017))
                goto(Label_0370)
            }
            
            if (cmpne:boolean(and:int(var_2_852:int, ldc:int(524288)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(440979723))
                goto(Label_0232)
            }
            
            if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(8388608)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(-603672647))
                goto(Label_0105)
            }
            
            var_2_852 = and:int(var_2_852:int, ldc:int(-1109626125))
            
            if (invokevirtual:boolean(\u4e72\ua6bd\u927d\uc238\ub8be::\u4ab3\u51b2\u12cb\u16f6\u2dcc, getfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ube23\uf9c5\u8350\u62da\ub32d::\u8c8a\u7ce1\u6b5f\u71ae\u6cfe, this:\ube23\uf9c5\u8350\u62da\ub32d))) {
                if (logicalnot:boolean(instanceof:boolean(\u6435\ub8be\u718f\u6b0d\u67e9.\u76bc\u71f1\uceb8\u7049\u3c25\u647c.class, invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\ube23\u67d0\u64f2\u839e\u76bc::\u6b5f\u6b5f\u3e75\ub83f\u4c2b\u5245, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\ube23\u67d0\u64f2\u839e\u76bc](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b))))))) {
                    goto(Label_1670)
                }
                
                if (cmpeq:boolean(getstatic:\u7d52\u718f\u3776\u6fb0\ub83f(\ube23\uf9c5\u8350\u62da\ub32d::\u61a4\u8258\u4daf\ub6ab\ud7e8), aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f())) {
                    goto(Label_1670)
                }
            }
        }
        
        Label_0840:
        
        if (cmpne:boolean(and:int(var_2_852:int, ldc:int(268435456)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(-2058876808))
            goto(Label_1849)
        }
        
        if (cmpne:boolean(and:int(var_2_852:int, ldc:int(4)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(-1411054329))
            goto(Label_1670)
        }
        
        if (cmpne:boolean(and:int(var_2_852:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_1321)
        }
        
        if (cmpne:boolean(and:int(var_2_852:int, ldc:int(4)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(-1522760005))
            goto(Label_1138)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(524288)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(64)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(-300527699))
                goto(Label_0663)
            }
            
            if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(2)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(798661274))
                goto(Label_0508)
            }
            
            if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(2147483647)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(1942058969))
                goto(Label_0370)
            }
            
            if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(128)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(1437468946))
                goto(Label_0232)
            }
            
            if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0105)
            }
            
            var_2_852 = and:int(var_2_852:int, ldc:int(-1194812438))
            
            if (cmpge:boolean(getfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\uc2e8\ud51e\u8350\u69d9\u965f, this:\ube23\uf9c5\u8350\u62da\ub32d), ldc:int(0))) {
                if (cmpne:boolean(getfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\uc2e8\ud51e\u8350\u69d9\u965f, this:\ube23\uf9c5\u8350\u62da\ub32d), ldc:int(0))) {
                    goto(Label_1849)
                }
                
                invokevirtual:void(\u4e72\ua6bd\u927d\uc238\ub8be::\ub1b9\u6c56\ud51e\u4492\u8350, getfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ube23\uf9c5\u8350\u62da\ub32d::\u8c8a\u7ce1\u6b5f\u71ae\u6cfe, this:\ube23\uf9c5\u8350\u62da\ub32d))
                invokevirtual:void(\u4e72\ua6bd\u927d\uc238\ub8be::\uae5d\ub1b9\u7873\u47c2\ub102, getfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ube23\uf9c5\u8350\u62da\ub32d::\u8c8a\u7ce1\u6b5f\u71ae\u6cfe, this:\ube23\uf9c5\u8350\u62da\ub32d), and:int[expected:boolean](ldc:int(3), ldc:int(16981)))
                goto(Label_1849)
            }
        }
        
        Label_0996:
        
        if (cmpne:boolean(and:int(var_2_852:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_1849)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(512)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(236892424))
            goto(Label_1670)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_1321)
        }
        
        if (cmpne:boolean(and:int(var_2_852:int, ldc:int(512)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_2_852:int, ldc:int(4)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(-1896069976))
                goto(Label_0840)
            }
            
            if (cmpne:boolean(and:int(var_2_852:int, ldc:int(4096)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(-853671202))
                goto(Label_0663)
            }
            
            if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(8388608)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(-232295862))
                goto(Label_0508)
            }
            
            if (cmpne:boolean(and:int(var_2_852:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0370)
            }
            
            if (cmpne:boolean(and:int(var_2_852:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0232)
            }
            
            if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(512)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(-1317290805))
                goto(Label_0105)
            }
            
            var_2_852 = and:int(var_2_852:int, ldc:int(-1348230453))
            invokespecial:void(\ube23\uf9c5\u8350\u62da\ub32d::\uf9c5\ubff1\u8d98\u3776\u7bad, this:\ube23\uf9c5\u8350\u62da\ub32d)
            
            if (cmpne:boolean(getfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d), aconstnull:List<\u8640\ud7e8\u8308\u4bc8\uc29a>())) {
                if (logicalnot:boolean(invokeinterface:boolean(List<E>::isEmpty, getfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d)))) {
                    putfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\u0c95\u34df\u71f1\u56bd\u4f52, this:\ube23\uf9c5\u8350\u62da\ub32d, add:int(getfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\u0c95\u34df\u71f1\u56bd\u4f52, this:\ube23\uf9c5\u8350\u62da\ub32d), xor:int(ldc:int(16640), ldc:int(16641))))
                    var_4_82A = invokevirtual:float(\ud158\u839e\u7006\uc3e3\u446c::\uf94d\u983f\u40a9\u6fb0\u12b2, this:\ube23\uf9c5\u8350\u62da\ub32d[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), and:int(ldc:int(6453), ldc:int(1125))))
                    var_5_83B = checkcast:\u3bc9\u36d3\u4ab3\u8258\u6c52(\u516c\u3d64\u718f\ub171\u6b5f.\u3bc9\u36d3\u4ab3\u8258\u6c52.class, invokevirtual:\ud158\u839e\u7006\uc3e3\u446c[expected:\u3bc9\u36d3\u4ab3\u8258\u6c52](\u3776\u647c\u51fa\u7e3f\ub32d::\ud36e\u6d69\u4ab3\u6c52\u6c52, invokevirtual:\u3776\u647c\u51fa\u7e3f\ub32d(\u6b0d\ua068\uc4d2\u5245\u4d85::\ufcaf\uc9f6\u9a18\uc7fe\uc2bd, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), ldc:Class<\ud12e\u4bc8\u183a\ubff1\u0c95>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u4bc8\u183a\ubff1\u0c95.class)))
                    
                    if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, var_5_83B:\u3bc9\u36d3\u4ab3\u8258\u6c52[expected:\ud158\u839e\u7006\uc3e3\u446c])) {
                        if (invokevirtual:boolean(String::equalsIgnoreCase, invokevirtual:String(\ud158\u839e\u7006\uc3e3\u446c::\u5140\u8bb0\uc84e\u4179\ubcb0, var_5_83B:\u3bc9\u36d3\u4ab3\u8258\u6c52[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), and:int(ldc:int(326), ldc:int(19175)))), loadelement:String(getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), and:int(ldc:int(2663), ldc:int(17735))))) {
                            invokevirtual:void(\ube23\uf9c5\u8350\u62da\ub32d::\u4ab3\ud51e\u88c5\u3504\u4f52, this:\ube23\uf9c5\u8350\u62da\ub32d, p0:\u8df4\ubff1\u759a\u4c2b\u8308, invokevirtual:String(\ud158\u839e\u7006\uc3e3\u446c::\u5140\u8bb0\uc84e\u4179\ubcb0, invokevirtual:\ud158\u839e\u7006\uc3e3\u446c(\u3bc9\u36d3\u4ab3\u8258\u6c52::\u7330\u0c95\u5f50\uc229\u8cae, var_5_83B:\u3bc9\u36d3\u4ab3\u8258\u6c52), loadelement:String(getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), xor:int(ldc:int(49), ldc:int(51)))), invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u7bad\u71ae\ua61f\ub102\u8413, invokevirtual:\ud158\u839e\u7006\uc3e3\u446c(\u3bc9\u36d3\u4ab3\u8258\u6c52::\u7330\u0c95\u5f50\uc229\u8cae, var_5_83B:\u3bc9\u36d3\u4ab3\u8258\u6c52), loadelement:String(getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), and:int(ldc:int(106), ldc:int(5704)))))
                        }
                    }
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(4)), ldc:int(0))) {
                            var_2_852 = and:int(var_2_852:int, ldc:int(247483115))
                            invokespecial:void(\ube23\uf9c5\u8350\u62da\ub32d::\ud36e\u3711\uc87f\ucef1\ud12e, this:\ube23\uf9c5\u8350\u62da\ub32d)
                            
                            if (cmpne:boolean(sub:float(invokevirtual:float(\u8df4\ubff1\u759a\u4c2b\u8308::\ud36e\uc7fe\u494c\u416d\uc3e3, p0:\u8df4\ubff1\u759a\u4c2b\u8308), getfield:float(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u7d52\u8709\ubefe\u7af6\u0b8e\ua61f, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b)))), ldc:float(0.0f))) {
                                putfield:float(\u5245\u8cae\ub102\u4c04\u983f::\ud171\u3dd3\ud171\ud523\u8bb0, getfield:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\ub1b9\u960f\u3a62\ua6bd\u9255, this:\ube23\uf9c5\u8350\u62da\ub32d), invokevirtual:float(\u8df4\ubff1\u759a\u4c2b\u8308::\ud36e\uc7fe\u494c\u416d\uc3e3, p0:\u8df4\ubff1\u759a\u4c2b\u8308))
                                putfield:float(\u5245\u8cae\ub102\u4c04\u983f::\uf9c5\ud158\u7330\u9255\u9937, getfield:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\ub1b9\u960f\u3a62\ua6bd\u9255, this:\ube23\uf9c5\u8350\u62da\ub32d), invokevirtual:float(\u8df4\ubff1\u759a\u4c2b\u8308::\u983f\u760c\ub19c\u8cae\u34df, p0:\u8df4\ubff1\u759a\u4c2b\u8308))
                            }
                        }
                        
                        if (cmpne:boolean(and:int(var_2_852:int, ldc:int(64)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        var_2_852 = and:int(var_2_852:int, ldc:int(1073937052))
                    }
                    
                    var_2_8C2 = and:int(var_2_852:int, ldc:int(1055058926))
                    invokevirtual:void(\u8df4\ubff1\u759a\u4c2b\u8308::\u6b5f\u0800\u7bad\u960f\u99f7, p0:\u8df4\ubff1\u759a\u4c2b\u8308, getfield:float(\u5245\u8cae\ub102\u4c04\u983f::\ud171\u3dd3\ud171\ud523\u8bb0, getfield:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\ub1b9\u960f\u3a62\ua6bd\u9255, this:\ube23\uf9c5\u8350\u62da\ub32d)))
                    invokevirtual:void(\u8df4\ubff1\u759a\u4c2b\u8308::\u965f\u120d\ub1b9\u36d3\ub171, p0:\u8df4\ubff1\u759a\u4c2b\u8308, getfield:float(\u5245\u8cae\ub102\u4c04\u983f::\uf9c5\ud158\u7330\u9255\u9937, getfield:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\ub1b9\u960f\u3a62\ua6bd\u9255, this:\ube23\uf9c5\u8350\u62da\ub32d)))
                    var_6_8A2 = invokevirtual:boolean(\u4e72\ua6bd\u927d\uc238\ub8be::\u59ec\ubb2b\u40a9\u74b1\u6b0d, getfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ube23\uf9c5\u8350\u62da\ub32d::\u8c8a\u7ce1\u6b5f\u71ae\u6cfe, this:\ube23\uf9c5\u8350\u62da\ub32d), getfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\u0c95\u34df\u71f1\u56bd\u4f52, this:\ube23\uf9c5\u8350\u62da\ub32d))
                    
                    if (cmpge:boolean(f2d:double(invokevirtual:float(\ua3b4\u8aa5\ub113\ubf56\u873d::\u494c\u56bd\ua6bd\u8709\u99f7\ub1b9, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\ua3b4\u8aa5\ub113\ubf56\u873d](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b)))), ldc:double(1.26))) {
                        if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u7bad\u71ae\ua61f\ub102\u8413, this:\ube23\uf9c5\u8350\u62da\ub32d[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), xor:int(ldc:int(3267), ldc:int(3319))))) {
                            goto(Label_2397)
                        }
                    }
                    
                    Label_2229:
                    
                    if (cmpeq:boolean(and:int(var_2_8C2:int, ldc:int(4)), ldc:int(0))) {
                        var_2_999 = and:int(var_2_8C2:int, ldc:int(1770681055))
                        stack_98C_0 = ldc:float(1.0f)
                        goto(Label_2444)
                    }
                    
                    var_2_8C2 = and:int(var_2_8C2:int, ldc:int(438913050))
                    Label_2397:
                    
                    if (cmpne:boolean(and:int(var_2_8C2:int, ldc:int(4096)), ldc:int(0))) {
                        var_2_8C2 = and:int(var_2_8C2:int, ldc:int(499446896))
                        goto(Label_2229)
                    }
                    
                    var_2_999 = and:int(var_2_8C2:int, ldc:int(1908885495))
                    stack_98C_0 = invokevirtual:float(\ua3b4\u8aa5\ub113\ubf56\u873d::\ubb2b\u9af2\ub171\u3a62\u8640\u67d0, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\ua3b4\u8aa5\ub113\ubf56\u873d](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b)), ldc:float(0.0f))
                    Label_2444:
                    var_7_98C = stack_98C_0:float
                    
                    if (cmpeq:boolean(getstatic:int(\ube23\uf9c5\u8350\u62da\ub32d::\u8413\uc3e3\u3711\ubff1\u1833), ldc:int(0))) {
                        if (var_6_8A2:boolean) {
                            if (cmpge:boolean(var_7_98C:float, ldc:float(1.0f))) {
                                stack_9CF_0 = xor:int(ldc:int(2050), ldc:int(2051))
                                goto(Label_2505)
                            }
                        }
                    }
                    
                    var_2_999 = and:int(var_2_999:int, ldc:int(-1295187237))
                    stack_9CF_0 = and:int(ldc:int(10947), ldc:int(-10948))
                    Label_2505:
                    var_2_9CE = and:int(var_2_999:int, ldc:int(-1848577301))
                    var_8_9CF = stack_9CF_0:int
                    
                    if (var_6_8A2:boolean) {
                        invokevirtual:void(\u4e72\ua6bd\u927d\uc238\ub8be::\u0800\ud51e\u64f2\u647c\u3a62, getfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ube23\uf9c5\u8350\u62da\ub32d::\u8c8a\u7ce1\u6b5f\u71ae\u6cfe, this:\ube23\uf9c5\u8350\u62da\ub32d))
                    }
                    
                    loop {
                        if (cmpne:boolean(and:int(var_2_9CE:int, ldc:int(4096)), ldc:int(0))) {
                            var_2_A59 = and:int(var_2_9CE:int, ldc:int(-1421392015))
                        }
                        else {
                            var_2_A59 = and:int(var_2_9CE:int, ldc:int(-1312917557))
                            
                            if (cmpne:boolean(var_8_9CF:int, ldc:int(0))) {
                                var_9_A2E = initobject:\u8753\u446c\u93a2\u071d\uc3e3(\u8753\u446c\u93a2\u071d\uc3e3::<init>, this:\ube23\uf9c5\u8350\u62da\ub32d, var_4_82A:float)
                                
                                if (logicalnot:boolean(invokevirtual:boolean(String::equals, invokevirtual:String(\ud158\u839e\u7006\uc3e3\u446c::\u5140\u8bb0\uc84e\u4179\ubcb0, this:\ube23\uf9c5\u8350\u62da\ub32d[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), and:int(ldc:int(1043), ldc:int(19)))), loadelement:String[expected:Object](getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), and:int(ldc:int(28693), ldc:int(791)))))) {
                                    var_2_A59 = and:int(var_2_A59:int, ldc:int(-186940458))
                                    invokevirtual:void(\u8df4\ubff1\u759a\u4c2b\u8308::\u62da\ucb79\u62da\u0800\u61a4, p0:\u8df4\ubff1\u759a\u4c2b\u8308, var_9_A2E:\u8753\u446c\u93a2\u071d\uc3e3[expected:Runnable])
                                }
                                else {
                                    invokeinterface:void(Runnable::run, var_9_A2E:\u8753\u446c\u93a2\u071d\uc3e3[expected:Runnable])
                                }
                                
                                var_2_A59 = and:int(var_2_A59:int, ldc:int(-1535062029))
                                putfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\u0c95\u34df\u71f1\u56bd\u4f52, this:\ube23\uf9c5\u8350\u62da\ub32d, and:int(ldc:int(-28487), ldc:int(27206)))
                            }
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_A59:int, ldc:int(2048)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        var_2_9CE = and:int(var_2_A59:int, ldc:int(-1054406231))
                    }
                    
                    var_2_852 = and:int(var_2_A59:int, ldc:int(1358610158))
                    
                    if (cmpgt:boolean(getstatic:int(\ube23\uf9c5\u8350\u62da\ub32d::\u8413\uc3e3\u3711\ubff1\u1833), ldc:int(0))) {
                        putstatic:int(\ube23\uf9c5\u8350\u62da\ub32d::\u8413\uc3e3\u3711\ubff1\u1833, sub:int(getstatic:int(\ube23\uf9c5\u8350\u62da\ub32d::\u8413\uc3e3\u3711\ubff1\u1833), xor:int(ldc:int(-28414), ldc:int(-28413))))
                    }
                }
            }
        }
        
        Label_1138:
        
        if (cmpne:boolean(and:int(var_2_852:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_1849)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(2)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(-2022036391))
            goto(Label_1670)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(512)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(483854638))
        }
        else {
            if (cmpne:boolean(and:int(var_2_852:int, ldc:int(4096)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(653277435))
                goto(Label_0996)
            }
            
            if (cmpne:boolean(and:int(var_2_852:int, ldc:int(2048)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(447204335))
                goto(Label_0840)
            }
            
            if (cmpne:boolean(and:int(var_2_852:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0663)
            }
            
            if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0508)
            }
            
            if (cmpne:boolean(and:int(var_2_852:int, ldc:int(268435456)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(1704959183))
                goto(Label_0370)
            }
            
            if (cmpne:boolean(and:int(var_2_852:int, ldc:int(4)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(1218650294))
                goto(Label_0232)
            }
            
            if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(2)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(-746807362))
                goto(Label_0105)
            }
            
            return:void()
        }
        
        Label_1321:
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(128)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(-1230702092))
            goto(Label_1849)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(8388608)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(-1044968310))
        }
        else {
            if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(2147483647)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(-1868530267))
                goto(Label_1138)
            }
            
            if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(8388608)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(-914161108))
                goto(Label_0996)
            }
            
            if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(128)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(-380459787))
                goto(Label_0840)
            }
            
            if (cmpne:boolean(and:int(var_2_852:int, ldc:int(268435456)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(1555462335))
                goto(Label_0663)
            }
            
            if (cmpne:boolean(and:int(var_2_852:int, ldc:int(4096)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(-416319944))
                goto(Label_0508)
            }
            
            if (cmpne:boolean(and:int(var_2_852:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0370)
            }
            
            if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(8388608)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(-829416720))
                goto(Label_0232)
            }
            
            if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(268435456)), ldc:int(0))) {
                return:void()
            }
            
            goto(Label_0105)
        }
        
        Label_1670:
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(2)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(836088548))
        }
        else {
            if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_1321)
            }
            
            if (cmpne:boolean(and:int(var_2_852:int, ldc:int(268435456)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(-973330585))
                goto(Label_1138)
            }
            
            if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0996)
            }
            
            if (cmpne:boolean(and:int(var_2_852:int, ldc:int(4096)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(-2084941265))
                goto(Label_0840)
            }
            
            if (cmpne:boolean(and:int(var_2_852:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0663)
            }
            
            if (cmpne:boolean(and:int(var_2_852:int, ldc:int(268435456)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(-827426562))
                goto(Label_0508)
            }
            
            if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0370)
            }
            
            if (cmpne:boolean(and:int(var_2_852:int, ldc:int(4096)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(1771695771))
                goto(Label_0232)
            }
            
            if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(1024)), ldc:int(0))) {
                var_2_852 = and:int(var_2_852:int, ldc:int(-1165399081))
                invokevirtual:void(\u4e72\ua6bd\u927d\uc238\ub8be::\uae5d\ub1b9\u7873\u47c2\ub102, getfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ube23\uf9c5\u8350\u62da\ub32d::\u8c8a\u7ce1\u6b5f\u71ae\u6cfe, this:\ube23\uf9c5\u8350\u62da\ub32d), and:int[expected:boolean](ldc:int(-14118), ldc:int(14113)))
                goto(Label_0840)
            }
            
            goto(Label_0105)
        }
        
        Label_1849:
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(64)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(-1543861409))
            goto(Label_1670)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_1321)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(2147483647)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(574217946))
            goto(Label_1138)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(8388608)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(-93946484))
            goto(Label_0996)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_0840)
        }
        
        if (cmpne:boolean(and:int(var_2_852:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0663)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(128)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(605017612))
            goto(Label_0508)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0370)
        }
        
        if (cmpne:boolean(and:int(var_2_852:int, ldc:int(268435456)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(-1538111226))
            goto(Label_0232)
        }
        
        if (cmpeq:boolean(and:int(var_2_852:int, ldc:int(128)), ldc:int(0))) {
            var_2_852 = and:int(var_2_852:int, ldc:int(-1595335850))
            goto(Label_0105)
        }
        
        var_2_852 = and:int(var_2_852:int, ldc:int(-1565975858))
        putfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\uc2e8\ud51e\u8350\u69d9\u965f, this:\ube23\uf9c5\u8350\u62da\ub32d, sub:int(getfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\uc2e8\ud51e\u8350\u69d9\u965f, this:\ube23\uf9c5\u8350\u62da\ub32d), and:int(ldc:int(16641), ldc:int(6293))))
        goto(Label_0996)
    }
    
    public void \u8308\ud171\u5654\ud217\u4cd9(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u647c\u8389\u92ee\u9033\uc31c p0) {
        var_4_D4 : float
        var_5_F7 : float
        
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
            
            if (cmpne:boolean(getstatic:\u8640\ud7e8\u8308\u4bc8\uc29a(\ube23\uf9c5\u8350\u62da\ub32d::\ub83f\u6c52\u12cb\u3c25\u3776), aconstnull:\u8640\ud7e8\u8308\u4bc8\uc29a())) {
                if (logicalnot:boolean(invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u7bad\u71ae\ua61f\ub102\u8413, this:\ube23\uf9c5\u8350\u62da\ub32d[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), xor:int(ldc:int(136), ldc:int(181)))))) {
                    if (logicalnot:boolean(invokevirtual:boolean(String::equals, invokevirtual:String(\ud158\u839e\u7006\uc3e3\u446c::\u5140\u8bb0\uc84e\u4179\ubcb0, this:\ube23\uf9c5\u8350\u62da\ub32d[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), xor:int(ldc:int(-32569), ldc:int(-32560)))), loadelement:String[expected:Object](getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), and:int(ldc:int(2312), ldc:int(9)))))) {
                        var_4_D4 = invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u9255\uae87\u7330\u8308\u88c5\u965f, add:float(getfield:float(\u5245\u8cae\ub102\u4c04\u983f::\ud171\u3dd3\ud171\ud523\u8bb0, getfield:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\u183a\ub18d\u3504\ubff1\u4cd9, this:\ube23\uf9c5\u8350\u62da\ub32d)), mul:float(sub:float(getfield:float(\u5245\u8cae\ub102\u4c04\u983f::\ud171\u3dd3\ud171\ud523\u8bb0, getfield:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\ub1b9\u960f\u3a62\ua6bd\u9255, this:\ube23\uf9c5\u8350\u62da\ub32d)), getfield:float(\u5245\u8cae\ub102\u4c04\u983f::\ud171\u3dd3\ud171\ud523\u8bb0, getfield:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\u183a\ub18d\u3504\ubff1\u4cd9, this:\ube23\uf9c5\u8350\u62da\ub32d))), invokevirtual:float(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubcb0\uff55\u9937\u3d64\u8c8a\u8cae, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b)))))
                        var_5_F7 = invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u9255\uae87\u7330\u8308\u88c5\u965f, add:float(getfield:float(\u5245\u8cae\ub102\u4c04\u983f::\uf9c5\ud158\u7330\u9255\u9937, getfield:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\u183a\ub18d\u3504\ubff1\u4cd9, this:\ube23\uf9c5\u8350\u62da\ub32d)), mul:float(sub:float(getfield:float(\u5245\u8cae\ub102\u4c04\u983f::\uf9c5\ud158\u7330\u9255\u9937, getfield:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\ub1b9\u960f\u3a62\ua6bd\u9255, this:\ube23\uf9c5\u8350\u62da\ub32d)), getfield:float(\u5245\u8cae\ub102\u4c04\u983f::\uf9c5\ud158\u7330\u9255\u9937, getfield:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\u183a\ub18d\u3504\ubff1\u4cd9, this:\ube23\uf9c5\u8350\u62da\ub32d))), invokevirtual:float(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubcb0\uff55\u9937\u3d64\u8c8a\u8cae, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b)))))
                        putfield:float(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u7d52\u8709\ubefe\u7af6\u0b8e\ua61f, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b)), var_4_D4:float)
                        putfield:float(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u4d85\u71ae\u494c\u839e\uf9c5\u93a2, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b)), var_5_F7:float)
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8308\ud171\u5654\ud217\u4cd9(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ufe34\u40a9\ub6ab\u5fe1\u7330 p0) {
        var_2_B0 : int
        var_4_80 : Iterator<Entry<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>>
        var_2_118 : int
        var_5_D6 : Entry<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>
        var_6_E1 : Iterator<\u8640\ud7e8\u8308\u4bc8\uc29a>
        var_2_216 : int
        var_5_C3 : Iterator<\u8640\ud7e8\u8308\u4bc8\uc29a>
        var_6_1DC : \u8640\ud7e8\u8308\u4bc8\uc29a
        var_5_1C9 : Iterator<Entry<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>>
        
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
            var_2_B0 = and:int(ldc:int(-1243330607), ldc:int(-17829982))
            
            if (cmpne:boolean(getfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d), aconstnull:List<\u8640\ud7e8\u8308\u4bc8\uc29a>())) {
                var_4_80 = invokeinterface:Iterator<Entry<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>>(Set<Entry<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>>::iterator, invokevirtual:Set<Entry<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>>(HashMap<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>::entrySet, getfield:HashMap<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>(\ube23\uf9c5\u8350\u62da\ub32d::\u3776\u527a\ua61f\u8df4\u2dcc, this:\ube23\uf9c5\u8350\u62da\ub32d)))
                
                loop {
                    if (cmpne:boolean(and:int(var_2_B0:int, ldc:int(8)), ldc:int(0))) {
                        var_2_118 = and:int(var_2_B0:int, ldc:int(-741901353))
                    }
                    else {
                        var_2_118 = and:int(var_2_B0:int, ldc:int(-1209696374))
                        
                        if (invokeinterface:boolean(Iterator<E>::hasNext, var_4_80:Iterator)) {
                            var_5_D6 = checkcast:Entry<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>(java.util.Map.Entry<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u8d98\ua068\u4492\u9af2\u5f50>.class, invokeinterface:Entry<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>(Iterator<Entry<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>>::next, var_4_80:Iterator<Entry<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>>))
                            var_6_E1 = invokeinterface:Iterator<\u8640\ud7e8\u8308\u4bc8\uc29a>(List<\u8640\ud7e8\u8308\u4bc8\uc29a>::iterator, getfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d))
                            
                            loop {
                                if (cmpne:boolean(and:int(var_2_118:int, ldc:int(8192)), ldc:int(0))) {
                                    goto(Label_0315)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_118:int, ldc:int(1024)), ldc:int(0))) {
                                    var_2_118 = and:int(var_2_118:int, ldc:int(-1661149211))
                                    
                                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_6_E1:Iterator<\u8640\ud7e8\u8308\u4bc8\uc29a>)) {
                                        if (logicalnot:boolean(invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::equals, checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(Entry<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>::getKey, var_5_D6:Entry<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>)), invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8640\ud7e8\u8308\u4bc8\uc29a::\u51b2\u6fb0\ub102\u7006\u873d, checkcast:\u8640\ud7e8\u8308\u4bc8\uc29a(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8640\ud7e8\u8308\u4bc8\uc29a.class, invokeinterface:\u8640\ud7e8\u8308\u4bc8\uc29a(Iterator<\u8640\ud7e8\u8308\u4bc8\uc29a>::next, var_6_E1:Iterator<\u8640\ud7e8\u8308\u4bc8\uc29a>)))))) {
                                            var_2_118 = and:int(var_2_118:int, ldc:int(-136478723))
                                            loopcontinue()
                                        }
                                        
                                        loopcontinue()
                                    }
                                }
                                
                                Label_0259:
                                
                                if (cmpne:boolean(and:int(var_2_118:int, ldc:int(16384)), ldc:int(0))) {
                                    if (cmpne:boolean(and:int(var_2_118:int, ldc:int(1073741824)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_2_118 = and:int(var_2_118:int, ldc:int(-1208104972))
                                    invokevirtual:void(\u8d98\ua068\u4492\u9af2\u5f50::\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56, checkcast:\u8d98\ua068\u4492\u9af2\u5f50(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u8d98\ua068\u4492\u9af2\u5f50.class, invokeinterface:\u8d98\ua068\u4492\u9af2\u5f50(Entry<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>::getValue, var_5_D6:Entry<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>)), getstatic:\u3711\u71f1\u7006\u92ee\ucef1(\u3711\u71f1\u7006\u92ee\ucef1::\u7049\u16f6\u8389\u392e\u5140))
                                    
                                    if (cmpeq:boolean(invokevirtual:float(\u8d98\ua068\u4492\u9af2\u5f50::\u34df\ubefe\uc2bd\u8308\u8d90\uc3e3, checkcast:\u8d98\ua068\u4492\u9af2\u5f50(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u8d98\ua068\u4492\u9af2\u5f50.class, invokeinterface:\u8d98\ua068\u4492\u9af2\u5f50(Entry<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>::getValue, var_5_D6:Entry<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>))), ldc:float(0.0f))) {
                                        invokeinterface:void(Iterator::remove, var_4_80:Iterator)
                                    }
                                }
                                
                                Label_0315:
                                
                                if (cmpeq:boolean(and:int(var_2_118:int, ldc:int(256)), ldc:int(0))) {
                                    var_2_118 = and:int(var_2_118:int, ldc:int(-36578106))
                                    goto(Label_0259)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_118:int, ldc:int(1024)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                                
                                var_2_118 = and:int(var_2_118:int, ldc:int(1471390252))
                            }
                            
                            var_2_B0 = and:int(var_2_118:int, ldc:int(-17344637))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_2_118:int, ldc:int(268435456)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_2_B0 = and:int(var_2_118:int, ldc:int(-2069140869))
                }
                
                var_2_216 = and:int(var_2_118:int, ldc:int(-1764958289))
                var_5_C3 = invokeinterface:Iterator<\u8640\ud7e8\u8308\u4bc8\uc29a>(List<\u8640\ud7e8\u8308\u4bc8\uc29a>::iterator, getfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d))
                
                while (invokeinterface:boolean(Iterator<E>::hasNext, var_5_C3:Iterator<\u8640\ud7e8\u8308\u4bc8\uc29a>)) {
                    var_6_1DC = checkcast:\u8640\ud7e8\u8308\u4bc8\uc29a(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8640\ud7e8\u8308\u4bc8\uc29a.class, invokeinterface:\u8640\ud7e8\u8308\u4bc8\uc29a(Iterator<\u8640\ud7e8\u8308\u4bc8\uc29a>::next, var_5_C3:Iterator<\u8640\ud7e8\u8308\u4bc8\uc29a>))
                    
                    if (cmpne:boolean(var_6_1DC:\u8640\ud7e8\u8308\u4bc8\uc29a, aconstnull:\u8640\ud7e8\u8308\u4bc8\uc29a())) {
                        loop {
                            if (cmpne:boolean(and:int(var_2_216:int, ldc:int(128)), ldc:int(0))) {
                                var_2_216 = and:int(var_2_216:int, ldc:int(-691253345))
                                
                                if (invokevirtual:boolean(HashMap<K, V>::containsKey, getfield:HashMap<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>(\ube23\uf9c5\u8350\u62da\ub32d::\u3776\u527a\ua61f\u8df4\u2dcc, this:\ube23\uf9c5\u8350\u62da\ub32d), invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8640\ud7e8\u8308\u4bc8\uc29a::\u51b2\u6fb0\ub102\u7006\u873d, var_6_1DC:\u8640\ud7e8\u8308\u4bc8\uc29a))) {
                                    invokevirtual:void(\u8d98\ua068\u4492\u9af2\u5f50::\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56, checkcast:\u8d98\ua068\u4492\u9af2\u5f50(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u8d98\ua068\u4492\u9af2\u5f50.class, invokevirtual:\u8d98\ua068\u4492\u9af2\u5f50(HashMap<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>::get, getfield:HashMap<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>(\ube23\uf9c5\u8350\u62da\ub32d::\u3776\u527a\ua61f\u8df4\u2dcc, this:\ube23\uf9c5\u8350\u62da\ub32d), invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8640\ud7e8\u8308\u4bc8\uc29a::\u51b2\u6fb0\ub102\u7006\u873d, var_6_1DC:\u8640\ud7e8\u8308\u4bc8\uc29a))), getstatic:\u3711\u71f1\u7006\u92ee\ucef1(\u3711\u71f1\u7006\u92ee\ucef1::\uf9c5\u5140\ud158\u4492\u3dd3))
                                    looporswitchbreak()
                                }
                            }
                            
                            if (cmpne:boolean(and:int(var_2_216:int, ldc:int(67108864)), ldc:int(0))) {
                                var_2_216 = and:int(var_2_216:int, ldc:int(-557029422))
                                invokevirtual:\u8d98\ua068\u4492\u9af2\u5f50(HashMap<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>::put, getfield:HashMap<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>(\ube23\uf9c5\u8350\u62da\ub32d::\u3776\u527a\ua61f\u8df4\u2dcc, this:\ube23\uf9c5\u8350\u62da\ub32d), invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8640\ud7e8\u8308\u4bc8\uc29a::\u51b2\u6fb0\ub102\u7006\u873d, var_6_1DC:\u8640\ud7e8\u8308\u4bc8\uc29a), initobject:\u8d98\ua068\u4492\u9af2\u5f50(\u8d98\ua068\u4492\u9af2\u5f50::<init>, xor:int(ldc:int(4506), ldc:int(4448)), and:int(ldc:int(506), ldc:int(17150))))
                                looporswitchbreak()
                            }
                            
                            var_2_216 = and:int(var_2_216:int, ldc:int(-1712572330))
                        }
                        
                        var_2_216 = and:int(var_2_216:int, ldc:int(-1245292612))
                    }
                }
                
                var_2_B0 = and:int(var_2_216:int, ldc:int(-1628471366))
                var_5_1C9 = invokeinterface:Iterator<Entry<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>>(Set<Entry<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>>::iterator, invokevirtual:Set<Entry<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>>(HashMap<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>::entrySet, getfield:HashMap<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>(\ube23\uf9c5\u8350\u62da\ub32d::\u3776\u527a\ua61f\u8df4\u2dcc, this:\ube23\uf9c5\u8350\u62da\ub32d)))
                
                while (invokeinterface:boolean(Iterator<E>::hasNext, var_5_1C9:Iterator<Entry<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>>)) {
                    invokevirtual:void(\ube23\uf9c5\u8350\u62da\ub32d::\u47c2\uceb8\u8389\u3bd6\uf9c5, this:\ube23\uf9c5\u8350\u62da\ub32d, checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(Entry<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>::getKey, checkcast:Entry<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>(java.util.Map.Entry<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u8d98\ua068\u4492\u9af2\u5f50>.class, invokeinterface:Entry<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>(Iterator<Entry<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>>::next, var_5_1C9:Iterator<Entry<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>>)))))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4c04\u9255\u8cae\u12b2\ud217(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u4cd9\ubff1\ub18d\u99f7\u97e6 p0) {
        var_2_DB : int
        var_4_66 : \u946b\u6d99\u8df4\u12cb\u5d20
        var_5_A7 : \u67e9\ud217\u5f50\u446c\u760c
        var_6_F4 : Iterator<Entry<\u7d52\u718f\u3776\u6fb0\ub83f, List<\u416d\u183a\u071d\ud171\u5bc4<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, Long>>>>
        var_7_13D : Entry<\u7d52\u718f\u3776\u6fb0\ub83f, List<\u416d\u183a\u071d\ud171\u5bc4<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, Long>>>
        var_8_149 : \u7d52\u718f\u3776\u6fb0\ub83f
        var_9_155 : List<\u416d\u183a\u071d\ud171\u5bc4<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, Long>>
        var_5_1A4 : \u8640\u3bd6\uafe7\u3d64\u52d3
        
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
        var_2_DB = and:int(ldc:int(-180723787), ldc:int(1446475701))
        var_4_66 = invokevirtual:\u946b\u6d99\u8df4\u12cb\u5d20(\u4cd9\ubff1\ub18d\u99f7\u97e6::\u4cd9\ubff1\ub18d\u99f7\u97e6, p0:\u4cd9\ubff1\ub18d\u99f7\u97e6)
        
        if (instanceof:boolean(\u47c2\u2dcc\u12cb\ud171\u8c8a.\u67e9\ud217\u5f50\u446c\u760c.class, var_4_66:\u946b\u6d99\u8df4\u12cb\u5d20)) {
            var_5_A7 = checkcast:\u67e9\ud217\u5f50\u446c\u760c(\u47c2\u2dcc\u12cb\ud171\u8c8a.\u67e9\ud217\u5f50\u446c\u760c.class, var_4_66:\u67e9\ud217\u5f50\u446c\u760c)
            
            if (invokevirtual:boolean(\u67e9\ud217\u5f50\u446c\u760c::\u5db4\uc910\u7006\ucb79\u51fa\u34df, var_5_A7:\u67e9\ud217\u5f50\u446c\u760c)) {
                if (cmpne:boolean(getfield:short(\u67e9\ud217\u5f50\u446c\u760c::\ub19c\ud12e\u4f52\u3711\uc84e\u5fe1, var_5_A7:\u67e9\ud217\u5f50\u446c\u760c), ldc:short(0))) {
                    goto(Label_0206)
                }
                
                if (cmpne:boolean(getfield:short(\u67e9\ud217\u5f50\u446c\u760c::\u0800\u4daf\ud523\ud36e\u97b7\u839e, var_5_A7:\u67e9\ud217\u5f50\u446c\u760c), ldc:short(0))) {
                    goto(Label_0206)
                }
                
                if (cmpne:boolean(getfield:short(\u67e9\ud217\u5f50\u446c\u760c::\ubff1\u6198\u6cfe\ub102\u839e\uafe7, var_5_A7:\u67e9\ud217\u5f50\u446c\u760c), ldc:short(0))) {
                    goto(Label_0206)
                }
            }
            
            Label_0177:
            
            if (cmpne:boolean(and:int(var_2_DB:int, ldc:int(16)), ldc:int(0))) {
                var_2_DB = and:int(var_2_DB:int, ldc:int(1412422655))
                goto(Label_0134)
            }
            
            Label_0206:
            
            if (cmpeq:boolean(and:int(var_2_DB:int, ldc:int(131072)), ldc:int(0))) {
                var_2_DB = and:int(var_2_DB:int, ldc:int(-1936024418))
                goto(Label_0177)
            }
            
            var_2_DB = and:int(var_2_DB:int, ldc:int(-63774721))
            var_6_F4 = invokeinterface:Iterator<Entry<\u7d52\u718f\u3776\u6fb0\ub83f, List<\u416d\u183a\u071d\ud171\u5bc4<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, Long>>>>(Set<Entry<\u7d52\u718f\u3776\u6fb0\ub83f, List<\u416d\u183a\u071d\ud171\u5bc4<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, Long>>>>::iterator, invokevirtual:Set<Entry<\u7d52\u718f\u3776\u6fb0\ub83f, List<\u416d\u183a\u071d\ud171\u5bc4<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, Long>>>>(HashMap<\u7d52\u718f\u3776\u6fb0\ub83f, List<\u416d\u183a\u071d\ud171\u5bc4<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, Long>>>::entrySet, getfield:HashMap<\u7d52\u718f\u3776\u6fb0\ub83f, List<\u416d\u183a\u071d\ud171\u5bc4<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, Long>>>(\u4e72\ua6bd\u927d\uc238\ub8be::\u8413\u5140\u64f2\uc9f6\u9937, getfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ube23\uf9c5\u8350\u62da\ub32d::\u8c8a\u7ce1\u6b5f\u71ae\u6cfe, this:\ube23\uf9c5\u8350\u62da\ub32d))))
            
            while (invokeinterface:boolean(Iterator::hasNext, var_6_F4:Iterator)) {
                var_7_13D = checkcast:Entry<\u7d52\u718f\u3776\u6fb0\ub83f, List<\u416d\u183a\u071d\ud171\u5bc4<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, Long>>>(java.util.Map.Entry<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f, java.util.List<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u416d\u183a\u071d\ud171\u5bc4<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, java.lang.Long>>>.class, invokeinterface:Entry<\u7d52\u718f\u3776\u6fb0\ub83f, List<\u416d\u183a\u071d\ud171\u5bc4<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, Long>>>(Iterator<Entry<\u7d52\u718f\u3776\u6fb0\ub83f, List<\u416d\u183a\u071d\ud171\u5bc4<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, Long>>>>::next, var_6_F4:Iterator<Entry<\u7d52\u718f\u3776\u6fb0\ub83f, List<\u416d\u183a\u071d\ud171\u5bc4<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, Long>>>>))
                var_8_149 = checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(Entry<\u7d52\u718f\u3776\u6fb0\ub83f, List<\u416d\u183a\u071d\ud171\u5bc4<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, Long>>>::getKey, var_7_13D:Entry<\u7d52\u718f\u3776\u6fb0\ub83f, List<\u416d\u183a\u071d\ud171\u5bc4<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, Long>>>))
                var_9_155 = checkcast:List<\u416d\u183a\u071d\ud171\u5bc4<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, Long>>(java.util.List<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u416d\u183a\u071d\ud171\u5bc4<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, java.lang.Long>>.class, invokeinterface:List<\u416d\u183a\u071d\ud171\u5bc4<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, Long>>(Entry<\u7d52\u718f\u3776\u6fb0\ub83f, List<\u416d\u183a\u071d\ud171\u5bc4<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, Long>>>::getValue, var_7_13D:Entry<\u7d52\u718f\u3776\u6fb0\ub83f, List<\u416d\u183a\u071d\ud171\u5bc4<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, Long>>>))
                
                if (cmpeq:boolean(invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u67e9\ud217\u5f50\u446c\u760c::\u8aa5\u4c04\u392e\u071d\u7330\ucfaf, var_5_A7:\u67e9\ud217\u5f50\u446c\u760c, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b))), var_8_149:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                    invokeinterface:boolean(List<\u416d\u183a\u071d\ud171\u5bc4<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, Long>>::add, var_9_155:List<\u416d\u183a\u071d\ud171\u5bc4<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, Long>>, initobject:\u416d\u183a\u071d\ud171\u5bc4<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, Long>(\u416d\u183a\u071d\ud171\u5bc4<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, Long>::<init>, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u76bc\uc229\u3d64\ud12e\u385b\ud158, getfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u9937\ub19c\u946b\u5140\ua3b4\ub7dc, var_8_149:\u7d52\u718f\u3776\u6fb0\ub83f), ldc:double(2.44140625E-4)), invokestatic:Long(Long::valueOf, invokestatic:long(System::currentTimeMillis))))
                }
                
                var_2_DB = and:int(var_2_DB:int, ldc:int(2099928061))
            }
            
            goto(Label_0177)
        }
        
        Label_0112:
        
        if (cmpne:boolean(and:int(var_2_DB:int, ldc:int(256)), ldc:int(0))) {
            var_2_DB = and:int(var_2_DB:int, ldc:int(-545259585))
            
            if (instanceof:boolean(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u8640\u3bd6\uafe7\u3d64\u52d3.class, var_4_66:\u67e9\ud217\u5f50\u446c\u760c[expected:\u946b\u6d99\u8df4\u12cb\u5d20])) {
                var_5_1A4 = checkcast:\u8640\u3bd6\uafe7\u3d64\u52d3(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u8640\u3bd6\uafe7\u3d64\u52d3.class, var_4_66:\u8640\u3bd6\uafe7\u3d64\u52d3)
                
                if (cmpeq:boolean(invokevirtual:byte(\u8640\u3bd6\uafe7\u3d64\u52d3::\u67d0\u64ab\u8640\u7873\uc2e8\u4cd9, var_5_1A4:\u8640\u3bd6\uafe7\u3d64\u52d3), xor:int(ldc:int(8448), ldc:int(8451)))) {
                    if (invokevirtual:boolean(HashMap<K, V>::containsKey, getfield:HashMap<\u7d52\u718f\u3776\u6fb0\ub83f, List<\u416d\u183a\u071d\ud171\u5bc4<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, Long>>>(\u4e72\ua6bd\u927d\uc238\ub8be::\u8413\u5140\u64f2\uc9f6\u9937, getfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ube23\uf9c5\u8350\u62da\ub32d::\u8c8a\u7ce1\u6b5f\u71ae\u6cfe, this:\ube23\uf9c5\u8350\u62da\ub32d)), invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8640\u3bd6\uafe7\u3d64\u52d3::\u946b\u34df\u88c5\ua562\u51fa\u3bd6, var_5_1A4:\u8640\u3bd6\uafe7\u3d64\u52d3, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b))))) {
                        invokevirtual:List<\u416d\u183a\u071d\ud171\u5bc4<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, Long>>(HashMap<\u7d52\u718f\u3776\u6fb0\ub83f, List<\u416d\u183a\u071d\ud171\u5bc4<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, Long>>>::remove, getfield:HashMap<\u7d52\u718f\u3776\u6fb0\ub83f, List<\u416d\u183a\u071d\ud171\u5bc4<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, Long>>>(\u4e72\ua6bd\u927d\uc238\ub8be::\u8413\u5140\u64f2\uc9f6\u9937, getfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ube23\uf9c5\u8350\u62da\ub32d::\u8c8a\u7ce1\u6b5f\u71ae\u6cfe, this:\ube23\uf9c5\u8350\u62da\ub32d)), invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8640\u3bd6\uafe7\u3d64\u52d3::\u946b\u34df\u88c5\ua562\u51fa\u3bd6, var_5_1A4:\u8640\u3bd6\uafe7\u3d64\u52d3, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b))))
                    }
                }
            }
        }
        
        Label_0134:
        
        if (cmpeq:boolean(and:int(var_2_DB:int, ldc:int(131072)), ldc:int(0))) {
            var_2_DB = and:int(var_2_DB:int, ldc:int(-1478346123))
            goto(Label_0112)
        }
    }
    
    public void \u47c2\uceb8\u8389\u3bd6\uf9c5(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
        var_2_61 : int
        var_4_99 : double
        var_2_A7 : int
        var_6_13D : int
        var_7_14B : float
        stack_181_0 : int [generated]
        var_2_180 : int
        var_8_181 : int
        stack_1A7_0 : float [generated]
        var_7_1A7 : float
        var_9_1C4 : float
        
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
            var_2_61 = and:int(ldc:int(1962610966), ldc:int(2128828367))
            invokestatic:void(GL11::glPushMatrix)
            invokestatic:void(GL11::glEnable, xor:int(ldc:int(-30591), ldc:int(-31839)))
            invokestatic:void(GL11::glDisable, xor:int(ldc:int(16519), ldc:int(19814)))
            invokestatic:void(GL11::glEnable, ldc:int(32925))
            invokestatic:void(GL11::glEnable, xor:int(ldc:int(-32032), ldc:int(-30319)))
            invokestatic:void(GL11::glLineWidth, ldc:float(1.4f))
            var_4_99 = f2d:double(getfield:float(\u4c04\uae87\u56bd\u4c2b\u97e6\u7049::\ub18d\ua61f\u4179\uc29a\u759a\uc229, getfield:\u4c04\uae87\u56bd\u4c2b\u97e6\u7049(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u839e\u6b0d\uceb8\u8aa5\u98a4\ub32d, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u6b0d\u5bc4\u3504\u40a9\u7043\u98a4, p0:\u7d52\u718f\u3776\u6fb0\ub83f))) {
                var_4_99 = ldc:double(0.0)
            }
            
            var_2_A7 = and:int(var_2_61:int, ldc:int(2044421100))
            invokestatic:void(GL11::glTranslated, add:double(getfield:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u0b8e\u51b2\u4e72\u3711\u0b8e\uae5d, p0:\u7d52\u718f\u3776\u6fb0\ub83f), mul:double(sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, p0:\u7d52\u718f\u3776\u6fb0\ub83f), getfield:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u0b8e\u51b2\u4e72\u3711\u0b8e\uae5d, p0:\u7d52\u718f\u3776\u6fb0\ub83f)), var_4_99:double)), add:double(getfield:double(\u7d52\u718f\u3776\u6fb0\ub83f::\uf995\u56bd\ud171\u760c\ucfaf\u8d90, p0:\u7d52\u718f\u3776\u6fb0\ub83f), mul:double(sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, p0:\u7d52\u718f\u3776\u6fb0\ub83f), getfield:double(\u7d52\u718f\u3776\u6fb0\ub83f::\uf995\u56bd\ud171\u760c\ucfaf\u8d90, p0:\u7d52\u718f\u3776\u6fb0\ub83f)), var_4_99:double)), add:double(getfield:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u6c56\ua068\ud158\u88c5\u8d90\u67d0, p0:\u7d52\u718f\u3776\u6fb0\ub83f), mul:double(sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, p0:\u7d52\u718f\u3776\u6fb0\ub83f), getfield:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u6c56\ua068\ud158\u88c5\u8d90\u67d0, p0:\u7d52\u718f\u3776\u6fb0\ub83f)), var_4_99:double)))
            invokestatic:void(GL11::glTranslated, neg:double(invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u16f6\u392e\u4c2b\ubf56\u3e75\u960f, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b)))))), neg:double(invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\uc4d2\ud51e\u4f52\u67e9\ud12e\u71f1, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b)))))), neg:double(invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u93a2\u120d\u5fe1\u6198\u93a2\u6d99, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b)))))))
            invokestatic:void(GL11::glEnable, ldc:int(32823))
            invokestatic:void(GL11::glEnable, and:int(ldc:int(8140), ldc:int(11200)))
            invokestatic:void(GL11::glEnable, xor:int(ldc:int(17016), ldc:int(18842)))
            invokestatic:void(GL11::glAlphaFunc, xor:int(ldc:int(90), ldc:int(605)), ldc:float(0.0f))
            var_6_13D = and:int(ldc:int(1802), ldc:int(18280))
            var_7_14B = div:float(l2f:float(rem:long(invokestatic:long(System::currentTimeMillis), i2l:long(var_6_13D:int))), i2f:float(var_6_13D:int))
            
            if (cmple:boolean(var_7_14B:float, ldc:float(0.5f))) {
                var_2_A7 = and:int(var_2_A7:int, ldc:int(1559199078))
                stack_181_0 = and:int(ldc:int(-9398), ldc:int(9393))
            }
            else {
                stack_181_0 = and:int(ldc:int(17409), ldc:int(7087))
            }
            
            var_2_180 = and:int(var_2_A7:int, ldc:int(1996426612))
            var_8_181 = stack_181_0:int
            
            if (cmpeq:boolean(var_8_181:int, ldc:int(0))) {
                var_2_180 = and:int(var_2_180:int, ldc:int(2078433117))
                stack_1A7_0 = mul:float(var_7_14B:float, ldc:float(2.0f))
            }
            else {
                stack_1A7_0 = sub:float(ldc:float(1.0f), rem:float(mul:float(var_7_14B:float, ldc:float(2.0f)), ldc:float(1.0f)))
            }
            
            var_7_1A7 = stack_1A7_0:float
            invokestatic:void(GL11::glTranslatef, ldc:float(0.0f), mul:float(add:float(invokevirtual:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u7ce1\u392e\ufe34\u3a62\u4492\u3a62, p0:\u7d52\u718f\u3776\u6fb0\ub83f), ldc:float(0.4f)), var_7_1A7:float), ldc:float(0.0f))
            var_9_1C4 = d2f:float(invokestatic:double(Math::sin, mul:double(f2d:double(var_7_1A7:float), ldc:double(3.141592653589793))))
            invokevirtual:void(\ube23\uf9c5\u8350\u62da\ub32d::\u8258\u5140\ua6bd\u6bb9\u2dcc, this:\ube23\uf9c5\u8350\u62da\ub32d, var_8_181:boolean, mul:float(ldc:float(0.45f), var_9_1C4:float), ldc:float(0.6f), mul:float(ldc:float(0.35f), var_9_1C4:float), invokevirtual:float(\u8d98\ua068\u4492\u9af2\u5f50::\u34df\ubefe\uc2bd\u8308\u8d90\uc3e3, checkcast:\u8d98\ua068\u4492\u9af2\u5f50(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u8d98\ua068\u4492\u9af2\u5f50.class, invokevirtual:\u8d98\ua068\u4492\u9af2\u5f50(HashMap<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>::get, getfield:HashMap<\u7d52\u718f\u3776\u6fb0\ub83f, \u8d98\ua068\u4492\u9af2\u5f50>(\ube23\uf9c5\u8350\u62da\ub32d::\u3776\u527a\ua61f\u8df4\u2dcc, this:\ube23\uf9c5\u8350\u62da\ub32d), p0:\u7d52\u718f\u3776\u6fb0\ub83f[expected:Object]))))
            invokestatic:void(GL11::glPushMatrix)
            invokestatic:void(GL11::glTranslated, invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u16f6\u392e\u4c2b\ubf56\u3e75\u960f, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b))))), invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\uc4d2\ud51e\u4f52\u67e9\ud12e\u71f1, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b))))), invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u93a2\u120d\u5fe1\u6198\u93a2\u6d99, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b))))))
            invokestatic:void(GL11::glPopMatrix)
            invokestatic:void(GL11::glEnable, and:int(ldc:int(11745), ldc:int(4075)))
            invokestatic:void(GL11::glDisable, ldc:int(32925))
            invokestatic:void(GL11::glDisable, and:int(ldc:int(8033), ldc:int(2982)))
            invokestatic:void(GL11::glPopMatrix)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8258\u5140\ua6bd\u6bb9\u2dcc(boolean p0, float p1, float p2, float p3, float p4) {
        var_6_2BE : int
        var_8_93 : int
        var_9_AB : Color
        var_10_B7 : float
        var_11_C3 : float
        var_12_CF : float
        var_13_D8 : int
        var_14_158 : int
        var_6_1E4 : int
        var_15_188 : double
        var_17_19B : double
        stack_240_0 : float [generated]
        stack_1F1_0 : float [generated]
        stack_240_1 : float [generated]
        stack_1F1_1 : float [generated]
        stack_240_2 : float [generated]
        stack_1F1_2 : float [generated]
        stack_240_3 : float [generated]
        stack_1F1_3 : float [generated]
        var_6_2C9 : int
        var_15_2DC : double
        var_17_2EF : double
        expr_307 : double [generated]
        stack_339_2 : double [generated]
        
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
            var_6_2BE = and:int(ldc:int(2084536703), ldc:int(1727576831))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u7873\u4975\u4c2b\uc87f\ubded\u16f6, and:int(ldc:int(7623), ldc:int(7449)))
            invokestatic:void(GL11::glDisable, ldc:int(32823))
            invokestatic:void(GL11::glDisable, xor:int(ldc:int(-23072), ldc:int(-20847)))
            invokestatic:void(GL11::glBegin, and:int(ldc:int(1303), ldc:int(6181)))
            var_8_93 = f2i:int(div:float(ldc:float(360.0f), mul:float(ldc:float(40.0f), p2:float)))
            var_9_AB = initobject:Color(Color::<init>, invokevirtual:int(\ud158\u839e\u7006\uc3e3\u446c::\u4975\u92ee\u5d20\u120d\u7873, this:\ube23\uf9c5\u8350\u62da\ub32d[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), xor:int(ldc:int(2405), ldc:int(2340)))))
            var_10_B7 = div:float(i2f:float(invokevirtual:int(Color::getRed, var_9_AB:Color)), ldc:float(255.0f))
            var_11_C3 = div:float(i2f:float(invokevirtual:int(Color::getGreen, var_9_AB:Color)), ldc:float(255.0f))
            var_12_CF = div:float(i2f:float(invokevirtual:int(Color::getBlue, var_9_AB:Color)), ldc:float(255.0f))
            var_13_D8 = and:int(ldc:int(-6103), ldc:int(982))
            
            loop {
                if (cmpne:boolean(and:int(var_6_2BE:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0617)
                }
                
                if (cmpeq:boolean(and:int(var_6_2BE:int, ldc:int(1048576)), ldc:int(0))) {
                    var_6_2BE = and:int(var_6_2BE:int, ldc:int(-749065315))
                }
                else {
                    var_6_2BE = and:int(var_6_2BE:int, ldc:int(1715395546))
                    
                    if (cmple:boolean(var_13_D8:int, add:int(xor:int(ldc:int(2213), ldc:int(2509)), var_8_93:int))) {
                        var_14_158 = var_13_D8:int
                        
                        if (cmple:boolean(var_14_158:int, and:int(ldc:int(25448), ldc:int(2414)))) {
                            goto(Label_0358)
                        }
                        
                        var_14_158 = and:int(ldc:int(14020), ldc:int(-14029))
                        goto(Label_0358)
                    }
                }
                
                Label_0270:
                
                if (cmpeq:boolean(and:int(var_6_2BE:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0617)
                }
                
                if (cmpne:boolean(and:int(var_6_2BE:int, ldc:int(16777216)), ldc:int(0))) {
                    var_6_2BE = and:int(var_6_2BE:int, ldc:int(-304291007))
                    loopcontinue()
                }
                
                var_6_2BE = and:int(var_6_2BE:int, ldc:int(1732099451))
                invokestatic:void(GL11::glEnd)
                invokestatic:void(GL11::glLineWidth, ldc:float(2.2f))
                invokestatic:void(GL11::glBegin, and:int(ldc:int(13475), ldc:int(2567)))
                var_13_D8 = and:int(ldc:int(-25686), ldc:int(25681))
                goto(Label_0602)
                Label_0358:
                
                if (cmpeq:boolean(and:int(var_6_2BE:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0687)
                }
                
                var_6_1E4 = and:int(var_6_2BE:int, ldc:int(-323830145))
                var_15_188 = mul:double(invokestatic:double(Math::sin, div:double(mul:double(i2d:double(var_14_158:int), ldc:double(3.141592653589793)), ldc:double(180.0))), f2d:double(p2:float))
                var_17_19B = mul:double(invokestatic:double(Math::cos, div:double(mul:double(i2d:double(var_14_158:int), ldc:double(3.141592653589793)), ldc:double(180.0))), f2d:double(p2:float))
                stack_240_0 = stack_1F1_0 = var_10_B7
                stack_240_1 = stack_1F1_1 = var_11_C3
                stack_240_2 = stack_1F1_2 = var_12_CF
                
                if (p0:boolean) {
                    stack_240_3 = stack_1F1_3 = mul(p3, p4)
                    goto(Label_0469)
                }
                
                Label_0423:
                
                if (cmpne:boolean(and:int(var_6_1E4:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0518)
                }
                
                var_6_1E4 = and:int(var_6_1E4:int, ldc:int(-46234370))
                stack_240_3 = stack_1F1_3 = ldc(0.0f)
                Label_0469:
                
                if (cmpeq:boolean(and:int(var_6_1E4:int, ldc:int(2)), ldc:int(0))) {
                    var_6_1E4 = and:int(var_6_1E4:int, ldc:int(961192493))
                    goto(Label_0548)
                }
                
                var_6_1E4 = and:int(var_6_1E4:int, ldc:int(1857670622))
                invokestatic:void(GL11::glColor4f, stack_1F1_0:float, stack_1F1_1:float, stack_1F1_2:float, stack_1F1_3:float)
                invokestatic:void(GL11::glVertex3d, var_15_188:double, ldc:double(0.0), var_17_19B:double)
                stack_240_0 = stack_1F1_0 = var_10_B7
                stack_240_1 = stack_1F1_1 = var_11_C3
                stack_240_2 = stack_1F1_2 = var_12_CF
                
                if (logicalnot:boolean(p0:boolean)) {
                    stack_240_3 = stack_1F1_3 = mul(p3, p4)
                    goto(Label_0548)
                }
                
                Label_0518:
                
                if (cmpeq:boolean(and:int(var_6_1E4:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_0423)
                }
                
                var_6_1E4 = and:int(var_6_1E4:int, ldc:int(-151259938))
                stack_240_3 = stack_1F1_3 = ldc(0.0f)
                Label_0548:
                
                if (cmpeq:boolean(and:int(var_6_1E4:int, ldc:int(1048576)), ldc:int(0))) {
                    var_6_1E4 = and:int(var_6_1E4:int, ldc:int(-1521025531))
                    goto(Label_0469)
                }
                
                var_6_2BE = and:int(var_6_1E4:int, ldc:int(1987677787))
                invokestatic:void(GL11::glColor4f, stack_240_0:float, stack_240_1:float, stack_240_2:float, stack_240_3:float)
                invokestatic:void(GL11::glVertex3d, var_15_188:double, f2d:double(p1:float), var_17_19B:double)
                var_13_D8 = add:int(var_13_D8:int, var_8_93:int)
                loopcontinue()
                Label_0602:
                
                if (cmple:boolean(var_13_D8:int, add:int(xor:int(ldc:int(9816), ldc:int(10032)), var_8_93:int))) {
                    var_14_158 = var_13_D8:int
                    
                    if (cmple:boolean(var_14_158:int, and:int(ldc:int(9196), ldc:int(1386)))) {
                        goto(Label_0687)
                    }
                    
                    var_14_158 = and:int(ldc:int(-4680), ldc:int(4679))
                    goto(Label_0687)
                }
                
                Label_0617:
                
                if (cmpeq:boolean(and:int(var_6_2BE:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0270)
                }
                
                if (cmpne:boolean(and:int(var_6_2BE:int, ldc:int(67108864)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                loopcontinue()
                Label_0687:
                
                if (cmpeq:boolean(and:int(var_6_2BE:int, ldc:int(1048576)), ldc:int(0))) {
                    var_6_2BE = and:int(var_6_2BE:int, ldc:int(678365499))
                    goto(Label_0358)
                }
                
                var_6_2C9 = and:int(var_6_2BE:int, ldc:int(-142945574))
                var_15_2DC = mul:double(invokestatic:double(Math::sin, div:double(mul:double(i2d:double(var_14_158:int), ldc:double(3.141592653589793)), ldc:double(180.0))), f2d:double(p2:float))
                var_17_2EF = mul:double(invokestatic:double(Math::cos, div:double(mul:double(i2d:double(var_14_158:int), ldc:double(3.141592653589793)), ldc:double(180.0))), f2d:double(p2:float))
                invokestatic:void(GL11::glColor4f, var_10_B7:float, var_11_C3:float, var_12_CF:float, mul:float(add:float(ldc:float(0.5f), mul:float(ldc:float(0.5f), p3:float)), p4:float))
                expr_307 = var_15_2DC:double
                
                if (logicalnot:boolean(p0:boolean)) {
                    var_6_2C9 = and:int(var_6_2C9:int, ldc:int(-189727269))
                    stack_339_2 = f2d:double(p1:float)
                }
                else {
                    stack_339_2 = ldc:double(0.0)
                }
                
                var_6_2BE = and:int(var_6_2C9:int, ldc:int(-272773797))
                invokestatic:void(GL11::glVertex3d, expr_307:double, stack_339_2:double, var_17_2EF:double)
                var_13_D8 = add:int(var_13_D8:int, var_8_93:int)
                goto(Label_0602)
            }
            
            invokestatic:void(GL11::glEnd)
            invokestatic:void(GL11::glEnable, xor:int(ldc:int(13906), ldc:int(15651)))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u7873\u4975\u4c2b\uc87f\ubded\u16f6, and:int(ldc:int(7554), ldc:int(15632)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u7043\ub7dc\u8cae\uff55\uafe7() {
        var_1_61 : int
        stack_DC_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-1756861184), ldc:int(-205148761))
            
            if (cmpne:boolean(getstatic:\u7d52\u718f\u3776\u6fb0\ub83f(\ube23\uf9c5\u8350\u62da\ub32d::\u61a4\u8258\u4daf\ub6ab\ud7e8), aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f())) {
                if (cmpne:boolean(invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\ube23\u67d0\u64f2\u839e\u76bc::\u6b5f\u6b5f\u3e75\ub83f\u4c2b\u5245, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\ube23\u67d0\u64f2\u839e\u76bc](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b))), aconstnull:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56())) {
                    if (instanceof:boolean(\u6435\ub8be\u718f\u6b0d\u67e9.\u76bc\u71f1\uceb8\u7049\u3c25\u647c.class, invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\ube23\u67d0\u64f2\u839e\u76bc::\u6b5f\u6b5f\u3e75\ub83f\u4c2b\u5245, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\ube23\u67d0\u64f2\u839e\u76bc](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b)))))) {
                        if (logicalnot:boolean(invokevirtual:boolean(String::equals, invokevirtual:String(\ud158\u839e\u7006\uc3e3\u446c::\u5140\u8bb0\uc84e\u4179\ubcb0, this:\ube23\uf9c5\u8350\u62da\ub32d[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), xor:int(ldc:int(4360), ldc:int(4367)))), loadelement:String[expected:Object](getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), xor:int(ldc:int(-32382), ldc:int(-32374)))))) {
                            stack_DC_0 = and:int[expected:boolean](ldc:int(163), ldc:int(69))
                            return:boolean(stack_DC_0:boolean)
                        }
                    }
                }
            }
            
            var_1_61 = and:int(var_1_61:int, ldc:int(-407884454))
            stack_DC_0 = and:int[expected:boolean](ldc:int(2866), ldc:int(-12223))
            return:boolean(stack_DC_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    public boolean \u4f52\u873d\u5bc4\u647c\u4c2b() {
        var_1_61 : int
        stack_98_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(1245762977), ldc:int(786791721))
            
            if (logicaland:boolean(invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\ube23\uf9c5\u8350\u62da\ub32d[expected:\ud158\u839e\u7006\uc3e3\u446c]), invokevirtual:boolean(\ube23\uf9c5\u8350\u62da\ub32d::\u7043\ub7dc\u8cae\uff55\uafe7, this:\ube23\uf9c5\u8350\u62da\ub32d))) {
                stack_98_0 = and:int(ldc:int(8261), ldc:int(17833))
            }
            else {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1094238227))
                stack_98_0 = and:int(ldc:int(3640), ldc:int(-3641))
            }
            
            return:boolean(stack_98_0:int)
        }
        
        goto(Label_0006)
    }
    
    public void \u4ab3\ud51e\u88c5\u3504\u4f52(\ub113\uc4d2\u183a\u527a\u6435.\u8df4\ubff1\u759a\u4c2b\u8308 p0, java.lang.String p1, boolean p2) {
        var_4_63 : int
        stack_92_0 : double [generated]
        var_4_22A : int
        var_6_92 : double
        var_8_9B : int
        stack_245_0 : double [generated]
        var_4_578 : int
        stack_398_0 : int [generated]
        expr_24F : double[] [generated]
        var_9_398 : int
        
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
        var_4_63 = and:int(ldc:int(-1227878347), ldc:int(-673269779))
        
        if (logicalnot:boolean(invokevirtual:boolean(String::equals, p1:String, loadelement:String[expected:Object](getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), and:int(ldc:int(16619), ldc:int(1881)))))) {
            var_4_63 = and:int(var_4_63:int, ldc:int(-21729026))
            stack_92_0 = ldc:double(0.0)
        }
        else {
            stack_92_0 = ldc:double(1.0E-14)
        }
        
        var_4_22A = and:int(var_4_63:int, ldc:int(-67969628))
        var_6_92 = stack_92_0:double
        var_8_9B = and:int(ldc:int(24835), ldc:int(6741))
        
        if (cmpeq:boolean(getfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\u71f1\u71ae\u385b\ub18d\u0c95, this:\ube23\uf9c5\u8350\u62da\ub32d), ldc:int(0))) {
            if (cmpge:boolean(getfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\u3d4b\uc238\ubcb0\u67e9\u5d20, this:\ube23\uf9c5\u8350\u62da\ub32d), xor:int(ldc:int(16772), ldc:int(16773)))) {
                if (cmpgt:boolean(getstatic:int(\u9af2\u8389\ubf56\ub7dc\u5d20::\u12cb\u92ff\u47c2\u72f1\u97e6), and:int(ldc:int(225), ldc:int(10259)))) {
                    if (logicalnot:boolean(invokevirtual:boolean(\u4e72\ua6bd\u927d\uc238\ub8be::\uc4d2\u624e\ua562\u6c56\u4bc8, getfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ube23\uf9c5\u8350\u62da\ub32d::\u8c8a\u7ce1\u6b5f\u71ae\u6cfe, this:\ube23\uf9c5\u8350\u62da\ub32d), getfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\u0c95\u34df\u71f1\u56bd\u4f52, this:\ube23\uf9c5\u8350\u62da\ub32d)))) {
                        goto(Label_0244)
                    }
                    
                    putfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\u71f1\u71ae\u385b\ub18d\u0c95, this:\ube23\uf9c5\u8350\u62da\ub32d, xor:int(ldc:int(-22400), ldc:int(-22399)))
                    var_8_9B = p2:boolean[expected:int]
                    
                    if (logicalnot:boolean(invokevirtual:boolean(String::equals, p1:String, loadelement:String[expected:Object](getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), and:int(ldc:int(2638), ldc:int(202)))))) {
                        goto(Label_0479)
                    }
                    
                    stack_245_0 = div:double(invokestatic:double(\u3e75\u8413\u3711\u4daf\ub1b9::\ua3b4\u97b7\ub8be\ucb79\u5d20), ldc:double(10.0))
                    goto(Label_0573)
                }
            }
        }
        
        Label_0164:
        
        if (cmpeq:boolean(and:int(var_4_22A:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0811)
        }
        
        if (cmpeq:boolean(and:int(var_4_22A:int, ldc:int(1048576)), ldc:int(0))) {
            var_4_22A = and:int(var_4_22A:int, ldc:int(-864729340))
            goto(Label_0479)
        }
        
        if (cmpne:boolean(and:int(var_4_22A:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0327)
        }
        
        if (cmpne:boolean(and:int(var_4_22A:int, ldc:int(16384)), ldc:int(0))) {
            var_4_22A = and:int(var_4_22A:int, ldc:int(123013145))
        }
        else {
            var_4_22A = and:int(var_4_22A:int, ldc:int(-541918018))
            
            if (cmpeq:boolean(getfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\u71f1\u71ae\u385b\ub18d\u0c95, this:\ube23\uf9c5\u8350\u62da\ub32d), xor:int(ldc:int(24), ldc:int(25)))) {
                putfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\u71f1\u71ae\u385b\ub18d\u0c95, this:\ube23\uf9c5\u8350\u62da\ub32d, and:int(ldc:int(20056), ldc:int(-28281)))
                var_8_9B = and:int(ldc:int(-5636), ldc:int(5635))
                
                if (invokevirtual:boolean(String::equals, p1:String, loadelement:String[expected:Object](getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), xor:int(ldc:int(11304), ldc:int(11361))))) {
                    if (cmpne:boolean(getfield:double[](\ube23\uf9c5\u8350\u62da\ub32d::\ube23\uc29a\u16f6\u6c52\u873d, this:\ube23\uf9c5\u8350\u62da\ub32d), aconstnull:double[]())) {
                        if (cmplt:boolean(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6bb9\uc29a\u99f7\u7e3f\u6b5f\u156b, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u93a2\ub113\u97b7\ud523\u6198\u47c2, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b)))), ldc:double(0.0))) {
                            invokevirtual:void(\u527a\u873d\u071d\u4f52\uc229\ud217::\u88c5\u4975\u6d69\u0b8e\u516c\uc246, invokevirtual:\u527a\u873d\u071d\u4f52\uc229\ud217(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\u4492\u600f\u6bb9\uafe7\u183a, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b)), initobject:\u718f\u5654\u93a2\ud7e8\uae5d[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\u718f\u5654\u93a2\ud7e8\uae5d::<init>, loadelement:double(getfield:double[](\ube23\uf9c5\u8350\u62da\ub32d::\ube23\uc29a\u16f6\u6c52\u873d, this:\ube23\uf9c5\u8350\u62da\ub32d), and:int(ldc:int(-14717), ldc:int(14716))), loadelement:double(getfield:double[](\ube23\uf9c5\u8350\u62da\ub32d::\ube23\uc29a\u16f6\u6c52\u873d, this:\ube23\uf9c5\u8350\u62da\ub32d), and:int(ldc:int(4141), ldc:int(1475))), loadelement:double(getfield:double[](\ube23\uf9c5\u8350\u62da\ub32d::\ube23\uc29a\u16f6\u6c52\u873d, this:\ube23\uf9c5\u8350\u62da\ub32d), and:int(ldc:int(20523), ldc:int(11474))), and:int[expected:boolean](ldc:int(1324), ldc:int(-9583))))
                            putfield:double[](\ube23\uf9c5\u8350\u62da\ub32d::\ube23\uc29a\u16f6\u6c52\u873d, this:\ube23\uf9c5\u8350\u62da\ub32d, aconstnull:double[]())
                        }
                    }
                }
            }
        }
        
        Label_0244:
        
        if (cmpeq:boolean(and:int(var_4_22A:int, ldc:int(4096)), ldc:int(0))) {
            var_4_22A = and:int(var_4_22A:int, ldc:int(-754786545))
            goto(Label_0811)
        }
        
        if (cmpeq:boolean(and:int(var_4_22A:int, ldc:int(1048576)), ldc:int(0))) {
            var_4_22A = and:int(var_4_22A:int, ldc:int(-1421456285))
            goto(Label_0479)
        }
        
        if (cmpne:boolean(and:int(var_4_22A:int, ldc:int(128)), ldc:int(0))) {
            var_4_22A = and:int(var_4_22A:int, ldc:int(811148232))
        }
        else {
            if (cmpne:boolean(and:int(var_4_22A:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0164)
            }
            
            var_4_22A = and:int(var_4_22A:int, ldc:int(-1818978561))
            
            if (logicalnot:boolean(invokestatic:boolean(\u8389\u156b\u8c8a\u47c2\u416d::\ua6bd\ub8be\uc2e8\u5245\uc229))) {
                if (getfield:boolean(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u8c8a\u62da\u7c6b\u385b\u3dd3\ud12e, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b)))) {
                    goto(Label_0811)
                }
                
                if (invokestatic:boolean(\u3bd6\u6d99\ub113\u4d85\u71f1::\u7ce1\u40a9\u6ec6\u74b1\ub7dc, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b)), ldc:float(0.001f))) {
                    goto(Label_0811)
                }
            }
        }
        
        Label_0327:
        
        if (cmpne:boolean(and:int(var_4_22A:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0811)
        }
        
        if (cmpeq:boolean(and:int(var_4_22A:int, ldc:int(128)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_4_22A:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0244)
            }
            
            if (cmpne:boolean(and:int(var_4_22A:int, ldc:int(33554432)), ldc:int(0))) {
                var_4_578 = and:int(var_4_22A:int, ldc:int(-622946499))
                stack_398_0 = and:int(ldc:int(-28487), ldc:int(12096))
                goto(Label_0920)
            }
            
            goto(Label_0164)
        }
        
        Label_0479:
        
        if (cmpeq:boolean(and:int(var_4_22A:int, ldc:int(1048576)), ldc:int(0))) {
            var_4_22A = and:int(var_4_22A:int, ldc:int(956764089))
            goto(Label_0811)
        }
        
        if (cmpne:boolean(and:int(var_4_22A:int, ldc:int(16777216)), ldc:int(0))) {
            var_4_22A = and:int(var_4_22A:int, ldc:int(892088368))
            goto(Label_0327)
        }
        
        if (cmpeq:boolean(and:int(var_4_22A:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0244)
        }
        
        if (cmpne:boolean(and:int(var_4_22A:int, ldc:int(16777216)), ldc:int(0))) {
            var_4_22A = and:int(var_4_22A:int, ldc:int(317716510))
            goto(Label_0164)
        }
        
        var_4_22A = and:int(var_4_22A:int, ldc:int(-1766721371))
        stack_245_0 = ldc:double(0.0626)
        Label_0573:
        var_4_22A = and:int(var_4_22A:int, ldc:int(-1145539724))
        var_6_92 = stack_245_0:double
        expr_24F = newarray:double[](double.class, xor:int(ldc:int(-31719), ldc:int(-31718)))
        storeelement:double(expr_24F:double[], and:int(ldc:int(4736), ldc:int(-4737)), invokevirtual:double(\u8df4\ubff1\u759a\u4c2b\u8308::\u4f52\uc2e8\u5f50\u4d85\u839e, p0:\u8df4\ubff1\u759a\u4c2b\u8308))
        storeelement:double(expr_24F:double[], xor:int(ldc:int(2307), ldc:int(2306)), add:double(invokevirtual:double(\u8df4\ubff1\u759a\u4c2b\u8308::\u120d\uff55\u4c2b\u0a06\ub113, p0:\u8df4\ubff1\u759a\u4c2b\u8308), var_6_92:double))
        storeelement:double(expr_24F:double[], xor:int(ldc:int(20501), ldc:int(20503)), invokevirtual:double(\u8df4\ubff1\u759a\u4c2b\u8308::\u385b\u7bad\u8308\ud217\u36d3, p0:\u8df4\ubff1\u759a\u4c2b\u8308))
        putfield:double[](\ube23\uf9c5\u8350\u62da\ub32d::\ube23\uc29a\u16f6\u6c52\u873d, this:\ube23\uf9c5\u8350\u62da\ub32d, expr_24F:double[])
        goto(Label_0244)
        Label_0811:
        
        if (cmpeq:boolean(and:int(var_4_22A:int, ldc:int(32)), ldc:int(0))) {
            var_4_22A = and:int(var_4_22A:int, ldc:int(-25556998))
            goto(Label_0479)
        }
        
        if (cmpeq:boolean(and:int(var_4_22A:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0327)
        }
        
        if (cmpeq:boolean(and:int(var_4_22A:int, ldc:int(32)), ldc:int(0))) {
            var_4_22A = and:int(var_4_22A:int, ldc:int(-1200987935))
            goto(Label_0244)
        }
        
        if (cmpeq:boolean(and:int(var_4_22A:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0164)
        }
        
        var_4_578 = and:int(var_4_22A:int, ldc:int(-1294074003))
        stack_398_0 = xor:int(ldc:int(18437), ldc:int(18436))
        Label_0920:
        var_9_398 = stack_398_0:int
        
        if (cmpne:boolean(var_9_398:int, ldc:int(0))) {
            loop {
                if (cmpeq:boolean(and:int(var_4_578:int, ldc:int(4)), ldc:int(0))) {
                    var_4_578 = and:int(var_4_578:int, ldc:int(-1839385960))
                    goto(Label_1345)
                }
                
                if (cmpeq:boolean(and:int(var_4_578:int, ldc:int(1048576)), ldc:int(0))) {
                    var_4_578 = and:int(var_4_578:int, ldc:int(-621163875))
                    goto(Label_1076)
                }
                
                if (cmpeq:boolean(and:int(var_4_578:int, ldc:int(2)), ldc:int(0))) {
                    var_4_578 = and:int(var_4_578:int, ldc:int(-1074490524))
                    putfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\u3d4b\uc238\ubcb0\u67e9\u5d20, this:\ube23\uf9c5\u8350\u62da\ub32d, add:int(getfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\u3d4b\uc238\ubcb0\u67e9\u5d20, this:\ube23\uf9c5\u8350\u62da\ub32d), and:int(ldc:int(1155), ldc:int(12833))))
                    
                    if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, invokevirtual:\ud158\u839e\u7006\uc3e3\u446c(\u3776\u647c\u51fa\u7e3f\ub32d::\ud36e\u6d69\u4ab3\u6c52\u6c52, invokevirtual:\u3776\u647c\u51fa\u7e3f\ub32d(\u6b0d\ua068\uc4d2\u5245\u4d85::\ufcaf\uc9f6\u9a18\uc7fe\uc2bd, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), ldc:Class<\u8389\u9255\ubff1\ud12e\uc910>(\u59ec\u8413\u97e6\uc229\u3776.\u8389\u9255\ubff1\ud12e\uc910.class)))) {
                        if (logicalnot:boolean(invokevirtual:boolean(String::equalsIgnoreCase, invokevirtual:String(\ud158\u839e\u7006\uc3e3\u446c::\u5140\u8bb0\uc84e\u4179\ubcb0, invokevirtual:\ud158\u839e\u7006\uc3e3\u446c(\u3776\u647c\u51fa\u7e3f\ub32d::\ud36e\u6d69\u4ab3\u6c52\u6c52, invokevirtual:\u3776\u647c\u51fa\u7e3f\ub32d(\u6b0d\ua068\uc4d2\u5245\u4d85::\ufcaf\uc9f6\u9a18\uc7fe\uc2bd, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), ldc:Class<\u8389\u9255\ubff1\ud12e\uc910>(\u59ec\u8413\u97e6\uc229\u3776.\u8389\u9255\ubff1\ud12e\uc910.class)), loadelement:String(getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), and:int(ldc:int(6247), ldc:int(26318)))), loadelement:String(getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), xor:int(ldc:int(562), ldc:int(632)))))) {
                            if (logicalnot:boolean(invokevirtual:boolean(String::equalsIgnoreCase, invokevirtual:String(\ud158\u839e\u7006\uc3e3\u446c::\u5140\u8bb0\uc84e\u4179\ubcb0, invokevirtual:\ud158\u839e\u7006\uc3e3\u446c(\u3776\u647c\u51fa\u7e3f\ub32d::\ud36e\u6d69\u4ab3\u6c52\u6c52, invokevirtual:\u3776\u647c\u51fa\u7e3f\ub32d(\u6b0d\ua068\uc4d2\u5245\u4d85::\ufcaf\uc9f6\u9a18\uc7fe\uc2bd, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), ldc:Class<\u8389\u9255\ubff1\ud12e\uc910>(\u59ec\u8413\u97e6\uc229\u3776.\u8389\u9255\ubff1\ud12e\uc910.class)), loadelement:String(getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), and:int(ldc:int(102), ldc:int(8647)))), loadelement:String(getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), and:int(ldc:int(24653), ldc:int(3246)))))) {
                                goto(Label_1076)
                            }
                        }
                    }
                }
                
                Label_1018:
                
                if (cmpne:boolean(and:int(var_4_578:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_1345)
                }
                
                if (cmpne:boolean(and:int(var_4_578:int, ldc:int(2)), ldc:int(0))) {
                    var_4_578 = and:int(var_4_578:int, ldc:int(599947543))
                }
                else {
                    if (cmpne:boolean(and:int(var_4_578:int, ldc:int(2)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_4_578 = and:int(var_4_578:int, ldc:int(-1613463635))
                    
                    if (getfield:boolean(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\ubded\u8c8a\ua61f\u71ae\u4d85\u6c52, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b)))) {
                        if (cmpne:boolean(var_9_398:int, ldc:int(0))) {
                            if (logicalnot:boolean(getfield:boolean(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u1187\u3c25\ua3b4\u6d99\uc9f6\u6d99, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b))))) {
                                if (logicalnot:boolean(invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u120d\u12cb\u8258\ud51e\uc31c\u6bb9, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b))))) {
                                    if (logicalnot:boolean(invokevirtual:boolean(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u718f\u3776\u5d20\ub70c\ud217\u759a, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u183a\u8bb0\u3d64\u965f\uae5d\u6b5f, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b)))))) {
                                        if (cmple:boolean(var_6_92:double, ldc:double(0.001))) {
                                            goto(Label_1345)
                                        }
                                        
                                        putstatic:boolean(\ube23\uf9c5\u8350\u62da\ub32d::\ubb2b\uf995\uc9f6\u0c95\ubb2b, xor:int[expected:boolean](ldc:int(2626), ldc:int(2627)))
                                        goto(Label_1429)
                                    }
                                }
                            }
                        }
                    }
                }
                
                Label_1076:
                
                if (cmpeq:boolean(and:int(var_4_578:int, ldc:int(4096)), ldc:int(0))) {
                    var_4_578 = and:int(var_4_578:int, ldc:int(-1973610071))
                }
                else {
                    if (cmpne:boolean(and:int(var_4_578:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1018)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_578:int, ldc:int(1048576)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    loopcontinue()
                }
                
                Label_1345:
                
                if (cmpeq:boolean(and:int(var_4_578:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_1076)
                }
                
                if (cmpne:boolean(and:int(var_4_578:int, ldc:int(131072)), ldc:int(0))) {
                    var_4_578 = and:int(var_4_578:int, ldc:int(-1199926984))
                    goto(Label_1018)
                }
                
                if (cmpne:boolean(and:int(var_4_578:int, ldc:int(32768)), ldc:int(0))) {
                    var_4_578 = and:int(var_4_578:int, ldc:int(-577564228))
                    loopcontinue()
                }
                
                var_4_578 = and:int(var_4_578:int, ldc:int(-69314451))
                putstatic:boolean(\ube23\uf9c5\u8350\u62da\ub32d::\ubb2b\uf995\uc9f6\u0c95\ubb2b, and:int[expected:boolean](ldc:int(13317), ldc:int(-13318)))
                Label_1429:
                var_4_578 = and:int(var_4_578:int, ldc:int(-1147879937))
                invokevirtual:void(\u8df4\ubff1\u759a\u4c2b\u8308::\u759a\uc87f\u6d99\uc910\ua6bd, p0:\u8df4\ubff1\u759a\u4c2b\u8308, add:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b))), var_6_92:double))
                invokevirtual:void(\u8df4\ubff1\u759a\u4c2b\u8308::\ua61f\u3dd3\u7ce1\u3d4b\ud217, p0:\u8df4\ubff1\u759a\u4c2b\u8308, var_8_9B:boolean)
                goto(Label_1076)
            }
            
            return:void()
        }
        
        putfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\u3d4b\uc238\ubcb0\u67e9\u5d20, this:\ube23\uf9c5\u8350\u62da\ub32d, and:int(ldc:int(21718), ldc:int(-23807)))
        putfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\u71f1\u71ae\u385b\ub18d\u0c95, this:\ube23\uf9c5\u8350\u62da\ub32d, and:int(ldc:int(-30702), ldc:int(21484)))
    }
    
    private \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f \u0c95\ubcb0\u5bc4\u960f\u836c(java.util.List<\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8640\ud7e8\u8308\u4bc8\uc29a> p0) {
        var_1_6A : List<\u8640\ud7e8\u8308\u4bc8\uc29a>
        
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
        var_1_6A = invokevirtual:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\u4e72\ua6bd\u927d\uc238\ub8be::\ub8be\u983f\u93a2\u4ab3\u071d, getfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ube23\uf9c5\u8350\u62da\ub32d::\u8c8a\u7ce1\u6b5f\u71ae\u6cfe, this:\ube23\uf9c5\u8350\u62da\ub32d), p0:List<\u8640\ud7e8\u8308\u4bc8\uc29a>)
        
        if (logicaland:boolean(logicalnot:boolean(invokeinterface:boolean(List<E>::isEmpty, var_1_6A:List<\u8640\ud7e8\u8308\u4bc8\uc29a>)), cmple:boolean(invokevirtual:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u98a4\ufe34\u6cfe\u3e75\u965f\u8df4, invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8640\ud7e8\u8308\u4bc8\uc29a::\u51b2\u6fb0\ub102\u7006\u873d, checkcast:\u8640\ud7e8\u8308\u4bc8\uc29a(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8640\ud7e8\u8308\u4bc8\uc29a.class, invokeinterface:\u8640\ud7e8\u8308\u4bc8\uc29a(List<\u8640\ud7e8\u8308\u4bc8\uc29a>::get, var_1_6A:List<\u8640\ud7e8\u8308\u4bc8\uc29a>, and:int(ldc:int(48), ldc:int(-49))))), getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b))), invokevirtual:float(\ud158\u839e\u7006\uc3e3\u446c::\uf94d\u983f\u40a9\u6fb0\u12b2, this:\ube23\uf9c5\u8350\u62da\ub32d[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), and:int(ldc:int(8991), ldc:int(17471))))))) {
            return:\u7d52\u718f\u3776\u6fb0\ub83f(invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8640\ud7e8\u8308\u4bc8\uc29a::\u51b2\u6fb0\ub102\u7006\u873d, checkcast:\u8640\ud7e8\u8308\u4bc8\uc29a(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8640\ud7e8\u8308\u4bc8\uc29a.class, invokeinterface:\u8640\ud7e8\u8308\u4bc8\uc29a(List<\u8640\ud7e8\u8308\u4bc8\uc29a>::get, var_1_6A:List<\u8640\ud7e8\u8308\u4bc8\uc29a>, and:int(ldc:int(1110), ldc:int(-1111))))))
        }
        
        return:\u7d52\u718f\u3776\u6fb0\ub83f(aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f())
    }
    
    private void \uf9c5\ubff1\u8d98\u3776\u7bad() {
        var_1_61 : int
        var_3_71 : float
        var_4_81 : float
        var_5_92 : String
        var_6_AC : List<\u8640\ud7e8\u8308\u4bc8\uc29a>
        var_1_6B9 : int
        var_7_4EF : float
        stack_6D5_0 : int [generated]
        stack_6D5_1 : int [generated]
        
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
        var_1_61 = and:int(ldc:int(-1481341576), ldc:int(-304250525))
        var_3_71 = invokevirtual:float(\ud158\u839e\u7006\uc3e3\u446c::\uf94d\u983f\u40a9\u6fb0\u12b2, this:\ube23\uf9c5\u8350\u62da\ub32d[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), and:int(ldc:int(16479), ldc:int(3263))))
        var_4_81 = invokevirtual:float(\ud158\u839e\u7006\uc3e3\u446c::\uf94d\u983f\u40a9\u6fb0\u12b2, this:\ube23\uf9c5\u8350\u62da\ub32d[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), and:int(ldc:int(14), ldc:int(31135))))
        var_5_92 = invokevirtual:String(\ud158\u839e\u7006\uc3e3\u446c::\u5140\u8bb0\uc84e\u4179\ubcb0, this:\ube23\uf9c5\u8350\u62da\ub32d[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), and:int(ldc:int(18563), ldc:int(66))))
        var_6_AC = invokevirtual:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\u4e72\ua6bd\u927d\uc238\ub8be::\ub8be\u983f\u93a2\u4ab3\u071d, getfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ube23\uf9c5\u8350\u62da\ub32d::\u8c8a\u7ce1\u6b5f\u71ae\u6cfe, this:\ube23\uf9c5\u8350\u62da\ub32d), invokevirtual:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\u4e72\ua6bd\u927d\uc238\ub8be::\u6b5f\ubded\u74b1\u4e72\u7e3f, getfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ube23\uf9c5\u8350\u62da\ub32d::\u8c8a\u7ce1\u6b5f\u71ae\u6cfe, this:\ube23\uf9c5\u8350\u62da\ub32d), invokestatic:float(Math::max, var_3_71:float, var_4_81:float)))
        
        if (cmpeq:boolean(getfield:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\ub1b9\u960f\u3a62\ua6bd\u9255, this:\ube23\uf9c5\u8350\u62da\ub32d), aconstnull:\u5245\u8cae\ub102\u4c04\u983f())) {
            invokevirtual:void(\ube23\uf9c5\u8350\u62da\ub32d::\ub6ab\ube23\uae87\uc84e\u1833, this:\ube23\uf9c5\u8350\u62da\ub32d)
        }
        
        loop {
            if (cmpne:boolean(and:int(var_1_61:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_1137)
            }
            
            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_1038)
            }
            
            if (cmpne:boolean(and:int(var_1_61:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0930)
            }
            
            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(67108864)), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-701854953))
                goto(Label_0790)
            }
            
            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0644)
            }
            
            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(64)), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(406625247))
                goto(Label_0379)
            }
            
            if (cmpne:boolean(and:int(var_1_61:int, ldc:int(1048576)), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1482754335))
                
                if (cmpne:boolean(var_6_AC:List<\u8640\ud7e8\u8308\u4bc8\uc29a>, aconstnull:List<\u8640\ud7e8\u8308\u4bc8\uc29a>())) {
                    if (cmpne:boolean(invokeinterface:int(List::size, var_6_AC:List), ldc:int(0))) {
                        if (logicalnot:boolean(invokevirtual:boolean(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u12b2\ufe34\ubcb0\u385b\uc910\u6c52, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\uf995\uc7fe\u4daf\u71f1\u62da\ub102, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b)))))) {
                            goto(Label_0644)
                        }
                    }
                }
            }
            
            Label_0266:
            
            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(2147483647)), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1194350302))
                goto(Label_1137)
            }
            
            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_1038)
            }
            
            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0930)
            }
            
            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0790)
            }
            
            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(1048576)), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(586139919))
                goto(Label_0644)
            }
            
            if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2048)), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(899727661))
            }
            else {
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(1496871994))
                    loopcontinue()
                }
                
                var_1_61 = and:int(var_1_61:int, ldc:int(224214114))
                putstatic:\u8640\ud7e8\u8308\u4bc8\uc29a(\ube23\uf9c5\u8350\u62da\ub32d::\ub83f\u6c52\u12cb\u3c25\u3776, aconstnull:\u8640\ud7e8\u8308\u4bc8\uc29a())
                putstatic:\u7d52\u718f\u3776\u6fb0\ub83f(\ube23\uf9c5\u8350\u62da\ub32d::\u61a4\u8258\u4daf\ub6ab\ud7e8, aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f())
                
                if (cmpne:boolean(getfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d), aconstnull:List<\u8640\ud7e8\u8308\u4bc8\uc29a>())) {
                    invokeinterface:void(List<E>::clear, getfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d))
                }
            }
            
            Label_0379:
            
            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(64)), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(2135344948))
                goto(Label_1137)
            }
            
            if (cmpne:boolean(and:int(var_1_61:int, ldc:int(4)), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(1149081138))
                goto(Label_1038)
            }
            
            if (cmpne:boolean(and:int(var_1_61:int, ldc:int(1)), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1985082549))
                goto(Label_0930)
            }
            
            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0790)
            }
            
            if (cmpne:boolean(and:int(var_1_61:int, ldc:int(1073741824)), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-418315772))
            }
            else {
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0266)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(64)), ldc:int(0))) {
                    putfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\u0c95\u34df\u71f1\u56bd\u4f52, this:\ube23\uf9c5\u8350\u62da\ub32d, f2i:int(invokevirtual:float(\u4e72\ua6bd\u927d\uc238\ub8be::\uae87\u9033\ubded\u71f1\u71ae, getfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ube23\uf9c5\u8350\u62da\ub32d::\u8c8a\u7ce1\u6b5f\u71ae\u6cfe, this:\ube23\uf9c5\u8350\u62da\ub32d), and:int(ldc:int(-11261), ldc:int(10940)))))
                    putfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\u71f1\u71ae\u385b\ub18d\u0c95, this:\ube23\uf9c5\u8350\u62da\ub32d, and:int(ldc:int(-14326), ldc:int(8949)))
                    putstatic:boolean(\ube23\uf9c5\u8350\u62da\ub32d::\ubb2b\uf995\uc9f6\u0c95\ubb2b, and:int[expected:boolean](ldc:int(222), ldc:int(-16640)))
                    putfield:float(\u5245\u8cae\ub102\u4c04\u983f::\ud171\u3dd3\ud171\ud523\u8bb0, getfield:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\ub1b9\u960f\u3a62\ua6bd\u9255, this:\ube23\uf9c5\u8350\u62da\ub32d), getfield:float(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u7d52\u8709\ubefe\u7af6\u0b8e\ua61f, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b))))
                    putfield:float(\u5245\u8cae\ub102\u4c04\u983f::\uf9c5\ud158\u7330\u9255\u9937, getfield:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\ub1b9\u960f\u3a62\ua6bd\u9255, this:\ube23\uf9c5\u8350\u62da\ub32d), getfield:float(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u4d85\u71ae\u494c\u839e\uf9c5\u93a2, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b))))
                    putfield:float(\u5245\u8cae\ub102\u4c04\u983f::\ud171\u3dd3\ud171\ud523\u8bb0, getstatic:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\uc2bd\u5fe1\uc29a\u5140\ud171), getfield:float(\u5245\u8cae\ub102\u4c04\u983f::\ud171\u3dd3\ud171\ud523\u8bb0, getfield:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\ub1b9\u960f\u3a62\ua6bd\u9255, this:\ube23\uf9c5\u8350\u62da\ub32d)))
                    putfield:float(\u5245\u8cae\ub102\u4c04\u983f::\uf9c5\ud158\u7330\u9255\u9937, getstatic:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\uc2bd\u5fe1\uc29a\u5140\ud171), getfield:float(\u5245\u8cae\ub102\u4c04\u983f::\uf9c5\ud158\u7330\u9255\u9937, getfield:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\ub1b9\u960f\u3a62\ua6bd\u9255, this:\ube23\uf9c5\u8350\u62da\ub32d)))
                    putfield:float(\ube23\uf9c5\u8350\u62da\ub32d::\u6d99\u718f\uf995\u4c04\uc238, this:\ube23\uf9c5\u8350\u62da\ub32d, ldc:float(-1.0f))
                    putfield:double(\ube23\uf9c5\u8350\u62da\ub32d::\uae87\u99f7\u9033\uae5d\u52d3, this:\ube23\uf9c5\u8350\u62da\ub32d, invokestatic:double(Math::random))
                    putfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\uc2e8\ud51e\u8350\u69d9\u965f, this:\ube23\uf9c5\u8350\u62da\ub32d, ldc:int(-1))
                    return:void()
                }
                
                loopcontinue()
            }
            
            Label_0644:
            
            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_1137)
            }
            
            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(67108864)), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(904911843))
                goto(Label_1038)
            }
            
            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0930)
            }
            
            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(2147483647)), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(762917266))
            }
            else {
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(4)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-1438747448))
                    goto(Label_0379)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(128)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(17478434))
                    goto(Label_0266)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-2053583715))
                    loopcontinue()
                }
                
                var_1_61 = and:int(var_1_61:int, ldc:int(1436373093))
                putstatic:\u7d52\u718f\u3776\u6fb0\ub83f(\ube23\uf9c5\u8350\u62da\ub32d::\u61a4\u8258\u4daf\ub6ab\ud7e8, invokespecial:\u7d52\u718f\u3776\u6fb0\ub83f(\ube23\uf9c5\u8350\u62da\ub32d::\u0c95\ubcb0\u5bc4\u960f\u836c, this:\ube23\uf9c5\u8350\u62da\ub32d, var_6_AC:List<\u8640\ud7e8\u8308\u4bc8\uc29a>))
                var_6_AC = invokevirtual:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\u4e72\ua6bd\u927d\uc238\ub8be::\u6b5f\ubded\u74b1\u4e72\u7e3f, getfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ube23\uf9c5\u8350\u62da\ub32d::\u8c8a\u7ce1\u6b5f\u71ae\u6cfe, this:\ube23\uf9c5\u8350\u62da\ub32d), var_4_81:float)
                
                if (logicalnot:boolean(invokevirtual:boolean(String::equals, var_5_92:String, loadelement:String[expected:Object](getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), xor:int(ldc:int(18576), ldc:int(18579)))))) {
                    if (logicalnot:boolean(invokevirtual:boolean(String::equals, var_5_92:String, loadelement:String[expected:Object](getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), xor:int(ldc:int(9474), ldc:int(9479)))))) {
                        goto(Label_0930)
                    }
                }
            }
            
            Label_0790:
            
            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_1137)
            }
            
            if (cmpne:boolean(and:int(var_1_61:int, ldc:int(1)), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(1282814005))
                goto(Label_1038)
            }
            
            if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2048)), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-2101768203))
            }
            else {
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0644)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0379)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0266)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(262144)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_1_61 = and:int(var_1_61:int, ldc:int(-847275415))
                var_6_AC = invokevirtual:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\u4e72\ua6bd\u927d\uc238\ub8be::\ub8be\u983f\u93a2\u4ab3\u071d, getfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ube23\uf9c5\u8350\u62da\ub32d::\u8c8a\u7ce1\u6b5f\u71ae\u6cfe, this:\ube23\uf9c5\u8350\u62da\ub32d), var_6_AC:List<\u8640\ud7e8\u8308\u4bc8\uc29a>)
            }
            
            Label_0930:
            
            if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2048)), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(1910560693))
                goto(Label_1137)
            }
            
            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(16777216)), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(1064735565))
            }
            else {
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0790)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0644)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(128)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-404248791))
                    goto(Label_0379)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0266)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-1036437806))
                    loopcontinue()
                }
                
                var_1_61 = and:int(var_1_61:int, ldc:int(1568113001))
                
                if (cmpeq:boolean(invokeinterface:int(List<E>::size, var_6_AC:List<\u8640\ud7e8\u8308\u4bc8\uc29a>), ldc:int(0))) {
                    putstatic:\u8640\ud7e8\u8308\u4bc8\uc29a(\ube23\uf9c5\u8350\u62da\ub32d::\ub83f\u6c52\u12cb\u3c25\u3776, aconstnull:\u8640\ud7e8\u8308\u4bc8\uc29a())
                    invokeinterface:void(List<E>::clear, getfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d))
                    putfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\u0c95\u34df\u71f1\u56bd\u4f52, this:\ube23\uf9c5\u8350\u62da\ub32d, f2i:int(invokevirtual:float(\u4e72\ua6bd\u927d\uc238\ub8be::\uae87\u9033\ubded\u71f1\u71ae, getfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ube23\uf9c5\u8350\u62da\ub32d::\u8c8a\u7ce1\u6b5f\u71ae\u6cfe, this:\ube23\uf9c5\u8350\u62da\ub32d), and:int(ldc:int(20549), ldc:int(-22872)))))
                    putfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\u71f1\u71ae\u385b\ub18d\u0c95, this:\ube23\uf9c5\u8350\u62da\ub32d, and:int(ldc:int(-8673), ldc:int(8672)))
                    putstatic:boolean(\ube23\uf9c5\u8350\u62da\ub32d::\ubb2b\uf995\uc9f6\u0c95\ubb2b, and:int[expected:boolean](ldc:int(9681), ldc:int(-11730)))
                    putfield:float(\u5245\u8cae\ub102\u4c04\u983f::\ud171\u3dd3\ud171\ud523\u8bb0, getfield:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\ub1b9\u960f\u3a62\ua6bd\u9255, this:\ube23\uf9c5\u8350\u62da\ub32d), getfield:float(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u7d52\u8709\ubefe\u7af6\u0b8e\ua61f, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b))))
                    putfield:float(\u5245\u8cae\ub102\u4c04\u983f::\uf9c5\ud158\u7330\u9255\u9937, getfield:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\ub1b9\u960f\u3a62\ua6bd\u9255, this:\ube23\uf9c5\u8350\u62da\ub32d), getfield:float(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u4d85\u71ae\u494c\u839e\uf9c5\u93a2, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b))))
                    putfield:float(\u5245\u8cae\ub102\u4c04\u983f::\ud171\u3dd3\ud171\ud523\u8bb0, getstatic:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\uc2bd\u5fe1\uc29a\u5140\ud171), getfield:float(\u5245\u8cae\ub102\u4c04\u983f::\ud171\u3dd3\ud171\ud523\u8bb0, getfield:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\ub1b9\u960f\u3a62\ua6bd\u9255, this:\ube23\uf9c5\u8350\u62da\ub32d)))
                    putfield:float(\u5245\u8cae\ub102\u4c04\u983f::\uf9c5\ud158\u7330\u9255\u9937, getstatic:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\uc2bd\u5fe1\uc29a\u5140\ud171), getfield:float(\u5245\u8cae\ub102\u4c04\u983f::\uf9c5\ud158\u7330\u9255\u9937, getfield:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\ub1b9\u960f\u3a62\ua6bd\u9255, this:\ube23\uf9c5\u8350\u62da\ub32d)))
                    putfield:float(\ube23\uf9c5\u8350\u62da\ub32d::\u6d99\u718f\uf995\u4c04\uc238, this:\ube23\uf9c5\u8350\u62da\ub32d, ldc:float(-1.0f))
                    putfield:double(\ube23\uf9c5\u8350\u62da\ub32d::\uae87\u99f7\u9033\uae5d\u52d3, this:\ube23\uf9c5\u8350\u62da\ub32d, invokestatic:double(Math::random))
                    putfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\uc2e8\ud51e\u8350\u69d9\u965f, this:\ube23\uf9c5\u8350\u62da\ub32d, ldc:int(-1))
                    return:void()
                }
            }
            
            Label_1038:
            
            if (cmpne:boolean(and:int(var_1_61:int, ldc:int(1048576)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0930)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0790)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(1684894689))
                    goto(Label_0644)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-2136119343))
                    goto(Label_0379)
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-1492753248))
                    goto(Label_0266)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(67108864)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_1_61 = and:int(var_1_61:int, ldc:int(1606169063))
                
                if (cmpeq:boolean(getfield:float(\ube23\uf9c5\u8350\u62da\ub32d::\u6d99\u718f\uf995\u4c04\uc238, this:\ube23\uf9c5\u8350\u62da\ub32d), ldc:float(-1.0f))) {
                    putfield:float(\ube23\uf9c5\u8350\u62da\ub32d::\ub102\u7ce1\u5654\ua61f\u446c, this:\ube23\uf9c5\u8350\u62da\ub32d, div:float(mul:float(invokestatic:float(Math::abs, invokestatic:float(\u3bd6\u6d99\ub113\u4d85\u71f1::\u4e72\u92ff\ud7e8\u88c5\uf94d, getfield:float(\u5245\u8cae\ub102\u4c04\u983f::\ud171\u3dd3\ud171\ud523\u8bb0, invokestatic:\u5245\u8cae\ub102\u4c04\u983f(\u71f1\u3bd6\u4daf\u6d69\u385b::\uc2bd\uc87f\u47c2\u8bb0\u8389, invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3bd6\u6d99\ub113\u4d85\u71f1::\u64f2\ubcb0\u3e75\u3e75\uc29a, invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8640\ud7e8\u8308\u4bc8\uc29a::\u51b2\u6fb0\ub102\u7006\u873d, checkcast:\u8640\ud7e8\u8308\u4bc8\uc29a(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8640\ud7e8\u8308\u4bc8\uc29a.class, invokeinterface:\u8640\ud7e8\u8308\u4bc8\uc29a(List<\u8640\ud7e8\u8308\u4bc8\uc29a>::get, var_6_AC:List<\u8640\ud7e8\u8308\u4bc8\uc29a>, and:int(ldc:int(-18017), ldc:int(18016)))))))), getfield:float(\u5245\u8cae\ub102\u4c04\u983f::\ud171\u3dd3\ud171\ud523\u8bb0, getstatic:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\uc2bd\u5fe1\uc29a\u5140\ud171)))), ldc:float(1.95f)), ldc:float(50.0f)))
                    putfield:float(\ube23\uf9c5\u8350\u62da\ub32d::\u6d99\u718f\uf995\u4c04\uc238, this:\ube23\uf9c5\u8350\u62da\ub32d, add:float(getfield:float(\ube23\uf9c5\u8350\u62da\ub32d::\u6d99\u718f\uf995\u4c04\uc238, this:\ube23\uf9c5\u8350\u62da\ub32d), ldc:float(1.0f)))
                    putfield:double(\ube23\uf9c5\u8350\u62da\ub32d::\uae87\u99f7\u9033\uae5d\u52d3, this:\ube23\uf9c5\u8350\u62da\ub32d, invokestatic:double(Math::random))
                }
            }
            
            Label_1137:
            
            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(16777216)), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(1853109439))
                goto(Label_1038)
            }
            
            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(67108864)), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-333735263))
                goto(Label_0930)
            }
            
            if (cmpne:boolean(and:int(var_1_61:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0790)
            }
            
            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0644)
            }
            
            if (cmpne:boolean(and:int(var_1_61:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0379)
            }
            
            if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2048)), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1960385250))
                goto(Label_0266)
            }
            
            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(64)), ldc:int(0))) {
                loopcontinue()
            }
            
            var_1_6B9 = and:int(var_1_61:int, ldc:int(-704860829))
            putfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d, var_6_AC:List<\u8640\ud7e8\u8308\u4bc8\uc29a>)
            var_7_4EF = getfield:float(\u5245\u8cae\ub102\u4c04\u983f::\ud171\u3dd3\ud171\ud523\u8bb0, invokestatic:\u5245\u8cae\ub102\u4c04\u983f(\u71f1\u3bd6\u4daf\u6d69\u385b::\uc2bd\uc87f\u47c2\u8bb0\u8389, invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3bd6\u6d99\ub113\u4d85\u71f1::\u64f2\ubcb0\u3e75\u3e75\uc29a, invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8640\ud7e8\u8308\u4bc8\uc29a::\u51b2\u6fb0\ub102\u7006\u873d, checkcast:\u8640\ud7e8\u8308\u4bc8\uc29a(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8640\ud7e8\u8308\u4bc8\uc29a.class, invokeinterface:\u8640\ud7e8\u8308\u4bc8\uc29a(List<\u8640\ud7e8\u8308\u4bc8\uc29a>::get, getfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d), and:int(ldc:int(13416), ldc:int(-13417))))))))
            
            if (invokeinterface:boolean(List<E>::isEmpty, getfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d))) {
                goto(Label_1277)
            }
            
            stack_6D5_0 = and:int(ldc:int(10341), ldc:int(4241))
            
            do {
                Label_1675:
                
                if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(512)), ldc:int(0))) {
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(1834418918))
                    
                    if (invokevirtual:boolean(String::equals, var_5_92:String, loadelement:String[expected:Object](getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), xor:int(ldc:int(-30463), ldc:int(-30459))))) {
                        loopcontinue()
                    }
                    
                    stack_6D5_1 = xor:int(ldc:int(4166), ldc:int(4167))
                    Label_1743:
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(255222115))
                    
                    if (cmpeq:boolean(and:int(stack_6D5_0:int, stack_6D5_1:int), ldc:int(0))) {
                        goto(Label_1753)
                    }
                    
                    if (cmpeq:boolean(getstatic:\u8640\ud7e8\u8308\u4bc8\uc29a(\ube23\uf9c5\u8350\u62da\ub32d::\ub83f\u6c52\u12cb\u3c25\u3776), aconstnull:\u8640\ud7e8\u8308\u4bc8\uc29a())) {
                        goto(Label_2771)
                    }
                    
                    if (cmpeq:boolean(invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8640\ud7e8\u8308\u4bc8\uc29a::\u51b2\u6fb0\ub102\u7006\u873d, getstatic:\u8640\ud7e8\u8308\u4bc8\uc29a(\ube23\uf9c5\u8350\u62da\ub32d::\ub83f\u6c52\u12cb\u3c25\u3776)), invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8640\ud7e8\u8308\u4bc8\uc29a::\u51b2\u6fb0\ub102\u7006\u873d, checkcast:\u8640\ud7e8\u8308\u4bc8\uc29a(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8640\ud7e8\u8308\u4bc8\uc29a.class, invokeinterface:\u8640\ud7e8\u8308\u4bc8\uc29a(List<\u8640\ud7e8\u8308\u4bc8\uc29a>::get, getfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d), and:int(ldc:int(9608), ldc:int(-9609))))))) {
                        goto(Label_2771)
                    }
                    
                    putfield:float(\ube23\uf9c5\u8350\u62da\ub32d::\ub102\u7ce1\u5654\ua61f\u446c, this:\ube23\uf9c5\u8350\u62da\ub32d, div:float(mul:float(invokestatic:float(Math::abs, invokestatic:float(\u3bd6\u6d99\ub113\u4d85\u71f1::\u4e72\u92ff\ud7e8\u88c5\uf94d, var_7_4EF:float, getfield:float(\u5245\u8cae\ub102\u4c04\u983f::\ud171\u3dd3\ud171\ud523\u8bb0, getstatic:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\uc2bd\u5fe1\uc29a\u5140\ud171)))), ldc:float(1.95f)), ldc:float(50.0f)))
                    putfield:double(\ube23\uf9c5\u8350\u62da\ub32d::\uae87\u99f7\u9033\uae5d\u52d3, this:\ube23\uf9c5\u8350\u62da\ub32d, invokestatic:double(Math::random))
                    goto(Label_2771)
                }
            } while (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(32)), ldc:int(0)))
            
            var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-577428374))
            stack_6D5_1 = and:int(ldc:int(7511), ldc:int(-32088))
            goto(Label_1743)
            Label_1277:
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(2048)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(1959861374))
                goto(Label_3849)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_3452)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(128)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-1570759024))
                goto(Label_3298)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_3027)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(4)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-1163971307))
                goto(Label_2771)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_2612)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_2436)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(128)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(1589483533))
                goto(Label_2254)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_2078)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(1)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-113291433))
                goto(Label_1920)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(16384)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(898922083))
                stack_6D5_0 = and:int(ldc:int(-32025), ldc:int(31768))
                goto(Label_1675)
            }
            
            var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-533533344))
            Label_1753:
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_3849)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(16384)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-716712523))
                goto(Label_3452)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(512)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(1325442375))
                goto(Label_3298)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_3027)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_2771)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(1)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(1804593015))
                goto(Label_2612)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(512)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(1125906949))
                goto(Label_2436)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(67108864)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(778164029))
                goto(Label_2254)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_2078)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(16384)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(512)), ldc:int(0))) {
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-2048535048))
                    goto(Label_1277)
                }
                
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-1781218592))
                
                if (invokevirtual:boolean(String::equals, var_5_92:String, loadelement:String[expected:Object](getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), and:int(ldc:int(18694), ldc:int(164))))) {
                    if (cmpeq:boolean(getstatic:\u8640\ud7e8\u8308\u4bc8\uc29a(\ube23\uf9c5\u8350\u62da\ub32d::\ub83f\u6c52\u12cb\u3c25\u3776), aconstnull:\u8640\ud7e8\u8308\u4bc8\uc29a())) {
                        goto(Label_3027)
                    }
                    
                    if (cmpeq:boolean(invokevirtual:\u0a06\u527a\ucfaf\u3711\u960f(\u8640\ud7e8\u8308\u4bc8\uc29a::\u4975\u64f2\uc229\ud171\u120d, getstatic:\u8640\ud7e8\u8308\u4bc8\uc29a(\ube23\uf9c5\u8350\u62da\ub32d::\ub83f\u6c52\u12cb\u3c25\u3776)), aconstnull:\u0a06\u527a\ucfaf\u3711\u960f())) {
                        goto(Label_3027)
                    }
                    
                    if (invokevirtual:boolean(\u8640\ud7e8\u8308\u4bc8\uc29a::\ub83f\u4f4a\u6d69\u12b2\ubded, getstatic:\u8640\ud7e8\u8308\u4bc8\uc29a(\ube23\uf9c5\u8350\u62da\ub32d::\ub83f\u6c52\u12cb\u3c25\u3776))) {
                        goto(Label_3027)
                    }
                    
                    if (logicalnot:boolean(invokeinterface:boolean(List<E>::contains, getfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d), getstatic:\u8640\ud7e8\u8308\u4bc8\uc29a[expected:Object](\ube23\uf9c5\u8350\u62da\ub32d::\ub83f\u6c52\u12cb\u3c25\u3776)))) {
                        goto(Label_3027)
                    }
                    
                    if (cmple:boolean(invokevirtual:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u98a4\ufe34\u6cfe\u3e75\u965f\u8df4, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b)), invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8640\ud7e8\u8308\u4bc8\uc29a::\u51b2\u6fb0\ub102\u7006\u873d, getstatic:\u8640\ud7e8\u8308\u4bc8\uc29a(\ube23\uf9c5\u8350\u62da\ub32d::\ub83f\u6c52\u12cb\u3c25\u3776))), var_4_81:float)) {
                        goto(Label_2254)
                    }
                    
                    goto(Label_3027)
                }
            }
            
            Label_1920:
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_3849)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(1073741824)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-922816474))
                goto(Label_3452)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(1073741824)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-1350540851))
                goto(Label_3298)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(1)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-2096560211))
                goto(Label_3027)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(1073741824)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(305347035))
                goto(Label_2771)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_2612)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_2436)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_2254)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(67108864)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(64)), ldc:int(0))) {
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-1717001279))
                    goto(Label_1753)
                }
                
                if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_1277)
                }
                
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-1223376784))
                
                if (invokevirtual:boolean(String::equals, var_5_92:String, loadelement:String[expected:Object](getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), xor:int(ldc:int(1674), ldc:int(1676))))) {
                    if (cmplt:boolean(getfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\uc31c\u4c2b\ucef1\ud4fe\u392e, this:\ube23\uf9c5\u8350\u62da\ub32d), invokeinterface:int(List<E>::size, getfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d)))) {
                        goto(Label_3849)
                    }
                    
                    putfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\uc31c\u4c2b\ucef1\ud4fe\u392e, this:\ube23\uf9c5\u8350\u62da\ub32d, and:int(ldc:int(27411), ldc:int(-31512)))
                    goto(Label_3849)
                }
            }
            
            Label_2078:
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_3849)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(4)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(1099021921))
                goto(Label_3452)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(32)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-1505830187))
                goto(Label_3298)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_3027)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(1)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-1897794559))
                goto(Label_2771)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_2612)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(2147483647)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-673179301))
                goto(Label_2436)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(1073741824)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-20032671))
            }
            else {
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(128)), ldc:int(0))) {
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(1474600565))
                    goto(Label_1920)
                }
                
                if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(988557772))
                    goto(Label_1753)
                }
                
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_1277)
                }
                
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-1344814359))
                
                if (invokevirtual:boolean(String::equals, var_5_92:String, loadelement:String[expected:Object](getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), xor:int(ldc:int(865), ldc:int(866))))) {
                    if (logicalnot:boolean(invokeinterface:boolean(List<E>::isEmpty, getfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d)))) {
                        if (logicalor:boolean(cmpeq:boolean(getstatic:\u8640\ud7e8\u8308\u4bc8\uc29a(\ube23\uf9c5\u8350\u62da\ub32d::\ub83f\u6c52\u12cb\u3c25\u3776), aconstnull:\u8640\ud7e8\u8308\u4bc8\uc29a()), cmpne:boolean(invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8640\ud7e8\u8308\u4bc8\uc29a::\u51b2\u6fb0\ub102\u7006\u873d, getstatic:\u8640\ud7e8\u8308\u4bc8\uc29a(\ube23\uf9c5\u8350\u62da\ub32d::\ub83f\u6c52\u12cb\u3c25\u3776)), invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8640\ud7e8\u8308\u4bc8\uc29a::\u51b2\u6fb0\ub102\u7006\u873d, checkcast:\u8640\ud7e8\u8308\u4bc8\uc29a(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8640\ud7e8\u8308\u4bc8\uc29a.class, invokeinterface:\u8640\ud7e8\u8308\u4bc8\uc29a(List<\u8640\ud7e8\u8308\u4bc8\uc29a>::get, getfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d), and:int(ldc:int(-970), ldc:int(969)))))))) {
                            var_1_6B9 = and:int(var_1_6B9:int, ldc:int(1733793773))
                            putstatic:\u8640\ud7e8\u8308\u4bc8\uc29a(\ube23\uf9c5\u8350\u62da\ub32d::\ub83f\u6c52\u12cb\u3c25\u3776, checkcast:\u8640\ud7e8\u8308\u4bc8\uc29a(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8640\ud7e8\u8308\u4bc8\uc29a.class, invokeinterface:\u8640\ud7e8\u8308\u4bc8\uc29a(List<\u8640\ud7e8\u8308\u4bc8\uc29a>::get, getfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d), and:int(ldc:int(-31402), ldc:int(20521)))))
                        }
                    }
                }
            }
            
            Label_2254:
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_3849)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(1)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(979355799))
                goto(Label_3452)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(1073741824)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(2079941329))
                goto(Label_3298)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(1048576)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-738961715))
                goto(Label_3027)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(1048576)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(525199356))
                goto(Label_2771)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(4)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(822707906))
                goto(Label_2612)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(16777216)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(672777498))
            }
            else {
                if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(32)), ldc:int(0))) {
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(1951984627))
                    goto(Label_2078)
                }
                
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-1658165185))
                    goto(Label_1920)
                }
                
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_1753)
                }
                
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_1277)
                }
                
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(1602084337))
                
                if (cmpge:boolean(getfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\uc31c\u4c2b\ucef1\ud4fe\u392e, this:\ube23\uf9c5\u8350\u62da\ub32d), invokeinterface:int(List<E>::size, getfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d)))) {
                    putfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\uc31c\u4c2b\ucef1\ud4fe\u392e, this:\ube23\uf9c5\u8350\u62da\ub32d, and:int(ldc:int(8235), ldc:int(-8236)))
                }
            }
            
            Label_2436:
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(128)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-1320562520))
                goto(Label_3849)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_3452)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_3298)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(1073741824)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(497874911))
                goto(Label_3027)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(1048576)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(863511290))
                goto(Label_2771)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(1)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(1836454218))
            }
            else {
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_2254)
                }
                
                if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(32)), ldc:int(0))) {
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-2099381893))
                    goto(Label_2078)
                }
                
                if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-1180328687))
                    goto(Label_1920)
                }
                
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(52044814))
                    goto(Label_1753)
                }
                
                if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_1277)
                }
                
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-973245460))
                
                if (logicalnot:boolean(invokevirtual:boolean(String::equals, var_5_92:String, loadelement:String[expected:Object](getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), xor:int(ldc:int(-32639), ldc:int(-32636)))))) {
                    invokeinterface:void(List<E>::clear, getfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d))
                    invokeinterface:boolean(List<\u8640\ud7e8\u8308\u4bc8\uc29a>::add, getfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d), getstatic:\u8640\ud7e8\u8308\u4bc8\uc29a(\ube23\uf9c5\u8350\u62da\ub32d::\ub83f\u6c52\u12cb\u3c25\u3776))
                }
            }
            
            Label_2612:
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(16384)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-2051005540))
                goto(Label_3849)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_3452)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_3298)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(512)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(1475391434))
                goto(Label_3027)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(16384)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(1875372719))
            }
            else {
                if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_2436)
                }
                
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(4)), ldc:int(0))) {
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(706320013))
                    goto(Label_2254)
                }
                
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_2078)
                }
                
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(4)), ldc:int(0))) {
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(1339558116))
                    goto(Label_1920)
                }
                
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_1753)
                }
                
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(1)), ldc:int(0))) {
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-1740040505))
                    goto(Label_1277)
                }
                
                return:void()
            }
            
            Label_2771:
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(16777216)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(821387834))
                goto(Label_3849)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(1048576)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-954493988))
                goto(Label_3452)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(1048576)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(553462051))
                goto(Label_3298)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(1048576)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-2060684980))
            }
            else {
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_2612)
                }
                
                if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(42755022))
                    goto(Label_2436)
                }
                
                if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_2254)
                }
                
                if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_2078)
                }
                
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_1920)
                }
                
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_1753)
                }
                
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(1048576)), ldc:int(0))) {
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-1778485643))
                    putstatic:\u8640\ud7e8\u8308\u4bc8\uc29a(\ube23\uf9c5\u8350\u62da\ub32d::\ub83f\u6c52\u12cb\u3c25\u3776, checkcast:\u8640\ud7e8\u8308\u4bc8\uc29a(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8640\ud7e8\u8308\u4bc8\uc29a.class, invokeinterface:\u8640\ud7e8\u8308\u4bc8\uc29a(List<\u8640\ud7e8\u8308\u4bc8\uc29a>::get, getfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d), and:int(ldc:int(-14803), ldc:int(6546)))))
                    goto(Label_1753)
                }
                
                goto(Label_1277)
            }
            
            Label_3027:
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_3849)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_3452)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(128)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-515542448))
            }
            else {
                if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_2771)
                }
                
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_2612)
                }
                
                if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_2436)
                }
                
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(4)), ldc:int(0))) {
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(1812806215))
                    goto(Label_2254)
                }
                
                if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(1048576)), ldc:int(0))) {
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-933718623))
                    goto(Label_2078)
                }
                
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(512)), ldc:int(0))) {
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(293350267))
                    goto(Label_1920)
                }
                
                if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_1753)
                }
                
                if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(32)), ldc:int(0))) {
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-1583629054))
                    goto(Label_1277)
                }
                
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(1966479462))
                
                if (cmple:boolean(invokeinterface:int(List<E>::size, getfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d)), ldc:int(0))) {
                    goto(Label_2254)
                }
                
                if (cmpge:boolean(add:int(getfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\uc31c\u4c2b\ucef1\ud4fe\u392e, this:\ube23\uf9c5\u8350\u62da\ub32d), and:int(ldc:int(20737), ldc:int(1185))), invokeinterface:int(List<E>::size, getfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d)))) {
                    putfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\uc31c\u4c2b\ucef1\ud4fe\u392e, this:\ube23\uf9c5\u8350\u62da\ub32d, and:int(ldc:int(25362), ldc:int(-25363)))
                    goto(Label_3452)
                }
            }
            
            Label_3298:
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(2048)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(750399338))
                goto(Label_3849)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(512)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_3027)
                }
                
                if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(1048576)), ldc:int(0))) {
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(279415747))
                    goto(Label_2771)
                }
                
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(128)), ldc:int(0))) {
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-1200202224))
                    goto(Label_2612)
                }
                
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(4)), ldc:int(0))) {
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(2098447981))
                    goto(Label_2436)
                }
                
                if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_2254)
                }
                
                if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(64)), ldc:int(0))) {
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(1233205545))
                    goto(Label_2078)
                }
                
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_1920)
                }
                
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(128)), ldc:int(0))) {
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-1030508439))
                    goto(Label_1753)
                }
                
                if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_1277)
                }
                
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-1386269569))
                
                if (cmpne:boolean(getstatic:\u8640\ud7e8\u8308\u4bc8\uc29a(\ube23\uf9c5\u8350\u62da\ub32d::\ub83f\u6c52\u12cb\u3c25\u3776), aconstnull:\u8640\ud7e8\u8308\u4bc8\uc29a())) {
                    if (logicalnot:boolean(invokevirtual:boolean(\u7873\u4d85\u836c\ubff1\ubf56::\u946b\u3776\ufcaf\u7330\u1833, invokevirtual:\u7873\u4d85\u836c\ubff1\ubf56(\u6b0d\ua068\uc4d2\u5245\u4d85::\u760c\u98a4\u7c6b\u0b8e\u983f, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8640\ud7e8\u8308\u4bc8\uc29a::\u51b2\u6fb0\ub102\u7006\u873d, checkcast:\u8640\ud7e8\u8308\u4bc8\uc29a(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8640\ud7e8\u8308\u4bc8\uc29a.class, invokeinterface:\u8640\ud7e8\u8308\u4bc8\uc29a(List<\u8640\ud7e8\u8308\u4bc8\uc29a>::get, getfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d), getfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\uc31c\u4c2b\ucef1\ud4fe\u392e, this:\ube23\uf9c5\u8350\u62da\ub32d))))))) {
                        putfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\uc31c\u4c2b\ucef1\ud4fe\u392e, this:\ube23\uf9c5\u8350\u62da\ub32d, add:int(getfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\uc31c\u4c2b\ucef1\ud4fe\u392e, this:\ube23\uf9c5\u8350\u62da\ub32d), and:int(ldc:int(257), ldc:int(547))))
                    }
                }
            }
            
            Label_3452:
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(1)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_3298)
                }
                
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_3027)
                }
                
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-806041295))
                    goto(Label_2771)
                }
                
                if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(32)), ldc:int(0))) {
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-1674483951))
                    goto(Label_2612)
                }
                
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_2436)
                }
                
                if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_2254)
                }
                
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_2078)
                }
                
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(512)), ldc:int(0))) {
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(960634977))
                    goto(Label_1920)
                }
                
                if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(64)), ldc:int(0))) {
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-1921777751))
                    goto(Label_1753)
                }
                
                if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(1)), ldc:int(0))) {
                    var_1_6B9 = and:int(var_1_6B9:int, ldc:int(1526641954))
                    goto(Label_1277)
                }
                
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-1080224928))
                putfield:float(\ube23\uf9c5\u8350\u62da\ub32d::\ub102\u7ce1\u5654\ua61f\u446c, this:\ube23\uf9c5\u8350\u62da\ub32d, div:float(mul:float(invokestatic:float(Math::abs, invokestatic:float(\u3bd6\u6d99\ub113\u4d85\u71f1::\u4e72\u92ff\ud7e8\u88c5\uf94d, getfield:float(\u5245\u8cae\ub102\u4c04\u983f::\ud171\u3dd3\ud171\ud523\u8bb0, invokestatic:\u5245\u8cae\ub102\u4c04\u983f(\u71f1\u3bd6\u4daf\u6d69\u385b::\uc2bd\uc87f\u47c2\u8bb0\u8389, invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3bd6\u6d99\ub113\u4d85\u71f1::\u64f2\ubcb0\u3e75\u3e75\uc29a, invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8640\ud7e8\u8308\u4bc8\uc29a::\u51b2\u6fb0\ub102\u7006\u873d, checkcast:\u8640\ud7e8\u8308\u4bc8\uc29a(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8640\ud7e8\u8308\u4bc8\uc29a.class, invokeinterface:\u8640\ud7e8\u8308\u4bc8\uc29a(List<\u8640\ud7e8\u8308\u4bc8\uc29a>::get, getfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d), getfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\uc31c\u4c2b\ucef1\ud4fe\u392e, this:\ube23\uf9c5\u8350\u62da\ub32d))))))), getfield:float(\u5245\u8cae\ub102\u4c04\u983f::\ud171\u3dd3\ud171\ud523\u8bb0, getstatic:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\uc2bd\u5fe1\uc29a\u5140\ud171)))), ldc:float(1.95f)), ldc:float(50.0f)))
                putfield:double(\ube23\uf9c5\u8350\u62da\ub32d::\uae87\u99f7\u9033\uae5d\u52d3, this:\ube23\uf9c5\u8350\u62da\ub32d, invokestatic:double(Math::random))
                putstatic:\u8640\ud7e8\u8308\u4bc8\uc29a(\ube23\uf9c5\u8350\u62da\ub32d::\ub83f\u6c52\u12cb\u3c25\u3776, initobject:\u8640\ud7e8\u8308\u4bc8\uc29a(\u8640\ud7e8\u8308\u4bc8\uc29a::<init>, invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8640\ud7e8\u8308\u4bc8\uc29a::\u51b2\u6fb0\ub102\u7006\u873d, checkcast:\u8640\ud7e8\u8308\u4bc8\uc29a(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8640\ud7e8\u8308\u4bc8\uc29a.class, invokeinterface:\u8640\ud7e8\u8308\u4bc8\uc29a(List<\u8640\ud7e8\u8308\u4bc8\uc29a>::get, getfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d), getfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\uc31c\u4c2b\ucef1\ud4fe\u392e, this:\ube23\uf9c5\u8350\u62da\ub32d)))), initobject:\u0a06\u527a\ucfaf\u3711\u960f(\u0a06\u527a\ucfaf\u3711\u960f::<init>, ternaryop:long(invokevirtual:boolean(String::equals, invokevirtual:String(\ud158\u839e\u7006\uc3e3\u446c::\u5140\u8bb0\uc84e\u4179\ubcb0, this:\ube23\uf9c5\u8350\u62da\ub32d[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), xor:int(ldc:int(133), ldc:int(146)))), loadelement:String[expected:Object](getstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389), and:int(ldc:int(15), ldc:int(19529)))), ldc:long(270L), ldc:long(500L)))))
                goto(Label_2254)
            }
            
            Label_3849:
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(512)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-605260177))
                goto(Label_3452)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_3298)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(16777216)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(675498124))
                goto(Label_3027)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(2147483647)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-375657554))
                goto(Label_2771)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(2048)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-493909655))
                goto(Label_2612)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(1)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(-1246250456))
                goto(Label_2436)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_2254)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_2078)
            }
            
            if (cmpeq:boolean(and:int(var_1_6B9:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_1920)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_1753)
            }
            
            if (cmpne:boolean(and:int(var_1_6B9:int, ldc:int(1048576)), ldc:int(0))) {
                var_1_6B9 = and:int(var_1_6B9:int, ldc:int(525666168))
                putstatic:\u8640\ud7e8\u8308\u4bc8\uc29a(\ube23\uf9c5\u8350\u62da\ub32d::\ub83f\u6c52\u12cb\u3c25\u3776, checkcast:\u8640\ud7e8\u8308\u4bc8\uc29a(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8640\ud7e8\u8308\u4bc8\uc29a.class, invokeinterface:\u8640\ud7e8\u8308\u4bc8\uc29a(List<\u8640\ud7e8\u8308\u4bc8\uc29a>::get, getfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, this:\ube23\uf9c5\u8350\u62da\ub32d), getfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\uc31c\u4c2b\ucef1\ud4fe\u392e, this:\ube23\uf9c5\u8350\u62da\ub32d))))
                goto(Label_2254)
            }
            
            goto(Label_1277)
        }
    }
    
    private void \ud36e\u3711\uc87f\ucef1\ud12e() {
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
    
    private double \u8350\u183a\u6b5f\uc229\ud12e(double p0, double p1) {
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
            return:double(add:double(p0:double, mul:double(invokestatic:double(Math::random), sub:double(p1:double, p0:double))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\ubded\u97b7\u0a06\u62da\u8258$3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
            return:boolean(and:int[expected:boolean](ldc:int(16409), ldc:int(12933)))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\ud51e\ub1b9\u8d98\u7af6\u071d$2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
            return:boolean(xor:int[expected:boolean](ldc:int(17408), ldc:int(17409)))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u99f7\ub70c\u9a18\u6cfe\u839e$1(\u3504\ufe34\u600f\u6b0d\u69d9.\uc246\u71f1\ua068\u59ec\u516c p0) {
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
            invokevirtual:void(\u4e72\ua6bd\u927d\uc238\ub8be::\u7c6b\u4cd9\uc3e3\u16f6\u6bb9, getfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ube23\uf9c5\u8350\u62da\ub32d::\u8c8a\u7ce1\u6b5f\u71ae\u6cfe, this:\ube23\uf9c5\u8350\u62da\ub32d))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u67e9\u1833\u51fa\u98a4\u3711$0(\u3504\ufe34\u600f\u6b0d\u69d9.\uc246\u71f1\ua068\u59ec\u516c p0) {
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
            invokevirtual:void(\u4e72\ua6bd\u927d\uc238\ub8be::\u7c6b\u4cd9\uc3e3\u16f6\u6bb9, getfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ube23\uf9c5\u8350\u62da\ub32d::\u8c8a\u7ce1\u6b5f\u71ae\u6cfe, this:\ube23\uf9c5\u8350\u62da\ub32d))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 \u927d\ud12e\u8350\u5d20\u6c52() {
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
            return:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b))
        }
        
        goto(Label_0006)
    }
    
    public static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 \u62da\u4c2b\u3d64\u3d64\u6b0d() {
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
            return:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b))
        }
        
        goto(Label_0006)
    }
    
    public static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 \u74b1\u69d9\u7e3f\ua3b4\u88c5() {
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
            return:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b))
        }
        
        goto(Label_0006)
    }
    
    public static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 \u5654\ub8be\u59ec\ua562\u4d85() {
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
            return:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b))
        }
        
        goto(Label_0006)
    }
    
    public static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 \u494c\u7af6\u183a\u9af2\u927d() {
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
            return:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b))
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u5245\u8cae\ub102\u4c04\u983f \u36d3\u4975\uae87\u873d\u6d69(\ub113\ufcaf\u3c25\u071d\u97b7.\ube23\uf9c5\u8350\u62da\ub32d p0) {
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
            return:\u5245\u8cae\ub102\u4c04\u983f(getfield:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\u183a\ub18d\u3504\ubff1\u4cd9, p0:\ube23\uf9c5\u8350\u62da\ub32d))
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u5245\u8cae\ub102\u4c04\u983f \u3dd3\u5140\u3d4b\u960f\ua6bd(\ub113\ufcaf\u3c25\u071d\u97b7.\ube23\uf9c5\u8350\u62da\ub32d p0) {
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
            return:\u5245\u8cae\ub102\u4c04\u983f(getfield:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\ub1b9\u960f\u3a62\ua6bd\u9255, p0:\ube23\uf9c5\u8350\u62da\ub32d))
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u4e72\ua6bd\u927d\uc238\ub8be \u600f\u64ab\u4d85\ub19c\u446c(\ub113\ufcaf\u3c25\u071d\u97b7.\ube23\uf9c5\u8350\u62da\ub32d p0) {
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
            return:\u4e72\ua6bd\u927d\uc238\ub8be(getfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ube23\uf9c5\u8350\u62da\ub32d::\u8c8a\u7ce1\u6b5f\u71ae\u6cfe, p0:\ube23\uf9c5\u8350\u62da\ub32d))
        }
        
        goto(Label_0006)
    }
    
    public static java.util.List \uc9f6\u16f6\u69d9\u8d90\u3e75(\ub113\ufcaf\u3c25\u071d\u97b7.\ube23\uf9c5\u8350\u62da\ub32d p0) {
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
            return:List(getfield:List<\u8640\ud7e8\u8308\u4bc8\uc29a>(\ube23\uf9c5\u8350\u62da\ub32d::\u3bc9\uf9c5\u4c04\u6cfe\u3dd3, p0:\ube23\uf9c5\u8350\u62da\ub32d))
        }
        
        goto(Label_0006)
    }
    
    public static int \u494c\u0b8e\u7ce1\ufe34\u6c52(\ub113\ufcaf\u3c25\u071d\u97b7.\ube23\uf9c5\u8350\u62da\ub32d p0) {
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
            return:int(getfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\uc31c\u4c2b\ucef1\ud4fe\u392e, p0:\ube23\uf9c5\u8350\u62da\ub32d))
        }
        
        goto(Label_0006)
    }
    
    public static int \u7043\uc9f6\u52d3\u64f2\u97e6(\ub113\ufcaf\u3c25\u071d\u97b7.\ube23\uf9c5\u8350\u62da\ub32d p0, int p1) {
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
            return:int(putfield:int(\ube23\uf9c5\u8350\u62da\ub32d::\uc31c\u4c2b\ucef1\ud4fe\u392e, p0:\ube23\uf9c5\u8350\u62da\ub32d, p1:int))
        }
        
        goto(Label_0006)
    }
    
    public static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 \u6d99\ud12e\u927d\u4daf\ua61f() {
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
            return:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ube23\uf9c5\u8350\u62da\ub32d::\u64f2\u8350\u0b8e\u64f2\u946b))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_9AA : int
        expr_6E : int [generated]
        stack_8B_0 : byte[] [generated]
        stack_8D_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_E5_0 : byte[] [generated]
        stack_92E_0 : byte[] [generated]
        stack_9BD_0 : byte[] [generated]
        stack_A14_0 : byte[] [generated]
        var_4_90F : int
        var_3_914 : byte[]
        var_5_915 : int
        var_0_924 : int
        expr_92E : byte [generated]
        stack_977_2 : byte [generated]
        stack_954_0 : byte [generated]
        expr_9BD : byte [generated]
        expr_8D : int [generated]
        var_2_B3 : byte[]
        expr_B7 : int [generated]
        var_3_A02 : byte[]
        var_5_A03 : int
        var_3_F1 : String
        stack_8F2_0 : String[] [generated]
        expr_103 : String[] [generated]
        
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
        var_0_9AA = and:int(ldc:int(330029143), ldc:int(-267661963))
        expr_6E = arraylength:int(stack_8B_0 = stack_8D_0 = stack_B3_0 = stack_B5_0 = stack_E5_0 = stack_92E_0 = stack_9BD_0 = stack_A14_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("//7g3/0NFbT/Ovm8B0GpDEgDs/1HCQOqEkvjAQq5w0A0Cwzw+hHD/Dy6Fz35DLUNQuf6yh0+4wICEgPn+AEIER4D4ewLIwbm5fsJtiNG2fkaG/Hl+wkGwPtCAvUByv1LvvdA8/QWDKoSSuP9Af0GyhYz6L8ISAn36gkADyEF7+8cEeTvvAI1Bwn4Af31uA1Q868dQakMO/MbAQkb6++8AjUHCfgB/fW4DVDzrx1BqRxF8w/9AgELDunl9goD+wG8I0bZ+Rob8OX2Bxb56AkI/w279FgE5fsJBsD7NgoB/QDwDyYM1eoFuyk+3wq9JDjfBwAGFP38/+jQKDHw/+jQJzHe+wG8M0nP/AIZ/en7AbwzSc/8ArkPP+8a9AcK5vwD+w0NEQzZ8QAPC/IEFfLzCfgB/bUERroHOvMbAQkvFf32DZ3zPdn/ECIaD53TOboXOv8K8gUDGvTWBxn1DATbFB2xADfovwhcA++8Aj/z/wb+ugVICQOqAknzBRQT8fO8GUrpuvdLCP33+hX+87wZSdgCAv4Z+/S8+Uv6+AEIER7s6rz5Sgm690sI/ff6Ff7zvPlDCvv9C/ABBbUEQAoB/QD8KfXqvPlH+Q8U6vYaGurqvAlM7A/79Bca6uq8CU338/EVC6sNWfHq+Qr9+SoO5vgA+OwkBO79+Qr8D7XzWwPl9goD+wEc+vX7/QvwAQUV+eQHJRPn7xz+2gEs9dIRKvjuvRF1EPDL8r0RdRCQ4DXvGvQHCOS/KXMQ8MvavylzEJDgNe8a9AcI5P8QI/Tc+RoH5g8U6vYaGv3WAQELF9wBAbsqUw8GzZkWVPHq+SoA2AAqBtkP+/QXKvLcDRsD2hMS2/O0LUzP/AIp/dz8Ain93PwCuQ8/7xr0FwvsCfX3+/8kAeb2BgDoBcMnQdn5KgnQ/cEGQwr9+Qr8D7UDTO/99ga/DU3o8sINRPz7Afz6BToDxv/8DjHz0//8DsEGSvn2BgDoBRM088r9CgIiAdgSE6UiSsMBCikA0/wO+x8J4RGrEkfZ+SoZ3vrz9jT35wryBbP9PwoB/QDwD8YNN/gKAfX4xQ9J7/sNMejWGSHn3xnBITDKvxhL4/wBCcr9P/n/EDLryr8YTv+2AUD5vAdO5/vFBED5/bwHWrTxPwoB/QDwDzbx2woB9fjFD0nv+w0x+Nr8HAPasANcBOX7CbYDSPn8A/sNDbG/Dv8C+OtwPdgI+AIF47PQ")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_90F = expr_6E:int
        var_3_914 = newarray:byte[](byte.class, expr_6E:int)
        var_5_915 = expr_6E:int
        Label_2327:
        
        while (cmpeq:boolean(and:int(var_0_9AA:int, ldc:int(32)), ldc:int(0))) {
            var_0_924 = and:int(var_0_9AA:int, ldc:int(1982594139))
            var_5_915 = add:int(var_5_915:int, ldc:int(-1))
            expr_92E = stack_977_2 = loadelement(stack_92E_0, var_5_915)
            
            if (cmplt:boolean(add:int(add:int(var_5_915:int, ldc:int(2)), neg:int(var_4_90F:int)), ldc:int(0))) {
                stack_977_2 = stack_954_0 = add:byte(expr_92E:byte, loadelement:byte(var_3_914:byte[], add:int(var_5_915:int, ldc:int(2))))
                goto(Label_2404)
            }
            
            Label_2363:
            
            if (cmpeq:boolean(and:int(var_0_924:int, ldc:int(524288)), ldc:int(0))) {
                var_0_924 = and:int(var_0_924:int, ldc:int(-1900074096))
            }
            else {
                var_0_924 = and:int(var_0_924:int, ldc:int(1047260787))
                stack_977_2 = stack_954_0 = add:byte(expr_92E:byte, ldc:byte(2))
            }
            
            Label_2404:
            
            if (cmpne:boolean(and:int(var_0_924:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_2363)
            }
            
            var_0_9AA = and:int(var_0_924:int, ldc:int(-1080033573))
            storeelement:byte(var_3_914:byte[], var_5_915:int, stack_977_2:byte)
            
            if (cmpne:boolean(var_5_915:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8D_0 = stack_8B_0 = stack_B3_0 = stack_B5_0 = stack_E5_0 = stack_92E_0 = stack_9BD_0 = stack_A14_0 = var_3_914:byte[]
            goto(Label_0115)
        }
        
        Label_2461:
        
        while (cmpeq:boolean(and:int(var_0_9AA:int, ldc:int(32)), ldc:int(0))) {
            var_0_9AA = and:int(var_0_9AA:int, ldc:int(-1678772107))
            var_5_915 = add:int(var_5_915:int, ldc:int(-1))
            expr_9BD = loadelement:byte(stack_9BD_0:byte[], var_5_915:int)
            storeelement:byte(var_3_914:byte[], var_5_915:int, xor:int(add:int(or:int(and:int(shl:int(expr_9BD:byte, and:int(ldc:int(17284), ldc:int(8244))), ldc:int(-16)), and:int(shr:int(expr_9BD:byte[expected:int], and:int(ldc:int(11277), ldc:int(964))), ldc:int(15))), ldc:int(48)), ldc:int(77)))
            
            if (cmpne:boolean(var_5_915:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8D_0 = stack_8B_0 = stack_B3_0 = stack_B5_0 = stack_E5_0 = stack_92E_0 = stack_9BD_0 = stack_A14_0 = var_3_914:byte[]
            goto(Label_0146)
        }
        
        var_0_9AA = and:int(var_0_9AA:int, ldc:int(1885906573))
        goto(Label_2327)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_9AA:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0188)
        }
        
        if (cmpeq:boolean(and:int(var_0_9AA:int, ldc:int(262144)), ldc:int(0))) {
            var_0_9AA = and:int(var_0_9AA:int, ldc:int(-1148454153))
            expr_8D = arraylength:int(stack_8D_0:byte[])
            
            if (cmpne:boolean(expr_8D:int, ldc:int(0))) {
                var_4_90F = expr_8D:int
                var_3_914 = newarray:byte[](byte.class, expr_8D:int)
                var_5_915 = expr_8D:int
                goto(Label_2461)
            }
        }
        
        Label_0146:
        
        if (cmpne:boolean(and:int(var_0_9AA:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_9AA = and:int(var_0_9AA:int, ldc:int(-566132180))
        }
        else {
            if (cmpne:boolean(and:int(var_0_9AA:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_9AA = and:int(var_0_9AA:int, ldc:int(-1820591779))
            var_2_B3 = stack_B3_0:byte[]
            expr_B7 = add:int(arraylength:int(stack_B5_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_B7:int, ldc:int(0))) {
                var_3_A02 = newarray:byte[](byte.class, expr_B7:int)
                var_5_A03 = expr_B7:int
                
                loop {
                    var_0_9AA = and:int(var_0_9AA:int, ldc:int(1030486491))
                    var_5_A03 = add:int(var_5_A03:int, ldc:int(-1))
                    storeelement:byte(var_3_A02:byte[], var_5_A03:int, add:int(shl:int(loadelement:byte(stack_A14_0:byte[], var_5_A03:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_B3:byte[], add:int(var_5_A03:int, xor:int(ldc:int(24576), ldc:int(24577)))), ldc:int(4)), xor:int(ldc:int(-30653), ldc:int(-30644)))))
                    
                    if (cmpne:boolean(var_5_A03:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8D_0 = stack_8B_0 = stack_B3_0 = stack_B5_0 = stack_E5_0 = stack_92E_0 = stack_9BD_0 = stack_A14_0 = var_3_A02:byte[]
            }
        }
        
        Label_0188:
        
        if (cmpeq:boolean(and:int(var_0_9AA:int, ldc:int(65536)), ldc:int(0))) {
            var_0_9AA = and:int(var_0_9AA:int, ldc:int(-890375117))
            goto(Label_0146)
        }
        
        if (cmpeq:boolean(and:int(var_0_9AA:int, ldc:int(64)), ldc:int(0))) {
            var_0_9AA = and:int(var_0_9AA:int, ldc:int(297102055))
            goto(Label_0115)
        }
        
        var_3_F1 = initobject:String(String::<init>, stack_E5_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_8F2_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(20526), ldc:int(20581)))
        expr_103 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(24651), ldc:int(4299)))
        storeelement:String(expr_103:String[], xor:int(ldc:int(556), ldc:int(565)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(26777), ldc:int(-27034)), xor:int(ldc:int(2144), ldc:int(2147))))
        storeelement:String(expr_103:String[], and:int(ldc:int(1342), ldc:int(124)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(4353), ldc:int(4354)), and:int(ldc:int(5182), ldc:int(9014))))
        storeelement:String(expr_103:String[], and:int(ldc:int(2590), ldc:int(12336)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(54), ldc:int(318)), and:int(ldc:int(511), ldc:int(6203))))
        storeelement:String(expr_103:String[], and:int(ldc:int(428), ldc:int(18541)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(19259), ldc:int(4223)), xor:int(ldc:int(-23540), ldc:int(-23474))))
        storeelement:String(expr_103:String[], and:int(ldc:int(177), ldc:int(9311)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(2131), ldc:int(30310)), and:int(ldc:int(10311), ldc:int(4423))))
        storeelement:String(expr_103:String[], and:int(ldc:int(19), ldc:int(20511)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(10311), ldc:int(4439)), and:int(ldc:int(25682), ldc:int(122))))
        storeelement:String(expr_103:String[], and:int(ldc:int(1108), ldc:int(535)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(9559), ldc:int(18514)), and:int(ldc:int(8318), ldc:int(1150))))
        storeelement:String(expr_103:String[], and:int(ldc:int(87), ldc:int(8803)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(17279), ldc:int(11390)), xor:int(ldc:int(-31699), ldc:int(-31569))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(556), ldc:int(617)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(12523), ldc:int(2438)), xor:int(ldc:int(8759), ldc:int(8875))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(-32360), ldc:int(-32292)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(2268), ldc:int(12477)), xor:int(ldc:int(1133), ldc:int(1237))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(-32750), ldc:int(-32747)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(27320), ldc:int(187)), xor:int(ldc:int(22203), ldc:int(22141))))
        storeelement:String(expr_103:String[], and:int(ldc:int(3075), ldc:int(4405)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(-31970), ldc:int(-31784)), xor:int(ldc:int(496), ldc:int(276))))
        storeelement:String(expr_103:String[], and:int(ldc:int(18633), ldc:int(844)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(18617), ldc:int(18525)), and:int(ldc:int(247), ldc:int(17141))))
        storeelement:String(expr_103:String[], and:int(ldc:int(3326), ldc:int(4106)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(-32541), ldc:int(-32746)), and:int(ldc:int(29951), ldc:int(763))))
        storeelement:String(expr_103:String[], and:int(ldc:int(9291), ldc:int(23343)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(622), ldc:int(661)), xor:int(ldc:int(272), ldc:int(17))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(1035), ldc:int(1044)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(8294), ldc:int(8551)), and:int(ldc:int(29068), ldc:int(844))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(-24056), ldc:int(-24024)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(18190), ldc:int(4428)), xor:int(ldc:int(18705), ldc:int(18444))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(-32409), ldc:int(-32429)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(20765), ldc:int(9053)), and:int(ldc:int(29117), ldc:int(869))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(316), ldc:int(374)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(2050), ldc:int(2343)), and:int(ldc:int(17710), ldc:int(6590))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(4915), ldc:int(4875)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(16601), ldc:int(16887)), xor:int(ldc:int(-24571), ldc:int(-24261))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(-24549), ldc:int(-24540)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(8510), ldc:int(1343)), xor:int(ldc:int(51), ldc:int(370))))
        storeelement:String(expr_103:String[], and:int(ldc:int(16739), ldc:int(5833)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(20613), ldc:int(20932)), and:int(ldc:int(975), ldc:int(24938))))
        storeelement:String(expr_103:String[], and:int(ldc:int(24670), ldc:int(1121)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(12666), ldc:int(1866)), xor:int(ldc:int(10577), ldc:int(10249))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(580), ldc:int(587)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(8536), ldc:int(16891)), and:int(ldc:int(5470), ldc:int(25086))))
        storeelement:String(expr_103:String[], and:int(ldc:int(819), ldc:int(4147)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(8670), ldc:int(17279)), xor:int(ldc:int(-28521), ldc:int(-28183))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(146), ldc:int(180)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(1020), ldc:int(642)), xor:int(ldc:int(4397), ldc:int(4257))))
        storeelement:String(expr_103:String[], and:int(ldc:int(5159), ldc:int(16495)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(4821), ldc:int(4953)), and:int(ldc:int(2974), ldc:int(5622))))
        storeelement:String(expr_103:String[], and:int(ldc:int(18543), ldc:int(173)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(2454), ldc:int(12694)), and:int(ldc:int(4543), ldc:int(25057))))
        storeelement:String(expr_103:String[], and:int(ldc:int(8245), ldc:int(237)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(19472), ldc:int(19889)), xor:int(ldc:int(-32397), ldc:int(-32548))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(2469), ldc:int(2452)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(19391), ldc:int(495)), xor:int(ldc:int(-12053), ldc:int(-11985))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(20520), ldc:int(20487)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(11756), ldc:int(16852)), and:int(ldc:int(10744), ldc:int(2007))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(-31663), ldc:int(-31622)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(-31743), ldc:int(-31279)), xor:int(ldc:int(20978), ldc:int(20521))))
        storeelement:String(expr_103:String[], and:int(ldc:int(1791), ldc:int(12599)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(2559), ldc:int(25051)), xor:int(ldc:int(2095), ldc:int(2496))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(-31718), ldc:int(-31661)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(28159), ldc:int(4591)), xor:int(ldc:int(2231), ldc:int(2369))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(2062), ldc:int(2086)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(4606), ldc:int(11766)), and:int(ldc:int(540), ldc:int(22090))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(71), ldc:int(119)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(8395), ldc:int(8899)), xor:int(ldc:int(1338), ldc:int(1835))))
        storeelement:String(expr_103:String[], and:int(ldc:int(16617), ldc:int(-17130)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(4532), ldc:int(5029)), xor:int(ldc:int(148), ldc:int(653))))
        storeelement:String(expr_103:String[], and:int(ldc:int(671), ldc:int(4187)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(12637), ldc:int(13124)), and:int(ldc:int(549), ldc:int(20017))))
        storeelement:String(expr_103:String[], and:int(ldc:int(555), ldc:int(1075)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(619), ldc:int(4897)), xor:int(ldc:int(6311), ldc:int(6799))))
        storeelement:String(expr_103:String[], and:int(ldc:int(373), ldc:int(548)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(3628), ldc:int(888)), xor:int(ldc:int(16564), ldc:int(17025))))
        storeelement:String(expr_103:String[], and:int(ldc:int(16425), ldc:int(949)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(17207), ldc:int(4661)), and:int(ldc:int(572), ldc:int(767))))
        storeelement:String(expr_103:String[], and:int(ldc:int(8418), ldc:int(16418)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(-31731), ldc:int(-31183)), xor:int(ldc:int(8264), ldc:int(8705))))
        storeelement:String(expr_103:String[], and:int(ldc:int(583), ldc:int(327)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(1609), ldc:int(19055)), xor:int(ldc:int(6217), ldc:int(6663))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(210), ldc:int(208)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(590), ldc:int(3662)), and:int(ldc:int(2651), ldc:int(2038))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(164), ldc:int(138)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(10412), ldc:int(11006)), xor:int(ldc:int(1715), ldc:int(1257))))
        storeelement:String(expr_103:String[], and:int(ldc:int(8335), ldc:int(37)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(18015), ldc:int(634)), and:int(ldc:int(2783), ldc:int(863))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(15), ldc:int(9)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(26021), ldc:int(26618)), xor:int(ldc:int(261), ldc:int(864))))
        storeelement:String(expr_103:String[], and:int(ldc:int(15), ldc:int(5465)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(17269), ldc:int(613)), and:int(ldc:int(8808), ldc:int(19305))))
        storeelement:String(expr_103:String[], and:int(ldc:int(2934), ldc:int(54)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(4712), ldc:int(877)), xor:int(ldc:int(483), ldc:int(915))))
        storeelement:String(expr_103:String[], and:int(ldc:int(3116), ldc:int(16584)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(23156), ldc:int(9842)), xor:int(ldc:int(320), ldc:int(820))))
        storeelement:String(expr_103:String[], and:int(ldc:int(1327), ldc:int(10474)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(5625), ldc:int(6029)), xor:int(ldc:int(8788), ldc:int(8239))))
        storeelement:String(expr_103:String[], and:int(ldc:int(3318), ldc:int(29215)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(17275), ldc:int(4863)), xor:int(ldc:int(2053), ldc:int(2682))))
        storeelement:String(expr_103:String[], and:int(ldc:int(87), ldc:int(8221)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(26239), ldc:int(2687)), xor:int(ldc:int(987), ldc:int(345))))
        storeelement:String(expr_103:String[], and:int(ldc:int(4662), ldc:int(274)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(17354), ldc:int(9858)), xor:int(ldc:int(25), ldc:int(661))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(16412), ldc:int(16402)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(-31109), ldc:int(-31497)), and:int(ldc:int(2713), ldc:int(1745))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(17689), ldc:int(17671)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(3741), ldc:int(13201)), xor:int(ldc:int(97), ldc:int(765))))
        storeelement:String(expr_103:String[], and:int(ldc:int(10742), ldc:int(16955)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(29374), ldc:int(2780)), and:int(ldc:int(6884), ldc:int(17061))))
        storeelement:String(expr_103:String[], and:int(ldc:int(279), ldc:int(2111)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(1724), ldc:int(8870)), and:int(ldc:int(753), ldc:int(21177))))
        storeelement:String(expr_103:String[], and:int(ldc:int(617), ldc:int(4143)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(-32341), ldc:int(-31974)), xor:int(ldc:int(14533), ldc:int(14870))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(2115), ldc:int(2174)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(723), ldc:int(10227)), xor:int(ldc:int(-32643), ldc:int(-32092))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(-32369), ldc:int(-32335)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(25238), ldc:int(24655)), xor:int(ldc:int(-28260), ldc:int(-27787))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(-31479), ldc:int(-31478)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(4842), ldc:int(4099)), and:int(ldc:int(6127), ldc:int(751))))
        storeelement:String(expr_103:String[], and:int(ldc:int(26683), ldc:int(1151)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(3823), ldc:int(21231)), and:int(ldc:int(26362), ldc:int(762))))
        storeelement:String(expr_103:String[], and:int(ldc:int(2171), ldc:int(9242)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(-32501), ldc:int(-31759)), and:int(ldc:int(832), ldc:int(17173))))
        storeelement:String(expr_103:String[], and:int(ldc:int(1229), ldc:int(18445)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(16945), ldc:int(16689)), and:int(ldc:int(4873), ldc:int(843))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(16421), ldc:int(16417)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(26477), ldc:int(4873)), xor:int(ldc:int(21778), ldc:int(22045))))
        storeelement:String(expr_103:String[], and:int(ldc:int(25786), ldc:int(831)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(4978), ldc:int(4221)), xor:int(ldc:int(737), ldc:int(461))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(4117), ldc:int(4105)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(787), ldc:int(63)), xor:int(ldc:int(17130), ldc:int(16858))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(5221), ldc:int(5240)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(824), ldc:int(822)), xor:int(ldc:int(11056), ldc:int(10245))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(4404), ldc:int(4470)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(821), ldc:int(821)), xor:int(ldc:int(1480), ldc:int(1677))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(-31467), ldc:int(-31475)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(-32657), ldc:int(-31958)), and:int(ldc:int(11110), ldc:int(21366))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(125), ldc:int(68)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(4966), ldc:int(2943)), and:int(ldc:int(887), ldc:int(4979))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(16436), ldc:int(16498)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(2931), ldc:int(21371)), and:int(ldc:int(887), ldc:int(20351))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(12703), ldc:int(12714)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(27094), ldc:int(27297)), xor:int(ldc:int(2291), ldc:int(2914))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(17991), ldc:int(17995)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(17329), ldc:int(921)), and:int(ldc:int(9144), ldc:int(2968))))
        putstatic:String[](\ube23\uf9c5\u8350\u62da\ub32d::\u92ee\u8aa5\u3d64\ucb79\u8389, expr_103:String[])
        putstatic:boolean(\ube23\uf9c5\u8350\u62da\ub32d::\ubb2b\uf995\uc9f6\u0c95\ubb2b, and:int[expected:boolean](ldc:int(19775), ldc:int(-27968)))
        putstatic:\u5245\u8cae\ub102\u4c04\u983f(\ube23\uf9c5\u8350\u62da\ub32d::\uc2bd\u5fe1\uc29a\u5140\ud171, initobject:\u5245\u8cae\ub102\u4c04\u983f(\u5245\u8cae\ub102\u4c04\u983f::<init>, ldc:float(0.0f), ldc:float(0.0f)))
    }
    
    public void \ub19c\u51b2\ud12e\u0b8e\ua6bd(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_69F : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
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
        var_3_69F = and:int(ldc:int(1131641836), ldc:int(2044447704))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ube23\uf9c5\u8350\u62da\ub32d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
            var_3_69F = and:int(var_3_69F:int, ldc:int(-637534251))
            var_5_81 = and:int(ldc:int(9529), ldc:int(-25914))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-11047), ldc:int(11046)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_69F:int, ldc:int(-671462439))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(4184), ldc:int(4185)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, xor:int(ldc:int(520), ldc:int(521)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_69F = and:int(var_3_D1:int, ldc:int(-245859361))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(9345), ldc:int(9344)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1469473483))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-2079661375))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-417580749))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-151279515))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1676889070))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-581108743))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0568)
                            }
                            
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(2082270984))
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1033954520))
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-257205539))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1733430261))
                            var_11_E2 = and:int(ldc:int(-18775), ldc:int(18774))
                            goto(Label_1571)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0568:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-656466087))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(690113274))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(91960427))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(469610865))
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-183784709))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1333061504))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1042784261))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0711:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1064406727))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1160527058))
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1627270374))
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1080190262))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-134426638))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0843:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1806063498))
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1395791261))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(959658708))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1081654488))
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1897588991))
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1140015071))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(264), ldc:int(265))
                                goto(Label_1128)
                            }
                        }
                    }
                    
                    Label_0977:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1208234580))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1930319819))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1721264554))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-806976))
                        var_11_E2 = and:int(ldc:int(-13556), ldc:int(13457))
                    }
                    
                    Label_1128:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-687879904))
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0977)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-898425212))
                            goto(Label_0843)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1996877055))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-2085921575))
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1389574833))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1349060244))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1464888301))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1398)
                            }
                        }
                    }
                    
                    Label_1271:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(628038209))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_1128)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0977)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-916451962))
                            goto(Label_0843)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(197568697))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-470496309))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1571)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1398:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-858577042))
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1209434436))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1733000745))
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1057645196))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-715505069))
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-2082137945))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(149573195))
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(148498630))
                        loopcontinue()
                    }
                    
                    var_3_69F = and:int(var_3_69F:int, ldc:int(1132411844))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1571:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6AA = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1582:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(431130589))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-2022967180))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1216236028))
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-365643994))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1095913462))
                        var_17_6AA = add:int(var_16_110:int, and:int(ldc:int(4097), ldc:int(17153)))
                        looporswitchbreak()
                    }
                }
                
                var_3_69F = and:int(var_3_69F:int, ldc:int(1610308593))
                
                if (cmple:boolean(var_5_81 = var_17_6AA:int, sub:int(var_6_88:int, and:int(ldc:int(4705), ldc:int(2069))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
