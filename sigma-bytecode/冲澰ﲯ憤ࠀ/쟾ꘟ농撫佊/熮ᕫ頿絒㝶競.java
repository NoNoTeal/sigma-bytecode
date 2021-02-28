public class \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u71ae\u156b\u983f\u7d52\u3776\u7af6 {
    public void \u71ae\u156b\u983f\u7d52\u3776\u7af6(java.util.function.Supplier<\u392e\ud7e8\u3bc9\u88c5\ud51e.\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>> p0, java.util.function.Supplier<\u392e\ud7e8\u3bc9\u88c5\ud51e.\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>> p1) {
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
            invokespecial:Object(Object::<init>, this:\u71ae\u156b\u983f\u7d52\u3776\u7af6)
            putfield:Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>(\u71ae\u156b\u983f\u7d52\u3776\u7af6::\u5654\u6d69\u873d\u8709\u4daf\u8640, this:\u71ae\u156b\u983f\u7d52\u3776\u7af6, p0:Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>)
            putfield:Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>(\u71ae\u156b\u983f\u7d52\u3776\u7af6::\u960f\u3c25\u8753\u8aa5\uff55\u4cd9, this:\u71ae\u156b\u983f\u7d52\u3776\u7af6, p1:Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.stream.Stream<\u392e\ud7e8\u3bc9\u88c5\ud51e.\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>> \u4975\u3dd3\u9a18\u7043\u64f2\u97b7() {
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
            return:Stream<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>(invokestatic:Stream<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>(Stream<T>::concat, invokevirtual:Stream<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>(\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<FC, F>::\u6c56\u647c\u516c\u4e72\u88c5\u6435, checkcast:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u392e\ud7e8\u3bc9\u88c5\ud51e.\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>.class, invokeinterface:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>::get, getfield:Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>(\u71ae\u156b\u983f\u7d52\u3776\u7af6::\u5654\u6d69\u873d\u8709\u4daf\u8640, this:\u71ae\u156b\u983f\u7d52\u3776\u7af6)))), invokevirtual:Stream<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>(\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<FC, F>::\u6c56\u647c\u516c\u4e72\u88c5\u6435, checkcast:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u392e\ud7e8\u3bc9\u88c5\ud51e.\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>.class, invokeinterface:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>::get, getfield:Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>(\u71ae\u156b\u983f\u7d52\u3776\u7af6::\u960f\u3c25\u8753\u8aa5\uff55\u4cd9, this:\u71ae\u156b\u983f\u7d52\u3776\u7af6))))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.kinds.App lambda$\u5245\u9af2\u6bb9\u97e6\u960f\u8bb0$2(com.mojang.serialization.codecs.RecordCodecBuilder$Instance p0) {
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
    
    private static java.util.function.Supplier lambda$\u3504\u9937\u7049\u759a\u4975\ubb2b$1(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u71ae\u156b\u983f\u7d52\u3776\u7af6 p0) {
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
            return:Supplier(getfield:Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>(\u71ae\u156b\u983f\u7d52\u3776\u7af6::\u960f\u3c25\u8753\u8aa5\uff55\u4cd9, p0:\u71ae\u156b\u983f\u7d52\u3776\u7af6))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.function.Supplier lambda$\u6d99\u8df4\u62da\uc246\ud7e8\u7006$0(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u71ae\u156b\u983f\u7d52\u3776\u7af6 p0) {
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
            return:Supplier(getfield:Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>(\u71ae\u156b\u983f\u7d52\u3776\u7af6::\u5654\u6d69\u873d\u8709\u4daf\u8640, p0:\u71ae\u156b\u983f\u7d52\u3776\u7af6))
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
    
    public void \ud158\ub1b9\u760c\u88c5\u4f52\u3d64(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_62C : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_CB : double
        var_3_DD : int
        var_11_EE : int
        var_14_118 : double
        var_16_11C : int
        var_12_114 : double
        var_17_637 : int
        
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
        var_3_62C = and:int(ldc:int(-363715338), ldc:int(-1143573379))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u71ae\u156b\u983f\u7d52\u3776\u7af6[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_62C = and:int(var_3_62C:int, ldc:int(362469072))
        }
        else {
            var_3_62C = and:int(var_3_62C:int, ldc:int(-17105228))
            var_5_85 = and:int(ldc:int(-2876), ldc:int(2571))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(23776), ldc:int(-23777)))
            invokestatic:int(m::a)
            
            loop {
                var_9_CB = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DD = and:int(var_3_62C:int, ldc:int(1061060223))
                    var_9_CB = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EE = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EE:int, sub:int(var_6_8C:int, xor:int(ldc:int(8864), ldc:int(8865)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EE:int, and:int(ldc:int(1051), ldc:int(24805)))), var_7_9B:double))) {
                        inc:int(var_11_EE, ldc:int(1))
                    }
                    
                    var_3_62C = and:int(var_3_DD:int, ldc:int(-365206284))
                    var_14_118 = var_7_9B:double
                    var_16_11C = var_11_EE:int
                }
                else {
                    var_11_EE = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(2049), ldc:int(16409)))
                    var_12_114 = var_14_118 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_11C = var_11_EE:int, var_6_8C:int)) {
                        var_9_CB = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EE:int)
                        var_16_11C = var_11_EE:int
                        var_14_118 = var_12_114:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1311)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1061)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0917)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0799)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(20342474))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0529)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(738094261))
                        
                        if (cmplt:boolean(var_16_11C:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0529)
                            }
                            
                            goto(Label_0799)
                        }
                    }
                    
                    Label_0379:
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(449428962))
                        goto(Label_1311)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1516863060))
                        goto(Label_1061)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0917)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(101206388))
                        goto(Label_0799)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(802662014))
                            var_11_EE = and:int(ldc:int(30852), ldc:int(-31941))
                            goto(Label_1452)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0529:
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-2022461343))
                        goto(Label_1311)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1061)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1172924920))
                        goto(Label_0917)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1090990205))
                        goto(Label_0799)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1044635758))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0379)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-1166434502))
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(804497399))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_118 = var_9_CB:double
                            goto(Label_0799)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1128611040))
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1311)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1118036519))
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1450821846))
                        goto(Label_1061)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0917)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1921339298))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0529)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(1125163910))
                            goto(Label_0379)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1849114358))
                        var_14_118 = mul:double(ldc:double(0.5), add:double(var_9_CB:double, var_14_118:double))
                    }
                    
                    Label_0799:
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(2055020091))
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-2059041198))
                        goto(Label_1311)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1061)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0529)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(1178227811))
                            goto(Label_0379)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(1340043701))
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1067447479))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EE = xor:int(ldc:int(2129), ldc:int(2128))
                                goto(Label_1061)
                            }
                        }
                    }
                    
                    Label_0917:
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1311)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(915195958))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-1625743657))
                            goto(Label_0799)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-2014724898))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0529)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0379)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-21859020))
                        var_11_EE = and:int(ldc:int(-13848), ldc:int(13831))
                    }
                    
                    Label_1061:
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1311)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1209045936))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0917)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-1002640615))
                            goto(Label_0799)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0529)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(1750606835))
                            goto(Label_0379)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-2105533813))
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-67649))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EE:int, ldc:int(0))) {
                                goto(Label_1311)
                            }
                        }
                    }
                    
                    Label_1182:
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-1089971312))
                            goto(Label_1061)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0917)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0799)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-1414383306))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(889366428))
                            goto(Label_0529)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0379)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_62C = and:int(var_3_62C:int, ldc:int(-531277032))
                            loopcontinue()
                        }
                        
                        var_3_62C = and:int(var_3_62C:int, ldc:int(788479924))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_118:double, var_5_85:int, var_16_11C:int)
                        goto(Label_1452)
                    }
                    
                    Label_1311:
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1808798926))
                        goto(Label_1463)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-736631982))
                        goto(Label_1061)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(163739042))
                        goto(Label_0917)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(223013272))
                        goto(Label_0799)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-785814213))
                        goto(Label_0529)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0379)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(131072)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_62C = and:int(var_3_62C:int, ldc:int(-1173113227))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_118:double, ldc:double(0.0))
                    Label_1452:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_637 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EE:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1463:
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(342645162))
                        goto(Label_1311)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1061)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0917)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-1631513235))
                        goto(Label_0799)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(-371707050))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0529)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(1154645143))
                        goto(Label_0379)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_62C = and:int(var_3_62C:int, ldc:int(2048600062))
                        var_17_637 = add:int(var_16_11C:int, xor:int(ldc:int(20), ldc:int(21)))
                        looporswitchbreak()
                    }
                    
                    var_3_62C = and:int(var_3_62C:int, ldc:int(-1202552114))
                }
                
                var_3_62C = and:int(var_3_62C:int, ldc:int(-300190474))
                
                if (cmple:boolean(var_5_85 = var_17_637:int, sub:int(var_6_8C:int, and:int(ldc:int(16401), ldc:int(1069))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_62C:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_62C = and:int(var_3_62C:int, ldc:int(-231757456))
            goto(Label_0106)
        }
    }
}
