public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\uf9c5\ub8be\ud51e\ud7e8\u88c5 {
    public void \uf9c5\ub8be\ud51e\ud7e8\u88c5(int p0) {
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
            invokespecial:Object(Object::<init>, this:\uf9c5\ub8be\ud51e\ud7e8\u88c5)
            putfield:int(\uf9c5\ub8be\ud51e\ud7e8\u88c5::\u51b2\ub8be\u3a62\u8df4\u5140\u183a, this:\uf9c5\ub8be\ud51e\ud7e8\u88c5, p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Integer lambda$\ubb2b\uc229\u927d\u3bd6\uf9c5\u9937$0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\uf9c5\ub8be\ud51e\ud7e8\u88c5 p0) {
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
            return:Integer(invokestatic:Integer(Integer::valueOf, getfield:int(\uf9c5\ub8be\ud51e\ud7e8\u88c5::\u51b2\ub8be\u3a62\u8df4\u5140\u183a, p0:\uf9c5\ub8be\ud51e\ud7e8\u88c5)))
        }
        
        goto(Label_0006)
    }
    
    static {
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
    
    public void \u8350\uc246\uc87f\ufe34\u64ab\u183a(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_614 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_61F : int
        
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
        var_3_614 = and:int(ldc:int(1754469402), ldc:int(2092113823))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uf9c5\ub8be\ud51e\ud7e8\u88c5[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_614 = and:int(var_3_614:int, ldc:int(-1057276295))
            var_5_7D = and:int(ldc:int(22199), ldc:int(-30392))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(1349), ldc:int(-1350)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_614:int, ldc:int(-74326983))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(10257), ldc:int(20491)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(1112), ldc:int(1113)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_614 = and:int(var_3_D2:int, ldc:int(-740983141))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(18467), ldc:int(1733)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-792794497))
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1185)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0899)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(8)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-626559875))
                        goto(Label_0782)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1620533096))
                        goto(Label_0665)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1450016032))
                    }
                    else {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-174096646))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0782)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(128)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1539141575))
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1554590673))
                        goto(Label_1185)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1028153619))
                        goto(Label_0899)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(8)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1609722358))
                        goto(Label_0782)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0665)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1790322054))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(1754750206))
                            var_11_E3 = and:int(ldc:int(-31115), ldc:int(22914))
                            goto(Label_1447)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1182183989))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(254458123))
                        goto(Label_1185)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0899)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(128)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1038136052))
                        goto(Label_0782)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(791899568))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(1437965983))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0782)
                        }
                    }
                    
                    Label_0665:
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1372264172))
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1185)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0899)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(2015744268))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-911718860))
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(-892109608))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0782:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-203538647))
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1576644665))
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1185)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-551199064))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0665)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(1451233179))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(1222606586))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(265), ldc:int(11911))
                                goto(Label_1059)
                            }
                        }
                    }
                    
                    Label_0899:
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(8)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(946627429))
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1185)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(1440840024))
                            goto(Label_0782)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(1660726434))
                            goto(Label_0665)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(64)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(209362464))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(525257183))
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(-861963202))
                        var_11_E3 = and:int(ldc:int(9582), ldc:int(-14207))
                    }
                    
                    Label_1059:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-802783885))
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1323809010))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0899)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0782)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-1600723792))
                            goto(Label_0665)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(327628342))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(200334201))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(-201853768))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1325)
                            }
                        }
                    }
                    
                    Label_1185:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(128)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1134758370))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-846527033))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_1059)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-883070934))
                            goto(Label_0899)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0782)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0665)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-1458262698))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(16)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(1113237044))
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(1727616510))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1447)
                    }
                    
                    Label_1325:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-615124288))
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1185)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1357316525))
                        goto(Label_0899)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0782)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0665)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1102636608))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8192)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_614 = and:int(var_3_614:int, ldc:int(-21555781))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1447:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_61F = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1458:
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(2097024367))
                        goto(Label_1185)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1899468229))
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0899)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0782)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0665)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1358896219))
                        var_17_61F = add:int(var_16_111:int, and:int(ldc:int(16933), ldc:int(1409)))
                        looporswitchbreak()
                    }
                    
                    var_3_614 = and:int(var_3_614:int, ldc:int(1830384637))
                }
                
                var_3_614 = and:int(var_3_614:int, ldc:int(1174256665))
                
                if (cmple:boolean(var_5_7D = var_17_61F:int, sub:int(var_6_84:int, and:int(ldc:int(1825), ldc:int(6157))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4)), ldc:int(0))) {
            var_3_614 = and:int(var_3_614:int, ldc:int(-1718877203))
            goto(Label_0106)
        }
    }
}
