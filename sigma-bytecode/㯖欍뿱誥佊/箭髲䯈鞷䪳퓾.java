public class \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u7bad\u9af2\u4bc8\u97b7\u4ab3\ud4fe {
    public void \u7bad\u9af2\u4bc8\u97b7\u4ab3\ud4fe(\u927d\u92ff\u71ae\uafe7\u6bb9.\u3bc9\u4179\u9033\ud217\ubf56\u98a4 p0, \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u0b8e\ud171\u6d69\ud523\u5140\uff55 p1) {
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
            putfield:\u3bc9\u4179\u9033\ud217\ubf56\u98a4(\u7bad\u9af2\u4bc8\u97b7\u4ab3\ud4fe::\u7043\uc84e\ub6ab\u647c\ud36e\u647c, this:\u7bad\u9af2\u4bc8\u97b7\u4ab3\ud4fe, p0:\u3bc9\u4179\u9033\ud217\ubf56\u98a4)
            putfield:\u0b8e\ud171\u6d69\ud523\u5140\uff55(\u7bad\u9af2\u4bc8\u97b7\u4ab3\ud4fe::\uc238\u927d\u1833\u8350\ua6bd\u56bd, this:\u7bad\u9af2\u4bc8\u97b7\u4ab3\ud4fe, p1:\u0b8e\ud171\u6d69\ud523\u5140\uff55)
            invokespecial:\u5d20\u6bb9\ub113\u983f\u47c2\u718f(\u5d20\u6bb9\ub113\u983f\u47c2\u718f::<init>, this:\u7bad\u9af2\u4bc8\u97b7\u4ab3\ud4fe)
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
    
    private static void lambda$\u5f50\u7873\u92ff\u7330\u1833\ucef1$0(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u0b8e\ud171\u6d69\ud523\u5140\uff55 p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p1) {
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
            invokevirtual:void(\u0b8e\ud171\u6d69\ud523\u5140\uff55::\ua61f\uf94d\u8308\ud523\ub113\u99f7, p0:\u0b8e\ud171\u6d69\ud523\u5140\uff55, checkcast:JsonElement(com.google.gson.JsonElement.class, invokevirtual:JsonElement(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u120d\u51b2\u071d\u071d\u5140\u0800, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<JsonElement>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uf9c5\ube23\u647c\u93a2\u36d3\u9033), and:int(ldc:int(9422), ldc:int(-9696)))))
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<UUID>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u92ee\u718f\u8df4\u156b\ubded\u3e75), invokestatic:UUID(\u3bc9\u4179\u9033\ud217\ubf56\u98a4::\u1833\u6b5f\u4bc8\u527a\uc7fe\uc238))
            return:void()
        }
        
        goto(Label_0006)
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
        var_3_60F : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_61A : int
        
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
        var_3_60F = and:int(ldc:int(-1583333540), ldc:int(-1209443393))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7bad\u9af2\u4bc8\u97b7\u4ab3\ud4fe[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_60F = and:int(var_3_60F:int, ldc:int(1912479735))
            var_5_7D = and:int(ldc:int(18130), ldc:int(-18139))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-3901), ldc:int(828)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_60F:int, ldc:int(-437190860))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(15360), ldc:int(15361)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(9217), ldc:int(2641)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_60F = and:int(var_3_D2:int, ldc:int(-306268193))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(-32253), ldc:int(-32254)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-228407583))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(408817253))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(22292889))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(935875749))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-273396825))
                    }
                    else {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(568860508))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(2039564557))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(1437039058))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-946463072))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(-306807811))
                            var_11_E3 = and:int(ldc:int(-28467), ldc:int(26930))
                            goto(Label_1436)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(204012065))
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-2048806363))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(1555681784))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-389556384))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(1202152938))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(622208784))
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(-297317000))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(954900092))
                            loopcontinue()
                        }
                        
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-235785451))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(1917078842))
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-1517345326))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-447550401))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-998127919))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(512)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(-808467833))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(654638155))
                            loopcontinue()
                        }
                        
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-169289922))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0818:
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(-86523424))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(-1989285437))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(-970704333))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60F = and:int(var_3_60F:int, ldc:int(800194389))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(4418), ldc:int(4419))
                                goto(Label_1067)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(533309558))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(-167852997))
                            goto(Label_0818)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(512)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(-1164144153))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(16)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(1323533289))
                            loopcontinue()
                        }
                        
                        var_3_60F = and:int(var_3_60F:int, ldc:int(666270492))
                        var_11_E3 = and:int(ldc:int(-29015), ldc:int(20758))
                    }
                    
                    Label_1067:
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(1087354390))
                        goto(Label_1447)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(-1630249362))
                            goto(Label_0921)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(12697458))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(1680018125))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60F = and:int(var_3_60F:int, ldc:int(1002233790))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1300)
                            }
                        }
                    }
                    
                    Label_1178:
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(591773071))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(128)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(1878128553))
                            goto(Label_1067)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(1962789312))
                            goto(Label_0818)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(1201363857))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_60F = and:int(var_3_60F:int, ldc:int(1071740828))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1436)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1300:
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-596510101))
                        goto(Label_1447)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(1719175805))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-254475365))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(852028081))
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(1543378838))
                        loopcontinue()
                    }
                    
                    var_3_60F = and:int(var_3_60F:int, ldc:int(-1410220))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1436:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_61A = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1447:
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(604775627))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(-1183611424))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(1511118288))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(1996076714))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_60F = and:int(var_3_60F:int, ldc:int(968080246))
                        var_17_61A = add:int(var_16_111:int, and:int(ldc:int(2617), ldc:int(129)))
                        looporswitchbreak()
                    }
                }
                
                var_3_60F = and:int(var_3_60F:int, ldc:int(769872661))
                
                if (cmple:boolean(var_5_7D = var_17_61A:int, sub:int(var_6_84:int, xor:int(ldc:int(16448), ldc:int(16449))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_60F:int, ldc:int(512)), ldc:int(0))) {
            var_3_60F = and:int(var_3_60F:int, ldc:int(1879498650))
            goto(Label_0106)
        }
    }
}
