public class \u3504\ufe34\u600f\u6b0d\u69d9.\u5fe1\u0b8e\u4492\u446c\u9a18 {
    public void \u5fe1\u0b8e\u4492\u446c\u9a18() {
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
            invokespecial:Object(Object::<init>, this:\u5fe1\u0b8e\u4492\u446c\u9a18)
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
            invokevirtual:void(\u5fe1\u0b8e\u4492\u446c\u9a18::accept, this:\u5fe1\u0b8e\u4492\u446c\u9a18, checkcast:BiConsumer(java.util.function.BiConsumer.class, p0:Object[expected:BiConsumer<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u2dcc\u873d\ubff1\u8df4\u183a>]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\uc246\uc84e\u0b8e\u6b5f\ub18d\u836c$2(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0) {
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
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u385b\uafe7\u8d90\u8308\u12cb\u7049, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u5fe1\u0b8e\u4492\u446c\u9a18::\u1187\u7006\uc229\uc7fe\u4daf\u392e), and:int(ldc:int(3153), ldc:int(-11474))), loadelement:String(getstatic:String[](\u5fe1\u0b8e\u4492\u446c\u9a18::\u1187\u7006\uc229\uc7fe\u4daf\u392e), xor:int(ldc:int(2049), ldc:int(2048))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u5d20\u7330\ubb2b\uc238\u071d\ub32d$1(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0) {
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
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u385b\uafe7\u8d90\u8308\u12cb\u7049, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u5fe1\u0b8e\u4492\u446c\u9a18::\u1187\u7006\uc229\uc7fe\u4daf\u392e), and:int(ldc:int(13355), ldc:int(-13356))), loadelement:String(getstatic:String[](\u5fe1\u0b8e\u4492\u446c\u9a18::\u1187\u7006\uc229\uc7fe\u4daf\u392e), xor:int(ldc:int(664), ldc:int(666))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u0c95\u3711\u3776\u600f\u8d98\u97b7$0(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0) {
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
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u385b\uafe7\u8d90\u8308\u12cb\u7049, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u5fe1\u0b8e\u4492\u446c\u9a18::\u1187\u7006\uc229\uc7fe\u4daf\u392e), and:int(ldc:int(6158), ldc:int(-31759))), loadelement:String(getstatic:String[](\u5fe1\u0b8e\u4492\u446c\u9a18::\u1187\u7006\uc229\uc7fe\u4daf\u392e), xor:int(ldc:int(12304), ldc:int(12306))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1F3 : int
        expr_6E : int [generated]
        stack_8B_0 : byte[] [generated]
        stack_8D_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_DC_0 : byte[] [generated]
        stack_177_0 : byte[] [generated]
        stack_206_0 : byte[] [generated]
        stack_25D_0 : byte[] [generated]
        var_4_158 : int
        var_3_15D : byte[]
        var_5_15E : int
        var_0_191 : int
        expr_177 : byte [generated]
        stack_1C0_2 : byte [generated]
        stack_194_0 : byte [generated]
        expr_209 : byte [generated]
        expr_8D : int [generated]
        var_2_B3 : byte[]
        expr_B7 : int [generated]
        var_3_24B : byte[]
        var_5_24C : int
        var_3_E8 : String
        stack_151_0 : String[] [generated]
        expr_FA : String[] [generated]
        
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
        var_0_1F3 = and:int(ldc:int(-363582802), ldc:int(-313501953))
        expr_6E = arraylength:int(stack_8B_0 = stack_8D_0 = stack_B3_0 = stack_B5_0 = stack_DC_0 = stack_177_0 = stack_206_0 = stack_25D_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("QfhQ4BAAQFDgIODYTghgOvBnAABhMKjQSCC42PCo0EhQ4CDg2E6ImApwkKX/V+I=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_158 = expr_6E:int
        var_3_15D = newarray:byte[](byte.class, expr_6E:int)
        var_5_15E = expr_6E:int
        Label_0352:
        
        while (cmpne:boolean(and:int(var_0_1F3:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_191 = and:int(var_0_1F3:int, ldc:int(1828154350))
            var_5_15E = add:int(var_5_15E:int, ldc:int(-1))
            expr_177 = stack_1C0_2 = loadelement(stack_177_0, var_5_15E)
            
            if (cmplt:boolean(add:int(add:int(var_5_15E:int, ldc:int(3)), neg:int(var_4_158:int)), ldc:int(0))) {
                stack_1C0_2 = stack_194_0 = add:byte(expr_177:byte, loadelement:byte(var_3_15D:byte[], add:int(var_5_15E:int, ldc:int(3))))
                goto(Label_0420)
            }
            
            Label_0388:
            
            if (cmpeq:boolean(and:int(var_0_191:int, ldc:int(1)), ldc:int(0))) {
                var_0_191 = and:int(var_0_191:int, ldc:int(2144536500))
                stack_1C0_2 = stack_194_0 = add:byte(expr_177:byte, ldc:byte(3))
            }
            
            Label_0420:
            
            if (cmpeq:boolean(and:int(var_0_191:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_191 = and:int(var_0_191:int, ldc:int(-408485830))
                goto(Label_0388)
            }
            
            var_0_1F3 = and:int(var_0_191:int, ldc:int(1628972989))
            storeelement:byte(var_3_15D:byte[], var_5_15E:int, stack_1C0_2:byte)
            
            if (cmpne:boolean(var_5_15E:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8D_0 = stack_8B_0 = stack_B3_0 = stack_B5_0 = stack_DC_0 = stack_177_0 = stack_206_0 = stack_25D_0 = var_3_15D:byte[]
            goto(Label_0115)
        }
        
        Label_0486:
        
        while (cmpeq:boolean(and:int(var_0_1F3:int, ldc:int(65536)), ldc:int(0))) {
            var_0_1F3 = and:int(var_0_1F3:int, ldc:int(-375746628))
            var_5_15E = add:int(var_5_15E:int, ldc:int(-1))
            expr_209 = add:byte(loadelement:byte(stack_206_0:byte[], var_5_15E:int), ldc:byte(46))
            storeelement:byte(var_3_15D:byte[], var_5_15E:int, xor:int(or:int(and:int(shl:int(expr_209:byte, and:int(ldc:int(4), ldc:int(17727))), ldc:int(-16)), and:int(shr:int(expr_209:byte[expected:int], xor:int(ldc:int(18442), ldc:int(18446))), ldc:int(15))), ldc:int(49)))
            
            if (cmpne:boolean(var_5_15E:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8D_0 = stack_8B_0 = stack_B3_0 = stack_B5_0 = stack_DC_0 = stack_177_0 = stack_206_0 = stack_25D_0 = var_3_15D:byte[]
            goto(Label_0146)
        }
        
        var_0_1F3 = and:int(var_0_1F3:int, ldc:int(54584003))
        goto(Label_0352)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_1F3:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0188)
        }
        
        if (cmpne:boolean(and:int(var_0_1F3:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_1F3 = and:int(var_0_1F3:int, ldc:int(1691707135))
            expr_8D = arraylength:int(stack_8D_0:byte[])
            
            if (cmpne:boolean(expr_8D:int, ldc:int(0))) {
                var_4_158 = expr_8D:int
                var_3_15D = newarray:byte[](byte.class, expr_8D:int)
                var_5_15E = expr_8D:int
                goto(Label_0486)
            }
        }
        
        Label_0146:
        
        if (cmpeq:boolean(and:int(var_0_1F3:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_1F3 = and:int(var_0_1F3:int, ldc:int(-236269892))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_1F3:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_1F3 = and:int(var_0_1F3:int, ldc:int(1830153150))
            var_2_B3 = stack_B3_0:byte[]
            expr_B7 = add:int(arraylength:int(stack_B5_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_B7:int, ldc:int(0))) {
                var_3_24B = newarray:byte[](byte.class, expr_B7:int)
                var_5_24C = expr_B7:int
                
                loop {
                    var_0_1F3 = and:int(var_0_1F3:int, ldc:int(-273625100))
                    var_5_24C = add:int(var_5_24C:int, ldc:int(-1))
                    storeelement:byte(var_3_24B:byte[], var_5_24C:int, add:int(shl:int(loadelement:byte(stack_25D_0:byte[], var_5_24C:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_B3:byte[], add:int(var_5_24C:int, xor:int(ldc:int(66), ldc:int(67)))), ldc:int(7)), xor:int(ldc:int(768), ldc:int(769)))))
                    
                    if (cmpne:boolean(var_5_24C:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8D_0 = stack_8B_0 = stack_B3_0 = stack_B5_0 = stack_DC_0 = stack_177_0 = stack_206_0 = stack_25D_0 = var_3_24B:byte[]
            }
        }
        
        Label_0188:
        
        if (cmpne:boolean(and:int(var_0_1F3:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0146)
        }
        
        if (cmpne:boolean(and:int(var_0_1F3:int, ldc:int(64)), ldc:int(0))) {
            var_0_1F3 = and:int(var_0_1F3:int, ldc:int(829457535))
            goto(Label_0115)
        }
        
        var_3_E8 = initobject:String(String::<init>, stack_DC_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_151_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1771), ldc:int(22791)))
        expr_FA = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32255), ldc:int(-32254)))
        storeelement:String(expr_FA:String[], and:int(ldc:int(17507), ldc:int(-25716)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, and:int(ldc:int(-10921), ldc:int(10920)), and:int(ldc:int(16455), ldc:int(3886))))
        storeelement:String(expr_FA:String[], xor:int(ldc:int(1793), ldc:int(1795)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(6), ldc:int(0)), xor:int(ldc:int(4611), ldc:int(4636))))
        storeelement:String(expr_FA:String[], and:int(ldc:int(8199), ldc:int(18593)), invokevirtual:String[expected:String](String::substring, var_3_E8:String, xor:int(ldc:int(-32742), ldc:int(-32763)), xor:int(ldc:int(8231), ldc:int(8201))))
        putstatic:String[](\u5fe1\u0b8e\u4492\u446c\u9a18::\u1187\u7006\uc229\uc7fe\u4daf\u392e, expr_FA:String[])
    }
    
    public void \ub102\u71ae\u8258\u760c\u965f\u88c5(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6B1 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_6BC : int
        
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
        var_3_6B1 = and:int(ldc:int(829250399), ldc:int(-1695715330))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5fe1\u0b8e\u4492\u446c\u9a18[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1648464518))
            var_5_81 = and:int(ldc:int(-13338), ldc:int(13337))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(18060), ldc:int(-18077)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_6B1:int, ldc:int(490601972))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(659), ldc:int(12297)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(1285), ldc:int(65)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_6B1 = and:int(var_3_D1:int, ldc:int(-134424329))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(-32727), ldc:int(-32728)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-2142022494))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1213622058))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-906810514))
                        goto(Label_1040)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0915)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0765)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1971092636))
                        goto(Label_0604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-2139896039))
                    }
                    else {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-801248261))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0604)
                            }
                            
                            goto(Label_0915)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-849073101))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1623260962))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(592482715))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1775914849))
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1152199037))
                        goto(Label_1040)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1987635227))
                        goto(Label_0915)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0765)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1354662746))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2126498301))
                            var_11_E2 = and:int(ldc:int(4883), ldc:int(-4884))
                            goto(Label_1571)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0604:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1580036976))
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1607466159))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(879531671))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1885981284))
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-445078555))
                        goto(Label_1040)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0915)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1010269068))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-2108894614))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-365048090))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(301919705))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0915)
                        }
                    }
                    
                    Label_0765:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-72780117))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(563462100))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-350433718))
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1040)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1997051597))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1420034858))
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-133088251))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(880700112))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0915:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2060369222))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1200)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2125646829))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1242253762))
                            goto(Label_0765)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1571568044))
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1213400880))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(25089), ldc:int(1))
                                goto(Label_1200)
                            }
                        }
                    }
                    
                    Label_1040:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1486791533))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0915)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1076597778))
                            goto(Label_0765)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(914402544))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1312043584))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1242673703))
                        var_11_E2 = and:int(ldc:int(-11151), ldc:int(11148))
                    }
                    
                    Label_1200:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-854719199))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1698879216))
                            goto(Label_1040)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0915)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(100182632))
                            goto(Label_0765)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1349439358))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1425)
                            }
                        }
                    }
                    
                    Label_1316:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1242538639))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_1200)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1040)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0915)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0765)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1584286577))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1571)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1425:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(828276545))
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1040)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(929148955))
                        goto(Label_0915)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(821032886))
                        goto(Label_0765)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1727208028))
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1253720179))
                        loopcontinue()
                    }
                    
                    var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-605200779))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1571:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6BC = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1582:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-529921926))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2141065146))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(255794870))
                        goto(Label_1040)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0915)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-12727819))
                        goto(Label_0765)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1117143337))
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(959340276))
                        var_17_6BC = add:int(var_16_110:int, xor:int(ldc:int(-28032), ldc:int(-28031)))
                        looporswitchbreak()
                    }
                    
                    var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2124655184))
                }
                
                var_3_6B1 = and:int(var_3_6B1:int, ldc:int(368929112))
                
                if (cmple:boolean(var_5_81 = var_17_6BC:int, sub:int(var_6_88:int, and:int(ldc:int(545), ldc:int(2305))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
