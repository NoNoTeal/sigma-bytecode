public final class \u5d20\u97b7\u8753\u873d\u16f6.\u34df\u62da\u7bad\u92ee\u8258\u9af2 {
    public void \u34df\u62da\u7bad\u92ee\u8258\u9af2() {
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
            invokespecial:\u5d20\u6bb9\ub113\u983f\u47c2\u718f(\u5d20\u6bb9\ub113\u983f\u47c2\u718f::<init>, this:\u34df\u62da\u7bad\u92ee\u8258\u9af2)
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
    
    private static void lambda$\u8d90\ud523\ubff1\u983f\u8389\uf995$0(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p0) {
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
            invokestatic:void(\uc4d2\u67e9\uc229\u960f\uc7fe\u99f7::\ub102\ub7dc\ub70c\u6bb9\u6fb0\uc87f, checkcast:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a.class, invokevirtual:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u4492\ubb2b\uf9c5\u759a\u69d9\u9937))))
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
        var_3_61D : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_628 : int
        
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
        var_3_61D = and:int(ldc:int(1032310475), ldc:int(1840211935))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u34df\u62da\u7bad\u92ee\u8258\u9af2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
            var_3_61D = and:int(var_3_61D:int, ldc:int(-1342741285))
            var_5_7D = and:int(ldc:int(16982), ldc:int(-17247))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(8370), ldc:int(-8371)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_61D:int, ldc:int(-271591713))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(8451), ldc:int(16417)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(17668), ldc:int(17669)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_61D = and:int(var_3_CA:int, ldc:int(-1346416417))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(17953), ldc:int(149)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1797819314))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(343178514))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1817795632))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-442392329))
                    }
                    else {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-34122534))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(2059688499))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1829635939))
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-900455682))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(920619086))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1180362473))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1545011050))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(2020864307))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(2038801668))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1470442760))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1738490251))
                        var_11_DB = and:int(ldc:int(16423), ldc:int(-16432))
                        goto(Label_1447)
                    }
                    
                    Label_0573:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1918283638))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1173493809))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1426134860))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-406334773))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-2016381806))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-710663185))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-487225504))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1171181213))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(715380756))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-40896274))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-255406894))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1845038751))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1662755809))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-35698770))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(-28669), ldc:int(-28670))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1527246749))
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(601170447))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1727730323))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-303091617))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(799539199))
                        var_11_DB = and:int(ldc:int(-22477), ldc:int(21960))
                    }
                    
                    Label_1051:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-923990281))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-813424899))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1716990261))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1135620348))
                            goto(Label_0905)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1599662979))
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1126045681))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-975073835))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(797811122))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-168853845))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1324)
                            }
                        }
                    }
                    
                    Label_1194:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1477232982))
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1637056811))
                            goto(Label_1051)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(356854553))
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-459564668))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-418823409))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-274239270))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1447)
                    }
                    
                    Label_1324:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(719226831))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1399763567))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1517716546))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-308662129))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_61D = and:int(var_3_61D:int, ldc:int(-1383641202))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1447:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_628 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1458:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1645878264))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(375571243))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1576055351))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1702902532))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1486941293))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(937416335))
                        var_17_628 = add:int(var_16_109:int, xor:int(ldc:int(153), ldc:int(152)))
                        looporswitchbreak()
                    }
                }
                
                var_3_61D = and:int(var_3_61D:int, ldc:int(1038568634))
                
                if (cmple:boolean(var_5_7D = var_17_628:int, sub:int(var_6_84:int, xor:int(ldc:int(4928), ldc:int(4929))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
