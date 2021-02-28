public interface \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9 {
    java.util.List<? extends \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u3e75\ub8be\u88c5\ub7dc\uc246\u8753> \u51fa\u67d0\u965f\u76bc\u3d4b\u7c6b();
    
    java.util.Optional<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u3e75\ub8be\u88c5\ub7dc\uc246\u8753> \uc229\u52d3\ua61f\u4cd9\ua61f\ub171(double p0, double p1) {
        var_5_61 : int
        var_7_6E : Iterator<? extends \u3e75\ub8be\u88c5\ub7dc\uc246\u8753>
        var_5_7D : int
        var_8_BE : \u3e75\ub8be\u88c5\ub7dc\uc246\u8753
        
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
        var_5_61 = and:int(ldc:int(1618646109), ldc:int(2038093049))
        var_7_6E = invokeinterface:Iterator<? extends \u3e75\ub8be\u88c5\ub7dc\uc246\u8753>(List<? extends \u3e75\ub8be\u88c5\ub7dc\uc246\u8753>::iterator, invokeinterface:List<? extends \u3e75\ub8be\u88c5\ub7dc\uc246\u8753>(\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9::\u51fa\u67d0\u965f\u76bc\u3d4b\u7c6b, this:\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9))
        
        loop {
            if (cmpeq:boolean(and:int(var_5_61:int, ldc:int(1048576)), ldc:int(0))) {
                var_5_7D = and:int(var_5_61:int, ldc:int(520673758))
            }
            else {
                var_5_7D = and:int(var_5_61:int, ldc:int(754578651))
                
                if (invokeinterface:boolean(Iterator::hasNext, var_7_6E:Iterator<? extends \u3e75\ub8be\u88c5\ub7dc\uc246\u8753>)) {
                    var_8_BE = checkcast:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u3e75\ub8be\u88c5\ub7dc\uc246\u8753.class, invokeinterface:? extends \u3e75\ub8be\u88c5\ub7dc\uc246\u8753[expected:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753](Iterator<? extends \u3e75\ub8be\u88c5\ub7dc\uc246\u8753>::next, var_7_6E:Iterator<? extends \u3e75\ub8be\u88c5\ub7dc\uc246\u8753>))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(\u3e75\ub8be\u88c5\ub7dc\uc246\u8753::\ucfaf\ud51e\u7e3f\u4ab3\u12b2\u4c2b, var_8_BE:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753, p0:double, p1:double))) {
                        var_5_61 = and:int(var_5_7D:int, ldc:int(-488851363))
                        loopcontinue()
                    }
                    
                    return:Optional<\u3e75\ub8be\u88c5\ub7dc\uc246\u8753>(invokestatic:Optional<\u3e75\ub8be\u88c5\ub7dc\uc246\u8753>(Optional<T>::of, var_8_BE:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753))
                }
            }
            
            if (cmpeq:boolean(and:int(var_5_7D:int, ldc:int(512)), ldc:int(0))) {
                return:Optional<\u3e75\ub8be\u88c5\ub7dc\uc246\u8753>(invokestatic:Optional<\u3e75\ub8be\u88c5\ub7dc\uc246\u8753>(Optional<T>::empty))
            }
            
            var_5_61 = and:int(var_5_7D:int, ldc:int(1665564222))
        }
    }
    
    boolean \u183a\ud36e\u1187\u88c5\u7bad\u5bc4(double p0, double p1, int p2) {
        var_6_61 : int
        var_8_6E : Iterator<? extends \u3e75\ub8be\u88c5\ub7dc\uc246\u8753>
        var_9_AE : \u3e75\ub8be\u88c5\ub7dc\uc246\u8753
        
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
        var_6_61 = and:int(ldc:int(883088170), ldc:int(203636622))
        var_8_6E = invokeinterface:Iterator<? extends \u3e75\ub8be\u88c5\ub7dc\uc246\u8753>(List<? extends \u3e75\ub8be\u88c5\ub7dc\uc246\u8753>::iterator, invokeinterface:List<? extends \u3e75\ub8be\u88c5\ub7dc\uc246\u8753>(\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9::\u51fa\u67d0\u965f\u76bc\u3d4b\u7c6b, this:\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9))
        
        loop {
            if (cmpeq:boolean(and:int(var_6_61:int, ldc:int(1024)), ldc:int(0))) {
                var_6_61 = and:int(var_6_61:int, ldc:int(610999439))
                
                if (invokeinterface:boolean(Iterator::hasNext, var_8_6E:Iterator<? extends \u3e75\ub8be\u88c5\ub7dc\uc246\u8753>)) {
                    var_9_AE = checkcast:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u3e75\ub8be\u88c5\ub7dc\uc246\u8753.class, invokeinterface:? extends \u3e75\ub8be\u88c5\ub7dc\uc246\u8753[expected:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753](Iterator<? extends \u3e75\ub8be\u88c5\ub7dc\uc246\u8753>::next, var_8_6E:Iterator<? extends \u3e75\ub8be\u88c5\ub7dc\uc246\u8753>))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(\u3e75\ub8be\u88c5\ub7dc\uc246\u8753::\u183a\ud36e\u1187\u88c5\u7bad\u5bc4, var_9_AE:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753, p0:double, p1:double, p2:int))) {
                        var_6_61 = and:int(var_6_61:int, ldc:int(1178509007))
                        loopcontinue()
                    }
                    
                    invokeinterface:void(\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9::\u3504\u494c\u983f\u7c6b\u4f4a\u385b, this:\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9, var_9_AE:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753)
                    
                    if (cmpeq:boolean(p2:int, ldc:int(0))) {
                        invokeinterface:void(\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9::\ud171\ubf56\u8308\ud7e8\u5db4\ucfaf, this:\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9, xor:int[expected:boolean](ldc:int(3202), ldc:int(3203)))
                    }
                    
                    return:boolean(xor:int[expected:boolean](ldc:int(18576), ldc:int(18577)))
                }
            }
            
            if (cmpeq:boolean(and:int(var_6_61:int, ldc:int(1024)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(-15965), ldc:int(14940)))
            }
        }
    }
    
    boolean \ucb79\ua61f\ub18d\u416d\u416d\uc246(double p0, double p1, int p2) {
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
    
    boolean \u3776\uae87\ud171\ubb2b\u3bc9\uafe7(double p0, double p1, int p2, double p3, double p4) {
        var_10_61 : int
        stack_B7_0 : int [generated]
        
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
            var_10_61 = and:int(ldc:int(-122354683), ldc:int(2055243951))
            
            if (cmpne:boolean(invokeinterface:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753(\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9::\u64f2\u927d\uf94d\u5db4\u5fe1\u6b0d, this:\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9), aconstnull:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753())) {
                if (invokeinterface:boolean(\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9::\uc4d2\uc7fe\u61a4\ub7dc\u3a62\uc238, this:\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9)) {
                    if (cmpeq:boolean(p2:int, ldc:int(0))) {
                        stack_B7_0 = invokeinterface:boolean(\u3e75\ub8be\u88c5\ub7dc\uc246\u8753::\u3776\uae87\ud171\ubb2b\u3bc9\uafe7, invokeinterface:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753(\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9::\u64f2\u927d\uf94d\u5db4\u5fe1\u6b0d, this:\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9), p0:double, p1:double, p2:int, p3:double, p4:double)
                        return:boolean(stack_B7_0:boolean)
                    }
                }
            }
            
            var_10_61 = and:int(var_10_61:int, ldc:int(-81143689))
            stack_B7_0 = and:int[expected:boolean](ldc:int(8573), ldc:int(-8574))
            return:boolean(stack_B7_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    boolean \uc4d2\uc7fe\u61a4\ub7dc\u3a62\uc238();
    
    void \ud171\ubf56\u8308\ud7e8\u5db4\ucfaf(boolean p0);
    
    boolean \u385b\ub1b9\u9255\u8c8a\u16f6\u61a4(double p0, double p1, double p2) {
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
    
    boolean \uc229\u3a62\u12cb\ud51e\uafe7\u8308(int p0, int p1, int p2) {
        var_4_61 : int
        stack_A7_0 : int [generated]
        
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
            var_4_61 = and:int(ldc:int(1272617049), ldc:int(-1881147329))
            
            if (logicaland:boolean(cmpne:boolean(invokeinterface:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753(\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9::\u64f2\u927d\uf94d\u5db4\u5fe1\u6b0d, this:\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9), aconstnull:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753()), invokeinterface:boolean(\u3e75\ub8be\u88c5\ub7dc\uc246\u8753::\uc229\u3a62\u12cb\ud51e\uafe7\u8308, invokeinterface:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753(\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9::\u64f2\u927d\uf94d\u5db4\u5fe1\u6b0d, this:\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9), p0:int, p1:int, p2:int))) {
                stack_A7_0 = and:int(ldc:int(14857), ldc:int(97))
            }
            else {
                var_4_61 = and:int(var_4_61:int, ldc:int(1774451869))
                stack_A7_0 = and:int(ldc:int(5066), ldc:int(-21468))
            }
            
            return:boolean(stack_A7_0:int)
        }
        
        goto(Label_0006)
    }
    
    boolean \ua61f\ub70c\u5db4\u3711\u61a4\u3e75(int p0, int p1, int p2) {
        var_4_61 : int
        stack_A7_0 : int [generated]
        
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
            var_4_61 = and:int(ldc:int(558049330), ldc:int(749660258))
            
            if (logicaland:boolean(cmpne:boolean(invokeinterface:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753(\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9::\u64f2\u927d\uf94d\u5db4\u5fe1\u6b0d, this:\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9), aconstnull:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753()), invokeinterface:boolean(\u3e75\ub8be\u88c5\ub7dc\uc246\u8753::\ua61f\ub70c\u5db4\u3711\u61a4\u3e75, invokeinterface:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753(\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9::\u64f2\u927d\uf94d\u5db4\u5fe1\u6b0d, this:\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9), p0:int, p1:int, p2:int))) {
                stack_A7_0 = and:int(ldc:int(8261), ldc:int(16387))
            }
            else {
                var_4_61 = and:int(var_4_61:int, ldc:int(-793625606))
                stack_A7_0 = and:int(ldc:int(16741), ldc:int(-16742))
            }
            
            return:boolean(stack_A7_0:int)
        }
        
        goto(Label_0006)
    }
    
    boolean \ubb2b\ube23\u59ec\u61a4\u8753\uc4d2(char p0, int p1) {
        var_3_5F : int
        stack_9F_0 : int [generated]
        
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
            var_3_5F = and:int(ldc:int(-1065163570), ldc:int(-305168905))
            
            if (logicaland:boolean(cmpne:boolean(invokeinterface:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753(\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9::\u64f2\u927d\uf94d\u5db4\u5fe1\u6b0d, this:\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9), aconstnull:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753()), invokeinterface:boolean(\u3e75\ub8be\u88c5\ub7dc\uc246\u8753::\ubb2b\ube23\u59ec\u61a4\u8753\uc4d2, invokeinterface:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753(\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9::\u64f2\u927d\uf94d\u5db4\u5fe1\u6b0d, this:\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9), p0:char, p1:int))) {
                stack_9F_0 = and:int(ldc:int(28865), ldc:int(2609))
            }
            else {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-707236114))
                stack_9F_0 = and:int(ldc:int(14365), ldc:int(-14366))
            }
            
            return:boolean(stack_9F_0:int)
        }
        
        goto(Label_0006)
    }
    
    \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u3e75\ub8be\u88c5\ub7dc\uc246\u8753 \u64f2\u927d\uf94d\u5db4\u5fe1\u6b0d();
    
    void \u3504\u494c\u983f\u7c6b\u4f4a\u385b(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u3e75\ub8be\u88c5\ub7dc\uc246\u8753 p0);
    
    void \u97b7\u4bc8\u8d90\u071d\ub83f\ud171(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u3e75\ub8be\u88c5\ub7dc\uc246\u8753 p0) {
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
            invokeinterface:void(\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9::\u3504\u494c\u983f\u7c6b\u4f4a\u385b, this:\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9, p0:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753)
            invokeinterface:boolean(\u3e75\ub8be\u88c5\ub7dc\uc246\u8753::\u12b2\u8753\u7049\ub18d\ubded\u7006, p0:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753, and:int[expected:boolean](ldc:int(2307), ldc:int(209)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    void \ubff1\u3e2a\ud36e\u8d90\u446c\u6fb0(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u3e75\ub8be\u88c5\ub7dc\uc246\u8753 p0) {
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
            invokeinterface:void(\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9::\u3504\u494c\u983f\u7c6b\u4f4a\u385b, this:\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9, p0:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    boolean \u12b2\u8753\u7049\ub18d\ubded\u7006(boolean p0) {
        var_2_5F : int
        var_4_66 : \u3e75\ub8be\u88c5\ub7dc\uc246\u8753
        stack_8C_0 : int [generated]
        var_2_8B : int
        var_5_8C : int
        var_2_D3 : int
        var_6_9E : List<? extends \u3e75\ub8be\u88c5\ub7dc\uc246\u8753>
        var_7_A9 : int
        stack_136_0 : int [generated]
        stack_136_1 : int [generated]
        var_8_DB : int
        var_2_14D : int
        var_9_157 : ListIterator<? extends \u3e75\ub8be\u88c5\ub7dc\uc246\u8753>
        stack_186_0 : BooleanSupplier [generated]
        var_2_185 : int
        var_10_186 : BooleanSupplier
        stack_1B6_0 : Supplier<Object> [generated]
        var_2_1B5 : int
        var_11_1B6 : Supplier<\u3e75\ub8be\u88c5\ub7dc\uc246\u8753>
        var_12_207 : \u3e75\ub8be\u88c5\ub7dc\uc246\u8753
        
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
        var_2_5F = and:int(ldc:int(2062025462), ldc:int(-1095179081))
        var_4_66 = invokeinterface:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753(\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9::\u64f2\u927d\uf94d\u5db4\u5fe1\u6b0d, this:\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9)
        
        if (cmpeq:boolean(var_4_66:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753, aconstnull:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753())) {
            var_2_5F = and:int(var_2_5F:int, ldc:int(2147442362))
            stack_8C_0 = and:int(ldc:int(19491), ldc:int(-20404))
        }
        else {
            stack_8C_0 = xor:int(ldc:int(272), ldc:int(273))
        }
        
        var_2_8B = and:int(var_2_5F:int, ldc:int(2080165367))
        var_5_8C = stack_8C_0:int
        
        if (logicaland:boolean(cmpne:boolean(var_5_8C:int, ldc:int(0)), invokeinterface:boolean(\u3e75\ub8be\u88c5\ub7dc\uc246\u8753::\u12b2\u8753\u7049\ub18d\ubded\u7006, var_4_66:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753, p0:boolean))) {
            return:boolean(xor:int[expected:boolean](ldc:int(21568), ldc:int(21569)))
        }
        
        var_2_D3 = and:int(var_2_8B:int, ldc:int(1052596159))
        var_6_9E = invokeinterface:List<? extends \u3e75\ub8be\u88c5\ub7dc\uc246\u8753>(\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9::\u51fa\u67d0\u965f\u76bc\u3d4b\u7c6b, this:\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9)
        var_7_A9 = invokeinterface:int(List<E>::indexOf, var_6_9E:List<? extends \u3e75\ub8be\u88c5\ub7dc\uc246\u8753>, var_4_66:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753[expected:Object])
        
        if (cmpne:boolean(var_5_8C:int, ldc:int(0))) {
            if (cmpge:boolean(var_7_A9:int, ldc:int(0))) {
                stack_136_0 = var_7_A9:int
                
                if (logicalnot:boolean(p0:boolean)) {
                    var_2_D3 = and:int(var_2_D3:int, ldc:int(2074654387))
                    stack_136_1 = and:int(ldc:int(6699), ldc:int(-23100))
                }
                else {
                    stack_136_1 = and:int(ldc:int(2017), ldc:int(24595))
                }
                
                var_2_D3 = and:int(var_2_D3:int, ldc:int(1006451379))
                var_8_DB = add:int(stack_136_0:int, stack_136_1:int)
                goto(Label_0329)
            }
        }
        
        loop {
            if (cmpne:boolean(and:int(var_2_D3:int, ldc:int(2097152)), ldc:int(0))) {
                var_2_D3 = and:int(var_2_D3:int, ldc:int(-1145149514))
                
                if (p0:boolean) {
                    var_8_DB = and:int(ldc:int(-23929), ldc:int(5432))
                    looporswitchbreak()
                }
            }
            
            if (cmpne:boolean(and:int(var_2_D3:int, ldc:int(8388608)), ldc:int(0))) {
                var_2_D3 = and:int(var_2_D3:int, ldc:int(-17864006))
                var_8_DB = invokeinterface:int(List<E>::size, var_6_9E:List<? extends \u3e75\ub8be\u88c5\ub7dc\uc246\u8753>)
                looporswitchbreak()
            }
            
            var_2_D3 = and:int(var_2_D3:int, ldc:int(1892373987))
        }
        
        Label_0329:
        var_2_14D = and:int(var_2_D3:int, ldc:int(-1146397961))
        var_9_157 = invokeinterface:ListIterator<? extends \u3e75\ub8be\u88c5\ub7dc\uc246\u8753>(List<? extends \u3e75\ub8be\u88c5\ub7dc\uc246\u8753>::listIterator, var_6_9E:List<? extends \u3e75\ub8be\u88c5\ub7dc\uc246\u8753>, var_8_DB:int)
        
        if (logicalnot:boolean(p0:boolean)) {
            var_2_14D = and:int(var_2_14D:int, ldc:int(-22105162))
            stack_186_0 = invokedynamic:BooleanSupplier(getAsBoolean:(Ljava/util/ListIterator;)Ljava/util/function/BooleanSupplier;, var_9_157:ListIterator<? extends \u3e75\ub8be\u88c5\ub7dc\uc246\u8753>)
        }
        else {
            stack_186_0 = invokedynamic:BooleanSupplier(getAsBoolean:(Ljava/util/ListIterator;)Ljava/util/function/BooleanSupplier;, var_9_157:ListIterator<? extends \u3e75\ub8be\u88c5\ub7dc\uc246\u8753>)
        }
        
        var_2_185 = and:int(var_2_14D:int, ldc:int(-84041545))
        var_10_186 = stack_186_0:BooleanSupplier
        
        if (logicalnot:boolean(p0:boolean)) {
            var_2_185 = and:int(var_2_185:int, ldc:int(2129290162))
            stack_1B6_0 = invokedynamic:Supplier<Object>(get:(Ljava/util/ListIterator;)Ljava/util/function/Supplier;, var_9_157:ListIterator<Object>)
        }
        else {
            stack_1B6_0 = invokedynamic:Supplier<Object>(get:(Ljava/util/ListIterator;)Ljava/util/function/Supplier;, var_9_157:ListIterator<Object>)
        }
        
        var_2_1B5 = and:int(var_2_185:int, ldc:int(-1146130697))
        var_11_1B6 = stack_1B6_0:Supplier<\u3e75\ub8be\u88c5\ub7dc\uc246\u8753>
        
        loop {
            if (cmpne:boolean(and:int(var_2_1B5:int, ldc:int(16384)), ldc:int(0))) {
                var_2_1B5 = and:int(var_2_1B5:int, ldc:int(-744267302))
            }
            else {
                var_2_1B5 = and:int(var_2_1B5:int, ldc:int(1055860731))
                
                if (invokeinterface:boolean(BooleanSupplier::getAsBoolean, var_10_186:BooleanSupplier)) {
                    var_12_207 = checkcast:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u3e75\ub8be\u88c5\ub7dc\uc246\u8753.class, invokeinterface:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753(Supplier<\u3e75\ub8be\u88c5\ub7dc\uc246\u8753>::get, var_11_1B6:Supplier<\u3e75\ub8be\u88c5\ub7dc\uc246\u8753>))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(\u3e75\ub8be\u88c5\ub7dc\uc246\u8753::\u12b2\u8753\u7049\ub18d\ubded\u7006, var_12_207:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753, p0:boolean))) {
                        var_2_1B5 = and:int(var_2_1B5:int, ldc:int(-1094787913))
                        loopcontinue()
                    }
                    
                    invokeinterface:void(\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9::\u3504\u494c\u983f\u7c6b\u4f4a\u385b, this:\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9, var_12_207:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753)
                    return:boolean(xor:int[expected:boolean](ldc:int(1028), ldc:int(1029)))
                }
            }
            
            if (cmpeq:boolean(and:int(var_2_1B5:int, ldc:int(131072)), ldc:int(0))) {
                invokeinterface:void(\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9::\u3504\u494c\u983f\u7c6b\u4f4a\u385b, this:\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9, checkcast:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u3e75\ub8be\u88c5\ub7dc\uc246\u8753.class, aconstnull:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753()))
                return:boolean(and:int[expected:boolean](ldc:int(12355), ldc:int(-14412)))
            }
        }
    }
    
    boolean lambda$\u97b7\u7043\u0a06\uf9c5\u5f50\ua61f$1(double p0, double p1, double p2, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u3e75\ub8be\u88c5\ub7dc\uc246\u8753 p3) {
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
            return:boolean(invokeinterface:boolean(\u3e75\ub8be\u88c5\ub7dc\uc246\u8753::\u385b\ub1b9\u9255\u8c8a\u16f6\u61a4, p3:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753, p0:double, p1:double, p2:double))
        }
        
        goto(Label_0006)
    }
    
    boolean lambda$\u7043\u6bb9\u836c\u120d\u36d3\ubb2b$0(double p0, double p1, int p2, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u3e75\ub8be\u88c5\ub7dc\uc246\u8753 p3) {
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
            return:boolean(invokeinterface:boolean(\u3e75\ub8be\u88c5\ub7dc\uc246\u8753::\ucb79\ua61f\ub18d\u416d\u416d\uc246, p3:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753, p0:double, p1:double, p2:int))
        }
        
        goto(Label_0006)
    }
}
