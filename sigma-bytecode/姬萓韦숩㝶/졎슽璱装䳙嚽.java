public class \u59ec\u8413\u97e6\uc229\u3776.\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd {
    public void \uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(int p0, int p1, boolean p2, boolean p3) {
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
            invokespecial:Object(Object::<init>, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
            putfield:boolean(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u51b2\u1833\ud7e8\uc31c\u8350\u67e9, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd, p2:boolean)
            putfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u56bd\ud158\u494c\uc9f6\ubb2b\u71ae, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd, ldc:int(-1))
            putfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\uae5d\u8aa5\u7043\u6c56\u600f\ub32d, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd, ldc:int(-1))
            putfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\ua61f\u9a18\u61a4\u516c\u3c25\u516c, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd, ldc:int(-1))
            storeelement:float(putfield:float[](\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\ub6ab\u836c\u12cb\u7006\u624e\u0c95, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd, newarray:float[](float.class, xor:int(ldc:int(-27391), ldc:int(-27387)))), and:int(ldc:int(-7332), ldc:int(7203)), ldc:float(1.0f))
            storeelement:float(getfield:float[](\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\ub6ab\u836c\u12cb\u7006\u624e\u0c95, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd), xor:int(ldc:int(129), ldc:int(128)), ldc:float(1.0f))
            storeelement:float(getfield:float[](\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\ub6ab\u836c\u12cb\u7006\u624e\u0c95, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd), and:int(ldc:int(29466), ldc:int(1030)), ldc:float(1.0f))
            storeelement:float(getfield:float[](\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\ub6ab\u836c\u12cb\u7006\u624e\u0c95, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd), and:int(ldc:int(4423), ldc:int(17939)), ldc:float(0.0f))
            invokevirtual:void(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u946b\u5245\u7e3f\uc87f\uc4d2\u183a, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd, p0:int, p1:int, p3:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u946b\u5245\u7e3f\uc87f\uc4d2\u183a(int p0, int p1, boolean p2) {
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
    
    private void \u51b2\ubefe\u6cfe\ubf56\u7043\ud217(int p0, int p1, boolean p2) {
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
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\ub6ab\u6fb0\u385b\u4d85\u7ce1\uae5d)
            
            if (cmpge:boolean(getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u56bd\ud158\u494c\uc9f6\ubb2b\u71ae, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd), ldc:int(0))) {
                invokevirtual:void(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u6d69\u1187\ubb2b\ube23\u718f\u3776, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd)
            }
            
            invokevirtual:void(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\ub8be\ufcaf\u6d69\u7d52\uf995\u4e72, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd, p0:int, p1:int, p2:boolean)
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u446c\u8df4\u6fb0\u12cb\u8308\u76bc, getstatic:int(\u7006\u88c5\u5bc4\ud12e\u98a4\uae87::\u7e3f\u5654\ub113\u8350\u4e72\u5d20), and:int(ldc:int(-23380), ldc:int(6992)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6d69\u1187\ubb2b\ube23\u718f\u3776() {
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
            var_1_5F = and:int(ldc:int(-38941078), ldc:int(-12755331))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
            invokevirtual:void(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u5fe1\u8308\u9937\u071d\u385b\u3a62, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd)
            invokevirtual:void(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u8c8a\u4f4a\u718f\u873d\u7873\u7bad, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd)
            
            if (cmpgt:boolean(getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\ua61f\u9a18\u61a4\u516c\u3c25\u516c, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd), ldc:int(-1))) {
                invokestatic:void(\u9255\uc2e8\u6d69\u7e3f\uae87\uc31c::\ubff1\ub6ab\ub18d\u56bd\u12b2\u527a, getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\ua61f\u9a18\u61a4\u516c\u3c25\u516c, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd))
                putfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\ua61f\u9a18\u61a4\u516c\u3c25\u516c, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd, ldc:int(-1))
            }
            
            loop {
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(8192)), ldc:int(0))) {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-1503794464))
                }
                else {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-538108676))
                    
                    if (cmpgt:boolean(getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\uae5d\u8aa5\u7043\u6c56\u600f\ub32d, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd), ldc:int(-1))) {
                        invokestatic:void(\u9255\uc2e8\u6d69\u7e3f\uae87\uc31c::\ubff1\ub6ab\ub18d\u56bd\u12b2\u527a, getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\uae5d\u8aa5\u7043\u6c56\u600f\ub32d, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd))
                        putfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\uae5d\u8aa5\u7043\u6c56\u600f\ub32d, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd, ldc:int(-1))
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(1024)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            if (cmpgt:boolean(getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u56bd\ud158\u494c\uc9f6\ubb2b\u71ae, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd), ldc:int(-1))) {
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u446c\u8df4\u6fb0\u12cb\u8308\u76bc, getstatic:int(\u7006\u88c5\u5bc4\ud12e\u98a4\uae87::\u7e3f\u5654\ub113\u8350\u4e72\u5d20), and:int(ldc:int(24624), ldc:int(-24625)))
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\ub8be\u8413\u92ff\u7049\ub70c\u6b0d, getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u56bd\ud158\u494c\uc9f6\ubb2b\u71ae, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd))
                putfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u56bd\ud158\u494c\uc9f6\ubb2b\u71ae, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd, ldc:int(-1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u36d3\u6d99\u71f1\u7873\u839e\u8aa5(\u59ec\u8413\u97e6\uc229\u3776.\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd p0) {
        var_2_5F : int
        var_4_80 : int
        var_5_F7 : int
        
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
            var_2_5F = and:int(ldc:int(1264258634), ldc:int(1550690815))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
            
            if (logicalnot:boolean(invokestatic:boolean(\u3a62\u92ff\u12cb\u8753\u7bad::\u3c25\u5654\u56bd\u527a\u4179\u0800))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-19398946))
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u446c\u8df4\u6fb0\u12cb\u8308\u76bc, getstatic:int(\u7006\u88c5\u5bc4\ud12e\u98a4\uae87::\u7e3f\u5654\ub113\u8350\u4e72\u5d20), getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u56bd\ud158\u494c\uc9f6\ubb2b\u71ae, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd))
                var_4_80 = invokestatic:int(\u3a62\u92ff\u12cb\u8753\u7bad::\u71ae\u8709\u0a06\u4f4a\ucef1\u9af2)
                
                if (cmpne:boolean(var_4_80:int, ldc:int(0))) {
                    var_5_F7 = invokestatic:int(\u3a62\u92ff\u12cb\u8753\u7bad::\u6bb9\ub70c\u3d64\u4d85\ub8be\u494c)
                    invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, var_4_80:int)
                    invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u446c\u8df4\u6fb0\u12cb\u8308\u76bc, getstatic:int(\u7006\u88c5\u5bc4\ud12e\u98a4\uae87::\u7e3f\u5654\ub113\u8350\u4e72\u5d20), getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u56bd\ud158\u494c\uc9f6\ubb2b\u71ae, p0:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd))
                    invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\ub19c\ubf56\uc87f\u3bd6\u960f\u56bd, and:int(ldc:int(4081), ldc:int(24037)), and:int(ldc:int(-31257), ldc:int(31240)), and:int(ldc:int(-3638), ldc:int(1589)), and:int(ldc:int(3662), ldc:int(-3663)), and:int(ldc:int(-28809), ldc:int(28808)), and:int(ldc:int(2109), ldc:int(-10814)), invokestatic:int(Math::min, getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u7ce1\u6fb0\uc229\u7ce1\u47c2\u839e, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd), getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u7ce1\u6fb0\uc229\u7ce1\u47c2\u839e, p0:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd)), invokestatic:int(Math::min, getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\uc2e8\u8d90\u40a9\u98a4\u7bad\u5140, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd), getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\uc2e8\u8d90\u40a9\u98a4\u7bad\u5140, p0:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd)))
                    invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, var_5_F7:int)
                }
            }
            else {
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u446c\u8df4\u6fb0\u12cb\u8308\u76bc, ldc:int(36008), getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u56bd\ud158\u494c\uc9f6\ubb2b\u71ae, p0:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd))
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u446c\u8df4\u6fb0\u12cb\u8308\u76bc, ldc:int(36009), getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u56bd\ud158\u494c\uc9f6\ubb2b\u71ae, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd))
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u97e6\u92ee\u6fb0\u3c25\u72f1\u6cfe, and:int(ldc:int(-28774), ldc:int(24677)), and:int(ldc:int(20633), ldc:int(-20666)), getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u7ce1\u6fb0\uc229\u7ce1\u47c2\u839e, p0:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd), getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\uc2e8\u8d90\u40a9\u98a4\u7bad\u5140, p0:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd), and:int(ldc:int(-11536), ldc:int(10507)), and:int(ldc:int(-16865), ldc:int(16864)), getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u7ce1\u6fb0\uc229\u7ce1\u47c2\u839e, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd), getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\uc2e8\u8d90\u40a9\u98a4\u7bad\u5140, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd), and:int(ldc:int(320), ldc:int(1296)), and:int(ldc:int(9869), ldc:int(11826)))
            }
            
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u446c\u8df4\u6fb0\u12cb\u8308\u76bc, getstatic:int(\u7006\u88c5\u5bc4\ud12e\u98a4\uae87::\u7e3f\u5654\ub113\u8350\u4e72\u5d20), and:int(ldc:int(7104), ldc:int(-7113)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub8be\ufcaf\u6d69\u7d52\uf995\u4e72(int p0, int p1, boolean p2) {
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
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
            putfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u0a06\u7c6b\u67d0\u836c\u647c\ub113, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd, p0:int)
            putfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\uc29a\u7e3f\u7ce1\u72f1\u873d\u839e, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd, p1:int)
            putfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u7ce1\u6fb0\uc229\u7ce1\u47c2\u839e, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd, p0:int)
            putfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\uc2e8\u8d90\u40a9\u98a4\u7bad\u5140, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd, p1:int)
            putfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u56bd\ud158\u494c\uc9f6\ubb2b\u71ae, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd, invokestatic:int(\u3a62\u92ff\u12cb\u8753\u7bad::\u71ae\u3bc9\uc4d2\u51b2\u836c\u67e9))
            putfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\uae5d\u8aa5\u7043\u6c56\u600f\ub32d, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd, invokestatic:int(\u9255\uc2e8\u6d69\u7e3f\uae87\uc31c::\ubff1\ubf56\u5db4\u5245\u4f4a\ufe34))
            
            if (getfield:boolean(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u51b2\u1833\ud7e8\uc31c\u8350\u67e9, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd)) {
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, putfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\ua61f\u9a18\u61a4\u516c\u3c25\u516c, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd, invokestatic:int(\u9255\uc2e8\u6d69\u7e3f\uae87\uc31c::\ubff1\ubf56\u5db4\u5245\u4f4a\ufe34)))
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0, and:int(ldc:int(24553), ldc:int(3557)), and:int(ldc:int(15399), ldc:int(10641)), xor:int(ldc:int(7035), ldc:int(15739)))
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0, xor:int(ldc:int(848), ldc:int(3761)), xor:int(ldc:int(4617), ldc:int(14857)), xor:int(ldc:int(2877), ldc:int(11581)))
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0, xor:int(ldc:int(22668), ldc:int(21869)), xor:int(ldc:int(6139), ldc:int(16377)), and:int(ldc:int(15618), ldc:int(10533)))
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0, and:int(ldc:int(11745), ldc:int(24561)), and:int(ldc:int(10443), ldc:int(15875)), and:int(ldc:int(27008), ldc:int(11640)))
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0, xor:int(ldc:int(9359), ldc:int(10606)), ldc:int(34892), and:int(ldc:int(10271), ldc:int(-10272)))
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\ubcb0\ub70c\u6c52\u3776\u93a2\u8df4, and:int(ldc:int(3553), ldc:int(19953)), and:int(ldc:int(8906), ldc:int(-10972)), and:int(ldc:int(22786), ldc:int(6498)), getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u7ce1\u6fb0\uc229\u7ce1\u47c2\u839e, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd), getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\uc2e8\u8d90\u40a9\u98a4\u7bad\u5140, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd), and:int(ldc:int(25729), ldc:int(-26242)), and:int(ldc:int(6442), ldc:int(23298)), xor:int(ldc:int(-32345), ldc:int(-27231)), checkcast:IntBuffer(java.nio.IntBuffer.class, aconstnull:IntBuffer()))
            }
            
            invokevirtual:void(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\ua068\u34df\uafe7\u9033\u16f6\ubff1, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd, and:int(ldc:int(11950), ldc:int(10000)))
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\uae5d\u8aa5\u7043\u6c56\u600f\ub32d, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd))
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\ubcb0\ub70c\u6c52\u3776\u93a2\u8df4, xor:int(ldc:int(2830), ldc:int(1775)), and:int(ldc:int(-25823), ldc:int(17500)), ldc:int(32856), getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u7ce1\u6fb0\uc229\u7ce1\u47c2\u839e, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd), getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\uc2e8\u8d90\u40a9\u98a4\u7bad\u5140, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd), and:int(ldc:int(-30137), ldc:int(21936)), and:int(ldc:int(6408), ldc:int(15695)), and:int(ldc:int(7169), ldc:int(5601)), checkcast:IntBuffer(java.nio.IntBuffer.class, aconstnull:IntBuffer()))
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u446c\u8df4\u6fb0\u12cb\u8308\u76bc, getstatic:int(\u7006\u88c5\u5bc4\ud12e\u98a4\uae87::\u7e3f\u5654\ub113\u8350\u4e72\u5d20), getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u56bd\ud158\u494c\uc9f6\ubb2b\u71ae, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd))
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u9255\u74b1\u8413\ubf56\u120d\ud217, getstatic:int(\u7006\u88c5\u5bc4\ud12e\u98a4\uae87::\u7e3f\u5654\ub113\u8350\u4e72\u5d20), getstatic:int(\u7006\u88c5\u5bc4\ud12e\u98a4\uae87::\u836c\u7af6\u9255\u64ab\u385b\u12cb), and:int(ldc:int(8161), ldc:int(3557)), getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\uae5d\u8aa5\u7043\u6c56\u600f\ub32d, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd), and:int(ldc:int(12556), ldc:int(-13581)))
            
            if (getfield:boolean(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u51b2\u1833\ud7e8\uc31c\u8350\u67e9, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd)) {
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u9255\u74b1\u8413\ubf56\u120d\ud217, getstatic:int(\u7006\u88c5\u5bc4\ud12e\u98a4\uae87::\u7e3f\u5654\ub113\u8350\u4e72\u5d20), getstatic:int(\u7006\u88c5\u5bc4\ud12e\u98a4\uae87::\ub18d\u5140\uc31c\ud36e\ubff1\ubf56), xor:int(ldc:int(16841), ldc:int(19496)), getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\ua61f\u9a18\u61a4\u516c\u3c25\u516c, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd), and:int(ldc:int(-1877), ldc:int(1876)))
            }
            
            invokevirtual:void(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u4c2b\ub7dc\u8aa5\u6b0d\u9af2\ub102, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd)
            invokevirtual:void(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u6ec6\u4bc8\u3711\u12b2\u718f\uc9f6, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd, p2:boolean)
            invokevirtual:void(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u5fe1\u8308\u9937\u071d\u385b\u3a62, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ua068\u34df\uafe7\u9033\u16f6\ubff1(int p0) {
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
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
            putfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u7043\u5db4\u0c95\u7006\uc31c\ub171, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd, p0:int)
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\uae5d\u8aa5\u7043\u6c56\u600f\ub32d, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd))
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0, xor:int(ldc:int(6326), ldc:int(5463)), xor:int(ldc:int(8258), ldc:int(2115)), p0:int)
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0, xor:int(ldc:int(1177), ldc:int(2424)), xor:int(ldc:int(5931), ldc:int(16171)), p0:int)
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0, xor:int(ldc:int(3381), ldc:int(212)), and:int(ldc:int(11363), ldc:int(26882)), and:int(ldc:int(12165), ldc:int(10506)))
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0, and:int(ldc:int(3557), ldc:int(7665)), and:int(ldc:int(15375), ldc:int(10339)), and:int(ldc:int(11538), ldc:int(11017)))
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, and:int(ldc:int(3808), ldc:int(-3809)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4c2b\ub7dc\u8aa5\u6b0d\u9af2\ub102() {
        var_1_8C : int
        var_3_6F : int
        
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
        var_1_8C = and:int(ldc:int(994378035), ldc:int(-1142006437))
        invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
        var_3_6F = invokestatic:int(\u3a62\u92ff\u12cb\u8753\u7bad::\u4179\u071d\u120d\u3776\ub1b9\u36d3, getstatic:int(\u7006\u88c5\u5bc4\ud12e\u98a4\uae87::\u7e3f\u5654\ub113\u8350\u4e72\u5d20))
        
        if (cmpne:boolean(var_3_6F:int, getstatic:int(\u7006\u88c5\u5bc4\ud12e\u98a4\uae87::\u61a4\u7ce1\ub32d\u6b5f\uae5d\u6d69))) {
            if (cmpne:boolean(var_3_6F:int, getstatic:int(\u7006\u88c5\u5bc4\ud12e\u98a4\uae87::\u4cd9\ud7e8\u67e9\u4c2b\u64ab\uc87f))) {
                goto(Label_0170)
            }
            
            athrow(initobject:RuntimeException(RuntimeException::<init>, loadelement:String(getstatic:String[](\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u4daf\uc3e3\u927d\uf94d\u97b7\ud171), and:int(ldc:int(11372), ldc:int(-11758)))))
        }
        
        Label_0119:
        
        if (cmpne:boolean(and:int(var_1_8C:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0277)
        }
        
        if (cmpne:boolean(and:int(var_1_8C:int, ldc:int(128)), ldc:int(0))) {
            var_1_8C = and:int(var_1_8C:int, ldc:int(849375136))
            goto(Label_0223)
        }
        
        if (cmpeq:boolean(and:int(var_1_8C:int, ldc:int(8388608)), ldc:int(0))) {
            return:void()
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_1_8C:int, ldc:int(8192)), ldc:int(0))) {
            var_1_8C = and:int(var_1_8C:int, ldc:int(-1761294469))
            goto(Label_0277)
        }
        
        if (cmpeq:boolean(and:int(var_1_8C:int, ldc:int(8192)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_1_8C:int, ldc:int(8388608)), ldc:int(0))) {
                var_1_8C = and:int(var_1_8C:int, ldc:int(-2106717430))
                goto(Label_0119)
            }
            
            var_1_8C = and:int(var_1_8C:int, ldc:int(-33608929))
            
            if (cmpeq:boolean(var_3_6F:int, getstatic:int(\u7006\u88c5\u5bc4\ud12e\u98a4\uae87::\u4d85\ucb79\u2dcc\u98a4\u97e6\u4daf))) {
                athrow(initobject:RuntimeException(RuntimeException::<init>, loadelement:String(getstatic:String[](\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u4daf\uc3e3\u927d\uf94d\u97b7\ud171), xor:int(ldc:int(4357), ldc:int(4356)))))
            }
        }
        
        Label_0223:
        
        if (cmpne:boolean(and:int(var_1_8C:int, ldc:int(1024)), ldc:int(0))) {
            var_1_8C = and:int(var_1_8C:int, ldc:int(1290270655))
        }
        else {
            if (cmpne:boolean(and:int(var_1_8C:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0170)
            }
            
            if (cmpeq:boolean(and:int(var_1_8C:int, ldc:int(134217728)), ldc:int(0))) {
                var_1_8C = and:int(var_1_8C:int, ldc:int(2146528461))
                goto(Label_0119)
            }
            
            var_1_8C = and:int(var_1_8C:int, ldc:int(1033159615))
            
            if (cmpeq:boolean(var_3_6F:int, getstatic:int(\u7006\u88c5\u5bc4\ud12e\u98a4\uae87::\u927d\u3504\u5f50\u5bc4\u3504\u1833))) {
                athrow(initobject:RuntimeException(RuntimeException::<init>, loadelement:String(getstatic:String[](\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u4daf\uc3e3\u927d\uf94d\u97b7\ud171), and:int(ldc:int(4166), ldc:int(16914)))))
            }
        }
        
        Label_0277:
        
        if (cmpeq:boolean(and:int(var_1_8C:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0223)
        }
        
        if (cmpeq:boolean(and:int(var_1_8C:int, ldc:int(2147483647)), ldc:int(0))) {
            var_1_8C = and:int(var_1_8C:int, ldc:int(410113564))
            goto(Label_0170)
        }
        
        if (cmpeq:boolean(and:int(var_1_8C:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0119)
        }
        
        if (cmpne:boolean(var_3_6F:int, getstatic:int(\u7006\u88c5\u5bc4\ud12e\u98a4\uae87::\u156b\ub7dc\u62da\u4bc8\u446c\u718f))) {
            athrow(initobject:RuntimeException(RuntimeException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u4daf\uc3e3\u927d\uf94d\u97b7\ud171), and:int(ldc:int(4), ldc:int(9924)))), var_3_6F:int))))
        }
        
        athrow(initobject:RuntimeException(RuntimeException::<init>, loadelement:String(getstatic:String[](\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u4daf\uc3e3\u927d\uf94d\u97b7\ud171), and:int(ldc:int(8195), ldc:int(21571)))))
    }
    
    public void \ua3b4\ud12e\u67d0\u2dcc\u527a\u6d99() {
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
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\uae5d\u8aa5\u7043\u6c56\u600f\ub32d, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5fe1\u8308\u9937\u071d\u385b\u3a62() {
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
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, and:int(ldc:int(25816), ldc:int(-26367)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8258\ua562\u0c95\u56bd\u718f\u873d(boolean p0) {
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
    
    private void \u7bad\u8308\u3776\uf995\u4daf\ua6bd(boolean p0) {
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
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u446c\u8df4\u6fb0\u12cb\u8308\u76bc, getstatic:int(\u7006\u88c5\u5bc4\ud12e\u98a4\uae87::\u7e3f\u5654\ub113\u8350\u4e72\u5d20), getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u56bd\ud158\u494c\uc9f6\ubb2b\u71ae, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd))
            
            if (p0:boolean) {
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u47c2\u9af2\u67d0\uae5d\u92ee\u392e, and:int(ldc:int(2070), ldc:int(-2071)), and:int(ldc:int(8782), ldc:int(-9199)), getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u0a06\u7c6b\u67d0\u836c\u647c\ub113, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd), getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\uc29a\u7e3f\u7ce1\u72f1\u873d\u839e, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8c8a\u4f4a\u718f\u873d\u7873\u7bad() {
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
    
    public void \u8bb0\u8d98\u600f\uf9c5\u8c8a\uafe7(float p0, float p1, float p2, float p3) {
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
            storeelement:float(getfield:float[](\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\ub6ab\u836c\u12cb\u7006\u624e\u0c95, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd), and:int(ldc:int(-10642), ldc:int(10640)), p0:float)
            storeelement:float(getfield:float[](\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\ub6ab\u836c\u12cb\u7006\u624e\u0c95, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd), xor:int(ldc:int(-32746), ldc:int(-32745)), p1:float)
            storeelement:float(getfield:float[](\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\ub6ab\u836c\u12cb\u7006\u624e\u0c95, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd), xor:int(ldc:int(9732), ldc:int(9734)), p2:float)
            storeelement:float(getfield:float[](\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\ub6ab\u836c\u12cb\u7006\u624e\u0c95, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd), and:int(ldc:int(275), ldc:int(12291)), p3:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc84e\u4daf\u67d0\u416d\uc7fe\u97b7(int p0, int p1) {
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
            invokevirtual:void(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\uc910\u8640\ud158\u8308\u61a4\u6435, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd, p0:int, p1:int, xor:int[expected:boolean](ldc:int(4644), ldc:int(4645)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc910\u8640\ud158\u8308\u61a4\u6435(int p0, int p1, boolean p2) {
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
    
    private void \u416d\u34df\u4492\ubf56\ud217\ub102(int p0, int p1, boolean p2) {
        var_6_FF : float
        var_7_103 : float
        var_8_110 : float
        var_9_11D : float
        var_10_122 : \ub6ab\u8cae\u64ab\u5245\ubff1\u3711
        var_11_129 : \u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab
        
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
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u5d20\u3d64\uc31c\ub18d\ua61f\u4ab3, xor:int[expected:boolean](ldc:int(13824), ldc:int(13825)), and:int[expected:boolean](ldc:int(28761), ldc:int(1537)), xor:int[expected:boolean](ldc:int(1074), ldc:int(1075)), and:int[expected:boolean](ldc:int(-31825), ldc:int(27728)))
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u527a\u7bad\uc2bd\u8753\u93a2\u51b2)
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u47c2\u183a\uc29a\ud158\u4f52\u8350, and:int[expected:boolean](ldc:int(2858), ldc:int(-2860)))
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, xor:int(ldc:int(4550), ldc:int(1735)))
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\ubded\ub6ab\u760c\ubcb0\uc238\u183a)
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u5bc4\u62da\u9033\uc84e\u9255\uf995, ldc:double(0.0), i2d:double(p0:int), i2d:double(p1:int), ldc:double(0.0), ldc:double(1000.0), ldc:double(3000.0))
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c, and:int(ldc:int(7940), ldc:int(5945)))
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\ubded\ub6ab\u760c\ubcb0\uc238\u183a)
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\uae87\u8308\u6fb0\u3bd6\uae5d\uc229, ldc:float(0.0f), ldc:float(0.0f), ldc:float(-2000.0f))
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u47c2\u9af2\u67d0\uae5d\u92ee\u392e, and:int(ldc:int(19297), ldc:int(-28514)), and:int(ldc:int(21097), ldc:int(-22122)), p0:int, p1:int)
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u40a9\u7873\u67e9\u16f6\u071d\u3e2a)
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u64ab\u6435\u647c\u6198\u3a62\u64f2)
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u7330\uceb8\u71ae\u7873\ub1b9\uf995)
            
            if (p2:boolean) {
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\ubf56\u92ee\ucfaf\u9033\u7bad\u1833)
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u600f\u8350\uc238\u624e\u6435\ubb2b)
            }
            
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u59ec\u74b1\ua61f\u8df4\u8df4\u3dd3, ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f))
            invokevirtual:void(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\ua3b4\ud12e\u67d0\u2dcc\u527a\u6d99, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd)
            var_6_FF = i2f:float(p0:int)
            var_7_103 = i2f:float(p1:int)
            var_8_110 = div:float(i2f:float(getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u0a06\u7c6b\u67d0\u836c\u647c\ub113, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd)), i2f:float(getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u7ce1\u6fb0\uc229\u7ce1\u47c2\u839e, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd)))
            var_9_11D = div:float(i2f:float(getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\uc29a\u7e3f\u7ce1\u72f1\u873d\u839e, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd)), i2f:float(getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\uc2e8\u8d90\u40a9\u98a4\u7bad\u5140, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd)))
            var_10_122 = invokestatic:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711(\u9af2\u6ec6\u983f\ua068\u8c8a::\u5fe1\u6bb9\ubefe\ua6bd\u8df4\ub6ab)
            var_11_129 = invokevirtual:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u74b1\u7bad\u6435\uc87f\u6d69\uc238, var_10_122:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711)
            invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\u12cb\u9937\uc246\u5fe1\ubefe\u494c, var_11_129:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, ldc:int(7), getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\ubb2b\u98a4\u4e72\ubded\u64f2\uae5d))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_11_129:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:double(0.0), f2d:double(var_7_103:float), ldc:double(0.0)), ldc:float(0.0f), ldc:float(0.0f)), and:int(ldc:int(27135), ldc:int(4351)), and:int(ldc:int(17151), ldc:int(8447)), and:int(ldc:int(4351), ldc:int(9983)), and:int(ldc:int(10495), ldc:int(20991))))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_11_129:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(var_6_FF:float), f2d:double(var_7_103:float), ldc:double(0.0)), var_8_110:float, ldc:float(0.0f)), xor:int(ldc:int(4196), ldc:int(4251)), xor:int(ldc:int(218), ldc:int(37)), and:int(ldc:int(17663), ldc:int(8447)), and:int(ldc:int(11263), ldc:int(17663))))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_11_129:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(var_6_FF:float), ldc:double(0.0), ldc:double(0.0)), var_8_110:float, var_9_11D:float), and:int(ldc:int(25343), ldc:int(255)), xor:int(ldc:int(-30702), ldc:int(-30483)), and:int(ldc:int(1535), ldc:int(4351)), and:int(ldc:int(20735), ldc:int(1023))))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_11_129:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:double(0.0), ldc:double(0.0), ldc:double(0.0)), ldc:float(0.0f), var_9_11D:float), xor:int(ldc:int(945), ldc:int(846)), and:int(ldc:int(16639), ldc:int(255)), xor:int(ldc:int(-27482), ldc:int(-27559)), xor:int(ldc:int(82), ldc:int(173))))
            invokevirtual:void(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\uc229\u12b2\u6cfe\u4492\u36d3\u5f50, var_10_122:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711)
            invokevirtual:void(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u5fe1\u8308\u9937\u071d\u385b\u3a62, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd)
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u47c2\u183a\uc29a\ud158\u4f52\u8350, xor:int[expected:boolean](ldc:int(4180), ldc:int(4181)))
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u5d20\u3d64\uc31c\ub18d\ua61f\u4ab3, xor:int[expected:boolean](ldc:int(17411), ldc:int(17410)), and:int[expected:boolean](ldc:int(8595), ldc:int(16385)), and:int[expected:boolean](ldc:int(19201), ldc:int(9421)), and:int[expected:boolean](ldc:int(8209), ldc:int(7681)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6ec6\u4bc8\u3711\u12b2\u718f\uc9f6(boolean p0) {
        var_4_AF : int
        
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
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
            invokevirtual:void(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u8258\ua562\u0c95\u56bd\u718f\u873d, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd, xor:int[expected:boolean](ldc:int(9), ldc:int(8)))
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u93a2\uc3e3\u6d69\uae5d\u600f\ud36e, loadelement:float(getfield:float[](\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\ub6ab\u836c\u12cb\u7006\u624e\u0c95, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd), and:int(ldc:int(-20650), ldc:int(20649))), loadelement:float(getfield:float[](\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\ub6ab\u836c\u12cb\u7006\u624e\u0c95, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd), and:int(ldc:int(193), ldc:int(515))), loadelement:float(getfield:float[](\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\ub6ab\u836c\u12cb\u7006\u624e\u0c95, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd), xor:int(ldc:int(-12279), ldc:int(-12277))), loadelement:float(getfield:float[](\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\ub6ab\u836c\u12cb\u7006\u624e\u0c95, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd), and:int(ldc:int(899), ldc:int(24595))))
            var_4_AF = xor:int(ldc:int(28620), ldc:int(12236))
            
            if (getfield:boolean(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u51b2\u1833\ud7e8\uc31c\u8350\u67e9, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd)) {
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3, ldc:double(1.0))
                var_4_AF = or:int(var_4_AF:int, and:int(ldc:int(4864), ldc:int(1292)))
            }
            
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u3e75\u62da\ub171\ub83f\u416d\u71ae, var_4_AF:int, p0:boolean)
            invokevirtual:void(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u8c8a\u4f4a\u718f\u873d\u7873\u7bad, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \uff55\ud171\ub102\u71ae\u6d99\u385b() {
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
            return:int(getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\uae5d\u8aa5\u7043\u6c56\u600f\ub32d, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd))
        }
        
        goto(Label_0006)
    }
    
    public int \u51b2\u64f2\uc87f\u416d\u1833\uc7fe() {
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
            return:int(getfield:int(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\ua61f\u9a18\u61a4\u516c\u3c25\u516c, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ub70c\u8cae\u873d\u494c\uc29a\u61a4$3(int p0, int p1, boolean p2) {
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
            invokespecial:void(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u416d\u34df\u4492\ubf56\ud217\ub102, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd, p0:int, p1:int, p2:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\uc3e3\u647c\u8308\u1833\u97b7\ub70c$2() {
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
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u446c\u8df4\u6fb0\u12cb\u8308\u76bc, getstatic:int(\u7006\u88c5\u5bc4\ud12e\u98a4\uae87::\u7e3f\u5654\ub113\u8350\u4e72\u5d20), and:int(ldc:int(7173), ldc:int(-7190)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ub18d\u98a4\ufe34\u839e\u8df4\ua6bd$1(boolean p0) {
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
            invokespecial:void(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u7bad\u8308\u3776\uf995\u4daf\ua6bd, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd, p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u3711\u52d3\u8aa5\u9af2\u5db4\u4c04$0(int p0, int p1, boolean p2) {
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
            invokespecial:void(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u51b2\ubefe\u6cfe\ubf56\u7043\ud217, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd, p0:int, p1:int, p2:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_61 : int
        expr_6E : int [generated]
        stack_9D_0 : byte[] [generated]
        stack_9F_0 : byte[] [generated]
        stack_C5_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_1BF_0 : byte[] [generated]
        stack_221_0 : byte[] [generated]
        stack_293_0 : byte[] [generated]
        var_4_1A0 : int
        var_3_1A5 : byte[]
        var_5_1A6 : int
        expr_1BF : byte [generated]
        var_0_217 : int
        expr_221 : byte [generated]
        stack_261_2 : byte [generated]
        stack_23E_0 : byte [generated]
        expr_9F : int [generated]
        var_2_C5 : byte[]
        expr_C9 : int [generated]
        var_3_281 : byte[]
        var_5_282 : int
        var_3_FA : String
        stack_199_0 : String[] [generated]
        expr_10C : String[] [generated]
        
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
        var_0_61 = and:int(ldc:int(931748226), ldc:int(1574428642))
        expr_6E = arraylength:int(stack_9D_0 = stack_9F_0 = stack_C5_0 = stack_C7_0 = stack_EE_0 = stack_1BF_0 = stack_221_0 = stack_293_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("zLzYvtHEwc202MbFtsLSz8rKwbXYwbDUuN+5yNXCx8rKzbDbyLzYvtHEwc202MbFtsLSz8rKwbXYwbDUuN+807bL3brYxsW20sq82L7RxMHNtNjGxbbC0s/KysG12MGw1Ljfw7PP1cvKsN25yNXCx8rKzbDbyLzYvtHEwc202MbFtsLSz8rKwbXYwbDUuM/YyMG60LrYxsW2tMrqrsrCw+2S0cTBzbTYxsW24qjWtMjGFHTXusTG0sHMBXPazsLIuN0NecjWtMjGBPy9")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1A0 = expr_6E:int
        var_3_1A5 = newarray:byte[](byte.class, expr_6E:int)
        var_5_1A6 = expr_6E:int
        Label_0424:
        
        while (cmpne:boolean(and:int(var_0_61:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(1840765710))
            var_5_1A6 = add:int(var_5_1A6:int, ldc:int(-1))
            expr_1BF = loadelement:byte(stack_1BF_0:byte[], var_5_1A6:int)
            storeelement:byte(var_3_1A5:byte[], var_5_1A6:int, xor:int(add:int(or:int(and:int(shl:int(expr_1BF:byte, and:int(ldc:int(24964), ldc:int(2140))), ldc:int(-16)), and:int(shr:int(expr_1BF:byte[expected:int], and:int(ldc:int(324), ldc:int(16422))), ldc:int(15))), ldc:int(20)), ldc:int(112)))
            
            if (cmpne:boolean(var_5_1A6:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9F_0 = stack_9D_0 = stack_C5_0 = stack_C7_0 = stack_EE_0 = stack_1BF_0 = stack_221_0 = stack_293_0 = var_3_1A5:byte[]
            goto(Label_0115)
        }
        
        Label_0522:
        
        while (cmpeq:boolean(and:int(var_0_61:int, ldc:int(4)), ldc:int(0))) {
            var_0_217 = and:int(var_0_61:int, ldc:int(-845325741))
            var_5_1A6 = add:int(var_5_1A6:int, ldc:int(-1))
            expr_221 = stack_261_2 = loadelement(stack_221_0, var_5_1A6)
            
            if (cmplt:boolean(add:int(add:int(var_5_1A6:int, ldc:int(1)), neg:int(var_4_1A0:int)), ldc:int(0))) {
                stack_261_2 = stack_23E_0 = add:byte(expr_221:byte, loadelement:byte(var_3_1A5:byte[], add:int(var_5_1A6:int, ldc:int(1))))
                goto(Label_0590)
            }
            
            Label_0558:
            
            if (cmpeq:boolean(and:int(var_0_217:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_217 = and:int(var_0_217:int, ldc:int(-456164789))
                stack_261_2 = stack_23E_0 = add:byte(expr_221:byte, ldc:byte(1))
            }
            
            Label_0590:
            
            if (cmpne:boolean(and:int(var_0_217:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0558)
            }
            
            var_0_61 = and:int(var_0_217:int, ldc:int(-1778909454))
            storeelement:byte(var_3_1A5:byte[], var_5_1A6:int, stack_261_2:byte)
            
            if (cmpne:boolean(var_5_1A6:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9F_0 = stack_9D_0 = stack_C5_0 = stack_C7_0 = stack_EE_0 = stack_1BF_0 = stack_221_0 = stack_293_0 = var_3_1A5:byte[]
            goto(Label_0164)
        }
        
        goto(Label_0424)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(-378407061))
            goto(Label_0206)
        }
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(16)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(-1423988032))
        }
        else {
            var_0_61 = and:int(var_0_61:int, ldc:int(515595682))
            expr_9F = arraylength:int(stack_9F_0:byte[])
            
            if (cmpne:boolean(expr_9F:int, ldc:int(0))) {
                var_4_1A0 = expr_9F:int
                var_3_1A5 = newarray:byte[](byte.class, expr_9F:int)
                var_5_1A6 = expr_9F:int
                goto(Label_0522)
            }
        }
        
        Label_0164:
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(4)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_61:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_61 = and:int(var_0_61:int, ldc:int(-491861406))
                goto(Label_0115)
            }
            
            var_0_61 = and:int(var_0_61:int, ldc:int(-1879212430))
            var_2_C5 = stack_C5_0:byte[]
            expr_C9 = add:int(arraylength:int(stack_C7_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C9:int, ldc:int(0))) {
                var_3_281 = newarray:byte[](byte.class, expr_C9:int)
                var_5_282 = expr_C9:int
                
                loop {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-805872694))
                    var_5_282 = add:int(var_5_282:int, ldc:int(-1))
                    storeelement:byte(var_3_281:byte[], var_5_282:int, add:int(shl:int(loadelement:byte(stack_293_0:byte[], var_5_282:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_C5:byte[], add:int(var_5_282:int, xor:int(ldc:int(1290), ldc:int(1291)))), ldc:int(4)), xor:int(ldc:int(18690), ldc:int(18701)))))
                    
                    if (cmpne:boolean(var_5_282:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9F_0 = stack_9D_0 = stack_C5_0 = stack_C7_0 = stack_EE_0 = stack_1BF_0 = stack_221_0 = stack_293_0 = var_3_281:byte[]
            }
        }
        
        Label_0206:
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0164)
        }
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(-1493516556))
            goto(Label_0115)
        }
        
        var_3_FA = initobject:String(String::<init>, stack_EE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_199_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4212), ldc:int(4209)))
        expr_10C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(9477), ldc:int(16917)))
        storeelement:String(expr_10C:String[], and:int(ldc:int(3237), ldc:int(-3750)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, and:int(ldc:int(15124), ldc:int(-16149)), xor:int(ldc:int(-30605), ldc:int(-30633))))
        storeelement:String(expr_10C:String[], and:int(ldc:int(2), ldc:int(16386)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, and:int(ldc:int(4132), ldc:int(16420)), and:int(ldc:int(24651), ldc:int(73))))
        storeelement:String(expr_10C:String[], xor:int(ldc:int(-28128), ldc:int(-28127)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, and:int(ldc:int(109), ldc:int(17483)), and:int(ldc:int(2293), ldc:int(29309))))
        storeelement:String(expr_10C:String[], and:int(ldc:int(163), ldc:int(1875)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, xor:int(ldc:int(232), ldc:int(157)), xor:int(ldc:int(19025), ldc:int(19147))))
        storeelement:String(expr_10C:String[], and:int(ldc:int(18716), ldc:int(4676)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, xor:int(ldc:int(8347), ldc:int(8193)), xor:int(ldc:int(8255), ldc:int(8436))))
        putstatic:String[](\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u4daf\uc3e3\u927d\uf94d\u97b7\ud171, expr_10C:String[])
    }
    
    public void \u6c56\u9937\u4c04\ub6ab\u3c25\uc4d2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_69C : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_6A7 : int
        
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
        var_3_69C = and:int(ldc:int(707367763), ldc:int(792590159))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_69C = and:int(var_3_69C:int, ldc:int(-67520553))
            var_5_81 = and:int(ldc:int(-751), ldc:int(718))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-13191), ldc:int(13190)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_69C:int, ldc:int(-1887704073))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(17409), ldc:int(11)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, xor:int(ldc:int(8709), ldc:int(8708)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_69C = and:int(var_3_D1:int, ldc:int(-550689821))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(21248), ldc:int(21249)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-707654860))
                        goto(Label_1570)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-1776082192))
                        goto(Label_1243)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(2070807826))
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(725605678))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(24970390))
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(64)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(1668063465))
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-1347457189))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1570)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-1076259657))
                        goto(Label_1396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1243)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-1980407833))
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-586669703))
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-792952935))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(-71602329))
                            var_11_E2 = and:int(ldc:int(1140), ldc:int(-1141))
                            goto(Label_1559)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0586:
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(918188744))
                        goto(Label_1570)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1396)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1243)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(1978429388))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-1635935421))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0693:
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-1735685077))
                        goto(Label_1570)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1396)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1243)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-1296174765))
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(250945047))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(968144020))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(643902804))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(-999784969))
                            loopcontinue()
                        }
                        
                        var_3_69C = and:int(var_3_69C:int, ldc:int(1601793899))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0843:
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1570)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-177846028))
                        goto(Label_1396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(548010542))
                        goto(Label_1243)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(-820247151))
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(-2051625917))
                            loopcontinue()
                        }
                        
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-1635950733))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(4160), ldc:int(4161))
                                goto(Label_1119)
                            }
                        }
                    }
                    
                    Label_0968:
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1570)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-303461733))
                        goto(Label_1396)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1243)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(128)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(803780134))
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(-553373730))
                            loopcontinue()
                        }
                        
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-625236141))
                        var_11_E2 = and:int(ldc:int(26186), ldc:int(-26187))
                    }
                    
                    Label_1119:
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1570)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-732320640))
                        goto(Label_1396)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-1137639250))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0968)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(128)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(331377532))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(128)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(-34079265))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69C = and:int(var_3_69C:int, ldc:int(1537978195))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1396)
                            }
                        }
                    }
                    
                    Label_1243:
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-1245917863))
                        goto(Label_1570)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(2)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(2061699014))
                            goto(Label_1119)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(-1081508650))
                            goto(Label_0968)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(-91050283))
                            goto(Label_0843)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(512)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(-71345717))
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(32)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(-378025783))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(32)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(1873641431))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1559)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1396:
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-850898897))
                        goto(Label_1570)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1243)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(361408712))
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-1884555913))
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(1171378289))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(1264521107))
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-1913650531))
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(180376632))
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(8)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_69C = and:int(var_3_69C:int, ldc:int(2121994111))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1559:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A7 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1570:
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1396)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1243)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(1468675654))
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(851623090))
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(1306798789))
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-1007982318))
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(355290922))
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-1895992509))
                        var_17_6A7 = add:int(var_16_110:int, and:int(ldc:int(129), ldc:int(28717)))
                        looporswitchbreak()
                    }
                }
                
                var_3_69C = and:int(var_3_69C:int, ldc:int(-1972670517))
                
                if (cmple:boolean(var_5_81 = var_17_6A7:int, sub:int(var_6_88:int, xor:int(ldc:int(8211), ldc:int(8210))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(131072)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
