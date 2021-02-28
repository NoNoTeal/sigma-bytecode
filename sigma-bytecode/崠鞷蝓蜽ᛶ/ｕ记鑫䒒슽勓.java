public final class \u5d20\u97b7\u8753\u873d\u16f6.\uff55\u8bb0\u946b\u4492\uc2bd\u52d3 {
    public void \uff55\u8bb0\u946b\u4492\uc2bd\u52d3(\u36d3\u9033\u6b0d\u983f\u8d90.\u9af2\ud51e\u836c\u647c\u6ec6\u3dd3 p0) {
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
            putfield:\u9af2\ud51e\u836c\u647c\u6ec6\u3dd3(\uff55\u8bb0\u946b\u4492\uc2bd\u52d3::\u8d90\uf9c5\uc238\u873d\u8d90\ufe34, this:\uff55\u8bb0\u946b\u4492\uc2bd\u52d3, p0:\u9af2\ud51e\u836c\u647c\u6ec6\u3dd3)
            invokespecial:\u5d20\u6bb9\ub113\u983f\u47c2\u718f(\u5d20\u6bb9\ub113\u983f\u47c2\u718f::<init>, this:\uff55\u8bb0\u946b\u4492\uc2bd\u52d3)
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
    
    private static void lambda$\u6198\u624e\ucfaf\u3dd3\u4c2b\ubb2b$0(\u36d3\u9033\u6b0d\u983f\u8d90.\u9af2\ud51e\u836c\u647c\u6ec6\u3dd3 p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p1) {
        var_4_74 : int
        var_6_98 : List<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>
        var_7_AC : \u59ec\uc29a\uc84e\u12b2\u5db4\u98a4
        
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
            var_4_74 = invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u120d\u51b2\u071d\u071d\u5140\u0800, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), and:int(ldc:int(2650), ldc:int(-2651)))))
            invokevirtual:void(\u4f52\u6bb9\u965f\u6435\u8c8a\u516c::\u6198\u4daf\u5245\u34df\ub18d\uc7fe, checkcast:\u5bc4\uc2bd\u5db4\u6ec6\ua3b4\u759a[expected:\u4f52\u6bb9\u965f\u6435\u8c8a\u516c](\ud36e\u6bb9\u960f\u4c04\u64ab.\u5bc4\uc2bd\u5db4\u6ec6\ua3b4\u759a.class, invokevirtual:\u5bc4\uc2bd\u5db4\u6ec6\ua3b4\u759a(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u4d85\u71f1\u6435\u1833\u1187\u6435, invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4), ldc:Class<\u5bc4\uc2bd\u5db4\u6ec6\ua3b4\u759a>(\ud36e\u6bb9\u960f\u4c04\u64ab.\u5bc4\uc2bd\u5db4\u6ec6\ua3b4\u759a.class))), var_4_74:int, getstatic:\ub113\ub6ab\ud7e8\ud217\u67d0\u3e75[expected:\ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3](\ub113\ub6ab\ud7e8\ud217\u67d0\u3e75::\u9255\ub171\ud12e\u16f6\u7e3f\u836c))
            var_6_98 = checkcast:List<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>(java.util.List<\u51b2\u6fb0\ufcaf\u61a4\u0800.\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>.class, invokevirtual:List<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u7ce1\uc238\u946b\ubb2b\ua6bd\u12b2, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<List<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>>(\u7c6b\ua3b4\uc2bd\u647c\ub19c\uc7fe::\u99f7\u600f\u183a\ucb79\u836c\u624e)))
            invokevirtual:void(\ub18d\u56bd\u8d98\u5bc4\u4f52\u4975::\u600f\u12cb\u3711\uc84e\ud523\u67e9, p0:\u9af2\ud51e\u836c\u647c\u6ec6\u3dd3[expected:\ub18d\u56bd\u8d98\u5bc4\u4f52\u4975], var_4_74:int, var_6_98:List<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>, invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))
            var_7_AC = invokevirtual:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\uc29a\u3dd3\uc7fe\u8bb0\uc2e8, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, ldc:int(68))
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, var_7_AC:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), invokestatic:Integer(Integer::valueOf, var_4_74:int))
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, var_7_AC:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<List<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>>(\u7c6b\ua3b4\uc2bd\u647c\ub19c\uc7fe::\u99f7\u600f\u183a\ucb79\u836c\u624e), var_6_98:List<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>)
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ub18d\u4f4a\u446c\u3bd6\u0a06\u4daf, var_7_AC:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, ldc:Class<\u6d69\u6d69\ub18d\u71ae\u7c6b\u0a06>(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u6d69\u6d69\ub18d\u71ae\u7c6b\u0a06.class))
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
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
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
        var_3_608 = and:int(ldc:int(1371653026), ldc:int(-289549319))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uff55\u8bb0\u946b\u4492\uc2bd\u52d3[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(32)), ldc:int(0))) {
            var_3_608 = and:int(var_3_608:int, ldc:int(170364812))
        }
        else {
            var_3_608 = and:int(var_3_608:int, ldc:int(-929051804))
            var_5_85 = and:int(ldc:int(-3385), ldc:int(3384))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(795), ldc:int(-860)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_608:int, ldc:int(-108200970))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(267), ldc:int(266)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(29355), ldc:int(5)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_608 = and:int(var_3_DA:int, ldc:int(-51453144))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(8465), ldc:int(8464)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-276226600))
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(1177696502))
                        goto(Label_1207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1082)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(1072048757))
                        goto(Label_0922)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(32)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(263611176))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(256)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1137614337))
                        goto(Label_0653)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(445637602))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1082)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-938968217))
                        goto(Label_0922)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(1835953229))
                        goto(Label_0653)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(2145198974))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(1)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(1089858480))
                            var_11_EB = and:int(ldc:int(-6768), ldc:int(2671))
                            goto(Label_1437)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(32)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1934023427))
                        goto(Label_1207)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(461771863))
                        goto(Label_1082)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0922)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-358972210))
                            loopcontinue()
                        }
                        
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1426922649))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0653:
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1669365650))
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(162252003))
                        goto(Label_1207)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1328782448))
                        goto(Label_1082)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0922)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(64)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-1169886934))
                            loopcontinue()
                        }
                        
                        var_3_608 = and:int(var_3_608:int, ldc:int(2127940392))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(79875731))
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(1776137719))
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1934151332))
                        goto(Label_1082)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(1267274909))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-1432248514))
                            goto(Label_0653)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(32)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(504486850))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-15415076))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_608 = and:int(var_3_608:int, ldc:int(-2033714373))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(80), ldc:int(81))
                                goto(Label_1082)
                            }
                        }
                    }
                    
                    Label_0922:
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1251690687))
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(161775749))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(1246361587))
                            goto(Label_0653)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(8)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(1671154515))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(1)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-1030449381))
                            loopcontinue()
                        }
                        
                        var_3_608 = and:int(var_3_608:int, ldc:int(58979311))
                        var_11_EB = and:int(ldc:int(18468), ldc:int(-18469))
                    }
                    
                    Label_1082:
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(512)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-695786598))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0922)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(256)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-1306457898))
                            goto(Label_0653)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(1907437960))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(64)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(1861624007))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(95860801))
                            loopcontinue()
                        }
                        
                        var_3_608 = and:int(var_3_608:int, ldc:int(955703295))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1334)
                            }
                        }
                    }
                    
                    Label_1207:
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_1082)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-1696751335))
                            goto(Label_0922)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0653)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(64)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-1537210310))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(64)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-320242893))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_608:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_608 = and:int(var_3_608:int, ldc:int(-640090733))
                            loopcontinue()
                        }
                        
                        var_3_608 = and:int(var_3_608:int, ldc:int(-40448080))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1437)
                    }
                    
                    Label_1334:
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(1957011998))
                        goto(Label_1082)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0922)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0653)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(524288)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_608 = and:int(var_3_608:int, ldc:int(1875624810))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1437:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_613 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1448:
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(2071595488))
                        goto(Label_1082)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(8)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-660221238))
                        goto(Label_0922)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(32)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-894959111))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0653)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_608:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(64)), ldc:int(0))) {
                        var_3_608 = and:int(var_3_608:int, ldc:int(-1396575328))
                        var_17_613 = add:int(var_16_119:int, xor:int(ldc:int(-24319), ldc:int(-24320)))
                        looporswitchbreak()
                    }
                }
                
                var_3_608 = and:int(var_3_608:int, ldc:int(-1128924311))
                
                if (cmple:boolean(var_5_85 = var_17_613:int, sub:int(var_6_8C:int, and:int(ldc:int(13345), ldc:int(1))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_608:int, ldc:int(16384)), ldc:int(0))) {
            var_3_608 = and:int(var_3_608:int, ldc:int(-49689834))
            goto(Label_0106)
        }
    }
}
