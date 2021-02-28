public class \u6435\ub8be\u718f\u6b0d\u67e9.\u8709\u7049\uc2e8\u760c\u59ec\u4975 {
    public void \u8709\u7049\uc2e8\u760c\u59ec\u4975(\u927d\u92ff\u71ae\uafe7\u6bb9.\u416d\ub1b9\u4f52\ub6ab\u76bc\uc910 p0) {
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
            putfield:\u416d\ub1b9\u4f52\ub6ab\u76bc\uc910(\u8709\u7049\uc2e8\u760c\u59ec\u4975::\u3a62\u62da\u718f\u97b7\u99f7\u4d85, this:\u8709\u7049\uc2e8\u760c\u59ec\u4975, p0:\u416d\ub1b9\u4f52\ub6ab\u76bc\uc910)
            invokespecial:\u5d20\u6bb9\ub113\u983f\u47c2\u718f(\u5d20\u6bb9\ub113\u983f\u47c2\u718f::<init>, this:\u8709\u7049\uc2e8\u760c\u59ec\u4975)
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
    
    private void lambda$\u1187\uceb8\ub19c\u71f1\u3a62\u5fe1$0(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p0) {
        var_2_108 : int
        var_4_6D : int
        var_5_71 : int
        var_6_7A : int
        var_7_DD : int
        var_8_EC : int
        var_9_FB : int
        var_10_112 : \u88c5\ua6bd\u4bc8\u5654\u7006\uceb8
        var_11_195 : \u76bc\u156b\u5140\u3504\u416d\ua068
        
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
            var_2_108 = and:int(ldc:int(384249364), ldc:int(-160327684))
            var_4_6D = var_5_71 = invokevirtual(Integer::intValue, checkcast(java.lang.Integer.class, invokevirtual(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p0, getstatic(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1))))
            var_6_7A = and:int(ldc:int(-17630), ldc:int(17621))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_108:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0184)
                }
                
                if (cmpne:boolean(and:int(var_2_108:int, ldc:int(33554432)), ldc:int(0))) {
                    var_2_108 = and:int(var_2_108:int, ldc:int(-1082577665))
                    
                    if (cmplt:boolean(var_6_7A:int, var_4_6D:int)) {
                        var_7_DD = invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u7ce1\uc238\u946b\ubb2b\ua6bd\u12b2, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1))))
                        var_8_EC = invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u7ce1\uc238\u946b\ubb2b\ua6bd\u12b2, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1))))
                        var_9_FB = invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u7ce1\uc238\u946b\ubb2b\ua6bd\u12b2, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1))))
                        
                        if (logicaland:boolean(cmpeq:boolean(var_7_DD:int, ldc:int(8)), cmpne:boolean(invokevirtual:\u5245\ub1b9\ube23\u0b8e\u0c95\u99f7(\u6198\uceb8\ud12e\u839e\u071d\ub6ab::\ubf56\u624e\ud7e8\u8350\u760c\u960f, invokevirtual:\u6198\uceb8\ud12e\u839e\u071d\ub6ab(\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd::\ub7dc\u983f\u69d9\uc3e3\u527a\u8413, invokestatic:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd(\u416d\ub1b9\u4f52\ub6ab\u76bc\uc910::\uf995\u8d98\u600f\u8d98\ub32d\ud4fe, getfield:\u416d\ub1b9\u4f52\ub6ab\u76bc\uc910(\u8709\u7049\uc2e8\u760c\u59ec\u4975::\u3a62\u62da\u718f\u97b7\u99f7\u4d85, this:\u8709\u7049\uc2e8\u760c\u59ec\u4975)))), aconstnull:\u5245\ub1b9\ube23\u0b8e\u0c95\u99f7()))) {
                            var_8_EC = invokevirtual:int(\u5245\ub1b9\ube23\u0b8e\u0c95\u99f7::\uc87f\ub102\ub19c\u8aa5\ucfaf\ubcb0, invokevirtual:\u5245\ub1b9\ube23\u0b8e\u0c95\u99f7(\u6198\uceb8\ud12e\u839e\u071d\ub6ab::\ubf56\u624e\ud7e8\u8350\u760c\u960f, invokevirtual:\u6198\uceb8\ud12e\u839e\u071d\ub6ab(\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd::\ub7dc\u983f\u69d9\uc3e3\u527a\u8413, invokestatic:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd(\u416d\ub1b9\u4f52\ub6ab\u76bc\uc910::\uf995\u8d98\u600f\u8d98\ub32d\ud4fe, getfield:\u416d\ub1b9\u4f52\ub6ab\u76bc\uc910(\u8709\u7049\uc2e8\u760c\u59ec\u4975::\u3a62\u62da\u718f\u97b7\u99f7\u4d85, this:\u8709\u7049\uc2e8\u760c\u59ec\u4975)))), var_8_EC:int)
                            
                            if (cmpeq:boolean(var_8_EC:int, ldc:int(-1))) {
                                inc:int(var_5_71, ldc:int(-1))
                                goto(Label_0435)
                            }
                        }
                        else {
                            var_2_108 = and:int(var_2_108:int, ldc:int(1073575094))
                            var_10_112 = invokevirtual:\u88c5\ua6bd\u4bc8\u5654\u7006\uceb8(\u416d\ub1b9\u4f52\ub6ab\u76bc\uc910::\u71ae\u3bd6\u446c\u8df4\u8413\u836c, getfield:\u416d\ub1b9\u4f52\ub6ab\u76bc\uc910(\u8709\u7049\uc2e8\u760c\u59ec\u4975::\u3a62\u62da\u718f\u97b7\u99f7\u4d85, this:\u8709\u7049\uc2e8\u760c\u59ec\u4975), var_7_DD:int)
                            
                            if (cmpne:boolean(var_10_112:\u88c5\ua6bd\u4bc8\u5654\u7006\uceb8, aconstnull:\u88c5\ua6bd\u4bc8\u5654\u7006\uceb8())) {
                                if (cmpne:boolean(var_11_195 = invokevirtual:\u76bc\u156b\u5140\u3504\u416d\ua068(\u416d\ub1b9\u4f52\ub6ab\u76bc\uc910::\u8d90\ubded\u6435\u8cae\u12cb\uff55, getfield:\u416d\ub1b9\u4f52\ub6ab\u76bc\uc910(\u8709\u7049\uc2e8\u760c\u59ec\u4975::\u3a62\u62da\u718f\u97b7\u99f7\u4d85, this:\u8709\u7049\uc2e8\u760c\u59ec\u4975), var_10_112:\u88c5\ua6bd\u4bc8\u5654\u7006\uceb8), aconstnull:\u76bc\u156b\u5140\u3504\u416d\ua068())) {
                                    var_8_EC = invokeinterface:int(\u76bc\u156b\u5140\u3504\u416d\ua068::\uc84e\u3bd6\u97e6\uc910\u62da\uc246, var_11_195:\u76bc\u156b\u5140\u3504\u416d\ua068, var_8_EC:int)
                                }
                            }
                        }
                        
                        var_2_108 = and:int(var_2_108:int, ldc:int(2012177590))
                        invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), invokestatic:Integer(Integer::valueOf, var_7_DD:int))
                        invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), invokestatic:Integer(Integer::valueOf, var_8_EC:int))
                        invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), invokestatic:Integer(Integer::valueOf, var_9_FB:int))
                        Label_0435:
                        inc:int(var_6_7A, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                Label_0150:
                
                if (cmpeq:boolean(and:int(var_2_108:int, ldc:int(64)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_108:int, ldc:int(16777216)), ldc:int(0))) {
                        var_2_108 = and:int(var_2_108:int, ldc:int(-1769256708))
                        loopcontinue()
                    }
                    
                    var_2_108 = and:int(var_2_108:int, ldc:int(535533079))
                    
                    if (cmpne:boolean(var_5_71:int, var_4_6D:int)) {
                        invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6435\ub1b9\u88c5\u4c04\u72f1\u8df4, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), and:int(ldc:int(-31345), ldc:int(31328)), invokestatic:Integer(Integer::valueOf, var_5_71:int))
                    }
                }
                
                Label_0184:
                
                if (cmpeq:boolean(and:int(var_2_108:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0150)
                }
                
                if (cmpeq:boolean(and:int(var_2_108:int, ldc:int(134217728)), ldc:int(0))) {
                    looporswitchbreak()
                }
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
        var_3_619 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_624 : int
        
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
        var_3_619 = and:int(ldc:int(-507027108), ldc:int(1945586552))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8709\u7049\uc2e8\u760c\u59ec\u4975[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_619 = and:int(var_3_619:int, ldc:int(-1759040244))
        }
        else {
            var_3_619 = and:int(var_3_619:int, ldc:int(-405647489))
            var_5_85 = and:int(ldc:int(18786), ldc:int(-19827))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-25343), ldc:int(16942)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_619:int, ldc:int(-268468389))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(22383), ldc:int(1)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(20643), ldc:int(8193)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_619 = and:int(var_3_D2:int, ldc:int(1842279900))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(9297), ldc:int(4097)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-1987770847))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1335)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-1428169696))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0914)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(32)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(81761945))
                        goto(Label_0806)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(64)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(314590055))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(8)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-654636231))
                    }
                    else {
                        var_3_619 = and:int(var_3_619:int, ldc:int(1945555962))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0806)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-256047727))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(1710075440))
                        goto(Label_1335)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(1443555996))
                        goto(Label_0914)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(342919972))
                        goto(Label_0806)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(-1320095943))
                            loopcontinue()
                        }
                        
                        var_3_619 = and:int(var_3_619:int, ldc:int(-873238146))
                        var_11_E3 = and:int(ldc:int(-35), ldc:int(34))
                        goto(Label_1455)
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(571107056))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1335)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-785747961))
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(1120906129))
                        goto(Label_0914)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0806)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(256)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-1374972099))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(-531866615))
                            loopcontinue()
                        }
                        
                        var_3_619 = and:int(var_3_619:int, ldc:int(-806655523))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0806)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-143973976))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(570555651))
                        goto(Label_1335)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-526300466))
                        goto(Label_0914)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(940605460))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(8)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(1970819991))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_619 = and:int(var_3_619:int, ldc:int(-103134856))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0806:
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(1218287733))
                        goto(Label_1335)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(361113306))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(275996186))
                            loopcontinue()
                        }
                        
                        var_3_619 = and:int(var_3_619:int, ldc:int(-907653255))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(4391), ldc:int(17561))
                                goto(Label_1083)
                            }
                        }
                    }
                    
                    Label_0914:
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-608295193))
                        goto(Label_1335)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(1607924148))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(-416123675))
                            goto(Label_0806)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(1913129837))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(2019131657))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(8)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(-466628578))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_619 = and:int(var_3_619:int, ldc:int(-773128739))
                        var_11_E3 = and:int(ldc:int(-31802), ldc:int(19513))
                    }
                    
                    Label_1083:
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-186272999))
                        goto(Label_1335)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(1901241645))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(-985397989))
                            goto(Label_0914)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0806)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(-1705049960))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(-342003166))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(-1626096991))
                            loopcontinue()
                        }
                        
                        var_3_619 = and:int(var_3_619:int, ldc:int(1172532571))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1335)
                            }
                        }
                    }
                    
                    Label_1217:
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-1657185005))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_1083)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0914)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(256)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(-1329167698))
                            goto(Label_0806)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(-1841399374))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(1173085020))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1455)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1335:
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(8)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-1289551804))
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(662301751))
                        goto(Label_0914)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0806)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(512)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(1519345956))
                        loopcontinue()
                    }
                    
                    var_3_619 = and:int(var_3_619:int, ldc:int(1743155676))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1455:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_624 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1466:
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1335)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(8)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(962135301))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0914)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0806)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-1400322148))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(32)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-876453891))
                        var_17_624 = add:int(var_16_111:int, and:int(ldc:int(7173), ldc:int(24971)))
                        looporswitchbreak()
                    }
                    
                    var_3_619 = and:int(var_3_619:int, ldc:int(295634988))
                }
                
                var_3_619 = and:int(var_3_619:int, ldc:int(-236795046))
                
                if (cmple:boolean(var_5_85 = var_17_624:int, sub:int(var_6_8C:int, and:int(ldc:int(513), ldc:int(9295))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
