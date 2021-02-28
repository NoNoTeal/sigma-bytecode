public class \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u9033\uf94d\u8640\u8aa5\u59ec\u56bd {
    public void \u9033\uf94d\u8640\u8aa5\u59ec\u56bd(java.lang.Iterable<? extends \u6435\ub8be\u718f\u6b0d\u67e9.\u6d69\ub1b9\u93a2\u624e\u416d\u51fa> p0) {
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
            invokespecial:Object(Object::<init>, this:\u9033\uf94d\u8640\u8aa5\u59ec\u56bd)
            putfield:Iterable<? extends \u6d69\ub1b9\u93a2\u624e\u416d\u51fa>(\u9033\uf94d\u8640\u8aa5\u59ec\u56bd::\u4f52\uae5d\u718f\ud4fe\u97e6\u3dd3, this:\u9033\uf94d\u8640\u8aa5\u59ec\u56bd, p0:Iterable<? extends \u6d69\ub1b9\u93a2\u624e\u416d\u51fa>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.function.Predicate<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d> \uc4d2\u983f\ucef1\u624e\ucef1\u3bd6(\u6b0d\u12cb\u156b\u4179\u8bb0.\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d> p0) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.BasicBlock
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
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
    
    private static boolean lambda$\u759a\u385b\u647c\ub83f\u5140\u8d98$2(java.util.List p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1) {
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
    
    private static boolean lambda$\u7c6b\uc84e\ufe34\ube23\u9937\u8aa5$1(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, java.util.function.Predicate p1) {
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
            return:boolean(invokeinterface:boolean(Predicate<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::test, p1:Predicate<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.function.Predicate lambda$\u416d\ua3b4\u6b0d\ub70c\ub32d\u983f$0(\u6b0d\u12cb\u156b\u4179\u8bb0.\ubcb0\ud4fe\uff55\u965f\u5f50\u9937 p0, \u6435\ub8be\u718f\u6b0d\u67e9.\u6d69\ub1b9\u93a2\u624e\u416d\u51fa p1) {
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
            return:Predicate(invokeinterface:Predicate<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\u6d69\ub1b9\u93a2\u624e\u416d\u51fa::\uc4d2\u983f\ucef1\u624e\ucef1\u3bd6, p1:\u6d69\ub1b9\u93a2\u624e\u416d\u51fa, p0:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>))
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
    
    public void \u7330\ud51e\u8d98\ua3b4\u8cae\uc2bd(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_624 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_62F : int
        
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
        var_3_624 = and:int(ldc:int(277668547), ldc:int(-745002089))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u9033\uf94d\u8640\u8aa5\u59ec\u56bd[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_624 = and:int(var_3_624:int, ldc:int(-238344513))
            var_5_7D = and:int(ldc:int(-12168), ldc:int(10119))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-20186), ldc:int(20185)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_624:int, ldc:int(531971011))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(225), ldc:int(224)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(1315), ldc:int(18437)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_624 = and:int(var_3_D2:int, ldc:int(-1261249581))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(2587), ldc:int(1)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(256)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(-1993029732))
                        goto(Label_1459)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1309)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(857103309))
                        goto(Label_1181)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1047)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(8)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(-560654062))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(1525197981))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(997302816))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(1915014175))
                    }
                    else {
                        var_3_624 = and:int(var_3_624:int, ldc:int(449695739))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(-1773568196))
                        goto(Label_1459)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1309)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1181)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1047)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(512)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(898322433))
                            loopcontinue()
                        }
                        
                        var_3_624 = and:int(var_3_624:int, ldc:int(-53376289))
                        var_11_E3 = and:int(ldc:int(9859), ldc:int(-9956))
                        goto(Label_1448)
                    }
                    
                    Label_0541:
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1459)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(-905478689))
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1181)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1047)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(-1068236571))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(8)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(-778746098))
                            loopcontinue()
                        }
                        
                        var_3_624 = and:int(var_3_624:int, ldc:int(-590151689))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1459)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(8)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(-278182906))
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(512)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(1418939616))
                        goto(Label_1181)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1047)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(-1743470156))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(1)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(-1318929096))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(256)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(313991093))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(512)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(752659887))
                            loopcontinue()
                        }
                        
                        var_3_624 = and:int(var_3_624:int, ldc:int(905854627))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1459)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(2)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(377467014))
                        goto(Label_1181)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(-510670376))
                        goto(Label_1047)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(128)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(-1723493948))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(1243654657))
                            loopcontinue()
                        }
                        
                        var_3_624 = and:int(var_3_624:int, ldc:int(-677790749))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(8577), ldc:int(4149))
                                goto(Label_1047)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(512)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(-1182874577))
                        goto(Label_1459)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(-1345086447))
                        goto(Label_1181)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(-17037395))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(-1000810634))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(-773942817))
                            loopcontinue()
                        }
                        
                        var_3_624 = and:int(var_3_624:int, ldc:int(1418773495))
                        var_11_E3 = and:int(ldc:int(-1790), ldc:int(717))
                    }
                    
                    Label_1047:
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(2103089525))
                        goto(Label_1459)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(8)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(1340019643))
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(8)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(649949765))
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(8)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(1131760264))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(-1661291485))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(512)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(725563153))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_624 = and:int(var_3_624:int, ldc:int(-1678971225))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1309)
                            }
                        }
                    }
                    
                    Label_1181:
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1459)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(-712806095))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_1047)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(-836356921))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(-1921405023))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(-664232580))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_624:int, ldc:int(1)), ldc:int(0))) {
                            var_3_624 = and:int(var_3_624:int, ldc:int(1419885447))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1448)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1309:
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(-1414580712))
                        goto(Label_1459)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1181)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1047)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(740353658))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(477134221))
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(1931934414))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(2131988539))
                        loopcontinue()
                    }
                    
                    var_3_624 = and:int(var_3_624:int, ldc:int(-258997333))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1448:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_62F = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1459:
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(1)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(-175613874))
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(128)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(-1451066062))
                        goto(Label_1181)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1047)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(-38516655))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(1153072631))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(512)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(-2098662502))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_624:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_624 = and:int(var_3_624:int, ldc:int(1524100011))
                        var_17_62F = add:int(var_16_111:int, xor:int(ldc:int(2186), ldc:int(2187)))
                        looporswitchbreak()
                    }
                }
                
                var_3_624 = and:int(var_3_624:int, ldc:int(1402956527))
                
                if (cmple:boolean(var_5_7D = var_17_62F:int, sub:int(var_6_84:int, and:int(ldc:int(9633), ldc:int(4625))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_624:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_624 = and:int(var_3_624:int, ldc:int(310876419))
            goto(Label_0106)
        }
    }
}
