public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u3e75\u3bc9\u12b2\ucfaf\u6b0d\u4492 {
    public void \u3e75\u3bc9\u12b2\ucfaf\u6b0d\u4492(boolean p0) {
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
    
    public java.lang.String toString() {
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
            return:String(invokespecial:String(\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae::toString, this:\u3e75\u3bc9\u12b2\ucfaf\u6b0d\u4492[expected:\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae]))
        }
        
        goto(Label_0006)
    }
    
    public int hashCode() {
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
            return:int(invokespecial:int(\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae::hashCode, this:\u3e75\u3bc9\u12b2\ucfaf\u6b0d\u4492[expected:\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae]))
        }
        
        goto(Label_0006)
    }
    
    public boolean equals(java.lang.Object p0) {
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
            return:boolean(invokespecial:boolean(\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae::equals, this:\u3e75\u3bc9\u12b2\ucfaf\u6b0d\u4492[expected:\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae], p0:Object))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ucfaf\ubded\u8cae\u92ff\u8d90\u647c$1(boolean p0) {
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
            
            if (p0:boolean) {
                invokestatic:void(\uf9c5\ucef1\u4daf\ud36e\uc246\u3776::\uc238\u120d\u61a4\u7006\u2dcc\u88c5)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ub113\uc2e8\u9937\u6d99\uc84e\u92ff$0(boolean p0) {
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
            
            if (p0:boolean) {
                invokestatic:void(\uf9c5\ucef1\u4daf\ud36e\uc246\u3776::\u69d9\ud12e\u76bc\uae87\u7af6\u8d98)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4bc8\u960f\u8aa5\u51b2\u2dcc\u960f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5BD : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
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
        var_3_5BD = and:int(ldc:int(1567076582), ldc:int(1164439423))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3e75\u3bc9\u12b2\ucfaf\u6b0d\u4492[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(4)), ldc:int(0))) {
            var_3_5BD = and:int(var_3_5BD:int, ldc:int(1676144734))
            var_5_7D = and:int(ldc:int(19641), ldc:int(-19644))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(16886), ldc:int(-16888)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5BD:int, ldc:int(1140306391))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(325), ldc:int(324)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(1089), ldc:int(17331)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5BD = and:int(var_3_CA:int, ldc:int(1106766678))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(4194), ldc:int(4195)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1116455525))
                        goto(Label_1378)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(603771504))
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-204226752))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1986254514))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-553996212))
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-671108905))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-998104747))
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(801702667))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1726132339))
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(635428837))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1184893998))
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-918342802))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-437257018))
                            var_11_DB = and:int(ldc:int(22064), ldc:int(-22065))
                            goto(Label_1367)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(805943966))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1140753361))
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1874196300))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-948982042))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1244634907))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-671267938))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-352216083))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1979168631))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0770:
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1171720465))
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-801038836))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(1169910255))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(1362574196))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1199570279))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(22017), ldc:int(215))
                                goto(Label_1019)
                            }
                        }
                    }
                    
                    Label_0881:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(823284948))
                        goto(Label_1378)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(170911155))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1556609716))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-344989114))
                        var_11_DB = and:int(ldc:int(7856), ldc:int(-7923))
                    }
                    
                    Label_1019:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(388152103))
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1843727647))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1151112592))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1964609184))
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-511709233))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1260)
                            }
                        }
                    }
                    
                    Label_1130:
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1019)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1604946634))
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(569603073))
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1652983006))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1928989089))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(23924067))
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-914883898))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1367)
                    }
                    
                    Label_1260:
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1765189540))
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(311232602))
                        loopcontinue()
                    }
                    
                    var_3_5BD = and:int(var_3_5BD:int, ldc:int(1542438862))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1367:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5C8 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1378:
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-849542282))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(2066515741))
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(705209559))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-613434634))
                        var_17_5C8 = add:int(var_16_109:int, xor:int(ldc:int(21520), ldc:int(21521)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5BD = and:int(var_3_5BD:int, ldc:int(-780683290))
                
                if (cmple:boolean(var_5_7D = var_17_5C8:int, sub:int(var_6_84:int, and:int(ldc:int(833), ldc:int(4269))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(16777216)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
