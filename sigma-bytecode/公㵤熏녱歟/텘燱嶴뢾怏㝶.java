public final class \u516c\u3d64\u718f\ub171\u6b5f.\ud158\u71f1\u5db4\ub8be\u600f\u3776 {
    public void \ud158\u71f1\u5db4\ub8be\u600f\u3776() {
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
            invokespecial:\u5d20\u6bb9\ub113\u983f\u47c2\u718f(\u5d20\u6bb9\ub113\u983f\u47c2\u718f::<init>, this:\ud158\u71f1\u5db4\ub8be\u600f\u3776)
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
    
    private static void lambda$\u3bd6\u527a\u64f2\u8c8a\uceb8\u385b$0(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p0) {
        var_3_6C : \u8308\ub7dc\u446c\u40a9\u8753\u64f2
        var_4_81 : int
        var_5_97 : int
        
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
            var_3_6C = checkcast:\u8308\ub7dc\u446c\u40a9\u8753\u64f2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u8308\ub7dc\u446c\u40a9\u8753\u64f2.class, invokevirtual:\u8308\ub7dc\u446c\u40a9\u8753\u64f2(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u4d85\u71f1\u6435\u1833\u1187\u6435, invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4), ldc:Class<\u8308\ub7dc\u446c\u40a9\u8753\u64f2>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u8308\ub7dc\u446c\u40a9\u8753\u64f2.class)))
            var_4_81 = invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u120d\u51b2\u071d\u071d\u5140\u0800, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), and:int(ldc:int(10788), ldc:int(-10789)))))
            var_5_97 = invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u120d\u51b2\u071d\u071d\u5140\u0800, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), xor:int(ldc:int(3), ldc:int(2)))))
            
            if (cmpge:boolean(var_5_97:int, ldc:int(20))) {
                invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6435\ub1b9\u88c5\u4c04\u72f1\u8df4, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), xor:int(ldc:int(21512), ldc:int(21513)), invokestatic:Integer(Integer::valueOf, preincrement:int(1, var_5_97:int)))
            }
            
            invokevirtual:void(\u8308\ub7dc\u446c\u40a9\u8753\u64f2::\u8350\uc910\u946b\u4d85\u6198\u7c6b, var_3_6C:\u8308\ub7dc\u446c\u40a9\u8753\u64f2, i2s:short(var_4_81:int))
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
        var_3_631 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_63C : int
        
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
        var_3_631 = and:int(ldc:int(-2013628136), ldc:int(-51381860))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ud158\u71f1\u5db4\ub8be\u600f\u3776[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(131072)), ldc:int(0))) {
            var_3_631 = and:int(var_3_631:int, ldc:int(-1133593093))
            var_5_7D = and:int(ldc:int(26776), ldc:int(-26778))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-3532), ldc:int(3275)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_631:int, ldc:int(-587317251))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(25125), ldc:int(329)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(545), ldc:int(1)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_631 = and:int(var_3_D2:int, ldc:int(-1267810907))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(17797), ldc:int(33)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(512)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(226915847))
                        goto(Label_1481)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1333)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-554033799))
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1318917542))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(512)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-117463339))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(256)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1905968099))
                    }
                    else {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-168116320))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1077550253))
                        goto(Label_1481)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(1)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(1024120832))
                        goto(Label_1333)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1262789235))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(512)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(1762001270))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(2089818331))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(-18121324))
                            var_11_E3 = and:int(ldc:int(-13337), ldc:int(13336))
                            goto(Label_1470)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1481)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(1665821465))
                        goto(Label_1333)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(128)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1464571607))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(32)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(333918310))
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1536426739))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1663035553))
                        goto(Label_1481)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1333)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1386652839))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-674415027))
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(256)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-2071443155))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1551098641))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(-225413135))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(32)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(1785895572))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_631 = and:int(var_3_631:int, ldc:int(-957349891))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1481)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-989265568))
                        goto(Label_1333)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(743654918))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(-558232169))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(512)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(1676522081))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(1009787851))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1787920628))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(10257), ldc:int(18309))
                                goto(Label_1075)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1481)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(381027388))
                        goto(Label_1333)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1528533812))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(94607191))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(1009018866))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(1806381818))
                            loopcontinue()
                        }
                        
                        var_3_631 = and:int(var_3_631:int, ldc:int(-411402369))
                        var_11_E3 = and:int(ldc:int(-4496), ldc:int(4487))
                    }
                    
                    Label_1075:
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1481)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(1073880511))
                        goto(Label_1333)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(659773755))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(256)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(-38705673))
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(256)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(-1961486385))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(-1689266583))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_631 = and:int(var_3_631:int, ldc:int(-184550986))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1333)
                            }
                        }
                    }
                    
                    Label_1194:
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(837459677))
                        goto(Label_1481)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1306796625))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1075)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(256)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(385051521))
                            goto(Label_0921)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(1901920022))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(-1626177979))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(128)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(1845675485))
                            loopcontinue()
                        }
                        
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1510000154))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1470)
                    }
                    
                    Label_1333:
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(2008467220))
                        goto(Label_1481)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(1707718531))
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(32)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(463242482))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(270645830))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1732091385))
                        loopcontinue()
                    }
                    
                    var_3_631 = and:int(var_3_631:int, ldc:int(-1108624544))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1470:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63C = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1481:
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1333)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1759262488))
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-372244130))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(32)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1656097882))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(1)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(1557663225))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(256)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-806699542))
                        var_17_63C = add:int(var_16_111:int, and:int(ldc:int(11569), ldc:int(519)))
                        looporswitchbreak()
                    }
                }
                
                var_3_631 = and:int(var_3_631:int, ldc:int(-303366764))
                
                if (cmple:boolean(var_5_7D = var_17_63C:int, sub:int(var_6_84:int, and:int(ldc:int(4641), ldc:int(9481))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(131072)), ldc:int(0))) {
            var_3_631 = and:int(var_3_631:int, ldc:int(-2044000223))
            goto(Label_0106)
        }
    }
}
