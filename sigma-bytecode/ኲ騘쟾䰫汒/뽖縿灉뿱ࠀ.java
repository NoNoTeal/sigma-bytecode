public abstract class \u12b2\u9a18\uc7fe\u4c2b\u6c52.\ubf56\u7e3f\u7049\ubff1\u0800 {
    public static com.mojang.serialization.codecs.RecordCodecBuilder<S, java.util.OptionalInt> \u527a\u6435\uafe7\ua61f\u3d64\u99f7() {
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
    
    public void \ubf56\u7e3f\u7049\ubff1\u0800(java.util.OptionalInt p0) {
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
            invokespecial:Object(Object::<init>, this:\ubf56\u7e3f\u7049\ubff1\u0800)
            putfield:OptionalInt(\ubf56\u7e3f\u7049\ubff1\u0800::\u760c\uc87f\ub32d\ua068\ud158\u7330, this:\ubf56\u7e3f\u7049\ubff1\u0800, p0:OptionalInt)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public abstract \u3504\ufe34\u600f\u6b0d\u69d9.\u1833\uf94d\u98a4\u3dd3\u8640\u8709<?> \u392e\u647c\u9255\uae87\ufcaf\u8c8a();
    
    public abstract int \u59ec\u88c5\u69d9\u839e\u6cfe\u7e3f(int p0, int p1);
    
    public java.util.OptionalInt \uc29a\ua6bd\ub8be\u5245\u5654\u72f1() {
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
            return:OptionalInt(getfield:OptionalInt(\ubf56\u7e3f\u7049\ubff1\u0800::\u760c\uc87f\ub32d\ua068\ud158\u7330, this:\ubf56\u7e3f\u7049\ubff1\u0800))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.OptionalInt lambda$\u6b0d\uf94d\u88c5\ub7dc\u6198\ub7dc$2(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\ubf56\u7e3f\u7049\ubff1\u0800 p0) {
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
            return:OptionalInt(getfield:OptionalInt(\ubf56\u7e3f\u7049\ubff1\u0800::\u760c\uc87f\ub32d\ua068\ud158\u7330, p0:\ubf56\u7e3f\u7049\ubff1\u0800))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.Optional lambda$\u385b\u6d99\uc2bd\u3c25\ucb79\ubb2b$1(java.util.OptionalInt p0) {
        var_1_5F : int
        stack_85_0 : Object [generated]
        
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
            var_1_5F = and:int(ldc:int(-1540180868), ldc:int(660520946))
            
            if (logicalnot:boolean(invokevirtual:boolean(OptionalInt::isPresent, p0:OptionalInt))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1210664322))
                stack_85_0 = invokestatic:Optional<Object>[expected:Object](Optional<Object>::empty)
            }
            else {
                stack_85_0 = invokestatic:Optional<Integer>[expected:Object](Optional<T>::of, invokestatic:Integer(Integer::valueOf, invokevirtual:int(OptionalInt::getAsInt, p0:OptionalInt)))
            }
            
            return:Optional(stack_85_0:Object)
        }
        
        goto(Label_0006)
    }
    
    private static java.util.OptionalInt lambda$\u3e2a\uc29a\u7ce1\u8258\uc2e8\u839e$0(java.util.Optional p0) {
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
            return:OptionalInt(checkcast:OptionalInt(java.util.OptionalInt.class, invokevirtual:OptionalInt(Optional<OptionalInt>::orElse, invokevirtual:Optional<OptionalInt>(Optional<Object>::map, p0:Optional<Object>, invokedynamic:Function<Integer, OptionalInt>(apply:()Ljava/util/function/Function;)), invokestatic:OptionalInt(OptionalInt::empty))))
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
            putstatic:Codec<\ubf56\u7e3f\u7049\ubff1\u0800>(\ubf56\u7e3f\u7049\ubff1\u0800::\u34df\u759a\u0a06\ud51e\u5f50\u64ab, invokevirtual:Codec(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::dispatch, getstatic:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u1833\uf94d\u98a4\u3dd3\u8640\u8709<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u8c8a\u5d20\u9033\u1833\u718f\ud51e), invokedynamic:Function<T, \u1833\uf94d\u98a4\u3dd3\u8640\u8709>(apply:()Ljava/util/function/Function;), invokedynamic:Function<T, Codec>(apply:()Ljava/util/function/Function;)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u960f\u4ab3\u8413\u0c95\u6ec6\uc238(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_667 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_672 : int
        
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
        var_3_667 = and:int(ldc:int(1325936490), ldc:int(-16638362))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubf56\u7e3f\u7049\ubff1\u0800[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_667:int, ldc:int(16384)), ldc:int(0))) {
            var_3_667 = and:int(var_3_667:int, ldc:int(1326025339))
        }
        else {
            var_3_667 = and:int(var_3_667:int, ldc:int(1194434235))
            var_5_85 = and:int(ldc:int(-21451), ldc:int(17354))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(4522), ldc:int(-4523)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_667:int, ldc:int(-673239305))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(4325), ldc:int(3089)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(12308), ldc:int(12309)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_667 = and:int(var_3_D2:int, ldc:int(1339363107))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(1153), ldc:int(18969)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1502)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-502437177))
                        goto(Label_1096)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1741085082))
                        goto(Label_0949)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(32)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1572740575))
                        goto(Label_0831)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1395848606))
                    }
                    else {
                        var_3_667 = and:int(var_3_667:int, ldc:int(1609957175))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0553)
                            }
                            
                            goto(Label_0831)
                        }
                    }
                    
                    Label_0392:
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1502)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1048843768))
                        goto(Label_1096)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0949)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(512)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1585127381))
                        goto(Label_0831)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1028371336))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_667:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(1944687190))
                            loopcontinue()
                        }
                        
                        var_3_667 = and:int(var_3_667:int, ldc:int(1999920755))
                        var_11_E3 = and:int(ldc:int(10521), ldc:int(-10522))
                        goto(Label_1491)
                    }
                    
                    Label_0553:
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1502)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(16)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(227494648))
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(1421505715))
                        goto(Label_1096)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(1859519207))
                        goto(Label_0949)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0831)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1878589628))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0392)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(512)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(1168909196))
                            loopcontinue()
                        }
                        
                        var_3_667 = and:int(var_3_667:int, ldc:int(1472806643))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0831)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(32)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1613495071))
                        goto(Label_1502)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1677627137))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(865194254))
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1096)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-274421320))
                        goto(Label_0949)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0553)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(2048933084))
                            goto(Label_0392)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(1562469188))
                            loopcontinue()
                        }
                        
                        var_3_667 = and:int(var_3_667:int, ldc:int(1998245691))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0831:
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-173848684))
                        goto(Label_1502)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1625763148))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1096)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_667:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_667:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(-1878320341))
                            goto(Label_0553)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_667:int, ldc:int(16)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(-219488725))
                            goto(Label_0392)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_667:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_667 = and:int(var_3_667:int, ldc:int(-408428694))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(4160), ldc:int(4161))
                                goto(Label_1096)
                            }
                        }
                    }
                    
                    Label_0949:
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1502)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(-246475663))
                            goto(Label_0831)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(544341904))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(1134102192))
                            goto(Label_0553)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0392)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_667:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_667 = and:int(var_3_667:int, ldc:int(2130771559))
                        var_11_E3 = and:int(ldc:int(-3582), ldc:int(3325))
                    }
                    
                    Label_1096:
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(32)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-177464877))
                        goto(Label_1502)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(13349328))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(932511567))
                            goto(Label_0949)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_667:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0831)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_667:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0553)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(-1698111782))
                            goto(Label_0392)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(32)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(948499424))
                            loopcontinue()
                        }
                        
                        var_3_667 = and:int(var_3_667:int, ldc:int(-675352981))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1356)
                            }
                        }
                    }
                    
                    Label_1224:
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1502)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(551914218))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_1096)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_667:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(484751477))
                            goto(Label_0949)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0831)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_667:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(512)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(-358114544))
                            goto(Label_0553)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_667:int, ldc:int(16)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(224701807))
                            goto(Label_0392)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(16)), ldc:int(0))) {
                            var_3_667 = and:int(var_3_667:int, ldc:int(2131763007))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1491)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1356:
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-337924734))
                        goto(Label_1502)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1096)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0949)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0831)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(922437265))
                        goto(Label_0553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-884387550))
                        goto(Label_0392)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1460562714))
                        loopcontinue()
                    }
                    
                    var_3_667 = and:int(var_3_667:int, ldc:int(1476108266))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1491:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_672 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1502:
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(25457069))
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(1563533865))
                        goto(Label_1096)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1740256738))
                        goto(Label_0949)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(1416973096))
                        goto(Label_0831)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(32)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(2000737684))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(2)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-1289968255))
                        goto(Label_0553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_667:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(47800591))
                        goto(Label_0392)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_667:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_667 = and:int(var_3_667:int, ldc:int(-9891845))
                        var_17_672 = add:int(var_16_111:int, xor:int(ldc:int(1152), ldc:int(1153)))
                        looporswitchbreak()
                    }
                }
                
                var_3_667 = and:int(var_3_667:int, ldc:int(-404165057))
                
                if (cmple:boolean(var_5_85 = var_17_672:int, sub:int(var_6_8C:int, and:int(ldc:int(193), ldc:int(18439))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_667:int, ldc:int(32)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
