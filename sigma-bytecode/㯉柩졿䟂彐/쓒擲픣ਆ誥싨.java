public final class \u3bc9\u67e9\uc87f\u47c2\u5f50.\uc4d2\u64f2\ud523\u0a06\u8aa5\uc2e8 {
    public void \uc4d2\u64f2\ud523\u0a06\u8aa5\uc2e8() {
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
            invokespecial:\ube23\ud4fe\ub83f\uff55\u8413\u6fb0(\ube23\ud4fe\ub83f\uff55\u8413\u6fb0::<init>, this:\uc4d2\u64f2\ud523\u0a06\u8aa5\uc2e8)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 \ua562\ub102\ud171\u8d90\ubff1\u9af2(\u47c2\u2dcc\u12cb\ud171\u8c8a.\u120d\u3e75\u97b7\u8cae\u8389\uf995 p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p1) {
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
    
    private static boolean lambda$\u7043\u5db4\u0c95\u7006\uc31c\ub171$0(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
        var_1_5F : int
        var_1_6B : int
        var_3_70 : \u3bd6\u8aa5\uc238\uae5d\u9033
        stack_B8_0 : int [generated]
        
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
        var_1_5F = and:int(ldc:int(-494775662), ldc:int(-1427964453))
        
        if (instanceof:boolean(\u927d\u92ff\u71ae\uafe7\u6bb9.\u3bd6\u8aa5\uc238\uae5d\u9033.class, p0:\ube23\u67d0\u64f2\u839e\u76bc)) {
            var_1_6B = and:int(var_1_5F:int, ldc:int(-1313710405))
            var_3_70 = checkcast:\u3bd6\u8aa5\uc238\uae5d\u9033(\u927d\u92ff\u71ae\uafe7\u6bb9.\u3bd6\u8aa5\uc238\uae5d\u9033.class, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u3bd6\u8aa5\uc238\uae5d\u9033])
            
            if (logicaland:boolean(logicalnot:boolean(invokeinterface:boolean(\u3bd6\u8aa5\uc238\uae5d\u9033::\u12b2\u0c95\u3711\u6bb9\u8aa5\u74b1, var_3_70:\u3bd6\u8aa5\uc238\uae5d\u9033)), invokeinterface:boolean(\u3bd6\u8aa5\uc238\uae5d\u9033::\u7e3f\u67e9\u6c52\ud523\u92ff\u527a, var_3_70:\u3bd6\u8aa5\uc238\uae5d\u9033))) {
                stack_B8_0 = xor:int(ldc:int(-24566), ldc:int(-24565))
            }
            else {
                var_1_6B = and:int(var_1_6B:int, ldc:int(-188271969))
                stack_B8_0 = and:int(ldc:int(-2505), ldc:int(2504))
            }
            
            return:boolean(stack_B8_0:int)
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(18753), ldc:int(-26946)))
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
    
    public void \u9033\u5245\u7c6b\u71ae\ub83f\u3bd6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_654 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_65F : int
        
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
        var_3_654 = and:int(ldc:int(80130439), ldc:int(1175384077))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc4d2\u64f2\ud523\u0a06\u8aa5\uc2e8[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
            var_3_654 = and:int(var_3_654:int, ldc:int(1725032085))
        }
        else {
            var_3_654 = and:int(var_3_654:int, ldc:int(-1078577738))
            var_5_85 = and:int(ldc:int(-5390), ldc:int(5389))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-23783), ldc:int(23780)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_654:int, ldc:int(249035470))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(2643), ldc:int(5249)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(-28384), ldc:int(-28383)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_654 = and:int(var_3_D2:int, ldc:int(-831049243))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(16401), ldc:int(1349)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-568519552))
                        goto(Label_1514)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1347)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1594172531))
                        goto(Label_1201)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(145630005))
                        goto(Label_1084)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(679544222))
                        goto(Label_0923)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-12284464))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1292794831))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0807)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1514)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(145582769))
                        goto(Label_1347)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1201)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1876237694))
                        goto(Label_1084)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0923)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1040136546))
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1069322074))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1570560678))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(1310869541))
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(1150726645))
                        var_11_E3 = and:int(ldc:int(32032), ldc:int(-32163))
                        goto(Label_1503)
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1514)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-342381235))
                        goto(Label_1347)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1201)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1155874852))
                        goto(Label_1084)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0923)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(994899665))
                        goto(Label_0807)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(360070628))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0807)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1615510787))
                        goto(Label_1514)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1347)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1291041208))
                        goto(Label_1201)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1084)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-2063914016))
                        goto(Label_0923)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1218529906))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1276039434))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-208974062))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1502170945))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0807:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(456181326))
                        goto(Label_1514)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1347)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1201)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1084)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1305534584))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-196562948))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1127933130))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(259407463))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(4258), ldc:int(4259))
                                goto(Label_1084)
                            }
                        }
                    }
                    
                    Label_0923:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(4)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1387340932))
                        goto(Label_1514)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1732347052))
                        goto(Label_1347)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1201)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1787315318))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1102847562))
                            goto(Label_0807)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1746682309))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(214842236))
                        var_11_E3 = and:int(ldc:int(-24435), ldc:int(24178))
                    }
                    
                    Label_1084:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1514)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1959985001))
                        goto(Label_1347)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(335013994))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0923)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0807)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(160928344))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(749330452))
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(1204190301))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1347)
                            }
                        }
                    }
                    
                    Label_1201:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1514)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(4)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1727096282))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(1760100072))
                            goto(Label_1084)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1112979251))
                            goto(Label_0923)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-775725774))
                            goto(Label_0807)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(600659826))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-111150695))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1259391620))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1503)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1347:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1514)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(4)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(64573262))
                        goto(Label_1201)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-2018191896))
                        goto(Label_1084)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1741857887))
                        goto(Label_0923)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1227458281))
                        goto(Label_0807)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-735837779))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1019823748))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-451620113))
                        loopcontinue()
                    }
                    
                    var_3_654 = and:int(var_3_654:int, ldc:int(-591511700))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1503:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_65F = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1514:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1347)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1110803288))
                        goto(Label_1201)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-311039412))
                        goto(Label_1084)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0923)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(4)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1050181088))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1804125771))
                        var_17_65F = add:int(var_16_111:int, and:int(ldc:int(11), ldc:int(26501)))
                        looporswitchbreak()
                    }
                    
                    var_3_654 = and:int(var_3_654:int, ldc:int(-1500770727))
                }
                
                var_3_654 = and:int(var_3_654:int, ldc:int(1045870836))
                
                if (cmple:boolean(var_5_85 = var_17_65F:int, sub:int(var_6_8C:int, and:int(ldc:int(801), ldc:int(12317))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
