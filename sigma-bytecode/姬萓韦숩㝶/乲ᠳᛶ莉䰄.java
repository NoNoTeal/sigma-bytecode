public class \u59ec\u8413\u97e6\uc229\u3776.\u4e72\u1833\u16f6\u8389\u4c04 {
    public void \u4e72\u1833\u16f6\u8389\u4c04() {
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
            invokespecial:\u0c95\u8cae\u67e9\u67e9\ub18d(\u0c95\u8cae\u67e9\u67e9\ub18d::<init>, this:\u4e72\u1833\u16f6\u8389\u4c04)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Set<\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\ud36e\u4bc8\u6d69\u92ee\ubb2b<?>> \u3504\u8258\u1833\uc246\u98a4\u6cfe() {
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
            return:Set<\ud36e\u4bc8\u6d69\u92ee\ubb2b<?>>(invokestatic:ImmutableSet[expected:Set<\ud36e\u4bc8\u6d69\u92ee\ubb2b<?>>](ImmutableSet::of, getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\u120d\u8bb0\u836c\u64f2\u3504>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u7c6b\u3c25\u446c\ubff1\u3d64\uae87)))
        }
        
        goto(Label_0006)
    }
    
    public void \u36d3\u120d\u3bc9\uf94d\u6d69\u0b8e(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be p1) {
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
    
    public void \u36d3\u120d\u3bc9\uf94d\u6d69\u0b8e(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
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
            invokevirtual:void(\u4e72\u1833\u16f6\u8389\u4c04::\u36d3\u120d\u3bc9\uf94d\u6d69\u0b8e, this:\u4e72\u1833\u16f6\u8389\u4c04, p0:\ube23\uc238\u5140\u4cd9\u8aa5, checkcast:\u4f4a\uafe7\u76bc\u392e\ub8be(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be.class, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u4f4a\uafe7\u76bc\u392e\ub8be]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u6c52\u647c\u4f52\u0800\u8709\u8d98$2(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be p0, \u3d64\u7af6\uae87\uc238\u7d52.\u120d\u8bb0\u836c\u64f2\u3504 p1) {
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
            return:boolean(invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\ubded\u120d\u600f\ua068\u4f52\u8308, p1:\u120d\u8bb0\u836c\u64f2\u3504[expected:\u7d52\u718f\u3776\u6fb0\ub83f], p0:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f], ldc:double(9.0)))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\ubff1\u7d52\ubded\uc238\ua562\ub171$1(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be p0, \u3d64\u7af6\uae87\uc238\u7d52.\u120d\u8bb0\u836c\u64f2\u3504 p1) {
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
            return:boolean(invokevirtual:boolean(\u4f4a\uafe7\u76bc\u392e\ub8be::\u8350\u5654\u93a2\u9af2\u5140\u0a06, p0:\u4f4a\uafe7\u76bc\u392e\ub8be, invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u120d\u8bb0\u836c\u64f2\u3504::\ua61f\u61a4\u9937\u9255\ubded\uceb8, p1:\u120d\u8bb0\u836c\u64f2\u3504)))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\uc4d2\ud51e\u7330\u5fe1\u3504\u8c8a$0(\u3d64\u7af6\uae87\uc238\u7d52.\u120d\u8bb0\u836c\u64f2\u3504 p0) {
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
            return:boolean(and:int[expected:boolean](ldc:int(5441), ldc:int(8883)))
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
    
    public void \ud171\uc910\ubff1\uc31c\u9937\u2dcc(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6A4 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D3 : int
        var_11_E4 : int
        var_14_10E : double
        var_16_112 : int
        var_12_10A : double
        var_17_6AF : int
        
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
        var_3_6A4 = and:int(ldc:int(1221361829), ldc:int(-323123753))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4e72\u1833\u16f6\u8389\u4c04[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(65536)), ldc:int(0))) {
            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(958272188))
        }
        else {
            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-894531957))
            var_5_85 = and:int(ldc:int(307), ldc:int(-308))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-28683), ldc:int(28682)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D3 = and:int(var_3_6A4:int, ldc:int(1258197237))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E4 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E4:int, sub:int(var_6_8C:int, xor:int(ldc:int(8608), ldc:int(8609)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E4:int, xor:int(ldc:int(-31744), ldc:int(-31743)))), var_7_9B:double))) {
                        inc:int(var_11_E4, ldc:int(1))
                    }
                    
                    var_3_6A4 = and:int(var_3_D3:int, ldc:int(-355075697))
                    var_14_10E = var_7_9B:double
                    var_16_112 = var_11_E4:int
                }
                else {
                    var_11_E4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(7265), ldc:int(153)))
                    var_12_10A = var_14_10E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_112 = var_11_E4:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E4:int)
                        var_16_112 = var_11_E4:int
                        var_14_10E = var_12_10A:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1926569472))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1168)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1488322642))
                        goto(Label_1000)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1186101827))
                        goto(Label_0850)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1341341337))
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1665549205))
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-621444215))
                        
                        if (cmplt:boolean(var_16_112:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0568)
                            }
                            
                            goto(Label_0850)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-407444282))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1168)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1000)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1017349159))
                        goto(Label_0850)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1546482825))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-297481329))
                            var_11_E4 = and:int(ldc:int(-9913), ldc:int(9912))
                            goto(Label_1569)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0568:
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1593622639))
                        goto(Label_1580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1168)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-930157969))
                        goto(Label_1000)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-584186283))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-2028867701))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1834344571))
                            loopcontinue()
                        }
                        
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1331617689))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10E = var_9_C1:double
                            goto(Label_0850)
                        }
                    }
                    
                    Label_0702:
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1919546747))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1919478844))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1568650439))
                        goto(Label_1168)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1000)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1788525666))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(958001560))
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1799844718))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(2052519849))
                        var_14_10E = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10E:double))
                    }
                    
                    Label_0850:
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(947966299))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1024264124))
                        goto(Label_1168)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(2054405737))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-534886476))
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(428979902))
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(104388656))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(2069596262))
                            loopcontinue()
                        }
                        
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-585703037))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E4 = and:int(ldc:int(5123), ldc:int(27409))
                                goto(Label_1168)
                            }
                        }
                    }
                    
                    Label_1000:
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1256289868))
                        goto(Label_1580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1125446298))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1867703424))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0850)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1442479391))
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-811812549))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-657487689))
                        var_11_E4 = and:int(ldc:int(16517), ldc:int(-16518))
                    }
                    
                    Label_1168:
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-2049162359))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1657260065))
                            goto(Label_1000)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0850)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1436496326))
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1877776823))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E4:int, ldc:int(0))) {
                                goto(Label_1425)
                            }
                        }
                    }
                    
                    Label_1283:
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1644362219))
                            goto(Label_1168)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_1000)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(463328965))
                            goto(Label_0850)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(368610566))
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1419647111))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1919573284))
                            loopcontinue()
                        }
                        
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(2125259467))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10E:double, var_5_85:int, var_16_112:int)
                        goto(Label_1569)
                    }
                    
                    Label_1425:
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1054578901))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1168)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(801502922))
                        goto(Label_1000)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1404212030))
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1614428317))
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-8908676))
                        loopcontinue()
                    }
                    
                    var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-885152111))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10E:double, ldc:double(0.0))
                    Label_1569:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6AF = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1580:
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(103722708))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1642685693))
                        goto(Label_1168)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1425287892))
                        goto(Label_1000)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1285306997))
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1324662692))
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-35211837))
                        var_17_6AF = add:int(var_16_112:int, xor:int(ldc:int(1440), ldc:int(1441)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-297366591))
                
                if (cmple:boolean(var_5_85 = var_17_6AF:int, sub:int(var_6_8C:int, xor:int(ldc:int(-16384), ldc:int(-16383))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(1073741824)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
