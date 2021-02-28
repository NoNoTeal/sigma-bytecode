public class \u51fa\u12cb\u7330\u74b1\u6c52.\u8cae\ud4fe\u718f\u6d99\u6435\u983f {
    public void \u8cae\ud4fe\u718f\u6d99\u6435\u983f(com.mojang.serialization.Codec<\u516c\u3d64\u718f\ub171\u6b5f.\ub7dc\u4c04\u4f4a\u7330\u56bd\u718f> p0) {
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
            invokespecial:\u93a2\u1187\u5654\u8413\u3a62\ua61f<\ub7dc\u4c04\u4f4a\u7330\u56bd\u718f>(\u93a2\u1187\u5654\u8413\u3a62\ua61f<\ub7dc\u4c04\u4f4a\u7330\u56bd\u718f>::<init>, this:\u8cae\ud4fe\u718f\u6d99\u6435\u983f[expected:\u93a2\u1187\u5654\u8413\u3a62\ua61f<\ub7dc\u4c04\u4f4a\u7330\u56bd\u718f>], p0:Codec<\ub7dc\u4c04\u4f4a\u7330\u56bd\u718f>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc7fe\u416d\u4179\ub7dc\u6fb0\u4f4a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u183a\uafe7\u74b1\u62da\u71f1\uc2bd p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p1, java.util.Random p2, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p3, \u516c\u3d64\u718f\ub171\u6b5f.\ub7dc\u4c04\u4f4a\u7330\u56bd\u718f p4) {
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
    
    public boolean \uc7fe\u416d\u4179\ub7dc\u6fb0\u4f4a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u183a\uafe7\u74b1\u62da\u71f1\uc2bd p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p1, java.util.Random p2, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p3, \u6b0d\u12cb\u156b\u4179\u8bb0.\ub8be\u7e3f\uc29a\u9af2\u3bd6\u16f6 p4) {
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
            return:boolean(invokevirtual:boolean(\u8cae\ud4fe\u718f\u6d99\u6435\u983f::\uc7fe\u416d\u4179\ub7dc\u6fb0\u4f4a, this:\u8cae\ud4fe\u718f\u6d99\u6435\u983f, p0:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd, p1:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0, p2:Random, p3:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, checkcast:\ub7dc\u4c04\u4f4a\u7330\u56bd\u718f(\u516c\u3d64\u718f\ub171\u6b5f.\ub7dc\u4c04\u4f4a\u7330\u56bd\u718f.class, p4:\ub8be\u7e3f\uc29a\u9af2\u3bd6\u16f6[expected:\ub7dc\u4c04\u4f4a\u7330\u56bd\u718f])))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ud12e\u61a4\uc87f\u74b1\u8aa5\u8cae$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u183a\uafe7\u74b1\u62da\u71f1\uc2bd p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u516c\u3d64\u718f\ub171\u6b5f.\ub7dc\u4c04\u4f4a\u7330\u56bd\u718f p2, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p3) {
        var_6_6A : \ub83f\uc9f6\u47c2\u67d0\u7ce1
        
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
            var_6_6A = invokeinterface:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\u718f\u6435\uc31c\u4ab3\u98a4::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, p0:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd[expected:\u718f\u6435\uc31c\u4ab3\u98a4], p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            
            if (instanceof:boolean(\u3d64\u7af6\uae87\uc238\u7d52.\u7af6\ua6bd\ubded\ua068\u51fa.class, var_6_6A:\ub83f\uc9f6\u47c2\u67d0\u7ce1)) {
                invokevirtual:void(\u7af6\ua6bd\ubded\ua068\u51fa::\u67d0\uc2bd\u0c95\ud171\u99f7\u8350, checkcast:\u7af6\ua6bd\ubded\ua068\u51fa(\u3d64\u7af6\uae87\uc238\u7d52.\u7af6\ua6bd\ubded\ua068\u51fa.class, var_6_6A:\u7af6\ua6bd\ubded\ua068\u51fa[expected:\ub83f\uc9f6\u47c2\u67d0\u7ce1]), p3:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:boolean(\ub7dc\u4c04\u4f4a\u7330\u56bd\u718f::\u9af2\u3bd6\u4e72\u1187\u6435\uc246, p2:\ub7dc\u4c04\u4f4a\u7330\u56bd\u718f))
                invokevirtual:void(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\u6d69\uc229\ubefe\ua3b4\u6c52\u5654, var_6_6A:\u7af6\ua6bd\ubded\ua068\u51fa[expected:\ub83f\uc9f6\u47c2\u67d0\u7ce1])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5bc4\ub18d\u5140\ucfaf\u392e\u1833(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_683 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D3 : int
        var_11_E4 : int
        var_14_10E : double
        var_16_112 : int
        var_12_10A : double
        var_17_68E : int
        
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
        var_3_683 = and:int(ldc:int(-2108973681), ldc:int(-286474862))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8cae\ud4fe\u718f\u6d99\u6435\u983f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(128)), ldc:int(0))) {
            var_3_683 = and:int(var_3_683:int, ldc:int(-1035769577))
        }
        else {
            var_3_683 = and:int(var_3_683:int, ldc:int(-1771766090))
            var_5_85 = and:int(ldc:int(-3125), ldc:int(3124))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(29264), ldc:int(-29265)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D3 = and:int(var_3_683:int, ldc:int(-813779746))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E4 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E4:int, sub:int(var_6_8C:int, xor:int(ldc:int(17), ldc:int(16)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E4:int, and:int(ldc:int(523), ldc:int(1413)))), var_7_9B:double))) {
                        inc:int(var_11_E4, ldc:int(1))
                    }
                    
                    var_3_683 = and:int(var_3_D3:int, ldc:int(-1085934362))
                    var_14_10E = var_7_9B:double
                    var_16_112 = var_11_E4:int
                }
                else {
                    var_11_E4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(16395), ldc:int(4161)))
                    var_12_10A = var_14_10E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_112 = var_11_E4:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E4:int)
                        var_16_112 = var_11_E4:int
                        var_14_10E = var_12_10A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-195439985))
                        goto(Label_1531)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(16)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(371163443))
                        goto(Label_1230)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(16)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-537990421))
                        goto(Label_0955)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(700151967))
                        goto(Label_0822)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-810041160))
                    }
                    else {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1024549457))
                        
                        if (cmplt:boolean(var_16_112:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0822)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1325128156))
                        goto(Label_1531)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0955)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0822)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(241979629))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(365669582))
                            loopcontinue()
                        }
                        
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1285243214))
                        var_11_E4 = and:int(ldc:int(3932), ldc:int(-3933))
                        goto(Label_1520)
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1531)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1628203668))
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(138686232))
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1498343742))
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0955)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-498730088))
                        goto(Label_0822)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(123907704))
                            loopcontinue()
                        }
                        
                        var_3_683 = and:int(var_3_683:int, ldc:int(-204292626))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10E = var_9_C1:double
                            goto(Label_0822)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(2023023184))
                        goto(Label_1531)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1299832335))
                        goto(Label_1388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(567762516))
                        goto(Label_1230)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0955)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(16)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1587369894))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(16)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(379417434))
                            loopcontinue()
                        }
                        
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1765681201))
                        var_14_10E = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10E:double))
                    }
                    
                    Label_0822:
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1704187985))
                        goto(Label_1531)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1417745781))
                        goto(Label_1230)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(228567344))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(54459954))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-1379254159))
                            loopcontinue()
                        }
                        
                        var_3_683 = and:int(var_3_683:int, ldc:int(-698435897))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E4 = and:int(ldc:int(3073), ldc:int(17219))
                                goto(Label_1110)
                            }
                        }
                    }
                    
                    Label_0955:
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1531)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1230)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1901147881))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0822)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-974666601))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(128)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(1832352784))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(1769939443))
                            loopcontinue()
                        }
                        
                        var_3_683 = and:int(var_3_683:int, ldc:int(-362498889))
                        var_11_E4 = and:int(ldc:int(1805), ldc:int(-1822))
                    }
                    
                    Label_1110:
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1531)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(99878622))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0955)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0822)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-1113825959))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(931684222))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(128)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(676127783))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1773748562))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E4:int, ldc:int(0))) {
                                goto(Label_1388)
                            }
                        }
                    }
                    
                    Label_1230:
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1160497442))
                        goto(Label_1531)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(523559321))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_1110)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-281156967))
                            goto(Label_0955)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-291764266))
                            goto(Label_0822)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(16)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-120302288))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(1421688505))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-500927669))
                            loopcontinue()
                        }
                        
                        var_3_683 = and:int(var_3_683:int, ldc:int(-556933385))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10E:double, var_5_85:int, var_16_112:int)
                        goto(Label_1520)
                    }
                    
                    Label_1388:
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-2101928900))
                        goto(Label_1531)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1205083291))
                        goto(Label_1230)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0955)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0822)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1784251306))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1067775230))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(67108864)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_683 = and:int(var_3_683:int, ldc:int(-831807550))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10E:double, ldc:double(0.0))
                    Label_1520:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_68E = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1531:
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-52627566))
                        goto(Label_1388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-937613108))
                        goto(Label_1230)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-2016529337))
                        goto(Label_0955)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1208876610))
                        goto(Label_0822)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-558242435))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1487347876))
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-698417410))
                        var_17_68E = add:int(var_16_112:int, xor:int(ldc:int(8224), ldc:int(8225)))
                        looporswitchbreak()
                    }
                    
                    var_3_683 = and:int(var_3_683:int, ldc:int(-453050515))
                }
                
                var_3_683 = and:int(var_3_683:int, ldc:int(-1678336877))
                
                if (cmple:boolean(var_5_85 = var_17_68E:int, sub:int(var_6_8C:int, xor:int(ldc:int(1280), ldc:int(1281))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(4194304)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
