public class \u4f52\u6cfe\u9a18\uc29a\u3bd6.\ub70c\u836c\u071d\u74b1\uff55 {
    public void \ub70c\u836c\u071d\u74b1\uff55(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u56bd\u0a06\u3bc9\u72f1\u1833 p0) {
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
            invokespecial:Object(Object::<init>, this:\ub70c\u836c\u071d\u74b1\uff55)
            putfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\ub70c\u836c\u071d\u74b1\uff55::\u120d\u960f\ua61f\u5fe1\u1187, this:\ub70c\u836c\u071d\u74b1\uff55, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))
            putfield:HashMap<String, \u67d0\ub171\u76bc\ud217\ubcb0>(\ub70c\u836c\u071d\u74b1\uff55::\u64f2\u88c5\u446c\u8308\ufe34, this:\ub70c\u836c\u071d\u74b1\uff55, initobject:HashMap<String, \u67d0\ub171\u76bc\ud217\ubcb0>(HashMap<K, V>::<init>))
            putfield:\u56bd\u0a06\u3bc9\u72f1\u1833(\ub70c\u836c\u071d\u74b1\uff55::\u6bb9\ub7dc\u494c\ua61f\u3dd3, this:\ub70c\u836c\u071d\u74b1\uff55, p0:\u56bd\u0a06\u3bc9\u72f1\u1833)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4f52\uc4d2\u92ff\u927d\u4f52(java.lang.String p0, java.lang.String p1, long p2) {
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
    
    public \u5d20\u7043\u88c5\u5db4\uf94d.\u67d0\ub171\u76bc\ud217\ubcb0 \u99f7\u8df4\u3bd6\ua61f\u3d4b(java.lang.String p0) {
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
    
    private static \u5d20\u7043\u88c5\u5db4\uf94d.\u67d0\ub171\u76bc\ud217\ubcb0 lambda$\u5d20\u1833\u5db4\ub7dc\u3711$1(java.lang.String p0) {
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
            return:\u67d0\ub171\u76bc\ud217\ubcb0(initobject:\u67d0\ub171\u76bc\ud217\ubcb0(\u67d0\ub171\u76bc\ud217\ubcb0::<init>))
        }
        
        goto(Label_0006)
    }
    
    private static \u5d20\u7043\u88c5\u5db4\uf94d.\u67d0\ub171\u76bc\ud217\ubcb0 lambda$\u92ff\ub32d\ucb79\ubb2b\u5245$0(java.lang.String p0) {
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
            return:\u67d0\ub171\u76bc\ud217\ubcb0(initobject:\u67d0\ub171\u76bc\ud217\ubcb0(\u67d0\ub171\u76bc\ud217\ubcb0::<init>))
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
    
    public void \u718f\u3e75\u8cae\u62da\u76bc(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5E6 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5F1 : int
        
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
        var_3_5E6 = and:int(ldc:int(-1474789124), ldc:int(-8861580))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub70c\u836c\u071d\u74b1\uff55[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-122119683))
            var_5_7D = and:int(ldc:int(-8085), ldc:int(5524))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-12676), ldc:int(12675)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5E6:int, ldc:int(-1432560321))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(9249), ldc:int(4481)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(1056), ldc:int(1057)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5E6 = and:int(var_3_D2:int, ldc:int(-124150913))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(520), ldc:int(521)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(1753356476))
                        goto(Label_1294)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-368961595))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-233162912))
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(545971582))
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-1173479157))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(98111963))
                    }
                    else {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(750568381))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-1280826967))
                        goto(Label_1415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-887500474))
                        goto(Label_1294)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(1467626830))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-229642242))
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-877594203))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-752589603))
                            loopcontinue()
                        }
                        
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(2021432319))
                        var_11_E3 = and:int(ldc:int(-30537), ldc:int(30024))
                        goto(Label_1404)
                    }
                    
                    Label_0573:
                    
                    if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1294)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(1596981792))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-662016180))
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(939401059))
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-1417807818))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-1016998146))
                        goto(Label_1415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-1181593118))
                        goto(Label_1294)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-487179270))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(1893344020))
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(2038879059))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-696721507))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(1071301500))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(2134294052))
                        goto(Label_1415)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1294)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-1506704620))
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-952071828))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-2076955702))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-1686212910))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5E6 = and:int(var_3_5E6:int, ldc:int(158887497))
                            loopcontinue()
                        }
                        
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(2092932669))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(1825), ldc:int(8273))
                                goto(Label_1091)
                            }
                        }
                    }
                    
                    Label_0937:
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(367688300))
                        goto(Label_1415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-96009197))
                        goto(Label_1294)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-479678494))
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-1327608345))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-1749370782))
                            loopcontinue()
                        }
                        
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(2126022973))
                        var_11_E3 = and:int(ldc:int(-4921), ldc:int(4920))
                    }
                    
                    Label_1091:
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1294)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(2083568491))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0937)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-386227523))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1294)
                            }
                        }
                    }
                    
                    Label_1178:
                    
                    if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-254173005))
                            goto(Label_1091)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0937)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-1127604144))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-263676046))
                            loopcontinue()
                        }
                        
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-1168538250))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1404)
                    }
                    
                    Label_1294:
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1415)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-2138958211))
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(269349104))
                        loopcontinue()
                    }
                    
                    var_3_5E6 = and:int(var_3_5E6:int, ldc:int(2032137397))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1404:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5F1 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1415:
                    
                    if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1294)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-1994796031))
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(2041189165))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E6:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-386079876))
                        var_17_5F1 = add:int(var_16_111:int, and:int(ldc:int(16923), ldc:int(37)))
                        looporswitchbreak()
                    }
                    
                    var_3_5E6 = and:int(var_3_5E6:int, ldc:int(1059719059))
                }
                
                var_3_5E6 = and:int(var_3_5E6:int, ldc:int(-1121998028))
                
                if (cmple:boolean(var_5_7D = var_17_5F1:int, sub:int(var_6_84:int, and:int(ldc:int(6825), ldc:int(1281))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5E6:int, ldc:int(32768)), ldc:int(0))) {
            var_3_5E6 = and:int(var_3_5E6:int, ldc:int(352139039))
            goto(Label_0106)
        }
    }
}
