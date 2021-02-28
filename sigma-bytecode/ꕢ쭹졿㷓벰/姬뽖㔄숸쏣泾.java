public class \ua562\ucb79\uc87f\u3dd3\ubcb0.\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe {
    public void \u59ec\ubf56\u3504\uc238\uc3e3\u6cfe(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1, java.util.List<com.mojang.datafixers.util.Pair<\u494c\u4975\ua068\u0c95\uc84e.\u624e\u6b5f\u3bd6\u9255\u183a\u52d3, java.lang.Integer>> p2) {
        var_6_81 : Iterator<Pair<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3, Integer>>
        var_7_A9 : Pair<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3, Integer>
        var_8_B3 : \u624e\u6b5f\u3bd6\u9255\u183a\u52d3
        var_9_BC : int
        
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
            invokespecial:Object(Object::<init>, this:\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe)
            putfield:int(\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe::\u494c\ud36e\u8413\u3e75\ub7dc\u12cb, this:\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe, ldc:int(-2147483648))
            putfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe::\ud7e8\uceb8\u47c2\u16f6\u7e3f\u927d, this:\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            putfield:List<Pair<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3, Integer>>(\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe::\u12cb\u385b\u12b2\u8753\uf94d\u7006, this:\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe, p2:List<Pair<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3, Integer>>)
            putfield:List<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3>(\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe::\u8aa5\u8cae\u6198\u3d64\u7049\u5f50, this:\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe, invokestatic:ArrayList[expected:List<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3>](Lists::newArrayList))
            var_6_81 = invokeinterface:Iterator<Pair<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3, Integer>>(List<Pair<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3, Integer>>::iterator, p2:List<Pair<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3, Integer>>)
            
            while (invokeinterface:boolean(Iterator::hasNext, var_6_81:Iterator)) {
                var_7_A9 = checkcast:Pair<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3, Integer>(com.mojang.datafixers.util.Pair<\u494c\u4975\ua068\u0c95\uc84e.\u624e\u6b5f\u3bd6\u9255\u183a\u52d3, java.lang.Integer>.class, invokeinterface:Pair<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3, Integer>(Iterator<Pair<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3, Integer>>::next, var_6_81:Iterator<Pair<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3, Integer>>))
                var_8_B3 = checkcast:\u624e\u6b5f\u3bd6\u9255\u183a\u52d3(\u494c\u4975\ua068\u0c95\uc84e.\u624e\u6b5f\u3bd6\u9255\u183a\u52d3.class, invokevirtual:Object[expected:\u624e\u6b5f\u3bd6\u9255\u183a\u52d3](Pair::getFirst, var_7_A9:Pair<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3, Integer>))
                var_9_BC = and:int(ldc:int(-7613), ldc:int(3512))
                
                while (cmplt:boolean(var_9_BC:int, invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Object[expected:Integer](Pair::getSecond, var_7_A9:Pair<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3, Integer>))))) {
                    invokeinterface:boolean(List<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3>::add, getfield:List<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3>(\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe::\u8aa5\u8cae\u6198\u3d64\u7049\u5f50, this:\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe), var_8_B3:\u624e\u6b5f\u3bd6\u9255\u183a\u52d3)
                    inc:int(var_9_BC, ldc:int(1))
                }
            }
            
            putfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe::\u5fe1\ud51e\u4ab3\ucb79\u760c\u40a9, this:\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u59ec\ubf56\u3504\uc238\uc3e3\u6cfe(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1, java.util.List<com.mojang.datafixers.util.Pair<java.util.function.Function<\ua562\ucb79\uc87f\u3dd3\ubcb0.\u6435\u7006\uc3e3\u4c04\u7873\u64ab, ? extends \u494c\u4975\ua068\u0c95\uc84e.\u624e\u6b5f\u3bd6\u9255\u183a\u52d3>, java.lang.Integer>> p2, \ua562\ucb79\uc87f\u3dd3\ubcb0.\u6435\u7006\uc3e3\u4c04\u7873\u64ab p3) {
        var_7_83 : Iterator<Pair<Function<\u6435\u7006\uc3e3\u4c04\u7873\u64ab, ? extends \u624e\u6b5f\u3bd6\u9255\u183a\u52d3>, Integer>>
        var_8_AB : Pair<Function<\u6435\u7006\uc3e3\u4c04\u7873\u64ab, ? extends \u624e\u6b5f\u3bd6\u9255\u183a\u52d3>, Integer>
        var_9_BF : \u624e\u6b5f\u3bd6\u9255\u183a\u52d3
        var_10_DC : int
        
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
            invokespecial:Object(Object::<init>, this:\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe)
            putfield:int(\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe::\u494c\ud36e\u8413\u3e75\ub7dc\u12cb, this:\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe, ldc:int(-2147483648))
            putfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe::\ud7e8\uceb8\u47c2\u16f6\u7e3f\u927d, this:\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            putfield:List<Pair<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3, Integer>>(\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe::\u12cb\u385b\u12b2\u8753\uf94d\u7006, this:\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe, invokestatic:ArrayList[expected:List<Pair<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3, Integer>>](Lists::newArrayList))
            putfield:List<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3>(\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe::\u8aa5\u8cae\u6198\u3d64\u7049\u5f50, this:\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe, invokestatic:ArrayList[expected:List<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3>](Lists::newArrayList))
            var_7_83 = invokeinterface:Iterator<Pair<Function<\u6435\u7006\uc3e3\u4c04\u7873\u64ab, ? extends \u624e\u6b5f\u3bd6\u9255\u183a\u52d3>, Integer>>(List<Pair<Function<\u6435\u7006\uc3e3\u4c04\u7873\u64ab, ? extends \u624e\u6b5f\u3bd6\u9255\u183a\u52d3>, Integer>>::iterator, p2:List<Pair<Function<\u6435\u7006\uc3e3\u4c04\u7873\u64ab, ? extends \u624e\u6b5f\u3bd6\u9255\u183a\u52d3>, Integer>>)
            
            while (invokeinterface:boolean(Iterator::hasNext, var_7_83:Iterator)) {
                var_8_AB = checkcast:Pair<Function<\u6435\u7006\uc3e3\u4c04\u7873\u64ab, ? extends \u624e\u6b5f\u3bd6\u9255\u183a\u52d3>, Integer>(com.mojang.datafixers.util.Pair<java.util.function.Function<\ua562\ucb79\uc87f\u3dd3\ubcb0.\u6435\u7006\uc3e3\u4c04\u7873\u64ab, ? extends \u494c\u4975\ua068\u0c95\uc84e.\u624e\u6b5f\u3bd6\u9255\u183a\u52d3>, java.lang.Integer>.class, invokeinterface:Pair<Function<\u6435\u7006\uc3e3\u4c04\u7873\u64ab, ? extends \u624e\u6b5f\u3bd6\u9255\u183a\u52d3>, Integer>(Iterator<Pair<Function<\u6435\u7006\uc3e3\u4c04\u7873\u64ab, ? extends \u624e\u6b5f\u3bd6\u9255\u183a\u52d3>, Integer>>::next, var_7_83:Iterator<Pair<Function<\u6435\u7006\uc3e3\u4c04\u7873\u64ab, ? extends \u624e\u6b5f\u3bd6\u9255\u183a\u52d3>, Integer>>))
                var_9_BF = checkcast:\u624e\u6b5f\u3bd6\u9255\u183a\u52d3(\u494c\u4975\ua068\u0c95\uc84e.\u624e\u6b5f\u3bd6\u9255\u183a\u52d3.class, invokeinterface:\u624e\u6b5f\u3bd6\u9255\u183a\u52d3(Function<\u6435\u7006\uc3e3\u4c04\u7873\u64ab, \u624e\u6b5f\u3bd6\u9255\u183a\u52d3>::apply, checkcast:Function(java.util.function.Function.class, invokevirtual:Object[expected:Function<\u6435\u7006\uc3e3\u4c04\u7873\u64ab, \u624e\u6b5f\u3bd6\u9255\u183a\u52d3>](Pair::getFirst, var_8_AB:Pair<Function<\u6435\u7006\uc3e3\u4c04\u7873\u64ab, ? extends \u624e\u6b5f\u3bd6\u9255\u183a\u52d3>, Integer>)), p3:\u6435\u7006\uc3e3\u4c04\u7873\u64ab))
                invokeinterface:boolean(List<Pair<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3, Integer>>::add, getfield:List<Pair<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3, Integer>>(\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe::\u12cb\u385b\u12b2\u8753\uf94d\u7006, this:\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe), invokestatic:Pair(Pair::of, var_9_BF:\u624e\u6b5f\u3bd6\u9255\u183a\u52d3[expected:Object], invokevirtual:Object(Pair::getSecond, var_8_AB:Pair<Function<\u6435\u7006\uc3e3\u4c04\u7873\u64ab, ? extends \u624e\u6b5f\u3bd6\u9255\u183a\u52d3>, Integer>)))
                var_10_DC = and:int(ldc:int(15106), ldc:int(-15107))
                
                while (cmplt:boolean(var_10_DC:int, invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Object[expected:Integer](Pair::getSecond, var_8_AB:Pair<Function<\u6435\u7006\uc3e3\u4c04\u7873\u64ab, ? extends \u624e\u6b5f\u3bd6\u9255\u183a\u52d3>, Integer>))))) {
                    invokeinterface:boolean(List<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3>::add, getfield:List<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3>(\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe::\u8aa5\u8cae\u6198\u3d64\u7049\u5f50, this:\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe), var_9_BF:\u624e\u6b5f\u3bd6\u9255\u183a\u52d3)
                    inc:int(var_10_DC, ldc:int(1))
                }
            }
            
            putfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe::\u5fe1\ud51e\u4ab3\ucb79\u760c\u40a9, this:\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \ub113\u527a\ub7dc\uf9c5\ud36e\u9033(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1 p0) {
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
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \u1187\ud4fe\u120d\u71ae\u718f\u4d85() {
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
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe::\u5fe1\ud51e\u4ab3\ucb79\u760c\u40a9, this:\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe))
        }
        
        goto(Label_0006)
    }
    
    public \u494c\u4975\ua068\u0c95\uc84e.\u624e\u6b5f\u3bd6\u9255\u183a\u52d3 \u9af2\u3776\u839e\u120d\u836c\u6d99(java.util.Random p0) {
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
            return:\u624e\u6b5f\u3bd6\u9255\u183a\u52d3(checkcast:\u624e\u6b5f\u3bd6\u9255\u183a\u52d3(\u494c\u4975\ua068\u0c95\uc84e.\u624e\u6b5f\u3bd6\u9255\u183a\u52d3.class, invokeinterface:\u624e\u6b5f\u3bd6\u9255\u183a\u52d3(List<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3>::get, getfield:List<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3>(\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe::\u8aa5\u8cae\u6198\u3d64\u7049\u5f50, this:\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe), invokevirtual:int(Random::nextInt, p0:Random, invokeinterface:int(List<E>::size, getfield:List<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3>(\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe::\u8aa5\u8cae\u6198\u3d64\u7049\u5f50, this:\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe))))))
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u494c\u4975\ua068\u0c95\uc84e.\u624e\u6b5f\u3bd6\u9255\u183a\u52d3> \ub7dc\u183a\u6bb9\u5140\u6435\u7e3f(java.util.Random p0) {
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
            return:List<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3>(invokestatic:ImmutableList[expected:List<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3>](ImmutableList::copyOf, invokestatic:Object[](ObjectArrays::shuffle, invokeinterface:\u624e\u6b5f\u3bd6\u9255\u183a\u52d3[][expected:Object[]](List<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3>::toArray, getfield:List<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3>(\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe::\u8aa5\u8cae\u6198\u3d64\u7049\u5f50, this:\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe), newarray:\u624e\u6b5f\u3bd6\u9255\u183a\u52d3[](\u494c\u4975\ua068\u0c95\uc84e.\u624e\u6b5f\u3bd6\u9255\u183a\u52d3.class, and:int(ldc:int(-3519), ldc:int(3486)))), p0:Random)))
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \u8308\ua562\u9937\ubded\u836c\ub32d() {
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
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe::\ud7e8\uceb8\u47c2\u16f6\u7e3f\u927d, this:\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe))
        }
        
        goto(Label_0006)
    }
    
    public int \u12b2\u965f\uc4d2\u7c6b\u1833\ua6bd() {
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
            return:int(invokeinterface:int(List<E>::size, getfield:List<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3>(\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe::\u8aa5\u8cae\u6198\u3d64\u7049\u5f50, this:\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u3504\u34df\uf94d\ubb2b\u7006\u392e$2(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1 p0, \u494c\u4975\ua068\u0c95\uc84e.\u624e\u6b5f\u3bd6\u9255\u183a\u52d3 p1) {
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
            return:int(invokevirtual:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u64f2\ub1b9\uae5d\u3c25\uc4d2\u8389, invokevirtual:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\u624e\u6b5f\u3bd6\u9255\u183a\u52d3::\u0800\uf995\u836c\u99f7\u12b2\u5fe1, p1:\u624e\u6b5f\u3bd6\u9255\u183a\u52d3, p0:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1, getstatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u92ee\u56bd\u7ce1\ua6bd\u8709\u946b), getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ud36e\u0b8e\u8d90\ub1b9\u67d0\u72f1))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.kinds.App lambda$\u7bad\u69d9\ub113\u36d3\u8350\u6bb9$1(com.mojang.serialization.codecs.RecordCodecBuilder$Instance p0) {
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
    
    private static java.util.List lambda$\ub32d\u7873\u98a4\u97b7\ub171\u8308$0(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe p0) {
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
            return:List(getfield:List<Pair<\u624e\u6b5f\u3bd6\u9255\u183a\u52d3, Integer>>(\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe::\u12cb\u385b\u12b2\u8753\uf94d\u7006, p0:\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe))
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
    
    public void \ud51e\u759a\u4f52\u6cfe\u6198\u36d3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6C3 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_6CE : int
        
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
        var_3_6C3 = and:int(ldc:int(662186143), ldc:int(1060665503))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u59ec\ubf56\u3504\uc238\uc3e3\u6cfe[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1031381014))
        }
        else {
            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-335824209))
            var_5_8A = and:int(ldc:int(-6452), ldc:int(6195))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(16519), ldc:int(-16520)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_6C3:int, ldc:int(1731246399))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(2577), ldc:int(25665)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(68), ldc:int(69)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_6C3 = and:int(var_3_E3:int, ldc:int(-147428609))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(1569), ldc:int(1568)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1574786484))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1889936002))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1893853109))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1437322300))
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1316028736))
                    }
                    else {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1865940351))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0613)
                            }
                            
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1912549692))
                        goto(Label_1600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-651031772))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1260863476))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1281922746))
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-88097340))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(882278801))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1086685601))
                            var_11_F4 = and:int(ldc:int(-19807), ldc:int(17502))
                            goto(Label_1589)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0613:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1434359303))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1612150898))
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-214213459))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-624078960))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(729070927))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0738:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1416347117))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1050645999))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1697503849))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(887007005))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1945840959))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0870:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(219321199))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(918558619))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1847849343))
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-570371420))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1074530017))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = xor:int(ldc:int(16968), ldc:int(16969))
                                goto(Label_1164)
                            }
                        }
                    }
                    
                    Label_0995:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1022070347))
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(692519872))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1254314533))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(511584723))
                            goto(Label_0870)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-930461778))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1810922783))
                        var_11_F4 = and:int(ldc:int(-15460), ldc:int(15459))
                    }
                    
                    Label_1164:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(126815722))
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1150760958))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0995)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0870)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1216369570))
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1939827649))
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-592878818))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-482427777))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1434)
                            }
                        }
                    }
                    
                    Label_1298:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1164)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0995)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-759326866))
                            goto(Label_0870)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1264030836))
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(677483518))
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1764095990))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(2008072095))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                            goto(Label_1589)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1434:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-239119952))
                        goto(Label_1600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1569332335))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-2132105392))
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1572491577))
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(494902493))
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-2027657261))
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2097152)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6C3 = and:int(var_3_6C3:int, ldc:int(729005663))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1589:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6CE = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1600:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1365491800))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-419071933))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1863093374))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1946825827))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-109352391))
                        goto(Label_0613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1216758993))
                        var_17_6CE = add:int(var_16_122:int, and:int(ldc:int(8997), ldc:int(65)))
                        looporswitchbreak()
                    }
                    
                    var_3_6C3 = and:int(var_3_6C3:int, ldc:int(2098378228))
                }
                
                var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1480802417))
                
                if (cmple:boolean(var_5_8A = var_17_6CE:int, sub:int(var_6_91:int, xor:int(ldc:int(9250), ldc:int(9251))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2048)), ldc:int(0))) {
            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1823592964))
            goto(Label_0108)
        }
    }
}
