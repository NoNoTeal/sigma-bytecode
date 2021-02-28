public class \u51b2\u6fb0\ufcaf\u61a4\u0800.\u71f1\uae5d\ud158\u3d64\u3dd3\u647c {
    public void \u71f1\uae5d\ud158\u3d64\u3dd3\u647c(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u51fa\u6ec6\u3e75\ud523\u8aa5\ubefe p0) {
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
            putfield:\u51fa\u6ec6\u3e75\ud523\u8aa5\ubefe(\u71f1\uae5d\ud158\u3d64\u3dd3\u647c::\uff55\ud51e\uae87\u3711\u5f50\u72f1, this:\u71f1\uae5d\ud158\u3d64\u3dd3\u647c, p0:\u51fa\u6ec6\u3e75\ud523\u8aa5\ubefe)
            invokespecial:\u5d20\u6bb9\ub113\u983f\u47c2\u718f(\u5d20\u6bb9\ub113\u983f\u47c2\u718f::<init>, this:\u71f1\uae5d\ud158\u3d64\u3dd3\u647c)
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
    
    private void lambda$\u7bad\u51b2\u88c5\u34df\uc2e8\u5245$0(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p0) {
        var_5_85 : int
        
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
        var_5_85 = invokevirtual:int(\u6198\uceb8\ud12e\u839e\u071d\ub6ab::\uff55\ubefe\uc2e8\u6bb9\u59ec\u3d4b, invokevirtual:\u6198\uceb8\ud12e\u839e\u071d\ub6ab(\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd::\ub7dc\u983f\u69d9\uc3e3\u527a\u8413, invokestatic:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd(\u51fa\u6ec6\u3e75\ud523\u8aa5\ubefe::\u3711\uc9f6\uc29a\ud36e\ub113\u8753, getfield:\u51fa\u6ec6\u3e75\ud523\u8aa5\ubefe(\u71f1\uae5d\ud158\u3d64\u3dd3\u647c::\uff55\ud51e\uae87\u3711\u5f50\u72f1, this:\u71f1\uae5d\ud158\u3d64\u3dd3\u647c))), invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u120d\u51b2\u071d\u071d\u5140\u0800, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), and:int(ldc:int(-20411), ldc:int(17202))))))
        
        if (cmpne:boolean(var_5_85:int, ldc:int(-1))) {
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6435\ub1b9\u88c5\u4c04\u72f1\u8df4, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), and:int(ldc:int(-30975), ldc:int(10438)), invokestatic:Integer(Integer::valueOf, var_5_85:int))
            return:void()
        }
        
        invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u4ab3\u7043\ud523\ub1b9\ub83f\u760c, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)
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
        var_3_5FE : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_609 : int
        
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
        var_3_5FE = and:int(ldc:int(1192082052), ldc:int(1440676770))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u71f1\uae5d\ud158\u3d64\u3dd3\u647c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1)), ldc:int(0))) {
            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1532512425))
        }
        else {
            var_3_5FE = and:int(var_3_5FE:int, ldc:int(1073527708))
            var_5_85 = and:int(ldc:int(6567), ldc:int(-8104))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(15685), ldc:int(-15686)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5FE:int, ldc:int(82820076))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(1025), ldc:int(139)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(5445), ldc:int(2601)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5FE = and:int(var_3_D2:int, ldc:int(-16793958))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(-31744), ldc:int(-31743)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1318)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1806192213))
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1133934194))
                    }
                    else {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1175239663))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1099371553))
                        goto(Label_1421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1318)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-2070009663))
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1156815907))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1790507150))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(136102845))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1107707161))
                            var_11_E3 = and:int(ldc:int(-7385), ldc:int(6296))
                            goto(Label_1410)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-492036053))
                        goto(Label_1318)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-2080211550))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-121632039))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(2077987970))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-456037190))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(685039442))
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-974323726))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1264507085))
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1318)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(603306601))
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(590165306))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-341802911))
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(114147291))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-683016884))
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1318)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1401609372))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1015088911))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(1103375853))
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1247167870))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(6149), ldc:int(6148))
                                goto(Label_1035)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-355777262))
                        goto(Label_1318)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(1191569842))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(602050157))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1493032253))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-846218578))
                        var_11_E3 = and:int(ldc:int(5931), ldc:int(-6124))
                    }
                    
                    Label_1035:
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-978507738))
                        goto(Label_1421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(721328997))
                        goto(Label_1318)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-712106490))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(1751477289))
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1610088682))
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1824656191))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-2112486614))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(431349168))
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-410404137))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1318)
                            }
                        }
                    }
                    
                    Label_1182:
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(281733827))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_1035)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(522335746))
                            goto(Label_0889)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1635137131))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(972837916))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(1339855907))
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1155316360))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1410)
                    }
                    
                    Label_1318:
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(512)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5FE = and:int(var_3_5FE:int, ldc:int(799801267))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1410:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_609 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1421:
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1151840420))
                        goto(Label_1318)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-684733950))
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1347176874))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1472807006))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-264025465))
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(399359959))
                        var_17_609 = add:int(var_16_111:int, xor:int(ldc:int(26626), ldc:int(26627)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5FE = and:int(var_3_5FE:int, ldc:int(1304166381))
                
                if (cmple:boolean(var_5_85 = var_17_609:int, sub:int(var_6_8C:int, and:int(ldc:int(11667), ldc:int(4097))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(67108864)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
