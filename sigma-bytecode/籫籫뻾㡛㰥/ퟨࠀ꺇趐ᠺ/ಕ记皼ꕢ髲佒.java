public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u0c95\u8bb0\u76bc\ua562\u9af2\u4f52 {
    public void \u0c95\u8bb0\u76bc\ua562\u9af2\u4f52(\u59ec\u8413\u97e6\uc229\u3776.\u4daf\u9af2\u718f\u3504\uc4d2\u67e9 p0) {
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
            invokespecial:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u9af2\u1833\u156b\u12cb\u7d52\u6c52::<init>, this:\u0c95\u8bb0\u76bc\ua562\u9af2\u4f52, p0:\u4daf\u9af2\u718f\u3504\uc4d2\u67e9)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \ua562\ucb79\uc87f\u3dd3\ubcb0.\u3a62\u3504\u8d90\u7043\u52d3\u71f1<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56> \u8aa5\u446c\u3711\u4c2b\u3c25\u5654(\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\ub113\u6c56\u97e6\u51b2\u4c2b p2) {
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
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 \u156b\u0800\ubb2b\u76bc\u4c04\ufcaf(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p1, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p2) {
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
            invokevirtual:void(\ua3b4\u8aa5\ub113\ubf56\u873d::\uc3e3\u8cae\u4492\u92ee\ub70c\ub7dc, p1:\ua3b4\u8aa5\ub113\ubf56\u873d, invokevirtual:\u6435\u5d20\u071d\u5fe1\ubded\ud171<\u0c95\u8bb0\u76bc\ua562\u9af2\u4f52>(\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<\u0c95\u8bb0\u76bc\ua562\u9af2\u4f52>::\u0800\ufcaf\ucfaf\ub1b9\u8709\u446c, getstatic:\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>(\uc910\u4179\u4daf\u3776\u7c6b\uf94d::\u8258\u5245\ufe34\u61a4\u5140\u8413), this:\u0c95\u8bb0\u76bc\ua562\u9af2\u4f52))
            return:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(invokestatic:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u6c52\u88c5\u40a9\u6198\uc87f\u0c95::\ud158\u6bb9\u99f7\u965f\u67d0\u5db4, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, p1:\ua3b4\u8aa5\ub113\ubf56\u873d, p2:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\ud4fe\uc229\ufcaf\u4f4a\u494c\u6d99$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u5db4\ud217\u56bd\u98a4\u7e3f p0) {
        var_1_61 : int
        stack_A6_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-452871227), ldc:int(-714678353))
            
            if (cmpne:boolean(p0:\u5db4\ud217\u56bd\u98a4\u7e3f, aconstnull:\u5db4\ud217\u56bd\u98a4\u7e3f())) {
                if (invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u6b0d\u5bc4\u3504\u40a9\u7043\u98a4, p0:\u5db4\ud217\u56bd\u98a4\u7e3f[expected:\u7d52\u718f\u3776\u6fb0\ub83f])) {
                    if (instanceof:boolean(\u47c2\u2dcc\u12cb\ud171\u8c8a.\ua3b4\u9a18\ufcaf\ubff1\u3c25.class, invokevirtual:\ube23\u67d0\u64f2\u839e\u76bc(\u5db4\ud217\u56bd\u98a4\u7e3f::\u59ec\u5fe1\ua6bd\ub171\ub70c\u5d20, p0:\u5db4\ud217\u56bd\u98a4\u7e3f))) {
                        stack_A6_0 = and:int[expected:boolean](ldc:int(16835), ldc:int(33))
                        return:boolean(stack_A6_0:boolean)
                    }
                }
            }
            
            var_1_61 = and:int(var_1_61:int, ldc:int(-189547085))
            stack_A6_0 = and:int[expected:boolean](ldc:int(-21289), ldc:int(21032))
            return:boolean(stack_A6_0:boolean[expected:int])
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
    
    public void \u88c5\u6d99\ud171\ub70c\uc229\u76bc(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_69E : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_6A9 : int
        
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
        var_3_69E = and:int(ldc:int(1434524497), ldc:int(-179754145))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u0c95\u8bb0\u76bc\ua562\u9af2\u4f52[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_69E = and:int(var_3_69E:int, ldc:int(-1993388072))
        }
        else {
            var_3_69E = and:int(var_3_69E:int, ldc:int(-149864105))
            var_5_8A = and:int(ldc:int(16536), ldc:int(-16537))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(3622), ldc:int(-3631)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_69E:int, ldc:int(-585946649))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, xor:int(ldc:int(4193), ldc:int(4192)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(525), ldc:int(524)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_69E = and:int(var_3_E3:int, ldc:int(-717385911))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(840), ldc:int(841)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-457997944))
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(1734799148))
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1136)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-1515527844))
                        goto(Label_0976)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-2129135463))
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0683)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0567)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(1595378001))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0567)
                            }
                            
                            goto(Label_0815)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1406)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1136)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0976)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(949629943))
                        goto(Label_0683)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_69E = and:int(var_3_69E:int, ldc:int(-658477869))
                            loopcontinue()
                        }
                        
                        var_3_69E = and:int(var_3_69E:int, ldc:int(1999201115))
                        var_11_F4 = and:int(ldc:int(25858), ldc:int(-25859))
                        goto(Label_1543)
                    }
                    
                    Label_0567:
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-1014538142))
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1406)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1261)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1136)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0976)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0815)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(690283114))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_69E = and:int(var_3_69E:int, ldc:int(426663271))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-39646873))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0815)
                        }
                    }
                    
                    Label_0683:
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-35330243))
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-321904990))
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1136)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(1052987))
                        goto(Label_0976)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_69E = and:int(var_3_69E:int, ldc:int(-1232655504))
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69E = and:int(var_3_69E:int, ldc:int(1996577263))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0815:
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(976990714))
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(886099744))
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-1369253005))
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-170894906))
                        goto(Label_1136)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-22717141))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(256)), ldc:int(0))) {
                            var_3_69E = and:int(var_3_69E:int, ldc:int(-45563703))
                            goto(Label_0683)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(256)), ldc:int(0))) {
                            var_3_69E = and:int(var_3_69E:int, ldc:int(2140532473))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_69E = and:int(var_3_69E:int, ldc:int(1155214305))
                            loopcontinue()
                        }
                        
                        var_3_69E = and:int(var_3_69E:int, ldc:int(2142630739))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = and:int(ldc:int(8225), ldc:int(3137))
                                goto(Label_1136)
                            }
                        }
                    }
                    
                    Label_0976:
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(1340218157))
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(138943628))
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(1)), ldc:int(0))) {
                            var_3_69E = and:int(var_3_69E:int, ldc:int(-1073559967))
                            goto(Label_0815)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0683)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0567)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_69E = and:int(var_3_69E:int, ldc:int(1702021590))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-573470219))
                        var_11_F4 = and:int(ldc:int(21200), ldc:int(-30425))
                    }
                    
                    Label_1136:
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(965318797))
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(1423712800))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(8)), ldc:int(0))) {
                            var_3_69E = and:int(var_3_69E:int, ldc:int(735079335))
                            goto(Label_0976)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0815)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0683)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_69E = and:int(var_3_69E:int, ldc:int(1114024235))
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69E = and:int(var_3_69E:int, ldc:int(1598657909))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1406)
                            }
                        }
                    }
                    
                    Label_1261:
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-962087536))
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-242070200))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_69E = and:int(var_3_69E:int, ldc:int(1229267966))
                            goto(Label_1136)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(256)), ldc:int(0))) {
                            var_3_69E = and:int(var_3_69E:int, ldc:int(-855447835))
                            goto(Label_0976)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0815)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_69E = and:int(var_3_69E:int, ldc:int(-1550572211))
                            goto(Label_0683)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_69E = and:int(var_3_69E:int, ldc:int(1429963129))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                            goto(Label_1543)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1406:
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(558625843))
                        goto(Label_1554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-857426641))
                        goto(Label_1136)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0976)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-1318639191))
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0683)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-1318106425))
                        goto(Label_0567)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(8)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_69E = and:int(var_3_69E:int, ldc:int(-705696389))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1543:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A9 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1554:
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-1331802183))
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1261)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-547895345))
                        goto(Label_1136)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(1019253733))
                        goto(Label_0976)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0815)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-1065666992))
                        goto(Label_0683)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(228836534))
                        goto(Label_0567)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-2098652142))
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-716582971))
                        var_17_6A9 = add:int(var_16_122:int, xor:int(ldc:int(144), ldc:int(145)))
                        looporswitchbreak()
                    }
                    
                    var_3_69E = and:int(var_3_69E:int, ldc:int(480062172))
                }
                
                var_3_69E = and:int(var_3_69E:int, ldc:int(1570344417))
                
                if (cmple:boolean(var_5_8A = var_17_6A9:int, sub:int(var_6_91:int, and:int(ldc:int(2089), ldc:int(513))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(1)), ldc:int(0))) {
            var_3_69E = and:int(var_3_69E:int, ldc:int(1495297250))
            goto(Label_0108)
        }
    }
}
