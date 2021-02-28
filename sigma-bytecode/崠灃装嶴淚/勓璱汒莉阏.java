public class \u5d20\u7043\u88c5\u5db4\uf94d.\u52d3\u74b1\u6c52\u8389\u960f {
    public void \u52d3\u74b1\u6c52\u8389\u960f() {
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
    
    public void \u6ec6\ub19c\u392e\uc238\u51fa\u92ee() {
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
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u624e\u0a06\u7043\u759a\ub83f, getfield:\u6d99\u120d\u760c\u7049\u98a4[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u52d3\u74b1\u6c52\u8389\u960f::\u6bb9\uc29a\u3a62\u8cae\u61a4, this:\u52d3\u74b1\u6c52\u8389\u960f), and:int[expected:boolean](ldc:int(5528), ldc:int(-5533)))
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u624e\u0a06\u7043\u759a\ub83f, getfield:\u0800\u3e2a\u4f4a\u4bc8\u4c2b[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u52d3\u74b1\u6c52\u8389\u960f::\u0b8e\u6198\u40a9\uafe7\u6b5f, this:\u52d3\u74b1\u6c52\u8389\u960f), xor:int[expected:boolean](ldc:int(8460), ldc:int(8461)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8753\u0800\u4f4a\u4975\u64ab\u4c04() {
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
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u624e\u0a06\u7043\u759a\ub83f, getfield:\u6d99\u120d\u760c\u7049\u98a4[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u52d3\u74b1\u6c52\u8389\u960f::\u6bb9\uc29a\u3a62\u8cae\u61a4, this:\u52d3\u74b1\u6c52\u8389\u960f), and:int[expected:boolean](ldc:int(1539), ldc:int(10353)))
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u624e\u0a06\u7043\u759a\ub83f, getfield:\u0800\u3e2a\u4f4a\u4bc8\u4c2b[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u52d3\u74b1\u6c52\u8389\u960f::\u0b8e\u6198\u40a9\uafe7\u6b5f, this:\u52d3\u74b1\u6c52\u8389\u960f), and:int[expected:boolean](ldc:int(-27294), ldc:int(26765)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u718f\u4179\u7e3f\ub113\ud51e\u8413(java.lang.String p0, java.lang.String p1) {
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
    
    public void \ucfaf\u7e3f\ube23\u4f52\u071d(float p0) {
        var_2_61 : int
        var_2_89 : int
        var_4_A5 : float
        var_2_B3 : int
        var_5_F0 : Rectangle
        var_6_26C : String
        var_7_279 : String
        var_8_27D : int
        var_11_2B0 : int
        var_12_2C9 : int
        var_13_31A : int
        var_14_31E : int
        
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
            var_2_61 = and:int(ldc:int(806047298), ldc:int(2113832059))
            invokeinterface:void(\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe::\uc9f6\u3776\uc246\u4f52\ua3b4\u624e, getstatic:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\u5db4\u1187\u647c\u9255\u8258::\u4d85\u5db4\u56bd\u71ae\ua6bd))
            putfield:float(\u52d3\u74b1\u6c52\u8389\u960f::\u97b7\u4c2b\ua068\u99f7\u3776, this:\u52d3\u74b1\u6c52\u8389\u960f, invokestatic:float(Math::max, ldc:float(0.0f), invokestatic:float(Math::min, add:float(getfield:float(\u52d3\u74b1\u6c52\u8389\u960f::\u97b7\u4c2b\ua068\u99f7\u3776, this:\u52d3\u74b1\u6c52\u8389\u960f), ldc:float(0.075f)), ldc:float(1.0f))))
            
            if (getfield:boolean(\u52d3\u74b1\u6c52\u8389\u960f::\ua3b4\u9a18\ufcaf\ubff1\u3c25, this:\u52d3\u74b1\u6c52\u8389\u960f)) {
                invokevirtual:void(\u8d98\ua068\u4492\u9af2\u5f50::\u59ec\u99f7\uc2e8\u92ee\uf995\u6c56, getfield:\u8d98\ua068\u4492\u9af2\u5f50(\u52d3\u74b1\u6c52\u8389\u960f::\ub171\u0800\u071d\ubb2b\u9937, this:\u52d3\u74b1\u6c52\u8389\u960f), getstatic:\u3711\u71f1\u7006\u92ee\ucef1(\u3711\u71f1\u7006\u92ee\ucef1::\uf9c5\u5140\ud158\u4492\u3dd3))
            }
            
            var_2_89 = and:int(var_2_61:int, ldc:int(1393460937))
            invokespecial:void(\u52d3\u74b1\u6c52\u8389\u960f::\u6b5f\ud158\u3a62\u0a06\ua068\u7bad, this:\u52d3\u74b1\u6c52\u8389\u960f)
            var_4_A5 = d2f:float(invokestatic:double(Math::sin, div:double(mul:double(f2d:double(invokestatic:float(\u960f\u385b\u93a2\uc84e\u7006::\u76bc\u6b0d\ufcaf\u7d52\u6b0d\uf995, getfield:float(\u52d3\u74b1\u6c52\u8389\u960f::\u97b7\u4c2b\ua068\u99f7\u3776, this:\u52d3\u74b1\u6c52\u8389\u960f), ldc:float(0.0f), ldc:float(1.0f), ldc:float(1.0f))), ldc:double(3.141592653589793)), ldc:double(2.0))))
            
            if (getfield:boolean(\u52d3\u74b1\u6c52\u8389\u960f::\ua3b4\u9a18\ufcaf\ubff1\u3c25, this:\u52d3\u74b1\u6c52\u8389\u960f)) {
                var_4_A5 = sub:float(ldc:float(1.0f), mul:float(d2f:float(invokestatic:double(Math::sin, add:double(ldc:double(1.5707963267948966), mul:double(f2d:double(invokestatic:float(\u960f\u385b\u93a2\uc84e\u7006::\u64f2\u718f\ub6ab\u9033\u8d90\u9033, sub:float(ldc:float(1.0f), invokevirtual:float(\u8d98\ua068\u4492\u9af2\u5f50::\u34df\ubefe\uc2bd\u8308\u8d90\uc3e3, getfield:\u8d98\ua068\u4492\u9af2\u5f50(\u52d3\u74b1\u6c52\u8389\u960f::\ub171\u0800\u071d\ubb2b\u9937, this:\u52d3\u74b1\u6c52\u8389\u960f))), ldc:float(0.0f), ldc:float(1.0f), ldc:float(1.0f))), ldc:double(1.5707963267948966))))), ldc:float(0.2f)))
            }
            
            var_2_B3 = and:int(var_2_89:int, ldc:int(2005619807))
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\ucb79\uc910\u52d3\u7c6b\u92ff, getfield:\u6d99\u120d\u760c\u7049\u98a4[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u52d3\u74b1\u6c52\u8389\u960f::\u6bb9\uc29a\u3a62\u8cae\u61a4, this:\u52d3\u74b1\u6c52\u8389\u960f), var_4_A5:float)
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u647c\u9937\u34df\u156b\u71ae, getfield:\u6d99\u120d\u760c\u7049\u98a4[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u52d3\u74b1\u6c52\u8389\u960f::\u6bb9\uc29a\u3a62\u8cae\u61a4, this:\u52d3\u74b1\u6c52\u8389\u960f), var_4_A5:float)
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\ucb79\uc910\u52d3\u7c6b\u92ff, getfield:\u0800\u3e2a\u4f4a\u4bc8\u4c2b[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u52d3\u74b1\u6c52\u8389\u960f::\u0b8e\u6198\u40a9\uafe7\u6b5f, this:\u52d3\u74b1\u6c52\u8389\u960f), var_4_A5:float)
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u647c\u9937\u34df\u156b\u71ae, getfield:\u0800\u3e2a\u4f4a\u4bc8\u4c2b[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u52d3\u74b1\u6c52\u8389\u960f::\u0b8e\u6198\u40a9\uafe7\u6b5f, this:\u52d3\u74b1\u6c52\u8389\u960f), var_4_A5:float)
            var_5_F0 = invokestatic:Rectangle(\u51fa\u494c\u71f1\u7330\u12cb::\ubefe\uae87\u3a62\u8413\u59ec\u4f4a, invokestatic:Rectangle(\u51fa\u494c\u71f1\u7330\u12cb::\u4c04\u12b2\u6c56\uc2bd\u647c\uc84e, getfield:\u6d99\u120d\u760c\u7049\u98a4[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u52d3\u74b1\u6c52\u8389\u960f::\u6bb9\uc29a\u3a62\u8cae\u61a4, this:\u52d3\u74b1\u6c52\u8389\u960f)), invokevirtual:float(\u12cb\u93a2\ubf56\uc229\u8d90::\u51fa\u6c52\u7330\u7330\u960f, getfield:\u6d99\u120d\u760c\u7049\u98a4[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u52d3\u74b1\u6c52\u8389\u960f::\u6bb9\uc29a\u3a62\u8cae\u61a4, this:\u52d3\u74b1\u6c52\u8389\u960f)), invokevirtual:float(\u12cb\u93a2\ubf56\uc229\u8d90::\ua3b4\u8aa5\ub113\ubf56\u873d, getfield:\u6d99\u120d\u760c\u7049\u98a4[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u52d3\u74b1\u6c52\u8389\u960f::\u6bb9\uc29a\u3a62\u8cae\u61a4, this:\u52d3\u74b1\u6c52\u8389\u960f)))
            
            if (invokevirtual:boolean(\u12cb\u93a2\ubf56\uc229\u8d90::\ub83f\uc238\u3bc9\u8d98\u3e75, getfield:\u0800\u3e2a\u4f4a\u4bc8\u4c2b[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u52d3\u74b1\u6c52\u8389\u960f::\u0b8e\u6198\u40a9\uafe7\u6b5f, this:\u52d3\u74b1\u6c52\u8389\u960f))) {
                var_5_F0 = invokestatic:Rectangle(\u51fa\u494c\u71f1\u7330\u12cb::\ubefe\uae87\u3a62\u8413\u59ec\u4f4a, invokestatic:Rectangle(\u51fa\u494c\u71f1\u7330\u12cb::\u4c04\u12b2\u6c56\uc2bd\u647c\uc84e, getfield:\u0800\u3e2a\u4f4a\u4bc8\u4c2b[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u52d3\u74b1\u6c52\u8389\u960f::\u0b8e\u6198\u40a9\uafe7\u6b5f, this:\u52d3\u74b1\u6c52\u8389\u960f)), invokevirtual:float(\u12cb\u93a2\ubf56\uc229\u8d90::\u51fa\u6c52\u7330\u7330\u960f, getfield:\u0800\u3e2a\u4f4a\u4bc8\u4c2b[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u52d3\u74b1\u6c52\u8389\u960f::\u0b8e\u6198\u40a9\uafe7\u6b5f, this:\u52d3\u74b1\u6c52\u8389\u960f)), invokevirtual:float(\u12cb\u93a2\ubf56\uc229\u8d90::\ua3b4\u8aa5\ub113\ubf56\u873d, getfield:\u0800\u3e2a\u4f4a\u4bc8\u4c2b[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u52d3\u74b1\u6c52\u8389\u960f::\u0b8e\u6198\u40a9\uafe7\u6b5f, this:\u52d3\u74b1\u6c52\u8389\u960f)))
            }
            
            loop {
                if (cmpne:boolean(and:int(var_2_B3:int, ldc:int(4194304)), ldc:int(0))) {
                    var_2_B3 = and:int(var_2_B3:int, ldc:int(-1046604228))
                    goto(Label_0322)
                }
                
                if (cmpne:boolean(and:int(var_2_B3:int, ldc:int(64)), ldc:int(0))) {
                    var_2_B3 = and:int(var_2_B3:int, ldc:int(300598771))
                    
                    if (cmpgt:boolean(f2d:double(var_4_A5:float), ldc:double(0.1))) {
                        invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\ufe34\u1187\u5fe1\ud217\ub1b9\u839e, div:int(d2i:int(sub:double(i2d:double(getfield:int(\u52d3\u74b1\u6c52\u8389\u960f::\u8350\u1187\u6c56\ub32d\u927d, this:\u52d3\u74b1\u6c52\u8389\u960f)), invokevirtual:double(Rectangle::getWidth, var_5_F0:Rectangle))), xor:int(ldc:int(18433), ldc:int(18435))), div:int(d2i:int(sub:double(i2d:double(getfield:int(\u52d3\u74b1\u6c52\u8389\u960f::\ub8be\u7873\u36d3\ub102\u8258, this:\u52d3\u74b1\u6c52\u8389\u960f)), invokevirtual:double(Rectangle::getHeight, var_5_F0:Rectangle))), xor:int(ldc:int(6465), ldc:int(6467))), d2i:int(invokevirtual:double(Rectangle::getWidth, var_5_F0:Rectangle)), d2i:int(invokevirtual:double(Rectangle::getHeight, var_5_F0:Rectangle)), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6d99\u6fb0\ub102\u8413\u8350)), sub:float(ldc:float(1.0f), invokevirtual:float(\u8d98\ua068\u4492\u9af2\u5f50::\u34df\ubefe\uc2bd\u8308\u8d90\uc3e3, getfield:\u8d98\ua068\u4492\u9af2\u5f50(\u52d3\u74b1\u6c52\u8389\u960f::\ub171\u0800\u071d\ubb2b\u9937, this:\u52d3\u74b1\u6c52\u8389\u960f)))))
                    }
                }
                
                Label_0293:
                
                if (cmpeq:boolean(and:int(var_2_B3:int, ldc:int(4194304)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_B3:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_B3 = and:int(var_2_B3:int, ldc:int(-1153442720))
                    
                    if (getfield:boolean(\u52d3\u74b1\u6c52\u8389\u960f::\ua3b4\u9a18\ufcaf\ubff1\u3c25, this:\u52d3\u74b1\u6c52\u8389\u960f)) {
                        if (cmpeq:boolean(invokevirtual:float(\u8d98\ua068\u4492\u9af2\u5f50::\u34df\ubefe\uc2bd\u8308\u8d90\uc3e3, getfield:\u8d98\ua068\u4492\u9af2\u5f50(\u52d3\u74b1\u6c52\u8389\u960f::\ub171\u0800\u071d\ubb2b\u9937, this:\u52d3\u74b1\u6c52\u8389\u960f)), ldc:float(1.0f))) {
                            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u624e\u0a06\u7043\u759a\ub83f, getfield:\u6d99\u120d\u760c\u7049\u98a4[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u52d3\u74b1\u6c52\u8389\u960f::\u6bb9\uc29a\u3a62\u8cae\u61a4, this:\u52d3\u74b1\u6c52\u8389\u960f), and:int[expected:boolean](ldc:int(-26706), ldc:int(26705)))
                        }
                    }
                }
                
                Label_0322:
                
                if (cmpne:boolean(and:int(var_2_B3:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0293)
                }
                
                if (cmpne:boolean(and:int(var_2_B3:int, ldc:int(524288)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            if (getfield:boolean(\u52d3\u74b1\u6c52\u8389\u960f::\ua3b4\u9a18\ufcaf\ubff1\u3c25, this:\u52d3\u74b1\u6c52\u8389\u960f)) {
                var_6_26C = getfield:String(\u71ae\u8709\u527a\u6435\uf9c5::\u8753\u51fa\u0800\u8350\ud7e8, invokevirtual:\u71ae\u8709\u527a\u6435\uf9c5(\u4f52\u3bc9\u7d52\ud523\ub6ab::\ud7e8\u6fb0\u6198\u88c5\uc87f, invokevirtual:\u4f52\u3bc9\u7d52\ud523\ub6ab(\u6b0d\ua068\uc4d2\u5245\u4d85::\u8308\u183a\u946b\ubff1\u946b, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c))))
                var_7_279 = loadelement:String(getstatic:String[](\u52d3\u74b1\u6c52\u8389\u960f::\u4ab3\u99f7\u3a62\u3711\ub6ab), and:int(ldc:int(6662), ldc:int(279)))
                var_8_27D = ldc:int(100)
                var_11_2B0 = div:int(sub:int(getfield:int(\u52d3\u74b1\u6c52\u8389\u960f::\u8350\u1187\u6c56\ub32d\u927d, this:\u52d3\u74b1\u6c52\u8389\u960f), add:int(add:int(var_8_27D:int, invokestatic:int(Math::max, invokevirtual:int(\u6fb0\u1187\u12b2\ua068\u5245\u67e9::\u446c\u8bb0\u3776\u446c\u385b\u8308, getstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\ua6bd\u4c04\u3a62\u47c2\ud158), var_7_279:String), invokevirtual:int(\u6fb0\u1187\u12b2\ua068\u5245\u67e9::\u446c\u8bb0\u3776\u446c\u385b\u8308, getstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u5d20\u71f1\u071d\ub171\ufcaf), var_6_26C:String))), mul:int(ldc:int(10), ldc:int(10)))), and:int(ldc:int(13634), ldc:int(150)))
                var_12_2C9 = div:int(sub:int(getfield:int(\u52d3\u74b1\u6c52\u8389\u960f::\ub8be\u7873\u36d3\ub102\u8258, this:\u52d3\u74b1\u6c52\u8389\u960f), mul:int(var_8_27D:int, and:int(ldc:int(34), ldc:int(2770)))), and:int(ldc:int(2), ldc:int(29482)))
                invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8cae\u7d52\u51fa\u0a06\uc910\u93a2, ldc:float(0.0f), ldc:float(0.0f), i2f:float(getfield:int(\u52d3\u74b1\u6c52\u8389\u960f::\u8350\u1187\u6c56\ub32d\u927d, this:\u52d3\u74b1\u6c52\u8389\u960f)), i2f:float(getfield:int(\u52d3\u74b1\u6c52\u8389\u960f::\ub8be\u7873\u36d3\ub102\u8258, this:\u52d3\u74b1\u6c52\u8389\u960f)), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6c56\u3c25\u7af6\u4492\u97e6)), mul:float(ldc:float(0.45f), invokevirtual:float(\u8d98\ua068\u4492\u9af2\u5f50::\u34df\ubefe\uc2bd\u8308\u8d90\uc3e3, getfield:\u8d98\ua068\u4492\u9af2\u5f50(\u52d3\u74b1\u6c52\u8389\u960f::\ub171\u0800\u071d\ubb2b\u9937, this:\u52d3\u74b1\u6c52\u8389\u960f)))))
                invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u40a9\u12cb\u62da\u836c\u92ee\u51fa, i2f:float(add:int(var_11_2B0:int, ldc:int(20))), i2f:float(add:int(var_12_2C9:int, ldc:int(40))), i2f:float(add:int(var_8_27D:int, ldc:int(30))), i2f:float(add:int(var_8_27D:int, ldc:int(30))), getstatic:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\u5db4\u1187\u647c\u9255\u8258::\uc7fe\u5245\u74b1\u4cd9\u516c), invokevirtual:float(\u8d98\ua068\u4492\u9af2\u5f50::\u34df\ubefe\uc2bd\u8308\u8d90\uc3e3, getfield:\u8d98\ua068\u4492\u9af2\u5f50(\u52d3\u74b1\u6c52\u8389\u960f::\ub171\u0800\u071d\ubb2b\u9937, this:\u52d3\u74b1\u6c52\u8389\u960f)))
                var_13_31A = xor:int(ldc:int(1155), ldc:int(1062))
                var_14_31E = ldc:int(54)
                invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8350\u52d3\ub8be\u9033\ub7dc\ub18d, getstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\ua6bd\u4c04\u3a62\u47c2\ud158), i2f:float(add:int(var_11_2B0:int, var_13_31A:int)), i2f:float(add:int(var_12_2C9:int, var_14_31E:int)), var_7_279:String, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6d99\u6fb0\ub102\u8413\u8350)))
                invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8350\u52d3\ub8be\u9033\ub7dc\ub18d, getstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\u5d20\u71f1\u071d\ub171\ufcaf), i2f:float(add:int(var_11_2B0:int, var_13_31A:int)), i2f:float(add:int(add:int(var_12_2C9:int, var_14_31E:int), ldc:int(45))), var_6_26C:String, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6d99\u6fb0\ub102\u8413\u8350)))
            }
            
            invokestatic:void(GL11::glPushMatrix)
            invokevirtual:void(\u8d90\u72f1\u5db4\ub19c\u5f50::\ucfaf\u7e3f\ube23\u4f52\u071d, getfield:\u8d90\u72f1\u5db4\ub19c\u5f50(\u52d3\u74b1\u6c52\u8389\u960f::\u0a06\u3711\u7bad\u1187\uc7fe, this:\u52d3\u74b1\u6c52\u8389\u960f), invokevirtual:float(\u8d98\ua068\u4492\u9af2\u5f50::\u34df\ubefe\uc2bd\u8308\u8d90\uc3e3, getfield:\u8d98\ua068\u4492\u9af2\u5f50(\u52d3\u74b1\u6c52\u8389\u960f::\ub171\u0800\u071d\ubb2b\u9937, this:\u52d3\u74b1\u6c52\u8389\u960f)))
            invokestatic:void(GL11::glPopMatrix)
            invokespecial:void(\u12cb\u93a2\ubf56\uc229\u8d90::\ucfaf\u7e3f\ube23\u4f52\u071d, this:\u52d3\u74b1\u6c52\u8389\u960f[expected:\u12cb\u93a2\ubf56\uc229\u8d90], sub:float(ldc:float(1.0f), invokevirtual:float(\u8d98\ua068\u4492\u9af2\u5f50::\u34df\ubefe\uc2bd\u8308\u8d90\uc3e3, getfield:\u8d98\ua068\u4492\u9af2\u5f50(\u52d3\u74b1\u6c52\u8389\u960f::\ub171\u0800\u071d\ubb2b\u9937, this:\u52d3\u74b1\u6c52\u8389\u960f))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u6b5f\ud158\u3a62\u0a06\ua068\u7bad() {
        var_3_7C : int
        var_4_8C : float
        var_5_A3 : float
        var_6_AC : float
        var_7_C5 : float
        var_8_13C : float
        
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
            putfield:float(\u52d3\u74b1\u6c52\u8389\u960f::\u3c25\uc87f\ub171\u494c\u7ce1, this:\u52d3\u74b1\u6c52\u8389\u960f, invokestatic:float(Math::max, ldc:float(0.0f), invokestatic:float(Math::min, add:float(getfield:float(\u52d3\u74b1\u6c52\u8389\u960f::\u3c25\uc87f\ub171\u494c\u7ce1, this:\u52d3\u74b1\u6c52\u8389\u960f), ldc:float(0.01f)), ldc:float(1.0f))))
            var_3_7C = mul:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u4e72\u120d\u16f6\u6fb0\u4cd9, this:\u52d3\u74b1\u6c52\u8389\u960f[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), ldc:int(-1))
            var_4_8C = mul:float(div:float(i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\ub70c\ub19c\uc3e3\uae5d\u92ee, this:\u52d3\u74b1\u6c52\u8389\u960f[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u52d3\u74b1\u6c52\u8389\u960f[expected:\u12cb\u93a2\ubf56\uc229\u8d90]))), ldc:float(-114.0f))
            
            if (getfield:boolean(\u52d3\u74b1\u6c52\u8389\u960f::\u7c6b\u6c56\ub8be\u7ce1\u2dcc, this:\u52d3\u74b1\u6c52\u8389\u960f)) {
                putfield:int(\u52d3\u74b1\u6c52\u8389\u960f::\uc87f\ua6bd\ub19c\uc2bd\u51fa, this:\u52d3\u74b1\u6c52\u8389\u960f, f2i:int(var_4_8C:float))
                putfield:int(\u52d3\u74b1\u6c52\u8389\u960f::\uc9f6\ud523\u0b8e\u74b1\ubff1, this:\u52d3\u74b1\u6c52\u8389\u960f, var_3_7C:int)
                putfield:boolean(\u52d3\u74b1\u6c52\u8389\u960f::\u7c6b\u6c56\ub8be\u7ce1\u2dcc, this:\u52d3\u74b1\u6c52\u8389\u960f, and:int[expected:boolean](ldc:int(-14759), ldc:int(10662)))
            }
            
            var_5_A3 = sub:float(var_4_8C:float, i2f:float(getfield:int(\u52d3\u74b1\u6c52\u8389\u960f::\uc87f\ua6bd\ub19c\uc2bd\u51fa, this:\u52d3\u74b1\u6c52\u8389\u960f)))
            var_6_AC = i2f:float(sub:int(var_3_7C:int, getfield:int(\u52d3\u74b1\u6c52\u8389\u960f::\uc9f6\ud523\u0b8e\u74b1\ubff1, this:\u52d3\u74b1\u6c52\u8389\u960f)))
            var_7_C5 = d2f:float(invokestatic:double(Math::sin, div:double(mul:double(f2d:double(invokestatic:float(\u960f\u385b\u93a2\uc84e\u7006::\u76bc\u6b0d\ufcaf\u7d52\u6b0d\uf995, getfield:float(\u52d3\u74b1\u6c52\u8389\u960f::\u3c25\uc87f\ub171\u494c\u7ce1, this:\u52d3\u74b1\u6c52\u8389\u960f), ldc:float(0.0f), ldc:float(1.0f), ldc:float(1.0f))), ldc:double(3.141592653589793)), ldc:double(2.0))))
            invokestatic:void(GL11::glPushMatrix)
            invokestatic:void(GL11::glTranslatef, div:float(i2f:float(getfield:int(\u52d3\u74b1\u6c52\u8389\u960f::\u8350\u1187\u6c56\ub32d\u927d, this:\u52d3\u74b1\u6c52\u8389\u960f)), ldc:float(2.0f)), div:float(i2f:float(getfield:int(\u52d3\u74b1\u6c52\u8389\u960f::\u8350\u1187\u6c56\ub32d\u927d, this:\u52d3\u74b1\u6c52\u8389\u960f)), ldc:float(2.0f)), ldc:float(0.0f))
            invokestatic:void(GL11::glScalef, add:float(ldc:float(1.0f), mul:float(var_7_C5:float, ldc:float(0.2f))), add:float(ldc:float(1.0f), mul:float(var_7_C5:float, ldc:float(0.2f))), ldc:float(0.0f))
            invokestatic:void(GL11::glTranslatef, div:float(i2f:float(neg:int(getfield:int(\u52d3\u74b1\u6c52\u8389\u960f::\u8350\u1187\u6c56\ub32d\u927d, this:\u52d3\u74b1\u6c52\u8389\u960f))), ldc:float(2.0f)), div:float(i2f:float(neg:int(getfield:int(\u52d3\u74b1\u6c52\u8389\u960f::\u8350\u1187\u6c56\ub32d\u927d, this:\u52d3\u74b1\u6c52\u8389\u960f))), ldc:float(2.0f)), ldc:float(0.0f))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1, i2f:float(getfield:int(\u52d3\u74b1\u6c52\u8389\u960f::\uc9f6\ud523\u0b8e\u74b1\ubff1, this:\u52d3\u74b1\u6c52\u8389\u960f)), i2f:float(getfield:int(\u52d3\u74b1\u6c52\u8389\u960f::\uc87f\ua6bd\ub19c\uc2bd\u51fa, this:\u52d3\u74b1\u6c52\u8389\u960f)), i2f:float(mul:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u52d3\u74b1\u6c52\u8389\u960f[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), and:int(ldc:int(4619), ldc:int(11506)))), i2f:float(add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u52d3\u74b1\u6c52\u8389\u960f[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), ldc:int(114))), getfield:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\u52d3\u74b1\u6c52\u8389\u960f::\u61a4\u1833\u7873\u67e9\u36d3, this:\u52d3\u74b1\u6c52\u8389\u960f), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6d99\u6fb0\ub102\u8413\u8350)), getfield:float(\u52d3\u74b1\u6c52\u8389\u960f::\u97b7\u4c2b\ua068\u99f7\u3776, this:\u52d3\u74b1\u6c52\u8389\u960f)))
            invokestatic:void(GL11::glPopMatrix)
            var_8_13C = ldc:float(0.5f)
            
            if (cmpne:boolean(var_4_8C:float, i2f:float(getfield:int(\u52d3\u74b1\u6c52\u8389\u960f::\uc87f\ua6bd\ub19c\uc2bd\u51fa, this:\u52d3\u74b1\u6c52\u8389\u960f)))) {
                putfield:int(\u52d3\u74b1\u6c52\u8389\u960f::\uc87f\ua6bd\ub19c\uc2bd\u51fa, this:\u52d3\u74b1\u6c52\u8389\u960f, f2i:int(add:float(i2f:float(getfield:int(\u52d3\u74b1\u6c52\u8389\u960f::\uc87f\ua6bd\ub19c\uc2bd\u51fa, this:\u52d3\u74b1\u6c52\u8389\u960f)), mul:float(var_5_A3:float, var_8_13C:float))))
            }
            
            if (cmpne:boolean(var_3_7C:int, getfield:int(\u52d3\u74b1\u6c52\u8389\u960f::\uc9f6\ud523\u0b8e\u74b1\ubff1, this:\u52d3\u74b1\u6c52\u8389\u960f))) {
                putfield:int(\u52d3\u74b1\u6c52\u8389\u960f::\uc9f6\ud523\u0b8e\u74b1\ubff1, this:\u52d3\u74b1\u6c52\u8389\u960f, f2i:int(add:float(i2f:float(getfield:int(\u52d3\u74b1\u6c52\u8389\u960f::\uc9f6\ud523\u0b8e\u74b1\ubff1, this:\u52d3\u74b1\u6c52\u8389\u960f)), mul:float(var_6_AC:float, var_8_13C:float))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ua068\u5140\u9a18\u8d98\ufe34\uc2e8(int p0) {
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
            invokespecial:void(\ua068\u7af6\u3e75\u3bc9\ua562::\ua068\u5140\u9a18\u8d98\ufe34\uc2e8, this:\u52d3\u74b1\u6c52\u8389\u960f[expected:\ua068\u7af6\u3e75\u3bc9\ua562], p0:int)
            
            if (cmpeq:boolean(p0:int, and:int(ldc:int(25350), ldc:int(1344)))) {
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350), initobject:\u6fb0\u3711\u99f7\u16f6\u76bc\u8258[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u6fb0\u3711\u99f7\u16f6\u76bc\u8258::<init>))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u2dcc\ud51e\u72f1\uc29a\uae87\u5bc4$5(java.lang.String p0, java.lang.String p1) {
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
    
    private void lambda$\u516c\u8aa5\u8df4\u71f1\u8258\u4d85$4(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u3bd6\u156b\u8258\u0b8e\u4492 p0) {
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
    
    private void lambda$\u56bd\u7049\u624e\uc9f6\u4cd9\u7bad$3() {
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
    
    private void lambda$\u8308\u3c25\u494c\uc2e8\u3a62\u9937$2() {
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
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u839e\u8389\u494c\u7006\ub19c, this:\u52d3\u74b1\u6c52\u8389\u960f[expected:\u12cb\u93a2\ubf56\uc229\u8d90], getfield:\ucfaf\u8308\u9a18\u156b\u67e9[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u52d3\u74b1\u6c52\u8389\u960f::\u839e\u5245\ud7e8\u99f7\u516c, this:\u52d3\u74b1\u6c52\u8389\u960f))
            putfield:\ucfaf\u8308\u9a18\u156b\u67e9(\u52d3\u74b1\u6c52\u8389\u960f::\u839e\u5245\ud7e8\u99f7\u516c, this:\u52d3\u74b1\u6c52\u8389\u960f, aconstnull:\ucfaf\u8308\u9a18\u156b\u67e9())
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u3a62\uf94d\u3bd6\ub19c\u71f1\u67d0$1(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, int p1) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350), initobject:\u6fb0\u3711\u99f7\u16f6\u76bc\u8258[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u6fb0\u3711\u99f7\u16f6\u76bc\u8258::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ud171\u7d52\u9af2\uc3e3\u6c52\u0a06$0(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u3bd6\u156b\u8258\u0b8e\u4492 p0) {
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
            putfield:boolean(\u52d3\u74b1\u6c52\u8389\u960f::\ua3b4\u9a18\ufcaf\ubff1\u3c25, this:\u52d3\u74b1\u6c52\u8389\u960f, and:int[expected:boolean](ldc:int(27281), ldc:int(65)))
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u624e\u0a06\u7043\u759a\ub83f, getfield:\u8d90\u72f1\u5db4\ub19c\u5f50[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u52d3\u74b1\u6c52\u8389\u960f::\u0a06\u3711\u7bad\u1187\uc7fe, this:\u52d3\u74b1\u6c52\u8389\u960f), and:int[expected:boolean](ldc:int(3081), ldc:int(4913)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_93 : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_96_0 : byte[] [generated]
        stack_98_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_E5_0 : byte[] [generated]
        stack_288_0 : byte[] [generated]
        stack_306_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_220 : byte[]
        var_4_221 : int
        expr_98 : int [generated]
        var_5_271 : int
        var_3_276 : byte[]
        var_4_277 : int
        var_0_2A2 : int
        expr_288 : byte [generated]
        stack_2D1_2 : byte [generated]
        stack_2A5_0 : byte [generated]
        expr_C9 : int [generated]
        var_3_2F4 : byte[]
        var_4_2F5 : int
        expr_306 : byte [generated]
        var_3_F1 : String
        stack_217_0 : String[] [generated]
        expr_103 : String[] [generated]
        
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
            var_0_93 = and:int(ldc:int(695834839), ldc:int(970851534))
            expr_68 = var_2_6C = stack_96_0 = stack_98_0 = stack_C7_0 = stack_C9_0 = stack_E5_0 = stack_288_0 = stack_306_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("CuX7+RwHDT3x4RTw+go4B/kV7gIa9gLdAEEK8AMa8MAFQB/zCAUGCQEF/hTy+yrSBjL52QVBCgID/RIQ+s8fSwX7+RwHBwoKGvcEAQYSCPH4FBT8+wEeCNrg"))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_220 = newarray:byte[](byte.class, expr_70:int)
                var_4_221 = expr_70:int
                
                loop {
                    var_0_93 = and:int(var_0_93:int, ldc:int(-119782210))
                    var_4_221 = add:int(var_4_221:int, ldc:int(-1))
                    storeelement:byte(var_3_220:byte[], var_4_221:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_221:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_221:int, xor:int(ldc:int(-31739), ldc:int(-31740)))), ldc:int(4)), and:int(ldc:int(383), ldc:int(2063)))))
                    
                    if (cmpne:boolean(var_4_221:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_98_0 = stack_96_0 = stack_C7_0 = stack_C9_0 = stack_E5_0 = stack_288_0 = stack_306_0 = var_3_220:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_93:int, ldc:int(256)), ldc:int(0))) {
                    var_0_93 = and:int(var_0_93:int, ldc:int(-1597239010))
                    goto(Label_0206)
                }
                
                if (cmpne:boolean(and:int(var_0_93:int, ldc:int(2)), ldc:int(0))) {
                    var_0_93 = and:int(var_0_93:int, ldc:int(-1160119345))
                    expr_98 = arraylength:int(stack_98_0:byte[])
                    
                    if (cmpne:boolean(expr_98:int, ldc:int(0))) {
                        var_5_271 = expr_98:int
                        var_3_276 = newarray:byte[](byte.class, expr_98:int)
                        var_4_277 = expr_98:int
                        
                        loop {
                            var_0_2A2 = and:int(var_0_93:int, ldc:int(-285443121))
                            var_4_277 = add:int(var_4_277:int, ldc:int(-1))
                            expr_288 = stack_2D1_2 = loadelement(stack_288_0, var_4_277)
                            
                            if (cmplt:boolean(add:int(add:int(var_4_277:int, ldc:int(2)), neg:int(var_5_271:int)), ldc:int(0))) {
                                stack_2D1_2 = stack_2A5_0 = add:byte(expr_288:byte, loadelement:byte(var_3_276:byte[], add:int(var_4_277:int, ldc:int(2))))
                                goto(Label_0693)
                            }
                            
                            Label_0661:
                            
                            if (cmpeq:boolean(and:int(var_0_2A2:int, ldc:int(256)), ldc:int(0))) {
                                var_0_2A2 = and:int(var_0_2A2:int, ldc:int(-377887089))
                                stack_2D1_2 = stack_2A5_0 = add:byte(expr_288:byte, ldc:byte(2))
                            }
                            
                            Label_0693:
                            
                            if (cmpeq:boolean(and:int(var_0_2A2:int, ldc:int(4194304)), ldc:int(0))) {
                                var_0_2A2 = and:int(var_0_2A2:int, ldc:int(-2053478779))
                                goto(Label_0661)
                            }
                            
                            var_0_93 = and:int(var_0_2A2:int, ldc:int(-362967066))
                            storeelement:byte(var_3_276:byte[], var_4_277:int, stack_2D1_2:byte)
                            
                            if (cmpne:boolean(var_4_277:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_98_0 = stack_96_0 = stack_C7_0 = stack_C9_0 = stack_E5_0 = stack_288_0 = stack_306_0 = var_3_276:byte[]
                    }
                }
                
                Label_0157:
                
                if (cmpeq:boolean(and:int(var_0_93:int, ldc:int(536870912)), ldc:int(0))) {
                    var_0_93 = and:int(var_0_93:int, ldc:int(-1941983218))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_93:int, ldc:int(4194304)), ldc:int(0))) {
                        var_0_93 = and:int(var_0_93:int, ldc:int(1877002694))
                        loopcontinue()
                    }
                    
                    var_0_93 = and:int(var_0_93:int, ldc:int(1876769527))
                    expr_C9 = arraylength:int(stack_C9_0:byte[])
                    
                    if (cmpne:boolean(expr_C9:int, ldc:int(0))) {
                        var_3_2F4 = newarray:byte[](byte.class, expr_C9:int)
                        var_4_2F5 = expr_C9:int
                        
                        loop {
                            var_0_93 = and:int(var_0_93:int, ldc:int(788232934))
                            var_4_2F5 = add:int(var_4_2F5:int, ldc:int(-1))
                            expr_306 = loadelement:byte(stack_306_0:byte[], var_4_2F5:int)
                            storeelement:byte(var_3_2F4:byte[], var_4_2F5:int, xor:int(add:int(or:int(and:int(shl:int(expr_306:byte, and:int(ldc:int(524), ldc:int(11396))), ldc:int(-16)), and:int(shr:int(expr_306:byte[expected:int], xor:int(ldc:int(-32703), ldc:int(-32699))), ldc:int(15))), ldc:int(42)), ldc:int(71)))
                            
                            if (cmpne:boolean(var_4_2F5:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_98_0 = stack_96_0 = stack_C7_0 = stack_C9_0 = stack_E5_0 = stack_288_0 = stack_306_0 = var_3_2F4:byte[]
                    }
                }
                
                Label_0206:
                
                if (cmpeq:boolean(and:int(var_0_93:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0157)
                }
                
                if (cmpne:boolean(and:int(var_0_93:int, ldc:int(536870912)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_F1 = initobject:String(String::<init>, stack_E5_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_217_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(24010), ldc:int(8203)))
            expr_103 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(12297), ldc:int(12291)))
            storeelement:String(expr_103:String[], and:int(ldc:int(22537), ldc:int(617)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(8593), ldc:int(-8594)), and:int(ldc:int(-31429), ldc:int(23232))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(4241), ldc:int(4244)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(-27578), ldc:int(18697)), and:int(ldc:int(18761), ldc:int(1064))))
            storeelement:String(expr_103:String[], and:int(ldc:int(28005), ldc:int(-32118)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(16952), ldc:int(1224)), xor:int(ldc:int(5248), ldc:int(5263))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(67), ldc:int(68)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(207), ldc:int(15375)), xor:int(ldc:int(592), ldc:int(577))))
            storeelement:String(expr_103:String[], xor:int(ldc:int(133), ldc:int(131)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(7251), ldc:int(49)), and:int(ldc:int(8605), ldc:int(16413))))
            storeelement:String(expr_103:String[], and:int(ldc:int(13057), ldc:int(2231)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(4191), ldc:int(17981)), xor:int(ldc:int(4110), ldc:int(4145))))
            storeelement:String(expr_103:String[], and:int(ldc:int(17541), ldc:int(8220)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(309), ldc:int(266)), xor:int(ldc:int(280), ldc:int(351))))
            storeelement:String(expr_103:String[], and:int(ldc:int(25098), ldc:int(2466)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(10343), ldc:int(71)), and:int(ldc:int(26701), ldc:int(5340))))
            storeelement:String(expr_103:String[], and:int(ldc:int(4170), ldc:int(10249)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, and:int(ldc:int(94), ldc:int(27373)), and:int(ldc:int(10321), ldc:int(89))))
            storeelement:String(expr_103:String[], and:int(ldc:int(3), ldc:int(5123)), invokevirtual:String[expected:String](String::substring, var_3_F1:String, xor:int(ldc:int(56), ldc:int(105)), and:int(ldc:int(3167), ldc:int(9049))))
            putstatic:String[](\u52d3\u74b1\u6c52\u8389\u960f::\u4ab3\u99f7\u3a62\u3711\ub6ab, expr_103:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ucb79\u5bc4\u760c\u8413\u156b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_672 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_67D : int
        
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
        var_3_672 = and:int(ldc:int(1731959427), ldc:int(1446594887))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u52d3\u74b1\u6c52\u8389\u960f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
            var_3_672 = and:int(var_3_672:int, ldc:int(1704588475))
            var_5_81 = and:int(ldc:int(3876), ldc:int(-3878))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-23268), ldc:int(23235)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_672:int, ldc:int(1465483895))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(-30204), ldc:int(-30203)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, xor:int(ldc:int(9228), ldc:int(9229)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_672 = and:int(var_3_D1:int, ldc:int(1996036575))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(3587), ldc:int(4225)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1792032594))
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(2050110318))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1483784361))
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0675)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0559)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1356825791))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0559)
                            }
                            
                            goto(Label_0807)
                        }
                    }
                    
                    Label_0393:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1895354394))
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(788875600))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1696563915))
                        goto(Label_0675)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-772846902))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1928925019))
                        var_11_E2 = and:int(ldc:int(-27650), ldc:int(27649))
                        goto(Label_1517)
                    }
                    
                    Label_0559:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1630412452))
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1926185863))
                        goto(Label_0807)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(836830824))
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-885406333))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0807)
                        }
                    }
                    
                    Label_0675:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-777101018))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1917487874))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1792270848))
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1500526532))
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-178453145))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0807:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1893314908))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(454741059))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(2141396434))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0675)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(294979905))
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1693078484))
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-172104981))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(-30400), ldc:int(-30399))
                                goto(Label_1101)
                            }
                        }
                    }
                    
                    Label_0941:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1372563422))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1677867661))
                            goto(Label_0807)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1711595609))
                            goto(Label_0675)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-95282526))
                            goto(Label_0393)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1473848611))
                        var_11_E2 = and:int(ldc:int(19876), ldc:int(-24495))
                    }
                    
                    Label_1101:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(223209440))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1950624023))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0941)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-786879732))
                            goto(Label_0807)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-771100711))
                            goto(Label_0675)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-294901193))
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-688308354))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1593391687))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1380)
                            }
                        }
                    }
                    
                    Label_1244:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-746220482))
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1613696139))
                            goto(Label_1101)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0941)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(363347444))
                            goto(Label_0807)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0675)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(874811047))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1262289191))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1517)
                    }
                    
                    Label_1380:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1304701220))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1377125328))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(279139000))
                        goto(Label_0941)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0675)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-413122745))
                        goto(Label_0559)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0393)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_672 = and:int(var_3_672:int, ldc:int(1169757647))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1517:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67D = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1528:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-818265948))
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1894495672))
                        goto(Label_0807)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-813241313))
                        goto(Label_0675)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0559)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(598104483))
                        goto(Label_0393)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1773907899))
                        var_17_67D = add:int(var_16_110:int, xor:int(ldc:int(2064), ldc:int(2065)))
                        looporswitchbreak()
                    }
                    
                    var_3_672 = and:int(var_3_672:int, ldc:int(-851723285))
                }
                
                var_3_672 = and:int(var_3_672:int, ldc:int(2138798879))
                
                if (cmple:boolean(var_5_81 = var_17_67D:int, sub:int(var_6_88:int, and:int(ldc:int(129), ldc:int(20821))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
