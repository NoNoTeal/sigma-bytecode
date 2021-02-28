public interface \u4f52\u6cfe\u9a18\uc29a\u3bd6.\ubcb0\u6b5f\u446c\u8753\u3c25\u40a9 {
    java.lang.String[][] \u946b\u97b7\u6198\ud171\u8df4\u4e72(java.util.Collection<java.lang.String> p0);
    
    java.lang.String[][] lambda$\ub70c\u76bc\u4492\u6b0d\uc910\u16f6$1(java.util.Collection p0) {
        expr_67 : String[][] [generated]
        
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
            expr_67 = newarray:String[][](java.lang.String[].class, xor:int(ldc:int(24576), ldc:int(24577)))
            storeelement:String[](expr_67:String[][], and:int(ldc:int(-2987), ldc:int(938)), checkcast:String[](java.lang.String[].class, invokeinterface:String[](Collection<E>::toArray, p0:Collection, newarray:String[](java.lang.String.class, and:int(ldc:int(3874), ldc:int(-20395))))))
            return:String[][](expr_67:String[][])
        }
        
        goto(Label_0006)
    }
    
    java.lang.String[][] lambda$\u983f\u9a18\u34df\ube23\uc7fe\u120d$0(java.util.Collection p0) {
        var_1_5F : int
        var_3_69 : String[][]
        var_4_71 : int
        var_5_79 : Iterator<String>
        var_6_9F : String
        stack_BC_0 : String[][] [generated]
        stack_BC_1 : int [generated]
        expr_AE : String[] [generated]
        
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
            var_1_5F = and:int(ldc:int(-1800391432), ldc:int(-1810951486))
            var_3_69 = newarray:String[][](java.lang.String[].class, invokeinterface:int(Collection<E>::size, p0:Collection<String>))
            var_4_71 = and:int(ldc:int(18904), ldc:int(-18905))
            var_5_79 = invokeinterface:Iterator<String>(Collection<String>::iterator, p0:Collection<String>)
            
            loop {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1740759599))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_5_79:Iterator))) {
                    looporswitchbreak()
                }
                
                var_6_9F = checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_5_79:Iterator<String>))
                stack_BC_0 = var_3_69:String[][]
                stack_BC_1 = postincrement:int(1, var_4_71:int)
                expr_AE = newarray:String[](java.lang.String.class, xor:int(ldc:int(24706), ldc:int(24707)))
                storeelement:String(expr_AE:String[], and:int(ldc:int(26636), ldc:int(-27951)), var_6_9F:String)
                storeelement:String[](stack_BC_0:String[][], stack_BC_1:int, expr_AE:String[])
            }
            
            return:String[][](var_3_69:String[][])
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
}
