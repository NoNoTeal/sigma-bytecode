public class \u6b0d\u12cb\u156b\u4179\u8bb0.\u156b\u3e2a\u93a2\u8709\ub171\u3bc9 {
    public void \u156b\u3e2a\u93a2\u8709\ub171\u3bc9(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u47c2\ubded\u12cb\u3dd3\u12cb\u0800 p0) {
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
            invokespecial:\u56bd\u34df\uc246\ua6bd\uc238\u5fe1(\u56bd\u34df\uc246\ua6bd\uc238\u5fe1::<init>, this:\u156b\u3e2a\u93a2\u8709\ub171\u3bc9, p0:\u47c2\ubded\u12cb\u3dd3\u12cb\u0800)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u9af2\ucef1\ub102\u16f6\u61a4\ud523 \u6bb9\u6435\uc31c\u3bd6\u7043\u9255(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p3, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\ub113\u6c56\u97e6\u51b2\u4c2b p4, \ub113\uc4d2\u183a\u527a\u6435.\ud4fe\u120d\u9a18\u385b\u4492\u5f50 p5) {
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
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u760c\u7330\u71f1\u4bc8\u392e\u4d85 \ua61f\u16f6\u5bc4\u1187\u8389\u385b() {
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
            return:\u760c\u7330\u71f1\u4bc8\u392e\u4d85(checkcast:\u760c\u7330\u71f1\u4bc8\u392e\u4d85(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u760c\u7330\u71f1\u4bc8\u392e\u4d85.class, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[expected:\u760c\u7330\u71f1\u4bc8\u392e\u4d85](\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u99f7\uf995\ubff1\ua068\u5245\u12cb)))
        }
        
        goto(Label_0006)
    }
    
    public \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc29a\ud36e\ubff1\ub7dc\u3e75\u6ec6 \u647c\u7049\ubf56\u071d\u8389\u385b() {
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
            return:\uc29a\ud36e\ubff1\ub7dc\u3e75\u6ec6(checkcast:\uc29a\ud36e\ubff1\ub7dc\u3e75\u6ec6(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc29a\ud36e\ubff1\ub7dc\u3e75\u6ec6.class, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[expected:\uc29a\ud36e\ubff1\ub7dc\u3e75\u6ec6](\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\uafe7\ubf56\ud523\u6435\u76bc\ub171)))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u3d4b\u0a06\u2dcc\uc31c\uc910\ud51e$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\ub113\u6c56\u97e6\u51b2\u4c2b p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p1) {
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
            invokevirtual:void(\ube23\u67d0\u64f2\u839e\u76bc::\u5f50\u3c25\ufcaf\u12b2\u8753\u12cb, p1:\ua3b4\u8aa5\ub113\ubf56\u873d[expected:\ube23\u67d0\u64f2\u839e\u76bc], p0:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b)
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
    
    public void \u9a18\u61a4\u8c8a\u5245\u1187\u7bad(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_674 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_67F : int
        
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
        var_3_674 = and:int(ldc:int(-942468570), ldc:int(-713337287))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u156b\u3e2a\u93a2\u8709\ub171\u3bc9[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8)), ldc:int(0))) {
            var_3_674 = and:int(var_3_674:int, ldc:int(-1382299418))
        }
        else {
            var_3_674 = and:int(var_3_674:int, ldc:int(483572273))
            var_5_8A = and:int(ldc:int(-5522), ldc:int(1425))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(9320), ldc:int(-9450)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_674:int, ldc:int(1733475004))
                    var_9_C7 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_91:int, and:int(ldc:int(17179), ldc:int(8261)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, and:int(ldc:int(9), ldc:int(1)))), var_7_A0:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_674 = and:int(var_3_D9:int, ldc:int(2113327674))
                    var_14_114 = var_7_A0:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(769), ldc:int(11283)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_91:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1566)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1721184282))
                        goto(Label_1296)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-635732286))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(119209005))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(36658939))
                        goto(Label_0863)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(512)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1431049098))
                        goto(Label_0731)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1868152638))
                        goto(Label_0588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1397707971))
                    }
                    else {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-319030294))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0588)
                            }
                            
                            goto(Label_0863)
                        }
                    }
                    
                    Label_0433:
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1252180440))
                        goto(Label_1440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(16)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-527135226))
                        goto(Label_1296)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(32)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1045148640))
                        goto(Label_0863)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0731)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(660241021))
                            var_11_EA = and:int(ldc:int(-4970), ldc:int(873))
                            goto(Label_1555)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0588:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-602354596))
                        goto(Label_1566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-958707666))
                        goto(Label_1296)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-167860306))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(128)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1045488103))
                        goto(Label_0863)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(128)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-847623119))
                            goto(Label_0433)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-1792086777))
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1663845529))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0863)
                        }
                    }
                    
                    Label_0731:
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1440)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(512)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-978014713))
                        goto(Label_1296)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(638492948))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1821026468))
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0588)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0433)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-481403387))
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(1316429422))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0863:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(946869184))
                        goto(Label_1566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(32)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1761321729))
                        goto(Label_1440)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-2082338840))
                        goto(Label_1296)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0731)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(1295306816))
                            goto(Label_0588)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-2082783173))
                            goto(Label_0433)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(1021033140))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EA = and:int(ldc:int(17001), ldc:int(3073))
                                goto(Label_1164)
                            }
                        }
                    }
                    
                    Label_0995:
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(799546075))
                        goto(Label_1566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1296)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-2059035439))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0863)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(1397084121))
                            goto(Label_0731)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(32)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-562577909))
                            goto(Label_0588)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0433)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-2009050994))
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(-822357129))
                        var_11_EA = and:int(ldc:int(29016), ldc:int(-29529))
                    }
                    
                    Label_1164:
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(32)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1914011683))
                        goto(Label_1440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(1)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-362380153))
                            goto(Label_0995)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(128)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-286176974))
                            goto(Label_0863)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(512)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-2051334411))
                            goto(Label_0731)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(128)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-402452392))
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0433)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1938672733))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1440)
                            }
                        }
                    }
                    
                    Label_1296:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1566)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(16)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(813776690))
                            goto(Label_1164)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(16)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(156242254))
                            goto(Label_0995)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0863)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(16)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-2112496169))
                            goto(Label_0731)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(512)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-1215406820))
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0433)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-1428048152))
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(746247724))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_8A:int, var_16_118:int)
                        goto(Label_1555)
                    }
                    
                    Label_1440:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-726497194))
                        goto(Label_1566)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1978466008))
                        goto(Label_1296)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0863)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0731)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0433)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(512)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_674 = and:int(var_3_674:int, ldc:int(80961318))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1555:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67F = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1566:
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1931555391))
                        goto(Label_1440)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1296)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0863)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0731)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0433)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1236118920))
                        var_17_67F = add:int(var_16_118:int, and:int(ldc:int(4097), ldc:int(413)))
                        looporswitchbreak()
                    }
                }
                
                var_3_674 = and:int(var_3_674:int, ldc:int(-421643671))
                
                if (cmple:boolean(var_5_8A = var_17_67F:int, sub:int(var_6_91:int, and:int(ldc:int(16385), ldc:int(10583))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
