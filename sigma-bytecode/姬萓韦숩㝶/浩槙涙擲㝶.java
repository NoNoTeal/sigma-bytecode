public class \u59ec\u8413\u97e6\uc229\u3776.\u6d69\u69d9\u6d99\u64f2\u3776 {
    public void \u6d69\u69d9\u6d99\u64f2\u3776(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u3d4b\u9af2\u71f1\u67d0\u99f7 p0, long p1) {
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
            invokespecial:\ub18d\u6bb9\u6c52\ua6bd\ud523(\ub18d\u6bb9\u6c52\ua6bd\ud523::<init>, this:\u6d69\u69d9\u6d99\u64f2\u3776)
            putfield:\u3d4b\u9af2\u71f1\u67d0\u99f7(\u6d69\u69d9\u6d99\u64f2\u3776::\u0a06\u527a\u927d\uafe7\u5d20\u516c, this:\u6d69\u69d9\u6d99\u64f2\u3776, p0:\u3d4b\u9af2\u71f1\u67d0\u99f7)
            putfield:long(\u6d69\u69d9\u6d99\u64f2\u3776::\ub102\u6cfe\uc3e3\u718f\ubf56\u3d4b, this:\u6d69\u69d9\u6d99\u64f2\u3776, p1:long)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u72f1\u5f50\u51fa\ubcb0\u0b8e\uafe7() {
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
    
    private void \uceb8\u960f\u9937\u494c\uf94d\ufcaf(int p0) {
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
    
    private int \u6198\u7d52\u3a62\uc238\ud523\u61a4(int p0) {
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
            return:int(add:int(getfield:int(\u6d69\u69d9\u6d99\u64f2\u3776::\uc9f6\ud4fe\u4daf\u47c2\u5d20\uf995, this:\u6d69\u69d9\u6d99\u64f2\u3776), mul:int(p0:int, ldc:int(95))))
        }
        
        goto(Label_0006)
    }
    
    private int \uc2bd\u8389\u9255\u4ab3\ucb79\u52d3(int p0, int p1) {
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
            return:int(add:int(sub:int(div:int(getfield:int(\u6d69\u69d9\u6d99\u64f2\u3776::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u6d69\u69d9\u6d99\u64f2\u3776), and:int(ldc:int(3382), ldc:int(66))), div:int(sub:int(mul:int(p1:int, ldc:int(105)), xor:int(ldc:int(72), ldc:int(77))), xor:int(ldc:int(770), ldc:int(768)))), mul:int(p0:int, ldc:int(105))))
        }
        
        goto(Label_0006)
    }
    
    public void \u759a\uc87f\u5140\ud36e\u12cb\ubcb0() {
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
            invokespecial:void(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\u759a\uc87f\u5140\ud36e\u12cb\ubcb0, this:\u6d69\u69d9\u6d99\u64f2\u3776[expected:\u99f7\u7006\u6198\u47c2\ub1b9\u12cb])
            putfield:int(\u6d69\u69d9\u6d99\u64f2\u3776::\u9255\uc3e3\u6cfe\u4c2b\u4c04\ucef1, this:\u6d69\u69d9\u6d99\u64f2\u3776, add:int(getfield:int(\u6d69\u69d9\u6d99\u64f2\u3776::\u9255\uc3e3\u6cfe\u4c2b\u4c04\ucef1, this:\u6d69\u69d9\u6d99\u64f2\u3776), xor:int(ldc:int(4738), ldc:int(4739))))
            putfield:int(\u6d69\u69d9\u6d99\u64f2\u3776::\u3c25\u56bd\uf9c5\u4d85\u960f\u4492, this:\u6d69\u69d9\u6d99\u64f2\u3776, sub:int(getfield:int(\u6d69\u69d9\u6d99\u64f2\u3776::\u3c25\u56bd\uf9c5\u4d85\u960f\u4492, this:\u6d69\u69d9\u6d99\u64f2\u3776), xor:int(ldc:int(144), ldc:int(145))))
            
            if (cmplt:boolean(getfield:int(\u6d69\u69d9\u6d99\u64f2\u3776::\u3c25\u56bd\uf9c5\u4d85\u960f\u4492, this:\u6d69\u69d9\u6d99\u64f2\u3776), ldc:int(0))) {
                putfield:int(\u6d69\u69d9\u6d99\u64f2\u3776::\u3c25\u56bd\uf9c5\u4d85\u960f\u4492, this:\u6d69\u69d9\u6d99\u64f2\u3776, and:int(ldc:int(31250), ldc:int(-31283)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, float p3) {
        var_5_63 : int
        var_5_A9 : int
        var_7_B2 : String
        var_8_BD : int
        stack_10C_0 : int [generated]
        var_5_10A : int
        var_9_10C : int
        var_10_118 : int
        
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
            var_5_63 = and:int(ldc:int(2065181553), ldc:int(-1357205703))
            putfield:ITextComponent(\u6d69\u69d9\u6d99\u64f2\u3776::\u946b\u12b2\u3e2a\u97e6\u4179\u99f7, this:\u6d69\u69d9\u6d99\u64f2\u3776, aconstnull:ITextComponent())
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u0a06\u12cb\u97b7\u4492\u1833\ubded, this:\u6d69\u69d9\u6d99\u64f2\u3776[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u6d69\u69d9\u6d99\u64f2\u3776::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u6d69\u69d9\u6d99\u64f2\u3776), getstatic:ITextComponent(\u6d69\u69d9\u6d99\u64f2\u3776::\u4c2b\u9af2\u9033\u718f\u6435\uc31c), div:int(getfield:int(\u6d69\u69d9\u6d99\u64f2\u3776::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u6d69\u69d9\u6d99\u64f2\u3776), xor:int(ldc:int(18453), ldc:int(18455))), invokestatic:int(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\ub6ab\u071d\u6cfe\u6c52\u5245\u6ec6, xor:int(ldc:int(2081), ldc:int(2085))), ldc:int(16777215))
            invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, this:\u6d69\u69d9\u6d99\u64f2\u3776[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            
            if (cmpne:boolean(getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776), aconstnull:\ud12e\u946b\u97b7\u51b2\u3d64())) {
                var_5_A9 = and:int(var_5_63:int, ldc:int(1025370961))
                var_7_B2 = invokevirtual:String(\ud12e\u946b\u97b7\u51b2\u3d64::\u4975\uc4d2\u4daf\u71f1\ud7e8\u4e72, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776))
                var_8_BD = invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6435\u516c\u873d\u88c5\u3d4b\u1187, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u6d69\u69d9\u6d99\u64f2\u3776::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u6d69\u69d9\u6d99\u64f2\u3776), var_7_B2:String)
                
                if (cmpne:boolean(getfield:\u7e3f\u9af2\u385b\u8308\u92ee(\ud12e\u946b\u97b7\u51b2\u3d64::\u3e75\u494c\u8709\ub32d\uc7fe\u93a2, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776)), getstatic:\u7e3f\u9af2\u385b\u8308\u92ee(\u7e3f\u9af2\u385b\u8308\u92ee::\u69d9\u7bad\u8709\u9937\u446c\u67d0))) {
                    var_5_A9 = and:int(var_5_A9:int, ldc:int(-283197525))
                    stack_10C_0 = ldc:int(8388479)
                }
                else {
                    stack_10C_0 = ldc:int(10526880)
                }
                
                var_5_10A = and:int(var_5_A9:int, ldc:int(731560781))
                var_9_10C = stack_10C_0:int
                var_10_118 = invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ucb79\ua3b4\u946b\uc246\ua068\u36d3, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u6d69\u69d9\u6d99\u64f2\u3776::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u6d69\u69d9\u6d99\u64f2\u3776), getstatic:ITextComponent[expected:ITextProperties](\u6d69\u69d9\u6d99\u64f2\u3776::\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6))
                invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u6d69\u69d9\u6d99\u64f2\u3776::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u6d69\u69d9\u6d99\u64f2\u3776), getstatic:ITextComponent(\u6d69\u69d9\u6d99\u64f2\u3776::\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6), div:int(getfield:int(\u6d69\u69d9\u6d99\u64f2\u3776::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u6d69\u69d9\u6d99\u64f2\u3776), and:int(ldc:int(6211), ldc:int(2))), ldc:int(12), ldc:int(16777215))
                invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u6d69\u69d9\u6d99\u64f2\u3776::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u6d69\u69d9\u6d99\u64f2\u3776), var_7_B2:String, div:int(getfield:int(\u6d69\u69d9\u6d99\u64f2\u3776::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u6d69\u69d9\u6d99\u64f2\u3776), and:int(ldc:int(6), ldc:int(24826))), ldc:int(24), var_9_10C:int)
                invokespecial:void(\u6d69\u69d9\u6d99\u64f2\u3776::\ub113\u7e3f\u4bc8\uc84e\uc84e\ub70c, this:\u6d69\u69d9\u6d99\u64f2\u3776, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, invokestatic:int(Math::min, sub:int(add:int(invokespecial:int(\u6d69\u69d9\u6d99\u64f2\u3776::\uc2bd\u8389\u9255\u4ab3\ucb79\u52d3, this:\u6d69\u69d9\u6d99\u64f2\u3776, and:int(ldc:int(791), ldc:int(15554)), xor:int(ldc:int(8966), ldc:int(8965))), ldc:int(80)), ldc:int(11)), add:int(add:int(add:int(div:int(getfield:int(\u6d69\u69d9\u6d99\u64f2\u3776::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u6d69\u69d9\u6d99\u64f2\u3776), and:int(ldc:int(2211), ldc:int(12826))), div:int(var_8_BD:int, xor:int(ldc:int(68), ldc:int(70)))), div:int(var_10_118:int, and:int(ldc:int(6), ldc:int(13490)))), ldc:int(10))), ldc:int(7), p1:int, p2:int)
                
                if (invokespecial:boolean(\u6d69\u69d9\u6d99\u64f2\u3776::\ub7dc\u34df\u071d\u494c\u0b8e\u97e6, this:\u6d69\u69d9\u6d99\u64f2\u3776)) {
                    invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ub18d\u99f7\uc910\u97e6\u5245\uceb8, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u6d69\u69d9\u6d99\u64f2\u3776::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u6d69\u69d9\u6d99\u64f2\u3776), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, invokeinterface:IFormattableTextComponent[expected:ITextComponent](IFormattableTextComponent::appendString, invokeinterface:IFormattableTextComponent(ITextComponent::deepCopy, getstatic:ITextComponent(\u6d69\u69d9\u6d99\u64f2\u3776::\ubcb0\u0a06\u7e3f\ub70c\u76bc\ud36e)), invokevirtual:String(\ud12e\u946b\u97b7\u51b2\u3d64::\ub102\u51fa\u7d52\u4c2b\u960f\u7ce1, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776))), i2f:float(add:int(add:int(add:int(getfield:int(\u6d69\u69d9\u6d99\u64f2\u3776::\uc9f6\ud4fe\u4daf\u47c2\u5d20\uf995, this:\u6d69\u69d9\u6d99\u64f2\u3776), ldc:int(80)), ldc:int(20)), ldc:int(10))), i2f:float(invokestatic:int(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\ub6ab\u071d\u6cfe\u6c52\u5245\u6ec6, ldc:int(13))), ldc:int(16777215))
                }
                
                var_5_63 = and:int(var_5_10A:int, ldc:int(792263531))
                
                if (cmpne:boolean(getfield:ITextComponent(\u6d69\u69d9\u6d99\u64f2\u3776::\u946b\u12b2\u3e2a\u97e6\u4179\u99f7, this:\u6d69\u69d9\u6d99\u64f2\u3776), aconstnull:ITextComponent())) {
                    invokevirtual:void(\u6d69\u69d9\u6d99\u64f2\u3776::\u71f1\u74b1\u4c04\uc238\u3a62\uc7fe, this:\u6d69\u69d9\u6d99\u64f2\u3776, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:ITextComponent(\u6d69\u69d9\u6d99\u64f2\u3776::\u946b\u12b2\u3e2a\u97e6\u4179\u99f7, this:\u6d69\u69d9\u6d99\u64f2\u3776), p1:int, p2:int)
                }
            }
            else {
                invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u6d69\u69d9\u6d99\u64f2\u3776::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u6d69\u69d9\u6d99\u64f2\u3776), getstatic:ITextComponent(\u6d69\u69d9\u6d99\u64f2\u3776::\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6), div:int(getfield:int(\u6d69\u69d9\u6d99\u64f2\u3776::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u6d69\u69d9\u6d99\u64f2\u3776), xor:int(ldc:int(12288), ldc:int(12290))), ldc:int(17), ldc:int(16777215))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private int \u8389\u5654\u8bb0\ubcb0\u51b2\u4c04(int p0) {
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
            return:int(add:int(getfield:int(\u6d69\u69d9\u6d99\u64f2\u3776::\uc9f6\ud4fe\u4daf\u47c2\u5d20\uf995, this:\u6d69\u69d9\u6d99\u64f2\u3776), mul:int(sub:int(p0:int, and:int(ldc:int(1417), ldc:int(2581))), ldc:int(98))))
        }
        
        goto(Label_0006)
    }
    
    public void \u760c\ud51e\u3e2a\uc910\uc7fe\u71ae() {
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
            invokevirtual:void(\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe::\u7bad\ub171\u61a4\ubff1\u6d69\u6cfe, getfield:\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u760c\u156b\u6435\u76bc\u9033\u392e, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u69d9\u6d99\u64f2\u3776::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d69\u69d9\u6d99\u64f2\u3776)), and:int[expected:boolean](ldc:int(16775), ldc:int(-19848)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc229\u3a62\u12cb\ud51e\uafe7\u8308(int p0, int p1, int p2) {
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
        
        if (cmpne:boolean(p0:int, xor:int(ldc:int(18553), ldc:int(18809)))) {
            return:boolean(invokespecial:boolean(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc229\u3a62\u12cb\ud51e\uafe7\u8308, this:\u6d69\u69d9\u6d99\u64f2\u3776[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:int, p1:int, p2:int))
        }
        
        invokespecial:void(\u6d69\u69d9\u6d99\u64f2\u3776::\ud217\u4cd9\ub83f\u51b2\u8709\u0b8e, this:\u6d69\u69d9\u6d99\u64f2\u3776)
        return:boolean(and:int[expected:boolean](ldc:int(8729), ldc:int(16643)))
    }
    
    private void \ud217\u4cd9\ub83f\u51b2\u8709\u0b8e() {
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
            
            if (getfield:boolean(\u6d69\u69d9\u6d99\u64f2\u3776::\u0c95\u99f7\u516c\u5245\ucef1\u3504, this:\u6d69\u69d9\u6d99\u64f2\u3776)) {
                invokevirtual:void(\u3d4b\u9af2\u71f1\u67d0\u99f7::\u4179\u62da\u8bb0\u2dcc\uceb8\u4c04, getfield:\u3d4b\u9af2\u71f1\u67d0\u99f7(\u6d69\u69d9\u6d99\u64f2\u3776::\u0a06\u527a\u927d\uafe7\u5d20\u516c, this:\u6d69\u69d9\u6d99\u64f2\u3776))
            }
            
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u69d9\u6d99\u64f2\u3776::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d69\u69d9\u6d99\u64f2\u3776), getfield:\u3d4b\u9af2\u71f1\u67d0\u99f7[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u6d69\u69d9\u6d99\u64f2\u3776::\u0a06\u527a\u927d\uafe7\u5d20\u516c, this:\u6d69\u69d9\u6d99\u64f2\u3776))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u88c5\ua562\u7c6b\ud36e\u74b1\u965f(long p0) {
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
    
    private void \u3bd6\u51fa\ub6ab\u34df\u6bb9\ub113() {
        var_1_2EB : int
        stack_184_0 : \u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d [generated]
        stack_ED_0 : \u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d [generated]
        stack_21F_0 : \u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d [generated]
        stack_2A4_0 : \u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d [generated]
        stack_307_0 : \u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d [generated]
        stack_184_1 : boolean [generated]
        stack_ED_1 : int [generated]
        stack_21F_1 : int [generated]
        stack_2A4_1 : int [generated]
        stack_307_1 : int [generated]
        
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
            var_1_2EB = and:int(ldc:int(-386621638), ldc:int(-1343750855))
            stack_184_0 = stack_ED_0 = stack_21F_0 = stack_2A4_0 = stack_307_0 = getfield(\u6d69\u69d9\u6d99\u64f2\u3776::\u759a\u6b0d\u4492\u0800\u8640\ub102, this)
            
            if (logicalnot:boolean(getfield:boolean(\ud12e\u946b\u97b7\u51b2\u3d64::\u6c52\u156b\u4179\u5654\uceb8\u9af2, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776)))) {
                stack_184_1 = stack_ED_1 = stack_21F_1 = stack_2A4_1 = xor(ldc(129), ldc(128))
                goto(Label_0189)
            }
            
            Label_0112:
            
            if (cmpne:boolean(and:int(var_1_2EB:int, ldc:int(16777216)), ldc:int(0))) {
                var_1_2EB = and:int(var_1_2EB:int, ldc:int(307499074))
                goto(Label_0693)
            }
            
            if (cmpeq:boolean(and:int(var_1_2EB:int, ldc:int(4096)), ldc:int(0))) {
                var_1_2EB = and:int(var_1_2EB:int, ldc:int(-403739032))
                goto(Label_0560)
            }
            
            if (cmpeq:boolean(and:int(var_1_2EB:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0419)
            }
            
            if (cmpeq:boolean(and:int(var_1_2EB:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0254)
            }
            
            var_1_2EB = and:int(var_1_2EB:int, ldc:int(-104017541))
            stack_184_1 = stack_ED_1 = stack_21F_1 = stack_2A4_1 = and(ldc(-6551), ldc(4500))
            Label_0189:
            
            if (cmpeq:boolean(and:int(var_1_2EB:int, ldc:int(262144)), ldc:int(0))) {
                var_1_2EB = and:int(var_1_2EB:int, ldc:int(684655036))
                goto(Label_0628)
            }
            
            if (cmpeq:boolean(and:int(var_1_2EB:int, ldc:int(16)), ldc:int(0))) {
                var_1_2EB = and:int(var_1_2EB:int, ldc:int(840620030))
                goto(Label_0496)
            }
            
            if (cmpeq:boolean(and:int(var_1_2EB:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0340)
            }
            
            var_1_2EB = and:int(var_1_2EB:int, ldc:int(-1342243727))
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, stack_ED_0:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d, stack_ED_1:boolean)
            stack_184_0 = stack_ED_0 = stack_21F_0 = stack_2A4_0 = stack_307_0 = getfield(\u6d69\u69d9\u6d99\u64f2\u3776::\ua61f\u16f6\u8258\u494c\u52d3\u760c, this)
            
            if (logicalnot:boolean(getfield:boolean(\ud12e\u946b\u97b7\u51b2\u3d64::\u6c52\u156b\u4179\u5654\uceb8\u9af2, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776)))) {
                stack_184_1 = stack_ED_1 = stack_21F_1 = stack_2A4_1 = xor(ldc(18500), ldc(18501))
                goto(Label_0340)
            }
            
            Label_0254:
            
            if (cmpne:boolean(and:int(var_1_2EB:int, ldc:int(16777216)), ldc:int(0))) {
                var_1_2EB = and:int(var_1_2EB:int, ldc:int(309304957))
                goto(Label_0693)
            }
            
            if (cmpeq:boolean(and:int(var_1_2EB:int, ldc:int(262144)), ldc:int(0))) {
                var_1_2EB = and:int(var_1_2EB:int, ldc:int(-1616485460))
                goto(Label_0560)
            }
            
            if (cmpne:boolean(and:int(var_1_2EB:int, ldc:int(16777216)), ldc:int(0))) {
                var_1_2EB = and:int(var_1_2EB:int, ldc:int(1189224411))
                goto(Label_0419)
            }
            
            if (cmpeq:boolean(and:int(var_1_2EB:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_1_2EB = and:int(var_1_2EB:int, ldc:int(-338256838))
            stack_184_1 = stack_ED_1 = stack_21F_1 = stack_2A4_1 = and(ldc(-28342), ldc(27793))
            Label_0340:
            
            if (cmpeq:boolean(and:int(var_1_2EB:int, ldc:int(16)), ldc:int(0))) {
                var_1_2EB = and:int(var_1_2EB:int, ldc:int(-277497518))
                goto(Label_0628)
            }
            
            if (cmpeq:boolean(and:int(var_1_2EB:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0496)
            }
            
            if (cmpeq:boolean(and:int(var_1_2EB:int, ldc:int(32)), ldc:int(0))) {
                var_1_2EB = and:int(var_1_2EB:int, ldc:int(-1849127362))
                goto(Label_0189)
            }
            
            var_1_2EB = and:int(var_1_2EB:int, ldc:int(-1102653644))
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, stack_184_0:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d, stack_184_1:boolean)
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u6d69\u69d9\u6d99\u64f2\u3776::\u4daf\uc87f\uc31c\u34df\ucfaf\u392e, this:\u6d69\u69d9\u6d99\u64f2\u3776), and:int[expected:boolean](ldc:int(289), ldc:int(10257)))
            stack_184_0 = stack_ED_0 = stack_21F_0 = stack_2A4_0 = stack_307_0 = getfield(\u6d69\u69d9\u6d99\u64f2\u3776::\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255, this)
            
            if (logicalnot:boolean(getfield:boolean(\ud12e\u946b\u97b7\u51b2\u3d64::\u6c52\u156b\u4179\u5654\uceb8\u9af2, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776)))) {
                stack_184_1 = stack_ED_1 = stack_21F_1 = stack_2A4_1 = xor(ldc(26112), ldc(26113))
                goto(Label_0496)
            }
            
            Label_0419:
            
            if (cmpne:boolean(and:int(var_1_2EB:int, ldc:int(268435456)), ldc:int(0))) {
                var_1_2EB = and:int(var_1_2EB:int, ldc:int(-848044818))
                goto(Label_0693)
            }
            
            if (cmpne:boolean(and:int(var_1_2EB:int, ldc:int(268435456)), ldc:int(0))) {
                var_1_2EB = and:int(var_1_2EB:int, ldc:int(1053695353))
                goto(Label_0560)
            }
            
            if (cmpeq:boolean(and:int(var_1_2EB:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0254)
            }
            
            if (cmpeq:boolean(and:int(var_1_2EB:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_1_2EB = and:int(var_1_2EB:int, ldc:int(-50334213))
            stack_184_1 = stack_ED_1 = stack_21F_1 = stack_2A4_1 = and(ldc(-31011), ldc(30978))
            Label_0496:
            
            if (cmpeq:boolean(and:int(var_1_2EB:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0628)
            }
            
            if (cmpeq:boolean(and:int(var_1_2EB:int, ldc:int(536870912)), ldc:int(0))) {
                var_1_2EB = and:int(var_1_2EB:int, ldc:int(1514397796))
                goto(Label_0340)
            }
            
            if (cmpeq:boolean(and:int(var_1_2EB:int, ldc:int(2147483647)), ldc:int(0))) {
                var_1_2EB = and:int(var_1_2EB:int, ldc:int(2095889898))
                goto(Label_0189)
            }
            
            var_1_2EB = and:int(var_1_2EB:int, ldc:int(-337790090))
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, stack_21F_0:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d, stack_21F_1:boolean)
            stack_184_0 = stack_ED_0 = stack_21F_0 = stack_2A4_0 = stack_307_0 = getfield(\u6d69\u69d9\u6d99\u64f2\u3776::\u93a2\u3d64\u16f6\u3e2a\u51b2\uf995, this)
            
            if (logicalnot:boolean(getfield:boolean(\ud12e\u946b\u97b7\u51b2\u3d64::\u6c52\u156b\u4179\u5654\uceb8\u9af2, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776)))) {
                stack_184_1 = stack_ED_1 = stack_21F_1 = stack_2A4_1 = xor(ldc(4160), ldc(4161))
                goto(Label_0628)
            }
            
            Label_0560:
            
            if (cmpne:boolean(and:int(var_1_2EB:int, ldc:int(65536)), ldc:int(0))) {
                var_1_2EB = and:int(var_1_2EB:int, ldc:int(794318382))
                goto(Label_0693)
            }
            
            if (cmpne:boolean(and:int(var_1_2EB:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0419)
            }
            
            if (cmpeq:boolean(and:int(var_1_2EB:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0254)
            }
            
            if (cmpeq:boolean(and:int(var_1_2EB:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_1_2EB = and:int(var_1_2EB:int, ldc:int(-1371021643))
            stack_184_1 = stack_ED_1 = stack_21F_1 = stack_2A4_1 = and(ldc(9398), ldc(-13751))
            Label_0628:
            
            if (cmpeq:boolean(and:int(var_1_2EB:int, ldc:int(262144)), ldc:int(0))) {
                var_1_2EB = and:int(var_1_2EB:int, ldc:int(1495414042))
                goto(Label_0496)
            }
            
            if (cmpeq:boolean(and:int(var_1_2EB:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0340)
            }
            
            if (cmpne:boolean(and:int(var_1_2EB:int, ldc:int(65536)), ldc:int(0))) {
                var_1_2EB = and:int(var_1_2EB:int, ldc:int(1914946383))
                goto(Label_0189)
            }
            
            var_1_2EB = and:int(var_1_2EB:int, ldc:int(-387075856))
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, stack_2A4_0:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d, stack_2A4_1:boolean)
            stack_184_0 = stack_ED_0 = stack_21F_0 = stack_2A4_0 = stack_307_0 = getfield(\u6d69\u69d9\u6d99\u64f2\u3776::\u8df4\ua068\u7e3f\ubff1\ub113\u3c25, this)
            
            if (logicalnot:boolean(getfield:boolean(\ud12e\u946b\u97b7\u51b2\u3d64::\u6c52\u156b\u4179\u5654\uceb8\u9af2, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776)))) {
                stack_307_1 = xor:int(ldc:int(5377), ldc:int(5376))
                goto(Label_0769)
            }
            
            Label_0693:
            
            if (cmpne:boolean(and:int(var_1_2EB:int, ldc:int(16777216)), ldc:int(0))) {
                var_1_2EB = and:int(var_1_2EB:int, ldc:int(548284121))
                goto(Label_0560)
            }
            
            if (cmpne:boolean(and:int(var_1_2EB:int, ldc:int(16777216)), ldc:int(0))) {
                var_1_2EB = and:int(var_1_2EB:int, ldc:int(-3736788))
                goto(Label_0419)
            }
            
            if (cmpeq:boolean(and:int(var_1_2EB:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0254)
            }
            
            if (cmpeq:boolean(and:int(var_1_2EB:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_1_2EB = and:int(var_1_2EB:int, ldc:int(-118170956))
            stack_307_1 = and:int(ldc:int(17114), ldc:int(-32508))
            Label_0769:
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, stack_307_0:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d, stack_307_1:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u6fb0\u99f7\u7330\u624e\u97e6\u760c(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ud12e\u946b\u97b7\u51b2\u3d64 p0) {
        var_2_61 : int
        
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
            var_2_61 = and:int(ldc:int(1531319397), ldc:int(1610308949))
            
            if (cmpne:boolean(getfield:\u7e3f\u9af2\u385b\u8308\u92ee(\ud12e\u946b\u97b7\u51b2\u3d64::\u3e75\u494c\u8709\ub32d\uc7fe\u93a2, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776)), getstatic:\u7e3f\u9af2\u385b\u8308\u92ee(\u7e3f\u9af2\u385b\u8308\u92ee::\u6198\u5db4\uc31c\u5f50\uf94d\u97e6))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1606624925))
                invokevirtual:void(\u6d69\u69d9\u6d99\u64f2\u3776::\u67e9\u5db4\uc7fe\ud523\ufe34\u8709, this:\u6d69\u69d9\u6d99\u64f2\u3776, and:int[expected:boolean](ldc:int(8449), ldc:int(7193)), initobject:\u6d69\u69d9\u6d99\u64f2\u3776[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u6d69\u69d9\u6d99\u64f2\u3776::<init>, invokevirtual:\u3d4b\u9af2\u71f1\u67d0\u99f7(\u3d4b\u9af2\u71f1\u67d0\u99f7::\ub113\ud12e\u3d64\ud158\u7330\u7006, getfield:\u3d4b\u9af2\u71f1\u67d0\u99f7(\u6d69\u69d9\u6d99\u64f2\u3776::\u0a06\u527a\u927d\uafe7\u5d20\u516c, this:\u6d69\u69d9\u6d99\u64f2\u3776)), getfield:long(\u6d69\u69d9\u6d99\u64f2\u3776::\ub102\u6cfe\uc3e3\u718f\ubf56\u3d4b, this:\u6d69\u69d9\u6d99\u64f2\u3776)))
            }
            else {
                invokevirtual:void(\u3d4b\u9af2\u71f1\u67d0\u99f7::\u392e\ud4fe\ufcaf\ub6ab\u760c\u071d, getfield:\u3d4b\u9af2\u71f1\u67d0\u99f7(\u6d69\u69d9\u6d99\u64f2\u3776::\u0a06\u527a\u927d\uafe7\u5d20\u516c, this:\u6d69\u69d9\u6d99\u64f2\u3776), p0:\ud12e\u946b\u97b7\u51b2\u3d64, initobject:\u6d69\u69d9\u6d99\u64f2\u3776[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u6d69\u69d9\u6d99\u64f2\u3776::<init>, invokevirtual:\u3d4b\u9af2\u71f1\u67d0\u99f7(\u3d4b\u9af2\u71f1\u67d0\u99f7::\ub113\ud12e\u3d64\ud158\u7330\u7006, getfield:\u3d4b\u9af2\u71f1\u67d0\u99f7(\u6d69\u69d9\u6d99\u64f2\u3776::\u0a06\u527a\u927d\uafe7\u5d20\u516c, this:\u6d69\u69d9\u6d99\u64f2\u3776)), getfield:long(\u6d69\u69d9\u6d99\u64f2\u3776::\ub102\u6cfe\uc3e3\u718f\ubf56\u3d4b, this:\u6d69\u69d9\u6d99\u64f2\u3776)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u3504\u183a\u0b8e\ud12e\u8c8a\u960f() {
        var_3_6D : \u67e9\u7873\u97e6\u88c5\u385b
        stack_C5_0 : \u67e9\u7873\u97e6\u88c5\u385b [generated]
        expr_8C : ITextComponent[] [generated]
        
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
            var_3_6D = initobject:\u67e9\u7873\u97e6\u88c5\u385b(\u67e9\u7873\u97e6\u88c5\u385b::<init>, this:\u6d69\u69d9\u6d99\u64f2\u3776[expected:\ub18d\u6bb9\u6c52\ua6bd\ud523], getstatic:\u8c8a\ube23\ubb2b\u647c\uc84e(\u8c8a\ube23\ubb2b\u647c\uc84e::\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a))
            invokevirtual:void(\u67e9\u7873\u97e6\u88c5\u385b::\u36d3\u624e\u12cb\u8bb0\u3504\u97b7, var_3_6D:\u67e9\u7873\u97e6\u88c5\u385b, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u6d69\u69d9\u6d99\u64f2\u3776::\u8d98\u7ce1\ucfaf\ub83f\u67d0\u516c), and:int(ldc:int(26639), ldc:int(4663)))))
            stack_C5_0 = var_3_6D:\u67e9\u7873\u97e6\u88c5\u385b
            expr_8C = newarray:ITextComponent[](net.minecraft.util.text.ITextComponent.class, and:int(ldc:int(1030), ldc:int(2050)))
            storeelement:ITextComponent(expr_8C:ITextComponent[], and:int(ldc:int(569), ldc:int(-572)), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u6d69\u69d9\u6d99\u64f2\u3776::\u8d98\u7ce1\ucfaf\ub83f\u67d0\u516c), xor:int(ldc:int(8199), ldc:int(8207)))))
            storeelement:ITextComponent(expr_8C:ITextComponent[], and:int(ldc:int(8725), ldc:int(17857)), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u6d69\u69d9\u6d99\u64f2\u3776::\u8d98\u7ce1\ucfaf\ub83f\u67d0\u516c), and:int(ldc:int(17321), ldc:int(15373)))))
            invokevirtual:void(\u67e9\u7873\u97e6\u88c5\u385b::\u7330\ubff1\ud36e\uc84e\u7043\ud36e, stack_C5_0:\u67e9\u7873\u97e6\u88c5\u385b, expr_8C:ITextComponent[])
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u69d9\u6d99\u64f2\u3776::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d69\u69d9\u6d99\u64f2\u3776), var_3_6D:\u67e9\u7873\u97e6\u88c5\u385b[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u4ab3\u5140\u4daf\u983f\u416d\u9255(int p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ud12e\u946b\u97b7\u51b2\u3d64 p1) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u69d9\u6d99\u64f2\u3776::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d69\u69d9\u6d99\u64f2\u3776), initobject:\u1833\u4f4a\u64f2\uc910\u5d20[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u1833\u4f4a\u64f2\uc910\u5d20::<init>, invokedynamic:BooleanConsumer(accept:(L\u59ec\u8413\u97e6\uc229\u3776/\u6d69\u69d9\u6d99\u64f2\u3776;L\u3bc9\u67e9\uc87f\u47c2\u5f50/\u16f6\u40a9\u5f50\ub113\ud51e/\ud12e\u946b\u97b7\u51b2\u3d64;I)Lit/unimi/dsi/fastutil/booleans/BooleanConsumer;, this:\u6d69\u69d9\u6d99\u64f2\u3776, p1:\ud12e\u946b\u97b7\u51b2\u3d64, p0:int), getstatic:\u5654\u7e3f\u3bd6\u6435\ua068(\u5654\u7e3f\u3bd6\u6435\ua068::\u516c\u8aa5\u8df4\u71f1\u8258\u4d85), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u6d69\u69d9\u6d99\u64f2\u3776::\u8d98\u7ce1\ucfaf\ub83f\u67d0\u516c), xor:int(ldc:int(1165), ldc:int(1159)))), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u6d69\u69d9\u6d99\u64f2\u3776::\u8d98\u7ce1\ucfaf\ub83f\u67d0\u516c), and:int(ldc:int(29711), ldc:int(2459)))), and:int[expected:boolean](ldc:int(2337), ldc:int(20999))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u120d\u7330\u51b2\u8d98\u47c2\u7d52(int p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ud12e\u946b\u97b7\u51b2\u3d64 p1) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u69d9\u6d99\u64f2\u3776::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d69\u69d9\u6d99\u64f2\u3776), initobject:\u1833\u4f4a\u64f2\uc910\u5d20[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u1833\u4f4a\u64f2\uc910\u5d20::<init>, invokedynamic:BooleanConsumer(accept:(L\u59ec\u8413\u97e6\uc229\u3776/\u6d69\u69d9\u6d99\u64f2\u3776;L\u3bc9\u67e9\uc87f\u47c2\u5f50/\u16f6\u40a9\u5f50\ub113\ud51e/\ud12e\u946b\u97b7\u51b2\u3d64;I)Lit/unimi/dsi/fastutil/booleans/BooleanConsumer;, this:\u6d69\u69d9\u6d99\u64f2\u3776, p1:\ud12e\u946b\u97b7\u51b2\u3d64, p0:int), getstatic:\u5654\u7e3f\u3bd6\u6435\ua068(\u5654\u7e3f\u3bd6\u6435\ua068::\u516c\u8aa5\u8df4\u71f1\u8258\u4d85), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u6d69\u69d9\u6d99\u64f2\u3776::\u8d98\u7ce1\ucfaf\ub83f\u67d0\u516c), and:int(ldc:int(10890), ldc:int(1070)))), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u6d69\u69d9\u6d99\u64f2\u3776::\u8d98\u7ce1\ucfaf\ub83f\u67d0\u516c), and:int(ldc:int(17103), ldc:int(4139)))), xor:int[expected:boolean](ldc:int(-32238), ldc:int(-32237))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u71f1\u74b1\u4c04\uc238\u3a62\uc7fe(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, net.minecraft.util.text.ITextComponent p1, int p2, int p3) {
        var_7_69 : int
        var_8_70 : int
        var_9_7A : int
        
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
            var_7_69 = add:int(p2:int, ldc:int(12))
            var_8_70 = sub:int(p3:int, ldc:int(12))
            var_9_7A = invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ucb79\ua3b4\u946b\uc246\ua068\u36d3, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u6d69\u69d9\u6d99\u64f2\u3776::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u6d69\u69d9\u6d99\u64f2\u3776), p1:ITextComponent[expected:ITextProperties])
            
            if (cmpgt:boolean(add:int(add:int(var_7_69:int, var_9_7A:int), and:int(ldc:int(6979), ldc:int(3))), getfield:int(\u6d69\u69d9\u6d99\u64f2\u3776::\uff55\u7873\u927d\ub8be\u8258\u6b0d, this:\u6d69\u69d9\u6d99\u64f2\u3776))) {
                var_7_69 = sub:int(sub:int(var_7_69:int, var_9_7A:int), ldc:int(20))
            }
            
            invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u8d98\u120d\u7ce1\u647c\u416d\uc238, this:\u6d69\u69d9\u6d99\u64f2\u3776[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, sub:int(var_7_69:int, and:int(ldc:int(3), ldc:int(99))), sub:int(var_8_70:int, and:int(ldc:int(3235), ldc:int(87))), add:int(add:int(var_7_69:int, var_9_7A:int), and:int(ldc:int(16935), ldc:int(12675))), add:int(add:int(var_8_70:int, ldc:int(8)), and:int(ldc:int(87), ldc:int(1283))), ldc:int(-1073741824), ldc:int(-1073741824))
            invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6bb9\u67e9\u8df4\u8413\u624e\ucb79, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u6d69\u69d9\u6d99\u64f2\u3776::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u6d69\u69d9\u6d99\u64f2\u3776), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:ITextComponent, i2f:float(var_7_69:int), i2f:float(var_8_70:int), ldc:int(16777215))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ub113\u7e3f\u4bc8\uc84e\uc84e\ub70c(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, int p3, int p4) {
        var_6_63 : int
        
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
        var_6_63 = and:int(ldc:int(-1683535440), ldc:int(-1142994611))
        
        if (getfield:boolean(\ud12e\u946b\u97b7\u51b2\u3d64::\u6c52\u156b\u4179\u5654\uceb8\u9af2, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776))) {
            invokespecial:void(\u6d69\u69d9\u6d99\u64f2\u3776::\ub113\ubefe\ua61f\u965f\u120d\u927d, this:\u6d69\u69d9\u6d99\u64f2\u3776, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:int, p4:int)
            goto(Label_0200)
        }
        
        Label_0111:
        
        if (cmpne:boolean(and:int(var_6_63:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_6_63:int, ldc:int(268435456)), ldc:int(0))) {
            var_6_63 = and:int(var_6_63:int, ldc:int(233192830))
        }
        else {
            var_6_63 = and:int(var_6_63:int, ldc:int(-1107628190))
            
            if (cmpeq:boolean(getfield:\u7e3f\u9af2\u385b\u8308\u92ee(\ud12e\u946b\u97b7\u51b2\u3d64::\u3e75\u494c\u8709\ub32d\uc7fe\u93a2, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776)), getstatic:\u7e3f\u9af2\u385b\u8308\u92ee(\u7e3f\u9af2\u385b\u8308\u92ee::\u69d9\u7bad\u8709\u9937\u446c\u67d0))) {
                invokespecial:void(\u6d69\u69d9\u6d99\u64f2\u3776::\uc29a\u6ec6\ub70c\u5bc4\u9255\u071d, this:\u6d69\u69d9\u6d99\u64f2\u3776, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:int, p4:int)
                goto(Label_0200)
            }
        }
        
        Label_0161:
        
        if (cmpeq:boolean(and:int(var_6_63:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_6_63:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0111)
            }
            
            var_6_63 = and:int(var_6_63:int, ldc:int(-73242217))
            
            if (cmpeq:boolean(getfield:\u7e3f\u9af2\u385b\u8308\u92ee(\ud12e\u946b\u97b7\u51b2\u3d64::\u3e75\u494c\u8709\ub32d\uc7fe\u93a2, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776)), getstatic:\u7e3f\u9af2\u385b\u8308\u92ee(\u7e3f\u9af2\u385b\u8308\u92ee::\u6198\u5db4\uc31c\u5f50\uf94d\u97e6))) {
                if (cmpge:boolean(getfield:int(\ud12e\u946b\u97b7\u51b2\u3d64::\u6198\u71f1\u8df4\u71f1\u7d52\u6c56, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776)), ldc:int(7))) {
                    var_6_63 = and:int(var_6_63:int, ldc:int(-582156482))
                    invokespecial:void(\u6d69\u69d9\u6d99\u64f2\u3776::\u7bad\u5140\u4cd9\u3504\u6b5f\uceb8, this:\u6d69\u69d9\u6d99\u64f2\u3776, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:int, p4:int)
                }
                else {
                    invokespecial:void(\u6d69\u69d9\u6d99\u64f2\u3776::\u4975\u7d52\u7af6\u385b\ubded\ua3b4, this:\u6d69\u69d9\u6d99\u64f2\u3776, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:int, p4:int, getfield:int(\ud12e\u946b\u97b7\u51b2\u3d64::\u6198\u71f1\u8df4\u71f1\u7d52\u6c56, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776)))
                }
            }
        }
        
        Label_0200:
        
        if (cmpne:boolean(and:int(var_6_63:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0161)
        }
        
        if (cmpeq:boolean(and:int(var_6_63:int, ldc:int(536870912)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0111)
    }
    
    private void \ub113\ubefe\ua61f\u965f\u120d\u927d(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, int p3, int p4) {
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
            invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u69d9\u6d99\u64f2\u3776::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d69\u69d9\u6d99\u64f2\u3776)), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u6d69\u69d9\u6d99\u64f2\u3776::\uc910\uc84e\ubff1\u759a\u59ec\ua3b4))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f))
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, ldc:float(0.0f), ldc:float(0.0f), ldc:int(10), ldc:int(28), ldc:int(10), ldc:int(28))
            
            if (cmpge:boolean(p3:int, p1:int)) {
                if (cmple:boolean(p3:int, add:int(p1:int, ldc:int(9)))) {
                    if (cmpge:boolean(p4:int, p2:int)) {
                        if (cmple:boolean(p4:int, add:int(p2:int, ldc:int(27)))) {
                            putfield:ITextComponent(\u6d69\u69d9\u6d99\u64f2\u3776::\u946b\u12b2\u3e2a\u97e6\u4179\u99f7, this:\u6d69\u69d9\u6d99\u64f2\u3776, getstatic:ITextComponent(\u6d69\u69d9\u6d99\u64f2\u3776::\u97e6\u3504\u6b5f\uc229\u7330\u62da))
                        }
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u4975\u7d52\u7af6\u385b\ubded\ua3b4(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, int p3, int p4, int p5) {
        var_7_B0 : int
        stack_1E7_1 : String [generated]
        expr_1D6 : Object[] [generated]
        
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
        var_7_B0 = and:int(ldc:int(1219861153), ldc:int(1637866473))
        invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u69d9\u6d99\u64f2\u3776::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d69\u69d9\u6d99\u64f2\u3776)), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u6d69\u69d9\u6d99\u64f2\u3776::\u718f\u6cfe\u64f2\u0a06\u5d20\u392e))
        invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f))
        
        if (cmplt:boolean(rem:int(getfield:int(\u6d69\u69d9\u6d99\u64f2\u3776::\u9255\uc3e3\u6cfe\u4c2b\u4c04\ucef1, this:\u6d69\u69d9\u6d99\u64f2\u3776), ldc:int(20)), ldc:int(10))) {
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, ldc:float(0.0f), ldc:float(0.0f), ldc:int(10), ldc:int(28), ldc:int(20), ldc:int(28))
            goto(Label_0230)
        }
        
        Label_0133:
        
        if (cmpeq:boolean(and:int(var_7_B0:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0392)
        }
        
        if (cmpeq:boolean(and:int(var_7_B0:int, ldc:int(32768)), ldc:int(0))) {
            var_7_B0 = and:int(var_7_B0:int, ldc:int(-1302361398))
            goto(Label_0303)
        }
        
        if (cmpeq:boolean(and:int(var_7_B0:int, ldc:int(65536)), ldc:int(0))) {
            var_7_B0 = and:int(var_7_B0:int, ldc:int(-1779129329))
        }
        else {
            var_7_B0 = and:int(var_7_B0:int, ldc:int(1872607981))
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, ldc:float(10.0f), ldc:float(0.0f), ldc:int(10), ldc:int(28), ldc:int(20), ldc:int(28))
        }
        
        Label_0230:
        
        if (cmpeq:boolean(and:int(var_7_B0:int, ldc:int(2048)), ldc:int(0))) {
            var_7_B0 = and:int(var_7_B0:int, ldc:int(1096075515))
            goto(Label_0392)
        }
        
        if (cmpeq:boolean(and:int(var_7_B0:int, ldc:int(128)), ldc:int(0))) {
            var_7_B0 = and:int(var_7_B0:int, ldc:int(-201952256))
        }
        else {
            if (cmpeq:boolean(and:int(var_7_B0:int, ldc:int(1073741824)), ldc:int(0))) {
                var_7_B0 = and:int(var_7_B0:int, ldc:int(-1370789224))
                goto(Label_0133)
            }
            
            var_7_B0 = and:int(var_7_B0:int, ldc:int(1358543809))
            
            if (cmpge:boolean(p3:int, p1:int)) {
                if (cmple:boolean(p3:int, add:int(p1:int, ldc:int(9)))) {
                    if (cmpge:boolean(p4:int, p2:int)) {
                        if (cmple:boolean(p4:int, add:int(p2:int, ldc:int(27)))) {
                            if (cmpgt:boolean(p5:int, ldc:int(0))) {
                                goto(Label_0392)
                            }
                            
                            putfield:ITextComponent(\u6d69\u69d9\u6d99\u64f2\u3776::\u946b\u12b2\u3e2a\u97e6\u4179\u99f7, this:\u6d69\u69d9\u6d99\u64f2\u3776, getstatic:ITextComponent(\u6d69\u69d9\u6d99\u64f2\u3776::\u9937\ub7dc\u3c25\ub19c\u7e3f\u4cd9))
                        }
                    }
                }
            }
        }
        
        Label_0303:
        
        if (cmpeq:boolean(and:int(var_7_B0:int, ldc:int(64)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_7_B0:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0230)
            }
            
            if (cmpeq:boolean(and:int(var_7_B0:int, ldc:int(4194304)), ldc:int(0))) {
                return:void()
            }
            
            goto(Label_0133)
        }
        
        Label_0392:
        
        if (cmpeq:boolean(and:int(var_7_B0:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0303)
        }
        
        if (cmpeq:boolean(and:int(var_7_B0:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0230)
        }
        
        if (cmpeq:boolean(and:int(var_7_B0:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0133)
        }
        
        var_7_B0 = and:int(var_7_B0:int, ldc:int(-948061241))
        
        if (cmpne:boolean(p5:int, xor:int(ldc:int(257), ldc:int(256)))) {
            var_7_B0 = and:int(var_7_B0:int, ldc:int(-843596823))
            stack_1E7_1 = loadelement:String(getstatic:String[](\u6d69\u69d9\u6d99\u64f2\u3776::\u8d98\u7ce1\ucfaf\ub83f\u67d0\u516c), xor:int(ldc:int(17487), ldc:int(17475)))
            expr_1D6 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(16388), ldc:int(16389)))
            storeelement:Object(expr_1D6:Object[], and:int(ldc:int(12581), ldc:int(-13622)), invokestatic:Integer[expected:Object](Integer::valueOf, p5:int))
            putfield:ITextComponent(\u6d69\u69d9\u6d99\u64f2\u3776::\u946b\u12b2\u3e2a\u97e6\u4179\u99f7, this:\u6d69\u69d9\u6d99\u64f2\u3776, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_1E7_1:String, expr_1D6:Object[]))
            goto(Label_0303)
        }
        
        putfield:ITextComponent(\u6d69\u69d9\u6d99\u64f2\u3776::\u946b\u12b2\u3e2a\u97e6\u4179\u99f7, this:\u6d69\u69d9\u6d99\u64f2\u3776, getstatic:ITextComponent(\u6d69\u69d9\u6d99\u64f2\u3776::\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1))
        goto(Label_0303)
    }
    
    private void \u7bad\u5140\u4cd9\u3504\u6b5f\uceb8(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, int p3, int p4) {
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
            invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u69d9\u6d99\u64f2\u3776::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d69\u69d9\u6d99\u64f2\u3776)), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u6d69\u69d9\u6d99\u64f2\u3776::\ud51e\ubefe\u8350\u36d3\u51fa\u6d99))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f))
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, ldc:float(0.0f), ldc:float(0.0f), ldc:int(10), ldc:int(28), ldc:int(10), ldc:int(28))
            
            if (cmpge:boolean(p3:int, p1:int)) {
                if (cmple:boolean(p3:int, add:int(p1:int, ldc:int(9)))) {
                    if (cmpge:boolean(p4:int, p2:int)) {
                        if (cmple:boolean(p4:int, add:int(p2:int, ldc:int(27)))) {
                            putfield:ITextComponent(\u6d69\u69d9\u6d99\u64f2\u3776::\u946b\u12b2\u3e2a\u97e6\u4179\u99f7, this:\u6d69\u69d9\u6d99\u64f2\u3776, getstatic:ITextComponent(\u6d69\u69d9\u6d99\u64f2\u3776::\uff55\u516c\u9033\ubcb0\ucef1\u9937))
                        }
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \uc29a\u6ec6\ub70c\u5bc4\u9255\u071d(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, int p3, int p4) {
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
            invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u69d9\u6d99\u64f2\u3776::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d69\u69d9\u6d99\u64f2\u3776)), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u6d69\u69d9\u6d99\u64f2\u3776::\u98a4\u4f4a\u3504\ub171\u52d3\u156b))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f))
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, ldc:float(0.0f), ldc:float(0.0f), ldc:int(10), ldc:int(28), ldc:int(10), ldc:int(28))
            
            if (cmpge:boolean(p3:int, p1:int)) {
                if (cmple:boolean(p3:int, add:int(p1:int, ldc:int(9)))) {
                    if (cmpge:boolean(p4:int, p2:int)) {
                        if (cmple:boolean(p4:int, add:int(p2:int, ldc:int(27)))) {
                            putfield:ITextComponent(\u6d69\u69d9\u6d99\u64f2\u3776::\u946b\u12b2\u3e2a\u97e6\u4179\u99f7, this:\u6d69\u69d9\u6d99\u64f2\u3776, getstatic:ITextComponent(\u6d69\u69d9\u6d99\u64f2\u3776::\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae))
                        }
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private boolean \ub7dc\u34df\u071d\u494c\u0b8e\u97e6() {
        var_1_61 : int
        stack_9E_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-657931419), ldc:int(-2093331875))
            
            if (logicaland:boolean(cmpne:boolean(getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776), aconstnull:\ud12e\u946b\u97b7\u51b2\u3d64()), cmpeq:boolean(getfield:\u8c8a\ube23\ubb2b\u647c\uc84e(\ud12e\u946b\u97b7\u51b2\u3d64::\u8cae\u392e\u5fe1\u5140\u3dd3\u7006, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776)), getstatic:\u8c8a\ube23\ubb2b\u647c\uc84e(\u8c8a\ube23\ubb2b\u647c\uc84e::\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a)))) {
                stack_9E_0 = xor:int(ldc:int(4104), ldc:int(4105))
            }
            else {
                var_1_61 = and:int(var_1_61:int, ldc:int(-89339298))
                stack_9E_0 = and:int(ldc:int(-19957), ldc:int(3540))
            }
            
            return:boolean(stack_9E_0:int)
        }
        
        goto(Label_0006)
    }
    
    private void \u5fe1\u6435\ud217\u183a\u8cae\u1833() {
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
            invokespecial:void(\u6d69\u69d9\u6d99\u64f2\u3776::\u946b\u760c\ubefe\ubff1\u8308\ud12e, this:\u6d69\u69d9\u6d99\u64f2\u3776, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u6d69\u69d9\u6d99\u64f2\u3776::\u93a2\u3d64\u16f6\u3e2a\u51b2\uf995, this:\u6d69\u69d9\u6d99\u64f2\u3776))
            invokespecial:void(\u6d69\u69d9\u6d99\u64f2\u3776::\u946b\u760c\ubefe\ubff1\u8308\ud12e, this:\u6d69\u69d9\u6d99\u64f2\u3776, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u6d69\u69d9\u6d99\u64f2\u3776::\ub171\u7ce1\u6435\ufe34\u3d64\u3e75, this:\u6d69\u69d9\u6d99\u64f2\u3776))
            invokespecial:void(\u6d69\u69d9\u6d99\u64f2\u3776::\u946b\u760c\ubefe\ubff1\u8308\ud12e, this:\u6d69\u69d9\u6d99\u64f2\u3776, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u6d69\u69d9\u6d99\u64f2\u3776::\u8df4\ua068\u7e3f\ubff1\ub113\u3c25, this:\u6d69\u69d9\u6d99\u64f2\u3776))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u946b\u760c\ubefe\ubff1\u8308\ud12e(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\u92ee\u5654\u5f50\u6c56\u6b0d\uf94d, p0:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d, and:int[expected:boolean](ldc:int(-9340), ldc:int(9315)))
            invokeinterface:boolean(List<E>::remove, getfield:List<\u3e75\ub8be\u88c5\ub7dc\uc246\u8753>(\u6d69\u69d9\u6d99\u64f2\u3776::\uc31c\u59ec\u600f\ub83f\uc87f\u9033, this:\u6d69\u69d9\u6d99\u64f2\u3776), p0:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:Object])
            invokeinterface:boolean(List<E>::remove, getfield:List<\u5654\u3e75\u92ff\u97e6\u8c8a\uf995>(\u6d69\u69d9\u6d99\u64f2\u3776::\u0b8e\ub113\u59ec\ub7dc\u4179\u67d0, this:\u6d69\u69d9\u6d99\u64f2\u3776), p0:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:Object])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ub171\ub1b9\u5d20\u3dd3\u4492\u97e6(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\u92ee\u5654\u5f50\u6c56\u6b0d\uf94d, p0:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d, and:int[expected:boolean](ldc:int(3585), ldc:int(4109)))
            invokevirtual:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u92ff\uafe7\u3e2a\u98a4\u8c8a\u16f6, this:\u6d69\u69d9\u6d99\u64f2\u3776[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9() {
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
            invokespecial:void(\u6d69\u69d9\u6d99\u64f2\u3776::\u946b\u760c\ubefe\ubff1\u8308\ud12e, this:\u6d69\u69d9\u6d99\u64f2\u3776, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u6d69\u69d9\u6d99\u64f2\u3776::\u71f1\ub6ab\u946b\ud36e\ufcaf\u9255, this:\u6d69\u69d9\u6d99\u64f2\u3776))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3e75\u3bd6\u4d85\ud217\u6435\u4179(\u494c\u4975\ua068\u0c95\uc84e.\uc31c\ub19c\u3e75\u1833\u8c8a p0) {
        var_2_67 : int
        var_4_81 : \uc31c\ub19c\u3e75\u1833\u8c8a
        var_2_1C4 : int
        var_5_EB : \u61a4\u8aa5\uff55\u718f\ub8be
        var_6_174 : \uae5d\u5654\uc910\ub18d\u7d52
        
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
            var_2_67 = and:int(and:int(ldc:int(-1718304240), ldc:int(56395311)), ldc:int(627019580))
            var_4_81 = checkcast:\uc31c\ub19c\u3e75\u1833\u8c8a(\u494c\u4975\ua068\u0c95\uc84e.\uc31c\ub19c\u3e75\u1833\u8c8a.class, invokeinterface:\uc31c\ub19c\u3e75\u1833\u8c8a(Map<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>::get, getfield:Map<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>(\ud12e\u946b\u97b7\u51b2\u3d64::\u3776\ua61f\uc2e8\uc9f6\ubb2b\u4e72, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776)), invokestatic:Integer[expected:Object](Integer::valueOf, getfield:int(\ud12e\u946b\u97b7\u51b2\u3d64::\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776)))))
            
            loop {
                if (cmpne:boolean(and:int(var_2_67:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0210)
                }
                
                if (cmpne:boolean(and:int(var_2_67:int, ldc:int(524288)), ldc:int(0))) {
                    var_2_67 = and:int(var_2_67:int, ldc:int(-1277818177))
                }
                else {
                    var_2_67 = and:int(var_2_67:int, ldc:int(-845173140))
                    putfield:long(\uc31c\ub19c\u3e75\u1833\u8c8a::\u51fa\u7330\u69d9\ua3b4\u9255\u3c25, p0:\uc31c\ub19c\u3e75\u1833\u8c8a, getfield:long(\uc31c\ub19c\u3e75\u1833\u8c8a::\u51fa\u7330\u69d9\ua3b4\u9255\u3c25, var_4_81:\uc31c\ub19c\u3e75\u1833\u8c8a))
                }
                
                Label_0170:
                
                if (cmpeq:boolean(and:int(var_2_67:int, ldc:int(1073741824)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_67:int, ldc:int(33554432)), ldc:int(0))) {
                        var_2_67 = and:int(var_2_67:int, ldc:int(-876521453))
                        loopcontinue()
                    }
                    
                    var_2_67 = and:int(var_2_67:int, ldc:int(-918631553))
                    putfield:String(\uc31c\ub19c\u3e75\u1833\u8c8a::\u392e\u4ab3\u5f50\ub70c\u76bc\uc910, p0:\uc31c\ub19c\u3e75\u1833\u8c8a, getfield:String(\uc31c\ub19c\u3e75\u1833\u8c8a::\u392e\u4ab3\u5f50\ub70c\u76bc\uc910, var_4_81:\uc31c\ub19c\u3e75\u1833\u8c8a))
                }
                
                Label_0210:
                
                if (cmpne:boolean(and:int(var_2_67:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0170)
                }
                
                if (cmpne:boolean(and:int(var_2_67:int, ldc:int(512)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_2_1C4 = and:int(var_2_67:int, ldc:int(1438049006))
            var_5_EB = invokestatic:\u61a4\u8aa5\uff55\u718f\ub8be(\u61a4\u8aa5\uff55\u718f\ub8be::\u8350\ubf56\u4f52\u9937\u8350\ub83f)
            
            try {
                loop {
                    if (cmpne:boolean(and:int(var_2_1C4:int, ldc:int(524288)), ldc:int(0))) {
                        var_2_1C4 = and:int(var_2_1C4:int, ldc:int(-711004227))
                        goto(Label_0343)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_1C4:int, ldc:int(33554432)), ldc:int(0))) {
                        var_2_1C4 = and:int(var_2_1C4:int, ldc:int(1734267394))
                        invokevirtual:void(\u61a4\u8aa5\uff55\u718f\ub8be::\u7af6\u67d0\u8753\u71f1\u6198\u494c, var_5_EB:\u61a4\u8aa5\uff55\u718f\ub8be, getfield:long(\ud12e\u946b\u97b7\u51b2\u3d64::\uc910\u7049\u4975\u97b7\u8c8a\u960f, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776)), getfield:int(\ud12e\u946b\u97b7\u51b2\u3d64::\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776)), p0:\uc31c\ub19c\u3e75\u1833\u8c8a)
                    }
                    
                    Label_0288:
                    
                    if (cmpeq:boolean(and:int(var_2_1C4:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_2_1C4:int, ldc:int(128)), ldc:int(0))) {
                            var_2_1C4 = and:int(var_2_1C4:int, ldc:int(855301077))
                            loopcontinue()
                        }
                        
                        var_2_1C4 = and:int(var_2_1C4:int, ldc:int(119009892))
                        invokeinterface:\uc31c\ub19c\u3e75\u1833\u8c8a(Map<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>::put, getfield:Map<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>(\ud12e\u946b\u97b7\u51b2\u3d64::\u3776\ua61f\uc2e8\uc9f6\ubb2b\u4e72, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776)), invokestatic:Integer(Integer::valueOf, getfield:int(\ud12e\u946b\u97b7\u51b2\u3d64::\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776))), p0:\uc31c\ub19c\u3e75\u1833\u8c8a)
                    }
                    
                    Label_0343:
                    
                    if (cmpeq:boolean(and:int(var_2_1C4:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_1C4:int, ldc:int(524288)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_2_1C4 = and:int(var_2_1C4:int, ldc:int(-1353202083))
            }
            catch (\u516c\u3d64\u718f\ub171\u6b5f.\uae5d\u5654\uc910\ub18d\u7d52 var_6_174) {
                loop {
                    if (cmpne:boolean(and:int(var_2_1C4:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0470)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_1C4:int, ldc:int(8192)), ldc:int(0))) {
                        var_2_1C4 = and:int(var_2_1C4:int, ldc:int(1948530497))
                    }
                    else {
                        var_2_1C4 = and:int(var_2_1C4:int, ldc:int(-1477120379))
                        invokeinterface:void(Logger::error, getstatic:Logger(\u6d69\u69d9\u6d99\u64f2\u3776::\u40a9\u8753\u9937\u4daf\uc2bd\ufe34), loadelement:String(getstatic:String[](\u6d69\u69d9\u6d99\u64f2\u3776::\u8d98\u7ce1\ucfaf\ub83f\u67d0\u516c), xor:int(ldc:int(8280), ldc:int(8277))))
                    }
                    
                    Label_0423:
                    
                    if (cmpeq:boolean(and:int(var_2_1C4:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_2_1C4:int, ldc:int(512)), ldc:int(0))) {
                            var_2_1C4 = and:int(var_2_1C4:int, ldc:int(1202346809))
                            loopcontinue()
                        }
                        
                        var_2_1C4 = and:int(var_2_1C4:int, ldc:int(668893880))
                        invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u69d9\u6d99\u64f2\u3776::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d69\u69d9\u6d99\u64f2\u3776), initobject:\uf94d\u647c\uc7fe\u4bc8\u97e6[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\uf94d\u647c\uc7fe\u4bc8\u97e6::<init>, var_6_174:\uae5d\u5654\uc910\ub18d\u7d52, this:\u6d69\u69d9\u6d99\u64f2\u3776[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006]))
                    }
                    
                    Label_0470:
                    
                    if (cmpeq:boolean(and:int(var_2_1C4:int, ldc:int(16777216)), ldc:int(0))) {
                        var_2_1C4 = and:int(var_2_1C4:int, ldc:int(746386893))
                        goto(Label_0423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_1C4:int, ldc:int(8)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_2_1C4 = and:int(var_2_1C4:int, ldc:int(-1030130150))
                }
                
                return:void()
            }
            
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u69d9\u6d99\u64f2\u3776::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d69\u69d9\u6d99\u64f2\u3776), this:\u6d69\u69d9\u6d99\u64f2\u3776[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9937\u8c8a\u527a\u8413\u5654\u4179(java.lang.String p0, java.lang.String p1) {
        var_5_81 : String
        var_6_86 : \u61a4\u8aa5\uff55\u718f\ub8be
        var_7_AF : \uae5d\u5654\uc910\ub18d\u7d52
        
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
            var_5_81 = ternaryop:String(invokevirtual:boolean(String::isEmpty, invokevirtual:String(String::trim, p1:String)), aconstnull:String(), p1:String)
            var_6_86 = invokestatic:\u61a4\u8aa5\uff55\u718f\ub8be(\u61a4\u8aa5\uff55\u718f\ub8be::\u8350\ubf56\u4f52\u9937\u8350\ub83f)
            
            try {
                invokevirtual:void(\u61a4\u8aa5\uff55\u718f\ub8be::\u4cd9\u8df4\u56bd\u946b\ub83f\u51fa, var_6_86:\u61a4\u8aa5\uff55\u718f\ub8be, getfield:long(\ud12e\u946b\u97b7\u51b2\u3d64::\uc910\u7049\u4975\u97b7\u8c8a\u960f, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776)), p0:String, var_5_81:String)
                invokevirtual:void(\ud12e\u946b\u97b7\u51b2\u3d64::\ua562\u64ab\u8d98\u4179\u71f1\u873d, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776), p0:String)
                invokevirtual:void(\ud12e\u946b\u97b7\u51b2\u3d64::\u3e75\u0800\ub70c\ufe34\u7e3f\ub18d, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776), var_5_81:String)
            }
            catch (\u516c\u3d64\u718f\ub171\u6b5f.\uae5d\u5654\uc910\ub18d\u7d52 var_7_AF) {
                invokeinterface:void(Logger::error, getstatic:Logger(\u6d69\u69d9\u6d99\u64f2\u3776::\u40a9\u8753\u9937\u4daf\uc2bd\ufe34), loadelement:String(getstatic:String[](\u6d69\u69d9\u6d99\u64f2\u3776::\u8d98\u7ce1\ucfaf\ub83f\u67d0\u516c), and:int(ldc:int(4174), ldc:int(3215))))
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u69d9\u6d99\u64f2\u3776::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d69\u69d9\u6d99\u64f2\u3776), initobject:\uf94d\u647c\uc7fe\u4bc8\u97e6[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\uf94d\u647c\uc7fe\u4bc8\u97e6::<init>, var_7_AF:\uae5d\u5654\uc910\ub18d\u7d52, this:\u6d69\u69d9\u6d99\u64f2\u3776[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006]))
                return:void()
            }
            
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u69d9\u6d99\u64f2\u3776::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d69\u69d9\u6d99\u64f2\u3776), this:\u6d69\u69d9\u6d99\u64f2\u3776[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u67e9\u5db4\uc7fe\ud523\ufe34\u8709(boolean p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 p1) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u69d9\u6d99\u64f2\u3776::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d69\u69d9\u6d99\u64f2\u3776), initobject:\u6c52\u93a2\u8709\ub102\u4bc8[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u6c52\u93a2\u8709\ub102\u4bc8::<init>, p1:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006, initobject:\uc9f6\u6bb9\uc7fe\u12cb\ub1b9\u494c[expected:\u9033\u4179\ube23\u5f50\ucfaf](\uc9f6\u6bb9\uc7fe\u12cb\ub1b9\u494c::<init>, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776), this:\u6d69\u69d9\u6d99\u64f2\u3776[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], getfield:\u3d4b\u9af2\u71f1\u67d0\u99f7(\u6d69\u69d9\u6d99\u64f2\u3776::\u0a06\u527a\u927d\uafe7\u5d20\u516c, this:\u6d69\u69d9\u6d99\u64f2\u3776), p0:boolean)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub32d\ub8be\u64ab\ua068\u9937\uf94d(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u69d9\u6d99\u64f2\u3776::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d69\u69d9\u6d99\u64f2\u3776), initobject:\u6c52\u93a2\u8709\ub102\u4bc8[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u6c52\u93a2\u8709\ub102\u4bc8::<init>, p0:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006, initobject:\ud7e8\u6435\u3a62\ufe34\ud7e8\u7bad[expected:\u9033\u4179\ube23\u5f50\ucfaf](\ud7e8\u6435\u3a62\ufe34\ud7e8\u7bad::<init>, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776), this:\u6d69\u69d9\u6d99\u64f2\u3776)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7049\ua3b4\u3c25\u5db4\u7049\ub18d() {
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
            putfield:boolean(\u6d69\u69d9\u6d99\u64f2\u3776::\u0c95\u99f7\u516c\u5245\ucef1\u3504, this:\u6d69\u69d9\u6d99\u64f2\u3776, xor:int[expected:boolean](ldc:int(26632), ldc:int(26633)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5245\u7e3f\u5db4\ua61f\u6b5f\uf9c5(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u7330\u0c95\u5f50\uc229\u8cae p0) {
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
            
            if (cmpne:boolean(p0:\u7330\u0c95\u5f50\uc229\u8cae, aconstnull:\u7330\u0c95\u5f50\uc229\u8cae())) {
                if (cmpeq:boolean(getstatic:\ub7dc\u6fb0\u965f\u8d98\u9af2(\ub7dc\u6fb0\u965f\u8d98\u9af2::\u9937\u8d98\uf9c5\uc238\u5fe1\ud12e), getfield:\ub7dc\u6fb0\u965f\u8d98\u9af2(\u7330\u0c95\u5f50\uc229\u8cae::\uc3e3\u3bd6\u6c52\u93a2\uc910\ub102, p0:\u7330\u0c95\u5f50\uc229\u8cae))) {
                    invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u69d9\u6d99\u64f2\u3776::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d69\u69d9\u6d99\u64f2\u3776), initobject:\u6c52\u93a2\u8709\ub102\u4bc8[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u6c52\u93a2\u8709\ub102\u4bc8::<init>, getfield:\u3d4b\u9af2\u71f1\u67d0\u99f7[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u6d69\u69d9\u6d99\u64f2\u3776::\u0a06\u527a\u927d\uafe7\u5d20\u516c, this:\u6d69\u69d9\u6d99\u64f2\u3776), initobject:\u120d\u718f\u3c25\u3711\u3e2a\u7006[expected:\u9033\u4179\ube23\u5f50\ucfaf](\u120d\u718f\u3c25\u3711\u3e2a\u7006::<init>, getfield:long(\ud12e\u946b\u97b7\u51b2\u3d64::\uc910\u7049\u4975\u97b7\u8c8a\u960f, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776)), p0:\u7330\u0c95\u5f50\uc229\u8cae, invokevirtual:\u6d69\u69d9\u6d99\u64f2\u3776(\u6d69\u69d9\u6d99\u64f2\u3776::\u0a06\u071d\u6d99\u98a4\u40a9\u647c, this:\u6d69\u69d9\u6d99\u64f2\u3776))))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u59ec\u8413\u97e6\uc229\u3776.\u6d69\u69d9\u6d99\u64f2\u3776 \u0a06\u071d\u6d99\u98a4\u40a9\u647c() {
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
            return:\u6d69\u69d9\u6d99\u64f2\u3776(initobject:\u6d69\u69d9\u6d99\u64f2\u3776(\u6d69\u69d9\u6d99\u64f2\u3776::<init>, getfield:\u3d4b\u9af2\u71f1\u67d0\u99f7(\u6d69\u69d9\u6d99\u64f2\u3776::\u0a06\u527a\u927d\uafe7\u5d20\u516c, this:\u6d69\u69d9\u6d99\u64f2\u3776), getfield:long(\u6d69\u69d9\u6d99\u64f2\u3776::\ub102\u6cfe\uc3e3\u718f\ubf56\u3d4b, this:\u6d69\u69d9\u6d99\u64f2\u3776)))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u527a\u873d\u071d\u4f52\uc229\ud217$19(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ud12e\u946b\u97b7\u51b2\u3d64 p0, int p1, boolean p2) {
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
    
    private void lambda$\ud51e\u3e75\u7330\u59ec\u3bd6\u5fe1$18() {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u69d9\u6d99\u64f2\u3776::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d69\u69d9\u6d99\u64f2\u3776), invokevirtual:\u6d69\u69d9\u6d99\u64f2\u3776[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u6d69\u69d9\u6d99\u64f2\u3776::\u0a06\u071d\u6d99\u98a4\u40a9\u647c, this:\u6d69\u69d9\u6d99\u64f2\u3776))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u527a\u61a4\ud158\ud158\ub6ab\u8bb0$17() {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u69d9\u6d99\u64f2\u3776::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d69\u69d9\u6d99\u64f2\u3776), invokevirtual:\u6d69\u69d9\u6d99\u64f2\u3776[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u6d69\u69d9\u6d99\u64f2\u3776::\u0a06\u071d\u6d99\u98a4\u40a9\u647c, this:\u6d69\u69d9\u6d99\u64f2\u3776))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u1833\ube23\u836c\u8389\u516c\u9033$16(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ud12e\u946b\u97b7\u51b2\u3d64 p0, int p1, boolean p2) {
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
    
    private void lambda$\u12b2\u1833\ua3b4\u624e\u3e75\u0800$15() {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u69d9\u6d99\u64f2\u3776::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d69\u69d9\u6d99\u64f2\u3776), invokevirtual:\u6d69\u69d9\u6d99\u64f2\u3776[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u6d69\u69d9\u6d99\u64f2\u3776::\u0a06\u071d\u6d99\u98a4\u40a9\u647c, this:\u6d69\u69d9\u6d99\u64f2\u3776))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u760c\uc29a\u3c25\u7ce1\u98a4\u47c2$14(long p0) {
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
    
    private void lambda$\u62da\u5f50\u7330\u4492\u51fa\u6d69$13(\u516c\u3d64\u718f\ub171\u6b5f.\uae5d\u5654\uc910\ub18d\u7d52 p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u69d9\u6d99\u64f2\u3776::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d69\u69d9\u6d99\u64f2\u3776), initobject:\uf94d\u647c\uc7fe\u4bc8\u97e6[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\uf94d\u647c\uc7fe\u4bc8\u97e6::<init>, invokestatic:ITextComponent(ITextComponent::func_244388_a, invokevirtual:String(Throwable::getMessage, p0:\uae5d\u5654\uc910\ub18d\u7d52[expected:Throwable])), getfield:\u3d4b\u9af2\u71f1\u67d0\u99f7[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u6d69\u69d9\u6d99\u64f2\u3776::\u0a06\u527a\u927d\uafe7\u5d20\u516c, this:\u6d69\u69d9\u6d99\u64f2\u3776)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u6fb0\u6c56\ubf56\u7006\u965f\u7c6b$12(int p0, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p1) {
        var_3_67 : int
        var_5_6F : \u52d3\ub6ab\ud158\u4e72\u69d9
        
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
            var_3_67 = and:int(and:int(ldc:int(2140103146), ldc:int(526351722)), ldc:int(-1611766303))
            var_5_6F = invokevirtual:\u52d3\ub6ab\ud158\u4e72\u69d9(\u9a18\ucb79\u3e75\u8d98\u983f::\u3d4b\u61a4\ub113\u92ee\u51fa\u64f2, checkcast:\u9a18\ucb79\u3e75\u8d98\u983f(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u9a18\ucb79\u3e75\u8d98\u983f.class, p1:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u9a18\ucb79\u3e75\u8d98\u983f]))
            
            loop {
                if (cmpne:boolean(and:int(var_3_67:int, ldc:int(32768)), ldc:int(0))) {
                    var_3_67 = and:int(var_3_67:int, ldc:int(1339764637))
                    goto(Label_0843)
                }
                
                if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0755)
                }
                
                if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(524288)), ldc:int(0))) {
                    var_3_67 = and:int(var_3_67:int, ldc:int(-438701664))
                    goto(Label_0649)
                }
                
                if (cmpne:boolean(and:int(var_3_67:int, ldc:int(512)), ldc:int(0))) {
                    var_3_67 = and:int(var_3_67:int, ldc:int(-1118608294))
                    goto(Label_0570)
                }
                
                if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0459)
                }
                
                if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(67108864)), ldc:int(0))) {
                    var_3_67 = and:int(var_3_67:int, ldc:int(484666798))
                    goto(Label_0303)
                }
                
                if (cmpne:boolean(and:int(var_3_67:int, ldc:int(256)), ldc:int(0))) {
                    var_3_67 = and:int(var_3_67:int, ldc:int(2131476827))
                    
                    if (cmpeq:boolean(var_5_6F:\u52d3\ub6ab\ud158\u4e72\u69d9, aconstnull:\u52d3\ub6ab\ud158\u4e72\u69d9())) {
                        looporswitchbreak()
                    }
                }
                
                Label_0216:
                
                if (cmpne:boolean(and:int(var_3_67:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0843)
                }
                
                if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(33554432)), ldc:int(0))) {
                    var_3_67 = and:int(var_3_67:int, ldc:int(510242054))
                    goto(Label_0755)
                }
                
                if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0649)
                }
                
                if (cmpne:boolean(and:int(var_3_67:int, ldc:int(2048)), ldc:int(0))) {
                    var_3_67 = and:int(var_3_67:int, ldc:int(731075058))
                    goto(Label_0570)
                }
                
                if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0459)
                }
                
                if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(4194304)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67 = and:int(var_3_67:int, ldc:int(-833235620))
                        loopcontinue()
                    }
                    
                    var_3_67 = and:int(var_3_67:int, ldc:int(-7374861))
                }
                
                Label_0303:
                
                if (cmpne:boolean(and:int(var_3_67:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0843)
                }
                
                if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(16384)), ldc:int(0))) {
                    var_3_67 = and:int(var_3_67:int, ldc:int(1013630998))
                    goto(Label_0755)
                }
                
                if (cmpne:boolean(and:int(var_3_67:int, ldc:int(512)), ldc:int(0))) {
                    var_3_67 = and:int(var_3_67:int, ldc:int(-1767252828))
                    goto(Label_0649)
                }
                
                if (cmpne:boolean(and:int(var_3_67:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0570)
                }
                
                if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(524288)), ldc:int(0))) {
                    var_3_67 = and:int(var_3_67:int, ldc:int(-1159579939))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67 = and:int(var_3_67:int, ldc:int(1073841511))
                        loopcontinue()
                    }
                    
                    var_3_67 = and:int(var_3_67:int, ldc:int(2142953261))
                    
                    switch (loadelement:int(getstatic:int[](\uc229\ufcaf\ua3b4\u8258\u4f52::\u34df\u62da\u946b\u3c25\u88c5\u7330), invokevirtual:int(Enum<E>::ordinal, getfield:\u7ce1\u6198\u6c52\u12b2\u6b0d(\u52d3\ub6ab\ud158\u4e72\u69d9::\ub70c\u516c\ud523\uafe7\ud217, var_5_6F:\u52d3\ub6ab\ud158\u4e72\u69d9)))) {
                        case 1:
                            looporswitchbreak(Label_0994)
                        
                        case 2:
                            invokespecial:void(\u6d69\u69d9\u6d99\u64f2\u3776::\u6fb0\u99f7\u7330\u624e\u97e6\u760c, this:\u6d69\u69d9\u6d99\u64f2\u3776, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776))
                            looporswitchbreak()
                        
                        case 3:
                            if (getfield:boolean(\u52d3\ub6ab\ud158\u4e72\u69d9::\u34df\uceb8\u34df\u8640\u1187, var_5_6F:\u52d3\ub6ab\ud158\u4e72\u69d9)) {
                                goto(Label_0570)
                            }
                            
                            if (getfield:boolean(\u52d3\ub6ab\ud158\u4e72\u69d9::\u69d9\u6d99\uc910\u6b0d\u8258, var_5_6F:\u52d3\ub6ab\ud158\u4e72\u69d9)) {
                                goto(Label_0755)
                            }
                            
                            invokespecial:void(\u6d69\u69d9\u6d99\u64f2\u3776::\u4ab3\u5140\u4daf\u983f\u416d\u9255, this:\u6d69\u69d9\u6d99\u64f2\u3776, p0:int, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776))
                            looporswitchbreak(Label_0994)
                        
                        default:
                            athrow(initobject:IllegalStateException(IllegalStateException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u6d69\u69d9\u6d99\u64f2\u3776::\u8d98\u7ce1\ucfaf\ub83f\u67d0\u516c), xor:int(ldc:int(-30588), ldc:int(-30569)))), getfield:\u7ce1\u6198\u6c52\u12b2\u6b0d(\u52d3\ub6ab\ud158\u4e72\u69d9::\ub70c\u516c\ud523\uafe7\ud217, var_5_6F:\u52d3\ub6ab\ud158\u4e72\u69d9)))))
                    }
                }
                
                Label_0459:
                
                if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(33554432)), ldc:int(0))) {
                    var_3_67 = and:int(var_3_67:int, ldc:int(-1204858339))
                    goto(Label_0843)
                }
                
                if (cmpne:boolean(and:int(var_3_67:int, ldc:int(1024)), ldc:int(0))) {
                    var_3_67 = and:int(var_3_67:int, ldc:int(1423465398))
                    goto(Label_0755)
                }
                
                if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0649)
                }
                
                if (cmpne:boolean(and:int(var_3_67:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_3_67:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67 = and:int(var_3_67:int, ldc:int(1972215377))
                        goto(Label_0303)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0216)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_67 = and:int(var_3_67:int, ldc:int(353972622))
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                Label_0570:
                
                if (cmpne:boolean(and:int(var_3_67:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0843)
                }
                
                if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0755)
                }
                
                if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(16384)), ldc:int(0))) {
                    var_3_67 = and:int(var_3_67:int, ldc:int(-97979757))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_67:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0459)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0303)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_67 = and:int(var_3_67:int, ldc:int(731061464))
                        goto(Label_0216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(134217728)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_67 = and:int(var_3_67:int, ldc:int(-1078998197))
                }
                
                Label_0649:
                
                if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0843)
                }
                
                if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_67 = and:int(var_3_67:int, ldc:int(1391941539))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67 = and:int(var_3_67:int, ldc:int(1274158527))
                        goto(Label_0570)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0459)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0303)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_67 = and:int(var_3_67:int, ldc:int(1943973137))
                        goto(Label_0216)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67:int, ldc:int(268435456)), ldc:int(0))) {
                        invokespecial:void(\u6d69\u69d9\u6d99\u64f2\u3776::\u3504\u183a\u0b8e\ud12e\u8c8a\u960f, this:\u6d69\u69d9\u6d99\u64f2\u3776)
                        looporswitchbreak()
                    }
                    
                    loopcontinue()
                }
                
                Label_0755:
                
                if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(134217728)), ldc:int(0))) {
                    var_3_67 = and:int(var_3_67:int, ldc:int(539300804))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67 = and:int(var_3_67:int, ldc:int(-423154663))
                        goto(Label_0649)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0570)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0459)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0303)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_67 = and:int(var_3_67:int, ldc:int(-1623939520))
                        goto(Label_0216)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(33554432)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_67 = and:int(var_3_67:int, ldc:int(-3449930))
                }
                
                Label_0843:
                
                if (cmpne:boolean(and:int(var_3_67:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0755)
                }
                
                if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0649)
                }
                
                if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0570)
                }
                
                if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(16384)), ldc:int(0))) {
                    var_3_67 = and:int(var_3_67:int, ldc:int(-195041290))
                    goto(Label_0459)
                }
                
                if (cmpne:boolean(and:int(var_3_67:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0303)
                }
                
                if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0216)
                }
                
                if (cmpeq:boolean(and:int(var_3_67:int, ldc:int(4194304)), ldc:int(0))) {
                    invokespecial:void(\u6d69\u69d9\u6d99\u64f2\u3776::\u120d\u7330\u51b2\u8d98\u47c2\u7d52, this:\u6d69\u69d9\u6d99\u64f2\u3776, p0:int, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776))
                    looporswitchbreak()
                }
            }
            
            Label_0994:
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u71ae\u4f4a\u97b7\u8709\ub6ab\u7049$11(net.minecraft.util.text.ITextComponent p0) {
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
            putfield:ITextComponent(\u6d69\u69d9\u6d99\u64f2\u3776::\u946b\u12b2\u3e2a\u97e6\u4179\u99f7, this:\u6d69\u69d9\u6d99\u64f2\u3776, p0:ITextComponent)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ud12e\u946b\u97b7\u51b2\u3d64 lambda$\u5140\ucb79\ub19c\uae5d\u0800\u8640$10() {
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
            return:\ud12e\u946b\u97b7\u51b2\u3d64(getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u64ab\u392e\u759a\uf995\ubcb0\ubf56$9(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokespecial:void(\u6d69\u69d9\u6d99\u64f2\u3776::\ud217\u4cd9\ub83f\u51b2\u8709\u0b8e, this:\u6d69\u69d9\u6d99\u64f2\u3776)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u8350\u7330\u4f52\u946b\ufe34\u6fb0$8(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
    
    private void lambda$\u9a18\u4492\u71f1\uc2e8\u8350\u9937$7() {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u69d9\u6d99\u64f2\u3776::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d69\u69d9\u6d99\u64f2\u3776), invokevirtual:\u6d69\u69d9\u6d99\u64f2\u3776[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u6d69\u69d9\u6d99\u64f2\u3776::\u0a06\u071d\u6d99\u98a4\u40a9\u647c, this:\u6d69\u69d9\u6d99\u64f2\u3776))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u3bd6\u97e6\u156b\u718f\u385b\u72f1$6() {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u69d9\u6d99\u64f2\u3776::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d69\u69d9\u6d99\u64f2\u3776), invokevirtual:\u6d69\u69d9\u6d99\u64f2\u3776[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u6d69\u69d9\u6d99\u64f2\u3776::\u0a06\u071d\u6d99\u98a4\u40a9\u647c, this:\u6d69\u69d9\u6d99\u64f2\u3776))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u6c56\uc3e3\ud4fe\u0800\u3e75\uff55$5(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u69d9\u6d99\u64f2\u3776::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d69\u69d9\u6d99\u64f2\u3776), initobject:\u6d99\u5245\ubefe\u3dd3\u97e6[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u6d99\u5245\ubefe\u3dd3\u97e6::<init>, this:\u6d69\u69d9\u6d99\u64f2\u3776, invokevirtual:\ud12e\u946b\u97b7\u51b2\u3d64(\ud12e\u946b\u97b7\u51b2\u3d64::clone, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776)), getfield:int(\ud12e\u946b\u97b7\u51b2\u3d64::\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u59ec\u4ab3\ub83f\u51fa\ud158\u6d99$4(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u69d9\u6d99\u64f2\u3776::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d69\u69d9\u6d99\u64f2\u3776), initobject:\u3776\ua6bd\u3711\uceb8\u88c5[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u3776\ua6bd\u3711\uceb8\u88c5::<init>, this:\u6d69\u69d9\u6d99\u64f2\u3776, invokevirtual:\uc31c\ub19c\u3e75\u1833\u8c8a(\uc31c\ub19c\u3e75\u1833\u8c8a::clone, checkcast:\uc31c\ub19c\u3e75\u1833\u8c8a(\u494c\u4975\ua068\u0c95\uc84e.\uc31c\ub19c\u3e75\u1833\u8c8a.class, invokeinterface:\uc31c\ub19c\u3e75\u1833\u8c8a(Map<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>::get, getfield:Map<Integer, \uc31c\ub19c\u3e75\u1833\u8c8a>(\ud12e\u946b\u97b7\u51b2\u3d64::\u3776\ua61f\uc2e8\uc9f6\ubb2b\u4e72, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776)), invokestatic:Integer[expected:Object](Integer::valueOf, getfield:int(\ud12e\u946b\u97b7\u51b2\u3d64::\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776)))))), getfield:\u8c8a\ube23\ubb2b\u647c\uc84e(\ud12e\u946b\u97b7\u51b2\u3d64::\u8cae\u392e\u5fe1\u5140\u3dd3\u7006, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776)), getfield:int(\ud12e\u946b\u97b7\u51b2\u3d64::\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u071d\u4c2b\ub32d\u8258\u5f50\u97e6$3(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
        var_4_6D : \u67e9\u7873\u97e6\u88c5\u385b
        
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
            var_4_6D = initobject:\u67e9\u7873\u97e6\u88c5\u385b(\u67e9\u7873\u97e6\u88c5\u385b::<init>, this:\u6d69\u69d9\u6d99\u64f2\u3776[expected:\ub18d\u6bb9\u6c52\ua6bd\ud523], getstatic:\u8c8a\ube23\ubb2b\u647c\uc84e(\u8c8a\ube23\ubb2b\u647c\uc84e::\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a))
            invokevirtual:void(\u67e9\u7873\u97e6\u88c5\u385b::\u36d3\u624e\u12cb\u8bb0\u3504\u97b7, var_4_6D:\u67e9\u7873\u97e6\u88c5\u385b, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u6d69\u69d9\u6d99\u64f2\u3776::\u8d98\u7ce1\ucfaf\ub83f\u67d0\u516c), xor:int(ldc:int(148), ldc:int(147)))))
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u69d9\u6d99\u64f2\u3776::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d69\u69d9\u6d99\u64f2\u3776), var_4_6D:\u67e9\u7873\u97e6\u88c5\u385b[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ub70c\u98a4\u760c\u36d3\uf995\u52d3$2(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u69d9\u6d99\u64f2\u3776::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d69\u69d9\u6d99\u64f2\u3776), initobject:\u12b2\u64ab\u8350\ud7e8\u6d99[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u12b2\u64ab\u8350\ud7e8\u6d99::<init>, this:\u6d69\u69d9\u6d99\u64f2\u3776[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], invokevirtual:\ud12e\u946b\u97b7\u51b2\u3d64(\ud12e\u946b\u97b7\u51b2\u3d64::clone, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776)), getfield:\u3d4b\u9af2\u71f1\u67d0\u99f7[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u6d69\u69d9\u6d99\u64f2\u3776::\u0a06\u527a\u927d\uafe7\u5d20\u516c, this:\u6d69\u69d9\u6d99\u64f2\u3776)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ubded\uc84e\u59ec\uf9c5\ucfaf\u3d64$1(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u69d9\u6d99\u64f2\u3776::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d69\u69d9\u6d99\u64f2\u3776), initobject:\u52d3\u3bc9\u8aa5\ua61f\u8cae[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u52d3\u3bc9\u8aa5\ua61f\u8cae::<init>, this:\u6d69\u69d9\u6d99\u64f2\u3776, invokevirtual:\ud12e\u946b\u97b7\u51b2\u3d64(\ud12e\u946b\u97b7\u51b2\u3d64::clone, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u4c2b\u6b0d\u64ab\u3a62\u3bd6\u97e6$0(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6d69\u69d9\u6d99\u64f2\u3776::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u6d69\u69d9\u6d99\u64f2\u3776), initobject:\u36d3\ud523\u0800\uceb8\u8389[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u36d3\ud523\u0800\uceb8\u8389::<init>, this:\u6d69\u69d9\u6d99\u64f2\u3776, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u6d69\u69d9\u6d99\u64f2\u3776::\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, this:\u6d69\u69d9\u6d99\u64f2\u3776)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F1 : int
        expr_6E : int [generated]
        stack_9D_0 : byte[] [generated]
        stack_9F_0 : byte[] [generated]
        stack_BE_0 : byte[] [generated]
        stack_C0_0 : byte[] [generated]
        stack_E5_0 : byte[] [generated]
        stack_604_0 : byte[] [generated]
        stack_65B_0 : byte[] [generated]
        stack_6C2_0 : byte[] [generated]
        var_4_5DC : int
        var_3_5E1 : byte[]
        var_5_5E2 : int
        expr_604 : byte [generated]
        var_0_6B8 : int
        expr_6C2 : byte [generated]
        stack_6F2_2 : byte [generated]
        var_2_9D : byte[]
        expr_A1 : int [generated]
        var_3_649 : byte[]
        var_5_64A : int
        expr_C0 : int [generated]
        var_3_F1 : String
        expr_F9 : String[] [generated]
        expr_103 : String[] [generated]
        var_3_4BB : String[]
        
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
        var_0_5F1 = and:int(ldc:int(-1776215412), ldc:int(-135185492))
        expr_6E = arraylength:int(stack_9D_0 = stack_9F_0 = stack_BE_0 = stack_C0_0 = stack_E5_0 = stack_604_0 = stack_65B_0 = stack_6C2_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("3GFI33YCHpdGjS4T9h4oGQiKWgDaRk3aSd92Egec1jzhBFsEXOdI20gJHslMjA7fdhIHnNY84QSdSDwuBFvWhqpI20iPXUfc1td1S0qahlunOB1JETYNqhmXCF2dUwgLxl1IjMzc3HONDhuJDhwMzM0NXcaIWlmXCF2dUwgL1ljGjE0NzAJLix2jVxpXyQhAHZcIXZ1TCAvWWMaMTQ3MElZX1hrcc40O3YYO3dzHjBE2DYrdlwhdnVMIC9ZYxoxNDcwSVlfWGtxzjc3KWwpr1xiXR0qJi92XCF2dUwgL1ljGjE0NzBJWV9Ya3HONTJvHG6eJnIiNDY3BvM0bGpcIXZ1TCAvWWMaMTQ3MElZX1hrcc40Nm5ZGWszbSI0RNszN3ZcIXZ1TCAvWWMaMTQ3MElZX1hrcc40dhxyG4MdKHkNayd3HDA6G25eXCF2dUwgL1ljGjE0NzBJWV9Ya3HONHQhdRtBNTVuGmseNzM0NXcaIWlmXCF2dUwgL1ljGjE0NzM2MnMZplsechhE9Dl3Jm9jZDkyNiY2ahkoYDRs2zFxclwhdnVMIC9ZYxoxNDczNjJzGaZbHnIYRPQ5dyZvY2Q5MjYmNmoZK1w0bNsxcnJcIXZ1TCAvWWMaMTQ3M3cYbxh09Dt0IHpOWis1Hyx6XCF2dUwgL1ljGjE0NzN3GG8YdPQ7dCB6DZpZHWoaqRo3QChE2TRtZlwhdnVMIC9ZYxoxNDcyMXUfclw0RNk0bWZcIXZ1TCAvWWMaMTS12G4Yb1sZbDRE2TRuIylyWCxqWWYPKDcwOWoedyNxX15cHmw0RNl2X15dG2gzMvdxY1oMNDcxLDdsIWUzMzA1XDRs23Nbal0baDMy93FjWgw0NzEsN2whZTMzMDRgNGzbcWAwdR+tGxNxWk0dMBkxNnUgcWkkLvB5Yhx1H60bE3FaTR0wG3EZdx9wLDYocNt1Yhx1H60bE3FaTR0wG3EZdx9wbOErL2hfG4IdZQ8EdR+tGxNxWk0dMBtxGXcfcGzhKy9oXSF2aCohNSx1H60bE3FaTR0wG3EZdx9wbOFoYRpyJXYq9HccLHUfrRsTcVpNHTBZJTBGJHoq8XAkL3IicDMzMl8ecBMrMzI3MTZxXDMzdx81dCtxYR9wT1sYNmzgLDMwLSR1KTRvnt4zcE8fNHUoND41NnIlZk5bXhitZ1xcKmzgLDMwLSR1KTRvnt4zcE8fNHVpIHxhGnInRScDM/NyTlteGK1nXFwqbOAsMzAtJHUpNG+e3nFmGTUtay9zG1pOW14YrWdcXCps4CwzMC0kdSk0b57ecWYgMzdDM/NyTlrfywrIysgU=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_5DC = expr_6E:int
        var_3_5E1 = newarray:byte[](byte.class, expr_6E:int)
        var_5_5E2 = expr_6E:int
        Label_1508:
        
        while (cmpne:boolean(and:int(var_0_5F1:int, ldc:int(4)), ldc:int(0))) {
            var_0_5F1 = and:int(var_0_5F1:int, ldc:int(2091636621))
            var_5_5E2 = add:int(var_5_5E2:int, ldc:int(-1))
            expr_604 = loadelement:byte(stack_604_0:byte[], var_5_5E2:int)
            storeelement:byte(var_3_5E1:byte[], var_5_5E2:int, xor:int(add:int(or:int(and:int(shl:int(expr_604:byte, xor:int(ldc:int(4688), ldc:int(4692))), ldc:int(-16)), and:int(shr:int(expr_604:byte[expected:int], xor:int(ldc:int(2104), ldc:int(2108))), ldc:int(15))), ldc:int(93)), ldc:int(41)))
            
            if (cmpne:boolean(var_5_5E2:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9F_0 = stack_9D_0 = stack_BE_0 = stack_C0_0 = stack_E5_0 = stack_604_0 = stack_65B_0 = stack_6C2_0 = var_3_5E1:byte[]
            goto(Label_0115)
        }
        
        var_0_5F1 = and:int(var_0_5F1:int, ldc:int(400808910))
        Label_1698:
        
        while (cmpeq:boolean(and:int(var_0_5F1:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_6B8 = and:int(var_0_5F1:int, ldc:int(-547204201))
            var_5_5E2 = add:int(var_5_5E2:int, ldc:int(-1))
            expr_6C2 = loadelement:byte(stack_6C2_0:byte[], var_5_5E2:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_5E2:int, ldc:int(6)), neg:int(var_4_5DC:int)), ldc:int(0))) {
                var_0_6B8 = and:int(var_0_6B8:int, ldc:int(905059038))
                stack_6F2_2 = add:byte(expr_6C2:byte, ldc:byte(6))
            }
            else {
                stack_6F2_2 = add:byte(expr_6C2:byte, loadelement:byte(var_3_5E1:byte[], add:int(var_5_5E2:int, ldc:int(6))))
            }
            
            var_0_5F1 = and:int(var_0_6B8:int, ldc:int(1462122212))
            storeelement:byte(var_3_5E1:byte[], var_5_5E2:int, stack_6F2_2:byte)
            
            if (cmpne:boolean(var_5_5E2:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9F_0 = stack_9D_0 = stack_BE_0 = stack_C0_0 = stack_E5_0 = stack_604_0 = stack_65B_0 = stack_6C2_0 = var_3_5E1:byte[]
            goto(Label_0197)
        }
        
        var_0_5F1 = and:int(var_0_5F1:int, ldc:int(220223547))
        goto(Label_1508)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_5F1:int, ldc:int(128)), ldc:int(0))) {
            var_0_5F1 = and:int(var_0_5F1:int, ldc:int(-1855487454))
            goto(Label_0197)
        }
        
        if (cmpne:boolean(and:int(var_0_5F1:int, ldc:int(1024)), ldc:int(0))) {
            var_0_5F1 = and:int(var_0_5F1:int, ldc:int(2028138117))
        }
        else {
            var_0_5F1 = and:int(var_0_5F1:int, ldc:int(1030640340))
            var_2_9D = stack_9D_0:byte[]
            expr_A1 = add:int(arraylength:int(stack_9F_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A1:int, ldc:int(0))) {
                var_3_649 = newarray:byte[](byte.class, expr_A1:int)
                var_5_64A = expr_A1:int
                
                loop {
                    var_0_5F1 = and:int(var_0_5F1:int, ldc:int(-696475681))
                    var_5_64A = add:int(var_5_64A:int, ldc:int(-1))
                    storeelement:byte(var_3_649:byte[], var_5_64A:int, add:int(shl:int(loadelement:byte(stack_65B_0:byte[], var_5_64A:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_9D:byte[], add:int(var_5_64A:int, and:int(ldc:int(16451), ldc:int(8325)))), ldc:int(2)), and:int(ldc:int(639), ldc:int(4287)))))
                    
                    if (cmpne:boolean(var_5_64A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9F_0 = stack_9D_0 = stack_BE_0 = stack_C0_0 = stack_E5_0 = stack_604_0 = stack_65B_0 = stack_6C2_0 = var_3_649:byte[]
            }
        }
        
        Label_0166:
        
        if (cmpeq:boolean(and:int(var_0_5F1:int, ldc:int(8388608)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_5F1:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_5F1 = and:int(var_0_5F1:int, ldc:int(1052136437))
            expr_C0 = arraylength:int(stack_C0_0:byte[])
            
            if (cmpne:boolean(expr_C0:int, ldc:int(0))) {
                var_4_5DC = expr_C0:int
                var_3_5E1 = newarray:byte[](byte.class, expr_C0:int)
                var_5_5E2 = expr_C0:int
                goto(Label_1698)
            }
        }
        
        Label_0197:
        
        if (cmpeq:boolean(and:int(var_0_5F1:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0166)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F1:int, ldc:int(4)), ldc:int(0))) {
            var_0_5F1 = and:int(var_0_5F1:int, ldc:int(-429842531))
            goto(Label_0115)
        }
        
        var_3_F1 = initobject:String(String::<init>, stack_E5_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_F9 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(67), ldc:int(97)))
        expr_103 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(306), ldc:int(5738)))
        storeelement:String(expr_F9:String[], and:int(ldc:int(3740), ldc:int(4126)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(28702), ldc:int(-28767)), xor:int(ldc:int(10243), ldc:int(10241))))
        storeelement:String(expr_103:String[], and:int(ldc:int(5234), ldc:int(914)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(1667), ldc:int(1665)), xor:int(ldc:int(43), ldc:int(51))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(10), ldc:int(4)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(-16107), ldc:int(-16115)), and:int(ldc:int(46), ldc:int(24686))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(8335), ldc:int(8322)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(17343), ldc:int(110)), xor:int(ldc:int(17435), ldc:int(17490))))
        storeelement:String(expr_103:String[], and:int(ldc:int(1171), ldc:int(2899)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(21081), ldc:int(457)), xor:int(ldc:int(4), ldc:int(92))))
        storeelement:String(expr_F9:String[], and:int(ldc:int(10395), ldc:int(59)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(602), ldc:int(4604)), and:int(ldc:int(887), ldc:int(24822))))
        storeelement:String(expr_103:String[], and:int(ldc:int(16773), ldc:int(15925)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(15), ldc:int(121)), and:int(ldc:int(17073), ldc:int(4304))))
        storeelement:String(expr_103:String[], and:int(ldc:int(1052), ldc:int(4132)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(22678), ldc:int(9368)), xor:int(ldc:int(2882), ldc:int(3057))))
        storeelement:String(expr_103:String[], and:int(ldc:int(10893), ldc:int(-28302)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(11003), ldc:int(439)), and:int(ldc:int(18646), ldc:int(502))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(1222), ldc:int(1216)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(20605), ldc:int(20651)), xor:int(ldc:int(4835), ldc:int(4639))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(33), ldc:int(32)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(-16152), ldc:int(-16364)), xor:int(ldc:int(2111), ldc:int(2335))))
        storeelement:String(expr_103:String[], and:int(ldc:int(262), ldc:int(8834)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(4404), ldc:int(2464)), and:int(ldc:int(1389), ldc:int(15178))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(24837), ldc:int(24838)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(24860), ldc:int(24660)), xor:int(ldc:int(17203), ldc:int(16961))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(8227), ldc:int(8233)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(-15135), ldc:int(-14957)), and:int(ldc:int(4532), ldc:int(11688))))
        storeelement:String(expr_103:String[], and:int(ldc:int(607), ldc:int(3083)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(9221), ldc:int(9637)), xor:int(ldc:int(17444), ldc:int(17898))))
        storeelement:String(expr_103:String[], and:int(ldc:int(223), ldc:int(1295)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(4109), ldc:int(4547)), xor:int(ldc:int(112), ldc:int(413))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(-32188), ldc:int(-32172)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(20989), ldc:int(1519)), xor:int(ldc:int(1266), ldc:int(1767))))
        storeelement:String(expr_F9:String[], and:int(ldc:int(4378), ldc:int(24602)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(-32093), ldc:int(-32586)), xor:int(ldc:int(21), ldc:int(571))))
        storeelement:String(expr_F9:String[], xor:int(ldc:int(-16292), ldc:int(-16315)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(4911), ldc:int(1598)), and:int(ldc:int(636), ldc:int(17992))))
        storeelement:String(expr_103:String[], and:int(ldc:int(2455), ldc:int(529)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(12436), ldc:int(13020)), xor:int(ldc:int(373), ldc:int(785))))
        storeelement:String(expr_103:String[], and:int(ldc:int(8), ldc:int(12808)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(4726), ldc:int(17388)), and:int(ldc:int(18317), ldc:int(641))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(577), ldc:int(584)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(17301), ldc:int(6857)), xor:int(ldc:int(10395), ldc:int(10757))))
        storeelement:String(expr_F9:String[], and:int(ldc:int(5345), ldc:int(8993)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(12381), ldc:int(12995)), and:int(ldc:int(9149), ldc:int(1717))))
        storeelement:String(expr_F9:String[], xor:int(ldc:int(44), ldc:int(49)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(693), ldc:int(19189)), xor:int(ldc:int(16622), ldc:int(16931))))
        storeelement:String(expr_F9:String[], and:int(ldc:int(2207), ldc:int(127)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(17455), ldc:int(18146)), and:int(ldc:int(747), ldc:int(27645))))
        storeelement:String(expr_103:String[], and:int(ldc:int(8716), ldc:int(16524)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(14950), ldc:int(14479)), and:int(ldc:int(17238), ldc:int(4878))))
        storeelement:String(expr_F9:String[], xor:int(ldc:int(6173), ldc:int(6147)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(18190), ldc:int(11047)), xor:int(ldc:int(-31963), ldc:int(-32762))))
        storeelement:String(expr_F9:String[], xor:int(ldc:int(1304), ldc:int(1336)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(4469), ldc:int(4694)), xor:int(ldc:int(17104), ldc:int(16872))))
        storeelement:String(expr_103:String[], xor:int(ldc:int(583), ldc:int(576)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(19320), ldc:int(14142)), xor:int(ldc:int(6234), ldc:int(6921))))
        storeelement:String(expr_F9:String[], xor:int(ldc:int(3139), ldc:int(3159)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(1879), ldc:int(4947)), and:int(ldc:int(4953), ldc:int(9177))))
        storeelement:String(expr_F9:String[], and:int(ldc:int(3103), ldc:int(4247)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(13309), ldc:int(17243)), xor:int(ldc:int(51), ldc:int(846))))
        storeelement:String(expr_F9:String[], xor:int(ldc:int(274), ldc:int(266)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(8501), ldc:int(8776)), xor:int(ldc:int(-27807), ldc:int(-28473))))
        storeelement:String(expr_F9:String[], xor:int(ldc:int(-14255), ldc:int(-14265)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(1487), ldc:int(1641)), xor:int(ldc:int(3676), ldc:int(3482))))
        storeelement:String(expr_F9:String[], xor:int(ldc:int(5642), ldc:int(5663)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(-26880), ldc:int(-27450)), and:int(ldc:int(18405), ldc:int(9191))))
        putstatic:String[](\u6d69\u69d9\u6d99\u64f2\u3776::\u8d98\u7ce1\ucfaf\ub83f\u67d0\u516c, expr_103:String[])
        var_3_4BB = expr_F9:String[]
        putstatic:Logger(\u6d69\u69d9\u6d99\u64f2\u3776::\u40a9\u8753\u9937\u4daf\uc2bd\ufe34, invokestatic:Logger(LogManager::getLogger))
        putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u6d69\u69d9\u6d99\u64f2\u3776::\ud51e\ubefe\u8350\u36d3\u51fa\u6d99, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_3_4BB:String[], and:int(ldc:int(8348), ldc:int(3124))), loadelement:String(var_3_4BB:String[], and:int(ldc:int(1045), ldc:int(2589)))))
        putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u6d69\u69d9\u6d99\u64f2\u3776::\u98a4\u4f4a\u3504\ub171\u52d3\u156b, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_3_4BB:String[], xor:int(ldc:int(2145), ldc:int(2165))), loadelement:String(var_3_4BB:String[], xor:int(ldc:int(863), ldc:int(841)))))
        putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u6d69\u69d9\u6d99\u64f2\u3776::\uc910\uc84e\ubff1\u759a\u59ec\ua3b4, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_3_4BB:String[], xor:int(ldc:int(265), ldc:int(285))), loadelement:String(var_3_4BB:String[], and:int(ldc:int(215), ldc:int(18487)))))
        putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u6d69\u69d9\u6d99\u64f2\u3776::\u718f\u6cfe\u64f2\u0a06\u5d20\u392e, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_3_4BB:String[], and:int(ldc:int(21), ldc:int(30))), loadelement:String(var_3_4BB:String[], xor:int(ldc:int(612), ldc:int(636)))))
        putstatic:ITextComponent(\u6d69\u69d9\u6d99\u64f2\u3776::\u4c2b\u9af2\u9033\u718f\u6435\uc31c, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_4BB:String[], and:int(ldc:int(281), ldc:int(59)))))
        putstatic:ITextComponent(\u6d69\u69d9\u6d99\u64f2\u3776::\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_4BB:String[], and:int(ldc:int(794), ldc:int(22747)))))
        putstatic:ITextComponent(\u6d69\u69d9\u6d99\u64f2\u3776::\ubcb0\u0a06\u7e3f\ub70c\u76bc\ud36e, invokevirtual:IFormattableTextComponent(IFormattableTextComponent::appendString, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_4BB:String[], and:int(ldc:int(16667), ldc:int(27)))), loadelement:String(var_3_4BB:String[], and:int(ldc:int(1757), ldc:int(2334)))))
        putstatic:ITextComponent(\u6d69\u69d9\u6d99\u64f2\u3776::\u97e6\u3504\u6b5f\uc229\u7330\u62da, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_4BB:String[], xor:int(ldc:int(16537), ldc:int(16516)))))
        putstatic:ITextComponent(\u6d69\u69d9\u6d99\u64f2\u3776::\u9937\ub7dc\u3c25\ub19c\u7e3f\u4cd9, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_4BB:String[], xor:int(ldc:int(-31228), ldc:int(-31206)))))
        putstatic:ITextComponent(\u6d69\u69d9\u6d99\u64f2\u3776::\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_4BB:String[], and:int(ldc:int(543), ldc:int(9279)))))
        putstatic:ITextComponent(\u6d69\u69d9\u6d99\u64f2\u3776::\uff55\u516c\u9033\ubcb0\ucef1\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_4BB:String[], and:int(ldc:int(19056), ldc:int(1195)))))
        putstatic:ITextComponent(\u6d69\u69d9\u6d99\u64f2\u3776::\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_4BB:String[], and:int(ldc:int(4321), ldc:int(8253)))))
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_65C : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
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
        var_3_65C = and:int(ldc:int(407566832), ldc:int(-272703731))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6d69\u69d9\u6d99\u64f2\u3776[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(1)), ldc:int(0))) {
            var_3_65C = and:int(var_3_65C:int, ldc:int(-400655872))
            var_5_81 = and:int(ldc:int(-30579), ldc:int(30288))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(29285), ldc:int(-31616)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_65C:int, ldc:int(763255141))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(18528), ldc:int(18529)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(6216), ldc:int(6217)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_65C = and:int(var_3_DA:int, ldc:int(-110105816))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(4230), ldc:int(4231)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1500)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(21128024))
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1093)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1603748215))
                        goto(Label_0925)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0792)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(732635232))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0556)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-969904116))
                    }
                    else {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(747272723))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0556)
                            }
                            
                            goto(Label_0792)
                        }
                    }
                    
                    Label_0410:
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1500)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(48218424))
                        goto(Label_1093)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1444595711))
                        goto(Label_0925)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0792)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-1206953311))
                            var_11_EB = and:int(ldc:int(-3778), ldc:int(3265))
                            goto(Label_1489)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0556:
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1629385602))
                        goto(Label_1500)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1443311933))
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1093)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0925)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0792)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1953804543))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0792)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1500)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(784076379))
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1093)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(269460264))
                        goto(Label_0925)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1513401628))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0556)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(1927743363))
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1556007453))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0792:
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1500)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1493670306))
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-892445509))
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(552837756))
                        goto(Label_1093)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-2133901940))
                            goto(Label_0556)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-159258859))
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(523946509))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(520), ldc:int(521))
                                goto(Label_1093)
                            }
                        }
                    }
                    
                    Label_0925:
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1973206050))
                        goto(Label_1500)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(344186156))
                        goto(Label_1371)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(798629738))
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0792)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(4862551))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0556)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(569093703))
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1271916916))
                        var_11_EB = and:int(ldc:int(-24083), ldc:int(21010))
                    }
                    
                    Label_1093:
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1500)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-1641465323))
                            goto(Label_0925)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0792)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-1809285106))
                            goto(Label_0556)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(304742028))
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1756286616))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1371)
                            }
                        }
                    }
                    
                    Label_1209:
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1989945836))
                        goto(Label_1500)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(1902249953))
                            goto(Label_1093)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(198400764))
                            goto(Label_0925)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-380661524))
                            goto(Label_0792)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-96553190))
                            goto(Label_0556)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-909536737))
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-593599819))
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(758892873))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1489)
                    }
                    
                    Label_1371:
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1500)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(686148567))
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1093)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0925)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0792)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0556)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1264499603))
                        goto(Label_0410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_65C = and:int(var_3_65C:int, ldc:int(142338083))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1489:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_667 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1500:
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1293540485))
                        goto(Label_1371)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1938665762))
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1093)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-408233523))
                        goto(Label_0925)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1781910474))
                        goto(Label_0792)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-332820116))
                        goto(Label_0556)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1555290457))
                        goto(Label_0410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1329318977))
                        var_17_667 = add:int(var_16_119:int, and:int(ldc:int(1101), ldc:int(21249)))
                        looporswitchbreak()
                    }
                }
                
                var_3_65C = and:int(var_3_65C:int, ldc:int(421423676))
                
                if (cmple:boolean(var_5_81 = var_17_667:int, sub:int(var_6_88:int, xor:int(ldc:int(16496), ldc:int(16497))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(16384)), ldc:int(0))) {
            var_3_65C = and:int(var_3_65C:int, ldc:int(-1349852899))
            goto(Label_0108)
        }
    }
}
