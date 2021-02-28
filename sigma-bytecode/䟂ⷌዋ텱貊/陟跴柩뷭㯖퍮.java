public class \u47c2\u2dcc\u12cb\ud171\u8c8a.\u965f\u8df4\u67e9\ubded\u3bd6\ud36e<T> {
    public void \u965f\u8df4\u67e9\ubded\u3bd6\ud36e(\u59ec\u8413\u97e6\uc229\u3776.\u4daf\u9af2\u718f\u3504\uc4d2\u67e9 p0, \ub113\uc4d2\u183a\u527a\u6435.\u9255\u0c95\u4cd9\ube23\u760c<T> p1, int p2) {
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
            invokespecial:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u9af2\u1833\u156b\u12cb\u7d52\u6c52::<init>, this:\u965f\u8df4\u67e9\ubded\u3bd6\ud36e<T>, p0:\u4daf\u9af2\u718f\u3504\uc4d2\u67e9)
            putfield:\u9255\u0c95\u4cd9\ube23\u760c<T>(\u965f\u8df4\u67e9\ubded\u3bd6\ud36e::\u946b\u61a4\u5140\u9033\u6198\u3504, this:\u965f\u8df4\u67e9\ubded\u3bd6\ud36e<T>, p1:\u9255\u0c95\u4cd9\ube23\u760c<T>)
            putfield:int(\u965f\u8df4\u67e9\ubded\u3bd6\ud36e::\u5fe1\ub1b9\ud7e8\ua562\u071d\ub7dc, this:\u965f\u8df4\u67e9\ubded\u3bd6\ud36e<T>, p2:int)
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
    
    private static void lambda$\u600f\u624e\u527a\u7ce1\uc31c\u4492$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\ub113\u6c56\u97e6\u51b2\u4c2b p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p1) {
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
    
    public void \u88c5\u6d99\ud171\ub70c\uc229\u76bc(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_642 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_64D : int
        
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
        var_3_642 = and:int(ldc:int(1842946019), ldc:int(1073594233))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u965f\u8df4\u67e9\ubded\u3bd6\ud36e<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_642 = and:int(var_3_642:int, ldc:int(-1918034069))
            var_5_7D = and:int(ldc:int(-27372), ldc:int(18627))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-19422), ldc:int(18908)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_642:int, ldc:int(-1080729823))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(-29688), ldc:int(-29687)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(-28096), ldc:int(-28095)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_642 = and:int(var_3_D2:int, ldc:int(768425973))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(-30708), ldc:int(-30707)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1486)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(16)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1200942160))
                        goto(Label_1333)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(32)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(619702837))
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1066)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-2046039345))
                        goto(Label_0820)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0678)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(1398832090))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-965450363))
                    }
                    else {
                        var_3_642 = and:int(var_3_642:int, ldc:int(530571259))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0820)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1333)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1066)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-129582653))
                        goto(Label_0820)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0678)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-632427853))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(495649868))
                            loopcontinue()
                        }
                        
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1074675927))
                        var_11_E3 = and:int(ldc:int(-21684), ldc:int(21683))
                        goto(Label_1475)
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(249207714))
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-403397569))
                        goto(Label_1333)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(1278203604))
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1066)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(32)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(202698149))
                        goto(Label_0820)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1591984057))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(927128794))
                            loopcontinue()
                        }
                        
                        var_3_642 = and:int(var_3_642:int, ldc:int(536330043))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0820)
                        }
                    }
                    
                    Label_0678:
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1333)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(256)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(1145455917))
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-618516827))
                        goto(Label_1066)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-2019933681))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1913925710))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(16)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(-1341968733))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(609531048))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_642 = and:int(var_3_642:int, ldc:int(530005877))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0820:
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1333)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(1180468712))
                        goto(Label_1066)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0678)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(1345876516))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_642 = and:int(var_3_642:int, ldc:int(1839857521))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(4161), ldc:int(49))
                                goto(Label_1066)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1486)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1333)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(714845400))
                            goto(Label_0820)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(1227158559))
                            goto(Label_0678)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(256)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(-34387508))
                            loopcontinue()
                        }
                        
                        var_3_642 = and:int(var_3_642:int, ldc:int(-270934027))
                        var_11_E3 = and:int(ldc:int(17640), ldc:int(-17641))
                    }
                    
                    Label_1066:
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1723327301))
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(1)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(25325629))
                        goto(Label_1333)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(1136753741))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0820)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0678)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(512)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(1675000954))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(-1635694118))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1349705873))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1333)
                            }
                        }
                    }
                    
                    Label_1195:
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(32)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1297744068))
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(614004049))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(4)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(-781907504))
                            goto(Label_1066)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(447691436))
                            goto(Label_0820)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(-1394069921))
                            goto(Label_0678)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_642:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_642 = and:int(var_3_642:int, ldc:int(-1376165977))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1475)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1333:
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(512)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(191511722))
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(2091006283))
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(512)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-607542308))
                        goto(Label_1066)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1339523979))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0820)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0678)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(1)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1220219129))
                        loopcontinue()
                    }
                    
                    var_3_642 = and:int(var_3_642:int, ldc:int(-1076396189))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1475:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_64D = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1486:
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1333)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1066)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1051027117))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(1544691152))
                        goto(Label_0820)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1879773473))
                        goto(Label_0678)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-298135262))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-1309249975))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_642:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_642 = and:int(var_3_642:int, ldc:int(-302956693))
                        var_17_64D = add:int(var_16_111:int, and:int(ldc:int(4099), ldc:int(3789)))
                        looporswitchbreak()
                    }
                }
                
                var_3_642 = and:int(var_3_642:int, ldc:int(1334050595))
                
                if (cmple:boolean(var_5_7D = var_17_64D:int, sub:int(var_6_84:int, and:int(ldc:int(385), ldc:int(28247))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_642:int, ldc:int(256)), ldc:int(0))) {
            var_3_642 = and:int(var_3_642:int, ldc:int(724408811))
            goto(Label_0106)
        }
    }
}
