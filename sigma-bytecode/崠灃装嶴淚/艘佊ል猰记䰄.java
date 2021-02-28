public class \u5d20\u7043\u88c5\u5db4\uf94d.\u8258\u4f4a\u120d\u7330\u8bb0\u4c04 {
    public void \u8258\u4f4a\u120d\u7330\u8bb0\u4c04(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u8258\u4f4a\u120d\u7330\u8bb0\u4c04, p0:Schema, p1:boolean)
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
    
    public static int \u92ff\uf94d\u600f\u3504\ub6ab\ud7e8(int p0, int p1, int p2) {
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
            return:int(or:int(or:int(shl:int(p1:int, ldc:int(8)), shl:int(p2:int, and:int(ldc:int(4), ldc:int(22022)))), p0:int))
        }
        
        goto(Label_0006)
    }
    
    private int \ub8be\uc910\u8d98\u7330\u6b0d\u71ae(int p0) {
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
            return:int(and:int(p0:int, ldc:int(15)))
        }
        
        goto(Label_0006)
    }
    
    private int \u93a2\u6bb9\ua61f\u6fb0\u527a\u7c6b(int p0) {
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
            return:int(and:int(shr:int(p0:int, ldc:int(8)), xor:int(ldc:int(17134), ldc:int(16913))))
        }
        
        goto(Label_0006)
    }
    
    private int \u51b2\ua068\u4492\u3d64\u4f4a\ub1b9(int p0) {
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
            return:int(and:int(shr:int(p0:int, xor:int(ldc:int(5), ldc:int(1))), ldc:int(15)))
        }
        
        goto(Label_0006)
    }
    
    public static int \u8c8a\u7d52\u7ce1\u839e\ub18d\u7af6(boolean p0, boolean p1, boolean p2, boolean p3) {
        var_4_61 : int
        var_6_6A : int
        
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
        var_4_61 = and:int(ldc:int(-852635957), ldc:int(-478324257))
        var_6_6A = and:int(ldc:int(13522), ldc:int(-16119))
        
        if (p2:boolean) {
            if (logicalnot:boolean(p1:boolean)) {
                goto(Label_0465)
            }
            
            var_6_6A = or:int(var_6_6A:int, xor:int(ldc:int(-28160), ldc:int(-28158)))
            goto(Label_0379)
        }
        
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0660)
        }
        
        if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(16384)), ldc:int(0))) {
            var_4_61 = and:int(var_4_61:int, ldc:int(-1956468032))
            goto(Label_0534)
        }
        
        if (cmpne:boolean(and:int(var_4_61:int, ldc:int(1048576)), ldc:int(0))) {
            var_4_61 = and:int(var_4_61:int, ldc:int(-1754242218))
            goto(Label_0465)
        }
        
        if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(1073741824)), ldc:int(0))) {
            var_4_61 = and:int(var_4_61:int, ldc:int(918748756))
            goto(Label_0379)
        }
        
        if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0290)
        }
        
        if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(131072)), ldc:int(0))) {
            var_4_61 = and:int(var_4_61:int, ldc:int(-290031047))
            
            if (p3:boolean) {
                if (logicalnot:boolean(p0:boolean)) {
                    goto(Label_0660)
                }
                
                var_6_6A = or:int(var_6_6A:int, ldc:int(32))
                goto(Label_0379)
            }
        }
        
        Label_0201:
        
        if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0660)
        }
        
        if (cmpne:boolean(and:int(var_4_61:int, ldc:int(131072)), ldc:int(0))) {
            var_4_61 = and:int(var_4_61:int, ldc:int(-1982351579))
            goto(Label_0534)
        }
        
        if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(2147483647)), ldc:int(0))) {
            var_4_61 = and:int(var_4_61:int, ldc:int(-1724682312))
            goto(Label_0465)
        }
        
        if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0379)
        }
        
        if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(8192)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(16384)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(-882466932))
                goto(Label_0112)
            }
            
            var_4_61 = and:int(var_4_61:int, ldc:int(1869962767))
            
            if (p1:boolean) {
                var_6_6A = or:int(var_6_6A:int, xor:int(ldc:int(37), ldc:int(33)))
                goto(Label_0379)
            }
        }
        
        Label_0290:
        
        if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0660)
        }
        
        if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_0534)
        }
        
        if (cmpne:boolean(and:int(var_4_61:int, ldc:int(8192)), ldc:int(0))) {
            var_4_61 = and:int(var_4_61:int, ldc:int(-986351177))
            goto(Label_0465)
        }
        
        if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(2048)), ldc:int(0))) {
            var_4_61 = and:int(var_4_61:int, ldc:int(192838454))
        }
        else {
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(1073741824)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(2118983740))
                goto(Label_0201)
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_4_61 = and:int(var_4_61:int, ldc:int(-989955653))
            
            if (p0:boolean) {
                var_6_6A = or:int(var_6_6A:int, ldc:int(64))
            }
        }
        
        Label_0379:
        
        if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(1073741824)), ldc:int(0))) {
            var_4_61 = and:int(var_4_61:int, ldc:int(884916456))
            goto(Label_0660)
        }
        
        if (cmpne:boolean(and:int(var_4_61:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0534)
        }
        
        if (cmpne:boolean(and:int(var_4_61:int, ldc:int(8)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0290)
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0201)
            }
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(131072)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(820599838))
                goto(Label_0112)
            }
            
            return:int(var_6_6A:int)
        }
        
        Label_0465:
        
        if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0660)
        }
        
        if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(1048576)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0379)
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0290)
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0201)
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(1073741824)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(830900847))
                goto(Label_0112)
            }
            
            var_4_61 = and:int(var_4_61:int, ldc:int(-932918019))
            
            if (p0:boolean) {
                var_6_6A = or:int(var_6_6A:int, xor:int(ldc:int(47), ldc:int(175)))
                goto(Label_0379)
            }
        }
        
        Label_0534:
        
        if (cmpne:boolean(and:int(var_4_61:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0465)
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0379)
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(2147483647)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(-29545401))
                goto(Label_0290)
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0201)
            }
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(262144)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(1668696491))
                var_6_6A = or:int(var_6_6A:int, xor:int(ldc:int(-28480), ldc:int(-28479)))
                goto(Label_0379)
            }
            
            goto(Label_0112)
        }
        
        Label_0660:
        
        if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_0534)
        }
        
        if (cmpne:boolean(and:int(var_4_61:int, ldc:int(131072)), ldc:int(0))) {
            var_4_61 = and:int(var_4_61:int, ldc:int(-1426000645))
            goto(Label_0465)
        }
        
        if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_0379)
        }
        
        if (cmpne:boolean(and:int(var_4_61:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0290)
        }
        
        if (cmpne:boolean(and:int(var_4_61:int, ldc:int(131072)), ldc:int(0))) {
            goto(Label_0201)
        }
        
        if (cmpne:boolean(and:int(var_4_61:int, ldc:int(1048576)), ldc:int(0))) {
            var_4_61 = and:int(var_4_61:int, ldc:int(-1245493318))
            goto(Label_0112)
        }
        
        var_4_61 = and:int(var_4_61:int, ldc:int(-643938181))
        
        if (logicalnot:boolean(p1:boolean)) {
            var_4_61 = and:int(var_4_61:int, ldc:int(-948582037))
            var_6_6A = or:int(var_6_6A:int, ldc:int(16))
            goto(Label_0379)
        }
        
        var_6_6A = or:int(var_6_6A:int, ldc:int(8))
        goto(Label_0379)
    }
    
    private com.mojang.datafixers.Typed lambda$\ud158\u624e\uc4d2\uc9f6\u3e2a\u760c$7(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.OpticFinder p1, com.mojang.datafixers.OpticFinder p2, com.mojang.datafixers.Typed p3) {
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
    
    private com.mojang.datafixers.Typed lambda$\uc3e3\u759a\u8258\u69d9\u76bc\u5140$6(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.OpticFinder p1, com.mojang.datafixers.Typed p2) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\u4c2b\u392e\ubded\ubff1\ub113\uc84e$5(int[] p0, com.mojang.serialization.Dynamic p1) {
        var_4_7C : Dynamic
        
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
            var_4_7C = checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokestatic:Object[expected:Dynamic](DataFixUtils::orElse, invokevirtual:Optional(OptionalDynamic::result, invokevirtual:OptionalDynamic(Dynamic::get, p1:Dynamic, loadelement:String(getstatic:String[](\u8258\u4f4a\u120d\u7330\u8bb0\u4c04::\ube23\u718f\u8df4\u4cd9\u392e\u4f4a), and:int(ldc:int(13380), ldc:int(18437))))), invokevirtual:Dynamic[expected:Object](Dynamic::emptyMap, p1:Dynamic)))
            return:Dynamic(invokevirtual:Dynamic(Dynamic::set, p1:Dynamic, loadelement:String(getstatic:String[](\u8258\u4f4a\u120d\u7330\u8bb0\u4c04::\ube23\u718f\u8df4\u4cd9\u392e\u4f4a), xor:int(ldc:int(4421), ldc:int(4417))), invokevirtual:Dynamic(Dynamic::set, var_4_7C:Dynamic, loadelement:String(getstatic:String[](\u8258\u4f4a\u120d\u7330\u8bb0\u4c04::\ube23\u718f\u8df4\u4cd9\u392e\u4f4a), xor:int(ldc:int(2054), ldc:int(2051))), invokevirtual:Dynamic(Dynamic::createByte, p1:Dynamic, i2b:byte(or:int(invokevirtual:byte(OptionalDynamic::asByte, invokevirtual:OptionalDynamic(Dynamic::get, var_4_7C:Dynamic, loadelement:String(getstatic:String[](\u8258\u4f4a\u120d\u7330\u8bb0\u4c04::\ube23\u718f\u8df4\u4cd9\u392e\u4f4a), and:int(ldc:int(4773), ldc:int(16453)))), and:int[expected:byte](ldc:int(-3493), ldc:int(3488))), loadelement:int(p0:int[], and:int(ldc:int(-18330), ldc:int(18193)))))))))
        }
        
        goto(Label_0006)
    }
    
    private com.mojang.datafixers.Typed lambda$\u385b\u7873\uae87\u8258\u4bc8\u51fa$4(com.mojang.datafixers.OpticFinder p0, int[] p1, com.mojang.datafixers.Typed p2) {
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
    
    private static com.mojang.datafixers.Typed lambda$null$3(it.unimi.dsi.fastutil.ints.Int2ObjectMap p0, com.mojang.datafixers.Typed p1) {
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
            return:Typed(invokevirtual:Typed<?>(\u9033\ud12e\u836c\ufcaf\u873d\u8c8a::\u3bd6\u3bd6\u4c04\u9033\u93a2\ua61f, checkcast:\u99f7\u6b0d\u0800\u92ee\u516c\u3e2a[expected:\u9033\ud12e\u836c\ufcaf\u873d\u8c8a](\u12b2\u4e72\u8df4\u67e9\u67e9.\u99f7\u6b0d\u0800\u92ee\u516c\u3e2a.class, invokeinterface:Object[expected:\u99f7\u6b0d\u0800\u92ee\u516c\u3e2a](Int2ObjectMap::get, p0:Int2ObjectMap, invokevirtual:int(OptionalDynamic::asInt, invokevirtual:OptionalDynamic(Dynamic::get, checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokevirtual:Object[expected:Dynamic](Typed::get, p1:Typed, invokestatic:OpticFinder(DSL::remainderFinder))), loadelement:String(getstatic:String[](\u8258\u4f4a\u120d\u7330\u8bb0\u4c04::\ube23\u718f\u8df4\u4cd9\u392e\u4f4a), xor:int(ldc:int(322), ldc:int(324)))), and:int(ldc:int(10834), ldc:int(-10835))))), p1:Typed))
        }
        
        goto(Label_0006)
    }
    
    private static \u12b2\u4e72\u8df4\u67e9\u67e9.\u99f7\u6b0d\u0800\u92ee\u516c\u3e2a lambda$\ub8be\u5bc4\u7006\u4492\u6b5f\u3711$2(\u12b2\u4e72\u8df4\u67e9\u67e9.\u99f7\u6b0d\u0800\u92ee\u516c\u3e2a p0) {
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
            return:\u99f7\u6b0d\u0800\u92ee\u516c\u3e2a(p0:\u99f7\u6b0d\u0800\u92ee\u516c\u3e2a)
        }
        
        goto(Label_0006)
    }
    
    private \u12b2\u4e72\u8df4\u67e9\u67e9.\u99f7\u6b0d\u0800\u92ee\u516c\u3e2a lambda$null$1(com.mojang.datafixers.Typed p0) {
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
            return:\u99f7\u6b0d\u0800\u92ee\u516c\u3e2a(initobject:\u99f7\u6b0d\u0800\u92ee\u516c\u3e2a(\u99f7\u6b0d\u0800\u92ee\u516c\u3e2a::<init>, p0:Typed, invokevirtual:Schema(\u8258\u4f4a\u120d\u7330\u8bb0\u4c04::getInputSchema, this:\u8258\u4f4a\u120d\u7330\u8bb0\u4c04)))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u760c\u6c52\uc31c\u3a62\u624e\u8aa5$0(it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap p0) {
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
            invokevirtual:int(Object2IntOpenHashMap::put, p0:Object2IntOpenHashMap, loadelement:String[expected:Object](getstatic:String[](\u8258\u4f4a\u120d\u7330\u8bb0\u4c04::\ube23\u718f\u8df4\u4cd9\u392e\u4f4a), xor:int(ldc:int(4104), ldc:int(4111))), and:int(ldc:int(-2197), ldc:int(2196)))
            invokevirtual:int(Object2IntOpenHashMap::put, p0:Object2IntOpenHashMap, loadelement:String[expected:Object](getstatic:String[](\u8258\u4f4a\u120d\u7330\u8bb0\u4c04::\ube23\u718f\u8df4\u4cd9\u392e\u4f4a), xor:int(ldc:int(199), ldc:int(207))), xor:int(ldc:int(449), ldc:int(448)))
            invokevirtual:int(Object2IntOpenHashMap::put, p0:Object2IntOpenHashMap, loadelement:String[expected:Object](getstatic:String[](\u8258\u4f4a\u120d\u7330\u8bb0\u4c04::\ube23\u718f\u8df4\u4cd9\u392e\u4f4a), and:int(ldc:int(19087), ldc:int(9529))), and:int(ldc:int(12291), ldc:int(18070)))
            invokevirtual:int(Object2IntOpenHashMap::put, p0:Object2IntOpenHashMap, loadelement:String[expected:Object](getstatic:String[](\u8258\u4f4a\u120d\u7330\u8bb0\u4c04::\ube23\u718f\u8df4\u4cd9\u392e\u4f4a), xor:int(ldc:int(-15867), ldc:int(-15857))), and:int(ldc:int(16899), ldc:int(4099)))
            invokevirtual:int(Object2IntOpenHashMap::put, p0:Object2IntOpenHashMap, loadelement:String[expected:Object](getstatic:String[](\u8258\u4f4a\u120d\u7330\u8bb0\u4c04::\ube23\u718f\u8df4\u4cd9\u392e\u4f4a), and:int(ldc:int(6283), ldc:int(335))), xor:int(ldc:int(98), ldc:int(102)))
            invokevirtual:int(Object2IntOpenHashMap::put, p0:Object2IntOpenHashMap, loadelement:String[expected:Object](getstatic:String[](\u8258\u4f4a\u120d\u7330\u8bb0\u4c04::\ube23\u718f\u8df4\u4cd9\u392e\u4f4a), xor:int(ldc:int(-27645), ldc:int(-27633))), and:int(ldc:int(1029), ldc:int(16389)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static it.unimi.dsi.fastutil.objects.Object2IntMap \u5f50\u71f1\uceb8\uc87f\u3504\u3dd3() {
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
            return:Object2IntMap(getstatic:Object2IntMap<String>(\u8258\u4f4a\u120d\u7330\u8bb0\u4c04::\u88c5\u3711\u6435\ubf56\u6198\u6fb0))
        }
        
        goto(Label_0006)
    }
    
    public static java.util.Set \ub6ab\u3e2a\u72f1\u6b5f\uc4d2\u8350() {
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
            return:Set(getstatic:Set<String>(\u8258\u4f4a\u120d\u7330\u8bb0\u4c04::\ub8be\uc4d2\u51b2\u9255\uc238\uc87f))
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
    
    public void \u3d64\u5bc4\u99f7\uc7fe\ud158\u9937(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_62D : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_638 : int
        
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
        var_3_62D = and:int(ldc:int(-960851453), ldc:int(1337955011))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8258\u4f4a\u120d\u7330\u8bb0\u4c04[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(16)), ldc:int(0))) {
            var_3_62D = and:int(var_3_62D:int, ldc:int(-554843333))
            var_5_81 = and:int(ldc:int(6992), ldc:int(-6993))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(30376), ldc:int(-32489)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_62D:int, ldc:int(1856687911))
                    var_9_BE = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_88:int, and:int(ldc:int(9601), ldc:int(2053)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, and:int(ldc:int(3683), ldc:int(129)))), var_7_97:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_62D = and:int(var_3_D0:int, ldc:int(1874836015))
                    var_14_10B = var_7_97:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(19472), ldc:int(19473)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_88:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1881492424))
                        goto(Label_1463)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1329)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0925)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-250860935))
                        goto(Label_0775)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0681)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1772221207))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-810902953))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0775)
                        }
                    }
                    
                    Label_0392:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-2115718176))
                        goto(Label_1329)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1622990003))
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-2086906664))
                        goto(Label_0925)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0775)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(443272902))
                        goto(Label_0681)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1609338631))
                            var_11_E1 = and:int(ldc:int(-23279), ldc:int(21166))
                            goto(Label_1452)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(478392649))
                        goto(Label_1329)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0925)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1863798494))
                        goto(Label_0775)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1871328173))
                            goto(Label_0392)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1228473212))
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1860752075))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0775)
                        }
                    }
                    
                    Label_0681:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1329)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0925)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0392)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-134639753))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0775:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1908258810))
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1334111090))
                        goto(Label_1329)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1923029940))
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1134694677))
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(217866094))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-1148619688))
                            goto(Label_0681)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0392)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(897526706))
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-957705325))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E1 = and:int(ldc:int(343), ldc:int(17033))
                                goto(Label_1100)
                            }
                        }
                    }
                    
                    Label_0925:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-179891416))
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1961110550))
                        goto(Label_1329)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1798515636))
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-946574584))
                            goto(Label_0775)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0681)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(8)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(619928771))
                            goto(Label_0392)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-653200606))
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(2130570083))
                        var_11_E1 = and:int(ldc:int(888), ldc:int(-1917))
                    }
                    
                    Label_1100:
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1824568461))
                        goto(Label_1329)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0925)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0775)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0681)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(1984499963))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0392)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(1459216307))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1329)
                            }
                        }
                    }
                    
                    Label_1205:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(493449292))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(-1650400196))
                            goto(Label_1100)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0925)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0775)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0681)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0392)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_62D = and:int(var_3_62D:int, ldc:int(772776200))
                            loopcontinue()
                        }
                        
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-676729869))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_81:int, var_16_10F:int)
                        goto(Label_1452)
                    }
                    
                    Label_1329:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1975393982))
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1596012085))
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(348795842))
                        goto(Label_0925)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0775)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0681)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0392)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_62D = and:int(var_3_62D:int, ldc:int(-542593529))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1452:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_638 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1463:
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1329)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-402072127))
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1642340849))
                        goto(Label_0925)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(170158438))
                        goto(Label_0775)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(-1248428560))
                        goto(Label_0681)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(791296926))
                        goto(Label_0392)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_62D = and:int(var_3_62D:int, ldc:int(2130501255))
                        var_17_638 = add:int(var_16_10F:int, xor:int(ldc:int(2600), ldc:int(2601)))
                        looporswitchbreak()
                    }
                }
                
                var_3_62D = and:int(var_3_62D:int, ldc:int(-20981173))
                
                if (cmple:boolean(var_5_81 = var_17_638:int, sub:int(var_6_88:int, and:int(ldc:int(1043), ldc:int(21089))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_62D:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
