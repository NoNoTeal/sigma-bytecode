public final class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc229\u960f\u446c\u0c95\u64f2\u4c2b {
    public void \uc229\u960f\u446c\u0c95\u64f2\u4c2b(\u36d3\u9033\u6b0d\u983f\u8d90.\u9af2\ud51e\u836c\u647c\u6ec6\u3dd3 p0) {
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
            putfield:\u9af2\ud51e\u836c\u647c\u6ec6\u3dd3(\uc229\u960f\u446c\u0c95\u64f2\u4c2b::\ufe34\uc229\u7c6b\u5d20\ucef1\u8d90, this:\uc229\u960f\u446c\u0c95\u64f2\u4c2b, p0:\u9af2\ud51e\u836c\u647c\u6ec6\u3dd3)
            invokespecial:\u5d20\u6bb9\ub113\u983f\u47c2\u718f(\u5d20\u6bb9\ub113\u983f\u47c2\u718f::<init>, this:\uc229\u960f\u446c\u0c95\u64f2\u4c2b)
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
    
    private static void lambda$\u4bc8\ub19c\ud12e\ua6bd\u6b0d\u927d$0(\u36d3\u9033\u6b0d\u983f\u8d90.\u9af2\ud51e\u836c\u647c\u6ec6\u3dd3 p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p1) {
        var_4_74 : int
        var_5_80 : List<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>
        var_6_94 : \u59ec\uc29a\uc84e\u12b2\u5db4\u98a4
        
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
            var_4_74 = invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u120d\u51b2\u071d\u071d\u5140\u0800, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), and:int(ldc:int(-10559), ldc:int(10270)))))
            var_5_80 = checkcast:List<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>(java.util.List<\u51b2\u6fb0\ufcaf\u61a4\u0800.\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>.class, invokevirtual:List<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u7ce1\uc238\u946b\ubb2b\ua6bd\u12b2, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<List<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>>(\u7c6b\ua3b4\uc2bd\u647c\ub19c\uc7fe::\u99f7\u600f\u183a\ucb79\u836c\u624e)))
            invokevirtual:void(\ub18d\u56bd\u8d98\u5bc4\u4f52\u4975::\u600f\u12cb\u3711\uc84e\ud523\u67e9, p0:\u9af2\ud51e\u836c\u647c\u6ec6\u3dd3[expected:\ub18d\u56bd\u8d98\u5bc4\u4f52\u4975], var_4_74:int, var_5_80:List<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>, invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))
            var_6_94 = invokevirtual:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\uc29a\u3dd3\uc7fe\u8bb0\uc2e8, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, ldc:int(68))
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, var_6_94:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), invokestatic:Integer(Integer::valueOf, var_4_74:int))
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, var_6_94:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<List<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>>(\u7c6b\ua3b4\uc2bd\u647c\ub19c\uc7fe::\u99f7\u600f\u183a\ucb79\u836c\u624e), var_5_80:List<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>)
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ub18d\u4f4a\u446c\u3bd6\u0a06\u4daf, var_6_94:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, ldc:Class<\u6d69\u6d69\ub18d\u71ae\u7c6b\u0a06>(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u6d69\u6d69\ub18d\u71ae\u7c6b\u0a06.class))
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
        var_3_608 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_613 : int
        
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
        var_3_608 = and:int(ldc:int(-535374993), ldc:int(2139288127))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc229\u960f\u446c\u0c95\u64f2\u4c2b[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(8192)), ldc:int(0))) {
            var_3_608 = and:int(var_3_608:int, ldc:int(2147102735))
        }
        else {
            var_3_608 = and:int(var_3_608:int, ldc:int(1005378555))
            var_5_85 = and:int(ldc:int(-24548), ldc:int(18339))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-6761), ldc:int(6760)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_608:int, ldc:int(-61481317))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(11273), ldc:int(209)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(25667), ldc:int(2053)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_608 = and:int(var_3_D2:int, ldc:int(2034818895))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(3586), ldc:int(3587)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1181)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1055)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(1061631407))
                        goto(Label_0886)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(1537328966))
                        goto(Label_0517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-213265665))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0517)
                            }
                            
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-944026577))
                        goto(Label_1457)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1181)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(2130656048))
                        goto(Label_1055)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0886)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1875203825))
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(609016655))
                            var_11_E3 = and:int(ldc:int(10563), ldc:int(-26948))
                            goto(Label_1446)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0517:
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(2053594353))
                        goto(Label_1457)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1130592270))
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1181)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(1827689454))
                        goto(Label_1055)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0886)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(1052245829))
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-2095843026))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-1271634852))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(534685142))
                            loopcontinue()
                        }
                        
                        var_3_608 = and:int(var_3_608:int, ldc:int(919525339))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1457)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(278743958))
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1181)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-850738477))
                        goto(Label_1055)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(64782516))
                        goto(Label_0886)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-2032352526))
                            loopcontinue()
                        }
                        
                        var_3_608 = and:int(var_3_608:int, ldc:int(-413928869))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0770:
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(8)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-234279761))
                        goto(Label_1457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1181)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1070061104))
                        goto(Label_1055)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(1444189826))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(1019134462))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1389234629))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(544), ldc:int(545))
                                goto(Label_1055)
                            }
                        }
                    }
                    
                    Label_0886:
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(1688319205))
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1181)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-795387093))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(1440307435))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-1403727134))
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-732537752))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(81703096))
                            loopcontinue()
                        }
                        
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1170876689))
                        var_11_E3 = and:int(ldc:int(23762), ldc:int(-23763))
                    }
                    
                    Label_1055:
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(493274355))
                        goto(Label_1457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1287786388))
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0886)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(90296895))
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-1254615333))
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(1541004332))
                            loopcontinue()
                        }
                        
                        var_3_608 = and:int(var_3_608:int, ldc:int(736813039))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1308)
                            }
                        }
                    }
                    
                    Label_1181:
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1457)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_1055)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0886)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-1738544712))
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-2091162165))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-1150159625))
                            goto(Label_0517)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(1838459808))
                            loopcontinue()
                        }
                        
                        var_3_608 = and:int(var_3_608:int, ldc:int(1854267055))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1446)
                    }
                    
                    Label_1308:
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1457)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1181)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1686806877))
                        goto(Label_1055)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0886)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(861991632))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(1090000719))
                        goto(Label_0517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(1737962304))
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1123465735))
                        loopcontinue()
                    }
                    
                    var_3_608 = and:int(var_3_608:int, ldc:int(718010031))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1446:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_613 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1457:
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1538388142))
                        goto(Label_1181)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1055)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0886)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1281981003))
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-446955761))
                        var_17_613 = add:int(var_16_111:int, xor:int(ldc:int(5664), ldc:int(5665)))
                        looporswitchbreak()
                    }
                }
                
                var_3_608 = and:int(var_3_608:int, ldc:int(774698507))
                
                if (cmple:boolean(var_5_85 = var_17_613:int, sub:int(var_6_8C:int, and:int(ldc:int(9217), ldc:int(4483))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(65536)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
