public class \u59ec\u8413\u97e6\uc229\u3776.\ub6ab\u12cb\ud7e8\uff55\uc29a {
    public void \ub6ab\u12cb\ud7e8\uff55\uc29a(\ub113\uc4d2\u183a\u527a\u6435.\u4c2b\ub8be\u839e\u71ae\uf9c5 p0, double p1, boolean p2, int p3, java.util.function.BooleanSupplier p4) {
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
        invokespecial:\uc87f\ub70c\uc87f\ubb2b\u0c95(\uc87f\ub70c\uc87f\ubb2b\u0c95::<init>, this:\ub6ab\u12cb\ud7e8\uff55\uc29a)
        putfield:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\ub6ab\u12cb\ud7e8\uff55\uc29a::\u8350\ub32d\u3d4b\ub83f\u0800\u8413, this:\ub6ab\u12cb\ud7e8\uff55\uc29a, invokestatic:ArrayList[expected:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>](Lists::newArrayList))
        putfield:\u4c2b\ub8be\u839e\u71ae\uf9c5(\ub6ab\u12cb\ud7e8\uff55\uc29a::\u946b\u8df4\ufcaf\u3776\u3bd6\ubff1, this:\ub6ab\u12cb\ud7e8\uff55\uc29a, p0:\u4c2b\ub8be\u839e\u71ae\uf9c5)
        putfield:double(\ub6ab\u12cb\ud7e8\uff55\uc29a::\u98a4\u61a4\u4cd9\u4f4a\u4179\ub102, this:\ub6ab\u12cb\ud7e8\uff55\uc29a, p1:double)
        putfield:boolean(\ub6ab\u12cb\ud7e8\uff55\uc29a::\u16f6\u446c\u59ec\u9af2\u4f52\u7ce1, this:\ub6ab\u12cb\ud7e8\uff55\uc29a, p2:boolean)
        putfield:int(\ub6ab\u12cb\ud7e8\uff55\uc29a::\ud7e8\u647c\u59ec\u8640\uc3e3\u8d90, this:\ub6ab\u12cb\ud7e8\uff55\uc29a, p3:int)
        putfield:BooleanSupplier(\ub6ab\u12cb\ud7e8\uff55\uc29a::\uae87\u7c6b\uae87\u3e2a\ube23\ud523, this:\ub6ab\u12cb\ud7e8\uff55\uc29a, p4:BooleanSupplier)
        invokevirtual:void(\uc87f\ub70c\uc87f\ubb2b\u0c95::\ub83f\u6b5f\u61a4\uc3e3\u6198\u7049, this:\ub6ab\u12cb\ud7e8\uff55\uc29a[expected:\uc87f\ub70c\uc87f\ubb2b\u0c95], invokestatic:EnumSet<\uc7fe\u9af2\u52d3\uc87f\u92ff>(EnumSet<E>::of, getstatic:\uc7fe\u9af2\u52d3\uc87f\u92ff(\uc7fe\u9af2\u52d3\uc87f\u92ff::\u67d0\uf9c5\u4c04\u4f4a\u67d0\u7043)))
        
