public class \u3504\ufe34\u600f\u6b0d\u69d9.\u927d\ud171\u7873\u3d4b\uf9c5\uc4d2 {
    public void \u927d\ud171\u7873\u3d4b\uf9c5\uc4d2(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0) {
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
            invokespecial:Object(Object::<init>, this:\u927d\ud171\u7873\u3d4b\uf9c5\uc4d2)
            putfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u927d\ud171\u7873\u3d4b\uf9c5\uc4d2::\u6c52\ua068\ud4fe\ud36e\uc229\u8389, this:\u927d\ud171\u7873\u3d4b\uf9c5\uc4d2, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d lambda$\u4cd9\ubff1\u6b0d\u3e75\u2dcc\uc238$0(\u3504\ufe34\u600f\u6b0d\u69d9.\u927d\ud171\u7873\u3d4b\uf9c5\uc4d2 p0) {
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
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u927d\ud171\u7873\u3d4b\uf9c5\uc4d2::\u6c52\ua068\ud4fe\ud36e\uc229\u8389, p0:\u927d\ud171\u7873\u3d4b\uf9c5\uc4d2))
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
    
    public void \u156b\uceb8\u16f6\u5d20\u51fa\u4492(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5FC : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_607 : int
        
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
        var_3_5FC = and:int(ldc:int(-1058870246), ldc:int(-17111909))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u927d\ud171\u7873\u3d4b\uf9c5\uc4d2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2)), ldc:int(0))) {
            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1070597237))
        }
        else {
            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-404032065))
            var_5_85 = and:int(ldc:int(-7610), ldc:int(7577))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(15404), ldc:int(-31789)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5FC:int, ldc:int(-1045236134))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(20773), ldc:int(3091)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(10), ldc:int(11)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5FC = and:int(var_3_D2:int, ldc:int(-773591969))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(-14848), ldc:int(-14847)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1275)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-232885278))
                        goto(Label_1157)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1068)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1605750215))
                        goto(Label_0899)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0800)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1131783262))
                        goto(Label_0686)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-541593606))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0800)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(302778050))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(289952519))
                        goto(Label_1275)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1235007797))
                        goto(Label_1157)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-982131681))
                        goto(Label_1068)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-457372152))
                        goto(Label_0899)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0800)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0686)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1686390548))
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-726995590))
                        var_11_E3 = and:int(ldc:int(-11996), ldc:int(8843))
                        goto(Label_1423)
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1403397262))
                        goto(Label_1275)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-916581275))
                        goto(Label_1157)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(792725909))
                        goto(Label_1068)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-933469801))
                        goto(Label_0899)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1169588867))
                        goto(Label_0800)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1443628955))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1288296438))
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-609553222))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0800)
                        }
                    }
                    
                    Label_0686:
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-2014623811))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-164592132))
                        goto(Label_1275)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1157)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1068)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0899)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1866273603))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-319297730))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0800:
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1547673221))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1275)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1157)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1068)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0686)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1951758123))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-118816898))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(581), ldc:int(273))
                                goto(Label_1068)
                            }
                        }
                    }
                    
                    Label_0899:
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-259689458))
                        goto(Label_1275)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1157)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1603509271))
                            goto(Label_0800)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-205622387))
                            goto(Label_0686)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(2098081726))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-326455468))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1934377116))
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1028980838))
                        var_11_E3 = and:int(ldc:int(-26430), ldc:int(557))
                    }
                    
                    Label_1068:
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1275)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0899)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0800)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0686)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(596087410))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1011941377))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1275)
                            }
                        }
                    }
                    
                    Label_1157:
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1478196864))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_1068)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0899)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0800)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0686)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-145761512))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(231029176))
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-806421314))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1423)
                    }
                    
                    Label_1275:
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1068410178))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1950132447))
                        goto(Label_1157)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(491944167))
                        goto(Label_1068)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0899)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0800)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0686)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(65243441))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(805651521))
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-211361239))
                        loopcontinue()
                    }
                    
                    var_3_5FC = and:int(var_3_5FC:int, ldc:int(-441457057))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1423:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_607 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1434:
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1275)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1157)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-2084204654))
                        goto(Label_1068)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1988535721))
                        goto(Label_0899)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0800)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0686)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1316412891))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-843842210))
                        var_17_607 = add:int(var_16_111:int, xor:int(ldc:int(2076), ldc:int(2077)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5FC = and:int(var_3_5FC:int, ldc:int(-219747010))
                
                if (cmple:boolean(var_5_85 = var_17_607:int, sub:int(var_6_8C:int, xor:int(ldc:int(4124), ldc:int(4125))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
