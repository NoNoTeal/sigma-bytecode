public class \ub113\ufcaf\u3c25\u071d\u97b7.\u7d52\ua3b4\ub102\u71f1\u5bc4\u74b1 {
    public void \u7d52\ua3b4\ub102\u71f1\u5bc4\u74b1(boolean p0) {
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
            invokespecial:Object(Object::<init>, this:\u7d52\ua3b4\ub102\u71f1\u5bc4\u74b1)
            putfield:boolean(\u7d52\ua3b4\ub102\u71f1\u5bc4\u74b1::\ubf56\uc2bd\u8aa5\u4d85\ub19c\u71f1, this:\u7d52\ua3b4\ub102\u71f1\u5bc4\u74b1, p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Boolean lambda$\u7330\u3c25\uc87f\u71ae\u6b0d\u6198$0(\ub113\ufcaf\u3c25\u071d\u97b7.\u7d52\ua3b4\ub102\u71f1\u5bc4\u74b1 p0) {
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
            return:Boolean(invokestatic:Boolean(Boolean::valueOf, getfield:boolean(\u7d52\ua3b4\ub102\u71f1\u5bc4\u74b1::\ubf56\uc2bd\u8aa5\u4d85\ub19c\u71f1, p0:\u7d52\ua3b4\ub102\u71f1\u5bc4\u74b1)))
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
    
    public void \u2dcc\u8709\ua6bd\u6d99\u93a2\u0c95(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_646 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_651 : int
        
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
        var_3_646 = and:int(ldc:int(-72518678), ldc:int(-123946261))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7d52\ua3b4\ub102\u71f1\u5bc4\u74b1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(262144)), ldc:int(0))) {
            var_3_646 = and:int(var_3_646:int, ldc:int(1258892346))
        }
        else {
            var_3_646 = and:int(var_3_646:int, ldc:int(-123736325))
            var_5_85 = and:int(ldc:int(-10977), ldc:int(10976))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(19078), ldc:int(-19079)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_646:int, ldc:int(-22169621))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(16923), ldc:int(65)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(305), ldc:int(20545)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_646 = and:int(var_3_DA:int, ldc:int(-251906097))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(8484), ldc:int(8485)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(64)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-392477690))
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-575513487))
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(128)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-101236075))
                        goto(Label_1077)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0915)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0779)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(503440658))
                        goto(Label_0654)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1650493020))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1863195455))
                    }
                    else {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-70306102))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0779)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1670593322))
                        goto(Label_1077)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0915)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0779)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0654)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-101828629))
                            var_11_EB = and:int(ldc:int(-8931), ldc:int(8930))
                            goto(Label_1499)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1058724379))
                        goto(Label_1341)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(2103190938))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1077)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0915)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0779)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-203681818))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(-73486337))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0779)
                        }
                    }
                    
                    Label_0654:
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1341)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-60504144))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1077)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0915)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-542914777))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(1631395714))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-1958913695))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(-100850706))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0779:
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-672072811))
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-590635607))
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1077)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(622646738))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(1477307051))
                            goto(Label_0654)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(128)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-778544329))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(1320639807))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(-52561958))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(137), ldc:int(9045))
                                goto(Label_1077)
                            }
                        }
                    }
                    
                    Label_0915:
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(64)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1733950619))
                        goto(Label_1341)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-2012894980))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1500025352))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0779)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0654)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(64)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(422045465))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-2050138353))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(-74667057))
                        var_11_EB = and:int(ldc:int(21624), ldc:int(-21755))
                    }
                    
                    Label_1077:
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1440514070))
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1341)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-1998540580))
                            goto(Label_0915)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(512)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(1087555949))
                            goto(Label_0779)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(1789705302))
                            goto(Label_0654)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(-34787333))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1341)
                            }
                        }
                    }
                    
                    Label_1194:
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1057155106))
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(64)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1159453191))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(-194654679))
                            goto(Label_1077)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0915)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(742999650))
                            goto(Label_0779)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(1450630873))
                            goto(Label_0654)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2)), ldc:int(0))) {
                            var_3_646 = and:int(var_3_646:int, ldc:int(713120558))
                            loopcontinue()
                        }
                        
                        var_3_646 = and:int(var_3_646:int, ldc:int(-33619990))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1499)
                    }
                    
                    Label_1341:
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1614170781))
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(64)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-332545155))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(1)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1986119688))
                        goto(Label_1077)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1627645376))
                        goto(Label_0915)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0779)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1764360428))
                        goto(Label_0654)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1126536664))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(1938458244))
                        loopcontinue()
                    }
                    
                    var_3_646 = and:int(var_3_646:int, ldc:int(-242319366))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1499:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_651 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1510:
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1077)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0915)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0779)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-734352252))
                        goto(Label_0654)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_646:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-1331622015))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_646 = and:int(var_3_646:int, ldc:int(-208666934))
                        var_17_651 = add:int(var_16_119:int, and:int(ldc:int(19201), ldc:int(4143)))
                        looporswitchbreak()
                    }
                    
                    var_3_646 = and:int(var_3_646:int, ldc:int(-1161389920))
                }
                
                var_3_646 = and:int(var_3_646:int, ldc:int(-50371878))
                
                if (cmple:boolean(var_5_85 = var_17_651:int, sub:int(var_6_8C:int, and:int(ldc:int(14371), ldc:int(785))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_646:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_646 = and:int(var_3_646:int, ldc:int(706865035))
            goto(Label_0106)
        }
    }
}
