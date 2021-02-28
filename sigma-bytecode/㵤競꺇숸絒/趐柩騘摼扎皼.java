public class \u3d64\u7af6\uae87\uc238\u7d52.\u8d90\u67e9\u9a18\u647c\u624e\u76bc {
    public void \u8d90\u67e9\u9a18\u647c\u624e\u76bc(\u3504\ufe34\u600f\u6b0d\u69d9.\ub18d\u56bd\u8d98\u5bc4\u4f52\u4975 p0, \u6435\ub8be\u718f\u6b0d\u67e9.\ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3 p1) {
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
            putfield:\ub18d\u56bd\u8d98\u5bc4\u4f52\u4975(\u8d90\u67e9\u9a18\u647c\u624e\u76bc::\u7e3f\ua6bd\u3bc9\u71f1\u3711\u4e72, this:\u8d90\u67e9\u9a18\u647c\u624e\u76bc, p0:\ub18d\u56bd\u8d98\u5bc4\u4f52\u4975)
            putfield:\ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3(\u8d90\u67e9\u9a18\u647c\u624e\u76bc::\u3bc9\ub18d\uc9f6\u6fb0\u8d98\u8413, this:\u8d90\u67e9\u9a18\u647c\u624e\u76bc, p1:\ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3)
            invokespecial:\u5d20\u6bb9\ub113\u983f\u47c2\u718f(\u5d20\u6bb9\ub113\u983f\u47c2\u718f::<init>, this:\u8d90\u67e9\u9a18\u647c\u624e\u76bc)
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
    
    private void lambda$\u51b2\u4ab3\u93a2\u56bd\u3c25\u392e$0(\u6435\ub8be\u718f\u6b0d\u67e9.\ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3 p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p1) {
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
            
            if (cmpeq:boolean(invokevirtual:\ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3(\u4f52\u6bb9\u965f\u6435\u8c8a\u516c::\ud12e\u88c5\u4c04\u4ab3\ua6bd\u8753, checkcast:\u4f52\u6bb9\u965f\u6435\u8c8a\u516c(\u6435\ub8be\u718f\u6b0d\u67e9.\u4f52\u6bb9\u965f\u6435\u8c8a\u516c.class, invokevirtual:\u4f52\u6bb9\u965f\u6435\u8c8a\u516c(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u4d85\u71f1\u6435\u1833\u1187\u6435, invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4), invokestatic:Class(\ub18d\u56bd\u8d98\u5bc4\u4f52\u4975::\u8350\u927d\ubcb0\u3bc9\ucb79\ucef1, getfield:\ub18d\u56bd\u8d98\u5bc4\u4f52\u4975(\u8d90\u67e9\u9a18\u647c\u624e\u76bc::\u7e3f\ua6bd\u3bc9\u71f1\u3711\u4e72, this:\u8d90\u67e9\u9a18\u647c\u624e\u76bc)))), invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u120d\u51b2\u071d\u071d\u5140\u0800, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), and:int(ldc:int(-4784), ldc:int(4783)))))), p0:\ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3)) {
                invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6435\ub1b9\u88c5\u4c04\u72f1\u8df4, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u6198\u4975\ub83f\ub7dc\u3d64\u5140), and:int(ldc:int(-32363), ldc:int(12842)), invokestatic:Integer(Integer::valueOf, invokevirtual:int(\u6198\uceb8\ud12e\u839e\u071d\ub6ab::\u647c\u97b7\uf995\u67e9\u873d\u5f50, invokevirtual:\u6198\uceb8\ud12e\u839e\u071d\ub6ab(\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd::\ub7dc\u983f\u69d9\uc3e3\u527a\u8413, getfield:\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd(\ub18d\u56bd\u8d98\u5bc4\u4f52\u4975::\ub32d\ub171\u7330\uff55\u4daf\ua61f, getfield:\ub18d\u56bd\u8d98\u5bc4\u4f52\u4975(\u8d90\u67e9\u9a18\u647c\u624e\u76bc::\u7e3f\ua6bd\u3bc9\u71f1\u3711\u4e72, this:\u8d90\u67e9\u9a18\u647c\u624e\u76bc))), invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u120d\u51b2\u071d\u071d\u5140\u0800, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u6198\u4975\ub83f\ub7dc\u3d64\u5140), and:int(ldc:int(-25652), ldc:int(24627))))))))
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
        var_3_665 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_670 : int
        
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
        var_3_665 = and:int(ldc:int(-1603948128), ldc:int(-260779274))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8d90\u67e9\u9a18\u647c\u624e\u76bc[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_665:int, ldc:int(1024)), ldc:int(0))) {
            var_3_665 = and:int(var_3_665:int, ldc:int(-1985015857))
        }
        else {
            var_3_665 = and:int(var_3_665:int, ldc:int(-1166213325))
            var_5_85 = and:int(ldc:int(-28508), ldc:int(26377))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(21314), ldc:int(-21483)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_665:int, ldc:int(-1476592154))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(37), ldc:int(24795)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(2561), ldc:int(16577)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_665 = and:int(var_3_D2:int, ldc:int(-227642703))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(4945), ldc:int(1061)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1521)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(-717275386))
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(1969399389))
                        goto(Label_1097)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(32)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(-1393202696))
                        goto(Label_0808)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0685)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(1101893485))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(222262656))
                    }
                    else {
                        var_3_665 = and:int(var_3_665:int, ldc:int(-411051093))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0808)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(1)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(163333412))
                        goto(Label_1521)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(4)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(-1593302408))
                        goto(Label_1097)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(-96900455))
                        goto(Label_0945)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(4)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(89665357))
                        goto(Label_0808)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(-3636433))
                        goto(Label_0685)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(55700193))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_665:int, ldc:int(32)), ldc:int(0))) {
                            var_3_665 = and:int(var_3_665:int, ldc:int(-387565141))
                            var_11_E3 = and:int(ldc:int(-28139), ldc:int(28130))
                            goto(Label_1510)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(-1647362917))
                        goto(Label_1521)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(215433663))
                        goto(Label_1097)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(-352018734))
                        goto(Label_0945)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(8)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(1520889934))
                        goto(Label_0808)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_665:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_665:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_665 = and:int(var_3_665:int, ldc:int(-1317224454))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0808)
                        }
                    }
                    
                    Label_0685:
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(269336440))
                        goto(Label_1521)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1097)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(225494737))
                        goto(Label_0945)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(-699011299))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_665:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_665:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_665 = and:int(var_3_665:int, ldc:int(1320900088))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_665:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_665 = and:int(var_3_665:int, ldc:int(-286445019))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0808:
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(933489480))
                        goto(Label_1521)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(1)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(1660696393))
                        goto(Label_1372)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(1061905130))
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1097)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(1086912741))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_665:int, ldc:int(8)), ldc:int(0))) {
                            var_3_665 = and:int(var_3_665:int, ldc:int(-154809577))
                            goto(Label_0685)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_665:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_665:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_665 = and:int(var_3_665:int, ldc:int(-1002939194))
                            loopcontinue()
                        }
                        
                        var_3_665 = and:int(var_3_665:int, ldc:int(-1511222852))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(5154), ldc:int(5155))
                                goto(Label_1097)
                            }
                        }
                    }
                    
                    Label_0945:
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1521)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(-173821631))
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(-1868882583))
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(1)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(928696926))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_665:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0808)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_665:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_665 = and:int(var_3_665:int, ldc:int(1195120241))
                            goto(Label_0685)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_665:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_665:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_665 = and:int(var_3_665:int, ldc:int(-1124854231))
                        var_11_E3 = and:int(ldc:int(-4373), ldc:int(4372))
                    }
                    
                    Label_1097:
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1521)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(1)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(1971294878))
                        goto(Label_1372)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_665 = and:int(var_3_665:int, ldc:int(-1900723724))
                            goto(Label_0945)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_665:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_665 = and:int(var_3_665:int, ldc:int(-1636760255))
                            goto(Label_0808)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_665:int, ldc:int(8)), ldc:int(0))) {
                            var_3_665 = and:int(var_3_665:int, ldc:int(31763676))
                            goto(Label_0685)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_665:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_665:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(32)), ldc:int(0))) {
                            var_3_665 = and:int(var_3_665:int, ldc:int(-672095035))
                            loopcontinue()
                        }
                        
                        var_3_665 = and:int(var_3_665:int, ldc:int(-1568762327))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1372)
                            }
                        }
                    }
                    
                    Label_1224:
                    
                    if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(542541066))
                        goto(Label_1521)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(659471547))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_665:int, ldc:int(8)), ldc:int(0))) {
                            var_3_665 = and:int(var_3_665:int, ldc:int(-1761375483))
                            goto(Label_1097)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_665:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_665 = and:int(var_3_665:int, ldc:int(-59726345))
                            goto(Label_0945)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_665:int, ldc:int(8)), ldc:int(0))) {
                            var_3_665 = and:int(var_3_665:int, ldc:int(1836100570))
                            goto(Label_0808)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0685)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_665:int, ldc:int(8)), ldc:int(0))) {
                            var_3_665 = and:int(var_3_665:int, ldc:int(-1759953301))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_665:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_665 = and:int(var_3_665:int, ldc:int(-470952157))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1510)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1372:
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1521)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1097)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(-1849823029))
                        goto(Label_0945)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(-1508275898))
                        goto(Label_0808)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(76399443))
                        goto(Label_0685)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(-1627900904))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(-2061692138))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_665 = and:int(var_3_665:int, ldc:int(-1368115343))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1510:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_670 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1521:
                    
                    if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(39750154))
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1097)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(32)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(368465937))
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0808)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(-491331873))
                        goto(Label_0685)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_665:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(702089810))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(8)), ldc:int(0))) {
                        var_3_665 = and:int(var_3_665:int, ldc:int(-336244500))
                        var_17_670 = add:int(var_16_111:int, xor:int(ldc:int(4128), ldc:int(4129)))
                        looporswitchbreak()
                    }
                    
                    var_3_665 = and:int(var_3_665:int, ldc:int(909780531))
                }
                
                var_3_665 = and:int(var_3_665:int, ldc:int(-320045710))
                
                if (cmple:boolean(var_5_85 = var_17_670:int, sub:int(var_6_8C:int, xor:int(ldc:int(646), ldc:int(647))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_665:int, ldc:int(1)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
