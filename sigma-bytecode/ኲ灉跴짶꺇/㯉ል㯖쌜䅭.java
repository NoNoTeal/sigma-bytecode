public class \u12b2\u7049\u8df4\uc9f6\uae87.\u3bc9\u120d\u3bd6\uc31c\u416d {
    public void \u3bc9\u120d\u3bd6\uc31c\u416d() {
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
            invokespecial:\u0c95\u8cae\u67e9\u67e9\ub18d(\u0c95\u8cae\u67e9\u67e9\ub18d::<init>, this:\u3bc9\u120d\u3bd6\uc31c\u416d)
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
            return:Set<\ud36e\u4bc8\u6d69\u92ee\ubb2b<?>>(invokestatic:ImmutableSet[expected:Set<\ud36e\u4bc8\u6d69\u92ee\ubb2b<?>>](ImmutableSet::of, getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\u64f2\u718f\ub6ab\u9033\u8d90\u9033>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u3a62\ube23\u8df4\ub18d\ub102\ub83f), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\ube23\u67d0\u64f2\u839e\u76bc>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\uc84e\u8cae\ud4fe\u3d4b\u74b1\u56bd)))
        }
        
        goto(Label_0006)
    }
    
    public void \u36d3\u120d\u3bc9\uf94d\u6d69\u0b8e(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
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
    
    private static void lambda$\u7043\uc246\ua068\u76bc\ub32d\u8640$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u36d3\u9033\u6b0d\u983f\u8d90.\ub32d\u92ff\uc2bd\ud36e\ud36e p1, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p2) {
        var_3_5F : int
        
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
            var_3_5F = and:int(ldc:int(903456590), ldc:int(1431940290))
            
            if (logicalor:boolean(logicalnot:boolean(invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\u6b0d\u5bc4\u3504\u40a9\u7043\u98a4, p2:\ube23\u67d0\u64f2\u839e\u76bc)), cmpne:boolean(getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ube23\u67d0\u64f2\u839e\u76bc::\u12cb\ubf56\u647c\u7330\u446c\u836c, p2:\ube23\u67d0\u64f2\u839e\u76bc), p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-203819922))
                invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<E>::\u983f\ucfaf\ub8be\u120d\u3504\u4179, p1:\ub32d\u92ff\uc2bd\ud36e\ud36e, getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\ube23\u67d0\u64f2\u839e\u76bc>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\uc84e\u8cae\ud4fe\u3d4b\u74b1\u56bd))
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
    
    public void \ud171\uc910\ubff1\uc31c\u9937\u2dcc(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61B : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_626 : int
        
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
        var_3_61B = and:int(ldc:int(-1288156901), ldc:int(2079095706))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3bc9\u120d\u3bd6\uc31c\u416d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_61B = and:int(var_3_61B:int, ldc:int(-1705328852))
        }
        else {
            var_3_61B = and:int(var_3_61B:int, ldc:int(-1825944579))
            var_5_85 = and:int(ldc:int(-11454), ldc:int(10413))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(2353), ldc:int(-10558)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_61B:int, ldc:int(-1615246486))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(12299), ldc:int(19749)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(9216), ldc:int(9217)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_61B = and:int(var_3_DA:int, ldc:int(-1154582087))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(2097), ldc:int(9)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1440)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-518492752))
                        goto(Label_1301)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1174)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1259592246))
                        goto(Label_1056)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-2039995015))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(16255308))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(929494927))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1086403091))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1301)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1174)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1056)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-816014616))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-878245629))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1736811524))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-464544357))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(496504723))
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(2120866749))
                        var_11_EB = and:int(ldc:int(2055), ldc:int(-2056))
                        goto(Label_1429)
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1423567387))
                        goto(Label_1440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1506991513))
                        goto(Label_1301)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(444244476))
                        goto(Label_1174)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1056)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(875788630))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-1563384960))
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1399390091))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1440)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1301)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1174)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(140486236))
                        goto(Label_1056)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1224223782))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(485085919))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(2071507292))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(64)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(1036053118))
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-215004680))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1301)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1174)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1910143373))
                        goto(Label_1056)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1769998573))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(1895058020))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1932163983))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(432), ldc:int(433))
                                goto(Label_1056)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(152505562))
                        goto(Label_1440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(552576445))
                        goto(Label_1301)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1174)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(1760543560))
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(335202782))
                        var_11_EB = and:int(ldc:int(10801), ldc:int(-12146))
                    }
                    
                    Label_1056:
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1440)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1301)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(608924200))
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-1153872028))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(752308713))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-1181809566))
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-85107380))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1301)
                            }
                        }
                    }
                    
                    Label_1174:
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1756929354))
                        goto(Label_1440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1917848098))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1056)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-1402338660))
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-1764549541))
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(1522093512))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1429)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1301:
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1610775339))
                        goto(Label_1440)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1174)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1056)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-417513458))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1530851687))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1196308018))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_61B = and:int(var_3_61B:int, ldc:int(1382927145))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1429:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_626 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1440:
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1301)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(2143615580))
                        goto(Label_1174)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1056)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-359385003))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-458940927))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1759545192))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-105001314))
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(398421822))
                        var_17_626 = add:int(var_16_119:int, and:int(ldc:int(145), ldc:int(17665)))
                        looporswitchbreak()
                    }
                    
                    var_3_61B = and:int(var_3_61B:int, ldc:int(1235895796))
                }
                
                var_3_61B = and:int(var_3_61B:int, ldc:int(2070870862))
                
                if (cmple:boolean(var_5_85 = var_17_626:int, sub:int(var_6_8C:int, and:int(ldc:int(10337), ldc:int(1037))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_61B = and:int(var_3_61B:int, ldc:int(1477673302))
            goto(Label_0106)
        }
    }
}
