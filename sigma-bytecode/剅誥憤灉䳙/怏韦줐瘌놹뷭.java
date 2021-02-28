public final class \u5245\u8aa5\u61a4\u7049\u4cd9.\u600f\u97e6\uc910\u760c\ub1b9\ubded {
    public void \u600f\u97e6\uc910\u760c\ub1b9\ubded() {
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
            invokespecial:\u5d20\u6bb9\ub113\u983f\u47c2\u718f(\u5d20\u6bb9\ub113\u983f\u47c2\u718f::<init>, this:\u600f\u97e6\uc910\u760c\ub1b9\ubded)
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
    
    private static void lambda$\u36d3\uc4d2\u4179\uc229\ud158\uc229$0(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p0) {
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
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<\ub83f\u6c52\u12cb\u3c25\u3776>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u3bc9\u5fe1\u4ab3\ub70c\u600f\u6fb0), invokestatic:\ub83f\u6c52\u12cb\u3c25\u3776(\u946b\ubf56\u5db4\ub8be\u873d\uc3e3::\u71ae\uceb8\u1187\uc2bd\ubb2b\ufe34, checkcast:String(java.lang.String.class, invokevirtual:String(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u7ce1\uc238\u946b\ubb2b\ua6bd\u12b2, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<String>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u0c95\ube23\u12cb\u839e\ucb79\u56bd)))))
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
        var_3_5F5 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_600 : int
        
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
        var_3_5F5 = and:int(ldc:int(1820702419), ldc:int(1839032939))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u600f\u97e6\uc910\u760c\ub1b9\ubded[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-638024858))
        }
        else {
            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1037379021))
            var_5_85 = and:int(ldc:int(789), ldc:int(-790))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-2927), ldc:int(2410)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5F5:int, ldc:int(1015902179))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(-32635), ldc:int(-32636)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(8836), ldc:int(8837)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5F5 = and:int(var_3_D2:int, ldc:int(998636779))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(16469), ldc:int(9)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-693260783))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(2072756269))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1371650098))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1467171074))
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-528139033))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0525)
                            }
                            
                            goto(Label_0746)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0620)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1775331549))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(812478421))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1260936757))
                        var_11_E3 = and:int(ldc:int(-21598), ldc:int(21592))
                        goto(Label_1407)
                    }
                    
                    Label_0525:
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1166072674))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(984887991))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-305156743))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0746)
                        }
                    }
                    
                    Label_0620:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1053887487))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1730156115))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-932245507))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-451764946))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(203854037))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(932701775))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0746:
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1281963263))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-2116879858))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1258858584))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1749209510))
                            goto(Label_0620)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1675195712))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1528455908))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(645593977))
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(647886317))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(1), ldc:int(19921))
                                goto(Label_1043)
                            }
                        }
                    }
                    
                    Label_0881:
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(268296246))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1498400963))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1925041822))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1156448665))
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1568060387))
                            goto(Label_0620)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(349285155))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1260427155))
                        var_11_E3 = and:int(ldc:int(-28224), ldc:int(20003))
                    }
                    
                    Label_1043:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1500598681))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(546447206))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(642758683))
                            goto(Label_0620)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1492226549))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(781560827))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1276)
                            }
                        }
                    }
                    
                    Label_1154:
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1094891594))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1410609988))
                            goto(Label_1043)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1161393894))
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(979447799))
                            goto(Label_0620)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5F5 = and:int(var_3_5F5:int, ldc:int(2026203737))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1407)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1276:
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1263101401))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-464042765))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(2085059306))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0620)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1315235564))
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-285697538))
                        loopcontinue()
                    }
                    
                    var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1295173141))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1407:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_600 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1418:
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-1331613809))
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1646477770))
                        goto(Label_0620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(1684585879))
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(2060856073))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F5 = and:int(var_3_5F5:int, ldc:int(2143232895))
                        var_17_600 = add:int(var_16_111:int, xor:int(ldc:int(53), ldc:int(52)))
                        looporswitchbreak()
                    }
                    
                    var_3_5F5 = and:int(var_3_5F5:int, ldc:int(-965273733))
                }
                
                var_3_5F5 = and:int(var_3_5F5:int, ldc:int(2061334133))
                
                if (cmple:boolean(var_5_85 = var_17_600:int, sub:int(var_6_8C:int, and:int(ldc:int(117), ldc:int(13825))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5F5:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
