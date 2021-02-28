public class \u494c\u4975\ua068\u0c95\uc84e.\ub113\u62da\u7330\u3bd6\u3bc9\ub7dc {
    public void \ub113\u62da\u7330\u3bd6\u3bc9\ub7dc(\u47c2\u2dcc\u12cb\ud171\u8c8a.\u88c5\u8c8a\uf94d\ub6ab\u51fa\uf94d p0) {
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
            putfield:\u88c5\u8c8a\uf94d\ub6ab\u51fa\uf94d(\ub113\u62da\u7330\u3bd6\u3bc9\ub7dc::\u6d99\u67d0\ud7e8\ud523\u8c8a\u5d20, this:\ub113\u62da\u7330\u3bd6\u3bc9\ub7dc, p0:\u88c5\u8c8a\uf94d\ub6ab\u51fa\uf94d)
            invokespecial:\u5d20\u6bb9\ub113\u983f\u47c2\u718f(\u5d20\u6bb9\ub113\u983f\u47c2\u718f::<init>, this:\ub113\u62da\u7330\u3bd6\u3bc9\ub7dc)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0a06\u93a2\ud7e8\u6198\u156b\u8640() {
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
    
    private static void lambda$\u36d3\u5d20\u8640\u34df\ud523\u93a2$0(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p0) {
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
        
        if (logicalnot:boolean(invokevirtual:boolean(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u7049\u59ec\u6ec6\ud171\u3bc9\ub8be, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<JsonElement>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uf9c5\ube23\u647c\u93a2\u36d3\u9033), and:int(ldc:int(-18702), ldc:int(16653))))) {
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<JsonElement>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uf9c5\ube23\u647c\u93a2\u36d3\u9033), invokestatic:JsonElement(\u88c5\u8c8a\uf94d\ub6ab\u51fa\uf94d::\u9937\u7c6b\ubb2b\u6c52\u69d9\ud36e, checkcast:String(java.lang.String.class, invokevirtual:String(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u7ce1\uc238\u946b\ubb2b\ua6bd\u12b2, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<String>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u0c95\ube23\u12cb\u839e\ucb79\u56bd)))))
        }
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
    
    public void \u6cfe\u3e75\uf94d\u071d\u3776\u74b1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_654 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_65F : int
        
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
        var_3_654 = and:int(ldc:int(-1180864048), ldc:int(-1499134982))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub113\u62da\u7330\u3bd6\u3bc9\ub7dc[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1)), ldc:int(0))) {
            var_3_654 = and:int(var_3_654:int, ldc:int(-818590677))
        }
        else {
            var_3_654 = and:int(var_3_654:int, ldc:int(-53521957))
            var_5_85 = and:int(ldc:int(-32369), ldc:int(27760))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-2477), ldc:int(2476)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_654:int, ldc:int(-292614442))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(10841), ldc:int(1155)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(2051), ldc:int(24657)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_654 = and:int(var_3_DA:int, ldc:int(567263481))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(1601), ldc:int(18563)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1694485200))
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1314230483))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1242)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(64)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-551533422))
                        goto(Label_0826)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1935432407))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1584681035))
                    }
                    else {
                        var_3_654 = and:int(var_3_654:int, ldc:int(601795061))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0826)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1258288619))
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(89523525))
                        goto(Label_1242)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(8)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1975297082))
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(64)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-65744826))
                        goto(Label_0826)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-627708300))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-2019564226))
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1244253744))
                        var_11_EB = and:int(ldc:int(14531), ldc:int(-14548))
                        goto(Label_1487)
                    }
                    
                    Label_0573:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1747344088))
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1843075445))
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1242)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(976743712))
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0826)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(755567277))
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(1018480858))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0826)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1503613861))
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1843135507))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1257155915))
                        goto(Label_1242)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1090138951))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(2111008552))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(1120493751))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(1330859599))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-488323848))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0826:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1086997824))
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1658309288))
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1867869247))
                        goto(Label_1242)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(600557357))
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-782619630))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1717234414))
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(1688503760))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(6285), ldc:int(1329))
                                goto(Label_1099)
                            }
                        }
                    }
                    
                    Label_0953:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(4)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-208831720))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1242)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1761127553))
                            goto(Label_0826)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(64)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(1178228308))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(2025180148))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(-207118341))
                        var_11_EB = and:int(ldc:int(-8967), ldc:int(8966))
                    }
                    
                    Label_1099:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(2024274888))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(32)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(674579029))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(550472360))
                            goto(Label_0953)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(327772639))
                            goto(Label_0826)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(3023627))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(2123419162))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(810997351))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(706274830))
                            loopcontinue()
                        }
                        
                        var_3_654 = and:int(var_3_654:int, ldc:int(2089205456))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1356)
                            }
                        }
                    }
                    
                    Label_1242:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1311100676))
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_1099)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(-1226366074))
                            goto(Label_0953)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0826)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(128)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(558445027))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_654 = and:int(var_3_654:int, ldc:int(799436762))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1487)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1356:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(652348697))
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-708467021))
                        goto(Label_1242)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(512)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1313110651))
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0826)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1579113291))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1131216256))
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(4)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_654 = and:int(var_3_654:int, ldc:int(-120749575))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1487:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_65F = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1498:
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-2141567173))
                        goto(Label_1242)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1111054734))
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(492328216))
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-171658020))
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(-1159803654))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_654:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_654 = and:int(var_3_654:int, ldc:int(1772459222))
                        var_17_65F = add:int(var_16_119:int, xor:int(ldc:int(4868), ldc:int(4869)))
                        looporswitchbreak()
                    }
                    
                    var_3_654 = and:int(var_3_654:int, ldc:int(-1657491626))
                }
                
                var_3_654 = and:int(var_3_654:int, ldc:int(-458990348))
                
                if (cmple:boolean(var_5_85 = var_17_65F:int, sub:int(var_6_8C:int, and:int(ldc:int(1025), ldc:int(16709))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_654:int, ldc:int(16)), ldc:int(0))) {
            var_3_654 = and:int(var_3_654:int, ldc:int(-1938056))
            goto(Label_0106)
        }
    }
}
