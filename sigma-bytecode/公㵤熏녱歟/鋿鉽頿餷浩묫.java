public class \u516c\u3d64\u718f\ub171\u6b5f.\u92ff\u927d\u983f\u9937\u6d69\ubb2b {
    public void \u92ff\u927d\u983f\u9937\u6d69\ubb2b() {
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
            invokespecial:Object(Object::<init>, this:\u92ff\u927d\u983f\u9937\u6d69\ubb2b)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u960f\uae87\u7c6b\u72f1\u836c\u52d3(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd p0) {
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
    
    private static void lambda$\u52d3\u527a\u7e3f\uc3e3\u6c56\uc84e$0(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p0) {
        var_1_5F : int
        var_3_76 : Iterator<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>
        var_4_98 : \u5245\u3504\uc31c\ubefe\u4f4a\u6c56
        
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
            var_1_5F = and:int(ldc:int(-574940108), ldc:int(2059287207))
            var_3_76 = invokeinterface:Iterator<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>(List<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>::iterator, checkcast:List<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>(java.util.List<\u51b2\u6fb0\ufcaf\u61a4\u0800.\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>.class, invokevirtual:List<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u120d\u51b2\u071d\u071d\u5140\u0800, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<List<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>>(\uf94d\u718f\u4d85\u4c2b\u5fe1\u5f50::\u9937\u600f\u3bd6\u6d69\u7e3f\u2dcc), and:int(ldc:int(-23840), ldc:int(7189)))))
            
            loop {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-171999907))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_3_76:Iterator<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>))) {
                    looporswitchbreak()
                }
                
                var_4_98 = checkcast:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u5245\u3504\uc31c\ubefe\u4f4a\u6c56.class, invokeinterface:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56(Iterator<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>::next, var_3_76:Iterator<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>))
                invokevirtual:void(\u5245\u3504\uc31c\ubefe\u4f4a\u6c56::\ub83f\u8df4\u7ce1\u600f\u8cae\u7043, var_4_98:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56, invokestatic:\ua61f\u0800\u3e2a\u71ae\u6d99\ub102(\ua61f\u0800\u3e2a\u71ae\u6d99\ub102::\u4e72\u8df4\u7049\u3e2a\ub83f\u3711, invokeinterface:int(\u6435\u8709\u516c\ub1b9\ua6bd\uafe7::\u52d3\u36d3\ub32d\u5245\u3bd6\u385b, invokevirtual:\u6435\u8709\u516c\ub1b9\ua6bd\uafe7(\u5245\u3504\uc31c\ubefe\u4f4a\u6c56::\uc3e3\u4f52\u4f4a\u446c\u4c2b\ucb79, var_4_98:\u5245\u3504\uc31c\ubefe\u4f4a\u6c56))))
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
    
    public void \uc2bd\u3504\u3a62\u98a4\u3c25\ucfaf(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5CA : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5D5 : int
        
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
        var_3_5CA = and:int(ldc:int(429521007), ldc:int(2044443958))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u92ff\u927d\u983f\u9937\u6d69\ubb2b[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(16)), ldc:int(0))) {
            var_3_5CA = and:int(var_3_5CA:int, ldc:int(171891622))
            var_5_7D = and:int(ldc:int(-1334), ldc:int(1077))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(16725), ldc:int(-16726)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5CA:int, ldc:int(1735015428))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(2304), ldc:int(2305)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(20800), ldc:int(20801)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5CA = and:int(var_3_D2:int, ldc:int(-950494225))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(8215), ldc:int(16673)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(581062910))
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1112)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0996)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0722)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0620)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(-284500588))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0517)
                            }
                            
                            goto(Label_0722)
                        }
                    }
                    
                    Label_0365:
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(-800732255))
                        goto(Label_1378)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(-391050597))
                        goto(Label_1112)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0996)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(-1877538042))
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0722)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5CA = and:int(var_3_5CA:int, ldc:int(1026377937))
                            loopcontinue()
                        }
                        
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(208633220))
                        var_11_E3 = and:int(ldc:int(6025), ldc:int(-14298))
                        goto(Label_1367)
                    }
                    
                    Label_0517:
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(1350915965))
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(-1129309828))
                        goto(Label_1112)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0996)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0722)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(511814365))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0365)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(-925270906))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0722)
                        }
                    }
                    
                    Label_0620:
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(2002139829))
                        goto(Label_1378)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1112)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0996)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5CA = and:int(var_3_5CA:int, ldc:int(-1163900337))
                            goto(Label_0365)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(-641738508))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0722:
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(1430496212))
                        goto(Label_1378)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(-264591476))
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(1074867572))
                        goto(Label_1112)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0996)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(770287868))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5CA = and:int(var_3_5CA:int, ldc:int(2091332656))
                            goto(Label_0620)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0365)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(318397997))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(768), ldc:int(769))
                                goto(Label_0996)
                            }
                        }
                    }
                    
                    Label_0841:
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(864150520))
                        goto(Label_1112)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0722)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5CA = and:int(var_3_5CA:int, ldc:int(-2054113589))
                            goto(Label_0620)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5CA = and:int(var_3_5CA:int, ldc:int(1637508996))
                            goto(Label_0517)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5CA = and:int(var_3_5CA:int, ldc:int(1323737968))
                            goto(Label_0365)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5CA = and:int(var_3_5CA:int, ldc:int(546870353))
                            loopcontinue()
                        }
                        
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(-1169507954))
                        var_11_E3 = and:int(ldc:int(3382), ldc:int(-3384))
                    }
                    
                    Label_0996:
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(1444195274))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0841)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5CA = and:int(var_3_5CA:int, ldc:int(1850106348))
                            goto(Label_0722)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5CA = and:int(var_3_5CA:int, ldc:int(-1461568644))
                            goto(Label_0620)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5CA = and:int(var_3_5CA:int, ldc:int(-1534238621))
                            goto(Label_0517)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0365)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(286039958))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1230)
                            }
                        }
                    }
                    
                    Label_1112:
                    
                    if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(1338358346))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0996)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0841)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0722)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5CA = and:int(var_3_5CA:int, ldc:int(2059237980))
                            goto(Label_0620)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0365)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5CA = and:int(var_3_5CA:int, ldc:int(-285872987))
                            loopcontinue()
                        }
                        
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(733551109))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1367)
                    }
                    
                    Label_1230:
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(235951423))
                        goto(Label_1378)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1112)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(-2106732418))
                        goto(Label_0996)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(-23990486))
                        goto(Label_0722)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(-420859490))
                        goto(Label_0620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0365)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(-783873451))
                        loopcontinue()
                    }
                    
                    var_3_5CA = and:int(var_3_5CA:int, ldc:int(1455414095))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1367:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5D5 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1378:
                    
                    if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1230)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1112)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0996)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(1146959455))
                        goto(Label_0722)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(-210779045))
                        goto(Label_0517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(-1319399258))
                        goto(Label_0365)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CA:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5CA = and:int(var_3_5CA:int, ldc:int(961542420))
                        var_17_5D5 = add:int(var_16_111:int, and:int(ldc:int(17537), ldc:int(37)))
                        looporswitchbreak()
                    }
                    
                    var_3_5CA = and:int(var_3_5CA:int, ldc:int(680554334))
                }
                
                var_3_5CA = and:int(var_3_5CA:int, ldc:int(2109455103))
                
                if (cmple:boolean(var_5_7D = var_17_5D5:int, sub:int(var_6_84:int, xor:int(ldc:int(17924), ldc:int(17925))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5CA:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_5CA = and:int(var_3_5CA:int, ldc:int(438546743))
            goto(Label_0106)
        }
    }
}
