public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8c8a\u071d\ud51e\uc9f6\u0b8e {
    public void \u8c8a\u071d\ud51e\uc9f6\u0b8e(\ud36e\u6bb9\u960f\u4c04\u64ab.\u9af2\u1833\u156b\u12cb\u7d52\u6c52 p0, int p1, \ud36e\u6bb9\u960f\u4c04\u64ab.\u9af2\u1833\u156b\u12cb\u7d52\u6c52 p2, int p3, int p4, int p5, int p6) {
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
            invokespecial:Object(Object::<init>, this:\u8c8a\u071d\ud51e\uc9f6\u0b8e)
            putfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u8c8a\u071d\ud51e\uc9f6\u0b8e::\u647c\u7c6b\u965f\u97e6\u3504\u4f52, this:\u8c8a\u071d\ud51e\uc9f6\u0b8e, initobject:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::<init>, p2:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab]))
            putfield:int(\u8c8a\u071d\ud51e\uc9f6\u0b8e::\u8709\u3c25\u5d20\uc229\u3c25\u3d4b, this:\u8c8a\u071d\ud51e\uc9f6\u0b8e, p4:int)
            putfield:int(\u8c8a\u071d\ud51e\uc9f6\u0b8e::\u7bad\u4492\uc2e8\u8258\ubefe\u3504, this:\u8c8a\u071d\ud51e\uc9f6\u0b8e, p5:int)
            putfield:int(\u8c8a\u071d\ud51e\uc9f6\u0b8e::\u6b5f\u5d20\u6198\u92ee\u6ec6\u9a18, this:\u8c8a\u071d\ud51e\uc9f6\u0b8e, p6:int)
            putfield:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u8c8a\u071d\ud51e\uc9f6\u0b8e::\u718f\ua068\u3e75\ub1b9\ud217\u9033, this:\u8c8a\u071d\ud51e\uc9f6\u0b8e, p0:\u9af2\u1833\u156b\u12cb\u7d52\u6c52)
            putfield:int(\u8c8a\u071d\ud51e\uc9f6\u0b8e::\u8350\u7049\u0c95\u3c25\ud12e\u6ec6, this:\u8c8a\u071d\ud51e\uc9f6\u0b8e, p1:int)
            putfield:int(\u8c8a\u071d\ud51e\uc9f6\u0b8e::\u4cd9\u64ab\u7330\u3776\uff55\uc29a, this:\u8c8a\u071d\ud51e\uc9f6\u0b8e, p3:int)
            putfield:float(\u8c8a\u071d\ud51e\uc9f6\u0b8e::\u76bc\uc31c\ube23\ub83f\u3c25\uc2e8, this:\u8c8a\u071d\ud51e\uc9f6\u0b8e, ldc:float(0.05f))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u8d90\ub1b9\u392e\u3776\ub18d\uf94d \u34df\uc7fe\u392e\u7049\uc87f\u873d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0, java.util.Random p1) {
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
    
    private static boolean lambda$\u74b1\ua068\u4f4a\ubb2b\uc3e3\ubefe$0(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4c2b\u6ec6\uc2e8\u7049\uc84e p0) {
        var_1_5F : int
        stack_99_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-1290851628), ldc:int(929753981))
            
            if (logicaland:boolean(logicalnot:boolean(invokeinterface:boolean(List<E>::isEmpty, invokevirtual:List<\u516c\u3dd3\ub113\u6d69\u76bc>(\u4c2b\u6ec6\uc2e8\u7049\uc84e::\u67d0\u4179\u8350\uc3e3\u64ab\u4e72, p0:\u4c2b\u6ec6\uc2e8\u7049\uc84e))), invokestatic:boolean(\uc3e3\ucef1\u873d\u718f\u9937::\ubff1\u6435\u7873\u7e3f\u5bc4\u72f1, p0:\u4c2b\u6ec6\uc2e8\u7049\uc84e))) {
                stack_99_0 = xor:int(ldc:int(4104), ldc:int(4105))
            }
            else {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1284786820))
                stack_99_0 = and:int(ldc:int(6677), ldc:int(-6680))
            }
            
            return:boolean(stack_99_0:int)
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
    
    public void \u61a4\u7e3f\u516c\u8d98\u9033\u7af6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_634 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_63F : int
        
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
        var_3_634 = and:int(ldc:int(1643879361), ldc:int(-473976879))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8c8a\u071d\ud51e\uc9f6\u0b8e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8192)), ldc:int(0))) {
            var_3_634 = and:int(var_3_634:int, ldc:int(-1026245211))
        }
        else {
            var_3_634 = and:int(var_3_634:int, ldc:int(1744830289))
            var_5_85 = and:int(ldc:int(5666), ldc:int(-6055))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(1755), ldc:int(-4060)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_634:int, ldc:int(1643625301))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(17474), ldc:int(17475)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(12353), ldc:int(3229)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_634 = and:int(var_3_D2:int, ldc:int(1739692001))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(1077), ldc:int(20801)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(492622377))
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(287560280))
                        goto(Label_1327)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1187)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(751031522))
                        goto(Label_1042)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1772112507))
                        goto(Label_0898)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0787)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0666)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1429987088))
                    }
                    else {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-336101425))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0554)
                            }
                            
                            goto(Label_0787)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1335033283))
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1327)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1187)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1483127821))
                        goto(Label_1042)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0898)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0787)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0666)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-4888753))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-286131538))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(1811010373))
                        var_11_E3 = and:int(ldc:int(25397), ldc:int(-25398))
                        goto(Label_1468)
                    }
                    
                    Label_0554:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1244185764))
                        goto(Label_1327)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-835421821))
                        goto(Label_1187)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1042)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0898)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(108271954))
                        goto(Label_0787)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(1676898143))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0787)
                        }
                    }
                    
                    Label_0666:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1327)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1187)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-198253176))
                        goto(Label_1042)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0898)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(287689803))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0554)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(692315153))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-402836629))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0787:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1327)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1722780867))
                        goto(Label_1187)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1042)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(2071757037))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0666)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0554)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1442855016))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-185226393))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(4152), ldc:int(4153))
                                goto(Label_1042)
                            }
                        }
                    }
                    
                    Label_0898:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1055105474))
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1327)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1354754730))
                        goto(Label_1187)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(334019045))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0787)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0666)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0554)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(1991884761))
                        var_11_E3 = and:int(ldc:int(14729), ldc:int(-14794))
                    }
                    
                    Label_1042:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1650101469))
                        goto(Label_1327)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-626179204))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(402929138))
                            goto(Label_0898)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0787)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-492254148))
                            goto(Label_0666)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-350286297))
                            goto(Label_0554)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-533482369))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-460394623))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(1794732907))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1327)
                            }
                        }
                    }
                    
                    Label_1187:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(406517352))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-2128509723))
                            goto(Label_1042)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0898)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1162394321))
                            goto(Label_0787)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0666)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-830316381))
                            goto(Label_0554)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(1547084655))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(1879047109))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1468)
                    }
                    
                    Label_1327:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-187363673))
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1540712590))
                        goto(Label_1187)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1042)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(2076428045))
                        goto(Label_0898)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0787)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0666)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1226907009))
                        goto(Label_0554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(830138986))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_634 = and:int(var_3_634:int, ldc:int(1858023237))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1468:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63F = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1479:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-590993314))
                        goto(Label_1327)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1187)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-892667403))
                        goto(Label_1042)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0898)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-832707781))
                        goto(Label_0787)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-311520214))
                        goto(Label_0666)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1979422555))
                        var_17_63F = add:int(var_16_111:int, xor:int(ldc:int(-31744), ldc:int(-31743)))
                        looporswitchbreak()
                    }
                }
                
                var_3_634 = and:int(var_3_634:int, ldc:int(1643888605))
                
                if (cmple:boolean(var_5_85 = var_17_63F:int, sub:int(var_6_8C:int, and:int(ldc:int(1569), ldc:int(4161))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
