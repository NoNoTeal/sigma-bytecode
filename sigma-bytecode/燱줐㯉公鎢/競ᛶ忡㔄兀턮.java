public class \u71f1\uc910\u3bc9\u516c\u93a2.\u7af6\u16f6\u5fe1\u3504\u5140\ud12e {
    public void \u7af6\u16f6\u5fe1\u3504\u5140\ud12e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
            invokespecial:\uf9c5\u16f6\ub102\u3c25\u4c2b(\uf9c5\u16f6\ub102\u3c25\u4c2b::<init>, this:\u7af6\u16f6\u5fe1\u3504\u5140\ud12e)
            putfield:\u7d52\u718f\u3776\u6fb0\ub83f(\u7af6\u16f6\u5fe1\u3504\u5140\ud12e::\ub83f\ubcb0\uae5d\u4cd9\u92ee\u120d, this:\u7af6\u16f6\u5fe1\u3504\u5140\ud12e, p0:\u7d52\u718f\u3776\u6fb0\ub83f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Optional<java.lang.Float> \uc29a\u52d3\ub171\u0c95\u7c6b\u836c(\u392e\ud7e8\u3bc9\u88c5\ud51e.\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79 p0, \u5d20\u97b7\u8753\u873d\u16f6.\u718f\u6435\uc31c\u4ab3\u98a4 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p3, \u5d20\u7043\u88c5\u5db4\uf94d.\uf995\u8709\ua61f\ub32d\ubff1\u99f7 p4) {
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
    
    public boolean \u4c2b\u12b2\ud523\u8bb0\ub7dc\u120d(\u392e\ud7e8\u3bc9\u88c5\ud51e.\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79 p0, \u5d20\u97b7\u8753\u873d\u16f6.\u718f\u6435\uc31c\u4ab3\u98a4 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p3, float p4) {
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
            return:boolean(invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\ucef1\u16f6\u8413\u64f2\u71f1\uc87f, getfield:\u7d52\u718f\u3776\u6fb0\ub83f(\u7af6\u16f6\u5fe1\u3504\u5140\ud12e::\ub83f\ubcb0\uae5d\u4cd9\u92ee\u120d, this:\u7af6\u16f6\u5fe1\u3504\u5140\ud12e), p0:\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79, p1:\u718f\u6435\uc31c\u4ab3\u98a4, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p4:float))
        }
        
        goto(Label_0006)
    }
    
    private java.lang.Float lambda$\ub171\u9255\u6d69\u61a4\ub6ab\u183a$0(\u392e\ud7e8\u3bc9\u88c5\ud51e.\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79 p0, \u5d20\u97b7\u8753\u873d\u16f6.\u718f\u6435\uc31c\u4ab3\u98a4 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p3, \u5d20\u7043\u88c5\u5db4\uf94d.\uf995\u8709\ua61f\ub32d\ubff1\u99f7 p4, java.lang.Float p5) {
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
            return:Float(invokestatic:Float(Float::valueOf, invokevirtual:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u93a2\u983f\u6b0d\ub171\u7330\u3a62, getfield:\u7d52\u718f\u3776\u6fb0\ub83f(\u7af6\u16f6\u5fe1\u3504\u5140\ud12e::\ub83f\ubcb0\uae5d\u4cd9\u92ee\u120d, this:\u7af6\u16f6\u5fe1\u3504\u5140\ud12e), p0:\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79, p1:\u718f\u6435\uc31c\u4ab3\u98a4, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p4:\uf995\u8709\ua61f\ub32d\ubff1\u99f7, invokevirtual:float(Float::floatValue, p5:Float))))
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
    
    public void \u8413\u3e75\u69d9\uceb8\u494c\u52d3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5BD : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5C8 : int
        
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
        var_3_5BD = and:int(ldc:int(-806288880), ldc:int(1672206877))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7af6\u16f6\u5fe1\u3504\u5140\ud12e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_5BD = and:int(var_3_5BD:int, ldc:int(39107147))
        }
        else {
            var_3_5BD = and:int(var_3_5BD:int, ldc:int(1317903252))
            var_5_85 = and:int(ldc:int(-6254), ldc:int(6253))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-15016), ldc:int(15013)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5BD:int, ldc:int(1524428507))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(1026), ldc:int(1027)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(9216), ldc:int(9217)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5BD = and:int(var_3_D2:int, ldc:int(-424771012))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(8195), ldc:int(961)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1399524053))
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1118115245))
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1011)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(2033426303))
                        goto(Label_0865)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-764255604))
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1008865678))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0525)
                            }
                            
                            goto(Label_0746)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1011)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0865)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-72446443))
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(46514434))
                        goto(Label_0620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1031778635))
                            var_11_E3 = and:int(ldc:int(-26153), ldc:int(26152))
                            goto(Label_1375)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0525:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1011)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0865)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-694073457))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(432167727))
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-155968560))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0746)
                        }
                    }
                    
                    Label_0620:
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1141537595))
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(209072479))
                        goto(Label_1011)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0865)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1765790570))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1589465097))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-437277301))
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-19929573))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0746:
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(167802511))
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1011)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-604163568))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1262883910))
                            goto(Label_0620)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(507866738))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(42212083))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1725381587))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(4993), ldc:int(3073))
                                goto(Label_1011)
                            }
                        }
                    }
                    
                    Label_0865:
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(102470701))
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1207906993))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1473092548))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(139942615))
                            goto(Label_0620)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-292069515))
                        var_11_E3 = and:int(ldc:int(3381), ldc:int(-3382))
                    }
                    
                    Label_1011:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1809114686))
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0865)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-800184714))
                            goto(Label_0620)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-2024211306))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1402032946))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1244)
                            }
                        }
                    }
                    
                    Label_1114:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1928625010))
                            goto(Label_1011)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0865)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(1126688215))
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(958887155))
                            goto(Label_0620)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(1050176958))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1693374392))
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1014355078))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1375)
                    }
                    
                    Label_1244:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(721255072))
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1011)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(657167218))
                        goto(Label_0865)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1208065851))
                        goto(Label_0620)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(2038746111))
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(704200855))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5BD = and:int(var_3_5BD:int, ldc:int(-427306413))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1375:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5C8 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1386:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1011)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0865)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0620)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1385166708))
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-920676489))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1995190879))
                        var_17_5C8 = add:int(var_16_111:int, xor:int(ldc:int(576), ldc:int(577)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5BD = and:int(var_3_5BD:int, ldc:int(-746562824))
                
                if (cmple:boolean(var_5_85 = var_17_5C8:int, sub:int(var_6_8C:int, and:int(ldc:int(689), ldc:int(1285))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(512)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
