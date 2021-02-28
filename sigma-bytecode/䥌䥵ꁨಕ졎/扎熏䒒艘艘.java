public class \u494c\u4975\ua068\u0c95\uc84e.\u624e\u718f\u4492\u8258\u8258 {
    public void \u624e\u718f\u4492\u8258\u8258(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\ub18d\u1833\u6b0d\u0a06\u9033 p0, double p1) {
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
            invokespecial:\uc87f\ub70c\uc87f\ubb2b\u0c95(\uc87f\ub70c\uc87f\ubb2b\u0c95::<init>, this:\u624e\u718f\u4492\u8258\u8258)
            putfield:\ub18d\u1833\u6b0d\u0a06\u9033(\u624e\u718f\u4492\u8258\u8258::\u839e\ua562\u6d69\ub1b9\u416d\u836c, this:\u624e\u718f\u4492\u8258\u8258, p0:\ub18d\u1833\u6b0d\u0a06\u9033)
            putfield:double(\u624e\u718f\u4492\u8258\u8258::\ub19c\u3bc9\uc84e\u71ae\u836c\uafe7, this:\u624e\u718f\u4492\u8258\u8258, p1:double)
            invokevirtual:void(\uc87f\ub70c\uc87f\ubb2b\u0c95::\ub83f\u6b5f\u61a4\uc3e3\u6198\u7049, this:\u624e\u718f\u4492\u8258\u8258[expected:\uc87f\ub70c\uc87f\ubb2b\u0c95], invokestatic:EnumSet<\uc7fe\u9af2\u52d3\uc87f\u92ff>(EnumSet<E>::of, getstatic:\uc7fe\u9af2\u52d3\uc87f\u92ff(\uc7fe\u9af2\u52d3\uc87f\u92ff::\u67d0\uf9c5\u4c04\u4f4a\u67d0\u7043)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u62da\u0b8e\u5f50\u718f\u7ce1\ud523() {
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
    
    public boolean \u3d4b\u0b8e\u61a4\u12b2\uff55\u965f() {
        var_1_5F : int
        
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
            var_1_5F = and:int(ldc:int(1852638792), ldc:int(1861739842))
            
            if (invokevirtual:boolean(\ub18d\u1833\u6b0d\u0a06\u9033::\u7c6b\u718f\u92ff\u99f7\u3c25\u7006, getfield:\ub18d\u1833\u6b0d\u0a06\u9033(\u624e\u718f\u4492\u8258\u8258::\u839e\ua562\u6d69\ub1b9\u416d\u836c, this:\u624e\u718f\u4492\u8258\u8258))) {
                if (invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\u6b0d\u5bc4\u3504\u40a9\u7043\u98a4, invokevirtual:\ub18d\u1833\u6b0d\u0a06\u9033[expected:\ube23\u67d0\u64f2\u839e\u76bc](\ub18d\u1833\u6b0d\u0a06\u9033::\u0a06\u6c52\u8258\uc9f6\ucfaf\u7330, getfield:\ub18d\u1833\u6b0d\u0a06\u9033(\u624e\u718f\u4492\u8258\u8258::\u839e\ua562\u6d69\ub1b9\u416d\u836c, this:\u624e\u718f\u4492\u8258\u8258)))) {
                    if (invokespecial:boolean(\u624e\u718f\u4492\u8258\u8258::\ua068\u446c\u59ec\u5654\u7006\u527a, this:\u624e\u718f\u4492\u8258\u8258, getfield:\ub18d\u1833\u6b0d\u0a06\u9033(\u624e\u718f\u4492\u8258\u8258::\u839e\ua562\u6d69\ub1b9\u416d\u836c, this:\u624e\u718f\u4492\u8258\u8258), and:int(ldc:int(-26301), ldc:int(18108)))) {
                        if (cmpgt:boolean(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u3e2a\ua3b4\u4975\u4179\u64f2\u6c52, getfield:\ub18d\u1833\u6b0d\u0a06\u9033[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u624e\u718f\u4492\u8258\u8258::\u839e\ua562\u6d69\ub1b9\u416d\u836c, this:\u624e\u718f\u4492\u8258\u8258), invokevirtual:\ub18d\u1833\u6b0d\u0a06\u9033[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\ub18d\u1833\u6b0d\u0a06\u9033::\u0a06\u6c52\u8258\uc9f6\ucfaf\u7330, getfield:\ub18d\u1833\u6b0d\u0a06\u9033(\u624e\u718f\u4492\u8258\u8258::\u839e\ua562\u6d69\ub1b9\u416d\u836c, this:\u624e\u718f\u4492\u8258\u8258))), ldc:double(676.0))) {
                            if (cmple:boolean(getfield:double(\u624e\u718f\u4492\u8258\u8258::\ub19c\u3bc9\uc84e\u71ae\u836c\uafe7, this:\u624e\u718f\u4492\u8258\u8258), ldc:double(3.0))) {
                                putfield:double(\u624e\u718f\u4492\u8258\u8258::\ub19c\u3bc9\uc84e\u71ae\u836c\uafe7, this:\u624e\u718f\u4492\u8258\u8258, mul:double(getfield:double(\u624e\u718f\u4492\u8258\u8258::\ub19c\u3bc9\uc84e\u71ae\u836c\uafe7, this:\u624e\u718f\u4492\u8258\u8258), ldc:double(1.2)))
                                putfield:int(\u624e\u718f\u4492\u8258\u8258::\u873d\u7006\u3dd3\u6c52\u97b7\u946b, this:\u624e\u718f\u4492\u8258\u8258, ldc:int(40))
                                return:boolean(xor:int[expected:boolean](ldc:int(1088), ldc:int(1089)))
                            }
                            
                            var_1_5F = and:int(var_1_5F:int, ldc:int(-276883935))
                            
                            if (cmpeq:boolean(getfield:int(\u624e\u718f\u4492\u8258\u8258::\u873d\u7006\u3dd3\u6c52\u97b7\u946b, this:\u624e\u718f\u4492\u8258\u8258), ldc:int(0))) {
                                return:boolean(and:int[expected:boolean](ldc:int(-1169), ldc:int(1168)))
                            }
                        }
                        
                        loop {
                            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(1024)), ldc:int(0))) {
                                var_1_5F = and:int(var_1_5F:int, ldc:int(-278426234))
                                
                                if (cmpgt:boolean(getfield:int(\u624e\u718f\u4492\u8258\u8258::\u873d\u7006\u3dd3\u6c52\u97b7\u946b, this:\u624e\u718f\u4492\u8258\u8258), ldc:int(0))) {
                                    putfield:int(\u624e\u718f\u4492\u8258\u8258::\u873d\u7006\u3dd3\u6c52\u97b7\u946b, this:\u624e\u718f\u4492\u8258\u8258, sub:int(getfield:int(\u624e\u718f\u4492\u8258\u8258::\u873d\u7006\u3dd3\u6c52\u97b7\u946b, this:\u624e\u718f\u4492\u8258\u8258), xor:int(ldc:int(1548), ldc:int(1549))))
                                }
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(16777216)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        return:boolean(and:int[expected:boolean](ldc:int(1577), ldc:int(321)))
                    }
                }
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(417), ldc:int(-418)))
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
            invokevirtual:void(\ub18d\u1833\u6b0d\u0a06\u9033::\uc910\ud36e\ubb2b\ua3b4\u62da\ub8be, getfield:\ub18d\u1833\u6b0d\u0a06\u9033(\u624e\u718f\u4492\u8258\u8258::\u839e\ua562\u6d69\ub1b9\u416d\u836c, this:\u624e\u718f\u4492\u8258\u8258))
            putfield:double(\u624e\u718f\u4492\u8258\u8258::\ub19c\u3bc9\uc84e\u71ae\u836c\uafe7, this:\u624e\u718f\u4492\u8258\u8258, ldc:double(2.1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4c04\u74b1\u0800\u3a62\uafe7\u718f() {
        var_3_8F : \ub18d\u1833\u6b0d\u0a06\u9033
        var_7_D9 : \u3a62\u5d20\u4f52\uc229\u8308\ud7e8
        
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
            
            if (invokevirtual:boolean(\ub18d\u1833\u6b0d\u0a06\u9033::\u7c6b\u718f\u92ff\u99f7\u3c25\u7006, getfield:\ub18d\u1833\u6b0d\u0a06\u9033(\u624e\u718f\u4492\u8258\u8258::\u839e\ua562\u6d69\ub1b9\u416d\u836c, this:\u624e\u718f\u4492\u8258\u8258))) {
                if (logicalnot:boolean(instanceof:boolean(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u6bb9\u36d3\u965f\u5f50\ub32d.class, invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u4f4a\uafe7\u76bc\u392e\ub8be::\uc2e8\u416d\u759a\u965f\u3bc9\u600f, getfield:\ub18d\u1833\u6b0d\u0a06\u9033[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\u624e\u718f\u4492\u8258\u8258::\u839e\ua562\u6d69\ub1b9\u416d\u836c, this:\u624e\u718f\u4492\u8258\u8258))))) {
                    var_3_8F = invokevirtual:\ub18d\u1833\u6b0d\u0a06\u9033(\ub18d\u1833\u6b0d\u0a06\u9033::\u0a06\u6c52\u8258\uc9f6\ucfaf\u7330, getfield:\ub18d\u1833\u6b0d\u0a06\u9033(\u624e\u718f\u4492\u8258\u8258::\u839e\ua562\u6d69\ub1b9\u416d\u836c, this:\u624e\u718f\u4492\u8258\u8258))
                    var_7_D9 = invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u76bc\uc229\u3d64\ud12e\u385b\ud158, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ud51e\u5f50\u92ff\u99f7\ucef1\u7d52, initobject:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::<init>, sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, var_3_8F:\ub18d\u1833\u6b0d\u0a06\u9033[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\ub18d\u1833\u6b0d\u0a06\u9033[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u624e\u718f\u4492\u8258\u8258::\u839e\ua562\u6d69\ub1b9\u416d\u836c, this:\u624e\u718f\u4492\u8258\u8258))), sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, var_3_8F:\ub18d\u1833\u6b0d\u0a06\u9033[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, getfield:\ub18d\u1833\u6b0d\u0a06\u9033[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u624e\u718f\u4492\u8258\u8258::\u839e\ua562\u6d69\ub1b9\u416d\u836c, this:\u624e\u718f\u4492\u8258\u8258))), sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, var_3_8F:\ub18d\u1833\u6b0d\u0a06\u9033[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\ub18d\u1833\u6b0d\u0a06\u9033[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u624e\u718f\u4492\u8258\u8258::\u839e\ua562\u6d69\ub1b9\u416d\u836c, this:\u624e\u718f\u4492\u8258\u8258))))), invokestatic:double(Math::max, sub:double(f2d:double(invokevirtual:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u98a4\ufe34\u6cfe\u3e75\u965f\u8df4, getfield:\ub18d\u1833\u6b0d\u0a06\u9033[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u624e\u718f\u4492\u8258\u8258::\u839e\ua562\u6d69\ub1b9\u416d\u836c, this:\u624e\u718f\u4492\u8258\u8258), var_3_8F:\ub18d\u1833\u6b0d\u0a06\u9033[expected:\u7d52\u718f\u3776\u6fb0\ub83f])), ldc:double(2.0)), ldc:double(0.0)))
                    invokevirtual:boolean(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\u3711\u7049\u8cae\u72f1\uc7fe\u5140, invokevirtual:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u4f4a\uafe7\u76bc\u392e\ub8be::\u51fa\ub171\ua3b4\u7873\u16f6\u3504, getfield:\ub18d\u1833\u6b0d\u0a06\u9033[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\u624e\u718f\u4492\u8258\u8258::\u839e\ua562\u6d69\ub1b9\u416d\u836c, this:\u624e\u718f\u4492\u8258\u8258)), add:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\ub18d\u1833\u6b0d\u0a06\u9033[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u624e\u718f\u4492\u8258\u8258::\u839e\ua562\u6d69\ub1b9\u416d\u836c, this:\u624e\u718f\u4492\u8258\u8258)), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, var_7_D9:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8)), add:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, getfield:\ub18d\u1833\u6b0d\u0a06\u9033[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u624e\u718f\u4492\u8258\u8258::\u839e\ua562\u6d69\ub1b9\u416d\u836c, this:\u624e\u718f\u4492\u8258\u8258)), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6bb9\uc29a\u99f7\u7e3f\u6b5f\u156b, var_7_D9:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8)), add:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\ub18d\u1833\u6b0d\u0a06\u9033[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u624e\u718f\u4492\u8258\u8258::\u839e\ua562\u6d69\ub1b9\u416d\u836c, this:\u624e\u718f\u4492\u8258\u8258)), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, var_7_D9:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8)), getfield:double(\u624e\u718f\u4492\u8258\u8258::\ub19c\u3bc9\uc84e\u71ae\u836c\uafe7, this:\u624e\u718f\u4492\u8258\u8258))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private boolean \ua068\u446c\u59ec\u5654\u7006\u527a(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\ub18d\u1833\u6b0d\u0a06\u9033 p0, int p1) {
        var_3_75 : int
        var_5_C2 : \ub18d\u1833\u6b0d\u0a06\u9033
        
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
        var_3_75 = and:int(ldc:int(796459524), ldc:int(1866290565))
        
        if (cmpgt:boolean(p1:int, ldc:int(8))) {
            return:boolean(and:int[expected:boolean](ldc:int(-26875), ldc:int(2234)))
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_3_75:int, ldc:int(16384)), ldc:int(0))) {
                var_3_75 = and:int(var_3_75:int, ldc:int(513640044))
                
                if (invokevirtual:boolean(\ub18d\u1833\u6b0d\u0a06\u9033::\u7c6b\u718f\u92ff\u99f7\u3c25\u7006, p0:\ub18d\u1833\u6b0d\u0a06\u9033)) {
                    if (logicalnot:boolean(invokevirtual:boolean(\u4f4a\uafe7\u76bc\u392e\ub8be::\uf94d\u36d3\u6c52\ub8be\ub32d\u67d0, invokevirtual:\ub18d\u1833\u6b0d\u0a06\u9033[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\ub18d\u1833\u6b0d\u0a06\u9033::\u0a06\u6c52\u8258\uc9f6\ucfaf\u7330, p0:\ub18d\u1833\u6b0d\u0a06\u9033)))) {
                        var_5_C2 = invokevirtual:\ub18d\u1833\u6b0d\u0a06\u9033(\ub18d\u1833\u6b0d\u0a06\u9033::\u0a06\u6c52\u8258\uc9f6\ucfaf\u7330, p0:\ub18d\u1833\u6b0d\u0a06\u9033)
                        inc:int(p1, ldc:int(1))
                        return:boolean(invokespecial:boolean(\u624e\u718f\u4492\u8258\u8258::\ua068\u446c\u59ec\u5654\u7006\u527a, this:\u624e\u718f\u4492\u8258\u8258, var_5_C2:\ub18d\u1833\u6b0d\u0a06\u9033, p1:int))
                    }
                    
                    return:boolean(xor:int[expected:boolean](ldc:int(-23488), ldc:int(-23487)))
                }
            }
            
            if (cmpeq:boolean(and:int(var_3_75:int, ldc:int(1024)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(-24659), ldc:int(24658)))
            }
            
            var_3_75 = and:int(var_3_75:int, ldc:int(1176784289))
        }
    }
    
    private static boolean lambda$\ud171\u8709\u67e9\u36d3\u7d52\u8389$0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
        var_3_66 : \u9255\u0c95\u4cd9\ube23\u760c<?>
        
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
            var_3_66 = invokevirtual:\u9255\u0c95\u4cd9\ube23\u760c<?>(\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\ud523\ub171\u4975\u516c\uf995, p0:\u7d52\u718f\u3776\u6fb0\ub83f)
            return:boolean(ternaryop:int(logicaland:boolean(cmpne:boolean(var_3_66:\u9255\u0c95\u4cd9\ube23\u760c<\ub18d\u1833\u6b0d\u0a06\u9033>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\ub18d\u1833\u6b0d\u0a06\u9033>(\u9255\u0c95\u4cd9\ube23\u760c::\u624e\u5db4\ub70c\uae5d\u6ec6\u6cfe)), cmpne:boolean(var_3_66:\u9255\u0c95\u4cd9\ube23\u760c<\u7af6\u6c52\u0c95\ubb2b\u8709>, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u7af6\u6c52\u0c95\ubb2b\u8709>(\u9255\u0c95\u4cd9\ube23\u760c::\u5140\u4975\u67e9\u9033\ub6ab\ua562))), and:int(ldc:int(-3937), ldc:int(3936)), and:int(ldc:int(16901), ldc:int(73))))
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
    
    public void \ub8be\u4c2b\u071d\ub70c\ubded\u6d99(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_65C : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_667 : int
        
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
        var_3_65C = and:int(ldc:int(1330825566), ldc:int(-274534081))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u624e\u718f\u4492\u8258\u8258[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_65C = and:int(var_3_65C:int, ldc:int(2030822779))
            var_5_81 = and:int(ldc:int(-12025), ldc:int(11512))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(7372), ldc:int(-7407)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_65C:int, ldc:int(1839911390))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(81), ldc:int(19489)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(23297), ldc:int(8205)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_65C = and:int(var_3_D1:int, ldc:int(2067001690))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(16385), ldc:int(1)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1516)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1686619183))
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1090)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(2126655507))
                        goto(Label_0930)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0805)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-658337799))
                        goto(Label_0665)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1473870908))
                        goto(Label_0567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-51593975))
                    }
                    else {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1596967806))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0567)
                            }
                            
                            goto(Label_0805)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1516)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(300796929))
                        goto(Label_1368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1090)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(15018697))
                        goto(Label_0930)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0805)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1480226532))
                        goto(Label_0665)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-349968609))
                            var_11_E2 = and:int(ldc:int(9672), ldc:int(-9673))
                            goto(Label_1505)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0567:
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1516)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1854651757))
                        goto(Label_1090)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0930)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0805)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-41752198))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0805)
                        }
                    }
                    
                    Label_0665:
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1516)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-888700848))
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(420185319))
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1976296917))
                        goto(Label_0930)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1029925606))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(1688527877))
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-309593222))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0805:
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1516)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1796301063))
                        goto(Label_1368)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-809250834))
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(801866491))
                            goto(Label_0665)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-1438696688))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1869276539))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(4115), ldc:int(1089))
                                goto(Label_1090)
                            }
                        }
                    }
                    
                    Label_0930:
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1516)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1368)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1497717301))
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(802425706))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0805)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0665)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-358403323))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(853670073))
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-644948613))
                        var_11_E2 = and:int(ldc:int(-6137), ldc:int(6120))
                    }
                    
                    Label_1090:
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1516)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1368)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0930)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(256)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(1866687569))
                            goto(Label_0805)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(256)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-390015968))
                            goto(Label_0665)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-1047998088))
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1766055770))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1368)
                            }
                        }
                    }
                    
                    Label_1205:
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(134896689))
                        goto(Label_1516)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-2085511222))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_1090)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(1779749462))
                            goto(Label_0930)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(1739306144))
                            goto(Label_0805)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0665)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-407159551))
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-804043328))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(1889592923))
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1501035007))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1505)
                    }
                    
                    Label_1368:
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(565827308))
                        goto(Label_1516)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1090)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-847865141))
                        goto(Label_0930)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0805)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0665)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1364008650))
                        goto(Label_0567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1822235325))
                        loopcontinue()
                    }
                    
                    var_3_65C = and:int(var_3_65C:int, ldc:int(-103550018))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1505:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_667 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1516:
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-2116052615))
                        goto(Label_1368)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(329971588))
                        goto(Label_0930)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0805)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0665)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-476970977))
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-615002277))
                        var_17_667 = add:int(var_16_110:int, xor:int(ldc:int(2560), ldc:int(2561)))
                        looporswitchbreak()
                    }
                    
                    var_3_65C = and:int(var_3_65C:int, ldc:int(1608566675))
                }
                
                var_3_65C = and:int(var_3_65C:int, ldc:int(-643111941))
                
                if (cmple:boolean(var_5_81 = var_17_667:int, sub:int(var_6_88:int, xor:int(ldc:int(-32635), ldc:int(-32636))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1073741824)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
