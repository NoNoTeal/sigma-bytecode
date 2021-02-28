public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u8389\u6198\u8c8a\u5f50\u7049\u8258 {
    public void \u8389\u6198\u8c8a\u5f50\u7049\u8258(it.unimi.dsi.fastutil.doubles.DoubleList p0, it.unimi.dsi.fastutil.doubles.DoubleList p1, boolean p2) {
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
            invokespecial:AbstractDoubleList(AbstractDoubleList::<init>, this:\u8389\u6198\u8c8a\u5f50\u7049\u8258)
            putfield:DoubleList(\u8389\u6198\u8c8a\u5f50\u7049\u8258::\u7043\u0c95\u4975\u98a4\u74b1\u156b, this:\u8389\u6198\u8c8a\u5f50\u7049\u8258, p0:DoubleList)
            putfield:DoubleList(\u8389\u6198\u8c8a\u5f50\u7049\u8258::\ub18d\uc7fe\u5fe1\u5f50\u8350\u7d52, this:\u8389\u6198\u8c8a\u5f50\u7049\u8258, p1:DoubleList)
            putfield:boolean(\u8389\u6198\u8c8a\u5f50\u7049\u8258::\u62da\u4d85\ud51e\u946b\u8308\u6fb0, this:\u8389\u6198\u8c8a\u5f50\u7049\u8258, p2:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int size() {
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
            return:int(add:int(invokeinterface:int(DoubleList::size, getfield:DoubleList(\u8389\u6198\u8c8a\u5f50\u7049\u8258::\u7043\u0c95\u4975\u98a4\u74b1\u156b, this:\u8389\u6198\u8c8a\u5f50\u7049\u8258)), invokeinterface:int(DoubleList::size, getfield:DoubleList(\u8389\u6198\u8c8a\u5f50\u7049\u8258::\ub18d\uc7fe\u5fe1\u5f50\u8350\u7d52, this:\u8389\u6198\u8c8a\u5f50\u7049\u8258))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u71ae\u4179\ub1b9\u1187\ub19c\ud158(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\uc4d2\u9af2\u6c52\ud523\u6b5f\uc246 p0) {
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
    
    private boolean \u8258\u4492\u7e3f\u6cfe\ubded\u93a2(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\uc4d2\u9af2\u6c52\ud523\u6b5f\uc246 p0) {
        var_2_12C : int
        var_4_71 : int
        var_5_7A : int
        
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
        var_2_12C = and:int(ldc:int(-1861400282), ldc:int(-1309857429))
        var_4_71 = sub:int(invokeinterface:int(DoubleList::size, getfield:DoubleList(\u8389\u6198\u8c8a\u5f50\u7049\u8258::\u7043\u0c95\u4975\u98a4\u74b1\u156b, this:\u8389\u6198\u8c8a\u5f50\u7049\u8258)), xor:int(ldc:int(16772), ldc:int(16773)))
        var_5_7A = and:int(ldc:int(17530), ldc:int(-17531))
        
        loop {
            if (cmpne:boolean(and:int(var_2_12C:int, ldc:int(4096)), ldc:int(0))) {
                var_2_12C = and:int(var_2_12C:int, ldc:int(-1715596552))
                goto(Label_0465)
            }
            
            if (cmpne:boolean(and:int(var_2_12C:int, ldc:int(16)), ldc:int(0))) {
                var_2_12C = and:int(var_2_12C:int, ldc:int(-1874053664))
                goto(Label_0354)
            }
            
            if (cmpeq:boolean(and:int(var_2_12C:int, ldc:int(268435456)), ldc:int(0))) {
                var_2_12C = and:int(var_2_12C:int, ldc:int(-1920815929))
                goto(Label_0267)
            }
            
            if (cmpne:boolean(and:int(var_2_12C:int, ldc:int(262144)), ldc:int(0))) {
                var_2_12C = and:int(var_2_12C:int, ldc:int(-1313900240))
                
                if (cmplt:boolean(var_5_7A:int, var_4_71:int)) {
                    if (invokeinterface:boolean(\uc4d2\u9af2\u6c52\ud523\u6b5f\uc246::\u7ce1\u5140\u9033\u718f\u67d0\u3e2a, p0:\uc4d2\u9af2\u6c52\ud523\u6b5f\uc246, var_5_7A:int, ldc:int(-1), var_5_7A:int)) {
                        goto(Label_0354)
                    }
                    
                    return:boolean(and:int[expected:boolean](ldc:int(3087), ldc:int(-11280)))
                }
            }
            
            Label_0188:
            
            if (cmpeq:boolean(and:int(var_2_12C:int, ldc:int(262144)), ldc:int(0))) {
                var_2_12C = and:int(var_2_12C:int, ldc:int(-1228552705))
                goto(Label_0465)
            }
            
            if (cmpne:boolean(and:int(var_2_12C:int, ldc:int(2097152)), ldc:int(0))) {
                var_2_12C = and:int(var_2_12C:int, ldc:int(-1453460964))
                goto(Label_0354)
            }
            
            if (cmpne:boolean(and:int(var_2_12C:int, ldc:int(4096)), ldc:int(0))) {
                var_2_12C = and:int(var_2_12C:int, ldc:int(-1397782806))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_12C:int, ldc:int(16777216)), ldc:int(0))) {
                    var_2_12C = and:int(var_2_12C:int, ldc:int(1503973315))
                    loopcontinue()
                }
                
                var_2_12C = and:int(var_2_12C:int, ldc:int(-38972939))
                
                if (logicalnot:boolean(invokeinterface:boolean(\uc4d2\u9af2\u6c52\ud523\u6b5f\uc246::\u7ce1\u5140\u9033\u718f\u67d0\u3e2a, p0:\uc4d2\u9af2\u6c52\ud523\u6b5f\uc246, var_4_71:int, ldc:int(-1), var_4_71:int))) {
                    return:boolean(and:int[expected:boolean](ldc:int(-18950), ldc:int(18949)))
                }
            }
            
            Label_0267:
            
            if (cmpne:boolean(and:int(var_2_12C:int, ldc:int(32768)), ldc:int(0))) {
                var_2_12C = and:int(var_2_12C:int, ldc:int(-1395267029))
                goto(Label_0465)
            }
            
            if (cmpeq:boolean(and:int(var_2_12C:int, ldc:int(2097152)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_2_12C:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_12C = and:int(var_2_12C:int, ldc:int(414295879))
                    goto(Label_0188)
                }
                
                if (cmpeq:boolean(and:int(var_2_12C:int, ldc:int(32)), ldc:int(0))) {
                    var_2_12C = and:int(var_2_12C:int, ldc:int(1056945637))
                    loopcontinue()
                }
                
                var_2_12C = and:int(var_2_12C:int, ldc:int(-1857174081))
                var_5_7A = and:int(ldc:int(25122), ldc:int(-25123))
                
                while (cmplt:boolean(var_5_7A:int, invokeinterface:int(DoubleList::size, getfield:DoubleList(\u8389\u6198\u8c8a\u5f50\u7049\u8258::\ub18d\uc7fe\u5fe1\u5f50\u8350\u7d52, this:\u8389\u6198\u8c8a\u5f50\u7049\u8258)))) {
                    if (logicalnot:boolean(invokeinterface:boolean(\uc4d2\u9af2\u6c52\ud523\u6b5f\uc246::\u7ce1\u5140\u9033\u718f\u67d0\u3e2a, p0:\uc4d2\u9af2\u6c52\ud523\u6b5f\uc246, var_4_71:int, var_5_7A:int, add:int(add:int(var_4_71:int, xor:int(ldc:int(169), ldc:int(168))), var_5_7A:int)))) {
                        return:boolean(and:int[expected:boolean](ldc:int(-8365), ldc:int(8364)))
                    }
                    
                    var_2_12C = and:int(var_2_12C:int, ldc:int(468668339))
                    inc:int(var_5_7A, ldc:int(1))
                }
                
                goto(Label_0465)
            }
            
            Label_0354:
            
            if (cmpne:boolean(and:int(var_2_12C:int, ldc:int(524288)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_2_12C:int, ldc:int(16777216)), ldc:int(0))) {
                    var_2_12C = and:int(var_2_12C:int, ldc:int(182309085))
                    goto(Label_0267)
                }
                
                if (cmpne:boolean(and:int(var_2_12C:int, ldc:int(512)), ldc:int(0))) {
                    var_2_12C = and:int(var_2_12C:int, ldc:int(-362959815))
                    goto(Label_0188)
                }
                
                if (cmpeq:boolean(and:int(var_2_12C:int, ldc:int(256)), ldc:int(0))) {
                    var_2_12C = and:int(var_2_12C:int, ldc:int(398271107))
                    loopcontinue()
                }
                
                var_2_12C = and:int(var_2_12C:int, ldc:int(2037381437))
                inc:int(var_5_7A, ldc:int(1))
                loopcontinue()
            }
            
            Label_0465:
            
            if (cmpne:boolean(and:int(var_2_12C:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0354)
            }
            
            if (cmpne:boolean(and:int(var_2_12C:int, ldc:int(32768)), ldc:int(0))) {
                var_2_12C = and:int(var_2_12C:int, ldc:int(-1862743883))
                goto(Label_0267)
            }
            
            if (cmpeq:boolean(and:int(var_2_12C:int, ldc:int(16777216)), ldc:int(0))) {
                var_2_12C = and:int(var_2_12C:int, ldc:int(10298602))
                goto(Label_0188)
            }
            
            if (cmpeq:boolean(and:int(var_2_12C:int, ldc:int(16)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(1051), ldc:int(6789)))
            }
        }
    }
    
    public double getDouble(int p0) {
        var_2_5F : int
        stack_9C_0 : double [generated]
        
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
            var_2_5F = and:int(ldc:int(-754697429), ldc:int(-1953219825))
            
            if (cmpge:boolean(p0:int, invokeinterface:int(DoubleList::size, getfield:DoubleList(\u8389\u6198\u8c8a\u5f50\u7049\u8258::\u7043\u0c95\u4975\u98a4\u74b1\u156b, this:\u8389\u6198\u8c8a\u5f50\u7049\u8258)))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1411002749))
                stack_9C_0 = invokeinterface:double(DoubleList::getDouble, getfield:DoubleList(\u8389\u6198\u8c8a\u5f50\u7049\u8258::\ub18d\uc7fe\u5fe1\u5f50\u8350\u7d52, this:\u8389\u6198\u8c8a\u5f50\u7049\u8258), sub:int(p0:int, invokeinterface:int(DoubleList::size, getfield:DoubleList(\u8389\u6198\u8c8a\u5f50\u7049\u8258::\u7043\u0c95\u4975\u98a4\u74b1\u156b, this:\u8389\u6198\u8c8a\u5f50\u7049\u8258))))
            }
            else {
                stack_9C_0 = invokeinterface:double(DoubleList::getDouble, getfield:DoubleList(\u8389\u6198\u8c8a\u5f50\u7049\u8258::\u7043\u0c95\u4975\u98a4\u74b1\u156b, this:\u8389\u6198\u8c8a\u5f50\u7049\u8258), p0:int)
            }
            
            return:double(stack_9C_0:double)
        }
        
        goto(Label_0006)
    }
    
    public it.unimi.dsi.fastutil.doubles.DoubleList \u759a\u873d\u5140\u67e9\u2dcc\u760c() {
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
            return:DoubleList(this:\u8389\u6198\u8c8a\u5f50\u7049\u8258[expected:DoubleList])
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u839e\u3e2a\u62da\u3711\uafe7\u9a18$0(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\uc4d2\u9af2\u6c52\ud523\u6b5f\uc246 p0, int p1, int p2, int p3) {
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
            return:boolean(invokeinterface:boolean(\uc4d2\u9af2\u6c52\ud523\u6b5f\uc246::\u7ce1\u5140\u9033\u718f\u67d0\u3e2a, p0:\uc4d2\u9af2\u6c52\ud523\u6b5f\uc246, p2:int, p1:int, p3:int))
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
    
    public void \u40a9\u3d4b\ufcaf\u9033\uc2bd\ud523(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_602 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_60D : int
        
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
        var_3_602 = and:int(ldc:int(1956284972), ldc:int(-138778107))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8389\u6198\u8c8a\u5f50\u7049\u8258[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(512)), ldc:int(0))) {
            var_3_602 = and:int(var_3_602:int, ldc:int(1973407522))
            var_5_7D = and:int(ldc:int(25132), ldc:int(-26157))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-1580), ldc:int(1579)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_602:int, ldc:int(2006694768))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(3301), ldc:int(24851)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(17), ldc:int(16)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_602 = and:int(var_3_D2:int, ldc:int(1994038163))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(-32492), ldc:int(-32491)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-8763195))
                        goto(Label_1304)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(1172739575))
                        goto(Label_1177)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1061)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(64)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-520081255))
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(414686641))
                    }
                    else {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-155501978))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1304)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1177)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(613837147))
                        goto(Label_1061)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(256)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(384861332))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1072581281))
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(1808697791))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(690429773))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(882617960))
                            loopcontinue()
                        }
                        
                        var_3_602 = and:int(var_3_602:int, ldc:int(-23373202))
                        var_11_E3 = and:int(ldc:int(17755), ldc:int(-25948))
                        goto(Label_1423)
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1304)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1177)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1061)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-2142060067))
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1564787846))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_602 = and:int(var_3_602:int, ldc:int(-155292722))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(64)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1078264412))
                        goto(Label_1304)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(512)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1961571142))
                        goto(Label_1177)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1061)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(256)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1732976951))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(1171130600))
                            loopcontinue()
                        }
                        
                        var_3_602 = and:int(var_3_602:int, ldc:int(-174400961))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0770:
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(256)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(1901872428))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(37762397))
                        goto(Label_1304)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1723877468))
                        goto(Label_1177)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-117443932))
                        goto(Label_1061)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(-1409290054))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(-1615172954))
                            loopcontinue()
                        }
                        
                        var_3_602 = and:int(var_3_602:int, ldc:int(2090732527))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(641), ldc:int(24657))
                                goto(Label_1061)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(847996053))
                        goto(Label_1304)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(388440373))
                        goto(Label_1177)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1984607957))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(256)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(38468435))
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(-1159272526))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(64)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(619594686))
                            loopcontinue()
                        }
                        
                        var_3_602 = and:int(var_3_602:int, ldc:int(1975177017))
                        var_11_E3 = and:int(ldc:int(28788), ldc:int(-30582))
                    }
                    
                    Label_1061:
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(1202135437))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1304)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(64)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(-1313164079))
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(64)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(2021147523))
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(1361004911))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_602 = and:int(var_3_602:int, ldc:int(1977510514))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1304)
                            }
                        }
                    }
                    
                    Label_1177:
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_1061)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(-1371754592))
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(512)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(-1485314526))
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(1082535022))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(-185866101))
                            loopcontinue()
                        }
                        
                        var_3_602 = and:int(var_3_602:int, ldc:int(-23404784))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1423)
                    }
                    
                    Label_1304:
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1177)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1061)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(1880621423))
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-872805142))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(256)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(1831658085))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(524288)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_602 = and:int(var_3_602:int, ldc:int(-138702965))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1423:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_60D = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1434:
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1304)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1177)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-533932746))
                        goto(Label_1061)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(268960096))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(1367877420))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(256)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(1059868167))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-155506011))
                        var_17_60D = add:int(var_16_111:int, and:int(ldc:int(419), ldc:int(30233)))
                        looporswitchbreak()
                    }
                }
                
                var_3_602 = and:int(var_3_602:int, ldc:int(-17126547))
                
                if (cmple:boolean(var_5_7D = var_17_60D:int, sub:int(var_6_84:int, xor:int(ldc:int(2124), ldc:int(2125))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_602 = and:int(var_3_602:int, ldc:int(1051490031))
            goto(Label_0106)
        }
    }
}
