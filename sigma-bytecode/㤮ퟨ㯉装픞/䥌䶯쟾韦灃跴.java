public class \u392e\ud7e8\u3bc9\u88c5\ud51e.\u494c\u4daf\uc7fe\u97e6\u7043\u8df4 {
    public void \u494c\u4daf\uc7fe\u97e6\u7043\u8df4(boolean p0) {
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
            return:String(invokespecial:String(\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae::toString, this:\u494c\u4daf\uc7fe\u97e6\u7043\u8df4[expected:\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae]))
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
            return:int(invokespecial:int(\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae::hashCode, this:\u494c\u4daf\uc7fe\u97e6\u7043\u8df4[expected:\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae]))
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
            return:boolean(invokespecial:boolean(\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae::equals, this:\u494c\u4daf\uc7fe\u97e6\u7043\u8df4[expected:\u927d\uc3e3\u4ab3\u2dcc\u4f52\u71ae], p0:Object))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u873d\u97e6\u494c\u647c\uae87\u5db4$1(boolean p0) {
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
                invokevirtual:void(\u98a4\u6198\u16f6\u6ec6\u6c52\u3bd6::\uc29a\u8aa5\u7c6b\ucb79\u8350\ucfaf, invokevirtual:\u98a4\u6198\u16f6\u6ec6\u6c52\u3bd6(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\ubded\ub83f\u120d\u5fe1\u36d3\u7d52, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u9a18\u3dd3\u760c\u4daf\ud158\u8bb0$0(boolean p0) {
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
                invokevirtual:void(\u98a4\u6198\u16f6\u6ec6\u6c52\u3bd6::\u5245\u071d\u8640\u3dd3\u8cae\u6b5f, invokevirtual:\u98a4\u6198\u16f6\u6ec6\u6c52\u3bd6(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\ubded\ub83f\u120d\u5fe1\u36d3\u7d52, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4bc8\u960f\u8aa5\u51b2\u2dcc\u960f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_60B : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_616 : int
        
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
        var_3_60B = and:int(ldc:int(-467179920), ldc:int(-45127945))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u494c\u4daf\uc7fe\u97e6\u7043\u8df4[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_60B = and:int(var_3_60B:int, ldc:int(-163061790))
            var_5_7D = and:int(ldc:int(25504), ldc:int(-25505))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(4424), ldc:int(-4425)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_60B:int, ldc:int(-193204366))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(8211), ldc:int(17313)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(16389), ldc:int(10497)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_60B = and:int(var_3_D2:int, ldc:int(-448573699))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(6), ldc:int(7)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1230246402))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(888346287))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1130469920))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(492203446))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-979161452))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-80651552))
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1641297796))
                    }
                    else {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-187728273))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-2114273899))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(951896403))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(926933707))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(187001185))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1654926230))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(32)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(-314587412))
                            var_11_E3 = and:int(ldc:int(20010), ldc:int(-20156))
                            goto(Label_1423)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0573:
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(40950575))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(710320046))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-490316070))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-75233300))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-200802334))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-732647768))
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-2120279284))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(512)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(-660459370))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(-423943951))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-184332677))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1230843537))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-404780859))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(-2024947253))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(961646766))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-325099784))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(2560), ldc:int(2561))
                                goto(Label_1059)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1522910788))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1605646648))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1893356543))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(929632730))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-278147357))
                        var_11_E3 = and:int(ldc:int(-9677), ldc:int(9548))
                    }
                    
                    Label_1059:
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-205303459))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(1293465211))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-18098587))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1284)
                            }
                        }
                    }
                    
                    Label_1154:
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1462213129))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(2003125264))
                            goto(Label_1059)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(488205751))
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(1032486372))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(1406651132))
                            loopcontinue()
                        }
                        
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-13375890))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1423)
                    }
                    
                    Label_1284:
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1235487051))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-136753020))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-961385182))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-742720627))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1142837238))
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-269070596))
                        loopcontinue()
                    }
                    
                    var_3_60B = and:int(var_3_60B:int, ldc:int(-167516554))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1423:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_616 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1434:
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1106572668))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(732060016))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-80539153))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-2064655405))
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-153139358))
                        var_17_616 = add:int(var_16_111:int, xor:int(ldc:boolean(0), ldc:boolean(1)))
                        looporswitchbreak()
                    }
                    
                    var_3_60B = and:int(var_3_60B:int, ldc:int(542925310))
                }
                
                var_3_60B = and:int(var_3_60B:int, ldc:int(-141035808))
                
                if (cmple:boolean(var_5_7D = var_17_616:int, sub:int(var_6_84:int, and:int(ldc:int(1033), ldc:int(16385))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(2048)), ldc:int(0))) {
            var_3_60B = and:int(var_3_60B:int, ldc:int(-615593900))
            goto(Label_0106)
        }
    }
}
