public class \u5d20\u97b7\u8753\u873d\u16f6.\ucfaf\u5d20\ub171\u6435\u6cfe\u392e {
    public void \ucfaf\u5d20\ub171\u6435\u6cfe\u392e(\u59ec\u8413\u97e6\uc229\u3776.\u4daf\u9af2\u718f\u3504\uc4d2\u67e9 p0) {
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
            invokespecial:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u9af2\u1833\u156b\u12cb\u7d52\u6c52::<init>, this:\ucfaf\u5d20\ub171\u6435\u6cfe\u392e, p0:\u4daf\u9af2\u718f\u3504\uc4d2\u67e9)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u6cfe\uc229\ua068\u516c\u3d64\u8389(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0, \u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p1, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p2, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p3, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p4) {
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
    
    public boolean \u927d\u5140\u12b2\ud4fe\ub102\ub70c(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0) {
        stack_B2_0 : int [generated]
        
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
            
            if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u71f1\ubcb0\u7043\u836c\u3bd6\u2dcc)))) {
                if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u3d64\u99f7\uf94d\u7006\u6cfe\u12b2)))) {
                    if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u16f6\uc2e8\u9af2\u946b\ubb2b\u99f7)))) {
                        stack_B2_0 = and:int[expected:boolean](ldc:int(14429), ldc:int(-14430))
                        return:boolean(stack_B2_0:boolean)
                    }
                }
            }
            
            stack_B2_0 = and:int[expected:boolean](ldc:int(27271), ldc:int(321))
            return:boolean(stack_B2_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    public float \u4cd9\ucb79\u392e\u69d9\uc29a\u3711(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1) {
        var_3_AB : int
        stack_C0_0 : float [generated]
        
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
            var_3_AB = and:int(ldc:int(470161020), ldc:int(1591639913))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u71f1\ubcb0\u7043\u836c\u3bd6\u2dcc)))) {
                if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\uc29a\u8350\u8bb0\u4cd9\u51fa\u839e<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>[expected:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>](\u69d9\u7bad\u8709\u9937\u446c\u67d0::\ub19c\uc2e8\u7af6\u4bc8\u7049\u3504)))) {
                    if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\uc29a\u8350\u8bb0\u4cd9\u51fa\u839e<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>[expected:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>](\u69d9\u7bad\u8709\u9937\u446c\u67d0::\uff55\u8d98\u47c2\u494c\u4975\u718f)))) {
                        goto(Label_0160)
                    }
                    
                    stack_C0_0 = ldc:float(5.0f)
                    return:float(stack_C0_0:float)
                }
            }
            
            Label_0106:
            
            if (cmpeq:boolean(and:int(var_3_AB:int, ldc:int(2)), ldc:int(0))) {
                return:float(ldc:float(15.0f))
            }
            
            var_3_AB = and:int(var_3_AB:int, ldc:int(-831607226))
            Label_0160:
            
            if (cmpeq:boolean(and:int(var_3_AB:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0106)
            }
            
            var_3_AB = and:int(var_3_AB:int, ldc:int(-7522604))
            stack_C0_0 = invokespecial:float(\u9af2\u1833\u156b\u12cb\u7d52\u6c52::\u4cd9\ucb79\u392e\u69d9\uc29a\u3711, this:\ucfaf\u5d20\ub171\u6435\u6cfe\u392e[expected:\u9af2\u1833\u156b\u12cb\u7d52\u6c52], p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
            return:float(stack_C0_0:float)
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u69d9\u6d99\ub18d\u8413\u4179\u69d9$0(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
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
            invokevirtual:void(\ube23\u67d0\u64f2\u839e\u76bc::\u5f50\u3c25\ufcaf\u12b2\u8753\u12cb, p0:\ube23\u67d0\u64f2\u839e\u76bc, getstatic:\u392e\uc3e3\uc910\u4c2b\u6c52(\u392e\uc3e3\uc910\u4c2b\u6c52::\ub18d\ucef1\ub6ab\u7c6b\u647c\ucfaf))
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
    
    public void \u88c5\u6d99\ud171\ub70c\uc229\u76bc(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5C8 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5D3 : int
        
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
        var_3_5C8 = and:int(ldc:int(-2146809269), ldc:int(-858166529))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ucfaf\u5d20\ub171\u6435\u6cfe\u392e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_5C8 = and:int(var_3_5C8:int, ldc:int(-1284937253))
            var_5_7D = and:int(ldc:int(8434), ldc:int(-8691))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(20746), ldc:int(-21355)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5C8:int, ldc:int(-1818538533))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(1040), ldc:int(1041)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(49), ldc:int(17419)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5C8 = and:int(var_3_D2:int, ldc:int(-11875973))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(-20472), ldc:int(-20471)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(299479452))
                        goto(Label_1367)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1142)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(-270690908))
                        goto(Label_0898)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0751)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(-528667234))
                        goto(Label_0625)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(-302847632))
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(-715609381))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0525)
                            }
                            
                            goto(Label_0751)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1367)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(885462523))
                        goto(Label_1142)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0898)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0751)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0625)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5C8 = and:int(var_3_5C8:int, ldc:int(1949860356))
                            loopcontinue()
                        }
                        
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(-1717990661))
                        var_11_E3 = and:int(ldc:int(7697), ldc:int(-16086))
                        goto(Label_1356)
                    }
                    
                    Label_0525:
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1367)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(776470114))
                        goto(Label_1142)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0898)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0751)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(853118665))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(-1097052677))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0751)
                        }
                    }
                    
                    Label_0625:
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1367)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(-169186716))
                        goto(Label_1142)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(-95207188))
                        goto(Label_0898)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(815297891))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5C8 = and:int(var_3_5C8:int, ldc:int(138681737))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(-51536929))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0751:
                    
                    if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(294349186))
                        goto(Label_1367)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(1067264350))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(1863652066))
                        goto(Label_1142)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(1032258636))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(-1474744189))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0625)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5C8 = and:int(var_3_5C8:int, ldc:int(-1010269868))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5C8 = and:int(var_3_5C8:int, ldc:int(1598601785))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(-815223857))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:boolean(0), ldc:boolean(1))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0898:
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1367)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(-1586678197))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1142)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(-180480109))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5C8 = and:int(var_3_5C8:int, ldc:int(69664684))
                            goto(Label_0751)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5C8 = and:int(var_3_5C8:int, ldc:int(-234052518))
                            goto(Label_0625)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(-111165845))
                        var_11_E3 = and:int(ldc:int(18537), ldc:int(-18540))
                    }
                    
                    Label_1051:
                    
                    if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1367)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0898)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0751)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0625)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5C8 = and:int(var_3_5C8:int, ldc:int(-1428544626))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(-2090116273))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1253)
                            }
                        }
                    }
                    
                    Label_1142:
                    
                    if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1367)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1051)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5C8 = and:int(var_3_5C8:int, ldc:int(1971087976))
                            goto(Label_0898)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0751)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0625)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5C8 = and:int(var_3_5C8:int, ldc:int(1526883017))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5C8 = and:int(var_3_5C8:int, ldc:int(-1961977601))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1356)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1253:
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1367)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1142)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0898)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0751)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0625)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(-611778569))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(2048)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5C8 = and:int(var_3_5C8:int, ldc:int(-1067660193))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1356:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5D3 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1367:
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(546296388))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1142)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(900826462))
                        goto(Label_0898)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(1280374750))
                        goto(Label_0751)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0625)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(-1487603427))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C8:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5C8 = and:int(var_3_5C8:int, ldc:int(-806822817))
                        var_17_5D3 = add:int(var_16_111:int, and:int(ldc:int(16385), ldc:int(14351)))
                        looporswitchbreak()
                    }
                    
                    var_3_5C8 = and:int(var_3_5C8:int, ldc:int(-1774243155))
                }
                
                var_3_5C8 = and:int(var_3_5C8:int, ldc:int(-754386337))
                
                if (cmple:boolean(var_5_7D = var_17_5D3:int, sub:int(var_6_84:int, and:int(ldc:int(4133), ldc:int(28545))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5C8:int, ldc:int(1024)), ldc:int(0))) {
            var_3_5C8 = and:int(var_3_5C8:int, ldc:int(786063054))
            goto(Label_0106)
        }
    }
}
