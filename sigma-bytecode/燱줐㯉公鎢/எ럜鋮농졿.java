public class \u71f1\uc910\u3bc9\u516c\u93a2.\u0b8e\ub7dc\u92ee\ub18d\uc87f {
    public void \u0b8e\ub7dc\u92ee\ub18d\uc87f() {
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
            invokespecial:Object(Object::<init>, this:\u0b8e\ub7dc\u92ee\ub18d\uc87f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void accept(java.util.function.BiConsumer<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u392e\ud7e8\u3bc9\u88c5\ud51e.\u2dcc\u873d\ubff1\u8df4\u183a> p0) {
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:276)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:271)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:150)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:187)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:39)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitMethod(TypeSubstitutionVisitor.java:276)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2581)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2685)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2453)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2453)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2453)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2453)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2453)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2453)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2453)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2453)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2453)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2453)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2453)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2685)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2453)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:770)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:766)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2505)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1029)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:803)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:672)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypesForVariables(TypeAnalysis.java:586)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:397)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:96)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:109)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public void accept(java.lang.Object p0) {
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
            invokevirtual:void(\u0b8e\ub7dc\u92ee\ub18d\uc87f::accept, this:\u0b8e\ub7dc\u92ee\ub18d\uc87f, checkcast:BiConsumer(java.util.function.BiConsumer.class, p0:Object[expected:BiConsumer<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u2dcc\u873d\ubff1\u8df4\u183a>]))
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
    
    public void \u4975\u647c\u7c6b\u4492\u6bb9\u5245(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_68D : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_698 : int
        
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
        var_3_68D = and:int(ldc:int(87052987), ldc:int(913524607))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u0b8e\ub7dc\u92ee\ub18d\uc87f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
            var_3_68D = and:int(var_3_68D:int, ldc:int(-252117300))
        }
        else {
            var_3_68D = and:int(var_3_68D:int, ldc:int(-39093725))
            var_5_8A = and:int(ldc:int(5899), ldc:int(-5916))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(8402), ldc:int(-10451)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_68D:int, ldc:int(803394365))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, and:int(ldc:int(25185), ldc:int(6169)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(72), ldc:int(73)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_68D = and:int(var_3_DA:int, ldc:int(-1775688265))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(17297), ldc:int(13313)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-841747816))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1764548763))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-696064309))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1027133773))
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1874390611))
                    }
                    else {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1824186935))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1872196807))
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(580425778))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(301916007))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1817659246))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(662323363))
                        var_11_EB = and:int(ldc:int(17208), ldc:int(-30522))
                        goto(Label_1571)
                    }
                    
                    Label_0586:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1758938562))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-427271444))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-2039895989))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(830515166))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-483739542))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1779448597))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0720:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1835121073))
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(661659446))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-665309517))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1429254717))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0843:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1817057324))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(74983366))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1563395624))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1171187272))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(370886736))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(209297651))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(6209), ldc:int(8835))
                                goto(Label_1164)
                            }
                        }
                    }
                    
                    Label_0977:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1205535300))
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(229163096))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-277945810))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(80340528))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1538063383))
                            goto(Label_0843)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-2072046641))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-877420336))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1831382765))
                        var_11_EB = and:int(ldc:int(679), ldc:int(-1000))
                    }
                    
                    Label_1164:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(742049265))
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(937722783))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-2120812323))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(648044658))
                            goto(Label_0977)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1176232331))
                            goto(Label_0843)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(879671423))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-273489439))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1425)
                            }
                        }
                    }
                    
                    Label_1307:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1164)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-775865165))
                            goto(Label_0977)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-911771180))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1790981831))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                            goto(Label_1571)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1425:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(107840826))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(699927845))
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1848661105))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1783907266))
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(830773125))
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(262144)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_68D = and:int(var_3_68D:int, ldc:int(1046641849))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1571:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_698 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1582:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-549038019))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(348968356))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1845334841))
                        var_17_698 = add:int(var_16_119:int, xor:int(ldc:int(8544), ldc:int(8545)))
                        looporswitchbreak()
                    }
                }
                
                var_3_68D = and:int(var_3_68D:int, ldc:int(-823168991))
                
                if (cmple:boolean(var_5_8A = var_17_698:int, sub:int(var_6_91:int, and:int(ldc:int(2183), ldc:int(12817))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
