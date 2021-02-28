public class \u6b0d\u12cb\u156b\u4179\u8bb0.\u6c52\ua61f\u71f1\uc229\u3dd3 {
    public void \u6c52\ua61f\u71f1\uc229\u3dd3(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, java.lang.String p1, int p2, int p3, int p4, int p5, java.lang.String p6, java.util.List<java.lang.Integer> p7) {
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
            invokespecial:\u3bd6\u156b\u8258\u0b8e\u4492(\u3bd6\u156b\u8258\u0b8e\u4492::<init>, this:\u6c52\ua61f\u71f1\uc229\u3dd3, p0:\u12cb\u93a2\ubf56\uc229\u8d90, p1:String, p2:int, p3:int, p4:int, p5:int, getstatic:\u4c04\u6b0d\u61a4\u6435\u71ae(\u6c52\ua61f\u71f1\uc229\u3dd3::\ub8be\u4ab3\u446c\u16f6\u0a06), p6:String, and:int[expected:boolean](ldc:int(-32601), ldc:int(16144)))
            putfield:List<Integer>(\u6c52\ua61f\u71f1\uc229\u3dd3::\u92ff\u4179\u9033\u3bc9\u385b, this:\u6c52\ua61f\u71f1\uc229\u3dd3, initobject:ArrayList<Integer>[expected:List<Integer>](ArrayList<E>::<init>))
            putfield:List<Integer>(\u6c52\ua61f\u71f1\uc229\u3dd3::\uc29a\ufe34\u494c\u4cd9\u2dcc, this:\u6c52\ua61f\u71f1\uc229\u3dd3, initobject:ArrayList<Integer>[expected:List<Integer>](ArrayList<E>::<init>))
            putfield:List<Integer>(\u6c52\ua61f\u71f1\uc229\u3dd3::\u92ff\u4179\u9033\u3bc9\u385b, this:\u6c52\ua61f\u71f1\uc229\u3dd3, p7:List<Integer>)
            invokespecial:void(\u6c52\ua61f\u71f1\uc229\u3dd3::\u8709\u7873\ud51e\ufe34\u9af2, this:\u6c52\ua61f\u71f1\uc229\u3dd3)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u8709\u7873\ud51e\ufe34\u9af2() {
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
    
    private int \u8c8a\ud171\u5245\u5654\u7330() {
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
            return:int(f2i:int(mul:float(i2f:float(add:int(add:int(mul:int(ldc:int(50), div:int(invokeinterface:int(List<E>::size, getfield:List<Integer>(\u6c52\ua61f\u71f1\uc229\u3dd3::\u92ff\u4179\u9033\u3bc9\u385b, this:\u6c52\ua61f\u71f1\uc229\u3dd3)), div:int(getfield:int(\u6c52\ua61f\u71f1\uc229\u3dd3::\u8350\u1187\u6c56\ub32d\u927d, this:\u6c52\ua61f\u71f1\uc229\u3dd3), ldc:int(50)))), xor:int(ldc:int(-30720), ldc:int(-30719))), ldc:int(50))), mul:float(getfield:float(\u6c52\ua61f\u71f1\uc229\u3dd3::\u5fe1\ufcaf\u3711\ub113\uc87f, this:\u6c52\ua61f\u71f1\uc229\u3dd3), getfield:float(\u6c52\ua61f\u71f1\uc229\u3dd3::\u5fe1\ufcaf\u3711\ub113\uc87f, this:\u6c52\ua61f\u71f1\uc229\u3dd3)))))
        }
        
        goto(Label_0006)
    }
    
    public void \uafe7\u47c2\ufcaf\u9255\u960f(int p0, int p1) {
        var_3_5F : int
        var_3_D7 : int
        stack_FA_0 : float [generated]
        stack_FA_1 : float [generated]
        
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
            var_3_5F = and:int(ldc:int(-273056912), ldc:int(-73673742))
            invokespecial:void(\uafe7\u72f1\u7e3f\uc238\u34df::\uafe7\u47c2\ufcaf\u9255\u960f, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\uafe7\u72f1\u7e3f\uc238\u34df], p0:int, p1:int)
            
            if (logicalnot:boolean(invokevirtual:boolean(\u6c52\ua61f\u71f1\uc229\u3dd3::\u8413\uc229\u6fb0\uc7fe\u5f50, this:\u6c52\ua61f\u71f1\uc229\u3dd3, p0:int, p1:int))) {
                if (invokevirtual:boolean(\u6c52\ua61f\u71f1\uc229\u3dd3::\u5654\ub113\u836c\u67d0\u74b1, this:\u6c52\ua61f\u71f1\uc229\u3dd3)) {
                    putfield:boolean(\u6c52\ua61f\u71f1\uc229\u3dd3::\u6bb9\u4bc8\ubff1\ud171\ube23, this:\u6c52\ua61f\u71f1\uc229\u3dd3, and:int[expected:boolean](ldc:int(2051), ldc:int(21005)))
                }
            }
            
            loop {
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(1)), ldc:int(0))) {
                    var_3_D7 = and:int(var_3_5F:int, ldc:int(1218132469))
                }
                else {
                    var_3_D7 = and:int(var_3_5F:int, ldc:int(-1382056128))
                    
                    if (getfield:boolean(\u6c52\ua61f\u71f1\uc229\u3dd3::\u6bb9\u4bc8\ubff1\ud171\ube23, this:\u6c52\ua61f\u71f1\uc229\u3dd3)) {
                        stack_FA_0 = getfield:float(\u6c52\ua61f\u71f1\uc229\u3dd3::\u5fe1\ufcaf\u3711\ub113\uc87f, this:\u6c52\ua61f\u71f1\uc229\u3dd3)
                        
                        if (logicalnot:boolean(invokevirtual:boolean(\u6c52\ua61f\u71f1\uc229\u3dd3::\u5654\ub113\u836c\u67d0\u74b1, this:\u6c52\ua61f\u71f1\uc229\u3dd3))) {
                            var_3_D7 = and:int(var_3_D7:int, ldc:int(-1147145399))
                            stack_FA_1 = add:float(ldc:float(0.014f), mul:float(ldc:float(0.28f), sub:float(ldc:float(1.0f), getfield:float(\u6c52\ua61f\u71f1\uc229\u3dd3::\u5fe1\ufcaf\u3711\ub113\uc87f, this:\u6c52\ua61f\u71f1\uc229\u3dd3))))
                        }
                        else {
                            stack_FA_1 = sub:float(ldc:float(-0.014f), mul:float(ldc:float(0.14f), getfield:float(\u6c52\ua61f\u71f1\uc229\u3dd3::\u5fe1\ufcaf\u3711\ub113\uc87f, this:\u6c52\ua61f\u71f1\uc229\u3dd3)))
                        }
                        
                        var_3_D7 = and:int(var_3_D7:int, ldc:int(-371471525))
                        putfield:float(\u6c52\ua61f\u71f1\uc229\u3dd3::\u5fe1\ufcaf\u3711\ub113\uc87f, this:\u6c52\ua61f\u71f1\uc229\u3dd3, add:float(stack_FA_0:float, stack_FA_1:float))
                        
                        if (cmplt:boolean(getfield:float(\u6c52\ua61f\u71f1\uc229\u3dd3::\u5fe1\ufcaf\u3711\ub113\uc87f, this:\u6c52\ua61f\u71f1\uc229\u3dd3), ldc:float(1.0f))) {
                            var_3_D7 = and:int(var_3_D7:int, ldc:int(-33821829))
                            
                            if (cmple:boolean(getfield:float(\u6c52\ua61f\u71f1\uc229\u3dd3::\u5fe1\ufcaf\u3711\ub113\uc87f, this:\u6c52\ua61f\u71f1\uc229\u3dd3), ldc:float(0.0f))) {
                                putfield:float(\u6c52\ua61f\u71f1\uc229\u3dd3::\u5fe1\ufcaf\u3711\ub113\uc87f, this:\u6c52\ua61f\u71f1\uc229\u3dd3, ldc:float(0.0f))
                                putfield:boolean(\u6c52\ua61f\u71f1\uc229\u3dd3::\u6bb9\u4bc8\ubff1\ud171\ube23, this:\u6c52\ua61f\u71f1\uc229\u3dd3, and:int[expected:boolean](ldc:int(-519), ldc:int(518)))
                                putfield:boolean(\u6c52\ua61f\u71f1\uc229\u3dd3::\u9af2\u7ce1\u927d\ud523\u3a62, this:\u6c52\ua61f\u71f1\uc229\u3dd3, and:int[expected:boolean](ldc:int(-7733), ldc:int(7732)))
                            }
                        }
                        else {
                            putfield:float(\u6c52\ua61f\u71f1\uc229\u3dd3::\u5fe1\ufcaf\u3711\ub113\uc87f, this:\u6c52\ua61f\u71f1\uc229\u3dd3, ldc:float(1.0f))
                            putfield:boolean(\u6c52\ua61f\u71f1\uc229\u3dd3::\u6bb9\u4bc8\ubff1\ud171\ube23, this:\u6c52\ua61f\u71f1\uc229\u3dd3, and:int[expected:boolean](ldc:int(6993), ldc:int(-6998)))
                            putfield:boolean(\u6c52\ua61f\u71f1\uc229\u3dd3::\u9af2\u7ce1\u927d\ud523\u3a62, this:\u6c52\ua61f\u71f1\uc229\u3dd3, and:int[expected:boolean](ldc:int(1025), ldc:int(22871)))
                        }
                    }
                }
                
                if (cmpeq:boolean(and:int(var_3_D7:int, ldc:int(2)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_5F = and:int(var_3_D7:int, ldc:int(-677633415))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ucfaf\u7e3f\ube23\u4f52\u071d(float p0) {
        var_4_141 : int
        var_5_157 : int
        var_6_167 : int
        
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
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8cae\u7d52\u51fa\u0a06\uc910\u93a2, i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90]))), i2f:float(add:int(add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), invokespecial:int(\u6c52\ua61f\u71f1\uc229\u3dd3::\u8c8a\ud171\u5245\u5654\u7330, this:\u6c52\ua61f\u71f1\uc229\u3dd3))), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6d99\u6fb0\ub102\u8413\u8350)), p0:float))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u7330\uf995\u7af6\uc29a\u960f\u3bc9, i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), invokespecial:int(\u6c52\ua61f\u71f1\uc229\u3dd3::\u8c8a\ud171\u5245\u5654\u7330, this:\u6c52\ua61f\u71f1\uc229\u3dd3))), ldc:float(6.0f), mul:float(p0:float, ldc:float(0.21f)))
            
            if (cmpne:boolean(invokevirtual:String(\u12cb\u93a2\ubf56\uc229\u8d90::\u3bc9\u8753\ua068\u0800\u93a2, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), aconstnull:String())) {
                invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\uc31c\u74b1\u8389\u494c\u88c5\u446c, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90])
                invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8350\u52d3\ub8be\u9033\ub7dc\ub18d, invokevirtual:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u12cb\u93a2\ubf56\uc229\u8d90::\u5db4\u927d\u92ee\u4c04\ua3b4, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), i2f:float(add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), ldc:int(10))), i2f:float(add:int(add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), div:int(sub:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), invokevirtual:int(\u6fb0\u1187\u12b2\ua068\u5245\u67e9::\ud523\u64f2\u52d3\u97b7\ub113\u7873, invokevirtual:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u12cb\u93a2\ubf56\uc229\u8d90::\u5db4\u927d\u92ee\u4c04\ua3b4, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90]))), and:int(ldc:int(26122), ldc:int(2402)))), and:int(ldc:int(10241), ldc:int(17117)))), getfield:String(\u6c52\ua61f\u71f1\uc229\u3dd3::\uc2e8\ucb79\u0b8e\u392e\u36d3, this:\u6c52\ua61f\u71f1\uc229\u3dd3), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, invokevirtual:int(\u4c04\u6b0d\u61a4\u6435\u71ae::\ub1b9\uae87\uae5d\ua068\u647c\uc84e, getfield:\u4c04\u6b0d\u61a4\u6435\u71ae(\u6c52\ua61f\u71f1\uc229\u3dd3::\u7330\u7bad\u6bb9\u416d\ub171, this:\u6c52\ua61f\u71f1\uc229\u3dd3)), mul:float(p0:float, ldc:float(0.7f))))
                invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\ud523\u4bc8\ub18d\u7d52\u4e72\u97b7)
            }
            
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\uc31c\u74b1\u8389\u494c\u88c5\u446c, invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u0a06\u600f\u8bb0\u392e\ud36e, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u0a06\u4f52\u446c\u8308\u0c95, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u0a06\u600f\u8bb0\u392e\ud36e, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), add:int(add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u0a06\u4f52\u446c\u8308\u0c95, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), invokespecial:int(\u6c52\ua61f\u71f1\uc229\u3dd3::\u8c8a\ud171\u5245\u5654\u7330, this:\u6c52\ua61f\u71f1\uc229\u3dd3)))
            invokestatic:void(GL11::glPushMatrix)
            
            if (cmpgt:boolean(getfield:float(\u6c52\ua61f\u71f1\uc229\u3dd3::\u5fe1\ufcaf\u3711\ub113\uc87f, this:\u6c52\ua61f\u71f1\uc229\u3dd3), ldc:float(0.0f))) {
                invokespecial:void(\u12cb\u93a2\ubf56\uc229\u8d90::\ucfaf\u7e3f\ube23\u4f52\u071d, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90], p0:float)
            }
            
            invokestatic:void(GL11::glPopMatrix)
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\ud523\u4bc8\ub18d\u7d52\u4e72\u97b7)
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u7049\u7ce1\u9255\u4975\u718f\ub102, i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90]))), i2f:float(add:int(add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), invokespecial:int(\u6c52\ua61f\u71f1\uc229\u3dd3::\u8c8a\ud171\u5245\u5654\u7330, this:\u6c52\ua61f\u71f1\uc229\u3dd3))), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, invokevirtual:int(\u4c04\u6b0d\u61a4\u6435\u71ae::\u12cb\u59ec\u8709\u8308\ucef1\u6d99, getfield:\u4c04\u6b0d\u61a4\u6435\u71ae(\u6c52\ua61f\u71f1\uc229\u3dd3::\u7330\u7bad\u6bb9\u416d\ub171, this:\u6c52\ua61f\u71f1\uc229\u3dd3)), mul:float(p0:float, ldc:float(0.08f))))
            var_4_141 = sub:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), f2i:int(add:float(div:float(i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), ldc:float(2.0f)), ldc:float(0.5f))))
            var_5_157 = add:int(f2i:int(add:float(div:float(i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), ldc:float(2.0f)), ldc:float(0.5f))), xor:int(ldc:int(-28652), ldc:int(-28651)))
            var_6_167 = f2i:int(add:float(div:float(i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), ldc:float(6.0f)), ldc:float(0.5f)))
            invokestatic:void(GL11::glTranslatef, i2f:float(add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), var_4_141:int)), i2f:float(add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), var_5_157:int)), ldc:float(0.0f))
            invokestatic:void(GL11::glRotatef, mul:float(ldc:float(90.0f), getfield:float(\u6c52\ua61f\u71f1\uc229\u3dd3::\u5fe1\ufcaf\u3711\ub113\uc87f, this:\u6c52\ua61f\u71f1\uc229\u3dd3)), ldc:float(0.0f), ldc:float(0.0f), ldc:float(1.0f))
            invokestatic:void(GL11::glTranslatef, i2f:float(sub:int(neg:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), var_4_141:int)), i2f:float(sub:int(neg:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), var_5_157:int)), ldc:float(0.0f))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8350\u52d3\ub8be\u9033\ub7dc\ub18d, getfield:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u6c52\ua61f\u71f1\uc229\u3dd3::\u12b2\u8aa5\u494c\ud36e\u51b2, this:\u6c52\ua61f\u71f1\uc229\u3dd3), i2f:float(sub:int(add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), var_4_141:int), ldc:int(6))), i2f:float(sub:int(add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), var_5_157:int), ldc:int(14))), loadelement:String(getstatic:String[](\u6c52\ua61f\u71f1\uc229\u3dd3::\u4ab3\u99f7\u3a62\u3711\ub6ab), and:int(ldc:int(7298), ldc:int(278))), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, invokevirtual:int(\u4c04\u6b0d\u61a4\u6435\u71ae::\ub1b9\uae87\uae5d\ua068\u647c\uc84e, getfield:\u4c04\u6b0d\u61a4\u6435\u71ae(\u6c52\ua61f\u71f1\uc229\u3dd3::\u7330\u7bad\u6bb9\u416d\ub171, this:\u6c52\ua61f\u71f1\uc229\u3dd3)), mul:float(mul:float(p0:float, ldc:float(0.7f)), ternaryop:float(invokevirtual:boolean(\u6c52\ua61f\u71f1\uc229\u3dd3::\u8413\uc229\u6fb0\uc7fe\u5f50, this:\u6c52\ua61f\u71f1\uc229\u3dd3, invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u4e72\u120d\u16f6\u6fb0\u4cd9, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\ub70c\ub19c\uc3e3\uae5d\u92ee, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), ldc:float(1.0f), ldc:float(0.5f)))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<java.lang.Integer> \u62da\ub7dc\ua6bd\ua562\u3c25() {
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
            return:List<Integer>(getfield:List<Integer>(\u6c52\ua61f\u71f1\uc229\u3dd3::\u92ff\u4179\u9033\u3bc9\u385b, this:\u6c52\ua61f\u71f1\uc229\u3dd3))
        }
        
        goto(Label_0006)
    }
    
    public void \u3a62\u6435\u7043\u873d\u3a62(java.lang.Integer p0, int p1) {
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
            invokeinterface:void(List<Integer>::add, invokevirtual:List<Integer>(\u6c52\ua61f\u71f1\uc229\u3dd3::\u62da\ub7dc\ua6bd\ua562\u3c25, this:\u6c52\ua61f\u71f1\uc229\u3dd3), p1:int, p0:Integer)
            invokespecial:void(\u6c52\ua61f\u71f1\uc229\u3dd3::\u8709\u7873\ud51e\ufe34\u9af2, this:\u6c52\ua61f\u71f1\uc229\u3dd3)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3a62\u6435\u7043\u873d\u3a62(java.lang.Integer p0) {
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
            invokevirtual:void(\u6c52\ua61f\u71f1\uc229\u3dd3::\u3a62\u6435\u7043\u873d\u3a62, this:\u6c52\ua61f\u71f1\uc229\u3dd3, p0:Integer, invokeinterface:int(List<E>::size, getfield:List<Integer>(\u6c52\ua61f\u71f1\uc229\u3dd3::\u92ff\u4179\u9033\u3bc9\u385b, this:\u6c52\ua61f\u71f1\uc229\u3dd3)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u5654\ub113\u836c\u67d0\u74b1() {
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
            return:boolean(getfield:boolean(\u6c52\ua61f\u71f1\uc229\u3dd3::\u9af2\u7ce1\u927d\ud523\u3a62, this:\u6c52\ua61f\u71f1\uc229\u3dd3))
        }
        
        goto(Label_0006)
    }
    
    public void \u97b7\u183a\ud7e8\u183a\ub113(boolean p0) {
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
            
            if (cmpne:boolean(p0:boolean, getfield:boolean(\u6c52\ua61f\u71f1\uc229\u3dd3::\u9af2\u7ce1\u927d\ud523\u3a62, this:\u6c52\ua61f\u71f1\uc229\u3dd3))) {
                putfield:boolean(\u6c52\ua61f\u71f1\uc229\u3dd3::\u6bb9\u4bc8\ubff1\ud171\ube23, this:\u6c52\ua61f\u71f1\uc229\u3dd3, xor:int[expected:boolean](ldc:int(1217), ldc:int(1216)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u8413\uc229\u6fb0\uc7fe\u5f50(int p0, int p1) {
        var_3_61 : int
        stack_C3_0 : int [generated]
        
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
            var_3_61 = and:int(ldc:int(2024370593), ldc:int(1555723247))
            p0 = sub:int(p0:int, invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u0a06\u600f\u8bb0\u392e\ud36e, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90]))
            p1 = sub:int(p1:int, invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u0a06\u4f52\u446c\u8308\u0c95, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90]))
            
            if (cmpge:boolean(p0:int, ldc:int(0))) {
                if (cmple:boolean(p0:int, invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90]))) {
                    if (cmpge:boolean(p1:int, ldc:int(0))) {
                        if (cmple:boolean(p1:int, add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), invokespecial:int(\u6c52\ua61f\u71f1\uc229\u3dd3::\u8c8a\ud171\u5245\u5654\u7330, this:\u6c52\ua61f\u71f1\uc229\u3dd3)))) {
                            stack_C3_0 = and:int[expected:boolean](ldc:int(17191), ldc:int(4225))
                            return:boolean(stack_C3_0:boolean)
                        }
                    }
                }
            }
            
            var_3_61 = and:int(var_3_61:int, ldc:int(-6431823))
            stack_C3_0 = and:int[expected:boolean](ldc:int(-31589), ldc:int(29540))
            return:boolean(stack_C3_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u3bd6\u8aa5\uc238\uae5d\u9033$2(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, int p1) {
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
            invokevirtual:void(\u3bd6\u156b\u8258\u0b8e\u4492::\ub83f\u67d0\u3e75\ua61f\u34df, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u3bd6\u156b\u8258\u0b8e\u4492])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\uc87f\u8308\u5fe1\ud171\u6fb0$1(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, int p1) {
        var_3_61 : int
        stack_8B_1 : int [generated]
        
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
            var_3_61 = and:int(ldc:int(-2029209321), ldc:int(-314246733))
            
            if (invokevirtual:boolean(\u6c52\ua61f\u71f1\uc229\u3dd3::\u5654\ub113\u836c\u67d0\u74b1, this:\u6c52\ua61f\u71f1\uc229\u3dd3)) {
                var_3_61 = and:int(var_3_61:int, ldc:int(1660911575))
                stack_8B_1 = and:int[expected:boolean](ldc:int(-15223), ldc:int(2866))
            }
            else {
                stack_8B_1 = and:int[expected:boolean](ldc:int(10923), ldc:int(4357))
            }
            
            invokevirtual:void(\u6c52\ua61f\u71f1\uc229\u3dd3::\u97b7\u183a\ud7e8\u183a\ub113, this:\u6c52\ua61f\u71f1\uc229\u3dd3, stack_8B_1:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u494c\u4e72\u8258\u7e3f\u8d98$0(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, \ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p1) {
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
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\ube23\u4daf\ub171\u6198\u51b2, p0:\u12cb\u93a2\ubf56\uc229\u8d90, and:int(ldc:int(2864), ldc:int(-20275)))
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u839e\u960f\u64ab\u8cae\ub8be, p0:\u12cb\u93a2\ubf56\uc229\u8d90, and:int(ldc:int(-23327), ldc:int(23320)))
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u0b8e\ud4fe\uc229\u92ee\ud4fe, p0:\u12cb\u93a2\ubf56\uc229\u8d90, invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90]))
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\uc9f6\u759a\u64ab\u97e6\u9255, p0:\u12cb\u93a2\ubf56\uc229\u8d90, invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:\u12cb\u93a2\ubf56\uc229\u8d90]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_26B : int
        expr_6E : int [generated]
        stack_A4_0 : byte[] [generated]
        stack_A6_0 : byte[] [generated]
        stack_E7_0 : byte[] [generated]
        stack_E9_0 : byte[] [generated]
        stack_13A_0 : byte[] [generated]
        stack_13C_0 : byte[] [generated]
        stack_172_0 : byte[] [generated]
        stack_174_0 : byte[] [generated]
        stack_1BB_0 : byte[] [generated]
        stack_286_0 : byte[] [generated]
        stack_2D7_0 : byte[] [generated]
        stack_346_0 : byte[] [generated]
        stack_39D_0 : byte[] [generated]
        stack_41B_0 : byte[] [generated]
        var_4_256 : int
        var_3_25B : byte[]
        var_5_25C : int
        expr_286 : byte [generated]
        var_0_3B7 : int
        expr_39D : byte [generated]
        stack_3E6_2 : byte [generated]
        stack_3BA_0 : byte [generated]
        var_2_A4 : byte[]
        expr_A8 : int [generated]
        var_3_2C5 : byte[]
        var_5_2C6 : int
        expr_E9 : int [generated]
        expr_13C : int [generated]
        expr_174 : int [generated]
        var_3_409 : byte[]
        var_5_40A : int
        var_3_1C7 : String
        stack_230_0 : String[] [generated]
        expr_1D9 : String[] [generated]
        
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
        var_0_26B = and:int(ldc:int(-1069390181), ldc:int(-159947112))
        expr_6E = arraylength:int(stack_A4_0 = stack_A6_0 = stack_E7_0 = stack_E9_0 = stack_13A_0 = stack_13C_0 = stack_172_0 = stack_174_0 = stack_1BB_0 = stack_286_0 = stack_2D7_0 = stack_346_0 = stack_39D_0 = stack_41B_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("IADz9csMCfH5Gf726vkICQgTBAw=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_256 = expr_6E:int
        var_3_25B = newarray:byte[](byte.class, expr_6E:int)
        var_5_25C = expr_6E:int
        Label_0606:
        
        while (cmpeq:boolean(and:int(var_0_26B:int, ldc:int(64)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_26B:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0798)
            }
            
            var_0_26B = and:int(var_0_26B:int, ldc:int(-878030189))
            var_5_25C = add:int(var_5_25C:int, ldc:int(-1))
            expr_286 = loadelement:byte(stack_286_0:byte[], var_5_25C:int)
            storeelement:byte(var_3_25B:byte[], var_5_25C:int, or:int(and:int(shl:int(expr_286:byte, and:int(ldc:int(2500), ldc:int(4133))), ldc:int(-16)), and:int(shr:int(expr_286:byte[expected:int], xor:int(ldc:int(16490), ldc:int(16494))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_25C:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_E7_0 = stack_E9_0 = stack_13A_0 = stack_13C_0 = stack_172_0 = stack_174_0 = stack_1BB_0 = stack_286_0 = stack_2D7_0 = stack_346_0 = stack_39D_0 = stack_41B_0 = var_3_25B:byte[]
            goto(Label_0115)
        }
        
        var_0_26B = and:int(var_0_26B:int, ldc:int(-109012670))
        goto(Label_0885)
        Label_0798:
        
        while (cmpne:boolean(and:int(var_0_26B:int, ldc:int(1073741824)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_26B:int, ldc:int(16)), ldc:int(0))) {
                var_0_26B = and:int(var_0_26B:int, ldc:int(1294148539))
                goto(Label_0606)
            }
            
            var_0_26B = and:int(var_0_26B:int, ldc:int(-964043814))
            var_5_25C = add:int(var_5_25C:int, ldc:int(-1))
            storeelement:byte(var_3_25B:byte[], var_5_25C:int, add:byte(loadelement:byte(stack_346_0:byte[], var_5_25C:int), ldc:byte(6)))
            
            if (cmpne:boolean(var_5_25C:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_E7_0 = stack_E9_0 = stack_13A_0 = stack_13C_0 = stack_172_0 = stack_174_0 = stack_1BB_0 = stack_286_0 = stack_2D7_0 = stack_346_0 = stack_39D_0 = stack_41B_0 = var_3_25B:byte[]
            goto(Label_0238)
        }
        
        Label_0885:
        
        while (cmpeq:boolean(and:int(var_0_26B:int, ldc:int(134217728)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_26B:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_26B = and:int(var_0_26B:int, ldc:int(1253515781))
                goto(Label_0606)
            }
            
            var_0_3B7 = and:int(var_0_26B:int, ldc:int(-482844964))
            var_5_25C = add:int(var_5_25C:int, ldc:int(-1))
            expr_39D = stack_3E6_2 = loadelement(stack_39D_0, var_5_25C)
            
            if (cmplt:boolean(add:int(add:int(var_5_25C:int, ldc:int(5)), neg:int(var_4_256:int)), ldc:int(0))) {
                stack_3E6_2 = stack_3BA_0 = add:byte(expr_39D:byte, loadelement:byte(var_3_25B:byte[], add:int(var_5_25C:int, ldc:int(5))))
                goto(Label_0970)
            }
            
            Label_0938:
            
            if (cmpeq:boolean(and:int(var_0_3B7:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_3B7 = and:int(var_0_3B7:int, ldc:int(-1037643847))
                stack_3E6_2 = stack_3BA_0 = add:byte(expr_39D:byte, ldc:byte(5))
            }
            
            Label_0970:
            
            if (cmpne:boolean(and:int(var_0_3B7:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_3B7 = and:int(var_0_3B7:int, ldc:int(1181322421))
                goto(Label_0938)
            }
            
            var_0_26B = and:int(var_0_3B7:int, ldc:int(-377044010))
            storeelement:byte(var_3_25B:byte[], var_5_25C:int, stack_3E6_2:byte)
            
            if (cmpne:boolean(var_5_25C:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_E7_0 = stack_E9_0 = stack_13A_0 = stack_13C_0 = stack_172_0 = stack_174_0 = stack_1BB_0 = stack_286_0 = stack_2D7_0 = stack_346_0 = stack_39D_0 = stack_41B_0 = var_3_25B:byte[]
            goto(Label_0321)
        }
        
        goto(Label_0798)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_26B:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0377)
        }
        
        if (cmpeq:boolean(and:int(var_0_26B:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0321)
        }
        
        if (cmpne:boolean(and:int(var_0_26B:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0238)
        }
        
        if (cmpeq:boolean(and:int(var_0_26B:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_26B = and:int(var_0_26B:int, ldc:int(1909189939))
        }
        else {
            var_0_26B = and:int(var_0_26B:int, ldc:int(-1049107823))
            var_2_A4 = stack_A4_0:byte[]
            expr_A8 = add:int(arraylength:int(stack_A6_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A8:int, ldc:int(0))) {
                var_3_2C5 = newarray:byte[](byte.class, expr_A8:int)
                var_5_2C6 = expr_A8:int
                
                loop {
                    var_0_26B = and:int(var_0_26B:int, ldc:int(-787034981))
                    var_5_2C6 = add:int(var_5_2C6:int, ldc:int(-1))
                    storeelement:byte(var_3_2C5:byte[], var_5_2C6:int, add:int(shl:int(loadelement:byte(stack_2D7_0:byte[], var_5_2C6:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_A4:byte[], add:int(var_5_2C6:int, and:int(ldc:int(545), ldc:int(21577)))), ldc:int(4)), xor:int(ldc:int(-32598), ldc:int(-32603)))))
                    
                    if (cmpne:boolean(var_5_2C6:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_E7_0 = stack_E9_0 = stack_13A_0 = stack_13C_0 = stack_172_0 = stack_174_0 = stack_1BB_0 = stack_286_0 = stack_2D7_0 = stack_346_0 = stack_39D_0 = stack_41B_0 = var_3_2C5:byte[]
            }
        }
        
        Label_0173:
        
        if (cmpeq:boolean(and:int(var_0_26B:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_26B = and:int(var_0_26B:int, ldc:int(1789592459))
            goto(Label_0377)
        }
        
        if (cmpne:boolean(and:int(var_0_26B:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0321)
        }
        
        if (cmpeq:boolean(and:int(var_0_26B:int, ldc:int(16777216)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_26B:int, ldc:int(4)), ldc:int(0))) {
                var_0_26B = and:int(var_0_26B:int, ldc:int(1343965666))
                goto(Label_0115)
            }
            
            var_0_26B = and:int(var_0_26B:int, ldc:int(-54035458))
            expr_E9 = arraylength:int(stack_E9_0:byte[])
            
            if (cmpne:boolean(expr_E9:int, ldc:int(0))) {
                var_4_256 = expr_E9:int
                var_3_25B = newarray:byte[](byte.class, expr_E9:int)
                var_5_25C = expr_E9:int
                goto(Label_0798)
            }
        }
        
        Label_0238:
        
        if (cmpne:boolean(and:int(var_0_26B:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_26B = and:int(var_0_26B:int, ldc:int(-1383515115))
            goto(Label_0377)
        }
        
        if (cmpne:boolean(and:int(var_0_26B:int, ldc:int(65536)), ldc:int(0))) {
            var_0_26B = and:int(var_0_26B:int, ldc:int(-1775657484))
        }
        else {
            if (cmpne:boolean(and:int(var_0_26B:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_26B = and:int(var_0_26B:int, ldc:int(-1203998607))
                goto(Label_0173)
            }
            
            if (cmpne:boolean(and:int(var_0_26B:int, ldc:int(65536)), ldc:int(0))) {
                var_0_26B = and:int(var_0_26B:int, ldc:int(-896188531))
                goto(Label_0115)
            }
            
            var_0_26B = and:int(var_0_26B:int, ldc:int(-1070694478))
            expr_13C = arraylength:int(stack_13C_0:byte[])
            
            if (cmpne:boolean(expr_13C:int, ldc:int(0))) {
                var_4_256 = expr_13C:int
                var_3_25B = newarray:byte[](byte.class, expr_13C:int)
                var_5_25C = expr_13C:int
                goto(Label_0885)
            }
        }
        
        Label_0321:
        
        if (cmpeq:boolean(and:int(var_0_26B:int, ldc:int(16777216)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_26B:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0238)
            }
            
            if (cmpeq:boolean(and:int(var_0_26B:int, ldc:int(128)), ldc:int(0))) {
                var_0_26B = and:int(var_0_26B:int, ldc:int(26854128))
                goto(Label_0173)
            }
            
            if (cmpne:boolean(and:int(var_0_26B:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_26B = and:int(var_0_26B:int, ldc:int(-767404655))
            expr_174 = arraylength:int(stack_174_0:byte[])
            
            if (cmpne:boolean(expr_174:int, ldc:int(0))) {
                var_3_409 = newarray:byte[](byte.class, expr_174:int)
                var_5_40A = expr_174:int
                
                loop {
                    var_0_26B = and:int(var_0_26B:int, ldc:int(-39327023))
                    var_5_40A = add:int(var_5_40A:int, ldc:int(-1))
                    storeelement:byte(var_3_409:byte[], var_5_40A:int, xor:byte(loadelement:byte(stack_41B_0:byte[], var_5_40A:int), ldc:byte(122)))
                    
                    if (cmpne:boolean(var_5_40A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_E7_0 = stack_E9_0 = stack_13A_0 = stack_13C_0 = stack_172_0 = stack_174_0 = stack_1BB_0 = stack_286_0 = stack_2D7_0 = stack_346_0 = stack_39D_0 = stack_41B_0 = var_3_409:byte[]
            }
        }
        
        Label_0377:
        
        if (cmpne:boolean(and:int(var_0_26B:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0321)
        }
        
        if (cmpne:boolean(and:int(var_0_26B:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_26B = and:int(var_0_26B:int, ldc:int(-1848585384))
            goto(Label_0238)
        }
        
        if (cmpeq:boolean(and:int(var_0_26B:int, ldc:int(128)), ldc:int(0))) {
            var_0_26B = and:int(var_0_26B:int, ldc:int(-1612911575))
            goto(Label_0173)
        }
        
        if (cmpeq:boolean(and:int(var_0_26B:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_26B = and:int(var_0_26B:int, ldc:int(-946060567))
            goto(Label_0115)
        }
        
        var_3_1C7 = initobject:String(String::<init>, stack_1BB_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_230_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(35), ldc:int(2315)))
        expr_1D9 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(7424), ldc:int(7427)))
        storeelement:String(expr_1D9:String[], xor:int(ldc:int(2626), ldc:int(2624)), invokevirtual:String[expected:String](String::substring, var_3_1C7:String, and:int(ldc:int(26674), ldc:int(-26803)), and:int(ldc:int(41), ldc:int(2577))))
        storeelement:String(expr_1D9:String[], and:int(ldc:int(-1712), ldc:int(1705)), invokevirtual:String[expected:String](String::substring, var_3_1C7:String, xor:int(ldc:int(18468), ldc:int(18469)), and:int(ldc:int(8591), ldc:int(2143))))
        storeelement:String(expr_1D9:String[], xor:int(ldc:int(3089), ldc:int(3088)), invokevirtual:String[expected:String](String::substring, var_3_1C7:String, and:int(ldc:int(4191), ldc:int(18063)), and:int(ldc:int(23), ldc:int(283))))
        putstatic:String[](\u6c52\ua61f\u71f1\uc229\u3dd3::\u4ab3\u99f7\u3a62\u3711\ub6ab, expr_1D9:String[])
        putstatic:\u4c04\u6b0d\u61a4\u6435\u71ae(\u6c52\ua61f\u71f1\uc229\u3dd3::\ub8be\u4ab3\u446c\u16f6\u0a06, invokevirtual:\u4c04\u6b0d\u61a4\u6435\u71ae(\u4c04\u6b0d\u61a4\u6435\u71ae::\u2dcc\u3e2a\u7049\u3bc9\u1187\u836c, invokevirtual:\u4c04\u6b0d\u61a4\u6435\u71ae(\u4c04\u6b0d\u61a4\u6435\u71ae::\u6d69\ucef1\u98a4\u4c04\u4d85\ub6ab, initobject:\u4c04\u6b0d\u61a4\u6435\u71ae(\u4c04\u6b0d\u61a4\u6435\u71ae::<init>, ldc:int(1250067), ldc:int(-15329770)), getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6c56\u3c25\u7af6\u4492\u97e6))), getstatic:\u4f52\u983f\u3c25\u7ce1\ua3b4(\u4f52\u983f\u3c25\u7ce1\ua3b4::\u62da\u385b\u36d3\uf995\u7873)))
    }
    
    public void \ucb79\u5bc4\u760c\u8413\u156b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_65C : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_667 : int
        
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
        var_3_65C = and:int(ldc:int(413634945), ldc:int(-1305111252))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6c52\ua61f\u71f1\uc229\u3dd3[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(262144)), ldc:int(0))) {
            var_3_65C = and:int(var_3_65C:int, ldc:int(-733138084))
            var_5_81 = and:int(ldc:int(-24385), ldc:int(21824))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-12379), ldc:int(12378)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_65C:int, ldc:int(-1611310237))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(4768), ldc:int(4769)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(18885), ldc:int(5147)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_65C = and:int(var_3_D1:int, ldc:int(-1340129536))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(66), ldc:int(67)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1157043717))
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1244732239))
                        goto(Label_1385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(961938866))
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(2076402720))
                        goto(Label_1097)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0956)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0840)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0718)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1242336094))
                        goto(Label_0585)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(346469997))
                    }
                    else {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1840286971))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0585)
                            }
                            
                            goto(Label_0840)
                        }
                    }
                    
                    Label_0419:
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1765218618))
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1097)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(124599093))
                        goto(Label_0956)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0840)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0718)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(618654866))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(1440526029))
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1424356687))
                        var_11_E2 = and:int(ldc:int(28996), ldc:int(-32198))
                        goto(Label_1531)
                    }
                    
                    Label_0585:
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1727699424))
                        goto(Label_1542)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-887689311))
                        goto(Label_1385)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1149696669))
                        goto(Label_1097)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0956)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(2077007523))
                        goto(Label_0840)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-356815063))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(2139454926))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0840)
                        }
                    }
                    
                    Label_0718:
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1542)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1195447921))
                        goto(Label_1385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1097)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(970793787))
                        goto(Label_0956)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0585)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-556621693))
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1801462931))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0840:
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-424731078))
                        goto(Label_1542)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-103240586))
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1097)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0718)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0585)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(1657039775))
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(328195536))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(321), ldc:int(5133))
                                goto(Label_1097)
                            }
                        }
                    }
                    
                    Label_0956:
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1781129751))
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0840)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0718)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0585)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-1059686627))
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1027473195))
                        var_11_E2 = and:int(ldc:int(-9602), ldc:int(9601))
                    }
                    
                    Label_1097:
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1542)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(405053525))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0956)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0840)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-1238217850))
                            goto(Label_0718)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0585)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-1247260753))
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-1142949606))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1385)
                            }
                        }
                    }
                    
                    Label_1213:
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1029205265))
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(2070669272))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-1326560888))
                            goto(Label_1097)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(223825786))
                            goto(Label_0956)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(1026276481))
                            goto(Label_0840)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(-177171544))
                            goto(Label_0718)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0585)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(32)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(363225089))
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_65C = and:int(var_3_65C:int, ldc:int(1416892946))
                            loopcontinue()
                        }
                        
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1421311886))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1531)
                    }
                    
                    Label_1385:
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-699595185))
                        goto(Label_1542)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(355354153))
                        goto(Label_1097)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1690327485))
                        goto(Label_0956)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(1760577034))
                        goto(Label_0840)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(375671025))
                        goto(Label_0718)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0585)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(8192)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_65C = and:int(var_3_65C:int, ldc:int(1918860032))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1531:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_667 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1542:
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1385)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1097)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0956)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0840)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-884127958))
                        goto(Label_0718)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0585)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_65C = and:int(var_3_65C:int, ldc:int(-647553192))
                        var_17_667 = add:int(var_16_110:int, xor:int(ldc:int(576), ldc:int(577)))
                        looporswitchbreak()
                    }
                }
                
                var_3_65C = and:int(var_3_65C:int, ldc:int(2005384165))
                
                if (cmple:boolean(var_5_81 = var_17_667:int, sub:int(var_6_88:int, and:int(ldc:int(2217), ldc:int(17411))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_65C:int, ldc:int(4096)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
