public class \u12b2\u4e72\u8df4\u67e9\u67e9.\u183a\ufcaf\u839e\ubff1\u527a\uc84e {
    public void \u183a\ufcaf\u839e\ubff1\u527a\uc84e(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u6198\u6c56\u3bd6\u67e9\u839e p0) {
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
            invokespecial:\u6198\u72f1\uc7fe\uc238\u1187\u12b2(\u6198\u72f1\uc7fe\uc238\u1187\u12b2::<init>, this:\u183a\ufcaf\u839e\ubff1\u527a\uc84e, p0:\ufcaf\u6198\u6c56\u3bd6\u67e9\u839e)
            putfield:\u960f\u7873\uc2e8\u0c95\u12cb\u6198(\u183a\ufcaf\u839e\ubff1\u527a\uc84e::\u69d9\u71ae\u92ee\u7c6b\u960f\uf94d, this:\u183a\ufcaf\u839e\ubff1\u527a\uc84e, initobject:\u960f\u7873\uc2e8\u0c95\u12cb\u6198(\u960f\u7873\uc2e8\u0c95\u12cb\u6198::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u69d9\u76bc\u6435\ud217\u8cae\u8350(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ucef1\u759a\u40a9\u7c6b\u8258 p0, float p1, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p2, \u927d\u92ff\u71ae\uafe7\u6bb9.\u12cb\u12b2\ua3b4\u183a\ud158\u51fa p3, int p4, int p5) {
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
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ubcb0\ud171\u516c\u76bc\u8cae\u99f7 \u5fe1\u8350\u759a\u6d99\u4492\ud4fe(\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a p0) {
        var_1_61 : int
        var_3_72 : \u2dcc\u9937\ub102\u3a62\u3e75\u960f
        
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
            var_1_61 = and:int(ldc:int(354804115), ldc:int(1569978701))
            
            if (logicalnot:boolean(instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\uc31c\u6bb9\ub83f\ud7e8\uafe7\u51b2.class, p0:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1358168813))
                var_3_72 = getstatic:\u2dcc\u9937\ub102\u3a62\u3e75\u960f(\u2dcc\u9937\ub102\u3a62\u3e75\u960f::\u8c8a\u873d\ua3b4\u516c\u7af6\u183a)
            }
            else {
                var_3_72 = invokevirtual:\u2dcc\u9937\ub102\u3a62\u3e75\u960f(\uc31c\u6bb9\ub83f\ud7e8\uafe7\u51b2::\u6cfe\u1833\u98a4\u7006\u9255\ubcb0, checkcast:\uc31c\u6bb9\ub83f\ud7e8\uafe7\u51b2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\uc31c\u6bb9\ub83f\ud7e8\uafe7\u51b2.class, p0:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[expected:\uc31c\u6bb9\ub83f\ud7e8\uafe7\u51b2]))
            }
            
            return:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7(invokestatic:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7(\uf995\u3e75\u946b\uf995\u4c2b\ucfaf::\uc31c\u1833\u4c04\u6fb0\u71f1\ub83f, var_3_72:\u2dcc\u9937\ub102\u3a62\u3e75\u960f))
        }
        
        goto(Label_0006)
    }
    
    private static boolean \u71ae\u5d20\u16f6\ufe34\u7049\u92ff(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ucef1\u759a\u40a9\u7c6b\u8258 p0) {
        var_3_99 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        
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
        
        if (logicalnot:boolean(getstatic:boolean(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u69d9\uc2bd\uc9f6\u0b8e\ubded\u7bad))) {
            if (logicalnot:boolean(getstatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u946b\uc910\u61a4\u416d\uff55\ubded))) {
                var_3_99 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\ucb79\u7873\ub7dc\u7043\u34df\uceb8, p0:\ucef1\u759a\u40a9\u7c6b\u8258[expected:\ub83f\uc9f6\u47c2\u67d0\u7ce1])
                
                if (cmpgt:boolean(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u3e2a\ua3b4\u4975\u4179\u64f2\u6c52, invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\uc229\u8aa5\u873d\u0b8e\u4975, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_3_99:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_3_99:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_3_99:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))), getstatic:double(\u183a\ufcaf\u839e\ubff1\u527a\uc84e::\uc246\ua61f\u97b7\u3504\uc229\uc2e8))) {
                    return:boolean(and:int[expected:boolean](ldc:int(9946), ldc:int(-30460)))
                }
            }
            
            return:boolean(xor:int[expected:boolean](ldc:int(72), ldc:int(73)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(25356), ldc:int(-29453)))
    }
    
    public static void \u9255\u8413\u5bc4\ufe34\ub6ab\u5140() {
        var_2_65 : \u67e9\u4daf\u760c\ud217\ua6bd\ubff1
        var_5_89 : double
        
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
            var_2_65 = invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)
            var_5_89 = invokestatic:double(Math::max, div:double(mul:double(ldc:double(1.5), i2d:double(invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\uff55\ua068\ubcb0\u67e9\u56bd\u071d, invokevirtual:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u52d3\u8709\ubf56\uc238\ufcaf\ua562, var_2_65:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))), invokestatic:double(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u6cfe\uff55\u6fb0\ub1b9\u8389\u9033, getfield:double(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u1833\u516c\u8709\u51fa\ub32d\u4c04, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, var_2_65:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), ldc:double(1.0), ldc:double(120.0))), ldc:double(16.0))
            putstatic:double(\u183a\ufcaf\u839e\ubff1\u527a\uc84e::\uc246\ua61f\u97b7\u3504\uc229\uc2e8, mul:double(var_5_89:double, var_5_89:double))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u69d9\u76bc\u6435\ud217\u8cae\u8350(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1 p0, float p1, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p2, \u927d\u92ff\u71ae\uafe7\u6bb9.\u12cb\u12b2\ua3b4\u183a\ud158\u51fa p3, int p4, int p5) {
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
            invokevirtual:void(\u183a\ufcaf\u839e\ubff1\u527a\uc84e::\u69d9\u76bc\u6435\ud217\u8cae\u8350, this:\u183a\ufcaf\u839e\ubff1\u527a\uc84e, checkcast:\ucef1\u759a\u40a9\u7c6b\u8258(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ucef1\u759a\u40a9\u7c6b\u8258.class, p0:\ub83f\uc9f6\u47c2\u67d0\u7ce1[expected:\ucef1\u759a\u40a9\u7c6b\u8258]), p1:float, p2:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p3:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, p4:int, p5:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \u5d20\u7043\u88c5\u5db4\uf94d.\u718f\u8413\u1833\u72f1\u5fe1\u927d lambda$\u1833\u9a18\uc246\u4179\ub7dc\u16f6$0(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ucef1\u99f7\u4e72\u7873\u0800\u72f1 p0, net.minecraft.util.text.ITextComponent p1) {
        var_2_61 : int
        var_4_69 : List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>
        stack_9C_0 : \u718f\u8413\u1833\u72f1\u5fe1\u927d [generated]
        
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
            var_2_61 = and:int(ldc:int(-260823477), ldc:int(-253960229))
            var_4_69 = invokevirtual:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\uc7fe\u3bd6\u5db4\u4cd9\u8413\u6d69, p0:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, p1:ITextComponent[expected:ITextProperties], ldc:int(90))
            
            if (logicalnot:boolean(invokeinterface:boolean(List::isEmpty, var_4_69:List))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-179538245))
                stack_9C_0 = checkcast:\u718f\u8413\u1833\u72f1\u5fe1\u927d(\u5d20\u7043\u88c5\u5db4\uf94d.\u718f\u8413\u1833\u72f1\u5fe1\u927d.class, invokeinterface:\u718f\u8413\u1833\u72f1\u5fe1\u927d(List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>::get, var_4_69:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>, and:int(ldc:int(-32340), ldc:int(32336))))
            }
            else {
                stack_9C_0 = getstatic:\u718f\u8413\u1833\u72f1\u5fe1\u927d(\u718f\u8413\u1833\u72f1\u5fe1\u927d::\u64f2\u3c25\u67e9\u8d90\u67d0\u8709)
            }
            
            return:\u718f\u8413\u1833\u72f1\u5fe1\u927d(stack_9C_0:\u718f\u8413\u1833\u72f1\u5fe1\u927d)
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
            putstatic:double(\u183a\ufcaf\u839e\ubff1\u527a\uc84e::\uc246\ua61f\u97b7\u3504\uc229\uc2e8, ldc:double(4096.0))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub6ab\ud523\ub83f\u3e2a\u1833\u836c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6C3 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6CE : int
        
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
        var_3_6C3 = and:int(ldc:int(-1206994567), ldc:int(671939546))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u183a\ufcaf\u839e\ubff1\u527a\uc84e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(356269508))
        }
        else {
            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-109217442))
            var_5_8A = and:int(ldc:int(5460), ldc:int(-5973))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-16065), ldc:int(15936)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6C3:int, ldc:int(-22021690))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, and:int(ldc:int(4693), ldc:int(8321)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(16403), ldc:int(16402)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6C3 = and:int(var_3_DA:int, ldc:int(991460320))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(8256), ldc:int(8257)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-326306167))
                        goto(Label_1627)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-407399283))
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1749084398))
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1040)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0906)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1366138715))
                        goto(Label_0756)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(788413565))
                        goto(Label_0622)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1541034473))
                    }
                    else {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1071495499))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0622)
                            }
                            
                            goto(Label_0906)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1696943308))
                        goto(Label_1627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(393069518))
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1373772780))
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-84403023))
                        goto(Label_1040)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0906)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1982086441))
                        goto(Label_0756)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(432456600))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1380260548))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-100779024))
                        var_11_EB = and:int(ldc:int(-17920), ldc:int(17567))
                        goto(Label_1616)
                    }
                    
                    Label_0622:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1140658781))
                        goto(Label_1627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-178890107))
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1521464684))
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1559264844))
                        goto(Label_1040)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0906)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1841773764))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(800734705))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0906)
                        }
                    }
                    
                    Label_0756:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1627)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1139778150))
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(2083618856))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(2028842937))
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1040)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(767153558))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0622)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(318386189))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1219597213))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1137704994))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0906:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1470)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1866030065))
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(923015190))
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0756)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1285518566))
                            goto(Label_0622)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1920008187))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(98369237))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-332775988))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(1), ldc:int(10765))
                                goto(Label_1182)
                            }
                        }
                    }
                    
                    Label_1040:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1627)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1470)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0906)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0756)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0622)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(2040856559))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1160902503))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-270876716))
                        var_11_EB = and:int(ldc:int(-5419), ldc:int(5418))
                    }
                    
                    Label_1182:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1167564926))
                        goto(Label_1627)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1290694783))
                            goto(Label_1040)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0906)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1262192629))
                            goto(Label_0756)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-378375821))
                            goto(Label_0622)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-96567317))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1470)
                            }
                        }
                    }
                    
                    Label_1307:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(738828305))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-971636849))
                            goto(Label_1182)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-2115680169))
                            goto(Label_1040)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0906)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(120395197))
                            goto(Label_0756)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(242158460))
                            goto(Label_0622)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1648507316))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1302195957))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1137018013))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                        goto(Label_1616)
                    }
                    
                    Label_1470:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-2126714178))
                        goto(Label_1627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(913780025))
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1666370723))
                        goto(Label_1040)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1878018915))
                        goto(Label_0906)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0756)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-777806455))
                        goto(Label_0622)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-375865994))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1616:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6CE = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1627:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1470)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1978711687))
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1196075017))
                        goto(Label_1040)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0906)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1233158934))
                        goto(Label_0756)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0622)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1006485345))
                        var_17_6CE = add:int(var_16_119:int, xor:int(ldc:int(21008), ldc:int(21009)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1805613521))
                
                if (cmple:boolean(var_5_8A = var_17_6CE:int, sub:int(var_6_91:int, xor:int(ldc:int(19458), ldc:int(19459))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
