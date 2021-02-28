public class \u927d\u92ff\u71ae\uafe7\u6bb9.\u4c2b\u9af2\u9033\u718f\u6435\uc31c {
    public void \u4c2b\u9af2\u9033\u718f\u6435\uc31c(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0) {
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
            invokespecial:\ud4fe\u647c\ucfaf\u839e\u67d0\u7bad(\ud4fe\u647c\ucfaf\u839e\u67d0\u7bad::<init>, this:\u4c2b\u9af2\u9033\u718f\u6435\uc31c)
            putfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u4c2b\u9af2\u9033\u718f\u6435\uc31c::\uc3e3\uc229\uc3e3\ud158\ubded\ud171, this:\u4c2b\u9af2\u9033\u718f\u6435\uc31c, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc229\u7043\u446c\u0a06\u6bb9\u759a(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, java.util.Random p1) {
        var_3_5F : int
        stack_87_0 : int [generated]
        
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
            var_3_5F = and:int(ldc:int(-1403427621), ldc:int(-1109488465))
            
            if (cmpne:boolean(p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u4c2b\u9af2\u9033\u718f\u6435\uc31c::\uc3e3\uc229\uc3e3\ud158\ubded\ud171, this:\u4c2b\u9af2\u9033\u718f\u6435\uc31c))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(1339583835))
                stack_87_0 = and:int(ldc:int(6351), ldc:int(-6352))
            }
            else {
                stack_87_0 = xor:int(ldc:int(8704), ldc:int(8705))
            }
            
            return:boolean(stack_87_0:int)
        }
        
        goto(Label_0006)
    }
    
    public \u3504\ufe34\u600f\u6b0d\u69d9.\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6<?> \u51b2\u5654\u67e9\u960f\u8389\ud171() {
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
            return:\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6<?>(getstatic:\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6<\u4c2b\u9af2\u9033\u718f\u6435\uc31c>(\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6::\ua3b4\u446c\u6fb0\ube23\u6435\u99f7))
        }
        
        goto(Label_0006)
    }
    
    private static \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d lambda$\u36d3\ub8be\ub7dc\u836c\u6b5f\u4c2b$0(\u927d\u92ff\u71ae\uafe7\u6bb9.\u4c2b\u9af2\u9033\u718f\u6435\uc31c p0) {
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
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u4c2b\u9af2\u9033\u718f\u6435\uc31c::\uc3e3\uc229\uc3e3\ud158\ubded\ud171, p0:\u4c2b\u9af2\u9033\u718f\u6435\uc31c))
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
    
    public void \u960f\u8709\u3bd6\u64ab\uceb8\ud7e8(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_607 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_612 : int
        
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
        var_3_607 = and:int(ldc:int(-570545410), ldc:int(-1212154115))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4c2b\u9af2\u9033\u718f\u6435\uc31c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(64)), ldc:int(0))) {
            var_3_607 = and:int(var_3_607:int, ldc:int(-571167265))
            var_5_7D = and:int(ldc:int(18447), ldc:int(-18544))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(9745), ldc:int(-9746)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_607:int, ldc:int(-1378359330))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(80), ldc:int(81)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(6180), ldc:int(6181)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_607 = and:int(var_3_CA:int, ldc:int(-757507))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(281), ldc:int(280)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1455)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1465258216))
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1342537937))
                        goto(Label_0914)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0795)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0663)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(1)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-2079069990))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(64)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-669244424))
                    }
                    else {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-408979236))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0795)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1455)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(35887057))
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0914)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-981718366))
                        goto(Label_0795)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(2076609093))
                        goto(Label_0663)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-2078419543))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-1778964514))
                            var_11_DB = and:int(ldc:int(-24271), ldc:int(7756))
                            goto(Label_1444)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1455)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(1)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1679497193))
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(857671571))
                        goto(Label_0914)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0795)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1680747754))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(1477796158))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(450945688))
                            loopcontinue()
                        }
                        
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1076054306))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0795)
                        }
                    }
                    
                    Label_0663:
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1455)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1356401429))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-291480471))
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0914)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(128)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(1830386866))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-545807303))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(64)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(882460781))
                            loopcontinue()
                        }
                        
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1476581667))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0795:
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1826249098))
                        goto(Label_1455)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-61214066))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-1356212129))
                            goto(Label_0663)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(64)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(1649727596))
                            loopcontinue()
                        }
                        
                        var_3_607 = and:int(var_3_607:int, ldc:int(-134923298))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(-28654), ldc:int(-28653))
                                goto(Label_1085)
                            }
                        }
                    }
                    
                    Label_0914:
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(64)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-930131819))
                        goto(Label_1455)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(2100777066))
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(859106331))
                            goto(Label_0795)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(4)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(1249757613))
                            goto(Label_0663)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(1)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-886757723))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(49764510))
                            loopcontinue()
                        }
                        
                        var_3_607 = and:int(var_3_607:int, ldc:int(-172558850))
                        var_11_DB = and:int(ldc:int(-707), ldc:int(706))
                    }
                    
                    Label_1085:
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(1)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-511014224))
                        goto(Label_1455)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(1)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(155548245))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0914)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(64)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-265351267))
                            goto(Label_0795)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0663)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-1539823908))
                            loopcontinue()
                        }
                        
                        var_3_607 = and:int(var_3_607:int, ldc:int(-2049021186))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1325)
                            }
                        }
                    }
                    
                    Label_1202:
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1455)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1514365759))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_1085)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0914)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0795)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(562338953))
                            goto(Label_0663)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(631222285))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-1112082177))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1444)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1325:
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1455)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(4)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-167620356))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(128)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(590515564))
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0914)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0795)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0663)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1095649707))
                        loopcontinue()
                    }
                    
                    var_3_607 = and:int(var_3_607:int, ldc:int(-575329059))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1444:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_612 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1455:
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0914)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0795)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(128)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1642326195))
                        goto(Label_0663)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-270586883))
                        var_17_612 = add:int(var_16_109:int, and:int(ldc:int(28691), ldc:int(1225)))
                        looporswitchbreak()
                    }
                    
                    var_3_607 = and:int(var_3_607:int, ldc:int(-1237191632))
                }
                
                var_3_607 = and:int(var_3_607:int, ldc:int(-1913290785))
                
                if (cmple:boolean(var_5_7D = var_17_612:int, sub:int(var_6_84:int, and:int(ldc:int(2113), ldc:int(25217))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(16777216)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
