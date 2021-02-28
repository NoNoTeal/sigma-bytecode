public abstract class \u59ec\u8413\u97e6\uc229\u3776.\ub18d\uae87\u92ee\u624e\u7873\uc31c<T> {
    public void \ub18d\uae87\u92ee\u624e\u7873\uc31c() {
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
            invokespecial:Object(Object::<init>, this:\ub18d\uae87\u92ee\u624e\u7873\uc31c<T>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final java.util.concurrent.CompletableFuture<java.lang.Void> \ub6ab\u6c56\u8350\u0a06\u8350\u40a9(\u36d3\u9033\u6b0d\u983f\u8d90.\ud7e8\u71ae\ud523\u7af6\u76bc p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p1, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d p2, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d p3, java.util.concurrent.Executor p4, java.util.concurrent.Executor p5) {
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
    
    public abstract T \u88c5\u1833\uc87f\u6d69\u69d9\u3e75(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d p1);
    
    public abstract void \u88c5\u4c2b\u2dcc\ucfaf\u927d\u7006(T p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p1, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d p2);
    
    private void lambda$\ufcaf\ub19c\u4179\u7e3f\u965f\ud217$1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d p1, java.lang.Object p2) {
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
            invokevirtual:void(\ub18d\uae87\u92ee\u624e\u7873\uc31c<Object>::\u88c5\u4c2b\u2dcc\ucfaf\u927d\u7006, this:\ub18d\uae87\u92ee\u624e\u7873\uc31c<T>, p2:Object, p0:\u6c52\u52d3\u516c\uae87\uae5d, p1:\ubf56\u64f2\u392e\u98a4\u120d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private java.lang.Object lambda$\u4975\uc84e\u6ec6\ud158\u4cd9\u5bc4$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d p1) {
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
            return:Object(invokevirtual:Object(\ub18d\uae87\u92ee\u624e\u7873\uc31c<Object>::\u88c5\u1833\uc87f\u6d69\u69d9\u3e75, this:\ub18d\uae87\u92ee\u624e\u7873\uc31c<T>, p0:\u6c52\u52d3\u516c\uae87\uae5d, p1:\ubf56\u64f2\u392e\u98a4\u120d))
        }
        
        goto(Label_0006)
    }
    
    public void \u9a18\ua3b4\ud171\u4cd9\u3bd6\u7043(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5F6 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_601 : int
        
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
        var_3_5F6 = and:int(ldc:int(1408660049), ldc:int(-67113391))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub18d\uae87\u92ee\u624e\u7873\uc31c<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(4)), ldc:int(0))) {
            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(599190289))
            var_5_7D = and:int(ldc:int(-27176), ldc:int(10759))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(16662), ldc:int(-20767)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5F6:int, ldc:int(-1543541765))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(10512), ldc:int(10513)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(20612), ldc:int(20613)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5F6 = and:int(var_3_CA:int, ldc:int(1677159135))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(10384), ldc:int(10385)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1252)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(1055513432))
                    }
                    else {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(737670833))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0517)
                            }
                            
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0357:
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-739047057))
                        goto(Label_1252)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-107911904))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1047942408))
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(1640670973))
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(1282572705))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(67039967))
                            var_11_DB = and:int(ldc:int(-5640), ldc:int(5639))
                            goto(Label_1375)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0517:
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1252)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1099300473))
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1800593084))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-210648639))
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-2127826593))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1744799890))
                            goto(Label_0357)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(1270772447))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0636:
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1252)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1489059310))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-762754567))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1483260204))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1261225477))
                            goto(Label_0357)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1441134178))
                            loopcontinue()
                        }
                        
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-608765897))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0762:
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1252)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1269457866))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1723452086))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(431472283))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1106152460))
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0357)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(1865654388))
                            loopcontinue()
                        }
                        
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-339772353))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(24), ldc:int(25))
                                goto(Label_1019)
                            }
                        }
                    }
                    
                    Label_0881:
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-2136388797))
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-362014848))
                        goto(Label_1252)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0762)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(312156958))
                            goto(Label_0357)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-877170337))
                        var_11_DB = and:int(ldc:int(-4545), ldc:int(4544))
                    }
                    
                    Label_1019:
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1252)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-90885119))
                            goto(Label_0881)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1927810866))
                            goto(Label_0762)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(1059198779))
                            goto(Label_0357)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1660265180))
                            loopcontinue()
                        }
                        
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-273160327))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1252)
                            }
                        }
                    }
                    
                    Label_1130:
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1931285290))
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(8468523))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_1019)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0881)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0762)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(430377201))
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1784489626))
                            goto(Label_0517)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0357)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5F6 = and:int(var_3_5F6:int, ldc:int(2079745491))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1375)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1252:
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-851863096))
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-2085324287))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-762554594))
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-925035759))
                        goto(Label_0357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5F6 = and:int(var_3_5F6:int, ldc:int(200768351))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1375:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_601 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1386:
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(1001729667))
                        goto(Label_1252)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1792305824))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(400889730))
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-2065321759))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-114581553))
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-554977803))
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-977740903))
                        goto(Label_0357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F6:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F6 = and:int(var_3_5F6:int, ldc:int(1475865043))
                        var_17_601 = add:int(var_16_109:int, and:int(ldc:int(33), ldc:int(32001)))
                        looporswitchbreak()
                    }
                    
                    var_3_5F6 = and:int(var_3_5F6:int, ldc:int(-1185394234))
                }
                
                var_3_5F6 = and:int(var_3_5F6:int, ldc:int(1609983547))
                
                if (cmple:boolean(var_5_7D = var_17_601:int, sub:int(var_6_84:int, and:int(ldc:int(8451), ldc:int(5205))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5F6:int, ldc:int(262144)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
