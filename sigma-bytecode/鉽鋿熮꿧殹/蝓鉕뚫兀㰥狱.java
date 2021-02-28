public class \u927d\u92ff\u71ae\uafe7\u6bb9.\u8753\u9255\ub6ab\u5140\u3c25\u72f1 {
    public void \u8753\u9255\ub6ab\u5140\u3c25\u72f1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u51fa\u6ec6\u3e75\ud523\u8aa5\ubefe p0, int p1, int p2) {
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
            putfield:\u51fa\u6ec6\u3e75\ud523\u8aa5\ubefe(\u8753\u9255\ub6ab\u5140\u3c25\u72f1::\u99f7\u51b2\uae87\u6d99\u88c5\u9255, this:\u8753\u9255\ub6ab\u5140\u3c25\u72f1, p0:\u51fa\u6ec6\u3e75\ud523\u8aa5\ubefe)
            putfield:int(\u8753\u9255\ub6ab\u5140\u3c25\u72f1::\ua3b4\u7c6b\ud4fe\u71ae\u5f50\u71f1, this:\u8753\u9255\ub6ab\u5140\u3c25\u72f1, p1:int)
            putfield:int(\u8753\u9255\ub6ab\u5140\u3c25\u72f1::\u98a4\u7d52\uae87\u9033\ub19c\u6c52, this:\u8753\u9255\ub6ab\u5140\u3c25\u72f1, p2:int)
            invokespecial:\u5d20\u6bb9\ub113\u983f\u47c2\u718f(\u5d20\u6bb9\ub113\u983f\u47c2\u718f::<init>, this:\u8753\u9255\ub6ab\u5140\u3c25\u72f1)
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
    
    private void lambda$\u52d3\uc2bd\u156b\uc29a\u97e6\u5654$0(int p0, int p1, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p2) {
        var_4_61 : int
        var_6_77 : int
        var_7_8D : int
        
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
            var_4_61 = and:int(ldc:int(508564250), ldc:int(2122186286))
            var_6_77 = invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u120d\u51b2\u071d\u071d\u5140\u0800, p2:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u6198\u4975\ub83f\ub7dc\u3d64\u5140), and:int(ldc:int(659), ldc:int(-6804)))))
            var_7_8D = invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u120d\u51b2\u071d\u071d\u5140\u0800, p2:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u6198\u4975\ub83f\ub7dc\u3d64\u5140), and:int(ldc:int(129), ldc:int(19009)))))
            
            if (cmpne:boolean(var_6_77:int, p0:int)) {
                var_4_61 = and:int(var_4_61:int, ldc:int(-36511774))
                
                if (cmpeq:boolean(var_6_77:int, p1:int)) {
                    invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6435\ub1b9\u88c5\u4c04\u72f1\u8df4, p2:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u6198\u4975\ub83f\ub7dc\u3d64\u5140), and:int(ldc:int(133), ldc:int(4131)), invokestatic:Integer(Integer::valueOf, invokevirtual:int(\u6198\uceb8\ud12e\u839e\u071d\ub6ab::\u647c\u97b7\uf995\u67e9\u873d\u5f50, invokevirtual:\u6198\uceb8\ud12e\u839e\u071d\ub6ab(\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd::\ub7dc\u983f\u69d9\uc3e3\u527a\u8413, invokestatic:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd(\u51fa\u6ec6\u3e75\ud523\u8aa5\ubefe::\u3711\uc9f6\uc29a\ud36e\ub113\u8753, getfield:\u51fa\u6ec6\u3e75\ud523\u8aa5\ubefe(\u8753\u9255\ub6ab\u5140\u3c25\u72f1::\u99f7\u51b2\uae87\u6d99\u88c5\u9255, this:\u8753\u9255\ub6ab\u5140\u3c25\u72f1))), var_7_8D:int)))
                }
            }
            else {
                invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6435\ub1b9\u88c5\u4c04\u72f1\u8df4, p2:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u6198\u4975\ub83f\ub7dc\u3d64\u5140), and:int(ldc:int(387), ldc:int(6769)), invokestatic:Integer(Integer::valueOf, invokevirtual:int(\u6198\uceb8\ud12e\u839e\u071d\ub6ab::\ub113\u7ce1\ua6bd\u3bd6\u71f1\u7bad, invokevirtual:\u6198\uceb8\ud12e\u839e\u071d\ub6ab(\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd::\ub7dc\u983f\u69d9\uc3e3\u527a\u8413, invokestatic:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd(\u51fa\u6ec6\u3e75\ud523\u8aa5\ubefe::\u3711\uc9f6\uc29a\ud36e\ub113\u8753, getfield:\u51fa\u6ec6\u3e75\ud523\u8aa5\ubefe(\u8753\u9255\ub6ab\u5140\u3c25\u72f1::\u99f7\u51b2\uae87\u6d99\u88c5\u9255, this:\u8753\u9255\ub6ab\u5140\u3c25\u72f1))), var_7_8D:int)))
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
        var_3_61C : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_627 : int
        
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
        var_3_61C = and:int(ldc:int(-674499786), ldc:int(-1610811093))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8753\u9255\ub6ab\u5140\u3c25\u72f1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(2048)), ldc:int(0))) {
            var_3_61C = and:int(var_3_61C:int, ldc:int(-1880361693))
            var_5_7D = and:int(ldc:int(-23916), ldc:int(23811))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(5441), ldc:int(-5474)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_61C:int, ldc:int(-1479738407))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(7193), ldc:int(24577)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(12387), ldc:int(3329)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_61C = and:int(var_3_D2:int, ldc:int(-2083735296))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(16929), ldc:int(16928)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1768286662))
                        goto(Label_1460)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1312)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(2050894461))
                        goto(Label_1203)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1756593755))
                        goto(Label_1069)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-254715074))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1706108728))
                    }
                    else {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-604045453))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1723633410))
                        goto(Label_1460)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-2022195520))
                        goto(Label_1312)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1203)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1664765198))
                        goto(Label_1069)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(527337793))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1908786501))
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1765400272))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(443624142))
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-673336882))
                        var_11_E3 = and:int(ldc:int(8652), ldc:int(-8654))
                        goto(Label_1449)
                    }
                    
                    Label_0573:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1460)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1808285226))
                        goto(Label_1312)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1203)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-377250316))
                        goto(Label_1069)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-662961564))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1749347577))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(-630479841))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1009861316))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0692:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1460)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(26917651))
                        goto(Label_1312)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(438919341))
                        goto(Label_1203)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1298615661))
                        goto(Label_1069)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(183592195))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-873873581))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1460)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1312)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1854602799))
                        goto(Label_1203)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1609244775))
                        goto(Label_1069)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1855189742))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(169815397))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1077021202))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(10905), ldc:int(71))
                                goto(Label_1069)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1460)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(519000402))
                        goto(Label_1312)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-996350489))
                        goto(Label_1203)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1646600746))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(1756753005))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-738265156))
                        var_11_E3 = and:int(ldc:int(-10669), ldc:int(10660))
                    }
                    
                    Label_1069:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1460)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-952472369))
                        goto(Label_1312)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(108822551))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(-895198309))
                            goto(Label_0921)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(133089832))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(1886058507))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(-1509213120))
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1613120699))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1312)
                            }
                        }
                    }
                    
                    Label_1203:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1460)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1569710335))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(8)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(-428900929))
                            goto(Label_1069)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(-204932853))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1449)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1312:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1146701826))
                        goto(Label_1460)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1203)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(608079958))
                        goto(Label_1069)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(949460281))
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(1668756693))
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-871746393))
                        loopcontinue()
                    }
                    
                    var_3_61C = and:int(var_3_61C:int, ldc:int(-1208093438))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1449:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_627 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1460:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(15697021))
                        goto(Label_1312)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1733680125))
                        goto(Label_1203)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1069)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1204705253))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-271664301))
                        var_17_627 = add:int(var_16_111:int, and:int(ldc:int(16529), ldc:int(8707)))
                        looporswitchbreak()
                    }
                    
                    var_3_61C = and:int(var_3_61C:int, ldc:int(1525899421))
                }
                
                var_3_61C = and:int(var_3_61C:int, ldc:int(-1748307459))
                
                if (cmple:boolean(var_5_7D = var_17_627:int, sub:int(var_6_84:int, and:int(ldc:int(18563), ldc:int(1577))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2048)), ldc:int(0))) {
            var_3_61C = and:int(var_3_61C:int, ldc:int(640040678))
            goto(Label_0106)
        }
    }
}