        if (invokestatic:boolean(\u4bc8\u3504\u6c56\u0800\uc910\ud12e::\u8350\u4975\u3bc9\u3e75\u7bad\u16f6, p0:\u4c2b\ub8be\u839e\u71ae\uf9c5[expected:\u4f4a\uafe7\u76bc\u392e\ub8be])) {
            return:void()
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, loadelement:String(getstatic:String[](\ub6ab\u12cb\ud7e8\uff55\uc29a::\uc87f\u5db4\uff55\u446c\u3776\u7af6), and:int(ldc:int(-28653), ldc:int(19148)))))
    }
    
    public boolean \u62da\u0b8e\u5f50\u718f\u7ce1\ud523() {
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
    
    public boolean \u3d4b\u0b8e\u61a4\u12b2\uff55\u965f() {
        var_1_A9 : int
        stack_D4_0 : int [generated]
        
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
        var_1_A9 = and:int(ldc:int(-1811212904), ldc:int(931888627))
        
        if (logicalnot:boolean(invokevirtual:boolean(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\u7ce1\uc246\u5bc4\u3d4b\u760c\uc2e8, invokevirtual:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u4f4a\uafe7\u76bc\u392e\ub8be::\u51fa\ub171\ua3b4\u7873\u16f6\u3504, getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\ub6ab\u12cb\ud7e8\uff55\uc29a::\u946b\u8df4\ufcaf\u3776\u3bd6\ubff1, this:\ub6ab\u12cb\ud7e8\uff55\uc29a))))) {
            do {
                if (cmpne:boolean(and:int(var_1_A9:int, ldc:int(16)), ldc:int(0))) {
                    var_1_A9 = and:int(var_1_A9:int, ldc:int(1601822142))
                    
                    if (invokevirtual:boolean(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u92ee\ua3b4\u3c25\u7330\u3711\uc2e8, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\ub6ab\u12cb\ud7e8\uff55\uc29a::\uc910\u12cb\ub8be\u4ab3\u4492\u8350, this:\ub6ab\u12cb\ud7e8\uff55\uc29a), invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[expected:\u071d\u69d9\u3bc9\u983f\u3c25\u64ab](\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\ub6ab\u12cb\ud7e8\uff55\uc29a::\u946b\u8df4\ufcaf\u3776\u3bd6\ubff1, this:\ub6ab\u12cb\ud7e8\uff55\uc29a)), f2d:double(add:float(invokevirtual:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u36d3\u4c2b\u839e\u071d\ua068\ud217, getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\ub6ab\u12cb\ud7e8\uff55\uc29a::\u946b\u8df4\ufcaf\u3776\u3bd6\ubff1, this:\ub6ab\u12cb\ud7e8\uff55\uc29a)), i2f:float(getfield:int(\ub6ab\u12cb\ud7e8\uff55\uc29a::\ud7e8\u647c\u59ec\u8640\uc3e3\u8d90, this:\ub6ab\u12cb\ud7e8\uff55\uc29a)))))) {
                        loopcontinue()
                    }
                    
                    stack_D4_0 = and:int[expected:boolean](ldc:int(20745), ldc:int(2049))
                    return:boolean(stack_D4_0:boolean)
                }
            } while (cmpne:boolean(and:int(var_1_A9:int, ldc:int(8192)), ldc:int(0)))
            
            var_1_A9 = and:int(var_1_A9:int, ldc:int(-1086466561))
            stack_D4_0 = and:int[expected:boolean](ldc:int(10630), ldc:int(-10632))
            return:boolean(stack_D4_0:boolean[expected:int])
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-16964), ldc:int(16963)))
    }
    
    public void \ub7dc\u4c2b\ud523\ube23\u416d\u3776() {
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
            invokevirtual:boolean(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\u7c6b\ud523\u965f\u9a18\u647c\u8bb0, invokevirtual:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u4f4a\uafe7\u76bc\u392e\ub8be::\u51fa\ub171\ua3b4\u7873\u16f6\u3504, getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\ub6ab\u12cb\ud7e8\uff55\uc29a::\u946b\u8df4\ufcaf\u3776\u3bd6\ubff1, this:\ub6ab\u12cb\ud7e8\uff55\uc29a)), getfield:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0(\ub6ab\u12cb\ud7e8\uff55\uc29a::\uc29a\u93a2\u3504\u183a\uc229\u3bc9, this:\ub6ab\u12cb\ud7e8\uff55\uc29a), getfield:double(\ub6ab\u12cb\ud7e8\uff55\uc29a::\u98a4\u61a4\u4cd9\u4f4a\u4179\ub102, this:\ub6ab\u12cb\ud7e8\uff55\uc29a))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7bad\u74b1\uc3e3\u760c\u4f52\u6c56() {
        var_1_61 : int
        
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
            var_1_61 = and:int(ldc:int(-1176749491), ldc:int(-245384738))
            
            if (logicalor:boolean(invokevirtual:boolean(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\u7ce1\uc246\u5bc4\u3d4b\u760c\uc2e8, invokevirtual:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u4f4a\uafe7\u76bc\u392e\ub8be::\u51fa\ub171\ua3b4\u7873\u16f6\u3504, getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\ub6ab\u12cb\ud7e8\uff55\uc29a::\u946b\u8df4\ufcaf\u3776\u3bd6\ubff1, this:\ub6ab\u12cb\ud7e8\uff55\uc29a))), invokevirtual:boolean(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u92ee\ua3b4\u3c25\u7330\u3711\uc2e8, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\ub6ab\u12cb\ud7e8\uff55\uc29a::\uc910\u12cb\ub8be\u4ab3\u4492\u8350, this:\ub6ab\u12cb\ud7e8\uff55\uc29a), invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[expected:\u071d\u69d9\u3bc9\u983f\u3c25\u64ab](\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, getfield:\u4c2b\ub8be\u839e\u71ae\uf9c5[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\ub6ab\u12cb\ud7e8\uff55\uc29a::\u946b\u8df4\ufcaf\u3776\u3bd6\ubff1, this:\ub6ab\u12cb\ud7e8\uff55\uc29a)), i2d:double(getfield:int(\ub6ab\u12cb\ud7e8\uff55\uc29a::\ud7e8\u647c\u59ec\u8640\uc3e3\u8d90, this:\ub6ab\u12cb\ud7e8\uff55\uc29a))))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(914197375))
                invokeinterface:boolean(List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::add, getfield:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\ub6ab\u12cb\ud7e8\uff55\uc29a::\u8350\ub32d\u3d4b\ub83f\u0800\u8413, this:\ub6ab\u12cb\ud7e8\uff55\uc29a), getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub6ab\u12cb\ud7e8\uff55\uc29a::\uc910\u12cb\ub8be\u4ab3\u4492\u8350, this:\ub6ab\u12cb\ud7e8\uff55\uc29a))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private boolean \uc84e\u4c2b\u1187\u4975\uc4d2\u7af6(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_2_61 : int
        var_4_6B : Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>
        var_2_7A : int
        
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
        var_2_61 = and:int(ldc:int(-666407306), ldc:int(-1997570122))
        var_4_6B = invokeinterface:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::iterator, getfield:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\ub6ab\u12cb\ud7e8\uff55\uc29a::\u8350\ub32d\u3d4b\ub83f\u0800\u8413, this:\ub6ab\u12cb\ud7e8\uff55\uc29a))
        
        loop {
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1)), ldc:int(0))) {
                var_2_7A = and:int(var_2_61:int, ldc:int(-559318564))
            }
            else {
                var_2_7A = and:int(var_2_61:int, ldc:int(-1143477214))
                
                if (invokeinterface:boolean(Iterator<E>::hasNext, var_4_6B:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>)) {
                    if (logicalnot:boolean(invokestatic:boolean(Objects::equals, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object], checkcast:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56.class, invokeinterface:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::next, var_4_6B:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>))))) {
                        var_2_61 = and:int(var_2_7A:int, ldc:int(-1957697055))
                        loopcontinue()
                    }
                    
                    return:boolean(and:int[expected:boolean](ldc:int(25216), ldc:int(-25217)))
                }
            }
            
            if (cmpne:boolean(and:int(var_2_7A:int, ldc:int(2147483647)), ldc:int(0))) {
                return:boolean(xor:int[expected:boolean](ldc:int(16385), ldc:int(16384)))
            }
            
            var_2_61 = and:int(var_2_7A:int, ldc:int(476515592))
        }
    }
    
    private void \ub171\uc3e3\ua3b4\ua068\u4daf\uae5d() {
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
            
            if (cmpgt:boolean(invokeinterface:int(List<E>::size, getfield:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\ub6ab\u12cb\ud7e8\uff55\uc29a::\u8350\ub32d\u3d4b\ub83f\u0800\u8413, this:\ub6ab\u12cb\ud7e8\uff55\uc29a)), ldc:int(15))) {
                invokeinterface:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::remove, getfield:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\ub6ab\u12cb\ud7e8\uff55\uc29a::\u8350\ub32d\u3d4b\ub83f\u0800\u8413, this:\ub6ab\u12cb\ud7e8\uff55\uc29a), and:int(ldc:int(-28255), ldc:int(26710)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private double lambda$\u965f\u156b\uff55\ud51e\u6198\u2dcc$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2) {
        var_4_63 : int
        var_4_73 : int
        var_6_8B : Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>
        stack_C7_0 : double [generated]
        
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
        var_4_63 = and:int(ldc:int(2088965303), ldc:int(1853076415))
        
        if (invokevirtual:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\u8413\ub7dc\u873d\u6b0d\u4ab3\u6fb0, p0:\ube23\uc238\u5140\u4cd9\u8aa5, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)) {
            var_4_73 = and:int(var_4_63:int, ldc:int(1878290847))
            var_6_8B = invokevirtual:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\u6c52\u9a18\u3504\u718f\u64f2\u6ec6::\ub32d\u67e9\ub102\u6d99\ucfaf\u6d69, invokevirtual:\u6c52\u9a18\u3504\u718f\u64f2\u6ec6(\ube23\uc238\u5140\u4cd9\u8aa5::\u3e2a\uc4d2\u4d85\ud7e8\u5245\u71f1, p0:\ube23\uc238\u5140\u4cd9\u8aa5), getstatic:Predicate<\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0>(\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0::\ub1b9\u7873\u64f2\u3776\u51fa\u4e72), invokedynamic:Predicate<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(test:(L\u59ec\u8413\u97e6\uc229\u3776/\ub6ab\u12cb\ud7e8\uff55\uc29a;)Ljava/util/function/Predicate;, this:\ub6ab\u12cb\ud7e8\uff55\uc29a), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, ldc:int(10), getstatic:\ubcb0\u9af2\u92ee\uc7fe\u56bd\u36d3(\ubcb0\u9af2\u92ee\uc7fe\u56bd\u36d3::\u5654\u416d\uceb8\u1833\u6bb9\u3d4b))
            
            if (invokevirtual:boolean(Optional::isPresent, var_6_8B:Optional)) {
                var_4_73 = and:int(var_4_73:int, ldc:int(-11120209))
                stack_C7_0 = neg:double(invokevirtual:double(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8d98\u64f2\u97b7\ua6bd\uc229\u51fa, checkcast:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56.class, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::get, var_6_8B:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>)), p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))
            }
            else {
                stack_C7_0 = ldc:double(Double.NEGATIVE_INFINITY)
            }
            
            return:double(stack_C7_0:double)
        }
        
        return:double(ldc:double(Double.NEGATIVE_INFINITY))
    }
    
    static {
        var_0_199 : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_119_0 : byte[] [generated]
        stack_11B_0 : byte[] [generated]
        stack_13E_0 : byte[] [generated]
        stack_1AC_0 : byte[] [generated]
        stack_1FB_0 : byte[] [generated]
        stack_27F_0 : byte[] [generated]
        stack_2D5_0 : byte[] [generated]
        var_4_184 : int
        var_3_189 : byte[]
        var_5_18A : int
        var_0_215 : int
        expr_1FB : byte [generated]
        stack_24D_2 : byte [generated]
        stack_221_0 : byte [generated]
        expr_A7 : int [generated]
        var_2_D5 : byte[]
        expr_D9 : int [generated]
        var_3_26D : byte[]
        var_5_26E : int
        expr_11B : int [generated]
        var_3_2C3 : byte[]
        var_5_2C4 : int
        expr_2D5 : byte [generated]
        var_3_14A : String
        stack_17D_0 : String[] [generated]
        expr_15C : String[] [generated]
        
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
        var_0_199 = and:int(ldc:int(168709202), ldc:int(1522168919))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_D5_0 = stack_D7_0 = stack_119_0 = stack_11B_0 = stack_13E_0 = stack_1AC_0 = stack_1FB_0 = stack_27F_0 = stack_2D5_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("7wUC9d3z6fXbp/TtJKj67T2x2uE3CuXaBPoC3u7V8/n35Obx1+v6Egn8/A==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_184 = expr_6E:int
        var_3_189 = newarray:byte[](byte.class, expr_6E:int)
        var_5_18A = expr_6E:int
        Label_0396:
        
        while (cmpeq:boolean(and:int(var_0_199:int, ldc:int(32)), ldc:int(0))) {
            var_0_199 = and:int(var_0_199:int, ldc:int(-91232914))
            var_5_18A = add:int(var_5_18A:int, ldc:int(-1))
            storeelement:byte(var_3_189:byte[], var_5_18A:int, add:byte(loadelement:byte(stack_1AC_0:byte[], var_5_18A:int), ldc:byte(17)))
            
            if (cmpne:boolean(var_5_18A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_119_0 = stack_11B_0 = stack_13E_0 = stack_1AC_0 = stack_1FB_0 = stack_27F_0 = stack_2D5_0 = var_3_189:byte[]
            goto(Label_0115)
        }
        
        var_0_199 = and:int(var_0_199:int, ldc:int(701118157))
        Label_0475:
        
        while (cmpne:boolean(and:int(var_0_199:int, ldc:int(64)), ldc:int(0))) {
            var_0_215 = and:int(var_0_199:int, ldc:int(-1966512821))
            var_5_18A = add:int(var_5_18A:int, ldc:int(-1))
            expr_1FB = stack_24D_2 = loadelement(stack_1FB_0, var_5_18A)
            
            if (cmplt:boolean(add:int(add:int(var_5_18A:int, ldc:int(3)), neg:int(var_4_184:int)), ldc:int(0))) {
                stack_24D_2 = stack_221_0 = add:byte(expr_1FB:byte, loadelement:byte(var_3_189:byte[], add:int(var_5_18A:int, ldc:int(3))))
                goto(Label_0561)
            }
            
            Label_0520:
            
            if (cmpne:boolean(and:int(var_0_215:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_215 = and:int(var_0_215:int, ldc:int(929506820))
            }
            else {
                var_0_215 = and:int(var_0_215:int, ldc:int(-1702374050))
                stack_24D_2 = stack_221_0 = add:byte(expr_1FB:byte, ldc:byte(3))
            }
            
            Label_0561:
            
            if (cmpne:boolean(and:int(var_0_215:int, ldc:int(1)), ldc:int(0))) {
                var_0_215 = and:int(var_0_215:int, ldc:int(2007514157))
                goto(Label_0520)
            }
            
            var_0_199 = and:int(var_0_215:int, ldc:int(2122702279))
            storeelement:byte(var_3_189:byte[], var_5_18A:int, stack_24D_2:byte)
            
            if (cmpne:boolean(var_5_18A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_119_0 = stack_11B_0 = stack_13E_0 = stack_1AC_0 = stack_1FB_0 = stack_27F_0 = stack_2D5_0 = var_3_189:byte[]
            goto(Label_0172)
        }
        
        var_0_199 = and:int(var_0_199:int, ldc:int(-1741807268))
        goto(Label_0396)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_199:int, ldc:int(1)), ldc:int(0))) {
            var_0_199 = and:int(var_0_199:int, ldc:int(650767076))
            goto(Label_0288)
        }
        
        if (cmpne:boolean(and:int(var_0_199:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_199 = and:int(var_0_199:int, ldc:int(-1836229143))
            goto(Label_0222)
        }
        
        if (cmpeq:boolean(and:int(var_0_199:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_199 = and:int(var_0_199:int, ldc:int(2136009979))
            expr_A7 = arraylength:int(stack_A7_0:byte[])
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_4_184 = expr_A7:int
                var_3_189 = newarray:byte[](byte.class, expr_A7:int)
                var_5_18A = expr_A7:int
                goto(Label_0475)
            }
        }
        
        Label_0172:
        
        if (cmpne:boolean(and:int(var_0_199:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0288)
        }
        
        if (cmpne:boolean(and:int(var_0_199:int, ldc:int(512)), ldc:int(0))) {
            var_0_199 = and:int(var_0_199:int, ldc:int(-383924918))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_199:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_199 = and:int(var_0_199:int, ldc:int(2053825607))
            var_2_D5 = stack_D5_0:byte[]
            expr_D9 = add:int(arraylength:int(stack_D7_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_D9:int, ldc:int(0))) {
                var_3_26D = newarray:byte[](byte.class, expr_D9:int)
                var_5_26E = expr_D9:int
                
                loop {
                    var_0_199 = and:int(var_0_199:int, ldc:int(1846437706))
                    var_5_26E = add:int(var_5_26E:int, ldc:int(-1))
                    storeelement:byte(var_3_26D:byte[], var_5_26E:int, add:int(shl:int(loadelement:byte(stack_27F_0:byte[], var_5_26E:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_D5:byte[], add:int(var_5_26E:int, and:int(ldc:int(8969), ldc:int(19619)))), ldc:int(4)), and:int(ldc:int(5295), ldc:int(24655)))))
                    
                    if (cmpne:boolean(var_5_26E:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_119_0 = stack_11B_0 = stack_13E_0 = stack_1AC_0 = stack_1FB_0 = stack_27F_0 = stack_2D5_0 = var_3_26D:byte[]
            }
        }
        
        Label_0222:
        
        if (cmpeq:boolean(and:int(var_0_199:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_199 = and:int(var_0_199:int, ldc:int(-1181634701))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_199:int, ldc:int(2)), ldc:int(0))) {
                var_0_199 = and:int(var_0_199:int, ldc:int(2018391042))
                goto(Label_0172)
            }
            
            if (cmpeq:boolean(and:int(var_0_199:int, ldc:int(1024)), ldc:int(0))) {
                var_0_199 = and:int(var_0_199:int, ldc:int(-1216451408))
                goto(Label_0115)
            }
            
            var_0_199 = and:int(var_0_199:int, ldc:int(-1705970486))
            expr_11B = arraylength:int(stack_11B_0:byte[])
            
            if (cmpne:boolean(expr_11B:int, ldc:int(0))) {
                var_3_2C3 = newarray:byte[](byte.class, expr_11B:int)
                var_5_2C4 = expr_11B:int
                
                loop {
                    var_0_199 = and:int(var_0_199:int, ldc:int(-1429252258))
                    var_5_2C4 = add:int(var_5_2C4:int, ldc:int(-1))
                    expr_2D5 = loadelement:byte(stack_2D5_0:byte[], var_5_2C4:int)
                    storeelement:byte(var_3_2C3:byte[], var_5_2C4:int, xor:int(or:int(and:int(shl:int(expr_2D5:byte, and:int(ldc:int(3140), ldc:int(676))), ldc:int(-16)), and:int(shr:int(expr_2D5:byte[expected:int], xor:int(ldc:int(3088), ldc:int(3092))), ldc:int(15))), ldc:int(124)))
                    
                    if (cmpne:boolean(var_5_2C4:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_119_0 = stack_11B_0 = stack_13E_0 = stack_1AC_0 = stack_1FB_0 = stack_27F_0 = stack_2D5_0 = var_3_2C3:byte[]
            }
        }
        
        Label_0288:
        
        if (cmpeq:boolean(and:int(var_0_199:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_199:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0172)
        }
        
        if (cmpeq:boolean(and:int(var_0_199:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_14A = initobject:String(String::<init>, stack_13E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_17D_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(9281), ldc:int(9280)))
            expr_15C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(20560), ldc:int(20561)))
            storeelement:String(expr_15C:String[], and:int(ldc:int(-30946), ldc:int(28769)), invokevirtual:String[expected:String](String::substring, var_3_14A:String, and:int(ldc:int(536), ldc:int(-537)), xor:int(ldc:int(16443), ldc:int(16401))))
            putstatic:String[](\ub6ab\u12cb\ud7e8\uff55\uc29a::\uc87f\u5db4\uff55\u446c\u3776\u7af6, expr_15C:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \ub8be\u4c2b\u071d\ub70c\ubded\u6d99(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6A2 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_6AD : int
        
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
        var_3_6A2 = and:int(ldc:int(-1783512034), ldc:int(-1381781186))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub6ab\u12cb\ud7e8\uff55\uc29a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(64)), ldc:int(0))) {
            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(789884815))
        }
        else {
            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1241991873))
            var_5_8A = and:int(ldc:int(-17679), ldc:int(17678))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(11956), ldc:int(-12221)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_6A2:int, ldc:int(-2019441858))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(17921), ldc:int(257)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(1152), ldc:int(1153)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_6A2 = and:int(var_3_E3:int, ldc:int(-1145660865))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(721), ldc:int(16641)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1767854436))
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1244834818))
                        goto(Label_1116)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0956)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0822)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(76824598))
                        goto(Label_0699)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-2006777662))
                        goto(Label_0575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1444824961))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0575)
                            }
                            
                            goto(Label_0822)
                        }
                    }
                    
                    Label_0419:
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(795309784))
                        goto(Label_1116)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1759337861))
                        goto(Label_0956)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0822)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(239461749))
                        goto(Label_0699)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1782649410))
                            var_11_F4 = and:int(ldc:int(-25485), ldc:int(25480))
                            goto(Label_1547)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0575:
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1128514250))
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1116)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0956)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(694883907))
                        goto(Label_0822)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1687347474))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1937519756))
                            loopcontinue()
                        }
                        
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1310198626))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0822)
                        }
                    }
                    
                    Label_0699:
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-346786312))
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-182385242))
                        goto(Label_1116)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0956)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1353764713))
                            loopcontinue()
                        }
                        
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1279854433))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0822:
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1005174695))
                        goto(Label_1558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1382952021))
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1116)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1832153308))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1117338789))
                            goto(Label_0699)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(2067358865))
                            loopcontinue()
                        }
                        
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-944329026))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = and:int(ldc:int(14849), ldc:int(17419))
                                goto(Label_1116)
                            }
                        }
                    }
                    
                    Label_0956:
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1489869738))
                        goto(Label_1558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1832754384))
                        goto(Label_1267)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-757257436))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0822)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1931607875))
                            goto(Label_0699)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-474696545))
                        var_11_F4 = and:int(ldc:int(21579), ldc:int(-21712))
                    }
                    
                    Label_1116:
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(574646409))
                        goto(Label_1558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1662231977))
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1672195337))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-777658934))
                            goto(Label_0956)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1996979301))
                            goto(Label_0822)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0699)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1281235336))
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1237186946))
                            loopcontinue()
                        }
                        
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1409753538))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1402)
                            }
                        }
                    }
                    
                    Label_1267:
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1850668880))
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1479645683))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_1116)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0956)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0822)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1904954494))
                            goto(Label_0699)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-481519043))
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-739341217))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                            goto(Label_1547)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1402:
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-778929046))
                        goto(Label_1558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-78855151))
                        goto(Label_1116)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0956)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1289329530))
                        goto(Label_0822)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1060987828))
                        goto(Label_0699)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1828635755))
                        goto(Label_0419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(32)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1548619169))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1547:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6AD = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1558:
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1590186927))
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1267)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(2133154895))
                        goto(Label_1116)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(946184898))
                        goto(Label_0956)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-622190653))
                        goto(Label_0822)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0699)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1759501568))
                        goto(Label_0575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(633502920))
                        goto(Label_0419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1784117986))
                        var_17_6AD = add:int(var_16_122:int, xor:int(ldc:int(132), ldc:int(133)))
                        looporswitchbreak()
                    }
                    
                    var_3_6A2 = and:int(var_3_6A2:int, ldc:int(301477375))
                }
                
                var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1179415073))
                
                if (cmple:boolean(var_5_8A = var_17_6AD:int, sub:int(var_6_91:int, xor:int(ldc:int(-30560), ldc:int(-30559))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(64)), ldc:int(0))) {
            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1390796404))
            goto(Label_0108)
        }
    }
}
