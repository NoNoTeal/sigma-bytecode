public class \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u7043\u0a06\u7e3f\u3e2a\u392e {
    public void \u7043\u0a06\u7e3f\u3e2a\u392e(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u3504\u7006\u4c2b\u873d\u4f52 p0) {
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
            invokespecial:Object(Object::<init>, this:\u7043\u0a06\u7e3f\u3e2a\u392e)
            putfield:\u3504\u7006\u4c2b\u873d\u4f52(\u7043\u0a06\u7e3f\u3e2a\u392e::\u62da\u5654\u5f50\u4daf\u416d\u3776, this:\u7043\u0a06\u7e3f\u3e2a\u392e, p0:\u3504\u7006\u4c2b\u873d\u4f52)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u3504\u7006\u4c2b\u873d\u4f52 lambda$\u3776\u9a18\ua562\u4975\u8c8a\ua6bd$0(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\u7043\u0a06\u7e3f\u3e2a\u392e p0) {
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
            return:\u3504\u7006\u4c2b\u873d\u4f52(getfield:\u3504\u7006\u4c2b\u873d\u4f52(\u7043\u0a06\u7e3f\u3e2a\u392e::\u62da\u5654\u5f50\u4daf\u416d\u3776, p0:\u7043\u0a06\u7e3f\u3e2a\u392e))
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
    
    public void \ufcaf\u5d20\u6c52\u392e\u3dd3\u8753(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_643 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_64E : int
        
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
        var_3_643 = and:int(ldc:int(-1381713858), ldc:int(1307049887))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7043\u0a06\u7e3f\u3e2a\u392e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(16)), ldc:int(0))) {
            var_3_643 = and:int(var_3_643:int, ldc:int(-1358843592))
        }
        else {
            var_3_643 = and:int(var_3_643:int, ldc:int(854586204))
            var_5_85 = and:int(ldc:int(-5356), ldc:int(5346))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-3422), ldc:int(3353)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_643:int, ldc:int(717007199))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(34), ldc:int(35)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(4097), ldc:int(25193)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_643 = and:int(var_3_DA:int, ldc:int(-1066468))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(16930), ldc:int(16931)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1471)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1069)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0908)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(1)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-1914491467))
                        goto(Label_0772)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(504206963))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-891452114))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1592924136))
                    }
                    else {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1710554015))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0772)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1471)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-596930587))
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(4)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-1128748156))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1069)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0908)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(1)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-1712970443))
                        goto(Label_0772)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1258228296))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(256)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(-2001498555))
                            loopcontinue()
                        }
                        
                        var_3_643 = and:int(var_3_643:int, ldc:int(783655612))
                        var_11_EB = and:int(ldc:int(25201), ldc:int(-26228))
                        goto(Label_1460)
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1471)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1503753811))
                        goto(Label_1341)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-1583646385))
                        goto(Label_1069)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(4)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(723200234))
                        goto(Label_0908)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(128)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(169355522))
                        goto(Label_0772)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_643 = and:int(var_3_643:int, ldc:int(-1706787))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0772)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-631740775))
                        goto(Label_1471)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1341)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1069)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0908)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(518188907))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_643 = and:int(var_3_643:int, ldc:int(989659103))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0772:
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1471)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(256)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-870689557))
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-1665838817))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1069)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1887275088))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(16)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(-1654083896))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(-1614749117))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(1551222772))
                            loopcontinue()
                        }
                        
                        var_3_643 = and:int(var_3_643:int, ldc:int(1907731132))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(27161), ldc:int(135))
                                goto(Label_1069)
                            }
                        }
                    }
                    
                    Label_0908:
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1471)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(256)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1534915371))
                        goto(Label_1341)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-869830321))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1262917723))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0772)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(-902498255))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(16)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(1716098060))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_643 = and:int(var_3_643:int, ldc:int(-2001345378))
                        var_11_EB = and:int(ldc:int(-21143), ldc:int(20630))
                    }
                    
                    Label_1069:
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1471)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(381754862))
                        goto(Label_1341)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(200410813))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0908)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0772)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(-316946787))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(840609016))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_643 = and:int(var_3_643:int, ldc:int(364162205))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1341)
                            }
                        }
                    }
                    
                    Label_1186:
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1471)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1290989745))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(-997000512))
                            goto(Label_1069)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(16)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(-175157620))
                            goto(Label_0908)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(-2079168085))
                            goto(Label_0772)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(4)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(-1391173849))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(-1607745551))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(1)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(-211852601))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_643 = and:int(var_3_643:int, ldc:int(-1917013346))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1460)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1341:
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1471)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-637512595))
                        goto(Label_1069)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0908)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0772)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(256)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(676350073))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(16)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(201934530))
                        loopcontinue()
                    }
                    
                    var_3_643 = and:int(var_3_643:int, ldc:int(-1079530594))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1460:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_64E = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1471:
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-1016178741))
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1587371745))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1069)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0908)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(4)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1829094493))
                        goto(Label_0772)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(1)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(-1629786294))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1989267337))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_643:int, ldc:int(256)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(970718501))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_643:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_643 = and:int(var_3_643:int, ldc:int(1589485727))
                        var_17_64E = add:int(var_16_119:int, xor:int(ldc:int(25604), ldc:int(25605)))
                        looporswitchbreak()
                    }
                    
                    var_3_643 = and:int(var_3_643:int, ldc:int(-1526409326))
                }
                
                var_3_643 = and:int(var_3_643:int, ldc:int(-1325551361))
                
                if (cmple:boolean(var_5_85 = var_17_64E:int, sub:int(var_6_8C:int, and:int(ldc:int(2067), ldc:int(8197))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_643:int, ldc:int(16384)), ldc:int(0))) {
            var_3_643 = and:int(var_3_643:int, ldc:int(406924176))
            goto(Label_0106)
        }
    }
}
