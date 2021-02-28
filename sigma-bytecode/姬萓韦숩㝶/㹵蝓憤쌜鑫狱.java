public class \u59ec\u8413\u97e6\uc229\u3776.\u3e75\u8753\u61a4\uc31c\u946b\u72f1 {
    public void \u3e75\u8753\u61a4\uc31c\u946b\u72f1(\u5d20\u97b7\u8753\u873d\u16f6.\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7e3f\ubff1\u718f\ub171\u72f1 p1) {
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
    
    public void \uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, float p3) {
        var_7_8E : \u8389\ub18d\u494c\u1833\ub8be\u6cfe
        
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
            invokespecial:void(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<E>::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, this:\u3e75\u8753\u61a4\uc31c\u946b\u72f1[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u8389\ub18d\u494c\u1833\ub8be\u6cfe>], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            
            if (invokevirtual:boolean(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<E>::\ucfaf\ud51e\u7e3f\u4ab3\u12b2\u4c2b, this:\u3e75\u8753\u61a4\uc31c\u946b\u72f1[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u8389\ub18d\u494c\u1833\ub8be\u6cfe>], i2d:double(p1:int), i2d:double(p2:int))) {
                var_7_8E = checkcast:\u8389\ub18d\u494c\u1833\ub8be\u6cfe(\u51fa\u12cb\u7330\u74b1\u6c52.\u8389\ub18d\u494c\u1833\ub8be\u6cfe.class, invokevirtual:\u8389\ub18d\u494c\u1833\ub8be\u6cfe(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u8389\ub18d\u494c\u1833\ub8be\u6cfe>::\u965f\u647c\u3bc9\ucfaf\uae87\uff55, this:\u3e75\u8753\u61a4\uc31c\u946b\u72f1[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u8389\ub18d\u494c\u1833\ub8be\u6cfe>], i2d:double(p1:int), i2d:double(p2:int)))
                
                if (cmpne:boolean(var_7_8E:\u8389\ub18d\u494c\u1833\ub8be\u6cfe, aconstnull:\u8389\ub18d\u494c\u1833\ub8be\u6cfe())) {
                    invokestatic:void(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\u9a18\u6198\u5654\u59ec\uae5d\u385b, getfield:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d(\u3e75\u8753\u61a4\uc31c\u946b\u72f1::\u6435\uff55\u5db4\u6198\u7873\u156b, this:\u3e75\u8753\u61a4\uc31c\u946b\u72f1), invokestatic:List(\u8389\ub18d\u494c\u1833\ub8be\u6cfe::\u52d3\ube23\u9937\u7330\u92ff\u1833, var_7_8E:\u8389\ub18d\u494c\u1833\ub8be\u6cfe))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\uae87\ud36e\u5bc4\u6c56\u51fa\ud12e$1(java.util.Map.Entry p0) {
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
    
    private void lambda$\ua61f\u69d9\ud4fe\u446c\u72f1\u5fe1$0(java.util.Map.Entry p0) {
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
            invokevirtual:int(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u8389\ub18d\u494c\u1833\ub8be\u6cfe>::\u446c\uff55\u9a18\ube23\u983f\u4cd9, this:\u3e75\u8753\u61a4\uc31c\u946b\u72f1[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u8389\ub18d\u494c\u1833\ub8be\u6cfe>], checkcast:\u93a2\ube23\u624e\u6fb0\u4daf\u92ee[expected:\u8389\ub18d\u494c\u1833\ub8be\u6cfe](\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u93a2\ube23\u624e\u6fb0\u4daf\u92ee.class, invokeinterface:\u93a2\ube23\u624e\u6fb0\u4daf\u92ee(Entry<K, \u93a2\ube23\u624e\u6fb0\u4daf\u92ee>::getValue, p0:Entry<K, \u93a2\ube23\u624e\u6fb0\u4daf\u92ee>)))
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
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_681 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C4 : double
        var_3_D6 : int
        var_11_E7 : int
        var_14_111 : double
        var_16_115 : int
        var_12_10D : double
        var_17_68C : int
        
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
        var_3_681 = and:int(ldc:int(522308608), ldc:int(536438251))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3e75\u8753\u61a4\uc31c\u946b\u72f1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(8192)), ldc:int(0))) {
            var_3_681 = and:int(var_3_681:int, ldc:int(-1627691764))
            var_5_7D = and:int(ldc:int(19477), ldc:int(-28438))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-31141), ldc:int(31008)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C4 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D6 = and:int(var_3_681:int, ldc:int(-1752060572))
                    var_9_C4 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E7 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E7:int, sub:int(var_6_84:int, and:int(ldc:int(533), ldc:int(10251)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E7:int, and:int(ldc:int(6665), ldc:int(417)))), var_7_93:double))) {
                        inc:int(var_11_E7, ldc:int(1))
                    }
                    
                    var_3_681 = and:int(var_3_D6:int, ldc:int(398820626))
                    var_14_111 = var_7_93:double
                    var_16_115 = var_11_E7:int
                }
                else {
                    var_11_E7 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(658), ldc:int(659)))
                    var_12_10D = var_14_111 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_115 = var_11_E7:int, var_6_84:int)) {
                        var_9_C4 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E7:int)
                        var_16_115 = var_11_E7:int
                        var_14_111 = var_12_10D:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(742590781))
                        goto(Label_1544)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(512)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(-1223615026))
                        goto(Label_1396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(1367579929))
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(935274954))
                        goto(Label_1147)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1006)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(-786715052))
                        goto(Label_0864)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(256)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(1419047739))
                        goto(Label_0733)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(-1638142685))
                        goto(Label_0608)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(925746953))
                        
                        if (cmplt:boolean(var_16_115:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0608)
                            }
                            
                            goto(Label_0864)
                        }
                    }
                    
                    Label_0434:
                    
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(-1078242269))
                        goto(Label_1544)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(-360503507))
                        goto(Label_1396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(823873513))
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1147)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(-1481738565))
                        goto(Label_1006)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0864)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(-6446133))
                        goto(Label_0733)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_681 = and:int(var_3_681:int, ldc:int(-553030068))
                            var_11_E7 = and:int(ldc:int(14622), ldc:int(-14623))
                            goto(Label_1533)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0608:
                    
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1544)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1147)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(512)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(-1650625297))
                        goto(Label_1006)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0864)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(108111676))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_681:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_681 = and:int(var_3_681:int, ldc:int(-1541386518))
                            goto(Label_0434)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_681 = and:int(var_3_681:int, ldc:int(-835938591))
                            loopcontinue()
                        }
                        
                        var_3_681 = and:int(var_3_681:int, ldc:int(2007465010))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_111 = var_9_C4:double
                            goto(Label_0864)
                        }
                    }
                    
                    Label_0733:
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(816788277))
                        goto(Label_1544)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1396)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1147)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1006)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(-1083915904))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_681:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0608)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_681:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_681 = and:int(var_3_681:int, ldc:int(-848414645))
                            goto(Label_0434)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_681:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_681 = and:int(var_3_681:int, ldc:int(42645226))
                            loopcontinue()
                        }
                        
                        var_3_681 = and:int(var_3_681:int, ldc:int(-554046412))
                        var_14_111 = mul:double(ldc:double(0.5), add:double(var_9_C4:double, var_14_111:double))
                    }
                    
                    Label_0864:
                    
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1544)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(-847106163))
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(446471221))
                        goto(Label_1147)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(-1735618105))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_681:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0733)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_681 = and:int(var_3_681:int, ldc:int(-1063207219))
                            goto(Label_0608)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_681 = and:int(var_3_681:int, ldc:int(-1874985122))
                            goto(Label_0434)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_681:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_681 = and:int(var_3_681:int, ldc:int(-1301100134))
                            loopcontinue()
                        }
                        
                        var_3_681 = and:int(var_3_681:int, ldc:int(-1228974440))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E7 = xor:int(ldc:int(320), ldc:int(321))
                                goto(Label_1147)
                            }
                        }
                    }
                    
                    Label_1006:
                    
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1544)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0864)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_681:int, ldc:int(4)), ldc:int(0))) {
                            var_3_681 = and:int(var_3_681:int, ldc:int(-1546081778))
                            goto(Label_0733)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_681:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0608)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_681:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0434)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_681:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_681 = and:int(var_3_681:int, ldc:int(363554398))
                            loopcontinue()
                        }
                        
                        var_3_681 = and:int(var_3_681:int, ldc:int(-1619138680))
                        var_11_E7 = and:int(ldc:int(8446), ldc:int(-24831))
                    }
                    
                    Label_1147:
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(523725296))
                        goto(Label_1544)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(1532225039))
                        goto(Label_1396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_681:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_681 = and:int(var_3_681:int, ldc:int(-1878434296))
                            goto(Label_1006)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_681:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_681 = and:int(var_3_681:int, ldc:int(770525394))
                            goto(Label_0864)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_681 = and:int(var_3_681:int, ldc:int(299454283))
                            goto(Label_0733)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_681 = and:int(var_3_681:int, ldc:int(859693569))
                            goto(Label_0608)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_681:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0434)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_681 = and:int(var_3_681:int, ldc:int(-33215268))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E7:int, ldc:int(0))) {
                                goto(Label_1396)
                            }
                        }
                    }
                    
                    Label_1288:
                    
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(931712382))
                        goto(Label_1544)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_681:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_1147)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_1006)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_681:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0864)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_681:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0733)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_681:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0608)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_681:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0434)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_681 = and:int(var_3_681:int, ldc:int(1444660469))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_111:double, var_5_7D:int, var_16_115:int)
                            goto(Label_1533)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1396:
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(-606553052))
                        goto(Label_1544)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(94582403))
                        goto(Label_1147)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1006)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(900648678))
                        goto(Label_0864)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0733)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(-968148917))
                        goto(Label_0608)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(1073741824)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_681 = and:int(var_3_681:int, ldc:int(1464933655))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_111:double, ldc:double(0.0))
                    Label_1533:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_68C = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E7:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1544:
                    
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(-215738303))
                        goto(Label_1396)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(1622026258))
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(1726513864))
                        goto(Label_1147)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(-27501393))
                        goto(Label_1006)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(512)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(888742723))
                        goto(Label_0864)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_681:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0733)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0608)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_681:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_681 = and:int(var_3_681:int, ldc:int(-139472942))
                        var_17_68C = add:int(var_16_115:int, and:int(ldc:int(185), ldc:int(1)))
                        looporswitchbreak()
                    }
                }
                
                var_3_681 = and:int(var_3_681:int, ldc:int(526853872))
                
                if (cmple:boolean(var_5_7D = var_17_68C:int, sub:int(var_6_84:int, xor:int(ldc:int(-31711), ldc:int(-31712))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_681:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_681 = and:int(var_3_681:int, ldc:int(-2125284911))
            goto(Label_0106)
        }
    }
}
