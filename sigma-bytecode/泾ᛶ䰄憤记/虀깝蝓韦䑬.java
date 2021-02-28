public class \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u8640\uae5d\u8753\u97e6\u446c {
    public void \u8640\uae5d\u8753\u97e6\u446c(\u36d3\u9033\u6b0d\u983f\u8d90.\uf94d\u4f4a\u92ee\u4975\u3d64 p0) {
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
    
    public boolean \u62da\u0b8e\u5f50\u718f\u7ce1\ud523() {
        var_1_5F : int
        var_3_154 : List<\u3a62\u8d98\u5fe1\ua61f\u3e2a>
        
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
        var_1_5F = and:int(ldc:int(-2039388909), ldc:int(1682919715))
        
        if (cmpne:boolean(invokevirtual:\ube23\u67d0\u64f2\u839e\u76bc(\u4f4a\uafe7\u76bc\u392e\ub8be::\u839e\u1833\u47c2\u97b7\u8389\u7043, getfield:\uf94d\u4f4a\u92ee\u4975\u3d64[expected:\u4f4a\uafe7\u76bc\u392e\ub8be](\u8640\uae5d\u8753\u97e6\u446c::\u4c04\u120d\u6198\uceb8\u647c\ub83f, this:\u8640\uae5d\u8753\u97e6\u446c)), aconstnull:\ube23\u67d0\u64f2\u839e\u76bc())) {
            return:boolean(and:int[expected:boolean](ldc:int(-4277), ldc:int(4276)))
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(16384)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(450320631))
                goto(Label_0275)
            }
            
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(65536)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1718141140))
                goto(Label_0214)
            }
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(4096)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1805389204))
            }
            else {
                var_1_5F = and:int(var_1_5F:int, ldc:int(360957955))
                
                if (invokevirtual:boolean(\u62da\u64f2\u6c56\u0a06\u7af6::\uc238\u7c6b\u3776\u97b7\u12b2\u8d90, getfield:\uf94d\u4f4a\u92ee\u4975\u3d64[expected:\u62da\u64f2\u6c56\u0a06\u7af6](\u8640\uae5d\u8753\u97e6\u446c::\u4c04\u120d\u6198\uceb8\u647c\ub83f, this:\u8640\uae5d\u8753\u97e6\u446c))) {
                    return:boolean(and:int[expected:boolean](ldc:int(20826), ldc:int(-20827)))
                }
            }
            
            Label_0166:
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0275)
            }
            
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(65536)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(2017555829))
            }
            else {
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(64)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_1_5F = and:int(var_1_5F:int, ldc:int(1833555053))
                
                if (cmplt:boolean(getfield:int(\uf94d\u4f4a\u92ee\u4975\u3d64::\u718f\u446c\u9a18\ubb2b\u69d9\ub8be, getfield:\uf94d\u4f4a\u92ee\u4975\u3d64(\u8640\uae5d\u8753\u97e6\u446c::\u4c04\u120d\u6198\uceb8\u647c\ub83f, this:\u8640\uae5d\u8753\u97e6\u446c)), getfield:int(\u8640\uae5d\u8753\u97e6\u446c::\u8d90\u64ab\uc910\u59ec\u8d98\u3504, this:\u8640\uae5d\u8753\u97e6\u446c))) {
                    return:boolean(and:int[expected:boolean](ldc:int(-26649), ldc:int(26648)))
                }
            }
            
            Label_0214:
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(32)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1649876220))
            }
            else {
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0166)
                }
                
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(128)), ldc:int(0))) {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(559221617))
                    loopcontinue()
                }
                
                var_1_5F = and:int(var_1_5F:int, ldc:int(-677688643))
                
                if (logicalnot:boolean(invokevirtual:boolean(\u7e3f\ubff1\u718f\ub171\u72f1::\ub113\u718f\u8389\u071d\uc87f\u16f6, invokevirtual:\u7e3f\ubff1\u718f\ub171\u72f1(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8cae\u7330\u9937\ub83f\ube23\u6d69, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\uf94d\u4f4a\u92ee\u4975\u3d64::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\uf94d\u4f4a\u92ee\u4975\u3d64(\u8640\uae5d\u8753\u97e6\u446c::\u4c04\u120d\u6198\uceb8\u647c\ub83f, this:\u8640\uae5d\u8753\u97e6\u446c))), getstatic:\uc4d2\u74b1\u8413\u67e9\u1833\u3bc9<\u3d4b\u5654\u8d98\u4bc8\u5db4>(\u7e3f\ubff1\u718f\ub171\u72f1::\u6b0d\u927d\u47c2\u624e\uae87\uafe7)))) {
                    return:boolean(and:int[expected:boolean](ldc:int(29003), ldc:int(-29548)))
                }
            }
            
            Label_0275:
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0214)
            }
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0166)
            }
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(524288)), ldc:int(0))) {
                loopcontinue()
            }
            
            var_3_154 = invokevirtual:List<\ube23\u67d0\u64f2\u839e\u76bc>(\u6cfe\u8bb0\uc3e3\u8aa5\u624e::\u4c04\u9937\u071d\u6d99\ufcaf\u4ab3, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u6cfe\u8bb0\uc3e3\u8aa5\u624e](\uf94d\u4f4a\u92ee\u4975\u3d64::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\uf94d\u4f4a\u92ee\u4975\u3d64(\u8640\uae5d\u8753\u97e6\u446c::\u4c04\u120d\u6198\uceb8\u647c\ub83f, this:\u8640\uae5d\u8753\u97e6\u446c)), ldc:Class<\u3a62\u8d98\u5fe1\ua61f\u3e2a>(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u3a62\u8d98\u5fe1\ua61f\u3e2a.class), getfield:\uc246\u1187\u2dcc\u3a62\u392e(\u8640\uae5d\u8753\u97e6\u446c::\u4d85\u7ce1\u8cae\uc3e3\u98a4\ufcaf, this:\u8640\uae5d\u8753\u97e6\u446c), getfield:\uf94d\u4f4a\u92ee\u4975\u3d64[expected:\ube23\u67d0\u64f2\u839e\u76bc](\u8640\uae5d\u8753\u97e6\u446c::\u4c04\u120d\u6198\uceb8\u647c\ub83f, this:\u8640\uae5d\u8753\u97e6\u446c), invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub19c\u946b\u718f\u6cfe\u4bc8\u5654, invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7d52\u718f\u3776\u6fb0\ub83f::\ub113\ub1b9\u9937\u1833\u64f2\u3504, getfield:\uf94d\u4f4a\u92ee\u4975\u3d64[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u8640\uae5d\u8753\u97e6\u446c::\u4c04\u120d\u6198\uceb8\u647c\ub83f, this:\u8640\uae5d\u8753\u97e6\u446c)), ldc:double(16.0), ldc:double(4.0), ldc:double(16.0)))
            
            if (logicalnot:boolean(invokeinterface:boolean(List::isEmpty, var_3_154:List<\u3a62\u8d98\u5fe1\ua61f\u3e2a>))) {
                invokestatic:void(\uf94d\u4f4a\u92ee\u4975\u3d64::\u6fb0\ud4fe\u120d\u759a\u4c04\ub70c, getfield:\uf94d\u4f4a\u92ee\u4975\u3d64(\u8640\uae5d\u8753\u97e6\u446c::\u4c04\u120d\u6198\uceb8\u647c\ub83f, this:\u8640\uae5d\u8753\u97e6\u446c), checkcast:\u3a62\u8d98\u5fe1\ua61f\u3e2a(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u3a62\u8d98\u5fe1\ua61f\u3e2a.class, invokeinterface:\u3a62\u8d98\u5fe1\ua61f\u3e2a(List<\u3a62\u8d98\u5fe1\ua61f\u3e2a>::get, var_3_154:List<\u3a62\u8d98\u5fe1\ua61f\u3e2a>, invokevirtual:int(Random::nextInt, invokestatic:Random(\uf94d\u4f4a\u92ee\u4975\u3d64::\u3e75\uc9f6\uc29a\u6b5f\u8709\ua3b4, getfield:\uf94d\u4f4a\u92ee\u4975\u3d64(\u8640\uae5d\u8753\u97e6\u446c::\u4c04\u120d\u6198\uceb8\u647c\ub83f, this:\u8640\uae5d\u8753\u97e6\u446c)), invokeinterface:int(List<E>::size, var_3_154:List<\u3a62\u8d98\u5fe1\ua61f\u3e2a>)))))
                return:boolean(xor:int[expected:boolean](ldc:int(4292), ldc:int(4293)))
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(-4500), ldc:int(4499)))
        }
    }
    
    public boolean \u3d4b\u0b8e\u61a4\u12b2\uff55\u965f() {
        var_1_5F : int
        stack_97_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-511002374), ldc:int(1978591074))
            
            if (logicaland:boolean(cmpne:boolean(invokestatic:\u3a62\u8d98\u5fe1\ua61f\u3e2a(\uf94d\u4f4a\u92ee\u4975\u3d64::\u3711\u183a\ua3b4\u97e6\u983f\u983f, getfield:\uf94d\u4f4a\u92ee\u4975\u3d64(\u8640\uae5d\u8753\u97e6\u446c::\u4c04\u120d\u6198\uceb8\u647c\ub83f, this:\u8640\uae5d\u8753\u97e6\u446c)), aconstnull:\u3a62\u8d98\u5fe1\ua61f\u3e2a()), cmpgt:boolean(getfield:int(\u8640\uae5d\u8753\u97e6\u446c::\u3d64\u8389\ub1b9\uc7fe\u3504\u385b, this:\u8640\uae5d\u8753\u97e6\u446c), ldc:int(0)))) {
                stack_97_0 = and:int(ldc:int(16577), ldc:int(8197))
            }
            else {
                var_1_5F = and:int(var_1_5F:int, ldc:int(633531476))
                stack_97_0 = and:int(ldc:int(6808), ldc:int(-7067))
            }
            
            return:boolean(stack_97_0:int)
        }
        
        goto(Label_0006)
    }
    
    public void \u7bad\u74b1\uc3e3\u760c\u4f52\u6c56() {
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
            invokespecial:void(\uc87f\ub70c\uc87f\ubb2b\u0c95::\u7bad\u74b1\uc3e3\u760c\u4f52\u6c56, this:\u8640\uae5d\u8753\u97e6\u446c[expected:\uc87f\ub70c\uc87f\ubb2b\u0c95])
            invokestatic:void(\uf94d\u4f4a\u92ee\u4975\u3d64::\u6fb0\ud4fe\u120d\u759a\u4c04\ub70c, getfield:\uf94d\u4f4a\u92ee\u4975\u3d64(\u8640\uae5d\u8753\u97e6\u446c::\u4c04\u120d\u6198\uceb8\u647c\ub83f, this:\u8640\uae5d\u8753\u97e6\u446c), checkcast:\u3a62\u8d98\u5fe1\ua61f\u3e2a(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u3a62\u8d98\u5fe1\ua61f\u3e2a.class, aconstnull:\u3a62\u8d98\u5fe1\ua61f\u3e2a()))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud51e\u624e\u0b8e\u2dcc\u8350\ub102() {
        var_3_67 : \u3a62\u8d98\u5fe1\ua61f\u3e2a
        
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
            var_3_67 = invokestatic:\u3a62\u8d98\u5fe1\ua61f\u3e2a(\uf94d\u4f4a\u92ee\u4975\u3d64::\u3711\u183a\ua3b4\u97e6\u983f\u983f, getfield:\uf94d\u4f4a\u92ee\u4975\u3d64(\u8640\uae5d\u8753\u97e6\u446c::\u4c04\u120d\u6198\uceb8\u647c\ub83f, this:\u8640\uae5d\u8753\u97e6\u446c))
            
            if (cmpne:boolean(var_3_67:\u3a62\u8d98\u5fe1\ua61f\u3e2a, aconstnull:\u3a62\u8d98\u5fe1\ua61f\u3e2a())) {
                if (invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\u6b0d\u5bc4\u3504\u40a9\u7043\u98a4, var_3_67:\u3a62\u8d98\u5fe1\ua61f\u3e2a[expected:\ube23\u67d0\u64f2\u839e\u76bc])) {
                    invokevirtual:void(\u3a62\u8d98\u5fe1\ua61f\u3e2a::\ube23\u494c\u7ce1\u3711\uae87\u64ab, var_3_67:\u3a62\u8d98\u5fe1\ua61f\u3e2a, getstatic:\u8413\u92ee\u3504\u3a62\ud36e\ud36e(\u8413\u92ee\u3504\u3a62\ud36e\ud36e::\uf9c5\u836c\ua3b4\u7006\ub6ab\u983f))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u7043\ub8be\ub32d\u51fa\ub6ab\u6c52() {
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
            return:int(ldc:int(40))
        }
        
        goto(Label_0006)
    }
    
    public int \u8258\u6bb9\u8389\u7049\uae5d\ub8be() {
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
            return:int(ldc:int(60))
        }
        
        goto(Label_0006)
    }
    
    public int \u3d64\uc246\ua6bd\uc9f6\u3d4b\u7ce1() {
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
            return:int(and:int(ldc:int(9420), ldc:int(684)))
        }
        
        goto(Label_0006)
    }
    
    public \u927d\u92ff\u71ae\uafe7\u6bb9.\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937 \u8350\u624e\u960f\u76bc\u4f52\ud523() {
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
            return:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\ud4fe\u8c8a\u6d69\u47c2\u4daf\u5654))
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\ud36e\ufe34\u3776\ub171\ub70c \u99f7\ucb79\u5140\u600f\ucef1\u3e75() {
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
            return:\ud36e\ufe34\u3776\ub171\ub70c(getstatic:\ud36e\ufe34\u3776\ub171\ub70c(\ud36e\ufe34\u3776\ub171\ub70c::\u4e72\u3a62\u0b8e\u5d20\u494c\u12cb))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u2dcc\ua068\uc7fe\u62da\u62da\uc31c$0(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
        var_1_61 : int
        stack_90_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-2080309917), ldc:int(475004235))
            
            if (cmpne:boolean(invokevirtual:\u8413\u92ee\u3504\u3a62\ud36e\ud36e(\u3a62\u8d98\u5fe1\ua61f\u3e2a::\uc2e8\u6d99\uc2e8\u92ff\u3bc9\u416d, checkcast:\u3a62\u8d98\u5fe1\ua61f\u3e2a(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u3a62\u8d98\u5fe1\ua61f\u3e2a.class, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u3a62\u8d98\u5fe1\ua61f\u3e2a])), getstatic:\u8413\u92ee\u3504\u3a62\ud36e\ud36e(\u8413\u92ee\u3504\u3a62\ud36e\ud36e::\ua6bd\ud4fe\u6ec6\ucfaf\u0c95\ud51e))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-953155641))
                stack_90_0 = and:int(ldc:int(4874), ldc:int(-7003))
            }
            else {
                stack_90_0 = and:int(ldc:int(3019), ldc:int(8193))
            }
            
            return:boolean(stack_90_0:int)
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
    
    public void \ub8be\u4c2b\u071d\ub70c\ubded\u6d99(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_68B : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_696 : int
        
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
        var_3_68B = and:int(ldc:int(197768824), ldc:int(972396154))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8640\uae5d\u8753\u97e6\u446c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_68B = and:int(var_3_68B:int, ldc:int(-1805472015))
        }
        else {
            var_3_68B = and:int(var_3_68B:int, ldc:int(1878538622))
            var_5_8A = and:int(ldc:int(20032), ldc:int(-20034))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-22756), ldc:int(22691)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_68B:int, ldc:int(-1075715714))
                    var_9_D0 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_91:int, and:int(ldc:int(3329), ldc:int(4681)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, and:int(ldc:int(19), ldc:int(13601)))), var_7_A0:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_68B = and:int(var_3_E2:int, ldc:int(734117369))
                    var_14_11D = var_7_A0:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(1), ldc:int(12529)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_91:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(38056041))
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(57735598))
                        goto(Label_1299)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1159)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0992)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-1329456515))
                        goto(Label_0880)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(1464091062))
                        goto(Label_0749)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-689810093))
                        goto(Label_0628)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-689450885))
                    }
                    else {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(1073689598))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0628)
                            }
                            
                            goto(Label_0880)
                        }
                    }
                    
                    Label_0435:
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-322910052))
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(2087089541))
                        goto(Label_1299)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-35619007))
                        goto(Label_1159)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-535443978))
                        goto(Label_0992)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-1706546515))
                        goto(Label_0880)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0749)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-1390390709))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(4)), ldc:int(0))) {
                            var_3_68B = and:int(var_3_68B:int, ldc:int(2100870713))
                            loopcontinue()
                        }
                        
                        var_3_68B = and:int(var_3_68B:int, ldc:int(1271954814))
                        var_11_F3 = and:int(ldc:int(-9368), ldc:int(9367))
                        goto(Label_1553)
                    }
                    
                    Label_0628:
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-652112041))
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(1073364725))
                        goto(Label_1299)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(526773076))
                        goto(Label_1159)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0992)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(1783038329))
                        goto(Label_0880)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0435)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68B = and:int(var_3_68B:int, ldc:int(1308253306))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0880)
                        }
                    }
                    
                    Label_0749:
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(1459087122))
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(492176313))
                        goto(Label_1299)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-1520100999))
                        goto(Label_1159)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0992)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0628)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0435)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_68B = and:int(var_3_68B:int, ldc:int(893629071))
                            loopcontinue()
                        }
                        
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-1880267142))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0880:
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-1935546765))
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-1908805218))
                        goto(Label_1159)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0749)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0628)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_68B = and:int(var_3_68B:int, ldc:int(1280669767))
                            goto(Label_0435)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68B = and:int(var_3_68B:int, ldc:int(2144569081))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F3 = xor:int(ldc:int(-32126), ldc:int(-32125))
                                goto(Label_1159)
                            }
                        }
                    }
                    
                    Label_0992:
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-1453614870))
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-275160709))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-592654592))
                        goto(Label_1299)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_68B = and:int(var_3_68B:int, ldc:int(631651405))
                            goto(Label_0880)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0749)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0628)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_68B = and:int(var_3_68B:int, ldc:int(-1990338910))
                            goto(Label_0435)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-1712235011))
                        var_11_F3 = and:int(ldc:int(24684), ldc:int(-25710))
                    }
                    
                    Label_1159:
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(1616565490))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0992)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(32)), ldc:int(0))) {
                            var_3_68B = and:int(var_3_68B:int, ldc:int(-1051461055))
                            goto(Label_0880)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(2)), ldc:int(0))) {
                            var_3_68B = and:int(var_3_68B:int, ldc:int(-1299949039))
                            goto(Label_0749)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_68B = and:int(var_3_68B:int, ldc:int(-1850604261))
                            goto(Label_0628)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_68B = and:int(var_3_68B:int, ldc:int(1880221186))
                            goto(Label_0435)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68B = and:int(var_3_68B:int, ldc:int(-2953801))
                            loopcontinue()
                        }
                        
                        var_3_68B = and:int(var_3_68B:int, ldc:int(769944313))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1443)
                            }
                        }
                    }
                    
                    Label_1299:
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-1169649141))
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(1276582718))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_1159)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_68B = and:int(var_3_68B:int, ldc:int(29897578))
                            goto(Label_0992)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0880)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(1)), ldc:int(0))) {
                            var_3_68B = and:int(var_3_68B:int, ldc:int(-1032749578))
                            goto(Label_0749)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0628)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_68B = and:int(var_3_68B:int, ldc:int(-1594694087))
                            goto(Label_0435)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_68B = and:int(var_3_68B:int, ldc:int(1272743678))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_8A:int, var_16_121:int)
                            goto(Label_1553)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1443:
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1159)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0992)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0880)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(787999256))
                        goto(Label_0749)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0628)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0435)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(67108864)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_68B = and:int(var_3_68B:int, ldc:int(-269841542))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1553:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_696 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1564:
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(1911274918))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1159)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(1687366892))
                        goto(Label_0992)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0880)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(1537833761))
                        goto(Label_0749)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0628)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0435)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-1946530823))
                        var_17_696 = add:int(var_16_121:int, xor:int(ldc:int(-22464), ldc:int(-22463)))
                        looporswitchbreak()
                    }
                    
                    var_3_68B = and:int(var_3_68B:int, ldc:int(1991793025))
                }
                
                var_3_68B = and:int(var_3_68B:int, ldc:int(-1713550593))
                
                if (cmple:boolean(var_5_8A = var_17_696:int, sub:int(var_6_91:int, and:int(ldc:int(4613), ldc:int(1281))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(8)), ldc:int(0))) {
            var_3_68B = and:int(var_3_68B:int, ldc:int(731995373))
            goto(Label_0108)
        }
    }
}
