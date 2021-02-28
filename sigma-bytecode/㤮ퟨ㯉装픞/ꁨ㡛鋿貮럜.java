public class \u392e\ud7e8\u3bc9\u88c5\ud51e.\ua068\u385b\u92ff\u8cae\ub7dc {
    public void \ua068\u385b\u92ff\u8cae\ub7dc() {
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
            invokespecial:\u67e9\u7330\u62da\u3c25\u624e(\u67e9\u7330\u62da\u3c25\u624e::<init>, this:\ua068\u385b\u92ff\u8cae\ub7dc, invokestatic:ImmutableMap[expected:Map](ImmutableMap::of))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7873\uc7fe\u99f7\ubb2b\u1833\ua562(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u927d\u7d52\uf94d\u12cb p1, long p2) {
        var_5_61 : int
        stack_C0_0 : int [generated]
        
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
            var_5_61 = and:int(ldc:int(-1107804608), ldc:int(-1645592747))
            
            if (logicalnot:boolean(invokestatic:boolean(\u9033\u392e\u6c56\u92ee\ud4fe::\u3d4b\ubf56\u3a62\u8aa5\u527a\u965f, p1:\u8d90\u927d\u7d52\uf94d\u12cb[expected:\ube23\u67d0\u64f2\u839e\u76bc]))) {
                if (logicalnot:boolean(invokestatic:boolean(\u9033\u392e\u6c56\u92ee\ud4fe::\u7bad\u3776\u8aa5\ua61f\u4cd9\u3e75, p1:\u8d90\u927d\u7d52\uf94d\u12cb[expected:\ube23\u67d0\u64f2\u839e\u76bc]))) {
                    if (logicalnot:boolean(invokestatic:boolean(\ua068\u385b\u92ff\u8cae\ub7dc::\u72f1\u3bc9\u839e\uc229\u52d3\uf995, p1:\u8d90\u927d\u7d52\uf94d\u12cb))) {
                        goto(Label_0156)
                    }
                }
            }
            
            Label_0106:
            
            if (cmpeq:boolean(and:int(var_5_61:int, ldc:int(128)), ldc:int(0))) {
                stack_C0_0 = xor:int(ldc:int(260), ldc:int(261))
                goto(Label_0192)
            }
            
            Label_0156:
            
            if (cmpeq:boolean(and:int(var_5_61:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0106)
            }
            
            stack_C0_0 = and:int(ldc:int(-9672), ldc:int(9671))
            Label_0192:
            
            if (cmpeq:boolean(stack_C0_0:int, ldc:int(0))) {
                invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<\u8d90\u927d\u7d52\uf94d\u12cb>::\u983f\ucfaf\ub8be\u120d\u3504\u4179, invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<\u8d90\u927d\u7d52\uf94d\u12cb>(\u8d90\u927d\u7d52\uf94d\u12cb::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p1:\u8d90\u927d\u7d52\uf94d\u12cb), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\u64f2\u718f\ub6ab\u9033\u8d90\u9033>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u3a62\ube23\u8df4\ub18d\ub102\ub83f))
                invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<\u8d90\u927d\u7d52\uf94d\u12cb>::\u983f\ucfaf\ub8be\u120d\u3504\u4179, invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<\u8d90\u927d\u7d52\uf94d\u12cb>(\u8d90\u927d\u7d52\uf94d\u12cb::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p1:\u8d90\u927d\u7d52\uf94d\u12cb), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\ube23\u67d0\u64f2\u839e\u76bc>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\uc84e\u8cae\ud4fe\u3d4b\u74b1\u56bd))
                invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<E>::\u4f52\u8d98\ub70c\uceb8\u9937\uf995, invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<\u8d90\u927d\u7d52\uf94d\u12cb>(\u8d90\u927d\u7d52\uf94d\u12cb::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p1:\u8d90\u927d\u7d52\uf94d\u12cb), invokevirtual:long(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u960f\u6d99\ub70c\u8753\u4ab3\u6c56, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]), invokevirtual:long(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u56bd\u8258\u8d98\u120d\uff55\uc229, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean \u72f1\u3bc9\u839e\uc229\u52d3\uf995(\ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u927d\u7d52\uf94d\u12cb p0) {
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
    
    public void \u7873\uc7fe\u99f7\ubb2b\u1833\ua562(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1, long p2) {
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
            invokevirtual:void(\ua068\u385b\u92ff\u8cae\ub7dc::\u7873\uc7fe\u99f7\ubb2b\u1833\ua562, this:\ua068\u385b\u92ff\u8cae\ub7dc, p0:\ube23\uc238\u5140\u4cd9\u8aa5, checkcast:\u8d90\u927d\u7d52\uf94d\u12cb(\ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u927d\u7d52\uf94d\u12cb.class, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u8d90\u927d\u7d52\uf94d\u12cb]), p2:long)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u5140\u4c2b\u5654\uc238\ubefe\u927d$0(\ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u927d\u7d52\uf94d\u12cb p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
        var_2_5F : int
        stack_8B_0 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(1104945646), ldc:int(1707073950))
            
            if (cmpgt:boolean(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u3e2a\ua3b4\u4975\u4179\u64f2\u6c52, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f], p0:\u8d90\u927d\u7d52\uf94d\u12cb[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), ldc:double(36.0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1086582306))
                stack_8B_0 = and:int(ldc:int(-26046), ldc:int(9645))
            }
            else {
                stack_8B_0 = and:int(ldc:int(2593), ldc:int(8461))
            }
            
            return:boolean(stack_8B_0:int)
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
    
    public void \u6fb0\u8413\u8389\ub1b9\ub83f\u8258(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_60B : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_616 : int
        
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
        var_3_60B = and:int(ldc:int(110181903), ldc:int(-6701255))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ua068\u385b\u92ff\u8cae\ub7dc[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
            var_3_60B = and:int(var_3_60B:int, ldc:int(-2003723650))
        }
        else {
            var_3_60B = and:int(var_3_60B:int, ldc:int(1027062665))
            var_5_85 = and:int(ldc:int(19268), ldc:int(-19269))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-29100), ldc:int(29090)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_60B:int, ldc:int(-728369349))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(8640), ldc:int(8641)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(1192), ldc:int(1193)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_60B = and:int(var_3_D2:int, ldc:int(235371487))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(1073), ldc:int(12361)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(739509054))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1285)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(170326353))
                        goto(Label_1157)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0880)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0628)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1925203201))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-655238804))
                        goto(Label_1285)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1157)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1228546269))
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(373003833))
                        goto(Label_0880)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-617252337))
                        goto(Label_0628)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(512)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(738682445))
                            loopcontinue()
                        }
                        
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1901987037))
                        var_11_E3 = and:int(ldc:int(-23119), ldc:int(21070))
                        goto(Label_1414)
                    }
                    
                    Label_0533:
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1285)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(179452023))
                        goto(Label_1157)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0880)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1934601138))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1084227681))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0628:
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-590430120))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-397448791))
                        goto(Label_1285)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1157)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0880)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-336093320))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(128)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(1819539092))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(64)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(1812082098))
                            loopcontinue()
                        }
                        
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1613776045))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0754:
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(662658701))
                        goto(Label_1285)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(612773386))
                        goto(Label_1157)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1301195729))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(599007306))
                            goto(Label_0628)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(-1279176802))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60B = and:int(var_3_60B:int, ldc:int(772273955))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(27913), ldc:int(199))
                                goto(Label_1022)
                            }
                        }
                    }
                    
                    Label_0880:
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1234211974))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1285)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1157)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0754)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0628)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(40734609))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(-1000736951))
                            loopcontinue()
                        }
                        
                        var_3_60B = and:int(var_3_60B:int, ldc:int(220544547))
                        var_11_E3 = and:int(ldc:int(-17835), ldc:int(17834))
                    }
                    
                    Label_1022:
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(231203756))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(4340527))
                        goto(Label_1285)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1241147260))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(-1484771055))
                            goto(Label_0880)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(-1670446563))
                            goto(Label_0754)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(1617401596))
                            goto(Label_0628)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1994521141))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1285)
                            }
                        }
                    }
                    
                    Label_1157:
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1110115706))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1315942386))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1022)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0880)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(684595853))
                            goto(Label_0754)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(128)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(-489261468))
                            goto(Label_0628)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60B = and:int(var_3_60B:int, ldc:int(-1899761099))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1414)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1285:
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(367055028))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(326856306))
                        goto(Label_1157)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0880)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0628)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(679387259))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(1624976350))
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(256)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_60B = and:int(var_3_60B:int, ldc:int(-1487193431))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1414:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_616 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1425:
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1285)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-616832484))
                        goto(Label_1157)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-1794480064))
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(817105970))
                        goto(Label_0880)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-125485872))
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0628)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-563770927))
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60B = and:int(var_3_60B:int, ldc:int(-308186553))
                        var_17_616 = add:int(var_16_111:int, and:int(ldc:int(257), ldc:int(23143)))
                        looporswitchbreak()
                    }
                    
                    var_3_60B = and:int(var_3_60B:int, ldc:int(-687992886))
                }
                
                var_3_60B = and:int(var_3_60B:int, ldc:int(482817951))
                
                if (cmple:boolean(var_5_85 = var_17_616:int, sub:int(var_6_8C:int, and:int(ldc:int(9217), ldc:int(4109))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_60B:int, ldc:int(65536)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
