public class \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u5654\ud158\u839e\u4bc8\ud4fe\uf995 {
    public void \u5654\ud158\u839e\u4bc8\ud4fe\uf995(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:\ub18d\u6d99\uc4d2\u5db4\u960f\u8413(\ub18d\u6d99\uc4d2\u5db4\u960f\u8413::<init>, this:\u5654\ud158\u839e\u4bc8\ud4fe\uf995, p0:Schema, p1:boolean, loadelement:String(getstatic:String[](\u5654\ud158\u839e\u4bc8\ud4fe\uf995::\u759a\ua6bd\u385b\u4ab3\ub83f\u71f1), and:int(ldc:int(20500), ldc:int(-20501))), getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\ua61f\u93a2\uc7fe\u7af6\u4492\u99f7), loadelement:String(getstatic:String[](\u5654\ud158\u839e\u4bc8\ud4fe\uf995::\u759a\ua6bd\u385b\u4ab3\ub83f\u71f1), and:int(ldc:int(8205), ldc:int(17025))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.serialization.Dynamic<?> \ud4fe\u5db4\u5140\u8cae\u6bb9\u5f50(com.mojang.serialization.Dynamic<?> p0) {
        var_4_75 : Optional
        var_5_98 : String
        
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
        var_4_75 = invokevirtual:Optional(DataResult::result, invokevirtual:DataResult(OptionalDynamic::asString, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic<?>, loadelement:String(getstatic:String[](\u5654\ud158\u839e\u4bc8\ud4fe\uf995::\u759a\ua6bd\u385b\u4ab3\ub83f\u71f1), and:int(ldc:int(4102), ldc:int(16931))))))
        
        if (logicalnot:boolean(invokevirtual:boolean(Optional::isPresent, var_4_75:Optional))) {
            return:Dynamic<?>(p0:Dynamic<?>)
        }
        
        var_5_98 = invokevirtual:String(String::toLowerCase, checkcast:String(java.lang.String.class, invokevirtual:String(Optional<String>::get, var_4_75:Optional<String>)), getstatic:Locale(Locale::ROOT))
        return:Dynamic<?>(invokevirtual:Dynamic(Dynamic::set, p0:Dynamic<?>, loadelement:String(getstatic:String[](\u5654\ud158\u839e\u4bc8\ud4fe\uf995::\u759a\ua6bd\u385b\u4ab3\ub83f\u71f1), xor:int(ldc:int(18432), ldc:int(18434))), invokevirtual:Dynamic(Dynamic::createString, p0:Dynamic<?>, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, checkcast:String(java.lang.String.class, invokeinterface:String(Map<String, String>::getOrDefault, getstatic:Map<String, String>(\u5654\ud158\u839e\u4bc8\ud4fe\uf995::\ucfaf\u9af2\u1187\u92ff\ubb2b\ub102), var_5_98:String[expected:Object], var_5_98:String)))))))
    }
    
    public com.mojang.datafixers.Typed<?> \ufe34\u5f50\uf94d\ubff1\ua068\u7873(com.mojang.datafixers.Typed<?> p0) {
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
            return:Typed<?>(invokevirtual:Typed(Typed::update, p0:Typed<?>, invokestatic:OpticFinder(DSL::remainderFinder), invokedynamic:Function<Dynamic, Dynamic>(apply:(L\ubcb0\ud12e\u51fa\u8aa5\u0c95/\u5654\ud158\u839e\u4bc8\ud4fe\uf995;)Ljava/util/function/Function;, this:\u5654\ud158\u839e\u4bc8\ud4fe\uf995)))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u62da\u3d64\u8753\ua068\u983f\uc246$0(java.util.HashMap p0) {
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
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u5654\ud158\u839e\u4bc8\ud4fe\uf995::\u759a\ua6bd\u385b\u4ab3\ub83f\u71f1), and:int(ldc:int(21315), ldc:int(9239))), loadelement:String(getstatic:String[](\u5654\ud158\u839e\u4bc8\ud4fe\uf995::\u759a\ua6bd\u385b\u4ab3\ub83f\u71f1), and:int(ldc:int(6151), ldc:int(10180))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u5654\ud158\u839e\u4bc8\ud4fe\uf995::\u759a\ua6bd\u385b\u4ab3\ub83f\u71f1), and:int(ldc:int(2693), ldc:int(4405))), loadelement:String(getstatic:String[](\u5654\ud158\u839e\u4bc8\ud4fe\uf995::\u759a\ua6bd\u385b\u4ab3\ub83f\u71f1), and:int(ldc:int(4223), ldc:int(2054))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u5654\ud158\u839e\u4bc8\ud4fe\uf995::\u759a\ua6bd\u385b\u4ab3\ub83f\u71f1), xor:int(ldc:int(8262), ldc:int(8257))), loadelement:String(getstatic:String[](\u5654\ud158\u839e\u4bc8\ud4fe\uf995::\u759a\ua6bd\u385b\u4ab3\ub83f\u71f1), and:int(ldc:int(9225), ldc:int(23022))))
            return:void()
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
    
    public void \u67d0\uc31c\u494c\uc84e\u3bc9\u47c2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6A4 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C3 : double
        var_3_D5 : int
        var_11_E6 : int
        var_14_110 : double
        var_16_114 : int
        var_12_10C : double
        var_17_6AF : int
        
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
        var_3_6A4 = and:int(ldc:int(-2062073350), ldc:int(-176469507))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5654\ud158\u839e\u4bc8\ud4fe\uf995[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(256)), ldc:int(0))) {
            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1781300327))
            var_5_7D = and:int(ldc:int(-3971), ldc:int(2946))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-27787), ldc:int(27658)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C3 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D5 = and:int(var_3_6A4:int, ldc:int(-415263848))
                    var_9_C3 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E6 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E6:int, sub:int(var_6_84:int, xor:int(ldc:boolean(0), ldc:boolean(1)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E6:int, xor:int(ldc:int(-32190), ldc:int(-32189)))), var_7_93:double))) {
                        inc:int(var_11_E6, ldc:int(1))
                    }
                    
                    var_3_6A4 = and:int(var_3_D5:int, ldc:int(-805585989))
                    var_14_110 = var_7_93:double
                    var_16_114 = var_11_E6:int
                }
                else {
                    var_11_E6 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(102), ldc:int(103)))
                    var_12_10C = var_14_110 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_114 = var_11_E6:int, var_6_84:int)) {
                        var_9_C3 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E6:int)
                        var_16_114 = var_11_E6:int
                        var_14_110 = var_12_10C:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(753342096))
                        goto(Label_1580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(2097979533))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-440498698))
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-310601762))
                        goto(Label_1161)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1510835459))
                        goto(Label_0993)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1953253277))
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0704)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0571)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-810342434))
                        
                        if (cmplt:boolean(var_16_114:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0571)
                            }
                            
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0424:
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1161)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-741075860))
                        goto(Label_0993)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0704)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-2016601358))
                            loopcontinue()
                        }
                        
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-2024283685))
                        var_11_E6 = and:int(ldc:int(8764), ldc:int(-10877))
                        goto(Label_1569)
                    }
                    
                    Label_0571:
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(945519856))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-2123083387))
                        goto(Label_1309)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1161)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0993)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1195908727))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(228529076))
                            goto(Label_0424)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1983626193))
                            loopcontinue()
                        }
                        
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-283130945))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_110 = var_9_C3:double
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0704:
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-2141740369))
                        goto(Label_1580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(2039644470))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1050452613))
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(512001095))
                        goto(Label_1161)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0993)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1838246778))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1908002004))
                            goto(Label_0571)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1904657161))
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(895252063))
                            loopcontinue()
                        }
                        
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-406900230))
                        var_14_110 = mul:double(ldc:double(0.5), add:double(var_9_C3:double, var_14_110:double))
                    }
                    
                    Label_0870:
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1672328445))
                        goto(Label_1161)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-247487533))
                            goto(Label_0704)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1065316312))
                            goto(Label_0571)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-863712494))
                            loopcontinue()
                        }
                        
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1616924262))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E6 = xor:int(ldc:int(68), ldc:int(69))
                                goto(Label_1161)
                            }
                        }
                    }
                    
                    Label_0993:
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-2026913045))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1319323429))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0870)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-706580346))
                            goto(Label_0704)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0571)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1107429814))
                            goto(Label_0424)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(2040949100))
                            loopcontinue()
                        }
                        
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-36491784))
                        var_11_E6 = and:int(ldc:int(-10089), ldc:int(10024))
                    }
                    
                    Label_1161:
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1867037454))
                        goto(Label_1580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1910861678))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-755579466))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0993)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-298511926))
                            goto(Label_0870)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0704)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(284653099))
                            goto(Label_0571)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-271680913))
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-560907517))
                            loopcontinue()
                        }
                        
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1082701320))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E6:int, ldc:int(0))) {
                                goto(Label_1426)
                            }
                        }
                    }
                    
                    Label_1309:
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1013679933))
                            goto(Label_1161)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0993)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0870)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0704)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0571)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(2052813113))
                            loopcontinue()
                        }
                        
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-142882851))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_110:double, var_5_7D:int, var_16_114:int)
                        goto(Label_1569)
                    }
                    
                    Label_1426:
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1697106657))
                        goto(Label_1580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(890540518))
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1161)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-467843113))
                        goto(Label_0993)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1553820020))
                        goto(Label_0704)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1048994817))
                        goto(Label_0424)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(33554432)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-2053653510))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_110:double, ldc:double(0.0))
                    Label_1569:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6AF = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E6:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1580:
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1309)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1161)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(693678250))
                        goto(Label_0993)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(1344478478))
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(2047833424))
                        goto(Label_0704)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0571)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-376786468))
                        goto(Label_0424)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A4:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-845205509))
                        var_17_6AF = add:int(var_16_114:int, xor:int(ldc:int(320), ldc:int(321)))
                        looporswitchbreak()
                    }
                    
                    var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1260426949))
                }
                
                var_3_6A4 = and:int(var_3_6A4:int, ldc:int(-1647113736))
                
                if (cmple:boolean(var_5_7D = var_17_6AF:int, sub:int(var_6_84:int, xor:int(ldc:int(4112), ldc:int(4113))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_6A4:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_6A4 = and:int(var_3_6A4:int, ldc:int(464741585))
            goto(Label_0106)
        }
    }
}
