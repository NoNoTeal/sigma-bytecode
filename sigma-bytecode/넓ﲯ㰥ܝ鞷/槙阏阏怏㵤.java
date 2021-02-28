public class \ub113\ufcaf\u3c25\u071d\u97b7.\u69d9\u960f\u960f\u600f\u3d64 {
    public void \u69d9\u960f\u960f\u600f\u3d64(\ub113\uc4d2\u183a\u527a\u6435.\u4c2b\ub8be\u839e\u71ae\uf9c5 p0, int p1) {
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
            invokespecial:\uc87f\ub70c\uc87f\ubb2b\u0c95(\uc87f\ub70c\uc87f\ubb2b\u0c95::<init>, this:\u69d9\u960f\u960f\u600f\u3d64)
            putfield:\u4c2b\ub8be\u839e\u71ae\uf9c5(\u69d9\u960f\u960f\u600f\u3d64::\u647c\u7e3f\u3bd6\u3776\ub19c\u600f, this:\u69d9\u960f\u960f\u600f\u3d64, p0:\u4c2b\ub8be\u839e\u71ae\uf9c5)
            putfield:int(\u69d9\u960f\u960f\u600f\u3d64::\u4d85\uf94d\u0800\u3dd3\u71ae\u36d3, this:\u69d9\u960f\u960f\u600f\u3d64, p1:int)
            invokevirtual:void(\uc87f\ub70c\uc87f\ubb2b\u0c95::\ub83f\u6b5f\u61a4\uc3e3\u6198\u7049, this:\u69d9\u960f\u960f\u600f\u3d64[expected:\uc87f\ub70c\uc87f\ubb2b\u0c95], invokestatic:EnumSet<\uc7fe\u9af2\u52d3\uc87f\u92ff>(EnumSet<E>::of, getstatic:\uc7fe\u9af2\u52d3\uc87f\u92ff(\uc7fe\u9af2\u52d3\uc87f\u92ff::\u67d0\uf9c5\u4c04\u4f4a\u67d0\u7043)))
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
        stack_B5_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-1977457719), ldc:int(-1431553089))
            
            if (cmpne:boolean(getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u69d9\u960f\u960f\u600f\u3d64::\u8cae\u0c95\u4ab3\ube23\u3e2a\ub171, this:\u69d9\u960f\u960f\u600f\u3d64), aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56())) {
                if (logicalnot:boolean(invokevirtual:boolean(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\u7ce1\uc246\u5bc4\u3d4b\u760c\uc2e8, invokevirtual:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u4f4a\uafe7\u76bc\u392e\ub8be::\u51fa\ub171\ua3b4\u7873\u16f6\u3504, getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\u69d9\u960f\u960f\u600f\u3d64::\u647c\u7e3f\u3bd6\u3776\ub19c\u600f, this:\u69d9\u960f\u960f\u600f\u3d64))))) {
                    if (invokevirtual:boolean(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::equals, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\u8d90\u71f1\ub83f\u3a62\uc238\ucef1, invokevirtual:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u4f4a\uafe7\u76bc\u392e\ub8be::\u51fa\ub171\ua3b4\u7873\u16f6\u3504, getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\u69d9\u960f\u960f\u600f\u3d64::\u647c\u7e3f\u3bd6\u3776\ub19c\u600f, this:\u69d9\u960f\u960f\u600f\u3d64))), getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object](\u69d9\u960f\u960f\u600f\u3d64::\u8cae\u0c95\u4ab3\ube23\u3e2a\ub171, this:\u69d9\u960f\u960f\u600f\u3d64))) {
                        stack_B5_0 = and:int[expected:boolean](ldc:int(1049), ldc:int(14337))
                        return:boolean(stack_B5_0:boolean)
                    }
                }
            }
            
            var_1_5F = and:int(var_1_5F:int, ldc:int(-80615477))
            stack_B5_0 = and:int[expected:boolean](ldc:int(-10560), ldc:int(10535))
            return:boolean(stack_B5_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    public void \u4c04\u74b1\u0800\u3a62\uafe7\u718f() {
        var_3_78 : \uae5d\u9033\u8c8a\u5db4\u0800\u9af2
        var_4_A9 : \u3a62\u5d20\u4f52\uc229\u8308\ud7e8
        var_5_B2 : \u3a62\u5d20\u4f52\uc229\u8308\ud7e8
        var_8_FD : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        
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
            
            if (cmpne:boolean(getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u69d9\u960f\u960f\u600f\u3d64::\u8cae\u0c95\u4ab3\ube23\u3e2a\ub171, this:\u69d9\u960f\u960f\u600f\u3d64), aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56())) {
                var_3_78 = invokevirtual:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u4f4a\uafe7\u76bc\u392e\ub8be::\u51fa\ub171\ua3b4\u7873\u16f6\u3504, getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\u69d9\u960f\u960f\u600f\u3d64::\u647c\u7e3f\u3bd6\u3776\ub19c\u600f, this:\u69d9\u960f\u960f\u600f\u3d64))
                
                if (invokevirtual:boolean(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\u7ce1\uc246\u5bc4\u3d4b\u760c\uc2e8, var_3_78:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2)) {
                    if (logicalnot:boolean(invokevirtual:boolean(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u92ee\ua3b4\u3c25\u7330\u3711\uc2e8, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u69d9\u960f\u960f\u600f\u3d64::\u8cae\u0c95\u4ab3\ube23\u3e2a\ub171, this:\u69d9\u960f\u960f\u600f\u3d64), invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[expected:\u071d\u69d9\u3bc9\u983f\u3c25\u64ab](\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u69d9\u960f\u960f\u600f\u3d64::\u647c\u7e3f\u3bd6\u3776\ub19c\u600f, this:\u69d9\u960f\u960f\u600f\u3d64)), ldc:double(10.0)))) {
                        var_4_A9 = invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u494c\u47c2\u9255\u69d9\u8c8a\u624e, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u69d9\u960f\u960f\u600f\u3d64::\u8cae\u0c95\u4ab3\ube23\u3e2a\ub171, this:\u69d9\u960f\u960f\u600f\u3d64))
                        var_5_B2 = invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u69d9\u960f\u960f\u600f\u3d64::\u647c\u7e3f\u3bd6\u3776\ub19c\u600f, this:\u69d9\u960f\u960f\u600f\u3d64))
                        var_8_FD = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u7ce1\uc9f6\u61a4\u0a06\uff55::\uf995\uc7fe\u4daf\u71f1\u62da\ub102, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u7ce1\uc9f6\u61a4\u0a06\uff55](\u4c2b\ub8be\u839e\u71ae\uf9c5::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5(\u69d9\u960f\u960f\u600f\u3d64::\u647c\u7e3f\u3bd6\u3776\ub19c\u600f, this:\u69d9\u960f\u960f\u600f\u3d64)), getstatic:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9(\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9::\u5f50\u51fa\u8753\u8350\u4cd9\u0b8e), initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u965f\ud158\u71f1\u7bad\u8350\u071d, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u76bc\uc229\u3d64\ud12e\u385b\ud158, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ud51e\u5f50\u92ff\u99f7\ucef1\u7d52, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u5db4\ubb2b\ube23\uc2e8\u873d\ub32d, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u965f\ud158\u71f1\u7bad\u8350\u071d, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u76bc\uc229\u3d64\ud12e\u385b\ud158, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u5db4\ubb2b\ube23\uc2e8\u873d\ub32d, var_5_B2:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, var_4_A9:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), ldc:double(0.4)), var_4_A9:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), var_5_B2:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8)), ldc:double(10.0)), var_5_B2:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8)))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\u3711\u7049\u8cae\u72f1\uc7fe\u5140, var_3_78:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2, i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_8_FD:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_8_FD:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_8_FD:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(1.0)))) {
                            invokespecial:void(\u69d9\u960f\u960f\u600f\u3d64::\u92ee\u071d\u3e2a\uc238\ua6bd\u92ee, this:\u69d9\u960f\u960f\u600f\u3d64)
                        }
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u92ee\u071d\u3e2a\uc238\ua6bd\u92ee() {
        var_3_67 : Random
        var_4_98 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        
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
            var_3_67 = invokevirtual:Random(\ube23\u67d0\u64f2\u839e\u76bc::\u4daf\u446c\ubcb0\u759a\ua562\u5245, getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5[expected:\ube23\u67d0\u64f2\u839e\u76bc](\u69d9\u960f\u960f\u600f\u3d64::\u647c\u7e3f\u3bd6\u3776\ub19c\u600f, this:\u69d9\u960f\u960f\u600f\u3d64))
            var_4_98 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u7ce1\uc9f6\u61a4\u0a06\uff55::\uf995\uc7fe\u4daf\u71f1\u62da\ub102, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u7ce1\uc9f6\u61a4\u0a06\uff55](\u4c2b\ub8be\u839e\u71ae\uf9c5::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5(\u69d9\u960f\u960f\u600f\u3d64::\u647c\u7e3f\u3bd6\u3776\ub19c\u600f, this:\u69d9\u960f\u960f\u600f\u3d64)), getstatic:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9(\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9::\u5f50\u51fa\u8753\u8350\u4cd9\u0b8e), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\uc7fe\u600f\u72f1\u8640\u1833, getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u69d9\u960f\u960f\u600f\u3d64::\u647c\u7e3f\u3bd6\u3776\ub19c\u600f, this:\u69d9\u960f\u960f\u600f\u3d64)), add:int(ldc:int(-8), invokevirtual:int(Random::nextInt, var_3_67:Random, ldc:int(16))), and:int(ldc:int(1122), ldc:int(-1123)), add:int(ldc:int(-8), invokevirtual:int(Random::nextInt, var_3_67:Random, ldc:int(16)))))
            invokevirtual:boolean(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\u3711\u7049\u8cae\u72f1\uc7fe\u5140, invokevirtual:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u4f4a\uafe7\u76bc\u392e\ub8be::\u51fa\ub171\ua3b4\u7873\u16f6\u3504, getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\u69d9\u960f\u960f\u600f\u3d64::\u647c\u7e3f\u3bd6\u3776\ub19c\u600f, this:\u69d9\u960f\u960f\u600f\u3d64)), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_4_98:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_4_98:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_4_98:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(1.0))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static double lambda$\ub8be\u527a\uc31c\ub171\u12cb\u92ee$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
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
            return:double(i2d:double(neg:int(invokevirtual:int(\ube23\uc238\u5140\u4cd9\u8aa5::\u92ff\u8c8a\u183a\uc9f6\ub18d\u61a4, p0:\ube23\uc238\u5140\u4cd9\u8aa5, invokestatic:\u5d20\ubefe\u8640\u183a\u6ec6\u93a2(\u5d20\ubefe\u8640\u183a\u6ec6\u93a2::\uc910\u4975\ub7dc\u8258\u839e\u99f7, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)))))
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
        var_3_66B : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_676 : int
        
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
        var_3_66B = and:int(ldc:int(-1069881964), ldc:int(-327225385))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u69d9\u960f\u960f\u600f\u3d64[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(16)), ldc:int(0))) {
            var_3_66B = and:int(var_3_66B:int, ldc:int(-1560287298))
            var_5_80 = and:int(ldc:int(-613), ldc:int(612))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(1617), ldc:int(-18260)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_66B:int, ldc:int(-2080438274))
                    var_9_BE = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_87:int, and:int(ldc:int(5579), ldc:int(2101)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, and:int(ldc:int(5009), ldc:int(25641)))), var_7_96:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_66B = and:int(var_3_D0:int, ldc:int(-1547864618))
                    var_14_10B = var_7_96:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), xor:int(ldc:int(17414), ldc:int(17415)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_87:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1613010777))
                        goto(Label_0691)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-344564657))
                    }
                    else {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-310487556))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0839)
                        }
                    }
                    
                    Label_0382:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-488424724))
                        goto(Label_1532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1182576156))
                        goto(Label_1385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1041570764))
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-167323294))
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0691)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(236737911))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-914446882))
                            var_11_E1 = and:int(ldc:int(-17246), ldc:int(861))
                            goto(Label_1521)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1007272080))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(968359055))
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1040603940))
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-225936908))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0382)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-189493483))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1115912801))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0839)
                        }
                    }
                    
                    Label_0691:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1253425804))
                        goto(Label_1532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1717149461))
                        goto(Label_1385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1032563254))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1987651721))
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(214692311))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(1405807746))
                            goto(Label_0382)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-8815140))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0839:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-886658588))
                        goto(Label_1532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(321337365))
                        goto(Label_1385)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(120862104))
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1387751187))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0691)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0382)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1023822377))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E1 = and:int(ldc:int(4163), ldc:int(2465))
                                goto(Label_1119)
                            }
                        }
                    }
                    
                    Label_0961:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1929608160))
                        goto(Label_1385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0839)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0691)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-1561142864))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-587990814))
                            goto(Label_0382)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(724269760))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1027731491))
                        var_11_E1 = and:int(ldc:int(1386), ldc:int(-3563))
                    }
                    
                    Label_1119:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-2110580711))
                        goto(Label_1385)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-604733125))
                            goto(Label_0961)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0839)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(354222868))
                            goto(Label_0691)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(128)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(1489918780))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-622340181))
                            goto(Label_0382)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-168073435))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-692242473))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1385)
                            }
                        }
                    }
                    
                    Label_1260:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1532)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_1119)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(128)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(1293576570))
                            goto(Label_0961)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(767201441))
                            goto(Label_0839)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0691)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0382)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-964597004))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-2080446475))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_80:int, var_16_10F:int)
                        goto(Label_1521)
                    }
                    
                    Label_1385:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1532)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1463712460))
                        goto(Label_0691)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-663510175))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(302403855))
                        goto(Label_0382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1131724463))
                        loopcontinue()
                    }
                    
                    var_3_66B = and:int(var_3_66B:int, ldc:int(-1338169355))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1521:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_676 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1532:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(126858028))
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0691)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-245398960))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1533193282))
                        goto(Label_0382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-356729354))
                        var_17_676 = add:int(var_16_10F:int, and:int(ldc:int(16385), ldc:int(5705)))
                        looporswitchbreak()
                    }
                    
                    var_3_66B = and:int(var_3_66B:int, ldc:int(421299084))
                }
                
                var_3_66B = and:int(var_3_66B:int, ldc:int(-1090758665))
                
                if (cmple:boolean(var_5_80 = var_17_676:int, sub:int(var_6_87:int, and:int(ldc:int(755), ldc:int(5))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(524288)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
