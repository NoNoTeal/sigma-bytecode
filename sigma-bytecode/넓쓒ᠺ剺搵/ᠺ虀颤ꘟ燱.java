public class \ub113\uc4d2\u183a\u527a\u6435.\u183a\u8640\u98a4\ua61f\u71f1 {
    public void \u183a\u8640\u98a4\ua61f\u71f1(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u3d4b\u9af2\u71f1\u67d0\u99f7 p0) {
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
    
    public void \u9033\u156b\u1187\u7c6b\u61a4\ua6bd(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, float p3) {
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
            invokestatic:void(\u3d4b\u9af2\u71f1\u67d0\u99f7::\u4ab3\ub6ab\u4bc8\u5d20\ub6ab\ub18d, getfield:\u3d4b\u9af2\u71f1\u67d0\u99f7(\u183a\u8640\u98a4\ua61f\u71f1::\ub70c\u1833\ub19c\u183a\u3d64, this:\u183a\u8640\u98a4\ua61f\u71f1), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, invokestatic:boolean(\u3d4b\u9af2\u71f1\u67d0\u99f7::\u47c2\u3504\u9af2\ud7e8\u36d3\u965f, getfield:\u3d4b\u9af2\u71f1\u67d0\u99f7(\u183a\u8640\u98a4\ua61f\u71f1::\ub70c\u1833\ub19c\u183a\u3d64, this:\u183a\u8640\u98a4\ua61f\u71f1)), getfield:int(\u183a\u8640\u98a4\ua61f\u71f1::\u3dd3\u4975\u6cfe\u51fa\ua562\u5db4, this:\u183a\u8640\u98a4\ua61f\u71f1), getfield:int(\u183a\u8640\u98a4\ua61f\u71f1::\uae87\u5f50\u3bd6\u6c56\ud51e\u1833, this:\u183a\u8640\u98a4\ua61f\u71f1), invokevirtual:boolean(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\u99f7\u12cb\u0800\u4bc8\u52d3\u8cae, this:\u183a\u8640\u98a4\ua61f\u71f1[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995]), getfield:boolean(\u183a\u8640\u98a4\ua61f\u71f1::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, this:\u183a\u8640\u98a4\ua61f\u71f1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u3a62\u3504\u8d90\u7043\u52d3\u71f1$0(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
        var_4_95 : \ud12e\u64f2\u5d20\u6b5f\u965f
        
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
            
            if (cmpne:boolean(invokestatic:String(\u3d4b\u9af2\u71f1\u67d0\u99f7::\u983f\u93a2\uf9c5\u5fe1\u2dcc\ud523, getfield:\u3d4b\u9af2\u71f1\u67d0\u99f7(\u183a\u8640\u98a4\ua61f\u71f1::\ub70c\u1833\ub19c\u183a\u3d64, this:\u183a\u8640\u98a4\ua61f\u71f1)), aconstnull:String())) {
                invokevirtual:void(\u36d3\u8640\u92ff\ub113\u12b2\ud158::\ub6ab\u92ff\u8350\u624e\ub102\u5f50, invokestatic:\u36d3\u8640\u92ff\ub113\u12b2\ud158(\ud217\u3504\u760c\uc29a\u97e6\ube23::\uc910\u4f4a\uc29a\u61a4\uc87f\u516c), invokestatic:String(\u3d4b\u9af2\u71f1\u67d0\u99f7::\u983f\u93a2\uf9c5\u5fe1\u2dcc\ud523, getfield:\u3d4b\u9af2\u71f1\u67d0\u99f7(\u183a\u8640\u98a4\ua61f\u71f1::\ub70c\u1833\ub19c\u183a\u3d64, this:\u183a\u8640\u98a4\ua61f\u71f1)))
                
                if (invokestatic:boolean(\u3d4b\u9af2\u71f1\u67d0\u99f7::\u47c2\u3504\u9af2\ud7e8\u36d3\u965f, getfield:\u3d4b\u9af2\u71f1\u67d0\u99f7(\u183a\u8640\u98a4\ua61f\u71f1::\ub70c\u1833\ub19c\u183a\u3d64, this:\u183a\u8640\u98a4\ua61f\u71f1))) {
                    var_4_95 = invokestatic:\ud12e\u64f2\u5d20\u6b5f\u965f(\u6d99\u3d64\u7d52\u92ee\u8413::\u6c52\u4ab3\u8d98\u7049\ub7dc\u8258)
                    putfield:boolean(\ud12e\u64f2\u5d20\u6b5f\u965f::\u9255\u93a2\ufe34\u56bd\u4179\u600f, var_4_95:\ud12e\u64f2\u5d20\u6b5f\u965f, and:int[expected:boolean](ldc:int(-27631), ldc:int(26828)))
                    invokestatic:boolean(\u3d4b\u9af2\u71f1\u67d0\u99f7::\u3e2a\u4c2b\u624e\u8389\u74b1\u3504, getfield:\u3d4b\u9af2\u71f1\u67d0\u99f7(\u183a\u8640\u98a4\ua61f\u71f1::\ub70c\u1833\ub19c\u183a\u3d64, this:\u183a\u8640\u98a4\ua61f\u71f1), and:int[expected:boolean](ldc:int(-23659), ldc:int(7272)))
                    invokestatic:void(\u6d99\u3d64\u7d52\u92ee\u8413::\u9937\ua3b4\u760c\u494c\u34df\u839e, var_4_95:\ud12e\u64f2\u5d20\u6b5f\u965f)
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
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_618 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_623 : int
        
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
        var_3_618 = and:int(ldc:int(-2034806522), ldc:int(-1396843466))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u183a\u8640\u98a4\ua61f\u71f1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(65536)), ldc:int(0))) {
            var_3_618 = and:int(var_3_618:int, ldc:int(-1358445576))
        }
        else {
            var_3_618 = and:int(var_3_618:int, ldc:int(-1126707609))
            var_5_85 = and:int(ldc:int(16934), ldc:int(-16943))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(1954), ldc:int(-18340)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_618:int, ldc:int(-1198036801))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(1668), ldc:int(1669)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(18561), ldc:int(13427)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_618 = and:int(var_3_D2:int, ldc:int(-1128963193))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(6153), ldc:int(17029)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(4)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(770199596))
                        goto(Label_1447)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1290)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1047)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0914)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(25093977))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1867167577))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(549358982))
                        goto(Label_1290)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(16086362))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1047)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1225954547))
                        goto(Label_0914)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(2095411771))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(512)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(188740882))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-1495933938))
                            var_11_E3 = and:int(ldc:int(-511), ldc:int(478))
                            goto(Label_1436)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(16)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1891103514))
                        goto(Label_1290)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(761862927))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1047)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(936888523))
                        goto(Label_0914)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-542332446))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(639064414))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(73659296))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1768078833))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1290)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1847070600))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1047)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-472620962))
                        goto(Label_0914)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-443401904))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-1954387368))
                            loopcontinue()
                        }
                        
                        var_3_618 = and:int(var_3_618:int, ldc:int(-826979185))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1909962371))
                        goto(Label_1447)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-404968719))
                        goto(Label_1290)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-501127809))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(16)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1231451139))
                        goto(Label_1047)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-677886597))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(6580402))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(16)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(1203605904))
                            loopcontinue()
                        }
                        
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1579717618))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(6177), ldc:int(539))
                                goto(Label_1047)
                            }
                        }
                    }
                    
                    Label_0914:
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(528795002))
                        goto(Label_1290)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(1944295634))
                            loopcontinue()
                        }
                        
                        var_3_618 = and:int(var_3_618:int, ldc:int(-20986306))
                        var_11_E3 = and:int(ldc:int(21824), ldc:int(-21837))
                    }
                    
                    Label_1047:
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1057970733))
                        goto(Label_1447)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1290)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(986245304))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0914)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-702930620))
                            loopcontinue()
                        }
                        
                        var_3_618 = and:int(var_3_618:int, ldc:int(-822780618))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1290)
                            }
                        }
                    }
                    
                    Label_1154:
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1302709537))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_1047)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-1855197774))
                            goto(Label_0914)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-1466833706))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(1845949993))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-1650988623))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(16)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-1562948185))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1436)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1290:
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(923629188))
                        goto(Label_1447)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1656514608))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1047)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(16)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-467172504))
                        goto(Label_0914)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1412679873))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-853994654))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1876467817))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_618 = and:int(var_3_618:int, ldc:int(-621412657))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1436:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_623 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1447:
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1779016379))
                        goto(Label_1290)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1586974051))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1047)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0914)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-105766458))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1341919187))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1124599474))
                        var_17_623 = add:int(var_16_111:int, xor:int(ldc:int(17408), ldc:int(17409)))
                        looporswitchbreak()
                    }
                    
                    var_3_618 = and:int(var_3_618:int, ldc:int(-816056765))
                }
                
                var_3_618 = and:int(var_3_618:int, ldc:int(-945818641))
                
                if (cmple:boolean(var_5_85 = var_17_623:int, sub:int(var_6_8C:int, and:int(ldc:int(24833), ldc:int(2777))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(65536)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
