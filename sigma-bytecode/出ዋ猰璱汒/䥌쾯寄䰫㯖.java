public class \u51fa\u12cb\u7330\u74b1\u6c52.\u494c\ucfaf\u5bc4\u4c2b\u3bd6 {
    public void \u494c\ucfaf\u5bc4\u4c2b\u3bd6(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p0) {
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
    
    public void \u494c\ucfaf\u5bc4\u4c2b\u3bd6(java.util.function.Supplier<\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56> p0) {
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
            invokespecial:\u56bd\uc4d2\u61a4\u4ab3\u1187(\u56bd\uc4d2\u61a4\u4ab3\u1187::<init>, this:\u494c\ucfaf\u5bc4\u4c2b\u3bd6, invokestatic:ImmutableList[expected:List<\uc2e8\u9255\u647c\ud171\ubf56>](ImmutableList::of, invokeinterface:\uc2e8\u9255\u647c\ud171\ubf56[expected:Object](Supplier<\uc2e8\u9255\u647c\ud171\ubf56>::get, p0:Supplier<\uc2e8\u9255\u647c\ud171\ubf56>)))
            putfield:Supplier<\uc2e8\u9255\u647c\ud171\ubf56>(\u494c\ucfaf\u5bc4\u4c2b\u3bd6::\ub32d\u8bb0\ubefe\u98a4\u3dd3\uc238, this:\u494c\ucfaf\u5bc4\u4c2b\u3bd6, p0:Supplier<\uc2e8\u9255\u647c\ud171\ubf56>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.serialization.Codec<? extends \u5245\u8aa5\u61a4\u7049\u4cd9.\u56bd\uc4d2\u61a4\u4ab3\u1187> \u3d4b\u6b0d\ucef1\u7ce1\u8308\u0800() {
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
            return:Codec<? extends \u56bd\uc4d2\u61a4\u4ab3\u1187>(getstatic:Codec<\u494c\ucfaf\u5bc4\u4c2b\u3bd6>(\u494c\ucfaf\u5bc4\u4c2b\u3bd6::\u0800\u3504\u6cfe\u4daf\u7e3f\u0800))
        }
        
        goto(Label_0006)
    }
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\u56bd\uc4d2\u61a4\u4ab3\u1187 \u8350\u9af2\u5245\u6b5f\u7bad\u3dd3(long p0) {
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
            return:\u56bd\uc4d2\u61a4\u4ab3\u1187(this:\u494c\ucfaf\u5bc4\u4c2b\u3bd6[expected:\u56bd\uc4d2\u61a4\u4ab3\u1187])
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \u3bd6\uf995\ucef1\u8640\ub18d\u156b(int p0, int p1, int p2) {
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
            return:\uc2e8\u9255\u647c\ud171\ubf56(checkcast:\uc2e8\u9255\u647c\ud171\ubf56(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56.class, invokeinterface:\uc2e8\u9255\u647c\ud171\ubf56(Supplier<\uc2e8\u9255\u647c\ud171\ubf56>::get, getfield:Supplier<\uc2e8\u9255\u647c\ud171\ubf56>(\u494c\ucfaf\u5bc4\u4c2b\u3bd6::\ub32d\u8bb0\ubefe\u98a4\u3dd3\uc238, this:\u494c\ucfaf\u5bc4\u4c2b\u3bd6))))
        }
        
        goto(Label_0006)
    }
    
    public \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 \u6c56\ud523\u72f1\u156b\u5fe1\uc2e8(int p0, int p1, int p2, int p3, int p4, java.util.function.Predicate<\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56> p5, java.util.Random p6, boolean p7) {
        var_9_A7 : int
        stack_101_0 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 [generated]
        
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
            var_9_A7 = and:int(ldc:int(1922182150), ldc:int(1989369542))
            
            if (invokeinterface:boolean(Predicate<\uc2e8\u9255\u647c\ud171\ubf56>::test, p5:Predicate<\uc2e8\u9255\u647c\ud171\ubf56>, invokeinterface:\uc2e8\u9255\u647c\ud171\ubf56(Supplier<\uc2e8\u9255\u647c\ud171\ubf56>::get, getfield:Supplier<\uc2e8\u9255\u647c\ud171\ubf56>(\u494c\ucfaf\u5bc4\u4c2b\u3bd6::\ub32d\u8bb0\ubefe\u98a4\u3dd3\uc238, this:\u494c\ucfaf\u5bc4\u4c2b\u3bd6)))) {
                if (logicalnot:boolean(p7:boolean)) {
                    goto(Label_0144)
                }
                
                stack_101_0 = initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, p0:int, p1:int, p2:int)
                return:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(stack_101_0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            }
            
            Label_0118:
            
            if (cmpeq:boolean(and:int(var_9_A7:int, ldc:int(67108864)), ldc:int(0))) {
                return:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56())
            }
            
            Label_0144:
            
            if (cmpne:boolean(and:int(var_9_A7:int, ldc:int(32)), ldc:int(0))) {
                var_9_A7 = and:int(var_9_A7:int, ldc:int(1163842862))
                goto(Label_0118)
            }
            
            var_9_A7 = and:int(var_9_A7:int, ldc:int(-140562797))
            stack_101_0 = initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, add:int(sub:int(p0:int, p3:int), invokevirtual:int(Random::nextInt, p6:Random, add:int(mul:int(p3:int, xor:int(ldc:int(24), ldc:int(26))), and:int(ldc:int(167), ldc:int(19777))))), p1:int, add:int(sub:int(p2:int, p3:int), invokevirtual:int(Random::nextInt, p6:Random, add:int(mul:int(p3:int, and:int(ldc:int(16658), ldc:int(4611))), xor:int(ldc:int(10320), ldc:int(10321))))))
            return:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(stack_101_0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
        }
        
        goto(Label_0006)
    }
    
    public java.util.Set<\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56> \u8bb0\u4c04\uc29a\u7006\uae87\ud4fe(int p0, int p1, int p2, int p3) {
        expr_6A : \uc2e8\u9255\u647c\ud171\ubf56[] [generated]
        
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
            expr_6A = newarray:\uc2e8\u9255\u647c\ud171\ubf56[](\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56.class, xor:int(ldc:int(54), ldc:int(55)))
            storeelement:\uc2e8\u9255\u647c\ud171\ubf56(expr_6A:\uc2e8\u9255\u647c\ud171\ubf56[], and:int(ldc:int(6988), ldc:int(-31599)), checkcast:\uc2e8\u9255\u647c\ud171\ubf56(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56.class, invokeinterface:\uc2e8\u9255\u647c\ud171\ubf56(Supplier<\uc2e8\u9255\u647c\ud171\ubf56>::get, getfield:Supplier<\uc2e8\u9255\u647c\ud171\ubf56>(\u494c\ucfaf\u5bc4\u4c2b\u3bd6::\ub32d\u8bb0\ubefe\u98a4\u3dd3\uc238, this:\u494c\ucfaf\u5bc4\u4c2b\u3bd6))))
            return:Set<\uc2e8\u9255\u647c\ud171\ubf56>(invokestatic:HashSet(Sets::newHashSet, expr_6A:\uc2e8\u9255\u647c\ud171\ubf56[][expected:Object[]]))
        }
        
        goto(Label_0006)
    }
    
    private static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 lambda$\u92ee\uc910\u8413\ub113\ub6ab\ufe34$1(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p0) {
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
            return:\uc2e8\u9255\u647c\ud171\ubf56(p0:\uc2e8\u9255\u647c\ud171\ubf56)
        }
        
        goto(Label_0006)
    }
    
    private static java.util.function.Supplier lambda$\u3bd6\u7006\u0b8e\u8389\ub8be\u8308$0(\u51fa\u12cb\u7330\u74b1\u6c52.\u494c\ucfaf\u5bc4\u4c2b\u3bd6 p0) {
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
            return:Supplier(getfield:Supplier<\uc2e8\u9255\u647c\ud171\ubf56>(\u494c\ucfaf\u5bc4\u4c2b\u3bd6::\ub32d\u8bb0\ubefe\u98a4\u3dd3\uc238, p0:\u494c\ucfaf\u5bc4\u4c2b\u3bd6))
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
    
    public void \u6c52\ub18d\ubb2b\u92ff\u7049\u34df(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_63C : int
        var_5_87 : int
        var_6_8E : int
        var_7_9D : double
        var_9_C5 : double
        var_3_D7 : int
        var_11_E8 : int
        var_14_112 : double
        var_16_116 : int
        var_12_10E : double
        var_17_647 : int
        
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
        var_3_63C = and:int(ldc:int(-936926441), ldc:int(-29491433))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u494c\ucfaf\u5bc4\u4c2b\u3bd6[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0177)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_63C = and:int(var_3_63C:int, ldc:int(-606090925))
        }
        else {
            var_3_63C = and:int(var_3_63C:int, ldc:int(-949900961))
            var_5_87 = and:int(ldc:int(-29534), ldc:int(29253))
            var_6_8E = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9D = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-10564), ldc:int(10561)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C5 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D7 = and:int(var_3_63C:int, ldc:int(-621940297))
                    var_9_C5 = sub:double(var_7_9D:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E8 = var_5_87:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E8:int, sub:int(var_6_8E:int, xor:int(ldc:int(8218), ldc:int(8219)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E8:int, and:int(ldc:int(8389), ldc:int(16937)))), var_7_9D:double))) {
                        inc:int(var_11_E8, ldc:int(1))
                    }
                    
                    var_3_63C = and:int(var_3_D7:int, ldc:int(272478079))
                    var_14_112 = var_7_9D:double
                    var_16_116 = var_11_E8:int
                }
                else {
                    var_11_E8 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_87:int), and:int(ldc:int(20497), ldc:int(1545)))
                    var_12_10E = var_14_112 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_87)
                    
                    if (cmplt:boolean(var_16_116 = var_11_E8:int, var_6_8E:int)) {
                        var_9_C5 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E8:int)
                        var_16_116 = var_11_E8:int
                        var_14_112 = var_12_10E:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1938757653))
                        goto(Label_1506)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-899772466))
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(326357823))
                        goto(Label_1222)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(117187401))
                        goto(Label_0924)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0801)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1386191391))
                        goto(Label_0673)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1645981154))
                        goto(Label_0553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-478564585))
                        
                        if (cmplt:boolean(var_16_116:int, var_6_8E:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0553)
                            }
                            
                            goto(Label_0801)
                        }
                    }
                    
                    Label_0421:
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(801275100))
                        goto(Label_1506)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0924)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0801)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0673)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(256)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-186522145))
                            var_11_E8 = and:int(ldc:int(-84), ldc:int(83))
                            goto(Label_1495)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0553:
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-2074966543))
                        goto(Label_1506)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1752458750))
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0924)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1252984812))
                        goto(Label_0801)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(250666669))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-327422537))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_112 = var_9_C5:double
                            goto(Label_0801)
                        }
                    }
                    
                    Label_0673:
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1419219008))
                        goto(Label_1506)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-579059234))
                        goto(Label_1222)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0924)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1573973213))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-203974176))
                            goto(Label_0553)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(934787391))
                        var_14_112 = mul:double(ldc:double(0.5), add:double(var_9_C5:double, var_14_112:double))
                    }
                    
                    Label_0801:
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-438402558))
                        goto(Label_1506)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0673)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(64)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(1592594434))
                            goto(Label_0553)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-1687008814))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(16)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(861939720))
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-130158217))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_87:int), var_7_9D:double)) {
                                var_11_E8 = xor:int(ldc:int(24576), ldc:int(24577))
                                goto(Label_1100)
                            }
                        }
                    }
                    
                    Label_0924:
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1241550193))
                        goto(Label_1506)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1069883788))
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-307388124))
                        goto(Label_1222)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1355338208))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0801)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(1106197327))
                            goto(Label_0673)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-204943230))
                            goto(Label_0553)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1382415639))
                        var_11_E8 = and:int(ldc:int(12597), ldc:int(-12600))
                    }
                    
                    Label_1100:
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1506)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1371568875))
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0924)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-2023176001))
                            goto(Label_0801)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-395847848))
                            goto(Label_0673)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(1515847336))
                            goto(Label_0553)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1298249599))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E8:int, ldc:int(0))) {
                                goto(Label_1353)
                            }
                        }
                    }
                    
                    Label_1222:
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1694595671))
                        goto(Label_1506)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(16)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(174831398))
                            goto(Label_1100)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(4)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(1349601711))
                            goto(Label_0924)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0801)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0673)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(4)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-325087961))
                            goto(Label_0553)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(150333951))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_112:double, var_5_87:int, var_16_116:int)
                            goto(Label_1495)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1353:
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(736949705))
                        goto(Label_1506)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-874163872))
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(64)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-915249052))
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0924)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(299800818))
                        goto(Label_0801)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0673)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(648817041))
                        loopcontinue()
                    }
                    
                    var_3_63C = and:int(var_3_63C:int, ldc:int(763097951))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_112:double, ldc:double(0.0))
                    Label_1495:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_647 = var_5_87:int
                        
                        if (cmpeq:boolean(var_11_E8:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1506:
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1975946610))
                        goto(Label_0924)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0801)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0673)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(335524247))
                        var_17_647 = add:int(var_16_116:int, and:int(ldc:int(10883), ldc:int(4385)))
                        looporswitchbreak()
                    }
                    
                    var_3_63C = and:int(var_3_63C:int, ldc:int(1233666567))
                }
                
                var_3_63C = and:int(var_3_63C:int, ldc:int(439595007))
                
                if (cmple:boolean(var_5_87 = var_17_647:int, sub:int(var_6_8E:int, and:int(ldc:int(16417), ldc:int(1613))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0177:
        
        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
