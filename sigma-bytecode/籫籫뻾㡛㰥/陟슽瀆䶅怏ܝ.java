public final class \u7c6b\u7c6b\ubefe\u385b\u3c25.\u965f\uc2bd\u7006\u4d85\u600f\u071d {
    public void \u965f\uc2bd\u7006\u4d85\u600f\u071d() {
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
            invokespecial:\u5d20\u6bb9\ub113\u983f\u47c2\u718f(\u5d20\u6bb9\ub113\u983f\u47c2\u718f::<init>, this:\u965f\uc2bd\u7006\u4d85\u600f\u071d)
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
    
    private static void lambda$\u9937\u97e6\u12b2\u4c2b\u67d0\ub102$2(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p0) {
        var_1_5F : int
        stack_91_1 : \u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean> [generated]
        stack_8E_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-1600227900), ldc:int(-1698827393))
            stack_91_1 = getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8)
            
            if (invokeinterface:boolean(\u9255\ubcb0\uf94d\u760c\u9255\uc229::\u3bd6\u7ce1\ub171\u92ff\u3e2a\uf995, invokestatic:\u9255\ubcb0\uf94d\u760c\u9255\uc229(\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b::\u4d85\u8413\u12cb\u4daf\u5db4\u8c8a))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1067377647))
                stack_8E_0 = and:int(ldc:int(-21362), ldc:int(17265))
            }
            else {
                stack_8E_0 = and:int(ldc:int(17921), ldc:int(12417))
            }
            
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, stack_91_1:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>, invokestatic:Boolean(Boolean::valueOf, stack_8E_0:boolean[expected:int]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ube23\u16f6\u8640\u965f\u8df4\u8c8a$1(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p0) {
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
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Long>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u4bc8\u51b2\u6bb9\u64f2\u4e72\u4975), invokestatic:Long(Long::valueOf, ldc:long(0L)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\uc87f\u9a18\u9af2\ua3b4\u4c2b\ub83f$0(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p0) {
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
            invokevirtual:void(\u4f52\u6bb9\u965f\u6435\u8c8a\u516c::\u6198\u4daf\u5245\u34df\ub18d\uc7fe, checkcast:\u5bc4\uc2bd\u5db4\u6ec6\ua3b4\u759a[expected:\u4f52\u6bb9\u965f\u6435\u8c8a\u516c](\ud36e\u6bb9\u960f\u4c04\u64ab.\u5bc4\uc2bd\u5db4\u6ec6\ua3b4\u759a.class, invokevirtual:\u5bc4\uc2bd\u5db4\u6ec6\ua3b4\u759a(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u4d85\u71f1\u6435\u1833\u1187\u6435, invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4), ldc:Class<\u5bc4\uc2bd\u5db4\u6ec6\ua3b4\u759a>(\ud36e\u6bb9\u960f\u4c04\u64ab.\u5bc4\uc2bd\u5db4\u6ec6\ua3b4\u759a.class))), invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u120d\u51b2\u071d\u071d\u5140\u0800, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u6198\u4975\ub83f\ub7dc\u3d64\u5140), and:int(ldc:int(3800), ldc:int(-7897))))), getstatic:\ub113\ub6ab\ud7e8\ud217\u67d0\u3e75[expected:\ubb2b\uf9c5\u98a4\ucfaf\u92ff\u3dd3](\ub113\ub6ab\ud7e8\ud217\u67d0\u3e75::\u9255\ub171\ud12e\u16f6\u7e3f\u836c))
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
        var_3_634 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_63F : int
        
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
        var_3_634 = and:int(ldc:int(-2014574920), ldc:int(-145901641))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u965f\uc2bd\u7006\u4d85\u600f\u071d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_634 = and:int(var_3_634:int, ldc:int(204678403))
        }
        else {
            var_3_634 = and:int(var_3_634:int, ldc:int(-1411502094))
            var_5_85 = and:int(ldc:int(-2388), ldc:int(2387))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(4323), ldc:int(-4332)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_634:int, ldc:int(-2105866307))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:boolean(0), ldc:boolean(1)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(899), ldc:int(13397)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_634 = and:int(var_3_DA:int, ldc:int(-1437932566))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(-32440), ldc:int(-32439)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-934904374))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(128)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1767324790))
                        goto(Label_1073)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(128)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(903560229))
                        goto(Label_0819)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0686)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0550)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1547096346))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0550)
                            }
                            
                            goto(Label_0819)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(128)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(100414087))
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-386082833))
                        goto(Label_1350)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(868459303))
                        goto(Label_1073)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(827957626))
                        goto(Label_0819)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1563984260))
                        goto(Label_0686)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-564221200))
                            var_11_EB = and:int(ldc:int(13322), ldc:int(-29739))
                            goto(Label_1479)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0550:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1774304082))
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1904151554))
                        goto(Label_1073)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(128)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(508007052))
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(356374656))
                        goto(Label_0819)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(1089516025))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(82304869))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-286482753))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0819)
                        }
                    }
                    
                    Label_0686:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(911896649))
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1073)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1572889868))
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-745966842))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(1499698203))
                            goto(Label_0550)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1477236720))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1168206942))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0819:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(222650605))
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-480058195))
                        goto(Label_1073)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1656828943))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-826355581))
                            goto(Label_0686)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0550)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-280268822))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(2961), ldc:int(24611))
                                goto(Label_1073)
                            }
                        }
                    }
                    
                    Label_0937:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1003788333))
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0819)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(693712432))
                            goto(Label_0686)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0550)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-2024961106))
                        var_11_EB = and:int(ldc:int(-31337), ldc:int(12840))
                    }
                    
                    Label_1073:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1166206863))
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1368413947))
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1327427706))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(953979572))
                            goto(Label_0937)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0819)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0686)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(786845423))
                            goto(Label_0550)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-405923841))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1350)
                            }
                        }
                    }
                    
                    Label_1202:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1572287329))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1352401102))
                            goto(Label_1073)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0937)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1005909226))
                            goto(Label_0819)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0686)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(710411730))
                            goto(Label_0550)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(1746500628))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-20232824))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-26283293))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1479)
                    }
                    
                    Label_1350:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(128)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1685110031))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(728101954))
                        goto(Label_1073)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1113101333))
                        goto(Label_0819)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(2128236553))
                        goto(Label_0686)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0550)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_634 = and:int(var_3_634:int, ldc:int(-2090271002))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1479:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63F = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1490:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-238945852))
                        goto(Label_1350)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-2113511505))
                        goto(Label_1073)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0819)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0686)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1647212357))
                        goto(Label_0550)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(128)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-271799558))
                        var_17_63F = add:int(var_16_119:int, xor:int(ldc:int(16385), ldc:int(16384)))
                        looporswitchbreak()
                    }
                }
                
                var_3_634 = and:int(var_3_634:int, ldc:int(-1494326531))
                
                if (cmple:boolean(var_5_85 = var_17_63F:int, sub:int(var_6_8C:int, xor:int(ldc:int(4512), ldc:int(4513))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2048)), ldc:int(0))) {
            var_3_634 = and:int(var_3_634:int, ldc:int(324072495))
            goto(Label_0106)
        }
    }
}
