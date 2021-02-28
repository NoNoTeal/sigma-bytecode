public final class \u12b2\u7049\u8df4\uc9f6\uae87.\uae5d\u5bc4\u6b5f\u3a62\u98a4\u494c {
    public void \uae5d\u5bc4\u6b5f\u3a62\u98a4\u494c() {
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
            invokespecial:\u5d20\u6bb9\ub113\u983f\u47c2\u718f(\u5d20\u6bb9\ub113\u983f\u47c2\u718f::<init>, this:\uae5d\u5bc4\u6b5f\u3a62\u98a4\u494c)
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
    
    private static void lambda$\u7d52\ub8be\u6bb9\u67e9\u8df4\u69d9$0(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p0) {
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
            invokevirtual:void(\u8308\ub7dc\u446c\u40a9\u8753\u64f2::\u8350\uc910\u946b\u4d85\u6198\u7c6b, checkcast:\u8308\ub7dc\u446c\u40a9\u8753\u64f2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u8308\ub7dc\u446c\u40a9\u8753\u64f2.class, invokevirtual:\u8308\ub7dc\u446c\u40a9\u8753\u64f2(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u4d85\u71f1\u6435\u1833\u1187\u6435, invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4), ldc:Class<\u8308\ub7dc\u446c\u40a9\u8753\u64f2>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u8308\ub7dc\u446c\u40a9\u8753\u64f2.class))), ldc:short(-1))
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
        var_3_5DD : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5E8 : int
        
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
        var_3_5DD = and:int(ldc:int(1689646393), ldc:int(-255855681))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uae5d\u5bc4\u6b5f\u3a62\u98a4\u494c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1792547334))
        }
        else {
            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1722530111))
            var_5_85 = and:int(ldc:int(-809), ldc:int(808))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(29720), ldc:int(-30233)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5DD:int, ldc:int(2059121209))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(5413), ldc:int(10833)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(-31744), ldc:int(-31743)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5DD = and:int(var_3_D2:int, ldc:int(-88819585))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(17411), ldc:int(17410)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1112987020))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(428328813))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(63337058))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1878505471))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(847482270))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1384285144))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(772650803))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-963537023))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-2008527594))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1143750962))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1911537209))
                            var_11_E3 = and:int(ldc:int(4389), ldc:int(-4902))
                            goto(Label_1407)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(2025963892))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(865686248))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1757473609))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-790713920))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(2129786175))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-361586023))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1791473800))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(321042134))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1540585558))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1154152673))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1090854402))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1710944505))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(2112921425))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1767452448))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-2130617204))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-105791489))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(272), ldc:int(273))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1458606527))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1599366369))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1632679055))
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1039726797))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(13578871))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-17958081))
                        var_11_E3 = and:int(ldc:int(-7707), ldc:int(7704))
                    }
                    
                    Label_1051:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-980298932))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-877786859))
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1962178210))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1856044223))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1284)
                            }
                        }
                    }
                    
                    Label_1154:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-450233436))
                            goto(Label_1051)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-614217863))
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-298842720))
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1584327256))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1064374298))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1958474233))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1407)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1284:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1368990919))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1048852723))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(444059550))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-161057919))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5DD = and:int(var_3_5DD:int, ldc:int(1692971897))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1407:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5E8 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1418:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1157862351))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1279192636))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-173557445))
                        var_17_5E8 = add:int(var_16_111:int, xor:int(ldc:int(1043), ldc:int(1042)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5DD = and:int(var_3_5DD:int, ldc:int(1840561597))
                
                if (cmple:boolean(var_5_85 = var_17_5E8:int, sub:int(var_6_8C:int, xor:int(ldc:int(10384), ldc:int(10385))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8192)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
