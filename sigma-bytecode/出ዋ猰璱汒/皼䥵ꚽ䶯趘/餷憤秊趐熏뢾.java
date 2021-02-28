public final class \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u9937\u61a4\uf995\u8d90\u718f\ub8be {
    public void \u9937\u61a4\uf995\u8d90\u718f\ub8be(\u927d\u92ff\u71ae\uafe7\u6bb9.\u3bc9\u4179\u9033\ud217\ubf56\u98a4 p0) {
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
            putfield:\u3bc9\u4179\u9033\ud217\ubf56\u98a4(\u9937\u61a4\uf995\u8d90\u718f\ub8be::\u516c\u93a2\uf94d\u64ab\ubded\u4975, this:\u9937\u61a4\uf995\u8d90\u718f\ub8be, p0:\u3bc9\u4179\u9033\ud217\ubf56\u98a4)
            invokespecial:\u5d20\u6bb9\ub113\u983f\u47c2\u718f(\u5d20\u6bb9\ub113\u983f\u47c2\u718f::<init>, this:\u9937\u61a4\uf995\u8d90\u718f\ub8be)
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
    
    private static void lambda$\u51b2\u7e3f\u927d\ubff1\u8bb0\u97b7$2(\u927d\u92ff\u71ae\uafe7\u6bb9.\u3bc9\u4179\u9033\ud217\ubf56\u98a4 p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p1) {
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
    
    private static long lambda$\u120d\u5140\u8258\u3a62\u3e75\ube23$1(int[] p0, int p1) {
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
            return:long(i2l:long(loadelement:int(p0:int[], p1:int)))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u9a18\u8308\uf9c5\uafe7\ufcaf\u7af6$0(int[] p0, int p1, int p2) {
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
            storeelement:int(p0:int[], p1:int, p2:int)
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
        var_3_6A2 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C3 : double
        var_3_D5 : int
        var_11_E6 : int
        var_14_110 : double
        var_16_114 : int
        var_12_10C : double
        var_17_6AD : int
        
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
        var_3_6A2 = and:int(ldc:int(-331700487), ldc:int(-25493537))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u9937\u61a4\uf995\u8d90\u718f\ub8be[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(8192)), ldc:int(0))) {
            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1528479699))
            var_5_7D = and:int(ldc:int(25859), ldc:int(-25860))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-7990), ldc:int(4917)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C3 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D5 = and:int(var_3_6A2:int, ldc:int(1279262291))
                    var_9_C3 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E6 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E6:int, sub:int(var_6_84:int, xor:int(ldc:int(1298), ldc:int(1299)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E6:int, xor:int(ldc:int(21024), ldc:int(21025)))), var_7_93:double))) {
                        inc:int(var_11_E6, ldc:int(1))
                    }
                    
                    var_3_6A2 = and:int(var_3_D5:int, ldc:int(2101346135))
                    var_14_110 = var_7_93:double
                    var_16_114 = var_11_E6:int
                }
                else {
                    var_11_E6 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(13317), ldc:int(16457)))
                    var_12_10C = var_14_110 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_114 = var_11_E6:int, var_6_84:int)) {
                        var_9_C3 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E6:int)
                        var_16_114 = var_11_E6:int
                        var_14_110 = var_12_10C:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-890183768))
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1896217198))
                        goto(Label_1313)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(30215297))
                        goto(Label_1181)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-125554722))
                        goto(Label_1039)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1435449649))
                        goto(Label_0908)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0749)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-314368766))
                        goto(Label_0588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(2025581659))
                        
                        if (cmplt:boolean(var_16_114:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0588)
                            }
                            
                            goto(Label_0908)
                        }
                    }
                    
                    Label_0423:
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(938738986))
                        goto(Label_1604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1099867229))
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1255843322))
                        goto(Label_1313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1181)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1039)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0908)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0749)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(2141559561))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-885018885))
                            var_11_E6 = and:int(ldc:int(2078), ldc:int(-2079))
                            goto(Label_1593)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0588:
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-6829760))
                        goto(Label_1604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1364846706))
                        goto(Label_1447)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1742238511))
                        goto(Label_1313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1037147783))
                        goto(Label_1181)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(367031732))
                        goto(Label_1039)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(613734963))
                        goto(Label_0908)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-875623785))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0423)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(262733751))
                            loopcontinue()
                        }
                        
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-824266919))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_110 = var_9_C3:double
                            goto(Label_0908)
                        }
                    }
                    
                    Label_0749:
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1671233657))
                        goto(Label_1313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-872243924))
                        goto(Label_1181)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1427221821))
                        goto(Label_1039)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1905325061))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-211082701))
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1369732900))
                            goto(Label_0423)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-661589202))
                            loopcontinue()
                        }
                        
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1608509403))
                        var_14_110 = mul:double(ldc:double(0.5), add:double(var_9_C3:double, var_14_110:double))
                    }
                    
                    Label_0908:
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1601493150))
                        goto(Label_1604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1313)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1181)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-2063713313))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(801843641))
                            goto(Label_0749)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(713825982))
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(858592100))
                            goto(Label_0423)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1593835135))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E6 = xor:int(ldc:int(24576), ldc:int(24577))
                                goto(Label_1181)
                            }
                        }
                    }
                    
                    Label_1039:
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-2105722233))
                        goto(Label_1604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0908)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0749)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0423)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1342525907))
                            loopcontinue()
                        }
                        
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-84155299))
                        var_11_E6 = and:int(ldc:int(-19493), ldc:int(19492))
                    }
                    
                    Label_1181:
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-660546289))
                        goto(Label_1604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1876641324))
                        goto(Label_1447)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_1039)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1469382397))
                            goto(Label_0908)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0749)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1311553011))
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1917024104))
                            goto(Label_0423)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-130027937))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E6:int, ldc:int(0))) {
                                goto(Label_1447)
                            }
                        }
                    }
                    
                    Label_1313:
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-855859021))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1929103988))
                            goto(Label_1181)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_1039)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0908)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0749)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1705311332))
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(603731223))
                            goto(Label_0423)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-866388493))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_110:double, var_5_7D:int, var_16_114:int)
                            goto(Label_1593)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1447:
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1856711605))
                        goto(Label_1313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1305618672))
                        goto(Label_1181)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1452852526))
                        goto(Label_1039)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-701813585))
                        goto(Label_0908)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0749)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(167287541))
                        goto(Label_0588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(134217728)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-44127141))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_110:double, ldc:double(0.0))
                    Label_1593:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6AD = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E6:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1604:
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1413779130))
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-2108287558))
                        goto(Label_1313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1181)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1039)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0908)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0749)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0423)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(2046471389))
                        var_17_6AD = add:int(var_16_114:int, xor:int(ldc:int(-31744), ldc:int(-31743)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-589632037))
                
                if (cmple:boolean(var_5_7D = var_17_6AD:int, sub:int(var_6_84:int, and:int(ldc:int(24577), ldc:int(5959))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1434222765))
            goto(Label_0106)
        }
    }
}
