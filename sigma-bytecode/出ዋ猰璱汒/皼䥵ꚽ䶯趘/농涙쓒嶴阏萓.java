public abstract class \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ub18d\u6d99\uc4d2\u5db4\u960f\u8413 {
    public void \ub18d\u6d99\uc4d2\u5db4\u960f\u8413(com.mojang.datafixers.schemas.Schema p0, boolean p1, java.lang.String p2, com.mojang.datafixers.DSL$TypeReference p3, java.lang.String p4) {
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
            invokespecial:DataFix(DataFix::<init>, this:\ub18d\u6d99\uc4d2\u5db4\u960f\u8413, p0:Schema, p1:boolean)
            putfield:String(\ub18d\u6d99\uc4d2\u5db4\u960f\u8413::\ufcaf\u156b\u6b0d\u836c\u71f1\u6d99, this:\ub18d\u6d99\uc4d2\u5db4\u960f\u8413, p2:String)
            putfield:DSL$TypeReference(\ub18d\u6d99\uc4d2\u5db4\u960f\u8413::\uc2bd\u88c5\uc29a\u98a4\u36d3\u6fb0, this:\ub18d\u6d99\uc4d2\u5db4\u960f\u8413, p3:DSL$TypeReference)
            putfield:String(\ub18d\u6d99\uc4d2\u5db4\u960f\u8413::\u9937\ub18d\u5245\u47c2\u3c25\u3c25, this:\ub18d\u6d99\uc4d2\u5db4\u960f\u8413, p4:String)
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
    
    public abstract com.mojang.datafixers.Typed<?> \ufe34\u5f50\uf94d\ubff1\ua068\u7873(com.mojang.datafixers.Typed<?> p0);
    
    private com.mojang.datafixers.Typed lambda$\ub19c\u4c2b\u965f\u0b8e\u7ce1\ufcaf$0(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.Typed p1) {
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
            return:Typed(invokevirtual:Typed(Typed::updateTyped, p1:Typed, p0:OpticFinder, invokevirtual:Type(Schema::getChoiceType, invokevirtual:Schema(\ub18d\u6d99\uc4d2\u5db4\u960f\u8413::getOutputSchema, this:\ub18d\u6d99\uc4d2\u5db4\u960f\u8413), getfield:DSL$TypeReference(\ub18d\u6d99\uc4d2\u5db4\u960f\u8413::\uc2bd\u88c5\uc29a\u98a4\u36d3\u6fb0, this:\ub18d\u6d99\uc4d2\u5db4\u960f\u8413), getfield:String(\ub18d\u6d99\uc4d2\u5db4\u960f\u8413::\u9937\ub18d\u5245\u47c2\u3c25\u3c25, this:\ub18d\u6d99\uc4d2\u5db4\u960f\u8413)), invokedynamic:Function<Typed, Typed>(apply:(L\u51fa\u12cb\u7330\u74b1\u6c52/\u76bc\u4975\ua6bd\u4daf\u8d98/\ub18d\u6d99\uc4d2\u5db4\u960f\u8413;)Ljava/util/function/Function;, this:\ub18d\u6d99\uc4d2\u5db4\u960f\u8413)))
        }
        
        goto(Label_0006)
    }
    
    public void \u67d0\uc31c\u494c\uc84e\u3bc9\u47c2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_602 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_60D : int
        
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
        var_3_602 = and:int(ldc:int(-135139212), ldc:int(2121920614))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub18d\u6d99\uc4d2\u5db4\u960f\u8413[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(4)), ldc:int(0))) {
            var_3_602 = and:int(var_3_602:int, ldc:int(-333791490))
        }
        else {
            var_3_602 = and:int(var_3_602:int, ldc:int(-1235760051))
            var_5_85 = and:int(ldc:int(2793), ldc:int(-2810))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(3902), ldc:int(-32576)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_602:int, ldc:int(-1093148041))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(-20476), ldc:int(-20475)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(-24256), ldc:int(-24255)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_602 = and:int(var_3_D2:int, ldc:int(-1098919323))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(-29632), ldc:int(-29631)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(128)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1150606837))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(58786706))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-227263144))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(2101029154))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(4)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-2139502904))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-500900108))
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(2119942766))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(1632410610))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-901117768))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(570817639))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(1889144199))
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(1091128254))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(965588663))
                            loopcontinue()
                        }
                        
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1217271817))
                        var_11_E3 = and:int(ldc:int(6682), ldc:int(-24219))
                        goto(Label_1423)
                    }
                    
                    Label_0573:
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(696835638))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(64)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1044703082))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1654891153))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(-302129729))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(180815692))
                            loopcontinue()
                        }
                        
                        var_3_602 = and:int(var_3_602:int, ldc:int(-143531156))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0692:
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(865298507))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-807903205))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(2053280295))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1219237810))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(1024124621))
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(-1349937760))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_602 = and:int(var_3_602:int, ldc:int(2146564719))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(29733), ldc:int(513))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-263106308))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(1973874959))
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(445247460))
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(1469855794))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(-1964356440))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_602 = and:int(var_3_602:int, ldc:int(2122042214))
                        var_11_E3 = and:int(ldc:int(29778), ldc:int(-29787))
                    }
                    
                    Label_1051:
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1388885371))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(4)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(394294199))
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(1403328097))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(269697305))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_602 = and:int(var_3_602:int, ldc:int(911725924))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1284)
                            }
                        }
                    }
                    
                    Label_1162:
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-902484178))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(4)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(1032377905))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_1051)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(2093086435))
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(1281360950))
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(-1084758788))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1423)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1284:
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1666918697))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(653281206))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(490318973))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(128)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(485132410))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(4)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1548329812))
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1247544822))
                        loopcontinue()
                    }
                    
                    var_3_602 = and:int(var_3_602:int, ldc:int(-1085150122))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1423:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_60D = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1434:
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(551611981))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-682508692))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(1790843387))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(939392510))
                        var_17_60D = add:int(var_16_111:int, xor:int(ldc:int(-16384), ldc:int(-16383)))
                        looporswitchbreak()
                    }
                    
                    var_3_602 = and:int(var_3_602:int, ldc:int(676118224))
                }
                
                var_3_602 = and:int(var_3_602:int, ldc:int(-1099572795))
                
                if (cmple:boolean(var_5_85 = var_17_60D:int, sub:int(var_6_8C:int, and:int(ldc:int(20645), ldc:int(2569))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(33554432)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
