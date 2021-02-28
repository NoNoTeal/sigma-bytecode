public class \ud36e\u6bb9\u960f\u4c04\u64ab.\u6ec6\ucef1\ufcaf\uc3e3\ud217\ub171 {
    public void \u6ec6\ucef1\ufcaf\uc3e3\ud217\ub171(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd p0) {
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
    
    public void \u6ec6\ucef1\ufcaf\uc3e3\ud217\ub171(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u76bc\u156b\u5140\u3504\u416d\ua068 p1) {
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
            invokespecial:Object(Object::<init>, this:\u6ec6\ucef1\ufcaf\uc3e3\ud217\ub171)
            putfield:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd(\u6ec6\ucef1\ufcaf\uc3e3\ud217\ub171::\ub18d\uc2e8\u4492\u4c2b\u2dcc\u5db4, this:\u6ec6\ucef1\ufcaf\uc3e3\ud217\ub171, p0:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd)
            putfield:\u76bc\u156b\u5140\u3504\u416d\ua068(\u6ec6\ucef1\ufcaf\uc3e3\ud217\ub171::\u40a9\u62da\u624e\u72f1\uff55\u40a9, this:\u6ec6\ucef1\ufcaf\uc3e3\ud217\ub171, p1:\u76bc\u156b\u5140\u3504\u416d\ua068)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6198\uae87\u61a4\u4492\u946b\u3e2a(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u5654\u59ec\u5f50\ubff1\u7006\u6435 p0) {
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
            invokevirtual:void(\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd<\u5654\u59ec\u5f50\ubff1\u7006\u6435, C2, S1, S2>::\u4ab3\u6cfe\u4cd9\uff55\u97b7\u7e3f, getfield:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd(\u6ec6\ucef1\ufcaf\uc3e3\ud217\ub171::\ub18d\uc2e8\u4492\u4c2b\u2dcc\u5db4, this:\u6ec6\ucef1\ufcaf\uc3e3\ud217\ub171), p0:\u5654\u59ec\u5f50\ubff1\u7006\u6435, initobject:\u9255\u3bc9\u416d\u4179\u3d64\ubb2b[expected:\u5d20\u6bb9\ub113\u983f\u47c2\u718f](\u9255\u3bc9\u416d\u4179\u3d64\ubb2b::<init>, this:\u6ec6\ucef1\ufcaf\uc3e3\ud217\ub171))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u71f1\uceb8\u4cd9\u965f\u5654\u839e$0(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd p0, int p1) {
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
            return:int(invokevirtual:int(\u5245\ub1b9\ube23\u0b8e\u0c95\u99f7::\uc87f\ub102\ub19c\u8aa5\ucfaf\ubcb0, invokevirtual:\u5245\ub1b9\ube23\u0b8e\u0c95\u99f7(\u6198\uceb8\ud12e\u839e\u071d\ub6ab::\u67d0\u8bb0\u600f\ud7e8\u647c\u6b0d, invokevirtual:\u6198\uceb8\ud12e\u839e\u071d\ub6ab(\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd::\ub7dc\u983f\u69d9\uc3e3\u527a\u8413, p0:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd)), p1:int))
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
    
    public void \u51fa\u4c04\u52d3\u960f\u40a9\ua068(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5ED : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_5F8 : int
        
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
        var_3_5ED = and:int(ldc:int(-1822823769), ldc:int(-753938715))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6ec6\ucef1\ufcaf\uc3e3\ud217\ub171[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8)), ldc:int(0))) {
            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1924357821))
        }
        else {
            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-955428163))
            var_5_85 = and:int(ldc:int(3176), ldc:int(-3177))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(12739), ldc:int(-14796)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_5ED:int, ldc:int(-217427411))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(17513), ldc:int(6165)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(5252), ldc:int(5253)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_5ED = and:int(var_3_DA:int, ldc:int(-873540681))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(1433), ldc:int(16385)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(777513473))
                        goto(Label_0628)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-537934923))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0517)
                            }
                            
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(2105720386))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(50594322))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1575297140))
                        goto(Label_0628)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-883264603))
                            var_11_EB = and:int(ldc:int(4378), ldc:int(-4380))
                            goto(Label_1391)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0517:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1766705733))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1274015146))
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1881594967))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-579187006))
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-273070475))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0628:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1041981543))
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-91289882))
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1567386056))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1283907167))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1048029197))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(127803103))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1617146897))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0762:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1414187279))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(613761779))
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-952285523))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-588941584))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-2010129945))
                            goto(Label_0628)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1947501897))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(-32184), ldc:int(-32183))
                                goto(Label_1043)
                            }
                        }
                    }
                    
                    Label_0881:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(579857070))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(181751329))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(77853262))
                            goto(Label_0762)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(783471553))
                            goto(Label_0628)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-764033121))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1153657700))
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-340996563))
                        var_11_EB = and:int(ldc:int(14881), ldc:int(-15906))
                    }
                    
                    Label_1043:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(468329785))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(363369139))
                            goto(Label_0762)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1310205152))
                            goto(Label_0628)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1753453827))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1268)
                            }
                        }
                    }
                    
                    Label_1146:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(293931160))
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1043)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1051029697))
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(15588424))
                            goto(Label_0762)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0628)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(781086842))
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-217096457))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1391)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1268:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-35602945))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1704605605))
                        goto(Label_0628)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(705115511))
                        goto(Label_0517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1530841995))
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5ED = and:int(var_3_5ED:int, ldc:int(-2026223769))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1391:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5F8 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1402:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1514116354))
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-815427631))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1110001467))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(912088152))
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0628)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-38842643))
                        goto(Label_0517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-744763867))
                        var_17_5F8 = add:int(var_16_119:int, and:int(ldc:int(431), ldc:int(17473)))
                        looporswitchbreak()
                    }
                    
                    var_3_5ED = and:int(var_3_5ED:int, ldc:int(-417001601))
                }
                
                var_3_5ED = and:int(var_3_5ED:int, ldc:int(-413148297))
                
                if (cmple:boolean(var_5_85 = var_17_5F8:int, sub:int(var_6_8C:int, xor:int(ldc:int(384), ldc:int(385))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_5ED = and:int(var_3_5ED:int, ldc:int(19734855))
            goto(Label_0106)
        }
    }
}
