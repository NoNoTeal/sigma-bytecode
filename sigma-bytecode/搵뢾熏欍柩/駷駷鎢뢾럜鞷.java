public class \u6435\ub8be\u718f\u6b0d\u67e9.\u99f7\u99f7\u93a2\ub8be\ub7dc\u97b7 {
    public void \u99f7\u99f7\u93a2\ub8be\ub7dc\u97b7(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe p1, int p2, java.util.List<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d> p3) {
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
            invokespecial:Object(Object::<init>, this:\u99f7\u99f7\u93a2\ub8be\ub7dc\u97b7)
            putfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u99f7\u99f7\u93a2\ub8be\ub7dc\u97b7::\u8d98\u67e9\u8389\u3711\ud158\u5654, this:\u99f7\u99f7\u93a2\ub8be\ub7dc\u97b7, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
            putfield:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe(\u99f7\u99f7\u93a2\ub8be\ub7dc\u97b7::\u647c\u7d52\u3711\uc7fe\u8389\ube23, this:\u99f7\u99f7\u93a2\ub8be\ub7dc\u97b7, p1:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe)
            putfield:int(\u99f7\u99f7\u93a2\ub8be\ub7dc\u97b7::\u34df\ub113\u9af2\u4179\u4bc8\u8aa5, this:\u99f7\u99f7\u93a2\ub8be\ub7dc\u97b7, p2:int)
            putfield:List<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\u99f7\u99f7\u93a2\ub8be\ub7dc\u97b7::\u12b2\u34df\uc31c\u40a9\u927d\u4d85, this:\u99f7\u99f7\u93a2\ub8be\ub7dc\u97b7, p3:List<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.kinds.App lambda$\u7ce1\u3dd3\u9255\u69d9\u64ab\uc87f$4(com.mojang.serialization.codecs.RecordCodecBuilder$Instance p0) {
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
    
    private static java.util.List lambda$\u92ee\uc246\u1187\u9937\u4975\u4ab3$3(\u6435\ub8be\u718f\u6b0d\u67e9.\u99f7\u99f7\u93a2\ub8be\ub7dc\u97b7 p0) {
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
            return:List(getfield:List<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\u99f7\u99f7\u93a2\ub8be\ub7dc\u97b7::\u12b2\u34df\uc31c\u40a9\u927d\u4d85, p0:\u99f7\u99f7\u93a2\ub8be\ub7dc\u97b7))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Integer lambda$\u5fe1\u120d\u6c56\u7049\u2dcc\ua3b4$2(\u6435\ub8be\u718f\u6b0d\u67e9.\u99f7\u99f7\u93a2\ub8be\ub7dc\u97b7 p0) {
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
            return:Integer(invokestatic:Integer(Integer::valueOf, getfield:int(\u99f7\u99f7\u93a2\ub8be\ub7dc\u97b7::\u34df\ub113\u9af2\u4179\u4bc8\u8aa5, p0:\u99f7\u99f7\u93a2\ub8be\ub7dc\u97b7)))
        }
        
        goto(Label_0006)
    }
    
    private static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe lambda$\u516c\u8d98\u7c6b\uc910\u9a18\uae5d$1(\u6435\ub8be\u718f\u6b0d\u67e9.\u99f7\u99f7\u93a2\ub8be\ub7dc\u97b7 p0) {
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
            return:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe(getfield:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe(\u99f7\u99f7\u93a2\ub8be\ub7dc\u97b7::\u647c\u7d52\u3711\uc7fe\u8389\ube23, p0:\u99f7\u99f7\u93a2\ub8be\ub7dc\u97b7))
        }
        
        goto(Label_0006)
    }
    
    private static \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d lambda$\u6ec6\u927d\u6c52\u92ff\ud217\u4179$0(\u6435\ub8be\u718f\u6b0d\u67e9.\u99f7\u99f7\u93a2\ub8be\ub7dc\u97b7 p0) {
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
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u99f7\u99f7\u93a2\ub8be\ub7dc\u97b7::\u8d98\u67e9\u8389\u3711\ud158\u5654, p0:\u99f7\u99f7\u93a2\ub8be\ub7dc\u97b7))
        }
        
        goto(Label_0006)
    }
    
    static {
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
    
    public void \u516c\u5245\u12cb\u6b0d\u8aa5\u34df(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_641 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_C6 : double
        var_3_D8 : int
        var_11_E9 : int
        var_14_113 : double
        var_16_117 : int
        var_12_10F : double
        var_17_64C : int
        
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
        var_3_641 = and:int(ldc:int(-1585509273), ldc:int(-2032189905))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u99f7\u99f7\u93a2\ub8be\ub7dc\u97b7[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_641 = and:int(var_3_641:int, ldc:int(-1191231770))
            var_5_80 = and:int(ldc:int(-12420), ldc:int(12419))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(3788), ldc:int(-4047)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C6 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D8 = and:int(var_3_641:int, ldc:int(-1468096706))
                    var_9_C6 = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E9 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E9:int, sub:int(var_6_87:int, xor:int(ldc:int(4512), ldc:int(4513)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E9:int, xor:int(ldc:int(272), ldc:int(273)))), var_7_96:double))) {
                        inc:int(var_11_E9, ldc:int(1))
                    }
                    
                    var_3_641 = and:int(var_3_D8:int, ldc:int(-288985993))
                    var_14_113 = var_7_96:double
                    var_16_117 = var_11_E9:int
                }
                else {
                    var_11_E9 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), xor:int(ldc:int(564), ldc:int(565)))
                    var_12_10F = var_14_113 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_117 = var_11_E9:int, var_6_87:int)) {
                        var_9_C6 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E9:int)
                        var_16_117 = var_11_E9:int
                        var_14_113 = var_12_10F:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1507)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-503891454))
                        goto(Label_1355)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(216497590))
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(465098324))
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(237072314))
                        goto(Label_0933)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0812)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0683)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0559)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1720733714))
                        
                        if (cmplt:boolean(var_16_117:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0559)
                            }
                            
                            goto(Label_0812)
                        }
                    }
                    
                    Label_0404:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1205035684))
                        goto(Label_1507)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1916221096))
                        goto(Label_1355)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0933)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0812)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0683)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(2084029292))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-69312849))
                        var_11_E9 = and:int(ldc:int(26680), ldc:int(-26686))
                        goto(Label_1496)
                    }
                    
                    Label_0559:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1507)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1237345197))
                        goto(Label_1355)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1631775421))
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-895453157))
                        goto(Label_0933)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0812)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0404)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-222709848))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-824255378))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_113 = var_9_C6:double
                            goto(Label_0812)
                        }
                    }
                    
                    Label_0683:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1507)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1355)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1657418827))
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1030731705))
                        goto(Label_0933)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-1559117155))
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0404)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1969631854))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-329253841))
                        var_14_113 = mul:double(ldc:double(0.5), add:double(var_9_C6:double, var_14_113:double))
                    }
                    
                    Label_0812:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1507)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-201195801))
                        goto(Label_1355)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-2064582252))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-964369413))
                            goto(Label_0683)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-1882888979))
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0404)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1857650761))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E9 = and:int(ldc:int(7681), ldc:int(9))
                                goto(Label_1099)
                            }
                        }
                    }
                    
                    Label_0933:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1507)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1914310317))
                        goto(Label_1355)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1883143777))
                        goto(Label_1213)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(610327618))
                            goto(Label_0812)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1165271154))
                            goto(Label_0683)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0404)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(646668758))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1033987026))
                        var_11_E9 = and:int(ldc:int(2207), ldc:int(-3232))
                    }
                    
                    Label_1099:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1507)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1355)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-773275362))
                            goto(Label_0933)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0812)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-1511804381))
                            goto(Label_0683)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0404)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-276661446))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-665965506))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                                goto(Label_1355)
                            }
                        }
                    }
                    
                    Label_1213:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(341891005))
                        goto(Label_1507)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(937363518))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_1099)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0933)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-848838142))
                            goto(Label_0812)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0683)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1681195027))
                            goto(Label_0404)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1665559966))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1384726866))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_113:double, var_5_80:int, var_16_117:int)
                        goto(Label_1496)
                    }
                    
                    Label_1355:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1507)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1796516377))
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(749337396))
                        goto(Label_0933)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-343721597))
                        goto(Label_0812)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1210109761))
                        goto(Label_0683)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0559)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-778350572))
                        loopcontinue()
                    }
                    
                    var_3_641 = and:int(var_3_641:int, ldc:int(-2033250457))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_113:double, ldc:double(0.0))
                    Label_1496:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_64C = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1507:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1355)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1079422840))
                        goto(Label_1213)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-447328280))
                        goto(Label_0933)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0812)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0683)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-2057929042))
                        var_17_64C = add:int(var_16_117:int, and:int(ldc:int(5387), ldc:int(21)))
                        looporswitchbreak()
                    }
                }
                
                var_3_641 = and:int(var_3_641:int, ldc:int(-1065419657))
                
                if (cmple:boolean(var_5_80 = var_17_64C:int, sub:int(var_6_87:int, and:int(ldc:int(13057), ldc:int(2083))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_641 = and:int(var_3_641:int, ldc:int(-1242693527))
            goto(Label_0108)
        }
    }
}
