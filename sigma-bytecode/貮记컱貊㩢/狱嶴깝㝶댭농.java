public class \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u72f1\u5db4\uae5d\u3776\ub32d\ub18d {
    public void \u72f1\u5db4\uae5d\u3776\ub32d\ub18d(float p0) {
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
    
    public boolean equals(java.lang.Object p0) {
        var_2_14C : int
        stack_176_0 : int [generated]
        
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
        var_2_14C = and:int(ldc:int(344930975), ldc:int(499088119))
        
        if (cmpne:boolean(this:\u72f1\u5db4\uae5d\u3776\ub32d\ub18d[expected:Object], p0:Object)) {
            loop {
                if (cmpeq:boolean(and:int(var_2_14C:int, ldc:int(262144)), ldc:int(0))) {
                    var_2_14C = and:int(var_2_14C:int, ldc:int(-891342421))
                    goto(Label_0291)
                }
                
                if (cmpeq:boolean(and:int(var_2_14C:int, ldc:int(2)), ldc:int(0))) {
                    var_2_14C = and:int(var_2_14C:int, ldc:int(605332719))
                    goto(Label_0234)
                }
                
                if (cmpeq:boolean(and:int(var_2_14C:int, ldc:int(67108864)), ldc:int(0))) {
                    var_2_14C = and:int(var_2_14C:int, ldc:int(-2029502160))
                }
                else {
                    var_2_14C = and:int(var_2_14C:int, ldc:int(1059929523))
                    
                    if (cmpne:boolean(p0:Object, aconstnull:Object())) {
                        if (cmpeq:boolean(invokevirtual:Class<? extends \u72f1\u5db4\uae5d\u3776\ub32d\ub18d>(\u72f1\u5db4\uae5d\u3776\ub32d\ub18d::getClass, this:\u72f1\u5db4\uae5d\u3776\ub32d\ub18d), invokevirtual:Class<?>(Object::getClass, p0:Object))) {
                            if (invokespecial:boolean(\u9033\u12b2\u516c\u97e6\u6d99\ua3b4::equals, this:\u72f1\u5db4\uae5d\u3776\ub32d\ub18d[expected:\u9033\u12b2\u516c\u97e6\u6d99\ua3b4], p0:Object)) {
                                goto(Label_0234)
                            }
                            
                            return:boolean(and:int[expected:boolean](ldc:int(-1444), ldc:int(1443)))
                        }
                    }
                }
                
                Label_0155:
                
                if (cmpeq:boolean(and:int(var_2_14C:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0291)
                }
                
                if (cmpne:boolean(and:int(var_2_14C:int, ldc:int(268435456)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_14C:int, ldc:int(262144)), ldc:int(0))) {
                        return:boolean(and:int[expected:boolean](ldc:int(-27046), ldc:int(26785)))
                    }
                    
                    loopcontinue()
                }
                
                Label_0234:
                
                if (cmpne:boolean(and:int(var_2_14C:int, ldc:int(128)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_14C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_14C = and:int(var_2_14C:int, ldc:int(-1035749047))
                        goto(Label_0155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_14C:int, ldc:int(2048)), ldc:int(0))) {
                        var_2_14C = and:int(var_2_14C:int, ldc:int(439611118))
                        loopcontinue()
                    }
                    
                    var_2_14C = and:int(var_2_14C:int, ldc:int(-575701325))
                    
                    if (cmpeq:boolean(getfield:float(\u72f1\u5db4\uae5d\u3776\ub32d\ub18d::\u624e\u62da\ud36e\uc7fe\u8640\u56bd, this:\u72f1\u5db4\uae5d\u3776\ub32d\ub18d), getfield:float(\u72f1\u5db4\uae5d\u3776\ub32d\ub18d::\u624e\u62da\ud36e\uc7fe\u8640\u56bd, checkcast:\u72f1\u5db4\uae5d\u3776\ub32d\ub18d(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u72f1\u5db4\uae5d\u3776\ub32d\ub18d.class, p0:Object[expected:\u72f1\u5db4\uae5d\u3776\ub32d\ub18d])))) {
                        stack_176_0 = xor:int(ldc:int(-32760), ldc:int(-32759))
                        looporswitchbreak()
                    }
                }
                
                Label_0291:
                
                if (cmpne:boolean(and:int(var_2_14C:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0234)
                }
                
                if (cmpeq:boolean(and:int(var_2_14C:int, ldc:int(128)), ldc:int(0))) {
                    var_2_14C = and:int(var_2_14C:int, ldc:int(-988027250))
                    goto(Label_0155)
                }
                
                if (cmpeq:boolean(and:int(var_2_14C:int, ldc:int(4194304)), ldc:int(0))) {
                    var_2_14C = and:int(var_2_14C:int, ldc:int(-1263666277))
                    stack_176_0 = and:int(ldc:int(-2523), ldc:int(2506))
                    looporswitchbreak()
                }
                
                var_2_14C = and:int(var_2_14C:int, ldc:int(1329108230))
            }
            
            return:boolean(stack_176_0:int)
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(515), ldc:int(26769)))
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
            return:int(invokestatic:int(\u6c56\uafe7\uf995\ud523\u7006\u6b0d::\u7049\uae87\ubded\u927d\uc3e3\u3a62, invokespecial:int(\u9033\u12b2\u516c\u97e6\u6d99\ua3b4::hashCode, this:\u72f1\u5db4\uae5d\u3776\ub32d\ub18d[expected:\u9033\u12b2\u516c\u97e6\u6d99\ua3b4]), getfield:float(\u72f1\u5db4\uae5d\u3776\ub32d\ub18d::\u624e\u62da\ud36e\uc7fe\u8640\u56bd, this:\u72f1\u5db4\uae5d\u3776\ub32d\ub18d)))
        }
        
        goto(Label_0006)
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), getfield:String(\u72f1\u5db4\uae5d\u3776\ub32d\ub18d::\ub83f\ub19c\u8350\u759a\u071d\u3504, this:\u72f1\u5db4\uae5d\u3776\ub32d\ub18d)), ldc:char(91)), getfield:float(\u72f1\u5db4\uae5d\u3776\ub32d\ub18d::\u624e\u62da\ud36e\uc7fe\u8640\u56bd, this:\u72f1\u5db4\uae5d\u3776\ub32d\ub18d)), ldc:char(93))))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u071d\ud217\ub18d\u156b\u8413\ub6ab$1() {
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
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u624e\u156b\u6c56\uc910\ub70c\u40a9)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u97e6\u946b\uc7fe\u0b8e\u5fe1\ub113)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u5db4\u4c2b\u071d\u3711\u839e\u51b2$0(float p0) {
        var_1_5F : int
        
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
            var_1_5F = and:int(ldc:int(1018464118), ldc:int(-4864185))
            
            if (cmple:boolean(p0:float, ldc:float(0.0f))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-689003026))
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u624e\u156b\u6c56\uc910\ub70c\u40a9)
            }
            else {
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8413\u9033\u3bc9\uceb8\u1833\u97b7)
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6b5f\u6198\u8389\u3c25\u839e\u51fa, xor:int(ldc:int(-32294), ldc:int(-31778)), p0:float)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4bc8\u960f\u8aa5\u51b2\u2dcc\u960f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_645 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_650 : int
        
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
        var_3_645 = and:int(ldc:int(1023901233), ldc:int(1833889629))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u72f1\u5db4\uae5d\u3776\ub32d\ub18d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1)), ldc:int(0))) {
            var_3_645 = and:int(var_3_645:int, ldc:int(1862500057))
            var_5_7D = and:int(ldc:int(-19480), ldc:int(19477))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-17289), ldc:int(17288)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_645:int, ldc:int(-315691273))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(24720), ldc:int(24721)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(5125), ldc:int(5124)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_645 = and:int(var_3_D2:int, ldc:int(799190171))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(18696), ldc:int(18697)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1736101472))
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-758270006))
                        goto(Label_1333)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1316099599))
                        goto(Label_1206)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1090)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(186845129))
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-907306437))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1873299896))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-100194207))
                    }
                    else {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1833152055))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1333)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1900229340))
                        goto(Label_1206)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(4)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-41976231))
                            var_11_E3 = and:int(ldc:int(-28762), ldc:int(28761))
                            goto(Label_1479)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-196570666))
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1333)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-900094748))
                        goto(Label_1206)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(2065897520))
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-873246632))
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(846026111))
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(792182175))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-744367913))
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1333)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1206)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1411917121))
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(898127611))
                        goto(Label_0912)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(2091911421))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(2005989915))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(2104901273))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(481183647))
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1333)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1206)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(2102102299))
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1718260621))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(1629826480))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1108973106))
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(1029406329))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(1941), ldc:int(16425))
                                goto(Label_1090)
                            }
                        }
                    }
                    
                    Label_0912:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1490492040))
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(256)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1169872905))
                        goto(Label_1333)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1219831419))
                        goto(Label_1206)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-579965227))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-493839792))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(1639731827))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(2)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(1333739188))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(1068137983))
                        var_11_E3 = and:int(ldc:int(11028), ldc:int(-15125))
                    }
                    
                    Label_1090:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1333)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(407632527))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0912)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1513339455))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(1512327931))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(1034806668))
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(1067630065))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1333)
                            }
                        }
                    }
                    
                    Label_1206:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1102685780))
                            goto(Label_1090)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1576055000))
                            goto(Label_0912)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-459082363))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(901258251))
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1117110629))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1479)
                    }
                    
                    Label_1333:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-360210418))
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(515741002))
                        goto(Label_1206)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-436352379))
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1945753698))
                        goto(Label_0912)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(2)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(874066917))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(482843093))
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_645 = and:int(var_3_645:int, ldc:int(-311509571))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1479:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_650 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1490:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1868540381))
                        goto(Label_1333)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(2014349245))
                        goto(Label_1206)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(16)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1361454999))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(16)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-150732292))
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1375769537))
                        var_17_650 = add:int(var_16_111:int, and:int(ldc:int(16897), ldc:int(1055)))
                        looporswitchbreak()
                    }
                    
                    var_3_645 = and:int(var_3_645:int, ldc:int(-1690242430))
                }
                
                var_3_645 = and:int(var_3_645:int, ldc:int(767192089))
                
                if (cmple:boolean(var_5_7D = var_17_650:int, sub:int(var_6_84:int, and:int(ldc:int(1), ldc:int(28171))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1024)), ldc:int(0))) {
            var_3_645 = and:int(var_3_645:int, ldc:int(-118630692))
            goto(Label_0106)
        }
    }
}
