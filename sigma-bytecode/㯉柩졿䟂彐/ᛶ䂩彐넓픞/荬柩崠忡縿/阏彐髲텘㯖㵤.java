public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u960f\u5f50\u9af2\ud158\u3bd6\u3d64 {
    public void \u960f\u5f50\u9af2\ud158\u3bd6\u3d64(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u960f\u5f50\u9af2\ud158\u3bd6\u3d64, p0:Schema, p1:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.datafixers.TypeRewriteRule makeRule() {
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
            return:TypeRewriteRule(invokevirtual:TypeRewriteRule(\u960f\u5f50\u9af2\ud158\u3bd6\u3d64::writeFixAndRead, this:\u960f\u5f50\u9af2\ud158\u3bd6\u3d64, loadelement:String(getstatic:String[](\u960f\u5f50\u9af2\ud158\u3bd6\u3d64::\u6b0d\u8640\uafe7\u3711\u47c2\u8bb0), and:int(ldc:int(9474), ldc:int(-9475))), invokevirtual:Type(Schema::getType, invokevirtual:Schema(\u960f\u5f50\u9af2\ud158\u3bd6\u3d64::getInputSchema, this:\u960f\u5f50\u9af2\ud158\u3bd6\u3d64), getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4f52\u5140\u71ae\ud158\u385b\ua61f)), invokevirtual:Type(Schema::getType, invokevirtual:Schema(\u960f\u5f50\u9af2\ud158\u3bd6\u3d64::getOutputSchema, this:\u960f\u5f50\u9af2\ud158\u3bd6\u3d64), getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4f52\u5140\u71ae\ud158\u385b\ua61f)), invokedynamic:Function<Dynamic, Dynamic>(apply:(L\u3bc9\u67e9\uc87f\u47c2\u5f50/\u16f6\u40a9\u5f50\ub113\ud51e/\u836c\u67e9\u5d20\u5fe1\u7e3f/\u960f\u5f50\u9af2\ud158\u3bd6\u3d64;)Ljava/util/function/Function;, this:\u960f\u5f50\u9af2\ud158\u3bd6\u3d64)))
        }
        
        goto(Label_0006)
    }
    
    private com.mojang.serialization.Dynamic<T> \u8d98\u3d64\u0c95\ud51e\u8df4\u836c(com.mojang.serialization.Dynamic<T> p0) {
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
            return:Dynamic<T>(invokevirtual:Dynamic(Dynamic::update, p0:Dynamic<T>, loadelement:String(getstatic:String[](\u960f\u5f50\u9af2\ud158\u3bd6\u3d64::\u6b0d\u8640\uafe7\u3711\u47c2\u8bb0), xor:int(ldc:int(6273), ldc:int(6272))), invokedynamic:Function<Dynamic, Dynamic>(apply:()Ljava/util/function/Function;)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.serialization.Dynamic<T> \u6c52\ub171\u6435\uf94d\u8d98\u3d4b(com.mojang.serialization.Dynamic<T> p0) {
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
            return:Dynamic<T>(checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokevirtual:Dynamic(Optional<Dynamic>::orElse, invokevirtual:Optional(DataResult::result, invokevirtual:DataResult(DataResult::map, invokevirtual:DataResult(DataResult::map, invokevirtual:DataResult(Dynamic::asStreamOpt, p0:Dynamic), invokedynamic:Function<Stream, Stream>(apply:()Ljava/util/function/Function;)), invokedynamic:Function<Stream, Dynamic>(apply:(Lcom/mojang/serialization/Dynamic;)Ljava/util/function/Function;, p0:DynamicLike))), p0:Dynamic)))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.stream.Stream<? extends com.mojang.serialization.Dynamic<?>> \u6c52\ub171\u6435\uf94d\u8d98\u3d4b(java.util.stream.Stream<? extends com.mojang.serialization.Dynamic<?>> p0) {
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
    
    private static com.mojang.serialization.Dynamic<T> \u183a\u946b\ub70c\u2dcc\ud51e\u183a(com.mojang.serialization.Dynamic<T> p0) {
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
            return:Dynamic<T>(invokestatic:Dynamic(\u960f\u5f50\u9af2\ud158\u3bd6\u3d64::\uae87\ud158\u69d9\ubefe\u64f2\u4e72, invokestatic:Dynamic(\u960f\u5f50\u9af2\ud158\u3bd6\u3d64::\uae87\ud158\u69d9\ubefe\u64f2\u4e72, p0:Dynamic, loadelement:String(getstatic:String[](\u960f\u5f50\u9af2\ud158\u3bd6\u3d64::\u6b0d\u8640\uafe7\u3711\u47c2\u8bb0), xor:int(ldc:int(16903), ldc:int(16901)))), loadelement:String(getstatic:String[](\u960f\u5f50\u9af2\ud158\u3bd6\u3d64::\u6b0d\u8640\uafe7\u3711\u47c2\u8bb0), xor:int(ldc:int(3091), ldc:int(3088)))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.serialization.Dynamic<T> \u67e9\u839e\u3e75\u67e9\ub32d\uc2bd(com.mojang.serialization.Dynamic<T> p0) {
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
            return:Dynamic<T>(invokestatic:Dynamic(\u960f\u5f50\u9af2\ud158\u3bd6\u3d64::\uae87\ud158\u69d9\ubefe\u64f2\u4e72, invokestatic:Dynamic(\u960f\u5f50\u9af2\ud158\u3bd6\u3d64::\uae87\ud158\u69d9\ubefe\u64f2\u4e72, invokestatic:Dynamic(\u960f\u5f50\u9af2\ud158\u3bd6\u3d64::\uae87\ud158\u69d9\ubefe\u64f2\u4e72, invokestatic:Dynamic(\u960f\u5f50\u9af2\ud158\u3bd6\u3d64::\uae87\ud158\u69d9\ubefe\u64f2\u4e72, p0:Dynamic, loadelement:String(getstatic:String[](\u960f\u5f50\u9af2\ud158\u3bd6\u3d64::\u6b0d\u8640\uafe7\u3711\u47c2\u8bb0), and:int(ldc:int(1063), ldc:int(13186)))), loadelement:String(getstatic:String[](\u960f\u5f50\u9af2\ud158\u3bd6\u3d64::\u6b0d\u8640\uafe7\u3711\u47c2\u8bb0), and:int(ldc:int(9223), ldc:int(20595)))), loadelement:String(getstatic:String[](\u960f\u5f50\u9af2\ud158\u3bd6\u3d64::\u6b0d\u8640\uafe7\u3711\u47c2\u8bb0), xor:int(ldc:int(4114), ldc:int(4118)))), loadelement:String(getstatic:String[](\u960f\u5f50\u9af2\ud158\u3bd6\u3d64::\u6b0d\u8640\uafe7\u3711\u47c2\u8bb0), xor:int(ldc:int(8322), ldc:int(8327)))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.serialization.Dynamic<T> \uae87\ud158\u69d9\ubefe\u64f2\u4e72(com.mojang.serialization.Dynamic<T> p0, java.lang.String p1) {
        var_2_5F : int
        stack_A2_0 : Dynamic [generated]
        
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
            var_2_5F = and:int(ldc:int(-2058729173), ldc:int(-718280086))
            
            if (logicalnot:boolean(invokevirtual:boolean(Optional::isPresent, invokevirtual:Optional(DataResult::result, invokevirtual:DataResult(OptionalDynamic::asNumber, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic<T>, p1:String)))))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-279262789))
                stack_A2_0 = p0:Dynamic<T>
            }
            else {
                stack_A2_0 = invokevirtual:Dynamic(Dynamic::set, p0:Dynamic<T>, p1:String, invokestatic:Dynamic<?>(\ucef1\uafe7\u67e9\u5140\u4daf\u446c::\u3c25\ub8be\u8aa5\u836c\u12cb\u0a06, shl:int(invokevirtual:int(OptionalDynamic::asInt, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic<T>, p1:String), and:int(ldc:int(-12753), ldc:int(12752))), xor:int(ldc:int(35), ldc:int(39)))))
            }
            
            return:Dynamic<T>(stack_A2_0:Dynamic)
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.serialization.Dynamic lambda$\uc4d2\u72f1\u494c\u52d3\u2dcc\u516c$0(com.mojang.serialization.Dynamic p0) {
        var_1_5F : int
        var_3_7D : String
        var_1_C9 : int
        stack_E7_0 : Dynamic [generated]
        
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
        var_1_5F = and:int(ldc:int(-1917331674), ldc:int(-944832662))
        var_3_7D = invokevirtual:String(OptionalDynamic::asString, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic, loadelement:String(getstatic:String[](\u960f\u5f50\u9af2\ud158\u3bd6\u3d64::\u6b0d\u8640\uafe7\u3711\u47c2\u8bb0), xor:int(ldc:int(16484), ldc:int(16482)))), loadelement:String(getstatic:String[](\u960f\u5f50\u9af2\ud158\u3bd6\u3d64::\u6b0d\u8640\uafe7\u3711\u47c2\u8bb0), and:int(ldc:int(9231), ldc:int(16407))))
        
        if (logicalnot:boolean(invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\u960f\u5f50\u9af2\ud158\u3bd6\u3d64::\u6b0d\u8640\uafe7\u3711\u47c2\u8bb0), xor:int(ldc:int(16682), ldc:int(16674))), var_3_7D:String[expected:Object]))) {
            loop {
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(131072)), ldc:int(0))) {
                    var_1_C9 = and:int(var_1_5F:int, ldc:int(386711442))
                }
                else {
                    var_1_C9 = and:int(var_1_5F:int, ldc:int(-1880623569))
                    
                    if (invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\u960f\u5f50\u9af2\ud158\u3bd6\u3d64::\u6b0d\u8640\uafe7\u3711\u47c2\u8bb0), xor:int(ldc:int(132), ldc:int(141))), var_3_7D:String[expected:Object])) {
                        stack_E7_0 = invokestatic:Dynamic(\u960f\u5f50\u9af2\ud158\u3bd6\u3d64::\u67e9\u839e\u3e75\u67e9\ub32d\uc2bd, p0:Dynamic)
                        looporswitchbreak()
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_C9:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_C9 = and:int(var_1_C9:int, ldc:int(-5245081))
                    stack_E7_0 = p0:Dynamic
                    looporswitchbreak()
                }
                
                var_1_5F = and:int(var_1_C9:int, ldc:int(2011091143))
            }
            
            return:Dynamic(stack_E7_0:Dynamic)
        }
        
        return:Dynamic(invokestatic:Dynamic(\u960f\u5f50\u9af2\ud158\u3bd6\u3d64::\u183a\u946b\ub70c\u2dcc\ud51e\u183a, p0:Dynamic))
    }
    
    static {
        var_0_39E : int
        expr_6B : int [generated]
        stack_AB_0 : byte[] [generated]
        stack_AD_0 : byte[] [generated]
        stack_E4_0 : byte[] [generated]
        stack_E6_0 : byte[] [generated]
        stack_125_0 : byte[] [generated]
        stack_127_0 : byte[] [generated]
        stack_15A_0 : byte[] [generated]
        stack_15C_0 : byte[] [generated]
        stack_19A_0 : byte[] [generated]
        stack_2FA_0 : byte[] [generated]
        stack_34B_0 : byte[] [generated]
        stack_3C2_0 : byte[] [generated]
        stack_410_0 : byte[] [generated]
        stack_48D_0 : byte[] [generated]
        var_4_2D3 : int
        var_3_2D8 : byte[]
        var_5_2D9 : int
        expr_2FA : byte [generated]
        var_0_429 : int
        expr_410 : byte [generated]
        stack_458_2 : byte [generated]
        stack_42C_0 : byte [generated]
        var_2_AB : byte[]
        expr_AF : int [generated]
        var_3_339 : byte[]
        var_5_33A : int
        expr_E6 : int [generated]
        expr_127 : int [generated]
        expr_15C : int [generated]
        var_3_47B : byte[]
        var_5_47C : int
        var_3_1A6 : String
        stack_2CC_0 : String[] [generated]
        expr_1B8 : String[] [generated]
        
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
        var_0_39E = and:int(ldc:int(1776974107), ldc:int(-380832879))
        expr_6B = arraylength:int(stack_AB_0 = stack_AD_0 = stack_E4_0 = stack_E6_0 = stack_125_0 = stack_127_0 = stack_15A_0 = stack_15C_0 = stack_19A_0 = stack_2FA_0 = stack_34B_0 = stack_3C2_0 = stack_410_0 = stack_48D_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("oF+oX6h+dm5eF4hfKCDX4NdAACew12/oDwewmOHXZw9H4BdwToExqKhfTjfY/9DoAA==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_2D3 = expr_6B:int
        var_3_2D8 = newarray:byte[](byte.class, expr_6B:int)
        var_5_2D9 = expr_6B:int
        Label_0731:
        
        while (cmpne:boolean(and:int(var_0_39E:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_39E:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0914)
            }
            
            var_0_39E = and:int(var_0_39E:int, ldc:int(1273424341))
            var_5_2D9 = add:int(var_5_2D9:int, ldc:int(-1))
            expr_2FA = loadelement:byte(stack_2FA_0:byte[], var_5_2D9:int)
            storeelement:byte(var_3_2D8:byte[], var_5_2D9:int, or:int(and:int(shl:int(expr_2FA:byte, xor:int(ldc:int(4177), ldc:int(4181))), ldc:int(-16)), and:int(shr:int(expr_2FA:byte[expected:int], xor:int(ldc:int(20992), ldc:int(20996))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_2D9:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AD_0 = stack_AB_0 = stack_E4_0 = stack_E6_0 = stack_125_0 = stack_127_0 = stack_15A_0 = stack_15C_0 = stack_19A_0 = stack_2FA_0 = stack_34B_0 = stack_3C2_0 = stack_410_0 = stack_48D_0 = var_3_2D8:byte[]
            goto(Label_0112)
        }
        
        goto(Label_1009)
        Label_0914:
        
        while (cmpeq:boolean(and:int(var_0_39E:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_39E:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_39E = and:int(var_0_39E:int, ldc:int(-816933389))
                goto(Label_0731)
            }
            
            var_0_39E = and:int(var_0_39E:int, ldc:int(1564735731))
            var_5_2D9 = add:int(var_5_2D9:int, ldc:int(-1))
            storeelement:byte(var_3_2D8:byte[], var_5_2D9:int, xor:byte(loadelement:byte(stack_3C2_0:byte[], var_5_2D9:int), ldc:byte(21)))
            
            if (cmpne:boolean(var_5_2D9:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AD_0 = stack_AB_0 = stack_E4_0 = stack_E6_0 = stack_125_0 = stack_127_0 = stack_15A_0 = stack_15C_0 = stack_19A_0 = stack_2FA_0 = stack_34B_0 = stack_3C2_0 = stack_410_0 = stack_48D_0 = var_3_2D8:byte[]
            goto(Label_0235)
        }
        
        var_0_39E = and:int(var_0_39E:int, ldc:int(-1277270090))
        Label_1009:
        
        while (cmpne:boolean(and:int(var_0_39E:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_39E:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0731)
            }
            
            var_0_429 = and:int(var_0_39E:int, ldc:int(1909450293))
            var_5_2D9 = add:int(var_5_2D9:int, ldc:int(-1))
            expr_410 = stack_458_2 = loadelement(stack_410_0, var_5_2D9)
            
            if (cmplt:boolean(add:int(add:int(var_5_2D9:int, ldc:int(4)), neg:int(var_4_2D3:int)), ldc:int(0))) {
                stack_458_2 = stack_42C_0 = add:byte(expr_410:byte, loadelement:byte(var_3_2D8:byte[], add:int(var_5_2D9:int, ldc:int(4))))
                goto(Label_1084)
            }
            
            Label_1053:
            
            if (cmpne:boolean(and:int(var_0_429:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_429 = and:int(var_0_429:int, ldc:int(-245006889))
                stack_458_2 = stack_42C_0 = add:byte(expr_410:byte, ldc:byte(4))
            }
            
            Label_1084:
            
            if (cmpne:boolean(and:int(var_0_429:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_429 = and:int(var_0_429:int, ldc:int(163029637))
                goto(Label_1053)
            }
            
            var_0_39E = and:int(var_0_429:int, ldc:int(2103800221))
            storeelement:byte(var_3_2D8:byte[], var_5_2D9:int, stack_458_2:byte)
            
            if (cmpne:boolean(var_5_2D9:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AD_0 = stack_AB_0 = stack_E4_0 = stack_E6_0 = stack_125_0 = stack_127_0 = stack_15A_0 = stack_15C_0 = stack_19A_0 = stack_2FA_0 = stack_34B_0 = stack_3C2_0 = stack_410_0 = stack_48D_0 = var_3_2D8:byte[]
            goto(Label_0300)
        }
        
        goto(Label_0914)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_39E:int, ldc:int(4)), ldc:int(0))) {
            var_0_39E = and:int(var_0_39E:int, ldc:int(-1001960515))
            goto(Label_0353)
        }
        
        if (cmpeq:boolean(and:int(var_0_39E:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0300)
        }
        
        if (cmpne:boolean(and:int(var_0_39E:int, ldc:int(1024)), ldc:int(0))) {
            var_0_39E = and:int(var_0_39E:int, ldc:int(-258619772))
            goto(Label_0235)
        }
        
        if (cmpeq:boolean(and:int(var_0_39E:int, ldc:int(8192)), ldc:int(0))) {
            var_0_39E = and:int(var_0_39E:int, ldc:int(1950541960))
        }
        else {
            var_0_39E = and:int(var_0_39E:int, ldc:int(1499004383))
            var_2_AB = stack_AB_0:byte[]
            expr_AF = add:int(arraylength:int(stack_AD_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_AF:int, ldc:int(0))) {
                var_3_339 = newarray:byte[](byte.class, expr_AF:int)
                var_5_33A = expr_AF:int
                
                loop {
                    var_0_39E = and:int(var_0_39E:int, ldc:int(-749280589))
                    var_5_33A = add:int(var_5_33A:int, ldc:int(-1))
                    storeelement:byte(var_3_339:byte[], var_5_33A:int, add:int(shl:int(loadelement:byte(stack_34B_0:byte[], var_5_33A:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_AB:byte[], add:int(var_5_33A:int, and:int(ldc:int(1063), ldc:int(4801)))), ldc:int(7)), and:int(ldc:int(785), ldc:int(17409)))))
                    
                    if (cmpne:boolean(var_5_33A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AD_0 = stack_AB_0 = stack_E4_0 = stack_E6_0 = stack_125_0 = stack_127_0 = stack_15A_0 = stack_15C_0 = stack_19A_0 = stack_2FA_0 = stack_34B_0 = stack_3C2_0 = stack_410_0 = stack_48D_0 = var_3_339:byte[]
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_0_39E:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0353)
        }
        
        if (cmpeq:boolean(and:int(var_0_39E:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_39E = and:int(var_0_39E:int, ldc:int(1985621882))
            goto(Label_0300)
        }
        
        if (cmpeq:boolean(and:int(var_0_39E:int, ldc:int(33554432)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_39E:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_39E = and:int(var_0_39E:int, ldc:int(1900474843))
            expr_E6 = arraylength:int(stack_E6_0:byte[])
            
            if (cmpne:boolean(expr_E6:int, ldc:int(0))) {
                var_4_2D3 = expr_E6:int
                var_3_2D8 = newarray:byte[](byte.class, expr_E6:int)
                var_5_2D9 = expr_E6:int
                goto(Label_0914)
            }
        }
        
        Label_0235:
        
        if (cmpeq:boolean(and:int(var_0_39E:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0353)
        }
        
        if (cmpeq:boolean(and:int(var_0_39E:int, ldc:int(16)), ldc:int(0))) {
            var_0_39E = and:int(var_0_39E:int, ldc:int(72902658))
        }
        else {
            if (cmpne:boolean(and:int(var_0_39E:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_39E = and:int(var_0_39E:int, ldc:int(907790710))
                goto(Label_0180)
            }
            
            if (cmpeq:boolean(and:int(var_0_39E:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_39E = and:int(var_0_39E:int, ldc:int(1803151419))
            expr_127 = arraylength:int(stack_127_0:byte[])
            
            if (cmpne:boolean(expr_127:int, ldc:int(0))) {
                var_4_2D3 = expr_127:int
                var_3_2D8 = newarray:byte[](byte.class, expr_127:int)
                var_5_2D9 = expr_127:int
                goto(Label_1009)
            }
        }
        
        Label_0300:
        
        if (cmpne:boolean(and:int(var_0_39E:int, ldc:int(1024)), ldc:int(0))) {
            var_0_39E = and:int(var_0_39E:int, ldc:int(1255683313))
        }
        else {
            if (cmpne:boolean(and:int(var_0_39E:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0235)
            }
            
            if (cmpne:boolean(and:int(var_0_39E:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0180)
            }
            
            if (cmpeq:boolean(and:int(var_0_39E:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_39E = and:int(var_0_39E:int, ldc:int(-138022125))
            expr_15C = arraylength:int(stack_15C_0:byte[])
            
            if (cmpne:boolean(expr_15C:int, ldc:int(0))) {
                var_3_47B = newarray:byte[](byte.class, expr_15C:int)
                var_5_47C = expr_15C:int
                
                loop {
                    var_0_39E = and:int(var_0_39E:int, ldc:int(-134549059))
                    var_5_47C = add:int(var_5_47C:int, ldc:int(-1))
                    storeelement:byte(var_3_47B:byte[], var_5_47C:int, add:byte(loadelement:byte(stack_48D_0:byte[], var_5_47C:int), ldc:byte(87)))
                    
                    if (cmpne:boolean(var_5_47C:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AD_0 = stack_AB_0 = stack_E4_0 = stack_E6_0 = stack_125_0 = stack_127_0 = stack_15A_0 = stack_15C_0 = stack_19A_0 = stack_2FA_0 = stack_34B_0 = stack_3C2_0 = stack_410_0 = stack_48D_0 = var_3_47B:byte[]
            }
        }
        
        Label_0353:
        
        if (cmpeq:boolean(and:int(var_0_39E:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0300)
        }
        
        if (cmpne:boolean(and:int(var_0_39E:int, ldc:int(64)), ldc:int(0))) {
            var_0_39E = and:int(var_0_39E:int, ldc:int(-1633704279))
            goto(Label_0235)
        }
        
        if (cmpeq:boolean(and:int(var_0_39E:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0180)
        }
        
        if (cmpne:boolean(and:int(var_0_39E:int, ldc:int(128)), ldc:int(0))) {
            var_0_39E = and:int(var_0_39E:int, ldc:int(188635727))
            goto(Label_0112)
        }
        
        var_3_1A6 = initobject:String(String::<init>, stack_19A_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_2CC_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(5402), ldc:int(2058)))
        expr_1B8 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4310), ldc:int(4316)))
        storeelement:String(expr_1B8:String[], and:int(ldc:int(29767), ldc:int(919)), invokevirtual:String[expected:String](String::substring, var_3_1A6:String, and:int(ldc:int(-29193), ldc:int(29192)), and:int(ldc:int(-2570), ldc:int(2569))))
        storeelement:String(expr_1B8:String[], xor:int(ldc:int(24595), ldc:int(24593)), invokevirtual:String[expected:String](String::substring, var_3_1A6:String, and:int(ldc:int(2323), ldc:int(-3476)), xor:int(ldc:int(49), ldc:int(51))))
        storeelement:String(expr_1B8:String[], and:int(ldc:int(9731), ldc:int(7)), invokevirtual:String[expected:String](String::substring, var_3_1A6:String, and:int(ldc:int(21506), ldc:int(10311)), and:int(ldc:int(108), ldc:int(23))))
        storeelement:String(expr_1B8:String[], xor:int(ldc:int(20483), ldc:int(20487)), invokevirtual:String[expected:String](String::substring, var_3_1A6:String, and:int(ldc:int(5124), ldc:int(10582)), xor:int(ldc:int(514), ldc:int(516))))
        storeelement:String(expr_1B8:String[], and:int(ldc:int(2055), ldc:int(965)), invokevirtual:String[expected:String](String::substring, var_3_1A6:String, and:int(ldc:int(16422), ldc:int(6295)), and:int(ldc:int(16521), ldc:int(12846))))
        storeelement:String(expr_1B8:String[], and:int(ldc:int(20631), ldc:int(11265)), invokevirtual:String[expected:String](String::substring, var_3_1A6:String, xor:int(ldc:int(2177), ldc:int(2185)), xor:int(ldc:int(195), ldc:int(211))))
        storeelement:String(expr_1B8:String[], and:int(ldc:int(-30976), ldc:int(24797)), invokevirtual:String[expected:String](String::substring, var_3_1A6:String, xor:int(ldc:int(12623), ldc:int(12639)), and:int(ldc:int(119), ldc:int(8231))))
        storeelement:String(expr_1B8:String[], and:int(ldc:int(5259), ldc:int(777)), invokevirtual:String[expected:String](String::substring, var_3_1A6:String, and:int(ldc:int(295), ldc:int(17007)), xor:int(ldc:int(8217), ldc:int(8242))))
        storeelement:String(expr_1B8:String[], xor:int(ldc:int(-16378), ldc:int(-16370)), invokevirtual:String[expected:String](String::substring, var_3_1A6:String, and:int(ldc:int(14575), ldc:int(16939)), and:int(ldc:int(24623), ldc:int(6574))))
        storeelement:String(expr_1B8:String[], and:int(ldc:int(2311), ldc:int(16446)), invokevirtual:String[expected:String](String::substring, var_3_1A6:String, and:int(ldc:int(9838), ldc:int(18623)), xor:int(ldc:int(667), ldc:int(683))))
        putstatic:String[](\u960f\u5f50\u9af2\ud158\u3bd6\u3d64::\u6b0d\u8640\uafe7\u3711\u47c2\u8bb0, expr_1B8:String[])
    }
    
    public void \u6c52\ub113\uc31c\ub6ab\u9a18\u9af2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6AA : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6B5 : int
        
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
        var_3_6AA = and:int(ldc:int(1484453830), ldc:int(1584894811))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u960f\u5f50\u9af2\ud158\u3bd6\u3d64[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(2048)), ldc:int(0))) {
            var_3_6AA = and:int(var_3_6AA:int, ldc:int(-51183793))
            var_5_81 = and:int(ldc:int(-3687), ldc:int(3686))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(20580), ldc:int(-32365)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6AA:int, ldc:int(953670592))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(1283), ldc:int(26721)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(17933), ldc:int(12577)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6AA = and:int(var_3_DA:int, ldc:int(-1669603471))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(18689), ldc:int(681)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(392930466))
                        goto(Label_1577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-196532277))
                        goto(Label_1412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-671899428))
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0964)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0690)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(1141088680))
                        goto(Label_0566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(500670420))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0566)
                            }
                            
                            goto(Label_0839)
                        }
                    }
                    
                    Label_0410:
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(1839632601))
                        goto(Label_1412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-474276463))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0964)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0690)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(-355409967))
                            loopcontinue()
                        }
                        
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(1509945152))
                        var_11_EB = and:int(ldc:int(23106), ldc:int(-24147))
                        goto(Label_1566)
                    }
                    
                    Label_0566:
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(2087920646))
                        goto(Label_1412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1133)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(414692638))
                        goto(Label_0964)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-1847855004))
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(-863524274))
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(2054390758))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0839)
                        }
                    }
                    
                    Label_0690:
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-1069700926))
                        goto(Label_1577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(1388554517))
                        goto(Label_1412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(803915232))
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0964)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-1302275304))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(-1171243274))
                            goto(Label_0566)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(-1430783800))
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-596124857))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0839:
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-521755196))
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-331478134))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(-1069489761))
                            goto(Label_0690)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0566)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(1464252128))
                            loopcontinue()
                        }
                        
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(1490537296))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(5201), ldc:int(135))
                                goto(Label_1133)
                            }
                        }
                    }
                    
                    Label_0964:
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(1460987191))
                        goto(Label_1412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-53906691))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0839)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(-1508957510))
                            goto(Label_0690)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(881046769))
                            goto(Label_0566)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(886425677))
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-1084765370))
                        var_11_EB = and:int(ldc:int(-11868), ldc:int(11355))
                    }
                    
                    Label_1133:
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-1599163418))
                        goto(Label_1577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(1958643359))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0964)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(234461708))
                            goto(Label_0839)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0690)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(612400124))
                            goto(Label_0566)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(15914042))
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(-1436017746))
                            loopcontinue()
                        }
                        
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-1107912731))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1412)
                            }
                        }
                    }
                    
                    Label_1276:
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(1587993182))
                        goto(Label_1577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-526963622))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1133)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0964)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0839)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0690)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(-399028939))
                            goto(Label_0566)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(-1788523142))
                            loopcontinue()
                        }
                        
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-598024371))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1566)
                    }
                    
                    Label_1412:
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(1099965533))
                        goto(Label_1577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-426230196))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1133)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(860837477))
                        goto(Label_0964)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-1747727668))
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0690)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-893059383))
                        goto(Label_0566)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(1298646093))
                        goto(Label_0410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(262144)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6AA = and:int(var_3_6AA:int, ldc:int(2086049621))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1566:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6B5 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1577:
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(1794878265))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(772725635))
                        goto(Label_1133)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0964)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(1242207275))
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(866182148))
                        goto(Label_0690)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-32123823))
                        goto(Label_0566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(374068144))
                        goto(Label_0410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(2079835078))
                        var_17_6B5 = add:int(var_16_119:int, xor:int(ldc:int(16914), ldc:int(16915)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6AA = and:int(var_3_6AA:int, ldc:int(-101003433))
                
                if (cmple:boolean(var_5_81 = var_17_6B5:int, sub:int(var_6_88:int, xor:int(ldc:int(-15868), ldc:int(-15867))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(1)), ldc:int(0))) {
            var_3_6AA = and:int(var_3_6AA:int, ldc:int(75727101))
            goto(Label_0108)
        }
    }
}
