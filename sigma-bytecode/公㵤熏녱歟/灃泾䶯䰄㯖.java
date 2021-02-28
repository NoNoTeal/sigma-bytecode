public class \u516c\u3d64\u718f\ub171\u6b5f.\u7043\u6cfe\u4daf\u4c04\u3bd6 {
    public void \u7043\u6cfe\u4daf\u4c04\u3bd6() {
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
            invokespecial:Object(Object::<init>, this:\u7043\u6cfe\u4daf\u4c04\u3bd6)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \u516c\u3d64\u718f\ub171\u6b5f.\u7043\u6cfe\u4daf\u4c04\u3bd6 lambda$\ub7dc\u34df\ua6bd\uc3e3\u59ec\u4daf$0() {
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
            return:\u7043\u6cfe\u4daf\u4c04\u3bd6(getstatic:\u7043\u6cfe\u4daf\u4c04\u3bd6(\u7043\u6cfe\u4daf\u4c04\u3bd6::\u760c\u6cfe\u7af6\u5654\u93a2\ub6ab))
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
    
    public void \u7330\u3776\u3a62\uae5d\u34df\u64ab(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5FD : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_608 : int
        
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
        var_3_5FD = and:int(ldc:int(-1964485844), ldc:int(-1819749978))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7043\u6cfe\u4daf\u4c04\u3bd6[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1)), ldc:int(0))) {
            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-93785056))
            var_5_7D = and:int(ldc:int(-26653), ldc:int(26644))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-21617), ldc:int(21616)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5FD:int, ldc:int(-818381372))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(-28159), ldc:int(-28160)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(25602), ldc:int(25603)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5FD = and:int(var_3_CA:int, ldc:int(-1346866312))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(20993), ldc:int(20992)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1332972351))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1783404347))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-212085210))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-534494769))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(781939560))
                    }
                    else {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-2031135621))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1019184873))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-150021259))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-71620058))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(2011082389))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1248417974))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1408973465))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-701769641))
                        var_11_DB = and:int(ldc:int(-492), ldc:int(491))
                        goto(Label_1431)
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-215093050))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(869036982))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-379710563))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1395943563))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(2027404))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-832839815))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(404947101))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1614716533))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1911024682))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-801749450))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-2103583579))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-458920539))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(969785400))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1212450774))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(68), ldc:int(69))
                                goto(Label_1035)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-836900222))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-2080710617))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1784208869))
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(740945478))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-823627483))
                        var_11_DB = and:int(ldc:int(5034), ldc:int(-6075))
                    }
                    
                    Label_1035:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1220163375))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-317895721))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1815432427))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1746207398))
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1299880800))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1351534740))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1763460587))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1268155475))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-689088120))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1300)
                            }
                        }
                    }
                    
                    Label_1178:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1125131505))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(528953150))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_1035)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-232811917))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-513912471))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1636118238))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1431)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1300:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(683756628))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1273955067))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(809650209))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(2077189260))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1629425640))
                        loopcontinue()
                    }
                    
                    var_3_5FD = and:int(var_3_5FD:int, ldc:int(-345345741))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1431:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_608 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1442:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(70193545))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1599521786))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-43096680))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-537109832))
                        var_17_608 = add:int(var_16_109:int, xor:int(ldc:int(1290), ldc:int(1291)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5FD = and:int(var_3_5FD:int, ldc:int(-698722443))
                
                if (cmple:boolean(var_5_7D = var_17_608:int, sub:int(var_6_84:int, xor:int(ldc:int(1031), ldc:int(1030))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
