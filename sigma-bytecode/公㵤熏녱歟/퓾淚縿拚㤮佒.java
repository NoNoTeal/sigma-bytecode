public final class \u516c\u3d64\u718f\ub171\u6b5f.\ud4fe\uf94d\u7e3f\u62da\u392e\u4f52 {
    public void \ud4fe\uf94d\u7e3f\u62da\u392e\u4f52() {
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
            invokespecial:\u5d20\u6bb9\ub113\u983f\u47c2\u718f(\u5d20\u6bb9\ub113\u983f\u47c2\u718f::<init>, this:\ud4fe\uf94d\u7e3f\u62da\u392e\u4f52)
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
    
    private static void lambda$\u6bb9\u3d4b\u183a\uc238\u4f4a\u600f$0(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p0) {
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
            
            if (cmpne:boolean(invokevirtual:short(\u8308\ub7dc\u446c\u40a9\u8753\u64f2::\u7d52\u7e3f\u7873\ud36e\u92ff\ua068, checkcast:\u8308\ub7dc\u446c\u40a9\u8753\u64f2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u8308\ub7dc\u446c\u40a9\u8753\u64f2.class, invokevirtual:\u8308\ub7dc\u446c\u40a9\u8753\u64f2(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u4d85\u71f1\u6435\u1833\u1187\u6435, invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4), ldc:Class<\u8308\ub7dc\u446c\u40a9\u8753\u64f2>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u8308\ub7dc\u446c\u40a9\u8753\u64f2.class)))), ldc:short(-1))) {
                invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u4ab3\u7043\ud523\ub1b9\ub83f\u760c, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)
            }
            
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
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
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
        var_3_61D = and:int(ldc:int(1173182687), ldc:int(-314603113))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ud4fe\uf94d\u7e3f\u62da\u392e\u4f52[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_61D = and:int(var_3_61D:int, ldc:int(1288216182))
        }
        else {
            var_3_61D = and:int(var_3_61D:int, ldc:int(-13689259))
            var_5_85 = and:int(ldc:int(16569), ldc:int(-20922))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(9567), ldc:int(-13696)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_61D:int, ldc:int(1462706045))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(768), ldc:int(769)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(17160), ldc:int(17161)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_61D = and:int(var_3_DA:int, ldc:int(1844297589))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(1057), ldc:int(18825)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1028028934))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-510901004))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1341403957))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-93186445))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-12164098))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-816893450))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-108698508))
                    }
                    else {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-181568673))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0421:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1471828780))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1890849501))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1161924664))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-578835426))
                            var_11_EB = and:int(ldc:int(16522), ldc:int(-16523))
                            goto(Label_1431)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0565:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-564009266))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(808385470))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1811822279))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-848302539))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(703136311))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-2110443856))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1532547644))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-473047516))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-41956588))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1889621606))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-111218524))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1499704129))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1624197465))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1219226034))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1772393943))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(2147466199))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(4738), ldc:int(4739))
                                goto(Label_1043)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1041648326))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1177731560))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1710198782))
                        var_11_EB = and:int(ldc:int(-16820), ldc:int(16562))
                    }
                    
                    Label_1043:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(333272361))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1171188350))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1136734621))
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1172576367))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1736309366))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1300)
                            }
                        }
                    }
                    
                    Label_1154:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-2145777233))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-371738681))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-961662762))
                            goto(Label_1043)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1750092254))
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1636744045))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1846521487))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-824737335))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1342008989))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1431)
                    }
                    
                    Label_1300:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-124799787))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-240690277))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-577176422))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1842314318))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(2096702931))
                        goto(Label_0421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_61D = and:int(var_3_61D:int, ldc:int(-441615458))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1431:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_628 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1442:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(82312132))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1885265553))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1150844599))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-2000988231))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-838303373))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-152831603))
                        goto(Label_0421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-578955012))
                        var_17_628 = add:int(var_16_119:int, and:int(ldc:int(73), ldc:int(15137)))
                        looporswitchbreak()
                    }
                    
                    var_3_61D = and:int(var_3_61D:int, ldc:int(-1154968757))
                }
                
                var_3_61D = and:int(var_3_61D:int, ldc:int(1878984797))
                
                if (cmple:boolean(var_5_85 = var_17_628:int, sub:int(var_6_8C:int, and:int(ldc:int(16989), ldc:int(387))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
            var_3_61D = and:int(var_3_61D:int, ldc:int(2139159792))
            goto(Label_0106)
        }
    }
}
