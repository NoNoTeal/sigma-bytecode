public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4bc8\u6198\uc9f6\u5245\u6435\ub32d {
    public void \u4bc8\u6198\uc9f6\u5245\u6435\ub32d() {
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
    
    public \u5d20\u7043\u88c5\u5db4\uf94d.\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab \uc31c\u7330\u97b7\u6cfe\u3711\u52d3(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389 p0) {
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
            return:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab(checkcast:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab(\u5d20\u7043\u88c5\u5db4\uf94d.\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab.class, invokeinterface:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab(Map<\uf995\u4975\u1187\ubff1\u839e\u8389, \u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab>::get, getfield:Map<\uf995\u4975\u1187\ubff1\u839e\u8389, \u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab>(\u4bc8\u6198\uc9f6\u5245\u6435\ub32d::\u93a2\u7330\u8308\uc2e8\uc2bd\u7043, this:\u4bc8\u6198\uc9f6\u5245\u6435\ub32d), p0:\uf995\u4975\u1187\ubff1\u839e\u8389[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    public void \ud158\uc246\u946b\u760c\ub1b9\u34df() {
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
            invokeinterface:void(Iterable<Object>::forEach, invokeinterface:Collection<\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab>[expected:Iterable<Object>](Map<\uf995\u4975\u1187\ubff1\u839e\u8389, \u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab>::values, getfield:Map<\uf995\u4975\u1187\ubff1\u839e\u8389, \u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab>(\u4bc8\u6198\uc9f6\u5245\u6435\ub32d::\u93a2\u7330\u8308\uc2e8\uc2bd\u7043, this:\u4bc8\u6198\uc9f6\u5245\u6435\ub32d)), invokedynamic:Consumer<? super Object>(accept:()Ljava/util/function/Consumer;))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9033\ubff1\u071d\u6bb9\u6435\u3dd3() {
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
            invokeinterface:void(Iterable<Object>::forEach, invokeinterface:Collection<\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab>[expected:Iterable<Object>](Map<\uf995\u4975\u1187\ubff1\u839e\u8389, \u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab>::values, getfield:Map<\uf995\u4975\u1187\ubff1\u839e\u8389, \u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab>(\u4bc8\u6198\uc9f6\u5245\u6435\ub32d::\u93a2\u7330\u8308\uc2e8\uc2bd\u7043, this:\u4bc8\u6198\uc9f6\u5245\u6435\ub32d)), invokedynamic:Consumer<? super Object>(accept:()Ljava/util/function/Consumer;))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \u5d20\u7043\u88c5\u5db4\uf94d.\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab lambda$\uf94d\ubff1\u16f6\u960f\u156b\ub1b9$1(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389 p0) {
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
            return:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab(initobject:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::<init>, invokevirtual:int(\uf995\u4975\u1187\ubff1\u839e\u8389::\uc3e3\ub18d\u0b8e\u647c\u6bb9\u98a4, p0:\uf995\u4975\u1187\ubff1\u839e\u8389)))
        }
        
        goto(Label_0006)
    }
    
    private static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389 lambda$\u927d\u76bc\u3504\uc31c\uc3e3\u4f52$0(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389 p0) {
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
            return:\uf995\u4975\u1187\ubff1\u839e\u8389(p0:\uf995\u4975\u1187\ubff1\u839e\u8389)
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
    
    public void \ub171\u6cfe\u6b0d\u4e72\u51b2\u4c04(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5DD : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5E8 : int
        
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
        var_3_5DD = and:int(ldc:int(-814734465), ldc:int(469321495))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4bc8\u6198\uc9f6\u5245\u6435\ub32d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(16)), ldc:int(0))) {
            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1149723302))
            var_5_7D = and:int(ldc:int(9161), ldc:int(-11244))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(1107), ldc:int(-17492)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5DD:int, ldc:int(-1687174722))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(19472), ldc:int(19473)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(4107), ldc:int(4106)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5DD = and:int(var_3_D2:int, ldc:int(509634544))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(16386), ldc:int(16387)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1240)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(2093902080))
                        goto(Label_1131)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1024)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1478824621))
                        goto(Label_0891)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1399838475))
                    }
                    else {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1534463251))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1953401912))
                        goto(Label_1388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1240)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(432178760))
                        goto(Label_1131)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1024)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0891)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1131060946))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(693091340))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-555045928))
                            var_11_E3 = and:int(ldc:int(22049), ldc:int(-22050))
                            goto(Label_1377)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-213613109))
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1346161131))
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1131)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1100498340))
                        goto(Label_1024)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0891)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(195784672))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(443678164))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-607285471))
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-509560943))
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-898017162))
                        goto(Label_1131)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1024)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0891)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-786994124))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-990867947))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1353957816))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-85277865))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1434153500))
                        goto(Label_1131)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1024)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-80815669))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1494766950))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(187934298))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1851858201))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(4112), ldc:int(4113))
                                goto(Label_1024)
                            }
                        }
                    }
                    
                    Label_0891:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1459972720))
                        goto(Label_1240)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1131)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1134040541))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1517677936))
                        var_11_E3 = and:int(ldc:int(25783), ldc:int(-25784))
                    }
                    
                    Label_1024:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0891)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-149768845))
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1628743447))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-573796364))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1248177049))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1240)
                            }
                        }
                    }
                    
                    Label_1131:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1945444287))
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_1024)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0891)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1690450857))
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(712416086))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1377)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1240:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1131)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1566469603))
                        goto(Label_1024)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(479397294))
                        goto(Label_0891)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-287684076))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-960258865))
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1112770104))
                        loopcontinue()
                    }
                    
                    var_3_5DD = and:int(var_3_5DD:int, ldc:int(-286736584))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1377:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5E8 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1388:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(20457885))
                        goto(Label_1131)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(758574732))
                        goto(Label_1024)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(582255333))
                        goto(Label_0891)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(2088068166))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1154163115))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1516949910))
                        var_17_5E8 = add:int(var_16_111:int, and:int(ldc:int(1051), ldc:int(2081)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5DD = and:int(var_3_5DD:int, ldc:int(-604754469))
                
                if (cmple:boolean(var_5_7D = var_17_5E8:int, sub:int(var_6_84:int, xor:int(ldc:int(18497), ldc:int(18496))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-729628705))
            goto(Label_0106)
        }
    }
}
