public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\uafe7\ub83f\u836c\ua61f\ub7dc {
    public void \uafe7\ub83f\u836c\ua61f\ub7dc(\ud36e\u6bb9\u960f\u4c04\u64ab.\uae5d\uc87f\ucfaf\u7330\u983f p0) {
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
    
    public boolean \u62da\u0b8e\u5f50\u718f\u7ce1\ud523() {
        var_1_5F : int
        stack_86_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(802806153), ldc:int(1071513028))
            
            if (cmpne:boolean(invokevirtual:\ub6ab\u4d85\u97e6\ud51e\u983f(\u7d52\u718f\u3776\u6fb0\ub83f::\u647c\ufcaf\ube23\u8bb0\u4c04\u8c8a, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uafe7\ub83f\u836c\ua61f\ub7dc::\uc2e8\ub7dc\u5f50\u120d\uc3e3\u51b2, this:\uafe7\ub83f\u836c\ua61f\ub7dc)), aconstnull:\ub6ab\u4d85\u97e6\ud51e\u983f())) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(801754033))
                stack_86_0 = invokespecial:boolean[expected:int](\u8709\ud12e\u7330\uc246\ud171<T>::\u62da\u0b8e\u5f50\u718f\u7ce1\ud523, this:\uafe7\ub83f\u836c\ua61f\ub7dc[expected:\u8709\ud12e\u7330\uc246\ud171<\ube23\u67d0\u64f2\u839e\u76bc>])
            }
            else {
                stack_86_0 = and:int(ldc:int(2458), ldc:int(-3487))
            }
            
            return:boolean(stack_86_0:int)
        }
        
        goto(Label_0006)
    }
    
    public \u3504\ufe34\u600f\u6b0d\u69d9.\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7 \uc3e3\ua6bd\ud36e\uc7fe\u88c5\uc2bd(double p0) {
        var_3_A1 : int
        var_5_6A : \u760c\u4975\u4179\uc246\u8640\u64f2
        stack_E3_0 : \u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7 [generated]
        
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
        var_3_A1 = and:int(ldc:int(1035283486), ldc:int(-72321316))
        var_5_6A = invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\uae5d\uc87f\ucfaf\u7330\u983f::\u47c2\u5140\u6c52\u76bc\u62da\ub1b9, checkcast:\uae5d\uc87f\ucfaf\u7330\u983f(\ud36e\u6bb9\u960f\u4c04\u64ab.\uae5d\uc87f\ucfaf\u7330\u983f.class, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\uae5d\uc87f\ucfaf\u7330\u983f](\uafe7\ub83f\u836c\ua61f\ub7dc::\uc2e8\ub7dc\u5f50\u120d\uc3e3\u51b2, this:\uafe7\ub83f\u836c\ua61f\ub7dc)))
        
        if (cmpne:boolean(invokevirtual:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uc84e\ub1b9\uc2e8\ud4fe\u3e2a\u3d4b, var_5_6A:\u760c\u4975\u4179\uc246\u8640\u64f2), getstatic:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u6c52\u156b\u4179\u5654\uceb8\u9af2::\ud217\u4c2b\uc238\uc84e\u392e\uae5d))) {
            do {
                if (cmpeq:boolean(and:int(var_3_A1:int, ldc:int(16)), ldc:int(0))) {
                    var_3_A1 = and:int(var_3_A1:int, ldc:int(890288815))
                }
                else {
                    var_3_A1 = and:int(var_3_A1:int, ldc:int(1941480696))
                    
                    if (cmpne:boolean(invokevirtual:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uc84e\ub1b9\uc2e8\ud4fe\u3e2a\u3d4b, var_5_6A:\u760c\u4975\u4179\uc246\u8640\u64f2), getstatic:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u6c52\u156b\u4179\u5654\uceb8\u9af2::\u6d69\ud523\ud51e\ube23\u7330\uc7fe))) {
                        loopcontinue()
                    }
                    
                    stack_E3_0 = invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub19c\u946b\u718f\u6cfe\u4bc8\u5654, invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7d52\u718f\u3776\u6fb0\ub83f::\ub113\ub1b9\u9937\u1833\u64f2\u3504, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uafe7\ub83f\u836c\ua61f\ub7dc::\uc2e8\ub7dc\u5f50\u120d\uc3e3\u51b2, this:\uafe7\ub83f\u836c\ua61f\ub7dc)), p0:double, p0:double, ldc:double(4.0))
                    return:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(stack_E3_0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7)
                }
            } while (cmpne:boolean(and:int(var_3_A1:int, ldc:int(1073741824)), ldc:int(0)))
            
            var_3_A1 = and:int(var_3_A1:int, ldc:int(-1147355269))
            stack_E3_0 = invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub19c\u946b\u718f\u6cfe\u4bc8\u5654, invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7d52\u718f\u3776\u6fb0\ub83f::\ub113\ub1b9\u9937\u1833\u64f2\u3504, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uafe7\ub83f\u836c\ua61f\ub7dc::\uc2e8\ub7dc\u5f50\u120d\uc3e3\u51b2, this:\uafe7\ub83f\u836c\ua61f\ub7dc)), p0:double, ldc:double(4.0), p0:double)
            return:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(stack_E3_0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7)
        }
        
        return:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub19c\u946b\u718f\u6cfe\u4bc8\u5654, invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7d52\u718f\u3776\u6fb0\ub83f::\ub113\ub1b9\u9937\u1833\u64f2\u3504, getfield:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uafe7\ub83f\u836c\ua61f\ub7dc::\uc2e8\ub7dc\u5f50\u120d\uc3e3\u51b2, this:\uafe7\ub83f\u836c\ua61f\ub7dc)), ldc:double(4.0), p0:double, p0:double))
    }
    
    private static boolean lambda$\u0a06\u98a4\u47c2\ub8be\ufcaf\uf94d$0(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
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
            return:boolean(instanceof:boolean(\u47c2\u2dcc\u12cb\ud171\u8c8a.\u836c\u6ec6\u9937\ub70c\u3504.class, p0:\ube23\u67d0\u64f2\u839e\u76bc))
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
    
    public void \ub8be\u4c2b\u071d\ub70c\ubded\u6d99(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61E : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_629 : int
        
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
        var_3_61E = and:int(ldc:int(-1226675624), ldc:int(-1427751981))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uafe7\ub83f\u836c\ua61f\ub7dc[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_61E = and:int(var_3_61E:int, ldc:int(-500961281))
            var_5_7D = and:int(ldc:int(-12748), ldc:int(4419))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-32190), ldc:int(19517)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_61E:int, ldc:int(-81659027))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(193), ldc:int(2319)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(1280), ldc:int(1281)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_61E = and:int(var_3_D2:int, ldc:int(-1283477803))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(16896), ldc:int(16897)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(638553608))
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1925208360))
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(987600027))
                        goto(Label_1187)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1557183045))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(1279333125))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1001113849))
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(782424272))
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-17158442))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-173248310))
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(1729152649))
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1176188774))
                        goto(Label_1187)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(1060247287))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(513560441))
                            loopcontinue()
                        }
                        
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-496156984))
                        var_11_E3 = and:int(ldc:int(16696), ldc:int(-27065))
                        goto(Label_1451)
                    }
                    
                    Label_0573:
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-991830388))
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(25075172))
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-308612000))
                        goto(Label_1187)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-366513562))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1839929633))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-5390597))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0692:
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-856900763))
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1187)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(1292956282))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(4)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(-608838581))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-164758796))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1347045030))
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(414656886))
                        goto(Label_1187)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(1198579711))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(-1550653077))
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(-1240901463))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(128)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(-567131193))
                            loopcontinue()
                        }
                        
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-457872572))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(384), ldc:int(385))
                                goto(Label_1067)
                            }
                        }
                    }
                    
                    Label_0929:
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(1276826036))
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1187)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(64)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(-1264087704))
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(-1242665821))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1078247737))
                        var_11_E3 = and:int(ldc:int(5709), ldc:int(-5710))
                    }
                    
                    Label_1067:
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(787011687))
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(683219220))
                            goto(Label_0929)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(4)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(466876456))
                            goto(Label_0692)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(-1468686532))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(64)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(214941835))
                            loopcontinue()
                        }
                        
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1136677276))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1332)
                            }
                        }
                    }
                    
                    Label_1187:
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(245040511))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(1)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(-790565219))
                            goto(Label_1067)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0929)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(702478235))
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(1365846909))
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(-1877711556))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_61E = and:int(var_3_61E:int, ldc:int(470687010))
                            loopcontinue()
                        }
                        
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-209749172))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1451)
                    }
                    
                    Label_1332:
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(458767201))
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1187)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1060778770))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(1879238293))
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(2048)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_61E = and:int(var_3_61E:int, ldc:int(-416223290))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1451:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_629 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1462:
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(972071460))
                        goto(Label_1187)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1693896254))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1688037399))
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(1569429514))
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_61E = and:int(var_3_61E:int, ldc:int(-1338249396))
                        var_17_629 = add:int(var_16_111:int, and:int(ldc:int(8449), ldc:int(4193)))
                        looporswitchbreak()
                    }
                }
                
                var_3_61E = and:int(var_3_61E:int, ldc:int(-1171144858))
                
                if (cmple:boolean(var_5_7D = var_17_629:int, sub:int(var_6_84:int, and:int(ldc:int(8985), ldc:int(99))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_61E:int, ldc:int(4)), ldc:int(0))) {
            var_3_61E = and:int(var_3_61E:int, ldc:int(912549454))
            goto(Label_0106)
        }
    }
}
