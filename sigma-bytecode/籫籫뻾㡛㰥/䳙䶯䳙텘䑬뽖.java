public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56 {
    public void \u4cd9\u4daf\u4cd9\ud158\u446c\ubf56(int p0, int p1, int p2, int p3, int p4, java.lang.String p5, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u0800\uae5d\ubf56\u8709\u4d85\u7873 p6) {
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
            invokespecial:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::<init>, this:\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56, p1:int, p2:int, p3:int, p4:int, initobject:StringTextComponent[expected:ITextComponent](StringTextComponent::<init>, p5:String), p6:\u0800\uae5d\ubf56\u8709\u4d85\u7873)
            putfield:int(\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56::\u4f4a\u8df4\uafe7\ud12e\u4f52\u3d4b, this:\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56, p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4cd9\u4daf\u4cd9\ud158\u446c\ubf56(int p0, int p1, int p2, int p3, int p4, java.lang.String p5) {
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
    
    public void \u4cd9\u4daf\u4cd9\ud158\u446c\ubf56(int p0, int p1, int p2, java.lang.String p3) {
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
    
    public void \u8350\u51b2\u3c25\u71ae\ube23\u6fb0(java.lang.String p0) {
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
            invokespecial:void(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\u8350\u51b2\u3c25\u71ae\ube23\u6fb0, this:\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995], initobject:StringTextComponent[expected:ITextComponent](StringTextComponent::<init>, p0:String))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ua562\u5d20\uf94d\u71ae\uceb8\u600f$1(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
    
    private static void lambda$\u3d64\u3dd3\u8640\u3d4b\u0800\u7330$0(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_62D : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_638 : int
        
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
        var_3_62D = and:int(ldc:int(-1593771857), ldc:int(2044902395))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4cd9\u4daf\u4cd9\ud158\u446c\ubf56[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_62D = and:int(var_3_62D:int, ldc:int(321929032))
        }
        else {
            var_3_62D = and:int(var_3_62D:int, ldc:int(-49955077))
            var_5_85 = and:int(ldc:int(4699), ldc:int(-4956))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-22920), ldc:int(22917)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_62D:int, ldc:int(1059994875))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(10369), ldc:int(10368)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(-32766), ldc:int(-32765)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_62D = and:int(var_3_DA:int, ldc:int(793279935))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(8209), ldc:int(4265)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1409778048))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(857484910))
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1959774174))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(2057739537))
                        goto(Label_0826)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(816290719))
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1373741361))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1178669653))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0826)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-2137638620))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-434457646))
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(2107527966))
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-706546352))
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1286165317))
                        var_11_EB = and:int(ldc:int(-14529), ldc:int(14528))
                        goto(Label_1455)
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1014860580))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1756446397))
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-421960653))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1042874925))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1764154412))
                        goto(Label_0826)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1399287952))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-1590048672))
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-475087941))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0826)
                        }
                    }
                    
                    Label_0700:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(292091216))
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1427776927))
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1269459040))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(16)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(590618388))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-1793817267))
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-448627793))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0826:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(2034032124))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-997064085))
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1394017934))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-784790064))
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-1971842821))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(16)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-674065498))
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1389842453))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(9017), ldc:int(17537))
                                goto(Label_1099)
                            }
                        }
                    }
                    
                    Label_0953:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1630159464))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-667240912))
                            goto(Label_0826)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-1720599400))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-316937830))
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-46356037))
                        var_11_EB = and:int(ldc:int(-3652), ldc:int(3651))
                    }
                    
                    Label_1099:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(437563725))
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(771324513))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0953)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0826)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1670895946))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(665123499))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1332)
                            }
                        }
                    }
                    
                    Label_1202:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-414591451))
                            goto(Label_1099)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-189784956))
                            goto(Label_0953)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0826)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-285790484))
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1269492633))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(7981980))
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1997647099))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1455)
                    }
                    
                    Label_1332:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-860348704))
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1793327435))
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1882109905))
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-698095130))
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_62D = and:int(var_3_62D:int, ldc:int(-149897281))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1455:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_638 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1466:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1482303627))
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-481675726))
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1666670560))
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1266692253))
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1628693615))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1128970400))
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1870003711))
                        var_17_638 = add:int(var_16_119:int, and:int(ldc:int(4173), ldc:int(18065)))
                        looporswitchbreak()
                    }
                }
                
                var_3_62D = and:int(var_3_62D:int, ldc:int(-1283228245))
                
                if (cmple:boolean(var_5_85 = var_17_638:int, sub:int(var_6_8C:int, xor:int(ldc:int(9216), ldc:int(9217))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(64)), ldc:int(0))) {
            var_3_62D = and:int(var_3_62D:int, ldc:int(-1445014950))
            goto(Label_0106)
        }
    }
}
