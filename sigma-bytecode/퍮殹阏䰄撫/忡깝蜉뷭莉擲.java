public final class \ud36e\u6bb9\u960f\u4c04\u64ab.\u5fe1\uae5d\u8709\ubded\u8389\u64f2 {
    public void \u5fe1\uae5d\u8709\ubded\u8389\u64f2() {
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
            invokespecial:\u5d20\u6bb9\ub113\u983f\u47c2\u718f(\u5d20\u6bb9\ub113\u983f\u47c2\u718f::<init>, this:\u5fe1\uae5d\u8709\ubded\u8389\u64f2)
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
    
    private static void lambda$\u7c6b\u6d99\u71ae\u839e\u7af6\u5654$0(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p0) {
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
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Byte>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u7330\u16f6\ucfaf\u6435\u8753\u4cd9), invokestatic:Byte(Byte::valueOf, i2b:byte(invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u7ce1\uc238\u946b\ubb2b\ua6bd\u12b2, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1)))))))
            invokestatic:void(\u7af6\uc4d2\u4179\u8389\u839e\u0a06::\u9a18\uae5d\u5db4\u983f\uceb8\u3d64, checkcast:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a.class, invokevirtual:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u4492\ubb2b\uf9c5\u759a\u69d9\u9937))))
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
        var_3_5D4 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5DF : int
        
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
        var_3_5D4 = and:int(ldc:int(1470270324), ldc:int(342858079))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5fe1\uae5d\u8709\ubded\u8389\u64f2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(32768)), ldc:int(0))) {
            var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-1098999497))
            var_5_7D = and:int(ldc:int(-2248), ldc:int(2247))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(26753), ldc:int(-27010)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5D4:int, ldc:int(1973668798))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(16899), ldc:int(9605)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(4097), ldc:int(16389)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5D4 = and:int(var_3_D2:int, ldc:int(-59861740))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(12356), ldc:int(12357)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(545900463))
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(791487851))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(613347795))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(1026044683))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(467303950))
                    }
                    else {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-64237730))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-254067623))
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-1737642244))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(1604618622))
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5D4 = and:int(var_3_5D4:int, ldc:int(373276534))
                            var_11_E3 = and:int(ldc:int(25654), ldc:int(-25663))
                            goto(Label_1375)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(2104254103))
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(103857906))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(565533674))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(347250975))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-1710447382))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(803461600))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(236658215))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(1272593546))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-43452404))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-936892785))
                            loopcontinue()
                        }
                        
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-1239245412))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-97518766))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-1572043837))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-1186888481))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-1005242178))
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-193793739))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(11777), ldc:int(81))
                                goto(Label_1027)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-1019670812))
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-754605950))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5D4 = and:int(var_3_5D4:int, ldc:int(1200274362))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(481030524))
                        var_11_E3 = and:int(ldc:int(-21185), ldc:int(21184))
                    }
                    
                    Label_1027:
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(1836977286))
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(1955958485))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-1054401667))
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5D4 = and:int(var_3_5D4:int, ldc:int(1633677908))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-2146516484))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(339671518))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1260)
                            }
                        }
                    }
                    
                    Label_1146:
                    
                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_1027)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-473356476))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-989901658))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5D4 = and:int(var_3_5D4:int, ldc:int(978752682))
                            loopcontinue()
                        }
                        
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-1754290820))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1375)
                    }
                    
                    Label_1260:
                    
                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-329483178))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(89448915))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(1948400635))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(32768)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-135602858))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1375:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5DF = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1386:
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-2098389358))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(1995546277))
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D4:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(1610293318))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-1251565802))
                        var_17_5DF = add:int(var_16_111:int, and:int(ldc:int(1041), ldc:int(6473)))
                        looporswitchbreak()
                    }
                    
                    var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-1331877453))
                }
                
                var_3_5D4 = and:int(var_3_5D4:int, ldc:int(-572283105))
                
                if (cmple:boolean(var_5_7D = var_17_5DF:int, sub:int(var_6_84:int, xor:int(ldc:int(4642), ldc:int(4643))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5D4:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_5D4 = and:int(var_3_5D4:int, ldc:int(400344797))
            goto(Label_0106)
        }
    }
}
