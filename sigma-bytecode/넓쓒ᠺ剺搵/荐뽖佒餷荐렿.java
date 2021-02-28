public class \ub113\uc4d2\u183a\u527a\u6435.\u8350\ubf56\u4f52\u9937\u8350\ub83f {
    public void \u8350\ubf56\u4f52\u9937\u8350\ub83f(java.lang.Iterable<? extends \u6435\ub8be\u718f\u6b0d\u67e9.\u6d69\ub1b9\u93a2\u624e\u416d\u51fa> p0) {
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
            invokespecial:Object(Object::<init>, this:\u8350\ubf56\u4f52\u9937\u8350\ub83f)
            putfield:Iterable<? extends \u6d69\ub1b9\u93a2\u624e\u416d\u51fa>(\u8350\ubf56\u4f52\u9937\u8350\ub83f::\u0a06\u960f\u071d\u7c6b\u8258\u6b5f, this:\u8350\ubf56\u4f52\u9937\u8350\ub83f, p0:Iterable<? extends \u6d69\ub1b9\u93a2\u624e\u416d\u51fa>)
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
    
    private static boolean lambda$\u9af2\u9937\u8cae\u56bd\ufe34\u99f7$2(java.util.List p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1) {
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
    
    private static boolean lambda$\u4d85\ubb2b\uceb8\u392e\u92ee\u3c25$1(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, java.util.function.Predicate p1) {
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
    
    private static java.util.function.Predicate lambda$\u8753\ud4fe\ucb79\u9033\u3e2a\uf9c5$0(\u6b0d\u12cb\u156b\u4179\u8bb0.\ubcb0\ud4fe\uff55\u965f\u5f50\u9937 p0, \u6435\ub8be\u718f\u6b0d\u67e9.\u6d69\ub1b9\u93a2\u624e\u416d\u51fa p1) {
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
    
    public void \uc29a\u51fa\ub7dc\u5140\u5db4\u516c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5DA : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5E5 : int
        
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
        var_3_5DA = and:int(ldc:int(1247898895), ldc:int(-343769269))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8350\ubf56\u4f52\u9937\u8350\ub83f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_5DA = and:int(var_3_5DA:int, ldc:int(267465204))
        }
        else {
            var_3_5DA = and:int(var_3_5DA:int, ldc:int(2075451177))
            var_5_85 = and:int(ldc:int(861), ldc:int(-2014))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-92), ldc:int(91)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5DA:int, ldc:int(2070633850))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(2051), ldc:int(1169)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(5), ldc:int(8433)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5DA = and:int(var_3_D2:int, ldc:int(1799285870))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(-30576), ldc:int(-30575)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-1260832844))
                        goto(Label_1403)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-1166118239))
                        goto(Label_1145)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1055)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-1833521114))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-168136619))
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(1576364534))
                    }
                    else {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(1781493405))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(902213492))
                        goto(Label_1403)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-778085822))
                        goto(Label_1291)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1145)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(999035442))
                        goto(Label_1055)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(2058680605))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-465258213))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-1661867826))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5DA = and:int(var_3_5DA:int, ldc:int(-1917817908))
                            loopcontinue()
                        }
                        
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-899625272))
                        var_11_E3 = and:int(ldc:int(17672), ldc:int(-17673))
                        goto(Label_1392)
                    }
                    
                    Label_0573:
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(1050667490))
                        goto(Label_1403)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(1528830567))
                        goto(Label_1145)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1055)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-739964187))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-829334020))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(1338051204))
                        goto(Label_1403)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(1538521449))
                        goto(Label_1145)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-1470040503))
                        goto(Label_1055)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-372421886))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(1916584470))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(1527119036))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(787618095))
                        goto(Label_1403)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(1237063378))
                        goto(Label_1145)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1055)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-104463966))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5DA = and:int(var_3_5DA:int, ldc:int(-1238156386))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-91099349))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(-20476), ldc:int(-20475))
                                goto(Label_1055)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1403)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-794796510))
                        goto(Label_1145)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5DA = and:int(var_3_5DA:int, ldc:int(923809527))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5DA = and:int(var_3_5DA:int, ldc:int(863621883))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-904934388))
                        var_11_E3 = and:int(ldc:int(-6169), ldc:int(6168))
                    }
                    
                    Label_1055:
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1403)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(808534984))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-879035160))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1291)
                            }
                        }
                    }
                    
                    Label_1145:
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-2065020833))
                        goto(Label_1403)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-1978405578))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5DA = and:int(var_3_5DA:int, ldc:int(-393367285))
                            goto(Label_1055)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5DA = and:int(var_3_5DA:int, ldc:int(89369656))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5DA = and:int(var_3_5DA:int, ldc:int(611610111))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5DA = and:int(var_3_5DA:int, ldc:int(829074762))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5DA = and:int(var_3_5DA:int, ldc:int(-360452807))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1392)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1291:
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1403)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1145)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1055)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-865975190))
                        loopcontinue()
                    }
                    
                    var_3_5DA = and:int(var_3_5DA:int, ldc:int(1856437710))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1392:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5E5 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1403:
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-719732213))
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(1186455758))
                        goto(Label_1145)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1055)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-18518948))
                        var_17_5E5 = add:int(var_16_111:int, xor:int(ldc:int(291), ldc:int(290)))
                        looporswitchbreak()
                    }
                    
                    var_3_5DA = and:int(var_3_5DA:int, ldc:int(981124037))
                }
                
                var_3_5DA = and:int(var_3_5DA:int, ldc:int(-367833655))
                
                if (cmple:boolean(var_5_85 = var_17_5E5:int, sub:int(var_6_8C:int, and:int(ldc:int(265), ldc:int(12433))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(134217728)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
