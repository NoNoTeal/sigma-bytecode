public class \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u6b5f\u4ab3\u99f7\u5245\u8350 {
    public void \u6b5f\u4ab3\u99f7\u5245\u8350(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, java.lang.String p1, int p2, int p3, int p4, int p5, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u97e6\u64f2\u527a\ud36e\u34df p6) {
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
    
    public \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u97e6\u64f2\u527a\ud36e\u34df \u6cfe\uff55\u72f1\u446c\u446c() {
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
            return:\u97e6\u64f2\u527a\ud36e\u34df(getfield:\u97e6\u64f2\u527a\ud36e\u34df(\u6b5f\u4ab3\u99f7\u5245\u8350::\u0c95\ud51e\u99f7\u8258\u6b0d, this:\u6b5f\u4ab3\u99f7\u5245\u8350))
        }
        
        goto(Label_0006)
    }
    
    public void \ucfaf\u7e3f\ube23\u4f52\u071d(float p0) {
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
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u36d3\u9255\u7873\u8350\uc3e3\u56bd, i2f:float(getfield:int(\u6b5f\u4ab3\u99f7\u5245\u8350::\u67d0\uf9c5\u4d85\u4179\u74b1, this:\u6b5f\u4ab3\u99f7\u5245\u8350)), i2f:float(getfield:int(\u6b5f\u4ab3\u99f7\u5245\u8350::\u6c56\u4f52\ubb2b\u8308\u9937, this:\u6b5f\u4ab3\u99f7\u5245\u8350)), i2f:float(getfield:int(\u6b5f\u4ab3\u99f7\u5245\u8350::\u8350\u1187\u6c56\ub32d\u927d, this:\u6b5f\u4ab3\u99f7\u5245\u8350)), i2f:float(getfield:int(\u6b5f\u4ab3\u99f7\u5245\u8350::\ub8be\u7873\u36d3\ub102\u8258, this:\u6b5f\u4ab3\u99f7\u5245\u8350)))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u40a9\u12cb\u62da\u836c\u92ee\u51fa, i2f:float(sub:int(getfield:int(\u6b5f\u4ab3\u99f7\u5245\u8350::\u67d0\uf9c5\u4d85\u4179\u74b1, this:\u6b5f\u4ab3\u99f7\u5245\u8350), mul:int(getfield:int(\u97e6\u64f2\u527a\ud36e\u34df::\u16f6\ud523\ud523\u8df4\u8bb0, getfield:\u97e6\u64f2\u527a\ud36e\u34df(\u6b5f\u4ab3\u99f7\u5245\u8350::\u0c95\ud51e\u99f7\u8258\u6b0d, this:\u6b5f\u4ab3\u99f7\u5245\u8350)), getfield:int(\u6b5f\u4ab3\u99f7\u5245\u8350::\u8350\u1187\u6c56\ub32d\u927d, this:\u6b5f\u4ab3\u99f7\u5245\u8350)))), i2f:float(getfield:int(\u6b5f\u4ab3\u99f7\u5245\u8350::\u6c56\u4f52\ubb2b\u8308\u9937, this:\u6b5f\u4ab3\u99f7\u5245\u8350)), i2f:float(mul:int(getfield:int(\u6b5f\u4ab3\u99f7\u5245\u8350::\u8350\u1187\u6c56\ub32d\u927d, this:\u6b5f\u4ab3\u99f7\u5245\u8350), and:int(ldc:int(10307), ldc:int(4263)))), i2f:float(getfield:int(\u6b5f\u4ab3\u99f7\u5245\u8350::\ub8be\u7873\u36d3\ub102\u8258, this:\u6b5f\u4ab3\u99f7\u5245\u8350)), getstatic:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\u5db4\u1187\u647c\u9255\u8258::\u873d\u0800\u7873\u59ec\ubb2b), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6d99\u6fb0\ub102\u8413\u8350)), ldc:float(0.35f)))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\ud523\u4bc8\ub18d\u7d52\u4e72\u97b7)
            invokespecial:void(\u12cb\u93a2\ubf56\uc229\u8d90::\ucfaf\u7e3f\ube23\u4f52\u071d, this:\u6b5f\u4ab3\u99f7\u5245\u8350[expected:\u12cb\u93a2\ubf56\uc229\u8d90], p0:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u40a9\ub6ab\u0c95\u0b8e\u56bd$0(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, int p1) {
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
            putfield:\u97e6\u64f2\u527a\ud36e\u34df(\u6b5f\u4ab3\u99f7\u5245\u8350::\u0c95\ud51e\u99f7\u8258\u6b0d, this:\u6b5f\u4ab3\u99f7\u5245\u8350, invokevirtual:\u97e6\u64f2\u527a\ud36e\u34df(\u97e6\u64f2\u527a\ud36e\u34df::\u6ec6\u61a4\u4c04\u120d\u4f52, getfield:\u97e6\u64f2\u527a\ud36e\u34df(\u6b5f\u4ab3\u99f7\u5245\u8350::\u0c95\ud51e\u99f7\u8258\u6b0d, this:\u6b5f\u4ab3\u99f7\u5245\u8350)))
            invokevirtual:void(\u3bd6\u156b\u8258\u0b8e\u4492::\ub83f\u67d0\u3e75\ua61f\u34df, this:\u6b5f\u4ab3\u99f7\u5245\u8350[expected:\u3bd6\u156b\u8258\u0b8e\u4492])
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
    
    public void \ucb79\u5bc4\u760c\u8413\u156b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_62B : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_636 : int
        
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
        var_3_62B = and:int(ldc:int(-203670849), ldc:int(-312607046))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6b5f\u4ab3\u99f7\u5245\u8350[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_62B = and:int(var_3_62B:int, ldc:int(-379765601))
            var_5_7D = and:int(ldc:int(-24630), ldc:int(24629))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(18513), ldc:int(-18770)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_62B:int, ldc:int(-35652422))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(1539), ldc:int(18545)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(-24416), ldc:int(-24415)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_62B = and:int(var_3_D2:int, ldc:int(-142672742))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(8484), ldc:int(8485)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(383767130))
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1248888331))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1398724315))
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1607579588))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1635745214))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-782978122))
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1488473371))
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(2051944849))
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-2072090969))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1138402732))
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(2)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(1709013691))
                            var_11_E3 = and:int(ldc:int(-17112), ldc:int(727))
                            goto(Label_1437)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1802651100))
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1248170300))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-400568751))
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(1540621452))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1776220826))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(314888519))
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(238179476))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-209847809))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0762:
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(880907526))
                        goto(Label_1135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-818859495))
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(342027315))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(64)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(1479264307))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-1940510153))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-1549529450))
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-268599398))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(2112), ldc:int(2113))
                                goto(Label_1019)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0762)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-2024730468))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-42998203))
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-411189862))
                        var_11_E3 = and:int(ldc:int(-19353), ldc:int(17304))
                    }
                    
                    Label_1019:
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1104469797))
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(392705720))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-1944875189))
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0762)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-669775051))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-438453094))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1291)
                            }
                        }
                    }
                    
                    Label_1135:
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1822561101))
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(2107352939))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(742520189))
                            goto(Label_1019)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-1256720896))
                            goto(Label_0762)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(1578186650))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(642365756))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_62B = and:int(var_3_62B:int, ldc:int(-1604360978))
                            loopcontinue()
                        }
                        
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-8619873))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1437)
                    }
                    
                    Label_1291:
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-391706412))
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1392998873))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(929586587))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(331720911))
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-483101252))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1432560671))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_62B = and:int(var_3_62B:int, ldc:int(2138864799))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1437:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_636 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1448:
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(941203277))
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-762177288))
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-1235884212))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1865213780))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-769624103))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(1467789962))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62B = and:int(var_3_62B:int, ldc:int(-176291937))
                        var_17_636 = add:int(var_16_111:int, xor:int(ldc:int(-31735), ldc:int(-31736)))
                        looporswitchbreak()
                    }
                    
                    var_3_62B = and:int(var_3_62B:int, ldc:int(893852143))
                }
                
                var_3_62B = and:int(var_3_62B:int, ldc:int(1669298430))
                
                if (cmple:boolean(var_5_7D = var_17_636:int, sub:int(var_6_84:int, and:int(ldc:int(6979), ldc:int(8249))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_62B:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_62B = and:int(var_3_62B:int, ldc:int(-1334135525))
            goto(Label_0106)
        }
    }
}
