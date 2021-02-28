public class \u36d3\u9033\u6b0d\u983f\u8d90.\u4cd9\u6d99\u8753\u5fe1\ub7dc\u3776 {
    public void \u4cd9\u6d99\u8753\u5fe1\ub7dc\u3776(\u56bd\u8413\u647c\u5bc4\ud158.\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b p0, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6 p1) {
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
            putfield:\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b(\u4cd9\u6d99\u8753\u5fe1\ub7dc\u3776::\u516c\u8709\u99f7\u0a06\u12cb\u4c04, this:\u4cd9\u6d99\u8753\u5fe1\ub7dc\u3776, p0:\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b)
            putfield:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u4cd9\u6d99\u8753\u5fe1\ub7dc\u3776::\ua068\ua068\u93a2\ua61f\ub113\u3bd6, this:\u4cd9\u6d99\u8753\u5fe1\ub7dc\u3776, p1:\u1833\ud171\u8350\ubded\u34df\uc9f6)
            invokespecial:\u5d20\u6bb9\ub113\u983f\u47c2\u718f(\u5d20\u6bb9\ub113\u983f\u47c2\u718f::<init>, this:\u4cd9\u6d99\u8753\u5fe1\ub7dc\u3776)
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
    
    private void lambda$\u6ec6\u3a62\ud217\uc84e\uc84e\u56bd$0(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6 p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p1) {
        var_3_5F : int
        var_5_72 : byte
        
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
            var_3_5F = and:int(ldc:int(-2064657089), ldc:int(-1661329553))
            
            loop {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-1627480722))
                var_5_72 = invokevirtual:byte(Byte::byteValue, checkcast:Byte(java.lang.Byte.class, invokevirtual:Byte(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Byte>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u7330\u16f6\ucfaf\u6435\u8753\u4cd9))))
                invokeinterface:void(\u0a06\u4daf\ub83f\uae5d\u16f6\u6bb9::\u99f7\u600f\u72f1\u6fb0\u67d0\uc238, invokestatic:\u0a06\u4daf\ub83f\uae5d\u16f6\u6bb9(\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b::\uc29a\u2dcc\u4f52\ub18d\u51fa\u5245, getfield:\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b(\u4cd9\u6d99\u8753\u5fe1\ub7dc\u3776::\u516c\u8709\u99f7\u0a06\u12cb\u4c04, this:\u4cd9\u6d99\u8753\u5fe1\ub7dc\u3776)), checkcast:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a.class, invokevirtual:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, p0:\u1833\ud171\u8350\ubded\u34df\uc9f6<\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a>)))
                
                if (cmpne:boolean(and:byte(var_5_72:byte, ldc:byte(-128)), ldc:byte(0))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
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
    
    public void \u6cfe\u3e75\uf94d\u071d\u3776\u74b1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_636 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_641 : int
        
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
        var_3_636 = and:int(ldc:int(-109508839), ldc:int(997020556))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4cd9\u6d99\u8753\u5fe1\ub7dc\u3776[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
            var_3_636 = and:int(var_3_636:int, ldc:int(1412968928))
        }
        else {
            var_3_636 = and:int(var_3_636:int, ldc:int(2077987186))
            var_5_85 = and:int(ldc:int(6912), ldc:int(-6913))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(26674), ldc:int(-26751)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_636:int, ldc:int(2071563472))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(1061), ldc:int(1060)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(515), ldc:int(8321)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_636 = and:int(var_3_D2:int, ldc:int(2111431462))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(273), ldc:int(30721)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1291810336))
                        goto(Label_1468)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1483031471))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1781173696))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(817239914))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1594534339))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1135941428))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1118901166))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1468)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-2074925963))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1880551525))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1225250530))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-325743828))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(1920835797))
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(692895490))
                        var_11_E3 = and:int(ldc:int(876), ldc:int(-17261))
                        goto(Label_1457)
                    }
                    
                    Label_0565:
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1952687014))
                        goto(Label_1468)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(392927631))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(236933988))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(138832486))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-58943409))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(1003268431))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(293808601))
                        goto(Label_1468)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1847998455))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1254460321))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1785492475))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1108716850))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1468)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1289712807))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-756530025))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-101910786))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(2028899878))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(1914737427))
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(1011768464))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(17443), ldc:int(2625))
                                goto(Label_1067)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(635434454))
                        goto(Label_1468)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(579629777))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-25662501))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-729780521))
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(-84980878))
                        var_11_E3 = and:int(ldc:int(-31175), ldc:int(26820))
                    }
                    
                    Label_1067:
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(244589115))
                        goto(Label_1468)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(731055635))
                            goto(Label_0921)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(1016234250))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(1255284483))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(1010002022))
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(-379036321))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1324)
                            }
                        }
                    }
                    
                    Label_1186:
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-832813210))
                        goto(Label_1468)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-1413641337))
                            goto(Label_1067)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-1530102970))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(1506232113))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(164967264))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(1595880864))
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(-50757900))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1457)
                    }
                    
                    Label_1324:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1723093752))
                        goto(Label_1468)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1216188453))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-2057391685))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1694990350))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(558730211))
                        loopcontinue()
                    }
                    
                    var_3_636 = and:int(var_3_636:int, ldc:int(-1459964612))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1457:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_641 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1468:
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(21153833))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-875051856))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1227713134))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1763293740))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-148464619))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1150552913))
                        var_17_641 = add:int(var_16_111:int, and:int(ldc:int(19989), ldc:int(12353)))
                        looporswitchbreak()
                    }
                    
                    var_3_636 = and:int(var_3_636:int, ldc:int(877735751))
                }
                
                var_3_636 = and:int(var_3_636:int, ldc:int(-1176512355))
                
                if (cmple:boolean(var_5_85 = var_17_641:int, sub:int(var_6_8C:int, xor:int(ldc:int(3072), ldc:int(3073))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
