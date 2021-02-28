public class \u56bd\u8413\u647c\u5bc4\ud158.\ubb2b\uc2bd\u5bc4\u7d52\u4975 {
    public void \ubb2b\uc2bd\u5bc4\u7d52\u4975(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\ub18d\u1833\u6b0d\u0a06\u9033 p0) {
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
    
    public double \u56bd\u416d\u8753\ub19c\u97b7\ucb79() {
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
            return:double(mul:double(invokespecial:double(\u16f6\u47c2\u12b2\u8709\u6d69::\u56bd\u416d\u8753\ub19c\u97b7\ucb79, this:\ubb2b\uc2bd\u5bc4\u7d52\u4975[expected:\u16f6\u47c2\u12b2\u8709\u6d69]), ldc:double(0.25)))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u64f2\u5654\u760c\u6b5f\u52d3\u92ee$0(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
        var_1_5F : int
        stack_89_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(640289716), ldc:int(-521251))
            
            if (invokevirtual:boolean(\u36d3\u2dcc\ub113\u5654\uceb8::\u3bd6\u88c5\ud158\ubf56\u8cae\u983f, checkcast:\u647c\ubb2b\ub83f\u67d0\u0c95[expected:\u36d3\u2dcc\ub113\u5654\uceb8](\u7c6b\u7c6b\ubefe\u385b\u3c25.\u647c\ubb2b\ub83f\u67d0\u0c95.class, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u647c\ubb2b\ub83f\u67d0\u0c95]))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(887030581))
                stack_89_0 = and:int(ldc:int(1490), ldc:int(-3540))
            }
            else {
                stack_89_0 = xor:int(ldc:int(24582), ldc:int(24583))
            }
            
            return:boolean(stack_89_0:int)
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
    
    public void \ub8be\u4c2b\u071d\ub70c\ubded\u6d99(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_605 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_610 : int
        
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
        var_3_605 = and:int(ldc:int(-118687583), ldc:int(1960832665))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubb2b\uc2bd\u5bc4\u7d52\u4975[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8)), ldc:int(0))) {
            var_3_605 = and:int(var_3_605:int, ldc:int(317582927))
            var_5_7D = and:int(ldc:int(-16422), ldc:int(16421))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(17262), ldc:int(-19312)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_605:int, ldc:int(920124710))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(16385), ldc:int(913)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(25345), ldc:int(5129)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_605 = and:int(var_3_CA:int, ldc:int(2029824772))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(5), ldc:int(83)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(780662693))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1126321488))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1295138517))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1870827847))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(510522133))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(2144536657))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(489040399))
                    }
                    else {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1942353957))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(389862322))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1561815769))
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(127243108))
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(1509211793))
                        var_11_DB = and:int(ldc:int(-10206), ldc:int(924))
                        goto(Label_1415)
                    }
                    
                    Label_0549:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(936981262))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(294575130))
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-1178915744))
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(-69863197))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(705464780))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(2054584050))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(64)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(287687132))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(2071453349))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(1994915379))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0770:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1843587658))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1890536040))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1345856186))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-358806143))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(1399989329))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1124663690))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(260), ldc:int(261))
                                goto(Label_1027)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(869484325))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-356550947))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-1678324687))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(888667096))
                        var_11_DB = and:int(ldc:int(-4797), ldc:int(4788))
                    }
                    
                    Label_1027:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-222389308))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-2030283872))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(64)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-2000372549))
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(1571164770))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-1825048312))
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1258832031))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1292)
                            }
                        }
                    }
                    
                    Label_1146:
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(291027200))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1963298944))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_1027)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-2118367242))
                            goto(Label_0889)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-1285079750))
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-1826346222))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-948449754))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-652212539))
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(365362133))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1415)
                    }
                    
                    Label_1292:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1474118517))
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1582354037))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(749525865))
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1781488002))
                        loopcontinue()
                    }
                    
                    var_3_605 = and:int(var_3_605:int, ldc:int(533588508))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1415:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_610 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1426:
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-305634132))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(486466632))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1649150707))
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1573807135))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1595230241))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1945500559))
                        var_17_610 = add:int(var_16_109:int, and:int(ldc:int(18433), ldc:int(43)))
                        looporswitchbreak()
                    }
                    
                    var_3_605 = and:int(var_3_605:int, ldc:int(1052172813))
                }
                
                var_3_605 = and:int(var_3_605:int, ldc:int(2079238221))
                
                if (cmple:boolean(var_5_7D = var_17_610:int, sub:int(var_6_84:int, xor:int(ldc:int(-22520), ldc:int(-22519))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
