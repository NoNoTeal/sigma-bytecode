public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ud217\u718f\ucef1\ua6bd\uff55\u6b0d {
    public static int \ube23\u416d\u8753\u9255\u3d4b\u927d(int p0) {
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
            return:int(loadelement:int(getstatic:int[](\ud217\u718f\ucef1\ua6bd\uff55\u6b0d::\u8389\uc31c\u8df4\uff55\u5140\u3504), invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, sub:int(p0:int, xor:int(ldc:int(16772), ldc:int(16773))), and:int(ldc:int(12590), ldc:int(-12592)), sub:int(arraylength:int(getstatic:int[](\ud217\u718f\ucef1\ua6bd\uff55\u6b0d::\u8389\uc31c\u8df4\uff55\u5140\u3504)), and:int(ldc:int(17603), ldc:int(2065))))))
        }
        
        goto(Label_0006)
    }
    
    public void \ud217\u718f\ucef1\ua6bd\uff55\u6b0d(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\ud217\u718f\ucef1\ua6bd\uff55\u6b0d, p0:Schema, p1:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.datafixers.TypeRewriteRule makeRule() {
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
    
    private static com.mojang.datafixers.Typed<?> \uceb8\u5bc4\u4ab3\u8258\u67d0\u62da(com.mojang.datafixers.Typed<?> p0, int p1) {
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
    
    private static com.mojang.datafixers.Typed<?> \u760c\u12cb\u183a\ud51e\uff55\u0800(com.mojang.datafixers.Typed<?> p0, int p1) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\u99f7\u12b2\u494c\u69d9\ubb2b\u67d0$6(int p0, com.mojang.serialization.Dynamic p1) {
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
            return:Dynamic(invokevirtual:Dynamic(Dynamic::set, p1:Dynamic, loadelement:String(getstatic:String[](\ud217\u718f\ucef1\ua6bd\uff55\u6b0d::\u960f\u600f\u494c\u8709\u8308\u5140), and:int(ldc:int(38), ldc:int(14468))), invokevirtual:Dynamic(Dynamic::createInt, p1:Dynamic, p0:int)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.serialization.Dynamic lambda$\u6bb9\ua562\uc3e3\ua61f\u839e\u6b0d$5(int p0, com.mojang.serialization.Dynamic p1) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\u4f52\uf9c5\ub7dc\u4c04\u5654\u4e72$4(int p0, com.mojang.serialization.Dynamic p1) {
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
            return:Dynamic(invokevirtual:Dynamic(Dynamic::set, p1:Dynamic, loadelement:String(getstatic:String[](\ud217\u718f\ucef1\ua6bd\uff55\u6b0d::\u960f\u600f\u494c\u8709\u8308\u5140), and:int(ldc:int(8215), ldc:int(142))), invokevirtual:Dynamic(Dynamic::createInt, p1:Dynamic, p0:int)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.Typed lambda$\ub7dc\ua068\uc229\uf9c5\ud36e\u9255$3(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.types.Type p1, com.mojang.datafixers.OpticFinder p2, com.mojang.datafixers.OpticFinder p3, com.mojang.datafixers.OpticFinder p4, com.mojang.datafixers.Typed p5) {
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
    
    private static com.mojang.datafixers.Typed lambda$\u4179\uae87\u97b7\u7bad\u34df\uf9c5$2(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.OpticFinder p1, com.mojang.datafixers.OpticFinder p2, com.mojang.datafixers.Typed p3) {
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
    
    private static java.lang.Integer lambda$null$1(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.Typed p1) {
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
            return:Integer(invokestatic:Integer(Integer::valueOf, invokeinterface:int(List::size, invokevirtual:List(Typed::getAllTyped, p1:Typed, p0:OpticFinder))))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.Optional lambda$\u61a4\u8308\uc246\u0a06\ud36e\u7e3f$0(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.Typed p1) {
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
            return:Optional(invokevirtual:Optional(Typed::getOptionalTyped, p1:Typed, p0:OpticFinder))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_354 : int
        expr_6E : int [generated]
        stack_AE_0 : byte[] [generated]
        stack_B0_0 : byte[] [generated]
        stack_E0_0 : byte[] [generated]
        stack_E2_0 : byte[] [generated]
        stack_110_0 : byte[] [generated]
        stack_112_0 : byte[] [generated]
        stack_147_0 : byte[] [generated]
        stack_2AC_0 : byte[] [generated]
        stack_300_0 : byte[] [generated]
        stack_36F_0 : byte[] [generated]
        stack_3CF_0 : byte[] [generated]
        var_4_27C : int
        var_3_281 : byte[]
        var_5_282 : int
        expr_2AF : byte [generated]
        var_0_3C5 : int
        expr_3CF : byte [generated]
        stack_3FF_2 : byte [generated]
        var_2_AE : byte[]
        expr_B2 : int [generated]
        var_3_2EE : byte[]
        var_5_2EF : int
        expr_E2 : int [generated]
        expr_112 : int [generated]
        var_3_153 : String
        stack_228_0 : String[] [generated]
        expr_165 : String[] [generated]
        expr_230 : int[] [generated]
        
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
        var_0_354 = and:int(ldc:int(1952025561), ldc:int(-2385929))
        expr_6E = arraylength:int(stack_AE_0 = stack_B0_0 = stack_E0_0 = stack_E2_0 = stack_110_0 = stack_112_0 = stack_147_0 = stack_2AC_0 = stack_300_0 = stack_36F_0 = stack_3CF_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("8vL67vzYsNbm+PL8zJzqR/zknPrE8MTu1kmSHHXq/Hbwzhbc0ObK+sL+kuoHxJ7C0PKo5PzgjPz+7tb66Mj87gmewuri2F7e6oeBob+7hy0=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_27C = expr_6E:int
        var_3_281 = newarray:byte[](byte.class, expr_6E:int)
        var_5_282 = expr_6E:int
        Label_0644:
        
        while (cmpne:boolean(and:int(var_0_354:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_354:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_354 = and:int(var_0_354:int, ldc:int(-1313165519))
                goto(Label_0839)
            }
            
            var_0_354 = and:int(var_0_354:int, ldc:int(433501143))
            var_5_282 = add:int(var_5_282:int, ldc:int(-1))
            expr_2AF = xor:byte(loadelement:byte(stack_2AC_0:byte[], var_5_282:int), ldc:byte(35))
            storeelement:byte(var_3_281:byte[], var_5_282:int, or:int(and:int(shl:int(expr_2AF:byte, xor:int(ldc:int(8198), ldc:int(8194))), ldc:int(-16)), and:int(shr:int(expr_2AF:byte[expected:int], and:int(ldc:int(1284), ldc:int(26700))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_282:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B0_0 = stack_AE_0 = stack_E0_0 = stack_E2_0 = stack_110_0 = stack_112_0 = stack_147_0 = stack_2AC_0 = stack_300_0 = stack_36F_0 = stack_3CF_0 = var_3_281:byte[]
            goto(Label_0115)
        }
        
        goto(Label_0926)
        Label_0839:
        
        while (cmpne:boolean(and:int(var_0_354:int, ldc:int(64)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_354:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0644)
            }
            
            var_0_354 = and:int(var_0_354:int, ldc:int(1172701147))
            var_5_282 = add:int(var_5_282:int, ldc:int(-1))
            storeelement:byte(var_3_281:byte[], var_5_282:int, add:byte(loadelement:byte(stack_36F_0:byte[], var_5_282:int), ldc:byte(21)))
            
            if (cmpne:boolean(var_5_282:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B0_0 = stack_AE_0 = stack_E0_0 = stack_E2_0 = stack_110_0 = stack_112_0 = stack_147_0 = stack_2AC_0 = stack_300_0 = stack_36F_0 = stack_3CF_0 = var_3_281:byte[]
            goto(Label_0231)
        }
        
        var_0_354 = and:int(var_0_354:int, ldc:int(745396363))
        Label_0926:
        
        while (cmpeq:boolean(and:int(var_0_354:int, ldc:int(2097152)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_354:int, ldc:int(256)), ldc:int(0))) {
                var_0_354 = and:int(var_0_354:int, ldc:int(-487056062))
                goto(Label_0644)
            }
            
            var_0_3C5 = and:int(var_0_354:int, ldc:int(1040041951))
            var_5_282 = add:int(var_5_282:int, ldc:int(-1))
            expr_3CF = loadelement:byte(stack_3CF_0:byte[], var_5_282:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_282:int, ldc:int(6)), neg:int(var_4_27C:int)), ldc:int(0))) {
                var_0_3C5 = and:int(var_0_3C5:int, ldc:int(-731862023))
                stack_3FF_2 = add:byte(expr_3CF:byte, ldc:byte(6))
            }
            else {
                stack_3FF_2 = add:byte(expr_3CF:byte, loadelement:byte(var_3_281:byte[], add:int(var_5_282:int, ldc:int(6))))
            }
            
            var_0_354 = and:int(var_0_3C5:int, ldc:int(-394861569))
            storeelement:byte(var_3_281:byte[], var_5_282:int, stack_3FF_2:byte)
            
            if (cmpne:boolean(var_5_282:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B0_0 = stack_AE_0 = stack_E0_0 = stack_E2_0 = stack_110_0 = stack_112_0 = stack_147_0 = stack_2AC_0 = stack_300_0 = stack_36F_0 = stack_3CF_0 = var_3_281:byte[]
            goto(Label_0279)
        }
        
        var_0_354 = and:int(var_0_354:int, ldc:int(1305275534))
        goto(Label_0839)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_354:int, ldc:int(2)), ldc:int(0))) {
            var_0_354 = and:int(var_0_354:int, ldc:int(1626906104))
            goto(Label_0279)
        }
        
        if (cmpeq:boolean(and:int(var_0_354:int, ldc:int(64)), ldc:int(0))) {
            var_0_354 = and:int(var_0_354:int, ldc:int(315350459))
            goto(Label_0231)
        }
        
        if (cmpne:boolean(and:int(var_0_354:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_354 = and:int(var_0_354:int, ldc:int(-855590058))
        }
        else {
            var_0_354 = and:int(var_0_354:int, ldc:int(-2088906757))
            var_2_AE = stack_AE_0:byte[]
            expr_B2 = add:int(arraylength:int(stack_B0_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_B2:int, ldc:int(0))) {
                var_3_2EE = newarray:byte[](byte.class, expr_B2:int)
                var_5_2EF = expr_B2:int
                
                loop {
                    var_0_354 = and:int(var_0_354:int, ldc:int(249532381))
                    var_5_2EF = add:int(var_5_2EF:int, ldc:int(-1))
                    storeelement:byte(var_3_2EE:byte[], var_5_2EF:int, add:int(shl:int(loadelement:byte(stack_300_0:byte[], var_5_2EF:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_AE:byte[], add:int(var_5_2EF:int, and:int(ldc:int(9), ldc:int(11761)))), ldc:int(5)), xor:int(ldc:int(20805), ldc:int(20802)))))
                    
                    if (cmpne:boolean(var_5_2EF:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_B0_0 = stack_AE_0 = stack_E0_0 = stack_E2_0 = stack_110_0 = stack_112_0 = stack_147_0 = stack_2AC_0 = stack_300_0 = stack_36F_0 = stack_3CF_0 = var_3_2EE:byte[]
            }
        }
        
        Label_0183:
        
        if (cmpeq:boolean(and:int(var_0_354:int, ldc:int(16)), ldc:int(0))) {
            var_0_354 = and:int(var_0_354:int, ldc:int(1550406026))
            goto(Label_0279)
        }
        
        if (cmpeq:boolean(and:int(var_0_354:int, ldc:int(2)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_354:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_354 = and:int(var_0_354:int, ldc:int(1666703315))
            expr_E2 = arraylength:int(stack_E2_0:byte[])
            
            if (cmpne:boolean(expr_E2:int, ldc:int(0))) {
                var_4_27C = expr_E2:int
                var_3_281 = newarray:byte[](byte.class, expr_E2:int)
                var_5_282 = expr_E2:int
                goto(Label_0839)
            }
        }
        
        Label_0231:
        
        if (cmpne:boolean(and:int(var_0_354:int, ldc:int(4194304)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_354:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_354 = and:int(var_0_354:int, ldc:int(-1036777318))
                goto(Label_0183)
            }
            
            if (cmpeq:boolean(and:int(var_0_354:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_354 = and:int(var_0_354:int, ldc:int(2026481651))
            expr_112 = arraylength:int(stack_112_0:byte[])
            
            if (cmpne:boolean(expr_112:int, ldc:int(0))) {
                var_4_27C = expr_112:int
                var_3_281 = newarray:byte[](byte.class, expr_112:int)
                var_5_282 = expr_112:int
                goto(Label_0926)
            }
        }
        
        Label_0279:
        
        if (cmpeq:boolean(and:int(var_0_354:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0231)
        }
        
        if (cmpeq:boolean(and:int(var_0_354:int, ldc:int(32768)), ldc:int(0))) {
            var_0_354 = and:int(var_0_354:int, ldc:int(324661699))
            goto(Label_0183)
        }
        
        if (cmpne:boolean(and:int(var_0_354:int, ldc:int(131072)), ldc:int(0))) {
            var_0_354 = and:int(var_0_354:int, ldc:int(-86271582))
            goto(Label_0115)
        }
        
        var_3_153 = initobject:String(String::<init>, stack_147_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_228_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2247), ldc:int(4143)))
        expr_165 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(5647), ldc:int(7)))
        storeelement:String(expr_165:String[], xor:int(ldc:int(17056), ldc:int(17057)), invokevirtual:String[expected:String](String::substring, var_3_153:String, and:int(ldc:int(1635), ldc:int(-1648)), xor:int(ldc:int(9233), ldc:int(9239))))
        storeelement:String(expr_165:String[], and:int(ldc:int(4354), ldc:int(3151)), invokevirtual:String[expected:String](String::substring, var_3_153:String, xor:int(ldc:int(4151), ldc:int(4145)), and:int(ldc:int(45), ldc:int(23567))))
        storeelement:String(expr_165:String[], and:int(ldc:int(4111), ldc:int(2531)), invokevirtual:String[expected:String](String::substring, var_3_153:String, and:int(ldc:int(269), ldc:int(17583)), xor:int(ldc:int(1693), ldc:int(1719))))
        storeelement:String(expr_165:String[], and:int(ldc:int(1039), ldc:int(6917)), invokevirtual:String[expected:String](String::substring, var_3_153:String, xor:int(ldc:int(8335), ldc:int(8357)), and:int(ldc:int(8254), ldc:int(22454))))
        storeelement:String(expr_165:String[], and:int(ldc:int(29228), ldc:int(1221)), invokevirtual:String[expected:String](String::substring, var_3_153:String, and:int(ldc:int(4414), ldc:int(2103)), and:int(ldc:int(14143), ldc:int(2104))))
        storeelement:String(expr_165:String[], and:int(ldc:int(4231), ldc:int(2054)), invokevirtual:String[expected:String](String::substring, var_3_153:String, xor:int(ldc:int(10382), ldc:int(10422)), xor:int(ldc:int(551), ldc:int(538))))
        storeelement:String(expr_165:String[], and:int(ldc:int(-24137), ldc:int(24128)), invokevirtual:String[expected:String](String::substring, var_3_153:String, and:int(ldc:int(5181), ldc:int(19069)), xor:int(ldc:int(-23501), ldc:int(-23428))))
        putstatic:String[](\ud217\u718f\ucef1\ua6bd\uff55\u6b0d::\u960f\u600f\u494c\u8709\u8308\u5140, expr_165:String[])
        expr_230 = newarray:int[](int.class, and:int(ldc:int(4101), ldc:int(199)))
        storeelement:int(expr_230:int[], and:int(ldc:int(8535), ldc:int(-11096)), and:int(ldc:int(-4637), ldc:int(4636)))
        storeelement:int(expr_230:int[], and:int(ldc:int(6915), ldc:int(24637)), ldc:int(10))
        storeelement:int(expr_230:int[], and:int(ldc:int(4618), ldc:int(18594)), ldc:int(50))
        storeelement:int(expr_230:int[], xor:int(ldc:int(2105), ldc:int(2106)), ldc:int(100))
        storeelement:int(expr_230:int[], xor:int(ldc:int(5632), ldc:int(5636)), xor:int(ldc:int(17597), ldc:int(17451)))
        putstatic:int[](\ud217\u718f\ucef1\ua6bd\uff55\u6b0d::\u8389\uc31c\u8df4\uff55\u5140\u3504, expr_230:int[])
    }
    
    public void \u3504\u1187\uceb8\u6cfe\u836c\u62da(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6EA : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_6F5 : int
        
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
        var_3_6EA = and:int(ldc:int(-1985212577), ldc:int(-1529021865))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ud217\u718f\ucef1\ua6bd\uff55\u6b0d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(524288)), ldc:int(0))) {
            var_3_6EA = and:int(var_3_6EA:int, ldc:int(1505682134))
        }
        else {
            var_3_6EA = and:int(var_3_6EA:int, ldc:int(1269649239))
            var_5_8A = and:int(ldc:int(3147), ldc:int(-3168))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(10277), ldc:int(-10278)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_6EA:int, ldc:int(1016613455))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(8339), ldc:int(4197)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(-27392), ldc:int(-27391)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_6EA = and:int(var_3_E3:int, ldc:int(665485279))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(1585), ldc:int(12481)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1649)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(478041528))
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1314)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(-1015169460))
                        goto(Label_1198)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(1482219588))
                        goto(Label_1021)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(1819126408))
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(301836911))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0595)
                            }
                            
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(-1083957393))
                        goto(Label_1649)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(219606988))
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(1453222677))
                        goto(Label_1314)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(-1662142517))
                        goto(Label_1198)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(1975778449))
                        goto(Label_1021)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6EA = and:int(var_3_6EA:int, ldc:int(1777314759))
                            var_11_F4 = and:int(ldc:int(-3637), ldc:int(3636))
                            goto(Label_1638)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0595:
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(-1767566987))
                        goto(Label_1649)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(-800008862))
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1314)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1198)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(226014485))
                        goto(Label_1021)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(445358627))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6EA = and:int(var_3_6EA:int, ldc:int(69031313))
                            loopcontinue()
                        }
                        
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(-673706161))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0729:
                    
                    if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(-1217657981))
                        goto(Label_1649)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(1263806762))
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(-879171158))
                        goto(Label_1314)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1198)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1021)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6EA = and:int(var_3_6EA:int, ldc:int(1549947874))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6EA = and:int(var_3_6EA:int, ldc:int(2030874851))
                            loopcontinue()
                        }
                        
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(114174815))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0870:
                    
                    if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(-465932714))
                        goto(Label_1649)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(-1751638656))
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(-375969978))
                        goto(Label_1314)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(1973372153))
                        goto(Label_1198)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(-1421027867))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6EA = and:int(var_3_6EA:int, ldc:int(-1172605055))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6EA = and:int(var_3_6EA:int, ldc:int(1603790707))
                            loopcontinue()
                        }
                        
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(150748903))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = xor:int(ldc:int(-32320), ldc:int(-32319))
                                goto(Label_1198)
                            }
                        }
                    }
                    
                    Label_1021:
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(277226928))
                        goto(Label_1649)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(-1288991748))
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1314)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(-1329441513))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6EA = and:int(var_3_6EA:int, ldc:int(-324305367))
                            goto(Label_0870)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6EA = and:int(var_3_6EA:int, ldc:int(-1094023933))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6EA = and:int(var_3_6EA:int, ldc:int(-85855891))
                            loopcontinue()
                        }
                        
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(-1516664081))
                        var_11_F4 = and:int(ldc:int(-3138), ldc:int(3137))
                    }
                    
                    Label_1198:
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(-1777707671))
                        goto(Label_1649)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6EA = and:int(var_3_6EA:int, ldc:int(-1491071477))
                            goto(Label_1021)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0870)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6EA = and:int(var_3_6EA:int, ldc:int(-1167036129))
                            loopcontinue()
                        }
                        
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(783183559))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1484)
                            }
                        }
                    }
                    
                    Label_1314:
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(-1898957586))
                        goto(Label_1649)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(1445283781))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6EA = and:int(var_3_6EA:int, ldc:int(-611241107))
                            goto(Label_1198)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6EA = and:int(var_3_6EA:int, ldc:int(-1574379751))
                            goto(Label_1021)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6EA = and:int(var_3_6EA:int, ldc:int(720605018))
                            goto(Label_0870)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6EA = and:int(var_3_6EA:int, ldc:int(651328469))
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6EA = and:int(var_3_6EA:int, ldc:int(2040428063))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6EA = and:int(var_3_6EA:int, ldc:int(-1269341716))
                            loopcontinue()
                        }
                        
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(-1148458289))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1638)
                    }
                    
                    Label_1484:
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(-1698516398))
                        goto(Label_1649)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(1385174103))
                        goto(Label_1314)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(-80120312))
                        goto(Label_1198)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(874331352))
                        goto(Label_1021)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(-877358743))
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(1579427672))
                        loopcontinue()
                    }
                    
                    var_3_6EA = and:int(var_3_6EA:int, ldc:int(-1594893361))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1638:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6F5 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1649:
                    
                    if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1314)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(-1297958350))
                        goto(Label_1198)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(895544949))
                        goto(Label_1021)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(-1560423744))
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EA:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(-2007194932))
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(-170069095))
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6EA = and:int(var_3_6EA:int, ldc:int(-2017587489))
                        var_17_6F5 = add:int(var_16_122:int, and:int(ldc:int(8385), ldc:int(21519)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6EA = and:int(var_3_6EA:int, ldc:int(-1278480529))
                
                if (cmple:boolean(var_5_8A = var_17_6F5:int, sub:int(var_6_91:int, xor:int(ldc:int(2242), ldc:int(2243))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_6EA:int, ldc:int(16384)), ldc:int(0))) {
            var_3_6EA = and:int(var_3_6EA:int, ldc:int(1233959142))
            goto(Label_0108)
        }
    }
}
