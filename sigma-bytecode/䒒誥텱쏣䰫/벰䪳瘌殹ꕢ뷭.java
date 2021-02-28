public final class \u4492\u8aa5\ud171\uc3e3\u4c2b.\ubcb0\u4ab3\u760c\u6bb9\ua562\ubded {
    public void \ubcb0\u4ab3\u760c\u6bb9\ua562\ubded() {
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
            invokespecial:\u5d20\u6bb9\ub113\u983f\u47c2\u718f(\u5d20\u6bb9\ub113\u983f\u47c2\u718f::<init>, this:\ubcb0\u4ab3\u760c\u6bb9\ua562\ubded)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0a06\u93a2\ud7e8\u6198\u156b\u8640() {
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
    
    private static void lambda$\ub102\u64ab\ufe34\u6d69\u7af6\u40a9$0(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p0) {
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
            invokevirtual:void(\u8308\ub7dc\u446c\u40a9\u8753\u64f2::\u8350\uc910\u946b\u4d85\u6198\u7c6b, checkcast:\u8308\ub7dc\u446c\u40a9\u8753\u64f2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u8308\ub7dc\u446c\u40a9\u8753\u64f2.class, invokevirtual:\u8308\ub7dc\u446c\u40a9\u8753\u64f2(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u4d85\u71f1\u6435\u1833\u1187\u6435, invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4), ldc:Class<\u8308\ub7dc\u446c\u40a9\u8753\u64f2>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u8308\ub7dc\u446c\u40a9\u8753\u64f2.class))), ldc:short(-1))
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
    
    public void \u6cfe\u3e75\uf94d\u071d\u3776\u74b1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_615 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_620 : int
        
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
        var_3_615 = and:int(ldc:int(-542847910), ldc:int(429645356))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubcb0\u4ab3\u760c\u6bb9\ua562\ubded[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_615 = and:int(var_3_615:int, ldc:int(-111949345))
            var_5_7D = and:int(ldc:int(18735), ldc:int(-18736))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(7057), ldc:int(-7058)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_615:int, ldc:int(420926458))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(68), ldc:int(69)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(24768), ldc:int(24769)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_615 = and:int(var_3_D2:int, ldc:int(420660671))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(8259), ldc:int(2689)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-152206821))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1751848995))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1871468421))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(774888780))
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(430492931))
                    }
                    else {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1111760981))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1513892173))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1141442208))
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1415557288))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1673903518))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-14290550))
                        var_11_E3 = and:int(ldc:int(4373), ldc:int(-5472))
                        goto(Label_1423)
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-827881013))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1880152484))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1802970610))
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1146825794))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(628858123))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-471514406))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-2029429997))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(435679402))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0762:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-368384441))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(2106989800))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1850397760))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1965029763))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-191356846))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1382508179))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-371960013))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(2135749741))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(3155), ldc:int(293))
                                goto(Label_1043)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(279599084))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(259722260))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1316779243))
                            goto(Label_0762)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1897231193))
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-114757858))
                        var_11_E3 = and:int(ldc:int(-28775), ldc:int(28774))
                    }
                    
                    Label_1043:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1218193571))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(914982593))
                            goto(Label_0762)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-808328324))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-961296703))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1056083717))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(2068044939))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1292)
                            }
                        }
                    }
                    
                    Label_1162:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(602153637))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_1043)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1626687296))
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-780303518))
                            goto(Label_0762)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1526570127))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(290869520))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-48770646))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1423)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1292:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1380560800))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1656477776))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1046710875))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-238161738))
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1216327360))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_615 = and:int(var_3_615:int, ldc:int(993907501))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1423:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_620 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1434:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1575798198))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1477390105))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1893153224))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1004863967))
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-387493649))
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-971937303))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1680945620))
                        var_17_620 = add:int(var_16_111:int, xor:int(ldc:boolean(0), ldc:boolean(1)))
                        looporswitchbreak()
                    }
                    
                    var_3_615 = and:int(var_3_615:int, ldc:int(603692920))
                }
                
                var_3_615 = and:int(var_3_615:int, ldc:int(-1148393768))
                
                if (cmple:boolean(var_5_7D = var_17_620:int, sub:int(var_6_84:int, and:int(ldc:int(4613), ldc:int(10283))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_615 = and:int(var_3_615:int, ldc:int(137942437))
            goto(Label_0106)
        }
    }
}
