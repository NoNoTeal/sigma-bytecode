public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u7bad\u8753\u8350\u52d3\uf995\u7006 {
    public void \u7bad\u8753\u8350\u52d3\uf995\u7006(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u7bad\u8753\u8350\u52d3\uf995\u7006, p0:Schema, p1:boolean)
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
    
    private static short \ucfaf\uafe7\u7043\u34df\u3e2a\ub70c(int p0, int p1, int p2) {
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
            return:short(i2s:short(or:int(or:int(and:int(p0:int, ldc:int(15)), shl:int(and:int(p1:int, ldc:int(15)), and:int(ldc:int(1172), ldc:int(8261)))), shl:int(and:int(p2:int, ldc:int(15)), ldc:int(8)))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.Typed lambda$\u16f6\u8df4\u6b5f\uae87\ucef1\u97e6$7(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.types.Type p1, com.mojang.datafixers.OpticFinder p2, com.mojang.datafixers.Typed p3) {
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
    
    private static com.mojang.datafixers.Typed lambda$\u5140\u6bb9\ub19c\u647c\u0b8e\u183a$6(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.types.Type p1, com.mojang.datafixers.Typed p2) {
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
    
    private static java.lang.IllegalStateException lambda$\ub113\uf9c5\u7d52\ub6ab\uceb8\u3dd3$5() {
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
            return:IllegalStateException(initobject:IllegalStateException(IllegalStateException::<init>, loadelement:String(getstatic:String[](\u7bad\u8753\u8350\u52d3\uf995\u7006::\uc910\u52d3\uae5d\uc229\u120d\u4975), xor:int(ldc:int(4104), ldc:int(4100)))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.serialization.Dynamic lambda$\u12b2\ub19c\u4f4a\u56bd\u74b1\u5f50$4(com.mojang.serialization.Dynamic p0, it.unimi.dsi.fastutil.shorts.ShortList p1) {
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
            return:Dynamic(invokevirtual:Dynamic(Dynamic::createList, p0:Dynamic, invokeinterface:Stream(Stream::map, invokeinterface:Stream(ShortList::stream, p1:ShortList), invokedynamic:Function<Short, Dynamic>(apply:(Lcom/mojang/serialization/Dynamic;)Ljava/util/function/Function;, p0:Dynamic[expected:DynamicLike]))))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$null$3(java.util.List p0, com.mojang.serialization.Dynamic p1) {
        var_4_7B : int
        var_5_96 : int
        
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
            var_4_7B = invokevirtual:int(OptionalDynamic::asInt, invokevirtual:OptionalDynamic(Dynamic::get, p1:Dynamic, loadelement:String(getstatic:String[](\u7bad\u8753\u8350\u52d3\uf995\u7006::\uc910\u52d3\uae5d\uc229\u120d\u4975), and:int(ldc:int(29343), ldc:int(1037)))), and:int(ldc:int(-16665), ldc:int(16664)))
            var_5_96 = invokevirtual:int(OptionalDynamic::asInt, invokevirtual:OptionalDynamic(Dynamic::get, p1:Dynamic, loadelement:String(getstatic:String[](\u7bad\u8753\u8350\u52d3\uf995\u7006::\uc910\u52d3\uae5d\uc229\u120d\u4975), xor:int(ldc:int(4232), ldc:int(4230)))), and:int(ldc:int(16997), ldc:int(-17014)))
            invokeinterface:boolean(ShortList::add, checkcast:ShortList(it.unimi.dsi.fastutil.shorts.ShortList.class, invokeinterface:ShortList(List<ShortList>::get, p0:List<ShortList>, shr:int(var_5_96:int, and:int(ldc:int(24708), ldc:int(2565))))), invokestatic:short(\u7bad\u8753\u8350\u52d3\uf995\u7006::\ucfaf\uafe7\u7043\u34df\u3e2a\ub70c, var_4_7B:int, var_5_96:int, invokevirtual:int(OptionalDynamic::asInt, invokevirtual:OptionalDynamic(Dynamic::get, p1:Dynamic, loadelement:String(getstatic:String[](\u7bad\u8753\u8350\u52d3\uf995\u7006::\uc910\u52d3\uae5d\uc229\u120d\u4975), and:int(ldc:int(2847), ldc:int(4239)))), and:int(ldc:int(-4406), ldc:int(4405)))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static it.unimi.dsi.fastutil.shorts.ShortArrayList lambda$\u4c2b\u9937\uceb8\u9255\ub83f\uff55$2(int p0) {
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
            return:ShortArrayList(initobject:ShortArrayList(ShortArrayList::<init>))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.Optional lambda$null$1(com.mojang.serialization.Dynamic p0) {
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
            return:Optional(invokevirtual:Optional(DataResult::result, invokevirtual:DataResult(Dynamic::asStreamOpt, p0:Dynamic)))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.Optional lambda$\ua562\u9255\uc3e3\u416d\u8709\u446c$0(com.mojang.datafixers.Typed p0) {
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
            return:Optional(invokevirtual:Optional(DataResult::result, invokevirtual:DataResult(Typed::write, p0:Typed)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_90 : int
        expr_68 : byte[] [generated]
        stack_93_0 : byte[] [generated]
        stack_95_0 : byte[] [generated]
        stack_C5_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_F5_0 : byte[] [generated]
        stack_362_0 : byte[] [generated]
        stack_3B8_0 : byte[] [generated]
        expr_6E : int [generated]
        var_4_2D0 : int
        var_3_2D5 : byte[]
        var_5_2D6 : int
        var_0_301 : int
        expr_2E7 : byte [generated]
        stack_330_2 : byte [generated]
        stack_304_0 : byte [generated]
        var_0_7F : int
        var_2_93 : byte[]
        expr_97 : int [generated]
        var_3_350 : byte[]
        var_5_351 : int
        expr_C7 : int [generated]
        var_3_3A6 : byte[]
        var_5_3A7 : int
        expr_3B8 : byte [generated]
        var_3_101 : String
        stack_2C9_0 : String[] [generated]
        expr_113 : String[] [generated]
        
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
            var_0_90 = and:int(ldc:int(609629967), ldc:int(-1185433185))
            expr_68 = stack_93_0 = stack_95_0 = stack_C5_0 = stack_C7_0 = stack_F5_0 = stack_362_0 = stack_3B8_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("2f/+AfbxJFglCQkD3Kjb9/f/rlDuuQr2UxjbUP8M1u1LDRTMJgD/uu07+M74N/nsBFIGAA4BJdrq//wr5wb8BQzeDA4oAAAA7/AAAfH+EQLm+xPX/QLzAAD37fsIDvwzJxgF9v364w3+/OsLDN4MDyXz8Q8N7+oH/xPpsgke/+T7XwHsBfn83PQG9CEOGQr+9//7/PADEub7D7YABAMC9lrzCvsCBdv+AQjo4wwfEBQzMio="))
            expr_6E = arraylength:int(expr_68:byte[])
            
            if (cmpne:boolean(expr_6E:int, ldc:int(0))) {
                var_4_2D0 = expr_6E:int
                var_3_2D5 = newarray:byte[](byte.class, expr_6E:int)
                var_5_2D6 = expr_6E:int
                
                loop {
                    var_0_301 = and:int(var_0_90:int, ldc:int(2013148303))
                    var_5_2D6 = add:int(var_5_2D6:int, ldc:int(-1))
                    expr_2E7 = stack_330_2 = loadelement(expr_68, var_5_2D6)
                    
                    if (cmplt:boolean(add:int(add:int(var_5_2D6:int, ldc:int(6)), neg:int(var_4_2D0:int)), ldc:int(0))) {
                        stack_330_2 = stack_304_0 = add:byte(expr_2E7:byte, loadelement:byte(var_3_2D5:byte[], add:int(var_5_2D6:int, ldc:int(6))))
                        goto(Label_0788)
                    }
                    
                    Label_0756:
                    
                    if (cmpne:boolean(and:int(var_0_301:int, ldc:int(131072)), ldc:int(0))) {
                        var_0_301 = and:int(var_0_301:int, ldc:int(-748799734))
                        stack_330_2 = stack_304_0 = add:byte(expr_2E7:byte, ldc:byte(6))
                    }
                    
                    Label_0788:
                    
                    if (cmpne:boolean(and:int(var_0_301:int, ldc:int(2048)), ldc:int(0))) {
                        var_0_301 = and:int(var_0_301:int, ldc:int(1375995074))
                        goto(Label_0756)
                    }
                    
                    var_0_90 = and:int(var_0_301:int, ldc:int(853523439))
                    storeelement:byte(var_3_2D5:byte[], var_5_2D6:int, stack_330_2:byte)
                    
                    if (cmpne:boolean(var_5_2D6:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_95_0 = stack_93_0 = stack_C5_0 = stack_C7_0 = stack_F5_0 = stack_362_0 = stack_3B8_0 = var_3_2D5:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_90:int, ldc:int(4096)), ldc:int(0))) {
                    var_0_7F = and:int(var_0_90:int, ldc:int(700988221))
                    goto(Label_0204)
                }
                
                if (cmpne:boolean(and:int(var_0_90:int, ldc:int(2)), ldc:int(0))) {
                    var_0_90 = and:int(var_0_90:int, ldc:int(-1092698438))
                    var_2_93 = stack_93_0:byte[]
                    expr_97 = add:int(arraylength:int(stack_95_0:byte[]), ldc:int(-1))
                    
                    if (cmpne:boolean(expr_97:int, ldc:int(0))) {
                        var_3_350 = newarray:byte[](byte.class, expr_97:int)
                        var_5_351 = expr_97:int
                        
                        loop {
                            var_0_90 = and:int(var_0_90:int, ldc:int(2078194542))
                            var_5_351 = add:int(var_5_351:int, ldc:int(-1))
                            storeelement:byte(var_3_350:byte[], var_5_351:int, add:int(shl:int(loadelement:byte(stack_362_0:byte[], var_5_351:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_93:byte[], add:int(var_5_351:int, and:int(ldc:int(577), ldc:int(23553)))), ldc:int(4)), xor:int(ldc:int(-24558), ldc:int(-24547)))))
                            
                            if (cmpne:boolean(var_5_351:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_95_0 = stack_93_0 = stack_C5_0 = stack_C7_0 = stack_F5_0 = stack_362_0 = stack_3B8_0 = var_3_350:byte[]
                    }
                }
                
                Label_0156:
                
                if (cmpeq:boolean(and:int(var_0_90:int, ldc:int(4096)), ldc:int(0))) {
                    var_0_7F = and:int(var_0_90:int, ldc:int(1058704844))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_90:int, ldc:int(131072)), ldc:int(0))) {
                        var_0_90 = and:int(var_0_90:int, ldc:int(-69969309))
                        loopcontinue()
                    }
                    
                    var_0_7F = and:int(var_0_90:int, ldc:int(-1786808694))
                    expr_C7 = arraylength:int(stack_C7_0:byte[])
                    
                    if (cmpne:boolean(expr_C7:int, ldc:int(0))) {
                        var_3_3A6 = newarray:byte[](byte.class, expr_C7:int)
                        var_5_3A7 = expr_C7:int
                        
                        loop {
                            var_0_7F = and:int(var_0_7F:int, ldc:int(165656683))
                            var_5_3A7 = add:int(var_5_3A7:int, ldc:int(-1))
                            expr_3B8 = loadelement:byte(stack_3B8_0:byte[], var_5_3A7:int)
                            storeelement:byte(var_3_3A6:byte[], var_5_3A7:int, add:int(xor:int(or:int(and:int(shl:int(expr_3B8:byte, and:int(ldc:int(18437), ldc:int(8260))), ldc:int(-16)), and:int(shr:int(expr_3B8:byte[expected:int], and:int(ldc:int(4444), ldc:int(25092))), ldc:int(15))), ldc:int(75)), ldc:int(7)))
                            
                            if (cmpne:boolean(var_5_3A7:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_95_0 = stack_93_0 = stack_C5_0 = stack_C7_0 = stack_F5_0 = stack_362_0 = stack_3B8_0 = var_3_3A6:byte[]
                    }
                }
                
                Label_0204:
                
                if (cmpeq:boolean(and:int(var_0_7F:int, ldc:int(131072)), ldc:int(0))) {
                    var_0_90 = and:int(var_0_7F:int, ldc:int(1618801737))
                    goto(Label_0156)
                }
                
                if (cmpeq:boolean(and:int(var_0_7F:int, ldc:int(2048)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_90 = and:int(var_0_7F:int, ldc:int(-8200844))
            }
            
            var_3_101 = initobject:String(String::<init>, stack_F5_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_2C9_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(26637), ldc:int(26653)))
            expr_113 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(784), ldc:int(24664)))
            storeelement:String(expr_113:String[], xor:int(ldc:int(571), ldc:int(561)), invokevirtual:String[expected:String](String::substring, var_3_101:String, and:int(ldc:int(-23441), ldc:int(23440)), xor:int(ldc:int(16389), ldc:int(16387))))
            storeelement:String(expr_113:String[], and:int(ldc:int(4098), ldc:int(2322)), invokevirtual:String[expected:String](String::substring, var_3_101:String, and:int(ldc:int(6), ldc:int(7223)), and:int(ldc:int(17631), ldc:int(4634))))
            storeelement:String(expr_113:String[], and:int(ldc:int(4460), ldc:int(24718)), invokevirtual:String[expected:String](String::substring, var_3_101:String, and:int(ldc:int(8794), ldc:int(411)), xor:int(ldc:int(9380), ldc:int(9362))))
            storeelement:String(expr_113:String[], and:int(ldc:int(-7985), ldc:int(6960)), invokevirtual:String[expected:String](String::substring, var_3_101:String, xor:int(ldc:int(8217), ldc:int(8239)), and:int(ldc:int(4155), ldc:int(24703))))
            storeelement:String(expr_113:String[], xor:int(ldc:int(1), ldc:int(4)), invokevirtual:String[expected:String](String::substring, var_3_101:String, xor:int(ldc:int(306), ldc:int(265)), xor:int(ldc:int(8754), ldc:int(8827))))
            storeelement:String(expr_113:String[], and:int(ldc:int(8262), ldc:int(19510)), invokevirtual:String[expected:String](String::substring, var_3_101:String, and:int(ldc:int(8671), ldc:int(5737)), and:int(ldc:int(207), ldc:int(17519))))
            storeelement:String(expr_113:String[], and:int(ldc:int(19523), ldc:int(4123)), invokevirtual:String[expected:String](String::substring, var_3_101:String, xor:int(ldc:int(24773), ldc:int(24714)), and:int(ldc:int(119), ldc:int(8293))))
            storeelement:String(expr_113:String[], xor:int(ldc:int(4741), ldc:int(4737)), invokevirtual:String[expected:String](String::substring, var_3_101:String, and:int(ldc:int(1383), ldc:int(8421)), xor:int(ldc:int(9289), ldc:int(9276))))
            storeelement:String(expr_113:String[], xor:int(ldc:int(9), ldc:int(8)), invokevirtual:String[expected:String](String::substring, var_3_101:String, and:int(ldc:int(17525), ldc:int(2685)), xor:int(ldc:int(11378), ldc:int(11276))))
            storeelement:String(expr_113:String[], and:int(ldc:int(8271), ldc:int(16955)), invokevirtual:String[expected:String](String::substring, var_3_101:String, xor:int(ldc:int(17533), ldc:int(17411)), xor:int(ldc:int(12), ldc:int(132))))
            storeelement:String(expr_113:String[], xor:int(ldc:int(2080), ldc:int(2088)), invokevirtual:String[expected:String](String::substring, var_3_101:String, xor:int(ldc:int(2222), ldc:int(2086)), and:int(ldc:int(221), ldc:int(2477))))
            storeelement:String(expr_113:String[], xor:int(ldc:int(2056), ldc:int(2049)), invokevirtual:String[expected:String](String::substring, var_3_101:String, xor:int(ldc:int(-20400), ldc:int(-20259)), and:int(ldc:int(21155), ldc:int(1463))))
            storeelement:String(expr_113:String[], xor:int(ldc:int(-31595), ldc:int(-31598)), invokevirtual:String[expected:String](String::substring, var_3_101:String, xor:int(ldc:int(2063), ldc:int(2220)), xor:int(ldc:int(701), ldc:int(530))))
            storeelement:String(expr_113:String[], xor:int(ldc:int(513), ldc:int(524)), invokevirtual:String[expected:String](String::substring, var_3_101:String, xor:int(ldc:int(470), ldc:int(377)), and:int(ldc:int(4862), ldc:int(24752))))
            storeelement:String(expr_113:String[], xor:int(ldc:int(22537), ldc:int(22535)), invokevirtual:String[expected:String](String::substring, var_3_101:String, xor:int(ldc:int(682), ldc:int(538)), xor:int(ldc:int(17301), ldc:int(17188))))
            storeelement:String(expr_113:String[], and:int(ldc:int(17519), ldc:int(12815)), invokevirtual:String[expected:String](String::substring, var_3_101:String, xor:int(ldc:int(1119), ldc:int(1262)), xor:int(ldc:int(4121), ldc:int(4267))))
            putstatic:String[](\u7bad\u8753\u8350\u52d3\uf995\u7006::\uc910\u52d3\uae5d\uc229\u120d\u4975, expr_113:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ua6bd\u76bc\u6c52\ufcaf\u3e2a\u7ce1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_673 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_67E : int
        
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
        var_3_673 = and:int(ldc:int(-1167996395), ldc:int(-98518889))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7bad\u8753\u8350\u52d3\uf995\u7006[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_673 = and:int(var_3_673:int, ldc:int(-1091384117))
        }
        else {
            var_3_673 = and:int(var_3_673:int, ldc:int(-3493102))
            var_5_8A = and:int(ldc:int(-11890), ldc:int(11329))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-13370), ldc:int(12344)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_673:int, ldc:int(-1281642794))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, and:int(ldc:int(547), ldc:int(2113)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(-32760), ldc:int(-32759)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_673 = and:int(var_3_DA:int, ldc:int(-1231883149))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(1281), ldc:int(53)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(64)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(1626201003))
                        goto(Label_1529)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1219)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-1794479014))
                        goto(Label_0943)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(2)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(288499804))
                        goto(Label_0828)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(1856644172))
                        goto(Label_0706)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-840558508))
                    }
                    else {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-10029611))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0591)
                            }
                            
                            goto(Label_0828)
                        }
                    }
                    
                    Label_0418:
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(16)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(1438557643))
                        goto(Label_1529)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1382)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(27967686))
                        goto(Label_1219)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(1909534346))
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-1665493928))
                        goto(Label_0943)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(2056889897))
                        goto(Label_0828)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0706)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(32)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(-232422892))
                            var_11_EB = and:int(ldc:int(12840), ldc:int(-12841))
                            goto(Label_1518)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0591:
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(32)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-214959245))
                        goto(Label_1529)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-681311103))
                        goto(Label_1382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1219)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0943)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0828)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(1441267466))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_673 = and:int(var_3_673:int, ldc:int(-1210351566))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0828)
                        }
                    }
                    
                    Label_0706:
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1529)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1382)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1219)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(1374820491))
                        goto(Label_0943)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(478687681))
                            goto(Label_0591)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(2078838690))
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_673 = and:int(var_3_673:int, ldc:int(-1097928841))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0828:
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1529)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-490061273))
                        goto(Label_1382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1219)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(2)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(1773212384))
                            goto(Label_0706)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0591)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(-1381769648))
                            loopcontinue()
                        }
                        
                        var_3_673 = and:int(var_3_673:int, ldc:int(-210766889))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = xor:int(ldc:int(-31216), ldc:int(-31215))
                                goto(Label_1085)
                            }
                        }
                    }
                    
                    Label_0943:
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1529)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(16)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-445393590))
                        goto(Label_1382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1219)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(562582247))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0828)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0706)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0591)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_673 = and:int(var_3_673:int, ldc:int(-1303255682))
                        var_11_EB = and:int(ldc:int(178), ldc:int(-179))
                    }
                    
                    Label_1085:
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(1578769637))
                        goto(Label_1529)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(1367677611))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(1848061813))
                            goto(Label_0943)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(256)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(-746644448))
                            goto(Label_0828)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0706)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0591)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(64)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(666561322))
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_673 = and:int(var_3_673:int, ldc:int(-149816195))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1382)
                            }
                        }
                    }
                    
                    Label_1219:
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1529)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(32)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-41323949))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(-834030141))
                            goto(Label_1085)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(-1461815295))
                            goto(Label_0943)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0828)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(-1962452181))
                            goto(Label_0706)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(1454130779))
                            goto(Label_0591)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(511019811))
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(256)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(340493162))
                            loopcontinue()
                        }
                        
                        var_3_673 = and:int(var_3_673:int, ldc:int(-1217472238))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                        goto(Label_1518)
                    }
                    
                    Label_1382:
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-1110694786))
                        goto(Label_1529)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-1419889164))
                        goto(Label_1219)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0943)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0828)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0706)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(71431614))
                        goto(Label_0418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(113067339))
                        loopcontinue()
                    }
                    
                    var_3_673 = and:int(var_3_673:int, ldc:int(-218512462))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1518:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67E = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1529:
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-1685517479))
                        goto(Label_1382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-365785639))
                        goto(Label_1219)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0943)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(1992356130))
                        goto(Label_0828)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0706)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(66581157))
                        goto(Label_0418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-1227031212))
                        var_17_67E = add:int(var_16_119:int, and:int(ldc:int(5645), ldc:int(19)))
                        looporswitchbreak()
                    }
                    
                    var_3_673 = and:int(var_3_673:int, ldc:int(-1046800753))
                }
                
                var_3_673 = and:int(var_3_673:int, ldc:int(-157056170))
                
                if (cmple:boolean(var_5_8A = var_17_67E:int, sub:int(var_6_91:int, xor:int(ldc:int(7232), ldc:int(7233))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(262144)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
